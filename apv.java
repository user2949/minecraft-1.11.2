import java.util.Random;

public abstract class apv extends aob {
	public static final atz<apv.c> d = atz.a("variant", apv.c.class);

	public apv() {
		super(azs.e, azt.r);
		atl atl2 = this.A.b();
		if (!this.e()) {
			atl2 = atl2.a(a, aob.a.BOTTOM);
		}

		this.y(atl2.a(d, apv.c.DEFAULT));
		this.a(aej.b);
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afh.a(alv.cX);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(alv.cX);
	}

	@Override
	public atl a(int integer) {
		atl atl3 = this.t().a(d, apv.c.DEFAULT);
		if (!this.e()) {
			atl3 = atl3.a(a, (integer & 8) == 0 ? aob.a.BOTTOM : aob.a.TOP);
		}

		return atl3;
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		if (!this.e() && atl.c(a) == aob.a.TOP) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	protected atm b() {
		return this.e() ? new atm(this, d) : new atm(this, a, d);
	}

	@Override
	public String e(int integer) {
		return super.a();
	}

	@Override
	public aub<?> g() {
		return d;
	}

	@Override
	public Comparable<?> a(afj afj) {
		return apv.c.DEFAULT;
	}

	public static class a extends apv {
		@Override
		public boolean e() {
			return true;
		}
	}

	public static class b extends apv {
		@Override
		public boolean e() {
			return false;
		}
	}

	public static enum c implements ox {
		DEFAULT;

		@Override
		public String m() {
			return "default";
		}
	}
}
