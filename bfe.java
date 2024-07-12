public class bfe {
	private final cy<bfd> a = new cy<>(32);

	public static bfe a(bfb bfb) {
		bfe bfe2 = new bfe();
		bfe2.a(new bfd() {
			@Override
			public int a(afj afj, int integer) {
				return integer > 0 ? -1 : ((adp)afj.c()).c(afj);
			}
		}, afl.T, afl.U, afl.V, afl.W);
		bfe2.a(new bfd() {
			@Override
			public int a(afj afj, int integer) {
				amy.b b4 = amy.b.a(afj.j());
				return b4 != amy.b.GRASS && b4 != amy.b.FERN ? -1 : ajr.a(0.5, 1.0);
			}
		}, alv.cF);
		bfe2.a(new bfd() {
			@Override
			public int a(afj afj, int integer) {
				if (integer != 1) {
					return -1;
				} else {
					ei ei4 = aey.a(afj, "Colors");
					if (!(ei4 instanceof dy)) {
						return 9079434;
					} else {
						int[] arr5 = ((dy)ei4).d();
						if (arr5.length == 1) {
							return arr5[0];
						} else {
							int integer6 = 0;
							int integer7 = 0;
							int integer8 = 0;

							for (int integer12 : arr5) {
								integer6 += (integer12 & 0xFF0000) >> 16;
								integer7 += (integer12 & 0xFF00) >> 8;
								integer8 += (integer12 & 0xFF) >> 0;
							}

							integer6 /= arr5.length;
							integer7 /= arr5.length;
							integer8 /= arr5.length;
							return integer6 << 16 | integer7 << 8 | integer8;
						}
					}
				}
			}
		}, afl.cn);
		bfe2.a(new bfd() {
			@Override
			public int a(afj afj, int integer) {
				return integer > 0 ? -1 : aha.c(afj);
			}
		}, afl.bH, afl.bI, afl.bJ);
		bfe2.a(new bfd() {
			@Override
			public int a(afj afj, int integer) {
				sp.a a4 = (sp.a)sp.c.get(ago.h(afj));
				if (a4 == null) {
					return -1;
				} else {
					return integer == 0 ? a4.b : a4.c;
				}
			}
		}, afl.bU);
		bfe2.a(new bfd() {
			@Override
			public int a(afj afj, int integer) {
				atl atl4 = ((adv)afj.c()).d().a(afj.j());
				return bfb.a(atl4, null, null, integer);
			}
		}, alv.c, alv.H, alv.bn, alv.t, alv.u, alv.bx);
		bfe2.a(new bfd() {
			@Override
			public int a(afj afj, int integer) {
				return integer == 0 ? aha.c(afj) : -1;
			}
		}, afl.j);
		bfe2.a(new bfd() {
			@Override
			public int a(afj afj, int integer) {
				return integer == 0 ? -1 : afp.h(afj);
			}
		}, afl.bl);
		return bfe2;
	}

	public int a(afj afj, int integer) {
		bfd bfd4 = this.a.a(afh.g.a(afj.c()));
		return bfd4 == null ? -1 : bfd4.a(afj, integer);
	}

	public void a(bfd bfd, alu... arr) {
		for (alu alu7 : arr) {
			this.a.a(bfd, afh.a(afh.a(alu7)));
		}
	}

	public void a(bfd bfd, afh... arr) {
		for (afh afh7 : arr) {
			this.a.a(bfd, afh.a(afh7));
		}
	}
}
