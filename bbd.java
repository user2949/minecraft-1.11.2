import javax.annotation.Nullable;

public class bbd {
	private final bbb[] a;
	private bbb[] b = new bbb[0];
	private bbb[] c = new bbb[0];
	private bbb d;
	private int e;
	private int f;

	public bbd(bbb[] arr) {
		this.a = arr;
		this.f = arr.length;
	}

	public void a() {
		this.e++;
	}

	public boolean b() {
		return this.e >= this.f;
	}

	@Nullable
	public bbb c() {
		return this.f > 0 ? this.a[this.f - 1] : null;
	}

	public bbb a(int integer) {
		return this.a[integer];
	}

	public void a(int integer, bbb bbb) {
		this.a[integer] = bbb;
	}

	public int d() {
		return this.f;
	}

	public void b(int integer) {
		this.f = integer;
	}

	public int e() {
		return this.e;
	}

	public void c(int integer) {
		this.e = integer;
	}

	public bdw a(sn sn, int integer) {
		double double4 = (double)this.a[integer].a + (double)((int)(sn.G + 1.0F)) * 0.5;
		double double6 = (double)this.a[integer].b;
		double double8 = (double)this.a[integer].c + (double)((int)(sn.G + 1.0F)) * 0.5;
		return new bdw(double4, double6, double8);
	}

	public bdw a(sn sn) {
		return this.a(sn, this.e);
	}

	public bdw f() {
		bbb bbb2 = this.a[this.e];
		return new bdw((double)bbb2.a, (double)bbb2.b, (double)bbb2.c);
	}

	public boolean a(bbd bbd) {
		if (bbd == null) {
			return false;
		} else if (bbd.a.length != this.a.length) {
			return false;
		} else {
			for (int integer3 = 0; integer3 < this.a.length; integer3++) {
				if (this.a[integer3].a != bbd.a[integer3].a || this.a[integer3].b != bbd.a[integer3].b || this.a[integer3].c != bbd.a[integer3].c) {
					return false;
				}
			}

			return true;
		}
	}

	public bbb[] g() {
		return this.b;
	}

	public bbb[] h() {
		return this.c;
	}

	public bbb i() {
		return this.d;
	}

	public static bbd b(et et) {
		int integer2 = et.readInt();
		bbb bbb3 = bbb.b(et);
		bbb[] arr4 = new bbb[et.readInt()];

		for (int integer5 = 0; integer5 < arr4.length; integer5++) {
			arr4[integer5] = bbb.b(et);
		}

		bbb[] arr5 = new bbb[et.readInt()];

		for (int integer6 = 0; integer6 < arr5.length; integer6++) {
			arr5[integer6] = bbb.b(et);
		}

		bbb[] arr6 = new bbb[et.readInt()];

		for (int integer7 = 0; integer7 < arr6.length; integer7++) {
			arr6[integer7] = bbb.b(et);
		}

		bbd bbd7 = new bbd(arr4);
		bbd7.b = arr5;
		bbd7.c = arr6;
		bbd7.d = bbb3;
		bbd7.e = integer2;
		return bbd7;
	}
}
