import javax.annotation.Nullable;

public class zy extends aao {
	public zy(ajs ajs) {
		super(ajs);
	}

	public static void a(ph ph) {
		sx.a(ph, zy.class);
	}

	@Override
	public boolean cM() {
		return super.cM() && this.l.h(new co(this));
	}

	@Override
	protected boolean o() {
		return false;
	}

	@Override
	protected nm G() {
		return nn.cS;
	}

	@Override
	protected nm bW() {
		return nn.cU;
	}

	@Override
	protected nm bX() {
		return nn.cT;
	}

	@Override
	protected nm di() {
		return nn.cV;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.ar;
	}

	@Override
	public boolean B(sn sn) {
		boolean boolean3 = super.B(sn);
		if (boolean3 && this.cg().b() && sn instanceof sw) {
			float float4 = this.l.D(new co(this)).b();
			((sw)sn).c(new sh(si.q, 140 * (int)float4));
		}

		return boolean3;
	}

	@Override
	protected afj dj() {
		return afj.a;
	}
}
