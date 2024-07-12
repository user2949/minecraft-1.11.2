public class bxf implements bxp<bpp> {
	private final byc a;

	public bxf(byc byc) {
		this.a = byc;
	}

	public void a(bpp bpp, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		if ("deadmau5".equals(bpp.h_()) && bpp.h() && !bpp.aP()) {
			this.a.a(bpp.m());

			for (int integer10 = 0; integer10 < 2; integer10++) {
				float float11 = bpp.x + (bpp.v - bpp.x) * float4 - (bpp.aO + (bpp.aN - bpp.aO) * float4);
				float float12 = bpp.y + (bpp.w - bpp.y) * float4;
				bqg.G();
				bqg.b(float11, 0.0F, 1.0F, 0.0F);
				bqg.b(float12, 1.0F, 0.0F, 0.0F);
				bqg.c(0.375F * (float)(integer10 * 2 - 1), 0.0F, 0.0F);
				bqg.c(0.0F, -0.375F, 0.0F);
				bqg.b(-float12, 1.0F, 0.0F, 0.0F);
				bqg.b(-float11, 0.0F, 1.0F, 0.0F);
				float float13 = 1.3333334F;
				bqg.b(1.3333334F, 1.3333334F, 1.3333334F);
				this.a.h().a(0.0625F);
				bqg.H();
			}
		}
	}

	@Override
	public boolean a() {
		return true;
	}
}
