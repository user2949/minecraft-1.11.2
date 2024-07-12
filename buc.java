public abstract class buc<T extends abb> extends bus<T> {
	public buc(bur bur) {
		super(bur);
	}

	public void a(T abb, double double2, double double3, double double4, float float5, float float6) {
		this.d(abb);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.G();
		bqg.g();
		bqg.c((float)double2, (float)double3, (float)double4);
		bqg.b(abb.x + (abb.v - abb.x) * float6 - 90.0F, 0.0F, 1.0F, 0.0F);
		bqg.b(abb.y + (abb.w - abb.y) * float6, 0.0F, 0.0F, 1.0F);
		bqs bqs11 = bqs.a();
		bpy bpy12 = bqs11.c();
		int integer13 = 0;
		float float14 = 0.0F;
		float float15 = 0.5F;
		float float16 = 0.0F;
		float float17 = 0.15625F;
		float float18 = 0.0F;
		float float19 = 0.15625F;
		float float20 = 0.15625F;
		float float21 = 0.3125F;
		float float22 = 0.05625F;
		bqg.D();
		float float23 = (float)abb.d - float6;
		if (float23 > 0.0F) {
			float float24 = -ot.a(float23 * 3.0F) * float23;
			bqg.b(float24, 0.0F, 0.0F, 1.0F);
		}

		bqg.b(45.0F, 1.0F, 0.0F, 0.0F);
		bqg.b(0.05625F, 0.05625F, 0.05625F);
		bqg.c(-4.0F, 0.0F, 0.0F);
		if (this.e) {
			bqg.h();
			bqg.e(this.c(abb));
		}

		bqg.a(0.05625F, 0.0F, 0.0F);
		bpy12.a(7, bzh.g);
		bpy12.b(-7.0, -2.0, -2.0).a(0.0, 0.15625).d();
		bpy12.b(-7.0, -2.0, 2.0).a(0.15625, 0.15625).d();
		bpy12.b(-7.0, 2.0, 2.0).a(0.15625, 0.3125).d();
		bpy12.b(-7.0, 2.0, -2.0).a(0.0, 0.3125).d();
		bqs11.b();
		bqg.a(-0.05625F, 0.0F, 0.0F);
		bpy12.a(7, bzh.g);
		bpy12.b(-7.0, 2.0, -2.0).a(0.0, 0.15625).d();
		bpy12.b(-7.0, 2.0, 2.0).a(0.15625, 0.15625).d();
		bpy12.b(-7.0, -2.0, 2.0).a(0.15625, 0.3125).d();
		bpy12.b(-7.0, -2.0, -2.0).a(0.0, 0.3125).d();
		bqs11.b();

		for (int integer24 = 0; integer24 < 4; integer24++) {
			bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
			bqg.a(0.0F, 0.0F, 0.05625F);
			bpy12.a(7, bzh.g);
			bpy12.b(-8.0, -2.0, 0.0).a(0.0, 0.0).d();
			bpy12.b(8.0, -2.0, 0.0).a(0.5, 0.0).d();
			bpy12.b(8.0, 2.0, 0.0).a(0.5, 0.15625).d();
			bpy12.b(-8.0, 2.0, 0.0).a(0.0, 0.15625).d();
			bqs11.b();
		}

		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.E();
		bqg.f();
		bqg.H();
		super.a(abb, double2, double3, double4, float5, float6);
	}
}
