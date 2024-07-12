import java.util.Random;

public class awz extends axb {
	public awz(boolean boolean1, int integer2, int integer3, atl atl4, atl atl5) {
		super(boolean1, integer2, integer3, atl4, atl5);
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		int integer5 = this.a(random);
		if (!this.a(ajs, random, co, integer5)) {
			return false;
		} else {
			this.c(ajs, co.b(integer5), 2);

			for (int integer6 = co.q() + integer5 - 2 - random.nextInt(4); integer6 > co.q() + integer5 / 2; integer6 -= 2 + random.nextInt(4)) {
				float float7 = random.nextFloat() * (float) (Math.PI * 2);
				int integer8 = co.p() + (int)(0.5F + ot.b(float7) * 4.0F);
				int integer9 = co.r() + (int)(0.5F + ot.a(float7) * 4.0F);

				for (int integer10 = 0; integer10 < 5; integer10++) {
					integer8 = co.p() + (int)(1.5F + ot.b(float7) * (float)integer10);
					integer9 = co.r() + (int)(1.5F + ot.a(float7) * (float)integer10);
					this.a(ajs, new co(integer8, integer6 - 3 + integer10 / 2, integer9), this.b);
				}

				int integer10 = 1 + random.nextInt(2);
				int integer11 = integer6;

				for (int integer12 = integer6 - integer10; integer12 <= integer11; integer12++) {
					int integer13 = integer12 - integer11;
					this.b(ajs, new co(integer8, integer12, integer9), 1 - integer13);
				}
			}

			for (int integer7 = 0; integer7 < integer5; integer7++) {
				co co8 = co.b(integer7);
				if (this.a(ajs.o(co8).v())) {
					this.a(ajs, co8, this.b);
					if (integer7 > 0) {
						this.a(ajs, random, co8.e(), arp.c);
						this.a(ajs, random, co8.c(), arp.d);
					}
				}

				if (integer7 < integer5 - 1) {
					co co9 = co8.f();
					if (this.a(ajs.o(co9).v())) {
						this.a(ajs, co9, this.b);
						if (integer7 > 0) {
							this.a(ajs, random, co9.f(), arp.e);
							this.a(ajs, random, co9.c(), arp.d);
						}
					}

					co co10 = co8.d().f();
					if (this.a(ajs.o(co10).v())) {
						this.a(ajs, co10, this.b);
						if (integer7 > 0) {
							this.a(ajs, random, co10.f(), arp.e);
							this.a(ajs, random, co10.d(), arp.b);
						}
					}

					co co11 = co8.d();
					if (this.a(ajs.o(co11).v())) {
						this.a(ajs, co11, this.b);
						if (integer7 > 0) {
							this.a(ajs, random, co11.e(), arp.c);
							this.a(ajs, random, co11.d(), arp.b);
						}
					}
				}
			}

			return true;
		}
	}

	private void a(ajs ajs, Random random, co co, atx atx) {
		if (random.nextInt(3) > 0 && ajs.d(co)) {
			this.a(ajs, co, alv.bn.t().a(atx, true));
		}
	}

	private void c(ajs ajs, co co, int integer) {
		int integer5 = 2;

		for (int integer6 = -2; integer6 <= 0; integer6++) {
			this.a(ajs, co.b(integer6), integer + 1 - integer6);
		}
	}
}
