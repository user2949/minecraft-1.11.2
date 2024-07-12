public class bxy implements bxp<yv> {
	private static final kq a = new kq("textures/entity/wither/wither_armor.png");
	private final bwt b;
	private final bmz c = new bmz(0.5F);

	public bxy(bwt bwt) {
		this.b = bwt;
	}

	public void a(yv yv, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		if (yv.di()) {
			bqg.a(!yv.aP());
			this.b.a(a);
			bqg.n(5890);
			bqg.F();
			float float10 = (float)yv.T + float4;
			float float11 = ot.b(float10 * 0.02F) * 3.0F;
			float float12 = float10 * 0.01F;
			bqg.c(float11, float12, 0.0F);
			bqg.n(5888);
			bqg.m();
			float float13 = 0.5F;
			bqg.c(0.5F, 0.5F, 0.5F, 1.0F);
			bqg.g();
			bqg.a(bqg.r.ONE, bqg.l.ONE);
			this.c.a(yv, float2, float3, float4);
			this.c.a(this.b.b());
			bes.z().o.d(true);
			this.c.a(yv, float2, float3, float5, float6, float7, float8);
			bes.z().o.d(false);
			bqg.n(5890);
			bqg.F();
			bqg.n(5888);
			bqg.f();
			bqg.l();
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
