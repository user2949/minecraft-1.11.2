import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public abstract class yy extends sn {
	private static final Predicate<sn> c = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn instanceof yy;
		}
	};
	private int d;
	protected co a;
	@Nullable
	public cv b;

	public yy(ajs ajs) {
		super(ajs);
		this.a(0.5F, 0.5F);
	}

	public yy(ajs ajs, co co) {
		this(ajs);
		this.a = co;
	}

	@Override
	protected void i() {
	}

	protected void a(cv cv) {
		Validate.notNull(cv);
		Validate.isTrue(cv.k().c());
		this.b = cv;
		this.v = (float)(this.b.b() * 90);
		this.x = this.v;
		this.j();
	}

	protected void j() {
		if (this.b != null) {
			double double2 = (double)this.a.p() + 0.5;
			double double4 = (double)this.a.q() + 0.5;
			double double6 = (double)this.a.r() + 0.5;
			double double8 = 0.46875;
			double double10 = this.a(this.l());
			double double12 = this.a(this.n());
			double2 -= (double)this.b.g() * 0.46875;
			double6 -= (double)this.b.i() * 0.46875;
			double4 += double12;
			cv cv14 = this.b.f();
			double2 += double10 * (double)cv14.g();
			double6 += double10 * (double)cv14.i();
			this.p = double2;
			this.q = double4;
			this.r = double6;
			double double15 = (double)this.l();
			double double17 = (double)this.n();
			double double19 = (double)this.l();
			if (this.b.k() == cv.a.Z) {
				double19 = 1.0;
			} else {
				double15 = 1.0;
			}

			double15 /= 32.0;
			double17 /= 32.0;
			double19 /= 32.0;
			this.a(new bdt(double2 - double15, double4 - double17, double6 - double19, double2 + double15, double4 + double17, double6 + double19));
		}
	}

	private double a(int integer) {
		return integer % 32 == 0 ? 0.5 : 0.0;
	}

	@Override
	public void A_() {
		this.m = this.p;
		this.n = this.q;
		this.o = this.r;
		if (this.d++ == 100 && !this.l.E) {
			this.d = 0;
			if (!this.F && !this.k()) {
				this.T();
				this.a(null);
			}
		}
	}

	public boolean k() {
		if (!this.l.a(this, this.bo()).isEmpty()) {
			return false;
		} else {
			int integer2 = Math.max(1, this.l() / 16);
			int integer3 = Math.max(1, this.n() / 16);
			co co4 = this.a.a(this.b.d());
			cv cv5 = this.b.f();
			co.a a6 = new co.a();

			for (int integer7 = 0; integer7 < integer2; integer7++) {
				for (int integer8 = 0; integer8 < integer3; integer8++) {
					int integer9 = (integer2 - 1) / -2;
					int integer10 = (integer3 - 1) / -2;
					a6.g(co4).c(cv5, integer7 + integer9).c(cv.UP, integer8 + integer10);
					atl atl11 = this.l.o(a6);
					if (!atl11.a().a() && !amt.D(atl11)) {
						return false;
					}
				}
			}

			return this.l.a(this, this.bo(), c).isEmpty();
		}
	}

	@Override
	public boolean aq() {
		return true;
	}

	@Override
	public boolean t(sn sn) {
		return sn instanceof aay ? this.a(ry.a((aay)sn), 0.0F) : false;
	}

	@Override
	public cv bl() {
		return this.b;
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else {
			if (!this.F && !this.l.E) {
				this.T();
				this.ap();
				this.a(ry.j());
			}

			return true;
		}
	}

	@Override
	public void a(tc tc, double double2, double double3, double double4) {
		if (!this.l.E && !this.F && double2 * double2 + double3 * double3 + double4 * double4 > 0.0) {
			this.T();
			this.a(null);
		}
	}

	@Override
	public void f(double double1, double double2, double double3) {
		if (!this.l.E && !this.F && double1 * double1 + double2 * double2 + double3 * double3 > 0.0) {
			this.T();
			this.a(null);
		}
	}

	@Override
	public void b(du du) {
		du.a("Facing", (byte)this.b.b());
		co co3 = this.q();
		du.a("TileX", co3.p());
		du.a("TileY", co3.q());
		du.a("TileZ", co3.r());
	}

	@Override
	public void a(du du) {
		this.a = new co(du.h("TileX"), du.h("TileY"), du.h("TileZ"));
		this.a(cv.b(du.f("Facing")));
	}

	public abstract int l();

	public abstract int n();

	@Override
	public abstract void a(@Nullable sn sn);

	public abstract void o();

	@Override
	public zj a(afj afj, float float2) {
		zj zj4 = new zj(this.l, this.p + (double)((float)this.b.g() * 0.15F), this.q + (double)float2, this.r + (double)((float)this.b.i() * 0.15F), afj);
		zj4.q();
		this.l.a(zj4);
		return zj4;
	}

	@Override
	protected boolean as() {
		return false;
	}

	@Override
	public void b(double double1, double double2, double double3) {
		this.a = new co(double1, double2, double3);
		this.j();
		this.ai = true;
	}

	public co q() {
		return this.a;
	}

	@Override
	public float a(aqi aqi) {
		if (this.b != null && this.b.k() != cv.a.Y) {
			switch (aqi) {
				case CLOCKWISE_180:
					this.b = this.b.d();
					break;
				case COUNTERCLOCKWISE_90:
					this.b = this.b.f();
					break;
				case CLOCKWISE_90:
					this.b = this.b.e();
			}
		}

		float float3 = ot.g(this.v);
		switch (aqi) {
			case CLOCKWISE_180:
				return float3 + 180.0F;
			case COUNTERCLOCKWISE_90:
				return float3 + 90.0F;
			case CLOCKWISE_90:
				return float3 + 270.0F;
			default:
				return float3;
		}
	}

	@Override
	public float a(aou aou) {
		return this.a(aou.a(this.b));
	}

	@Override
	public void a(zg zg) {
	}
}
