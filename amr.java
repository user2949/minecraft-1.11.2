import java.util.Random;
import javax.annotation.Nullable;

public class amr extends ama {
	protected static final bdt a = new bdt(0.099999994F, 0.0, 0.099999994F, 0.9F, 0.8F, 0.9F);

	protected amr() {
		super(azs.l);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return a;
	}

	@Override
	public azt r(atl atl) {
		return azt.o;
	}

	@Override
	protected boolean i(atl atl) {
		return atl.v() == alv.m || atl.v() == alv.cz || atl.v() == alv.cu || atl.v() == alv.d;
	}

	@Override
	public boolean a(ajw ajw, co co) {
		return true;
	}

	@Override
	public int a(Random random) {
		return random.nextInt(3);
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.B;
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		if (!ajs.E && afj.c() == afl.bm) {
			aay.b(oa.a(this));
			a(ajs, co, new afj(alv.I, 1, 0));
		} else {
			super.a(ajs, aay, co, atl, asc, afj);
		}
	}
}
