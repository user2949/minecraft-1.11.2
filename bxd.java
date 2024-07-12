public class bxd implements bxp<zp> {
	private static final kq a = new kq("textures/entity/creeper/creeper_armor.png");
	private final buj b;
	private final bld c = new bld(2.0F);

	public bxd(buj buj) {
		this.b = buj;
	}

	public void a(zp zp, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		if (zp.o()) {
			boolean boolean10 = zp.aP();
			bqg.a(!boolean10);
			this.b.a(a);
			bqg.n(5890);
			bqg.F();
			float float11 = (float)zp.T + float4;
			bqg.c(float11 * 0.01F, float11 * 0.01F, 0.0F);
			bqg.n(5888);
			bqg.m();
			float float12 = 0.5F;
			bqg.c(0.5F, 0.5F, 0.5F, 1.0F);
			bqg.g();
			bqg.a(bqg.r.ONE, bqg.l.ONE);
			this.c.a(this.b.b());
			bes.z().o.d(true);
			this.c.a(zp, float2, float3, float5, float6, float7, float8);
			bes.z().o.d(false);
			bqg.n(5890);
			bqg.F();
			bqg.n(5888);
			bqg.f();
			bqg.l();
			bqg.a(boolean10);
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
