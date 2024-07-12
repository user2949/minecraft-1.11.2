public class aml extends alu {
	public static final atz<aem> a = atz.a("color", aem.class);

	public aml(azs azs) {
		super(azs);
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
	public atl a(int integer) {
		return this.t().a(a, aem.b(integer));
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
