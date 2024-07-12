import javax.annotation.Nullable;

public class zw extends aaa {
	public zw(ajs ajs) {
		super(ajs);
		this.a(this.G * 6.0F, this.H * 6.0F);
	}

	public static void a(ph ph) {
		sx.a(ph, zw.class);
	}

	@Override
	public float bq() {
		return 10.440001F;
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(100.0);
		this.a(aad.d).a(0.5);
		this.a(aad.e).a(50.0);
	}

	@Override
	public float a(co co) {
		return this.l.n(co) - 0.5F;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.u;
	}
}
