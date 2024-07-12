import java.util.Random;
import javax.annotation.Nullable;

public class arb extends ama implements alx {
	public static final aua a = aua.a("age", 0, 7);
	public static final aty c = arl.a;
	private final alu e;
	protected static final bdt[] d = new bdt[]{
		new bdt(0.375, 0.0, 0.375, 0.625, 0.125, 0.625),
		new bdt(0.375, 0.0, 0.375, 0.625, 0.25, 0.625),
		new bdt(0.375, 0.0, 0.375, 0.625, 0.375, 0.625),
		new bdt(0.375, 0.0, 0.375, 0.625, 0.5, 0.625),
		new bdt(0.375, 0.0, 0.375, 0.625, 0.625, 0.625),
		new bdt(0.375, 0.0, 0.375, 0.625, 0.75, 0.625),
		new bdt(0.375, 0.0, 0.375, 0.625, 0.875, 0.625),
		new bdt(0.375, 0.0, 0.375, 0.625, 1.0, 0.625)
	};

	protected arb(alu alu) {
		this.y(this.A.b().a(a, 0).a(c, cv.UP));
		this.e = alu;
		this.a(true);
		this.a(null);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return d[atl.c(a)];
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		int integer5 = (Integer)atl.c(a);
		atl = atl.a(c, cv.UP);

		for (cv cv7 : cv.c.HORIZONTAL) {
			if (ajw.o(co.a(cv7)).v() == this.e && integer5 == 7) {
				atl = atl.a(c, cv7);
				break;
			}
		}

		return atl;
	}

	@Override
	protected boolean i(atl atl) {
		return atl.v() == alv.ak;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		super.b(ajs, co, atl, random);
		if (ajs.k(co.a()) >= 9) {
			float float6 = amp.a(this, ajs, co);
			if (random.nextInt((int)(25.0F / float6) + 1) == 0) {
				int integer7 = (Integer)atl.c(a);
				if (integer7 < 7) {
					atl = atl.a(a, integer7 + 1);
					ajs.a(co, atl, 2);
				} else {
					for (cv cv9 : cv.c.HORIZONTAL) {
						if (ajs.o(co.a(cv9)).v() == this.e) {
							return;
						}
					}

					co = co.a(cv.c.HORIZONTAL.a(random));
					alu alu8 = ajs.o(co.b()).v();
					if (ajs.o(co).v().x == azs.a && (alu8 == alv.ak || alu8 == alv.d || alu8 == alv.c)) {
						ajs.a(co, this.e.t());
					}
				}
			}
		}
	}

	public void g(ajs ajs, co co, atl atl) {
		int integer5 = (Integer)atl.c(a) + ot.a(ajs.r, 2, 5);
		ajs.a(co, atl.a(a, Math.min(7, integer5)), 2);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		super.a(ajs, co, atl, float4, integer);
		if (!ajs.E) {
			afh afh7 = this.e();
			if (afh7 != null) {
				int integer8 = (Integer)atl.c(a);

				for (int integer9 = 0; integer9 < 3; integer9++) {
					if (ajs.r.nextInt(15) <= integer8) {
						a(ajs, co, new afj(afh7));
					}
				}
			}
		}
	}

	@Nullable
	protected afh e() {
		if (this.e == alv.aU) {
			return afl.bo;
		} else {
			return this.e == alv.bk ? afl.bp : null;
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.a;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		afh afh5 = this.e();
		return afh5 == null ? afj.a : new afj(afh5);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, boolean boolean4) {
		return (Integer)atl.c(a) != 7;
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
		return this.t().a(a, integer);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(a);
	}

	@Override
	protected atm b() {
		return new atm(this, a, c);
	}
}
