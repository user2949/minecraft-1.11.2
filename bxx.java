public class bxx implements bxp<aam> {
	private final bws a;

	public bxx(bws bws) {
		this.a = bws;
	}

	public void a(aam aam, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		afj afj10 = aam.cg();
		if (!afj10.b()) {
			bqg.d(1.0F, 1.0F, 1.0F);
			bqg.G();
			if (this.a.h().q) {
				bqg.c(0.0F, 0.625F, 0.0F);
				bqg.b(-20.0F, -1.0F, 0.0F, 0.0F);
				float float11 = 0.5F;
				bqg.b(0.5F, 0.5F, 0.5F);
			}

			this.a.h().f.c(0.0625F);
			bqg.c(-0.0625F, 0.53125F, 0.21875F);
			afh afh11 = afj10.c();
			bes bes12 = bes.z();
			if (alu.a(afh11).t().j() == aqf.ENTITYBLOCK_ANIMATED) {
				bqg.c(0.0F, 0.0625F, -0.25F);
				bqg.b(30.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(-5.0F, 0.0F, 1.0F, 0.0F);
				float float13 = 0.375F;
				bqg.b(0.375F, -0.375F, 0.375F);
			} else if (afh11 == afl.g) {
				bqg.c(0.0F, 0.125F, -0.125F);
				bqg.b(-45.0F, 0.0F, 1.0F, 0.0F);
				float float13 = 0.625F;
				bqg.b(0.625F, -0.625F, 0.625F);
				bqg.b(-100.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(-20.0F, 0.0F, 1.0F, 0.0F);
			} else if (afh11.C_()) {
				if (afh11.E_()) {
					bqg.b(180.0F, 0.0F, 0.0F, 1.0F);
					bqg.c(0.0F, -0.0625F, 0.0F);
				}

				this.a.M_();
				bqg.c(0.0625F, -0.125F, 0.0F);
				float float13 = 0.625F;
				bqg.b(0.625F, -0.625F, 0.625F);
				bqg.b(0.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(0.0F, 0.0F, 1.0F, 0.0F);
			} else {
				bqg.c(0.1875F, 0.1875F, 0.0F);
				float float13 = 0.875F;
				bqg.b(0.875F, 0.875F, 0.875F);
				bqg.b(-20.0F, 0.0F, 0.0F, 1.0F);
				bqg.b(-60.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(-30.0F, 0.0F, 0.0F, 1.0F);
			}

			bqg.b(-15.0F, 1.0F, 0.0F, 0.0F);
			bqg.b(40.0F, 0.0F, 0.0F, 1.0F);
			bes12.ae().a(aam, afj10, brq.b.THIRD_PERSON_RIGHT_HAND);
			bqg.H();
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
