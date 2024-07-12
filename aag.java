import javax.annotation.Nullable;

public class aag extends zm {
	public aag(ajs ajs) {
		super(ajs);
	}

	public static void a(ph ph) {
		sx.a(ph, aag.class);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.ao;
	}

	@Override
	protected nm G() {
		return nn.fP;
	}

	@Override
	protected nm bW() {
		return nn.fU;
	}

	@Override
	protected nm bX() {
		return nn.fQ;
	}

	@Override
	nm o() {
		return nn.fW;
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (ry.j() instanceof zp) {
			zp zp3 = (zp)ry.j();
			if (zp3.o() && zp3.dl()) {
				zp3.dm();
				this.a(new afj(afl.ci, 1, 0), 0.0F);
			}
		}
	}

	@Override
	protected abb a(float float1) {
		afj afj3 = this.b(ss.OFFHAND);
		if (afj3.c() == afl.i) {
			abo abo4 = new abo(this.l, this);
			abo4.a(this, float1);
			return abo4;
		} else {
			abb abb4 = super.a(float1);
			if (afj3.c() == afl.j && abb4 instanceof abu) {
				((abu)abb4).a(afj3);
			}

			return abb4;
		}
	}
}
