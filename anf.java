import com.google.common.base.Predicates;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class anf extends alu {
	public static final aty a = aoi.D;
	public static final atx b = atx.a("eye");
	protected static final bdt c = new bdt(0.0, 0.0, 0.0, 1.0, 0.8125, 1.0);
	protected static final bdt d = new bdt(0.3125, 0.8125, 0.3125, 0.6875, 1.0, 0.6875);
	private static atp e;

	public anf() {
		super(azs.e, azt.C);
		this.y(this.A.b().a(a, cv.NORTH).a(b, false));
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return c;
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		a(co, bdt, list, c);
		if ((Boolean)ajs.o(co).c(b)) {
			a(co, bdt, list, d);
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.a;
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(a, sw.bl().d()).a(b, false);
	}

	@Override
	public boolean x(atl atl) {
		return true;
	}

	@Override
	public int c(atl atl, ajs ajs, co co) {
		return atl.c(b) ? 15 : 0;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(b, (integer & 4) != 0).a(a, cv.b(integer & 3));
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(a)).b();
		if ((Boolean)atl.c(b)) {
			integer3 |= 4;
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

	@Override
	public boolean c(atl atl) {
		return false;
	}

	public static atp e() {
		if (e == null) {
			e = atq.a()
				.a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
				.a('?', ato.a(atu.a))
				.a('^', ato.a(atu.a(alv.bG).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(cv.SOUTH))))
				.a('>', ato.a(atu.a(alv.bG).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(cv.WEST))))
				.a('v', ato.a(atu.a(alv.bG).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(cv.NORTH))))
				.a('<', ato.a(atu.a(alv.bG).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(cv.EAST))))
				.b();
		}

		return e;
	}
}
