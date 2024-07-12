import java.util.Random;
import javax.annotation.Nullable;

public class alm extends alo {
	public static final aty a = aoi.D;
	public static final aua b = aua.a("rotation", 0, 15);
	protected static final bdt c = new bdt(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);

	protected alm() {
		super(azs.d);
	}

	@Override
	public String c() {
		return dp.a("item.banner.white.name");
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean b(ajw ajw, co co) {
		return true;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean d() {
		return true;
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new arz();
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.cP;
	}

	private afj c(ajs ajs, co co) {
		asc asc4 = ajs.r(co);
		return asc4 instanceof arz ? ((arz)asc4).l() : afj.a;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		afj afj5 = this.c(ajs, co);
		return afj5.b() ? new afj(afl.cP) : afj5;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		afj afj7 = this.c(ajs, co);
		if (afj7.b()) {
			super.a(ajs, co, atl, float4, integer);
		} else {
			a(ajs, co, afj7);
		}
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return !this.b(ajs, co) && super.a(ajs, co);
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		if (asc instanceof arz) {
			arz arz8 = (arz)asc;
			afj afj9 = arz8.l();
			a(ajs, co, afj9);
		} else {
			super.a(ajs, aay, co, atl, null, afj);
		}
	}

	public static class a extends alm {
		public a() {
			this.y(this.A.b().a(b, 0));
		}

		@Override
		public bdt b(atl atl, ajw ajw, co co) {
			return c;
		}

		@Override
		public atl a(atl atl, aqi aqi) {
			return atl.a(b, aqi.a((Integer)atl.c(b), 16));
		}

		@Override
		public atl a(atl atl, aou aou) {
			return atl.a(b, aou.a((Integer)atl.c(b), 16));
		}

		@Override
		public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
			if (!ajs.o(co3.b()).a().a()) {
				this.b(ajs, co3, atl, 0);
				ajs.g(co3);
			}

			super.a(atl, ajs, co3, alu, co5);
		}

		@Override
		public atl a(int integer) {
			return this.t().a(b, integer);
		}

		@Override
		public int e(atl atl) {
			return (Integer)atl.c(b);
		}

		@Override
		protected atm b() {
			return new atm(this, b);
		}
	}

	public static class b extends alm {
		protected static final bdt d = new bdt(0.0, 0.0, 0.875, 1.0, 0.78125, 1.0);
		protected static final bdt e = new bdt(0.0, 0.0, 0.0, 1.0, 0.78125, 0.125);
		protected static final bdt f = new bdt(0.875, 0.0, 0.0, 1.0, 0.78125, 1.0);
		protected static final bdt g = new bdt(0.0, 0.0, 0.0, 0.125, 0.78125, 1.0);

		public b() {
			this.y(this.A.b().a(a, cv.NORTH));
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
		public bdt b(atl atl, ajw ajw, co co) {
			switch ((cv)atl.c(a)) {
				case NORTH:
				default:
					return d;
				case SOUTH:
					return e;
				case WEST:
					return f;
				case EAST:
					return g;
			}
		}

		@Override
		public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
			cv cv7 = atl.c(a);
			if (!ajs.o(co3.a(cv7.d())).a().a()) {
				this.b(ajs, co3, atl, 0);
				ajs.g(co3);
			}

			super.a(atl, ajs, co3, alu, co5);
		}

		@Override
		public atl a(int integer) {
			cv cv3 = cv.a(integer);
			if (cv3.k() == cv.a.Y) {
				cv3 = cv.NORTH;
			}

			return this.t().a(a, cv3);
		}

		@Override
		public int e(atl atl) {
			return ((cv)atl.c(a)).a();
		}

		@Override
		protected atm b() {
			return new atm(this, a);
		}
	}
}
