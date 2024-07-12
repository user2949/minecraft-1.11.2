import javax.annotation.Nullable;

public class zk extends sn {
	private static final kk<Integer> a = kn.a(zk.class, km.b);
	@Nullable
	private sw b;
	private int c = 80;

	public zk(ajs ajs) {
		super(ajs);
		this.i = true;
		this.a(0.98F, 0.98F);
	}

	public zk(ajs ajs, double double2, double double3, double double4, sw sw) {
		this(ajs);
		this.b(double2, double3, double4);
		float float10 = (float)(Math.random() * (float) (Math.PI * 2));
		this.s = (double)(-((float)Math.sin((double)float10)) * 0.02F);
		this.t = 0.2F;
		this.u = (double)(-((float)Math.cos((double)float10)) * 0.02F);
		this.a(80);
		this.m = double2;
		this.n = double3;
		this.o = double4;
		this.b = sw;
	}

	@Override
	protected void i() {
		this.Y.a(a, 80);
	}

	@Override
	protected boolean af() {
		return false;
	}

	@Override
	public boolean aq() {
		return !this.F;
	}

	@Override
	public void A_() {
		this.m = this.p;
		this.n = this.q;
		this.o = this.r;
		if (!this.ae()) {
			this.t -= 0.04F;
		}

		this.a(tc.SELF, this.s, this.t, this.u);
		this.s *= 0.98F;
		this.t *= 0.98F;
		this.u *= 0.98F;
		if (this.z) {
			this.s *= 0.7F;
			this.u *= 0.7F;
			this.t *= -0.5;
		}

		this.c--;
		if (this.c <= 0) {
			this.T();
			if (!this.l.E) {
				this.n();
			}
		} else {
			this.ak();
			this.l.a(de.SMOKE_NORMAL, this.p, this.q + 0.5, this.r, 0.0, 0.0, 0.0);
		}
	}

	private void n() {
		float float2 = 4.0F;
		this.l.a(this, this.p, this.q + (double)(this.H / 16.0F), this.r, 4.0F, true);
	}

	@Override
	protected void b(du du) {
		du.a("Fuse", (short)this.l());
	}

	@Override
	protected void a(du du) {
		this.a(du.g("Fuse"));
	}

	@Nullable
	public sw j() {
		return this.b;
	}

	@Override
	public float bq() {
		return 0.0F;
	}

	public void a(int integer) {
		this.Y.b(a, integer);
		this.c = integer;
	}

	@Override
	public void a(kk<?> kk) {
		if (a.equals(kk)) {
			this.c = this.k();
		}
	}

	public int k() {
		return this.Y.a(a);
	}

	public int l() {
		return this.c;
	}
}
