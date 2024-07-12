import java.util.Random;
import javax.annotation.Nullable;

public class aqs extends alu {
	public static final aua a = aua.a("layers", 1, 8);
	protected static final bdt[] b = new bdt[]{
		new bdt(0.0, 0.0, 0.0, 1.0, 0.0, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.25, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.375, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.625, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.75, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.875, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
	};

	protected aqs() {
		super(azs.y);
		this.y(this.A.b().a(a, 1));
		this.a(true);
		this.a(aej.c);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return b[atl.c(a)];
	}

	@Override
	public boolean b(ajw ajw, co co) {
		return (Integer)ajw.o(co).c(a) < 5;
	}

	@Override
	public boolean k(atl atl) {
		return (Integer)atl.c(a) == 8;
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		int integer5 = (Integer)atl.c(a) - 1;
		float float6 = 0.125F;
		bdt bdt7 = atl.d(ajw, co);
		return new bdt(bdt7.a, bdt7.b, bdt7.c, bdt7.d, (double)((float)integer5 * 0.125F), bdt7.f);
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
	public boolean a(ajs ajs, co co) {
		atl atl4 = ajs.o(co.b());
		alu alu5 = atl4.v();
		if (alu5 != alv.aI && alu5 != alv.cB) {
			if (atl4.a() == azs.j) {
				return true;
			} else {
				return alu5 == this && atl4.c(a) == 8 ? true : atl4.q() && atl4.a().c();
			}
		} else {
			return false;
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		this.e(ajs, co3, atl);
	}

	private boolean e(ajs ajs, co co, atl atl) {
		if (!this.a(ajs, co)) {
			this.b(ajs, co, atl, 0);
			ajs.g(co);
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		a(ajs, co, new afj(afl.aG, (Integer)atl.c(a) + 1, 0));
		ajs.g(co);
		aay.b(oa.a(this));
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.aG;
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (ajs.b(ajy.BLOCK, co) > 11) {
			this.b(ajs, co, ajs.o(co), 0);
			ajs.g(co);
		}
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		if (cv == cv.UP) {
			return true;
		} else {
			atl atl6 = ajw.o(co.a(cv));
			return atl6.v() == this && atl6.c(a) >= atl.c(a) ? false : super.a(atl, ajw, co, cv);
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, (integer & 7) + 1);
	}

	@Override
	public boolean a(ajw ajw, co co) {
		return (Integer)ajw.o(co).c(a) == 1;
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(a) - 1;
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}
}
