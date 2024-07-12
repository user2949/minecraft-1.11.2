import javax.annotation.Nullable;

public class sa extends rz {
	private final sn w;

	public sa(String string, sn sn2, @Nullable sn sn3) {
		super(string, sn2);
		this.w = sn3;
	}

	@Nullable
	@Override
	public sn i() {
		return this.v;
	}

	@Nullable
	@Override
	public sn j() {
		return this.w;
	}

	@Override
	public fb c(sw sw) {
		fb fb3 = this.w == null ? this.v.i_() : this.w.i_();
		afj afj4 = this.w instanceof sw ? ((sw)this.w).cg() : afj.a;
		String string5 = "death.attack." + this.u;
		String string6 = string5 + ".item";
		return !afj4.b() && afj4.t() && dp.c(string6) ? new fi(string6, sw.i_(), fb3, afj4.C()) : new fi(string5, sw.i_(), fb3);
	}
}
