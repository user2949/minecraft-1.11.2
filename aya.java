import java.util.Random;

public class aya extends ayn {
	private final int a = 20;
	private final int b = 11;
	private final avy d;

	public aya(avy avy) {
		this.d = avy;
	}

	@Override
	public String a() {
		return "EndCity";
	}

	@Override
	protected boolean a(int integer1, int integer2) {
		int integer4 = integer1;
		int integer5 = integer2;
		if (integer1 < 0) {
			integer1 -= 19;
		}

		if (integer2 < 0) {
			integer2 -= 19;
		}

		int integer6 = integer1 / 20;
		int integer7 = integer2 / 20;
		Random random8 = this.g.a(integer6, integer7, 10387313);
		integer6 *= 20;
		integer7 *= 20;
		integer6 += (random8.nextInt(9) + random8.nextInt(9)) / 2;
		integer7 += (random8.nextInt(9) + random8.nextInt(9)) / 2;
		if (integer4 == integer6 && integer5 == integer7 && this.d.c(integer4, integer5)) {
			int integer9 = b(integer4, integer5, this.d);
			return integer9 >= 60;
		} else {
			return false;
		}
	}

	@Override
	protected ayr b(int integer1, int integer2) {
		return new aya.a(this.g, this.d, this.f, integer1, integer2);
	}

	@Override
	public co a(ajs ajs, co co, boolean boolean3) {
		this.g = ajs;
		return a(ajs, this, co, 20, 11, 10387313, true, 100, boolean3);
	}

	private static int b(int integer1, int integer2, avy avy) {
		Random random4 = new Random((long)(integer1 + integer2 * 10387313));
		aqi aqi5 = aqi.values()[random4.nextInt(aqi.values().length)];
		avp avp6 = new avp();
		avy.a(integer1, integer2, avp6);
		int integer7 = 5;
		int integer8 = 5;
		if (aqi5 == aqi.CLOCKWISE_90) {
			integer7 = -5;
		} else if (aqi5 == aqi.CLOCKWISE_180) {
			integer7 = -5;
			integer8 = -5;
		} else if (aqi5 == aqi.COUNTERCLOCKWISE_90) {
			integer8 = -5;
		}

		int integer9 = avp6.a(7, 7);
		int integer10 = avp6.a(7, 7 + integer8);
		int integer11 = avp6.a(7 + integer7, 7);
		int integer12 = avp6.a(7 + integer7, 7 + integer8);
		return Math.min(Math.min(integer9, integer10), Math.min(integer11, integer12));
	}

	public static class a extends ayr {
		private boolean c;

		public a() {
		}

		public a(ajs ajs, avy avy, Random random, int integer4, int integer5) {
			super(integer4, integer5);
			this.a(ajs, avy, random, integer4, integer5);
		}

		private void a(ajs ajs, avy avy, Random random, int integer4, int integer5) {
			Random random7 = new Random((long)(integer4 + integer5 * 10387313));
			aqi aqi8 = aqi.values()[random7.nextInt(aqi.values().length)];
			int integer9 = aya.b(integer4, integer5, avy);
			if (integer9 < 60) {
				this.c = false;
			} else {
				co co10 = new co(integer4 * 16 + 8, integer9, integer5 * 16 + 8);
				ayb.a(ajs.S().h(), co10, aqi8, this.a, random);
				this.d();
				this.c = true;
			}
		}

		@Override
		public boolean a() {
			return this.c;
		}
	}
}
