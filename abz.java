public class abz extends acb {
	public abz(ajs ajs) {
		super(ajs);
	}

	public abz(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	public static void a(ph ph) {
		acb.b(ph, abz.class);
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (this.l.U().b("doEntityDrops")) {
			this.a(afh.a(alv.ae), 1, 0.0F);
		}
	}

	@Override
	public int v_() {
		return 27;
	}

	@Override
	public aby.a v() {
		return aby.a.CHEST;
	}

	@Override
	public atl x() {
		return alv.ae.t().a(amg.a, cv.NORTH);
	}

	@Override
	public int z() {
		return 8;
	}

	@Override
	public String l() {
		return "minecraft:chest";
	}

	@Override
	public acl a(aax aax, aay aay) {
		this.f(aay);
		return new acp(aax, this, aay);
	}
}
