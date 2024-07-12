import java.util.Random;

public class amp extends ama implements alx {
	public static final aua c = aua.a("age", 0, 7);
	private static final bdt[] a = new bdt[]{
		new bdt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.25, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.375, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.625, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.75, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.875, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
	};

	protected amp() {
		this.y(this.A.b().a(this.e(), 0));
		this.a(true);
		this.a(null);
		this.c(0.0F);
		this.a(aqu.c);
		this.p();
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return a[atl.c(this.e())];
	}

	@Override
	protected boolean i(atl atl) {
		return atl.v() == alv.ak;
	}

	protected aua e() {
		return c;
	}

	public int g() {
		return 7;
	}

	protected int z(atl atl) {
		return (Integer)atl.c(this.e());
	}

	public atl e(int integer) {
		return this.t().a(this.e(), integer);
	}

	public boolean A(atl atl) {
		return (Integer)atl.c(this.e()) >= this.g();
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		super.b(ajs, co, atl, random);
		if (ajs.k(co.a()) >= 9) {
			int integer6 = this.z(atl);
			if (integer6 < this.g()) {
				float float7 = a(this, ajs, co);
				if (random.nextInt((int)(25.0F / float7) + 1) == 0) {
					ajs.a(co, this.e(integer6 + 1), 2);
				}
			}
		}
	}

	public void g(ajs ajs, co co, atl atl) {
		int integer5 = this.z(atl) + this.b(ajs);
		int integer6 = this.g();
		if (integer5 > integer6) {
			integer5 = integer6;
		}

		ajs.a(co, this.e(integer5), 2);
	}

	protected int b(ajs ajs) {
		return ot.a(ajs.r, 2, 5);
	}

	protected static float a(alu alu, ajs ajs, co co) {
		float float4 = 1.0F;
		co co5 = co.b();

		for (int integer6 = -1; integer6 <= 1; integer6++) {
			for (int integer7 = -1; integer7 <= 1; integer7++) {
				float float8 = 0.0F;
				atl atl9 = ajs.o(co5.a(integer6, 0, integer7));
				if (atl9.v() == alv.ak) {
					float8 = 1.0F;
					if ((Integer)atl9.c(ank.a) > 0) {
						float8 = 3.0F;
					}
				}

				if (integer6 != 0 || integer7 != 0) {
					float8 /= 4.0F;
				}

				float4 += float8;
			}
		}

		co co6 = co.c();
		co co7 = co.d();
		co co8 = co.e();
		co co9 = co.f();
		boolean boolean10 = alu == ajs.o(co8).v() || alu == ajs.o(co9).v();
		boolean boolean11 = alu == ajs.o(co6).v() || alu == ajs.o(co7).v();
		if (boolean10 && boolean11) {
			float4 /= 2.0F;
		} else {
			boolean boolean12 = alu == ajs.o(co8.c()).v() || alu == ajs.o(co9.c()).v() || alu == ajs.o(co9.d()).v() || alu == ajs.o(co8.d()).v();
			if (boolean12) {
				float4 /= 2.0F;
			}
		}

		return float4;
	}

	@Override
	public boolean f(ajs ajs, co co, atl atl) {
		return (ajs.j(co) >= 8 || ajs.h(co)) && this.i(ajs.o(co.b()));
	}

	protected afh h() {
		return afl.Q;
	}

	protected afh i() {
		return afl.R;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		super.a(ajs, co, atl, float4, 0);
		if (!ajs.E) {
			int integer7 = this.z(atl);
			if (integer7 >= this.g()) {
				int integer8 = 3 + integer;

				for (int integer9 = 0; integer9 < integer8; integer9++) {
					if (ajs.r.nextInt(2 * this.g()) <= integer7) {
						a(ajs, co, new afj(this.h()));
					}
				}
			}
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return this.A(atl) ? this.i() : this.h();
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(this.h());
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, boolean boolean4) {
		return !this.A(atl);
	}

	@Override
	public boolean a(ajs ajs, Random random, co co, atl atl) {
		return true;
	}

	@Override
	public void b(ajs ajs, Random random, co co, atl atl) {
		this.g(ajs, co, atl);
	}

	@Override
	public atl a(int integer) {
		return this.e(integer);
	}

	@Override
	public int e(atl atl) {
		return this.z(atl);
	}

	@Override
	protected atm b() {
		return new atm(this, c);
	}
}
