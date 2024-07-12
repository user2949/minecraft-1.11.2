import java.util.List;

public class zd extends sn {
	private static final kk<Integer> b = kn.a(zd.class, km.b);
	private boolean c;
	private int d = 0;
	private aay e;
	private int f;
	private int g;
	private int h;
	private int at;
	private float au;
	public sn a;
	private zd.a av = zd.a.FLYING;
	private int aw;
	private int ax;

	public zd(ajs ajs, aay aay, double double3, double double4, double double5) {
		super(ajs);
		this.a(aay);
		this.b(double3, double4, double5);
		this.m = this.p;
		this.n = this.q;
		this.o = this.r;
	}

	public zd(ajs ajs, aay aay) {
		super(ajs);
		this.a(aay);
		this.n();
	}

	private void a(aay aay) {
		this.a(0.25F, 0.25F);
		this.ah = true;
		this.e = aay;
		this.e.bQ = this;
	}

	public void a(int integer) {
		this.ax = integer;
	}

	public void b(int integer) {
		this.aw = integer;
	}

	private void n() {
		float float2 = this.e.y + (this.e.w - this.e.y);
		float float3 = this.e.x + (this.e.v - this.e.x);
		float float4 = ot.b(-float3 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float5 = ot.a(-float3 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float6 = -ot.b(-float2 * (float) (Math.PI / 180.0));
		float float7 = ot.a(-float2 * (float) (Math.PI / 180.0));
		double double8 = this.e.m + (this.e.p - this.e.m) - (double)float5 * 0.3;
		double double10 = this.e.n + (this.e.q - this.e.n) + (double)this.e.bq();
		double double12 = this.e.o + (this.e.r - this.e.o) - (double)float4 * 0.3;
		this.b(double8, double10, double12, float3, float2);
		this.s = (double)(-float5);
		this.t = (double)ot.a(-(float7 / float6), -5.0F, 5.0F);
		this.u = (double)(-float4);
		float float14 = ot.a(this.s * this.s + this.t * this.t + this.u * this.u);
		this.s = this.s * (0.6 / (double)float14 + 0.5 + this.S.nextGaussian() * 0.0045);
		this.t = this.t * (0.6 / (double)float14 + 0.5 + this.S.nextGaussian() * 0.0045);
		this.u = this.u * (0.6 / (double)float14 + 0.5 + this.S.nextGaussian() * 0.0045);
		float float15 = ot.a(this.s * this.s + this.u * this.u);
		this.v = (float)(ot.c(this.s, this.u) * 180.0F / (float)Math.PI);
		this.w = (float)(ot.c(this.t, (double)float15) * 180.0F / (float)Math.PI);
		this.x = this.v;
		this.y = this.w;
	}

	@Override
	protected void i() {
		this.R().a(b, 0);
	}

	@Override
	public void a(kk<?> kk) {
		if (b.equals(kk)) {
			int integer3 = this.R().a(b);
			this.a = integer3 > 0 ? this.l.a(integer3 - 1) : null;
		}

		super.a(kk);
	}

	@Override
	public boolean a(double double1) {
		double double4 = 64.0;
		return double1 < 4096.0;
	}

	@Override
	public void a(double double1, double double2, double double3, float float4, float float5, int integer, boolean boolean7) {
	}

	@Override
	public void A_() {
		super.A_();
		if (this.e == null) {
			this.T();
		} else if (this.l.E || !this.o()) {
			if (this.c) {
				this.d++;
				if (this.d >= 1200) {
					this.T();
					return;
				}
			}

			float float2 = 0.0F;
			co co3 = new co(this);
			atl atl4 = this.l.o(co3);
			if (atl4.a() == azs.h) {
				float2 = aoq.f(atl4, this.l, co3);
			}

			if (this.av == zd.a.FLYING) {
				if (this.a != null) {
					this.s = 0.0;
					this.t = 0.0;
					this.u = 0.0;
					this.av = zd.a.HOOKED_IN_ENTITY;
					return;
				}

				if (float2 > 0.0F) {
					this.s *= 0.3;
					this.t *= 0.2;
					this.u *= 0.3;
					this.av = zd.a.BOBBING;
					return;
				}

				if (!this.l.E) {
					this.r();
				}

				if (!this.c && !this.z && !this.A) {
					this.f++;
				} else {
					this.f = 0;
					this.s = 0.0;
					this.t = 0.0;
					this.u = 0.0;
				}
			} else {
				if (this.av == zd.a.HOOKED_IN_ENTITY) {
					if (this.a != null) {
						if (this.a.F) {
							this.a = null;
							this.av = zd.a.FLYING;
						} else {
							this.p = this.a.p;
							double var10002 = (double)this.a.H;
							this.q = this.a.bo().b + var10002 * 0.8;
							this.r = this.a.r;
							this.b(this.p, this.q, this.r);
						}
					}

					return;
				}

				if (this.av == zd.a.BOBBING) {
					this.s *= 0.9;
					this.u *= 0.9;
					double double5 = this.q + this.t - (double)co3.q() - (double)float2;
					if (Math.abs(double5) < 0.01) {
						double5 += Math.signum(double5) * 0.1;
					}

					this.t = this.t - double5 * (double)this.S.nextFloat() * 0.2;
					if (!this.l.E && float2 > 0.0F) {
						this.a(co3);
					}
				}
			}

			if (atl4.a() != azs.h) {
				this.t -= 0.03;
			}

			this.a(tc.SELF, this.s, this.t, this.u);
			this.q();
			double double5x = 0.92;
			this.s *= 0.92;
			this.t *= 0.92;
			this.u *= 0.92;
			this.b(this.p, this.q, this.r);
		}
	}

	private boolean o() {
		afj afj2 = this.e.cg();
		afj afj3 = this.e.ch();
		boolean boolean4 = afj2.c() == afl.aZ;
		boolean boolean5 = afj3.c() == afl.aZ;
		if (!this.e.F && this.e.au() && (boolean4 || boolean5) && !(this.h(this.e) > 1024.0)) {
			return false;
		} else {
			this.T();
			return true;
		}
	}

	private void q() {
		float float2 = ot.a(this.s * this.s + this.u * this.u);
		this.v = (float)(ot.c(this.s, this.u) * 180.0F / (float)Math.PI);
		this.w = (float)(ot.c(this.t, (double)float2) * 180.0F / (float)Math.PI);

		while (this.w - this.y < -180.0F) {
			this.y -= 360.0F;
		}

		while (this.w - this.y >= 180.0F) {
			this.y += 360.0F;
		}

		while (this.v - this.x < -180.0F) {
			this.x -= 360.0F;
		}

		while (this.v - this.x >= 180.0F) {
			this.x += 360.0F;
		}

		this.w = this.y + (this.w - this.y) * 0.2F;
		this.v = this.x + (this.v - this.x) * 0.2F;
	}

	private void r() {
		bdw bdw2 = new bdw(this.p, this.q, this.r);
		bdw bdw3 = new bdw(this.p + this.s, this.q + this.t, this.r + this.u);
		bdu bdu4 = this.l.a(bdw2, bdw3, false, true, false);
		bdw2 = new bdw(this.p, this.q, this.r);
		bdw3 = new bdw(this.p + this.s, this.q + this.t, this.r + this.u);
		if (bdu4 != null) {
			bdw3 = new bdw(bdu4.c.b, bdu4.c.c, bdu4.c.d);
		}

		sn sn5 = null;
		List<sn> list6 = this.l.b(this, this.bo().b(this.s, this.t, this.u).g(1.0));
		double double7 = 0.0;

		for (sn sn10 : list6) {
			if (this.a(sn10) && (sn10 != this.e || this.f >= 5)) {
				bdt bdt11 = sn10.bo().g(0.3F);
				bdu bdu12 = bdt11.b(bdw2, bdw3);
				if (bdu12 != null) {
					double double13 = bdw2.g(bdu12.c);
					if (double13 < double7 || double7 == 0.0) {
						sn5 = sn10;
						double7 = double13;
					}
				}
			}
		}

		if (sn5 != null) {
			bdu4 = new bdu(sn5);
		}

		if (bdu4 != null && bdu4.a != bdu.a.MISS) {
			if (bdu4.a == bdu.a.ENTITY) {
				this.a = bdu4.d;
				this.s();
			} else {
				this.c = true;
			}
		}
	}

	private void s() {
		this.R().b(b, this.a.O() + 1);
	}

	private void a(co co) {
		lw lw3 = (lw)this.l;
		int integer4 = 1;
		co co5 = co.a();
		if (this.S.nextFloat() < 0.25F && this.l.B(co5)) {
			integer4++;
		}

		if (this.S.nextFloat() < 0.5F && !this.l.h(co5)) {
			integer4--;
		}

		if (this.g > 0) {
			this.g--;
			if (this.g <= 0) {
				this.h = 0;
				this.at = 0;
			} else {
				this.t = this.t - 0.2 * (double)this.S.nextFloat() * (double)this.S.nextFloat();
			}
		} else if (this.at > 0) {
			this.at -= integer4;
			if (this.at > 0) {
				this.au = (float)((double)this.au + this.S.nextGaussian() * 4.0);
				float float6 = this.au * (float) (Math.PI / 180.0);
				float float7 = ot.a(float6);
				float float8 = ot.b(float6);
				double double9 = this.p + (double)(float7 * (float)this.at * 0.1F);
				double double11 = (double)((float)ot.c(this.bo().b) + 1.0F);
				double double13 = this.r + (double)(float8 * (float)this.at * 0.1F);
				alu alu15 = lw3.o(new co(double9, double11 - 1.0, double13)).v();
				if (alu15 == alv.j || alu15 == alv.i) {
					if (this.S.nextFloat() < 0.15F) {
						lw3.a(de.WATER_BUBBLE, double9, double11 - 0.1F, double13, 1, (double)float7, 0.1, (double)float8, 0.0);
					}

					float float16 = float7 * 0.04F;
					float float17 = float8 * 0.04F;
					lw3.a(de.WATER_WAKE, double9, double11, double13, 0, (double)float17, 0.01, (double)(-float16), 1.0);
					lw3.a(de.WATER_WAKE, double9, double11, double13, 0, (double)(-float17), 0.01, (double)float16, 1.0);
				}
			} else {
				this.t = (double)(-0.4F * ot.a(this.S, 0.6F, 1.0F));
				this.a(nn.H, 0.25F, 1.0F + (this.S.nextFloat() - this.S.nextFloat()) * 0.4F);
				double double6 = this.bo().b + 0.5;
				lw3.a(de.WATER_BUBBLE, this.p, double6, this.r, (int)(1.0F + this.G * 20.0F), (double)this.G, 0.0, (double)this.G, 0.2F);
				lw3.a(de.WATER_WAKE, this.p, double6, this.r, (int)(1.0F + this.G * 20.0F), (double)this.G, 0.0, (double)this.G, 0.2F);
				this.g = ot.a(this.S, 20, 40);
			}
		} else if (this.h > 0) {
			this.h -= integer4;
			float float6 = 0.15F;
			if (this.h < 20) {
				float6 = (float)((double)float6 + (double)(20 - this.h) * 0.05);
			} else if (this.h < 40) {
				float6 = (float)((double)float6 + (double)(40 - this.h) * 0.02);
			} else if (this.h < 60) {
				float6 = (float)((double)float6 + (double)(60 - this.h) * 0.01);
			}

			if (this.S.nextFloat() < float6) {
				float float7 = ot.a(this.S, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
				float float8 = ot.a(this.S, 25.0F, 60.0F);
				double double9 = this.p + (double)(ot.a(float7) * float8 * 0.1F);
				double double11 = (double)((float)ot.c(this.bo().b) + 1.0F);
				double double13 = this.r + (double)(ot.b(float7) * float8 * 0.1F);
				alu alu15 = lw3.o(new co((int)double9, (int)double11 - 1, (int)double13)).v();
				if (alu15 == alv.j || alu15 == alv.i) {
					lw3.a(de.WATER_SPLASH, double9, double11, double13, 2 + this.S.nextInt(2), 0.1F, 0.0, 0.1F, 0.0);
				}
			}

			if (this.h <= 0) {
				this.au = ot.a(this.S, 0.0F, 360.0F);
				this.at = ot.a(this.S, 20, 80);
			}
		} else {
			this.h = ot.a(this.S, 100, 600);
			this.h = this.h - this.ax * 20 * 5;
		}
	}

	protected boolean a(sn sn) {
		return sn.aq() || sn instanceof zj;
	}

	@Override
	public void b(du du) {
	}

	@Override
	public void a(du du) {
	}

	public int j() {
		if (!this.l.E && this.e != null) {
			int integer2 = 0;
			if (this.a != null) {
				this.k();
				this.l.a(this, (byte)31);
				integer2 = this.a instanceof zj ? 3 : 5;
			} else if (this.g > 0) {
				bcl.a a3 = new bcl.a((lw)this.l);
				a3.a((float)this.aw + this.e.dj());

				for (afj afj5 : this.l.ak().a(bcf.az).a(this.S, a3.a())) {
					zj zj6 = new zj(this.l, this.p, this.q, this.r, afj5);
					double double7 = this.e.p - this.p;
					double double9 = this.e.q - this.q;
					double double11 = this.e.r - this.r;
					double double13 = (double)ot.a(double7 * double7 + double9 * double9 + double11 * double11);
					double double15 = 0.1;
					zj6.s = double7 * 0.1;
					zj6.t = double9 * 0.1 + (double)ot.a(double13) * 0.08;
					zj6.u = double11 * 0.1;
					this.l.a(zj6);
					this.e.l.a(new st(this.e.l, this.e.p, this.e.q + 0.5, this.e.r + 0.5, this.S.nextInt(6) + 1));
					afh afh17 = afj5.c();
					if (afh17 == afl.bc || afh17 == afl.bd) {
						this.e.a(oa.E, 1);
					}
				}

				integer2 = 1;
			}

			if (this.c) {
				integer2 = 2;
			}

			this.T();
			return integer2;
		} else {
			return 0;
		}
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 31 && this.l.E && this.a instanceof aay && ((aay)this.a).cR()) {
			this.k();
		}

		super.a(byte1);
	}

	protected void k() {
		if (this.e != null) {
			double double2 = this.e.p - this.p;
			double double4 = this.e.q - this.q;
			double double6 = this.e.r - this.r;
			double double8 = 0.1;
			this.a.s += double2 * 0.1;
			this.a.t += double4 * 0.1;
			this.a.u += double6 * 0.1;
		}
	}

	@Override
	protected boolean af() {
		return false;
	}

	@Override
	public void T() {
		super.T();
		if (this.e != null) {
			this.e.bQ = null;
		}
	}

	public aay l() {
		return this.e;
	}

	static enum a {
		FLYING,
		HOOKED_IN_ENTITY,
		BOBBING;
	}
}
