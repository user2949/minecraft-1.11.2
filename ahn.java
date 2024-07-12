public class ahn {
	private final Object[][] a = new Object[][]{
		{alv.R, new afj(afl.n, 9)},
		{alv.S, new afj(afl.m, 9)},
		{alv.ah, new afj(afl.l, 9)},
		{alv.bT, new afj(afl.bZ, 9)},
		{alv.y, new afj(afl.be, 9, aem.BLUE.b())},
		{alv.cn, new afj(afl.aF, 9)},
		{alv.cA, new afj(afl.k, 9, 0)},
		{alv.cx, new afj(afl.R, 9)},
		{alv.cE, new afj(afl.aU, 9)}
	};

	public void a(ahp ahp) {
		for (Object[] arr6 : this.a) {
			alu alu7 = (alu)arr6[0];
			afj afj8 = (afj)arr6[1];
			ahp.a(new afj(alu7), "###", "###", "###", '#', afj8);
			ahp.a(afj8, "#", '#', alu7);
		}

		ahp.a(new afj(afl.n), "###", "###", "###", '#', afl.bF);
		ahp.a(new afj(afl.bF, 9), "#", '#', afl.n);
		ahp.a(new afj(afl.m), "###", "###", "###", '#', afl.da);
		ahp.a(new afj(afl.da, 9), "#", '#', afl.m);
	}
}
