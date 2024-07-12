import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class abp extends sn implements abj {
	private int d = -1;
	private int e = -1;
	private int f = -1;
	private alu g;
	protected boolean a;
	public int b;
	private sw h;
	private String at;
	private int au;
	private int av;
	public sn c;
	private int aw;

	public abp(ajs ajs) {
		super(ajs);
		this.a(0.25F, 0.25F);
	}

	public abp(ajs ajs, double double2, double double3, double double4) {
		this(ajs);
		this.b(double2, double3, double4);
	}

	public abp(ajs ajs, sw sw) {
		this(ajs, sw.p, sw.q + (double)sw.bq() - 0.1F, sw.r);
		this.h = sw;
	}

	@Override
	protected void i() {
	}

	@Override
	public boolean a(double double1) {
		double double4 = this.bo().a() * 4.0;
		if (Double.isNaN(double4)) {
			double4 = 4.0;
		}

		double4 *= 64.0;
		return double1 < double4 * double4;
	}

	public void a(sn sn, float float2, float float3, float float4, float float5, float float6) {
		float float8 = -ot.a(float3 * (float) (Math.PI / 180.0)) * ot.b(float2 * (float) (Math.PI / 180.0));
		float float9 = -ot.a((float2 + float4) * (float) (Math.PI / 180.0));
		float float10 = ot.b(float3 * (float) (Math.PI / 180.0)) * ot.b(float2 * (float) (Math.PI / 180.0));
		this.c((double)float8, (double)float9, (double)float10, float5, float6);
		this.s = this.s + sn.s;
		this.u = this.u + sn.u;
		if (!sn.z) {
			this.t = this.t + sn.t;
		}
	}

	@Override
	public void c(double double1, double double2, double double3, float float4, float float5) {
		float float10 = ot.a(double1 * double1 + double2 * double2 + double3 * double3);
		double1 /= (double)float10;
		double2 /= (double)float10;
		double3 /= (double)float10;
		double1 += this.S.nextGaussian() * 0.0075F * (double)float5;
		double2 += this.S.nextGaussian() * 0.0075F * (double)float5;
		double3 += this.S.nextGaussian() * 0.0075F * (double)float5;
		double1 *= (double)float4;
		double2 *= (double)float4;
		double3 *= (double)float4;
		this.s = double1;
		this.t = double2;
		this.u = double3;
		float float11 = ot.a(double1 * double1 + double3 * double3);
		this.v = (float)(ot.c(double1, double3) * 180.0F / (float)Math.PI);
		this.w = (float)(ot.c(double2, (double)float11) * 180.0F / (float)Math.PI);
		this.x = this.v;
		this.y = this.w;
		this.au = 0;
	}

	@Override
	public void h(double double1, double double2, double double3) {
		this.s = double1;
		this.t = double2;
		this.u = double3;
		if (this.y == 0.0F && this.x == 0.0F) {
			float float8 = ot.a(double1 * double1 + double3 * double3);
			this.v = (float)(ot.c(double1, double3) * 180.0F / (float)Math.PI);
			this.w = (float)(ot.c(double2, (double)float8) * 180.0F / (float)Math.PI);
			this.x = this.v;
			this.y = this.w;
		}
	}

	@Override
	public void A_() {
		this.M = this.p;
		this.N = this.q;
		this.O = this.r;
		super.A_();
		if (this.b > 0) {
			this.b--;
		}

		if (this.a) {
			if (this.l.o(new co(this.d, this.e, this.f)).v() == this.g) {
				this.au++;
				if (this.au == 1200) {
					this.T();
				}

				return;
			}

			this.a = false;
			this.s = this.s * (double)(this.S.nextFloat() * 0.2F);
			this.t = this.t * (double)(this.S.nextFloat() * 0.2F);
			this.u = this.u * (double)(this.S.nextFloat() * 0.2F);
			this.au = 0;
			this.av = 0;
		} else {
			this.av++;
		}

		bdw bdw2 = new bdw(this.p, this.q, this.r);
		bdw bdw3 = new bdw(this.p + this.s, this.q + this.t, this.r + this.u);
		bdu bdu4 = this.l.a(bdw2, bdw3);
		bdw2 = new bdw(this.p, this.q, this.r);
		bdw3 = new bdw(this.p + this.s, this.q + this.t, this.r + this.u);
		if (bdu4 != null) {
			bdw3 = new bdw(bdu4.c.b, bdu4.c.c, bdu4.c.d);
		}

		sn sn5 = null;
		List<sn> list6 = this.l.b(this, this.bo().b(this.s, this.t, this.u).g(1.0));
		double double7 = 0.0;
		boolean boolean9 = false;

		for (int integer10 = 0; integer10 < list6.size(); integer10++) {
			sn sn11 = (sn)list6.get(integer10);
			if (sn11.aq()) {
				if (sn11 == this.c) {
					boolean9 = true;
				} else if (this.h != null && this.T < 2 && this.c == null) {
					this.c = sn11;
					boolean9 = true;
				} else {
					boolean9 = false;
					bdt bdt12 = sn11.bo().g(0.3F);
					bdu bdu13 = bdt12.b(bdw2, bdw3);
					if (bdu13 != null) {
						double double14 = bdw2.g(bdu13.c);
						if (double14 < double7 || double7 == 0.0) {
							sn5 = sn11;
							double7 = double14;
						}
					}
				}
			}
		}

		if (this.c != null) {
			if (boolean9) {
				this.aw = 2;
			} else if (this.aw-- <= 0) {
				this.c = null;
			}
		}

		if (sn5 != null) {
			bdu4 = new bdu(sn5);
		}

		if (bdu4 != null) {
			if (bdu4.a == bdu.a.BLOCK && this.l.o(bdu4.a()).v() == alv.aY) {
				this.e(bdu4.a());
			} else {
				this.a(bdu4);
			}
		}

		this.p = this.p + this.s;
		this.q = this.q + this.t;
		this.r = this.r + this.u;
		float float10 = ot.a(this.s * this.s + this.u * this.u);
		this.v = (float)(ot.c(this.s, this.u) * 180.0F / (float)Math.PI);
		this.w = (float)(ot.c(this.t, (double)float10) * 180.0F / (float)Math.PI);

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
		float float11 = 0.99F;
		float float12 = this.j();
		if (this.aj()) {
			for (int integer13 = 0; integer13 < 4; integer13++) {
				float float14 = 0.25F;
				this.l.a(de.WATER_BUBBLE, this.p - this.s * 0.25, this.q - this.t * 0.25, this.r - this.u * 0.25, this.s, this.t, this.u);
			}

			float11 = 0.8F;
		}

		this.s *= (double)float11;
		this.t *= (double)float11;
		this.u *= (double)float11;
		if (!this.ae()) {
			this.t -= (double)float12;
		}

		this.b(this.p, this.q, this.r);
	}

	protected float j() {
		return 0.03F;
	}

	protected abstract void a(bdu bdu);

	public static void a(ph ph, String string) {
	}

	@Override
	public void b(du du) {
		du.a("xTile", this.d);
		du.a("yTile", this.e);
		du.a("zTile", this.f);
		kq kq3 = alu.h.b(this.g);
		du.a("inTile", kq3 == null ? "" : kq3.toString());
		du.a("shake", (byte)this.b);
		du.a("inGround", (byte)(this.a ? 1 : 0));
		if ((this.at == null || this.at.isEmpty()) && this.h instanceof aay) {
			this.at = this.h.h_();
		}

		du.a("ownerName", this.at == null ? "" : this.at);
	}

	@Override
	public void a(du du) {
		this.d = du.h("xTile");
		this.e = du.h("yTile");
		this.f = du.h("zTile");
		if (du.b("inTile", 8)) {
			this.g = alu.b(du.l("inTile"));
		} else {
			this.g = alu.b(du.f("inTile") & 255);
		}

		this.b = du.f("shake") & 255;
		this.a = du.f("inGround") == 1;
		this.h = null;
		this.at = du.l("ownerName");
		if (this.at != null && this.at.isEmpty()) {
			this.at = null;
		}

		this.h = this.k();
	}

	@Nullable
	public sw k() {
		if (this.h == null && this.at != null && !this.at.isEmpty()) {
			this.h = this.l.a(this.at);
			if (this.h == null && this.l instanceof lw) {
				try {
					sn sn2 = ((lw)this.l).a(UUID.fromString(this.at));
					if (sn2 instanceof sw) {
						this.h = (sw)sn2;
					}
				} catch (Throwable var2) {
					this.h = null;
				}
			}
		}

		return this.h;
	}
}
