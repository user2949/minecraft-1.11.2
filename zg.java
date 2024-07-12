import java.util.List;

public class zg extends zf {
	private int b;
	public long a;
	private int c;
	private final boolean d;

	public zg(ajs ajs, double double2, double double3, double double4, boolean boolean5) {
		super(ajs);
		this.b(double2, double3, double4, 0.0F, 0.0F);
		this.b = 2;
		this.a = this.S.nextLong();
		this.c = this.S.nextInt(3) + 1;
		this.d = boolean5;
		co co10 = new co(this);
		if (!boolean5 && !ajs.E && ajs.U().b("doFireTick") && (ajs.ae() == rg.NORMAL || ajs.ae() == rg.HARD) && ajs.a(co10, 10)) {
			if (ajs.o(co10).a() == azs.a && alv.ab.a(ajs, co10)) {
				ajs.a(co10, alv.ab.t());
			}

			for (int integer11 = 0; integer11 < 4; integer11++) {
				co co12 = co10.a(this.S.nextInt(3) - 1, this.S.nextInt(3) - 1, this.S.nextInt(3) - 1);
				if (ajs.o(co12).a() == azs.a && alv.ab.a(ajs, co12)) {
					ajs.a(co12, alv.ab.t());
				}
			}
		}
	}

	@Override
	public no bC() {
		return no.WEATHER;
	}

	@Override
	public void A_() {
		super.A_();
		if (this.b == 2) {
			this.l.a(null, this.p, this.q, this.r, nn.dx, no.WEATHER, 10000.0F, 0.8F + this.S.nextFloat() * 0.2F);
			this.l.a(null, this.p, this.q, this.r, nn.dw, no.WEATHER, 2.0F, 0.5F + this.S.nextFloat() * 0.2F);
		}

		this.b--;
		if (this.b < 0) {
			if (this.c == 0) {
				this.T();
			} else if (this.b < -this.S.nextInt(10)) {
				this.c--;
				this.b = 1;
				if (!this.d && !this.l.E) {
					this.a = this.S.nextLong();
					co co2 = new co(this);
					if (this.l.U().b("doFireTick") && this.l.a(co2, 10) && this.l.o(co2).a() == azs.a && alv.ab.a(this.l, co2)) {
						this.l.a(co2, alv.ab.t());
					}
				}
			}
		}

		if (this.b >= 0) {
			if (this.l.E) {
				this.l.d(2);
			} else if (!this.d) {
				double double2 = 3.0;
				List<sn> list4 = this.l.b(this, new bdt(this.p - 3.0, this.q - 3.0, this.r - 3.0, this.p + 3.0, this.q + 6.0 + 3.0, this.r + 3.0));

				for (int integer5 = 0; integer5 < list4.size(); integer5++) {
					sn sn6 = (sn)list4.get(integer5);
					sn6.a(this);
				}
			}
		}
	}

	@Override
	protected void i() {
	}

	@Override
	protected void a(du du) {
	}

	@Override
	protected void b(du du) {
	}
}
