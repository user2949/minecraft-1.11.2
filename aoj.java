import java.util.Random;

public class aoj extends alu {
	public static final atz<aoj.a> a = atz.a("variant", aoj.a.class);
	private final alu b;

	public aoj(azs azs, azt azt, alu alu) {
		super(azs, azt);
		this.y(this.A.b().a(a, aoj.a.ALL_OUTSIDE));
		this.b = alu;
	}

	@Override
	public int a(Random random) {
		return Math.max(0, random.nextInt(10) - 7);
	}

	@Override
	public azt r(atl atl) {
		switch ((aoj.a)atl.c(a)) {
			case ALL_STEM:
				return azt.e;
			case ALL_INSIDE:
				return azt.d;
			case STEM:
				return azt.d;
			default:
				return super.r(atl);
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afh.a(this.b);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(this.b);
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t();
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, aoj.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((aoj.a)atl.c(a)).a();
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case CLOCKWISE_180:
				switch ((aoj.a)atl.c(a)) {
					case STEM:
						break;
					case NORTH_WEST:
						return atl.a(a, aoj.a.SOUTH_EAST);
					case NORTH:
						return atl.a(a, aoj.a.SOUTH);
					case NORTH_EAST:
						return atl.a(a, aoj.a.SOUTH_WEST);
					case WEST:
						return atl.a(a, aoj.a.EAST);
					case EAST:
						return atl.a(a, aoj.a.WEST);
					case SOUTH_WEST:
						return atl.a(a, aoj.a.NORTH_EAST);
					case SOUTH:
						return atl.a(a, aoj.a.NORTH);
					case SOUTH_EAST:
						return atl.a(a, aoj.a.NORTH_WEST);
					default:
						return atl;
				}
			case COUNTERCLOCKWISE_90:
				switch ((aoj.a)atl.c(a)) {
					case STEM:
						break;
					case NORTH_WEST:
						return atl.a(a, aoj.a.SOUTH_WEST);
					case NORTH:
						return atl.a(a, aoj.a.WEST);
					case NORTH_EAST:
						return atl.a(a, aoj.a.NORTH_WEST);
					case WEST:
						return atl.a(a, aoj.a.SOUTH);
					case EAST:
						return atl.a(a, aoj.a.NORTH);
					case SOUTH_WEST:
						return atl.a(a, aoj.a.SOUTH_EAST);
					case SOUTH:
						return atl.a(a, aoj.a.EAST);
					case SOUTH_EAST:
						return atl.a(a, aoj.a.NORTH_EAST);
					default:
						return atl;
				}
			case CLOCKWISE_90:
				switch ((aoj.a)atl.c(a)) {
					case STEM:
						break;
					case NORTH_WEST:
						return atl.a(a, aoj.a.NORTH_EAST);
					case NORTH:
						return atl.a(a, aoj.a.EAST);
					case NORTH_EAST:
						return atl.a(a, aoj.a.SOUTH_EAST);
					case WEST:
						return atl.a(a, aoj.a.NORTH);
					case EAST:
						return atl.a(a, aoj.a.SOUTH);
					case SOUTH_WEST:
						return atl.a(a, aoj.a.NORTH_WEST);
					case SOUTH:
						return atl.a(a, aoj.a.WEST);
					case SOUTH_EAST:
						return atl.a(a, aoj.a.SOUTH_WEST);
					default:
						return atl;
				}
			default:
				return atl;
		}
	}

	@Override
	public atl a(atl atl, aou aou) {
		aoj.a a4 = atl.c(a);
		switch (aou) {
			case LEFT_RIGHT:
				switch (a4) {
					case NORTH_WEST:
						return atl.a(a, aoj.a.SOUTH_WEST);
					case NORTH:
						return atl.a(a, aoj.a.SOUTH);
					case NORTH_EAST:
						return atl.a(a, aoj.a.SOUTH_EAST);
					case WEST:
					case EAST:
					default:
						return super.a(atl, aou);
					case SOUTH_WEST:
						return atl.a(a, aoj.a.NORTH_WEST);
					case SOUTH:
						return atl.a(a, aoj.a.NORTH);
					case SOUTH_EAST:
						return atl.a(a, aoj.a.NORTH_EAST);
				}
			case FRONT_BACK:
				switch (a4) {
					case NORTH_WEST:
						return atl.a(a, aoj.a.NORTH_EAST);
					case NORTH:
					case SOUTH:
					default:
						break;
					case NORTH_EAST:
						return atl.a(a, aoj.a.NORTH_WEST);
					case WEST:
						return atl.a(a, aoj.a.EAST);
					case EAST:
						return atl.a(a, aoj.a.WEST);
					case SOUTH_WEST:
						return atl.a(a, aoj.a.SOUTH_EAST);
					case SOUTH_EAST:
						return atl.a(a, aoj.a.SOUTH_WEST);
				}
		}

		return super.a(atl, aou);
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public static enum a implements ox {
		NORTH_WEST(1, "north_west"),
		NORTH(2, "north"),
		NORTH_EAST(3, "north_east"),
		WEST(4, "west"),
		CENTER(5, "center"),
		EAST(6, "east"),
		SOUTH_WEST(7, "south_west"),
		SOUTH(8, "south"),
		SOUTH_EAST(9, "south_east"),
		STEM(10, "stem"),
		ALL_INSIDE(0, "all_inside"),
		ALL_OUTSIDE(14, "all_outside"),
		ALL_STEM(15, "all_stem");

		private static final aoj.a[] n = new aoj.a[16];
		private final int o;
		private final String p;

		private a(int integer3, String string4) {
			this.o = integer3;
			this.p = string4;
		}

		public int a() {
			return this.o;
		}

		public String toString() {
			return this.p;
		}

		public static aoj.a a(int integer) {
			if (integer < 0 || integer >= n.length) {
				integer = 0;
			}

			aoj.a a2 = n[integer];
			return a2 == null ? n[0] : a2;
		}

		@Override
		public String m() {
			return this.p;
		}

		static {
			for (aoj.a a4 : values()) {
				n[a4.a()] = a4;
			}
		}
	}
}
