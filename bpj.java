import javax.annotation.Nullable;

public class bpj extends bou {
	private final atl a;
	private co b;

	protected bpj(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7, atl atl) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.a = atl;
		this.a(bes.z().ab().a().a(atl));
		this.z = atl.v().w;
		this.A = 0.6F;
		this.B = 0.6F;
		this.C = 0.6F;
		this.y /= 2.0F;
	}

	public bpj a(co co) {
		this.b = co;
		if (this.a.v() == alv.c) {
			return this;
		} else {
			this.b(co);
			return this;
		}
	}

	public bpj m() {
		this.b = new co(this.g, this.h, this.i);
		alu alu2 = this.a.v();
		if (alu2 == alv.c) {
			return this;
		} else {
			this.b(this.b);
			return this;
		}
	}

	protected void b(@Nullable co co) {
		int integer3 = bes.z().ak().a(this.a, this.c, co, 0);
		this.A *= (float)(integer3 >> 16 & 0xFF) / 255.0F;
		this.B *= (float)(integer3 >> 8 & 0xFF) / 255.0F;
		this.C *= (float)(integer3 & 0xFF) / 255.0F;
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

	@Override
	public int a(float float1) {
		int integer3 = super.a(float1);
		int integer4 = 0;
		if (this.c.e(this.b)) {
			integer4 = this.c.b(this.b, 0);
		}

		return integer3 == 0 ? integer4 : integer3;
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bpj(ajs, double3, double4, double5, double6, double7, double8, alu.c(arr[0])).m();
		}
	}
}
