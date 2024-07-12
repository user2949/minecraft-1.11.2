import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class atf extends asc implements lf {
	private atl a;
	private cv f;
	private boolean g;
	private boolean h;
	private static final ThreadLocal<cv> i = new ThreadLocal<cv>() {
		protected cv initialValue() {
			return null;
		}
	};
	private float j;
	private float k;

	public atf() {
	}

	public atf(atl atl, cv cv, boolean boolean3, boolean boolean4) {
		this.a = atl;
		this.f = cv;
		this.g = boolean3;
		this.h = boolean4;
	}

	public atl a() {
		return this.a;
	}

	@Override
	public du d() {
		return this.b(new du());
	}

	@Override
	public int v() {
		return 0;
	}

	public boolean e() {
		return this.g;
	}

	public cv f() {
		return this.f;
	}

	public boolean h() {
		return this.h;
	}

	public float a(float float1) {
		if (float1 > 1.0F) {
			float1 = 1.0F;
		}

		return this.k + (this.j - this.k) * float1;
	}

	public float b(float float1) {
		return (float)this.f.g() * this.e(this.a(float1));
	}

	public float c(float float1) {
		return (float)this.f.h() * this.e(this.a(float1));
	}

	public float d(float float1) {
		return (float)this.f.i() * this.e(this.a(float1));
	}

	private float e(float float1) {
		return this.g ? float1 - 1.0F : 1.0F - float1;
	}

	public bdt a(ajw ajw, co co) {
		return this.a(ajw, co, this.j).b(this.a(ajw, co, this.k));
	}

	public bdt a(ajw ajw, co co, float float3) {
		float3 = this.e(float3);
		atl atl5 = this.j();
		return atl5.d(ajw, co).d((double)(float3 * (float)this.f.g()), (double)(float3 * (float)this.f.h()), (double)(float3 * (float)this.f.i()));
	}

	private atl j() {
		return !this.e() && this.h() ? alv.K.t().a(atd.a, this.a.v() == alv.F ? atd.a.STICKY : atd.a.DEFAULT).a(atd.H, this.a.c(atc.H)) : this.a;
	}

	private void f(float float1) {
		cv cv3 = this.g ? this.f : this.f.d();
		double double4 = (double)(float1 - this.j);
		List<bdt> list6 = Lists.newArrayList();
		this.j().a(this.b, co.a, new bdt(co.a), list6, null, true);
		if (!list6.isEmpty()) {
			bdt bdt7 = this.a(this.a(list6));
			List<sn> list8 = this.b.b(null, this.a(bdt7, cv3, double4).b(bdt7));
			if (!list8.isEmpty()) {
				boolean boolean9 = this.a.v() == alv.cE;

				for (int integer10 = 0; integer10 < list8.size(); integer10++) {
					sn sn11 = (sn)list8.get(integer10);
					if (sn11.o_() != azv.IGNORE) {
						if (boolean9) {
							switch (cv3.k()) {
								case X:
									sn11.s = (double)cv3.g();
									break;
								case Y:
									sn11.t = (double)cv3.h();
									break;
								case Z:
									sn11.u = (double)cv3.i();
							}
						}

						double double12 = 0.0;

						for (int integer14 = 0; integer14 < list6.size(); integer14++) {
							bdt bdt15 = this.a(this.a((bdt)list6.get(integer14)), cv3, double4);
							bdt bdt16 = sn11.bo();
							if (bdt15.c(bdt16)) {
								double12 = Math.max(double12, this.a(bdt15, cv3, bdt16));
								if (double12 >= double4) {
									break;
								}
							}
						}

						if (!(double12 <= 0.0)) {
							double12 = Math.min(double12, double4) + 0.01;
							i.set(cv3);
							sn11.a(tc.PISTON, double12 * (double)cv3.g(), double12 * (double)cv3.h(), double12 * (double)cv3.i());
							i.set(null);
							if (!this.g && this.h) {
								this.a(sn11, cv3, double4);
							}
						}
					}
				}
			}
		}
	}

	private bdt a(List<bdt> list) {
		double double3 = 0.0;
		double double5 = 0.0;
		double double7 = 0.0;
		double double9 = 1.0;
		double double11 = 1.0;
		double double13 = 1.0;

		for (bdt bdt16 : list) {
			double3 = Math.min(bdt16.a, double3);
			double5 = Math.min(bdt16.b, double5);
			double7 = Math.min(bdt16.c, double7);
			double9 = Math.max(bdt16.d, double9);
			double11 = Math.max(bdt16.e, double11);
			double13 = Math.max(bdt16.f, double13);
		}

		return new bdt(double3, double5, double7, double9, double11, double13);
	}

	private double a(bdt bdt1, cv cv, bdt bdt3) {
		switch (cv.k()) {
			case X:
				return b(bdt1, cv, bdt3);
			case Y:
			default:
				return c(bdt1, cv, bdt3);
			case Z:
				return d(bdt1, cv, bdt3);
		}
	}

	private bdt a(bdt bdt) {
		double double3 = (double)this.e(this.j);
		return bdt.d(
			(double)this.c.p() + double3 * (double)this.f.g(), (double)this.c.q() + double3 * (double)this.f.h(), (double)this.c.r() + double3 * (double)this.f.i()
		);
	}

	private bdt a(bdt bdt, cv cv, double double3) {
		double double6 = double3 * (double)cv.c().a();
		double double8 = Math.min(double6, 0.0);
		double double10 = Math.max(double6, 0.0);
		switch (cv) {
			case WEST:
				return new bdt(bdt.a + double8, bdt.b, bdt.c, bdt.a + double10, bdt.e, bdt.f);
			case EAST:
				return new bdt(bdt.d + double8, bdt.b, bdt.c, bdt.d + double10, bdt.e, bdt.f);
			case DOWN:
				return new bdt(bdt.a, bdt.b + double8, bdt.c, bdt.d, bdt.b + double10, bdt.f);
			case UP:
			default:
				return new bdt(bdt.a, bdt.e + double8, bdt.c, bdt.d, bdt.e + double10, bdt.f);
			case NORTH:
				return new bdt(bdt.a, bdt.b, bdt.c + double8, bdt.d, bdt.e, bdt.c + double10);
			case SOUTH:
				return new bdt(bdt.a, bdt.b, bdt.f + double8, bdt.d, bdt.e, bdt.f + double10);
		}
	}

	private void a(sn sn, cv cv, double double3) {
		bdt bdt6 = sn.bo();
		bdt bdt7 = alu.j.a(this.c);
		if (bdt6.c(bdt7)) {
			cv cv8 = cv.d();
			double double9 = this.a(bdt7, cv8, bdt6) + 0.01;
			double double11 = this.a(bdt7, cv8, bdt6.a(bdt7)) + 0.01;
			if (Math.abs(double9 - double11) < 0.01) {
				double9 = Math.min(double9, double3) + 0.01;
				i.set(cv);
				sn.a(tc.PISTON, double9 * (double)cv8.g(), double9 * (double)cv8.h(), double9 * (double)cv8.i());
				i.set(null);
			}
		}
	}

	private static double b(bdt bdt1, cv cv, bdt bdt3) {
		return cv.c() == cv.b.POSITIVE ? bdt1.d - bdt3.a : bdt3.d - bdt1.a;
	}

	private static double c(bdt bdt1, cv cv, bdt bdt3) {
		return cv.c() == cv.b.POSITIVE ? bdt1.e - bdt3.b : bdt3.e - bdt1.b;
	}

	private static double d(bdt bdt1, cv cv, bdt bdt3) {
		return cv.c() == cv.b.POSITIVE ? bdt1.f - bdt3.c : bdt3.f - bdt1.c;
	}

	public void i() {
		if (this.k < 1.0F && this.b != null) {
			this.j = 1.0F;
			this.k = this.j;
			this.b.s(this.c);
			this.z();
			if (this.b.o(this.c).v() == alv.M) {
				this.b.a(this.c, this.a, 3);
				this.b.a(this.c, this.a.v(), this.c);
			}
		}
	}

	@Override
	public void F_() {
		this.k = this.j;
		if (this.k >= 1.0F) {
			this.b.s(this.c);
			this.z();
			if (this.b.o(this.c).v() == alv.M) {
				this.b.a(this.c, this.a, 3);
				this.b.a(this.c, this.a.v(), this.c);
			}
		} else {
			float float2 = this.j + 0.5F;
			this.f(float2);
			this.j = float2;
			if (this.j >= 1.0F) {
				this.j = 1.0F;
			}
		}
	}

	public static void a(ph ph) {
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.a = alu.b(du.h("blockId")).a(du.h("blockData"));
		this.f = cv.a(du.h("facing"));
		this.j = du.j("progress");
		this.k = this.j;
		this.g = du.p("extending");
		this.h = du.p("source");
	}

	@Override
	public du b(du du) {
		super.b(du);
		du.a("blockId", alu.a(this.a.v()));
		du.a("blockData", this.a.v().e(this.a));
		du.a("facing", this.f.a());
		du.a("progress", this.k);
		du.a("extending", this.g);
		du.a("source", this.h);
		return du;
	}

	public void a(ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn) {
		if (!this.g && this.h) {
			this.a.a(atc.a, true).a(ajs, co, bdt, list, sn, false);
		}

		cv cv7 = (cv)i.get();
		if (!((double)this.j < 1.0) || cv7 != (this.g ? this.f : this.f.d())) {
			int integer8 = list.size();
			atl atl9;
			if (this.h()) {
				atl9 = alv.K.t().a(atd.H, this.f).a(atd.b, this.g != 1.0F - this.j < 0.25F);
			} else {
				atl9 = this.a;
			}

			float float10 = this.e(this.j);
			double double11 = (double)((float)this.f.g() * float10);
			double double13 = (double)((float)this.f.h() * float10);
			double double15 = (double)((float)this.f.i() * float10);
			atl9.a(ajs, co, bdt.d(-double11, -double13, -double15), list, sn, true);

			for (int integer17 = integer8; integer17 < list.size(); integer17++) {
				list.set(integer17, ((bdt)list.get(integer17)).d(double11, double13, double15));
			}
		}
	}
}
