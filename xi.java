import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class xi extends wz {
	protected static final kk<Byte> a = kn.a(xi.class, km.a);
	private int c;
	@Nullable
	wp b;
	private int bw;
	private int bx;

	public xi(ajs ajs) {
		super(ajs);
		this.a(1.4F, 2.7F);
	}

	@Override
	protected void r() {
		this.bq.a(1, new ur(this, 1.0, true));
		this.bq.a(2, new uw(this, 0.9, 32.0F));
		this.bq.a(3, new ut(this, 0.6, true));
		this.bq.a(4, new uv(this, 1.0));
		this.bq.a(5, new uz(this));
		this.bq.a(6, new vr(this, 0.6));
		this.bq.a(7, new uo(this, aay.class, 6.0F));
		this.bq.a(8, new ve(this));
		this.br.a(1, new vu(this));
		this.br.a(2, new vv(this, false));
		this.br.a(3, new vy(this, sx.class, 10, false, true, new Predicate<sx>() {
			public boolean apply(@Nullable sx sx) {
				return sx != null && zt.e.apply(sx) && !(sx instanceof zp);
			}
		}));
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, (byte)0);
	}

	@Override
	protected void M() {
		if (--this.c <= 0) {
			this.c = 70 + this.S.nextInt(50);
			this.b = this.l.ai().a(new co(this), 32);
			if (this.b == null) {
				this.de();
			} else {
				co co2 = this.b.a();
				this.a(co2, (int)((float)this.b.b() * 0.6F));
			}
		}

		super.M();
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(100.0);
		this.a(aad.d).a(0.25);
		this.a(aad.c).a(1.0);
	}

	@Override
	protected int d(int integer) {
		return integer;
	}

	@Override
	protected void C(sn sn) {
		if (sn instanceof zt && !(sn instanceof zp) && this.bJ().nextInt(20) == 0) {
			this.d((sw)sn);
		}

		super.C(sn);
	}

	@Override
	public void n() {
		super.n();
		if (this.bw > 0) {
			this.bw--;
		}

		if (this.bx > 0) {
			this.bx--;
		}

		if (this.s * this.s + this.u * this.u > 2.5000003E-7F && this.S.nextInt(5) == 0) {
			int integer2 = ot.c(this.p);
			int integer3 = ot.c(this.q - 0.2F);
			int integer4 = ot.c(this.r);
			atl atl5 = this.l.o(new co(integer2, integer3, integer4));
			if (atl5.a() != azs.a) {
				this.l
					.a(
						de.BLOCK_CRACK,
						this.p + ((double)this.S.nextFloat() - 0.5) * (double)this.G,
						this.bo().b + 0.1,
						this.r + ((double)this.S.nextFloat() - 0.5) * (double)this.G,
						4.0 * ((double)this.S.nextFloat() - 0.5),
						0.5,
						((double)this.S.nextFloat() - 0.5) * 4.0,
						alu.j(atl5)
					);
			}
		}
	}

	@Override
	public boolean d(Class<? extends sw> class1) {
		if (this.dj() && aay.class.isAssignableFrom(class1)) {
			return false;
		} else {
			return class1 == zp.class ? false : super.d(class1);
		}
	}

	public static void a(ph ph) {
		sx.a(ph, xi.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("PlayerCreated", this.dj());
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.p(du.p("PlayerCreated"));
	}

	@Override
	public boolean B(sn sn) {
		this.bw = 10;
		this.l.a(this, (byte)4);
		boolean boolean3 = sn.a(ry.a((sw)this), (float)(7 + this.S.nextInt(15)));
		if (boolean3) {
			sn.t += 0.4F;
			this.a(this, sn);
		}

		this.a(nn.cW, 1.0F, 1.0F);
		return boolean3;
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 4) {
			this.bw = 10;
			this.a(nn.cW, 1.0F, 1.0F);
		} else if (byte1 == 11) {
			this.bx = 400;
		} else if (byte1 == 34) {
			this.bx = 0;
		} else {
			super.a(byte1);
		}
	}

	public wp o() {
		return this.b;
	}

	public int dh() {
		return this.bw;
	}

	public void a(boolean boolean1) {
		if (boolean1) {
			this.bx = 400;
			this.l.a(this, (byte)11);
		} else {
			this.bx = 0;
			this.l.a(this, (byte)34);
		}
	}

	@Override
	protected nm bW() {
		return nn.cY;
	}

	@Override
	protected nm bX() {
		return nn.cX;
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(nn.cZ, 1.0F, 1.0F);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.A;
	}

	public int di() {
		return this.bx;
	}

	public boolean dj() {
		return (this.Y.a(a) & 1) != 0;
	}

	public void p(boolean boolean1) {
		byte byte3 = this.Y.a(a);
		if (boolean1) {
			this.Y.b(a, (byte)(byte3 | 1));
		} else {
			this.Y.b(a, (byte)(byte3 & -2));
		}
	}

	@Override
	public void a(ry ry) {
		if (!this.dj() && this.aS != null && this.b != null) {
			this.b.a(this.aS.h_(), -5);
		}

		super.a(ry);
	}
}
