import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class aal extends aaa {
	protected static final kk<Byte> a = kn.a(aal.class, km.a);
	private boolean b;
	private static final Predicate<sn> c = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn instanceof sw && ((sw)sn).cK();
		}
	};

	public aal(ajs ajs) {
		super(ajs);
		this.a(0.6F, 1.95F);
	}

	public static void a(ph ph) {
		sx.a(ph, aal.class);
	}

	@Override
	protected void r() {
		super.r();
		this.bq.a(0, new uf(this));
		this.bq.a(4, new ur(this, 1.0, false));
		this.bq.a(8, new vf(this, 0.6));
		this.bq.a(9, new uo(this, aay.class, 3.0F, 1.0F));
		this.bq.a(10, new uo(this, sx.class, 8.0F));
		this.br.a(1, new vv(this, true, aal.class));
		this.br.a(2, new vy(this, aay.class, true));
		this.br.a(3, new vy(this, aat.class, true));
		this.br.a(3, new vy(this, xi.class, true));
		this.br.a(4, new aal.a(this));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.d).a(0.35F);
		this.a(aad.b).a(12.0);
		this.a(aad.a).a(24.0);
		this.a(aad.e).a(5.0);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, (byte)0);
	}

	@Override
	public tb cf() {
		return tb.ILLAGER;
	}

	@Override
	protected kq J() {
		return bcf.av;
	}

	private boolean a(int integer) {
		int integer3 = this.Y.a(a);
		return (integer3 & integer) != 0;
	}

	private void a(int integer, boolean boolean2) {
		int integer4 = this.Y.a(a);
		if (boolean2) {
			integer4 |= integer;
		} else {
			integer4 &= ~integer;
		}

		this.Y.b(a, (byte)(integer4 & 0xFF));
	}

	public boolean o() {
		return this.a(1);
	}

	public void a(boolean boolean1) {
		this.a(1, boolean1);
		if (this.b(ss.MAINHAND) == afj.a) {
			this.a(ss.MAINHAND, new afj(afl.d));
		}
	}

	@Override
	public void b(du du) {
		super.b(du);
		if (this.b) {
			du.a("Johnny", true);
		}
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.b("Johnny", 99)) {
			this.b = du.p("Johnny");
		}
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		sz sz4 = super.a(rh, sz);
		this.a(rh);
		this.b(rh);
		return sz4;
	}

	@Override
	protected void a(rh rh) {
		this.a(ss.MAINHAND, new afj(afl.d));
	}

	@Override
	protected void M() {
		super.M();
		this.a(this.z() != null);
	}

	@Override
	public boolean r(sn sn) {
		if (super.r(sn)) {
			return true;
		} else {
			return sn instanceof sw && ((sw)sn).cf() == tb.ILLAGER ? this.aQ() == null && sn.aQ() == null : false;
		}
	}

	@Override
	public void c(String string) {
		super.c(string);
		if (!this.b && "Johnny".equals(string)) {
			this.b = true;
		}
	}

	@Override
	protected nm G() {
		return nn.hm;
	}

	@Override
	protected nm bX() {
		return nn.hn;
	}

	@Override
	protected nm bW() {
		return nn.ho;
	}

	static class a extends vy<sw> {
		public a(aal aal) {
			super(aal, sw.class, 0, true, true, aal.c);
		}

		@Override
		public boolean a() {
			return ((aal)this.e).b && super.a();
		}
	}
}
