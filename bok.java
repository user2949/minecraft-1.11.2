public class bok extends bou {
	private final float a;

	protected bok(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.j = this.j * 0.01F + double5;
		this.k = this.k * 0.01F + double6;
		this.l = this.l * 0.01F + double7;
		this.g = this.g + (double)((this.r.nextFloat() - this.r.nextFloat()) * 0.05F);
		this.h = this.h + (double)((this.r.nextFloat() - this.r.nextFloat()) * 0.05F);
		this.i = this.i + (double)((this.r.nextFloat() - this.r.nextFloat()) * 0.05F);
		this.a = this.y;
		this.A = 1.0F;
		this.B = 1.0F;
		this.C = 1.0F;
		this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
		this.b(48);
	}

	@Override
	public void a(double double1, double double2, double double3) {
		this.a(this.l().d(double1, double2, double3));
		this.j();
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		float float10 = ((float)this.w + float3) / (float)this.x;
		this.y = this.a * (1.0F - float10 * float10 * 0.5F);
		super.a(bpy, sn, float3, float4, float5, float6, float7, float8);
	}

	@Override
	public int a(float float1) {
		float float3 = ((float)this.w + float1) / (float)this.x;
		float3 = ot.a(float3, 0.0F, 1.0F);
		int integer4 = super.a(float1);
		int integer5 = integer4 & 0xFF;
		int integer6 = integer4 >> 16 & 0xFF;
		integer5 += (int)(float3 * 15.0F * 16.0F);
		if (integer5 > 240) {
			integer5 = 240;
		}

		return integer5 | integer6 << 16;
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		if (this.w++ >= this.x) {
			this.i();
		}

		this.a(this.j, this.k, this.l);
		this.j *= 0.96F;
		this.k *= 0.96F;
		this.l *= 0.96F;
		if (this.m) {
			this.j *= 0.7F;
			this.l *= 0.7F;
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bok(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}
