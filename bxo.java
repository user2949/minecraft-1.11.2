public class bxo implements bxp<xc> {
	private static final kq a = new kq("textures/entity/pig/pig_saddle.png");
	private final bvu b;
	private final blx c = new blx(0.5F);

	public bxo(bvu bvu) {
		this.b = bvu;
	}

	public void a(xc xc, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		if (xc.dh()) {
			this.b.a(a);
			this.c.a(this.b.b());
			this.c.a(xc, float2, float3, float5, float6, float7, float8);
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
