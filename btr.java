public class btr implements btt.a {
	private final bes a;

	public btr(bes bes) {
		this.a = bes;
	}

	@Override
	public void a(float float1, long long2) {
		aay aay5 = this.a.h;
		bqs bqs6 = bqs.a();
		bpy bpy7 = bqs6.c();
		double double8 = aay5.M + (aay5.p - aay5.M) * (double)float1;
		double double10 = aay5.N + (aay5.q - aay5.N) * (double)float1;
		double double12 = aay5.O + (aay5.r - aay5.O) * (double)float1;
		double double14 = 0.0 - double10;
		double double16 = 256.0 - double10;
		bqg.z();
		bqg.l();
		double double18 = (double)(aay5.ab << 4) - double8;
		double double20 = (double)(aay5.ad << 4) - double12;
		bqg.d(1.0F);
		bpy7.a(3, bzh.f);

		for (int integer22 = -16; integer22 <= 32; integer22 += 16) {
			for (int integer23 = -16; integer23 <= 32; integer23 += 16) {
				bpy7.b(double18 + (double)integer22, double14, double20 + (double)integer23).a(1.0F, 0.0F, 0.0F, 0.0F).d();
				bpy7.b(double18 + (double)integer22, double14, double20 + (double)integer23).a(1.0F, 0.0F, 0.0F, 0.5F).d();
				bpy7.b(double18 + (double)integer22, double16, double20 + (double)integer23).a(1.0F, 0.0F, 0.0F, 0.5F).d();
				bpy7.b(double18 + (double)integer22, double16, double20 + (double)integer23).a(1.0F, 0.0F, 0.0F, 0.0F).d();
			}
		}

		for (int integer22 = 2; integer22 < 16; integer22 += 2) {
			bpy7.b(double18 + (double)integer22, double14, double20).a(1.0F, 1.0F, 0.0F, 0.0F).d();
			bpy7.b(double18 + (double)integer22, double14, double20).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18 + (double)integer22, double16, double20).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18 + (double)integer22, double16, double20).a(1.0F, 1.0F, 0.0F, 0.0F).d();
			bpy7.b(double18 + (double)integer22, double14, double20 + 16.0).a(1.0F, 1.0F, 0.0F, 0.0F).d();
			bpy7.b(double18 + (double)integer22, double14, double20 + 16.0).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18 + (double)integer22, double16, double20 + 16.0).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18 + (double)integer22, double16, double20 + 16.0).a(1.0F, 1.0F, 0.0F, 0.0F).d();
		}

		for (int integer22 = 2; integer22 < 16; integer22 += 2) {
			bpy7.b(double18, double14, double20 + (double)integer22).a(1.0F, 1.0F, 0.0F, 0.0F).d();
			bpy7.b(double18, double14, double20 + (double)integer22).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18, double16, double20 + (double)integer22).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18, double16, double20 + (double)integer22).a(1.0F, 1.0F, 0.0F, 0.0F).d();
			bpy7.b(double18 + 16.0, double14, double20 + (double)integer22).a(1.0F, 1.0F, 0.0F, 0.0F).d();
			bpy7.b(double18 + 16.0, double14, double20 + (double)integer22).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18 + 16.0, double16, double20 + (double)integer22).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18 + 16.0, double16, double20 + (double)integer22).a(1.0F, 1.0F, 0.0F, 0.0F).d();
		}

		for (int integer22 = 0; integer22 <= 256; integer22 += 2) {
			double double23 = (double)integer22 - double10;
			bpy7.b(double18, double23, double20).a(1.0F, 1.0F, 0.0F, 0.0F).d();
			bpy7.b(double18, double23, double20).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18, double23, double20 + 16.0).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18 + 16.0, double23, double20 + 16.0).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18 + 16.0, double23, double20).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18, double23, double20).a(1.0F, 1.0F, 0.0F, 1.0F).d();
			bpy7.b(double18, double23, double20).a(1.0F, 1.0F, 0.0F, 0.0F).d();
		}

		bqs6.b();
		bqg.d(2.0F);
		bpy7.a(3, bzh.f);

		for (int integer22 = 0; integer22 <= 16; integer22 += 16) {
			for (int integer23 = 0; integer23 <= 16; integer23 += 16) {
				bpy7.b(double18 + (double)integer22, double14, double20 + (double)integer23).a(0.25F, 0.25F, 1.0F, 0.0F).d();
				bpy7.b(double18 + (double)integer22, double14, double20 + (double)integer23).a(0.25F, 0.25F, 1.0F, 1.0F).d();
				bpy7.b(double18 + (double)integer22, double16, double20 + (double)integer23).a(0.25F, 0.25F, 1.0F, 1.0F).d();
				bpy7.b(double18 + (double)integer22, double16, double20 + (double)integer23).a(0.25F, 0.25F, 1.0F, 0.0F).d();
			}
		}

		for (int integer22 = 0; integer22 <= 256; integer22 += 16) {
			double double23 = (double)integer22 - double10;
			bpy7.b(double18, double23, double20).a(0.25F, 0.25F, 1.0F, 0.0F).d();
			bpy7.b(double18, double23, double20).a(0.25F, 0.25F, 1.0F, 1.0F).d();
			bpy7.b(double18, double23, double20 + 16.0).a(0.25F, 0.25F, 1.0F, 1.0F).d();
			bpy7.b(double18 + 16.0, double23, double20 + 16.0).a(0.25F, 0.25F, 1.0F, 1.0F).d();
			bpy7.b(double18 + 16.0, double23, double20).a(0.25F, 0.25F, 1.0F, 1.0F).d();
			bpy7.b(double18, double23, double20).a(0.25F, 0.25F, 1.0F, 1.0F).d();
			bpy7.b(double18, double23, double20).a(0.25F, 0.25F, 1.0F, 0.0F).d();
		}

		bqs6.b();
		bqg.d(1.0F);
		bqg.m();
		bqg.y();
	}
}
