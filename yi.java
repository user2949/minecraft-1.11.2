import javax.annotation.Nullable;

public class yi extends yd {
	private bdw b;

	public yi(yb yb) {
		super(yb);
	}

	@Override
	public void c() {
		if (this.b == null) {
			this.b = new bdw(this.a.p, this.a.q, this.a.r);
		}
	}

	@Override
	public boolean a() {
		return true;
	}

	@Override
	public void d() {
		this.b = null;
	}

	@Override
	public float f() {
		return 1.0F;
	}

	@Nullable
	@Override
	public bdw g() {
		return this.b;
	}

	@Override
	public yr<yi> i() {
		return yr.k;
	}
}
