import javax.annotation.Nullable;

public class rz extends ry {
	@Nullable
	protected sn v;
	private boolean w;

	public rz(String string, @Nullable sn sn) {
		super(string);
		this.v = sn;
	}

	public rz w() {
		this.w = true;
		return this;
	}

	public boolean x() {
		return this.w;
	}

	@Nullable
	@Override
	public sn j() {
		return this.v;
	}

	@Override
	public fb c(sw sw) {
		afj afj3 = this.v instanceof sw ? ((sw)this.v).cg() : afj.a;
		String string4 = "death.attack." + this.u;
		String string5 = string4 + ".item";
		return !afj3.b() && afj3.t() && dp.c(string5) ? new fi(string5, sw.i_(), this.v.i_(), afj3.C()) : new fi(string4, sw.i_(), this.v.i_());
	}

	@Override
	public boolean r() {
		return this.v != null && this.v instanceof sw && !(this.v instanceof aay);
	}

	@Nullable
	@Override
	public bdw v() {
		return new bdw(this.v.p, this.v.q, this.v.r);
	}
}
