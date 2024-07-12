public class bmt extends bln {
	protected bni a;
	protected bni b;

	public bmt() {
		this(0.0F);
	}

	public bmt(float float1) {
		super(float1, 0.0F, 64, 64);
		this.k.j = false;
		this.f.j = false;
		this.j = new bni(this, 32, 0);
		this.j.a(-1.0F, -1.0F, -2.0F, 6, 10, 4, 0.0F);
		this.j.a(-1.9F, 12.0F, 0.0F);
		this.b = new bni(this, 0, 32);
		this.b.a(-20.0F, 0.0F, 0.0F, 20, 12, 1);
		this.a = new bni(this, 0, 32);
		this.a.i = true;
		this.a.a(0.0F, 0.0F, 0.0F, 20, 12, 1);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		super.a(sn, float2, float3, float4, float5, float6, float7);
		this.b.a(float7);
		this.a.a(float7);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		aak aak9 = (aak)sn;
		if (aak9.dj()) {
			if (aak9.cx() == sv.RIGHT) {
				this.h.f = 3.7699115F;
			} else {
				this.i.f = 3.7699115F;
			}
		}

		this.j.f += (float) (Math.PI / 5);
		this.b.e = 2.0F;
		this.a.e = 2.0F;
		this.b.d = 1.0F;
		this.a.d = 1.0F;
		this.b.g = 0.47123894F + ot.b(float3 * 0.8F) * (float) Math.PI * 0.05F;
		this.a.g = -this.b.g;
		this.a.h = -0.47123894F;
		this.a.f = 0.47123894F;
		this.b.f = 0.47123894F;
		this.b.h = 0.47123894F;
	}

	public int a() {
		return 23;
	}
}
