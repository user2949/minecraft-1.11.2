public class bof extends bou {
	private final float a;
	private final double b;
	private final double L;
	private final double M;

	protected bof(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.j = double5;
		this.k = double6;
		this.l = double7;
		this.b = double2;
		this.L = double3;
		this.M = double4;
		this.d = double2 + double5;
		this.e = double3 + double6;
		this.f = double4 + double7;
		this.g = this.d;
		this.h = this.e;
		this.i = this.f;
		float float15 = this.r.nextFloat() * 0.6F + 0.4F;
		this.y = this.r.nextFloat() * 0.5F + 0.2F;
		this.a = this.y;
		this.A = 0.9F * float15;
		this.B = 0.9F * float15;
		this.C = float15;
		this.x = (int)(Math.random() * 10.0) + 30;
		this.b((int)(Math.random() * 26.0 + 1.0 + 224.0));
	}

	@Override
	public void a(double double1, double double2, double double3) {
		this.a(this.l().d(double1, double2, double3));
		this.j();
	}

	@Override
	public int a(float float1) {
		int integer3 = super.a(float1);
		float float4 = (float)this.w / (float)this.x;
		float4 *= float4;
		float4 *= float4;
		int integer5 = integer3 & 0xFF;
		int integer6 = integer3 >> 16 & 0xFF;
		integer6 += (int)(float4 * 15.0F * 16.0F);
		if (integer6 > 240) {
			integer6 = 240;
		}

		return integer5 | integer6 << 16;
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		float float2 = (float)this.w / (float)this.x;
		float2 = 1.0F - float2;
		float float3 = 1.0F - float2;
		float3 *= float3;
		float3 *= float3;
		this.g = this.b + this.j * (double)float2;
		this.h = this.L + this.k * (double)float2 - (double)(float3 * 1.2F);
		this.i = this.M + this.l * (double)float2;
		if (this.w++ >= this.x) {
			this.i();
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bof(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}
