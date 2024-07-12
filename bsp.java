public class bsp extends bsl<asr> {
	public void a(asr asr, double double2, double double3, double double4, float float5, int integer) {
		bqg.G();
		bqg.c((float)double2 + 0.5F, (float)double3, (float)double4 + 0.5F);
		a(asr.a(), double2, double3, double4, float5);
		bqg.H();
	}

	public static void a(aji aji, double double2, double double3, double double4, float float5) {
		sn sn9 = aji.d();
		if (sn9 != null) {
			float float10 = 0.53125F;
			float float11 = Math.max(sn9.G, sn9.H);
			if ((double)float11 > 1.0) {
				float10 /= float11;
			}

			bqg.c(0.0F, 0.4F, 0.0F);
			bqg.b((float)(aji.f() + (aji.e() - aji.f()) * (double)float5) * 10.0F, 0.0F, 1.0F, 0.0F);
			bqg.c(0.0F, -0.2F, 0.0F);
			bqg.b(-30.0F, 1.0F, 0.0F, 0.0F);
			bqg.b(float10, float10, float10);
			sn9.b(double2, double3, double4, 0.0F, 0.0F);
			bes.z().ac().a(sn9, 0.0, 0.0, 0.0, 0.0F, float5, false);
		}
	}
}
