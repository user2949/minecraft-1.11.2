import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class apr extends alq {
	public static final atz<alq.b> d = atz.a("shape", alq.b.class, new Predicate<alq.b>() {
		public boolean apply(@Nullable alq.b b) {
			return b != alq.b.NORTH_EAST && b != alq.b.NORTH_WEST && b != alq.b.SOUTH_EAST && b != alq.b.SOUTH_WEST;
		}
	});
	public static final atx e = atx.a("powered");

	protected apr() {
		super(true);
		this.y(this.A.b().a(d, alq.b.NORTH_SOUTH).a(e, false));
	}

	protected boolean a(ajs ajs, co co, atl atl, boolean boolean4, int integer) {
		if (integer >= 8) {
			return false;
		} else {
			int integer7 = co.p();
			int integer8 = co.q();
			int integer9 = co.r();
			boolean boolean10 = true;
			alq.b b11 = atl.c(d);
			switch (b11) {
				case NORTH_SOUTH:
					if (boolean4) {
						integer9++;
					} else {
						integer9--;
					}
					break;
				case EAST_WEST:
					if (boolean4) {
						integer7--;
					} else {
						integer7++;
					}
					break;
				case ASCENDING_EAST:
					if (boolean4) {
						integer7--;
					} else {
						integer7++;
						integer8++;
						boolean10 = false;
					}

					b11 = alq.b.EAST_WEST;
					break;
				case ASCENDING_WEST:
					if (boolean4) {
						integer7--;
						integer8++;
						boolean10 = false;
					} else {
						integer7++;
					}

					b11 = alq.b.EAST_WEST;
					break;
				case ASCENDING_NORTH:
					if (boolean4) {
						integer9++;
					} else {
						integer9--;
						integer8++;
						boolean10 = false;
					}

					b11 = alq.b.NORTH_SOUTH;
					break;
				case ASCENDING_SOUTH:
					if (boolean4) {
						integer9++;
						integer8++;
						boolean10 = false;
					} else {
						integer9--;
					}

					b11 = alq.b.NORTH_SOUTH;
			}

			return this.a(ajs, new co(integer7, integer8, integer9), boolean4, integer, b11)
				? true
				: boolean10 && this.a(ajs, new co(integer7, integer8 - 1, integer9), boolean4, integer, b11);
		}
	}

	protected boolean a(ajs ajs, co co, boolean boolean3, int integer, alq.b b) {
		atl atl7 = ajs.o(co);
		if (atl7.v() != this) {
			return false;
		} else {
			alq.b b8 = atl7.c(d);
			if (b != alq.b.EAST_WEST || b8 != alq.b.NORTH_SOUTH && b8 != alq.b.ASCENDING_NORTH && b8 != alq.b.ASCENDING_SOUTH) {
				if (b != alq.b.NORTH_SOUTH || b8 != alq.b.EAST_WEST && b8 != alq.b.ASCENDING_EAST && b8 != alq.b.ASCENDING_WEST) {
					if (!(Boolean)atl7.c(e)) {
						return false;
					} else {
						return ajs.y(co) ? true : this.a(ajs, co, atl7, boolean3, integer + 1);
					}
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@Override
	protected void a(atl atl, ajs ajs, co co, alu alu) {
		boolean boolean6 = (Boolean)atl.c(e);
		boolean boolean7 = ajs.y(co) || this.a(ajs, co, atl, true, 0) || this.a(ajs, co, atl, false, 0);
		if (boolean7 != boolean6) {
			ajs.a(co, atl.a(e, boolean7), 3);
			ajs.b(co.b(), this, false);
			if (((alq.b)atl.c(d)).c()) {
				ajs.b(co.a(), this, false);
			}
		}
	}

	@Override
	public aub<alq.b> g() {
		return d;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(d, alq.b.a(integer & 7)).a(e, (integer & 8) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((alq.b)atl.c(d)).a();
		if ((Boolean)atl.c(e)) {
			integer3 |= 8;
		}

		return integer3;
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
					case NORTH_SOUTH:
						return atl.a(d, alq.b.EAST_WEST);
					case EAST_WEST:
						return atl.a(d, alq.b.NORTH_SOUTH);
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
				}
			case CLOCKWISE_90:
				switch ((alq.b)atl.c(d)) {
					case NORTH_SOUTH:
						return atl.a(d, alq.b.EAST_WEST);
					case EAST_WEST:
						return atl.a(d, alq.b.NORTH_SOUTH);
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
		return new atm(this, d, e);
	}
}
