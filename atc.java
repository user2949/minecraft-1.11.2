import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class atc extends amu {
	public static final atx a = atx.a("extended");
	protected static final bdt b = new bdt(0.0, 0.0, 0.0, 0.75, 1.0, 1.0);
	protected static final bdt c = new bdt(0.25, 0.0, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt d = new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 0.75);
	protected static final bdt e = new bdt(0.0, 0.0, 0.25, 1.0, 1.0, 1.0);
	protected static final bdt f = new bdt(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);
	protected static final bdt g = new bdt(0.0, 0.25, 0.0, 1.0, 1.0, 1.0);
	private final boolean B;

	public atc(boolean boolean1) {
		super(azs.H);
		this.y(this.A.b().a(H, cv.NORTH).a(a, false));
		this.B = boolean1;
		this.a(aqu.d);
		this.c(0.5F);
		this.a(aej.d);
	}

	@Override
	public boolean u(atl atl) {
		return !(Boolean)atl.c(a);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		if ((Boolean)atl.c(a)) {
			switch ((cv)atl.c(H)) {
				case DOWN:
					return g;
				case UP:
				default:
					return f;
				case NORTH:
					return e;
				case SOUTH:
					return d;
				case WEST:
					return c;
				case EAST:
					return b;
			}
		} else {
			return j;
		}
	}

	@Override
	public boolean k(atl atl) {
		return !(Boolean)atl.c(a) || atl.c(H) == cv.DOWN;
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		a(co, bdt, list, atl.d(ajs, co));
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		ajs.a(co, atl.a(H, cv.a(co, sw)), 2);
		if (!ajs.E) {
			this.e(ajs, co, atl);
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.E) {
			this.e(ajs, co3, atl);
		}
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		if (!ajs.E && ajs.r(co) == null) {
			this.e(ajs, co, atl);
		}
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(H, cv.a(co, sw)).a(a, false);
	}

	private void e(ajs ajs, co co, atl atl) {
		cv cv5 = atl.c(H);
		boolean boolean6 = this.a(ajs, co, cv5);
		if (boolean6 && !(Boolean)atl.c(a)) {
			if (new atg(ajs, co, cv5, true).a()) {
				ajs.c(co, this, 0, cv5.a());
			}
		} else if (!boolean6 && (Boolean)atl.c(a)) {
			ajs.c(co, this, 1, cv5.a());
		}
	}

	private boolean a(ajs ajs, co co, cv cv) {
		for (cv cv8 : cv.values()) {
			if (cv8 != cv && ajs.b(co.a(cv8), cv8)) {
				return true;
			}
		}

		if (ajs.b(co, cv.DOWN)) {
			return true;
		} else {
			co co5 = co.a();

			for (cv cv9 : cv.values()) {
				if (cv9 != cv.DOWN && ajs.b(co5.a(cv9), cv9)) {
					return true;
				}
			}

			return false;
		}
	}

	@Override
	public boolean a(atl atl, ajs ajs, co co, int integer4, int integer5) {
		cv cv7 = atl.c(H);
		if (!ajs.E) {
			boolean boolean8 = this.a(ajs, co, cv7);
			if (boolean8 && integer4 == 1) {
				ajs.a(co, atl.a(a, true), 2);
				return false;
			}

			if (!boolean8 && integer4 == 0) {
				return false;
			}
		}

		if (integer4 == 0) {
			if (!this.a(ajs, co, cv7, true)) {
				return false;
			}

			ajs.a(co, atl.a(a, true), 3);
			ajs.a(null, co, nn.ev, no.BLOCKS, 0.5F, ajs.r.nextFloat() * 0.25F + 0.6F);
		} else if (integer4 == 1) {
			asc asc8 = ajs.r(co.a(cv7));
			if (asc8 instanceof atf) {
				((atf)asc8).i();
			}

			ajs.a(co, alv.M.t().a(ate.a, cv7).a(ate.b, this.B ? atd.a.STICKY : atd.a.DEFAULT), 3);
			ajs.a(co, ate.a(this.a(integer5), cv7, false, true));
			if (this.B) {
				co co9 = co.a(cv7.g() * 2, cv7.h() * 2, cv7.i() * 2);
				atl atl10 = ajs.o(co9);
				alu alu11 = atl10.v();
				boolean boolean12 = false;
				if (alu11 == alv.M) {
					asc asc13 = ajs.r(co9);
					if (asc13 instanceof atf) {
						atf atf14 = (atf)asc13;
						if (atf14.f() == cv7 && atf14.e()) {
							atf14.i();
							boolean12 = true;
						}
					}
				}

				if (!boolean12 && atl10.a() != azs.a && a(atl10, ajs, co9, cv7.d(), false) && (atl10.p() == azv.NORMAL || alu11 == alv.J || alu11 == alv.F)) {
					this.a(ajs, co, cv7, false);
				}
			} else {
				ajs.g(co.a(cv7));
			}

			ajs.a(null, co, nn.eu, no.BLOCKS, 0.5F, ajs.r.nextFloat() * 0.15F + 0.6F);
		}

		return true;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Nullable
	public static cv e(int integer) {
		int integer2 = integer & 7;
		return integer2 > 5 ? null : cv.a(integer2);
	}

	public static boolean a(atl atl, ajs ajs, co co, cv cv, boolean boolean5) {
		alu alu6 = atl.v();
		if (alu6 == alv.Z) {
			return false;
		} else if (!ajs.aj().a(co)) {
			return false;
		} else if (co.q() >= 0 && (cv != cv.DOWN || co.q() != 0)) {
			if (co.q() <= ajs.Y() - 1 && (cv != cv.UP || co.q() != ajs.Y() - 1)) {
				if (alu6 != alv.J && alu6 != alv.F) {
					if (atl.b(ajs, co) == -1.0F) {
						return false;
					}

					if (atl.p() == azv.BLOCK) {
						return false;
					}

					if (atl.p() == azv.DESTROY) {
						return boolean5;
					}
				} else if ((Boolean)atl.c(a)) {
					return false;
				}

				return !alu6.l();
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	private boolean a(ajs ajs, co co, cv cv, boolean boolean4) {
		if (!boolean4) {
			ajs.g(co.a(cv));
		}

		atg atg6 = new atg(ajs, co, cv, boolean4);
		if (!atg6.a()) {
			return false;
		} else {
			List<co> list7 = atg6.c();
			List<atl> list8 = Lists.newArrayList();

			for (int integer9 = 0; integer9 < list7.size(); integer9++) {
				co co10 = (co)list7.get(integer9);
				list8.add(ajs.o(co10).b((ajw)ajs, co10));
			}

			List<co> list9 = atg6.d();
			int integer10 = list7.size() + list9.size();
			atl[] arr11 = new atl[integer10];
			cv cv12 = boolean4 ? cv : cv.d();

			for (int integer13 = list9.size() - 1; integer13 >= 0; integer13--) {
				co co14 = (co)list9.get(integer13);
				atl atl15 = ajs.o(co14);
				atl15.v().b(ajs, co14, atl15, 0);
				ajs.a(co14, alv.a.t(), 4);
				integer10--;
				arr11[integer10] = atl15;
			}

			for (int integer13 = list7.size() - 1; integer13 >= 0; integer13--) {
				co co14 = (co)list7.get(integer13);
				atl atl15 = ajs.o(co14);
				ajs.a(co14, alv.a.t(), 2);
				co14 = co14.a(cv12);
				ajs.a(co14, alv.M.t().a(H, cv), 4);
				ajs.a(co14, ate.a((atl)list8.get(integer13), cv, boolean4, false));
				integer10--;
				arr11[integer10] = atl15;
			}

			co co13 = co.a(cv);
			if (boolean4) {
				atd.a a14 = this.B ? atd.a.STICKY : atd.a.DEFAULT;
				atl atl15 = alv.K.t().a(atd.H, cv).a(atd.a, a14);
				atl atl16 = alv.M.t().a(ate.a, cv).a(ate.b, this.B ? atd.a.STICKY : atd.a.DEFAULT);
				ajs.a(co13, atl16, 4);
				ajs.a(co13, ate.a(atl15, cv, true, true));
			}

			for (int integer14 = list9.size() - 1; integer14 >= 0; integer14--) {
				ajs.b((co)list9.get(integer14), arr11[integer10++].v(), false);
			}

			for (int integer14 = list7.size() - 1; integer14 >= 0; integer14--) {
				ajs.b((co)list7.get(integer14), arr11[integer10++].v(), false);
			}

			if (boolean4) {
				ajs.b(co13, alv.K, false);
			}

			return true;
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(H, e(integer)).a(a, (integer & 8) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(H)).a();
		if ((Boolean)atl.c(a)) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(H, aqi.a(atl.c(H)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(H)));
	}

	@Override
	protected atm b() {
		return new atm(this, H, a);
	}
}
