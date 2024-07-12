import javax.annotation.Nullable;

public class bqv {
	protected final bqm a;
	protected final ajs b;
	protected int c;
	protected int d;
	protected int e;
	public bte[] f;

	public bqv(ajs ajs, int integer, bqm bqm, btf btf) {
		this.a = bqm;
		this.b = ajs;
		this.a(integer);
		this.a(btf);
	}

	protected void a(btf btf) {
		int integer3 = this.d * this.c * this.e;
		this.f = new bte[integer3];
		int integer4 = 0;

		for (int integer5 = 0; integer5 < this.d; integer5++) {
			for (int integer6 = 0; integer6 < this.c; integer6++) {
				for (int integer7 = 0; integer7 < this.e; integer7++) {
					int integer8 = (integer7 * this.c + integer6) * this.d + integer5;
					this.f[integer8] = btf.a(this.b, this.a, integer4++);
					this.f[integer8].a(integer5 * 16, integer6 * 16, integer7 * 16);
				}
			}
		}
	}

	public void a() {
		for (bte bte5 : this.f) {
			bte5.a();
		}
	}

	protected void a(int integer) {
		int integer3 = integer * 2 + 1;
		this.d = integer3;
		this.c = 16;
		this.e = integer3;
	}

	public void a(double double1, double double2) {
		int integer6 = ot.c(double1) - 8;
		int integer7 = ot.c(double2) - 8;
		int integer8 = this.d * 16;

		for (int integer9 = 0; integer9 < this.d; integer9++) {
			int integer10 = this.a(integer6, integer8, integer9);

			for (int integer11 = 0; integer11 < this.e; integer11++) {
				int integer12 = this.a(integer7, integer8, integer11);

				for (int integer13 = 0; integer13 < this.c; integer13++) {
					int integer14 = integer13 * 16;
					bte bte15 = this.f[(integer11 * this.c + integer13) * this.d + integer9];
					bte15.a(integer10, integer14, integer12);
				}
			}
		}
	}

	private int a(int integer1, int integer2, int integer3) {
		int integer5 = integer3 * 16;
		int integer6 = integer5 - integer1 + integer2 / 2;
		if (integer6 < 0) {
			integer6 -= integer2 - 1;
		}

		return integer5 - integer6 / integer2 * integer2;
	}

	public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, boolean boolean7) {
		int integer9 = ot.a(integer1, 16);
		int integer10 = ot.a(integer2, 16);
		int integer11 = ot.a(integer3, 16);
		int integer12 = ot.a(integer4, 16);
		int integer13 = ot.a(integer5, 16);
		int integer14 = ot.a(integer6, 16);

		for (int integer15 = integer9; integer15 <= integer12; integer15++) {
			int integer16 = integer15 % this.d;
			if (integer16 < 0) {
				integer16 += this.d;
			}

			for (int integer17 = integer10; integer17 <= integer13; integer17++) {
				int integer18 = integer17 % this.c;
				if (integer18 < 0) {
					integer18 += this.c;
				}

				for (int integer19 = integer11; integer19 <= integer14; integer19++) {
					int integer20 = integer19 % this.e;
					if (integer20 < 0) {
						integer20 += this.e;
					}

					int integer21 = (integer20 * this.c + integer18) * this.d + integer16;
					bte bte22 = this.f[integer21];
					bte22.a(boolean7);
				}
			}
		}
	}

	@Nullable
	protected bte a(co co) {
		int integer3 = ot.a(co.p(), 16);
		int integer4 = ot.a(co.q(), 16);
		int integer5 = ot.a(co.r(), 16);
		if (integer4 >= 0 && integer4 < this.c) {
			integer3 %= this.d;
			if (integer3 < 0) {
				integer3 += this.d;
			}

			integer5 %= this.e;
			if (integer5 < 0) {
				integer5 += this.e;
			}

			int integer6 = (integer5 * this.c + integer4) * this.d + integer3;
			return this.f[integer6];
		} else {
			return null;
		}
	}
}
