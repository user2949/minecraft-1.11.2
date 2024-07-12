public class bvz extends bus<abl> {
	private static final kq a = new kq("textures/entity/shulker/spark.png");
	private final bmg f = new bmg();

	public bvz(bur bur) {
		super(bur);
	}

	private float a(float float1, float float2, float float3) {
		float float5 = float2 - float1;

		while (float5 < -180.0F) {
			float5 += 360.0F;
		}

		while (float5 >= 180.0F) {
			float5 -= 360.0F;
		}

		return float1 + float3 * float5;
	}

	public void a(abl abl, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		float float11 = this.a(abl.x, abl.v, float6);
		float float12 = abl.y + (abl.w - abl.y) * float6;
		float float13 = (float)abl.T + float6;
		bqg.c((float)double2, (float)double3 + 0.15F, (float)double4);
		bqg.b(ot.a(float13 * 0.1F) * 180.0F, 0.0F, 1.0F, 0.0F);
		bqg.b(ot.b(float13 * 0.1F) * 180.0F, 1.0F, 0.0F, 0.0F);
		bqg.b(ot.a(float13 * 0.15F) * 360.0F, 0.0F, 0.0F, 1.0F);
		float float14 = 0.03125F;
		bqg.D();
		bqg.b(-1.0F, -1.0F, 1.0F);
		this.d(abl);
		this.f.a(abl, 0.0F, 0.0F, 0.0F, float11, float12, 0.03125F);
		bqg.m();
		bqg.c(1.0F, 1.0F, 1.0F, 0.5F);
		bqg.b(1.5F, 1.5F, 1.5F);
		this.f.a(abl, 0.0F, 0.0F, 0.0F, float11, float12, 0.03125F);
		bqg.l();
		bqg.H();
		super.a(abl, double2, double3, double4, float5, float6);
	}

	protected kq a(abl abl) {
		return a;
	}
}
