import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class apu extends aoi {
	private atp a;
	private atp b;
	private atp c;
	private atp d;
	private static final Predicate<atl> e = new Predicate<atl>() {
		public boolean apply(@Nullable atl atl) {
			return atl != null && (atl.v() == alv.aU || atl.v() == alv.aZ);
		}
	};

	protected apu() {
		super(azs.C, azt.q);
		this.y(this.A.b().a(D, cv.NORTH));
		this.a(true);
		this.a(aej.b);
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		super.c(ajs, co, atl);
		this.c(ajs, co);
	}

	public boolean b(ajs ajs, co co) {
		return this.e().a(ajs, co) != null || this.h().a(ajs, co) != null;
	}

	private void c(ajs ajs, co co) {
		atp.b b4 = this.g().a(ajs, co);
		if (b4 != null) {
			for (int integer5 = 0; integer5 < this.g().b(); integer5++) {
				ato ato6 = b4.a(0, integer5, 0);
				ajs.a(ato6.d(), alv.a.t(), 2);
			}

			xg xg5 = new xg(ajs);
			co co6 = b4.a(0, 2, 0).d();
			xg5.b((double)co6.p() + 0.5, (double)co6.q() + 0.05, (double)co6.r() + 0.5, 0.0F, 0.0F);
			ajs.a(xg5);

			for (int integer7 = 0; integer7 < 120; integer7++) {
				ajs.a(de.SNOW_SHOVEL, (double)co6.p() + ajs.r.nextDouble(), (double)co6.q() + ajs.r.nextDouble() * 2.5, (double)co6.r() + ajs.r.nextDouble(), 0.0, 0.0, 0.0);
			}

			for (int integer7 = 0; integer7 < this.g().b(); integer7++) {
				ato ato8 = b4.a(0, integer7, 0);
				ajs.a(ato8.d(), alv.a, false);
			}
		} else {
			b4 = this.i().a(ajs, co);
			if (b4 != null) {
				for (int integer5 = 0; integer5 < this.i().c(); integer5++) {
					for (int integer6 = 0; integer6 < this.i().b(); integer6++) {
						ajs.a(b4.a(integer5, integer6, 0).d(), alv.a.t(), 2);
					}
				}

				co co5 = b4.a(1, 2, 0).d();
				xi xi6 = new xi(ajs);
				xi6.p(true);
				xi6.b((double)co5.p() + 0.5, (double)co5.q() + 0.05, (double)co5.r() + 0.5, 0.0F, 0.0F);
				ajs.a(xi6);

				for (int integer7 = 0; integer7 < 120; integer7++) {
					ajs.a(de.SNOWBALL, (double)co5.p() + ajs.r.nextDouble(), (double)co5.q() + ajs.r.nextDouble() * 3.9, (double)co5.r() + ajs.r.nextDouble(), 0.0, 0.0, 0.0);
				}

				for (int integer7 = 0; integer7 < this.i().c(); integer7++) {
					for (int integer8 = 0; integer8 < this.i().b(); integer8++) {
						ato ato9 = b4.a(integer7, integer8, 0);
						ajs.a(ato9.d(), alv.a, false);
					}
				}
			}
		}
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return ajs.o(co).v().x.j() && ajs.o(co.b()).r();
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(D, aqi.a(atl.c(D)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(D)));
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(D, sw.bl().d());
	}

	@Override
	public atl a(int integer) {
		return this.t().a(D, cv.b(integer));
	}

	@Override
	public int e(atl atl) {
		return ((cv)atl.c(D)).b();
	}

	@Override
	protected atm b() {
		return new atm(this, D);
	}

	protected atp e() {
		if (this.a == null) {
			this.a = atq.a().a(" ", "#", "#").a('#', ato.a(atu.a(alv.aJ))).b();
		}

		return this.a;
	}

	protected atp g() {
		if (this.b == null) {
			this.b = atq.a().a("^", "#", "#").a('^', ato.a(e)).a('#', ato.a(atu.a(alv.aJ))).b();
		}

		return this.b;
	}

	protected atp h() {
		if (this.c == null) {
			this.c = atq.a().a("~ ~", "###", "~#~").a('#', ato.a(atu.a(alv.S))).a('~', ato.a(ats.a(azs.a))).b();
		}

		return this.c;
	}

	protected atp i() {
		if (this.d == null) {
			this.d = atq.a().a("~^~", "###", "~#~").a('^', ato.a(e)).a('#', ato.a(atu.a(alv.S))).a('~', ato.a(ats.a(azs.a))).b();
		}

		return this.d;
	}
}
