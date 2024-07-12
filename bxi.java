public class bxi implements bxp<yb> {
	private static final kq a = new kq("textures/entity/enderdragon/dragon_eyes.png");
	private final buo b;

	public bxi(buo buo) {
		this.b = buo;
	}

	public void a(yb yb, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		this.b.a(a);
		bqg.m();
		bqg.d();
		bqg.a(bqg.r.ONE, bqg.l.ONE);
		bqg.g();
		bqg.c(514);
		int integer10 = 61680;
		int integer11 = 61680;
		int integer12 = 0;
		cdb.a(cdb.r, 61680.0F, 0.0F);
		bqg.f();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bes.z().o.d(true);
		this.b.b().a(yb, float2, float3, float5, float6, float7, float8);
		bes.z().o.d(false);
		this.b.a(yb, float4);
		bqg.l();
		bqg.e();
		bqg.c(515);
	}

	@Override
	public boolean a() {
		return false;
	}
}
