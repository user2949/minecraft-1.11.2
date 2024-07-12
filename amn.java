import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class amn extends amt implements ani {
	public static final atx a = atx.a("powered");
	public static final atz<amn.a> b = atz.a("mode", amn.a.class);

	public amn(boolean boolean1) {
		super(boolean1);
		this.y(this.A.b().a(D, cv.NORTH).a(a, false).a(b, amn.a.COMPARE));
		this.u = true;
	}

	@Override
	public String c() {
		return dp.a("item.comparator.name");
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.cp;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.cp);
	}

	@Override
	protected int i(atl atl) {
		return 2;
	}

	@Override
	protected atl z(atl atl) {
		Boolean boolean3 = atl.c(a);
		amn.a a4 = atl.c(b);
		cv cv5 = atl.c(D);
		return alv.ck.t().a(D, cv5).a(a, boolean3).a(b, a4);
	}

	@Override
	protected atl A(atl atl) {
		Boolean boolean3 = atl.c(a);
		amn.a a4 = atl.c(b);
		cv cv5 = atl.c(D);
		return alv.cj.t().a(D, cv5).a(a, boolean3).a(b, a4);
	}

	@Override
	protected boolean B(atl atl) {
		return this.d || (Boolean)atl.c(a);
	}

	@Override
	protected int a(ajw ajw, co co, atl atl) {
		asc asc5 = ajw.r(co);
		return asc5 instanceof asg ? ((asg)asc5).a() : 0;
	}

	private int j(ajs ajs, co co, atl atl) {
		return atl.c(b) == amn.a.SUBTRACT ? Math.max(this.f(ajs, co, atl) - this.c(ajs, co, atl), 0) : this.f(ajs, co, atl);
	}

	@Override
	protected boolean e(ajs ajs, co co, atl atl) {
		int integer5 = this.f(ajs, co, atl);
		if (integer5 >= 15) {
			return true;
		} else if (integer5 == 0) {
			return false;
		} else {
			int integer6 = this.c(ajs, co, atl);
			return integer6 == 0 ? true : integer5 >= integer6;
		}
	}

	@Override
	protected int f(ajs ajs, co co, atl atl) {
		int integer5 = super.f(ajs, co, atl);
		cv cv6 = atl.c(D);
		co co7 = co.a(cv6);
		atl atl8 = ajs.o(co7);
		if (atl8.o()) {
			integer5 = atl8.a(ajs, co7);
		} else if (integer5 < 15 && atl8.m()) {
			co7 = co7.a(cv6);
			atl8 = ajs.o(co7);
			if (atl8.o()) {
				integer5 = atl8.a(ajs, co7);
			} else if (atl8.a() == azs.a) {
				yz yz9 = this.a(ajs, cv6, co7);
				if (yz9 != null) {
					integer5 = yz9.t();
				}
			}
		}

		return integer5;
	}

	@Nullable
	private yz a(ajs ajs, cv cv, co co) {
		List<yz> list5 = ajs.a(
			yz.class, new bdt((double)co.p(), (double)co.q(), (double)co.r(), (double)(co.p() + 1), (double)(co.q() + 1), (double)(co.r() + 1)), new Predicate<sn>() {
				public boolean apply(@Nullable sn sn) {
					return sn != null && sn.bl() == cv;
				}
			}
		);
		return list5.size() == 1 ? (yz)list5.get(0) : null;
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (!aay.bK.e) {
			return false;
		} else {
			atl = atl.a(b);
			float float11 = atl.c(b) == amn.a.SUBTRACT ? 0.55F : 0.5F;
			ajs.a(aay, co, nn.an, no.BLOCKS, 0.3F, float11);
			ajs.a(co, atl, 2);
			this.k(ajs, co, atl);
			return true;
		}
	}

	@Override
	protected void g(ajs ajs, co co, atl atl) {
		if (!ajs.a(co, this)) {
			int integer5 = this.j(ajs, co, atl);
			asc asc6 = ajs.r(co);
			int integer7 = asc6 instanceof asg ? ((asg)asc6).a() : 0;
			if (integer5 != integer7 || this.B(atl) != this.e(ajs, co, atl)) {
				if (this.i(ajs, co, atl)) {
					ajs.a(co, this, 2, -1);
				} else {
					ajs.a(co, this, 2, 0);
				}
			}
		}
	}

	private void k(ajs ajs, co co, atl atl) {
		int integer5 = this.j(ajs, co, atl);
		asc asc6 = ajs.r(co);
		int integer7 = 0;
		if (asc6 instanceof asg) {
			asg asg8 = (asg)asc6;
			integer7 = asg8.a();
			asg8.a(integer5);
		}

		if (integer7 != integer5 || atl.c(b) == amn.a.COMPARE) {
			boolean boolean8 = this.e(ajs, co, atl);
			boolean boolean9 = this.B(atl);
			if (boolean9 && !boolean8) {
				ajs.a(co, atl.a(a, false), 2);
			} else if (!boolean9 && boolean8) {
				ajs.a(co, atl.a(a, true), 2);
			}

			this.h(ajs, co, atl);
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (this.d) {
			ajs.a(co, this.A(atl).a(a, true), 4);
		}

		this.k(ajs, co, atl);
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		super.c(ajs, co, atl);
		ajs.a(co, this.a(ajs, 0));
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		super.b(ajs, co, atl);
		ajs.s(co);
		this.h(ajs, co, atl);
	}

	@Override
	public boolean a(atl atl, ajs ajs, co co, int integer4, int integer5) {
		super.a(atl, ajs, co, integer4, integer5);
		asc asc7 = ajs.r(co);
		return asc7 == null ? false : asc7.c(integer4, integer5);
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asg();
	}

	@Override
	public atl a(int integer) {
		return this.t().a(D, cv.b(integer)).a(a, (integer & 8) > 0).a(b, (integer & 4) > 0 ? amn.a.SUBTRACT : amn.a.COMPARE);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(D)).b();
		if ((Boolean)atl.c(a)) {
			integer3 |= 8;
		}

		if (atl.c(b) == amn.a.SUBTRACT) {
			integer3 |= 4;
		}

		return integer3;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(D, aqi.a(atl.c(D)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(D)));
	}

	@Override
	protected atm b() {
		return new atm(this, D, b, a);
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(D, sw.bl().d()).a(a, false).a(b, amn.a.COMPARE);
	}

	public static enum a implements ox {
		COMPARE("compare"),
		SUBTRACT("subtract");

		private final String c;

		private a(String string3) {
			this.c = string3;
		}

		public String toString() {
			return this.c;
		}

		@Override
		public String m() {
			return this.c;
		}
	}
}
