import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class apc extends aon {
	public static final atz<apn.a> e = atz.a("variant", apn.a.class, new Predicate<apn.a>() {
		public boolean apply(@Nullable apn.a a) {
			return a.a() >= 4;
		}
	});

	public apc() {
		this.y(this.A.b().a(e, apn.a.ACACIA).a(b, true).a(a, true));
	}

	@Override
	protected void a(ajs ajs, co co, atl atl, int integer) {
		if (atl.c(e) == apn.a.DARK_OAK && ajs.r.nextInt(integer) == 0) {
			a(ajs, co, new afj(afl.f));
		}
	}

	@Override
	public int d(atl atl) {
		return ((apn.a)atl.c(e)).a();
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(this, 1, atl.v().e(atl) & 3);
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(afh, 1, 0));
		dd.add(new afj(afh, 1, 1));
	}

	@Override
	protected afj w(atl atl) {
		return new afj(afh.a(this), 1, ((apn.a)atl.c(e)).a() - 4);
	}

	@Override
	public atl a(int integer) {
		return this.t().a(e, this.e(integer)).a(a, (integer & 4) == 0).a(b, (integer & 8) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((apn.a)atl.c(e)).a() - 4;
		if (!(Boolean)atl.c(a)) {
			integer3 |= 4;
		}

		if ((Boolean)atl.c(b)) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	public apn.a e(int integer) {
		return apn.a.a((integer & 3) + 4);
	}

	@Override
	protected atm b() {
		return new atm(this, e, b, a);
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		if (!ajs.E && afj.c() == afl.bm) {
			aay.b(oa.a(this));
			a(ajs, co, new afj(afh.a(this), 1, ((apn.a)atl.c(e)).a() - 4));
		} else {
			super.a(ajs, aay, co, atl, asc, afj);
		}
	}
}
