public class buo extends bvq<yb> {
	public static final kq a = new kq("textures/entity/endercrystal/endercrystal_beam.png");
	private static final kq j = new kq("textures/entity/enderdragon/dragon_exploding.png");
	private static final kq k = new kq("textures/entity/enderdragon/dragon.png");

	public buo(bur bur) {
		super(bur, new bnd(0.0F), 0.5F);
		this.a(new bxi(this));
		this.a(new bxh());
	}

	protected void a(yb yb, float float2, float float3, float float4) {
		float float6 = (float)yb.a(7, float4)[0];
		float float7 = (float)(yb.a(5, float4)[1] - yb.a(10, float4)[1]);
		bqg.b(-float6, 0.0F, 1.0F, 0.0F);
		bqg.b(float7 * 10.0F, 1.0F, 0.0F, 0.0F);
		bqg.c(0.0F, 0.0F, 1.0F);
		if (yb.aB > 0) {
			float float8 = ((float)yb.aB + float4 - 1.0F) / 20.0F * 1.6F;
			float8 = ot.c(float8);
			if (float8 > 1.0F) {
				float8 = 1.0F;
			}

			bqg.b(float8 * this.b(yb), 0.0F, 0.0F, 1.0F);
		}
	}

	protected void a(yb yb, float float2, float float3, float float4, float float5, float float6, float float7) {
		if (yb.bG > 0) {
			float float9 = (float)yb.bG / 200.0F;
			bqg.c(515);
			bqg.e();
			bqg.a(516, float9);
			this.a(j);
			this.f.a(yb, float2, float3, float4, float5, float6, float7);
			bqg.a(516, 0.1F);
			bqg.c(514);
		}

		this.d(yb);
		this.f.a(yb, float2, float3, float4, float5, float6, float7);
		if (yb.ay > 0) {
			bqg.c(514);
			bqg.z();
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
			bqg.c(1.0F, 0.0F, 0.0F, 0.5F);
			this.f.a(yb, float2, float3, float4, float5, float6, float7);
			bqg.y();
			bqg.l();
			bqg.c(515);
		}
	}

	public void a(yb yb, double double2, double double3, double double4, float float5, float float6) {
		super.a(yb, double2, double3, double4, float5, float6);
		if (yb.bH != null) {
			this.a(a);
			float float11 = ot.a(((float)yb.bH.T + float6) * 0.2F) / 2.0F + 0.5F;
			float11 = (float11 * float11 + float11) * 0.2F;
			a(
				double2,
				double3,
				double4,
				float6,
				yb.p + (yb.m - yb.p) * (double)(1.0F - float6),
				yb.q + (yb.n - yb.q) * (double)(1.0F - float6),
				yb.r + (yb.o - yb.r) * (double)(1.0F - float6),
				yb.T,
				yb.bH.p,
				(double)float11 + yb.bH.q,
				yb.bH.r
			);
		}
	}

	public static void a(
		double double1,
		double double2,
		double double3,
		float float4,
		double double5,
		double double6,
		double double7,
		int integer,
		double double9,
		double double10,
		double double11
	) {
		float float21 = (float)(double9 - double5);
		float float22 = (float)(double10 - 1.0 - double6);
		float float23 = (float)(double11 - double7);
		float float24 = ot.c(float21 * float21 + float23 * float23);
		float float25 = ot.c(float21 * float21 + float22 * float22 + float23 * float23);
		bqg.G();
		bqg.c((float)double1, (float)double2 + 2.0F, (float)double3);
		bqg.b((float)(-Math.atan2((double)float23, (double)float21)) * (180.0F / (float)Math.PI) - 90.0F, 0.0F, 1.0F, 0.0F);
		bqg.b((float)(-Math.atan2((double)float24, (double)float22)) * (180.0F / (float)Math.PI) - 90.0F, 1.0F, 0.0F, 0.0F);
		bqs bqs26 = bqs.a();
		bpy bpy27 = bqs26.c();
		beq.a();
		bqg.r();
		bqg.j(7425);
		float float28 = 0.0F - ((float)integer + float4) * 0.01F;
		float float29 = ot.c(float21 * float21 + float22 * float22 + float23 * float23) / 32.0F - ((float)integer + float4) * 0.01F;
		bpy27.a(5, bzh.i);
		int integer30 = 8;

		for (int integer31 = 0; integer31 <= 8; integer31++) {
			float float32 = ot.a((float)(integer31 % 8) * (float) (Math.PI * 2) / 8.0F) * 0.75F;
			float float33 = ot.b((float)(integer31 % 8) * (float) (Math.PI * 2) / 8.0F) * 0.75F;
			float float34 = (float)(integer31 % 8) / 8.0F;
			bpy27.b((double)(float32 * 0.2F), (double)(float33 * 0.2F), 0.0).a((double)float34, (double)float28).b(0, 0, 0, 255).d();
			bpy27.b((double)float32, (double)float33, (double)float25).a((double)float34, (double)float29).b(255, 255, 255, 255).d();
		}

		bqs26.b();
		bqg.q();
		bqg.j(7424);
		beq.b();
		bqg.H();
	}

	protected kq a(yb yb) {
		return k;
	}
}
