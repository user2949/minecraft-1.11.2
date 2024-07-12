public class bny extends bou {
	private static final kq a = new kq("textures/entity/sweep.png");
	private static final bzj b = new bzj().a(bzh.m).a(bzh.o).a(bzh.n).a(bzh.p).a(bzh.q).a(bzh.r);
	private int L;
	private final int M;
	private final bza N;
	private final float O;

	protected bny(bza bza, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8) {
		super(ajs, double3, double4, double5, 0.0, 0.0, 0.0);
		this.N = bza;
		this.M = 4;
		float float16 = this.r.nextFloat() * 0.6F + 0.4F;
		this.A = float16;
		this.B = float16;
		this.C = float16;
		this.O = 1.0F - (float)double6 * 0.5F;
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		int integer10 = (int)(((float)this.L + float3) * 3.0F / (float)this.M);
		if (integer10 <= 7) {
			this.N.a(a);
			float float11 = (float)(integer10 % 4) / 4.0F;
			float float12 = float11 + 0.24975F;
			float float13 = (float)(integer10 / 2) / 2.0F;
			float float14 = float13 + 0.4995F;
			float float15 = 1.0F * this.O;
			float float16 = (float)(this.d + (this.g - this.d) * (double)float3 - H);
			float float17 = (float)(this.e + (this.h - this.e) * (double)float3 - I);
			float float18 = (float)(this.f + (this.i - this.f) * (double)float3 - J);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.g();
			beq.a();
			bpy.a(7, b);
			bpy.b(
					(double)(float16 - float4 * float15 - float7 * float15),
					(double)(float17 - float5 * float15 * 0.5F),
					(double)(float18 - float6 * float15 - float8 * float15)
				)
				.a((double)float12, (double)float14)
				.a(this.A, this.B, this.C, 1.0F)
				.a(0, 240)
				.c(0.0F, 1.0F, 0.0F)
				.d();
			bpy.b(
					(double)(float16 - float4 * float15 + float7 * float15),
					(double)(float17 + float5 * float15 * 0.5F),
					(double)(float18 - float6 * float15 + float8 * float15)
				)
				.a((double)float12, (double)float13)
				.a(this.A, this.B, this.C, 1.0F)
				.a(0, 240)
				.c(0.0F, 1.0F, 0.0F)
				.d();
			bpy.b(
					(double)(float16 + float4 * float15 + float7 * float15),
					(double)(float17 + float5 * float15 * 0.5F),
					(double)(float18 + float6 * float15 + float8 * float15)
				)
				.a((double)float11, (double)float13)
				.a(this.A, this.B, this.C, 1.0F)
				.a(0, 240)
				.c(0.0F, 1.0F, 0.0F)
				.d();
			bpy.b(
					(double)(float16 + float4 * float15 - float7 * float15),
					(double)(float17 - float5 * float15 * 0.5F),
					(double)(float18 + float6 * float15 - float8 * float15)
				)
				.a((double)float11, (double)float14)
				.a(this.A, this.B, this.C, 1.0F)
				.a(0, 240)
				.c(0.0F, 1.0F, 0.0F)
				.d();
			bqs.a().b();
			bqg.f();
		}
	}

	@Override
	public int a(float float1) {
		return 61680;
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		this.L++;
		if (this.L == this.M) {
			this.i();
		}
	}

	@Override
	public int b() {
		return 3;
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bny(bes.z().N(), ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}
