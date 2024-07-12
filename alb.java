import java.util.Random;

public class alb extends akf {
	private static final axk y = new axk(false);

	protected alb(akf.a a) {
		super(a);
		this.v.add(new akf.c(xo.class, 1, 2, 6));
		this.v.add(new akf.c(xn.class, 1, 1, 1));
		if (this.j() > 1.1F) {
			this.v.add(new akf.c(xq.class, 8, 4, 4));
		}

		this.t.z = 1;
		this.t.B = 4;
		this.t.C = 20;
	}

	@Override
	public avz a(Random random) {
		return (avz)(random.nextInt(5) > 0 ? y : n);
	}

	@Override
	public void a(ajs ajs, Random random, co co) {
		m.a(amy.b.GRASS);

		for (int integer5 = 0; integer5 < 7; integer5++) {
			int integer6 = random.nextInt(16) + 8;
			int integer7 = random.nextInt(16) + 8;
			int integer8 = random.nextInt(ajs.l(co.a(integer6, 0, integer7)).q() + 32);
			m.b(ajs, random, co.a(integer6, integer8, integer7));
		}

		super.a(ajs, random, co);
	}

	@Override
	public Class<? extends akf> g() {
		return alb.class;
	}
}
