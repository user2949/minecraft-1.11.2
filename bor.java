public class bor extends bou {
	private final float a;

	protected bor(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
		this.j *= 0.8F;
		this.k *= 0.8F;
		this.l *= 0.8F;
		this.k = (double)(this.r.nextFloat() * 0.4F + 0.05F);
		this.A = 1.0F;
		this.B = 1.0F;
		this.C = 1.0F;
		this.y = this.y * (this.r.nextFloat() * 2.0F + 0.2F);
		this.a = this.y;
		this.x = (int)(16.0 / (Math.random() * 0.8 + 0.2));
		this.b(49);
	}

	@Override
	public int a(float float1) {
		int integer3 = super.a(float1);
		int integer4 = 240;
		int integer5 = integer3 >> 16 & 0xFF;
		return 240 | integer5 << 16;
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		float float10 = ((float)this.w + float3) / (float)this.x;
		this.y = this.a * (1.0F - float10 * float10);
		super.a(bpy, sn, float3, float4, float5, float6, float7, float8);
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		if (this.w++ >= this.x) {
			this.i();
		}

		float float2 = (float)this.w / (float)this.x;
		if (this.r.nextFloat() > float2) {
			this.c.a(de.SMOKE_NORMAL, this.g, this.h, this.i, this.j, this.k, this.l);
		}

		this.k -= 0.03;
		this.a(this.j, this.k, this.l);
		this.j *= 0.999F;
		this.k *= 0.999F;
		this.l *= 0.999F;
		if (this.m) {
			this.j *= 0.7F;
			this.l *= 0.7F;
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bor(ajs, double3, double4, double5);
		}
	}
}
