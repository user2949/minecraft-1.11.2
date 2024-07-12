public class bwm extends bvo<acg> {
	public bwm(bur bur) {
		super(bur);
	}

	protected void a(acg acg, float float2, atl atl) {
		int integer5 = acg.k();
		if (integer5 > -1 && (float)integer5 - float2 + 1.0F < 10.0F) {
			float float6 = 1.0F - ((float)integer5 - float2 + 1.0F) / 10.0F;
			float6 = ot.a(float6, 0.0F, 1.0F);
			float6 *= float6;
			float6 *= float6;
			float float7 = 1.0F + float6 * 0.3F;
			bqg.b(float7, float7, float7);
		}

		super.a(acg, float2, atl);
		if (integer5 > -1 && integer5 / 5 % 2 == 0) {
			bra bra6 = bes.z().ab();
			bqg.z();
			bqg.g();
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.DST_ALPHA);
			bqg.c(1.0F, 1.0F, 1.0F, (1.0F - ((float)integer5 - float2 + 1.0F) / 100.0F) * 0.8F);
			bqg.G();
			bra6.a(alv.W.t(), 1.0F);
			bqg.H();
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.l();
			bqg.f();
			bqg.y();
		}
	}
}
