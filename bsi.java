import javax.annotation.Nullable;

public class bsi extends bsl<arz> {
	private final bkv a = new bkv();

	public void a(arz arz, double double2, double double3, double double4, float float5, int integer) {
		boolean boolean11 = arz.D() != null;
		boolean boolean12 = !boolean11 || arz.x() == alv.cK;
		int integer13 = boolean11 ? arz.v() : 0;
		long long14 = boolean11 ? arz.D().P() : 0L;
		bqg.G();
		float float16 = 0.6666667F;
		if (boolean12) {
			bqg.c((float)double2 + 0.5F, (float)double3 + 0.5F, (float)double4 + 0.5F);
			float float17 = (float)(integer13 * 360) / 16.0F;
			bqg.b(-float17, 0.0F, 1.0F, 0.0F);
			this.a.b.j = true;
		} else {
			float float18 = 0.0F;
			if (integer13 == 2) {
				float18 = 180.0F;
			}

			if (integer13 == 4) {
				float18 = 90.0F;
			}

			if (integer13 == 5) {
				float18 = -90.0F;
			}

			bqg.c((float)double2 + 0.5F, (float)double3 - 0.16666667F, (float)double4 + 0.5F);
			bqg.b(-float18, 0.0F, 1.0F, 0.0F);
			bqg.c(0.0F, -0.3125F, -0.4375F);
			this.a.b.j = false;
		}

		co co17 = arz.w();
		float float18x = (float)(co17.p() * 7 + co17.q() * 9 + co17.r() * 13) + (float)long14 + float5;
		this.a.a.f = (-0.0125F + 0.01F * ot.b(float18x * (float) Math.PI * 0.02F)) * (float) Math.PI;
		bqg.D();
		kq kq19 = this.a(arz);
		if (kq19 != null) {
			this.a(kq19);
			bqg.G();
			bqg.b(0.6666667F, -0.6666667F, -0.6666667F);
			this.a.a();
			bqg.H();
		}

		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.H();
	}

	@Nullable
	private kq a(arz arz) {
		return bqw.a.a(arz.k(), arz.h(), arz.j());
	}
}
