public class bvi extends bvq<zz> {
	private static final kq a = new kq("textures/entity/slime/magmacube.png");

	public bvi(bur bur) {
		super(bur, new blq(), 0.25F);
	}

	protected kq a(zz zz) {
		return a;
	}

	protected void a(zz zz, float float2) {
		int integer4 = zz.dh();
		float float5 = (zz.c + (zz.b - zz.c) * float2) / ((float)integer4 * 0.5F + 1.0F);
		float float6 = 1.0F / (float5 + 1.0F);
		bqg.b(float6 * (float)integer4, 1.0F / float6 * (float)integer4, float6 * (float)integer4);
	}
}
