import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ams extends alq {
	public static final atz<alq.b> d = atz.a("shape", alq.b.class, new Predicate<alq.b>() {
		public boolean apply(@Nullable alq.b b) {
			return b != alq.b.NORTH_EAST && b != alq.b.NORTH_WEST && b != alq.b.SOUTH_EAST && b != alq.b.SOUTH_WEST;
		}
	});
	public static final atx e = atx.a("powered");

	public ams() {
		super(true);
		this.y(this.A.b().a(e, false).a(d, alq.b.NORTH_SOUTH));
		this.a(true);
	}

	@Override
	public int a(ajs ajs) {
		return 20;
	}

	@Override
	public boolean g(atl atl) {
		return true;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sn sn) {
		if (!ajs.E) {
			if (!(Boolean)atl.c(e)) {
				this.e(ajs, co, atl);
			}
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, Random random) {
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E && (Boolean)atl.c(e)) {
			this.e(ajs, co, atl);
		}
	}

	@Override
	public int b(atl atl, ajw ajw, co co, cv cv) {
		return atl.c(e) ? 15 : 0;
	}

	@Override
	public int c(atl atl, ajw ajw, co co, cv cv) {
		if (!(Boolean)atl.c(e)) {
			return 0;
		} else {
			return cv == cv.UP ? 15 : 0;
		}
	}

	private void e(ajs ajs, co co, atl atl) {
		boolean boolean5 = (Boolean)atl.c(e);
		boolean boolean6 = false;
		List<aby> list7 = this.a(ajs, co, aby.class);
		if (!list7.isEmpty()) {
			boolean6 = true;
		}

		if (boolean6 && !boolean5) {
			ajs.a(co, atl.a(e, true), 3);
			this.b(ajs, co, atl, true);
			ajs.b(co, this, false);
			ajs.b(co.b(), this, false);
			ajs.b(co, co);
		}

		if (!boolean6 && boolean5) {
			ajs.a(co, atl.a(e, false), 3);
			this.b(ajs, co, atl, false);
			ajs.b(co, this, false);
			ajs.b(co.b(), this, false);
			ajs.b(co, co);
		}

		if (boolean6) {
			ajs.a(new co(co), this, this.a(ajs));
		}

		ajs.d(co, this);
	}

	protected void b(ajs ajs, co co, atl atl, boolean boolean4) {
		alq.a a6 = new alq.a(this, ajs, co, atl);

		for (co co9 : a6.a()) {
			atl atl10 = ajs.o(co9);
			if (atl10 != null) {
				atl10.a(ajs, co9, atl10.v(), co);
			}
		}
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		super.c(ajs, co, atl);
		this.e(ajs, co, atl);
	}

	@Override
	public aub<alq.b> g() {
		return d;
	}

	@Override
	public boolean x(atl atl) {
		return true;
	}

	@Override
	public int c(atl atl, ajs ajs, co co) {
		if ((Boolean)atl.c(e)) {
			List<aca> list5 = this.a(ajs, co, aca.class);
			if (!list5.isEmpty()) {
				return ((aca)list5.get(0)).j().k();
			}

			List<aby> list6 = this.a(ajs, co, aby.class, sr.c);
			if (!list6.isEmpty()) {
				return acl.b((rc)list6.get(0));
			}
		}

		return 0;
	}

	protected <T extends aby> List<T> a(ajs ajs, co co, Class<T> class3, Predicate<sn>... arr) {
		bdt bdt6 = this.a(co);
		return arr.length != 1 ? ajs.a(class3, bdt6) : ajs.a(class3, bdt6, arr[0]);
	}

	private bdt a(co co) {
		float float3 = 0.2F;
		return new bdt(
			(double)((float)co.p() + 0.2F),
			(double)co.q(),
			(double)((float)co.r() + 0.2F),
			(double)((float)(co.p() + 1) - 0.2F),
			(double)((float)(co.q() + 1) - 0.2F),
			(double)((float)(co.r() + 1) - 0.2F)
		);
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
		return new atm(this, d, e);
	}
}
