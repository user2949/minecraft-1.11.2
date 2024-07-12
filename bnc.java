public class bnc extends blv {
	private final bni a;
	private final bni b;

	public bnc(float float1) {
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
		this.b = new bni(this, "jaw");
		this.b.a(0.0F, 4.0F, -8.0F);
		this.b.a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
		this.a.a(this.b);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.b.f = (float)(Math.sin((double)(float2 * (float) Math.PI * 0.2F)) + 1.0) * 0.2F;
		this.a.g = float5 * (float) (Math.PI / 180.0);
		this.a.f = float6 * (float) (Math.PI / 180.0);
		bqg.c(0.0F, -0.374375F, 0.0F);
		bqg.b(0.75F, 0.75F, 0.75F);
		this.a.a(float7);
	}
}
