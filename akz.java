import java.util.Random;

public class akz extends akf {
	protected boolean y;

	protected akz(boolean boolean1, akf.a a) {
		super(a);
		this.y = boolean1;
		this.v.add(new akf.c(xo.class, 5, 2, 6));
		this.v.add(new akf.c(xn.class, 1, 1, 3));
		this.t.z = 0;
		this.t.A = 0.05F;
		this.t.B = 4;
		this.t.C = 10;
	}

	@Override
	public ano.a a(Random random, co co) {
		double double4 = l.a((double)co.p() / 200.0, (double)co.r() / 200.0);
		if (double4 < -0.8) {
			int integer6 = random.nextInt(4);
			switch (integer6) {
				case 0:
					return ano.a.ORANGE_TULIP;
				case 1:
					return ano.a.RED_TULIP;
				case 2:
					return ano.a.PINK_TULIP;
				case 3:
				default:
					return ano.a.WHITE_TULIP;
			}
		} else if (random.nextInt(3) > 0) {
			int integer6 = random.nextInt(3);
			if (integer6 == 0) {
				return ano.a.POPPY;
			} else {
				return integer6 == 1 ? ano.a.HOUSTONIA : ano.a.OXEYE_DAISY;
			}
		} else {
			return ano.a.DANDELION;
		}
	}

	@Override
	public void a(ajs ajs, Random random, co co) {
		double double5 = l.a((double)(co.p() + 8) / 200.0, (double)(co.r() + 8) / 200.0);
		if (double5 < -0.8) {
			this.t.B = 15;
			this.t.C = 5;
		} else {
			this.t.B = 4;
			this.t.C = 10;
			m.a(amy.b.GRASS);

			for (int integer7 = 0; integer7 < 7; integer7++) {
				int integer8 = random.nextInt(16) + 8;
				int integer9 = random.nextInt(16) + 8;
				int integer10 = random.nextInt(ajs.l(co.a(integer8, 0, integer9)).q() + 32);
				m.b(ajs, random, co.a(integer8, integer10, integer9));
			}
		}

		if (this.y) {
			m.a(amy.b.SUNFLOWER);

			for (int integer7 = 0; integer7 < 10; integer7++) {
				int integer8 = random.nextInt(16) + 8;
				int integer9 = random.nextInt(16) + 8;
				int integer10 = random.nextInt(ajs.l(co.a(integer8, 0, integer9)).q() + 32);
				m.b(ajs, random, co.a(integer8, integer10, integer9));
			}
		}

		super.a(ajs, random, co);
	}

	@Override
	public avz a(Random random) {
		return (avz)(random.nextInt(3) == 0 ? o : n);
	}
}
