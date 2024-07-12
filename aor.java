public abstract class aor extends aqh {
	public static final atz<aor.a> a = atz.a("axis", aor.a.class);

	public aor() {
		super(azs.d);
		this.a(aej.b);
		this.c(2.0F);
		this.a(aqu.a);
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		int integer5 = 4;
		int integer6 = 5;
		if (ajs.a(co.a(-5, -5, -5), co.a(5, 5, 5))) {
			for (co co8 : co.a(co.a(-4, -4, -4), co.a(4, 4, 4))) {
				atl atl9 = ajs.o(co8);
				if (atl9.a() == azs.j && !(Boolean)atl9.c(aon.b)) {
					ajs.a(co8, atl9.a(aon.b, true), 4);
				}
			}
		}
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.a(integer).a(a, aor.a.a(cv.k()));
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case COUNTERCLOCKWISE_90:
			case CLOCKWISE_90:
				switch ((aor.a)atl.c(a)) {
					case X:
						return atl.a(a, aor.a.Z);
					case Z:
						return atl.a(a, aor.a.X);
					default:
						return atl;
				}
			default:
				return atl;
		}
	}

	public static enum a implements ox {
		X("x"),
		Y("y"),
		Z("z"),
		NONE("none");

		private final String e;

		private a(String string3) {
			this.e = string3;
		}

		public String toString() {
			return this.e;
		}

		public static aor.a a(cv.a a) {
			switch (a) {
				case X:
					return X;
				case Y:
					return Y;
				case Z:
					return Z;
				default:
					return NONE;
			}
		}

		@Override
		public String m() {
			return this.e;
		}
	}
}
