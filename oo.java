import javax.annotation.Nullable;

public class oo<V> {
	private transient oo.a<V>[] a;
	private transient int b;
	private int c;
	private final float d = 0.75F;

	public oo() {
		this.c = 12;
		this.a = new oo.a[16];
	}

	private static int g(int integer) {
		integer ^= integer >>> 20 ^ integer >>> 12;
		return integer ^ integer >>> 7 ^ integer >>> 4;
	}

	private static int a(int integer1, int integer2) {
		return integer1 & integer2 - 1;
	}

	@Nullable
	public V a(int integer) {
		int integer3 = g(integer);

		for (oo.a<V> a4 = this.a[a(integer3, this.a.length)]; a4 != null; a4 = a4.c) {
			if (a4.a == integer) {
				return a4.b;
			}
		}

		return null;
	}

	public boolean b(int integer) {
		return this.c(integer) != null;
	}

	@Nullable
	final oo.a<V> c(int integer) {
		int integer3 = g(integer);

		for (oo.a<V> a4 = this.a[a(integer3, this.a.length)]; a4 != null; a4 = a4.c) {
			if (a4.a == integer) {
				return a4;
			}
		}

		return null;
	}

	public void a(int integer, V object) {
		int integer4 = g(integer);
		int integer5 = a(integer4, this.a.length);

		for (oo.a<V> a6 = this.a[integer5]; a6 != null; a6 = a6.c) {
			if (a6.a == integer) {
				a6.b = object;
				return;
			}
		}

		this.a(integer4, integer, object, integer5);
	}

	private void h(int integer) {
		oo.a<V>[] arr3 = this.a;
		int integer4 = arr3.length;
		if (integer4 == 1073741824) {
			this.c = Integer.MAX_VALUE;
		} else {
			oo.a<V>[] arr5 = new oo.a[integer];
			this.a(arr5);
			this.a = arr5;
			this.c = (int)((float)integer * this.d);
		}
	}

	private void a(oo.a<V>[] arr) {
		oo.a<V>[] arr3 = this.a;
		int integer4 = arr.length;

		for (int integer5 = 0; integer5 < arr3.length; integer5++) {
			oo.a<V> a6 = arr3[integer5];
			if (a6 != null) {
				arr3[integer5] = null;

				while (true) {
					oo.a<V> a7 = a6.c;
					int integer8 = a(a6.d, integer4);
					a6.c = arr[integer8];
					arr[integer8] = a6;
					a6 = a7;
					if (a7 == null) {
						break;
					}
				}
			}
		}
	}

	@Nullable
	public V d(int integer) {
		oo.a<V> a3 = this.e(integer);
		return a3 == null ? null : a3.b;
	}

	@Nullable
	final oo.a<V> e(int integer) {
		int integer3 = g(integer);
		int integer4 = a(integer3, this.a.length);
		oo.a<V> a5 = this.a[integer4];
		oo.a<V> a6 = a5;

		while (a6 != null) {
			oo.a<V> a7 = a6.c;
			if (a6.a == integer) {
				this.b--;
				if (a5 == a6) {
					this.a[integer4] = a7;
				} else {
					a5.c = a7;
				}

				return a6;
			}

			a5 = a6;
			a6 = a7;
		}

		return a6;
	}

	public void c() {
		oo.a<V>[] arr2 = this.a;

		for (int integer3 = 0; integer3 < arr2.length; integer3++) {
			arr2[integer3] = null;
		}

		this.b = 0;
	}

	private void a(int integer1, int integer2, V object, int integer4) {
		oo.a<V> a6 = this.a[integer4];
		this.a[integer4] = new oo.a<>(integer1, integer2, object, a6);
		if (this.b++ >= this.c) {
			this.h(2 * this.a.length);
		}
	}

	static class a<V> {
		final int a;
		V b;
		oo.a<V> c;
		final int d;

		a(int integer1, int integer2, V object, oo.a<V> a) {
			this.b = object;
			this.c = a;
			this.a = integer2;
			this.d = integer1;
		}

		public final int a() {
			return this.a;
		}

		public final V b() {
			return this.b;
		}

		public final boolean equals(Object object) {
			if (!(object instanceof oo.a)) {
				return false;
			} else {
				oo.a<V> a3 = (oo.a<V>)object;
				if (this.a == a3.a) {
					Object object4 = this.b();
					Object object5 = a3.b();
					if (object4 == object5 || object4 != null && object4.equals(object5)) {
						return true;
					}
				}

				return false;
			}
		}

		public final int hashCode() {
			return oo.g(this.a);
		}

		public final String toString() {
			return this.a() + "=" + this.b();
		}
	}
}
