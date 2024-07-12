import java.util.UUID;
import javax.annotation.Nullable;

public class aab extends aao {
	private static final UUID b = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
	private static final tl c = new tl(b, "Attacking speed boost", 0.05, 0).a(false);
	private int bw;
	private int bx;
	private UUID by;

	public aab(ajs ajs) {
		super(ajs);
		this.X = true;
	}

	@Override
	public void a(@Nullable sw sw) {
		super.a(sw);
		if (sw != null) {
			this.by = sw.be();
		}
	}

	@Override
	protected void dk() {
		this.br.a(1, new aab.b(this));
		this.br.a(2, new aab.a(this));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(a).a(0.0);
		this.a(aad.d).a(0.23F);
		this.a(aad.e).a(5.0);
	}

	@Override
	protected void M() {
		tk tk2 = this.a(aad.d);
		if (this.dl()) {
			if (!this.l_() && !tk2.a(c)) {
				tk2.b(c);
			}

			this.bw--;
		} else if (tk2.a(c)) {
			tk2.c(c);
		}

		if (this.bx > 0 && --this.bx == 0) {
			this.a(nn.ip, this.ci() * 2.0F, ((this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F) * 1.8F);
		}

		if (this.bw > 0 && this.by != null && this.bK() == null) {
			aay aay3 = this.l.b(this.by);
			this.a((sw)aay3);
			this.aS = aay3;
			this.aT = this.bL();
		}

		super.M();
	}

	@Override
	public boolean cM() {
		return this.l.ae() != rg.PEACEFUL;
	}

	@Override
	public boolean cN() {
		return this.l.a(this.bo(), this) && this.l.a(this, this.bo()).isEmpty() && !this.l.d(this.bo());
	}

	public static void a(ph ph) {
		sx.a(ph, aab.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Anger", (short)this.bw);
		if (this.by != null) {
			du.a("HurtBy", this.by.toString());
		} else {
			du.a("HurtBy", "");
		}
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.bw = du.g("Anger");
		String string3 = du.l("HurtBy");
		if (!string3.isEmpty()) {
			this.by = UUID.fromString(string3);
			aay aay4 = this.l.b(this.by);
			this.a((sw)aay4);
			if (aay4 != null) {
				this.aS = aay4;
				this.aT = this.bL();
			}
		}
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else {
			sn sn4 = ry.j();
			if (sn4 instanceof aay) {
				this.a(sn4);
			}

			return super.a(ry, float2);
		}
	}

	private void a(sn sn) {
		this.bw = 400 + this.S.nextInt(400);
		this.bx = this.S.nextInt(40);
		if (sn instanceof sw) {
			this.a((sw)sn);
		}
	}

	public boolean dl() {
		return this.bw > 0;
	}

	@Override
	protected nm G() {
		return nn.io;
	}

	@Override
	protected nm bW() {
		return nn.ir;
	}

	@Override
	protected nm bX() {
		return nn.iq;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.an;
	}

	@Override
	public boolean a(aay aay, ri ri) {
		return false;
	}

	@Override
	protected void a(rh rh) {
		this.a(ss.MAINHAND, new afj(afl.E));
	}

	@Override
	protected afj dj() {
		return afj.a;
	}

	static class a extends vy<aay> {
		public a(aab aab) {
			super(aab, aay.class, true);
		}

		@Override
		public boolean a() {
			return ((aab)this.e).dl() && super.a();
		}
	}

	static class b extends vv {
		public b(aab aab) {
			super(aab, true);
		}

		@Override
		protected void a(te te, sw sw) {
			super.a(te, sw);
			if (te instanceof aab) {
				((aab)te).a((sn)sw);
			}
		}
	}
}
