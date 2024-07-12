import java.util.Random;
import javax.annotation.Nullable;

public class aai extends aaa {
	private static final kk<Byte> a = kn.a(aai.class, km.a);

	public aai(ajs ajs) {
		super(ajs);
		this.a(1.4F, 0.9F);
	}

	public static void c(ph ph) {
		sx.a(ph, aai.class);
	}

	@Override
	protected void r() {
		this.bq.a(1, new uf(this));
		this.bq.a(3, new um(this, 0.4F));
		this.bq.a(4, new aai.a(this));
		this.bq.a(5, new vr(this, 0.8));
		this.bq.a(6, new uo(this, aay.class, 8.0F));
		this.bq.a(6, new ve(this));
		this.br.a(1, new vv(this, false));
		this.br.a(2, new aai.c(this, aay.class));
		this.br.a(3, new aai.c(this, xi.class));
	}

	@Override
	public double ay() {
		return (double)(this.H * 0.5F);
	}

	@Override
	protected wf b(ajs ajs) {
		return new wh(this, ajs);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, (byte)0);
	}

	@Override
	public void A_() {
		super.A_();
		if (!this.l.E) {
			this.a(this.A);
		}
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(16.0);
		this.a(aad.d).a(0.3F);
	}

	@Override
	protected nm G() {
		return nn.gy;
	}

	@Override
	protected nm bW() {
		return nn.gA;
	}

	@Override
	protected nm bX() {
		return nn.gz;
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(nn.gB, 0.15F, 1.0F);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.s;
	}

	@Override
	public boolean m_() {
		return this.o();
	}

	@Override
	public void aS() {
	}

	@Override
	public tb cf() {
		return tb.ARTHROPOD;
	}

	@Override
	public boolean d(sh sh) {
		return sh.a() == si.s ? false : super.d(sh);
	}

	public boolean o() {
		return (this.Y.a(a) & 1) != 0;
	}

	public void a(boolean boolean1) {
		byte byte3 = this.Y.a(a);
		if (boolean1) {
			byte3 = (byte)(byte3 | 1);
		} else {
			byte3 = (byte)(byte3 & -2);
		}

		this.Y.b(a, byte3);
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		sz = super.a(rh, sz);
		if (this.l.r.nextInt(100) == 0) {
			aag aag4 = new aag(this.l);
			aag4.b(this.p, this.q, this.r, this.v, 0.0F);
			aag4.a(rh, null);
			this.l.a(aag4);
			aag4.m(this);
		}

		if (sz == null) {
			sz = new aai.b();
			if (this.l.ae() == rg.HARD && this.l.r.nextFloat() < 0.1F * rh.d()) {
				((aai.b)sz).a(this.l.r);
			}
		}

		if (sz instanceof aai.b) {
			sg sg4 = ((aai.b)sz).a;
			if (sg4 != null) {
				this.c(new sh(sg4, Integer.MAX_VALUE));
			}
		}

		return sz;
	}

	@Override
	public float bq() {
		return 0.65F;
	}

	static class a extends ur {
		public a(aai aai) {
			super(aai, 1.0, true);
		}

		@Override
		public boolean b() {
			float float2 = this.b.e(1.0F);
			if (float2 >= 0.5F && this.b.bJ().nextInt(100) == 0) {
				this.b.d(null);
				return false;
			} else {
				return super.b();
			}
		}

		@Override
		protected double a(sw sw) {
			return (double)(4.0F + sw.G);
		}
	}

	public static class b implements sz {
		public sg a;

		public void a(Random random) {
			int integer3 = random.nextInt(5);
			if (integer3 <= 1) {
				this.a = si.a;
			} else if (integer3 <= 2) {
				this.a = si.e;
			} else if (integer3 <= 3) {
				this.a = si.j;
			} else if (integer3 <= 4) {
				this.a = si.n;
			}
		}
	}

	static class c<T extends sw> extends vy<T> {
		public c(aai aai, Class<T> class2) {
			super(aai, class2, true);
		}

		@Override
		public boolean a() {
			float float2 = this.e.e(1.0F);
			return float2 >= 0.5F ? false : super.a();
		}
	}
}
