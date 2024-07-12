public class ble extends blv {
	private final bni a;
	private final bni b = new bni(this, 22, 0);

	public ble() {
		this.b.a(-10.0F, 0.0F, 0.0F, 10, 20, 2, 1.0F);
		this.a = new bni(this, 22, 0);
		this.a.i = true;
		this.a.a(0.0F, 0.0F, 0.0F, 10, 20, 2, 1.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		bqg.E();
		bqg.r();
		if (sn instanceof sw && ((sw)sn).l_()) {
			bqg.G();
			bqg.b(0.5F, 0.5F, 0.5F);
			bqg.c(0.0F, 1.5F, -0.1F);
			this.b.a(float7);
			this.a.a(float7);
			bqg.H();
		} else {
			this.b.a(float7);
			this.a.a(float7);
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		float float9 = (float) (Math.PI / 12);
		float float10 = (float) (-Math.PI / 12);
		float float11 = 0.0F;
		float float12 = 0.0F;
		if (sn instanceof sw && ((sw)sn).cH()) {
			float float13 = 1.0F;
			if (sn.t < 0.0) {
				bdw bdw14 = new bdw(sn.s, sn.t, sn.u).a();
				float13 = 1.0F - (float)Math.pow(-bdw14.c, 1.5);
			}

			float9 = float13 * (float) (Math.PI / 9) + (1.0F - float13) * float9;
			float10 = float13 * (float) (-Math.PI / 2) + (1.0F - float13) * float10;
		} else if (sn.aM()) {
			float9 = (float) (Math.PI * 2.0 / 9.0);
			float10 = (float) (-Math.PI / 4);
			float11 = 3.0F;
			float12 = 0.08726646F;
		}

		this.b.c = 5.0F;
		this.b.d = float11;
		if (sn instanceof bpp) {
			bpp bpp13 = (bpp)sn;
			bpp13.a = (float)((double)bpp13.a + (double)(float9 - bpp13.a) * 0.1);
			bpp13.b = (float)((double)bpp13.b + (double)(float12 - bpp13.b) * 0.1);
			bpp13.c = (float)((double)bpp13.c + (double)(float10 - bpp13.c) * 0.1);
			this.b.f = bpp13.a;
			this.b.g = bpp13.b;
			this.b.h = bpp13.c;
		} else {
			this.b.f = float9;
			this.b.h = float10;
			this.b.g = float12;
		}

		this.a.c = -this.b.c;
		this.a.g = -this.b.g;
		this.a.d = this.b.d;
		this.a.f = this.b.f;
		this.a.h = -this.b.h;
	}
}
