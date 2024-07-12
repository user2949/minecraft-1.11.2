import javax.annotation.Nullable;

public abstract class wf {
	protected sx a;
	protected ajs b;
	@Nullable
	protected bbd c;
	protected double d;
	private final tk f;
	private int g;
	private int h;
	private bdw i = bdw.a;
	private bdw j = bdw.a;
	private long k;
	private long l;
	private double m;
	private float n = 0.5F;
	private boolean o;
	private long p;
	protected bbc e;
	private co q;
	private final bbe r;

	public wf(sx sx, ajs ajs) {
		this.a = sx;
		this.b = ajs;
		this.f = sx.a(aad.b);
		this.r = this.a();
	}

	protected abstract bbe a();

	public void a(double double1) {
		this.d = double1;
	}

	public float h() {
		return (float)this.f.e();
	}

	public boolean i() {
		return this.o;
	}

	public void j() {
		if (this.b.P() - this.p > 20L) {
			if (this.q != null) {
				this.c = null;
				this.c = this.a(this.q);
				this.p = this.b.P();
				this.o = false;
			}
		} else {
			this.o = true;
		}
	}

	@Nullable
	public final bbd a(double double1, double double2, double double3) {
		return this.a(new co(double1, double2, double3));
	}

	@Nullable
	public bbd a(co co) {
		if (!this.b()) {
			return null;
		} else if (this.c != null && !this.c.b() && co.equals(this.q)) {
			return this.c;
		} else {
			this.q = co;
			float float3 = this.h();
			this.b.C.a("pathfind");
			co co4 = new co(this.a);
			int integer5 = (int)(float3 + 8.0F);
			akb akb6 = new akb(this.b, co4.a(-integer5, -integer5, -integer5), co4.a(integer5, integer5, integer5), 0);
			bbd bbd7 = this.r.a(akb6, this.a, this.q, float3);
			this.b.C.b();
			return bbd7;
		}
	}

	@Nullable
	public bbd a(sn sn) {
		if (!this.b()) {
			return null;
		} else {
			co co3 = new co(sn);
			if (this.c != null && !this.c.b() && co3.equals(this.q)) {
				return this.c;
			} else {
				this.q = co3;
				float float4 = this.h();
				this.b.C.a("pathfind");
				co co5 = new co(this.a).a();
				int integer6 = (int)(float4 + 16.0F);
				akb akb7 = new akb(this.b, co5.a(-integer6, -integer6, -integer6), co5.a(integer6, integer6, integer6), 0);
				bbd bbd8 = this.r.a(akb7, this.a, sn, float4);
				this.b.C.b();
				return bbd8;
			}
		}
	}

	public boolean a(double double1, double double2, double double3, double double4) {
		return this.a(this.a(double1, double2, double3), double4);
	}

	public boolean a(sn sn, double double2) {
		bbd bbd5 = this.a(sn);
		return bbd5 != null && this.a(bbd5, double2);
	}

	public boolean a(@Nullable bbd bbd, double double2) {
		if (bbd == null) {
			this.c = null;
			return false;
		} else {
			if (!bbd.a(this.c)) {
				this.c = bbd;
			}

			this.d();
			if (this.c.d() == 0) {
				return false;
			} else {
				this.d = double2;
				bdw bdw5 = this.c();
				this.h = this.g;
				this.i = bdw5;
				return true;
			}
		}
	}

	@Nullable
	public bbd k() {
		return this.c;
	}

	public void l() {
		this.g++;
		if (this.o) {
			this.j();
		}

		if (!this.n()) {
			if (this.b()) {
				this.m();
			} else if (this.c != null && this.c.e() < this.c.d()) {
				bdw bdw2 = this.c();
				bdw bdw3 = this.c.a(this.a, this.c.e());
				if (bdw2.c > bdw3.c && !this.a.z && ot.c(bdw2.b) == ot.c(bdw3.b) && ot.c(bdw2.d) == ot.c(bdw3.d)) {
					this.c.c(this.c.e() + 1);
				}
			}

			if (!this.n()) {
				bdw bdw2 = this.c.a(this.a);
				if (bdw2 != null) {
					co co3 = new co(bdw2).b();
					bdt bdt4 = this.b.o(co3).d(this.b, co3);
					bdw2 = bdw2.a(0.0, 1.0 - bdt4.e, 0.0);
					this.a.u().a(bdw2.b, bdw2.c, bdw2.d, this.d);
				}
			}
		}
	}

	protected void m() {
		bdw bdw2 = this.c();
		int integer3 = this.c.d();

		for (int integer4 = this.c.e(); integer4 < this.c.d(); integer4++) {
			if ((double)this.c.a(integer4).b != Math.floor(bdw2.c)) {
				integer3 = integer4;
				break;
			}
		}

		this.n = this.a.G > 0.75F ? this.a.G / 2.0F : 0.75F - this.a.G / 2.0F;
		bdw bdw4 = this.c.f();
		if (ot.e((float)(this.a.p - (bdw4.b + 0.5))) < this.n && ot.e((float)(this.a.r - (bdw4.d + 0.5))) < this.n && Math.abs(this.a.q - bdw4.c) < 1.0) {
			this.c.c(this.c.e() + 1);
		}

		int integer5 = ot.f(this.a.G);
		int integer6 = ot.f(this.a.H);
		int integer7 = integer5;

		for (int integer8 = integer3 - 1; integer8 >= this.c.e(); integer8--) {
			if (this.a(bdw2, this.c.a(this.a, integer8), integer5, integer6, integer7)) {
				this.c.c(integer8);
				break;
			}
		}

		this.a(bdw2);
	}

	protected void a(bdw bdw) {
		if (this.g - this.h > 100) {
			if (bdw.g(this.i) < 2.25) {
				this.o();
			}

			this.h = this.g;
			this.i = bdw;
		}

		if (this.c != null && !this.c.b()) {
			bdw bdw3 = this.c.f();
			if (bdw3.equals(this.j)) {
				this.k = this.k + (System.currentTimeMillis() - this.l);
			} else {
				this.j = bdw3;
				double double4 = bdw.f(this.j);
				this.m = this.a.cq() > 0.0F ? double4 / (double)this.a.cq() * 1000.0 : 0.0;
			}

			if (this.m > 0.0 && (double)this.k > this.m * 3.0) {
				this.j = bdw.a;
				this.k = 0L;
				this.m = 0.0;
				this.o();
			}

			this.l = System.currentTimeMillis();
		}
	}

	public boolean n() {
		return this.c == null || this.c.b();
	}

	public void o() {
		this.c = null;
	}

	protected abstract bdw c();

	protected abstract boolean b();

	protected boolean p() {
		return this.a.aj() || this.a.ao();
	}

	protected void d() {
	}

	protected abstract boolean a(bdw bdw1, bdw bdw2, int integer3, int integer4, int integer5);

	public boolean b(co co) {
		return this.b.o(co.b()).b();
	}

	public bbc q() {
		return this.e;
	}
}
