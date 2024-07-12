public class bxw implements bxp<xi> {
	private final bwp a;

	public bxw(bwp bwp) {
		this.a = bwp;
	}

	public void a(xi xi, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		if (xi.di() != 0) {
			bra bra10 = bes.z().ab();
			bqg.D();
			bqg.G();
			bqg.b(5.0F + 180.0F * ((bmu)this.a.b()).c.f / (float) Math.PI, 1.0F, 0.0F, 0.0F);
			bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
			bqg.c(-0.9375F, -0.625F, -0.9375F);
			float float11 = 0.5F;
			bqg.b(0.5F, -0.5F, 0.5F);
			int integer12 = xi.d(float4);
			int integer13 = integer12 % 65536;
			int integer14 = integer12 / 65536;
			cdb.a(cdb.r, (float)integer13, (float)integer14);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.a.a(byy.g);
			bra10.a(alv.O.t(), 1.0F);
			bqg.H();
			bqg.E();
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
