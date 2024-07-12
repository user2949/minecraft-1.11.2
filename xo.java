import java.util.UUID;
import javax.annotation.Nullable;

public class xo extends xm {
	private static final UUID bG = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
	private static final kk<Integer> bH = kn.a(xo.class, km.b);
	private static final kk<Integer> bI = kn.a(xo.class, km.b);
	private static final String[] bJ = new String[]{
		"textures/entity/horse/horse_white.png",
		"textures/entity/horse/horse_creamy.png",
		"textures/entity/horse/horse_chestnut.png",
		"textures/entity/horse/horse_brown.png",
		"textures/entity/horse/horse_black.png",
		"textures/entity/horse/horse_gray.png",
		"textures/entity/horse/horse_darkbrown.png"
	};
	private static final String[] bK = new String[]{"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
	private static final String[] bL = new String[]{
		null,
		"textures/entity/horse/horse_markings_white.png",
		"textures/entity/horse/horse_markings_whitefield.png",
		"textures/entity/horse/horse_markings_whitedots.png",
		"textures/entity/horse/horse_markings_blackdots.png"
	};
	private static final String[] bM = new String[]{"", "wo_", "wmo", "wdo", "bdo"};
	private String bN;
	private final String[] bO = new String[3];

	public xo(ajs ajs) {
		super(ajs);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bH, 0);
		this.Y.a(bI, xp.NONE.a());
	}

	public static void a(ph ph) {
		xm.c(ph, xo.class);
		ph.a(pf.ENTITY, new qr(xo.class, "ArmorItem"));
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Variant", this.dh());
		if (!this.bB.a(1).b()) {
			du.a("ArmorItem", this.bB.a(1).a(new du()));
		}
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.o(du.h("Variant"));
		if (du.b("ArmorItem", 10)) {
			afj afj3 = new afj(du.o("ArmorItem"));
			if (!afj3.b() && xp.b(afj3.c())) {
				this.bB.a(1, afj3);
			}
		}

		this.dy();
	}

	public void o(int integer) {
		this.Y.b(bH, integer);
		this.dM();
	}

	public int dh() {
		return this.Y.a(bH);
	}

	private void dM() {
		this.bN = null;
	}

	private void dN() {
		int integer2 = this.dh();
		int integer3 = (integer2 & 0xFF) % 7;
		int integer4 = ((integer2 & 0xFF00) >> 8) % 5;
		xp xp5 = this.dL();
		this.bO[0] = bJ[integer3];
		this.bO[1] = bL[integer4];
		this.bO[2] = xp5.d();
		this.bN = "horse/" + bK[integer3] + bM[integer4] + xp5.b();
	}

	public String dk() {
		if (this.bN == null) {
			this.dN();
		}

		return this.bN;
	}

	public String[] dl() {
		if (this.bN == null) {
			this.dN();
		}

		return this.bO;
	}

	@Override
	protected void dy() {
		super.dy();
		this.g(this.bB.a(1));
	}

	public void g(afj afj) {
		xp xp3 = xp.a(afj);
		this.Y.b(bI, xp3.a());
		this.dM();
		if (!this.l.E) {
			this.a(aad.g).b(bG);
			int integer4 = xp3.c();
			if (integer4 != 0) {
				this.a(aad.g).b(new tl(bG, "Horse armor bonus", (double)integer4, 0).a(false));
			}
		}
	}

	public xp dL() {
		return xp.a(this.Y.a(bI));
	}

	@Override
	public void a(rc rc) {
		xp xp3 = this.dL();
		super.a(rc);
		xp xp4 = this.dL();
		if (this.T > 20 && xp3 != xp4 && xp4 != xp.NONE) {
			this.a(nn.cB, 0.5F, 1.0F);
		}
	}

	@Override
	protected void a(aqu aqu) {
		super.a(aqu);
		if (this.S.nextInt(10) == 0) {
			this.a(nn.cC, aqu.a() * 0.6F, aqu.b());
		}
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a((double)this.dH());
		this.a(aad.d).a(this.dJ());
		this.a(bw).a(this.dI());
	}

	@Override
	public void A_() {
		super.A_();
		if (this.l.E && this.Y.a()) {
			this.Y.e();
			this.dM();
		}
	}

	@Override
	protected nm G() {
		super.G();
		return nn.cz;
	}

	@Override
	protected nm bX() {
		super.bX();
		return nn.cD;
	}

	@Override
	protected nm bW() {
		super.bW();
		return nn.cG;
	}

	@Override
	protected nm dj() {
		super.dj();
		return nn.cA;
	}

	@Override
	protected kq J() {
		return bcf.G;
	}

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		boolean boolean5 = !afj4.b();
		if (boolean5 && afj4.c() == afl.bU) {
			return super.a(aay, ri);
		} else {
			if (!this.l_()) {
				if (this.dp() && aay.aM()) {
					this.f(aay);
					return true;
				}

				if (this.aL()) {
					return super.a(aay, ri);
				}
			}

			if (boolean5) {
				if (this.b(aay, afj4)) {
					if (!aay.bK.d) {
						afj4.g(1);
					}

					return true;
				}

				if (afj4.a(aay, this, ri)) {
					return true;
				}

				if (!this.dp()) {
					this.dF();
					return true;
				}

				boolean boolean6 = xp.a(afj4) != xp.NONE;
				boolean boolean7 = !this.l_() && !this.dB() && afj4.c() == afl.aD;
				if (boolean6 || boolean7) {
					this.f(aay);
					return true;
				}
			}

			if (this.l_()) {
				return super.a(aay, ri);
			} else {
				this.g(aay);
				return true;
			}
		}
	}

	@Override
	public boolean a(ww ww) {
		if (ww == this) {
			return false;
		} else {
			return !(ww instanceof xn) && !(ww instanceof xo) ? false : this.dG() && ((xm)ww).dG();
		}
	}

	@Override
	public sk a(sk sk) {
		xm xm3;
		if (sk instanceof xn) {
			xm3 = new xr(this.l);
		} else {
			xo xo4 = (xo)sk;
			xm3 = new xo(this.l);
			int integer6 = this.S.nextInt(9);
			int integer5;
			if (integer6 < 4) {
				integer5 = this.dh() & 0xFF;
			} else if (integer6 < 8) {
				integer5 = xo4.dh() & 0xFF;
			} else {
				integer5 = this.S.nextInt(7);
			}

			int integer7 = this.S.nextInt(5);
			if (integer7 < 2) {
				integer5 |= this.dh() & 0xFF00;
			} else if (integer7 < 4) {
				integer5 |= xo4.dh() & 0xFF00;
			} else {
				integer5 |= this.S.nextInt(5) << 8 & 0xFF00;
			}

			((xo)xm3).o(integer5);
		}

		this.a(sk, xm3);
		return xm3;
	}

	@Override
	public boolean dK() {
		return true;
	}

	@Override
	public boolean f(afj afj) {
		return xp.b(afj.c());
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		sz = super.a(rh, sz);
		int integer4;
		if (sz instanceof xo.a) {
			integer4 = ((xo.a)sz).a;
		} else {
			integer4 = this.S.nextInt(7);
			sz = new xo.a(integer4);
		}

		this.o(integer4 | this.S.nextInt(5) << 8);
		return sz;
	}

	public static class a implements sz {
		public int a;

		public a(int integer) {
			this.a = integer;
		}
	}
}
