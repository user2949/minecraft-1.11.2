public class bvo<T extends aby> extends bus<T> {
	private static final kq f = new kq("textures/entity/minecart.png");
	protected blv a = new blu();

	public bvo(bur bur) {
		super(bur);
		this.c = 0.5F;
	}

	public void a(T aby, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		this.d(aby);
		long long11 = (long)aby.O() * 493286711L;
		long11 = long11 * long11 * 4392167121L + long11 * 98761L;
		float float13 = (((float)(long11 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
		float float14 = (((float)(long11 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
		float float15 = (((float)(long11 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
		bqg.c(float13, float14, float15);
		double double16 = aby.M + (aby.p - aby.M) * (double)float6;
		double double18 = aby.N + (aby.q - aby.N) * (double)float6;
		double double20 = aby.O + (aby.r - aby.O) * (double)float6;
		double double22 = 0.3F;
		bdw bdw24 = aby.j(double16, double18, double20);
		float float25 = aby.y + (aby.w - aby.y) * float6;
		if (bdw24 != null) {
			bdw bdw26 = aby.a(double16, double18, double20, 0.3F);
			bdw bdw27 = aby.a(double16, double18, double20, -0.3F);
			if (bdw26 == null) {
				bdw26 = bdw24;
			}

			if (bdw27 == null) {
				bdw27 = bdw24;
			}

			double2 += bdw24.b - double16;
			double3 += (bdw26.c + bdw27.c) / 2.0 - double18;
			double4 += bdw24.d - double20;
			bdw bdw28 = bdw27.b(-bdw26.b, -bdw26.c, -bdw26.d);
			if (bdw28.b() != 0.0) {
				bdw28 = bdw28.a();
				float5 = (float)(Math.atan2(bdw28.d, bdw28.b) * 180.0 / Math.PI);
				float25 = (float)(Math.atan(bdw28.c) * 73.0);
			}
		}

		bqg.c((float)double2, (float)double3 + 0.375F, (float)double4);
		bqg.b(180.0F - float5, 0.0F, 1.0F, 0.0F);
		bqg.b(-float25, 0.0F, 0.0F, 1.0F);
		float float26 = (float)aby.t() - float6;
		float float27 = aby.s() - float6;
		if (float27 < 0.0F) {
			float27 = 0.0F;
		}

		if (float26 > 0.0F) {
			bqg.b(ot.a(float26) * float26 * float27 / 10.0F * (float)aby.u(), 1.0F, 0.0F, 0.0F);
		}

		int integer28 = aby.y();
		if (this.e) {
			bqg.h();
			bqg.e(this.c(aby));
		}

		atl atl29 = aby.w();
		if (atl29.j() != aqf.INVISIBLE) {
			bqg.G();
			this.a(byy.g);
			float float30 = 0.75F;
			bqg.b(0.75F, 0.75F, 0.75F);
			bqg.c(-0.5F, (float)(integer28 - 8) / 16.0F, 0.5F);
			this.a(aby, float6, atl29);
			bqg.H();
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.d(aby);
		}

		bqg.b(-1.0F, -1.0F, 1.0F);
		this.a.a(aby, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		bqg.H();
		if (this.e) {
			bqg.n();
			bqg.i();
		}

		super.a(aby, double2, double3, double4, float5, float6);
	}

	protected kq a(T aby) {
		return f;
	}

	protected void a(T aby, float float2, atl atl) {
		bqg.G();
		bes.z().ab().a(atl, aby.e(float2));
		bqg.H();
	}
}
