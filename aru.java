public class aru extends alp {
	public static final aua d = aua.a("power", 0, 15);
	private final int e;

	protected aru(azs azs, int integer) {
		this(azs, integer, azs.r());
	}

	protected aru(azs azs, int integer, azt azt) {
		super(azs, azt);
		this.y(this.A.b().a(d, 0));
		this.e = integer;
	}

	@Override
	protected int e(ajs ajs, co co) {
		int integer4 = Math.min(ajs.a(sn.class, c.a(co)).size(), this.e);
		if (integer4 > 0) {
			float float5 = (float)Math.min(this.e, integer4) / (float)this.e;
			return ot.f(float5 * 15.0F);
		} else {
			return 0;
		}
	}

	@Override
	protected void b(ajs ajs, co co) {
		ajs.a(null, co, nn.dR, no.BLOCKS, 0.3F, 0.90000004F);
	}

	@Override
	protected void c(ajs ajs, co co) {
		ajs.a(null, co, nn.dQ, no.BLOCKS, 0.3F, 0.75F);
	}

	@Override
	protected int i(atl atl) {
		return (Integer)atl.c(d);
	}

	@Override
	protected atl a(atl atl, int integer) {
		return atl.a(d, integer);
	}

	@Override
	public int a(ajs ajs) {
		return 10;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(d, integer);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(d);
	}

	@Override
	protected atm b() {
		return new atm(this, d);
	}
}
