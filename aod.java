public class aod extends alu {
	private final boolean a;

	protected aod(azs azs, boolean boolean2) {
		this(azs, boolean2, azs.r());
	}

	protected aod(azs azs, boolean boolean2, azt azt) {
		super(azs, azt);
		this.a = boolean2;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		atl atl6 = ajw.o(co.a(cv));
		alu alu7 = atl6.v();
		if (this == alv.w || this == alv.cG) {
			if (atl != atl6) {
				return true;
			}

			if (alu7 == this) {
				return false;
			}
		}

		return !this.a && alu7 == this ? false : super.a(atl, ajw, co, cv);
	}
}
