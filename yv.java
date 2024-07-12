import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;

public class yv extends aaa implements aac {
	private static final kk<Integer> a = kn.a(yv.class, km.b);
	private static final kk<Integer> b = kn.a(yv.class, km.b);
	private static final kk<Integer> c = kn.a(yv.class, km.b);
	private static final kk<Integer>[] bw = new kk[]{a, b, c};
	private static final kk<Integer> bx = kn.a(yv.class, km.b);
	private final float[] by = new float[2];
	private final float[] bz = new float[2];
	private final float[] bA = new float[2];
	private final float[] bB = new float[2];
	private final int[] bC = new int[2];
	private final int[] bD = new int[2];
	private int bE;
	private final lu bF = (lu)new lu(this.i_(), ra.a.PURPLE, ra.b.PROGRESS).a(true);
	private static final Predicate<sn> bG = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn instanceof sw && ((sw)sn).cf() != tb.UNDEAD && ((sw)sn).cK();
		}
	};

	public yv(ajs ajs) {
		super(ajs);
		this.c(this.cb());
		this.a(0.9F, 3.5F);
		this.X = true;
		((we)this.x()).c(true);
		this.b_ = 50;
	}

	@Override
	protected void r() {
		this.bq.a(0, new yv.a());
		this.bq.a(1, new uf(this));
		this.bq.a(2, new vg(this, 1.0, 40, 20.0F));
		this.bq.a(5, new vr(this, 1.0));
		this.bq.a(6, new uo(this, aay.class, 8.0F));
		this.bq.a(7, new ve(this));
		this.br.a(1, new vv(this, false));
		this.br.a(2, new vy(this, sx.class, 0, false, false, bG));
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, 0);
		this.Y.a(b, 0);
		this.Y.a(c, 0);
		this.Y.a(bx, 0);
	}

	public static void a(ph ph) {
		sx.a(ph, yv.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Invul", this.dh());
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.g(du.h("Invul"));
		if (this.n_()) {
			this.bF.a(this.i_());
		}
	}

	@Override
	public void c(String string) {
		super.c(string);
		this.bF.a(this.i_());
	}

	@Override
	protected nm G() {
		return nn.hy;
	}

	@Override
	protected nm bW() {
		return nn.hB;
	}

	@Override
	protected nm bX() {
		return nn.hA;
	}

	@Override
	public void n() {
		this.t *= 0.6F;
		if (!this.l.E && this.m(0) > 0) {
			sn sn2 = this.l.a(this.m(0));
			if (sn2 != null) {
				if (this.q < sn2.q || !this.di() && this.q < sn2.q + 5.0) {
					if (this.t < 0.0) {
						this.t = 0.0;
					}

					this.t = this.t + (0.5 - this.t) * 0.6F;
				}

				double double3 = sn2.p - this.p;
				double double5 = sn2.r - this.r;
				double double7 = double3 * double3 + double5 * double5;
				if (double7 > 9.0) {
					double double9 = (double)ot.a(double7);
					this.s = this.s + (double3 / double9 * 0.5 - this.s) * 0.6F;
					this.u = this.u + (double5 / double9 * 0.5 - this.u) * 0.6F;
				}
			}
		}

		if (this.s * this.s + this.u * this.u > 0.05F) {
			this.v = (float)ot.c(this.u, this.s) * (180.0F / (float)Math.PI) - 90.0F;
		}

		super.n();

		for (int integer2 = 0; integer2 < 2; integer2++) {
			this.bB[integer2] = this.bz[integer2];
			this.bA[integer2] = this.by[integer2];
		}

		for (int integer2 = 0; integer2 < 2; integer2++) {
			int integer3 = this.m(integer2 + 1);
			sn sn4 = null;
			if (integer3 > 0) {
				sn4 = this.l.a(integer3);
			}

			if (sn4 != null) {
				double double5 = this.n(integer2 + 1);
				double double7 = this.o(integer2 + 1);
				double double9 = this.p(integer2 + 1);
				double double11 = sn4.p - double5;
				double double13 = sn4.q + (double)sn4.bq() - double7;
				double double15 = sn4.r - double9;
				double double17 = (double)ot.a(double11 * double11 + double15 * double15);
				float float19 = (float)(ot.c(double15, double11) * 180.0F / (float)Math.PI) - 90.0F;
				float float20 = (float)(-(ot.c(double13, double17) * 180.0F / (float)Math.PI));
				this.by[integer2] = this.b(this.by[integer2], float20, 40.0F);
				this.bz[integer2] = this.b(this.bz[integer2], float19, 10.0F);
			} else {
				this.bz[integer2] = this.b(this.bz[integer2], this.aN, 10.0F);
			}
		}

		boolean boolean2 = this.di();

		for (int integer3x = 0; integer3x < 3; integer3x++) {
			double double4 = this.n(integer3x);
			double double6 = this.o(integer3x);
			double double8 = this.p(integer3x);
			this.l
				.a(de.SMOKE_NORMAL, double4 + this.S.nextGaussian() * 0.3F, double6 + this.S.nextGaussian() * 0.3F, double8 + this.S.nextGaussian() * 0.3F, 0.0, 0.0, 0.0);
			if (boolean2 && this.l.r.nextInt(4) == 0) {
				this.l
					.a(de.SPELL_MOB, double4 + this.S.nextGaussian() * 0.3F, double6 + this.S.nextGaussian() * 0.3F, double8 + this.S.nextGaussian() * 0.3F, 0.7F, 0.7F, 0.5);
			}
		}

		if (this.dh() > 0) {
			for (int integer3xx = 0; integer3xx < 3; integer3xx++) {
				this.l.a(de.SPELL_MOB, this.p + this.S.nextGaussian(), this.q + (double)(this.S.nextFloat() * 3.3F), this.r + this.S.nextGaussian(), 0.7F, 0.7F, 0.9F);
			}
		}
	}

	@Override
	protected void M() {
		if (this.dh() > 0) {
			int integer2 = this.dh() - 1;
			if (integer2 <= 0) {
				this.l.a(this, this.p, this.q + (double)this.bq(), this.r, 7.0F, false, this.l.U().b("mobGriefing"));
				this.l.a(1023, new co(this), 0);
			}

			this.g(integer2);
			if (this.T % 10 == 0) {
				this.b(10.0F);
			}
		} else {
			super.M();

			for (int integer2x = 1; integer2x < 3; integer2x++) {
				if (this.T >= this.bC[integer2x - 1]) {
					this.bC[integer2x - 1] = this.T + 10 + this.S.nextInt(10);
					if ((this.l.ae() == rg.NORMAL || this.l.ae() == rg.HARD) && this.bD[integer2x - 1]++ > 15) {
						float float3 = 10.0F;
						float float4 = 5.0F;
						double double5 = ot.a(this.S, this.p - 10.0, this.p + 10.0);
						double double7 = ot.a(this.S, this.q - 5.0, this.q + 5.0);
						double double9 = ot.a(this.S, this.r - 10.0, this.r + 10.0);
						this.a(integer2x + 1, double5, double7, double9, true);
						this.bD[integer2x - 1] = 0;
					}

					int integer3 = this.m(integer2x);
					if (integer3 > 0) {
						sn sn4 = this.l.a(integer3);
						if (sn4 == null || !sn4.au() || this.h(sn4) > 900.0 || !this.D(sn4)) {
							this.a(integer2x, 0);
						} else if (sn4 instanceof aay && ((aay)sn4).bK.a) {
							this.a(integer2x, 0);
						} else {
							this.a(integer2x + 1, (sw)sn4);
							this.bC[integer2x - 1] = this.T + 40 + this.S.nextInt(20);
							this.bD[integer2x - 1] = 0;
						}
					} else {
						List<sw> list4 = this.l.a(sw.class, this.bo().c(20.0, 8.0, 20.0), Predicates.and(bG, sr.e));

						for (int integer5 = 0; integer5 < 10 && !list4.isEmpty(); integer5++) {
							sw sw6 = (sw)list4.get(this.S.nextInt(list4.size()));
							if (sw6 != this && sw6.au() && this.D(sw6)) {
								if (sw6 instanceof aay) {
									if (!((aay)sw6).bK.a) {
										this.a(integer2x, sw6.O());
									}
								} else {
									this.a(integer2x, sw6.O());
								}
								break;
							}

							list4.remove(sw6);
						}
					}
				}
			}

			if (this.z() != null) {
				this.a(0, this.z().O());
			} else {
				this.a(0, 0);
			}

			if (this.bE > 0) {
				this.bE--;
				if (this.bE == 0 && this.l.U().b("mobGriefing")) {
					int integer2xx = ot.c(this.q);
					int integer3 = ot.c(this.p);
					int integer4 = ot.c(this.r);
					boolean boolean5 = false;

					for (int integer6 = -1; integer6 <= 1; integer6++) {
						for (int integer7 = -1; integer7 <= 1; integer7++) {
							for (int integer8 = 0; integer8 <= 3; integer8++) {
								int integer9 = integer3 + integer6;
								int integer10 = integer2xx + integer8;
								int integer11 = integer4 + integer7;
								co co12 = new co(integer9, integer10, integer11);
								atl atl13 = this.l.o(co12);
								alu alu14 = atl13.v();
								if (atl13.a() != azs.a && a(alu14)) {
									boolean5 = this.l.b(co12, true) || boolean5;
								}
							}
						}
					}

					if (boolean5) {
						this.l.a(null, 1022, new co(this), 0);
					}
				}
			}

			if (this.T % 20 == 0) {
				this.b(1.0F);
			}

			this.bF.a(this.bU() / this.cb());
		}
	}

	public static boolean a(alu alu) {
		return alu != alv.h && alu != alv.bF && alu != alv.bG && alu != alv.bX && alu != alv.dc && alu != alv.dd && alu != alv.cv && alu != alv.dB && alu != alv.dj;
	}

	@Override
	public void o() {
		this.g(220);
		this.c(this.cb() / 3.0F);
	}

	@Override
	public void aS() {
	}

	@Override
	public void b(ly ly) {
		super.b(ly);
		this.bF.a(ly);
	}

	@Override
	public void c(ly ly) {
		super.c(ly);
		this.bF.b(ly);
	}

	private double n(int integer) {
		if (integer <= 0) {
			return this.p;
		} else {
			float float3 = (this.aN + (float)(180 * (integer - 1))) * (float) (Math.PI / 180.0);
			float float4 = ot.b(float3);
			return this.p + (double)float4 * 1.3;
		}
	}

	private double o(int integer) {
		return integer <= 0 ? this.q + 3.0 : this.q + 2.2;
	}

	private double p(int integer) {
		if (integer <= 0) {
			return this.r;
		} else {
			float float3 = (this.aN + (float)(180 * (integer - 1))) * (float) (Math.PI / 180.0);
			float float4 = ot.a(float3);
			return this.r + (double)float4 * 1.3;
		}
	}

	private float b(float float1, float float2, float float3) {
		float float5 = ot.g(float2 - float1);
		if (float5 > float3) {
			float5 = float3;
		}

		if (float5 < -float3) {
			float5 = -float3;
		}

		return float1 + float5;
	}

	private void a(int integer, sw sw) {
		this.a(integer, sw.p, sw.q + (double)sw.bq() * 0.5, sw.r, integer == 0 && this.S.nextFloat() < 0.001F);
	}

	private void a(int integer, double double2, double double3, double double4, boolean boolean5) {
		this.l.a(null, 1024, new co(this), 0);
		double double10 = this.n(integer);
		double double12 = this.o(integer);
		double double14 = this.p(integer);
		double double16 = double2 - double10;
		double double18 = double3 - double12;
		double double20 = double4 - double14;
		abv abv22 = new abv(this.l, this, double16, double18, double20);
		if (boolean5) {
			abv22.a(true);
		}

		abv22.q = double12;
		abv22.p = double10;
		abv22.r = double14;
		this.l.a(abv22);
	}

	@Override
	public void a(sw sw, float float2) {
		this.a(0, sw);
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else if (ry == ry.h || ry.j() instanceof yv) {
			return false;
		} else if (this.dh() > 0 && ry != ry.m) {
			return false;
		} else {
			if (this.di()) {
				sn sn4 = ry.i();
				if (sn4 instanceof abb) {
					return false;
				}
			}

			sn sn4 = ry.j();
			if (sn4 != null && !(sn4 instanceof aay) && sn4 instanceof sw && ((sw)sn4).cf() == this.cf()) {
				return false;
			} else {
				if (this.bE <= 0) {
					this.bE = 20;
				}

				for (int integer5 = 0; integer5 < this.bD.length; integer5++) {
					this.bD[integer5] = this.bD[integer5] + 3;
				}

				return super.a(ry, float2);
			}
		}
	}

	@Override
	protected void b(boolean boolean1, int integer) {
		zj zj4 = this.a(afl.ck, 1);
		if (zj4 != null) {
			zj4.v();
		}

		if (!this.l.E) {
			for (aay aay6 : this.l.a(aay.class, this.bo().c(50.0, 100.0, 50.0))) {
				aay6.b(nr.J);
			}
		}
	}

	@Override
	protected void L() {
		this.aV = 0;
	}

	@Override
	public int d(float float1) {
		return 15728880;
	}

	@Override
	public void e(float float1, float float2) {
	}

	@Override
	public void c(sh sh) {
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(300.0);
		this.a(aad.d).a(0.6F);
		this.a(aad.b).a(40.0);
		this.a(aad.g).a(4.0);
	}

	public float a(int integer) {
		return this.bz[integer];
	}

	public float b(int integer) {
		return this.by[integer];
	}

	public int dh() {
		return this.Y.a(bx);
	}

	public void g(int integer) {
		this.Y.b(bx, integer);
	}

	public int m(int integer) {
		return this.Y.a(bw[integer]);
	}

	public void a(int integer1, int integer2) {
		this.Y.b(bw[integer1], integer2);
	}

	public boolean di() {
		return this.bU() <= this.cb() / 2.0F;
	}

	@Override
	public tb cf() {
		return tb.UNDEAD;
	}

	@Override
	protected boolean n(sn sn) {
		return false;
	}

	@Override
	public boolean aX() {
		return false;
	}

	class a extends ui {
		public a() {
			this.a(7);
		}

		@Override
		public boolean a() {
			return yv.this.dh() > 0;
		}
	}
}
