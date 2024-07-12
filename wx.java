import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class wx extends ww {
	private static final Set<afh> bE = Sets.newHashSet(new afh[]{afl.Q, afl.bp, afl.bo, afl.cV});
	public float bw;
	public float bx;
	public float by;
	public float bA;
	public float bB = 1.0F;
	public int bC;
	public boolean bD;

	public wx(ajs ajs) {
		super(ajs);
		this.a(0.4F, 0.7F);
		this.bC = this.S.nextInt(6000) + 6000;
		this.a(bba.WATER, 0.0F);
	}

	@Override
	protected void r() {
		this.bq.a(0, new uf(this));
		this.bq.a(1, new vb(this, 1.4));
		this.bq.a(2, new ub(this, 1.0));
		this.bq.a(3, new vo(this, 1.0, false, bE));
		this.bq.a(4, new uh(this, 1.1));
		this.bq.a(5, new vr(this, 1.0));
		this.bq.a(6, new uo(this, aay.class, 6.0F));
		this.bq.a(7, new ve(this));
	}

	@Override
	public float bq() {
		return this.H;
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(4.0);
		this.a(aad.d).a(0.25);
	}

	@Override
	public void n() {
		super.n();
		this.bA = this.bw;
		this.by = this.bx;
		this.bx = (float)((double)this.bx + (double)(this.z ? -1 : 4) * 0.3);
		this.bx = ot.a(this.bx, 0.0F, 1.0F);
		if (!this.z && this.bB < 1.0F) {
			this.bB = 1.0F;
		}

		this.bB = (float)((double)this.bB * 0.9);
		if (!this.z && this.t < 0.0) {
			this.t *= 0.6;
		}

		this.bw = this.bw + this.bB * 2.0F;
		if (!this.l.E && !this.l_() && !this.dh() && --this.bC <= 0) {
			this.a(nn.ac, 1.0F, (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F);
			this.a(afl.aX, 1);
			this.bC = this.S.nextInt(6000) + 6000;
		}
	}

	@Override
	public void e(float float1, float float2) {
	}

	@Override
	protected nm G() {
		return nn.aa;
	}

	@Override
	protected nm bW() {
		return nn.ad;
	}

	@Override
	protected nm bX() {
		return nn.ab;
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(nn.ae, 0.15F, 1.0F);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.D;
	}

	public wx a(sk sk) {
		return new wx(this.l);
	}

	@Override
	public boolean e(afj afj) {
		return bE.contains(afj.c());
	}

	@Override
	protected int b(aay aay) {
		return this.dh() ? 10 : super.b(aay);
	}

	public static void a(ph ph) {
		sx.a(ph, wx.class);
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.bD = du.p("IsChickenJockey");
		if (du.e("EggLayTime")) {
			this.bC = du.h("EggLayTime");
		}
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("IsChickenJockey", this.bD);
		du.a("EggLayTime", this.bC);
	}

	@Override
	protected boolean K() {
		return this.dh() && !this.aL();
	}

	@Override
	public void k(sn sn) {
		super.k(sn);
		float float3 = ot.a(this.aN * (float) (Math.PI / 180.0));
		float float4 = ot.b(this.aN * (float) (Math.PI / 180.0));
		float float5 = 0.1F;
		float float6 = 0.0F;
		sn.b(this.p + (double)(0.1F * float3), this.q + (double)(this.H * 0.5F) + sn.ax() + 0.0, this.r - (double)(0.1F * float4));
		if (sn instanceof sw) {
			((sw)sn).aN = this.aN;
		}
	}

	public boolean dh() {
		return this.bD;
	}

	public void p(boolean boolean1) {
		this.bD = boolean1;
	}
}
