import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class apd extends aor {
	public static final atz<apn.a> b = atz.a("variant", apn.a.class, new Predicate<apn.a>() {
		public boolean apply(@Nullable apn.a a) {
			return a.a() >= 4;
		}
	});

	public apd() {
		this.y(this.A.b().a(b, apn.a.ACACIA).a(a, aor.a.Y));
	}

	@Override
	public azt r(atl atl) {
		apn.a a3 = atl.c(b);
		switch ((aor.a)atl.c(a)) {
			case X:
			case Z:
			case NONE:
			default:
				switch (a3) {
					case ACACIA:
					default:
						return azt.m;
					case DARK_OAK:
						return apn.a.DARK_OAK.c();
				}
			case Y:
				return a3.c();
		}
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(afh, 1, apn.a.ACACIA.a() - 4));
		dd.add(new afj(afh, 1, apn.a.DARK_OAK.a() - 4));
	}

	@Override
	public atl a(int integer) {
		atl atl3 = this.t().a(b, apn.a.a((integer & 3) + 4));
		switch (integer & 12) {
			case 0:
				atl3 = atl3.a(a, aor.a.Y);
				break;
			case 4:
				atl3 = atl3.a(a, aor.a.X);
				break;
			case 8:
				atl3 = atl3.a(a, aor.a.Z);
				break;
			default:
				atl3 = atl3.a(a, aor.a.NONE);
		}

		return atl3;
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((apn.a)atl.c(b)).a() - 4;
		switch ((aor.a)atl.c(a)) {
			case X:
				integer3 |= 4;
				break;
			case Z:
				integer3 |= 8;
				break;
			case NONE:
				integer3 |= 12;
		}

		return integer3;
	}

	@Override
	protected atm b() {
		return new atm(this, b, a);
	}

	@Override
	protected afj w(atl atl) {
		return new afj(afh.a(this), 1, ((apn.a)atl.c(b)).a() - 4);
	}

	@Override
	public int d(atl atl) {
		return ((apn.a)atl.c(b)).a() - 4;
	}
}
