import java.util.List;

public class bss extends bsl<asv> {
	private static final kq a = new kq("textures/entity/sign.png");
	private final bmi d = new bmi();

	public void a(asv asv, double double2, double double3, double double4, float float5, int integer) {
		alu alu11 = asv.x();
		bqg.G();
		float float12 = 0.6666667F;
		if (alu11 == alv.an) {
			bqg.c((float)double2 + 0.5F, (float)double3 + 0.5F, (float)double4 + 0.5F);
			float float13 = (float)(asv.v() * 360) / 16.0F;
			bqg.b(-float13, 0.0F, 1.0F, 0.0F);
			this.d.b.j = true;
		} else {
			int integer13 = asv.v();
			float float14 = 0.0F;
			if (integer13 == 2) {
				float14 = 180.0F;
			}

			if (integer13 == 4) {
				float14 = 90.0F;
			}

			if (integer13 == 5) {
				float14 = -90.0F;
			}

			bqg.c((float)double2 + 0.5F, (float)double3 + 0.5F, (float)double4 + 0.5F);
			bqg.b(-float14, 0.0F, 1.0F, 0.0F);
			bqg.c(0.0F, -0.3125F, -0.4375F);
			this.d.b.j = false;
		}

		if (integer >= 0) {
			this.a(b[integer]);
			bqg.n(5890);
			bqg.G();
			bqg.b(4.0F, 2.0F, 1.0F);
			bqg.c(0.0625F, 0.0625F, 0.0625F);
			bqg.n(5888);
		} else {
			this.a(a);
		}

		bqg.D();
		bqg.G();
		bqg.b(0.6666667F, -0.6666667F, -0.6666667F);
		this.d.a();
		bqg.H();
		bfg bfg13 = this.b();
		float float14x = 0.010416667F;
		bqg.c(0.0F, 0.33333334F, 0.046666667F);
		bqg.b(0.010416667F, -0.010416667F, 0.010416667F);
		bqg.a(0.0F, 0.0F, -0.010416667F);
		bqg.a(false);
		int integer15 = 0;
		if (integer < 0) {
			for (int integer16 = 0; integer16 < asv.a.length; integer16++) {
				if (asv.a[integer16] != null) {
					fb fb17 = asv.a[integer16];
					List<fb> list18 = bfo.a(fb17, 90, bfg13, false, true);
					String string19 = list18 != null && !list18.isEmpty() ? ((fb)list18.get(0)).d() : "";
					if (integer16 == asv.f) {
						string19 = "> " + string19 + " <";
						bfg13.a(string19, -bfg13.a(string19) / 2, integer16 * 10 - asv.a.length * 5, 0);
					} else {
						bfg13.a(string19, -bfg13.a(string19) / 2, integer16 * 10 - asv.a.length * 5, 0);
					}
				}
			}
		}

		bqg.a(true);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.H();
		if (integer >= 0) {
			bqg.n(5890);
			bqg.H();
			bqg.n(5888);
		}
	}
}
