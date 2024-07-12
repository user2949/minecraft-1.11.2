import java.util.Locale;
import java.util.Random;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aat extends sk implements aas, ajd {
	private static final Logger bx = LogManager.getLogger();
	private static final kk<Integer> by = kn.a(aat.class, km.b);
	private int bz;
	private boolean bA;
	private boolean bB;
	wp bw;
	private aay bC;
	@Nullable
	private ajf bD;
	private int bE;
	private boolean bF;
	private boolean bG;
	private int bH;
	private String bI;
	private int bJ;
	private int bK;
	private boolean bL;
	private boolean bM;
	private final rr bN = new rr("Items", false, 8);
	private static final aat.f[][][][] bO = new aat.f[][][][]{
		{
				{
						{new aat.a(afl.R, new aat.g(18, 22)), new aat.a(afl.cd, new aat.g(15, 19)), new aat.a(afl.cc, new aat.g(15, 19)), new aat.e(afl.S, new aat.g(-4, -2))},
						{new aat.a(afh.a(alv.aU), new aat.g(8, 13)), new aat.e(afl.cl, new aat.g(-3, -2))},
						{new aat.a(afh.a(alv.bk), new aat.g(7, 12)), new aat.e(afl.f, new aat.g(-7, -5))},
						{new aat.e(afl.bk, new aat.g(-10, -6)), new aat.e(afl.bh, new aat.g(1, 1))}
				},
				{
						{new aat.a(afl.I, new aat.g(15, 20)), new aat.a(afl.k, new aat.g(16, 24)), new aat.d(afl.bc, new aat.g(6, 6), afl.bd, new aat.g(6, 6))},
						{new aat.c(afl.aZ, new aat.g(7, 8))}
				},
				{
						{new aat.a(afh.a(alv.L), new aat.g(16, 22)), new aat.e(afl.bm, new aat.g(3, 4))},
						{
								new aat.e(new afj(afh.a(alv.L)), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 1), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 2), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 3), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 4), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 5), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 6), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 7), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 8), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 9), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 10), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 11), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 12), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 13), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 14), new aat.g(1, 2)),
								new aat.e(new afj(afh.a(alv.L), 1, 15), new aat.g(1, 2))
						}
				},
				{
						{new aat.a(afl.I, new aat.g(15, 20)), new aat.e(afl.h, new aat.g(-12, -8))},
						{new aat.e(afl.g, new aat.g(2, 3)), new aat.d(afh.a(alv.n), new aat.g(10, 10), afl.an, new aat.g(6, 10))}
				}
		},
		{
				{
						{new aat.a(afl.aS, new aat.g(24, 36)), new aat.b()},
						{new aat.a(afl.aT, new aat.g(8, 10)), new aat.e(afl.aY, new aat.g(10, 12)), new aat.e(afh.a(alv.X), new aat.g(3, 4))},
						{new aat.a(afl.bY, new aat.g(2, 2)), new aat.e(afl.ba, new aat.g(10, 12)), new aat.e(afh.a(alv.w), new aat.g(-5, -3))},
						{new aat.b()},
						{new aat.b()},
						{new aat.e(afl.cz, new aat.g(20, 22))}
				},
				{
						{new aat.a(afl.aS, new aat.g(24, 36))},
						{new aat.a(afl.aY, new aat.g(1, 1))},
						{new aat.e(afl.cg, new aat.g(7, 11))},
						{new aat.h(new aat.g(12, 20), "Monument", bbm.a.MONUMENT), new aat.h(new aat.g(16, 28), "Mansion", bbm.a.MANSION)}
				}
		},
		{
				{
						{new aat.a(afl.bB, new aat.g(36, 40)), new aat.a(afl.n, new aat.g(8, 10))},
						{new aat.e(afl.aF, new aat.g(-4, -1)), new aat.e(new afj(afl.be, 1, aem.BLUE.b()), new aat.g(-2, -1))},
						{new aat.e(afl.bC, new aat.g(4, 7)), new aat.e(afh.a(alv.aX), new aat.g(-3, -1))},
						{new aat.e(afl.bV, new aat.g(3, 11))}
				}
		},
		{
				{
						{new aat.a(afl.k, new aat.g(16, 24)), new aat.e(afl.ab, new aat.g(4, 6))},
						{new aat.a(afl.m, new aat.g(7, 9)), new aat.e(afl.ac, new aat.g(10, 14))},
						{new aat.a(afl.l, new aat.g(3, 4)), new aat.c(afl.ag, new aat.g(16, 19))},
						{new aat.e(afl.aa, new aat.g(5, 7)), new aat.e(afl.Z, new aat.g(9, 11)), new aat.e(afl.X, new aat.g(5, 7)), new aat.e(afl.Y, new aat.g(11, 15))}
				},
				{
						{new aat.a(afl.k, new aat.g(16, 24)), new aat.e(afl.d, new aat.g(6, 8))},
						{new aat.a(afl.m, new aat.g(7, 9)), new aat.c(afl.o, new aat.g(9, 10))},
						{new aat.a(afl.l, new aat.g(3, 4)), new aat.c(afl.x, new aat.g(12, 15)), new aat.c(afl.A, new aat.g(9, 12))}
				},
				{
						{new aat.a(afl.k, new aat.g(16, 24)), new aat.c(afl.b, new aat.g(5, 7))},
						{new aat.a(afl.m, new aat.g(7, 9)), new aat.c(afl.c, new aat.g(9, 11))},
						{new aat.a(afl.l, new aat.g(3, 4)), new aat.c(afl.z, new aat.g(12, 15))}
				}
		},
		{
				{
						{new aat.a(afl.ao, new aat.g(14, 18)), new aat.a(afl.bs, new aat.g(14, 18))},
						{new aat.a(afl.k, new aat.g(16, 24)), new aat.e(afl.ap, new aat.g(-7, -5)), new aat.e(afl.bt, new aat.g(-8, -6))}
				},
				{{new aat.a(afl.aN, new aat.g(9, 12)), new aat.e(afl.V, new aat.g(2, 4))}, {new aat.c(afl.U, new aat.g(7, 12))}, {new aat.e(afl.aD, new aat.g(8, 10))}}
		},
		{new aat.f[0][]}
	};

	public aat(ajs ajs) {
		this(ajs, 0);
	}

	public aat(ajs ajs, int integer) {
		super(ajs);
		this.g(integer);
		this.a(0.6F, 1.95F);
		((we)this.x()).a(true);
		this.m(true);
	}

	@Override
	protected void r() {
		this.bq.a(0, new uf(this));
		this.bq.a(1, new ty(this, aao.class, 8.0F, 0.6, 0.6));
		this.bq.a(1, new ty(this, zu.class, 12.0F, 0.8, 0.8));
		this.bq.a(1, new ty(this, aal.class, 8.0F, 0.8, 0.8));
		this.bq.a(1, new ty(this, aak.class, 8.0F, 0.6, 0.6));
		this.bq.a(1, new vp(this));
		this.bq.a(1, new up(this));
		this.bq.a(2, new us(this));
		this.bq.a(3, new vi(this));
		this.bq.a(4, new va(this, true));
		this.bq.a(5, new uv(this, 0.6));
		this.bq.a(6, new uq(this));
		this.bq.a(7, new vn(this));
		this.bq.a(9, new ul(this, aay.class, 3.0F, 1.0F));
		this.bq.a(9, new vq(this));
		this.bq.a(9, new vr(this, 0.6));
		this.bq.a(10, new uo(this, sx.class, 8.0F));
	}

	private void ds() {
		if (!this.bM) {
			this.bM = true;
			if (this.l_()) {
				this.bq.a(8, new vc(this, 0.32));
			} else if (this.dh() == 0) {
				this.bq.a(6, new uk(this, 0.6));
			}
		}
	}

	@Override
	protected void o() {
		if (this.dh() == 0) {
			this.bq.a(8, new uk(this, 0.6));
		}

		super.o();
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.d).a(0.5);
	}

	@Override
	protected void M() {
		if (--this.bz <= 0) {
			co co2 = new co(this);
			this.l.ai().a(co2);
			this.bz = 70 + this.S.nextInt(50);
			this.bw = this.l.ai().a(co2, 32);
			if (this.bw == null) {
				this.de();
			} else {
				co co3 = this.bw.a();
				this.a(co3, this.bw.b());
				if (this.bL) {
					this.bL = false;
					this.bw.b(5);
				}
			}
		}

		if (!this.dk() && this.bE > 0) {
			this.bE--;
			if (this.bE <= 0) {
				if (this.bF) {
					for (aje aje3 : this.bD) {
						if (aje3.h()) {
							aje3.a(this.S.nextInt(6) + this.S.nextInt(6) + 2);
						}
					}

					this.dt();
					this.bF = false;
					if (this.bw != null && this.bI != null) {
						this.l.a(this, (byte)14);
						this.bw.a(this.bI, 1);
					}
				}

				this.c(new sh(si.j, 200, 0));
			}
		}

		super.M();
	}

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		boolean boolean5 = afj4.c() == afl.cz;
		if (boolean5) {
			afj4.a(aay, this, ri);
			return true;
		} else if (!this.a(afj4, this.getClass()) && this.au() && !this.dk() && !this.l_()) {
			if (this.bD == null) {
				this.dt();
			}

			if (ri == ri.MAIN_HAND) {
				aay.b(oa.F);
			}

			if (!this.l.E && !this.bD.isEmpty()) {
				this.a_(aay);
				aay.a((ajd)this);
			} else if (this.bD.isEmpty()) {
				return super.a(aay, ri);
			}

			return true;
		} else {
			return super.a(aay, ri);
		}
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(by, 0);
	}

	public static void a(ph ph) {
		sx.a(ph, aat.class);
		ph.a(pf.ENTITY, new qu(aat.class, "Inventory"));
		ph.a(pf.ENTITY, new pj() {
			@Override
			public du a(pg pg, du du, int integer) {
				if (sp.a(aat.class).equals(new kq(du.l("id"))) && du.b("Offers", 10)) {
					du du5 = du.o("Offers");
					if (du5.b("Recipes", 9)) {
						ea ea6 = du5.c("Recipes", 10);

						for (int integer7 = 0; integer7 < ea6.c(); integer7++) {
							du du8 = ea6.b(integer7);
							pi.a(pg, du8, integer, "buy");
							pi.a(pg, du8, integer, "buyB");
							pi.a(pg, du8, integer, "sell");
							ea6.a(integer7, du8);
						}
					}
				}

				return du;
			}
		});
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Profession", this.dh());
		du.a("Riches", this.bH);
		du.a("Career", this.bJ);
		du.a("CareerLevel", this.bK);
		du.a("Willing", this.bG);
		if (this.bD != null) {
			du.a("Offers", this.bD.a());
		}

		ea ea3 = new ea();

		for (int integer4 = 0; integer4 < this.bN.v_(); integer4++) {
			afj afj5 = this.bN.a(integer4);
			if (!afj5.b()) {
				ea3.a(afj5.a(new du()));
			}
		}

		du.a("Inventory", ea3);
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.g(du.h("Profession"));
		this.bH = du.h("Riches");
		this.bJ = du.h("Career");
		this.bK = du.h("CareerLevel");
		this.bG = du.p("Willing");
		if (du.b("Offers", 10)) {
			du du3 = du.o("Offers");
			this.bD = new ajf(du3);
		}

		ea ea3 = du.c("Inventory", 10);

		for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
			afj afj5 = new afj(ea3.b(integer4));
			if (!afj5.b()) {
				this.bN.a(afj5);
			}
		}

		this.m(true);
		this.ds();
	}

	@Override
	protected boolean K() {
		return false;
	}

	@Override
	protected nm G() {
		return this.dk() ? nn.hk : nn.hg;
	}

	@Override
	protected nm bW() {
		return nn.hi;
	}

	@Override
	protected nm bX() {
		return nn.hh;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.at;
	}

	public void g(int integer) {
		this.Y.b(by, integer);
	}

	public int dh() {
		return Math.max(this.Y.a(by) % 6, 0);
	}

	public boolean di() {
		return this.bA;
	}

	public void p(boolean boolean1) {
		this.bA = boolean1;
	}

	public void q(boolean boolean1) {
		this.bB = boolean1;
	}

	public boolean dj() {
		return this.bB;
	}

	@Override
	public void a(@Nullable sw sw) {
		super.a(sw);
		if (this.bw != null && sw != null) {
			this.bw.a(sw);
			if (sw instanceof aay) {
				int integer3 = -1;
				if (this.l_()) {
					integer3 = -3;
				}

				this.bw.a(sw.h_(), integer3);
				if (this.au()) {
					this.l.a(this, (byte)13);
				}
			}
		}
	}

	@Override
	public void a(ry ry) {
		if (this.bw != null) {
			sn sn3 = ry.j();
			if (sn3 != null) {
				if (sn3 instanceof aay) {
					this.bw.a(sn3.h_(), -2);
				} else if (sn3 instanceof zt) {
					this.bw.h();
				}
			} else {
				aay aay4 = this.l.a(this, 16.0);
				if (aay4 != null) {
					this.bw.h();
				}
			}
		}

		super.a(ry);
	}

	@Override
	public void a_(aay aay) {
		this.bC = aay;
	}

	@Override
	public aay s_() {
		return this.bC;
	}

	public boolean dk() {
		return this.bC != null;
	}

	public boolean r(boolean boolean1) {
		if (!this.bG && boolean1 && this.dn()) {
			boolean boolean3 = false;

			for (int integer4 = 0; integer4 < this.bN.v_(); integer4++) {
				afj afj5 = this.bN.a(integer4);
				if (!afj5.b()) {
					if (afj5.c() == afl.S && afj5.E() >= 3) {
						boolean3 = true;
						this.bN.a(integer4, 3);
					} else if ((afj5.c() == afl.cd || afj5.c() == afl.cc) && afj5.E() >= 12) {
						boolean3 = true;
						this.bN.a(integer4, 12);
					}
				}

				if (boolean3) {
					this.l.a(this, (byte)18);
					this.bG = true;
					break;
				}
			}
		}

		return this.bG;
	}

	public void s(boolean boolean1) {
		this.bG = boolean1;
	}

	@Override
	public void a(aje aje) {
		aje.g();
		this.a_ = -this.C();
		this.a(nn.hl, this.ci(), this.cj());
		int integer3 = 3 + this.S.nextInt(4);
		if (aje.e() == 1 || this.S.nextInt(5) == 0) {
			this.bE = 40;
			this.bF = true;
			this.bG = true;
			if (this.bC != null) {
				this.bI = this.bC.h_();
			} else {
				this.bI = null;
			}

			integer3 += 5;
		}

		if (aje.a().c() == afl.bZ) {
			this.bH = this.bH + aje.a().E();
		}

		if (aje.j()) {
			this.l.a(new st(this.l, this.p, this.q + 0.5, this.r, integer3));
		}
	}

	@Override
	public void a(afj afj) {
		if (!this.l.E && this.a_ > -this.C() + 20) {
			this.a_ = -this.C();
			this.a(afj.b() ? nn.hj : nn.hl, this.ci(), this.cj());
		}
	}

	@Nullable
	@Override
	public ajf b_(aay aay) {
		if (this.bD == null) {
			this.dt();
		}

		return this.bD;
	}

	private void dt() {
		aat.f[][][] arr2 = bO[this.dh()];
		if (this.bJ != 0 && this.bK != 0) {
			this.bK++;
		} else {
			this.bJ = this.S.nextInt(arr2.length) + 1;
			this.bK = 1;
		}

		if (this.bD == null) {
			this.bD = new ajf();
		}

		int integer3 = this.bJ - 1;
		int integer4 = this.bK - 1;
		if (integer3 >= 0 && integer3 < arr2.length) {
			aat.f[][] arr5 = arr2[integer3];
			if (integer4 >= 0 && integer4 < arr5.length) {
				aat.f[] arr6 = arr5[integer4];

				for (aat.f f10 : arr6) {
					f10.a(this, this.bD, this.S);
				}
			}
		}
	}

	@Override
	public void a(@Nullable ajf ajf) {
	}

	@Override
	public ajs t_() {
		return this.l;
	}

	@Override
	public co u_() {
		return new co(this);
	}

	@Override
	public fb i_() {
		bee bee2 = this.aQ();
		String string3 = this.bi();
		if (string3 != null && !string3.isEmpty()) {
			fh fh4 = new fh(bdz.a(bee2, string3));
			fh4.b().a(this.bn());
			fh4.b().a(this.bf());
			return fh4;
		} else {
			if (this.bD == null) {
				this.dt();
			}

			String string4 = null;
			switch (this.dh()) {
				case 0:
					if (this.bJ == 1) {
						string4 = "farmer";
					} else if (this.bJ == 2) {
						string4 = "fisherman";
					} else if (this.bJ == 3) {
						string4 = "shepherd";
					} else if (this.bJ == 4) {
						string4 = "fletcher";
					}
					break;
				case 1:
					if (this.bJ == 1) {
						string4 = "librarian";
					} else if (this.bJ == 2) {
						string4 = "cartographer";
					}
					break;
				case 2:
					string4 = "cleric";
					break;
				case 3:
					if (this.bJ == 1) {
						string4 = "armor";
					} else if (this.bJ == 2) {
						string4 = "weapon";
					} else if (this.bJ == 3) {
						string4 = "tool";
					}
					break;
				case 4:
					if (this.bJ == 1) {
						string4 = "butcher";
					} else if (this.bJ == 2) {
						string4 = "leather";
					}
					break;
				case 5:
					string4 = "nitwit";
			}

			if (string4 != null) {
				fb fb5 = new fi("entity.Villager." + string4);
				fb5.b().a(this.bn());
				fb5.b().a(this.bf());
				if (bee2 != null) {
					fb5.b().a(bee2.m());
				}

				return fb5;
			} else {
				return super.i_();
			}
		}
	}

	@Override
	public float bq() {
		return this.l_() ? 0.81F : 1.62F;
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 12) {
			this.a(de.HEART);
		} else if (byte1 == 13) {
			this.a(de.VILLAGER_ANGRY);
		} else if (byte1 == 14) {
			this.a(de.VILLAGER_HAPPY);
		} else {
			super.a(byte1);
		}
	}

	private void a(de de) {
		for (int integer3 = 0; integer3 < 5; integer3++) {
			double double4 = this.S.nextGaussian() * 0.02;
			double double6 = this.S.nextGaussian() * 0.02;
			double double8 = this.S.nextGaussian() * 0.02;
			this.l
				.a(
					de,
					this.p + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
					this.q + 1.0 + (double)(this.S.nextFloat() * this.H),
					this.r + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
					double4,
					double6,
					double8
				);
		}
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		return this.a(rh, sz, true);
	}

	public sz a(rh rh, @Nullable sz sz, boolean boolean3) {
		sz = super.a(rh, sz);
		if (boolean3) {
			this.g(this.l.r.nextInt(6));
		}

		this.ds();
		this.dt();
		return sz;
	}

	public void dl() {
		this.bL = true;
	}

	public aat a(sk sk) {
		aat aat3 = new aat(this.l);
		aat3.a(this.l.D(new co(aat3)), null);
		return aat3;
	}

	@Override
	public boolean a(aay aay) {
		return false;
	}

	@Override
	public void a(zg zg) {
		if (!this.l.E && !this.F) {
			aam aam3 = new aam(this.l);
			aam3.b(this.p, this.q, this.r, this.v, this.w);
			aam3.a(this.l.D(new co(aam3)), null);
			aam3.n(this.cY());
			if (this.n_()) {
				aam3.c(this.bi());
				aam3.j(this.bj());
			}

			this.l.a(aam3);
			this.T();
		}
	}

	public rr dm() {
		return this.bN;
	}

	@Override
	protected void a(zj zj) {
		afj afj3 = zj.k();
		afh afh4 = afj3.c();
		if (this.a(afh4)) {
			afj afj5 = this.bN.a(afj3);
			if (afj5.b()) {
				zj.T();
			} else {
				afj3.e(afj5.E());
			}
		}
	}

	private boolean a(afh afh) {
		return afh == afl.S || afh == afl.cd || afh == afl.cc || afh == afl.R || afh == afl.Q || afh == afl.cW || afh == afl.cV;
	}

	public boolean dn() {
		return this.m(1);
	}

	public boolean do() {
		return this.m(2);
	}

	public boolean dp() {
		boolean boolean2 = this.dh() == 0;
		return boolean2 ? !this.m(5) : !this.m(1);
	}

	private boolean m(int integer) {
		boolean boolean3 = this.dh() == 0;

		for (int integer4 = 0; integer4 < this.bN.v_(); integer4++) {
			afj afj5 = this.bN.a(integer4);
			if (!afj5.b()) {
				if (afj5.c() == afl.S && afj5.E() >= 3 * integer
					|| afj5.c() == afl.cd && afj5.E() >= 12 * integer
					|| afj5.c() == afl.cc && afj5.E() >= 12 * integer
					|| afj5.c() == afl.cW && afj5.E() >= 12 * integer) {
					return true;
				}

				if (boolean3 && afj5.c() == afl.R && afj5.E() >= 9 * integer) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean dq() {
		for (int integer2 = 0; integer2 < this.bN.v_(); integer2++) {
			afj afj3 = this.bN.a(integer2);
			if (!afj3.b() && (afj3.c() == afl.Q || afj3.c() == afl.cd || afj3.c() == afl.cc || afj3.c() == afl.cV)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean c(int integer, afj afj) {
		if (super.c(integer, afj)) {
			return true;
		} else {
			int integer4 = integer - 300;
			if (integer4 >= 0 && integer4 < this.bN.v_()) {
				this.bN.a(integer4, afj);
				return true;
			} else {
				return false;
			}
		}
	}

	static class a implements aat.f {
		public afh a;
		public aat.g b;

		public a(afh afh, aat.g g) {
			this.a = afh;
			this.b = g;
		}

		@Override
		public void a(ajd ajd, ajf ajf, Random random) {
			int integer5 = 1;
			if (this.b != null) {
				integer5 = this.b.a(random);
			}

			ajf.add(new aje(new afj(this.a, integer5, 0), afl.bZ));
		}
	}

	static class b implements aat.f {
		public b() {
		}

		@Override
		public void a(ajd ajd, ajf ajf, Random random) {
			aii aii5 = aii.b.a(random);
			int integer6 = ot.a(random, aii5.f(), aii5.b());
			afj afj7 = afl.co.a(new ail(aii5, integer6));
			int integer8 = 2 + random.nextInt(5 + integer6 * 10) + 3 * integer6;
			if (aii5.c()) {
				integer8 *= 2;
			}

			if (integer8 > 64) {
				integer8 = 64;
			}

			ajf.add(new aje(new afj(afl.aT), new afj(afl.bZ, integer8), afj7));
		}
	}

	static class c implements aat.f {
		public afj a;
		public aat.g b;

		public c(afh afh, aat.g g) {
			this.a = new afj(afh);
			this.b = g;
		}

		@Override
		public void a(ajd ajd, ajf ajf, Random random) {
			int integer5 = 1;
			if (this.b != null) {
				integer5 = this.b.a(random);
			}

			afj afj6 = new afj(afl.bZ, integer5, 0);
			afj afj7 = aik.a(random, new afj(this.a.c(), 1, this.a.j()), 5 + random.nextInt(15), false);
			ajf.add(new aje(afj6, afj7));
		}
	}

	static class d implements aat.f {
		public afj a;
		public aat.g b;
		public afj c;
		public aat.g d;

		public d(afh afh1, aat.g g2, afh afh3, aat.g g4) {
			this.a = new afj(afh1);
			this.b = g2;
			this.c = new afj(afh3);
			this.d = g4;
		}

		@Override
		public void a(ajd ajd, ajf ajf, Random random) {
			int integer5 = this.b.a(random);
			int integer6 = this.d.a(random);
			ajf.add(new aje(new afj(this.a.c(), integer5, this.a.j()), new afj(afl.bZ), new afj(this.c.c(), integer6, this.c.j())));
		}
	}

	static class e implements aat.f {
		public afj a;
		public aat.g b;

		public e(afh afh, aat.g g) {
			this.a = new afj(afh);
			this.b = g;
		}

		public e(afj afj, aat.g g) {
			this.a = afj;
			this.b = g;
		}

		@Override
		public void a(ajd ajd, ajf ajf, Random random) {
			int integer5 = 1;
			if (this.b != null) {
				integer5 = this.b.a(random);
			}

			afj afj6;
			afj afj7;
			if (integer5 < 0) {
				afj6 = new afj(afl.bZ);
				afj7 = new afj(this.a.c(), -integer5, this.a.j());
			} else {
				afj6 = new afj(afl.bZ, integer5, 0);
				afj7 = new afj(this.a.c(), 1, this.a.j());
			}

			ajf.add(new aje(afj6, afj7));
		}
	}

	interface f {
		void a(ajd ajd, ajf ajf, Random random);
	}

	static class g extends pa<Integer, Integer> {
		public g(int integer1, int integer2) {
			super(integer1, integer2);
			if (integer2 < integer1) {
				aat.bx.warn("PriceRange({}, {}) invalid, {} smaller than {}", new Object[]{integer1, integer2, integer2, integer1});
			}
		}

		public int a(Random random) {
			return this.a() >= this.b() ? this.a() : this.a() + random.nextInt(this.b() - this.a() + 1);
		}
	}

	static class h implements aat.f {
		public aat.g a;
		public String b;
		public bbm.a c;

		public h(aat.g g, String string, bbm.a a) {
			this.a = g;
			this.b = string;
			this.c = a;
		}

		@Override
		public void a(ajd ajd, ajf ajf, Random random) {
			int integer5 = this.a.a(random);
			ajs ajs6 = ajd.t_();
			co co7 = ajs6.a(this.b, ajd.u_(), true);
			if (co7 != null) {
				afj afj8 = afp.a(ajs6, (double)co7.p(), (double)co7.r(), (byte)2, true, true);
				afp.a(ajs6, afj8);
				bbn.a(afj8, co7, "+", this.c);
				afj8.f("filled_map." + this.b.toLowerCase(Locale.ROOT));
				ajf.add(new aje(new afj(afl.bZ, integer5), new afj(afl.aY), afj8));
			}
		}
	}
}
