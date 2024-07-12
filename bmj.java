public class bmj extends blv {
	private final bni[] a;
	private final bni[] b;
	private final float[] c = new float[7];
	private static final int[][] d = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
	private static final int[][] e = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

	public bmj() {
		this.a = new bni[7];
		float float2 = -3.5F;

		for (int integer3 = 0; integer3 < this.a.length; integer3++) {
			this.a[integer3] = new bni(this, e[integer3][0], e[integer3][1]);
			this.a[integer3].a((float)d[integer3][0] * -0.5F, 0.0F, (float)d[integer3][2] * -0.5F, d[integer3][0], d[integer3][1], d[integer3][2]);
			this.a[integer3].a(0.0F, (float)(24 - d[integer3][1]), float2);
			this.c[integer3] = float2;
			if (integer3 < this.a.length - 1) {
				float2 += (float)(d[integer3][2] + d[integer3 + 1][2]) * 0.5F;
			}
		}

		this.b = new bni[3];
		this.b[0] = new bni(this, 20, 0);
		this.b[0].a(-5.0F, 0.0F, (float)d[2][2] * -0.5F, 10, 8, d[2][2]);
		this.b[0].a(0.0F, 16.0F, this.c[2]);
		this.b[1] = new bni(this, 20, 11);
		this.b[1].a(-3.0F, 0.0F, (float)d[4][2] * -0.5F, 6, 4, d[4][2]);
		this.b[1].a(0.0F, 20.0F, this.c[4]);
		this.b[2] = new bni(this, 20, 18);
		this.b[2].a(-3.0F, 0.0F, (float)d[4][2] * -0.5F, 6, 5, d[1][2]);
		this.b[2].a(0.0F, 19.0F, this.c[1]);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);

		for (bni bni12 : this.a) {
			bni12.a(float7);
		}

		for (bni bni12 : this.b) {
			bni12.a(float7);
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		for (int integer9 = 0; integer9 < this.a.length; integer9++) {
			this.a[integer9].g = ot.b(float3 * 0.9F + (float)integer9 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.05F * (float)(1 + Math.abs(integer9 - 2));
			this.a[integer9].c = ot.a(float3 * 0.9F + (float)integer9 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.2F * (float)Math.abs(integer9 - 2);
		}

		this.b[0].g = this.a[2].g;
		this.b[1].g = this.a[4].g;
		this.b[1].c = this.a[4].c;
		this.b[2].g = this.a[1].g;
		this.b[2].c = this.a[1].c;
	}
}
