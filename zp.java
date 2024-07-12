import java.util.Collection;
import javax.annotation.Nullable;

public class zp extends aaa {
	private static final kk<Integer> a = kn.a(zp.class, km.b);
	private static final kk<Boolean> b = kn.a(zp.class, km.h);
	private static final kk<Boolean> c = kn.a(zp.class, km.h);
	private int bw;
	private int bx;
	private int by = 30;
	private int bz = 3;
	private int bA;

	public zp(ajs ajs) {
		super(ajs);
		this.a(0.6F, 1.7F);
	}

	@Override
	protected void r() {
		this.bq.a(1, new uf(this));
		this.bq.a(2, new vm(this));
		this.bq.a(3, new ty(this, xb.class, 6.0F, 1.0, 1.2));
		this.bq.a(4, new ur(this, 1.0, false));
		this.bq.a(5, new vr(this, 0.8));
		this.bq.a(6, new uo(this, aay.class, 8.0F));
		this.bq.a(6, new ve(this));
		this.br.a(1, new vy(this, aay.class, true));
		this.br.a(2, new vv(this, false));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.d).a(0.25);
	}

	@Override
	public int aY() {
		return this.z() == null ? 3 : 3 + (int)(this.bU() - 1.0F);
	}

	@Override
	public void e(float float1, float float2) {
		super.e(float1, float2);
		this.bx = (int)((float)this.bx + float1 * 1.5F);
		if (this.bx > this.by - 5) {
			this.bx = this.by - 5;
		}
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, -1);
		this.Y.a(b, false);
		this.Y.a(c, false);
	}

	public static void a(ph ph) {
		sx.a(ph, zp.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		if (this.Y.a(b)) {
			du.a("powered", true);
		}

		du.a("Fuse", (short)this.by);
		du.a("ExplosionRadius", (byte)this.bz);
		du.a("ignited", this.dj());
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.Y.b(b, du.p("powered"));
		if (du.b("Fuse", 99)) {
			this.by = du.g("Fuse");
		}

		if (du.b("ExplosionRadius", 99)) {
			this.bz = du.f("ExplosionRadius");
		}

		if (du.p("ignited")) {
			this.dk();
		}
	}

	@Override
	public void A_() {
		if (this.au()) {
			this.bw = this.bx;
			if (this.dj()) {
				this.a(1);
			}

			int integer2 = this.di();
			if (integer2 > 0 && this.bx == 0) {
				this.a(nn.av, 1.0F, 0.5F);
			}

			this.bx += integer2;
			if (this.bx < 0) {
				this.bx = 0;
			}

			if (this.bx >= this.by) {
				this.bx = this.by;
				this.dn();
			}
		}

		super.A_();
	}

	@Override
	protected nm bW() {
		return nn.au;
	}

	@Override
	protected nm bX() {
		return nn.at;
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (this.l.U().b("doMobLoot")) {
			if (ry.j() instanceof aag) {
				int integer3 = afh.a(afl.cB);
				int integer4 = afh.a(afl.cM);
				int integer5 = integer3 + this.S.nextInt(integer4 - integer3 + 1);
				this.a(afh.c(integer5), 1);
			} else if (ry.j() instanceof zp && ry.j() != this && ((zp)ry.j()).o() && ((zp)ry.j()).dl()) {
				((zp)ry.j()).dm();
				this.a(new afj(afl.ci, 1, 4), 0.0F);
			}
		}
	}

	@Override
	public boolean B(sn sn) {
		return true;
	}

	public boolean o() {
		return this.Y.a(b);
	}

	public float a(float float1) {
		return ((float)this.bw + (float)(this.bx - this.bw) * float1) / (float)(this.by - 2);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.r;
	}

	public int di() {
		return this.Y.a(a);
	}

	public void a(int integer) {
		this.Y.b(a, integer);
	}

	@Override
	public void a(zg zg) {
		super.a(zg);
		this.Y.b(b, true);
	}

	@Override
	protected boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (afj4.c() == afl.e) {
			this.l.a(aay, this.p, this.q, this.r, nn.bI, this.bC(), 1.0F, this.S.nextFloat() * 0.4F + 0.8F);
			aay.a(ri);
			if (!this.l.E) {
				this.dk();
				afj4.a(1, aay);
				return true;
			}
		}

		return super.a(aay, ri);
	}

	private void dn() {
		if (!this.l.E) {
			boolean boolean2 = this.l.U().b("mobGriefing");
			float float3 = this.o() ? 2.0F : 1.0F;
			this.aU = true;
			this.l.a(this, this.p, this.q, this.r, (float)this.bz * float3, boolean2);
			this.T();
			this.do();
		}
	}

	private void do() {
		Collection<sh> collection2 = this.bS();
		if (!collection2.isEmpty()) {
			sl sl3 = new sl(this.l, this.p, this.q, this.r);
			sl3.a(2.5F);
			sl3.b(-0.5F);
			sl3.g(10);
			sl3.e(sl3.r() / 2);
			sl3.c(-sl3.j() / (float)sl3.r());

			for (sh sh5 : collection2) {
				sl3.a(new sh(sh5));
			}

			this.l.a(sl3);
		}
	}

	public boolean dj() {
		return this.Y.a(c);
	}

	public void dk() {
		this.Y.b(c, true);
	}

	public boolean dl() {
		return this.bA < 1 && this.l.U().b("doMobLoot");
	}

	public void dm() {
		this.bA++;
	}
}
