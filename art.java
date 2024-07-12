import java.util.Random;
import javax.annotation.Nullable;

public class art extends alu {
	public art() {
		super(azs.G);
		this.a(aej.c);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sn sn) {
		sn.aS();
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.I;
	}

	@Override
	protected boolean n() {
		return true;
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		if (!ajs.E && afj.c() == afl.bm) {
			aay.b(oa.a(this));
			a(ajs, co, new afj(afh.a(this), 1));
		} else {
			super.a(ajs, aay, co, atl, asc, afj);
		}
	}
}
