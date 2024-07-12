public class boo extends bou {
	private int a;
	private final int b = 8;

	protected boo(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
	}

	@Override
	public void a() {
		for (int integer2 = 0; integer2 < 6; integer2++) {
			double double3 = this.g + (this.r.nextDouble() - this.r.nextDouble()) * 4.0;
			double double5 = this.h + (this.r.nextDouble() - this.r.nextDouble()) * 4.0;
			double double7 = this.i + (this.r.nextDouble() - this.r.nextDouble()) * 4.0;
			this.c.a(de.EXPLOSION_LARGE, double3, double5, double7, (double)((float)this.a / (float)this.b), 0.0, 0.0);
		}

		this.a++;
		if (this.a == this.b) {
			this.i();
		}
	}

	@Override
	public int b() {
		return 1;
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new boo(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}
