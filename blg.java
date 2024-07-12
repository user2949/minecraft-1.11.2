public class blg extends blv {
	private static final int[][] a = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
	private static final int[][] b = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
	private static final int c = a.length;
	private final bni[] d = new bni[c];

	public blg() {
		float float2 = -3.5F;

		for (int integer3 = 0; integer3 < this.d.length; integer3++) {
			this.d[integer3] = new bni(this, b[integer3][0], b[integer3][1]);
			this.d[integer3].a((float)a[integer3][0] * -0.5F, 0.0F, (float)a[integer3][2] * -0.5F, a[integer3][0], a[integer3][1], a[integer3][2]);
			this.d[integer3].a(0.0F, (float)(24 - a[integer3][1]), float2);
			if (integer3 < this.d.length - 1) {
				float2 += (float)(a[integer3][2] + a[integer3 + 1][2]) * 0.5F;
			}
		}
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);

		for (bni bni12 : this.d) {
			bni12.a(float7);
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		for (int integer9 = 0; integer9 < this.d.length; integer9++) {
			this.d[integer9].g = ot.b(float3 * 0.9F + (float)integer9 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.01F * (float)(1 + Math.abs(integer9 - 2));
			this.d[integer9].c = ot.a(float3 * 0.9F + (float)integer9 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * (float)Math.abs(integer9 - 2);
		}
	}
}
