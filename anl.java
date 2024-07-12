import java.util.List;
import javax.annotation.Nullable;

public class anl extends alu {
	public static final atx a = atx.a("north");
	public static final atx b = atx.a("east");
	public static final atx c = atx.a("south");
	public static final atx d = atx.a("west");
	protected static final bdt[] e = new bdt[]{
		new bdt(0.375, 0.0, 0.375, 0.625, 1.0, 0.625),
		new bdt(0.375, 0.0, 0.375, 0.625, 1.0, 1.0),
		new bdt(0.0, 0.0, 0.375, 0.625, 1.0, 0.625),
		new bdt(0.0, 0.0, 0.375, 0.625, 1.0, 1.0),
		new bdt(0.375, 0.0, 0.0, 0.625, 1.0, 0.625),
		new bdt(0.375, 0.0, 0.0, 0.625, 1.0, 1.0),
		new bdt(0.0, 0.0, 0.0, 0.625, 1.0, 0.625),
		new bdt(0.0, 0.0, 0.0, 0.625, 1.0, 1.0),
		new bdt(0.375, 0.0, 0.375, 1.0, 1.0, 0.625),
		new bdt(0.375, 0.0, 0.375, 1.0, 1.0, 1.0),
		new bdt(0.0, 0.0, 0.375, 1.0, 1.0, 0.625),
		new bdt(0.0, 0.0, 0.375, 1.0, 1.0, 1.0),
		new bdt(0.375, 0.0, 0.0, 1.0, 1.0, 0.625),
		new bdt(0.375, 0.0, 0.0, 1.0, 1.0, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 0.625),
		new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
	};
	public static final bdt f = new bdt(0.375, 0.0, 0.375, 0.625, 1.5, 0.625);
	public static final bdt g = new bdt(0.375, 0.0, 0.625, 0.625, 1.5, 1.0);
	public static final bdt B = new bdt(0.0, 0.0, 0.375, 0.375, 1.5, 0.625);
	public static final bdt C = new bdt(0.375, 0.0, 0.0, 0.625, 1.5, 0.375);
	public static final bdt D = new bdt(0.625, 0.0, 0.375, 1.0, 1.5, 0.625);

	public anl(azs azs, azt azt) {
		super(azs, azt);
		this.y(this.A.b().a(a, false).a(b, false).a(c, false).a(d, false));
		this.a(aej.c);
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		if (!boolean7) {
			atl = atl.b((ajw)ajs, co);
		}

		a(co, bdt, list, f);
		if ((Boolean)atl.c(a)) {
			a(co, bdt, list, C);
		}

		if ((Boolean)atl.c(b)) {
			a(co, bdt, list, D);
		}

		if ((Boolean)atl.c(c)) {
			a(co, bdt, list, g);
		}

		if ((Boolean)atl.c(d)) {
			a(co, bdt, list, B);
		}
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		atl = this.c(atl, ajw, co);
		return e[i(atl)];
	}

	private static int i(atl atl) {
		int integer2 = 0;
		if ((Boolean)atl.c(a)) {
			integer2 |= 1 << cv.NORTH.b();
		}

		if ((Boolean)atl.c(b)) {
			integer2 |= 1 << cv.EAST.b();
		}

		if ((Boolean)atl.c(c)) {
			integer2 |= 1 << cv.SOUTH.b();
		}

		if ((Boolean)atl.c(d)) {
			integer2 |= 1 << cv.WEST.b();
		}

		return integer2;
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
	public boolean b(ajw ajw, co co) {
		return false;
	}

	public boolean c(ajw ajw, co co) {
		atl atl4 = ajw.o(co);
		alu alu5 = atl4.v();
		if (alu5 == alv.cv) {
			return false;
		} else if ((!(alu5 instanceof anl) || alu5.x != this.x) && !(alu5 instanceof anm)) {
			return alu5.x.k() && atl4.h() ? alu5.x != azs.C : false;
		} else {
			return true;
		}
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		return true;
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (!ajs.E) {
			return afm.a(aay, ajs, co);
		} else {
			afj afj11 = aay.b(ri);
			return afj11.c() == afl.cy || afj11.b();
		}
	}

	@Override
	public int e(atl atl) {
		return 0;
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		return atl.a(a, this.c(ajw, co.c())).a(b, this.c(ajw, co.f())).a(c, this.c(ajw, co.d())).a(d, this.c(ajw, co.e()));
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case CLOCKWISE_180:
				return atl.a(a, atl.c(c)).a(b, atl.c(d)).a(c, atl.c(a)).a(d, atl.c(b));
			case COUNTERCLOCKWISE_90:
				return atl.a(a, atl.c(b)).a(b, atl.c(c)).a(c, atl.c(d)).a(d, atl.c(a));
			case CLOCKWISE_90:
				return atl.a(a, atl.c(d)).a(b, atl.c(a)).a(c, atl.c(b)).a(d, atl.c(c));
			default:
				return atl;
		}
	}

	@Override
	public atl a(atl atl, aou aou) {
		switch (aou) {
			case LEFT_RIGHT:
				return atl.a(a, atl.c(c)).a(c, atl.c(a));
			case FRONT_BACK:
				return atl.a(b, atl.c(d)).a(d, atl.c(b));
			default:
				return super.a(atl, aou);
		}
	}

	@Override
	protected atm b() {
		return new atm(this, a, b, d, c);
	}
}
