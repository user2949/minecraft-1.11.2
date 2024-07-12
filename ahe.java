public class ahe {
	private final String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
	private final afh[][] b = new afh[][]{
		{afl.aN, afl.m, afl.l, afl.n},
		{afl.T, afl.ab, afl.af, afl.aj},
		{afl.U, afl.ac, afl.ag, afl.ak},
		{afl.V, afl.ad, afl.ah, afl.al},
		{afl.W, afl.ae, afl.ai, afl.am}
	};

	public void a(ahp ahp) {
		for (int integer3 = 0; integer3 < this.b[0].length; integer3++) {
			afh afh4 = this.b[0][integer3];

			for (int integer5 = 0; integer5 < this.b.length - 1; integer5++) {
				afh afh6 = this.b[integer5 + 1][integer3];
				ahp.a(new afj(afh6), this.a[integer5], 'X', afh4);
			}
		}
	}
}
