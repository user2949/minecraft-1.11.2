import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public class xf extends ww {
	private static final kk<Byte> bw = kn.a(xf.class, km.a);
	private final acs bx = new acs(new acl() {
		@Override
		public boolean a(aay aay) {
			return false;
		}
	}, 2, 1);
	private static final Map<aem, float[]> by = Maps.newEnumMap(aem.class);
	private int bA;
	private ud bB;

	public static float[] a(aem aem) {
		return (float[])by.get(aem);
	}

	public xf(ajs ajs) {
		super(ajs);
		this.a(0.9F, 1.3F);
		this.bx.a(0, new afj(afl.be));
		this.bx.a(1, new afj(afl.be));
	}

	@Override
	protected void r() {
		this.bB = new ud(this);
		this.bq.a(0, new uf(this));
		this.bq.a(1, new vb(this, 1.25));
		this.bq.a(2, new ub(this, 1.0));
		this.bq.a(3, new vo(this, 1.1, afl.R, false));
		this.bq.a(4, new uh(this, 1.1));
		this.bq.a(5, this.bB);
		this.bq.a(6, new vr(this, 1.0));
		this.bq.a(7, new uo(this, aay.class, 6.0F));
		this.bq.a(8, new ve(this));
	}

	@Override
	protected void M() {
		this.bA = this.bB.f();
		super.M();
	}

	@Override
	public void n() {
		if (this.l.E) {
			this.bA = Math.max(0, this.bA - 1);
		}

		super.n();
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(8.0);
		this.a(aad.d).a(0.23F);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bw, (byte)0);
	}

	@Nullable
	@Override
	protected kq J() {
		if (this.di()) {
			return bcf.P;
		} else {
			switch (this.dh()) {
				case WHITE:
				default:
					return bcf.Q;
				case ORANGE:
					return bcf.R;
				case MAGENTA:
					return bcf.S;
				case LIGHT_BLUE:
					return bcf.T;
				case YELLOW:
					return bcf.U;
				case LIME:
					return bcf.V;
				case PINK:
					return bcf.W;
				case GRAY:
					return bcf.X;
				case SILVER:
					return bcf.Y;
				case CYAN:
					return bcf.Z;
				case PURPLE:
					return bcf.aa;
				case BLUE:
					return bcf.ab;
				case BROWN:
					return bcf.ac;
				case GREEN:
					return bcf.ad;
				case RED:
					return bcf.ae;
				case BLACK:
					return bcf.af;
			}
		}
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 10) {
			this.bA = 40;
		} else {
			super.a(byte1);
		}
	}

	public float r(float float1) {
		if (this.bA <= 0) {
			return 0.0F;
		} else if (this.bA >= 4 && this.bA <= 36) {
			return 1.0F;
		} else {
			return this.bA < 4 ? ((float)this.bA - float1) / 4.0F : -((float)(this.bA - 40) - float1) / 4.0F;
		}
	}

	public float s(float float1) {
		if (this.bA > 4 && this.bA <= 36) {
			float float3 = ((float)(this.bA - 4) - float1) / 32.0F;
			return (float) (Math.PI / 5) + 0.21991149F * ot.a(float3 * 28.7F);
		} else {
			return this.bA > 0 ? (float) (Math.PI / 5) : this.w * (float) (Math.PI / 180.0);
		}
	}

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (afj4.c() == afl.bm && !this.di() && !this.l_()) {
			if (!this.l.E) {
				this.p(true);
				int integer5 = 1 + this.S.nextInt(3);

				for (int integer6 = 0; integer6 < integer5; integer6++) {
					zj zj7 = this.a(new afj(afh.a(alv.L), 1, this.dh().a()), 1.0F);
					zj7.t = zj7.t + (double)(this.S.nextFloat() * 0.05F);
					zj7.s = zj7.s + (double)((this.S.nextFloat() - this.S.nextFloat()) * 0.1F);
					zj7.u = zj7.u + (double)((this.S.nextFloat() - this.S.nextFloat()) * 0.1F);
				}
			}

			afj4.a(1, aay);
			this.a(nn.fu, 1.0F, 1.0F);
		}

		return super.a(aay, ri);
	}

	public static void a(ph ph) {
		sx.a(ph, xf.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Sheared", this.di());
		du.a("Color", (byte)this.dh().a());
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.p(du.p("Sheared"));
		this.b(aem.b(du.f("Color")));
	}

	@Override
	protected nm G() {
		return nn.fr;
	}

	@Override
	protected nm bW() {
		return nn.ft;
	}

	@Override
	protected nm bX() {
		return nn.fs;
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(nn.fv, 0.15F, 1.0F);
	}

	public aem dh() {
		return aem.b(this.Y.a(bw) & 15);
	}

	public void b(aem aem) {
		byte byte3 = this.Y.a(bw);
		this.Y.b(bw, (byte)(byte3 & 240 | aem.a() & 15));
	}

	public boolean di() {
		return (this.Y.a(bw) & 16) != 0;
	}

	public void p(boolean boolean1) {
		byte byte3 = this.Y.a(bw);
		if (boolean1) {
			this.Y.b(bw, (byte)(byte3 | 16));
		} else {
			this.Y.b(bw, (byte)(byte3 & -17));
		}
	}

	public static aem a(Random random) {
		int integer2 = random.nextInt(100);
		if (integer2 < 5) {
			return aem.BLACK;
		} else if (integer2 < 10) {
			return aem.GRAY;
		} else if (integer2 < 15) {
			return aem.SILVER;
		} else if (integer2 < 18) {
			return aem.BROWN;
		} else {
			return random.nextInt(500) == 0 ? aem.PINK : aem.WHITE;
		}
	}

	public xf a(sk sk) {
		xf xf3 = (xf)sk;
		xf xf4 = new xf(this.l);
		xf4.b(this.a(this, xf3));
		return xf4;
	}

	@Override
	public void A() {
		this.p(false);
		if (this.l_()) {
			this.a(60);
		}
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		sz = super.a(rh, sz);
		this.b(a(this.l.r));
		return sz;
	}

	private aem a(ww ww1, ww ww2) {
		int integer4 = ((xf)ww1).dh().b();
		int integer5 = ((xf)ww2).dh().b();
		this.bx.a(0).b(integer4);
		this.bx.a(1).b(integer5);
		afj afj6 = ahp.a().a(this.bx, ((xf)ww1).l);
		int integer7;
		if (afj6.c() == afl.be) {
			integer7 = afj6.j();
		} else {
			integer7 = this.l.r.nextBoolean() ? integer4 : integer5;
		}

		return aem.a(integer7);
	}

	@Override
	public float bq() {
		return 0.95F * this.H;
	}

	static {
		by.put(aem.WHITE, new float[]{1.0F, 1.0F, 1.0F});
		by.put(aem.ORANGE, new float[]{0.85F, 0.5F, 0.2F});
		by.put(aem.MAGENTA, new float[]{0.7F, 0.3F, 0.85F});
		by.put(aem.LIGHT_BLUE, new float[]{0.4F, 0.6F, 0.85F});
		by.put(aem.YELLOW, new float[]{0.9F, 0.9F, 0.2F});
		by.put(aem.LIME, new float[]{0.5F, 0.8F, 0.1F});
		by.put(aem.PINK, new float[]{0.95F, 0.5F, 0.65F});
		by.put(aem.GRAY, new float[]{0.3F, 0.3F, 0.3F});
		by.put(aem.SILVER, new float[]{0.6F, 0.6F, 0.6F});
		by.put(aem.CYAN, new float[]{0.3F, 0.5F, 0.6F});
		by.put(aem.PURPLE, new float[]{0.5F, 0.25F, 0.7F});
		by.put(aem.BLUE, new float[]{0.2F, 0.3F, 0.7F});
		by.put(aem.BROWN, new float[]{0.4F, 0.3F, 0.2F});
		by.put(aem.GREEN, new float[]{0.4F, 0.5F, 0.2F});
		by.put(aem.RED, new float[]{0.6F, 0.2F, 0.2F});
		by.put(aem.BLACK, new float[]{0.1F, 0.1F, 0.1F});
	}
}
