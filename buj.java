public class buj extends bvq<zp> {
	private static final kq a = new kq("textures/entity/creeper/creeper.png");

	public buj(bur bur) {
		super(bur, new bld(), 0.5F);
		this.a(new bxd(this));
	}

	protected void a(zp zp, float float2) {
		float float4 = zp.a(float2);
		float float5 = 1.0F + ot.a(float4 * 100.0F) * float4 * 0.01F;
		float4 = ot.a(float4, 0.0F, 1.0F);
		float4 *= float4;
		float4 *= float4;
		float float6 = (1.0F + float4 * 0.4F) * float5;
		float float7 = (1.0F + float4 * 0.1F) / float5;
		bqg.b(float6, float7, float6);
	}

	protected int a(zp zp, float float2, float float3) {
		float float5 = zp.a(float3);
		if ((int)(float5 * 10.0F) % 2 == 0) {
			return 0;
		} else {
			int integer6 = (int)(float5 * 0.2F * 255.0F);
			integer6 = ot.a(integer6, 0, 255);
			return integer6 << 24 | 822083583;
		}
	}

	protected kq a(zp zp) {
		return a;
	}
}
