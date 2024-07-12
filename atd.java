import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class atd extends amu {
	public static final atz<atd.a> a = atz.a("type", atd.a.class);
	public static final atx b = atx.a("short");
	protected static final bdt c = new bdt(0.75, 0.0, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt d = new bdt(0.0, 0.0, 0.0, 0.25, 1.0, 1.0);
	protected static final bdt e = new bdt(0.0, 0.0, 0.75, 1.0, 1.0, 1.0);
	protected static final bdt f = new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 0.25);
	protected static final bdt g = new bdt(0.0, 0.75, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt B = new bdt(0.0, 0.0, 0.0, 1.0, 0.25, 1.0);
	protected static final bdt C = new bdt(0.375, -0.25, 0.375, 0.625, 0.75, 0.625);
	protected static final bdt D = new bdt(0.375, 0.25, 0.375, 0.625, 1.25, 0.625);
	protected static final bdt E = new bdt(0.375, 0.375, -0.25, 0.625, 0.625, 0.75);
	protected static final bdt F = new bdt(0.375, 0.375, 0.25, 0.625, 0.625, 1.25);
	protected static final bdt G = new bdt(-0.25, 0.375, 0.375, 0.75, 0.625, 0.625);
	protected static final bdt I = new bdt(0.25, 0.375, 0.375, 1.25, 0.625, 0.625);
	protected static final bdt J = new bdt(0.375, 0.0, 0.375, 0.625, 0.75, 0.625);
	protected static final bdt K = new bdt(0.375, 0.25, 0.375, 0.625, 1.0, 0.625);
	protected static final bdt L = new bdt(0.375, 0.375, 0.0, 0.625, 0.625, 0.75);
	protected static final bdt M = new bdt(0.375, 0.375, 0.25, 0.625, 0.625, 1.0);
	protected static final bdt N = new bdt(0.0, 0.375, 0.375, 0.75, 0.625, 0.625);
	protected static final bdt O = new bdt(0.25, 0.375, 0.375, 1.0, 0.625, 0.625);

	public atd() {
		super(azs.H);
		this.y(this.A.b().a(H, cv.NORTH).a(a, atd.a.DEFAULT).a(b, false));
		this.a(aqu.d);
		this.c(0.5F);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		switch ((cv)atl.c(H)) {
			case DOWN:
			default:
				return B;
			case UP:
				return g;
			case NORTH:
				return f;
			case SOUTH:
				return e;
			case WEST:
				return d;
			case EAST:
				return c;
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		a(co, bdt, list, atl.d(ajs, co));
		a(co, bdt, list, this.i(atl));
	}

	private bdt i(atl atl) {
		boolean boolean3 = (Boolean)atl.c(b);
		switch ((cv)atl.c(H)) {
			case DOWN:
			default:
				return boolean3 ? K : D;
			case UP:
				return boolean3 ? J : C;
			case NORTH:
				return boolean3 ? M : F;
			case SOUTH:
				return boolean3 ? L : E;
			case WEST:
				return boolean3 ? O : I;
			case EAST:
				return boolean3 ? N : G;
		}
	}

	@Override
	public boolean k(atl atl) {
		return atl.c(H) == cv.UP;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, aay aay) {
		if (aay.bK.d) {
			co co6 = co.a(((cv)atl.c(H)).d());
			alu alu7 = ajs.o(co6).v();
			if (alu7 == alv.J || alu7 == alv.F) {
				ajs.g(co6);
			}
		}

		super.a(ajs, co, atl, aay);
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		super.b(ajs, co, atl);
		cv cv5 = ((cv)atl.c(H)).d();
		co = co.a(cv5);
		atl atl6 = ajs.o(co);
		if ((atl6.v() == alv.J || atl6.v() == alv.F) && (Boolean)atl6.c(atc.a)) {
			atl6.v().b(ajs, co, atl6, 0);
			ajs.g(co);
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
	public boolean a(ajs ajs, co co) {
		return false;
	}

	@Override
	public boolean b(ajs ajs, co co, cv cv) {
		return false;
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		cv cv7 = atl.c(H);
		co co8 = co3.a(cv7.d());
		atl atl9 = ajs.o(co8);
		if (atl9.v() != alv.J && atl9.v() != alv.F) {
			ajs.g(co3);
		} else {
			atl9.a(ajs, co8, alu, co5);
		}
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		return true;
	}

	@Nullable
	public static cv e(int integer) {
		int integer2 = integer & 7;
		return integer2 > 5 ? null : cv.a(integer2);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(atl.c(a) == atd.a.STICKY ? alv.F : alv.J);
	}

	@Override
	public atl a(int integer) {
		return this.t().a(H, e(integer)).a(a, (integer & 8) > 0 ? atd.a.STICKY : atd.a.DEFAULT);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(H)).a();
		if (atl.c(a) == atd.a.STICKY) {
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
		return new atm(this, H, a, b);
	}

	public static enum a implements ox {
		DEFAULT("normal"),
		STICKY("sticky");

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
