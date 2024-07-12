import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class xc extends ww {
	private static final kk<Boolean> bw = kn.a(xc.class, km.h);
	private static final kk<Integer> bx = kn.a(xc.class, km.b);
	private static final Set<afh> by = Sets.newHashSet(new afh[]{afl.cc, afl.cd, afl.cW});
	private boolean bA;
	private int bB;
	private int bC;

	public xc(ajs ajs) {
		super(ajs);
		this.a(0.9F, 0.9F);
	}

	@Override
	protected void r() {
		this.bq.a(0, new uf(this));
		this.bq.a(1, new vb(this, 1.25));
		this.bq.a(3, new ub(this, 1.0));
		this.bq.a(4, new vo(this, 1.2, afl.cj, false));
		this.bq.a(4, new vo(this, 1.2, false, by));
		this.bq.a(5, new uh(this, 1.1));
		this.bq.a(6, new vr(this, 1.0));
		this.bq.a(7, new uo(this, aay.class, 6.0F));
		this.bq.a(8, new ve(this));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(10.0);
		this.a(aad.d).a(0.25);
	}

	@Nullable
	@Override
	public sn bw() {
		return this.bx().isEmpty() ? null : (sn)this.bx().get(0);
	}

	@Override
	public boolean cR() {
		sn sn2 = this.bw();
		if (!(sn2 instanceof aay)) {
			return false;
		} else {
			aay aay3 = (aay)sn2;
			return aay3.cg().c() == afl.cj || aay3.ch().c() == afl.cj;
		}
	}

	@Override
	public void a(kk<?> kk) {
		if (bx.equals(kk) && this.l.E) {
			this.bA = true;
			this.bB = 0;
			this.bC = this.Y.a(bx);
		}

		super.a(kk);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bw, false);
		this.Y.a(bx, 0);
	}

	public static void a(ph ph) {
		sx.a(ph, xc.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Saddle", this.dh());
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.p(du.p("Saddle"));
	}

	@Override
	protected nm G() {
		return nn.ep;
	}

	@Override
	protected nm bW() {
		return nn.er;
	}

	@Override
	protected nm bX() {
		return nn.eq;
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(nn.et, 0.15F, 1.0F);
	}

	@Override
	public boolean a(aay aay, ri ri) {
		if (!super.a(aay, ri)) {
			afj afj4 = aay.b(ri);
			if (afj4.c() == afl.cz) {
				afj4.a(aay, this, ri);
				return true;
			} else if (this.dh() && !this.aL()) {
				if (!this.l.E) {
					aay.m(this);
				}

				return true;
			} else if (afj4.c() == afl.aD) {
				afj4.a(aay, this, ri);
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (!this.l.E) {
			if (this.dh()) {
				this.a(afl.aD, 1);
			}
		}
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.E;
	}

	public boolean dh() {
		return this.Y.a(bw);
	}

	public void p(boolean boolean1) {
		if (boolean1) {
			this.Y.b(bw, true);
		} else {
			this.Y.b(bw, false);
		}
	}

	@Override
	public void a(zg zg) {
		if (!this.l.E && !this.F) {
			aab aab3 = new aab(this.l);
			aab3.a(ss.MAINHAND, new afj(afl.E));
			aab3.b(this.p, this.q, this.r, this.v, this.w);
			aab3.n(this.cY());
			if (this.n_()) {
				aab3.c(this.bi());
				aab3.j(this.bj());
			}

			this.l.a(aab3);
			this.T();
		}
	}

	@Override
	public void e(float float1, float float2) {
		super.e(float1, float2);
		if (float1 > 5.0F) {
			for (aay aay5 : this.b(aay.class)) {
				aay5.b(nr.u);
			}
		}
	}

	@Override
	public void g(float float1, float float2) {
		sn sn4 = this.bx().isEmpty() ? null : (sn)this.bx().get(0);
		if (this.aL() && this.cR()) {
			this.v = sn4.v;
			this.x = this.v;
			this.w = sn4.w * 0.5F;
			this.b(this.v, this.w);
			this.aN = this.v;
			this.aP = this.v;
			this.P = 1.0F;
			this.aR = this.cq() * 0.1F;
			if (this.bA && this.bB++ > this.bC) {
				this.bA = false;
			}

			if (this.bA()) {
				float float5 = (float)this.a(aad.d).e() * 0.225F;
				if (this.bA) {
					float5 += float5 * 1.15F * ot.a((float)this.bB / (float)this.bC * (float) Math.PI);
				}

				this.l(float5);
				super.g(0.0F, 1.0F);
			} else {
				this.s = 0.0;
				this.t = 0.0;
				this.u = 0.0;
			}

			this.aF = this.aG;
			double double5 = this.p - this.m;
			double double7 = this.r - this.o;
			float float9 = ot.a(double5 * double5 + double7 * double7) * 4.0F;
			if (float9 > 1.0F) {
				float9 = 1.0F;
			}

			this.aG = this.aG + (float9 - this.aG) * 0.4F;
			this.aH = this.aH + this.aG;
		} else {
			this.P = 0.5F;
			this.aR = 0.02F;
			super.g(float1, float2);
		}
	}

	public boolean di() {
		if (this.bA) {
			return false;
		} else {
			this.bA = true;
			this.bB = 0;
			this.bC = this.bJ().nextInt(841) + 140;
			this.R().b(bx, this.bC);
			return true;
		}
	}

	public xc a(sk sk) {
		return new xc(this.l);
	}

	@Override
	public boolean e(afj afj) {
		return by.contains(afj.c());
	}
}
