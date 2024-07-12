import java.util.List;
import java.util.Random;

public class ub extends ui {
	private final ww d;
	private final Class<? extends ww> e;
	ajs a;
	private ww f;
	int b;
	double c;

	public ub(ww ww, double double2) {
		this(ww, double2, ww.getClass());
	}

	public ub(ww ww, double double2, Class<? extends ww> class3) {
		this.d = ww;
		this.a = ww.l;
		this.e = class3;
		this.c = double2;
		this.a(3);
	}

	@Override
	public boolean a() {
		if (!this.d.dn()) {
			return false;
		} else {
			this.f = this.f();
			return this.f != null;
		}
	}

	@Override
	public boolean b() {
		return this.f.au() && this.f.dn() && this.b < 60;
	}

	@Override
	public void d() {
		this.f = null;
		this.b = 0;
	}

	@Override
	public void e() {
		this.d.t().a(this.f, 10.0F, (float)this.d.N());
		this.d.x().a(this.f, this.c);
		this.b++;
		if (this.b >= 60 && this.d.h(this.f) < 9.0) {
			this.i();
		}
	}

	private ww f() {
		List<ww> list2 = this.a.a(this.e, this.d.bo().g(8.0));
		double double3 = Double.MAX_VALUE;
		ww ww5 = null;

		for (ww ww7 : list2) {
			if (this.d.a(ww7) && this.d.h(ww7) < double3) {
				ww5 = ww7;
				double3 = this.d.h(ww7);
			}
		}

		return ww5;
	}

	private void i() {
		sk sk2 = this.d.a((sk)this.f);
		if (sk2 != null) {
			aay aay3 = this.d.dm();
			if (aay3 == null && this.f.dm() != null) {
				aay3 = this.f.dm();
			}

			if (aay3 != null) {
				aay3.b(oa.C);
				if (this.d instanceof wy) {
					aay3.b(nr.H);
				}
			}

			this.d.b_(6000);
			this.f.b_(6000);
			this.d.do();
			this.f.do();
			sk2.b_(-24000);
			sk2.b(this.d.p, this.d.q, this.d.r, 0.0F, 0.0F);
			this.a.a(sk2);
			Random random4 = this.d.bJ();

			for (int integer5 = 0; integer5 < 7; integer5++) {
				double double6 = random4.nextGaussian() * 0.02;
				double double8 = random4.nextGaussian() * 0.02;
				double double10 = random4.nextGaussian() * 0.02;
				double double12 = random4.nextDouble() * (double)this.d.G * 2.0 - (double)this.d.G;
				double double14 = 0.5 + random4.nextDouble() * (double)this.d.H;
				double double16 = random4.nextDouble() * (double)this.d.G * 2.0 - (double)this.d.G;
				this.a.a(de.HEART, this.d.p + double12, this.d.q + double14, this.d.r + double16, double6, double8, double10);
			}

			if (this.a.U().b("doMobLoot")) {
				this.a.a(new st(this.a, this.d.p, this.d.q, this.d.r, random4.nextInt(7) + 1));
			}
		}
	}
}
