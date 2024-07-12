import java.util.List;

public class aqn extends alo {
	public static final atz<cv> a = aty.a("facing");
	private final aem b;

	public aqn(aem aem) {
		super(azs.e, azt.b);
		this.b = aem;
		this.a(aej.c);
		this.y(this.A.b().a(a, cv.UP));
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asu(this.b);
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean u(atl atl) {
		return true;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean v(atl atl) {
		return true;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.ENTITYBLOCK_ANIMATED;
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else if (aay.y()) {
			return true;
		} else {
			asc asc11 = ajs.r(co);
			if (asc11 instanceof asu) {
				cv cv12 = atl.c(a);
				boolean boolean13;
				if (((asu)asc11).p() == asu.a.CLOSED) {
					bdt bdt14 = j.b((double)(0.5F * (float)cv12.g()), (double)(0.5F * (float)cv12.h()), (double)(0.5F * (float)cv12.i()))
						.a((double)cv12.g(), (double)cv12.h(), (double)cv12.i());
					boolean13 = !ajs.a(bdt14.a(co.a(cv12)));
				} else {
					boolean13 = true;
				}

				if (boolean13) {
					aay.b(oa.ac);
					aay.a((rc)asc11);
				}

				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(a, cv);
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	@Override
	public int e(atl atl) {
		return ((cv)atl.c(a)).a();
	}

	@Override
	public atl a(int integer) {
		cv cv3 = cv.a(integer);
		return this.t().a(a, cv3);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, aay aay) {
		asu asu6 = (asu)ajs.r(co);
		asu6.a(aay.bK.d);
		asu6.d(aay);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		if (afj.t()) {
			asc asc7 = ajs.r(co);
			if (asc7 instanceof asu) {
				((asu)asc7).a(afj.r());
			}
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		asc asc5 = ajs.r(co);
		if (asc5 instanceof asu) {
			asu asu6 = (asu)asc5;
			if (!asu6.r() && asu6.F()) {
				afj afj7 = new afj(afh.a(this));
				du du8 = new du();
				du du9 = new du();
				du8.a("BlockEntityTag", ((asu)asc5).f(du9));
				afj7.b(du8);
				if (asu6.n_()) {
					afj7.g(asu6.h_());
					asu6.a("");
				}

				a(ajs, co, afj7);
			}

			ajs.d(co, atl.v());
		}

		super.b(ajs, co, atl);
	}

	@Override
	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
		super.a(afj, aay, list, boolean4);
		du du6 = afj.p();
		if (du6 != null && du6.b("BlockEntityTag", 10)) {
			du du7 = du6.o("BlockEntityTag");
			if (du7.b("LootTable", 8)) {
				list.add("???????");
			}

			if (du7.b("Items", 9)) {
				dd<afj> dd8 = dd.a(27, afj.a);
				rd.b(du7, dd8);
				int integer9 = 0;
				int integer10 = 0;

				for (afj afj12 : dd8) {
					if (!afj12.b()) {
						integer10++;
						if (integer9 <= 4) {
							integer9++;
							list.add(String.format("%s x%d", afj12.r(), afj12.E()));
						}
					}
				}

				if (integer10 - integer9 > 0) {
					list.add(String.format(a.ITALIC + dp.a("container.shulkerBox.more"), integer10 - integer9));
				}
			}
		}
	}

	@Override
	public azv h(atl atl) {
		return azv.DESTROY;
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		asc asc5 = ajw.r(co);
		return asc5 instanceof asu ? ((asu)asc5).a(atl) : j;
	}

	@Override
	public boolean x(atl atl) {
		return true;
	}

	@Override
	public int c(atl atl, ajs ajs, co co) {
		return acl.b((rc)ajs.r(co));
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		afj afj5 = super.a(ajs, co, atl);
		asu asu6 = (asu)ajs.r(co);
		du du7 = asu6.f(new du());
		if (!du7.b_()) {
			afj5.a("BlockEntityTag", du7);
		}

		return afj5;
	}

	public static aem b(afh afh) {
		return c(alu.a(afh));
	}

	public static aem c(alu alu) {
		return alu instanceof aqn ? ((aqn)alu).e() : aem.PURPLE;
	}

	public static alu a(aem aem) {
		switch (aem) {
			case WHITE:
				return alv.dl;
			case ORANGE:
				return alv.dm;
			case MAGENTA:
				return alv.dn;
			case LIGHT_BLUE:
				return alv.do;
			case YELLOW:
				return alv.dp;
			case LIME:
				return alv.dq;
			case PINK:
				return alv.dr;
			case GRAY:
				return alv.ds;
			case SILVER:
				return alv.dt;
			case CYAN:
				return alv.du;
			case PURPLE:
			default:
				return alv.dv;
			case BLUE:
				return alv.dw;
			case BROWN:
				return alv.dx;
			case GREEN:
				return alv.dy;
			case RED:
				return alv.dz;
			case BLACK:
				return alv.dA;
		}
	}

	public aem e() {
		return this.b;
	}

	public static afj b(aem aem) {
		return new afj(a(aem));
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(a, aqi.a(atl.c(a)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(a)));
	}
}
