import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class avy implements aui {
	private final Random h;
	protected static final atl a = alv.bH.t();
	protected static final atl b = alv.a.t();
	private final azi i;
	private final azi j;
	private final azi k;
	public azi c;
	public azi d;
	private final ajs l;
	private final boolean m;
	private final co n;
	private final aya o = new aya(this);
	private final azm p;
	private double[] q;
	private akf[] r;
	double[] e;
	double[] f;
	double[] g;
	private final awl s = new awl();

	public avy(ajs ajs, boolean boolean2, long long3, co co) {
		this.l = ajs;
		this.m = boolean2;
		this.n = co;
		this.h = new Random(long3);
		this.i = new azi(this.h, 16);
		this.j = new azi(this.h, 16);
		this.k = new azi(this.h, 8);
		this.c = new azi(this.h, 10);
		this.d = new azi(this.h, 16);
		this.p = new azm(this.h);
	}

	public void a(int integer1, int integer2, avp avp) {
		int integer5 = 2;
		int integer6 = 3;
		int integer7 = 33;
		int integer8 = 3;
		this.q = this.a(this.q, integer1 * 2, 0, integer2 * 2, 3, 33, 3);

		for (int integer9 = 0; integer9 < 2; integer9++) {
			for (int integer10 = 0; integer10 < 2; integer10++) {
				for (int integer11 = 0; integer11 < 32; integer11++) {
					double double12 = 0.25;
					double double14 = this.q[((integer9 + 0) * 3 + integer10 + 0) * 33 + integer11 + 0];
					double double16 = this.q[((integer9 + 0) * 3 + integer10 + 1) * 33 + integer11 + 0];
					double double18 = this.q[((integer9 + 1) * 3 + integer10 + 0) * 33 + integer11 + 0];
					double double20 = this.q[((integer9 + 1) * 3 + integer10 + 1) * 33 + integer11 + 0];
					double double22 = (this.q[((integer9 + 0) * 3 + integer10 + 0) * 33 + integer11 + 1] - double14) * 0.25;
					double double24 = (this.q[((integer9 + 0) * 3 + integer10 + 1) * 33 + integer11 + 1] - double16) * 0.25;
					double double26 = (this.q[((integer9 + 1) * 3 + integer10 + 0) * 33 + integer11 + 1] - double18) * 0.25;
					double double28 = (this.q[((integer9 + 1) * 3 + integer10 + 1) * 33 + integer11 + 1] - double20) * 0.25;

					for (int integer30 = 0; integer30 < 4; integer30++) {
						double double31 = 0.125;
						double double33 = double14;
						double double35 = double16;
						double double37 = (double18 - double14) * 0.125;
						double double39 = (double20 - double16) * 0.125;

						for (int integer41 = 0; integer41 < 8; integer41++) {
							double double42 = 0.125;
							double double44 = double33;
							double double46 = (double35 - double33) * 0.125;

							for (int integer48 = 0; integer48 < 8; integer48++) {
								atl atl49 = b;
								if (double44 > 0.0) {
									atl49 = a;
								}

								int integer50 = integer41 + integer9 * 8;
								int integer51 = integer30 + integer11 * 4;
								int integer52 = integer48 + integer10 * 8;
								avp.a(integer50, integer51, integer52, atl49);
								double44 += double46;
							}

							double33 += double37;
							double35 += double39;
						}

						double14 += double22;
						double16 += double24;
						double18 += double26;
						double20 += double28;
					}
				}
			}
		}
	}

	public void a(avp avp) {
		for (int integer3 = 0; integer3 < 16; integer3++) {
			for (int integer4 = 0; integer4 < 16; integer4++) {
				int integer5 = 1;
				int integer6 = -1;
				atl atl7 = a;
				atl atl8 = a;

				for (int integer9 = 127; integer9 >= 0; integer9--) {
					atl atl10 = avp.a(integer3, integer9, integer4);
					if (atl10.a() == azs.a) {
						integer6 = -1;
					} else if (atl10.v() == alv.b) {
						if (integer6 == -1) {
							integer6 = 1;
							if (integer9 >= 0) {
								avp.a(integer3, integer9, integer4, atl7);
							} else {
								avp.a(integer3, integer9, integer4, atl8);
							}
						} else if (integer6 > 0) {
							integer6--;
							avp.a(integer3, integer9, integer4, atl8);
						}
					}
				}
			}
		}
	}

	@Override
	public auo a(int integer1, int integer2) {
		this.h.setSeed((long)integer1 * 341873128712L + (long)integer2 * 132897987541L);
		avp avp4 = new avp();
		this.r = this.l.A().b(this.r, integer1 * 16, integer2 * 16, 16, 16);
		this.a(integer1, integer2, avp4);
		this.a(avp4);
		if (this.m) {
			this.o.a(this.l, integer1, integer2, avp4);
		}

		auo auo5 = new auo(this.l, avp4, integer1, integer2);
		byte[] arr6 = auo5.l();

		for (int integer7 = 0; integer7 < arr6.length; integer7++) {
			arr6[integer7] = (byte)akf.a(this.r[integer7]);
		}

		auo5.b();
		return auo5;
	}

	private float a(int integer1, int integer2, int integer3, int integer4) {
		float float6 = (float)(integer1 * 2 + integer3);
		float float7 = (float)(integer2 * 2 + integer4);
		float float8 = 100.0F - ot.c(float6 * float6 + float7 * float7) * 8.0F;
		if (float8 > 80.0F) {
			float8 = 80.0F;
		}

		if (float8 < -100.0F) {
			float8 = -100.0F;
		}

		for (int integer9 = -12; integer9 <= 12; integer9++) {
			for (int integer10 = -12; integer10 <= 12; integer10++) {
				long long11 = (long)(integer1 + integer9);
				long long13 = (long)(integer2 + integer10);
				if (long11 * long11 + long13 * long13 > 4096L && this.p.a((double)long11, (double)long13) < -0.9F) {
					float float15 = (ot.e((float)long11) * 3439.0F + ot.e((float)long13) * 147.0F) % 13.0F + 9.0F;
					float6 = (float)(integer3 - integer9 * 2);
					float7 = (float)(integer4 - integer10 * 2);
					float float16 = 100.0F - ot.c(float6 * float6 + float7 * float7) * float15;
					if (float16 > 80.0F) {
						float16 = 80.0F;
					}

					if (float16 < -100.0F) {
						float16 = -100.0F;
					}

					if (float16 > float8) {
						float8 = float16;
					}
				}
			}
		}

		return float8;
	}

	public boolean c(int integer1, int integer2) {
		return (long)integer1 * (long)integer1 + (long)integer2 * (long)integer2 > 4096L && this.a(integer1, integer2, 1, 1) >= 0.0F;
	}

	private double[] a(double[] arr, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7) {
		if (arr == null) {
			arr = new double[integer5 * integer6 * integer7];
		}

		double double9 = 684.412;
		double double11 = 684.412;
		double9 *= 2.0;
		this.e = this.k.a(this.e, integer2, integer3, integer4, integer5, integer6, integer7, double9 / 80.0, 4.277575000000001, double9 / 80.0);
		this.f = this.i.a(this.f, integer2, integer3, integer4, integer5, integer6, integer7, double9, 684.412, double9);
		this.g = this.j.a(this.g, integer2, integer3, integer4, integer5, integer6, integer7, double9, 684.412, double9);
		int integer13 = integer2 / 2;
		int integer14 = integer4 / 2;
		int integer15 = 0;

		for (int integer16 = 0; integer16 < integer5; integer16++) {
			for (int integer17 = 0; integer17 < integer7; integer17++) {
				float float18 = this.a(integer13, integer14, integer16, integer17);

				for (int integer19 = 0; integer19 < integer6; integer19++) {
					double double20 = this.f[integer15] / 512.0;
					double double22 = this.g[integer15] / 512.0;
					double double26 = (this.e[integer15] / 10.0 + 1.0) / 2.0;
					double double24;
					if (double26 < 0.0) {
						double24 = double20;
					} else if (double26 > 1.0) {
						double24 = double22;
					} else {
						double24 = double20 + (double22 - double20) * double26;
					}

					double24 -= 8.0;
					double24 += (double)float18;
					int integer28 = 2;
					if (integer19 > integer6 / 2 - integer28) {
						double double29 = (double)((float)(integer19 - (integer6 / 2 - integer28)) / 64.0F);
						double29 = ot.a(double29, 0.0, 1.0);
						double24 = double24 * (1.0 - double29) + -3000.0 * double29;
					}

					int var33 = 8;
					if (integer19 < var33) {
						double double29 = (double)((float)(var33 - integer19) / ((float)var33 - 1.0F));
						double24 = double24 * (1.0 - double29) + -30.0 * double29;
					}

					arr[integer15] = double24;
					integer15++;
				}
			}
		}

		return arr;
	}

	@Override
	public void b(int integer1, int integer2) {
		anj.f = true;
		co co4 = new co(integer1 * 16, 0, integer2 * 16);
		if (this.m) {
			this.o.a(this.l, this.h, new ajl(integer1, integer2));
		}

		this.l.b(co4.a(16, 0, 16)).a(this.l, this.l.r, co4);
		long long5 = (long)integer1 * (long)integer1 + (long)integer2 * (long)integer2;
		if (long5 > 4096L) {
			float float7 = this.a(integer1, integer2, 1, 1);
			if (float7 < -20.0F && this.h.nextInt(14) == 0) {
				this.s.b(this.l, this.h, co4.a(this.h.nextInt(16) + 8, 55 + this.h.nextInt(16), this.h.nextInt(16) + 8));
				if (this.h.nextInt(4) == 0) {
					this.s.b(this.l, this.h, co4.a(this.h.nextInt(16) + 8, 55 + this.h.nextInt(16), this.h.nextInt(16) + 8));
				}
			}

			if (this.a(integer1, integer2, 1, 1) > 40.0F) {
				int integer8 = this.h.nextInt(5);

				for (int integer9 = 0; integer9 < integer8; integer9++) {
					int integer10 = this.h.nextInt(16) + 8;
					int integer11 = this.h.nextInt(16) + 8;
					int integer12 = this.l.l(co4.a(integer10, 0, integer11)).q();
					if (integer12 > 0) {
						int integer13 = integer12 - 1;
						if (this.l.d(co4.a(integer10, integer13 + 1, integer11)) && this.l.o(co4.a(integer10, integer13, integer11)).v() == alv.bH) {
							amh.a(this.l, co4.a(integer10, integer13 + 1, integer11), this.h, 8);
						}
					}
				}

				if (this.h.nextInt(700) == 0) {
					int integer9x = this.h.nextInt(16) + 8;
					int integer10 = this.h.nextInt(16) + 8;
					int integer11 = this.l.l(co4.a(integer9x, 0, integer10)).q();
					if (integer11 > 0) {
						int integer12 = integer11 + 3 + this.h.nextInt(7);
						co co13 = co4.a(integer9x, integer12, integer10);
						new awk().b(this.l, this.h, co13);
						asc asc14 = this.l.r(co13);
						if (asc14 instanceof asy) {
							asy asy15 = (asy)asc14;
							asy15.b(this.n);
						}
					}
				}
			}
		}

		anj.f = false;
	}

	@Override
	public boolean a(auo auo, int integer2, int integer3) {
		return false;
	}

	@Override
	public List<akf.c> a(sy sy, co co) {
		return this.l.b(co).a(sy);
	}

	@Nullable
	@Override
	public co a(ajs ajs, String string, co co, boolean boolean4) {
		return "EndCity".equals(string) && this.o != null ? this.o.a(ajs, co, boolean4) : null;
	}

	@Override
	public void b(auo auo, int integer2, int integer3) {
	}
}
