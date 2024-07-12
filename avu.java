import java.util.Random;

public class avu {
	protected int e = 8;
	protected Random f = new Random();
	protected ajs g;

	public void a(ajs ajs, int integer2, int integer3, avp avp) {
		int integer6 = this.e;
		this.g = ajs;
		this.f.setSeed(ajs.O());
		long long7 = this.f.nextLong();
		long long9 = this.f.nextLong();

		for (int integer11 = integer2 - integer6; integer11 <= integer2 + integer6; integer11++) {
			for (int integer12 = integer3 - integer6; integer12 <= integer3 + integer6; integer12++) {
				long long13 = (long)integer11 * long7;
				long long15 = (long)integer12 * long9;
				this.f.setSeed(long13 ^ long15 ^ ajs.O());
				this.a(ajs, integer11, integer12, integer2, integer3, avp);
			}
		}
	}

	public static void a(long long1, Random random, int integer3, int integer4) {
		random.setSeed(long1);
		long long6 = random.nextLong();
		long long8 = random.nextLong();
		long long10 = (long)integer3 * long6;
		long long12 = (long)integer4 * long8;
		random.setSeed(long10 ^ long12 ^ long1);
	}

	protected void a(ajs ajs, int integer2, int integer3, int integer4, int integer5, avp avp) {
	}
}
