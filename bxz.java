public class bxz implements bxp<xk> {
	private static final kq a = new kq("textures/entity/wolf/wolf_collar.png");
	private final bww b;

	public bxz(bww bww) {
		this.b = bww;
	}

	public void a(xk xk, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		if (xk.dh() && !xk.aP()) {
			this.b.a(a);
			float[] arr10 = xf.a(xk.ds());
			bqg.d(arr10[0], arr10[1], arr10[2]);
			this.b.b().a(xk, float2, float3, float5, float6, float7, float8);
		}
	}

	@Override
	public boolean a() {
		return true;
	}
}
