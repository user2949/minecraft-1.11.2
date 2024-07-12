import java.util.Random;

public class arg extends alo {
	public static final atz<asx.a> a = atz.a("mode", asx.a.class);

	public arg() {
		super(azs.f, azt.x);
		this.y(this.A.b());
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asx();
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		asc asc11 = ajs.r(co);
		return asc11 instanceof asx ? ((asx)asc11).a(aay) : false;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		if (!ajs.E) {
			asc asc7 = ajs.r(co);
			if (asc7 instanceof asx) {
				asx asx8 = (asx)asc7;
				asx8.a(sw);
			}
		}
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(a, asx.a.DATA);
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, asx.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((asx.a)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.E) {
			asc asc7 = ajs.r(co3);
			if (asc7 instanceof asx) {
				asx asx8 = (asx)asc7;
				boolean boolean9 = ajs.y(co3);
				boolean boolean10 = asx8.F();
				if (boolean9 && !boolean10) {
					asx8.d(true);
					this.a(asx8);
				} else if (!boolean9 && boolean10) {
					asx8.d(false);
				}
			}
		}
	}

	private void a(asx asx) {
		switch (asx.k()) {
			case SAVE:
				asx.b(false);
				break;
			case LOAD:
				asx.c(false);
				break;
			case CORNER:
				asx.s();
			case DATA:
		}
	}
}
