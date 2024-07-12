import java.util.Random;
import javax.annotation.Nullable;

public class aqe extends alu {
	public static final aua a = aua.a("age", 0, 15);
	protected static final bdt b = new bdt(0.125, 0.0, 0.125, 0.875, 1.0, 0.875);

	protected aqe() {
		super(azs.k);
		this.y(this.A.b().a(a, 0));
		this.a(true);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return b;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (ajs.o(co.b()).v() == alv.aM || this.e(ajs, co, atl)) {
			if (ajs.d(co.a())) {
				int integer6 = 1;

				while (ajs.o(co.c(integer6)).v() == this) {
					integer6++;
				}

				if (integer6 < 3) {
					int integer7 = (Integer)atl.c(a);
					if (integer7 == 15) {
						ajs.a(co.a(), this.t());
						ajs.a(co, atl.a(a, 0), 4);
					} else {
						ajs.a(co, atl.a(a, integer7 + 1), 4);
					}
				}
			}
		}
	}

	@Override
	public boolean a(ajs ajs, co co) {
		alu alu4 = ajs.o(co.b()).v();
		if (alu4 == this) {
			return true;
		} else if (alu4 != alv.c && alu4 != alv.d && alu4 != alv.m) {
			return false;
		} else {
			co co5 = co.b();

			for (cv cv7 : cv.c.HORIZONTAL) {
				atl atl8 = ajs.o(co5.a(cv7));
				if (atl8.a() == azs.h || atl8.v() == alv.de) {
					return true;
				}
			}

			return false;
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		this.e(ajs, co3, atl);
	}

	protected final boolean e(ajs ajs, co co, atl atl) {
		if (this.b(ajs, co)) {
			return true;
		} else {
			this.b(ajs, co, atl, 0);
			ajs.g(co);
			return false;
		}
	}

	public boolean b(ajs ajs, co co) {
		return this.a(ajs, co);
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.aR;
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
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.aR);
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, integer);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(a);
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}
}
