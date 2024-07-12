import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class zi extends sn {
	private atl e;
	public int a;
	public boolean b = true;
	private boolean f;
	private boolean g;
	private int h = 40;
	private float at = 2.0F;
	public du c;
	protected static final kk<co> d = kn.a(zi.class, km.j);

	public zi(ajs ajs) {
		super(ajs);
	}

	public zi(ajs ajs, double double2, double double3, double double4, atl atl) {
		super(ajs);
		this.e = atl;
		this.i = true;
		this.a(0.98F, 0.98F);
		this.b(double2, double3 + (double)((1.0F - this.H) / 2.0F), double4);
		this.s = 0.0;
		this.t = 0.0;
		this.u = 0.0;
		this.m = double2;
		this.n = double3;
		this.o = double4;
		this.a(new co(this));
	}

	public void a(co co) {
		this.Y.b(d, co);
	}

	public co j() {
		return this.Y.a(d);
	}

	@Override
	protected boolean af() {
		return false;
	}

	@Override
	protected void i() {
		this.Y.a(d, co.a);
	}

	@Override
	public boolean aq() {
		return !this.F;
	}

	@Override
	public void A_() {
		alu alu2 = this.e.v();
		if (this.e.a() == azs.a) {
			this.T();
		} else {
			this.m = this.p;
			this.n = this.q;
			this.o = this.r;
			if (this.a++ == 0) {
				co co3 = new co(this);
				if (this.l.o(co3).v() == alu2) {
					this.l.g(co3);
				} else if (!this.l.E) {
					this.T();
					return;
				}
			}

			if (!this.ae()) {
				this.t -= 0.04F;
			}

			this.a(tc.SELF, this.s, this.t, this.u);
			this.s *= 0.98F;
			this.t *= 0.98F;
			this.u *= 0.98F;
			if (!this.l.E) {
				co co3 = new co(this);
				if (this.z) {
					atl atl4 = this.l.o(co3);
					if (anj.i(this.l.o(new co(this.p, this.q - 0.01F, this.r)))) {
						this.z = false;
						return;
					}

					this.s *= 0.7F;
					this.u *= 0.7F;
					this.t *= -0.5;
					if (atl4.v() != alv.M) {
						this.T();
						if (!this.f) {
							if (this.l.a(alu2, co3, true, cv.UP, null) && !anj.i(this.l.o(co3.b())) && this.l.a(co3, this.e, 3)) {
								if (alu2 instanceof anj) {
									((anj)alu2).a_(this.l, co3);
								}

								if (this.c != null && alu2 instanceof ani) {
									asc asc5 = this.l.r(co3);
									if (asc5 != null) {
										du du6 = asc5.b(new du());

										for (String string8 : this.c.c()) {
											ei ei9 = this.c.c(string8);
											if (!"x".equals(string8) && !"y".equals(string8) && !"z".equals(string8)) {
												du6.a(string8, ei9.b());
											}
										}

										asc5.a(du6);
										asc5.x_();
									}
								}
							} else if (this.b && this.l.U().b("doEntityDrops")) {
								this.a(new afj(alu2, 1, alu2.d(this.e)), 0.0F);
							}
						} else if (alu2 instanceof anj) {
							((anj)alu2).b(this.l, co3);
						}
					}
				} else if (this.a > 100 && !this.l.E && (co3.q() < 1 || co3.q() > 256) || this.a > 600) {
					if (this.b && this.l.U().b("doEntityDrops")) {
						this.a(new afj(alu2, 1, alu2.d(this.e)), 0.0F);
					}

					this.T();
				}
			}
		}
	}

	@Override
	public void e(float float1, float float2) {
		alu alu4 = this.e.v();
		if (this.g) {
			int integer5 = ot.f(float1 - 1.0F);
			if (integer5 > 0) {
				List<sn> list6 = Lists.newArrayList(this.l.b(this, this.bo()));
				boolean boolean7 = alu4 == alv.cf;
				ry ry8 = boolean7 ? ry.q : ry.r;

				for (sn sn10 : list6) {
					sn10.a(ry8, (float)Math.min(ot.d((float)integer5 * this.at), this.h));
				}

				if (boolean7 && (double)this.S.nextFloat() < 0.05F + (double)integer5 * 0.05) {
					int integer9 = (Integer)this.e.c(all.b);
					if (++integer9 > 2) {
						this.f = true;
					} else {
						this.e = this.e.a(all.b, integer9);
					}
				}
			}
		}
	}

	public static void a(ph ph) {
	}

	@Override
	protected void b(du du) {
		alu alu3 = this.e != null ? this.e.v() : alv.a;
		kq kq4 = alu.h.b(alu3);
		du.a("Block", kq4 == null ? "" : kq4.toString());
		du.a("Data", (byte)alu3.e(this.e));
		du.a("Time", this.a);
		du.a("DropItem", this.b);
		du.a("HurtEntities", this.g);
		du.a("FallHurtAmount", this.at);
		du.a("FallHurtMax", this.h);
		if (this.c != null) {
			du.a("TileEntityData", this.c);
		}
	}

	@Override
	protected void a(du du) {
		int integer3 = du.f("Data") & 255;
		if (du.b("Block", 8)) {
			this.e = alu.b(du.l("Block")).a(integer3);
		} else if (du.b("TileID", 99)) {
			this.e = alu.b(du.h("TileID")).a(integer3);
		} else {
			this.e = alu.b(du.f("Tile") & 255).a(integer3);
		}

		this.a = du.h("Time");
		alu alu4 = this.e.v();
		if (du.b("HurtEntities", 99)) {
			this.g = du.p("HurtEntities");
			this.at = du.j("FallHurtAmount");
			this.h = du.h("FallHurtMax");
		} else if (alu4 == alv.cf) {
			this.g = true;
		}

		if (du.b("DropItem", 99)) {
			this.b = du.p("DropItem");
		}

		if (du.b("TileEntityData", 10)) {
			this.c = du.o("TileEntityData");
		}

		if (alu4 == null || alu4.t().a() == azs.a) {
			this.e = alv.m.t();
		}
	}

	public ajs k() {
		return this.l;
	}

	public void a(boolean boolean1) {
		this.g = boolean1;
	}

	@Override
	public boolean bd() {
		return false;
	}

	@Override
	public void a(c c) {
		super.a(c);
		if (this.e != null) {
			alu alu3 = this.e.v();
			c.a("Immitating block ID", alu.a(alu3));
			c.a("Immitating block data", alu3.e(this.e));
		}
	}

	@Nullable
	public atl l() {
		return this.e;
	}

	@Override
	public boolean bu() {
		return true;
	}
}
