import com.google.common.base.Predicate;
import java.util.Random;
import javax.annotation.Nullable;

public class arl extends alu {
	public static final aty a = aty.a("facing", new Predicate<cv>() {
		public boolean apply(@Nullable cv cv) {
			return cv != cv.DOWN;
		}
	});
	protected static final bdt b = new bdt(0.4F, 0.0, 0.4F, 0.6F, 0.6F, 0.6F);
	protected static final bdt c = new bdt(0.35F, 0.2F, 0.7F, 0.65F, 0.8F, 1.0);
	protected static final bdt d = new bdt(0.35F, 0.2F, 0.0, 0.65F, 0.8F, 0.3F);
	protected static final bdt e = new bdt(0.7F, 0.2F, 0.35F, 1.0, 0.8F, 0.65F);
	protected static final bdt f = new bdt(0.0, 0.2F, 0.35F, 0.3F, 0.8F, 0.65F);

	protected arl() {
		super(azs.q);
		this.y(this.A.b().a(a, cv.UP));
		this.a(true);
		this.a(aej.c);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		switch ((cv)atl.c(a)) {
			case EAST:
				return f;
			case WEST:
				return e;
			case SOUTH:
				return d;
			case NORTH:
				return c;
			default:
				return b;
		}
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	private boolean b(ajs ajs, co co) {
		if (ajs.o(co).r()) {
			return true;
		} else {
			alu alu4 = ajs.o(co).v();
			return alu4 instanceof anl || alu4 == alv.w || alu4 == alv.bZ || alu4 == alv.cG;
		}
	}

	@Override
	public boolean a(ajs ajs, co co) {
		for (cv cv5 : a.c()) {
			if (this.a(ajs, co, cv5)) {
				return true;
			}
		}

		return false;
	}

	private boolean a(ajs ajs, co co, cv cv) {
		co co5 = co.a(cv.d());
		boolean boolean6 = cv.k().c();
		return boolean6 && ajs.d(co5, true) || cv.equals(cv.UP) && this.b(ajs, co5);
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		if (this.a(ajs, co, cv)) {
			return this.t().a(a, cv);
		} else {
			for (cv cv11 : cv.c.HORIZONTAL) {
				if (ajs.d(co.a(cv11.d()), true)) {
					return this.t().a(a, cv11);
				}
			}

			return this.t();
		}
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		this.f(ajs, co, atl);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		this.e(ajs, co3, atl);
	}

	protected boolean e(ajs ajs, co co, atl atl) {
		if (!this.f(ajs, co, atl)) {
			return true;
		} else {
			cv cv5 = atl.c(a);
			cv.a a6 = cv5.k();
			cv cv7 = cv5.d();
			boolean boolean8 = false;
			if (a6.c() && !ajs.d(co.a(cv7), true)) {
				boolean8 = true;
			} else if (a6.b() && !this.b(ajs, co.a(cv7))) {
				boolean8 = true;
			}

			if (boolean8) {
				this.b(ajs, co, atl, 0);
				ajs.g(co);
				return true;
			} else {
				return false;
			}
		}
	}

	protected boolean f(ajs ajs, co co, atl atl) {
		if (atl.v() == this && this.a(ajs, co, atl.c(a))) {
			return true;
		} else {
			if (ajs.o(co).v() == this) {
				this.b(ajs, co, atl, 0);
				ajs.g(co);
			}

			return false;
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		cv cv6 = atl.c(a);
		double double7 = (double)co.p() + 0.5;
		double double9 = (double)co.q() + 0.7;
		double double11 = (double)co.r() + 0.5;
		double double13 = 0.22;
		double double15 = 0.27;
		if (cv6.k().c()) {
			cv cv17 = cv6.d();
			ajs.a(de.SMOKE_NORMAL, double7 + 0.27 * (double)cv17.g(), double9 + 0.22, double11 + 0.27 * (double)cv17.i(), 0.0, 0.0, 0.0);
			ajs.a(de.FLAME, double7 + 0.27 * (double)cv17.g(), double9 + 0.22, double11 + 0.27 * (double)cv17.i(), 0.0, 0.0, 0.0);
		} else {
			ajs.a(de.SMOKE_NORMAL, double7, double9, double11, 0.0, 0.0, 0.0);
			ajs.a(de.FLAME, double7, double9, double11, 0.0, 0.0, 0.0);
		}
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public atl a(int integer) {
		atl atl3 = this.t();
		switch (integer) {
			case 1:
				atl3 = atl3.a(a, cv.EAST);
				break;
			case 2:
				atl3 = atl3.a(a, cv.WEST);
				break;
			case 3:
				atl3 = atl3.a(a, cv.SOUTH);
				break;
			case 4:
				atl3 = atl3.a(a, cv.NORTH);
				break;
			case 5:
			default:
				atl3 = atl3.a(a, cv.UP);
		}

		return atl3;
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		switch ((cv)atl.c(a)) {
			case EAST:
				integer3 |= 1;
				break;
			case WEST:
				integer3 |= 2;
				break;
			case SOUTH:
				integer3 |= 3;
				break;
			case NORTH:
				integer3 |= 4;
				break;
			case DOWN:
			case UP:
			default:
				integer3 |= 5;
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
		return new atm(this, a);
	}
}
