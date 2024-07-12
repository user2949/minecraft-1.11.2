import com.google.common.base.Predicate;
import java.util.UUID;
import javax.annotation.Nullable;

public class xk extends ti {
	private static final kk<Float> bA = kn.a(xk.class, km.c);
	private static final kk<Boolean> bB = kn.a(xk.class, km.h);
	private static final kk<Integer> bC = kn.a(xk.class, km.b);
	private float bD;
	private float bE;
	private boolean bF;
	private boolean bG;
	private float bH;
	private float bI;

	public xk(ajs ajs) {
		super(ajs);
		this.a(0.6F, 0.85F);
		this.q(false);
	}

	@Override
	protected void r() {
		this.by = new vl(this);
		this.bq.a(1, new uf(this));
		this.bq.a(2, this.by);
		this.bq.a(3, new xk.a(this, xq.class, 24.0F, 1.5, 1.5));
		this.bq.a(4, new um(this, 0.4F));
		this.bq.a(5, new ur(this, 1.0, true));
		this.bq.a(6, new ug(this, 1.0, 10.0F, 2.0F));
		this.bq.a(7, new ub(this, 1.0));
		this.bq.a(8, new vr(this, 1.0));
		this.bq.a(9, new tz(this, 8.0F));
		this.bq.a(10, new uo(this, aay.class, 8.0F));
		this.bq.a(10, new ve(this));
		this.br.a(1, new wa(this));
		this.br.a(2, new wb(this));
		this.br.a(3, new vv(this, true));
		this.br.a(4, new vz(this, ww.class, false, new Predicate<sn>() {
			public boolean apply(@Nullable sn sn) {
				return sn instanceof xf || sn instanceof xe;
			}
		}));
		this.br.a(5, new vy(this, zm.class, false));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.d).a(0.3F);
		if (this.dh()) {
			this.a(aad.a).a(20.0);
		} else {
			this.a(aad.a).a(8.0);
		}

