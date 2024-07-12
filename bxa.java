import java.util.Random;

public class bxa implements bxp<sw> {
	private final bvl<?> a;

	public bxa(bvl<?> bvl) {
		this.a = bvl;
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		int integer10 = sw.cc();
		if (integer10 > 0) {
			sn sn11 = new abu(sw.l, sw.p, sw.q, sw.r);
			Random random12 = new Random((long)sw.O());
			beq.a();

			for (int integer13 = 0; integer13 < integer10; integer13++) {
				bqg.G();
				bni bni14 = this.a.b().a(random12);
				bng bng15 = (bng)bni14.l.get(random12.nextInt(bni14.l.size()));
				bni14.c(0.0625F);
				float float16 = random12.nextFloat();
				float float17 = random12.nextFloat();
				float float18 = random12.nextFloat();
				float float19 = (bng15.a + (bng15.d - bng15.a) * float16) / 16.0F;
				float float20 = (bng15.b + (bng15.e - bng15.b) * float17) / 16.0F;
				float float21 = (bng15.c + (bng15.f - bng15.c) * float18) / 16.0F;
				bqg.c(float19, float20, float21);
				float16 = float16 * 2.0F - 1.0F;
				float17 = float17 * 2.0F - 1.0F;
				float18 = float18 * 2.0F - 1.0F;
				float16 *= -1.0F;
				float17 *= -1.0F;
				float18 *= -1.0F;
				float float22 = ot.c(float16 * float16 + float18 * float18);
				sn11.v = (float)(Math.atan2((double)float16, (double)float18) * 180.0F / (float)Math.PI);
				sn11.w = (float)(Math.atan2((double)float17, (double)float22) * 180.0F / (float)Math.PI);
				sn11.x = sn11.v;
				sn11.y = sn11.w;
				double double23 = 0.0;
				double double25 = 0.0;
				double double27 = 0.0;
				this.a.e().a(sn11, 0.0, 0.0, 0.0, 0.0F, float4, false);
				bqg.H();
			}

			beq.b();
		}
	}

	@Override
	public boolean a() {
		return false;
	}
}
