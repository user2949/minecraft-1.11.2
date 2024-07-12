public class buy extends bus<zd> {
	private static final kq a = new kq("textures/particle/particles.png");

	public buy(bur bur) {
		super(bur);
	}

	public void a(zd zd, double double2, double double3, double double4, float float5, float float6) {
		aay aay11 = zd.l();
		if (aay11 != null && !this.e) {
			bqg.G();
			bqg.c((float)double2, (float)double3, (float)double4);
			bqg.D();
			bqg.b(0.5F, 0.5F, 0.5F);
			this.d(zd);
			bqs bqs12 = bqs.a();
			bpy bpy13 = bqs12.c();
			int integer14 = 1;
			int integer15 = 2;
			float float16 = 0.0625F;
			float float17 = 0.125F;
			float float18 = 0.125F;
			float float19 = 0.1875F;
			float float20 = 1.0F;
			float float21 = 0.5F;
			float float22 = 0.5F;
			bqg.b(180.0F - this.b.e, 0.0F, 1.0F, 0.0F);
			bqg.b((float)(this.b.g.as == 2 ? -1 : 1) * -this.b.f, 1.0F, 0.0F, 0.0F);
			if (this.e) {
				bqg.h();
				bqg.e(this.c(zd));
			}

			bpy13.a(7, bzh.j);
			bpy13.b(-0.5, -0.5, 0.0).a(0.0625, 0.1875).c(0.0F, 1.0F, 0.0F).d();
			bpy13.b(0.5, -0.5, 0.0).a(0.125, 0.1875).c(0.0F, 1.0F, 0.0F).d();
			bpy13.b(0.5, 0.5, 0.0).a(0.125, 0.125).c(0.0F, 1.0F, 0.0F).d();
			bpy13.b(-0.5, 0.5, 0.0).a(0.0625, 0.125).c(0.0F, 1.0F, 0.0F).d();
			bqs12.b();
			if (this.e) {
				bqg.n();
				bqg.i();
			}

			bqg.E();
			bqg.H();
			int integer23 = aay11.cx() == sv.RIGHT ? 1 : -1;
			afj afj24 = aay11.cg();
			if (afj24.c() != afl.aZ) {
				integer23 = -integer23;
			}

			float float25 = aay11.m(float6);
			float float26 = ot.a(ot.c(float25) * (float) Math.PI);
			float float27 = (aay11.aO + (aay11.aN - aay11.aO) * float6) * (float) (Math.PI / 180.0);
			double double28 = (double)ot.a(float27);
			double double30 = (double)ot.b(float27);
			double double32 = (double)integer23 * 0.35;
			double double34 = 0.8;
			double double36;
			double double38;
			double double40;
			double double42;
			if ((this.b.g == null || this.b.g.as <= 0) && aay11 == bes.z().h) {
				float float44 = this.b.g.az;
				float44 /= 100.0F;
				bdw bdw45 = new bdw((double)integer23 * -0.36 * (double)float44, -0.045 * (double)float44, 0.4);
				bdw45 = bdw45.a(-(aay11.y + (aay11.w - aay11.y) * float6) * (float) (Math.PI / 180.0));
				bdw45 = bdw45.b(-(aay11.x + (aay11.v - aay11.x) * float6) * (float) (Math.PI / 180.0));
				bdw45 = bdw45.b(float26 * 0.5F);
				bdw45 = bdw45.a(-float26 * 0.7F);
				double36 = aay11.m + (aay11.p - aay11.m) * (double)float6 + bdw45.b;
				double38 = aay11.n + (aay11.q - aay11.n) * (double)float6 + bdw45.c;
				double40 = aay11.o + (aay11.r - aay11.o) * (double)float6 + bdw45.d;
				double42 = (double)aay11.bq();
			} else {
				double36 = aay11.m + (aay11.p - aay11.m) * (double)float6 - double30 * double32 - double28 * 0.8;
				double38 = aay11.n + (double)aay11.bq() + (aay11.q - aay11.n) * (double)float6 - 0.45;
				double40 = aay11.o + (aay11.r - aay11.o) * (double)float6 - double28 * double32 + double30 * 0.8;
				double42 = aay11.aM() ? -0.1875 : 0.0;
			}

			double double44 = zd.m + (zd.p - zd.m) * (double)float6;
			double double46 = zd.n + (zd.q - zd.n) * (double)float6 + 0.25;
			double double48 = zd.o + (zd.r - zd.o) * (double)float6;
			double double50 = (double)((float)(double36 - double44));
			double double52 = (double)((float)(double38 - double46)) + double42;
			double double54 = (double)((float)(double40 - double48));
			bqg.z();
			bqg.g();
			bpy13.a(3, bzh.f);
			int integer56 = 16;

			for (int integer57 = 0; integer57 <= 16; integer57++) {
				float float58 = (float)integer57 / 16.0F;
				bpy13.b(double2 + double50 * (double)float58, double3 + double52 * (double)(float58 * float58 + float58) * 0.5 + 0.25, double4 + double54 * (double)float58)
					.b(0, 0, 0, 255)
					.d();
			}

			bqs12.b();
			bqg.f();
			bqg.y();
			super.a(zd, double2, double3, double4, float5, float6);
		}
	}

	protected kq a(zd zd) {
		return a;
	}
}
