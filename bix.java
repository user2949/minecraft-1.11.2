public class bix extends bir {
	private float u;
	private float v;

	public bix(aay aay) {
		super(aay.bt);
		this.p = true;
	}

	@Override
	public void e() {
		if (this.j.c.h()) {
			this.j.a(new bip(this.j.h));
		}
	}

	@Override
	public void b() {
		this.n.clear();
		if (this.j.c.h()) {
			this.j.a(new bip(this.j.h));
		} else {
			super.b();
		}
	}

	@Override
	protected void b(int integer1, int integer2) {
		this.q.a(cah.a("container.crafting"), 97, 8, 4210752);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		super.a(integer1, integer2, float3);
		this.u = (float)integer1;
		this.v = (float)integer2;
	}

	@Override
	protected void a(float float1, int integer2, int integer3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(a);
		int integer5 = this.i;
		int integer6 = this.r;
		this.b(integer5, integer6, 0, 0, this.f, this.g);
		a(integer5 + 51, integer6 + 75, 30, (float)(integer5 + 51) - this.u, (float)(integer6 + 75 - 50) - this.v, this.j.h);
	}

	public static void a(int integer1, int integer2, int integer3, float float4, float float5, sw sw) {
		bqg.h();
		bqg.G();
		bqg.c((float)integer1, (float)integer2, 50.0F);
		bqg.b((float)(-integer3), (float)integer3, (float)integer3);
		bqg.b(180.0F, 0.0F, 0.0F, 1.0F);
		float float7 = sw.aN;
		float float8 = sw.v;
		float float9 = sw.w;
		float float10 = sw.aQ;
		float float11 = sw.aP;
		bqg.b(135.0F, 0.0F, 1.0F, 0.0F);
		beq.b();
		bqg.b(-135.0F, 0.0F, 1.0F, 0.0F);
		bqg.b(-((float)Math.atan((double)(float5 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
		sw.aN = (float)Math.atan((double)(float4 / 40.0F)) * 20.0F;
		sw.v = (float)Math.atan((double)(float4 / 40.0F)) * 40.0F;
		sw.w = -((float)Math.atan((double)(float5 / 40.0F))) * 20.0F;
		sw.aP = sw.v;
		sw.aQ = sw.v;
		bqg.c(0.0F, 0.0F, 0.0F);
		bur bur12 = bes.z().ac();
		bur12.a(180.0F);
		bur12.a(false);
		bur12.a(sw, 0.0, 0.0, 0.0, 0.0F, 1.0F, false);
		bur12.a(true);
		sw.aN = float7;
		sw.v = float8;
		sw.w = float9;
		sw.aQ = float10;
		sw.aP = float11;
		bqg.H();
		beq.a();
		bqg.E();
		bqg.g(cdb.r);
		bqg.z();
		bqg.g(cdb.q);
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == 0) {
			this.j.a(new bhz(this, this.j.h.E()));
		}

		if (bfm.k == 1) {
			this.j.a(new bia(this, this.j.h.E()));
		}
	}
}
