public class vh extends ui {
	private final zm a;
	private final double b;
	private int c;
	private final float d;
	private int e = -1;
	private int f;
	private boolean g;
	private boolean h;
	private int i = -1;

	public vh(zm zm, double double2, int integer, float float4) {
		this.a = zm;
		this.b = double2;
		this.c = integer;
		this.d = float4 * float4;
		this.a(3);
	}

	public void b(int integer) {
		this.c = integer;
	}

	@Override
	public boolean a() {
		return this.a.z() == null ? false : this.f();
	}

	protected boolean f() {
		return !this.a.cg().b() && this.a.cg().c() == afl.g;
	}

	@Override
	public boolean b() {
		return (this.a() || !this.a.x().n()) && this.f();
	}

	@Override
	public void c() {
		super.c();
		this.a.a(true);
	}

	@Override
	public void d() {
		super.d();
		this.a.a(false);
		this.f = 0;
		this.e = -1;
		this.a.cF();
	}

	@Override
	public void e() {
		sw sw2 = this.a.z();
		if (sw2 != null) {
			double double3 = this.a.d(sw2.p, sw2.bo().b, sw2.r);
			boolean boolean5 = this.a.y().a(sw2);
			boolean boolean6 = this.f > 0;
			if (boolean5 != boolean6) {
				this.f = 0;
			}

			if (boolean5) {
				this.f++;
			} else {
				this.f--;
			}

			if (!(double3 > (double)this.d) && this.f >= 20) {
				this.a.x().o();
				this.i++;
			} else {
				this.a.x().a(sw2, this.b);
				this.i = -1;
			}

			if (this.i >= 20) {
				if ((double)this.a.bJ().nextFloat() < 0.3) {
					this.g = !this.g;
				}

				if ((double)this.a.bJ().nextFloat() < 0.3) {
					this.h = !this.h;
				}

				this.i = 0;
			}

			if (this.i > -1) {
				if (double3 > (double)(this.d * 0.75F)) {
					this.h = false;
				} else if (double3 < (double)(this.d * 0.25F)) {
					this.h = true;
				}

				this.a.u().a(this.h ? -0.5F : 0.5F, this.g ? 0.5F : -0.5F);
				this.a.a(sw2, 30.0F, 30.0F);
			} else {
				this.a.t().a(sw2, 30.0F, 30.0F);
			}

			if (this.a.cy()) {
				if (!boolean5 && this.f < -60) {
					this.a.cF();
				} else if (boolean5) {
					int integer7 = this.a.cD();
					if (integer7 >= 20) {
						this.a.cF();
						this.a.a(sw2, aea.b(integer7));
						this.e = this.c;
					}
				}
			} else if (--this.e <= 0 && this.f >= -60) {
				this.a.c(ri.MAIN_HAND);
			}
		}
	}
}
