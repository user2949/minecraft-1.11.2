import java.util.Random;

public class awd extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (atl atl5 = ajs.o(co); (atl5.a() == azs.a || atl5.a() == azs.j) && co.q() > 1; atl5 = ajs.o(co)) {
			co = co.b();
		}

		if (co.q() < 1) {
			return false;
		} else {
			co = co.a();

			for (int integer6 = 0; integer6 < 4; integer6++) {
				co co7 = co.a(random.nextInt(4) - random.nextInt(4), random.nextInt(3) - random.nextInt(3), random.nextInt(4) - random.nextInt(4));
				if (ajs.d(co7) && ajs.o(co7.b()).r()) {
					ajs.a(co7, alv.ae.t(), 2);
					asc asc8 = ajs.r(co7);
					if (asc8 instanceof ase) {
						((ase)asc8).a(bcf.b, random.nextLong());
					}

					co co9 = co7.f();
					co co10 = co7.e();
					co co11 = co7.c();
					co co12 = co7.d();
					if (ajs.d(co10) && ajs.o(co10.b()).r()) {
						ajs.a(co10, alv.aa.t(), 2);
					}

					if (ajs.d(co9) && ajs.o(co9.b()).r()) {
						ajs.a(co9, alv.aa.t(), 2);
					}

					if (ajs.d(co11) && ajs.o(co11.b()).r()) {
						ajs.a(co11, alv.aa.t(), 2);
					}

					if (ajs.d(co12) && ajs.o(co12.b()).r()) {
						ajs.a(co12, alv.aa.t(), 2);
					}

					return true;
				}
			}

			return false;
		}
	}
}
