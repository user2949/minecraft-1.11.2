public class aip extends aii {
	public aip(aii.a a, ss... arr) {
		super(a, aij.ARMOR_FEET, arr);
		this.c("frostWalker");
	}

	@Override
	public int a(int integer) {
		return integer * 10;
	}

	@Override
	public int b(int integer) {
		return this.a(integer) + 15;
	}

	@Override
	public boolean c() {
		return true;
	}

	@Override
	public int b() {
		return 2;
	}

	public static void a(sw sw, ajs ajs, co co, int integer) {
		if (sw.z) {
			float float5 = (float)Math.min(16, 2 + integer);
			co.a a6 = new co.a(0, 0, 0);

			for (co.a a8 : co.b(co.a((double)(-float5), -1.0, (double)(-float5)), co.a((double)float5, -1.0, (double)float5))) {
				if (a8.g(sw.p, sw.q, sw.r) <= (double)(float5 * float5)) {
					a6.c(a8.p(), a8.q() + 1, a8.r());
					atl atl9 = ajs.o(a6);
					if (atl9.a() == azs.a) {
						atl atl10 = ajs.o(a8);
						if (atl10.a() == azs.h && (Integer)atl10.c(aoq.b) == 0 && ajs.a(alv.de, a8, false, cv.DOWN, null)) {
							ajs.a(a8, alv.de.t());
							ajs.a(a8.h(), alv.de, ot.a(sw.bJ(), 60, 120));
						}
					}
				}
			}
		}
	}

	@Override
	public boolean a(aii aii) {
		return super.a(aii) && aii != aim.i;
	}
}
