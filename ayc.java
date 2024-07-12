import java.util.Map;
import java.util.Map.Entry;

public class ayc extends ayn {
	private double a = 0.004;

	public ayc() {
	}

	@Override
	public String a() {
		return "Mineshaft";
	}

	public ayc(Map<String, String> map) {
		for (Entry<String, String> entry4 : map.entrySet()) {
			if (((String)entry4.getKey()).equals("chance")) {
				this.a = ot.a((String)entry4.getValue(), this.a);
			}
		}
	}

	@Override
	protected boolean a(int integer1, int integer2) {
		return this.f.nextDouble() < this.a && this.f.nextInt(80) < Math.max(Math.abs(integer1), Math.abs(integer2));
	}

	@Override
	public co a(ajs ajs, co co, boolean boolean3) {
		int integer5 = 1000;
		int integer6 = co.p() >> 4;
		int integer7 = co.r() >> 4;

		for (int integer8 = 0; integer8 <= 1000; integer8++) {
			for (int integer9 = -integer8; integer9 <= integer8; integer9++) {
				boolean boolean10 = integer9 == -integer8 || integer9 == integer8;

				for (int integer11 = -integer8; integer11 <= integer8; integer11++) {
					boolean boolean12 = integer11 == -integer8 || integer11 == integer8;
					if (boolean10 || boolean12) {
						int integer13 = integer6 + integer9;
						int integer14 = integer7 + integer11;
						this.f.setSeed((long)(integer13 ^ integer14) ^ ajs.O());
						this.f.nextInt();
						if (this.a(integer13, integer14) && (!boolean3 || !ajs.b(integer13, integer14))) {
							return new co((integer13 << 4) + 8, 64, (integer14 << 4) + 8);
						}
					}
				}
			}
		}

		return null;
	}

	@Override
	protected ayr b(int integer1, int integer2) {
		akf akf4 = this.g.b(new co((integer1 << 4) + 8, 64, (integer2 << 4) + 8));
		ayc.a a5 = akf4 instanceof aku ? ayc.a.MESA : ayc.a.NORMAL;
		return new aye(this.g, this.f, integer1, integer2, a5);
	}

	public static enum a {
		NORMAL,
		MESA;

		public static ayc.a a(int integer) {
			return integer >= 0 && integer < values().length ? values()[integer] : NORMAL;
		}
	}
}
