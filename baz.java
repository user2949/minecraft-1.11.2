public class baz {
	private bbb[] a = new bbb[128];
	private int b;

	public bbb a(bbb bbb) {
		if (bbb.d >= 0) {
			throw new IllegalStateException("OW KNOWS!");
		} else {
			if (this.b == this.a.length) {
				bbb[] arr3 = new bbb[this.b << 1];
				System.arraycopy(this.a, 0, arr3, 0, this.b);
				this.a = arr3;
			}

			this.a[this.b] = bbb;
			bbb.d = this.b;
			this.a(this.b++);
			return bbb;
		}
	}

	public void a() {
		this.b = 0;
	}

	public bbb c() {
		bbb bbb2 = this.a[0];
		this.a[0] = this.a[--this.b];
		this.a[this.b] = null;
		if (this.b > 0) {
			this.b(0);
		}

		bbb2.d = -1;
		return bbb2;
	}

	public void a(bbb bbb, float float2) {
		float float4 = bbb.g;
		bbb.g = float2;
		if (float2 < float4) {
			this.a(bbb.d);
		} else {
			this.b(bbb.d);
		}
	}

	private void a(int integer) {
		bbb bbb3 = this.a[integer];
		float float4 = bbb3.g;

		while (integer > 0) {
			int integer5 = integer - 1 >> 1;
			bbb bbb6 = this.a[integer5];
			if (!(float4 < bbb6.g)) {
				break;
			}

			this.a[integer] = bbb6;
			bbb6.d = integer;
			integer = integer5;
		}

		this.a[integer] = bbb3;
		bbb3.d = integer;
	}

	private void b(int integer) {
		bbb bbb3 = this.a[integer];
		float float4 = bbb3.g;

		while (true) {
			int integer5 = 1 + (integer << 1);
			int integer6 = integer5 + 1;
			if (integer5 >= this.b) {
				break;
			}

			bbb bbb7 = this.a[integer5];
			float float8 = bbb7.g;
			bbb bbb9;
			float float10;
			if (integer6 >= this.b) {
				bbb9 = null;
				float10 = Float.POSITIVE_INFINITY;
			} else {
				bbb9 = this.a[integer6];
				float10 = bbb9.g;
			}

			if (float8 < float10) {
				if (!(float8 < float4)) {
					break;
				}

				this.a[integer] = bbb7;
				bbb7.d = integer;
				integer = integer5;
			} else {
				if (!(float10 < float4)) {
					break;
				}

				this.a[integer] = bbb9;
				bbb9.d = integer;
				integer = integer6;
			}
		}

		this.a[integer] = bbb3;
		bbb3.d = integer;
	}

	public boolean e() {
		return this.b == 0;
	}
}
