import javax.annotation.Nullable;

public class bfb {
	private final cy<bfa> a = new cy<>(32);

	public static bfb a() {
		final bfb bfb1 = new bfb();
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				amy.b b6 = atl.c(amy.a);
				return ajw != null && co != null && (b6 == amy.b.GRASS || b6 == amy.b.FERN) ? akh.a(ajw, atl.c(amy.c) == amy.a.UPPER ? co.b() : co) : -1;
			}
		}, alv.cF);
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				if (ajw != null && co != null) {
					asc asc6 = ajw.r(co);
					if (asc6 instanceof asm) {
						afh afh7 = ((asm)asc6).e();
						atl atl8 = alu.a(afh7).t();
						return bfb1.a(atl8, ajw, co, integer);
					} else {
						return -1;
					}
				} else {
					return -1;
				}
			}
		}, alv.ca);
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				return ajw != null && co != null ? akh.a(ajw, co) : ajr.a(0.5, 1.0);
			}
		}, alv.c);
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				apn.a a6 = atl.c(apj.e);
				if (a6 == apn.a.SPRUCE) {
					return ajo.a();
				} else if (a6 == apn.a.BIRCH) {
					return ajo.b();
				} else {
					return ajw != null && co != null ? akh.b(ajw, co) : ajo.c();
				}
			}
		}, alv.t);
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				return ajw != null && co != null ? akh.b(ajw, co) : ajo.c();
			}
		}, alv.u);
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				return ajw != null && co != null ? akh.c(ajw, co) : -1;
			}
		}, alv.j, alv.i);
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				return aqb.e((Integer)atl.c(aqb.e));
			}
		}, alv.af);
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				return ajw != null && co != null ? akh.a(ajw, co) : -1;
			}
		}, alv.aM);
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				int integer6 = (Integer)atl.c(arb.a);
				int integer7 = integer6 * 32;
				int integer8 = 255 - integer6 * 8;
				int integer9 = integer6 * 4;
				return integer7 << 16 | integer8 << 8 | integer9;
			}
		}, alv.bm, alv.bl);
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				if (ajw != null && co != null) {
					return akh.a(ajw, co);
				} else {
					return atl.c(ari.a) == ari.a.DEAD_BUSH ? 16777215 : ajr.a(0.5, 1.0);
				}
			}
		}, alv.H);
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				return ajw != null && co != null ? akh.b(ajw, co) : ajo.c();
			}
		}, alv.bn);
		bfb1.a(new bfa() {
			@Override
			public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
				return ajw != null && co != null ? 2129968 : 7455580;
			}
		}, alv.bx);
		return bfb1;
	}

	public int a(atl atl) {
		bfa bfa3 = this.a.a(alu.a(atl.v()));
		if (bfa3 != null) {
			return bfa3.a(atl, null, null, 0);
		} else {
			azt azt4 = atl.g();
			return azt4 != null ? azt4.L : -1;
		}
	}

	public int a(atl atl, @Nullable ajw ajw, @Nullable co co, int integer) {
		bfa bfa6 = this.a.a(alu.a(atl.v()));
		return bfa6 == null ? -1 : bfa6.a(atl, ajw, co, integer);
	}

	public void a(bfa bfa, alu... arr) {
		for (alu alu7 : arr) {
			this.a.a(bfa, alu.a(alu7));
		}
	}
}
