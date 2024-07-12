public class buz extends bvq<zv> {
	private static final kq a = new kq("textures/entity/ghast/ghast.png");
	private static final kq j = new kq("textures/entity/ghast/ghast_shooting.png");

	public buz(bur bur) {
		super(bur, new blj(), 0.5F);
	}

	protected kq a(zv zv) {
		return zv.o() ? j : a;
	}

	protected void a(zv zv, float float2) {
		float float4 = 1.0F;
		float float5 = 4.5F;
		float float6 = 4.5F;
		bqg.b(4.5F, 4.5F, 4.5F);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
	}
}
