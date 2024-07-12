public abstract class bvq<T extends sx> extends bvl<T> {
	public bvq(bur bur, blv blv, float float3) {
		super(bur, blv, float3);
	}

	protected boolean a(T sx) {
		return super.a(sx) && (sx.bk() || sx.n_() && sx == this.b.d);
	}

	public boolean a(T sx, btl btl, double double3, double double4, double double5) {
		if (super.a(sx, btl, double3, double4, double5)) {
			return true;
		} else if (sx.cW() && sx.cX() != null) {
			sn sn10 = sx.cX();
			return btl.a(sn10.bp());
		} else {
			return false;
		}
	}

	public void a(T sx, double double2, double double3, double double4, float float5, float float6) {
		super.a(sx, double2, double3, double4, float5, float6);
		if (!this.e) {
			this.b(sx, double2, double3, double4, float5, float6);
		}
	}

	public void a(T sx, float float2) {
		int integer4 = sx.d(float2);
		int integer5 = integer4 % 65536;
		int integer6 = integer4 / 65536;
		cdb.a(cdb.r, (float)integer5, (float)integer6);
	}

	private double a(double double1, double double2, double double3) {
		return double1 + (double2 - double1) * double3;
	}

	protected void b(T sx, double double2, double double3, double double4, float float5, float float6) {
		sn sn11 = sx.cX();
		if (sn11 != null) {
			double3 -= (1.6 - (double)sx.H) * 0.5;
			bqs bqs12 = bqs.a();
			bpy bpy13 = bqs12.c();
			double double14 = this.a((double)sn11.x, (double)sn11.v, (double)(float6 * 0.5F)) * (float) (Math.PI / 180.0);
			double double16 = this.a((double)sn11.y, (double)sn11.w, (double)(float6 * 0.5F)) * (float) (Math.PI / 180.0);
			double double18 = Math.cos(double14);
			double double20 = Math.sin(double14);
			double double22 = Math.sin(double16);
			if (sn11 instanceof yy) {
				double18 = 0.0;
				double20 = 0.0;
				double22 = -1.0;
			}

			double double24 = Math.cos(double16);
			double double26 = this.a(sn11.m, sn11.p, (double)float6) - double18 * 0.7 - double20 * 0.5 * double24;
			double double28 = this.a(sn11.n + (double)sn11.bq() * 0.7, sn11.q + (double)sn11.bq() * 0.7, (double)float6) - double22 * 0.5 - 0.25;
			double double30 = this.a(sn11.o, sn11.r, (double)float6) - double20 * 0.7 + double18 * 0.5 * double24;
			double double32 = this.a((double)sx.aO, (double)sx.aN, (double)float6) * (float) (Math.PI / 180.0) + (Math.PI / 2);
			double18 = Math.cos(double32) * (double)sx.G * 0.4;
			double20 = Math.sin(double32) * (double)sx.G * 0.4;
			double double34 = this.a(sx.m, sx.p, (double)float6) + double18;
			double double36 = this.a(sx.n, sx.q, (double)float6);
			double double38 = this.a(sx.o, sx.r, (double)float6) + double20;
			double2 += double18;
			double4 += double20;
			double double40 = (double)((float)(double26 - double34));
			double double42 = (double)((float)(double28 - double36));
			double double44 = (double)((float)(double30 - double38));
			bqg.z();
			bqg.g();
			bqg.r();
			int integer46 = 24;
			double double47 = 0.025;
			bpy13.a(5, bzh.f);

			for (int integer49 = 0; integer49 <= 24; integer49++) {
				float float50 = 0.5F;
				float float51 = 0.4F;
				float float52 = 0.3F;
				if (integer49 % 2 == 0) {
					float50 *= 0.7F;
					float51 *= 0.7F;
					float52 *= 0.7F;
				}

				float float53 = (float)integer49 / 24.0F;
				bpy13.b(
						double2 + double40 * (double)float53 + 0.0,
						double3 + double42 * (double)(float53 * float53 + float53) * 0.5 + (double)((24.0F - (float)integer49) / 18.0F + 0.125F),
						double4 + double44 * (double)float53
					)
					.a(float50, float51, float52, 1.0F)
					.d();
				bpy13.b(
						double2 + double40 * (double)float53 + 0.025,
						double3 + double42 * (double)(float53 * float53 + float53) * 0.5 + (double)((24.0F - (float)integer49) / 18.0F + 0.125F) + 0.025,
						double4 + double44 * (double)float53
					)
					.a(float50, float51, float52, 1.0F)
					.d();
			}

			bqs12.b();
			bpy13.a(5, bzh.f);

			for (int integer49 = 0; integer49 <= 24; integer49++) {
				float float50 = 0.5F;
				float float51 = 0.4F;
				float float52 = 0.3F;
				if (integer49 % 2 == 0) {
					float50 *= 0.7F;
					float51 *= 0.7F;
					float52 *= 0.7F;
				}

				float float53 = (float)integer49 / 24.0F;
				bpy13.b(
						double2 + double40 * (double)float53 + 0.0,
						double3 + double42 * (double)(float53 * float53 + float53) * 0.5 + (double)((24.0F - (float)integer49) / 18.0F + 0.125F) + 0.025,
						double4 + double44 * (double)float53
					)
					.a(float50, float51, float52, 1.0F)
					.d();
				bpy13.b(
						double2 + double40 * (double)float53 + 0.025,
						double3 + double42 * (double)(float53 * float53 + float53) * 0.5 + (double)((24.0F - (float)integer49) / 18.0F + 0.125F),
						double4 + double44 * (double)float53 + 0.025
					)
					.a(float50, float51, float52, 1.0F)
					.d();
			}

			bqs12.b();
			bqg.f();
			bqg.y();
			bqg.q();
		}
	}
}
