import java.util.List;

public class bts implements btt.a {
	private final bes a;
	private aay b;
	private double c;
	private double d;
	private double e;

	public bts(bes bes) {
		this.a = bes;
	}

	@Override
	public void a(float float1, long long2) {
		this.b = this.a.h;
		this.c = this.b.M + (this.b.p - this.b.M) * (double)float1;
		this.d = this.b.N + (this.b.q - this.b.N) * (double)float1;
		this.e = this.b.O + (this.b.r - this.b.O) * (double)float1;
		ajs ajs5 = this.a.h.l;
		List<bdt> list6 = ajs5.a(this.b, this.b.bo().c(4.0, 4.0, 4.0));
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.d(2.0F);
		bqg.z();
		bqg.a(false);

		for (bdt bdt8 : list6) {
			bqm.a(bdt8.g(0.002).d(-this.c, -this.d, -this.e), 1.0F, 1.0F, 1.0F, 1.0F);
		}

		bqg.a(true);
		bqg.y();
		bqg.l();
	}
}
