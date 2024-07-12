public class bnb extends bln {
	public bnb() {
		this(0.0F, false);
	}

	public bnb(float float1, boolean boolean2) {
		super(float1, 0.0F, 64, boolean2 ? 32 : 64);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		boolean boolean9 = sn instanceof aao && ((aao)sn).dm();
		float float10 = ot.a(this.o * (float) Math.PI);
		float float11 = ot.a((1.0F - (1.0F - this.o) * (1.0F - this.o)) * (float) Math.PI);
		this.h.h = 0.0F;
		this.i.h = 0.0F;
		this.h.g = -(0.1F - float10 * 0.6F);
		this.i.g = 0.1F - float10 * 0.6F;
		float float12 = (float) -Math.PI / (boolean9 ? 1.5F : 2.25F);
		this.h.f = float12;
		this.i.f = float12;
		this.h.f += float10 * 1.2F - float11 * 0.4F;
		this.i.f += float10 * 1.2F - float11 * 0.4F;
		this.h.h = this.h.h + ot.b(float3 * 0.09F) * 0.05F + 0.05F;
		this.i.h = this.i.h - (ot.b(float3 * 0.09F) * 0.05F + 0.05F);
		this.h.f = this.h.f + ot.a(float3 * 0.067F) * 0.05F;
		this.i.f = this.i.f - ot.a(float3 * 0.067F) * 0.05F;
	}
}
