import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bgb extends bfy {
	private final List<bgb.d> u = Lists.newArrayList();
	private final oo<bfi> v = new oo<>();
	private final List<bfq> w = Lists.newArrayList();
	private final bgb.f[][] x;
	private int y;
	private final bgb.b z;
	private bfi A;

	public bgb(bes bes, int integer2, int integer3, int integer4, int integer5, int integer6, bgb.b b, bgb.f[]... arr) {
		super(bes, integer2, integer3, integer4, integer5, integer6);
		this.z = b;
		this.x = arr;
		this.k = false;
		this.s();
		this.t();
	}

	private void s() {
		for (bgb.f[] arr5 : this.x) {
			for (int integer6 = 0; integer6 < arr5.length; integer6 += 2) {
				bgb.f f7 = arr5[integer6];
				bgb.f f8 = integer6 < arr5.length - 1 ? arr5[integer6 + 1] : null;
				bfi bfi9 = this.a(f7, 0, f8 == null);
				bfi bfi10 = this.a(f8, 160, f7 == null);
				bgb.d d11 = new bgb.d(bfi9, bfi10);
				this.u.add(d11);
				if (f7 != null && bfi9 != null) {
					this.v.a(f7.b(), bfi9);
					if (bfi9 instanceof bfq) {
						this.w.add((bfq)bfi9);
					}
				}

				if (f8 != null && bfi10 != null) {
					this.v.a(f8.b(), bfi10);
					if (bfi10 instanceof bfq) {
						this.w.add((bfq)bfi10);
					}
				}
			}
		}
	}

	private void t() {
		this.u.clear();

		for (int integer2 = 0; integer2 < this.x[this.y].length; integer2 += 2) {
			bgb.f f3 = this.x[this.y][integer2];
			bgb.f f4 = integer2 < this.x[this.y].length - 1 ? this.x[this.y][integer2 + 1] : null;
			bfi bfi5 = this.v.a(f3.b());
			bfi bfi6 = f4 != null ? this.v.a(f4.b()) : null;
			bgb.d d7 = new bgb.d(bfi5, bfi6);
			this.u.add(d7);
		}
	}

	public void c(int integer) {
		if (integer != this.y) {
			int integer3 = this.y;
			this.y = integer;
			this.t();
			this.e(integer3, integer);
			this.n = 0.0F;
		}
	}

	public int e() {
		return this.y;
	}

	public int f() {
		return this.x.length;
	}

	public bfi g() {
		return this.A;
	}

	public void h() {
		if (this.y > 0) {
			this.c(this.y - 1);
		}
	}

	public void i() {
		if (this.y < this.x.length - 1) {
			this.c(this.y + 1);
		}
	}

	public bfi d(int integer) {
		return this.v.a(integer);
	}

	private void e(int integer1, int integer2) {
		for (bgb.f f7 : this.x[integer1]) {
			if (f7 != null) {
				this.a(this.v.a(f7.b()), false);
			}
		}

		for (bgb.f f7x : this.x[integer2]) {
			if (f7x != null) {
				this.a(this.v.a(f7x.b()), true);
			}
		}
	}

	private void a(bfi bfi, boolean boolean2) {
		if (bfi instanceof bfm) {
			((bfm)bfi).m = boolean2;
		} else if (bfi instanceof bfq) {
			((bfq)bfi).e(boolean2);
		} else if (bfi instanceof bfs) {
			((bfs)bfi).j = boolean2;
		}
	}

	@Nullable
	private bfi a(@Nullable bgb.f f, int integer, boolean boolean3) {
		if (f instanceof bgb.g) {
			return this.a(this.b / 2 - 155 + integer, 0, (bgb.g)f);
		} else if (f instanceof bgb.a) {
			return this.a(this.b / 2 - 155 + integer, 0, (bgb.a)f);
		} else if (f instanceof bgb.c) {
			return this.a(this.b / 2 - 155 + integer, 0, (bgb.c)f);
		} else {
			return f instanceof bgb.e ? this.a(this.b / 2 - 155 + integer, 0, (bgb.e)f, boolean3) : null;
		}
	}

	public void a(boolean boolean1) {
		for (bgb.d d4 : this.u) {
			if (d4.b instanceof bfm) {
				((bfm)d4.b).l = boolean1;
			}

			if (d4.c instanceof bfm) {
				((bfm)d4.c).l = boolean1;
			}
		}
	}

	@Override
	public boolean b(int integer1, int integer2, int integer3) {
		boolean boolean5 = super.b(integer1, integer2, integer3);
		int integer6 = this.c(integer1, integer2);
		if (integer6 >= 0) {
			bgb.d d7 = this.e(integer6);
			if (this.A != d7.d && this.A != null && this.A instanceof bfq) {
				((bfq)this.A).b(false);
			}

			this.A = d7.d;
		}

		return boolean5;
	}

	private bfr a(int integer1, int integer2, bgb.g g) {
		bfr bfr5 = new bfr(this.z, g.b(), integer1, integer2, g.c(), g.e(), g.f(), g.g(), g.a());
		bfr5.m = g.d();
		return bfr5;
	}

	private bfw a(int integer1, int integer2, bgb.a a) {
		bfw bfw5 = new bfw(this.z, a.b(), integer1, integer2, a.c(), a.a());
		bfw5.m = a.d();
		return bfw5;
	}

	private bfq a(int integer1, int integer2, bgb.c c) {
		bfq bfq5 = new bfq(c.b(), this.a.k, integer1, integer2, 150, 20);
		bfq5.a(c.c());
		bfq5.a(this.z);
		bfq5.e(c.d());
		bfq5.a(c.a());
		return bfq5;
	}

	private bfs a(int integer1, int integer2, bgb.e e, boolean boolean4) {
		bfs bfs6;
		if (boolean4) {
			bfs6 = new bfs(this.a.k, e.b(), integer1, integer2, this.b - integer1 * 2, 20, -1);
		} else {
			bfs6 = new bfs(this.a.k, e.b(), integer1, integer2, 150, 20, -1);
		}

		bfs6.j = e.d();
		bfs6.a(e.c());
		bfs6.a();
		return bfs6;
	}

	public void a(char character, int integer) {
		if (this.A instanceof bfq) {
			bfq bfq4 = (bfq)this.A;
			if (!bho.e(integer)) {
				if (integer == 15) {
					bfq4.b(false);
					int integer5 = this.w.indexOf(this.A);
					if (bho.r()) {
						if (integer5 == 0) {
							integer5 = this.w.size() - 1;
						} else {
							integer5--;
						}
					} else if (integer5 == this.w.size() - 1) {
						integer5 = 0;
					} else {
						integer5++;
					}

					this.A = (bfi)this.w.get(integer5);
					bfq4 = (bfq)this.A;
					bfq4.b(true);
					int integer6 = bfq4.f + this.h;
					int integer7 = bfq4.f;
					if (integer6 > this.e) {
						this.n = this.n + (float)(integer6 - this.e);
					} else if (integer7 < this.d) {
						this.n = (float)integer7;
					}
				} else {
					bfq4.a(character, integer);
				}
			} else {
				String string5 = bho.o();
				String[] arr6 = string5.split(";");
				int integer7 = this.w.indexOf(this.A);
				int integer8 = integer7;

				for (String string12 : arr6) {
					bfq bfq13 = (bfq)this.w.get(integer8);
					bfq13.a(string12);
					bfq13.a(bfq13.d(), string12);
					if (integer8 == this.w.size() - 1) {
						integer8 = 0;
					} else {
						integer8++;
					}

					if (integer8 == integer7) {
						break;
					}
				}
			}
		}
	}

	public bgb.d b(int integer) {
		return (bgb.d)this.u.get(integer);
	}

	@Override
	public int b() {
		return this.u.size();
	}

	@Override
	public int c() {
		return 400;
	}

	@Override
	protected int d() {
		return super.d() + 32;
	}

	public static class a extends bgb.f {
		private final boolean a;

		public a(int integer, String string, boolean boolean3, boolean boolean4) {
			super(integer, string, boolean3);
			this.a = boolean4;
		}

		public boolean a() {
			return this.a;
		}
	}

	public interface b {
		void a(int integer, boolean boolean2);

		void a(int integer, float float2);

		void a(int integer, String string);
	}

	public static class c extends bgb.f {
		private final Predicate<String> a;

		public c(int integer, String string, boolean boolean3, Predicate<String> predicate) {
			super(integer, string, boolean3);
			this.a = (Predicate<String>)Objects.firstNonNull(predicate, Predicates.alwaysTrue());
		}

		public Predicate<String> a() {
			return this.a;
		}
	}

	public static class d implements bfy.a {
		private final bes a = bes.z();
		private final bfi b;
		private final bfi c;
		private bfi d;

		public d(@Nullable bfi bfi1, @Nullable bfi bfi2) {
			this.b = bfi1;
			this.c = bfi2;
		}

		public bfi a() {
			return this.b;
		}

		public bfi b() {
			return this.c;
		}

		@Override
		public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, boolean boolean8) {
			this.a(this.b, integer3, integer6, integer7, false);
			this.a(this.c, integer3, integer6, integer7, false);
		}

		private void a(bfi bfi, int integer2, int integer3, int integer4, boolean boolean5) {
			if (bfi != null) {
				if (bfi instanceof bfm) {
					this.a((bfm)bfi, integer2, integer3, integer4, boolean5);
				} else if (bfi instanceof bfq) {
					this.a((bfq)bfi, integer2, boolean5);
				} else if (bfi instanceof bfs) {
					this.a((bfs)bfi, integer2, integer3, integer4, boolean5);
				}
			}
		}

		private void a(bfm bfm, int integer2, int integer3, int integer4, boolean boolean5) {
			bfm.i = integer2;
			if (!boolean5) {
				bfm.a(this.a, integer3, integer4);
			}
		}

		private void a(bfq bfq, int integer, boolean boolean3) {
			bfq.f = integer;
			if (!boolean3) {
				bfq.g();
			}
		}

		private void a(bfs bfs, int integer2, int integer3, int integer4, boolean boolean5) {
			bfs.h = integer2;
			if (!boolean5) {
				bfs.a(this.a, integer3, integer4);
			}
		}

		@Override
		public void a(int integer1, int integer2, int integer3) {
			this.a(this.b, integer3, 0, 0, true);
			this.a(this.c, integer3, 0, 0, true);
		}

		@Override
		public boolean a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			boolean boolean8 = this.a(this.b, integer2, integer3, integer4);
			boolean boolean9 = this.a(this.c, integer2, integer3, integer4);
			return boolean8 || boolean9;
		}

		private boolean a(bfi bfi, int integer2, int integer3, int integer4) {
			if (bfi == null) {
				return false;
			} else if (bfi instanceof bfm) {
				return this.a((bfm)bfi, integer2, integer3, integer4);
			} else {
				if (bfi instanceof bfq) {
					this.a((bfq)bfi, integer2, integer3, integer4);
				}

				return false;
			}
		}

		private boolean a(bfm bfm, int integer2, int integer3, int integer4) {
			boolean boolean6 = bfm.c(this.a, integer2, integer3);
			if (boolean6) {
				this.d = bfm;
			}

			return boolean6;
		}

		private void a(bfq bfq, int integer2, int integer3, int integer4) {
			bfq.a(integer2, integer3, integer4);
			if (bfq.m()) {
				this.d = bfq;
			}
		}

		@Override
		public void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			this.b(this.b, integer2, integer3, integer4);
			this.b(this.c, integer2, integer3, integer4);
		}

		private void b(bfi bfi, int integer2, int integer3, int integer4) {
			if (bfi != null) {
				if (bfi instanceof bfm) {
					this.b((bfm)bfi, integer2, integer3, integer4);
				}
			}
		}

		private void b(bfm bfm, int integer2, int integer3, int integer4) {
			bfm.a(integer2, integer3);
		}
	}

	public static class e extends bgb.f {
		public e(int integer, String string, boolean boolean3) {
			super(integer, string, boolean3);
		}
	}

	public static class f {
		private final int a;
		private final String b;
		private final boolean c;

		public f(int integer, String string, boolean boolean3) {
			this.a = integer;
			this.b = string;
			this.c = boolean3;
		}

		public int b() {
			return this.a;
		}

		public String c() {
			return this.b;
		}

		public boolean d() {
			return this.c;
		}
	}

	public static class g extends bgb.f {
		private final bfr.a a;
		private final float b;
		private final float c;
		private final float d;

		public g(int integer, String string, boolean boolean3, bfr.a a, float float5, float float6, float float7) {
			super(integer, string, boolean3);
			this.a = a;
			this.b = float5;
			this.c = float6;
			this.d = float7;
		}

		public bfr.a a() {
			return this.a;
		}

		public float e() {
			return this.b;
		}

		public float f() {
			return this.c;
		}

		public float g() {
			return this.d;
		}
	}
}
