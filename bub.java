public class bub extends bvl<yx> {
	public static final kq a = new kq("textures/entity/armorstand/wood.png");

	public bub(bur bur) {
		super(bur, new bku(), 0.0F);
		bxk bxk3 = new bxk(this) {
			@Override
			protected void L_() {
				this.c = new bkt(0.5F);
				this.d = new bkt(1.0F);
			}
		};
		this.a(bxk3);
		this.a(new bxl(this));
		this.a(new bxg(this));
		this.a(new bxe(this.a().e));
	}

	protected kq a(yx yx) {
		return a;
	}

	public bku b() {
		return (bku)super.b();
	}

	protected void a(yx yx, float float2, float float3, float float4) {
		bqg.b(180.0F - float3, 0.0F, 1.0F, 0.0F);
		float float6 = (float)(yx.l.P() - yx.h) + float4;
		if (float6 < 5.0F) {
			bqg.b(ot.a(float6 / 1.5F * (float) Math.PI) * 3.0F, 0.0F, 1.0F, 0.0F);
		}
	}

	protected boolean a(yx yx) {
		return yx.bj();
	}

	public void a(yx yx, double double2, double double3, double double4, float float5, float float6) {
		if (yx.t()) {
			this.i = true;
		}

		super.a(yx, double2, double3, double4, float5, float6);
		if (yx.t()) {
			this.i = false;
		}
	}
}
