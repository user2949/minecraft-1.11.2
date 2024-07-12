import java.util.List;

public class acd extends acb implements aso {
	private boolean a = true;
	private int b = -1;
	private final co c = co.a;

	public acd(ajs ajs) {
		super(ajs);
	}

	public acd(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	@Override
	public aby.a v() {
		return aby.a.HOPPER;
	}

	@Override
	public atl x() {
		return alv.cp.t();
	}

	@Override
	public int z() {
		return 1;
	}

	@Override
	public int v_() {
		return 5;
	}

	@Override
	public boolean b(aay aay, ri ri) {
		if (!this.l.E) {
			aay.a((rc)this);
		}

		return true;
	}

	@Override
	public void a(int integer1, int integer2, int integer3, boolean boolean4) {
		boolean boolean6 = !boolean4;
		if (boolean6 != this.C()) {
			this.l(boolean6);
		}
	}

	public boolean C() {
		return this.a;
	}

	public void l(boolean boolean1) {
		this.a = boolean1;
	}

	@Override
	public ajs D() {
		return this.l;
	}

	@Override
	public double E() {
		return this.p;
	}

	@Override
	public double F() {
		return this.q + 0.5;
	}

	@Override
	public double G() {
		return this.r;
	}

	@Override
	public void A_() {
		super.A_();
		if (!this.l.E && this.au() && this.C()) {
			co co2 = new co(this);
			if (co2.equals(this.c)) {
				this.b--;
			} else {
				this.g(0);
			}

			if (!this.J()) {
				this.g(0);
				if (this.I()) {
					this.g(4);
					this.x_();
				}
			}
		}
	}

	public boolean I() {
		if (asp.a(this)) {
			return true;
		} else {
			List<zj> list2 = this.l.a(zj.class, this.bo().c(0.25, 0.0, 0.25), sr.a);
			if (!list2.isEmpty()) {
				asp.a(null, this, (zj)list2.get(0));
			}

			return false;
		}
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (this.l.U().b("doEntityDrops")) {
			this.a(afh.a(alv.cp), 1, 0.0F);
		}
	}

	public static void a(ph ph) {
		acb.b(ph, acd.class);
	}

	@Override
	protected void b(du du) {
		super.b(du);
		du.a("TransferCooldown", this.b);
		du.a("Enabled", this.a);
	}

	@Override
	protected void a(du du) {
		super.a(du);
		this.b = du.h("TransferCooldown");
		this.a = du.e("Enabled") ? du.p("Enabled") : true;
	}

	public void g(int integer) {
		this.b = integer;
	}

	public boolean J() {
		return this.b > 0;
	}

	@Override
	public String l() {
		return "minecraft:hopper";
	}

	@Override
	public acl a(aax aax, aay aay) {
		return new acz(aax, this, aay);
	}
}
