import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class bfq extends bfi {
	private final int g;
	private final bfg h;
	public int a;
	public int f;
	private final int i;
	private final int j;
	private String k = "";
	private int l = 32;
	private int m;
	private boolean n = true;
	private boolean o = true;
	private boolean p;
	private boolean q = true;
	private int r;
	private int s;
	private int t;
	private int u = 14737632;
	private int v = 7368816;
	private boolean w = true;
	private bgb.b x;
	private Predicate<String> y = Predicates.alwaysTrue();

	public bfq(int integer1, bfg bfg, int integer3, int integer4, int integer5, int integer6) {
		this.g = integer1;
		this.h = bfg;
		this.a = integer3;
		this.f = integer4;
		this.i = integer5;
		this.j = integer6;
	}

	public void a(bgb.b b) {
		this.x = b;
	}

	public void a() {
		this.m++;
	}

	public void a(String string) {
		if (this.y.apply(string)) {
			if (string.length() > this.l) {
				this.k = string.substring(0, this.l);
			} else {
				this.k = string;
			}

			this.f();
		}
	}

	public String b() {
		return this.k;
	}

	public String c() {
		int integer2 = this.s < this.t ? this.s : this.t;
		int integer3 = this.s < this.t ? this.t : this.s;
		return this.k.substring(integer2, integer3);
	}

	public void a(Predicate<String> predicate) {
		this.y = predicate;
	}

	public void b(String string) {
		String string3 = "";
		String string4 = g.a(string);
		int integer5 = this.s < this.t ? this.s : this.t;
		int integer6 = this.s < this.t ? this.t : this.s;
		int integer7 = this.l - this.k.length() - (integer5 - integer6);
		if (!this.k.isEmpty()) {
			string3 = string3 + this.k.substring(0, integer5);
		}

		int integer8;
		if (integer7 < string4.length()) {
			string3 = string3 + string4.substring(0, integer7);
			integer8 = integer7;
		} else {
			string3 = string3 + string4;
			integer8 = string4.length();
		}

		if (!this.k.isEmpty() && integer6 < this.k.length()) {
			string3 = string3 + this.k.substring(integer6);
		}

		if (this.y.apply(string3)) {
			this.k = string3;
			this.d(integer5 - this.t + integer8);
			this.a(this.g, this.k);
		}
	}

	public void a(int integer, String string) {
		if (this.x != null) {
			this.x.a(integer, string);
		}
	}

	public void a(int integer) {
		if (!this.k.isEmpty()) {
			if (this.t != this.s) {
				this.b("");
			} else {
				this.b(this.c(integer) - this.s);
			}
		}
	}

	public void b(int integer) {
		if (!this.k.isEmpty()) {
			if (this.t != this.s) {
				this.b("");
			} else {
				boolean boolean3 = integer < 0;
				int integer4 = boolean3 ? this.s + integer : this.s;
				int integer5 = boolean3 ? this.s : this.s + integer;
				String string6 = "";
				if (integer4 >= 0) {
					string6 = this.k.substring(0, integer4);
				}

				if (integer5 < this.k.length()) {
					string6 = string6 + this.k.substring(integer5);
				}

				if (this.y.apply(string6)) {
					this.k = string6;
					if (boolean3) {
						this.d(integer);
					}

					this.a(this.g, this.k);
				}
			}
		}
	}

	public int d() {
		return this.g;
	}

	public int c(int integer) {
		return this.a(integer, this.i());
	}

	public int a(int integer1, int integer2) {
		return this.a(integer1, integer2, true);
	}

	public int a(int integer1, int integer2, boolean boolean3) {
		int integer5 = integer2;
		boolean boolean6 = integer1 < 0;
		int integer7 = Math.abs(integer1);

		for (int integer8 = 0; integer8 < integer7; integer8++) {
			if (!boolean6) {
				int integer9 = this.k.length();
				integer5 = this.k.indexOf(32, integer5);
				if (integer5 == -1) {
					integer5 = integer9;
				} else {
					while (boolean3 && integer5 < integer9 && this.k.charAt(integer5) == ' ') {
						integer5++;
					}
				}
			} else {
				while (boolean3 && integer5 > 0 && this.k.charAt(integer5 - 1) == ' ') {
					integer5--;
				}

				while (integer5 > 0 && this.k.charAt(integer5 - 1) != ' ') {
					integer5--;
				}
			}
		}

		return integer5;
	}

	public void d(int integer) {
		this.e(this.t + integer);
	}

	public void e(int integer) {
		this.s = integer;
		int integer3 = this.k.length();
		this.s = ot.a(this.s, 0, integer3);
		this.i(this.s);
	}

	public void e() {
		this.e(0);
	}

	public void f() {
		this.e(this.k.length());
	}

	public boolean a(char character, int integer) {
		if (!this.p) {
			return false;
		} else if (bho.g(integer)) {
			this.f();
			this.i(0);
			return true;
		} else if (bho.f(integer)) {
			bho.e(this.c());
			return true;
		} else if (bho.e(integer)) {
			if (this.q) {
				this.b(bho.o());
			}

			return true;
		} else if (bho.d(integer)) {
			bho.e(this.c());
			if (this.q) {
				this.b("");
			}

			return true;
		} else {
			switch (integer) {
				case 14:
					if (bho.q()) {
						if (this.q) {
							this.a(-1);
						}
					} else if (this.q) {
						this.b(-1);
					}

					return true;
				case 199:
					if (bho.r()) {
						this.i(0);
					} else {
						this.e();
					}

					return true;
				case 203:
					if (bho.r()) {
						if (bho.q()) {
							this.i(this.a(-1, this.o()));
						} else {
							this.i(this.o() - 1);
						}
					} else if (bho.q()) {
						this.e(this.c(-1));
					} else {
						this.d(-1);
					}

					return true;
				case 205:
					if (bho.r()) {
						if (bho.q()) {
							this.i(this.a(1, this.o()));
						} else {
							this.i(this.o() + 1);
						}
					} else if (bho.q()) {
						this.e(this.c(1));
					} else {
						this.d(1);
					}

					return true;
				case 207:
					if (bho.r()) {
						this.i(this.k.length());
					} else {
						this.f();
					}

					return true;
				case 211:
					if (bho.q()) {
						if (this.q) {
							this.a(1);
						}
					} else if (this.q) {
						this.b(1);
					}

					return true;
				default:
					if (g.a(character)) {
						if (this.q) {
							this.b(Character.toString(character));
						}

						return true;
					} else {
						return false;
					}
			}
		}
	}

	public void a(int integer1, int integer2, int integer3) {
		boolean boolean5 = integer1 >= this.a && integer1 < this.a + this.i && integer2 >= this.f && integer2 < this.f + this.j;
		if (this.o) {
			this.b(boolean5);
		}

		if (this.p && boolean5 && integer3 == 0) {
			int integer6 = integer1 - this.a;
			if (this.n) {
				integer6 -= 4;
			}

			String string7 = this.h.a(this.k.substring(this.r), this.p());
			this.e(this.h.a(string7, integer6).length() + this.r);
		}
	}

	public void g() {
		if (this.r()) {
			if (this.j()) {
				a(this.a - 1, this.f - 1, this.a + this.i + 1, this.f + this.j + 1, -6250336);
				a(this.a, this.f, this.a + this.i, this.f + this.j, -16777216);
			}

			int integer2 = this.q ? this.u : this.v;
			int integer3 = this.s - this.r;
			int integer4 = this.t - this.r;
			String string5 = this.h.a(this.k.substring(this.r), this.p());
			boolean boolean6 = integer3 >= 0 && integer3 <= string5.length();
			boolean boolean7 = this.p && this.m / 6 % 2 == 0 && boolean6;
			int integer8 = this.n ? this.a + 4 : this.a;
			int integer9 = this.n ? this.f + (this.j - 8) / 2 : this.f;
			int integer10 = integer8;
			if (integer4 > string5.length()) {
				integer4 = string5.length();
			}

			if (!string5.isEmpty()) {
				String string11 = boolean6 ? string5.substring(0, integer3) : string5;
				integer10 = this.h.a(string11, (float)integer8, (float)integer9, integer2);
			}

			boolean boolean11 = this.s < this.k.length() || this.k.length() >= this.h();
			int integer12 = integer10;
			if (!boolean6) {
				integer12 = integer3 > 0 ? integer8 + this.i : integer8;
			} else if (boolean11) {
				integer12 = integer10 - 1;
				integer10--;
			}

			if (!string5.isEmpty() && boolean6 && integer3 < string5.length()) {
				integer10 = this.h.a(string5.substring(integer3), (float)integer10, (float)integer9, integer2);
			}

			if (boolean7) {
				if (boolean11) {
					bfi.a(integer12, integer9 - 1, integer12 + 1, integer9 + 1 + this.h.a, -3092272);
				} else {
					this.h.a("_", (float)integer12, (float)integer9, integer2);
				}
			}

			if (integer4 != integer3) {
				int integer13 = integer8 + this.h.a(string5.substring(0, integer4));
				this.c(integer12, integer9 - 1, integer13 - 1, integer9 + 1 + this.h.a);
			}
		}
	}

	private void c(int integer1, int integer2, int integer3, int integer4) {
		if (integer1 < integer3) {
			int integer6 = integer1;
			integer1 = integer3;
			integer3 = integer6;
		}

		if (integer2 < integer4) {
			int integer6 = integer2;
			integer2 = integer4;
			integer4 = integer6;
		}

		if (integer3 > this.a + this.i) {
			integer3 = this.a + this.i;
		}

		if (integer1 > this.a + this.i) {
			integer1 = this.a + this.i;
		}

		bqs bqs6 = bqs.a();
		bpy bpy7 = bqs6.c();
		bqg.c(0.0F, 0.0F, 255.0F, 255.0F);
		bqg.z();
		bqg.w();
		bqg.a(bqg.o.OR_REVERSE);
		bpy7.a(7, bzh.e);
		bpy7.b((double)integer1, (double)integer4, 0.0).d();
		bpy7.b((double)integer3, (double)integer4, 0.0).d();
		bpy7.b((double)integer3, (double)integer2, 0.0).d();
		bpy7.b((double)integer1, (double)integer2, 0.0).d();
		bqs6.b();
		bqg.x();
		bqg.y();
	}

	public void f(int integer) {
		this.l = integer;
		if (this.k.length() > integer) {
			this.k = this.k.substring(0, integer);
		}
	}

	public int h() {
		return this.l;
	}

	public int i() {
		return this.s;
	}

	public boolean j() {
		return this.n;
	}

	public void a(boolean boolean1) {
		this.n = boolean1;
	}

	public void g(int integer) {
		this.u = integer;
	}

	public void h(int integer) {
		this.v = integer;
	}

	public void b(boolean boolean1) {
		if (boolean1 && !this.p) {
			this.m = 0;
		}

		this.p = boolean1;
	}

	public boolean m() {
		return this.p;
	}

	public void c(boolean boolean1) {
		this.q = boolean1;
	}

	public int o() {
		return this.t;
	}

	public int p() {
		return this.j() ? this.i - 8 : this.i;
	}

	public void i(int integer) {
		int integer3 = this.k.length();
		if (integer > integer3) {
			integer = integer3;
		}

		if (integer < 0) {
			integer = 0;
		}

		this.t = integer;
		if (this.h != null) {
			if (this.r > integer3) {
				this.r = integer3;
			}

			int integer4 = this.p();
			String string5 = this.h.a(this.k.substring(this.r), integer4);
			int integer6 = string5.length() + this.r;
			if (integer == this.r) {
				this.r = this.r - this.h.a(this.k, integer4, true).length();
			}

			if (integer > integer6) {
				this.r += integer - integer6;
			} else if (integer <= this.r) {
				this.r = this.r - (this.r - integer);
			}

			this.r = ot.a(this.r, 0, integer3);
		}
	}

	public void d(boolean boolean1) {
		this.o = boolean1;
	}

	public boolean r() {
		return this.w;
	}

	public void e(boolean boolean1) {
		this.w = boolean1;
	}
}
