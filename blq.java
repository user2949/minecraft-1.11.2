public class blq extends blv {
	bni[] a = new bni[8];
	bni b;

	public blq() {
		for (int integer2 = 0; integer2 < this.a.length; integer2++) {
			int integer3 = 0;
			int integer4 = integer2;
			if (integer2 == 2) {
				integer3 = 24;
				integer4 = 10;
			} else if (integer2 == 3) {
				integer3 = 24;
				integer4 = 19;
			}

			this.a[integer2] = new bni(this, integer3, integer4);
			this.a[integer2].a(-4.0F, (float)(16 + integer2), -4.0F, 8, 1, 8);
		}

		this.b = new bni(this, 0, 16);
		this.b.a(-2.0F, 18.0F, -2.0F, 4, 4, 4);
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4) {
		zz zz6 = (zz)sw;
		float float7 = zz6.c + (zz6.b - zz6.c) * float4;
		if (float7 < 0.0F) {
			float7 = 0.0F;
		}

		for (int integer8 = 0; integer8 < this.a.length; integer8++) {
			this.a[integer8].d = (float)(-(4 - integer8)) * float7 * 1.7F;
		}
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.b.a(float7);

		for (bni bni12 : this.a) {
			bni12.a(float7);
		}
	}
}
