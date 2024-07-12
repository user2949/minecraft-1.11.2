public class boa extends bou {
	protected boa(ajs ajs, double double2, double double3, double double4, afh afh) {
		this(ajs, double2, double3, double4, afh, 0);
	}

	protected boa(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7, afh afh, int integer) {
		this(ajs, double2, double3, double4, afh, integer);
		this.j *= 0.1F;
		this.k *= 0.1F;
		this.l *= 0.1F;
		this.j += double5;
		this.k += double6;
		this.l += double7;
	}

	protected boa(ajs ajs, double double2, double double3, double double4, afh afh, int integer) {
		super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
		this.a(bes.z().ad().a().a(afh, integer));
		this.A = 1.0F;
		this.B = 1.0F;
		this.C = 1.0F;
		this.z = alv.aJ.w;
		this.y /= 2.0F;
	}

	@Override
	public int b() {
		return 1;
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		float float10 = ((float)this.s + this.u / 4.0F) / 16.0F;
		float float11 = float10 + 0.015609375F;
		float float12 = ((float)this.t + this.v / 4.0F) / 16.0F;
		float float13 = float12 + 0.015609375F;
		float float14 = 0.1F * this.y;
		if (this.E != null) {
			float10 = this.E.a((double)(this.u / 4.0F * 16.0F));
			float11 = this.E.a((double)((this.u + 1.0F) / 4.0F * 16.0F));
			float12 = this.E.b((double)(this.v / 4.0F * 16.0F));
			float13 = this.E.b((double)((this.v + 1.0F) / 4.0F * 16.0F));
		}

		float float15 = (float)(this.d + (this.g - this.d) * (double)float3 - H);
		float float16 = (float)(this.e + (this.h - this.e) * (double)float3 - I);
		float float17 = (float)(this.f + (this.i - this.f) * (double)float3 - J);
		int integer18 = this.a(float3);
		int integer19 = integer18 >> 16 & 65535;
		int integer20 = integer18 & 65535;
		bpy.b((double)(float15 - float4 * float14 - float7 * float14), (double)(float16 - float5 * float14), (double)(float17 - float6 * float14 - float8 * float14))
			.a((double)float10, (double)float13)
			.a(this.A, this.B, this.C, 1.0F)
			.a(integer19, integer20)
			.d();
		bpy.b((double)(float15 - float4 * float14 + float7 * float14), (double)(float16 + float5 * float14), (double)(float17 - float6 * float14 + float8 * float14))
			.a((double)float10, (double)float12)
			.a(this.A, this.B, this.C, 1.0F)
			.a(integer19, integer20)
			.d();
		bpy.b((double)(float15 + float4 * float14 + float7 * float14), (double)(float16 + float5 * float14), (double)(float17 + float6 * float14 + float8 * float14))
			.a((double)float11, (double)float12)
			.a(this.A, this.B, this.C, 1.0F)
			.a(integer19, integer20)
			.d();
		bpy.b((double)(float15 + float4 * float14 - float7 * float14), (double)(float16 - float5 * float14), (double)(float17 + float6 * float14 - float8 * float14))
			.a((double)float11, (double)float13)
			.a(this.A, this.B, this.C, 1.0F)
			.a(integer19, integer20)
			.d();
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			int integer17 = arr.length > 1 ? arr[1] : 0;
			return new boa(ajs, double3, double4, double5, double6, double7, double8, afh.c(arr[0]), integer17);
		}
	}

	public static class b implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new boa(ajs, double3, double4, double5, afl.aU);
		}
	}

	public static class c implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new boa(ajs, double3, double4, double5, afl.aG);
		}
	}
}
