public class bwd extends bvq<aah> {
	private static final kq a = new kq("textures/entity/slime/slime.png");

	public bwd(bur bur) {
		super(bur, new bmn(16), 0.25F);
		this.a(new bxr(this));
	}

	public void a(aah aah, double double2, double double3, double double4, float float5, float float6) {
		this.c = 0.25F * (float)aah.dh();
		super.a(aah, double2, double3, double4, float5, float6);
	}

	protected void a(aah aah, float float2) {
		float float4 = 0.999F;
		bqg.b(0.999F, 0.999F, 0.999F);
		float float5 = (float)aah.dh();
		float float6 = (aah.c + (aah.b - aah.c) * float2) / (float5 * 0.5F + 1.0F);
		float float7 = 1.0F / (float6 + 1.0F);
		bqg.b(float7 * float5, 1.0F / float7 * float5, float7 * float5);
	}

	protected kq a(aah aah) {
		return a;
	}
}
