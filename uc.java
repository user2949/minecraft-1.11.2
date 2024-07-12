public abstract class uc extends ui {
	protected sx a;
	protected co b = co.a;
	protected amx c;
	boolean d;
	float e;
	float f;

	public uc(sx sx) {
		this.a = sx;
		if (!(sx.x() instanceof we)) {
			throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
		}
	}

	@Override
	public boolean a() {
		if (!this.a.A) {
			return false;
		} else {
			we we2 = (we)this.a.x();
			bbd bbd3 = we2.k();
			if (bbd3 != null && !bbd3.b() && we2.f()) {
				for (int integer4 = 0; integer4 < Math.min(bbd3.e() + 2, bbd3.d()); integer4++) {
					bbb bbb5 = bbd3.a(integer4);
					this.b = new co(bbb5.a, bbb5.b + 1, bbb5.c);
					if (!(this.a.d((double)this.b.p(), this.a.q, (double)this.b.r()) > 2.25)) {
						this.c = this.a(this.b);
						if (this.c != null) {
							return true;
						}
					}
				}

				this.b = new co(this.a).a();
				this.c = this.a(this.b);
				return this.c != null;
			} else {
				return false;
			}
		}
	}

	@Override
	public boolean b() {
		return !this.d;
	}

	@Override
	public void c() {
		this.d = false;
		this.e = (float)((double)((float)this.b.p() + 0.5F) - this.a.p);
		this.f = (float)((double)((float)this.b.r() + 0.5F) - this.a.r);
	}

	@Override
	public void e() {
		float float2 = (float)((double)((float)this.b.p() + 0.5F) - this.a.p);
		float float3 = (float)((double)((float)this.b.r() + 0.5F) - this.a.r);
		float float4 = this.e * float2 + this.f * float3;
		if (float4 < 0.0F) {
			this.d = true;
		}
	}

	private amx a(co co) {
		atl atl3 = this.a.l.o(co);
		alu alu4 = atl3.v();
		return alu4 instanceof amx && atl3.a() == azs.d ? (amx)alu4 : null;
	}
}
