import java.util.Random;
import javax.annotation.Nullable;

public abstract class alp extends alu {
	protected static final bdt a = new bdt(0.0625, 0.0, 0.0625, 0.9375, 0.03125, 0.9375);
	protected static final bdt b = new bdt(0.0625, 0.0, 0.0625, 0.9375, 0.0625, 0.9375);
	protected static final bdt c = new bdt(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);

	protected alp(azs azs) {
		this(azs, azs.r());
	}

	protected alp(azs azs, azt azt) {
		super(azs, azt);
		this.a(aej.d);
		this.a(true);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		boolean boolean5 = this.i(atl) > 0;
		return boolean5 ? a : b;
	}

	@Override
	public int a(ajs ajs) {
		return 20;
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
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
	public boolean b(ajw ajw, co co) {
		return true;
	}

	@Override
	public boolean d() {
		return true;
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return this.i(ajs, co.b());
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!this.i(ajs, co3.b())) {
			this.b(ajs, co3, atl, 0);
			ajs.g(co3);
		}
	}

	private boolean i(ajs ajs, co co) {
		return ajs.o(co).r() || ajs.o(co).v() instanceof anl;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, Random random) {
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E) {
			int integer6 = this.i(atl);
			if (integer6 > 0) {
				this.a(ajs, co, atl, integer6);
			}
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sn sn) {
		if (!ajs.E) {
			int integer6 = this.i(atl);
			if (integer6 == 0) {
				this.a(ajs, co, atl, integer6);
			}
		}
	}

	protected void a(ajs ajs, co co, atl atl, int integer) {
		int integer6 = this.e(ajs, co);
		boolean boolean7 = integer > 0;
		boolean boolean8 = integer6 > 0;
		if (integer != integer6) {
			atl = this.a(atl, integer6);
			ajs.a(co, atl, 2);
			this.d(ajs, co);
			ajs.b(co, co);
		}

		if (!boolean8 && boolean7) {
			this.c(ajs, co);
		} else if (boolean8 && !boolean7) {
			this.b(ajs, co);
		}

		if (boolean8) {
			ajs.a(new co(co), this, this.a(ajs));
		}
	}

	protected abstract void b(ajs ajs, co co);

	protected abstract void c(ajs ajs, co co);

	@Override
	public void b(ajs ajs, co co, atl atl) {
		if (this.i(atl) > 0) {
			this.d(ajs, co);
		}

		super.b(ajs, co, atl);
	}

	protected void d(ajs ajs, co co) {
		ajs.b(co, this, false);
		ajs.b(co.b(), this, false);
	}

	@Override
	public int b(atl atl, ajw ajw, co co, cv cv) {
		return this.i(atl);
	}

	@Override
	public int c(atl atl, ajw ajw, co co, cv cv) {
		return cv == cv.UP ? this.i(atl) : 0;
	}

	@Override
	public boolean g(atl atl) {
		return true;
	}

	@Override
	public azv h(atl atl) {
		return azv.DESTROY;
	}

	protected abstract int e(ajs ajs, co co);

	protected abstract int i(atl atl);

	protected abstract atl a(atl atl, int integer);
}
