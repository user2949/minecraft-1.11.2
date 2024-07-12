import javax.annotation.Nullable;

public class xn extends xl {
	public xn(ajs ajs) {
		super(ajs);
	}

	public static void a(ph ph) {
		xl.b(ph, xn.class);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.H;
	}

	@Override
	protected nm G() {
		super.G();
		return nn.az;
	}

	@Override
	protected nm bX() {
		super.bX();
		return nn.aC;
	}

	@Override
	protected nm bW() {
		super.bW();
		return nn.aD;
	}

	@Override
	public boolean a(ww ww) {
		if (ww == this) {
			return false;
		} else {
			return !(ww instanceof xn) && !(ww instanceof xo) ? false : this.dG() && ((xm)ww).dG();
		}
	}

	@Override
	public sk a(sk sk) {
		xm xm3 = (xm)(sk instanceof xo ? new xr(this.l) : new xn(this.l));
		this.a(sk, xm3);
		return xm3;
	}
}
