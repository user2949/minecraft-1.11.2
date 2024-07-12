public class vs extends ur {
	private final aao h;
	private int i;

	public vs(aao aao, double double2, boolean boolean3) {
		super(aao, double2, boolean3);
		this.h = aao;
	}

	@Override
	public void c() {
		super.c();
		this.i = 0;
	}

	@Override
	public void d() {
		super.d();
		this.h.a(false);
	}

	@Override
	public void e() {
		super.e();
		this.i++;
		if (this.i >= 5 && this.c < 10) {
			this.h.a(true);
		} else {
			this.h.a(false);
		}
	}
}
