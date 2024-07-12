import java.util.Random;
import javax.annotation.Nullable;

public class aqo extends alo {
	protected static final bdt a = new bdt(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);

	protected aqo() {
		super(azs.d);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return a;
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
	public boolean v(atl atl) {
		return true;
	}

	@Override
	public boolean b(ajw ajw, co co) {
		return true;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean d() {
		return true;
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asv();
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.as;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.as);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			asc asc11 = ajs.r(co);
			return asc11 instanceof asv ? ((asv)asc11).b(aay) : false;
		}
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return !this.b(ajs, co) && super.a(ajs, co);
	}
}
