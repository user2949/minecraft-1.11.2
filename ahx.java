public class ahx {
	private final String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
	private final Object[][] b = new Object[][]{
		{alv.f, alv.e, afl.m, afl.l, afl.n},
		{afl.r, afl.v, afl.c, afl.z, afl.G},
		{afl.q, afl.u, afl.b, afl.y, afl.F},
		{afl.s, afl.w, afl.d, afl.A, afl.H},
		{afl.L, afl.M, afl.N, afl.O, afl.P}
	};

	public void a(ahp ahp) {
		for (int integer3 = 0; integer3 < this.b[0].length; integer3++) {
			Object object4 = this.b[0][integer3];

			for (int integer5 = 0; integer5 < this.b.length - 1; integer5++) {
				afh afh6 = (afh)this.b[integer5 + 1][integer3];
				ahp.a(new afj(afh6), this.a[integer5], '#', afl.B, 'X', object4);
			}
		}

		ahp.a(new afj(afl.bm), " #", "# ", '#', afl.m);
	}
}
