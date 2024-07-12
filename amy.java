import java.util.Random;
import javax.annotation.Nullable;

public class amy extends ama implements alx {
	public static final atz<amy.b> a = atz.a("variant", amy.b.class);
	public static final atz<amy.a> c = atz.a("half", amy.a.class);
	public static final atz<cv> d = aoi.D;

	public amy() {
		super(azs.l);
		this.y(this.A.b().a(a, amy.b.SUNFLOWER).a(c, amy.a.LOWER).a(d, cv.NORTH));
		this.c(0.0F);
		this.a(aqu.c);
		this.c("doublePlant");
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return j;
	}

	private amy.b a(ajw ajw, co co, atl atl) {
		if (atl.v() == this) {
			atl = atl.b(ajw, co);
			return atl.c(a);
		} else {
			return amy.b.FERN;
		}
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return super.a(ajs, co) && ajs.d(co.a());
	}

	@Override
	public boolean a(ajw ajw, co co) {
		atl atl4 = ajw.o(co);
		if (atl4.v() != this) {
			return true;
		} else {
			amy.b b5 = atl4.b(ajw, co).c(a);
			return b5 == amy.b.FERN || b5 == amy.b.GRASS;
		}
	}

	@Override
	protected void e(ajs ajs, co co, atl atl) {
		if (!this.f(ajs, co, atl)) {
			boolean boolean5 = atl.c(c) == amy.a.UPPER;
			co co6 = boolean5 ? co : co.a();
			co co7 = boolean5 ? co.b() : co;
			alu alu8 = (alu)(boolean5 ? this : ajs.o(co6).v());
			alu alu9 = (alu)(boolean5 ? ajs.o(co7).v() : this);
			if (alu8 == this) {
				ajs.a(co6, alv.a.t(), 2);
			}

			if (alu9 == this) {
				ajs.a(co7, alv.a.t(), 3);
				if (!boolean5) {
					this.b(ajs, co7, atl, 0);
				}
			}
		}
	}

	@Override
	public boolean f(ajs ajs, co co, atl atl) {
		if (atl.c(c) == amy.a.UPPER) {
			return ajs.o(co.b()).v() == this;
		} else {
			atl atl5 = ajs.o(co.a());
			return atl5.v() == this && super.f(ajs, co, atl5);
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		if (atl.c(c) == amy.a.UPPER) {
			return afl.a;
		} else {
			amy.b b5 = atl.c(a);
			if (b5 == amy.b.FERN) {
				return afl.a;
			} else if (b5 == amy.b.GRASS) {
				return random.nextInt(8) == 0 ? afl.Q : afl.a;
			} else {
				return super.a(atl, random, integer);
			}
		}
	}

	@Override
	public int d(atl atl) {
		return atl.c(c) != amy.a.UPPER && atl.c(a) != amy.b.GRASS ? ((amy.b)atl.c(a)).a() : 0;
	}

	public void a(ajs ajs, co co, amy.b b, int integer) {
		ajs.a(co, this.t().a(c, amy.a.LOWER).a(a, b), integer);
		ajs.a(co.a(), this.t().a(c, amy.a.UPPER), integer);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		ajs.a(co.a(), this.t().a(c, amy.a.UPPER), 2);
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		if (ajs.E || afj.c() != afl.bm || atl.c(c) != amy.a.LOWER || !this.b(ajs, co, atl, aay)) {
			super.a(ajs, aay, co, atl, asc, afj);
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, aay aay) {
		if (atl.c(c) == amy.a.UPPER) {
			if (ajs.o(co.b()).v() == this) {
				if (aay.bK.d) {
					ajs.g(co.b());
				} else {
					atl atl6 = ajs.o(co.b());
					amy.b b7 = atl6.c(a);
					if (b7 != amy.b.FERN && b7 != amy.b.GRASS) {
						ajs.b(co.b(), true);
					} else if (ajs.E) {
						ajs.g(co.b());
					} else if (!aay.cg().b() && aay.cg().c() == afl.bm) {
						this.b(ajs, co, atl6, aay);
						ajs.g(co.b());
					} else {
						ajs.b(co.b(), true);
					}
				}
			}
		} else if (ajs.o(co.a()).v() == this) {
			ajs.a(co.a(), alv.a.t(), 2);
		}

		super.a(ajs, co, atl, aay);
	}

	private boolean b(ajs ajs, co co, atl atl, aay aay) {
		amy.b b6 = atl.c(a);
		if (b6 != amy.b.FERN && b6 != amy.b.GRASS) {
			return false;
		} else {
			aay.b(oa.a(this));
			int integer7 = (b6 == amy.b.GRASS ? ari.a.GRASS : ari.a.FERN).a();
			a(ajs, co, new afj(alv.H, 2, integer7));
			return true;
		}
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (amy.b b8 : amy.b.values()) {
			dd.add(new afj(afh, 1, b8.a()));
		}
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(this, 1, this.a((ajw)ajs, co, atl).a());
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, boolean boolean4) {
		amy.b b6 = this.a((ajw)ajs, co, atl);
		return b6 != amy.b.GRASS && b6 != amy.b.FERN;
	}

	@Override
	public boolean a(ajs ajs, Random random, co co, atl atl) {
		return true;
	}

	@Override
	public void b(ajs ajs, Random random, co co, atl atl) {
		a(ajs, co, new afj(this, 1, this.a((ajw)ajs, co, atl).a()));
	}

	@Override
	public atl a(int integer) {
		return (integer & 8) > 0 ? this.t().a(c, amy.a.UPPER) : this.t().a(c, amy.a.LOWER).a(a, amy.b.a(integer & 7));
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		if (atl.c(c) == amy.a.UPPER) {
			atl atl5 = ajw.o(co.b());
			if (atl5.v() == this) {
				atl = atl.a(a, atl5.c(a));
			}
		}

		return atl;
	}

	@Override
	public int e(atl atl) {
		return atl.c(c) == amy.a.UPPER ? 8 | ((cv)atl.c(d)).b() : ((amy.b)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, c, a, d);
	}

	@Override
	public alu.a u() {
		return alu.a.XZ;
	}

	public static enum a implements ox {
		UPPER,
		LOWER;

		public String toString() {
			return this.m();
		}

		@Override
		public String m() {
			return this == UPPER ? "upper" : "lower";
		}
	}

	public static enum b implements ox {
		SUNFLOWER(0, "sunflower"),
		SYRINGA(1, "syringa"),
		GRASS(2, "double_grass", "grass"),
		FERN(3, "double_fern", "fern"),
		ROSE(4, "double_rose", "rose"),
		PAEONIA(5, "paeonia");

		private static final amy.b[] g = new amy.b[values().length];
		private final int h;
		private final String i;
		private final String j;

		private b(int integer3, String string4) {
			this(integer3, string4, string4);
		}

		private b(int integer3, String string4, String string5) {
			this.h = integer3;
			this.i = string4;
			this.j = string5;
		}

		public int a() {
			return this.h;
		}

		public String toString() {
			return this.i;
		}

		public static amy.b a(int integer) {
			if (integer < 0 || integer >= g.length) {
				integer = 0;
			}

			return g[integer];
		}

		@Override
		public String m() {
			return this.i;
		}

		public String c() {
			return this.j;
		}

		static {
			for (amy.b b4 : values()) {
				g[b4.a()] = b4;
			}
		}
	}
}
