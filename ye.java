public abstract class ye extends yd {
	public ye(yb yb) {
		super(yb);
	}

	@Override
	public boolean a() {
		return true;
	}

	@Override
	public float a(xz xz, ry ry, float float3) {
		if (ry.i() instanceof abb) {
			ry.i().i(1);
			return 0.0F;
		} else {
			return super.a(xz, ry, float3);
		}
	}
}
