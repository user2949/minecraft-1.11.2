public class btx implements btt.a {
	private final bes a;
	private aay b;
	private double c;
	private double d;
	private double e;

	public btx(bes bes) {
		this.a = bes;
	}

	@Override
	public void a(float float1, long long2) {
		this.b = this.a.h;
		this.c = this.b.M + (this.b.p - this.b.M) * (double)float1;
		this.d = this.b.N + (this.b.q - this.b.N) * (double)float1;
		this.e = this.b.O + (this.b.r - this.b.O) * (double)float1;
		co co5 = this.a.h.c();
		ajs ajs6 = this.a.h.l;
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.c(0.0F, 1.0F, 0.0F, 0.75F);
		bqg.z();
		bqg.d(6.0F);

		for (co co9 : co.a(co5.a(-10, -10, -10), co5.a(10, 10, 10))) {
			atl atl10 = ajs6.o(co9);
			if (atl10.v() == alv.j || atl10.v() == alv.i) {
				double double11 = (double)aoq.g(atl10, ajs6, co9);
				bqm.b(
					new bdt(
							(double)((float)co9.p() + 0.01F),
							(double)((float)co9.q() + 0.01F),
							(double)((float)co9.r() + 0.01F),
							(double)((float)co9.p() + 0.99F),
							double11,
							(double)((float)co9.r() + 0.99F)
						)
						.d(-this.c, -this.d, -this.e),
					1.0F,
					1.0F,
					1.0F,
					0.2F
				);
			}
		}

		for (co co9x : co.a(co5.a(-10, -10, -10), co5.a(10, 10, 10))) {
			atl atl10 = ajs6.o(co9x);
			if (atl10.v() == alv.j || atl10.v() == alv.i) {
				Integer integer11 = atl10.c(aoq.b);
				double double12 = integer11 > 7 ? 0.9 : 1.0 - 0.11 * (double)integer11.intValue();
				String string14 = atl10.v() == alv.i ? "f" : "s";
				btt.a(string14 + " " + integer11, (double)co9x.p() + 0.5, (double)co9x.q() + double12, (double)co9x.r() + 0.5, float1, -16777216);
			}
		}

		bqg.y();
		bqg.l();
	}
}
