import javax.annotation.Nullable;

public class ase extends ast implements lf {
	private dd<afj> p = dd.a(27, afj.a);
	public boolean a;
	public ase f;
	public ase g;
	public ase h;
	public ase i;
	public float j;
	public float k;
	public int l;
	private int q;
	private amg.a r;

	public ase() {
	}

	public ase(amg.a a) {
		this.r = a;
	}

	@Override
	public int v_() {
		return 27;
	}

	@Override
	public boolean w_() {
		for (afj afj3 : this.p) {
			if (!afj3.b()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String h_() {
		return this.n_() ? this.o : "container.chest";
	}

	public static void a(ph ph) {
		ph.a(pf.BLOCK_ENTITY, new qu(ase.class, "Items"));
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.p = dd.a(this.v_(), afj.a);
		if (!this.c(du)) {
			rd.b(du, this.p);
		}

		if (du.b("CustomName", 8)) {
			this.o = du.l("CustomName");
		}
	}

	@Override
	public du b(du du) {
		super.b(du);
		if (!this.d(du)) {
			rd.a(du, this.p);
		}

		if (this.n_()) {
			du.a("CustomName", this.o);
		}

		return du;
	}

	@Override
	public int y_() {
		return 64;
	}

	@Override
	public void B() {
		super.B();
		this.a = false;
	}

	private void a(ase ase, cv cv) {
		if (ase.y()) {
			this.a = false;
		} else if (this.a) {
			switch (cv) {
				case NORTH:
					if (this.f != ase) {
						this.a = false;
					}
					break;
				case SOUTH:
					if (this.i != ase) {
						this.a = false;
					}
					break;
				case EAST:
					if (this.g != ase) {
						this.a = false;
					}
					break;
				case WEST:
					if (this.h != ase) {
						this.a = false;
					}
			}
		}
	}

	public void o() {
		if (!this.a) {
			this.a = true;
			this.h = this.a(cv.WEST);
			this.g = this.a(cv.EAST);
			this.f = this.a(cv.NORTH);
			this.i = this.a(cv.SOUTH);
		}
	}

	@Nullable
	protected ase a(cv cv) {
		co co3 = this.c.a(cv);
		if (this.b(co3)) {
			asc asc4 = this.b.r(co3);
			if (asc4 instanceof ase) {
				ase ase5 = (ase)asc4;
				ase5.a(this, cv.d());
				return ase5;
			}
		}

		return null;
	}

	private boolean b(co co) {
		if (this.b == null) {
			return false;
		} else {
			alu alu3 = this.b.o(co).v();
			return alu3 instanceof amg && ((amg)alu3).g == this.p();
		}
	}

	@Override
	public void F_() {
		this.o();
		int integer2 = this.c.p();
		int integer3 = this.c.q();
		int integer4 = this.c.r();
		this.q++;
		if (!this.b.E && this.l != 0 && (this.q + integer2 + integer3 + integer4) % 200 == 0) {
			this.l = 0;
			float float5 = 5.0F;

			for (aay aay8 : this.b
				.a(
					aay.class,
					new bdt(
						(double)((float)integer2 - 5.0F),
						(double)((float)integer3 - 5.0F),
						(double)((float)integer4 - 5.0F),
						(double)((float)(integer2 + 1) + 5.0F),
						(double)((float)(integer3 + 1) + 5.0F),
						(double)((float)(integer4 + 1) + 5.0F)
					)
				)) {
				if (aay8.bu instanceof acp) {
					rc rc9 = ((acp)aay8.bu).e();
					if (rc9 == this || rc9 instanceof rb && ((rb)rc9).a(this)) {
						this.l++;
					}
				}
			}
		}

		this.k = this.j;
		float float5 = 0.1F;
		if (this.l > 0 && this.j == 0.0F && this.f == null && this.h == null) {
			double double6 = (double)integer2 + 0.5;
			double double8 = (double)integer4 + 0.5;
			if (this.i != null) {
				double8 += 0.5;
			}

			if (this.g != null) {
				double6 += 0.5;
			}

			this.b.a(null, double6, (double)integer3 + 0.5, double8, nn.Z, no.BLOCKS, 0.5F, this.b.r.nextFloat() * 0.1F + 0.9F);
		}

		if (this.l == 0 && this.j > 0.0F || this.l > 0 && this.j < 1.0F) {
			float float6 = this.j;
			if (this.l > 0) {
				this.j += 0.1F;
			} else {
				this.j -= 0.1F;
			}

			if (this.j > 1.0F) {
				this.j = 1.0F;
			}

			float float7 = 0.5F;
			if (this.j < 0.5F && float6 >= 0.5F && this.f == null && this.h == null) {
				double double8x = (double)integer2 + 0.5;
				double double10 = (double)integer4 + 0.5;
				if (this.i != null) {
					double10 += 0.5;
				}

				if (this.g != null) {
					double8x += 0.5;
				}

				this.b.a(null, double8x, (double)integer3 + 0.5, double10, nn.X, no.BLOCKS, 0.5F, this.b.r.nextFloat() * 0.1F + 0.9F);
			}

			if (this.j < 0.0F) {
				this.j = 0.0F;
			}
		}
	}

	@Override
	public boolean c(int integer1, int integer2) {
		if (integer1 == 1) {
			this.l = integer2;
			return true;
		} else {
			return super.c(integer1, integer2);
		}
	}

	@Override
	public void b(aay aay) {
		if (!aay.y()) {
			if (this.l < 0) {
				this.l = 0;
			}

			this.l++;
			this.b.c(this.c, this.x(), 1, this.l);
			this.b.b(this.c, this.x(), false);
			if (this.p() == amg.a.TRAP) {
				this.b.b(this.c.b(), this.x(), false);
			}
		}
	}

	@Override
	public void c(aay aay) {
		if (!aay.y() && this.x() instanceof amg) {
			this.l--;
			this.b.c(this.c, this.x(), 1, this.l);
			this.b.b(this.c, this.x(), false);
			if (this.p() == amg.a.TRAP) {
				this.b.b(this.c.b(), this.x(), false);
			}
		}
	}

	@Override
	public void z() {
		super.z();
		this.B();
		this.o();
	}

	public amg.a p() {
		if (this.r == null) {
			if (this.b == null || !(this.x() instanceof amg)) {
				return amg.a.BASIC;
			}

			this.r = ((amg)this.x()).g;
		}

		return this.r;
	}

	@Override
	public String l() {
		return "minecraft:chest";
	}

	@Override
	public acl a(aax aax, aay aay) {
		this.d(aay);
		return new acp(aax, this, aay);
	}

	@Override
	protected dd<afj> q() {
		return this.p;
	}
}
