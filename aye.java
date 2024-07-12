import java.util.Random;

public class aye extends ayr {
	private ayc.a c;

	public aye() {
	}

	public aye(ajs ajs, Random random, int integer3, int integer4, ayc.a a) {
		super(integer3, integer4);
		this.c = a;
		ayd.d d7 = new ayd.d(0, random, (integer3 << 4) + 2, (integer4 << 4) + 2, this.c);
		this.a.add(d7);
		d7.a(d7, this.a, random);
		this.d();
		if (a == ayc.a.MESA) {
			int integer8 = -5;
			int integer9 = ajs.K() - this.b.e + this.b.d() / 2 - -5;
			this.b.a(0, integer9, 0);

			for (ayq ayq11 : this.a) {
				ayq11.a(0, integer9, 0);
			}
		} else {
			this.a(ajs, random, 10);
		}
	}
}
