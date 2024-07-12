public class bxb implements bxp<bpp> {
	private final byc a;

	public bxb(byc byc) {
		this.a = byc;
	}

	public void a(bpp bpp, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		if (bpp.a() && !bpp.aP() && bpp.a(aaz.CAPE) && bpp.o() != null) {
			afj afj10 = bpp.b(ss.CHEST);
			if (afj10.c() != afl.cS) {
				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				this.a.a(bpp.o());
				bqg.G();
				bqg.c(0.0F, 0.0F, 0.125F);
				double double11 = bpp.bA + (bpp.bD - bpp.bA) * (double)float4 - (bpp.m + (bpp.p - bpp.m) * (double)float4);
				double double13 = bpp.bB + (bpp.bE - bpp.bB) * (double)float4 - (bpp.n + (bpp.q - bpp.n) * (double)float4);
				double double15 = bpp.bC + (bpp.bF - bpp.bC) * (double)float4 - (bpp.o + (bpp.r - bpp.o) * (double)float4);
				float float17 = bpp.aO + (bpp.aN - bpp.aO) * float4;
				double double18 = (double)ot.a(float17 * (float) (Math.PI / 180.0));
				double double20 = (double)(-ot.b(float17 * (float) (Math.PI / 180.0)));
				float float22 = (float)double13 * 10.0F;
				float22 = ot.a(float22, -6.0F, 32.0F);
				float float23 = (float)(double11 * double18 + double15 * double20) * 100.0F;
				float float24 = (float)(double11 * double20 - double15 * double18) * 100.0F;
				if (float23 < 0.0F) {
					float23 = 0.0F;
				}

				float float25 = bpp.bx + (bpp.by - bpp.bx) * float4;
				float22 += ot.a((bpp.I + (bpp.J - bpp.I) * float4) * 6.0F) * 32.0F * float25;
				if (bpp.aM()) {
					float22 += 25.0F;
				}

				bqg.b(6.0F + float23 / 2.0F + float22, 1.0F, 0.0F, 0.0F);
				bqg.b(float24 / 2.0F, 0.0F, 0.0F, 1.0F);
				bqg.b(-float24 / 2.0F, 0.0F, 1.0F, 0.0F);
				bqg.b(180.0F, 0.0F, 1.0F, 0.0F);
				this.a.h().b(0.0625F);
				bqg.H();
			}
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
