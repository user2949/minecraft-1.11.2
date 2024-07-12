public class bmx extends blo {
	public bmx(float float1) {
		this(float1, 0.0F, 64, 64);
	}

	public bmx(float float1, float float2, int integer3, int integer4) {
		super(float1, float2, integer3, integer4);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		super.a(sn, float2, float3, float4, float5, float6, float7);
		aal aal9 = (aal)sn;
		if (aal9.o()) {
			this.g.a(float7);
			this.h.a(float7);
		} else {
			this.c.a(float7);
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		float float9 = ot.a(this.o * (float) Math.PI);
		float float10 = ot.a((1.0F - (1.0F - this.o) * (1.0F - this.o)) * (float) Math.PI);
		this.g.h = 0.0F;
		this.h.h = 0.0F;
		this.g.g = (float) (Math.PI / 20);
		this.h.g = (float) (-Math.PI / 20);
		if (((sw)sn).cx() == sv.RIGHT) {
			this.g.f = -1.8849558F + ot.b(float3 * 0.09F) * 0.15F;
			this.h.f = -0.0F + ot.b(float3 * 0.19F) * 0.5F;
			this.g.f += float9 * 2.2F - float10 * 0.4F;
			this.h.f += float9 * 1.2F - float10 * 0.4F;
		} else {
			this.g.f = -0.0F + ot.b(float3 * 0.19F) * 0.5F;
			this.h.f = -1.8849558F + ot.b(float3 * 0.09F) * 0.15F;
			this.g.f += float9 * 1.2F - float10 * 0.4F;
			this.h.f += float9 * 2.2F - float10 * 0.4F;
		}

		this.g.h = this.g.h + ot.b(float3 * 0.09F) * 0.05F + 0.05F;
		this.h.h = this.h.h - (ot.b(float3 * 0.09F) * 0.05F + 0.05F);
		this.g.f = this.g.f + ot.a(float3 * 0.067F) * 0.05F;
		this.h.f = this.h.f - ot.a(float3 * 0.067F) * 0.05F;
	}
}
