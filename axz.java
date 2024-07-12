import com.google.common.base.Objects;

public class axz {
	public int a;
	public int b;
	public int c;
	public int d;
	public int e;
	public int f;

	public axz() {
	}

	public axz(int[] arr) {
		if (arr.length == 6) {
			this.a = arr[0];
			this.b = arr[1];
			this.c = arr[2];
			this.d = arr[3];
			this.e = arr[4];
			this.f = arr[5];
		}
	}

	public static axz a() {
		return new axz(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
	}

	public static axz a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, int integer9, cv cv) {
		switch (cv) {
			case NORTH:
				return new axz(
					integer1 + integer4,
					integer2 + integer5,
					integer3 - integer9 + 1 + integer6,
					integer1 + integer7 - 1 + integer4,
					integer2 + integer8 - 1 + integer5,
					integer3 + integer6
				);
			case SOUTH:
				return new axz(
					integer1 + integer4,
					integer2 + integer5,
					integer3 + integer6,
					integer1 + integer7 - 1 + integer4,
					integer2 + integer8 - 1 + integer5,
					integer3 + integer9 - 1 + integer6
				);
			case WEST:
				return new axz(
					integer1 - integer9 + 1 + integer6,
					integer2 + integer5,
					integer3 + integer4,
					integer1 + integer6,
					integer2 + integer8 - 1 + integer5,
					integer3 + integer7 - 1 + integer4
				);
			case EAST:
				return new axz(
					integer1 + integer6,
					integer2 + integer5,
					integer3 + integer4,
					integer1 + integer9 - 1 + integer6,
					integer2 + integer8 - 1 + integer5,
					integer3 + integer7 - 1 + integer4
				);
			default:
				return new axz(
					integer1 + integer4,
					integer2 + integer5,
					integer3 + integer6,
					integer1 + integer7 - 1 + integer4,
					integer2 + integer8 - 1 + integer5,
					integer3 + integer9 - 1 + integer6
				);
		}
	}

	public static axz a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		return new axz(
			Math.min(integer1, integer4),
			Math.min(integer2, integer5),
			Math.min(integer3, integer6),
			Math.max(integer1, integer4),
			Math.max(integer2, integer5),
			Math.max(integer3, integer6)
		);
	}

	public axz(axz axz) {
		this.a = axz.a;
		this.b = axz.b;
		this.c = axz.c;
		this.d = axz.d;
		this.e = axz.e;
		this.f = axz.f;
	}

	public axz(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.a = integer1;
		this.b = integer2;
		this.c = integer3;
		this.d = integer4;
		this.e = integer5;
		this.f = integer6;
	}

	public axz(dl dl1, dl dl2) {
		this.a = Math.min(dl1.p(), dl2.p());
		this.b = Math.min(dl1.q(), dl2.q());
		this.c = Math.min(dl1.r(), dl2.r());
		this.d = Math.max(dl1.p(), dl2.p());
		this.e = Math.max(dl1.q(), dl2.q());
		this.f = Math.max(dl1.r(), dl2.r());
	}

	public axz(int integer1, int integer2, int integer3, int integer4) {
		this.a = integer1;
		this.c = integer2;
		this.d = integer3;
		this.f = integer4;
		this.b = 1;
		this.e = 512;
	}

	public boolean a(axz axz) {
		return this.d >= axz.a && this.a <= axz.d && this.f >= axz.c && this.c <= axz.f && this.e >= axz.b && this.b <= axz.e;
	}

	public boolean a(int integer1, int integer2, int integer3, int integer4) {
		return this.d >= integer1 && this.a <= integer3 && this.f >= integer2 && this.c <= integer4;
	}

	public void b(axz axz) {
		this.a = Math.min(this.a, axz.a);
		this.b = Math.min(this.b, axz.b);
		this.c = Math.min(this.c, axz.c);
		this.d = Math.max(this.d, axz.d);
		this.e = Math.max(this.e, axz.e);
		this.f = Math.max(this.f, axz.f);
	}

	public void a(int integer1, int integer2, int integer3) {
		this.a += integer1;
		this.b += integer2;
		this.c += integer3;
		this.d += integer1;
		this.e += integer2;
		this.f += integer3;
	}

	public boolean b(dl dl) {
		return dl.p() >= this.a && dl.p() <= this.d && dl.r() >= this.c && dl.r() <= this.f && dl.q() >= this.b && dl.q() <= this.e;
	}

	public dl b() {
		return new dl(this.d - this.a, this.e - this.b, this.f - this.c);
	}

	public int c() {
		return this.d - this.a + 1;
	}

	public int d() {
		return this.e - this.b + 1;
	}

	public int e() {
		return this.f - this.c + 1;
	}

	public String toString() {
		return Objects.toStringHelper(this).add("x0", this.a).add("y0", this.b).add("z0", this.c).add("x1", this.d).add("y1", this.e).add("z1", this.f).toString();
	}

	public dy g() {
		return new dy(new int[]{this.a, this.b, this.c, this.d, this.e, this.f});
	}
}
