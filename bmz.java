public class bmz extends blv {
	private final bni[] a;
	private final bni[] b;

	public bmz(float float1) {
		this.s = 64;
		this.t = 64;
		this.a = new bni[3];
		this.a[0] = new bni(this, 0, 16);
		this.a[0].a(-10.0F, 3.9F, -0.5F, 20, 3, 3, float1);
		this.a[1] = new bni(this).b(this.s, this.t);
		this.a[1].a(-2.0F, 6.9F, -0.5F);
		this.a[1].a(0, 22).a(0.0F, 0.0F, 0.0F, 3, 10, 3, float1);
		this.a[1].a(24, 22).a(-4.0F, 1.5F, 0.5F, 11, 2, 2, float1);
		this.a[1].a(24, 22).a(-4.0F, 4.0F, 0.5F, 11, 2, 2, float1);
		this.a[1].a(24, 22).a(-4.0F, 6.5F, 0.5F, 11, 2, 2, float1);
		this.a[2] = new bni(this, 12, 22);
		this.a[2].a(0.0F, 0.0F, 0.0F, 3, 6, 3, float1);
		this.b = new bni[3];
		this.b[0] = new bni(this, 0, 0);
		this.b[0].a(-4.0F, -4.0F, -4.0F, 8, 8, 8, float1);
		this.b[1] = new bni(this, 32, 0);
		this.b[1].a(-4.0F, -4.0F, -4.0F, 6, 6, 6, float1);
		this.b[1].c = -8.0F;
		this.b[1].d = 4.0F;
		this.b[2] = new bni(this, 32, 0);
		this.b[2].a(-4.0F, -4.0F, -4.0F, 6, 6, 6, float1);
		this.b[2].c = 10.0F;
		this.b[2].d = 4.0F;
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);

		for (bni bni12 : this.b) {
			bni12.a(float7);
		}

		for (bni bni12 : this.a) {
			bni12.a(float7);
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		float float9 = ot.b(float3 * 0.1F);
		this.a[1].f = (0.065F + 0.05F * float9) * (float) Math.PI;
		this.a[2].a(-2.0F, 6.9F + ot.b(this.a[1].f) * 10.0F, -0.5F + ot.a(this.a[1].f) * 10.0F);
		this.a[2].f = (0.265F + 0.1F * float9) * (float) Math.PI;
		this.b[0].g = float4 * (float) (Math.PI / 180.0);
		this.b[0].f = float5 * (float) (Math.PI / 180.0);
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4) {
		yv yv6 = (yv)sw;

		for (int integer7 = 1; integer7 < 3; integer7++) {
			this.b[integer7].g = (yv6.a(integer7 - 1) - sw.aN) * (float) (Math.PI / 180.0);
			this.b[integer7].f = yv6.b(integer7 - 1) * (float) (Math.PI / 180.0);
		}
	}
}
