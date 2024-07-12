import java.util.Random;

public class aph extends amu {
	public static final atx a = atx.a("powered");

	public aph() {
		super(azs.e);
		this.y(this.A.b().a(H, cv.SOUTH).a(a, false));
		this.a(aej.d);
	}

	@Override
	protected atm b() {
		return new atm(this, H, a);
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(H, aqi.a(atl.c(H)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(H)));
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if ((Boolean)atl.c(a)) {
			ajs.a(co, atl.a(a, false), 2);
		} else {
			ajs.a(co, atl.a(a, true), 2);
			ajs.a(co, this, 2);
		}

		this.e(ajs, co, atl);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
	}

	public void b(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.E && co3.a(atl.c(H)).equals(co5)) {
			this.d(atl, ajs, co3);
		}
	}

	private void d(atl atl, ajs ajs, co co) {
		if (!(Boolean)atl.c(a)) {
			if (!ajs.b(co, this)) {
				ajs.a(co, this, 2);
			}
		}
	}

	protected void e(ajs ajs, co co, atl atl) {
		cv cv5 = atl.c(H);
		co co6 = co.a(cv5.d());
		ajs.a(co6, this, co);
		ajs.a(co6, this, cv5);
	}

	@Override
	public boolean g(atl atl) {
		return true;
	}

	@Override
	public int c(atl atl, ajw ajw, co co, cv cv) {
		return atl.a(ajw, co, cv);
	}

	@Override
	public int b(atl atl, ajw ajw, co co, cv cv) {
		return atl.c(a) && atl.c(H) == cv ? 15 : 0;
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			if ((Boolean)atl.c(a)) {
				this.b(ajs, co, atl, ajs.r);
			}

			this.d(atl, ajs, co);
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		if ((Boolean)atl.c(a) && ajs.b(co, this)) {
			this.e(ajs, co, atl.a(a, false));
		}
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(H, cv.a(co, sw).d());
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(H)).a();
		if ((Boolean)atl.c(a)) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(H, cv.a(integer & 7));
	}
}
