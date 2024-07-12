public class bnd extends blv {
	private final bni a;
	private final bni b;
	private final bni c;
	private final bni d;
	private final bni e;
	private final bni f;
	private final bni g;
	private final bni h;
	private final bni i;
	private final bni j;
	private final bni k;
	private final bni l;
	private float m;

	public bnd(float float1) {
		this.s = 256;
		this.t = 256;
		this.a("body.body", 0, 0);
		this.a("wing.skin", -56, 88);
		this.a("wingtip.skin", -56, 144);
		this.a("rearleg.main", 0, 0);
		this.a("rearfoot.main", 112, 0);
		this.a("rearlegtip.main", 196, 0);
		this.a("head.upperhead", 112, 30);
		this.a("wing.bone", 112, 88);
		this.a("head.upperlip", 176, 44);
		this.a("jaw.jaw", 176, 65);
		this.a("frontleg.main", 112, 104);
		this.a("wingtip.bone", 112, 136);
		this.a("frontfoot.main", 144, 104);
		this.a("neck.box", 192, 104);
		this.a("frontlegtip.main", 226, 138);
		this.a("body.scale", 220, 53);
		this.a("head.scale", 0, 0);
		this.a("neck.scale", 48, 0);
		this.a("head.nostril", 112, 0);
		float float3 = -16.0F;
		this.a = new bni(this, "head");
		this.a.a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16);
		this.a.a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16);
		this.a.i = true;
		this.a.a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6);
		this.a.a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4);
		this.a.i = false;
		this.a.a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6);
		this.a.a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4);
		this.c = new bni(this, "jaw");
		this.c.a(0.0F, 4.0F, -8.0F);
		this.c.a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
		this.a.a(this.c);
		this.b = new bni(this, "neck");
		this.b.a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
		this.b.a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
		this.d = new bni(this, "body");
		this.d.a(0.0F, 4.0F, 8.0F);
		this.d.a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
		this.d.a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
		this.d.a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
		this.d.a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
		this.k = new bni(this, "wing");
		this.k.a(-12.0F, 5.0F, 2.0F);
		this.k.a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
		this.k.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
		this.l = new bni(this, "wingtip");
		this.l.a(-56.0F, 0.0F, 0.0F);
		this.l.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
		this.l.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
		this.k.a(this.l);
		this.f = new bni(this, "frontleg");
		this.f.a(-12.0F, 20.0F, 2.0F);
		this.f.a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
		this.h = new bni(this, "frontlegtip");
		this.h.a(0.0F, 20.0F, -1.0F);
		this.h.a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
		this.f.a(this.h);
		this.j = new bni(this, "frontfoot");
		this.j.a(0.0F, 23.0F, 0.0F);
		this.j.a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
		this.h.a(this.j);
		this.e = new bni(this, "rearleg");
		this.e.a(-16.0F, 16.0F, 42.0F);
		this.e.a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
		this.g = new bni(this, "rearlegtip");
		this.g.a(0.0F, 32.0F, -4.0F);
		this.g.a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
		this.e.a(this.g);
		this.i = new bni(this, "rearfoot");
		this.i.a(0.0F, 31.0F, 4.0F);
		this.i.a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
		this.g.a(this.i);
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4) {
		this.m = float4;
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		bqg.G();
		yb yb9 = (yb)sn;
		float float10 = yb9.bD + (yb9.bE - yb9.bD) * this.m;
		this.c.f = (float)(Math.sin((double)(float10 * (float) (Math.PI * 2))) + 1.0) * 0.2F;
		float float11 = (float)(Math.sin((double)(float10 * (float) (Math.PI * 2) - 1.0F)) + 1.0);
		float11 = (float11 * float11 + float11 * 2.0F) * 0.05F;
		bqg.c(0.0F, float11 - 2.0F, -3.0F);
		bqg.b(float11 * 2.0F, 1.0F, 0.0F, 0.0F);
		float float12 = -30.0F;
		float float14 = 0.0F;
		float float15 = 1.5F;
		double[] arr16 = yb9.a(6, this.m);
		float float17 = this.a(yb9.a(5, this.m)[0] - yb9.a(10, this.m)[0]);
		float float18 = this.a(yb9.a(5, this.m)[0] + (double)(float17 / 2.0F));
		float float19 = float10 * (float) (Math.PI * 2);
		float12 = 20.0F;
		float float13 = -12.0F;

		for (int integer20 = 0; integer20 < 5; integer20++) {
			double[] arr21 = yb9.a(5 - integer20, this.m);
			float float22 = (float)Math.cos((double)((float)integer20 * 0.45F + float19)) * 0.15F;
			this.b.g = this.a(arr21[0] - arr16[0]) * (float) (Math.PI / 180.0) * 1.5F;
			this.b.f = float22 + yb9.a(integer20, arr16, arr21) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
			this.b.h = -this.a(arr21[0] - (double)float18) * (float) (Math.PI / 180.0) * 1.5F;
			this.b.d = float12;
			this.b.e = float13;
			this.b.c = float14;
			float12 = (float)((double)float12 + Math.sin((double)this.b.f) * 10.0);
			float13 = (float)((double)float13 - Math.cos((double)this.b.g) * Math.cos((double)this.b.f) * 10.0);
			float14 = (float)((double)float14 - Math.sin((double)this.b.g) * Math.cos((double)this.b.f) * 10.0);
			this.b.a(float7);
		}

		this.a.d = float12;
		this.a.e = float13;
		this.a.c = float14;
		double[] arr20 = yb9.a(0, this.m);
		this.a.g = this.a(arr20[0] - arr16[0]) * (float) (Math.PI / 180.0);
		this.a.f = this.a((double)yb9.a(6, arr16, arr20)) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
		this.a.h = -this.a(arr20[0] - (double)float18) * (float) (Math.PI / 180.0);
		this.a.a(float7);
		bqg.G();
		bqg.c(0.0F, 1.0F, 0.0F);
		bqg.b(-float17 * 1.5F, 0.0F, 0.0F, 1.0F);
		bqg.c(0.0F, -1.0F, 0.0F);
		this.d.h = 0.0F;
		this.d.a(float7);

		for (int integer21 = 0; integer21 < 2; integer21++) {
			bqg.q();
			float float22 = float10 * (float) (Math.PI * 2);
			this.k.f = 0.125F - (float)Math.cos((double)float22) * 0.2F;
			this.k.g = 0.25F;
			this.k.h = (float)(Math.sin((double)float22) + 0.125) * 0.8F;
			this.l.h = -((float)(Math.sin((double)(float22 + 2.0F)) + 0.5)) * 0.75F;
			this.e.f = 1.0F + float11 * 0.1F;
			this.g.f = 0.5F + float11 * 0.1F;
			this.i.f = 0.75F + float11 * 0.1F;
			this.f.f = 1.3F + float11 * 0.1F;
			this.h.f = -0.5F - float11 * 0.1F;
			this.j.f = 0.75F + float11 * 0.1F;
			this.k.a(float7);
			this.f.a(float7);
			this.e.a(float7);
			bqg.b(-1.0F, 1.0F, 1.0F);
			if (integer21 == 0) {
				bqg.a(bqg.i.FRONT);
			}
		}

		bqg.H();
		bqg.a(bqg.i.BACK);
		bqg.r();
		float float21 = -((float)Math.sin((double)(float10 * (float) (Math.PI * 2)))) * 0.0F;
		float19 = float10 * (float) (Math.PI * 2);
		float12 = 10.0F;
		float13 = 60.0F;
		float14 = 0.0F;
		arr16 = yb9.a(11, this.m);

		for (int integer22 = 0; integer22 < 12; integer22++) {
			arr20 = yb9.a(12 + integer22, this.m);
			float21 = (float)((double)float21 + Math.sin((double)((float)integer22 * 0.45F + float19)) * 0.05F);
			this.b.g = (this.a(arr20[0] - arr16[0]) * 1.5F + 180.0F) * (float) (Math.PI / 180.0);
			this.b.f = float21 + (float)(arr20[1] - arr16[1]) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
			this.b.h = this.a(arr20[0] - (double)float18) * (float) (Math.PI / 180.0) * 1.5F;
			this.b.d = float12;
			this.b.e = float13;
			this.b.c = float14;
			float12 = (float)((double)float12 + Math.sin((double)this.b.f) * 10.0);
			float13 = (float)((double)float13 - Math.cos((double)this.b.g) * Math.cos((double)this.b.f) * 10.0);
			float14 = (float)((double)float14 - Math.sin((double)this.b.g) * Math.cos((double)this.b.f) * 10.0);
			this.b.a(float7);
		}

		bqg.H();
	}

	private float a(double double1) {
		while (double1 >= 180.0) {
			double1 -= 360.0;
		}

		while (double1 < -180.0) {
			double1 += 360.0;
		}

		return (float)double1;
	}
}
