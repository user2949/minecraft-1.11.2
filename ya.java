import com.google.common.base.Optional;
import javax.annotation.Nullable;

public class ya extends sn {
	private static final kk<Optional<co>> b = kn.a(ya.class, km.k);
	private static final kk<Boolean> c = kn.a(ya.class, km.h);
	public int a;

	public ya(ajs ajs) {
		super(ajs);
		this.i = true;
		this.a(2.0F, 2.0F);
		this.a = this.S.nextInt(100000);
	}

	public ya(ajs ajs, double double2, double double3, double double4) {
		this(ajs);
		this.b(double2, double3, double4);
	}

	@Override
	protected boolean af() {
		return false;
	}

	@Override
	protected void i() {
		this.R().a(b, Optional.absent());
		this.R().a(c, true);
	}

	@Override
	public void A_() {
		this.m = this.p;
		this.n = this.q;
		this.o = this.r;
		this.a++;
		if (!this.l.E) {
			co co2 = new co(this);
			if (this.l.s instanceof avl && this.l.o(co2).v() != alv.ab) {
				this.l.a(co2, alv.ab.t());
			}
		}
	}

	@Override
	protected void b(du du) {
		if (this.j() != null) {
			du.a("BeamTarget", ee.a(this.j()));
		}

		du.a("ShowBottom", this.k());
	}

	@Override
	protected void a(du du) {
		if (du.b("BeamTarget", 10)) {
			this.a(ee.c(du.o("BeamTarget")));
		}

		if (du.b("ShowBottom", 1)) {
			this.a(du.p("ShowBottom"));
		}
	}

	@Override
	public boolean aq() {
		return true;
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else if (ry.j() instanceof yb) {
			return false;
		} else {
			if (!this.F && !this.l.E) {
				this.T();
				if (!this.l.E) {
					this.l.a(null, this.p, this.q, this.r, 6.0F, true);
					this.a(ry);
				}
			}

			return true;
		}
	}

	@Override
	public void Q() {
		this.a(ry.n);
		super.Q();
	}

	private void a(ry ry) {
		if (this.l.s instanceof avl) {
			avl avl3 = (avl)this.l.s;
			avk avk4 = avl3.t();
			if (avk4 != null) {
				avk4.a(this, ry);
			}
		}
	}

	public void a(@Nullable co co) {
		this.R().b(b, Optional.fromNullable(co));
	}

	@Nullable
	public co j() {
		return (co)this.R().a(b).orNull();
	}

	public void a(boolean boolean1) {
		this.R().b(c, boolean1);
	}

	public boolean k() {
		return this.R().a(c);
	}

	@Override
	public boolean a(double double1) {
		return super.a(double1) || this.j() != null;
	}
}
