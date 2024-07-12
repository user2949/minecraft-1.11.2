import java.util.Calendar;
import javax.annotation.Nullable;

public class wu extends wt {
	private static final kk<Byte> a = kn.a(wu.class, km.a);
	private co b;

	public wu(ajs ajs) {
		super(ajs);
		this.a(0.5F, 0.9F);
		this.a(true);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, (byte)0);
	}

	@Override
	protected float ci() {
		return 0.1F;
	}

	@Override
	protected float cj() {
		return super.cj() * 0.95F;
	}

	@Nullable
	@Override
	protected nm G() {
		return this.o() && this.S.nextInt(4) != 0 ? null : nn.x;
	}

	@Override
	protected nm bW() {
		return nn.z;
	}

	@Override
	protected nm bX() {
		return nn.y;
	}

	@Override
	public boolean ar() {
		return false;
	}

	@Override
	protected void C(sn sn) {
	}

	@Override
	protected void ct() {
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(6.0);
	}

	public boolean o() {
		return (this.Y.a(a) & 1) != 0;
	}

	public void a(boolean boolean1) {
		byte byte3 = this.Y.a(a);
		if (boolean1) {
			this.Y.b(a, (byte)(byte3 | 1));
		} else {
			this.Y.b(a, (byte)(byte3 & -2));
		}
	}

	@Override
	public void A_() {
		super.A_();
		if (this.o()) {
			this.s = 0.0;
			this.t = 0.0;
			this.u = 0.0;
			this.q = (double)ot.c(this.q) + 1.0 - (double)this.H;
		} else {
			this.t *= 0.6F;
		}
	}

	@Override
	protected void M() {
		super.M();
		co co2 = new co(this);
		co co3 = co2.a();
		if (this.o()) {
			if (this.l.o(co3).m()) {
				if (this.S.nextInt(200) == 0) {
					this.aP = (float)this.S.nextInt(360);
				}

				if (this.l.b(this, 4.0) != null) {
					this.a(false);
					this.l.a(null, 1025, co2, 0);
				}
			} else {
				this.a(false);
				this.l.a(null, 1025, co2, 0);
			}
		} else {
			if (this.b != null && (!this.l.d(this.b) || this.b.q() < 1)) {
				this.b = null;
			}

			if (this.b == null || this.S.nextInt(30) == 0 || this.b.f((double)((int)this.p), (double)((int)this.q), (double)((int)this.r)) < 4.0) {
				this.b = new co(
					(int)this.p + this.S.nextInt(7) - this.S.nextInt(7), (int)this.q + this.S.nextInt(6) - 2, (int)this.r + this.S.nextInt(7) - this.S.nextInt(7)
				);
			}

			double double4 = (double)this.b.p() + 0.5 - this.p;
			double double6 = (double)this.b.q() + 0.1 - this.q;
			double double8 = (double)this.b.r() + 0.5 - this.r;
			this.s = this.s + (Math.signum(double4) * 0.5 - this.s) * 0.1F;
			this.t = this.t + (Math.signum(double6) * 0.7F - this.t) * 0.1F;
			this.u = this.u + (Math.signum(double8) * 0.5 - this.u) * 0.1F;
			float float10 = (float)(ot.c(this.u, this.s) * 180.0F / (float)Math.PI) - 90.0F;
			float float11 = ot.g(float10 - this.v);
			this.bf = 0.5F;
			this.v += float11;
			if (this.S.nextInt(100) == 0 && this.l.o(co3).m()) {
				this.a(true);
			}
		}
	}

	@Override
	protected boolean af() {
		return false;
	}

	@Override
	public void e(float float1, float float2) {
	}

	@Override
	protected void a(double double1, boolean boolean2, atl atl, co co) {
	}

	@Override
	public boolean bc() {
		return true;
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else {
			if (!this.l.E && this.o()) {
				this.a(false);
			}

			return super.a(ry, float2);
		}
	}

	public static void a(ph ph) {
		sx.a(ph, wu.class);
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.Y.b(a, du.f("BatFlags"));
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("BatFlags", this.Y.a(a));
	}

	@Override
	public boolean cM() {
		co co2 = new co(this.p, this.bo().b, this.r);
		if (co2.q() >= this.l.K()) {
			return false;
		} else {
			int integer3 = this.l.k(co2);
			int integer4 = 4;
			if (this.a(this.l.ac())) {
				integer4 = 7;
			} else if (this.S.nextBoolean()) {
				return false;
			}

			return integer3 > this.S.nextInt(integer4) ? false : super.cM();
		}
	}

	private boolean a(Calendar calendar) {
		return calendar.get(2) + 1 == 10 && calendar.get(5) >= 20 || calendar.get(2) + 1 == 11 && calendar.get(5) <= 3;
	}

	@Override
	public float bq() {
		return this.H / 2.0F;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.ag;
	}
}
