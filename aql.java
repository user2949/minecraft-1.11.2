import java.util.Random;

public class aql extends ama implements alx {
	public static final atz<apn.a> a = atz.a("type", apn.a.class);
	public static final aua c = aua.a("stage", 0, 1);
	protected static final bdt d = new bdt(0.099999994F, 0.0, 0.099999994F, 0.9F, 0.8F, 0.9F);

	protected aql() {
		this.y(this.A.b().a(a, apn.a.OAK).a(c, 0));
		this.a(aej.c);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return d;
	}

	@Override
	public String c() {
		return dp.a(this.a() + "." + apn.a.OAK.d() + ".name");
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E) {
			super.b(ajs, co, atl, random);
			if (ajs.k(co.a()) >= 9 && random.nextInt(7) == 0) {
				this.c(ajs, co, atl, random);
			}
		}
	}

	public void c(ajs ajs, co co, atl atl, Random random) {
		if ((Integer)atl.c(c) == 0) {
			ajs.a(co, atl.a(c), 4);
		} else {
			this.d(ajs, co, atl, random);
		}
	}

	public void d(ajs ajs, co co, atl atl, Random random) {
		awn awn6 = (awn)(random.nextInt(10) == 0 ? new awa(true) : new axq(true));
		int integer7 = 0;
		int integer8 = 0;
		boolean boolean9 = false;
		switch ((apn.a)atl.c(a)) {
			case SPRUCE:
				label68:
				for (integer7 = 0; integer7 >= -1; integer7--) {
					for (integer8 = 0; integer8 >= -1; integer8--) {
						if (this.a(ajs, co, integer7, integer8, apn.a.SPRUCE)) {
							awn6 = new axa(false, random.nextBoolean());
							boolean9 = true;
							break label68;
						}
					}
				}

				if (!boolean9) {
					integer7 = 0;
					integer8 = 0;
					awn6 = new axn(true);
				}
				break;
			case BIRCH:
				awn6 = new awb(true, false);
				break;
			case JUNGLE:
				atl atl10 = alv.r.t().a(apk.b, apn.a.JUNGLE);
				atl atl11 = alv.t.t().a(apj.e, apn.a.JUNGLE).a(aon.b, false);

				label82:
				for (integer7 = 0; integer7 >= -1; integer7--) {
					for (integer8 = 0; integer8 >= -1; integer8--) {
						if (this.a(ajs, co, integer7, integer8, apn.a.JUNGLE)) {
							awn6 = new awz(true, 10, 20, atl10, atl11);
							boolean9 = true;
							break label82;
						}
					}
				}

				if (!boolean9) {
					integer7 = 0;
					integer8 = 0;
					awn6 = new axq(true, 4 + random.nextInt(7), atl10, atl11, false);
				}
				break;
			case ACACIA:
				awn6 = new axk(true);
				break;
			case DARK_OAK:
				label96:
				for (integer7 = 0; integer7 >= -1; integer7--) {
					for (integer8 = 0; integer8 >= -1; integer8--) {
						if (this.a(ajs, co, integer7, integer8, apn.a.DARK_OAK)) {
							awn6 = new axi(true);
							boolean9 = true;
							break label96;
						}
					}
				}

				if (!boolean9) {
					return;
				}
			case OAK:
		}

		atl atl10 = alv.a.t();
		if (boolean9) {
			ajs.a(co.a(integer7, 0, integer8), atl10, 4);
			ajs.a(co.a(integer7 + 1, 0, integer8), atl10, 4);
			ajs.a(co.a(integer7, 0, integer8 + 1), atl10, 4);
			ajs.a(co.a(integer7 + 1, 0, integer8 + 1), atl10, 4);
		} else {
			ajs.a(co, atl10, 4);
		}

		if (!awn6.b(ajs, random, co.a(integer7, 0, integer8))) {
			if (boolean9) {
				ajs.a(co.a(integer7, 0, integer8), atl, 4);
				ajs.a(co.a(integer7 + 1, 0, integer8), atl, 4);
				ajs.a(co.a(integer7, 0, integer8 + 1), atl, 4);
				ajs.a(co.a(integer7 + 1, 0, integer8 + 1), atl, 4);
			} else {
				ajs.a(co, atl, 4);
			}
		}
	}

	private boolean a(ajs ajs, co co, int integer3, int integer4, apn.a a) {
		return this.a(ajs, co.a(integer3, 0, integer4), a)
			&& this.a(ajs, co.a(integer3 + 1, 0, integer4), a)
			&& this.a(ajs, co.a(integer3, 0, integer4 + 1), a)
			&& this.a(ajs, co.a(integer3 + 1, 0, integer4 + 1), a);
	}

	public boolean a(ajs ajs, co co, apn.a a) {
		atl atl5 = ajs.o(co);
		return atl5.v() == this && atl5.c(aql.a) == a;
	}

	@Override
	public int d(atl atl) {
		return ((apn.a)atl.c(a)).a();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (apn.a a8 : apn.a.values()) {
			dd.add(new afj(afh, 1, a8.a()));
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, boolean boolean4) {
		return true;
	}

	@Override
	public boolean a(ajs ajs, Random random, co co, atl atl) {
		return (double)ajs.r.nextFloat() < 0.45;
	}

	@Override
	public void b(ajs ajs, Random random, co co, atl atl) {
		this.c(ajs, co, atl, random);
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, apn.a.a(integer & 7)).a(c, (integer & 8) >> 3);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((apn.a)atl.c(a)).a();
		return integer3 | (Integer)atl.c(c) << 3;
	}

	@Override
	protected atm b() {
		return new atm(this, a, c);
	}
}
