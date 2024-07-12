import javax.annotation.Nullable;

public class anm extends aoi {
	public static final atx a = atx.a("open");
	public static final atx b = atx.a("powered");
	public static final atx c = atx.a("in_wall");
	protected static final bdt d = new bdt(0.0, 0.0, 0.375, 1.0, 1.0, 0.625);
	protected static final bdt e = new bdt(0.375, 0.0, 0.0, 0.625, 1.0, 1.0);
	protected static final bdt f = new bdt(0.0, 0.0, 0.375, 1.0, 0.8125, 0.625);
	protected static final bdt g = new bdt(0.375, 0.0, 0.0, 0.625, 0.8125, 1.0);
	protected static final bdt B = new bdt(0.0, 0.0, 0.375, 1.0, 1.5, 0.625);
	protected static final bdt C = new bdt(0.375, 0.0, 0.0, 0.625, 1.5, 1.0);

	public anm(apn.a a) {
		super(azs.d, a.c());
		this.y(this.A.b().a(anm.a, false).a(b, false).a(c, false));
		this.a(aej.d);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		atl = this.c(atl, ajw, co);
		if ((Boolean)atl.c(c)) {
			return ((cv)atl.c(D)).k() == cv.a.X ? g : f;
		} else {
			return ((cv)atl.c(D)).k() == cv.a.X ? e : d;
		}
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		cv.a a5 = ((cv)atl.c(D)).k();
		if (a5 == cv.a.Z && (ajw.o(co.e()).v() == alv.bZ || ajw.o(co.f()).v() == alv.bZ)
			|| a5 == cv.a.X && (ajw.o(co.c()).v() == alv.bZ || ajw.o(co.d()).v() == alv.bZ)) {
			atl = atl.a(c, true);
		}

		return atl;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(D, aqi.a(atl.c(D)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(D)));
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return ajs.o(co.b()).a().a() ? super.a(ajs, co) : false;
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		if ((Boolean)atl.c(a)) {
			return k;
		} else {
			return ((cv)atl.c(D)).k() == cv.a.Z ? B : C;
		}
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
		return (Boolean)ajw.o(co).c(a);
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		boolean boolean10 = ajs.y(co);
		return this.t().a(D, sw.bl()).a(a, boolean10).a(b, boolean10).a(c, false);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if ((Boolean)atl.c(a)) {
			atl = atl.a(a, false);
			ajs.a(co, atl, 10);
		} else {
			cv cv11 = cv.a((double)aay.v);
			if (atl.c(D) == cv11.d()) {
				atl = atl.a(D, cv11);
			}

			atl = atl.a(a, true);
			ajs.a(co, atl, 10);
		}

		ajs.a(aay, atl.c(a) ? 1008 : 1014, co, 0);
		return true;
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.E) {
			boolean boolean7 = ajs.y(co3);
			if ((Boolean)atl.c(b) != boolean7) {
				ajs.a(co3, atl.a(b, boolean7).a(a, boolean7), 2);
				if ((Boolean)atl.c(a) != boolean7) {
					ajs.a(null, boolean7 ? 1008 : 1014, co3, 0);
				}
			}
		}
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		return true;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(D, cv.b(integer)).a(a, (integer & 4) != 0).a(b, (integer & 8) != 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(D)).b();
		if ((Boolean)atl.c(b)) {
			integer3 |= 8;
		}

		if ((Boolean)atl.c(a)) {
			integer3 |= 4;
		}

		return integer3;
	}

	@Override
	protected atm b() {
		return new atm(this, D, a, b, c);
	}
}
