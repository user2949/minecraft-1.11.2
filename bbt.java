import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bbt implements bbw, bcc {
	private static final Logger b = LogManager.getLogger();
	private final File c;
	private final File d;
	private final File e;
	private final long f = MinecraftServer.aw();
	private final String g;
	private final ayz h;
	protected final ph a;

	public bbt(File file, String string, boolean boolean3, ph ph) {
		this.a = ph;
		this.c = new File(file, string);
		this.c.mkdirs();
		this.d = new File(this.c, "playerdata");
		this.e = new File(this.c, "data");
		this.e.mkdirs();
		this.g = string;
		if (boolean3) {
			this.d.mkdirs();
			this.h = new ayz(new File(this.c, "structures").toString(), ph);
		} else {
			this.h = null;
		}

		this.i();
	}

	private void i() {
		try {
			File file2 = new File(this.c, "session.lock");
			DataOutputStream dataOutputStream3 = new DataOutputStream(new FileOutputStream(file2));

			try {
				dataOutputStream3.writeLong(this.f);
			} finally {
				dataOutputStream3.close();
			}
		} catch (IOException var7) {
			var7.printStackTrace();
			throw new RuntimeException("Failed to check session lock, aborting");
		}
	}

	@Override
	public File b() {
		return this.c;
	}

	@Override
	public void c() throws ajt {
		try {
			File file2 = new File(this.c, "session.lock");
			DataInputStream dataInputStream3 = new DataInputStream(new FileInputStream(file2));

			try {
				if (dataInputStream3.readLong() != this.f) {
					throw new ajt("The save is being accessed from another location, aborting");
				}
			} finally {
				dataInputStream3.close();
			}
		} catch (IOException var7) {
			throw new ajt("Failed to check session lock, aborting");
		}
	}

	@Override
	public auw a(avf avf) {
		throw new RuntimeException("Old Chunk Storage is no longer supported.");
	}

	@Nullable
	@Override
	public bbv d() {
		File file2 = new File(this.c, "level.dat");
		if (file2.exists()) {
			bbv bbv3 = bbu.a(file2, this.a);
			if (bbv3 != null) {
				return bbv3;
			}
		}

		file2 = new File(this.c, "level.dat_old");
		return file2.exists() ? bbu.a(file2, this.a) : null;
	}

	@Override
	public void a(bbv bbv, @Nullable du du) {
		du du4 = bbv.a(du);
		du du5 = new du();
		du5.a("Data", du4);

		try {
			File file6 = new File(this.c, "level.dat_new");
			File file7 = new File(this.c, "level.dat_old");
			File file8 = new File(this.c, "level.dat");
			ed.a(du5, new FileOutputStream(file6));
			if (file7.exists()) {
				file7.delete();
			}

			file8.renameTo(file7);
			if (file8.exists()) {
				file8.delete();
			}

			file6.renameTo(file8);
			if (file6.exists()) {
				file6.delete();
			}
		} catch (Exception var8) {
			var8.printStackTrace();
		}
	}

	@Override
	public void a(bbv bbv) {
		this.a(bbv, null);
	}

	@Override
	public void a(aay aay) {
		try {
			du du3 = aay.e(new du());
			File file4 = new File(this.d, aay.bf() + ".dat.tmp");
			File file5 = new File(this.d, aay.bf() + ".dat");
			ed.a(du3, new FileOutputStream(file4));
			if (file5.exists()) {
				file5.delete();
			}

			file4.renameTo(file5);
		} catch (Exception var5) {
			b.warn("Failed to save player data for {}", new Object[]{aay.h_()});
		}
	}

	@Nullable
	@Override
	public du b(aay aay) {
		du du3 = null;

		try {
			File file4 = new File(this.d, aay.bf() + ".dat");
			if (file4.exists() && file4.isFile()) {
				du3 = ed.a(new FileInputStream(file4));
			}
		} catch (Exception var4) {
			b.warn("Failed to load player data for {}", new Object[]{aay.h_()});
		}

		if (du3 != null) {
			aay.f(this.a.a(pf.PLAYER, du3));
		}

		return du3;
	}

	@Override
	public bcc e() {
		return this;
	}

	@Override
	public String[] f() {
		String[] arr2 = this.d.list();
		if (arr2 == null) {
			arr2 = new String[0];
		}

		for (int integer3 = 0; integer3 < arr2.length; integer3++) {
			if (arr2[integer3].endsWith(".dat")) {
				arr2[integer3] = arr2[integer3].substring(0, arr2[integer3].length() - 4);
			}
		}

		return arr2;
	}

	@Override
	public void a() {
	}

	@Override
	public File a(String string) {
		return new File(this.e, string + ".dat");
	}

	@Override
	public ayz h() {
		return this.h;
	}
}
