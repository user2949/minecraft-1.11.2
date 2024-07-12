import java.util.Random;

public class akn extends akf {
	private final awn y = new axe(alv.be.t().a(aow.a, aow.a.STONE), 9);
	private final axn z = new axn(false);
	private final akn.a A;

	protected akn(akn.a a, akf.a a) {
		super(a);
		if (a == akn.a.EXTRA_TREES) {
			this.t.z = 3;
		}

		this.v.add(new akf.c(xq.class, 5, 4, 6));
		this.A = a;
	}

	@Override
	public avz a(Random random) {
		return (avz)(random.nextInt(3) > 0 ? this.z : super.a(random));
	}

	@Override
	public void a(ajs ajs, Random random, co co) {
		super.a(ajs, random, co);
		int integer5 = 3 + random.nextInt(6);

		for (int integer6 = 0; integer6 < integer5; integer6++) {
			int integer7 = random.nextInt(16);
			int integer8 = random.nextInt(28) + 4;
			int integer9 = random.nextInt(16);
			co co10 = co.a(integer7, integer8, integer9);
			if (ajs.o(co10).v() == alv.b) {
				ajs.a(co10, alv.bP.t(), 2);
			}
		}

		for (int integer5x = 0; integer5x < 7; integer5x++) {
			int integer6x = random.nextInt(16);
			int integer7 = random.nextInt(64);
			int integer8 = random.nextInt(16);
			this.y.b(ajs, random, co.a(integer6x, integer7, integer8));
		}
	}

	@Override
	public void a(ajs ajs, Random random, avp avp, int integer4, int integer5, double double6) {
		this.r = alv.c.t();
		this.s = alv.d.t();
		if ((double6 < -1.0 || double6 > 2.0) && this.A == akn.a.MUTATED) {
			this.r = alv.n.t();
			this.s = alv.n.t();
		} else if (double6 > 1.0 && this.A != akn.a.EXTRA_TREES) {
			this.r = alv.b.t();
			this.s = alv.b.t();
		}

		this.b(ajs, random, avp, integer4, integer5, double6);
	}

	public static enum a {
		NORMAL,
		EXTRA_TREES,
		MUTATED;
	}
}
