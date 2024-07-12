import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ayv extends ayn {
	private final int b = 80;
	private final int d = 20;
	public static final List<akf> a = Arrays.asList(akk.E, akk.ab);
	private final avx h;

	public ayv(avx avx) {
		this.h = avx;
	}

	@Override
	public String a() {
		return "Mansion";
	}

	@Override
	protected boolean a(int integer1, int integer2) {
		int integer4 = integer1;
		int integer5 = integer2;
		if (integer1 < 0) {
			integer4 = integer1 - 79;
		}

		if (integer2 < 0) {
			integer5 = integer2 - 79;
		}

		int integer6 = integer4 / 80;
		int integer7 = integer5 / 80;
		Random random8 = this.g.a(integer6, integer7, 10387319);
		integer6 *= 80;
		integer7 *= 80;
		integer6 += (random8.nextInt(60) + random8.nextInt(60)) / 2;
		integer7 += (random8.nextInt(60) + random8.nextInt(60)) / 2;
		if (integer1 == integer6 && integer2 == integer7) {
			boolean boolean9 = this.g.A().a(integer1 * 16 + 8, integer2 * 16 + 8, 32, a);
			if (boolean9) {
				return true;
			}
		}

		return false;
	}

	@Override
	public co a(ajs ajs, co co, boolean boolean3) {
		this.g = ajs;
		akj akj5 = ajs.A();
		return akj5.c() && akj5.d() != akk.E ? null : a(ajs, this, co, 80, 20, 10387319, true, 100, boolean3);
	}

	@Override
	protected ayr b(int integer1, int integer2) {
		return new ayv.a(this.g, this.h, this.f, integer1, integer2);
	}

	public static class a extends ayr {
		private boolean c;

		public a() {
		}

		public a(ajs ajs, avx avx, Random random, int integer4, int integer5) {
			super(integer4, integer5);
			this.a(ajs, avx, random, integer4, integer5);
		}

		private void a(ajs ajs, avx avx, Random random, int integer4, int integer5) {
			aqi aqi7 = aqi.values()[random.nextInt(aqi.values().length)];
			avp avp8 = new avp();
			avx.a(integer4, integer5, avp8);
			int integer9 = 5;
			int integer10 = 5;
			if (aqi7 == aqi.CLOCKWISE_90) {
				integer9 = -5;
			} else if (aqi7 == aqi.CLOCKWISE_180) {
				integer9 = -5;
				integer10 = -5;
			} else if (aqi7 == aqi.COUNTERCLOCKWISE_90) {
				integer10 = -5;
			}

			int integer11 = avp8.a(7, 7);
			int integer12 = avp8.a(7, 7 + integer10);
			int integer13 = avp8.a(7 + integer9, 7);
			int integer14 = avp8.a(7 + integer9, 7 + integer10);
			int integer15 = Math.min(Math.min(integer11, integer12), Math.min(integer13, integer14));
			if (integer15 < 60) {
				this.c = false;
			} else {
				co co16 = new co(integer4 * 16 + 8, integer15 + 1, integer5 * 16 + 8);
				List<ayw.i> list17 = Lists.newLinkedList();
				ayw.a(ajs.S().h(), co16, aqi7, list17, random);
				this.a.addAll(list17);
				this.d();
				this.c = true;
			}
		}

		@Override
		public void a(ajs ajs, Random random, axz axz) {
			super.a(ajs, random, axz);
			int integer5 = this.b.b;

			for (int integer6 = axz.a; integer6 <= axz.d; integer6++) {
				for (int integer7 = axz.c; integer7 <= axz.f; integer7++) {
					co co8 = new co(integer6, integer5, integer7);
					if (!ajs.d(co8) && this.b.b(co8)) {
						boolean boolean9 = false;

						for (ayq ayq11 : this.a) {
							if (ayq11.l.b(co8)) {
								boolean9 = true;
								break;
							}
						}

						if (boolean9) {
							for (int integer10 = integer5 - 1; integer10 > 1; integer10--) {
								co co11 = new co(integer6, integer10, integer7);
								if (!ajs.d(co11) && !ajs.o(co11).a().d()) {
									break;
								}

								ajs.a(co11, alv.e.t(), 2);
							}
						}
					}
				}
			}
		}

		@Override
		public boolean a() {
			return this.c;
		}
	}
}
