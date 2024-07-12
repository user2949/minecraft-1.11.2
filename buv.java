public class buv extends bus<st> {
	private static final kq a = new kq("textures/entity/experience_orb.png");

	public buv(bur bur) {
		super(bur);
		this.c = 0.15F;
		this.d = 0.75F;
	}

	public void a(st st, double double2, double double3, double double4, float float5, float float6) {
		if (!this.e) {
			bqg.G();
			bqg.c((float)double2, (float)double3, (float)double4);
			this.d(st);
			beq.b();
			int integer11 = st.k();
			float float12 = (float)(integer11 % 4 * 16 + 0) / 64.0F;
			float float13 = (float)(integer11 % 4 * 16 + 16) / 64.0F;
			float float14 = (float)(integer11 / 4 * 16 + 0) / 64.0F;
			float float15 = (float)(integer11 / 4 * 16 + 16) / 64.0F;
			float float16 = 1.0F;
			float float17 = 0.5F;
			float float18 = 0.25F;
			int integer19 = st.d(float6);
			int integer20 = integer19 % 65536;
			int integer21 = integer19 / 65536;
			cdb.a(cdb.r, (float)integer20, (float)integer21);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			float float19 = 255.0F;
			float float20 = ((float)st.a + float6) / 2.0F;
			integer21 = (int)((ot.a(float20 + 0.0F) + 1.0F) * 0.5F * 255.0F);
			int integer22 = 255;
			int integer23 = (int)((ot.a(float20 + (float) (Math.PI * 4.0 / 3.0)) + 1.0F) * 0.1F * 255.0F);
			bqg.c(0.0F, 0.1F, 0.0F);
			bqg.b(180.0F - this.b.e, 0.0F, 1.0F, 0.0F);
			bqg.b((float)(this.b.g.as == 2 ? -1 : 1) * -this.b.f, 1.0F, 0.0F, 0.0F);
			float float24 = 0.3F;
			bqg.b(0.3F, 0.3F, 0.3F);
			bqs bqs25 = bqs.a();
			bpy bpy26 = bqs25.c();
			bpy26.a(7, bzh.l);
			bpy26.b(-0.5, -0.25, 0.0).a((double)float12, (double)float15).b(integer21, 255, integer23, 128).c(0.0F, 1.0F, 0.0F).d();
			bpy26.b(0.5, -0.25, 0.0).a((double)float13, (double)float15).b(integer21, 255, integer23, 128).c(0.0F, 1.0F, 0.0F).d();
			bpy26.b(0.5, 0.75, 0.0).a((double)float13, (double)float14).b(integer21, 255, integer23, 128).c(0.0F, 1.0F, 0.0F).d();
			bpy26.b(-0.5, 0.75, 0.0).a((double)float12, (double)float14).b(integer21, 255, integer23, 128).c(0.0F, 1.0F, 0.0F).d();
			bqs25.b();
			bqg.l();
			bqg.E();
			bqg.H();
			super.a(st, double2, double3, double4, float5, float6);
		}
	}

	protected kq a(st st) {
		return a;
	}
}
