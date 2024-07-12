import com.google.common.collect.Lists;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bbr extends bbu {
	private static final Logger c = LogManager.getLogger();

	public bbr(File file, ph ph) {
		super(file, ph);
	}

	@Override
	public String a() {
		return "Anvil";
	}

	@Override
	public List<bbz> b() throws bbx {
		if (this.a != null && this.a.exists() && this.a.isDirectory()) {
			List<bbz> list2 = Lists.newArrayList();
			File[] arr3 = this.a.listFiles();

			for (File file7 : arr3) {
				if (file7.isDirectory()) {
					String string8 = file7.getName();
					bbv bbv9 = this.c(string8);
					if (bbv9 != null && (bbv9.k() == 19132 || bbv9.k() == 19133)) {
						boolean boolean10 = bbv9.k() != this.c();
						String string11 = bbv9.j();
						if (StringUtils.isEmpty(string11)) {
							string11 = string8;
						}

						long long12 = 0L;
						list2.add(new bbz(bbv9, string8, string11, 0L, boolean10));
					}
				}
			}

			return list2;
		} else {
			throw new bbx(dp.a("selectWorld.load_folder_access"));
		}
	}

	protected int c() {
		return 19133;
	}

	@Override
	public void d() {
		avc.a();
	}

	@Override
	public bbw a(String string, boolean boolean2) {
		return new bbq(this.a, string, boolean2, this.b);
	}

	@Override
	public boolean a(String string) {
		bbv bbv3 = this.c(string);
		return bbv3 != null && bbv3.k() == 19132;
	}

	@Override
	public boolean b(String string) {
		bbv bbv3 = this.c(string);
		return bbv3 != null && bbv3.k() != this.c();
	}

	@Override
	public boolean a(String string, ov ov) {
		ov.a(0);
		List<File> list4 = Lists.newArrayList();
		List<File> list5 = Lists.newArrayList();
		List<File> list6 = Lists.newArrayList();
		File file7 = new File(this.a, string);
		File file8 = new File(file7, "DIM-1");
		File file9 = new File(file7, "DIM1");
		c.info("Scanning folders...");
		this.a(file7, list4);
		if (file8.exists()) {
			this.a(file8, list5);
		}

		if (file9.exists()) {
			this.a(file9, list6);
		}

		int integer10 = list4.size() + list5.size() + list6.size();
		c.info("Total conversion count is {}", new Object[]{integer10});
		bbv bbv11 = this.c(string);
		akj akj12;
		if (bbv11 != null && bbv11.t() == ajx.c) {
			akj12 = new ako(akk.c);
		} else {
			akj12 = new akj(bbv11);
		}

		this.a(new File(file7, "region"), list4, akj12, 0, integer10, ov);
		this.a(new File(file8, "region"), list5, new ako(akk.j), list4.size(), integer10, ov);
		this.a(new File(file9, "region"), list6, new ako(akk.k), list4.size() + list5.size(), integer10, ov);
		bbv11.e(19133);
		if (bbv11.t() == ajx.h) {
			bbv11.a(ajx.b);
		}

		this.g(string);
		bbw bbw13 = this.a(string, false);
		bbw13.a(bbv11);
		return true;
	}

	private void g(String string) {
		File file3 = new File(this.a, string);
		if (!file3.exists()) {
			c.warn("Unable to create level.dat_mcr backup");
		} else {
			File file4 = new File(file3, "level.dat");
			if (!file4.exists()) {
				c.warn("Unable to create level.dat_mcr backup");
			} else {
				File file5 = new File(file3, "level.dat_mcr");
				if (!file4.renameTo(file5)) {
					c.warn("Unable to create level.dat_mcr backup");
				}
			}
		}
	}

	private void a(File file, Iterable<File> iterable, akj akj, int integer4, int integer5, ov ov) {
		for (File file9 : iterable) {
			this.a(file, file9, akj, integer4, integer5, ov);
			integer4++;
			int integer10 = (int)Math.round(100.0 * (double)integer4 / (double)integer5);
			ov.a(integer10);
		}
	}

	private void a(File file1, File file2, akj akj, int integer4, int integer5, ov ov) {
		try {
			String string8 = file2.getName();
			avb avb9 = new avb(file2);
			avb avb10 = new avb(new File(file1, string8.substring(0, string8.length() - ".mcr".length()) + ".mca"));

			for (int integer11 = 0; integer11 < 32; integer11++) {
				for (int integer12 = 0; integer12 < 32; integer12++) {
					if (avb9.c(integer11, integer12) && !avb10.c(integer11, integer12)) {
						DataInputStream dataInputStream13 = avb9.a(integer11, integer12);
						if (dataInputStream13 == null) {
							c.warn("Failed to fetch input stream");
						} else {
							du du14 = ed.a(dataInputStream13);
							dataInputStream13.close();
							du du15 = du14.o("Level");
							ava.a a16 = ava.a(du15);
							du du17 = new du();
							du du18 = new du();
							du17.a("Level", du18);
							ava.a(a16, du18, akj);
							DataOutputStream dataOutputStream19 = avb10.b(integer11, integer12);
							ed.a(du17, dataOutputStream19);
							dataOutputStream19.close();
						}
					}
				}

				int integer12x = (int)Math.round(100.0 * (double)(integer4 * 1024) / (double)(integer5 * 1024));
				int integer13 = (int)Math.round(100.0 * (double)((integer11 + 1) * 32 + integer4 * 1024) / (double)(integer5 * 1024));
				if (integer13 > integer12x) {
					ov.a(integer13);
				}
			}

			avb9.c();
			avb10.c();
		} catch (IOException var19) {
			var19.printStackTrace();
		}
	}

	private void a(File file, Collection<File> collection) {
		File file4 = new File(file, "region");
		File[] arr5 = file4.listFiles(new FilenameFilter() {
			public boolean accept(File file, String string) {
				return string.endsWith(".mcr");
			}
		});
		if (arr5 != null) {
			Collections.addAll(collection, arr5);
		}
	}
}
