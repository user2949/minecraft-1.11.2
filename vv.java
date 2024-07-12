public class vv extends wc {
	private final boolean a;
	private int b;
	private final Class<?>[] c;

	public vv(te te, boolean boolean2, Class<?>... arr) {
		super(te, true);
		this.a = boolean2;
		this.c = arr;
		this.a(1);
	}

	@Override
	public boolean a() {
		int integer2 = this.e.bL();
		sw sw3 = this.e.bK();
		return integer2 != this.b && sw3 != null && this.a(sw3, false);
	}

	@Override
	public void c() {
		this.e.d(this.e.bK());
		this.g = this.e.z();
		this.b = this.e.bL();
		this.h = 300;
		if (this.a) {
			this.f();
		}

		super.c();
	}

	protected void f() {
		double double2 = this.i();

		for (te te6 : this.e.l.a(this.e.getClass(), new bdt(this.e.p, this.e.q, this.e.r, this.e.p + 1.0, this.e.q + 1.0, this.e.r + 1.0).c(double2, 10.0, double2))) {
			if (this.e != te6 && te6.z() == null && (!(this.e instanceof ti) || ((ti)this.e).dk() == ((ti)te6).dk()) && !te6.r(this.e.bK())) {
				boolean boolean7 = false;

				for (Class<?> class11 : this.c) {
					if (te6.getClass() == class11) {
						boolean7 = true;
						break;
					}
				}

				if (!boolean7) {
					this.a(te6, this.e.bK());
				}
			}
		}
	}

	protected void a(te te, sw sw) {
		te.d(sw);
	}
}
