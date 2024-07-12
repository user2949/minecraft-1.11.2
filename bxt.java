public class bxt<T extends aai> implements bxp<T> {
	private static final kq a = new kq("textures/entity/spider_eyes.png");
	private final bwg<T> b;

	public bxt(bwg<T> bwg) {
		this.b = bwg;
	}

	public void a(T aai, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		this.b.a(a);
		bqg.m();
		bqg.d();
		bqg.a(bqg.r.ONE, bqg.l.ONE);
		if (aai.aP()) {
			bqg.a(false);
		} else {
			bqg.a(true);
		}

		int integer10 = 61680;
		int integer11 = integer10 % 65536;
		int integer12 = integer10 / 65536;
		cdb.a(cdb.r, (float)integer11, (float)integer12);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bes.z().o.d(true);
		this.b.b().a(aai, float2, float3, float5, float6, float7, float8);
		bes.z().o.d(false);
		integer10 = aai.d(float4);
		integer11 = integer10 % 65536;
		integer12 = integer10 / 65536;
		cdb.a(cdb.r, (float)integer11, (float)integer12);
		this.b.a(aai, float4);
		bqg.l();
		bqg.e();
	}

	@Override
	public boolean a() {
		return false;
	}
}
