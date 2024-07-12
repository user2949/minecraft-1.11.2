import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ami extends alu {
	public static final atx a = atx.a("north");
	public static final atx b = atx.a("east");
	public static final atx c = atx.a("south");
	public static final atx d = atx.a("west");
	public static final atx e = atx.a("up");
	public static final atx f = atx.a("down");

	protected ami() {
		super(azs.k, azt.z);
		this.a(aej.c);
		this.y(this.A.b().a(a, false).a(b, false).a(c, false).a(d, false).a(e, false).a(f, false));
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		alu alu5 = ajw.o(co.b()).v();
		alu alu6 = ajw.o(co.a()).v();
		alu alu7 = ajw.o(co.c()).v();
		alu alu8 = ajw.o(co.f()).v();
		alu alu9 = ajw.o(co.d()).v();
		alu alu10 = ajw.o(co.e()).v();
		return atl.a(f, alu5 == this || alu5 == alv.cS || alu5 == alv.bH)
			.a(e, alu6 == this || alu6 == alv.cS)
			.a(a, alu7 == this || alu7 == alv.cS)
			.a(b, alu8 == this || alu8 == alv.cS)
			.a(c, alu9 == this || alu9 == alv.cS)
			.a(d, alu10 == this || alu10 == alv.cS);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		atl = atl.b(ajw, co);
		float float5 = 0.1875F;
		float float6 = atl.c(d) ? 0.0F : 0.1875F;
		float float7 = atl.c(f) ? 0.0F : 0.1875F;
		float float8 = atl.c(a) ? 0.0F : 0.1875F;
		float float9 = atl.c(b) ? 1.0F : 0.8125F;
		float float10 = atl.c(e) ? 1.0F : 0.8125F;
		float float11 = atl.c(c) ? 1.0F : 0.8125F;
		return new bdt((double)float6, (double)float7, (double)float8, (double)float9, (double)float10, (double)float11);
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		if (!boolean7) {
			atl = atl.b((ajw)ajs, co);
		}

		float float9 = 0.1875F;
		float float10 = 0.8125F;
		a(co, bdt, list, new bdt(0.1875, 0.1875, 0.1875, 0.8125, 0.8125, 0.8125));
		if ((Boolean)atl.c(d)) {
			a(co, bdt, list, new bdt(0.0, 0.1875, 0.1875, 0.1875, 0.8125, 0.8125));
		}

		if ((Boolean)atl.c(b)) {
			a(co, bdt, list, new bdt(0.8125, 0.1875, 0.1875, 1.0, 0.8125, 0.8125));
		}

		if ((Boolean)atl.c(e)) {
			a(co, bdt, list, new bdt(0.1875, 0.8125, 0.1875, 0.8125, 1.0, 0.8125));
		}

		if ((Boolean)atl.c(f)) {
			a(co, bdt, list, new bdt(0.1875, 0.0, 0.1875, 0.8125, 0.1875, 0.8125));
		}

		if ((Boolean)atl.c(a)) {
			a(co, bdt, list, new bdt(0.1875, 0.1875, 0.0, 0.8125, 0.8125, 0.1875));
		}

		if ((Boolean)atl.c(c)) {
			a(co, bdt, list, new bdt(0.1875, 0.1875, 0.8125, 0.8125, 0.8125, 1.0));
		}
	}

	@Override
	public int e(atl atl) {
		return 0;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!this.b(ajs, co)) {
			ajs.b(co, true);
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.cT;
	}

	@Override
	public int a(Random random) {
		return random.nextInt(2);
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
	public boolean a(ajs ajs, co co) {
		return super.a(ajs, co) ? this.b(ajs, co) : false;
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!this.b(ajs, co3)) {
			ajs.a(co3, this, 1);
		}
	}

	public boolean b(ajs ajs, co co) {
		boolean boolean4 = ajs.d(co.a());
		boolean boolean5 = ajs.d(co.b());

		for (cv cv7 : cv.c.HORIZONTAL) {
			co co8 = co.a(cv7);
			alu alu9 = ajs.o(co8).v();
			if (alu9 == this) {
				if (!boolean4 && !boolean5) {
					return false;
				}

				alu alu10 = ajs.o(co8.b()).v();
				if (alu10 == this || alu10 == alv.bH) {
					return true;
				}
			}
		}

		alu alu6 = ajs.o(co.b()).v();
		return alu6 == this || alu6 == alv.bH;
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		alu alu6 = ajw.o(co.a(cv)).v();
		return alu6 != this && alu6 != alv.cS && (cv != cv.DOWN || alu6 != alv.bH);
	}

	@Override
	protected atm b() {
		return new atm(this, a, b, c, d, e, f);
	}

	@Override
	public boolean b(ajw ajw, co co) {
		return false;
	}
}
