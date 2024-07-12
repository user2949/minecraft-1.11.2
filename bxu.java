public class bxu implements bxp<aaj> {
	private static final kq a = new kq("textures/entity/skeleton/stray_overlay.png");
	private final bvl<?> b;
	private final bml c = new bml(0.25F, true);

	public bxu(bvl<?> bvl) {
		this.b = bvl;
	}

	public void a(aaj aaj, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		this.c.a(this.b.b());
		this.c.a(aaj, float2, float3, float4);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.b.a(a);
		this.c.a(aaj, float2, float3, float5, float6, float7, float8);
	}

	@Override
	public boolean a() {
		return true;
	}
}
