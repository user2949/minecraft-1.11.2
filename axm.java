import java.util.Random;

public class axm extends awn {
	private final alu a;

	public axm(alu alu) {
		this.a = alu;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		if (ajs.o(co.a()).v() != alv.b) {
			return false;
		} else if (ajs.o(co.b()).v() != alv.b) {
			return false;
		} else {
			atl atl5 = ajs.o(co);
			if (atl5.a() != azs.a && atl5.v() != alv.b) {
				return false;
			} else {
				int integer6 = 0;
				if (ajs.o(co.e()).v() == alv.b) {
					integer6++;
				}

				if (ajs.o(co.f()).v() == alv.b) {
					integer6++;
				}

				if (ajs.o(co.c()).v() == alv.b) {
					integer6++;
				}

				if (ajs.o(co.d()).v() == alv.b) {
					integer6++;
				}

				int integer7 = 0;
				if (ajs.d(co.e())) {
					integer7++;
				}

				if (ajs.d(co.f())) {
					integer7++;
				}

				if (ajs.d(co.c())) {
					integer7++;
				}

				if (ajs.d(co.d())) {
					integer7++;
				}

				if (integer6 == 3 && integer7 == 1) {
					atl atl8 = this.a.t();
					ajs.a(co, atl8, 2);
					ajs.a(co, atl8, random);
				}

				return true;
			}
		}
	}
}
