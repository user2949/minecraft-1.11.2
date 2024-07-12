public class uy extends uu {
	private final xb c;

	public uy(xb xb, double double2) {
		super(xb, double2, 8);
		this.c = xb;
	}

	@Override
	public boolean a() {
		return this.c.dh() && !this.c.dj() && super.a();
	}

	@Override
	public void c() {
		super.c();
		this.c.dl().a(false);
	}

	@Override
	public void d() {
		super.d();
		this.c.r(false);
	}

	@Override
	public void e() {
		super.e();
		this.c.dl().a(false);
		if (!this.f()) {
			this.c.r(false);
		} else if (!this.c.dj()) {
			this.c.r(true);
		}
	}

	@Override
	protected boolean a(ajs ajs, co co) {
		if (!ajs.d(co.a())) {
			return false;
		} else {
			atl atl4 = ajs.o(co);
			alu alu5 = atl4.v();
			if (alu5 == alv.ae) {
				asc asc6 = ajs.r(co);
				if (asc6 instanceof ase && ((ase)asc6).l < 1) {
					return true;
				}
			} else {
				if (alu5 == alv.am) {
					return true;
				}

				if (alu5 == alv.C && atl4.c(als.a) != als.a.HEAD) {
					return true;
				}
			}

			return false;
		}
	}
}
