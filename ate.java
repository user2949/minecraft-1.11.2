import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ate extends alo {
	public static final aty a = atd.H;
	public static final atz<atd.a> b = atd.a;

	public ate() {
		super(azs.H);
		this.y(this.A.b().a(a, cv.NORTH).a(b, atd.a.DEFAULT));
		this.c(-1.0F);
	}

	@Nullable
	@Override
	public asc a(ajs ajs, int integer) {
		return null;
	}

	public static asc a(atl atl, cv cv, boolean boolean3, boolean boolean4) {
		return new atf(atl, cv, boolean3, boolean4);
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		asc asc5 = ajs.r(co);
		if (asc5 instanceof atf) {
			((atf)asc5).i();
		} else {
			super.b(ajs, co, atl);
		}
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return false;
	}

	@Override
	public boolean b(ajs ajs, co co, cv cv) {
		return false;
	}

	@Override
	public void d(ajs ajs, co co, atl atl) {
		co co5 = co.a(((cv)atl.c(a)).d());
		atl atl6 = ajs.o(co5);
		if (atl6.v() instanceof atc && (Boolean)atl6.c(atc.a)) {
			ajs.g(co5);
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
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (!ajs.E && ajs.r(co) == null) {
			ajs.g(co);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.a;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		if (!ajs.E) {
			atf atf7 = this.c(ajs, co);
			if (atf7 != null) {
				atl atl8 = atf7.a();
				atl8.v().b(ajs, co, atl8, 0);
			}
		}
	}

	@Nullable
	@Override
	public bdu a(atl atl, ajs ajs, co co, bdw bdw4, bdw bdw5) {
		return null;
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.E) {
			ajs.r(co3);
		}
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		atf atf5 = this.c(ajw, co);
		return atf5 == null ? null : atf5.a(ajw, co);
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		atf atf9 = this.c(ajs, co);
		if (atf9 != null) {
			atf9.a(ajs, co, bdt, list, sn);
		}
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		atf atf5 = this.c(ajw, co);
		return atf5 != null ? atf5.a(ajw, co) : j;
	}

	@Nullable
	private atf c(ajw ajw, co co) {
		asc asc4 = ajw.r(co);
		return asc4 instanceof atf ? (atf)asc4 : null;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return afj.a;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, atd.e(integer)).a(b, (integer & 8) > 0 ? atd.a.STICKY : atd.a.DEFAULT);
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
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(a)).a();
		if (atl.c(b) == atd.a.STICKY) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	protected atm b() {
		return new atm(this, a, b);
	}
}
