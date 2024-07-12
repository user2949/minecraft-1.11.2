import java.util.Random;

public class ale extends akf {
	private static final axf y = new axf();
	private static final axn z = new axn(false);
	private static final axa A = new axa(false, false);
	private static final axa B = new axa(false, true);
	private static final awc C = new awc(alv.Y, 0);
	private final ale.a D;

	public ale(ale.a a, akf.a a) {
		super(a);
		this.D = a;
		this.v.add(new akf.c(xk.class, 8, 4, 4));
		this.v.add(new akf.c(xe.class, 4, 2, 3));
		this.t.z = 10;
		if (a != ale.a.MEGA && a != ale.a.MEGA_SPRUCE) {
			this.t.C = 1;
			this.t.E = 1;
		} else {
			this.t.C = 7;
			this.t.D = 1;
			this.t.E = 3;
		}
	}

	@Override
	public avz a(Random random) {
		if ((this.D == ale.a.MEGA || this.D == ale.a.MEGA_SPRUCE) && random.nextInt(3) == 0) {
			return this.D != ale.a.MEGA_SPRUCE && random.nextInt(13) != 0 ? A : B;
		} else {
			return (avz)(random.nextInt(3) == 0 ? y : z);
		}
	}

	@Override
	public awn b(Random random) {
		return random.nextInt(5) > 0 ? new axp(ari.a.FERN) : new axp(ari.a.GRASS);
	}

	@Override
	public void a(ajs ajs, Random random, co co) {
		if (this.D == ale.a.MEGA || this.D == ale.a.MEGA_SPRUCE) {
			int integer5 = random.nextInt(3);

			for (int integer6 = 0; integer6 < integer5; integer6++) {
				int integer7 = random.nextInt(16) + 8;
				int integer8 = random.nextInt(16) + 8;
				co co9 = ajs.l(co.a(integer7, 0, integer8));
				C.b(ajs, random, co9);
			}
		}

		m.a(amy.b.FERN);

		for (int integer5 = 0; integer5 < 7; integer5++) {
			int integer6 = random.nextInt(16) + 8;
			int integer7 = random.nextInt(16) + 8;
			int integer8 = random.nextInt(ajs.l(co.a(integer6, 0, integer7)).q() + 32);
			m.b(ajs, random, co.a(integer6, integer8, integer7));
		}

		super.a(ajs, random, co);
	}

	@Override
	public void a(ajs ajs, Random random, avp avp, int integer4, int integer5, double double6) {
		if (this.D == ale.a.MEGA || this.D == ale.a.MEGA_SPRUCE) {
			this.r = alv.c.t();
			this.s = alv.d.t();
			if (double6 > 1.75) {
				this.r = alv.d.t().a(amv.a, amv.a.COARSE_DIRT);
			} else if (double6 > -0.95) {
				this.r = alv.d.t().a(amv.a, amv.a.PODZOL);
			}
		}

		this.b(ajs, random, avp, integer4, integer5, double6);
	}

	public static enum a {
		NORMAL,
		MEGA,
		MEGA_SPRUCE;
	}
}
