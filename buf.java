public class buf extends bus<abx> {
	private static final kq[] f = new kq[]{
		new kq("textures/entity/boat/boat_oak.png"),
		new kq("textures/entity/boat/boat_spruce.png"),
		new kq("textures/entity/boat/boat_birch.png"),
		new kq("textures/entity/boat/boat_jungle.png"),
		new kq("textures/entity/boat/boat_acacia.png"),
		new kq("textures/entity/boat/boat_darkoak.png")
	};
	protected blv a = new bky();

	public buf(bur bur) {
		super(bur);
		this.c = 0.5F;
	}

	public void a(abx abx, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		this.a(double2, double3, double4);
		this.a(abx, float5, float6);
		this.d(abx);
		if (this.e) {
			bqg.h();
			bqg.e(this.c(abx));
		}

		this.a.a(abx, float6, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.H();
		super.a(abx, double2, double3, double4, float5, float6);
	}

	public void a(abx abx, float float2, float float3) {
		bqg.b(180.0F - float2, 0.0F, 1.0F, 0.0F);
		float float5 = (float)abx.o() - float3;
		float float6 = abx.n() - float3;
		if (float6 < 0.0F) {
			float6 = 0.0F;
		}

		if (float5 > 0.0F) {
			bqg.b(ot.a(float5) * float5 * float6 / 10.0F * (float)abx.q(), 1.0F, 0.0F, 0.0F);
		}

		bqg.b(-1.0F, -1.0F, 1.0F);
	}

	public void a(double double1, double double2, double double3) {
		bqg.c((float)double1, (float)double2 + 0.375F, (float)double3);
	}

	protected kq a(abx abx) {
		return f[abx.r().ordinal()];
	}

	@Override
	public boolean K_() {
		return true;
	}

	public void b(abx abx, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		this.a(double2, double3, double4);
		this.a(abx, float5, float6);
		this.d(abx);
		((bmr)this.a).b(abx, float6, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		bqg.H();
	}
}
