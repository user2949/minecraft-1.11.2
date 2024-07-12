import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class aae extends wz implements zt {
	private static final UUID by = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
	private static final tl bz = new tl(by, "Covered armor bonus", 20.0, 0).a(false);
	protected static final kk<cv> a = kn.a(aae.class, km.l);
	protected static final kk<Optional<co>> b = kn.a(aae.class, km.k);
	protected static final kk<Byte> c = kn.a(aae.class, km.a);
	protected static final kk<Byte> bw = kn.a(aae.class, km.a);
	public static final aem bx = aem.PURPLE;
	private float bA;
	private float bB;
	private co bC;
	private int bD;

	public aae(ajs ajs) {
		super(ajs);
		this.a(1.0F, 1.0F);
		this.aO = 180.0F;
		this.aN = 180.0F;
		this.X = true;
		this.bC = null;
		this.b_ = 5;
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		this.aN = 180.0F;
		this.aO = 180.0F;
		this.v = 180.0F;
		this.x = 180.0F;
		this.aP = 180.0F;
		this.aQ = 180.0F;
		return super.a(rh, sz);
	}

	@Override
	protected void r() {
		this.bq.a(1, new uo(this, aay.class, 8.0F));
		this.bq.a(4, new aae.a());
		this.bq.a(7, new aae.e());
		this.bq.a(8, new ve(this));
		this.br.a(1, new vv(this, true));
		this.br.a(2, new aae.d(this));
		this.br.a(3, new aae.c(this));
	}

	@Override
	protected boolean af() {
		return false;
	}

	@Override
	public no bC() {
		return no.HOSTILE;
	}

	@Override
	protected nm G() {
		return nn.fz;
	}

	@Override
	public void D() {
		if (!this.do()) {
			super.D();
		}
	}

	@Override
	protected nm bX() {
		return nn.fF;
	}

	@Override
	protected nm bW() {
		return this.do() ? nn.fH : nn.fG;
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, cv.DOWN);
		this.Y.a(b, Optional.absent());
		this.Y.a(c, (byte)0);
		this.Y.a(bw, (byte)bx.a());
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(30.0);
	}

	@Override
	protected ts s() {
		return new aae.b(this);
	}

	public static void a(ph ph) {
		sx.a(ph, aae.class);
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.Y.b(a, cv.a(du.f("AttachFace")));
		this.Y.b(c, du.f("Peek"));
		this.Y.b(bw, du.f("Color"));
		if (du.e("APX")) {
			int integer3 = du.h("APX");
			int integer4 = du.h("APY");
			int integer5 = du.h("APZ");
			this.Y.b(b, Optional.of(new co(integer3, integer4, integer5)));
		} else {
			this.Y.b(b, Optional.absent());
		}
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("AttachFace", (byte)this.Y.a(a).a());
		du.a("Peek", this.Y.a(c));
		du.a("Color", this.Y.a(bw));
		co co3 = this.di();
		if (co3 != null) {
			du.a("APX", co3.p());
			du.a("APY", co3.q());
			du.a("APZ", co3.r());
		}
	}

	@Override
	public void A_() {
		super.A_();
		co co2 = (co)this.Y.a(b).orNull();
		if (co2 == null && !this.l.E) {
			co2 = new co(this);
			this.Y.b(b, Optional.of(co2));
		}

		if (this.aK()) {
			co2 = null;
			float float3 = this.bB().v;
			this.v = float3;
			this.aN = float3;
			this.aO = float3;
			this.bD = 0;
		} else if (!this.l.E) {
			atl atl3 = this.l.o(co2);
			if (atl3.a() != azs.a) {
				if (atl3.v() == alv.M) {
					cv cv4 = atl3.c(atc.H);
					if (this.l.d(co2.a(cv4))) {
						co2 = co2.a(cv4);
						this.Y.b(b, Optional.of(co2));
					} else {
						this.o();
					}
				} else if (atl3.v() == alv.K) {
					cv cv4 = atl3.c(atd.H);
					if (this.l.d(co2.a(cv4))) {
						co2 = co2.a(cv4);
						this.Y.b(b, Optional.of(co2));
					} else {
						this.o();
					}
				} else {
					this.o();
				}
			}

			co co4 = co2.a(this.dh());
			if (!this.l.d(co4, false)) {
				boolean boolean5 = false;

				for (cv cv9 : cv.values()) {
					co4 = co2.a(cv9);
					if (this.l.d(co4, false)) {
						this.Y.b(a, cv9);
						boolean5 = true;
						break;
					}
				}

				if (!boolean5) {
					this.o();
				}
			}

			co co5 = co2.a(this.dh().d());
			if (this.l.d(co5, false)) {
				this.o();
			}
		}

		float float3 = (float)this.dj() * 0.01F;
		this.bA = this.bB;
		if (this.bB > float3) {
			this.bB = ot.a(this.bB - 0.05F, float3, 1.0F);
		} else if (this.bB < float3) {
			this.bB = ot.a(this.bB + 0.05F, 0.0F, float3);
		}

		if (co2 != null) {
			if (this.l.E) {
				if (this.bD > 0 && this.bC != null) {
					this.bD--;
				} else {
					this.bC = co2;
				}
			}

			this.p = (double)co2.p() + 0.5;
			this.q = (double)co2.q();
			this.r = (double)co2.r() + 0.5;
			this.m = this.p;
			this.n = this.q;
			this.o = this.r;
			this.M = this.p;
			this.N = this.q;
			this.O = this.r;
			double double4 = 0.5 - (double)ot.a((0.5F + this.bB) * (float) Math.PI) * 0.5;
			double double6 = 0.5 - (double)ot.a((0.5F + this.bA) * (float) Math.PI) * 0.5;
			double double8 = double4 - double6;
			double double10 = 0.0;
			double double12 = 0.0;
			double double14 = 0.0;
			cv cv16 = this.dh();
			switch (cv16) {
				case DOWN:
					this.a(new bdt(this.p - 0.5, this.q, this.r - 0.5, this.p + 0.5, this.q + 1.0 + double4, this.r + 0.5));
					double12 = double8;
					break;
				case UP:
					this.a(new bdt(this.p - 0.5, this.q - double4, this.r - 0.5, this.p + 0.5, this.q + 1.0, this.r + 0.5));
					double12 = -double8;
					break;
				case NORTH:
					this.a(new bdt(this.p - 0.5, this.q, this.r - 0.5, this.p + 0.5, this.q + 1.0, this.r + 0.5 + double4));
					double14 = double8;
					break;
				case SOUTH:
					this.a(new bdt(this.p - 0.5, this.q, this.r - 0.5 - double4, this.p + 0.5, this.q + 1.0, this.r + 0.5));
					double14 = -double8;
					break;
				case WEST:
					this.a(new bdt(this.p - 0.5, this.q, this.r - 0.5, this.p + 0.5 + double4, this.q + 1.0, this.r + 0.5));
					double10 = double8;
					break;
				case EAST:
					this.a(new bdt(this.p - 0.5 - double4, this.q, this.r - 0.5, this.p + 0.5, this.q + 1.0, this.r + 0.5));
					double10 = -double8;
			}

			if (double8 > 0.0) {
				List<sn> list17 = this.l.b(this, this.bo());
				if (!list17.isEmpty()) {
					for (sn sn19 : list17) {
						if (!(sn19 instanceof aae) && !sn19.Q) {
							sn19.a(tc.SHULKER, double10, double12, double14);
						}
					}
				}
			}
		}
	}

	@Override
	public void a(tc tc, double double2, double double3, double double4) {
		if (tc == tc.SHULKER_BOX) {
			this.o();
		} else {
			super.a(tc, double2, double3, double4);
		}
	}

	@Override
	public void b(double double1, double double2, double double3) {
		super.b(double1, double2, double3);
		if (this.Y != null && this.T != 0) {
			Optional<co> optional8 = this.Y.a(b);
			Optional<co> optional9 = Optional.of(new co(double1, double2, double3));
			if (!optional9.equals(optional8)) {
				this.Y.b(b, optional9);
				this.Y.b(c, (byte)0);
				this.ai = true;
			}
		}
	}

	protected boolean o() {
		if (!this.cY() && this.au()) {
			co co2 = new co(this);

			for (int integer3 = 0; integer3 < 5; integer3++) {
				co co4 = co2.a(8 - this.S.nextInt(17), 8 - this.S.nextInt(17), 8 - this.S.nextInt(17));
				if (co4.q() > 0 && this.l.d(co4) && this.l.g(this) && this.l.a(this, new bdt(co4)).isEmpty()) {
					boolean boolean5 = false;

					for (cv cv9 : cv.values()) {
						if (this.l.d(co4.a(cv9), false)) {
							this.Y.b(a, cv9);
							boolean5 = true;
							break;
						}
					}

					if (boolean5) {
						this.a(nn.fK, 1.0F, 1.0F);
						this.Y.b(b, Optional.of(co4));
						this.Y.b(c, (byte)0);
						this.d(null);
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@Override
	public void n() {
		super.n();
		this.s = 0.0;
		this.t = 0.0;
		this.u = 0.0;
		this.aO = 180.0F;
		this.aN = 180.0F;
		this.v = 180.0F;
	}

	@Override
	public void a(kk<?> kk) {
		if (b.equals(kk) && this.l.E && !this.aK()) {
			co co3 = this.di();
			if (co3 != null) {
				if (this.bC == null) {
					this.bC = co3;
				} else {
					this.bD = 6;
				}

				this.p = (double)co3.p() + 0.5;
				this.q = (double)co3.q();
				this.r = (double)co3.r() + 0.5;
				this.m = this.p;
				this.n = this.q;
				this.o = this.r;
				this.M = this.p;
				this.N = this.q;
				this.O = this.r;
			}
		}

		super.a(kk);
	}

	@Override
	public void a(double double1, double double2, double double3, float float4, float float5, int integer, boolean boolean7) {
		this.bh = 0;
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.do()) {
			sn sn4 = ry.i();
			if (sn4 instanceof abb) {
				return false;
			}
		}

		if (super.a(ry, float2)) {
			if ((double)this.bU() < (double)this.cb() * 0.5 && this.S.nextInt(4) == 0) {
				this.o();
			}

			return true;
		} else {
			return false;
		}
	}

	private boolean do() {
		return this.dj() == 0;
	}

	@Nullable
	@Override
	public bdt ag() {
		return this.au() ? this.bo() : null;
	}

	public cv dh() {
		return this.Y.a(a);
	}

	@Nullable
	public co di() {
		return (co)this.Y.a(b).orNull();
	}

	public void g(@Nullable co co) {
		this.Y.b(b, Optional.fromNullable(co));
	}

	public int dj() {
		return this.Y.a(c);
	}

	public void a(int integer) {
		if (!this.l.E) {
			this.a(aad.g).c(bz);
			if (integer == 0) {
				this.a(aad.g).b(bz);
				this.a(nn.fE, 1.0F, 1.0F);
			} else {
				this.a(nn.fI, 1.0F, 1.0F);
			}
		}

		this.Y.b(c, (byte)integer);
	}

	public float a(float float1) {
		return this.bA + (this.bB - this.bA) * float1;
	}

	public int dk() {
		return this.bD;
	}

	public co dl() {
		return this.bC;
	}

	@Override
	public float bq() {
		return 0.5F;
	}

	@Override
	public int N() {
		return 180;
	}

	@Override
	public int cL() {
		return 180;
	}

	@Override
	public void i(sn sn) {
	}

	@Override
	public float aA() {
		return 0.0F;
	}

	public boolean dm() {
		return this.bC != null && this.di() != null;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.z;
	}

	public aem dn() {
		return aem.b(this.Y.a(bw));
	}

	class a extends ui {
		private int b;

		public a() {
			this.a(3);
		}

		@Override
		public boolean a() {
			sw sw2 = aae.this.z();
			return sw2 != null && sw2.au() ? aae.this.l.ae() != rg.PEACEFUL : false;
		}

		@Override
		public void c() {
			this.b = 20;
			aae.this.a(100);
		}

		@Override
		public void d() {
			aae.this.a(0);
		}

		@Override
		public void e() {
			if (aae.this.l.ae() != rg.PEACEFUL) {
				this.b--;
				sw sw2 = aae.this.z();
				aae.this.t().a(sw2, 180.0F, 180.0F);
				double double3 = aae.this.h(sw2);
				if (double3 < 400.0) {
					if (this.b <= 0) {
						this.b = 20 + aae.this.S.nextInt(10) * 20 / 2;
						abl abl5 = new abl(aae.this.l, aae.this, sw2, aae.this.dh().k());
						aae.this.l.a(abl5);
						aae.this.a(nn.fJ, 2.0F, (aae.this.S.nextFloat() - aae.this.S.nextFloat()) * 0.2F + 1.0F);
					}
				} else {
					aae.this.d(null);
				}

				super.e();
			}
		}
	}

	class b extends ts {
		public b(sw sw) {
			super(sw);
		}

		@Override
		public void a() {
		}
	}

	static class c extends vy<sw> {
		public c(aae aae) {
			super(aae, sw.class, 10, true, false, new Predicate<sw>() {
				public boolean apply(@Nullable sw sw) {
					return sw instanceof zt;
				}
			});
		}

		@Override
		public boolean a() {
			return this.e.aQ() == null ? false : super.a();
		}

		@Override
		protected bdt a(double double1) {
			cv cv4 = ((aae)this.e).dh();
			if (cv4.k() == cv.a.X) {
				return this.e.bo().c(4.0, double1, double1);
			} else {
				return cv4.k() == cv.a.Z ? this.e.bo().c(double1, double1, 4.0) : this.e.bo().c(double1, 4.0, double1);
			}
		}
	}

	class d extends vy<aay> {
		public d(aae aae2) {
			super(aae2, aay.class, true);
		}

		@Override
		public boolean a() {
			return aae.this.l.ae() == rg.PEACEFUL ? false : super.a();
		}

		@Override
		protected bdt a(double double1) {
			cv cv4 = ((aae)this.e).dh();
			if (cv4.k() == cv.a.X) {
				return this.e.bo().c(4.0, double1, double1);
			} else {
				return cv4.k() == cv.a.Z ? this.e.bo().c(double1, double1, 4.0) : this.e.bo().c(double1, 4.0, double1);
			}
		}
	}

	class e extends ui {
		private int b;

		private e() {
		}

		@Override
		public boolean a() {
			return aae.this.z() == null && aae.this.S.nextInt(40) == 0;
		}

		@Override
		public boolean b() {
			return aae.this.z() == null && this.b > 0;
		}

		@Override
		public void c() {
			this.b = 20 * (1 + aae.this.S.nextInt(3));
			aae.this.a(30);
		}

		@Override
		public void d() {
			if (aae.this.z() == null) {
				aae.this.a(0);
			}
		}

		@Override
		public void e() {
			this.b--;
		}
	}
}
