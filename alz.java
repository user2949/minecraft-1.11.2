import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class alz extends alo {
	public static final atx[] a = new atx[]{atx.a("has_bottle_0"), atx.a("has_bottle_1"), atx.a("has_bottle_2")};
	protected static final bdt b = new bdt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
	protected static final bdt c = new bdt(0.4375, 0.0, 0.4375, 0.5625, 0.875, 0.5625);

	public alz() {
		super(azs.f);
		this.y(this.A.b().a(a[0], false).a(a[1], false).a(a[2], false));
	}

	@Override
	public String c() {
		return dp.a("item.brewingStand.name");
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asd();
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		a(co, bdt, list, c);
		a(co, bdt, list, b);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return b;
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			asc asc11 = ajs.r(co);
			if (asc11 instanceof asd) {
				aay.a((rc)((asd)asc11));
				aay.b(oa.M);
			}

			return true;
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		if (afj.t()) {
			asc asc7 = ajs.r(co);
			if (asc7 instanceof asd) {
				((asd)asc7).a(afj.r());
			}
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		double double6 = (double)((float)co.p() + 0.4F + random.nextFloat() * 0.2F);
		double double8 = (double)((float)co.q() + 0.7F + random.nextFloat() * 0.3F);
		double double10 = (double)((float)co.r() + 0.4F + random.nextFloat() * 0.2F);
		ajs.a(de.SMOKE_NORMAL, double6, double8, double10, 0.0, 0.0, 0.0);
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		asc asc5 = ajs.r(co);
		if (asc5 instanceof asd) {
			rf.a(ajs, co, (asd)asc5);
		}

		super.b(ajs, co, atl);
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.bQ;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.bQ);
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
		return ajk.CUTOUT;
	}

	@Override
	public atl a(int integer) {
		atl atl3 = this.t();

		for (int integer4 = 0; integer4 < 3; integer4++) {
			atl3 = atl3.a(a[integer4], (integer & 1 << integer4) > 0);
		}

		return atl3;
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;

		for (int integer4 = 0; integer4 < 3; integer4++) {
			if ((Boolean)atl.c(a[integer4])) {
				integer3 |= 1 << integer4;
			}
		}

		return integer3;
	}

	@Override
	protected atm b() {
		return new atm(this, a[0], a[1], a[2]);
	}
}
