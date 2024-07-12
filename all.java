import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class all extends anj {
	public static final aty a = aoi.D;
	public static final aua b = aua.a("damage", 0, 2);
	protected static final bdt c = new bdt(0.0, 0.0, 0.125, 1.0, 1.0, 0.875);
	protected static final bdt d = new bdt(0.125, 0.0, 0.0, 0.875, 1.0, 1.0);
	protected static final Logger e = LogManager.getLogger();

	protected all() {
		super(azs.g);
		this.y(this.A.b().a(a, cv.NORTH).a(b, 0));
		this.d(0);
		this.a(aej.c);
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		cv cv10 = sw.bl().e();

		try {
			return super.a(ajs, co, cv, float4, float5, float6, integer, sw).a(a, cv10).a(b, integer >> 2);
		} catch (IllegalArgumentException var11) {
			if (!ajs.E) {
				e.warn(String.format("Invalid damage property for anvil at %s. Found %d, must be in [0, 1, 2]", co, integer >> 2));
				if (sw instanceof aay) {
					sw.a(new fi("Invalid damage property. Please pick in [0, 1, 2]"));
				}
			}

			return super.a(ajs, co, cv, float4, float5, float6, 0, sw).a(a, cv10).a(b, 0);
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (!ajs.E) {
			aay.a(new all.a(ajs, co));
		}

		return true;
	}

	@Override
	public int d(atl atl) {
		return (Integer)atl.c(b);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		cv cv5 = atl.c(a);
		return cv5.k() == cv.a.X ? c : d;
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(afh));
		dd.add(new afj(afh, 1, 1));
		dd.add(new afj(afh, 1, 2));
	}

	@Override
	protected void a(zi zi) {
		zi.a(true);
	}

	@Override
	public void a_(ajs ajs, co co) {
		ajs.b(1031, co, 0);
	}

	@Override
	public void b(ajs ajs, co co) {
		ajs.b(1029, co, 0);
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		return true;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, cv.b(integer & 3)).a(b, (integer & 15) >> 2);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(a)).b();
		return integer3 | (Integer)atl.c(b) << 2;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.v() != this ? atl : atl.a(a, aqi.a(atl.c(a)));
	}

	@Override
	protected atm b() {
		return new atm(this, a, b);
	}

	public static class a implements rj {
		private final ajs a;
		private final co b;

		public a(ajs ajs, co co) {
			this.a = ajs;
			this.b = co;
		}

		@Override
		public String h_() {
			return "anvil";
		}

		@Override
		public boolean n_() {
			return false;
		}

		@Override
		public fb i_() {
			return new fi(alv.cf.a() + ".name");
		}

		@Override
		public acl a(aax aax, aay aay) {
			return new acm(aax, this.a, this.b, aay);
		}

		@Override
		public String l() {
			return "minecraft:anvil";
		}
	}
}
