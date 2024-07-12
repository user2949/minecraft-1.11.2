import javax.annotation.Nullable;

public class aqt extends alu {
	protected static final bdt a = new bdt(0.0, 0.0, 0.0, 1.0, 0.875, 1.0);

	public aqt() {
		super(azs.p, azt.B);
		this.a(aej.b);
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return a;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sn sn) {
		sn.s *= 0.4;
		sn.u *= 0.4;
	}
}
