import java.util.Random;

public class ank extends alu {
	public static final aua a = aua.a("moisture", 0, 7);
	protected static final bdt b = new bdt(0.0, 0.0, 0.0, 1.0, 0.9375, 1.0);

	protected ank() {
		super(azs.c);
		this.y(this.A.b().a(a, 0));
		this.a(true);
		this.d(255);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return b;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		int integer6 = (Integer)atl.c(a);
		if (!this.d(ajs, co) && !ajs.B(co.a())) {
			if (integer6 > 0) {
				ajs.a(co, atl.a(a, integer6 - 1), 2);
			} else if (!this.c(ajs, co)) {
				this.b(ajs, co);
			}
		} else if (integer6 < 7) {
			ajs.a(co, atl.a(a, 7), 2);
		}
	}

	@Override
	public void a(ajs ajs, co co, sn sn, float float4) {
		if (!ajs.E && ajs.r.nextFloat() < float4 - 0.5F && sn instanceof sw && (sn instanceof aay || ajs.U().b("mobGriefing")) && sn.G * sn.G * sn.H > 0.512F) {
			this.b(ajs, co);
		}

		super.a(ajs, co, sn, float4);
	}

	private void b(ajs ajs, co co) {
		atl atl4 = alv.d.t();
		ajs.a(co, atl4);
		bdt bdt5 = atl4.c((ajw)ajs, co).a(co);

		for (sn sn8 : ajs.b(null, bdt5)) {
			sn8.b(sn8.p, bdt5.e, sn8.r);
		}
	}

	private boolean c(ajs ajs, co co) {
		alu alu4 = ajs.o(co.a()).v();
		return alu4 instanceof amp || alu4 instanceof arb;
	}

	private boolean d(ajs ajs, co co) {
		for (co.a a5 : co.b(co.a(-4, 0, -4), co.a(4, 1, 4))) {
			if (ajs.o(a5).a() == azs.h) {
				return true;
			}
		}

		return false;
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		super.a(atl, ajs, co3, alu, co5);
		if (ajs.o(co3.a()).a().a()) {
			this.b(ajs, co3);
		}
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		super.c(ajs, co, atl);
		if (ajs.o(co.a()).a().a()) {
			this.b(ajs, co);
		}
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		switch (cv) {
			case UP:
				return true;
			case NORTH:
			case SOUTH:
			case WEST:
			case EAST:
				atl atl6 = ajw.o(co.a(cv));
				alu alu7 = atl6.v();
				return !atl6.q() && alu7 != alv.ak && alu7 != alv.da;
			default:
				return super.a(atl, ajw, co, cv);
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return alv.d.a(alv.d.t().a(amv.a, amv.a.DIRT), random, integer);
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, integer & 7);
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
