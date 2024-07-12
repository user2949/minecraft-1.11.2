import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class byw {
	private final int a;
	private final Set<byw.a> b = Sets.newHashSetWithExpectedSize(256);
	private final List<byw.b> c = Lists.newArrayListWithCapacity(256);
	private int d;
	private int e;
	private final int f;
	private final int g;
	private final int h;

	public byw(int integer1, int integer2, int integer3, int integer4) {
		this.a = integer4;
		this.f = integer1;
		this.g = integer2;
		this.h = integer3;
	}

	public int a() {
		return this.d;
	}

	public int b() {
		return this.e;
	}

	public void a(byz byz) {
		byw.a a3 = new byw.a(byz, this.a);
		if (this.h > 0) {
			a3.a(this.h);
		}

		this.b.add(a3);
	}

	public void c() {
		byw.a[] arr2 = (byw.a[])this.b.toArray(new byw.a[this.b.size()]);
		Arrays.sort(arr2);

		for (byw.a a6 : arr2) {
			if (!this.a(a6)) {
				String string7 = String.format("Unable to fit: %s - size: %dx%d - Maybe try a lowerresolution resourcepack?", a6.a().i(), a6.a().c(), a6.a().d());
				throw new byx(a6, string7);
			}
		}

		this.d = ot.c(this.d);
		this.e = ot.c(this.e);
	}

	public List<byz> d() {
		List<byw.b> list2 = Lists.newArrayList();

		for (byw.b b4 : this.c) {
			b4.a(list2);
		}

		List<byz> list3 = Lists.newArrayList();

		for (byw.b b5 : list2) {
			byw.a a6 = b5.a();
			byz byz7 = a6.a();
			byz7.a(this.d, this.e, b5.b(), b5.c(), a6.e());
			list3.add(byz7);
		}

		return list3;
	}

	private static int b(int integer1, int integer2) {
		return (integer1 >> integer2) + ((integer1 & (1 << integer2) - 1) == 0 ? 0 : 1) << integer2;
	}

	private boolean a(byw.a a) {
		byz byz3 = a.a();
		boolean boolean4 = byz3.c() != byz3.d();

		for (int integer5 = 0; integer5 < this.c.size(); integer5++) {
			if (((byw.b)this.c.get(integer5)).a(a)) {
				return true;
			}

			if (boolean4) {
				a.d();
				if (((byw.b)this.c.get(integer5)).a(a)) {
					return true;
				}

				a.d();
			}
		}

		return this.b(a);
	}

	private boolean b(byw.a a) {
		int integer3 = Math.min(a.b(), a.c());
		int integer4 = Math.max(a.b(), a.c());
		int integer6 = ot.c(this.d);
		int integer7 = ot.c(this.e);
		int integer8 = ot.c(this.d + integer3);
		int integer9 = ot.c(this.e + integer3);
		boolean boolean10 = integer8 <= this.f;
		boolean boolean11 = integer9 <= this.g;
		if (!boolean10 && !boolean11) {
			return false;
		} else {
			boolean boolean12 = boolean10 && integer6 != integer8;
			boolean boolean13 = boolean11 && integer7 != integer9;
			boolean boolean5;
			if (boolean12 ^ boolean13) {
				boolean5 = boolean12;
			} else {
				boolean5 = boolean10 && integer6 <= integer7;
			}

			byw.b b14;
			if (boolean5) {
				if (a.b() > a.c()) {
					a.d();
				}

				if (this.e == 0) {
					this.e = a.c();
				}

				b14 = new byw.b(this.d, 0, a.b(), this.e);
				this.d = this.d + a.b();
			} else {
				b14 = new byw.b(0, this.e, this.d, a.c());
				this.e = this.e + a.c();
			}

			b14.a(a);
			this.c.add(b14);
			return true;
		}
	}

	public static class a implements Comparable<byw.a> {
		private final byz a;
		private final int b;
		private final int c;
		private final int d;
		private boolean e;
		private float f = 1.0F;

		public a(byz byz, int integer) {
			this.a = byz;
			this.b = byz.c();
			this.c = byz.d();
			this.d = integer;
			this.e = byw.b(this.c, integer) > byw.b(this.b, integer);
		}

		public byz a() {
			return this.a;
		}

		public int b() {
			int integer2 = this.e ? this.c : this.b;
			return byw.b((int)((float)integer2 * this.f), this.d);
		}

		public int c() {
			int integer2 = this.e ? this.b : this.c;
			return byw.b((int)((float)integer2 * this.f), this.d);
		}

		public void d() {
			this.e = !this.e;
		}

		public boolean e() {
			return this.e;
		}

		public void a(int integer) {
			if (this.b > integer && this.c > integer) {
				this.f = (float)integer / (float)Math.min(this.b, this.c);
			}
		}

		public String toString() {
			return "Holder{width=" + this.b + ", height=" + this.c + '}';
		}

		public int compareTo(byw.a a) {
			int integer3;
			if (this.c() == a.c()) {
				if (this.b() == a.b()) {
					if (this.a.i() == null) {
						return a.a.i() == null ? 0 : -1;
					}

					return this.a.i().compareTo(a.a.i());
				}

				integer3 = this.b() < a.b() ? 1 : -1;
			} else {
				integer3 = this.c() < a.c() ? 1 : -1;
			}

			return integer3;
		}
	}

	public static class b {
		private final int a;
		private final int b;
		private final int c;
		private final int d;
		private List<byw.b> e;
		private byw.a f;

		public b(int integer1, int integer2, int integer3, int integer4) {
			this.a = integer1;
			this.b = integer2;
			this.c = integer3;
			this.d = integer4;
		}

		public byw.a a() {
			return this.f;
		}

		public int b() {
			return this.a;
		}

		public int c() {
			return this.b;
		}

		public boolean a(byw.a a) {
			if (this.f != null) {
				return false;
			} else {
				int integer3 = a.b();
				int integer4 = a.c();
				if (integer3 <= this.c && integer4 <= this.d) {
					if (integer3 == this.c && integer4 == this.d) {
						this.f = a;
						return true;
					} else {
						if (this.e == null) {
							this.e = Lists.newArrayListWithCapacity(1);
							this.e.add(new byw.b(this.a, this.b, integer3, integer4));
							int integer5 = this.c - integer3;
							int integer6 = this.d - integer4;
							if (integer6 > 0 && integer5 > 0) {
								int integer7 = Math.max(this.d, integer5);
								int integer8 = Math.max(this.c, integer6);
								if (integer7 >= integer8) {
									this.e.add(new byw.b(this.a, this.b + integer4, integer3, integer6));
									this.e.add(new byw.b(this.a + integer3, this.b, integer5, this.d));
								} else {
									this.e.add(new byw.b(this.a + integer3, this.b, integer5, integer4));
									this.e.add(new byw.b(this.a, this.b + integer4, this.c, integer6));
								}
							} else if (integer5 == 0) {
								this.e.add(new byw.b(this.a, this.b + integer4, integer3, integer6));
							} else if (integer6 == 0) {
								this.e.add(new byw.b(this.a + integer3, this.b, integer5, integer4));
							}
						}

						for (byw.b b6 : this.e) {
							if (b6.a(a)) {
								return true;
							}
						}

						return false;
					}
				} else {
					return false;
				}
			}
		}

		public void a(List<byw.b> list) {
			if (this.f != null) {
				list.add(this);
			} else if (this.e != null) {
				for (byw.b b4 : this.e) {
					b4.a(list);
				}
			}
		}

		public String toString() {
			return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + this.f + ", subSlots=" + this.e + '}';
		}
	}
}
