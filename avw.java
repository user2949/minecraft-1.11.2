import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class avw implements aui {
	protected static final atl a = alv.a.t();
	protected static final atl b = alv.aV.t();
	protected static final atl c = alv.h.t();
	protected static final atl d = alv.l.t();
	protected static final atl e = alv.n.t();
	protected static final atl f = alv.aW.t();
	private final ajs n;
	private final boolean o;
	private final Random p;
	private double[] q = new double[256];
	private double[] r = new double[256];
	private double[] s = new double[256];
	private double[] t;
	private final azi u;
	private final azi v;
	private final azi w;
	private final azi x;
	private final azi y;
	public final azi g;
	public final azi h;
	private final awr z = new awr();
	private final awy A = new awy();
	private final aws B = new aws();
	private final awn C = new axe(alv.co.t(), 14, att.a(alv.aV));
	private final awn D = new axe(alv.df.t(), 33, att.a(alv.aV));
	private final awt E = new awt(alv.k, true);
	private final awt F = new awt(alv.k, false);
	private final awe G = new awe(alv.P);
	private final awe H = new awe(alv.Q);
	private final ayf I = new ayf();
	private final avu J = new avv();
	double[] i;
	double[] j;
	double[] k;
	double[] l;
	double[] m;

	public avw(ajs ajs, boolean boolean2, long long3) {
		this.n = ajs;
		this.o = boolean2;
		this.p = new Random(long3);
		this.u = new azi(this.p, 16);
		this.v = new azi(this.p, 16);
		this.w = new azi(this.p, 8);
		this.x = new azi(this.p, 4);
		this.y = new azi(this.p, 4);
		this.g = new azi(this.p, 10);
		this.h = new azi(this.p, 16);
		ajs.b(63);
	}

	public void a(int integer1, int integer2, avp avp) {
		int integer5 = 4;
		int integer6 = this.n.K() / 2 + 1;
		int integer7 = 5;
		int integer8 = 17;
		int integer9 = 5;
		this.t = this.a(this.t, integer1 * 4, 0, integer2 * 4, 5, 17, 5);

		for (int integer10 = 0; integer10 < 4; integer10++) {
			for (int integer11 = 0; integer11 < 4; integer11++) {
				for (int integer12 = 0; integer12 < 16; integer12++) {
					double double13 = 0.125;
					double double15 = this.t[((integer10 + 0) * 5 + integer11 + 0) * 17 + integer12 + 0];
					double double17 = this.t[((integer10 + 0) * 5 + integer11 + 1) * 17 + integer12 + 0];
					double double19 = this.t[((integer10 + 1) * 5 + integer11 + 0) * 17 + integer12 + 0];
					double double21 = this.t[((integer10 + 1) * 5 + integer11 + 1) * 17 + integer12 + 0];
					double double23 = (this.t[((integer10 + 0) * 5 + integer11 + 0) * 17 + integer12 + 1] - double15) * 0.125;
					double double25 = (this.t[((integer10 + 0) * 5 + integer11 + 1) * 17 + integer12 + 1] - double17) * 0.125;
					double double27 = (this.t[((integer10 + 1) * 5 + integer11 + 0) * 17 + integer12 + 1] - double19) * 0.125;
					double double29 = (this.t[((integer10 + 1) * 5 + integer11 + 1) * 17 + integer12 + 1] - double21) * 0.125;

					for (int integer31 = 0; integer31 < 8; integer31++) {
						double double32 = 0.25;
						double double34 = double15;
						double double36 = double17;
						double double38 = (double19 - double15) * 0.25;
						double double40 = (double21 - double17) * 0.25;

						for (int integer42 = 0; integer42 < 4; integer42++) {
							double double43 = 0.25;
							double double45 = double34;
							double double47 = (double36 - double34) * 0.25;

							for (int integer49 = 0; integer49 < 4; integer49++) {
								atl atl50 = null;
								if (integer12 * 8 + integer31 < integer6) {
									atl50 = d;
								}

								if (double45 > 0.0) {
									atl50 = b;
								}

								int integer51 = integer42 + integer10 * 4;
								int integer52 = integer31 + integer12 * 8;
								int integer53 = integer49 + integer11 * 4;
								avp.a(integer51, integer52, integer53, atl50);
								double45 += double47;
							}

							double34 += double38;
							double36 += double40;
						}

						double15 += double23;
						double17 += double25;
						double19 += double27;
						double21 += double29;
					}
				}
			}
		}
	}

	public void b(int integer1, int integer2, avp avp) {
		int integer5 = this.n.K() + 1;
		double double6 = 0.03125;
		this.q = this.x.a(this.q, integer1 * 16, integer2 * 16, 0, 16, 16, 1, 0.03125, 0.03125, 1.0);
		this.r = this.x.a(this.r, integer1 * 16, 109, integer2 * 16, 16, 1, 16, 0.03125, 1.0, 0.03125);
		this.s = this.y.a(this.s, integer1 * 16, integer2 * 16, 0, 16, 16, 1, 0.0625, 0.0625, 0.0625);

		for (int integer8 = 0; integer8 < 16; integer8++) {
			for (int integer9 = 0; integer9 < 16; integer9++) {
				boolean boolean10 = this.q[integer8 + integer9 * 16] + this.p.nextDouble() * 0.2 > 0.0;
				boolean boolean11 = this.r[integer8 + integer9 * 16] + this.p.nextDouble() * 0.2 > 0.0;
				int integer12 = (int)(this.s[integer8 + integer9 * 16] / 3.0 + 3.0 + this.p.nextDouble() * 0.25);
				int integer13 = -1;
				atl atl14 = b;
				atl atl15 = b;

				for (int integer16 = 127; integer16 >= 0; integer16--) {
					if (integer16 < 127 - this.p.nextInt(5) && integer16 > this.p.nextInt(5)) {
						atl atl17 = avp.a(integer9, integer16, integer8);
						if (atl17.v() == null || atl17.a() == azs.a) {
							integer13 = -1;
						} else if (atl17.v() == alv.aV) {
							if (integer13 == -1) {
								if (integer12 <= 0) {
									atl14 = a;
									atl15 = b;
								} else if (integer16 >= integer5 - 4 && integer16 <= integer5 + 1) {
									atl14 = b;
									atl15 = b;
									if (boolean11) {
										atl14 = e;
										atl15 = b;
									}

									if (boolean10) {
										atl14 = f;
										atl15 = f;
									}
								}

								if (integer16 < integer5 && (atl14 == null || atl14.a() == azs.a)) {
									atl14 = d;
								}

								integer13 = integer12;
								if (integer16 >= integer5 - 1) {
									avp.a(integer9, integer16, integer8, atl14);
								} else {
									avp.a(integer9, integer16, integer8, atl15);
								}
							} else if (integer13 > 0) {
								integer13--;
								avp.a(integer9, integer16, integer8, atl15);
							}
						}
					} else {
						avp.a(integer9, integer16, integer8, c);
					}
				}
			}
		}
	}

	@Override
	public auo a(int integer1, int integer2) {
		this.p.setSeed((long)integer1 * 341873128712L + (long)integer2 * 132897987541L);
		avp avp4 = new avp();
		this.a(integer1, integer2, avp4);
		this.b(integer1, integer2, avp4);
		this.J.a(this.n, integer1, integer2, avp4);
		if (this.o) {
			this.I.a(this.n, integer1, integer2, avp4);
		}

		auo auo5 = new auo(this.n, avp4, integer1, integer2);
		akf[] arr6 = this.n.A().b(null, integer1 * 16, integer2 * 16, 16, 16);
		byte[] arr7 = auo5.l();

		for (int integer8 = 0; integer8 < arr7.length; integer8++) {
			arr7[integer8] = (byte)akf.a(arr6[integer8]);
		}

		auo5.m();
		return auo5;
	}

	private double[] a(double[] arr, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7) {
		if (arr == null) {
			arr = new double[integer5 * integer6 * integer7];
		}

		double double9 = 684.412;
		double double11 = 2053.236;
		this.l = this.g.a(this.l, integer2, integer3, integer4, integer5, 1, integer7, 1.0, 0.0, 1.0);
		this.m = this.h.a(this.m, integer2, integer3, integer4, integer5, 1, integer7, 100.0, 0.0, 100.0);
		this.i = this.w.a(this.i, integer2, integer3, integer4, integer5, integer6, integer7, 8.555150000000001, 34.2206, 8.555150000000001);
		this.j = this.u.a(this.j, integer2, integer3, integer4, integer5, integer6, integer7, 684.412, 2053.236, 684.412);
		this.k = this.v.a(this.k, integer2, integer3, integer4, integer5, integer6, integer7, 684.412, 2053.236, 684.412);
		int integer13 = 0;
		double[] arr14 = new double[integer6];

		for (int integer15 = 0; integer15 < integer6; integer15++) {
			arr14[integer15] = Math.cos((double)integer15 * Math.PI * 6.0 / (double)integer6) * 2.0;
			double double16 = (double)integer15;
			if (integer15 > integer6 / 2) {
				double16 = (double)(integer6 - 1 - integer15);
			}

			if (double16 < 4.0) {
				double16 = 4.0 - double16;
				arr14[integer15] -= double16 * double16 * double16 * 10.0;
			}
		}

		for (int integer15 = 0; integer15 < integer5; integer15++) {
			for (int integer16 = 0; integer16 < integer7; integer16++) {
				double double17 = 0.0;

				for (int integer19 = 0; integer19 < integer6; integer19++) {
					double double20 = arr14[integer19];
					double double22 = this.j[integer13] / 512.0;
					double double24 = this.k[integer13] / 512.0;
					double double26 = (this.i[integer13] / 10.0 + 1.0) / 2.0;
					double double28;
					if (double26 < 0.0) {
						double28 = double22;
					} else if (double26 > 1.0) {
						double28 = double24;
					} else {
						double28 = double22 + (double24 - double22) * double26;
					}

					double28 -= double20;
					if (integer19 > integer6 - 4) {
						double double30 = (double)((float)(integer19 - (integer6 - 4)) / 3.0F);
						double28 = double28 * (1.0 - double30) + -10.0 * double30;
					}

					if ((double)integer19 < 0.0) {
						double double30 = (0.0 - (double)integer19) / 4.0;
						double30 = ot.a(double30, 0.0, 1.0);
						double28 = double28 * (1.0 - double30) + -10.0 * double30;
					}

					arr[integer13] = double28;
					integer13++;
				}
			}
		}

		return arr;
	}

	@Override
	public void b(int integer1, int integer2) {
		anj.f = true;
		int integer4 = integer1 * 16;
		int integer5 = integer2 * 16;
		co co6 = new co(integer4, 0, integer5);
		akf akf7 = this.n.b(co6.a(16, 0, 16));
		ajl ajl8 = new ajl(integer1, integer2);
		this.I.a(this.n, this.p, ajl8);

		for (int integer9 = 0; integer9 < 8; integer9++) {
			this.F.b(this.n, this.p, co6.a(this.p.nextInt(16) + 8, this.p.nextInt(120) + 4, this.p.nextInt(16) + 8));
		}

		for (int integer9 = 0; integer9 < this.p.nextInt(this.p.nextInt(10) + 1) + 1; integer9++) {
			this.z.b(this.n, this.p, co6.a(this.p.nextInt(16) + 8, this.p.nextInt(120) + 4, this.p.nextInt(16) + 8));
		}

		for (int integer9 = 0; integer9 < this.p.nextInt(this.p.nextInt(10) + 1); integer9++) {
			this.A.b(this.n, this.p, co6.a(this.p.nextInt(16) + 8, this.p.nextInt(120) + 4, this.p.nextInt(16) + 8));
		}

		for (int integer9 = 0; integer9 < 10; integer9++) {
			this.B.b(this.n, this.p, co6.a(this.p.nextInt(16) + 8, this.p.nextInt(128), this.p.nextInt(16) + 8));
		}

		if (this.p.nextBoolean()) {
			this.G.b(this.n, this.p, co6.a(this.p.nextInt(16) + 8, this.p.nextInt(128), this.p.nextInt(16) + 8));
		}

		if (this.p.nextBoolean()) {
			this.H.b(this.n, this.p, co6.a(this.p.nextInt(16) + 8, this.p.nextInt(128), this.p.nextInt(16) + 8));
		}

		for (int integer9 = 0; integer9 < 16; integer9++) {
			this.C.b(this.n, this.p, co6.a(this.p.nextInt(16), this.p.nextInt(108) + 10, this.p.nextInt(16)));
		}

		int integer9 = this.n.K() / 2 + 1;

		for (int integer10 = 0; integer10 < 4; integer10++) {
			this.D.b(this.n, this.p, co6.a(this.p.nextInt(16), integer9 - 5 + this.p.nextInt(10), this.p.nextInt(16)));
		}

		for (int integer10 = 0; integer10 < 16; integer10++) {
			this.E.b(this.n, this.p, co6.a(this.p.nextInt(16), this.p.nextInt(108) + 10, this.p.nextInt(16)));
		}

		akf7.a(this.n, this.p, new co(integer4, 0, integer5));
		anj.f = false;
	}

	@Override
	public boolean a(auo auo, int integer2, int integer3) {
		return false;
	}

	@Override
	public List<akf.c> a(sy sy, co co) {
		if (sy == sy.MONSTER) {
			if (this.I.b(co)) {
				return this.I.b();
			}

			if (this.I.a(this.n, co) && this.n.o(co.b()).v() == alv.by) {
				return this.I.b();
			}
		}

		akf akf4 = this.n.b(co);
		return akf4.a(sy);
	}

	@Nullable
	@Override
	public co a(ajs ajs, String string, co co, boolean boolean4) {
		return "Fortress".equals(string) && this.I != null ? this.I.a(ajs, co, boolean4) : null;
	}

	@Override
	public void b(auo auo, int integer2, int integer3) {
		this.I.a(this.n, integer2, integer3, null);
	}
}
