import com.google.common.base.Predicate;
import java.util.Random;
import javax.annotation.Nullable;

public class aqp extends alo {
	public static final aty a = amu.H;
	public static final atx b = atx.a("nodrop");
	private static final Predicate<ato> B = new Predicate<ato>() {
		public boolean apply(@Nullable ato ato) {
			return ato.a() != null && ato.a().v() == alv.ce && ato.b() instanceof asw && ((asw)ato.b()).e() == 1;
		}
	};
	protected static final bdt c = new bdt(0.25, 0.0, 0.25, 0.75, 0.5, 0.75);
	protected static final bdt d = new bdt(0.25, 0.25, 0.5, 0.75, 0.75, 1.0);
	protected static final bdt e = new bdt(0.25, 0.25, 0.0, 0.75, 0.75, 0.5);
	protected static final bdt f = new bdt(0.5, 0.25, 0.25, 1.0, 0.75, 0.75);
	protected static final bdt g = new bdt(0.0, 0.25, 0.25, 0.5, 0.75, 0.75);
	private atp C;
	private atp D;

	protected aqp() {
		super(azs.q);
		this.y(this.A.b().a(a, cv.NORTH).a(b, false));
	}

	@Override
	public String c() {
		return dp.a("tile.skull.skeleton.name");
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
	public boolean v(atl atl) {
		return true;
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		switch ((cv)atl.c(a)) {
			case UP:
			default:
				return c;
			case NORTH:
				return d;
			case SOUTH:
				return e;
			case WEST:
				return f;
			case EAST:
				return g;
		}
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(a, sw.bl()).a(b, false);
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asw();
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		int integer5 = 0;
		asc asc6 = ajs.r(co);
		if (asc6 instanceof asw) {
			integer5 = ((asw)asc6).e();
		}

		return new afj(afl.ci, 1, integer5);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
	}

	@Override
	public void a(ajs ajs, co co, atl atl, aay aay) {
		if (aay.bK.d) {
			atl = atl.a(b, true);
			ajs.a(co, atl, 4);
		}

		super.a(ajs, co, atl, aay);
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			if (!(Boolean)atl.c(b)) {
				asc asc5 = ajs.r(co);
				if (asc5 instanceof asw) {
					asw asw6 = (asw)asc5;
					afj afj7 = this.a(ajs, co, atl);
					if (asw6.e() == 3 && asw6.a() != null) {
						afj7.b(new du());
						du du8 = new du();
						ee.a(du8, asw6.a());
						afj7.p().a("SkullOwner", du8);
					}

					a(ajs, co, afj7);
				}
			}

			super.b(ajs, co, atl);
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.ci;
	}

	public boolean b(ajs ajs, co co, afj afj) {
		return afj.j() == 1 && co.q() >= 2 && ajs.ae() != rg.PEACEFUL && !ajs.E ? this.e().a(ajs, co) != null : false;
	}

	public void a(ajs ajs, co co, asw asw) {
		if (asw.e() == 1 && co.q() >= 2 && ajs.ae() != rg.PEACEFUL && !ajs.E) {
			atp atp5 = this.g();
			atp.b b6 = atp5.a(ajs, co);
			if (b6 != null) {
				for (int integer7 = 0; integer7 < 3; integer7++) {
					ato ato8 = b6.a(integer7, 0, 0);
					ajs.a(ato8.d(), ato8.a().a(b, true), 2);
				}

				for (int integer7 = 0; integer7 < atp5.c(); integer7++) {
					for (int integer8 = 0; integer8 < atp5.b(); integer8++) {
						ato ato9 = b6.a(integer7, integer8, 0);
						ajs.a(ato9.d(), alv.a.t(), 2);
					}
				}

				co co7 = b6.a(1, 0, 0).d();
				yv yv8 = new yv(ajs);
				co co9 = b6.a(1, 2, 0).d();
				yv8.b((double)co9.p() + 0.5, (double)co9.q() + 0.55, (double)co9.r() + 0.5, b6.b().k() == cv.a.X ? 0.0F : 90.0F, 0.0F);
				yv8.aN = b6.b().k() == cv.a.X ? 0.0F : 90.0F;
				yv8.o();

				for (aay aay11 : ajs.a(aay.class, yv8.bo().g(50.0))) {
					aay11.b(nr.I);
				}

				ajs.a(yv8);

				for (int integer10 = 0; integer10 < 120; integer10++) {
					ajs.a(
						de.SNOWBALL, (double)co7.p() + ajs.r.nextDouble(), (double)(co7.q() - 2) + ajs.r.nextDouble() * 3.9, (double)co7.r() + ajs.r.nextDouble(), 0.0, 0.0, 0.0
					);
				}

				for (int integer10 = 0; integer10 < atp5.c(); integer10++) {
					for (int integer11 = 0; integer11 < atp5.b(); integer11++) {
						ato ato12 = b6.a(integer10, integer11, 0);
						ajs.a(ato12.d(), alv.a, false);
					}
				}
			}
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, cv.a(integer & 7)).a(b, (integer & 8) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(a)).a();
		if ((Boolean)atl.c(b)) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(a, aqi.a(atl.c(a)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(a)));
	}

	@Override
	protected atm b() {
		return new atm(this, a, b);
	}

	protected atp e() {
		if (this.C == null) {
			this.C = atq.a().a("   ", "###", "~#~").a('#', ato.a(atu.a(alv.aW))).a('~', ato.a(ats.a(azs.a))).b();
		}

		return this.C;
	}

	protected atp g() {
		if (this.D == null) {
			this.D = atq.a().a("^^^", "###", "~#~").a('#', ato.a(atu.a(alv.aW))).a('^', B).a('~', ato.a(ats.a(azs.a))).b();
		}

		return this.D;
	}
}
