public class bli extends blo {
	public bli(float float1) {
		super(float1, 0.0F, 64, 64);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		super.a(sn, float2, float3, float4, float5, float6, float7);
		zu zu9 = (zu)sn;
		if (zu9.o()) {
			this.g.a(float7);
			this.h.a(float7);
		} else {
			this.c.a(float7);
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		this.g.e = 0.0F;
		this.g.c = -5.0F;
		this.h.e = 0.0F;
		this.h.c = 5.0F;
		this.g.f = ot.b(float3 * 0.6662F) * 0.25F;
		this.h.f = ot.b(float3 * 0.6662F) * 0.25F;
		this.g.h = (float) (Math.PI * 3.0 / 4.0);
		this.h.h = (float) (-Math.PI * 3.0 / 4.0);
		this.g.g = 0.0F;
		this.h.g = 0.0F;
	}
}
