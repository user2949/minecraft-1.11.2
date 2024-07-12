import javax.annotation.Nullable;

public class aan extends zm {
	public aan(ajs ajs) {
		super(ajs);
		this.a(0.7F, 2.4F);
		this.X = true;
	}

	public static void a(ph ph) {
		sx.a(ph, aan.class);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.ap;
	}

	@Override
	protected nm G() {
		return nn.hD;
	}

	@Override
	protected nm bW() {
		return nn.hF;
	}

	@Override
	protected nm bX() {
		return nn.hE;
	}

	@Override
	nm o() {
		return nn.hG;
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (ry.j() instanceof zp) {
			zp zp3 = (zp)ry.j();
			if (zp3.o() && zp3.dl()) {
				zp3.dm();
				this.a(new afj(afl.ci, 1, 1), 0.0F);
			}
		}
	}

	@Override
	protected void a(rh rh) {
		this.a(ss.MAINHAND, new afj(afl.t));
	}

	@Override
	protected void b(rh rh) {
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		sz sz4 = super.a(rh, sz);
		this.a(aad.e).a(4.0);
		this.dh();
		return sz4;
	}

	@Override
	public float bq() {
		return 2.1F;
	}

	@Override
	public boolean B(sn sn) {
		if (!super.B(sn)) {
			return false;
		} else {
			if (sn instanceof sw) {
				((sw)sn).c(new sh(si.t, 200));
			}

			return true;
		}
	}

	@Override
	protected abb a(float float1) {
		abb abb3 = super.a(float1);
		abb3.i(100);
		return abb3;
	}
}
