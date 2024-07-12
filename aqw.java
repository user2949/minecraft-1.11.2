import java.util.Random;

public class aqw extends aod {
	public static final atz<aem> a = atz.a("color", aem.class);

	public aqw(azs azs) {
		super(azs, false);
		this.y(this.A.b().a(a, aem.WHITE));
		this.a(aej.b);
	}

	@Override
	public int d(atl atl) {
		return ((aem)atl.c(a)).a();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (aem aem8 : aem.values()) {
			dd.add(new afj(afh, 1, aem8.a()));
		}
	}

	@Override
	public azt r(atl atl) {
		return ((aem)atl.c(a)).e();
	}

	@Override
	public ajk f() {
		return ajk.TRANSLUCENT;
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	protected boolean n() {
		return true;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, aem.b(integer));
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			alr.c(ajs, co);
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			alr.c(ajs, co);
		}
	}

	@Override
	public int e(atl atl) {
		return ((aem)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}
}
