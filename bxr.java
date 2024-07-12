public class bxr implements bxp<aah> {
	private final bwd a;
	private final blv b = new bmn(0);

	public bxr(bwd bwd) {
		this.a = bwd;
	}

	public void a(aah aah, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		if (!aah.aP()) {
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.B();
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
			this.b.a(this.a.b());
			this.b.a(aah, float2, float3, float5, float6, float7, float8);
			bqg.l();
			bqg.C();
		}
	}

	@Override
	public boolean a() {
		return true;
	}
}
