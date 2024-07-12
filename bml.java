public class bml extends bln {
	public bml() {
		this(0.0F, false);
	}

	public bml(float float1, boolean boolean2) {
		super(float1, 0.0F, 64, 32);
		if (!boolean2) {
			this.h = new bni(this, 40, 16);
			this.h.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, float1);
			this.h.a(-5.0F, 2.0F, 0.0F);
			this.i = new bni(this, 40, 16);
			this.i.i = true;
			this.i.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, float1);
			this.i.a(5.0F, 2.0F, 0.0F);
			this.j = new bni(this, 0, 16);
			this.j.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, float1);
			this.j.a(-2.0F, 12.0F, 0.0F);
			this.k = new bni(this, 0, 16);
			this.k.i = true;
			this.k.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, float1);
			this.k.a(2.0F, 12.0F, 0.0F);
		}
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4) {
		this.m = bln.a.EMPTY;
		this.l = bln.a.EMPTY;
		afj afj6 = sw.b(ri.MAIN_HAND);
		if (afj6.c() == afl.g && ((zm)sw).di()) {
			if (sw.cx() == sv.RIGHT) {
				this.m = bln.a.BOW_AND_ARROW;
			} else {
				this.l = bln.a.BOW_AND_ARROW;
			}
		}

		super.a(sw, float2, float3, float4);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		afj afj9 = ((sw)sn).cg();
		zm zm10 = (zm)sn;
		if (zm10.di() && (afj9.b() || afj9.c() != afl.g)) {
			float float11 = ot.a(this.o * (float) Math.PI);
			float float12 = ot.a((1.0F - (1.0F - this.o) * (1.0F - this.o)) * (float) Math.PI);
			this.h.h = 0.0F;
			this.i.h = 0.0F;
			this.h.g = -(0.1F - float11 * 0.6F);
			this.i.g = 0.1F - float11 * 0.6F;
			this.h.f = (float) (-Math.PI / 2);
			this.i.f = (float) (-Math.PI / 2);
			this.h.f -= float11 * 1.2F - float12 * 0.4F;
			this.i.f -= float11 * 1.2F - float12 * 0.4F;
			this.h.h = this.h.h + ot.b(float3 * 0.09F) * 0.05F + 0.05F;
			this.i.h = this.i.h - (ot.b(float3 * 0.09F) * 0.05F + 0.05F);
			this.h.f = this.h.f + ot.a(float3 * 0.067F) * 0.05F;
			this.i.f = this.i.f - ot.a(float3 * 0.067F) * 0.05F;
		}
	}

	@Override
	public void a(float float1, sv sv) {
		float float4 = sv == sv.RIGHT ? 1.0F : -1.0F;
		bni bni5 = this.a(sv);
		bni5.c += float4;
		bni5.c(float1);
		bni5.c -= float4;
	}
}
