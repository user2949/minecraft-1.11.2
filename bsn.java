public class bsn extends bsl<ask> {
	private static final kq a = new kq("textures/entity/enchanting_table_book.png");
	private final bkz d = new bkz();

	public void a(ask ask, double double2, double double3, double double4, float float5, int integer) {
		bqg.G();
		bqg.c((float)double2 + 0.5F, (float)double3 + 0.75F, (float)double4 + 0.5F);
		float float11 = (float)ask.a + float5;
		bqg.c(0.0F, 0.1F + ot.a(float11 * 0.1F) * 0.01F, 0.0F);
		float float12 = ask.l - ask.m;

		while (float12 >= (float) Math.PI) {
			float12 -= (float) (Math.PI * 2);
		}

		while (float12 < (float) -Math.PI) {
			float12 += (float) (Math.PI * 2);
		}

		float float13 = ask.m + float12 * float5;
		bqg.b(-float13 * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
		bqg.b(80.0F, 0.0F, 0.0F, 1.0F);
		this.a(a);
		float float14 = ask.g + (ask.f - ask.g) * float5 + 0.25F;
		float float15 = ask.g + (ask.f - ask.g) * float5 + 0.75F;
		float14 = (float14 - (float)ot.b((double)float14)) * 1.6F - 0.3F;
		float15 = (float15 - (float)ot.b((double)float15)) * 1.6F - 0.3F;
		if (float14 < 0.0F) {
			float14 = 0.0F;
		}

		if (float15 < 0.0F) {
			float15 = 0.0F;
		}

		if (float14 > 1.0F) {
			float14 = 1.0F;
		}

		if (float15 > 1.0F) {
			float15 = 1.0F;
		}

		float float16 = ask.k + (ask.j - ask.k) * float5;
		bqg.q();
		this.d.a(null, float11, float14, float15, float16, 0.0F, 0.0625F);
		bqg.H();
	}
}
