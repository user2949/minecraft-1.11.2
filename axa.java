import java.util.Random;

public class axa extends axb {
	private static final atl e = alv.r.t().a(apk.b, apn.a.SPRUCE);
	private static final atl f = alv.t.t().a(apj.e, apn.a.SPRUCE).a(aon.b, false);
	private static final atl g = alv.d.t().a(amv.a, amv.a.PODZOL);
	private final boolean h;

	public axa(boolean boolean1, boolean boolean2) {
		super(boolean1, 13, 15, e, f);
		this.h = boolean2;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		int integer5 = this.a(random);
		if (!this.a(ajs, random, co, integer5)) {
			return false;
		} else {
			this.a(ajs, co.p(), co.r(), co.q() + integer5, 0, random);

			for (int integer6 = 0; integer6 < integer5; integer6++) {
				atl atl7 = ajs.o(co.b(integer6));
				if (atl7.a() == azs.a || atl7.a() == azs.j) {
					this.a(ajs, co.b(integer6), this.b);
				}

				if (integer6 < integer5 - 1) {
					atl7 = ajs.o(co.a(1, integer6, 0));
					if (atl7.a() == azs.a || atl7.a() == azs.j) {
						this.a(ajs, co.a(1, integer6, 0), this.b);
					}

					atl7 = ajs.o(co.a(1, integer6, 1));
					if (atl7.a() == azs.a || atl7.a() == azs.j) {
						this.a(ajs, co.a(1, integer6, 1), this.b);
					}

					atl7 = ajs.o(co.a(0, integer6, 1));
					if (atl7.a() == azs.a || atl7.a() == azs.j) {
						this.a(ajs, co.a(0, integer6, 1), this.b);
					}
				}
			}

			return true;
		}
	}

	private void a(ajs ajs, int integer2, int integer3, int integer4, int integer5, Random random) {
		int integer8 = random.nextInt(5) + (this.h ? this.a : 3);
		int integer9 = 0;

		for (int integer10 = integer4 - integer8; integer10 <= integer4; integer10++) {
			int integer11 = integer4 - integer10;
			int integer12 = integer5 + ot.d((float)integer11 / (float)integer8 * 3.5F);
			this.a(ajs, new co(integer2, integer10, integer3), integer12 + (integer11 > 0 && integer12 == integer9 && (integer10 & 1) == 0 ? 1 : 0));
			integer9 = integer12;
		}
	}

	@Override
	public void a(ajs ajs, Random random, co co) {
		this.b(ajs, co.e().c());
		this.b(ajs, co.g(2).c());
		this.b(ajs, co.e().e(2));
		this.b(ajs, co.g(2).e(2));

		for (int integer5 = 0; integer5 < 5; integer5++) {
			int integer6 = random.nextInt(64);
			int integer7 = integer6 % 8;
			int integer8 = integer6 / 8;
			if (integer7 == 0 || integer7 == 7 || integer8 == 0 || integer8 == 7) {
				this.b(ajs, co.a(-3 + integer7, 0, -3 + integer8));
			}
		}
	}

	private void b(ajs ajs, co co) {
		for (int integer4 = -2; integer4 <= 2; integer4++) {
			for (int integer5 = -2; integer5 <= 2; integer5++) {
				if (Math.abs(integer4) != 2 || Math.abs(integer5) != 2) {
					this.c(ajs, co.a(integer4, 0, integer5));
				}
			}
		}
	}

	private void c(ajs ajs, co co) {
		for (int integer4 = 2; integer4 >= -3; integer4--) {
			co co5 = co.b(integer4);
			atl atl6 = ajs.o(co5);
			alu alu7 = atl6.v();
			if (alu7 == alv.c || alu7 == alv.d) {
				this.a(ajs, co5, g);
				break;
			}

			if (atl6.a() != azs.a && integer4 < 0) {
				break;
			}
		}
	}
}
