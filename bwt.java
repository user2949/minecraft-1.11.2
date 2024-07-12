public class bwt extends bvq<yv> {
	private static final kq a = new kq("textures/entity/wither/wither_invulnerable.png");
	private static final kq j = new kq("textures/entity/wither/wither.png");

	public bwt(bur bur) {
		super(bur, new bmz(0.0F), 1.0F);
		this.a(new bxy(this));
	}

	protected kq a(yv yv) {
		int integer3 = yv.dh();
		return integer3 > 0 && (integer3 > 80 || integer3 / 5 % 2 != 1) ? a : j;
	}

	protected void a(yv yv, float float2) {
		float float4 = 2.0F;
		int integer5 = yv.dh();
		if (integer5 > 0) {
			float4 -= ((float)integer5 - float2) / 220.0F * 0.5F;
		}

		bqg.b(float4, float4, float4);
	}
}
