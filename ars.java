import java.util.List;
import javax.annotation.Nullable;

public class ars extends ama {
	protected static final bdt a = new bdt(0.0625, 0.0, 0.0625, 0.9375, 0.09375, 0.9375);

	protected ars() {
		this.a(aej.c);
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		if (!(sn instanceof abx)) {
			a(co, bdt, list, a);
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sn sn) {
		super.a(ajs, co, atl, sn);
		if (sn instanceof abx) {
			ajs.b(new co(co), true);
		}
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return a;
	}

	@Override
	protected boolean i(atl atl) {
		return atl.v() == alv.j || atl.a() == azs.w;
	}

	@Override
	public boolean f(ajs ajs, co co, atl atl) {
		if (co.q() >= 0 && co.q() < 256) {
			atl atl5 = ajs.o(co.b());
			azs azs6 = atl5.a();
			return azs6 == azs.h && (Integer)atl5.c(aoq.b) == 0 || azs6 == azs.w;
		} else {
			return false;
		}
	}

	@Override
	public int e(atl atl) {
		return 0;
	}
}
