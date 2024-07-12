public class afd extends afh {
	public final int a = 32;
	private final int b;
	private final float c;
	private final boolean d;
	private boolean e;
	private sh f;
	private float n;

	public afd(int integer, float float2, boolean boolean3) {
		this.b = integer;
		this.d = boolean3;
		this.c = float2;
		this.a(aej.h);
	}

	public afd(int integer, boolean boolean2) {
		this(integer, 0.6F, boolean2);
	}

	@Override
	public afj a(afj afj, ajs ajs, sw sw) {
		if (sw instanceof aay) {
			aay aay5 = (aay)sw;
			aay5.da().a(this, afj);
			ajs.a(null, aay5.p, aay5.q, aay5.r, nn.eE, no.PLAYERS, 0.5F, ajs.r.nextFloat() * 0.1F + 0.9F);
			this.a(afj, ajs, aay5);
			aay5.b(oa.b(this));
		}

		afj.g(1);
		return afj;
	}

	protected void a(afj afj, ajs ajs, aay aay) {
		if (!ajs.E && this.f != null && ajs.r.nextFloat() < this.n) {
			aay.c(new sh(this.f));
		}
	}

	@Override
	public int e(afj afj) {
		return 32;
	}

	@Override
	public agu f(afj afj) {
		return agu.EAT;
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		if (aay.n(this.e)) {
			aay.c(ri);
			return new rl<>(rk.SUCCESS, afj5);
		} else {
			return new rl<>(rk.FAIL, afj5);
		}
	}

	public int h(afj afj) {
		return this.b;
	}

	public float i(afj afj) {
		return this.c;
	}

	public boolean g() {
		return this.d;
	}

	public afd a(sh sh, float float2) {
		this.f = sh;
		this.n = float2;
		return this;
	}

	public afd h() {
		this.e = true;
		return this;
	}
}
