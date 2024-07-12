public class alr extends alo {
	public alr() {
		super(azs.s, azt.G);
		this.c(3.0F);
		this.a(aej.f);
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asb();
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			asc asc11 = ajs.r(co);
			if (asc11 instanceof asb) {
				aay.a((rc)((asb)asc11));
				aay.b(oa.N);
			}

			return true;
		}
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		super.a(ajs, co, atl, sw, afj);
		if (afj.t()) {
			asc asc7 = ajs.r(co);
			if (asc7 instanceof asb) {
				((asb)asc7).a(afj.r());
			}
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		asc asc7 = ajs.r(co3);
		if (asc7 instanceof asb) {
			((asb)asc7).n();
			ajs.c(co3, this, 1, 0);
		}
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	public static void c(ajs ajs, co co) {
		ol.a.submit(new Runnable() {
			public void run() {
				auo auo2 = ajs.f(co);

				for (int integer3 = co.q() - 1; integer3 >= 0; integer3--) {
					final co co4 = new co(co.p(), integer3, co.r());
					if (!auo2.c(co4)) {
						break;
					}

					atl atl5 = ajs.o(co4);
					if (atl5.v() == alv.bY) {
						((lw)ajs).a(new Runnable() {
							public void run() {
								asc asc2 = ajs.r(co4);
								if (asc2 instanceof asb) {
									((asb)asc2).n();
									ajs.c(co4, alv.bY, 1, 0);
								}
							}
						});
					}
				}
			}
		});
	}
}
