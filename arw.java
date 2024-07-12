import java.util.Random;

public abstract class arw extends aob {
	public static final atz<apn.a> d = atz.a("variant", apn.a.class);

	public arw() {
		super(azs.d);
		atl atl2 = this.A.b();
		if (!this.e()) {
			atl2 = atl2.a(a, aob.a.BOTTOM);
		}

		this.y(atl2.a(d, apn.a.OAK));
		this.a(aej.b);
	}

	@Override
	public azt r(atl atl) {
		return ((apn.a)atl.c(d)).c();
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afh.a(alv.bM);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(alv.bM, 1, ((apn.a)atl.c(d)).a());
	}

	@Override
	public String e(int integer) {
		return super.a() + "." + apn.a.a(integer).d();
	}

	@Override
	public aub<?> g() {
		return d;
	}

	@Override
	public Comparable<?> a(afj afj) {
		return apn.a.a(afj.j() & 7);
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		if (afh != afh.a(alv.bL)) {
			for (apn.a a8 : apn.a.values()) {
				dd.add(new afj(afh, 1, a8.a()));
			}
		}
	}

	@Override
	public atl a(int integer) {
		atl atl3 = this.t().a(d, apn.a.a(integer & 7));
		if (!this.e()) {
			atl3 = atl3.a(a, (integer & 8) == 0 ? aob.a.BOTTOM : aob.a.TOP);
		}

		return atl3;
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((apn.a)atl.c(d)).a();
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
	public int d(atl atl) {
		return ((apn.a)atl.c(d)).a();
	}
}
