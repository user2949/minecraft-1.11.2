public class bxm implements bxp<xq> {
	private static final kq[] a = new kq[]{
		new kq("textures/entity/llama/decor/decor_white.png"),
		new kq("textures/entity/llama/decor/decor_orange.png"),
		new kq("textures/entity/llama/decor/decor_magenta.png"),
		new kq("textures/entity/llama/decor/decor_light_blue.png"),
		new kq("textures/entity/llama/decor/decor_yellow.png"),
		new kq("textures/entity/llama/decor/decor_lime.png"),
		new kq("textures/entity/llama/decor/decor_pink.png"),
		new kq("textures/entity/llama/decor/decor_gray.png"),
		new kq("textures/entity/llama/decor/decor_silver.png"),
		new kq("textures/entity/llama/decor/decor_cyan.png"),
		new kq("textures/entity/llama/decor/decor_purple.png"),
		new kq("textures/entity/llama/decor/decor_blue.png"),
		new kq("textures/entity/llama/decor/decor_brown.png"),
		new kq("textures/entity/llama/decor/decor_green.png"),
		new kq("textures/entity/llama/decor/decor_red.png"),
		new kq("textures/entity/llama/decor/decor_black.png")
	};
	private final bvm b;
	private final bls c = new bls(0.5F);

	public bxm(bvm bvm) {
		this.b = bvm;
	}

	public void a(xq xq, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		if (xq.dN()) {
			this.b.a(a[xq.dO().a()]);
			this.c.a(this.b.b());
			this.c.a(xq, float2, float3, float5, float6, float7, float8);
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
