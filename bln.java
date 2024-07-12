public class bln extends blv {
	public bni e;
	public bni f;
	public bni g;
	public bni h;
	public bni i;
	public bni j;
	public bni k;
	public bln.a l = bln.a.EMPTY;
	public bln.a m = bln.a.EMPTY;
	public boolean n;

	public bln() {
		this(0.0F);
	}

	public bln(float float1) {
		this(float1, 0.0F, 64, 32);
	}

	public bln(float float1, float float2, int integer3, int integer4) {
		this.s = integer3;
		this.t = integer4;
		this.e = new bni(this, 0, 0);
		this.e.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, float1);
		this.e.a(0.0F, 0.0F + float2, 0.0F);
		this.f = new bni(this, 32, 0);
		this.f.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, float1 + 0.5F);
		this.f.a(0.0F, 0.0F + float2, 0.0F);
		this.g = new bni(this, 16, 16);
		this.g.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, float1);
		this.g.a(0.0F, 0.0F + float2, 0.0F);
		this.h = new bni(this, 40, 16);
		this.h.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, float1);
		this.h.a(-5.0F, 2.0F + float2, 0.0F);
		this.i = new bni(this, 40, 16);
		this.i.i = true;
		this.i.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, float1);
		this.i.a(5.0F, 2.0F + float2, 0.0F);
		this.j = new bni(this, 0, 16);
		this.j.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, float1);
		this.j.a(-1.9F, 12.0F + float2, 0.0F);
		this.k = new bni(this, 0, 16);
		this.k.i = true;
		this.k.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, float1);
		this.k.a(1.9F, 12.0F + float2, 0.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		bqg.G();
		if (this.q) {
			float float9 = 2.0F;
			bqg.b(0.75F, 0.75F, 0.75F);
			bqg.c(0.0F, 16.0F * float7, 0.0F);
			this.e.a(float7);
			bqg.H();
			bqg.G();
			bqg.b(0.5F, 0.5F, 0.5F);
			bqg.c(0.0F, 24.0F * float7, 0.0F);
			this.g.a(float7);
			this.h.a(float7);
			this.i.a(float7);
			this.j.a(float7);
			this.k.a(float7);
			this.f.a(float7);
		} else {
			if (sn.aM()) {
				bqg.c(0.0F, 0.2F, 0.0F);
			}

			this.e.a(float7);
			this.g.a(float7);
			this.h.a(float7);
			this.i.a(float7);
			this.j.a(float7);
			this.k.a(float7);
			this.f.a(float7);
		}

		bqg.H();
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		boolean boolean9 = sn instanceof sw && ((sw)sn).cI() > 4;
		this.e.g = float4 * (float) (Math.PI / 180.0);
		if (boolean9) {
			this.e.f = (float) (-Math.PI / 4);
		} else {
			this.e.f = float5 * (float) (Math.PI / 180.0);
		}

		this.g.g = 0.0F;
		this.h.e = 0.0F;
		this.h.c = -5.0F;
		this.i.e = 0.0F;
		this.i.c = 5.0F;
		float float10 = 1.0F;
		if (boolean9) {
			float10 = (float)(sn.s * sn.s + sn.t * sn.t + sn.u * sn.u);
			float10 /= 0.2F;
			float10 *= float10 * float10;
		}

		if (float10 < 1.0F) {
			float10 = 1.0F;
		}

		this.h.f = ot.b(float1 * 0.6662F + (float) Math.PI) * 2.0F * float2 * 0.5F / float10;
		this.i.f = ot.b(float1 * 0.6662F) * 2.0F * float2 * 0.5F / float10;
		this.h.h = 0.0F;
		this.i.h = 0.0F;
		this.j.f = ot.b(float1 * 0.6662F) * 1.4F * float2 / float10;
		this.k.f = ot.b(float1 * 0.6662F + (float) Math.PI) * 1.4F * float2 / float10;
		this.j.g = 0.0F;
		this.k.g = 0.0F;
		this.j.h = 0.0F;
		this.k.h = 0.0F;
		if (this.p) {
			this.h.f += (float) (-Math.PI / 5);
			this.i.f += (float) (-Math.PI / 5);
			this.j.f = -1.4137167F;
			this.j.g = (float) (Math.PI / 10);
			this.j.h = 0.07853982F;
			this.k.f = -1.4137167F;
			this.k.g = (float) (-Math.PI / 10);
			this.k.h = -0.07853982F;
		}

		this.h.g = 0.0F;
		this.h.h = 0.0F;
		switch (this.l) {
			case EMPTY:
				this.i.g = 0.0F;
				break;
			case BLOCK:
				this.i.f = this.i.f * 0.5F - 0.9424779F;
				this.i.g = (float) (Math.PI / 6);
				break;
			case ITEM:
				this.i.f = this.i.f * 0.5F - (float) (Math.PI / 10);
				this.i.g = 0.0F;
		}

		switch (this.m) {
			case EMPTY:
				this.h.g = 0.0F;
				break;
			case BLOCK:
				this.h.f = this.h.f * 0.5F - 0.9424779F;
				this.h.g = (float) (-Math.PI / 6);
				break;
			case ITEM:
				this.h.f = this.h.f * 0.5F - (float) (Math.PI / 10);
				this.h.g = 0.0F;
		}

		if (this.o > 0.0F) {
			sv sv11 = this.a(sn);
			bni bni12 = this.a(sv11);
			float float13 = this.o;
			this.g.g = ot.a(ot.c(float13) * (float) (Math.PI * 2)) * 0.2F;
			if (sv11 == sv.LEFT) {
				this.g.g *= -1.0F;
			}

			this.h.e = ot.a(this.g.g) * 5.0F;
			this.h.c = -ot.b(this.g.g) * 5.0F;
			this.i.e = -ot.a(this.g.g) * 5.0F;
			this.i.c = ot.b(this.g.g) * 5.0F;
			this.h.g = this.h.g + this.g.g;
			this.i.g = this.i.g + this.g.g;
			this.i.f = this.i.f + this.g.g;
			float13 = 1.0F - this.o;
			float13 *= float13;
			float13 *= float13;
			float13 = 1.0F - float13;
			float float14 = ot.a(float13 * (float) Math.PI);
			float float15 = ot.a(this.o * (float) Math.PI) * -(this.e.f - 0.7F) * 0.75F;
			bni12.f = (float)((double)bni12.f - ((double)float14 * 1.2 + (double)float15));
			bni12.g = bni12.g + this.g.g * 2.0F;
			bni12.h = bni12.h + ot.a(this.o * (float) Math.PI) * -0.4F;
		}

		if (this.n) {
			this.g.f = 0.5F;
			this.h.f += 0.4F;
			this.i.f += 0.4F;
			this.j.e = 4.0F;
			this.k.e = 4.0F;
			this.j.d = 9.0F;
			this.k.d = 9.0F;
			this.e.d = 1.0F;
		} else {
			this.g.f = 0.0F;
			this.j.e = 0.1F;
			this.k.e = 0.1F;
			this.j.d = 12.0F;
			this.k.d = 12.0F;
			this.e.d = 0.0F;
		}

		this.h.h = this.h.h + ot.b(float3 * 0.09F) * 0.05F + 0.05F;
		this.i.h = this.i.h - (ot.b(float3 * 0.09F) * 0.05F + 0.05F);
		this.h.f = this.h.f + ot.a(float3 * 0.067F) * 0.05F;
		this.i.f = this.i.f - ot.a(float3 * 0.067F) * 0.05F;
		if (this.m == bln.a.BOW_AND_ARROW) {
			this.h.g = -0.1F + this.e.g;
			this.i.g = 0.1F + this.e.g + 0.4F;
			this.h.f = (float) (-Math.PI / 2) + this.e.f;
			this.i.f = (float) (-Math.PI / 2) + this.e.f;
		} else if (this.l == bln.a.BOW_AND_ARROW) {
			this.h.g = -0.1F + this.e.g - 0.4F;
			this.i.g = 0.1F + this.e.g;
			this.h.f = (float) (-Math.PI / 2) + this.e.f;
			this.i.f = (float) (-Math.PI / 2) + this.e.f;
		}

		a(this.e, this.f);
	}

	@Override
	public void a(blv blv) {
		super.a(blv);
		if (blv instanceof bln) {
			bln bln3 = (bln)blv;
			this.l = bln3.l;
			this.m = bln3.m;
			this.n = bln3.n;
		}
	}

	public void a(boolean boolean1) {
		this.e.j = boolean1;
		this.f.j = boolean1;
		this.g.j = boolean1;
		this.h.j = boolean1;
		this.i.j = boolean1;
		this.j.j = boolean1;
		this.k.j = boolean1;
	}

	public void a(float float1, sv sv) {
		this.a(sv).c(float1);
	}

	protected bni a(sv sv) {
		return sv == sv.LEFT ? this.i : this.h;
	}

	protected sv a(sn sn) {
		if (sn instanceof sw) {
			sw sw3 = (sw)sn;
			sv sv4 = sw3.cx();
			return sw3.av == ri.MAIN_HAND ? sv4 : sv4.a();
		} else {
			return sv.RIGHT;
		}
	}

	public static enum a {
		EMPTY,
		ITEM,
		BLOCK,
		BOW_AND_ARROW;
	}
}
