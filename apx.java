public class apx extends alq {
	public static final atz<alq.b> d = atz.a("shape", alq.b.class);

	protected apx() {
		super(false);
		this.y(this.A.b().a(d, alq.b.NORTH_SOUTH));
	}

	@Override
	protected void a(atl atl, ajs ajs, co co, alu alu) {
		if (alu.t().n() && new alq.a(this, ajs, co, atl).b() == 3) {
			this.a(ajs, co, atl, false);
		}
	}

	@Override
	public aub<alq.b> g() {
		return d;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(d, alq.b.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((alq.b)atl.c(d)).a();
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case CLOCKWISE_180:
				switch ((alq.b)atl.c(d)) {
					case ASCENDING_EAST:
						return atl.a(d, alq.b.ASCENDING_WEST);
					case ASCENDING_WEST:
						return atl.a(d, alq.b.ASCENDING_EAST);
					case ASCENDING_NORTH:
						return atl.a(d, alq.b.ASCENDING_SOUTH);
					case ASCENDING_SOUTH:
						return atl.a(d, alq.b.ASCENDING_NORTH);
					case SOUTH_EAST:
						return atl.a(d, alq.b.NORTH_WEST);
					case SOUTH_WEST:
						return atl.a(d, alq.b.NORTH_EAST);
					case NORTH_WEST:
						return atl.a(d, alq.b.SOUTH_EAST);
					case NORTH_EAST:
						return atl.a(d, alq.b.SOUTH_WEST);
				}
			case COUNTERCLOCKWISE_90:
				switch ((alq.b)atl.c(d)) {
					case ASCENDING_EAST:
						return atl.a(d, alq.b.ASCENDING_NORTH);
					case ASCENDING_WEST:
						return atl.a(d, alq.b.ASCENDING_SOUTH);
					case ASCENDING_NORTH:
						return atl.a(d, alq.b.ASCENDING_WEST);
					case ASCENDING_SOUTH:
						return atl.a(d, alq.b.ASCENDING_EAST);
					case SOUTH_EAST:
						return atl.a(d, alq.b.NORTH_EAST);
					case SOUTH_WEST:
						return atl.a(d, alq.b.SOUTH_EAST);
					case NORTH_WEST:
						return atl.a(d, alq.b.SOUTH_WEST);
					case NORTH_EAST:
						return atl.a(d, alq.b.NORTH_WEST);
					case NORTH_SOUTH:
						return atl.a(d, alq.b.EAST_WEST);
					case EAST_WEST:
						return atl.a(d, alq.b.NORTH_SOUTH);
				}
			case CLOCKWISE_90:
				switch ((alq.b)atl.c(d)) {
					case ASCENDING_EAST:
						return atl.a(d, alq.b.ASCENDING_SOUTH);
					case ASCENDING_WEST:
						return atl.a(d, alq.b.ASCENDING_NORTH);
					case ASCENDING_NORTH:
						return atl.a(d, alq.b.ASCENDING_EAST);
					case ASCENDING_SOUTH:
						return atl.a(d, alq.b.ASCENDING_WEST);
					case SOUTH_EAST:
						return atl.a(d, alq.b.SOUTH_WEST);
					case SOUTH_WEST:
						return atl.a(d, alq.b.NORTH_WEST);
					case NORTH_WEST:
						return atl.a(d, alq.b.NORTH_EAST);
					case NORTH_EAST:
						return atl.a(d, alq.b.SOUTH_EAST);
					case NORTH_SOUTH:
						return atl.a(d, alq.b.EAST_WEST);
					case EAST_WEST:
						return atl.a(d, alq.b.NORTH_SOUTH);
				}
			default:
				return atl;
		}
	}

	@Override
	public atl a(atl atl, aou aou) {
		alq.b b4 = atl.c(d);
		switch (aou) {
			case LEFT_RIGHT:
				switch (b4) {
					case ASCENDING_NORTH:
						return atl.a(d, alq.b.ASCENDING_SOUTH);
					case ASCENDING_SOUTH:
						return atl.a(d, alq.b.ASCENDING_NORTH);
					case SOUTH_EAST:
						return atl.a(d, alq.b.NORTH_EAST);
					case SOUTH_WEST:
						return atl.a(d, alq.b.NORTH_WEST);
					case NORTH_WEST:
						return atl.a(d, alq.b.SOUTH_WEST);
					case NORTH_EAST:
						return atl.a(d, alq.b.SOUTH_EAST);
					default:
						return super.a(atl, aou);
				}
			case FRONT_BACK:
				switch (b4) {
					case ASCENDING_EAST:
						return atl.a(d, alq.b.ASCENDING_WEST);
					case ASCENDING_WEST:
						return atl.a(d, alq.b.ASCENDING_EAST);
					case ASCENDING_NORTH:
					case ASCENDING_SOUTH:
					default:
						break;
					case SOUTH_EAST:
						return atl.a(d, alq.b.SOUTH_WEST);
					case SOUTH_WEST:
						return atl.a(d, alq.b.SOUTH_EAST);
					case NORTH_WEST:
						return atl.a(d, alq.b.NORTH_EAST);
					case NORTH_EAST:
						return atl.a(d, alq.b.NORTH_WEST);
				}
		}

		return super.a(atl, aou);
	}

	@Override
	protected atm b() {
		return new atm(this, d);
	}
}
