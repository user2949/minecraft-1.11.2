import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bbu implements bby {
	private static final Logger c = LogManager.getLogger();
	protected final File a;
	protected final ph b;

	public bbu(File file, ph ph) {
		this.b = ph;
		if (!file.exists()) {
			file.mkdirs();
		}

		this.a = file;
	}

	@Override
	public String a() {
		return "Old Format";
	}

	@Override
	public List<bbz> b() throws bbx {
		List<bbz> list2 = Lists.newArrayList();

		for (int integer3 = 0; integer3 < 5; integer3++) {
			String string4 = "World" + (integer3 + 1);
			bbv bbv5 = this.c(string4);
			if (bbv5 != null) {
				list2.add(new bbz(bbv5, string4, "", bbv5.g(), false));
			}
		}

		return list2;
	}

	@Override
	public void d() {
	}

	@Nullable
	@Override
	public bbv c(String string) {
		File file3 = new File(this.a, string);
		if (!file3.exists()) {
			return null;
		} else {
			File file4 = new File(file3, "level.dat");
			if (file4.exists()) {
				bbv bbv5 = a(file4, this.b);
				if (bbv5 != null) {
					return bbv5;
				}
			}

			file4 = new File(file3, "level.dat_old");
			return file4.exists() ? a(file4, this.b) : null;
		}
	}

	@Nullable
	public static bbv a(File file, ph ph) {
		try {
			du du3 = ed.a(new FileInputStream(file));
			du du4 = du3.o("Data");
			return new bbv(ph.a(pf.LEVEL, du4));
		} catch (Exception var4) {
			c.error("Exception reading {}", new Object[]{file, var4});
			return null;
		}
	}

	@Override
	public void a(String string1, String string2) {
		File file4 = new File(this.a, string1);
		if (file4.exists()) {
			File file5 = new File(file4, "level.dat");
			if (file5.exists()) {
				try {
					du du6 = ed.a(new FileInputStream(file5));
					du du7 = du6.o("Data");
					du7.a("LevelName", string2);
					ed.a(du6, new FileOutputStream(file5));
				} catch (Exception var7) {
					var7.printStackTrace();
				}
			}
		}
	}

	@Override
	public boolean d(String string) {
		File file3 = new File(this.a, string);
		if (file3.exists()) {
			return false;
		} else {
			try {
				file3.mkdir();
				file3.delete();
				return true;
			} catch (Throwable var4) {
				c.warn("Couldn't make new level", var4);
				return false;
			}
		}
	}

	@Override
	public boolean e(String string) {
		File file3 = new File(this.a, string);
		if (!file3.exists()) {
			return true;
		} else {
			c.info("Deleting level {}", new Object[]{string});

			for (int integer4 = 1; integer4 <= 5; integer4++) {
				c.info("Attempt {}...", new Object[]{integer4});
				if (a(file3.listFiles())) {
					break;
				}

				c.warn("Unsuccessful in deleting contents.");
				if (integer4 < 5) {
					try {
						Thread.sleep(500L);
					} catch (InterruptedException var5) {
					}
				}
			}

			return file3.delete();
		}
	}

	protected static boolean a(File[] arr) {
		for (File file5 : arr) {
			c.debug("Deleting {}", new Object[]{file5});
			if (file5.isDirectory() && !a(file5.listFiles())) {
				c.warn("Couldn't delete directory {}", new Object[]{file5});
				return false;
			}

			if (!file5.delete()) {
				c.warn("Couldn't delete file {}", new Object[]{file5});
				return false;
			}
		}

		return true;
	}

	@Override
	public bbw a(String string, boolean boolean2) {
		return new bbt(this.a, string, boolean2, this.b);
	}

	@Override
	public boolean a(String string) {
		return false;
	}

	@Override
	public boolean b(String string) {
		return false;
	}

	@Override
	public boolean a(String string, ov ov) {
		return false;
	}

	@Override
	public boolean f(String string) {
		File file3 = new File(this.a, string);
		return file3.isDirectory();
	}

	@Override
	public File b(String string1, String string2) {
		return new File(new File(this.a, string1), string2);
	}
}
