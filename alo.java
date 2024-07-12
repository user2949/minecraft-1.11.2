import javax.annotation.Nullable;

public abstract class alo extends alu implements ani {
	protected alo(azs azs) {
		this(azs, azs.r());
	}

	protected alo(azs azs, azt azt) {
		super(azs, azt);
		this.u = true;
	}

	protected boolean a(ajs ajs, co co, cv cv) {
		return ajs.o(co.a(cv)).a() == azs.A;
	}

	protected boolean b(ajs ajs, co co) {
		return this.a(ajs, co, cv.NORTH) || this.a(ajs, co, cv.SOUTH) || this.a(ajs, co, cv.WEST) || this.a(ajs, co, cv.EAST);
	}

	@Override
	public aqf a(atl atl) {
		return aqf.INVISIBLE;
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		super.b(ajs, co, atl);
		ajs.s(co);
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		if (asc instanceof rp && ((rp)asc).n_()) {
			aay.b(oa.a(this));
			aay.a(0.005F);
			if (ajs.E) {
				return;
			}

			int integer8 = aik.a(aim.v, afj);
			afh afh9 = this.a(atl, ajs.r, integer8);
			if (afh9 == afl.a) {
				return;
			}

			afj afj10 = new afj(afh9, this.a(ajs.r));
			afj10.g(((rp)asc).h_());
			a(ajs, co, afj10);
		} else {
			super.a(ajs, aay, co, atl, null, afj);
		}
	}

	@Override
	public boolean a(atl atl, ajs ajs, co co, int integer4, int integer5) {
		super.a(atl, ajs, co, integer4, integer5);
		asc asc7 = ajs.r(co);
		return asc7 == null ? false : asc7.c(integer4, integer5);
	}
}
