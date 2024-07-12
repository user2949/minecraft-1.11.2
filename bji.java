import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.image.BufferedImage;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bji implements bfy.a {
	private static final Logger a = LogManager.getLogger();
	private static final ThreadPoolExecutor b = new ScheduledThreadPoolExecutor(
		5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build()
	);
	private static final kq c = new kq("textures/misc/unknown_server.png");
	private static final kq d = new kq("textures/gui/server_selection.png");
	private final bjf e;
	private final bes f;
	private final bnt g;
	private final kq h;
	private String i;
	private byp j;
	private long k;

	protected bji(bjf bjf, bnt bnt) {
		this.e = bjf;
		this.g = bnt;
		this.f = bes.z();
		this.h = new kq("servers/" + bnt.b + "/icon");
		this.j = (byp)this.f.N().b(this.h);
	}

	@Override
	public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, boolean boolean8) {
		if (!this.g.h) {
			this.g.h = true;
			this.g.e = -2L;
			this.g.d = "";
			this.g.c = "";
			b.submit(new Runnable() {
				public void run() {
					try {
						bji.this.e.g().a(bji.this.g);
					} catch (UnknownHostException var2) {
						bji.this.g.e = -1L;
						bji.this.g.d = a.DARK_RED + "Can't resolve hostname";
					} catch (Exception var3) {
						bji.this.g.e = -1L;
						bji.this.g.d = a.DARK_RED + "Can't connect to server.";
					}
				}
			});
		}

		boolean boolean10 = this.g.f > 316;
		boolean boolean11 = this.g.f < 316;
		boolean boolean12 = boolean10 || boolean11;
		this.f.k.a(this.g.a, integer2 + 32 + 3, integer3 + 1, 16777215);
		List<String> list13 = this.f.k.c(this.g.d, integer4 - 32 - 2);

		for (int integer14 = 0; integer14 < Math.min(list13.size(), 2); integer14++) {
			this.f.k.a((String)list13.get(integer14), integer2 + 32 + 3, integer3 + 12 + this.f.k.a * integer14, 8421504);
		}

		String string14 = boolean12 ? a.DARK_RED + this.g.g : this.g.c;
		int integer15 = this.f.k.a(string14);
		this.f.k.a(string14, integer2 + integer4 - integer15 - 15 - 2, integer3 + 1, 8421504);
		int integer16 = 0;
		String string18 = null;
		int integer17;
		String string19;
		if (boolean12) {
			integer17 = 5;
			string19 = boolean10 ? "Client out of date!" : "Server out of date!";
			string18 = this.g.i;
		} else if (this.g.h && this.g.e != -2L) {
			if (this.g.e < 0L) {
				integer17 = 5;
			} else if (this.g.e < 150L) {
				integer17 = 0;
			} else if (this.g.e < 300L) {
				integer17 = 1;
			} else if (this.g.e < 600L) {
				integer17 = 2;
			} else if (this.g.e < 1000L) {
				integer17 = 3;
			} else {
				integer17 = 4;
			}

			if (this.g.e < 0L) {
				string19 = "(no connection)";
			} else {
				string19 = this.g.e + "ms";
				string18 = this.g.i;
			}
		} else {
			integer16 = 1;
			integer17 = (int)(bes.I() / 100L + (long)(integer1 * 2) & 7L);
			if (integer17 > 4) {
				integer17 = 8 - integer17;
			}

			string19 = "Pinging...";
		}

		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.f.N().a(bfi.d);
		bfi.a(integer2 + integer4 - 15, integer3, (float)(integer16 * 10), (float)(176 + integer17 * 8), 10, 8, 256.0F, 256.0F);
		if (this.g.c() != null && !this.g.c().equals(this.i)) {
			this.i = this.g.c();
			this.c();
			this.e.h().b();
		}

		if (this.j != null) {
			this.a(integer2, integer3, this.h);
		} else {
			this.a(integer2, integer3, c);
		}

		int integer20 = integer6 - integer2;
		int integer21 = integer7 - integer3;
		if (integer20 >= integer4 - 15 && integer20 <= integer4 - 5 && integer21 >= 0 && integer21 <= 8) {
			this.e.a(string19);
		} else if (integer20 >= integer4 - integer15 - 15 - 2 && integer20 <= integer4 - 15 - 2 && integer21 >= 0 && integer21 <= 8) {
			this.e.a(string18);
		}

		if (this.f.u.A || boolean8) {
			this.f.N().a(d);
			bfi.a(integer2, integer3, integer2 + 32, integer3 + 32, -1601138544);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			int integer22 = integer6 - integer2;
			int integer23 = integer7 - integer3;
			if (this.b()) {
				if (integer22 < 32 && integer22 > 16) {
					bfi.a(integer2, integer3, 0.0F, 32.0F, 32, 32, 256.0F, 256.0F);
				} else {
					bfi.a(integer2, integer3, 0.0F, 0.0F, 32, 32, 256.0F, 256.0F);
				}
			}

			if (this.e.a(this, integer1)) {
				if (integer22 < 16 && integer23 < 16) {
					bfi.a(integer2, integer3, 96.0F, 32.0F, 32, 32, 256.0F, 256.0F);
				} else {
					bfi.a(integer2, integer3, 96.0F, 0.0F, 32, 32, 256.0F, 256.0F);
				}
			}

			if (this.e.b(this, integer1)) {
				if (integer22 < 16 && integer23 > 16) {
					bfi.a(integer2, integer3, 64.0F, 32.0F, 32, 32, 256.0F, 256.0F);
				} else {
					bfi.a(integer2, integer3, 64.0F, 0.0F, 32, 32, 256.0F, 256.0F);
				}
			}
		}
	}

	protected void a(int integer1, int integer2, kq kq) {
		this.f.N().a(kq);
		bqg.m();
		bfi.a(integer1, integer2, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
		bqg.l();
	}

	private boolean b() {
		return true;
	}

	private void c() {
		if (this.g.c() == null) {
			this.f.N().c(this.h);
			this.j = null;
		} else {
			ByteBuf byteBuf3 = Unpooled.copiedBuffer(this.g.c(), Charsets.UTF_8);
			ByteBuf byteBuf4 = null;

			BufferedImage bufferedImage2;
			label80: {
				try {
					byteBuf4 = Base64.decode(byteBuf3);
					bufferedImage2 = bzc.a(new ByteBufInputStream(byteBuf4));
					Validate.validState(bufferedImage2.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
					Validate.validState(bufferedImage2.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
					break label80;
				} catch (Throwable var8) {
					a.error("Invalid icon for server {} ({})", new Object[]{this.g.a, this.g.b, var8});
					this.g.a(null);
				} finally {
					byteBuf3.release();
					if (byteBuf4 != null) {
						byteBuf4.release();
					}
				}

				return;
			}

			if (this.j == null) {
				this.j = new byp(bufferedImage2.getWidth(), bufferedImage2.getHeight());
				this.f.N().a(this.h, this.j);
			}

			bufferedImage2.getRGB(0, 0, bufferedImage2.getWidth(), bufferedImage2.getHeight(), this.j.e(), 0, bufferedImage2.getWidth());
			this.j.d();
		}
	}

	@Override
	public boolean a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		if (integer5 <= 32) {
			if (integer5 < 32 && integer5 > 16 && this.b()) {
				this.e.b(integer1);
				this.e.f();
				return true;
			}

			if (integer5 < 16 && integer6 < 16 && this.e.a(this, integer1)) {
				this.e.a(this, integer1, bho.r());
				return true;
			}

			if (integer5 < 16 && integer6 > 16 && this.e.b(this, integer1)) {
				this.e.b(this, integer1, bho.r());
				return true;
			}
		}

		this.e.b(integer1);
		if (bes.I() - this.k < 250L) {
			this.e.f();
		}

		this.k = bes.I();
		return false;
	}

	@Override
	public void a(int integer1, int integer2, int integer3) {
	}

	@Override
	public void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
	}

	public bnt a() {
		return this.g;
	}
}
