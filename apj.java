import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class apj extends aon {
	public static final atz<apn.a> e = atz.a("variant", apn.a.class, new Predicate<apn.a>() {
		public boolean apply(@Nullable apn.a a) {
			return a.a() < 4;
		}
	});

	public apj() {
		this.y(this.A.b().a(e, apn.a.OAK).a(b, true).a(a, true));
	}

	@Override
	protected void a(ajs ajs, co co, atl atl, int integer) {
		if (atl.c(e) == apn.a.OAK && ajs.r.nextInt(integer) == 0) {
			a(ajs, co, new afj(afl.f));
		}
	}

	@Override
	protected int i(atl atl) {
		return atl.c(e) == apn.a.JUNGLE ? 40 : super.i(atl);
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(afh, 1, apn.a.OAK.a()));
		dd.add(new afj(afh, 1, apn.a.SPRUCE.a()));
		dd.add(new afj(afh, 1, apn.a.BIRCH.a()));
		dd.add(new afj(afh, 1, apn.a.JUNGLE.a()));
	}

	@Override
	protected afj w(atl atl) {
		return new afj(afh.a(this), 1, ((apn.a)atl.c(e)).a());
	}

	@Override
	public atl a(int integer) {
		return this.t().a(e, this.e(integer)).a(a, (integer & 4) == 0).a(b, (integer & 8) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((apn.a)atl.c(e)).a();
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
		return apn.a.a((integer & 3) % 4);
	}

	@Override
	protected atm b() {
		return new atm(this, e, b, a);
	}

	@Override
	public int d(atl atl) {
		return ((apn.a)atl.c(e)).a();
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		if (!ajs.E && afj.c() == afl.bm) {
			aay.b(oa.a(this));
			a(ajs, co, new afj(afh.a(this), 1, ((apn.a)atl.c(e)).a()));
		} else {
			super.a(ajs, aay, co, atl, asc, afj);
		}
	}
}
