import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class aam extends aaa implements aac {
	private static final UUID a = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
	private static final tl b = new tl(a, "Drinking speed penalty", -0.25, 0).a(false);
	private static final kk<Boolean> c = kn.a(aam.class, km.h);
	private int bw;

	public aam(ajs ajs) {
		super(ajs);
		this.a(0.6F, 1.95F);
	}

	public static void a(ph ph) {
		sx.a(ph, aam.class);
	}

	@Override
	protected void r() {
		this.bq.a(1, new uf(this));
		this.bq.a(2, new vg(this, 1.0, 60, 10.0F));
		this.bq.a(2, new vr(this, 1.0));
		this.bq.a(3, new uo(this, aay.class, 8.0F));
		this.bq.a(3, new ve(this));
		this.br.a(1, new vv(this, false));
		this.br.a(2, new vy(this, aay.class, true));
	}

	@Override
	protected void i() {
		super.i();
		this.R().a(c, false);
	}

	@Override
	protected nm G() {
		return nn.ht;
	}

	@Override
	protected nm bW() {
		return nn.hw;
	}

	@Override
	protected nm bX() {
		return nn.hu;
	}

	public void a(boolean boolean1) {
		this.R().b(c, boolean1);
	}

	public boolean o() {
		return this.R().a(c);
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(26.0);
		this.a(aad.d).a(0.25);
	}

	@Override
	public void n() {
		if (!this.l.E) {
			if (this.o()) {
				if (this.bw-- <= 0) {
					this.a(false);
					afj afj2 = this.cg();
					this.a(ss.MAINHAND, afj.a);
					if (afj2.c() == afl.bH) {
						List<sh> list3 = aha.a(afj2);
						if (list3 != null) {
							for (sh sh5 : list3) {
								this.c(new sh(sh5));
							}
						}
					}

					this.a(aad.d).c(b);
				}
			} else {
				agy agy2 = null;
				if (this.S.nextFloat() < 0.15F && this.a(azs.h) && !this.a(si.m)) {
					agy2 = ahb.t;
				} else if (this.S.nextFloat() < 0.15F && (this.aJ() || this.bV() != null && this.bV().o()) && !this.a(si.l)) {
					agy2 = ahb.m;
				} else if (this.S.nextFloat() < 0.05F && this.bU() < this.cb()) {
					agy2 = ahb.v;
				} else if (this.S.nextFloat() < 0.5F && this.z() != null && !this.a(si.a) && this.z().h(this) > 121.0) {
					agy2 = ahb.o;
				}

				if (agy2 != null) {
					this.a(ss.MAINHAND, aha.a(new afj(afl.bH), agy2));
					this.bw = this.cg().m();
					this.a(true);
					this.l.a(null, this.p, this.q, this.r, nn.hv, this.bC(), 1.0F, 0.8F + this.S.nextFloat() * 0.4F);
					tk tk3 = this.a(aad.d);
					tk3.c(b);
					tk3.b(b);
				}
			}

			if (this.S.nextFloat() < 7.5E-4F) {
				this.l.a(this, (byte)15);
			}
		}

		super.n();
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 15) {
			for (int integer3 = 0; integer3 < this.S.nextInt(35) + 10; integer3++) {
				this.l
					.a(
						de.SPELL_WITCH,
						this.p + this.S.nextGaussian() * 0.13F,
						this.bo().e + 0.5 + this.S.nextGaussian() * 0.13F,
						this.r + this.S.nextGaussian() * 0.13F,
						0.0,
						0.0,
						0.0
					);
			}
		} else {
			super.a(byte1);
		}
	}

	@Override
	protected float c(ry ry, float float2) {
		float2 = super.c(ry, float2);
		if (ry.j() == this) {
			float2 = 0.0F;
		}

		if (ry.s()) {
			float2 = (float)((double)float2 * 0.15);
		}

		return float2;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.p;
	}

	@Override
	public void a(sw sw, float float2) {
		if (!this.o()) {
			double double4 = sw.q + (double)sw.bq() - 1.1F;
			double double6 = sw.p + sw.s - this.p;
			double double8 = double4 - this.q;
			double double10 = sw.r + sw.u - this.r;
			float float12 = ot.a(double6 * double6 + double10 * double10);
			agy agy13 = ahb.x;
			if (float12 >= 8.0F && !sw.a(si.b)) {
				agy13 = ahb.r;
			} else if (sw.bU() >= 8.0F && !sw.a(si.s)) {
				agy13 = ahb.z;
			} else if (float12 <= 3.0F && !sw.a(si.r) && this.S.nextFloat() < 0.25F) {
				agy13 = ahb.I;
			}

			abt abt14 = new abt(this.l, this, aha.a(new afj(afl.bI), agy13));
			abt14.w -= -20.0F;
			abt14.c(double6, double8 + (double)(float12 * 0.2F), double10, 0.75F, 8.0F);
			this.l.a(null, this.p, this.q, this.r, nn.hx, this.bC(), 1.0F, 0.8F + this.S.nextFloat() * 0.4F);
			this.l.a(abt14);
		}
	}

	@Override
	public float bq() {
		return 1.62F;
	}
}
