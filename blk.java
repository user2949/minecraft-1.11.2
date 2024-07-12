public class blk extends blv {
	private final bni a;
	private final bni b;
	private final bni[] c;
	private final bni[] d;

	public blk() {
		this.s = 64;
		this.t = 64;
		this.c = new bni[12];
		this.a = new bni(this);
		this.a.a(0, 0).a(-6.0F, 10.0F, -8.0F, 12, 12, 16);
		this.a.a(0, 28).a(-8.0F, 10.0F, -6.0F, 2, 12, 12);
		this.a.a(0, 28).a(6.0F, 10.0F, -6.0F, 2, 12, 12, true);
		this.a.a(16, 40).a(-6.0F, 8.0F, -6.0F, 12, 2, 12);
		this.a.a(16, 40).a(-6.0F, 22.0F, -6.0F, 12, 2, 12);

		for (int integer2 = 0; integer2 < this.c.length; integer2++) {
			this.c[integer2] = new bni(this, 0, 0);
			this.c[integer2].a(-1.0F, -4.5F, -1.0F, 2, 9, 2);
			this.a.a(this.c[integer2]);
		}

		this.b = new bni(this, 8, 0);
		this.b.a(-1.0F, 15.0F, 0.0F, 2, 2, 1);
		this.a.a(this.b);
		this.d = new bni[3];
		this.d[0] = new bni(this, 40, 0);
		this.d[0].a(-2.0F, 14.0F, 7.0F, 4, 4, 8);
		this.d[1] = new bni(this, 0, 54);
		this.d[1].a(0.0F, 14.0F, 0.0F, 3, 3, 7);
		this.d[2] = new bni(this);
		this.d[2].a(41, 32).a(0.0F, 14.0F, 0.0F, 2, 2, 6);
		this.d[2].a(25, 19).a(1.0F, 10.5F, 3.0F, 1, 9, 9);
		this.a.a(this.d[0]);
		this.d[0].a(this.d[1]);
		this.d[1].a(this.d[2]);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.a.a(float7);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		zx zx9 = (zx)sn;
		float float10 = float3 - (float)zx9.T;
		this.a.g = float4 * (float) (Math.PI / 180.0);
		this.a.f = float5 * (float) (Math.PI / 180.0);
		float[] arr11 = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
		float[] arr12 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
		float[] arr13 = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
		float[] arr14 = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
		float[] arr15 = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
		float[] arr16 = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
		float float17 = (1.0F - zx9.r(float10)) * 0.55F;

		for (int integer18 = 0; integer18 < 12; integer18++) {
			this.c[integer18].f = (float) Math.PI * arr11[integer18];
			this.c[integer18].g = (float) Math.PI * arr12[integer18];
			this.c[integer18].h = (float) Math.PI * arr13[integer18];
			this.c[integer18].c = arr14[integer18] * (1.0F + ot.b(float3 * 1.5F + (float)integer18) * 0.01F - float17);
			this.c[integer18].d = 16.0F + arr15[integer18] * (1.0F + ot.b(float3 * 1.5F + (float)integer18) * 0.01F - float17);
			this.c[integer18].e = arr16[integer18] * (1.0F + ot.b(float3 * 1.5F + (float)integer18) * 0.01F - float17);
		}

		this.b.e = -8.25F;
		sn sn18 = bes.z().aa();
		if (zx9.dl()) {
			sn18 = zx9.dm();
		}

		if (sn18 != null) {
			bdw bdw19 = sn18.g(0.0F);
			bdw bdw20 = sn.g(0.0F);
			double double21 = bdw19.c - bdw20.c;
			if (double21 > 0.0) {
				this.b.d = 0.0F;
			} else {
				this.b.d = 1.0F;
			}

			bdw bdw23 = sn.f(0.0F);
			bdw23 = new bdw(bdw23.b, 0.0, bdw23.d);
			bdw bdw24 = new bdw(bdw20.b - bdw19.b, 0.0, bdw20.d - bdw19.d).a().b((float) (Math.PI / 2));
			double double25 = bdw23.b(bdw24);
			this.b.c = ot.c((float)Math.abs(double25)) * 2.0F * (float)Math.signum(double25);
		}

		this.b.j = true;
		float float19 = zx9.a(float10);
		this.d[0].g = ot.a(float19) * (float) Math.PI * 0.05F;
		this.d[1].g = ot.a(float19) * (float) Math.PI * 0.1F;
		this.d[1].c = -1.5F;
		this.d[1].d = 0.5F;
		this.d[1].e = 14.0F;
		this.d[2].g = ot.a(float19) * (float) Math.PI * 0.15F;
		this.d[2].c = 0.5F;
		this.d[2].d = 0.5F;
		this.d[2].e = 6.0F;
	}
}
