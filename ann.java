import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public class ann extends alu {
	public static final aua a = aua.a("age", 0, 15);
	public static final atx b = atx.a("north");
	public static final atx c = atx.a("east");
	public static final atx d = atx.a("south");
	public static final atx e = atx.a("west");
	public static final atx f = atx.a("up");
	private final Map<alu, Integer> g = Maps.newIdentityHashMap();
	private final Map<alu, Integer> B = Maps.newIdentityHashMap();

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		return !ajw.o(co.b()).r() && !alv.ab.c(ajw, co.b())
			? atl.a(b, this.c(ajw, co.c())).a(c, this.c(ajw, co.f())).a(d, this.c(ajw, co.d())).a(e, this.c(ajw, co.e())).a(f, this.c(ajw, co.a()))
			: this.t();
	}

	protected ann() {
		super(azs.o);
		this.y(this.A.b().a(a, 0).a(b, false).a(c, false).a(d, false).a(e, false).a(f, false));
		this.a(true);
	}

	public static void e() {
		alv.ab.a(alv.f, 5, 20);
		alv.ab.a(alv.bL, 5, 20);
		alv.ab.a(alv.bM, 5, 20);
		alv.ab.a(alv.bo, 5, 20);
		alv.ab.a(alv.bp, 5, 20);
		alv.ab.a(alv.bq, 5, 20);
		alv.ab.a(alv.br, 5, 20);
		alv.ab.a(alv.bs, 5, 20);
		alv.ab.a(alv.bt, 5, 20);
		alv.ab.a(alv.aO, 5, 20);
		alv.ab.a(alv.aP, 5, 20);
		alv.ab.a(alv.aQ, 5, 20);
		alv.ab.a(alv.aR, 5, 20);
		alv.ab.a(alv.aS, 5, 20);
		alv.ab.a(alv.aT, 5, 20);
		alv.ab.a(alv.ad, 5, 20);
		alv.ab.a(alv.bV, 5, 20);
		alv.ab.a(alv.bU, 5, 20);
		alv.ab.a(alv.bW, 5, 20);
		alv.ab.a(alv.cC, 5, 20);
		alv.ab.a(alv.cD, 5, 20);
		alv.ab.a(alv.r, 5, 5);
		alv.ab.a(alv.s, 5, 5);
		alv.ab.a(alv.t, 30, 60);
		alv.ab.a(alv.u, 30, 60);
		alv.ab.a(alv.X, 30, 20);
		alv.ab.a(alv.W, 15, 100);
		alv.ab.a(alv.H, 60, 100);
		alv.ab.a(alv.cF, 60, 100);
		alv.ab.a(alv.N, 60, 100);
		alv.ab.a(alv.O, 60, 100);
		alv.ab.a(alv.I, 60, 100);
		alv.ab.a(alv.L, 30, 60);
		alv.ab.a(alv.bn, 15, 100);
		alv.ab.a(alv.cA, 5, 5);
		alv.ab.a(alv.cx, 60, 20);
		alv.ab.a(alv.cy, 60, 20);
	}

	public void a(alu alu, int integer2, int integer3) {
		this.g.put(alu, integer2);
		this.B.put(alu, integer3);
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
	public int a(Random random) {
		return 0;
	}

	@Override
	public int a(ajs ajs) {
		return 30;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (ajs.U().b("doFireTick")) {
			if (!this.a(ajs, co)) {
				ajs.g(co);
			}

			alu alu6 = ajs.o(co.b()).v();
			boolean boolean7 = alu6 == alv.aV;
			if (ajs.s instanceof avl && alu6 == alv.h) {
				boolean7 = true;
			}

			int integer8 = (Integer)atl.c(a);
			if (!boolean7 && ajs.W() && this.b(ajs, co) && random.nextFloat() < 0.2F + (float)integer8 * 0.03F) {
				ajs.g(co);
			} else {
				if (integer8 < 15) {
					atl = atl.a(a, integer8 + random.nextInt(3) / 2);
					ajs.a(co, atl, 4);
				}

				ajs.a(co, this, this.a(ajs) + random.nextInt(10));
				if (!boolean7) {
					if (!this.c(ajs, co)) {
						if (!ajs.o(co.b()).r() || integer8 > 3) {
							ajs.g(co);
						}

						return;
					}

					if (!this.c((ajw)ajs, co.b()) && integer8 == 15 && random.nextInt(4) == 0) {
						ajs.g(co);
						return;
					}
				}

				boolean boolean9 = ajs.C(co);
				int integer10 = 0;
				if (boolean9) {
					integer10 = -50;
				}

				this.a(ajs, co.f(), 300 + integer10, random, integer8);
				this.a(ajs, co.e(), 300 + integer10, random, integer8);
				this.a(ajs, co.b(), 250 + integer10, random, integer8);
				this.a(ajs, co.a(), 250 + integer10, random, integer8);
				this.a(ajs, co.c(), 300 + integer10, random, integer8);
				this.a(ajs, co.d(), 300 + integer10, random, integer8);

				for (int integer11 = -1; integer11 <= 1; integer11++) {
					for (int integer12 = -1; integer12 <= 1; integer12++) {
						for (int integer13 = -1; integer13 <= 4; integer13++) {
							if (integer11 != 0 || integer13 != 0 || integer12 != 0) {
								int integer14 = 100;
								if (integer13 > 1) {
									integer14 += (integer13 - 1) * 100;
								}

								co co15 = co.a(integer11, integer13, integer12);
								int integer16 = this.d(ajs, co15);
								if (integer16 > 0) {
									int integer17 = (integer16 + 40 + ajs.ae().a() * 7) / (integer8 + 30);
									if (boolean9) {
										integer17 /= 2;
									}

									if (integer17 > 0 && random.nextInt(integer14) <= integer17 && (!ajs.W() || !this.b(ajs, co15))) {
										int integer18 = integer8 + random.nextInt(5) / 4;
										if (integer18 > 15) {
											integer18 = 15;
										}

										ajs.a(co15, atl.a(a, integer18), 3);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	protected boolean b(ajs ajs, co co) {
		return ajs.B(co) || ajs.B(co.e()) || ajs.B(co.f()) || ajs.B(co.c()) || ajs.B(co.d());
	}

	@Override
	public boolean r() {
		return false;
	}

	private int c(alu alu) {
		Integer integer3 = (Integer)this.B.get(alu);
		return integer3 == null ? 0 : integer3;
	}

	private int d(alu alu) {
		Integer integer3 = (Integer)this.g.get(alu);
		return integer3 == null ? 0 : integer3;
	}

	private void a(ajs ajs, co co, int integer3, Random random, int integer5) {
		int integer7 = this.c(ajs.o(co).v());
		if (random.nextInt(integer3) < integer7) {
			atl atl8 = ajs.o(co);
			if (random.nextInt(integer5 + 10) < 5 && !ajs.B(co)) {
				int integer9 = integer5 + random.nextInt(5) / 4;
				if (integer9 > 15) {
					integer9 = 15;
				}

				ajs.a(co, this.t().a(a, integer9), 3);
			} else {
				ajs.g(co);
			}

			if (atl8.v() == alv.W) {
				alv.W.d(ajs, co, atl8.a(ark.a, true));
			}
		}
	}

	private boolean c(ajs ajs, co co) {
		for (cv cv7 : cv.values()) {
			if (this.c((ajw)ajs, co.a(cv7))) {
				return true;
			}
		}

		return false;
	}

	private int d(ajs ajs, co co) {
		if (!ajs.d(co)) {
			return 0;
		} else {
			int integer4 = 0;

			for (cv cv8 : cv.values()) {
				integer4 = Math.max(this.d(ajs.o(co.a(cv8)).v()), integer4);
			}

			return integer4;
		}
	}

	@Override
	public boolean m() {
		return false;
	}

	public boolean c(ajw ajw, co co) {
		return this.d(ajw.o(co).v()) > 0;
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return ajs.o(co.b()).r() || this.c(ajs, co);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.o(co3.b()).r() && !this.c(ajs, co3)) {
			ajs.g(co3);
		}
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		if (ajs.s.q().a() > 0 || !alv.aY.b(ajs, co)) {
			if (!ajs.o(co.b()).r() && !this.c(ajs, co)) {
				ajs.g(co);
			} else {
				ajs.a(co, this, this.a(ajs) + ajs.r.nextInt(10));
			}
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		if (random.nextInt(24) == 0) {
			ajs.a(
				(double)((float)co.p() + 0.5F),
				(double)((float)co.q() + 0.5F),
				(double)((float)co.r() + 0.5F),
				nn.bG,
				no.BLOCKS,
				1.0F + random.nextFloat(),
				random.nextFloat() * 0.7F + 0.3F,
				false
			);
		}

		if (!ajs.o(co.b()).r() && !alv.ab.c((ajw)ajs, co.b())) {
			if (alv.ab.c((ajw)ajs, co.e())) {
				for (int integer6 = 0; integer6 < 2; integer6++) {
					double double7 = (double)co.p() + random.nextDouble() * 0.1F;
					double double9 = (double)co.q() + random.nextDouble();
					double double11 = (double)co.r() + random.nextDouble();
					ajs.a(de.SMOKE_LARGE, double7, double9, double11, 0.0, 0.0, 0.0);
				}
			}

			if (alv.ab.c((ajw)ajs, co.f())) {
				for (int integer6 = 0; integer6 < 2; integer6++) {
					double double7 = (double)(co.p() + 1) - random.nextDouble() * 0.1F;
					double double9 = (double)co.q() + random.nextDouble();
					double double11 = (double)co.r() + random.nextDouble();
					ajs.a(de.SMOKE_LARGE, double7, double9, double11, 0.0, 0.0, 0.0);
				}
			}

			if (alv.ab.c((ajw)ajs, co.c())) {
				for (int integer6 = 0; integer6 < 2; integer6++) {
					double double7 = (double)co.p() + random.nextDouble();
					double double9 = (double)co.q() + random.nextDouble();
					double double11 = (double)co.r() + random.nextDouble() * 0.1F;
					ajs.a(de.SMOKE_LARGE, double7, double9, double11, 0.0, 0.0, 0.0);
				}
			}

			if (alv.ab.c((ajw)ajs, co.d())) {
				for (int integer6 = 0; integer6 < 2; integer6++) {
					double double7 = (double)co.p() + random.nextDouble();
					double double9 = (double)co.q() + random.nextDouble();
					double double11 = (double)(co.r() + 1) - random.nextDouble() * 0.1F;
					ajs.a(de.SMOKE_LARGE, double7, double9, double11, 0.0, 0.0, 0.0);
				}
			}

			if (alv.ab.c((ajw)ajs, co.a())) {
				for (int integer6 = 0; integer6 < 2; integer6++) {
					double double7 = (double)co.p() + random.nextDouble();
					double double9 = (double)(co.q() + 1) - random.nextDouble() * 0.1F;
					double double11 = (double)co.r() + random.nextDouble();
					ajs.a(de.SMOKE_LARGE, double7, double9, double11, 0.0, 0.0, 0.0);
				}
			}
		} else {
			for (int integer6 = 0; integer6 < 3; integer6++) {
				double double7 = (double)co.p() + random.nextDouble();
				double double9 = (double)co.q() + random.nextDouble() * 0.5 + 0.5;
				double double11 = (double)co.r() + random.nextDouble();
				ajs.a(de.SMOKE_LARGE, double7, double9, double11, 0.0, 0.0, 0.0);
			}
		}
	}

	@Override
	public azt r(atl atl) {
		return azt.f;
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, integer);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(a);
	}

	@Override
	protected atm b() {
		return new atm(this, a, b, c, d, e, f);
	}
}
