public class bvb extends bvq<zx> {
	private static final kq a = new kq("textures/entity/guardian.png");
	private static final kq j = new kq("textures/entity/guardian_beam.png");

	public bvb(bur bur) {
		super(bur, new blk(), 0.5F);
	}

	public boolean a(zx zx, btl btl, double double3, double double4, double double5) {
		if (super.a(zx, btl, double3, double4, double5)) {
			return true;
		} else {
			if (zx.dl()) {
				sw sw10 = zx.dm();
				if (sw10 != null) {
					bdw bdw11 = this.a(sw10, (double)sw10.H * 0.5, 1.0F);
					bdw bdw12 = this.a(zx, (double)zx.bq(), 1.0F);
					if (btl.a(new bdt(bdw12.b, bdw12.c, bdw12.d, bdw11.b, bdw11.c, bdw11.d))) {
						return true;
					}
				}
			}

			return false;
		}
	}

	private bdw a(sw sw, double double2, float float3) {
		double double6 = sw.M + (sw.p - sw.M) * (double)float3;
		double double8 = double2 + sw.N + (sw.q - sw.N) * (double)float3;
		double double10 = sw.O + (sw.r - sw.O) * (double)float3;
		return new bdw(double6, double8, double10);
	}

	public void a(zx zx, double double2, double double3, double double4, float float5, float float6) {
		super.a(zx, double2, double3, double4, float5, float6);
		sw sw11 = zx.dm();
		if (sw11 != null) {
			float float12 = zx.s(float6);
			bqs bqs13 = bqs.a();
			bpy bpy14 = bqs13.c();
			this.a(j);
			bqg.b(3553, 10242, 10497);
			bqg.b(3553, 10243, 10497);
			bqg.g();
			bqg.r();
			bqg.l();
			bqg.a(true);
			float float15 = 240.0F;
			cdb.a(cdb.r, 240.0F, 240.0F);
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE, bqg.r.ONE, bqg.l.ZERO);
			float float16 = (float)zx.l.P() + float6;
			float float17 = float16 * 0.5F % 1.0F;
			float float18 = zx.bq();
			bqg.G();
			bqg.c((float)double2, (float)double3 + float18, (float)double4);
			bdw bdw19 = this.a(sw11, (double)sw11.H * 0.5, float6);
			bdw bdw20 = this.a(zx, (double)float18, float6);
			bdw bdw21 = bdw19.d(bdw20);
			double double22 = bdw21.b() + 1.0;
			bdw21 = bdw21.a();
			float float24 = (float)Math.acos(bdw21.c);
			float float25 = (float)Math.atan2(bdw21.d, bdw21.b);
			bqg.b(((float) (Math.PI / 2) + -float25) * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
			bqg.b(float24 * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
			int integer26 = 1;
			double double27 = (double)float16 * 0.05 * -1.5;
			bpy14.a(7, bzh.i);
			float float29 = float12 * float12;
			int integer30 = 64 + (int)(float29 * 191.0F);
			int integer31 = 32 + (int)(float29 * 191.0F);
			int integer32 = 128 - (int)(float29 * 64.0F);
			double double33 = 0.2;
			double double35 = 0.282;
			double double37 = 0.0 + Math.cos(double27 + (Math.PI * 3.0 / 4.0)) * 0.282;
			double double39 = 0.0 + Math.sin(double27 + (Math.PI * 3.0 / 4.0)) * 0.282;
			double double41 = 0.0 + Math.cos(double27 + (Math.PI / 4)) * 0.282;
			double double43 = 0.0 + Math.sin(double27 + (Math.PI / 4)) * 0.282;
			double double45 = 0.0 + Math.cos(double27 + (Math.PI * 5.0 / 4.0)) * 0.282;
			double double47 = 0.0 + Math.sin(double27 + (Math.PI * 5.0 / 4.0)) * 0.282;
			double double49 = 0.0 + Math.cos(double27 + (Math.PI * 7.0 / 4.0)) * 0.282;
			double double51 = 0.0 + Math.sin(double27 + (Math.PI * 7.0 / 4.0)) * 0.282;
			double double53 = 0.0 + Math.cos(double27 + Math.PI) * 0.2;
			double double55 = 0.0 + Math.sin(double27 + Math.PI) * 0.2;
			double double57 = 0.0 + Math.cos(double27 + 0.0) * 0.2;
			double double59 = 0.0 + Math.sin(double27 + 0.0) * 0.2;
			double double61 = 0.0 + Math.cos(double27 + (Math.PI / 2)) * 0.2;
			double double63 = 0.0 + Math.sin(double27 + (Math.PI / 2)) * 0.2;
			double double65 = 0.0 + Math.cos(double27 + (Math.PI * 3.0 / 2.0)) * 0.2;
			double double67 = 0.0 + Math.sin(double27 + (Math.PI * 3.0 / 2.0)) * 0.2;
			double double71 = 0.0;
			double double73 = 0.4999;
			double double75 = (double)(-1.0F + float17);
			double double77 = double22 * 2.5 + double75;
			bpy14.b(double53, double22, double55).a(0.4999, double77).b(integer30, integer31, integer32, 255).d();
			bpy14.b(double53, 0.0, double55).a(0.4999, double75).b(integer30, integer31, integer32, 255).d();
			bpy14.b(double57, 0.0, double59).a(0.0, double75).b(integer30, integer31, integer32, 255).d();
			bpy14.b(double57, double22, double59).a(0.0, double77).b(integer30, integer31, integer32, 255).d();
			bpy14.b(double61, double22, double63).a(0.4999, double77).b(integer30, integer31, integer32, 255).d();
			bpy14.b(double61, 0.0, double63).a(0.4999, double75).b(integer30, integer31, integer32, 255).d();
			bpy14.b(double65, 0.0, double67).a(0.0, double75).b(integer30, integer31, integer32, 255).d();
			bpy14.b(double65, double22, double67).a(0.0, double77).b(integer30, integer31, integer32, 255).d();
			double double79 = 0.0;
			if (zx.T % 2 == 0) {
				double79 = 0.5;
			}

			bpy14.b(double37, double22, double39).a(0.5, double79 + 0.5).b(integer30, integer31, integer32, 255).d();
			bpy14.b(double41, double22, double43).a(1.0, double79 + 0.5).b(integer30, integer31, integer32, 255).d();
			bpy14.b(double49, double22, double51).a(1.0, double79).b(integer30, integer31, integer32, 255).d();
			bpy14.b(double45, double22, double47).a(0.5, double79).b(integer30, integer31, integer32, 255).d();
			bqs13.b();
			bqg.H();
		}
	}

	protected kq a(zx zx) {
		return a;
	}
}
