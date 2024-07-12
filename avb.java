import com.google.common.collect.Lists;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class avb {
	private static final byte[] a = new byte[4096];
	private final File b;
	private RandomAccessFile c;
	private final int[] d = new int[1024];
	private final int[] e = new int[1024];
	private List<Boolean> f;
	private int g;
	private long h;

	public avb(File file) {
		this.b = file;
		this.g = 0;

		try {
			if (file.exists()) {
				this.h = file.lastModified();
			}

			this.c = new RandomAccessFile(file, "rw");
			if (this.c.length() < 4096L) {
				this.c.write(a);
				this.c.write(a);
				this.g += 8192;
			}

			if ((this.c.length() & 4095L) != 0L) {
				for (int integer3 = 0; (long)integer3 < (this.c.length() & 4095L); integer3++) {
					this.c.write(0);
				}
			}

			int integer3 = (int)this.c.length() / 4096;
			this.f = Lists.newArrayListWithCapacity(integer3);

			for (int integer4 = 0; integer4 < integer3; integer4++) {
				this.f.add(true);
			}

			this.f.set(0, false);
			this.f.set(1, false);
			this.c.seek(0L);

			for (int integer4 = 0; integer4 < 1024; integer4++) {
				int integer5 = this.c.readInt();
				this.d[integer4] = integer5;
				if (integer5 != 0 && (integer5 >> 8) + (integer5 & 0xFF) <= this.f.size()) {
					for (int integer6 = 0; integer6 < (integer5 & 0xFF); integer6++) {
						this.f.set((integer5 >> 8) + integer6, false);
					}
				}
			}

			for (int integer4x = 0; integer4x < 1024; integer4x++) {
				int integer5 = this.c.readInt();
				this.e[integer4x] = integer5;
			}
		} catch (IOException var6) {
			var6.printStackTrace();
		}
	}

	@Nullable
	public synchronized DataInputStream a(int integer1, int integer2) {
		if (this.d(integer1, integer2)) {
			return null;
		} else {
			try {
				int integer4 = this.e(integer1, integer2);
				if (integer4 == 0) {
					return null;
				} else {
					int integer5 = integer4 >> 8;
					int integer6 = integer4 & 0xFF;
					if (integer5 + integer6 > this.f.size()) {
						return null;
					} else {
						this.c.seek((long)(integer5 * 4096));
						int integer7 = this.c.readInt();
						if (integer7 > 4096 * integer6) {
							return null;
						} else if (integer7 <= 0) {
							return null;
						} else {
							byte byte8 = this.c.readByte();
							if (byte8 == 1) {
								byte[] arr9 = new byte[integer7 - 1];
								this.c.read(arr9);
								return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(arr9))));
							} else if (byte8 == 2) {
								byte[] arr9 = new byte[integer7 - 1];
								this.c.read(arr9);
								return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(arr9))));
							} else {
								return null;
							}
						}
					}
				}
			} catch (IOException var9) {
				return null;
			}
		}
	}

	@Nullable
	public DataOutputStream b(int integer1, int integer2) {
		return this.d(integer1, integer2) ? null : new DataOutputStream(new BufferedOutputStream(new DeflaterOutputStream(new avb.a(integer1, integer2))));
	}

	protected synchronized void a(int integer1, int integer2, byte[] arr, int integer4) {
		try {
			int integer6 = this.e(integer1, integer2);
			int integer7 = integer6 >> 8;
			int integer8 = integer6 & 0xFF;
			int integer9 = (integer4 + 5) / 4096 + 1;
			if (integer9 >= 256) {
				return;
			}

			if (integer7 != 0 && integer8 == integer9) {
				this.a(integer7, arr, integer4);
			} else {
				for (int integer10 = 0; integer10 < integer8; integer10++) {
					this.f.set(integer7 + integer10, true);
				}

				int integer10 = this.f.indexOf(true);
				int integer11 = 0;
				if (integer10 != -1) {
					for (int integer12 = integer10; integer12 < this.f.size(); integer12++) {
						if (integer11 != 0) {
							if ((Boolean)this.f.get(integer12)) {
								integer11++;
							} else {
								integer11 = 0;
							}
						} else if ((Boolean)this.f.get(integer12)) {
							integer10 = integer12;
							integer11 = 1;
						}

						if (integer11 >= integer9) {
							break;
						}
					}
				}

				if (integer11 >= integer9) {
					integer7 = integer10;
					this.a(integer1, integer2, integer10 << 8 | integer9);

					for (int integer12 = 0; integer12 < integer9; integer12++) {
						this.f.set(integer7 + integer12, false);
					}

					this.a(integer7, arr, integer4);
				} else {
					this.c.seek(this.c.length());
					integer7 = this.f.size();

					for (int integer12 = 0; integer12 < integer9; integer12++) {
						this.c.write(a);
						this.f.add(false);
					}

					this.g += 4096 * integer9;
					this.a(integer7, arr, integer4);
					this.a(integer1, integer2, integer7 << 8 | integer9);
				}
			}

			this.b(integer1, integer2, (int)(MinecraftServer.aw() / 1000L));
		} catch (IOException var12) {
			var12.printStackTrace();
		}
	}

	private void a(int integer1, byte[] arr, int integer3) throws IOException {
		this.c.seek((long)(integer1 * 4096));
		this.c.writeInt(integer3 + 1);
		this.c.writeByte(2);
		this.c.write(arr, 0, integer3);
	}

	private boolean d(int integer1, int integer2) {
		return integer1 < 0 || integer1 >= 32 || integer2 < 0 || integer2 >= 32;
	}

	private int e(int integer1, int integer2) {
		return this.d[integer1 + integer2 * 32];
	}

	public boolean c(int integer1, int integer2) {
		return this.e(integer1, integer2) != 0;
	}

	private void a(int integer1, int integer2, int integer3) throws IOException {
		this.d[integer1 + integer2 * 32] = integer3;
		this.c.seek((long)((integer1 + integer2 * 32) * 4));
		this.c.writeInt(integer3);
	}

	private void b(int integer1, int integer2, int integer3) throws IOException {
		this.e[integer1 + integer2 * 32] = integer3;
		this.c.seek((long)(4096 + (integer1 + integer2 * 32) * 4));
		this.c.writeInt(integer3);
	}

	public void c() throws IOException {
		if (this.c != null) {
			this.c.close();
		}
	}

	class a extends ByteArrayOutputStream {
		private final int b;
		private final int c;

		public a(int integer2, int integer3) {
			super(8096);
			this.b = integer2;
			this.c = integer3;
		}

		public void close() {
			avb.this.a(this.b, this.c, this.buf, this.count);
		}
	}
}
