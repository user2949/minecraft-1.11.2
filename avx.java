import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class avx implements aui {
	protected static final atl a = alv.b.t();
	private final Random i;
	private final azi j;
	private final azi k;
	private final azi l;
	private final azj m;
	public azi b;
	public azi c;
	public azi d;
	private final ajs n;
	private final boolean o;
	private final ajx p;
	private final double[] q;
	private final float[] r;
	private avq s;
	private atl t = alv.j.t();
	private double[] u = new double[256];
	private final avu v = new avt();
	private final ayl w = new ayl();
	private final ayt x = new ayt();
	private final ayc y = new ayc();
	private final ayj z = new ayj();
	private final avu A = new avo();
	private final ayh B = new ayh();
	private final ayv C = new ayv(this);
	private akf[] D;
	double[] e;
	double[] f;
	double[] g;
	double[] h;

	public avx(ajs ajs, long long2, boolean boolean3, String string) {
		this.n = ajs;
		this.o = boolean3;
		this.p = ajs.T().t();
		this.i = new Random(long2);
		this.j = new azi(this.i, 16);
		this.k = new azi(this.i, 16);
		this.l = new azi(this.i, 8);
		this.m = new azj(this.i, 4);
		this.b = new azi(this.i, 10);
		this.c = new azi(this.i, 16);
		this.d = new azi(this.i, 8);
		this.q = new double[825];
		this.r = new float[25];

		for (int integer7 = -2; integer7 <= 2; integer7++) {
			for (int integer8 = -2; integer8 <= 2; integer8++) {
				float float9 = 10.0F / ot.c((float)(integer7 * integer7 + integer8 * integer8) + 0.2F);
				this.r[integer7 + 2 + (integer8 + 2) * 5] = float9;
			}
		}

		if (string != null) {
			this.s = avq.a.a(string).b();
			this.t = this.s.F ? alv.l.t() : alv.j.t();
			ajs.b(this.s.q);
		}
	}

	public void a(int integer1, int integer2, avp avp) {
		this.D = this.n.A().a(this.D, integer1 * 4 - 2, integer2 * 4 - 2, 10, 10);
		this.a(integer1 * 4, 0, integer2 * 4);

		for (int integer5 = 0; integer5 < 4; integer5++) {
			int integer6 = integer5 * 5;
			int integer7 = (integer5 + 1) * 5;

			for (int integer8 = 0; integer8 < 4; integer8++) {
				int integer9 = (integer6 + integer8) * 33;
				int integer10 = (integer6 + integer8 + 1) * 33;
				int integer11 = (integer7 + integer8) * 33;
				int integer12 = (integer7 + integer8 + 1) * 33;

				for (int integer13 = 0; integer13 < 32; integer13++) {
					double double14 = 0.125;
					double double16 = this.q[integer9 + integer13];
					double double18 = this.q[integer10 + integer13];
					double double20 = this.q[integer11 + integer13];
					double double22 = this.q[integer12 + integer13];
					double double24 = (this.q[integer9 + integer13 + 1] - double16) * 0.125;
					double double26 = (this.q[integer10 + integer13 + 1] - double18) * 0.125;
					double double28 = (this.q[integer11 + integer13 + 1] - double20) * 0.125;
					double double30 = (this.q[integer12 + integer13 + 1] - double22) * 0.125;

					for (int integer32 = 0; integer32 < 8; integer32++) {
						double double33 = 0.25;
						double double35 = double16;
						double double37 = double18;
						double double39 = (double20 - double16) * 0.25;
						double double41 = (double22 - double18) * 0.25;

						for (int integer43 = 0; integer43 < 4; integer43++) {
							double double44 = 0.25;
							double double48 = (double37 - double35) * 0.25;
							double double46 = double35 - double48;

							for (int integer50 = 0; integer50 < 4; integer50++) {
								if ((double46 += double48) > 0.0) {
									avp.a(integer5 * 4 + integer43, integer13 * 8 + integer32, integer8 * 4 + integer50, a);
								} else if (integer13 * 8 + integer32 < this.s.q) {
									avp.a(integer5 * 4 + integer43, integer13 * 8 + integer32, integer8 * 4 + integer50, this.t);
								}
							}

							double35 += double39;
							double37 += double41;
						}

						double16 += double24;
						double18 += double26;
						double20 += double28;
						double22 += double30;
					}
				}
			}
		}
	}

	public void a(int integer1, int integer2, avp avp, akf[] arr) {
		double double6 = 0.03125;
		this.u = this.m.a(this.u, (double)(integer1 * 16), (double)(integer2 * 16), 16, 16, 0.0625, 0.0625, 1.0);

		for (int integer8 = 0; integer8 < 16; integer8++) {
			for (int integer9 = 0; integer9 < 16; integer9++) {
				akf akf10 = arr[integer9 + integer8 * 16];
				akf10.a(this.n, this.i, avp, integer1 * 16 + integer8, integer2 * 16 + integer9, this.u[integer9 + integer8 * 16]);
			}
		}
	}

	@Override
	public auo a(int integer1, int integer2) {
		this.i.setSeed((long)integer1 * 341873128712L + (long)integer2 * 132897987541L);
		avp avp4 = new avp();
		this.a(integer1, integer2, avp4);
		this.D = this.n.A().b(this.D, integer1 * 16, integer2 * 16, 16, 16);
		this.a(integer1, integer2, avp4, this.D);
		if (this.s.r) {
			this.v.a(this.n, integer1, integer2, avp4);
		}

		if (this.s.A) {
			this.A.a(this.n, integer1, integer2, avp4);
		}

		if (this.o) {
			if (this.s.w) {
				this.y.a(this.n, integer1, integer2, avp4);
			}

			if (this.s.v) {
				this.x.a(this.n, integer1, integer2, avp4);
			}

			if (this.s.u) {
				this.w.a(this.n, integer1, integer2, avp4);
			}

			if (this.s.x) {
				this.z.a(this.n, integer1, integer2, avp4);
			}

			if (this.s.y) {
				this.B.a(this.n, integer1, integer2, avp4);
			}

			if (this.s.z) {
				this.C.a(this.n, integer1, integer2, avp4);
			}
		}

		auo auo5 = new auo(this.n, avp4, integer1, integer2);
		byte[] arr6 = auo5.l();

		for (int integer7 = 0; integer7 < arr6.length; integer7++) {
			arr6[integer7] = (byte)akf.a(this.D[integer7]);
		}

		auo5.b();
		return auo5;
	}

	private void a(int integer1, int integer2, int integer3) {
		this.h = this.c.a(this.h, integer1, integer3, 5, 5, (double)this.s.e, (double)this.s.f, (double)this.s.g);
		float float5 = this.s.a;
		float float6 = this.s.b;
		this.e = this.l.a(this.e, integer1, integer2, integer3, 5, 33, 5, (double)(float5 / this.s.h), (double)(float6 / this.s.i), (double)(float5 / this.s.j));
		this.f = this.j.a(this.f, integer1, integer2, integer3, 5, 33, 5, (double)float5, (double)float6, (double)float5);
		this.g = this.k.a(this.g, integer1, integer2, integer3, 5, 33, 5, (double)float5, (double)float6, (double)float5);
		int integer7 = 0;
		int integer8 = 0;

		for (int integer9 = 0; integer9 < 5; integer9++) {
			for (int integer10 = 0; integer10 < 5; integer10++) {
				float float11 = 0.0F;
				float float12 = 0.0F;
				float float13 = 0.0F;
				int integer14 = 2;
				akf akf15 = this.D[integer9 + 2 + (integer10 + 2) * 10];

				for (int integer16 = -2; integer16 <= 2; integer16++) {
					for (int integer17 = -2; integer17 <= 2; integer17++) {
						akf akf18 = this.D[integer9 + integer16 + 2 + (integer10 + integer17 + 2) * 10];
						float float19 = this.s.n + akf18.j() * this.s.m;
						float float20 = this.s.p + akf18.m() * this.s.o;
						if (this.p == ajx.e && float19 > 0.0F) {
							float19 = 1.0F + float19 * 2.0F;
							float20 = 1.0F + float20 * 4.0F;
						}

						float float21 = this.r[integer16 + 2 + (integer17 + 2) * 5] / (float19 + 2.0F);
						if (akf18.j() > akf15.j()) {
							float21 /= 2.0F;
						}

						float11 += float20 * float21;
						float12 += float19 * float21;
						float13 += float21;
					}
				}

				float11 /= float13;
				float12 /= float13;
				float11 = float11 * 0.9F + 0.1F;
				float12 = (float12 * 4.0F - 1.0F) / 8.0F;
				double double16 = this.h[integer8] / 8000.0;
				if (double16 < 0.0) {
					double16 = -double16 * 0.3;
				}

				double16 = double16 * 3.0 - 2.0;
				if (double16 < 0.0) {
					double16 /= 2.0;
					if (double16 < -1.0) {
						double16 = -1.0;
					}

					double16 /= 1.4;
					double16 /= 2.0;
				} else {
					if (double16 > 1.0) {
						double16 = 1.0;
					}

					double16 /= 8.0;
				}

				integer8++;
				double double18 = (double)float12;
				double double20 = (double)float11;
				double18 += double16 * 0.2;
				double18 = double18 * (double)this.s.k / 8.0;
				double double22 = (double)this.s.k + double18 * 4.0;

				for (int integer24 = 0; integer24 < 33; integer24++) {
					double double25 = ((double)integer24 - double22) * (double)this.s.l * 128.0 / 256.0 / double20;
					if (double25 < 0.0) {
						double25 *= 4.0;
					}

					double double27 = this.f[integer7] / (double)this.s.d;
					double double29 = this.g[integer7] / (double)this.s.c;
					double double31 = (this.e[integer7] / 10.0 + 1.0) / 2.0;
					double double33 = ot.b(double27, double29, double31) - double25;
					if (integer24 > 29) {
						double double35 = (double)((float)(integer24 - 29) / 3.0F);
						double33 = double33 * (1.0 - double35) + -10.0 * double35;
					}

					this.q[integer7] = double33;
					integer7++;
				}
			}
		}
	}

	@Override
	public void b(int integer1, int integer2) {
		anj.f = true;
		int integer4 = integer1 * 16;
		int integer5 = integer2 * 16;
		co co6 = new co(integer4, 0, integer5);
		akf akf7 = this.n.b(co6.a(16, 0, 16));
		this.i.setSeed(this.n.O());
		long long8 = this.i.nextLong() / 2L * 2L + 1L;
		long long10 = this.i.nextLong() / 2L * 2L + 1L;
		this.i.setSeed((long)integer1 * long8 + (long)integer2 * long10 ^ this.n.O());
		boolean boolean12 = false;
		ajl ajl13 = new ajl(integer1, integer2);
		if (this.o) {
			if (this.s.w) {
				this.y.a(this.n, this.i, ajl13);
			}

			if (this.s.v) {
				boolean12 = this.x.a(this.n, this.i, ajl13);
			}

			if (this.s.u) {
				this.w.a(this.n, this.i, ajl13);
			}

			if (this.s.x) {
				this.z.a(this.n, this.i, ajl13);
			}

			if (this.s.y) {
				this.B.a(this.n, this.i, ajl13);
			}

			if (this.s.z) {
				this.C.a(this.n, this.i, ajl13);
			}
		}

		if (akf7 != akk.d && akf7 != akk.s && this.s.B && !boolean12 && this.i.nextInt(this.s.C) == 0) {
			int integer14 = this.i.nextInt(16) + 8;
			int integer15 = this.i.nextInt(256);
			int integer16 = this.i.nextInt(16) + 8;
			new awx(alv.j).b(this.n, this.i, co6.a(integer14, integer15, integer16));
		}

		if (!boolean12 && this.i.nextInt(this.s.E / 10) == 0 && this.s.D) {
			int integer14 = this.i.nextInt(16) + 8;
			int integer15 = this.i.nextInt(this.i.nextInt(248) + 8);
			int integer16 = this.i.nextInt(16) + 8;
			if (integer15 < this.n.K() || this.i.nextInt(this.s.E / 8) == 0) {
				new awx(alv.l).b(this.n, this.i, co6.a(integer14, integer15, integer16));
			}
		}

		if (this.s.s) {
			for (int integer14 = 0; integer14 < this.s.t; integer14++) {
				int integer15 = this.i.nextInt(16) + 8;
				int integer16 = this.i.nextInt(256);
				int integer17 = this.i.nextInt(16) + 8;
				new axd().b(this.n, this.i, co6.a(integer15, integer16, integer17));
			}
		}

		akf7.a(this.n, this.i, new co(integer4, 0, integer5));
		ajz.a(this.n, akf7, integer4 + 8, integer5 + 8, 16, 16, this.i);
		co6 = co6.a(8, 0, 8);

		for (int integer14 = 0; integer14 < 16; integer14++) {
			for (int integer15 = 0; integer15 < 16; integer15++) {
				co co16 = this.n.p(co6.a(integer14, 0, integer15));
				co co17 = co16.b();
				if (this.n.u(co17)) {
					this.n.a(co17, alv.aI.t(), 2);
				}

				if (this.n.f(co16, true)) {
					this.n.a(co16, alv.aH.t(), 2);
				}
			}
		}

		anj.f = false;
	}

	@Override
	public boolean a(auo auo, int integer2, int integer3) {
		boolean boolean5 = false;
		if (this.s.y && this.o && auo.x() < 3600L) {
			boolean5 |= this.B.a(this.n, this.i, new ajl(integer2, integer3));
		}

		return boolean5;
	}

	@Override
	public List<akf.c> a(sy sy, co co) {
		akf akf4 = this.n.b(co);
		if (this.o) {
			if (sy == sy.MONSTER && this.z.a(co)) {
				return this.z.b();
			}

			if (sy == sy.MONSTER && this.s.y && this.B.a(this.n, co)) {
				return this.B.b();
			}
		}

		return akf4.a(sy);
	}

	@Nullable
	@Override
	public co a(ajs ajs, String string, co co, boolean boolean4) {
		if (!this.o) {
			return null;
		} else if ("Stronghold".equals(string) && this.w != null) {
			return this.w.a(ajs, co, boolean4);
		} else if ("Mansion".equals(string) && this.C != null) {
			return this.C.a(ajs, co, boolean4);
		} else if ("Monument".equals(string) && this.B != null) {
			return this.B.a(ajs, co, boolean4);
		} else if ("Village".equals(string) && this.x != null) {
			return this.x.a(ajs, co, boolean4);
		} else if ("Mineshaft".equals(string) && this.y != null) {
			return this.y.a(ajs, co, boolean4);
		} else {
			return "Temple".equals(string) && this.z != null ? this.z.a(ajs, co, boolean4) : null;
		}
	}

	@Override
	public void b(auo auo, int integer2, int integer3) {
		if (this.o) {
			if (this.s.w) {
				this.y.a(this.n, integer2, integer3, null);
			}

			if (this.s.v) {
				this.x.a(this.n, integer2, integer3, null);
			}

			if (this.s.u) {
				this.w.a(this.n, integer2, integer3, null);
			}

			if (this.s.x) {
				this.z.a(this.n, integer2, integer3, null);
			}

			if (this.s.y) {
				this.B.a(this.n, integer2, integer3, null);
			}

			if (this.s.z) {
				this.C.a(this.n, integer2, integer3, null);
			}
		}
	}
}
