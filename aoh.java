import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;

public class aoh extends alo {
	public static final aty a = aty.a("facing", new Predicate<cv>() {
		public boolean apply(@Nullable cv cv) {
			return cv != cv.UP;
		}
	});
	public static final atx b = atx.a("enabled");
	protected static final bdt c = new bdt(0.0, 0.0, 0.0, 1.0, 0.625, 1.0);
	protected static final bdt d = new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 0.125);
	protected static final bdt e = new bdt(0.0, 0.0, 0.875, 1.0, 1.0, 1.0);
	protected static final bdt f = new bdt(0.875, 0.0, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt g = new bdt(0.0, 0.0, 0.0, 0.125, 1.0, 1.0);

	public aoh() {
		super(azs.f, azt.m);
		this.y(this.A.b().a(a, cv.DOWN).a(b, true));
		this.a(aej.d);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return j;
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		a(co, bdt, list, c);
		a(co, bdt, list, g);
		a(co, bdt, list, f);
		a(co, bdt, list, d);
		a(co, bdt, list, e);
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		cv cv10 = cv.d();
		if (cv10 == cv.UP) {
			cv10 = cv.DOWN;
		}

		return this.t().a(a, cv10).a(b, true);
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asp();
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		super.a(ajs, co, atl, sw, afj);
		if (afj.t()) {
			asc asc7 = ajs.r(co);
			if (asc7 instanceof asp) {
				((asp)asc7).a(afj.r());
			}
		}
	}

	@Override
	public boolean k(atl atl) {
		return true;
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		this.e(ajs, co, atl);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			asc asc11 = ajs.r(co);
			if (asc11 instanceof asp) {
				aay.a((rc)((asp)asc11));
				aay.b(oa.P);
			}

			return true;
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		this.e(ajs, co3, atl);
	}

	private void e(ajs ajs, co co, atl atl) {
		boolean boolean5 = !ajs.y(co);
		if (boolean5 != (Boolean)atl.c(b)) {
			ajs.a(co, atl.a(b, boolean5), 4);
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		asc asc5 = ajs.r(co);
		if (asc5 instanceof asp) {
			rf.a(ajs, co, (asp)asc5);
			ajs.d(co, this);
		}

		super.b(ajs, co, atl);
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		return true;
	}

	public static cv e(int integer) {
		return cv.a(integer & 7);
	}

	public static boolean f(int integer) {
		return (integer & 8) != 8;
	}

	@Override
	public boolean x(atl atl) {
		return true;
	}

	@Override
	public int c(atl atl, ajs ajs, co co) {
		return acl.a(ajs.r(co));
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT_MIPPED;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, e(integer)).a(b, f(integer));
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(a)).a();
		if (!(Boolean)atl.c(b)) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(a, aqi.a(atl.c(a)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(a)));
	}

	@Override
	protected atm b() {
		return new atm(this, a, b);
	}
}
