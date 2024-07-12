public class bxq implements bxp<xf> {
	private static final kq a = new kq("textures/entity/sheep/sheep_fur.png");
	private final bvy b;
	private final bmd c = new bmd();

	public bxq(bvy bvy) {
		this.b = bvy;
	}

	public void a(xf xf, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		if (!xf.di() && !xf.aP()) {
			this.b.a(a);
			if (xf.n_() && "jeb_".equals(xf.bi())) {
				int integer10 = 25;
				int integer11 = xf.T / 25 + xf.O();
				int integer12 = aem.values().length;
				int integer13 = integer11 % integer12;
				int integer14 = (integer11 + 1) % integer12;
				float float15 = ((float)(xf.T % 25) + float4) / 25.0F;
				float[] arr16 = xf.a(aem.b(integer13));
				float[] arr17 = xf.a(aem.b(integer14));
				bqg.d(arr16[0] * (1.0F - float15) + arr17[0] * float15, arr16[1] * (1.0F - float15) + arr17[1] * float15, arr16[2] * (1.0F - float15) + arr17[2] * float15);
			} else {
				float[] arr10 = xf.a(xf.dh());
				bqg.d(arr10[0], arr10[1], arr10[2]);
			}

			this.c.a(this.b.b());
			this.c.a(xf, float2, float3, float4);
			this.c.a(xf, float2, float3, float5, float6, float7, float8);
		}
	}

	@Override
	public boolean a() {
		return true;
	}
}
