import java.util.Random;

public class any extends alu {
	protected static final bdt a = new bdt(0.0, 0.0, 0.0, 1.0, 0.9375, 1.0);

	protected any() {
		super(azs.c);
		this.d(255);
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
	public void c(ajs ajs, co co, atl atl) {
		super.c(ajs, co, atl);
		this.b(ajs, co);
	}

	private void b(ajs ajs, co co) {
		if (ajs.o(co.a()).a().a()) {
			ajs.a(co, alv.d.t());
		}
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return a;
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
	public afh a(atl atl, Random random, int integer) {
		return alv.d.a(alv.d.t().a(amv.a, amv.a.DIRT), random, integer);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(this);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		super.a(atl, ajs, co3, alu, co5);
		this.b(ajs, co3);
	}
}
