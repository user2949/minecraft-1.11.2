public class bpm extends bou {
	protected bpm(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
		this.j *= 0.3F;
		this.k = Math.random() * 0.2F + 0.1F;
		this.l *= 0.3F;
		this.A = 1.0F;
		this.B = 1.0F;
		this.C = 1.0F;
		this.b(19);
		this.a(0.01F, 0.01F);
		this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2));
		this.z = 0.0F;
		this.j = double5;
		this.k = double6;
		this.l = double7;
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		this.k = this.k - (double)this.z;
		this.a(this.j, this.k, this.l);
		this.j *= 0.98F;
		this.k *= 0.98F;
		this.l *= 0.98F;
		int integer2 = 60 - this.x;
		float float3 = (float)integer2 * 0.001F;
		this.a(float3, float3);
		this.b(19 + integer2 % 4);
		if (this.x-- <= 0) {
			this.i();
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bpm(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}
