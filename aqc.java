import java.util.Random;

public class aqc extends alu {
	private final boolean a;

	public aqc(boolean boolean1) {
		super(azs.t);
		this.a = boolean1;
		if (boolean1) {
			this.a(1.0F);
		}
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			if (this.a && !ajs.y(co)) {
				ajs.a(co, alv.bJ.t(), 2);
			} else if (!this.a && ajs.y(co)) {
				ajs.a(co, alv.bK.t(), 2);
			}
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.E) {
			if (this.a && !ajs.y(co3)) {
				ajs.a(co3, this, 4);
			} else if (!this.a && ajs.y(co3)) {
				ajs.a(co3, alv.bK.t(), 2);
			}
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E) {
			if (this.a && !ajs.y(co)) {
				ajs.a(co, alv.bJ.t(), 2);
			}
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afh.a(alv.bJ);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(alv.bJ);
	}

	@Override
	protected afj w(atl atl) {
		return new afj(alv.bJ);
	}
}
