import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bfn extends bfi {
	private static final Logger a = LogManager.getLogger();
	private final bes f;
	private final List<String> g = Lists.newArrayList();
	private final List<beo> h = Lists.newArrayList();
	private final List<beo> i = Lists.newArrayList();
	private int j;
	private boolean k;

	public bfn(bes bes) {
		this.f = bes;
	}

	public void a(int integer) {
		if (this.f.u.n != aay.b.HIDDEN) {
			int integer3 = this.h();
			int integer4 = this.i.size();
			float float5 = this.f.u.r * 0.9F + 0.1F;
			if (integer4 > 0) {
				boolean boolean6 = false;
				if (this.d()) {
					boolean6 = true;
				}

				float float7 = this.g();
				int integer8 = ot.f((float)this.e() / float7);
				bqg.G();
				bqg.c(2.0F, 8.0F, 0.0F);
				bqg.b(float7, float7, 1.0F);
				int integer9 = 0;

				for (int integer10 = 0; integer10 + this.j < this.i.size() && integer10 < integer3; integer10++) {
					beo beo11 = (beo)this.i.get(integer10 + this.j);
					if (beo11 != null) {
						int integer12 = integer - beo11.b();
						if (integer12 < 200 || boolean6) {
							double double13 = (double)integer12 / 200.0;
							double13 = 1.0 - double13;
							double13 *= 10.0;
							double13 = ot.a(double13, 0.0, 1.0);
							double13 *= double13;
							int integer15 = (int)(255.0 * double13);
							if (boolean6) {
								integer15 = 255;
							}

							integer15 = (int)((float)integer15 * float5);
							integer9++;
							if (integer15 > 3) {
								int integer16 = 0;
								int integer17 = -integer10 * 9;
								a(-2, integer17 - 9, 0 + integer8 + 4, integer17, integer15 / 2 << 24);
								String string18 = beo11.a().d();
								bqg.m();
								this.f.k.a(string18, 0.0F, (float)(integer17 - 8), 16777215 + (integer15 << 24));
								bqg.d();
								bqg.l();
							}
						}
					}
				}

				if (boolean6) {
					int integer10x = this.f.k.a;
					bqg.c(-3.0F, 0.0F, 0.0F);
					int integer11 = integer4 * integer10x + integer4;
					int integer12 = integer9 * integer10x + integer9;
					int integer13 = this.j * integer12 / integer4;
					int integer14 = integer12 * integer12 / integer11;
					if (integer11 != integer12) {
						int integer15x = integer13 > 0 ? 170 : 96;
						int integer16 = this.k ? 13382451 : 3355562;
						a(0, -integer13, 2, -integer13 - integer14, integer16 + (integer15x << 24));
						a(2, -integer13, 1, -integer13 - integer14, 13421772 + (integer15x << 24));
					}
				}

				bqg.H();
			}
		}
	}

	public void a(boolean boolean1) {
		this.i.clear();
		this.h.clear();
		if (boolean1) {
			this.g.clear();
		}
	}

	public void a(fb fb) {
		this.a(fb, 0);
	}

	public void a(fb fb, int integer) {
		this.a(fb, integer, this.f.r.e(), false);
		a.info("[CHAT] {}", new Object[]{fb.c().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n")});
	}

	private void a(fb fb, int integer2, int integer3, boolean boolean4) {
		if (integer2 != 0) {
			this.c(integer2);
		}

		int integer6 = ot.d((float)this.e() / this.g());
		List<fb> list7 = bfo.a(fb, integer6, this.f.k, false, false);
		boolean boolean8 = this.d();

		for (fb fb10 : list7) {
			if (boolean8 && this.j > 0) {
				this.k = true;
				this.b(1);
			}

			this.i.add(0, new beo(integer3, fb10, integer2));
		}

		while (this.i.size() > 100) {
			this.i.remove(this.i.size() - 1);
		}

		if (!boolean4) {
			this.h.add(0, new beo(integer3, fb, integer2));

			while (this.h.size() > 100) {
				this.h.remove(this.h.size() - 1);
			}
		}
	}

	public void a() {
		this.i.clear();
		this.c();

		for (int integer2 = this.h.size() - 1; integer2 >= 0; integer2--) {
			beo beo3 = (beo)this.h.get(integer2);
			this.a(beo3.a(), beo3.c(), beo3.b(), true);
		}
	}

	public List<String> b() {
		return this.g;
	}

	public void a(String string) {
		if (this.g.isEmpty() || !((String)this.g.get(this.g.size() - 1)).equals(string)) {
			this.g.add(string);
		}
	}

	public void c() {
		this.j = 0;
		this.k = false;
	}

	public void b(int integer) {
		this.j += integer;
		int integer3 = this.i.size();
		if (this.j > integer3 - this.h()) {
			this.j = integer3 - this.h();
		}

		if (this.j <= 0) {
			this.j = 0;
			this.k = false;
		}
	}

	@Nullable
	public fb a(int integer1, int integer2) {
		if (!this.d()) {
			return null;
		} else {
			bfk bfk4 = new bfk(this.f);
			int integer5 = bfk4.e();
			float float6 = this.g();
			int integer7 = integer1 / integer5 - 2;
			int integer8 = integer2 / integer5 - 40;
			integer7 = ot.d((float)integer7 / float6);
			integer8 = ot.d((float)integer8 / float6);
			if (integer7 >= 0 && integer8 >= 0) {
				int integer9 = Math.min(this.h(), this.i.size());
				if (integer7 <= ot.d((float)this.e() / this.g()) && integer8 < this.f.k.a * integer9 + integer9) {
					int integer10 = integer8 / this.f.k.a + this.j;
					if (integer10 >= 0 && integer10 < this.i.size()) {
						beo beo11 = (beo)this.i.get(integer10);
						int integer12 = 0;

						for (fb fb14 : beo11.a()) {
							if (fb14 instanceof fh) {
								integer12 += this.f.k.a(bfo.a(((fh)fb14).g(), false));
								if (integer12 > integer7) {
									return fb14;
								}
							}
						}
					}

					return null;
				} else {
					return null;
				}
			} else {
				return null;
			}
		}
	}

	public boolean d() {
		return this.f.m instanceof bgr;
	}

	public void c(int integer) {
		Iterator<beo> iterator3 = this.i.iterator();

		while (iterator3.hasNext()) {
			beo beo4 = (beo)iterator3.next();
			if (beo4.c() == integer) {
				iterator3.remove();
			}
		}

		iterator3 = this.h.iterator();

		while (iterator3.hasNext()) {
			beo beo4 = (beo)iterator3.next();
			if (beo4.c() == integer) {
				iterator3.remove();
				break;
			}
		}
	}

	public int e() {
		return a(this.f.u.G);
	}

	public int f() {
		return b(this.d() ? this.f.u.I : this.f.u.H);
	}

	public float g() {
		return this.f.u.F;
	}

	public static int a(float float1) {
		int integer2 = 320;
		int integer3 = 40;
		return ot.d(float1 * 280.0F + 40.0F);
	}

	public static int b(float float1) {
		int integer2 = 180;
		int integer3 = 20;
		return ot.d(float1 * 160.0F + 20.0F);
	}

	public int h() {
		return this.f() / 9;
	}
}
