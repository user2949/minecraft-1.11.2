public class bnz extends bou {
	protected bnz(ajs ajs, double double2, double double3, double double4, afh afh) {
		super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
		this.a(bes.z().ad().a().a(afh));
		this.A = 1.0F;
		this.B = 1.0F;
		this.C = 1.0F;
		this.j = 0.0;
		this.k = 0.0;
		this.l = 0.0;
		this.z = 0.0F;
		this.x = 80;
	}

	@Override
	public int b() {
		return 1;
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		float float10 = this.E.e();
		float float11 = this.E.f();
		float float12 = this.E.g();
		float float13 = this.E.h();
		float float14 = 0.5F;
		float float15 = (float)(this.d + (this.g - this.d) * (double)float3 - H);
		float float16 = (float)(this.e + (this.h - this.e) * (double)float3 - I);
		float float17 = (float)(this.f + (this.i - this.f) * (double)float3 - J);
		int integer18 = this.a(float3);
		int integer19 = integer18 >> 16 & 65535;
		int integer20 = integer18 & 65535;
		bpy.b((double)(float15 - float4 * 0.5F - float7 * 0.5F), (double)(float16 - float5 * 0.5F), (double)(float17 - float6 * 0.5F - float8 * 0.5F))
			.a((double)float11, (double)float13)
			.a(this.A, this.B, this.C, 1.0F)
			.a(integer19, integer20)
			.d();
		bpy.b((double)(float15 - float4 * 0.5F + float7 * 0.5F), (double)(float16 + float5 * 0.5F), (double)(float17 - float6 * 0.5F + float8 * 0.5F))
			.a((double)float11, (double)float12)
			.a(this.A, this.B, this.C, 1.0F)
			.a(integer19, integer20)
			.d();
		bpy.b((double)(float15 + float4 * 0.5F + float7 * 0.5F), (double)(float16 + float5 * 0.5F), (double)(float17 + float6 * 0.5F + float8 * 0.5F))
			.a((double)float10, (double)float12)
			.a(this.A, this.B, this.C, 1.0F)
			.a(integer19, integer20)
			.d();
		bpy.b((double)(float15 + float4 * 0.5F - float7 * 0.5F), (double)(float16 - float5 * 0.5F), (double)(float17 + float6 * 0.5F - float8 * 0.5F))
			.a((double)float10, (double)float13)
			.a(this.A, this.B, this.C, 1.0F)
			.a(integer19, integer20)
			.d();
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bnz(ajs, double3, double4, double5, afh.a(alv.cv));
		}
	}
}
