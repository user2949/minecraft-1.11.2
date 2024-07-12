import java.util.Random;

public class awt extends awn {
	private final alu a;
	private final boolean b;

	public awt(alu alu, boolean boolean2) {
		this.a = alu;
		this.b = boolean2;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		if (ajs.o(co.a()).v() != alv.aV) {
			return false;
		} else if (ajs.o(co).a() != azs.a && ajs.o(co).v() != alv.aV) {
			return false;
		} else {
			int integer5 = 0;
			if (ajs.o(co.e()).v() == alv.aV) {
				integer5++;
			}

			if (ajs.o(co.f()).v() == alv.aV) {
				integer5++;
			}

			if (ajs.o(co.c()).v() == alv.aV) {
				integer5++;
			}

			if (ajs.o(co.d()).v() == alv.aV) {
				integer5++;
			}

			if (ajs.o(co.b()).v() == alv.aV) {
				integer5++;
			}

			int integer6 = 0;
			if (ajs.d(co.e())) {
				integer6++;
			}

			if (ajs.d(co.f())) {
				integer6++;
			}

			if (ajs.d(co.c())) {
				integer6++;
			}

			if (ajs.d(co.d())) {
				integer6++;
			}

			if (ajs.d(co.b())) {
				integer6++;
			}

			if (!this.b && integer5 == 4 && integer6 == 1 || integer5 == 5) {
				atl atl7 = this.a.t();
				ajs.a(co, atl7, 2);
				ajs.a(co, atl7, random);
			}

			return true;
		}
	}
}
