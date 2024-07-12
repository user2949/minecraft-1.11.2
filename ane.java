import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ane extends alo {
	protected static final bdt a = new bdt(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);

	protected ane(azs azs) {
		super(azs);
		this.a(1.0F);
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asz();
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return a;
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		return cv == cv.DOWN ? super.a(atl, ajw, co, cv) : false;
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
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
	public int a(Random random) {
		return 0;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sn sn) {
		if (!sn.aK() && !sn.aL() && sn.aX() && !ajs.E && sn.bo().c(atl.d(ajs, co).a(co))) {
			sn.c(1);
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		double double6 = (double)((float)co.p() + random.nextFloat());
		double double8 = (double)((float)co.q() + 0.8F);
		double double10 = (double)((float)co.r() + random.nextFloat());
		double double12 = 0.0;
		double double14 = 0.0;
		double double16 = 0.0;
		ajs.a(de.SMOKE_NORMAL, double6, double8, double10, 0.0, 0.0, 0.0);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return afj.a;
	}

	@Override
	public azt r(atl atl) {
		return azt.E;
	}
}
