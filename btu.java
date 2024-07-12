public class btu implements btt.a {
	private final bes a;

	public btu(bes bes) {
		this.a = bes;
	}

	@Override
	public void a(float float1, long long2) {
		aay aay5 = this.a.h;
		ajs ajs6 = this.a.f;
		double double7 = aay5.M + (aay5.p - aay5.M) * (double)float1;
		double double9 = aay5.N + (aay5.q - aay5.N) * (double)float1;
		double double11 = aay5.O + (aay5.r - aay5.O) * (double)float1;
		bqg.G();
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.z();
		co co13 = new co(aay5.p, 0.0, aay5.r);
		Iterable<co> iterable14 = co.a(co13.a(-40, 0, -40), co13.a(40, 0, 40));
		bqs bqs15 = bqs.a();
		bpy bpy16 = bqs15.c();
		bpy16.a(5, bzh.f);

		for (co co18 : iterable14) {
			int integer19 = ajs6.c(co18.p(), co18.r());
			if (ajs6.o(co18.a(0, integer19, 0).b()) == alv.a.t()) {
				bqm.b(
					bpy16,
					(double)((float)co18.p() + 0.25F) - double7,
					(double)integer19 - double9,
					(double)((float)co18.r() + 0.25F) - double11,
					(double)((float)co18.p() + 0.75F) - double7,
					(double)integer19 + 0.09375 - double9,
					(double)((float)co18.r() + 0.75F) - double11,
					0.0F,
					0.0F,
					1.0F,
					0.5F
				);
			} else {
				bqm.b(
					bpy16,
					(double)((float)co18.p() + 0.25F) - double7,
					(double)integer19 - double9,
					(double)((float)co18.r() + 0.25F) - double11,
					(double)((float)co18.p() + 0.75F) - double7,
					(double)integer19 + 0.09375 - double9,
					(double)((float)co18.r() + 0.75F) - double11,
					0.0F,
					1.0F,
					0.0F,
					0.5F
				);
			}
		}

		bqs15.b();
		bqg.y();
		bqg.H();
	}
}
