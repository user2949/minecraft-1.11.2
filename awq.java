import java.util.Random;

public class awq extends axq {
	private final atl a;
	private final atl b;

	public awq(atl atl1, atl atl2) {
		super(false);
		this.b = atl1;
		this.a = atl2;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (atl atl5 = ajs.o(co); (atl5.a() == azs.a || atl5.a() == azs.j) && co.q() > 0; atl5 = ajs.o(co)) {
			co = co.b();
		}

		alu alu6 = ajs.o(co).v();
		if (alu6 == alv.d || alu6 == alv.c) {
			co = co.a();
			this.a(ajs, co, this.b);

			for (int integer7 = co.q(); integer7 <= co.q() + 2; integer7++) {
				int integer8 = integer7 - co.q();
				int integer9 = 2 - integer8;

				for (int integer10 = co.p() - integer9; integer10 <= co.p() + integer9; integer10++) {
					int integer11 = integer10 - co.p();

					for (int integer12 = co.r() - integer9; integer12 <= co.r() + integer9; integer12++) {
						int integer13 = integer12 - co.r();
						if (Math.abs(integer11) != integer9 || Math.abs(integer13) != integer9 || random.nextInt(2) != 0) {
							co co14 = new co(integer10, integer7, integer12);
							azs azs15 = ajs.o(co14).a();
							if (azs15 == azs.a || azs15 == azs.j) {
								this.a(ajs, co14, this.a);
							}
						}
					}
				}
			}
		}

		return true;
	}
}
