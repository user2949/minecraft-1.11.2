public class ahy {
	private final String[][] a = new String[][]{{"X", "X", "#"}};
	private final Object[][] b = new Object[][]{{alv.f, alv.e, afl.m, afl.l, afl.n}, {afl.p, afl.t, afl.o, afl.x, afl.E}};

	public void a(ahp ahp) {
		for (int integer3 = 0; integer3 < this.b[0].length; integer3++) {
			Object object4 = this.b[0][integer3];

			for (int integer5 = 0; integer5 < this.b.length - 1; integer5++) {
				afh afh6 = (afh)this.b[integer5 + 1][integer3];
				ahp.a(new afj(afh6), this.a[integer5], '#', afl.B, 'X', object4);
			}
		}

		ahp.a(new afj(afl.g, 1), " #X", "# X", " #X", 'X', afl.I, '#', afl.B);
		ahp.a(new afj(afl.h, 4), "X", "#", "Y", 'Y', afl.J, 'X', afl.an, '#', afl.B);
		ahp.a(new afj(afl.i, 2), " # ", "#X#", " # ", 'X', afl.h, '#', afl.bb);
	}
}
