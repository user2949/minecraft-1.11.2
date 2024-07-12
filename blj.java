import java.util.Random;

public class blj extends blv {
	bni a;
	bni[] b = new bni[9];

	public blj() {
		int integer2 = -16;
		this.a = new bni(this, 0, 0);
		this.a.a(-8.0F, -8.0F, -8.0F, 16, 16, 16);
		this.a.d += 8.0F;
		Random random3 = new Random(1660L);

		for (int integer4 = 0; integer4 < this.b.length; integer4++) {
			this.b[integer4] = new bni(this, 0, 0);
			float float5 = (((float)(integer4 % 3) - (float)(integer4 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
			float float6 = ((float)(integer4 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
			int integer7 = random3.nextInt(7) + 8;
			this.b[integer4].a(-1.0F, 0.0F, -1.0F, 2, integer7, 2);
			this.b[integer4].c = float5;
			this.b[integer4].e = float6;
			this.b[integer4].d = 15.0F;
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		for (int integer9 = 0; integer9 < this.b.length; integer9++) {
			this.b[integer9].f = 0.2F * ot.a(float3 * 0.3F + (float)integer9) + 0.4F;
		}
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		bqg.G();
		bqg.c(0.0F, 0.6F, 0.0F);
		this.a.a(float7);

		for (bni bni12 : this.b) {
			bni12.a(float7);
		}

		bqg.H();
	}
}
