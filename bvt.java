public class bvt extends bus<zb> {
	private static final kq a = new kq("textures/painting/paintings_kristoffer_zetterstrand.png");

	public bvt(bur bur) {
		super(bur);
	}

	public void a(zb zb, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		bqg.b(double2, double3, double4);
		bqg.b(180.0F - float5, 0.0F, 1.0F, 0.0F);
		bqg.D();
		this.d(zb);
		zb.a a11 = zb.c;
		float float12 = 0.0625F;
		bqg.b(0.0625F, 0.0625F, 0.0625F);
		if (this.e) {
			bqg.h();
			bqg.e(this.c(zb));
		}

		this.a(zb, a11.C, a11.D, a11.E, a11.F);
		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.E();
		bqg.H();
		super.a(zb, double2, double3, double4, float5, float6);
	}

	protected kq a(zb zb) {
		return a;
	}

	private void a(zb zb, int integer2, int integer3, int integer4, int integer5) {
		float float7 = (float)(-integer2) / 2.0F;
		float float8 = (float)(-integer3) / 2.0F;
		float float9 = 0.5F;
		float float10 = 0.75F;
		float float11 = 0.8125F;
		float float12 = 0.0F;
		float float13 = 0.0625F;
		float float14 = 0.75F;
		float float15 = 0.8125F;
		float float16 = 0.001953125F;
		float float17 = 0.001953125F;
		float float18 = 0.7519531F;
		float float19 = 0.7519531F;
		float float20 = 0.0F;
		float float21 = 0.0625F;

		for (int integer22 = 0; integer22 < integer2 / 16; integer22++) {
			for (int integer23 = 0; integer23 < integer3 / 16; integer23++) {
				float float24 = float7 + (float)((integer22 + 1) * 16);
				float float25 = float7 + (float)(integer22 * 16);
				float float26 = float8 + (float)((integer23 + 1) * 16);
				float float27 = float8 + (float)(integer23 * 16);
				this.a(zb, (float24 + float25) / 2.0F, (float26 + float27) / 2.0F);
				float float28 = (float)(integer4 + integer2 - integer22 * 16) / 256.0F;
				float float29 = (float)(integer4 + integer2 - (integer22 + 1) * 16) / 256.0F;
				float float30 = (float)(integer5 + integer3 - integer23 * 16) / 256.0F;
				float float31 = (float)(integer5 + integer3 - (integer23 + 1) * 16) / 256.0F;
				bqs bqs32 = bqs.a();
				bpy bpy33 = bqs32.c();
				bpy33.a(7, bzh.j);
				bpy33.b((double)float24, (double)float27, -0.5).a((double)float29, (double)float30).c(0.0F, 0.0F, -1.0F).d();
				bpy33.b((double)float25, (double)float27, -0.5).a((double)float28, (double)float30).c(0.0F, 0.0F, -1.0F).d();
				bpy33.b((double)float25, (double)float26, -0.5).a((double)float28, (double)float31).c(0.0F, 0.0F, -1.0F).d();
				bpy33.b((double)float24, (double)float26, -0.5).a((double)float29, (double)float31).c(0.0F, 0.0F, -1.0F).d();
				bpy33.b((double)float24, (double)float26, 0.5).a(0.75, 0.0).c(0.0F, 0.0F, 1.0F).d();
				bpy33.b((double)float25, (double)float26, 0.5).a(0.8125, 0.0).c(0.0F, 0.0F, 1.0F).d();
				bpy33.b((double)float25, (double)float27, 0.5).a(0.8125, 0.0625).c(0.0F, 0.0F, 1.0F).d();
				bpy33.b((double)float24, (double)float27, 0.5).a(0.75, 0.0625).c(0.0F, 0.0F, 1.0F).d();
				bpy33.b((double)float24, (double)float26, -0.5).a(0.75, 0.001953125).c(0.0F, 1.0F, 0.0F).d();
				bpy33.b((double)float25, (double)float26, -0.5).a(0.8125, 0.001953125).c(0.0F, 1.0F, 0.0F).d();
				bpy33.b((double)float25, (double)float26, 0.5).a(0.8125, 0.001953125).c(0.0F, 1.0F, 0.0F).d();
				bpy33.b((double)float24, (double)float26, 0.5).a(0.75, 0.001953125).c(0.0F, 1.0F, 0.0F).d();
				bpy33.b((double)float24, (double)float27, 0.5).a(0.75, 0.001953125).c(0.0F, -1.0F, 0.0F).d();
				bpy33.b((double)float25, (double)float27, 0.5).a(0.8125, 0.001953125).c(0.0F, -1.0F, 0.0F).d();
				bpy33.b((double)float25, (double)float27, -0.5).a(0.8125, 0.001953125).c(0.0F, -1.0F, 0.0F).d();
				bpy33.b((double)float24, (double)float27, -0.5).a(0.75, 0.001953125).c(0.0F, -1.0F, 0.0F).d();
				bpy33.b((double)float24, (double)float26, 0.5).a(0.7519531F, 0.0).c(-1.0F, 0.0F, 0.0F).d();
				bpy33.b((double)float24, (double)float27, 0.5).a(0.7519531F, 0.0625).c(-1.0F, 0.0F, 0.0F).d();
				bpy33.b((double)float24, (double)float27, -0.5).a(0.7519531F, 0.0625).c(-1.0F, 0.0F, 0.0F).d();
				bpy33.b((double)float24, (double)float26, -0.5).a(0.7519531F, 0.0).c(-1.0F, 0.0F, 0.0F).d();
				bpy33.b((double)float25, (double)float26, -0.5).a(0.7519531F, 0.0).c(1.0F, 0.0F, 0.0F).d();
				bpy33.b((double)float25, (double)float27, -0.5).a(0.7519531F, 0.0625).c(1.0F, 0.0F, 0.0F).d();
				bpy33.b((double)float25, (double)float27, 0.5).a(0.7519531F, 0.0625).c(1.0F, 0.0F, 0.0F).d();
				bpy33.b((double)float25, (double)float26, 0.5).a(0.7519531F, 0.0).c(1.0F, 0.0F, 0.0F).d();
				bqs32.b();
			}
		}
	}

	private void a(zb zb, float float2, float float3) {
		int integer5 = ot.c(zb.p);
		int integer6 = ot.c(zb.q + (double)(float3 / 16.0F));
		int integer7 = ot.c(zb.r);
		cv cv8 = zb.b;
		if (cv8 == cv.NORTH) {
			integer5 = ot.c(zb.p + (double)(float2 / 16.0F));
		}

		if (cv8 == cv.WEST) {
			integer7 = ot.c(zb.r - (double)(float2 / 16.0F));
		}

		if (cv8 == cv.SOUTH) {
			integer5 = ot.c(zb.p - (double)(float2 / 16.0F));
		}

		if (cv8 == cv.EAST) {
			integer7 = ot.c(zb.r + (double)(float2 / 16.0F));
		}

		int integer9 = this.b.b.b(new co(integer5, integer6, integer7), 0);
		int integer10 = integer9 % 65536;
		int integer11 = integer9 / 65536;
		cdb.a(cdb.r, (float)integer10, (float)integer11);
		bqg.d(1.0F, 1.0F, 1.0F);
	}
}
