public class bwp extends bvq<xi> {
	private static final kq a = new kq("textures/entity/iron_golem.png");

	public bwp(bur bur) {
		super(bur, new bmu(), 0.5F);
		this.a(new bxw(this));
	}

	protected kq a(xi xi) {
		return a;
	}

	protected void a(xi xi, float float2, float float3, float float4) {
		super.a(xi, float2, float3, float4);
		if (!((double)xi.aG < 0.01)) {
			float float6 = 13.0F;
			float float7 = xi.aH - xi.aG * (1.0F - float4) + 6.0F;
			float float8 = (Math.abs(float7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
			bqg.b(6.5F * float8, 0.0F, 0.0F, 1.0F);
		}
	}
}
