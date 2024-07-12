import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bce {
	private final bbw b;
	protected Map<String, bbl> a = Maps.newHashMap();
	private final List<bbl> c = Lists.newArrayList();
	private final Map<String, Short> d = Maps.newHashMap();

	public bce(bbw bbw) {
		this.b = bbw;
		this.b();
	}

	@Nullable
	public bbl a(Class<? extends bbl> class1, String string) {
		bbl bbl4 = (bbl)this.a.get(string);
		if (bbl4 != null) {
			return bbl4;
		} else {
			if (this.b != null) {
				try {
					File file5 = this.b.a(string);
					if (file5 != null && file5.exists()) {
						try {
							bbl4 = (bbl)class1.getConstructor(String.class).newInstance(string);
						} catch (Exception var7) {
							throw new RuntimeException("Failed to instantiate " + class1, var7);
						}

						FileInputStream fileInputStream6 = new FileInputStream(file5);
						du du7 = ed.a(fileInputStream6);
						fileInputStream6.close();
						bbl4.a(du7.o("data"));
					}
				} catch (Exception var8) {
					var8.printStackTrace();
				}
			}

			if (bbl4 != null) {
				this.a.put(string, bbl4);
				this.c.add(bbl4);
			}

			return bbl4;
		}
	}

	public void a(String string, bbl bbl) {
		if (this.a.containsKey(string)) {
			this.c.remove(this.a.remove(string));
		}

		this.a.put(string, bbl);
		this.c.add(bbl);
	}

	public void a() {
		for (int integer2 = 0; integer2 < this.c.size(); integer2++) {
			bbl bbl3 = (bbl)this.c.get(integer2);
			if (bbl3.d()) {
				this.a(bbl3);
				bbl3.a(false);
			}
		}
	}

	private void a(bbl bbl) {
		if (this.b != null) {
			try {
				File file3 = this.b.a(bbl.a);
				if (file3 != null) {
					du du4 = new du();
					du4.a("data", bbl.b(new du()));
					FileOutputStream fileOutputStream5 = new FileOutputStream(file3);
					ed.a(du4, fileOutputStream5);
					fileOutputStream5.close();
				}
			} catch (Exception var5) {
				var5.printStackTrace();
			}
		}
	}

	private void b() {
		try {
			this.d.clear();
			if (this.b == null) {
				return;
			}

			File file2 = this.b.a("idcounts");
			if (file2 != null && file2.exists()) {
				DataInputStream dataInputStream3 = new DataInputStream(new FileInputStream(file2));
				du du4 = ed.a(dataInputStream3);
				dataInputStream3.close();

				for (String string6 : du4.c()) {
					ei ei7 = du4.c(string6);
					if (ei7 instanceof eg) {
						eg eg8 = (eg)ei7;
						short short9 = eg8.f();
						this.d.put(string6, short9);
					}
				}
			}
		} catch (Exception var9) {
			var9.printStackTrace();
		}
	}

	public int a(String string) {
		Short short3 = (Short)this.d.get(string);
		if (short3 == null) {
			short3 = (short)0;
		} else {
			short3 = (short)(short3 + 1);
		}

		this.d.put(string, short3);
		if (this.b == null) {
			return short3;
		} else {
			try {
				File file4 = this.b.a("idcounts");
				if (file4 != null) {
					du du5 = new du();

					for (String string7 : this.d.keySet()) {
						du5.a(string7, (Short)this.d.get(string7));
					}

					DataOutputStream dataOutputStream6 = new DataOutputStream(new FileOutputStream(file4));
					ed.a(du5, dataOutputStream6);
					dataOutputStream6.close();
				}
			} catch (Exception var7) {
				var7.printStackTrace();
			}

			return short3;
		}
	}
}
