import org.apache.commons.lang3.Validate;

public class oe {
	private final long[] a;
	private final int b;
	private final long c;
	private final int d;

	public oe(int integer1, int integer2) {
		Validate.inclusiveBetween(1L, 32L, (long)integer1);
		this.d = integer2;
		this.b = integer1;
		this.c = (1L << integer1) - 1L;
		this.a = new long[ot.c(integer2 * integer1, 64) / 64];
	}

	public void a(int integer1, int integer2) {
		Validate.inclusiveBetween(0L, (long)(this.d - 1), (long)integer1);
		Validate.inclusiveBetween(0L, this.c, (long)integer2);
		int integer4 = integer1 * this.b;
		int integer5 = integer4 / 64;
		int integer6 = ((integer1 + 1) * this.b - 1) / 64;
		int integer7 = integer4 % 64;
		this.a[integer5] = this.a[integer5] & ~(this.c << integer7) | ((long)integer2 & this.c) << integer7;
		if (integer5 != integer6) {
			int integer8 = 64 - integer7;
			int integer9 = this.b - integer8;
			this.a[integer6] = this.a[integer6] >>> integer9 << integer9 | ((long)integer2 & this.c) >> integer8;
		}
	}

	public int a(int integer) {
		Validate.inclusiveBetween(0L, (long)(this.d - 1), (long)integer);
		int integer3 = integer * this.b;
		int integer4 = integer3 / 64;
		int integer5 = ((integer + 1) * this.b - 1) / 64;
		int integer6 = integer3 % 64;
		if (integer4 == integer5) {
			return (int)(this.a[integer4] >>> integer6 & this.c);
		} else {
			int integer7 = 64 - integer6;
			return (int)((this.a[integer4] >>> integer6 | this.a[integer5] << integer7) & this.c);
		}
	}

	public long[] a() {
		return this.a;
	}

	public int b() {
		return this.d;
	}
}
