import java.util.Random;
import javax.annotation.Nullable;

public class aok extends aod {
	public aok() {
		super(azs.w, false);
		this.z = 0.98F;
		this.a(true);
		this.a(aej.b);
	}

	@Override
	public ajk f() {
		return ajk.TRANSLUCENT;
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		aay.b(oa.a(this));
		aay.a(0.005F);
		if (this.n() && aik.a(aim.t, afj) > 0) {
			a(ajs, co, this.w(atl));
		} else {
			if (ajs.s.l()) {
				ajs.g(co);
				return;
			}

			int integer8 = aik.a(aim.v, afj);
			this.b(ajs, co, atl, integer8);
			azs azs9 = ajs.o(co.b()).a();
			if (azs9.c() || azs9.d()) {
				ajs.a(co, alv.i.t());
			}
		}
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (ajs.b(ajy.BLOCK, co) > 11 - this.t().c()) {
			this.b(ajs, co);
		}
	}

	protected void b(ajs ajs, co co) {
		if (ajs.s.l()) {
			ajs.g(co);
		} else {
			this.b(ajs, co, ajs.o(co), 0);
			ajs.a(co, alv.j.t());
			ajs.a(co, alv.j, co);
		}
	}

	@Override
	public azv h(atl atl) {
		return azv.NORMAL;
	}
}
