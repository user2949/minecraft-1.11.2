import javax.annotation.Nullable;

public class yz extends yy {
	private static final kk<afj> c = kn.a(yz.class, km.f);
	private static final kk<Integer> d = kn.a(yz.class, km.b);
	private float e = 1.0F;

	public yz(ajs ajs) {
		super(ajs);
	}

	public yz(ajs ajs, co co, cv cv) {
		super(ajs, co);
		this.a(cv);
	}

	@Override
	protected void i() {
		this.R().a(c, afj.a);
		this.R().a(d, 0);
	}

	@Override
	public float aA() {
		return 0.0F;
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else if (!ry.c() && !this.r().b()) {
			if (!this.l.E) {
				this.b(ry.j(), false);
				this.a(nn.dh, 1.0F, 1.0F);
				this.a(afj.a);
			}

			return true;
		} else {
			return super.a(ry, float2);
		}
	}

	@Override
	public int l() {
		return 12;
	}

	@Override
	public int n() {
		return 12;
	}

	@Override
	public boolean a(double double1) {
		double double4 = 16.0;
		double4 *= 64.0 * bh();
		return double1 < double4 * double4;
	}

	@Override
	public void a(@Nullable sn sn) {
		this.a(nn.df, 1.0F, 1.0F);
		this.b(sn, true);
	}

	@Override
	public void o() {
		this.a(nn.dg, 1.0F, 1.0F);
	}

	public void b(@Nullable sn sn, boolean boolean2) {
		if (this.l.U().b("doEntityDrops")) {
			afj afj4 = this.r();
			if (sn instanceof aay) {
				aay aay5 = (aay)sn;
				if (aay5.bK.d) {
					this.b(afj4);
					return;
				}
			}

			if (boolean2) {
				this.a(new afj(afl.ca), 0.0F);
			}

			if (!afj4.b() && this.S.nextFloat() < this.e) {
				afj4 = afj4.l();
				this.b(afj4);
				this.a(afj4, 0.0F);
			}
		}
	}

	private void b(afj afj) {
		if (!afj.b()) {
			if (afj.c() == afl.bl) {
				bbn bbn3 = ((afp)afj.c()).a(afj, this.l);
				bbn3.j.remove("frame-" + this.O());
			}

			afj.a(null);
		}
	}

	public afj r() {
		return this.R().a(c);
	}

	public void a(afj afj) {
		this.a(afj, true);
	}

	private void a(afj afj, boolean boolean2) {
		if (!afj.b()) {
			afj = afj.l();
			afj.e(1);
			afj.a(this);
		}

		this.R().b(c, afj);
		this.R().b(c);
		if (!afj.b()) {
			this.a(nn.de, 1.0F, 1.0F);
		}

		if (boolean2 && this.a != null) {
			this.l.d(this.a, alv.a);
		}
	}

	@Override
	public void a(kk<?> kk) {
		if (kk.equals(c)) {
			afj afj3 = this.r();
			if (!afj3.b() && afj3.A() != this) {
				afj3.a(this);
			}
		}
	}

	public int s() {
		return this.R().a(d);
	}

	public void a(int integer) {
		this.a(integer, true);
	}

	private void a(int integer, boolean boolean2) {
		this.R().b(d, integer % 8);
		if (boolean2 && this.a != null) {
			this.l.d(this.a, alv.a);
		}
	}

	public static void a(ph ph) {
		ph.a(pf.ENTITY, new qr(yz.class, "Item"));
	}

	@Override
	public void b(du du) {
		if (!this.r().b()) {
			du.a("Item", this.r().a(new du()));
			du.a("ItemRotation", (byte)this.s());
			du.a("ItemDropChance", this.e);
		}

		super.b(du);
	}

	@Override
	public void a(du du) {
		du du3 = du.o("Item");
		if (du3 != null && !du3.b_()) {
			this.a(new afj(du3), false);
			this.a(du.f("ItemRotation"), false);
			if (du.b("ItemDropChance", 99)) {
				this.e = du.j("ItemDropChance");
			}
		}

		super.a(du);
	}

	@Override
	public boolean b(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (!this.l.E) {
			if (this.r().b()) {
				if (!afj4.b()) {
					this.a(afj4);
					if (!aay.bK.d) {
						afj4.g(1);
					}
				}
			} else {
				this.a(nn.di, 1.0F, 1.0F);
				this.a(this.s() + 1);
			}
		}

		return true;
	}

	public int t() {
		return this.r().b() ? 0 : this.s() % 8 + 1;
	}
}
