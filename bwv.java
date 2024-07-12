public class bwv extends bus<abv> {
	private static final kq a = new kq("textures/entity/wither/wither_invulnerable.png");
	private static final kq f = new kq("textures/entity/wither/wither.png");
	private final bmk g = new bmk();

	public bwv(bur bur) {
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

	public void a(abv abv, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		bqg.r();
		float float11 = this.a(abv.x, abv.v, float6);
		float float12 = abv.y + (abv.w - abv.y) * float6;
		bqg.c((float)double2, (float)double3, (float)double4);
		float float13 = 0.0625F;
		bqg.D();
		bqg.b(-1.0F, -1.0F, 1.0F);
		bqg.e();
		this.d(abv);
		if (this.e) {
			bqg.h();
			bqg.e(this.c(abv));
		}

		this.g.a(abv, 0.0F, 0.0F, 0.0F, float11, float12, 0.0625F);
		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.H();
		super.a(abv, double2, double3, double4, float5, float6);
	}

	protected kq a(abv abv) {
		return abv.n() ? a : f;
	}
}
