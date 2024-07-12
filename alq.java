import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public abstract class alq extends alu {
	protected static final bdt a = new bdt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
	protected static final bdt b = new bdt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);
	protected final boolean c;

	public static boolean b(ajs ajs, co co) {
		return i(ajs.o(co));
	}

	public static boolean i(atl atl) {
		alu alu2 = atl.v();
		return alu2 == alv.av || alu2 == alv.D || alu2 == alv.E || alu2 == alv.cs;
	}

	protected alq(boolean boolean1) {
		super(azs.q);
		this.c = boolean1;
		this.a(aej.e);
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		alq.b b5 = atl.v() == this ? atl.c(this.g()) : null;
		return b5 != null && b5.c() ? b : a;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return ajs.o(co.b()).r();
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			atl = this.a(ajs, co, atl, true);
			if (this.c) {
				atl.a(ajs, co, this, co);
			}
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.E) {
			alq.b b7 = atl.c(this.g());
			boolean boolean8 = false;
			if (!ajs.o(co3.b()).r()) {
				boolean8 = true;
			}

			if (b7 == alq.b.ASCENDING_EAST && !ajs.o(co3.f()).r()) {
				boolean8 = true;
			} else if (b7 == alq.b.ASCENDING_WEST && !ajs.o(co3.e()).r()) {
				boolean8 = true;
			} else if (b7 == alq.b.ASCENDING_NORTH && !ajs.o(co3.c()).r()) {
				boolean8 = true;
			} else if (b7 == alq.b.ASCENDING_SOUTH && !ajs.o(co3.d()).r()) {
				boolean8 = true;
			}

			if (boolean8 && !ajs.d(co3)) {
				this.b(ajs, co3, atl, 0);
				ajs.g(co3);
			} else {
				this.a(atl, ajs, co3, alu);
			}
		}
	}

	protected void a(atl atl, ajs ajs, co co, alu alu) {
	}

	protected atl a(ajs ajs, co co, atl atl, boolean boolean4) {
		return ajs.E ? atl : new alq.a(ajs, co, atl).a(ajs.y(co), boolean4).c();
	}

	@Override
	public azv h(atl atl) {
		return azv.NORMAL;
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		super.b(ajs, co, atl);
		if (((alq.b)atl.c(this.g())).c()) {
			ajs.b(co.a(), this, false);
		}

		if (this.c) {
			ajs.b(co, this, false);
			ajs.b(co.b(), this, false);
		}
	}

	public abstract aub<alq.b> g();

	public class a {
		private final ajs b;
		private final co c;
		private final alq d;
		private atl e;
		private final boolean f;
		private final List<co> g = Lists.newArrayList();

		public a(ajs ajs, co co, atl atl) {
			this.b = ajs;
			this.c = co;
			this.e = atl;
			this.d = (alq)atl.v();
			alq.b b6 = atl.c(this.d.g());
			this.f = this.d.c;
			this.a(b6);
		}

		public List<co> a() {
			return this.g;
		}

		private void a(alq.b b) {
			this.g.clear();
			switch (b) {
				case NORTH_SOUTH:
					this.g.add(this.c.c());
					this.g.add(this.c.d());
					break;
				case EAST_WEST:
					this.g.add(this.c.e());
					this.g.add(this.c.f());
					break;
				case ASCENDING_EAST:
					this.g.add(this.c.e());
					this.g.add(this.c.f().a());
					break;
				case ASCENDING_WEST:
					this.g.add(this.c.e().a());
					this.g.add(this.c.f());
					break;
				case ASCENDING_NORTH:
					this.g.add(this.c.c().a());
					this.g.add(this.c.d());
					break;
				case ASCENDING_SOUTH:
					this.g.add(this.c.c());
					this.g.add(this.c.d().a());
					break;
				case SOUTH_EAST:
					this.g.add(this.c.f());
					this.g.add(this.c.d());
					break;
				case SOUTH_WEST:
					this.g.add(this.c.e());
					this.g.add(this.c.d());
					break;
				case NORTH_WEST:
					this.g.add(this.c.e());
					this.g.add(this.c.c());
					break;
				case NORTH_EAST:
					this.g.add(this.c.f());
					this.g.add(this.c.c());
			}
		}

		private void d() {
			for (int integer2 = 0; integer2 < this.g.size(); integer2++) {
				alq.a a3 = this.b((co)this.g.get(integer2));
				if (a3 != null && a3.a(this)) {
					this.g.set(integer2, a3.c);
				} else {
					this.g.remove(integer2--);
				}
			}
		}

		private boolean a(co co) {
			return alq.b(this.b, co) || alq.b(this.b, co.a()) || alq.b(this.b, co.b());
		}

		@Nullable
		private alq.a b(co co) {
			atl atl4 = this.b.o(co);
			if (alq.i(atl4)) {
				return alq.this.new a(this.b, co, atl4);
			} else {
				co co3 = co.a();
				atl4 = this.b.o(co3);
				if (alq.i(atl4)) {
					return alq.this.new a(this.b, co3, atl4);
				} else {
					co3 = co.b();
					atl4 = this.b.o(co3);
					return alq.i(atl4) ? alq.this.new a(this.b, co3, atl4) : null;
				}
			}
		}

		private boolean a(alq.a a) {
			return this.c(a.c);
		}

		private boolean c(co co) {
			for (int integer3 = 0; integer3 < this.g.size(); integer3++) {
				co co4 = (co)this.g.get(integer3);
				if (co4.p() == co.p() && co4.r() == co.r()) {
					return true;
				}
			}

			return false;
		}

		protected int b() {
			int integer2 = 0;

			for (cv cv4 : cv.c.HORIZONTAL) {
				if (this.a(this.c.a(cv4))) {
					integer2++;
				}
			}

			return integer2;
		}

		private boolean b(alq.a a) {
			return this.a(a) || this.g.size() != 2;
		}

		private void c(alq.a a) {
			this.g.add(a.c);
			co co3 = this.c.c();
			co co4 = this.c.d();
			co co5 = this.c.e();
			co co6 = this.c.f();
			boolean boolean7 = this.c(co3);
			boolean boolean8 = this.c(co4);
			boolean boolean9 = this.c(co5);
			boolean boolean10 = this.c(co6);
			alq.b b11 = null;
			if (boolean7 || boolean8) {
				b11 = alq.b.NORTH_SOUTH;
			}

			if (boolean9 || boolean10) {
				b11 = alq.b.EAST_WEST;
			}

			if (!this.f) {
				if (boolean8 && boolean10 && !boolean7 && !boolean9) {
					b11 = alq.b.SOUTH_EAST;
				}

				if (boolean8 && boolean9 && !boolean7 && !boolean10) {
					b11 = alq.b.SOUTH_WEST;
				}

				if (boolean7 && boolean9 && !boolean8 && !boolean10) {
					b11 = alq.b.NORTH_WEST;
				}

				if (boolean7 && boolean10 && !boolean8 && !boolean9) {
					b11 = alq.b.NORTH_EAST;
				}
			}

			if (b11 == alq.b.NORTH_SOUTH) {
				if (alq.b(this.b, co3.a())) {
					b11 = alq.b.ASCENDING_NORTH;
				}

				if (alq.b(this.b, co4.a())) {
					b11 = alq.b.ASCENDING_SOUTH;
				}
			}

			if (b11 == alq.b.EAST_WEST) {
				if (alq.b(this.b, co6.a())) {
					b11 = alq.b.ASCENDING_EAST;
				}

				if (alq.b(this.b, co5.a())) {
					b11 = alq.b.ASCENDING_WEST;
				}
			}

			if (b11 == null) {
				b11 = alq.b.NORTH_SOUTH;
			}

			this.e = this.e.a(this.d.g(), b11);
			this.b.a(this.c, this.e, 3);
		}

		private boolean d(co co) {
			alq.a a3 = this.b(co);
			if (a3 == null) {
				return false;
			} else {
				a3.d();
				return a3.b(this);
			}
		}

		public alq.a a(boolean boolean1, boolean boolean2) {
			co co4 = this.c.c();
			co co5 = this.c.d();
			co co6 = this.c.e();
			co co7 = this.c.f();
			boolean boolean8 = this.d(co4);
			boolean boolean9 = this.d(co5);
			boolean boolean10 = this.d(co6);
			boolean boolean11 = this.d(co7);
			alq.b b12 = null;
			if ((boolean8 || boolean9) && !boolean10 && !boolean11) {
				b12 = alq.b.NORTH_SOUTH;
			}

			if ((boolean10 || boolean11) && !boolean8 && !boolean9) {
				b12 = alq.b.EAST_WEST;
			}

			if (!this.f) {
				if (boolean9 && boolean11 && !boolean8 && !boolean10) {
					b12 = alq.b.SOUTH_EAST;
				}

				if (boolean9 && boolean10 && !boolean8 && !boolean11) {
					b12 = alq.b.SOUTH_WEST;
				}

				if (boolean8 && boolean10 && !boolean9 && !boolean11) {
					b12 = alq.b.NORTH_WEST;
				}

				if (boolean8 && boolean11 && !boolean9 && !boolean10) {
					b12 = alq.b.NORTH_EAST;
				}
			}

			if (b12 == null) {
				if (boolean8 || boolean9) {
					b12 = alq.b.NORTH_SOUTH;
				}

				if (boolean10 || boolean11) {
					b12 = alq.b.EAST_WEST;
				}

				if (!this.f) {
					if (boolean1) {
						if (boolean9 && boolean11) {
							b12 = alq.b.SOUTH_EAST;
						}

						if (boolean10 && boolean9) {
							b12 = alq.b.SOUTH_WEST;
						}

						if (boolean11 && boolean8) {
							b12 = alq.b.NORTH_EAST;
						}

						if (boolean8 && boolean10) {
							b12 = alq.b.NORTH_WEST;
						}
					} else {
						if (boolean8 && boolean10) {
							b12 = alq.b.NORTH_WEST;
						}

						if (boolean11 && boolean8) {
							b12 = alq.b.NORTH_EAST;
						}

						if (boolean10 && boolean9) {
							b12 = alq.b.SOUTH_WEST;
						}

						if (boolean9 && boolean11) {
							b12 = alq.b.SOUTH_EAST;
						}
					}
				}
			}

			if (b12 == alq.b.NORTH_SOUTH) {
				if (alq.b(this.b, co4.a())) {
					b12 = alq.b.ASCENDING_NORTH;
				}

				if (alq.b(this.b, co5.a())) {
					b12 = alq.b.ASCENDING_SOUTH;
				}
			}

			if (b12 == alq.b.EAST_WEST) {
				if (alq.b(this.b, co7.a())) {
					b12 = alq.b.ASCENDING_EAST;
				}

				if (alq.b(this.b, co6.a())) {
					b12 = alq.b.ASCENDING_WEST;
				}
			}

			if (b12 == null) {
				b12 = alq.b.NORTH_SOUTH;
			}

			this.a(b12);
			this.e = this.e.a(this.d.g(), b12);
			if (boolean2 || this.b.o(this.c) != this.e) {
				this.b.a(this.c, this.e, 3);

				for (int integer13 = 0; integer13 < this.g.size(); integer13++) {
					alq.a a14 = this.b((co)this.g.get(integer13));
					if (a14 != null) {
						a14.d();
						if (a14.b(this)) {
							a14.c(this);
						}
					}
				}
			}

			return this;
		}

		public atl c() {
			return this.e;
		}
	}

	public static enum b implements ox {
		NORTH_SOUTH(0, "north_south"),
		EAST_WEST(1, "east_west"),
		ASCENDING_EAST(2, "ascending_east"),
		ASCENDING_WEST(3, "ascending_west"),
		ASCENDING_NORTH(4, "ascending_north"),
		ASCENDING_SOUTH(5, "ascending_south"),
		SOUTH_EAST(6, "south_east"),
		SOUTH_WEST(7, "south_west"),
		NORTH_WEST(8, "north_west"),
		NORTH_EAST(9, "north_east");

		private static final alq.b[] k = new alq.b[values().length];
		private final int l;
		private final String m;

		private b(int integer3, String string4) {
			this.l = integer3;
			this.m = string4;
		}

		public int a() {
			return this.l;
		}

		public String toString() {
			return this.m;
		}

		public boolean c() {
			return this == ASCENDING_NORTH || this == ASCENDING_EAST || this == ASCENDING_SOUTH || this == ASCENDING_WEST;
		}

		public static alq.b a(int integer) {
			if (integer < 0 || integer >= k.length) {
				integer = 0;
			}

			return k[integer];
		}

		@Override
		public String m() {
			return this.m;
		}

		static {
			for (alq.b b4 : values()) {
				k[b4.a()] = b4;
			}
		}
	}
}
