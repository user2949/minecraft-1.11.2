import javax.annotation.Nullable;

public class aop extends alu {
	public static final atz<aop.a> a = atz.a("facing", aop.a.class);
	public static final atx b = atx.a("powered");
	protected static final bdt c = new bdt(0.3125, 0.2F, 0.625, 0.6875, 0.8F, 1.0);
	protected static final bdt d = new bdt(0.3125, 0.2F, 0.0, 0.6875, 0.8F, 0.375);
	protected static final bdt e = new bdt(0.625, 0.2F, 0.3125, 1.0, 0.8F, 0.6875);
	protected static final bdt f = new bdt(0.0, 0.2F, 0.3125, 0.375, 0.8F, 0.6875);
	protected static final bdt g = new bdt(0.25, 0.0, 0.25, 0.75, 0.6F, 0.75);
	protected static final bdt B = new bdt(0.25, 0.4F, 0.25, 0.75, 1.0, 0.75);

	protected aop() {
		super(azs.q);
		this.y(this.A.b().a(a, aop.a.NORTH).a(b, false));
		this.a(aej.d);
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

	@Override
	public boolean b(ajs ajs, co co, cv cv) {
		return a(ajs, co, cv.d());
	}

	@Override
	public boolean a(ajs ajs, co co) {
		for (cv cv7 : cv.values()) {
			if (a(ajs, co, cv7)) {
				return true;
			}
		}

		return false;
	}

	protected static boolean a(ajs ajs, co co, cv cv) {
		return amb.a(ajs, co, cv);
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		atl atl10 = this.t().a(b, false);
		if (a(ajs, co, cv.d())) {
			return atl10.a(a, aop.a.a(cv, sw.bl()));
		} else {
			for (cv cv12 : cv.c.HORIZONTAL) {
				if (cv12 != cv && a(ajs, co, cv12.d())) {
					return atl10.a(a, aop.a.a(cv12, sw.bl()));
				}
			}

			return ajs.o(co.b()).r() ? atl10.a(a, aop.a.a(cv.UP, sw.bl())) : atl10;
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (this.e(ajs, co3, atl) && !a(ajs, co3, ((aop.a)atl.c(a)).c().d())) {
			this.b(ajs, co3, atl, 0);
			ajs.g(co3);
		}
	}

	private boolean e(ajs ajs, co co, atl atl) {
		if (this.a(ajs, co)) {
			return true;
		} else {
			this.b(ajs, co, atl, 0);
			ajs.g(co);
			return false;
		}
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		switch ((aop.a)atl.c(a)) {
			case EAST:
			default:
				return f;
			case WEST:
				return e;
			case SOUTH:
				return d;
			case NORTH:
				return c;
			case UP_Z:
			case UP_X:
				return g;
			case DOWN_X:
			case DOWN_Z:
				return B;
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			atl = atl.a(b);
			ajs.a(co, atl, 3);
			float float11 = atl.c(b) ? 0.6F : 0.5F;
			ajs.a(null, co, nn.dv, no.BLOCKS, 0.3F, float11);
			ajs.b(co, this, false);
			cv cv12 = ((aop.a)atl.c(a)).c();
			ajs.b(co.a(cv12.d()), this, false);
			return true;
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		if ((Boolean)atl.c(b)) {
			ajs.b(co, this, false);
			cv cv5 = ((aop.a)atl.c(a)).c();
			ajs.b(co.a(cv5.d()), this, false);
		}

		super.b(ajs, co, atl);
	}

	@Override
	public int b(atl atl, ajw ajw, co co, cv cv) {
		return atl.c(b) ? 15 : 0;
	}

	@Override
	public int c(atl atl, ajw ajw, co co, cv cv) {
		if (!(Boolean)atl.c(b)) {
			return 0;
		} else {
			return ((aop.a)atl.c(a)).c() == cv ? 15 : 0;
		}
	}

	@Override
	public boolean g(atl atl) {
		return true;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, aop.a.a(integer & 7)).a(b, (integer & 8) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((aop.a)atl.c(a)).a();
		if ((Boolean)atl.c(b)) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case CLOCKWISE_180:
				switch ((aop.a)atl.c(a)) {
					case EAST:
						return atl.a(a, aop.a.WEST);
					case WEST:
						return atl.a(a, aop.a.EAST);
					case SOUTH:
						return atl.a(a, aop.a.NORTH);
					case NORTH:
						return atl.a(a, aop.a.SOUTH);
					default:
						return atl;
				}
			case COUNTERCLOCKWISE_90:
				switch ((aop.a)atl.c(a)) {
					case EAST:
						return atl.a(a, aop.a.NORTH);
					case WEST:
						return atl.a(a, aop.a.SOUTH);
					case SOUTH:
						return atl.a(a, aop.a.EAST);
					case NORTH:
						return atl.a(a, aop.a.WEST);
					case UP_Z:
						return atl.a(a, aop.a.UP_X);
					case UP_X:
						return atl.a(a, aop.a.UP_Z);
					case DOWN_X:
						return atl.a(a, aop.a.DOWN_Z);
					case DOWN_Z:
						return atl.a(a, aop.a.DOWN_X);
				}
			case CLOCKWISE_90:
				switch ((aop.a)atl.c(a)) {
					case EAST:
						return atl.a(a, aop.a.SOUTH);
					case WEST:
						return atl.a(a, aop.a.NORTH);
					case SOUTH:
						return atl.a(a, aop.a.WEST);
					case NORTH:
						return atl.a(a, aop.a.EAST);
					case UP_Z:
						return atl.a(a, aop.a.UP_X);
					case UP_X:
						return atl.a(a, aop.a.UP_Z);
					case DOWN_X:
						return atl.a(a, aop.a.DOWN_Z);
					case DOWN_Z:
						return atl.a(a, aop.a.DOWN_X);
				}
			default:
				return atl;
		}
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(((aop.a)atl.c(a)).c()));
	}

	@Override
	protected atm b() {
		return new atm(this, a, b);
	}

	public static enum a implements ox {
		DOWN_X(0, "down_x", cv.DOWN),
		EAST(1, "east", cv.EAST),
		WEST(2, "west", cv.WEST),
		SOUTH(3, "south", cv.SOUTH),
		NORTH(4, "north", cv.NORTH),
		UP_Z(5, "up_z", cv.UP),
		UP_X(6, "up_x", cv.UP),
		DOWN_Z(7, "down_z", cv.DOWN);

		private static final aop.a[] i = new aop.a[values().length];
		private final int j;
		private final String k;
		private final cv l;

		private a(int integer3, String string4, cv cv) {
			this.j = integer3;
			this.k = string4;
			this.l = cv;
		}

		public int a() {
			return this.j;
		}

		public cv c() {
			return this.l;
		}

		public String toString() {
			return this.k;
		}

		public static aop.a a(int integer) {
			if (integer < 0 || integer >= i.length) {
				integer = 0;
			}

			return i[integer];
		}

		public static aop.a a(cv cv1, cv cv2) {
			switch (cv1) {
				case DOWN:
					switch (cv2.k()) {
						case X:
							return DOWN_X;
						case Z:
							return DOWN_Z;
						default:
							throw new IllegalArgumentException("Invalid entityFacing " + cv2 + " for facing " + cv1);
					}
				case UP:
					switch (cv2.k()) {
						case X:
							return UP_X;
						case Z:
							return UP_Z;
						default:
							throw new IllegalArgumentException("Invalid entityFacing " + cv2 + " for facing " + cv1);
					}
				case NORTH:
					return NORTH;
				case SOUTH:
					return SOUTH;
				case WEST:
					return WEST;
				case EAST:
					return EAST;
				default:
					throw new IllegalArgumentException("Invalid facing: " + cv1);
			}
		}

		@Override
		public String m() {
			return this.k;
		}

		static {
			for (aop.a a4 : values()) {
				i[a4.a()] = a4;
			}
		}
	}
}
