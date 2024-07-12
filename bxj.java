public class bxj implements bxp<zr> {
	private static final kq a = new kq("textures/entity/enderman/enderman_eyes.png");
	private final bup b;

	public bxj(bup bup) {
		this.b = bup;
	}

	public void a(zr zr, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		this.b.a(a);
		bqg.m();
		bqg.d();
		bqg.a(bqg.r.ONE, bqg.l.ONE);
		bqg.g();
		bqg.a(!zr.aP());
		int integer10 = 61680;
		int integer11 = 61680;
		int integer12 = 0;
		cdb.a(cdb.r, 61680.0F, 0.0F);
		bqg.f();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bes.z().o.d(true);
		this.b.c().a(zr, float2, float3, float5, float6, float7, float8);
		bes.z().o.d(false);
		this.b.a(zr, float4);
		bqg.a(true);
		bqg.l();
		bqg.e();
	}

	@Override
	public boolean a() {
		return false;
	}
}
