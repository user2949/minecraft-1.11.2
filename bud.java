public class bud extends bvq<wu> {
	private static final kq a = new kq("textures/entity/bat.png");

	public bud(bur bur) {
		super(bur, new bkw(), 0.25F);
	}

	protected kq a(wu wu) {
		return a;
	}

	protected void a(wu wu, float float2) {
		bqg.b(0.35F, 0.35F, 0.35F);
	}

	protected void a(wu wu, float float2, float float3, float float4) {
		if (wu.o()) {
			bqg.c(0.0F, -0.1F, 0.0F);
		} else {
			bqg.c(0.0F, ot.b(float2 * 0.3F) * 0.1F, 0.0F);
		}

		super.a(wu, float2, float3, float4);
	}
}
