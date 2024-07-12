public class bxc implements bxp<zr> {
	private final bup a;

	public bxc(bup bup) {
		this.a = bup;
	}

	public void a(zr zr, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		atl atl10 = zr.dj();
		if (atl10 != null) {
			bra bra11 = bes.z().ab();
			bqg.D();
			bqg.G();
			bqg.c(0.0F, 0.6875F, -0.75F);
			bqg.b(20.0F, 1.0F, 0.0F, 0.0F);
			bqg.b(45.0F, 0.0F, 1.0F, 0.0F);
			bqg.c(0.25F, 0.1875F, 0.25F);
			float float12 = 0.5F;
			bqg.b(-0.5F, -0.5F, 0.5F);
			int integer13 = zr.d(float4);
			int integer14 = integer13 % 65536;
			int integer15 = integer13 / 65536;
			cdb.a(cdb.r, (float)integer14, (float)integer15);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.a.a(byy.g);
			bra11.a(atl10, 1.0F);
			bqg.H();
			bqg.E();
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
