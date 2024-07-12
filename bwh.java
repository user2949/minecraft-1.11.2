public class bwh extends bvq<xh> {
	private static final kq a = new kq("textures/entity/squid.png");

	public bwh(bur bur) {
		super(bur, new bmq(), 0.7F);
	}

	protected kq a(xh xh) {
		return a;
	}

	protected void a(xh xh, float float2, float float3, float float4) {
		float float6 = xh.b + (xh.a - xh.b) * float4;
		float float7 = xh.bu + (xh.c - xh.bu) * float4;
		bqg.c(0.0F, 0.5F, 0.0F);
		bqg.b(180.0F - float3, 0.0F, 1.0F, 0.0F);
		bqg.b(float6, 1.0F, 0.0F, 0.0F);
		bqg.b(float7, 0.0F, 1.0F, 0.0F);
		bqg.c(0.0F, -1.2F, 0.0F);
	}

	protected float b(xh xh, float float2) {
		return xh.by + (xh.bx - xh.by) * float2;
	}
}
