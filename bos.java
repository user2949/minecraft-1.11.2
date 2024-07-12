public class bos extends bou {
	private sw a;

	protected bos(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
		this.A = 1.0F;
		this.B = 1.0F;
		this.C = 1.0F;
		this.j = 0.0;
		this.k = 0.0;
		this.l = 0.0;
		this.z = 0.0F;
		this.x = 30;
	}

	@Override
	public int b() {
		return 3;
	}

	@Override
	public void a() {
		super.a();
		if (this.a == null) {
			zq zq2 = new zq(this.c);
			zq2.di();
			this.a = zq2;
		}
	}

	@Override
	public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		if (this.a != null) {
			bur bur10 = bes.z().ac();
			bur10.a(bou.H, bou.I, bou.J);
			float float11 = 0.42553192F;
			float float12 = ((float)this.w + float3) / (float)this.x;
			bqg.a(true);
			bqg.m();
			bqg.k();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
			float float13 = 240.0F;
			cdb.a(cdb.r, 240.0F, 240.0F);
			bqg.G();
			float float14 = 0.05F + 0.5F * ot.a(float12 * (float) Math.PI);
			bqg.c(1.0F, 1.0F, 1.0F, float14);
			bqg.c(0.0F, 1.8F, 0.0F);
			bqg.b(180.0F - sn.v, 0.0F, 1.0F, 0.0F);
			bqg.b(60.0F - 150.0F * float12 - sn.w, 1.0F, 0.0F, 0.0F);
			bqg.c(0.0F, -0.4F, -1.5F);
			bqg.b(0.42553192F, 0.42553192F, 0.42553192F);
			this.a.v = 0.0F;
			this.a.aP = 0.0F;
			this.a.x = 0.0F;
			this.a.aQ = 0.0F;
			bur10.a(this.a, 0.0, 0.0, 0.0, 0.0F, float3, false);
			bqg.H();
			bqg.k();
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bos(ajs, double3, double4, double5);
		}
	}
}
