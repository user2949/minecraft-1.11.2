import com.google.common.cache.LoadingCache;
import java.util.Random;
import javax.annotation.Nullable;

public class apo extends aod {
	public static final atz<cv.a> a = atz.a("axis", cv.a.class, cv.a.X, cv.a.Z);
	protected static final bdt b = new bdt(0.0, 0.0, 0.375, 1.0, 1.0, 0.625);
	protected static final bdt c = new bdt(0.375, 0.0, 0.0, 0.625, 1.0, 1.0);
	protected static final bdt d = new bdt(0.375, 0.0, 0.375, 0.625, 1.0, 0.625);

	public apo() {
		super(azs.E, false);
		this.y(this.A.b().a(a, cv.a.X));
		this.a(true);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		switch ((cv.a)atl.c(a)) {
			case X:
				return b;
			case Y:
			default:
				return d;
			case Z:
				return c;
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		super.b(ajs, co, atl, random);
		if (ajs.s.d() && ajs.U().b("doMobSpawning") && random.nextInt(2000) < ajs.ae().a()) {
			int integer6 = co.q();
			co co7 = co;

			while (!ajs.o(co7).r() && co7.q() > 0) {
				co7 = co7.b();
			}

			if (integer6 > 0 && !ajs.o(co7.a()).m()) {
				sn sn8 = ago.a(ajs, sp.a(aab.class), (double)co7.p() + 0.5, (double)co7.q() + 1.1, (double)co7.r() + 0.5);
				if (sn8 != null) {
					sn8.aj = sn8.aE();
				}
			}
		}
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	public static int a(cv.a a) {
		if (a == cv.a.X) {
			return 1;
		} else {
			return a == cv.a.Z ? 2 : 0;
		}
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	public boolean b(ajs ajs, co co) {
		apo.a a4 = new apo.a(ajs, co, cv.a.X);
		if (a4.d() && a4.e == 0) {
			a4.e();
			return true;
		} else {
			apo.a a5 = new apo.a(ajs, co, cv.a.Z);
			if (a5.d() && a5.e == 0) {
				a5.e();
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		cv.a a7 = atl.c(a);
		if (a7 == cv.a.X) {
			apo.a a8 = new apo.a(ajs, co3, cv.a.X);
			if (!a8.d() || a8.e < a8.h * a8.g) {
				ajs.a(co3, alv.a.t());
			}
		} else if (a7 == cv.a.Z) {
			apo.a a8 = new apo.a(ajs, co3, cv.a.Z);
			if (!a8.d() || a8.e < a8.h * a8.g) {
				ajs.a(co3, alv.a.t());
			}
		}
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		co = co.a(cv);
		cv.a a6 = null;
		if (atl.v() == this) {
			a6 = atl.c(a);
			if (a6 == null) {
				return false;
			}

			if (a6 == cv.a.Z && cv != cv.EAST && cv != cv.WEST) {
				return false;
			}

			if (a6 == cv.a.X && cv != cv.SOUTH && cv != cv.NORTH) {
				return false;
			}
		}

		boolean boolean7 = ajw.o(co.e()).v() == this && ajw.o(co.f(2)).v() != this;
		boolean boolean8 = ajw.o(co.f()).v() == this && ajw.o(co.g(2)).v() != this;
		boolean boolean9 = ajw.o(co.c()).v() == this && ajw.o(co.d(2)).v() != this;
		boolean boolean10 = ajw.o(co.d()).v() == this && ajw.o(co.e(2)).v() != this;
		boolean boolean11 = boolean7 || boolean8 || a6 == cv.a.X;
		boolean boolean12 = boolean9 || boolean10 || a6 == cv.a.Z;
		if (boolean11 && cv == cv.WEST) {
			return true;
		} else if (boolean11 && cv == cv.EAST) {
			return true;
		} else {
			return boolean12 && cv == cv.NORTH ? true : boolean12 && cv == cv.SOUTH;
		}
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	public ajk f() {
		return ajk.TRANSLUCENT;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sn sn) {
		if (!sn.aK() && !sn.aL() && sn.aX()) {
			sn.e(co);
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		if (random.nextInt(100) == 0) {
			ajs.a((double)co.p() + 0.5, (double)co.q() + 0.5, (double)co.r() + 0.5, nn.eR, no.BLOCKS, 0.5F, random.nextFloat() * 0.4F + 0.8F, false);
		}

		for (int integer6 = 0; integer6 < 4; integer6++) {
			double double7 = (double)((float)co.p() + random.nextFloat());
			double double9 = (double)((float)co.q() + random.nextFloat());
			double double11 = (double)((float)co.r() + random.nextFloat());
			double double13 = ((double)random.nextFloat() - 0.5) * 0.5;
			double double15 = ((double)random.nextFloat() - 0.5) * 0.5;
			double double17 = ((double)random.nextFloat() - 0.5) * 0.5;
			int integer19 = random.nextInt(2) * 2 - 1;
			if (ajs.o(co.e()).v() != this && ajs.o(co.f()).v() != this) {
				double7 = (double)co.p() + 0.5 + 0.25 * (double)integer19;
				double13 = (double)(random.nextFloat() * 2.0F * (float)integer19);
			} else {
				double11 = (double)co.r() + 0.5 + 0.25 * (double)integer19;
				double17 = (double)(random.nextFloat() * 2.0F * (float)integer19);
			}

			ajs.a(de.PORTAL, double7, double9, double11, double13, double15, double17);
		}
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return afj.a;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, (integer & 3) == 2 ? cv.a.Z : cv.a.X);
	}

	@Override
	public int e(atl atl) {
		return a(atl.c(a));
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case COUNTERCLOCKWISE_90:
			case CLOCKWISE_90:
				switch ((cv.a)atl.c(a)) {
					case X:
						return atl.a(a, cv.a.Z);
					case Z:
						return atl.a(a, cv.a.X);
					default:
						return atl;
				}
			default:
				return atl;
		}
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public atp.b c(ajs ajs, co co) {
		cv.a a4 = cv.a.Z;
		apo.a a5 = new apo.a(ajs, co, cv.a.X);
		LoadingCache<co, ato> loadingCache6 = atp.a(ajs, true);
		if (!a5.d()) {
			a4 = cv.a.X;
			a5 = new apo.a(ajs, co, cv.a.Z);
		}

		if (!a5.d()) {
			return new atp.b(co, cv.NORTH, cv.UP, loadingCache6, 1, 1, 1);
		} else {
			int[] arr7 = new int[cv.b.values().length];
			cv cv8 = a5.c.f();
			co co9 = a5.f.b(a5.a() - 1);

			for (cv.b b13 : cv.b.values()) {
				atp.b b14 = new atp.b(cv8.c() == b13 ? co9 : co9.a(a5.c, a5.b() - 1), cv.a(b13, a4), cv.UP, loadingCache6, a5.b(), a5.a(), 1);

				for (int integer15 = 0; integer15 < a5.b(); integer15++) {
					for (int integer16 = 0; integer16 < a5.a(); integer16++) {
						ato ato17 = b14.a(integer15, integer16, 1);
						if (ato17.a() != null && ato17.a().a() != azs.a) {
							arr7[b13.ordinal()]++;
						}
					}
				}
			}

			cv.b b10 = cv.b.POSITIVE;

			for (cv.b b14 : cv.b.values()) {
				if (arr7[b14.ordinal()] < arr7[b10.ordinal()]) {
					b10 = b14;
				}
			}

			return new atp.b(cv8.c() == b10 ? co9 : co9.a(a5.c, a5.b() - 1), cv.a(b10, a4), cv.UP, loadingCache6, a5.b(), a5.a(), 1);
		}
	}

	public static class a {
		private final ajs a;
		private final cv.a b;
		private final cv c;
		private final cv d;
		private int e;
		private co f;
		private int g;
		private int h;

		public a(ajs ajs, co co, cv.a a) {
			this.a = ajs;
			this.b = a;
			if (a == cv.a.X) {
				this.d = cv.EAST;
				this.c = cv.WEST;
			} else {
				this.d = cv.NORTH;
				this.c = cv.SOUTH;
			}

			co co5 = co;

			while (co.q() > co5.q() - 21 && co.q() > 0 && this.a(ajs.o(co.b()).v())) {
				co = co.b();
			}

			int integer6 = this.a(co, this.d) - 1;
			if (integer6 >= 0) {
				this.f = co.a(this.d, integer6);
				this.h = this.a(this.f, this.c);
				if (this.h < 2 || this.h > 21) {
					this.f = null;
					this.h = 0;
				}
			}

			if (this.f != null) {
				this.g = this.c();
			}
		}

		protected int a(co co, cv cv) {
			int integer4;
			for (integer4 = 0; integer4 < 22; integer4++) {
				co co5 = co.a(cv, integer4);
				if (!this.a(this.a.o(co5).v()) || this.a.o(co5.b()).v() != alv.Z) {
					break;
				}
			}

			alu alu5 = this.a.o(co.a(cv, integer4)).v();
			return alu5 == alv.Z ? integer4 : 0;
		}

		public int a() {
			return this.g;
		}

		public int b() {
			return this.h;
		}

		protected int c() {
			label56:
			for (this.g = 0; this.g < 21; this.g++) {
				for (int integer2 = 0; integer2 < this.h; integer2++) {
					co co3 = this.f.a(this.c, integer2).b(this.g);
					alu alu4 = this.a.o(co3).v();
					if (!this.a(alu4)) {
						break label56;
					}

					if (alu4 == alv.aY) {
						this.e++;
					}

					if (integer2 == 0) {
						alu4 = this.a.o(co3.a(this.d)).v();
						if (alu4 != alv.Z) {
							break label56;
						}
					} else if (integer2 == this.h - 1) {
						alu4 = this.a.o(co3.a(this.c)).v();
						if (alu4 != alv.Z) {
							break label56;
						}
					}
				}
			}

			for (int integer2 = 0; integer2 < this.h; integer2++) {
				if (this.a.o(this.f.a(this.c, integer2).b(this.g)).v() != alv.Z) {
					this.g = 0;
					break;
				}
			}

			if (this.g <= 21 && this.g >= 3) {
				return this.g;
			} else {
				this.f = null;
				this.h = 0;
				this.g = 0;
				return 0;
			}
		}

		protected boolean a(alu alu) {
			return alu.x == azs.a || alu == alv.ab || alu == alv.aY;
		}

		public boolean d() {
			return this.f != null && this.h >= 2 && this.h <= 21 && this.g >= 3 && this.g <= 21;
		}

		public void e() {
			for (int integer2 = 0; integer2 < this.h; integer2++) {
				co co3 = this.f.a(this.c, integer2);

				for (int integer4 = 0; integer4 < this.g; integer4++) {
					this.a.a(co3.b(integer4), alv.aY.t().a(apo.a, this.b), 2);
				}
			}
		}
	}
}
