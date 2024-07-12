import java.util.Random;

public class amc extends alu {
	public static final aua a = aua.a("age", 0, 15);
	protected static final bdt b = new bdt(0.0625, 0.0, 0.0625, 0.9375, 0.9375, 0.9375);
	protected static final bdt c = new bdt(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375);

	protected amc() {
		super(azs.A);
		this.y(this.A.b().a(a, 0));
		this.a(true);
		this.a(aej.c);
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		co co6 = co.a();
		if (ajs.d(co6)) {
			int integer7 = 1;

			while (ajs.o(co.c(integer7)).v() == this) {
				integer7++;
			}

			if (integer7 < 3) {
				int integer8 = (Integer)atl.c(a);
				if (integer8 == 15) {
					ajs.a(co6, this.t());
					atl atl9 = atl.a(a, 0);
					ajs.a(co, atl9, 4);
					atl9.a(ajs, co6, this, co);
				} else {
					ajs.a(co, atl.a(a, integer8 + 1), 4);
				}
			}
		}
	}

	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return b;
	}

	@Override
	public bdt b(atl atl, ajs ajs, co co) {
		return c.a(co);
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return super.a(ajs, co) ? this.b(ajs, co) : false;
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!this.b(ajs, co3)) {
			ajs.b(co3, true);
		}
	}

	public boolean b(ajs ajs, co co) {
		for (cv cv5 : cv.c.HORIZONTAL) {
			azs azs6 = ajs.o(co.a(cv5)).a();
			if (azs6.a() || azs6 == azs.i) {
				return false;
			}
		}

		alu alu4 = ajs.o(co.b()).v();
		return alu4 == alv.aK || alu4 == alv.m && !ajs.o(co.a()).a().d();
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sn sn) {
		sn.a(ry.j, 1.0F);
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
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
		return new atm(this, a);
	}
}
