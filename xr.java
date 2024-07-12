import javax.annotation.Nullable;

public class xr extends xl {
	public xr(ajs ajs) {
		super(ajs);
	}

	public static void a(ph ph) {
		xl.b(ph, xr.class);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.I;
	}

	@Override
	protected nm G() {
		super.G();
		return nn.dW;
	}

	@Override
	protected nm bX() {
		super.bX();
		return nn.dY;
	}

	@Override
	protected nm bW() {
		super.bW();
		return nn.dZ;
	}

	@Override
	protected void dk() {
		this.a(nn.dX, 1.0F, (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F);
	}
}
