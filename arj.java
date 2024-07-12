import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class arj extends alu {
	public static final atx b = atx.a("north");
	public static final atx c = atx.a("east");
	public static final atx d = atx.a("south");
	public static final atx e = atx.a("west");
	protected static final bdt[] f = new bdt[]{
		new bdt(0.4375, 0.0, 0.4375, 0.5625, 1.0, 0.5625),
		new bdt(0.4375, 0.0, 0.4375, 0.5625, 1.0, 1.0),
		new bdt(0.0, 0.0, 0.4375, 0.5625, 1.0, 0.5625),
		new bdt(0.0, 0.0, 0.4375, 0.5625, 1.0, 1.0),
		new bdt(0.4375, 0.0, 0.0, 0.5625, 1.0, 0.5625),
		new bdt(0.4375, 0.0, 0.0, 0.5625, 1.0, 1.0),
		new bdt(0.0, 0.0, 0.0, 0.5625, 1.0, 0.5625),
		new bdt(0.0, 0.0, 0.0, 0.5625, 1.0, 1.0),
		new bdt(0.4375, 0.0, 0.4375, 1.0, 1.0, 0.5625),
		new bdt(0.4375, 0.0, 0.4375, 1.0, 1.0, 1.0),
		new bdt(0.0, 0.0, 0.4375, 1.0, 1.0, 0.5625),
		new bdt(0.0, 0.0, 0.4375, 1.0, 1.0, 1.0),
		new bdt(0.4375, 0.0, 0.0, 1.0, 1.0, 0.5625),
		new bdt(0.4375, 0.0, 0.0, 1.0, 1.0, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 0.5625),
		new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
	};
	private final boolean a;

	protected arj(azs azs, boolean boolean2) {
		super(azs);
		this.y(this.A.b().a(b, false).a(c, false).a(d, false).a(e, false));
		this.a = boolean2;
		this.a(aej.c);
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		if (!boolean7) {
			atl = this.c(atl, ajs, co);
		}

		a(co, bdt, list, f[0]);
		if ((Boolean)atl.c(b)) {
			a(co, bdt, list, f[a(cv.NORTH)]);
		}

		if ((Boolean)atl.c(d)) {
			a(co, bdt, list, f[a(cv.SOUTH)]);
		}

		if ((Boolean)atl.c(c)) {
			a(co, bdt, list, f[a(cv.EAST)]);
		}

		if ((Boolean)atl.c(e)) {
			a(co, bdt, list, f[a(cv.WEST)]);
		}
	}

	private static int a(cv cv) {
		return 1 << cv.b();
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		atl = this.c(atl, ajw, co);
		return f[i(atl)];
	}

	private static int i(atl atl) {
		int integer2 = 0;
		if ((Boolean)atl.c(b)) {
			integer2 |= a(cv.NORTH);
		}

		if ((Boolean)atl.c(c)) {
			integer2 |= a(cv.EAST);
		}

		if ((Boolean)atl.c(d)) {
			integer2 |= a(cv.SOUTH);
		}

		if ((Boolean)atl.c(e)) {
			integer2 |= a(cv.WEST);
		}

		return integer2;
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		return atl.a(b, this.c(ajw.o(co.c()).v())).a(d, this.c(ajw.o(co.d()).v())).a(e, this.c(ajw.o(co.e()).v())).a(c, this.c(ajw.o(co.f()).v()));
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return !this.a ? afl.a : super.a(atl, random, integer);
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
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		return ajw.o(co.a(cv)).v() == this ? false : super.a(atl, ajw, co, cv);
	}

	public final boolean c(alu alu) {
		return alu.t().h() || alu == this || alu == alv.w || alu == alv.cG || alu == alv.cH || alu instanceof arj;
	}

	@Override
	protected boolean n() {
		return true;
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT_MIPPED;
	}

	@Override
	public int e(atl atl) {
		return 0;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case CLOCKWISE_180:
				return atl.a(b, atl.c(d)).a(c, atl.c(e)).a(d, atl.c(b)).a(e, atl.c(c));
			case COUNTERCLOCKWISE_90:
				return atl.a(b, atl.c(c)).a(c, atl.c(d)).a(d, atl.c(e)).a(e, atl.c(b));
			case CLOCKWISE_90:
				return atl.a(b, atl.c(e)).a(c, atl.c(b)).a(d, atl.c(c)).a(e, atl.c(d));
			default:
				return atl;
		}
	}

	@Override
	public atl a(atl atl, aou aou) {
		switch (aou) {
			case LEFT_RIGHT:
				return atl.a(b, atl.c(d)).a(d, atl.c(b));
			case FRONT_BACK:
				return atl.a(c, atl.c(e)).a(e, atl.c(c));
			default:
				return super.a(atl, aou);
		}
	}

	@Override
	protected atm b() {
		return new atm(this, b, c, e, d);
	}
}
