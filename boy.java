public class boy extends bou {
	private final float a;
	private final double b;
	private final double L;
	private final double M;

	protected boy(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.j = double5;
		this.k = double6;
		this.l = double7;
		this.g = double2;
		this.h = double3;
		this.i = double4;
		this.b = this.g;
		this.L = this.h;
		this.M = this.i;
		float float15 = this.r.nextFloat() * 0.6F + 0.4F;
		this.y = this.r.nextFloat() * 0.2F + 0.5F;
		this.a = this.y;
		this.A = float15 * 0.9F;
		this.B = float15 * 0.3F;
		this.C = float15;
		this.x = (int)(Math.random() * 10.0) + 40;
		this.b((int)(Math.random() * 8.0));
	}

	@Override
	public void a(double double1, double double2, double double3) {
		this.a(this.l().d(double1, double2, double3));
		this.j();
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		float float10 = ((float)this.w + float3) / (float)this.x;
		float10 = 1.0F - float10;
		float10 *= float10;
		float10 = 1.0F - float10;
		this.y = this.a * float10;
		super.a(bpy, sn, float3, float4, float5, float6, float7, float8);
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
		float var3 = -float2 + float2 * float2 * 2.0F;
		float var4 = 1.0F - var3;
		this.g = this.b + this.j * (double)var4;
		this.h = this.L + this.k * (double)var4 + (double)(1.0F - float2);
		this.i = this.M + this.l * (double)var4;
		if (this.w++ >= this.x) {
			this.i();
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new boy(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}