		this.ce().b(aad.e).a(2.0);
	}

	@Override
	public void d(@Nullable sw sw) {
		super.d(sw);
		if (sw == null) {
			this.s(false);
		} else if (!this.dh()) {
			this.s(true);
		}
	}

	@Override
	protected void M() {
		this.Y.b(bA, this.bU());
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bA, this.bU());
		this.Y.a(bB, false);
		this.Y.a(bC, aem.RED.b());
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(nn.hP, 0.15F, 1.0F);
	}

	public static void a(ph ph) {
		sx.a(ph, xk.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Angry", this.dr());
		du.a("CollarColor", (byte)this.ds().b());
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.s(du.p("Angry"));
		if (du.b("CollarColor", 99)) {
			this.a(aem.a(du.f("CollarColor")));
		}
	}

	@Override
	protected nm G() {
		if (this.dr()) {
			return nn.hK;
		} else if (this.S.nextInt(3) == 0) {
			return this.dh() && this.Y.a(bA) < 10.0F ? nn.hQ : nn.hN;
		} else {
			return nn.hI;
		}
	}

	@Override
	protected nm bW() {
		return nn.hM;
	}

	@Override
	protected nm bX() {
		return nn.hJ;
	}

	@Override
	protected float ci() {
		return 0.4F;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.N;
	}

	@Override
	public void n() {
		super.n();
		if (!this.l.E && this.bF && !this.bG && !this.da() && this.z) {
			this.bG = true;
			this.bH = 0.0F;
			this.bI = 0.0F;
			this.l.a(this, (byte)8);
		}

		if (!this.l.E && this.z() == null && this.dr()) {
			this.s(false);
		}
	}

	@Override
	public void A_() {
		super.A_();
		this.bE = this.bD;
		if (this.dt()) {
			this.bD = this.bD + (1.0F - this.bD) * 0.4F;
		} else {
			this.bD = this.bD + (0.0F - this.bD) * 0.4F;
		}

		if (this.ai()) {
			this.bF = true;
			this.bG = false;
			this.bH = 0.0F;
			this.bI = 0.0F;
		} else if ((this.bF || this.bG) && this.bG) {
			if (this.bH == 0.0F) {
				this.a(nn.hO, this.ci(), (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F);
			}

			this.bI = this.bH;
			this.bH += 0.05F;
			if (this.bI >= 2.0F) {
				this.bF = false;
				this.bG = false;
				this.bI = 0.0F;
				this.bH = 0.0F;
			}

			if (this.bH > 0.4F) {
				float float2 = (float)this.bo().b;
				int integer3 = (int)(ot.a((this.bH - 0.4F) * (float) Math.PI) * 7.0F);

				for (int integer4 = 0; integer4 < integer3; integer4++) {
					float float5 = (this.S.nextFloat() * 2.0F - 1.0F) * this.G * 0.5F;
					float float6 = (this.S.nextFloat() * 2.0F - 1.0F) * this.G * 0.5F;
					this.l.a(de.WATER_SPLASH, this.p + (double)float5, (double)(float2 + 0.8F), this.r + (double)float6, this.s, this.t, this.u);
				}
			}
		}
	}

	public boolean dp() {
		return this.bF;
	}

	public float r(float float1) {
		return 0.75F + (this.bI + (this.bH - this.bI) * float1) / 2.0F * 0.25F;
	}

	public float i(float float1, float float2) {
		float float4 = (this.bI + (this.bH - this.bI) * float1 + float2) / 1.8F;
		if (float4 < 0.0F) {
			float4 = 0.0F;
		} else if (float4 > 1.0F) {
			float4 = 1.0F;
		}

		return ot.a(float4 * (float) Math.PI) * ot.a(float4 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
	}

	public float s(float float1) {
		return (this.bE + (this.bD - this.bE) * float1) * 0.15F * (float) Math.PI;
	}

	@Override
	public float bq() {
		return this.H * 0.8F;
	}

	@Override
	public int N() {
		return this.dj() ? 20 : super.N();
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else {
			sn sn4 = ry.j();
			if (this.by != null) {
				this.by.a(false);
			}

			if (sn4 != null && !(sn4 instanceof aay) && !(sn4 instanceof abb)) {
				float2 = (float2 + 1.0F) / 2.0F;
			}

			return super.a(ry, float2);
		}
	}

	@Override
	public boolean B(sn sn) {
		boolean boolean3 = sn.a(ry.a((sw)this), (float)((int)this.a(aad.e).e()));
		if (boolean3) {
			this.a(this, sn);
		}

		return boolean3;
	}

	@Override
	public void q(boolean boolean1) {
		super.q(boolean1);
		if (boolean1) {
			this.a(aad.a).a(20.0);
		} else {
			this.a(aad.a).a(8.0);
		}

		this.a(aad.e).a(4.0);
	}

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (this.dh()) {
			if (!afj4.b()) {
				if (afj4.c() instanceof afd) {
					afd afd5 = (afd)afj4.c();
					if (afd5.g() && this.Y.a(bA) < 20.0F) {
						if (!aay.bK.d) {
							afj4.g(1);
						}

						this.b((float)afd5.h(afj4));
						return true;
					}
				} else if (afj4.c() == afl.be) {
					aem aem5 = aem.a(afj4.j());
					if (aem5 != this.ds()) {
						this.a(aem5);
						if (!aay.bK.d) {
							afj4.g(1);
						}

						return true;
					}
				}
			}

			if (this.e(aay) && !this.l.E && !this.e(afj4)) {
				this.by.a(!this.dj());
				this.bd = false;
				this.h.o();
				this.d(null);
			}
		} else if (afj4.c() == afl.bf && !this.dr()) {
			if (!aay.bK.d) {
				afj4.g(1);
			}

			if (!this.l.E) {
				if (this.S.nextInt(3) == 0) {
					this.q(true);
					this.h.o();
					this.d(null);
					this.by.a(true);
					this.c(20.0F);
					this.b(aay.be());
					this.p(true);
					this.l.a(this, (byte)7);
				} else {
					this.p(false);
					this.l.a(this, (byte)6);
				}
			}

			return true;
		}

		return super.a(aay, ri);
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 8) {
			this.bG = true;
			this.bH = 0.0F;
			this.bI = 0.0F;
		} else {
			super.a(byte1);
		}
	}

	public float dq() {
		if (this.dr()) {
			return 1.5393804F;
		} else {
			return this.dh() ? (0.55F - (this.cb() - this.Y.a(bA)) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
		}
	}

	@Override
	public boolean e(afj afj) {
		return afj.c() instanceof afd && ((afd)afj.c()).g();
	}

	@Override
	public int cQ() {
		return 8;
	}

	public boolean dr() {
		return (this.Y.a(bw) & 2) != 0;
	}

	public void s(boolean boolean1) {
		byte byte3 = this.Y.a(bw);
		if (boolean1) {
			this.Y.b(bw, (byte)(byte3 | 2));
		} else {
			this.Y.b(bw, (byte)(byte3 & -3));
		}
	}

	public aem ds() {
		return aem.a(this.Y.a(bC) & 15);
	}

	public void a(aem aem) {
		this.Y.b(bC, aem.b());
	}

	public xk a(sk sk) {
		xk xk3 = new xk(this.l);
		UUID uUID4 = this.b();
		if (uUID4 != null) {
			xk3.b(uUID4);
			xk3.q(true);
		}

		return xk3;
	}

	public void t(boolean boolean1) {
		this.Y.b(bB, boolean1);
	}

	@Override
	public boolean a(ww ww) {
		if (ww == this) {
			return false;
		} else if (!this.dh()) {
			return false;
		} else if (!(ww instanceof xk)) {
			return false;
		} else {
			xk xk3 = (xk)ww;
			if (!xk3.dh()) {
				return false;
			} else {
				return xk3.dj() ? false : this.dn() && xk3.dn();
			}
		}
	}

	public boolean dt() {
		return this.Y.a(bB);
	}

	@Override
	public boolean a(sw sw1, sw sw2) {
		if (!(sw1 instanceof zp) && !(sw1 instanceof zv)) {
			if (sw1 instanceof xk) {
				xk xk4 = (xk)sw1;
				if (xk4.dh() && xk4.dk() == sw2) {
					return false;
				}
			}

			return sw1 instanceof aay && sw2 instanceof aay && !((aay)sw2).a((aay)sw1) ? false : !(sw1 instanceof xm) || !((xm)sw1).dp();
		} else {
			return false;
		}
	}

	@Override
	public boolean a(aay aay) {
		return !this.dr() && super.a(aay);
	}

	class a<T extends sn> extends ty<T> {
		private final xk d;

		public a(xk xk2, Class<T> class3, float float4, double double5, double double6) {
			super(xk2, class3, float4, double5, double6);
			this.d = xk2;
		}

		@Override
		public boolean a() {
			return super.a() && this.b instanceof xq ? !this.d.dh() && this.a((xq)this.b) : false;
		}

		private boolean a(xq xq) {
			return xq.dL() >= xk.this.S.nextInt(5);
		}

		@Override
		public void c() {
			xk.this.d(null);
			super.c();
		}

		@Override
		public void e() {
			xk.this.d(null);
			super.e();
		}
	}
}
