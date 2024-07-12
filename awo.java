import java.util.Random;

public class awo extends awn {
	private ano a;
	private atl b;

	public awo(ano ano, ano.a a) {
		this.a(ano, a);
	}

	public void a(ano ano, ano.a a) {
		this.a = ano;
		this.b = ano.t().a(ano.g(), a);
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (int integer5 = 0; integer5 < 64; integer5++) {
			co co6 = co.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
			if (ajs.d(co6) && (!ajs.s.n() || co6.q() < 255) && this.a.f(ajs, co6, this.b)) {
				ajs.a(co6, this.b, 2);
			}
		}

		return true;
	}
}
