public class bul extends bus<abc> {
	private static final kq a = new kq("textures/entity/enderdragon/dragon_fireball.png");

	public bul(bur bur) {
		super(bur);
	}

	public void a(abc abc, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		this.d(abc);
		bqg.c((float)double2, (float)double3, (float)double4);
		bqg.D();
		bqg.b(2.0F, 2.0F, 2.0F);
		bqs bqs11 = bqs.a();
		bpy bpy12 = bqs11.c();
		float float13 = 1.0F;
		float float14 = 0.5F;
		float float15 = 0.25F;
		bqg.b(180.0F - this.b.e, 0.0F, 1.0F, 0.0F);
		bqg.b((float)(this.b.g.as == 2 ? -1 : 1) * -this.b.f, 1.0F, 0.0F, 0.0F);
		if (this.e) {
			bqg.h();
			bqg.e(this.c(abc));
		}

		bpy12.a(7, bzh.j);
		bpy12.b(-0.5, -0.25, 0.0).a(0.0, 1.0).c(0.0F, 1.0F, 0.0F).d();
		bpy12.b(0.5, -0.25, 0.0).a(1.0, 1.0).c(0.0F, 1.0F, 0.0F).d();
		bpy12.b(0.5, 0.75, 0.0).a(1.0, 0.0).c(0.0F, 1.0F, 0.0F).d();
		bpy12.b(-0.5, 0.75, 0.0).a(0.0, 0.0).c(0.0F, 1.0F, 0.0F).d();
		bqs11.b();
		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.E();
		bqg.H();
		super.a(abc, double2, double3, double4, float5, float6);
	}

	protected kq a(abc abc) {
		return a;
	}
}
