import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ayg {
	private static final ayg.n[] a = new ayg.n[]{
		new ayg.n(ayg.c.class, 30, 0, true),
		new ayg.n(ayg.a.class, 10, 4),
		new ayg.n(ayg.o.class, 10, 4),
		new ayg.n(ayg.p.class, 10, 3),
		new ayg.n(ayg.l.class, 5, 2),
		new ayg.n(ayg.f.class, 5, 1)
	};
	private static final ayg.n[] b = new ayg.n[]{
		new ayg.n(ayg.i.class, 25, 0, true),
		new ayg.n(ayg.g.class, 15, 5),
		new ayg.n(ayg.j.class, 5, 10),
		new ayg.n(ayg.h.class, 5, 10),
		new ayg.n(ayg.d.class, 10, 3, true),
		new ayg.n(ayg.e.class, 7, 2),
		new ayg.n(ayg.k.class, 5, 2)
	};

	public static void a() {
		ayo.a(ayg.a.class, "NeBCr");
		ayo.a(ayg.b.class, "NeBEF");
		ayo.a(ayg.c.class, "NeBS");
		ayo.a(ayg.d.class, "NeCCS");
		ayo.a(ayg.e.class, "NeCTB");
		ayo.a(ayg.f.class, "NeCE");
		ayo.a(ayg.g.class, "NeSCSC");
		ayo.a(ayg.h.class, "NeSCLT");
		ayo.a(ayg.i.class, "NeSC");
		ayo.a(ayg.j.class, "NeSCRT");
		ayo.a(ayg.k.class, "NeCSR");
		ayo.a(ayg.l.class, "NeMT");
		ayo.a(ayg.o.class, "NeRC");
		ayo.a(ayg.p.class, "NeSR");
		ayo.a(ayg.q.class, "NeStart");
	}

	private static ayg.m b(ayg.n n, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
		Class<? extends ayg.m> class9 = n.a;
		ayg.m m10 = null;
		if (class9 == ayg.c.class) {
			m10 = ayg.c.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class9 == ayg.a.class) {
			m10 = ayg.a.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class9 == ayg.o.class) {
			m10 = ayg.o.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class9 == ayg.p.class) {
			m10 = ayg.p.a(list, random, integer4, integer5, integer6, integer8, cv);
		} else if (class9 == ayg.l.class) {
			m10 = ayg.l.a(list, random, integer4, integer5, integer6, integer8, cv);
		} else if (class9 == ayg.f.class) {
			m10 = ayg.f.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class9 == ayg.i.class) {
			m10 = ayg.i.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class9 == ayg.j.class) {
			m10 = ayg.j.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class9 == ayg.h.class) {
			m10 = ayg.h.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class9 == ayg.d.class) {
			m10 = ayg.d.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class9 == ayg.e.class) {
			m10 = ayg.e.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class9 == ayg.g.class) {
			m10 = ayg.g.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class9 == ayg.k.class) {
			m10 = ayg.k.a(list, random, integer4, integer5, integer6, cv, integer8);
		}

		return m10;
	}

	public static class a extends ayg.m {
		public a() {
		}

		public a(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		protected a(Random random, int integer2, int integer3) {
			super(0);
			this.a(cv.c.HORIZONTAL.a(random));
			if (this.f().k() == cv.a.Z) {
				this.l = new axz(integer2, 64, integer3, integer2 + 19 - 1, 73, integer3 + 19 - 1);
			} else {
				this.l = new axz(integer2, 64, integer3, integer2 + 19 - 1, 73, integer3 + 19 - 1);
			}
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((ayg.q)ayq, list, random, 8, 3, false);
			this.b((ayg.q)ayq, list, random, 3, 8, false);
			this.c((ayg.q)ayq, list, random, 3, 8, false);
		}

		public static ayg.a a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -8, -3, 0, 19, 10, 19, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.a(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 7, 3, 0, 11, 4, 18, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 3, 7, 18, 4, 11, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 8, 5, 0, 10, 7, 18, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 5, 8, 18, 7, 10, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 7, 5, 0, 7, 5, 7, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 7, 5, 11, 7, 5, 18, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 11, 5, 0, 11, 5, 7, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 11, 5, 11, 11, 5, 18, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 5, 7, 7, 5, 7, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 11, 5, 7, 18, 5, 7, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 5, 11, 7, 5, 11, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 11, 5, 11, 18, 5, 11, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 7, 2, 0, 11, 2, 5, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 7, 2, 13, 11, 2, 18, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 7, 0, 0, 11, 1, 3, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 7, 0, 15, 11, 1, 18, alv.by.t(), alv.by.t(), false);

			for (int integer5 = 7; integer5 <= 11; integer5++) {
				for (int integer6 = 0; integer6 <= 2; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
					this.b(ajs, alv.by.t(), integer5, -1, 18 - integer6, axz);
				}
			}

			this.a(ajs, axz, 0, 2, 7, 5, 2, 11, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 13, 2, 7, 18, 2, 11, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 0, 7, 3, 1, 11, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 15, 0, 7, 18, 1, 11, alv.by.t(), alv.by.t(), false);

			for (int integer5 = 0; integer5 <= 2; integer5++) {
				for (int integer6 = 7; integer6 <= 11; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
					this.b(ajs, alv.by.t(), 18 - integer5, -1, integer6, axz);
				}
			}

			return true;
		}
	}

	public static class b extends ayg.m {
		private int a;

		public b() {
		}

		public b(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
			this.a = random.nextInt();
		}

		public static ayg.b a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, -3, 0, 5, 10, 8, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.b(integer7, random, axz8, cv) : null;
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.h("Seed");
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Seed", this.a);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			Random random5 = new Random((long)this.a);

			for (int integer6 = 0; integer6 <= 4; integer6++) {
				for (int integer7 = 3; integer7 <= 4; integer7++) {
					int integer8 = random5.nextInt(8);
					this.a(ajs, axz, integer6, integer7, 0, integer6, integer7, integer8, alv.by.t(), alv.by.t(), false);
				}
			}

			int integer6 = random5.nextInt(8);
			this.a(ajs, axz, 0, 5, 0, 0, 5, integer6, alv.by.t(), alv.by.t(), false);
			integer6 = random5.nextInt(8);
			this.a(ajs, axz, 4, 5, 0, 4, 5, integer6, alv.by.t(), alv.by.t(), false);

			for (int integer6x = 0; integer6x <= 4; integer6x++) {
				int integer7 = random5.nextInt(5);
				this.a(ajs, axz, integer6x, 2, 0, integer6x, 2, integer7, alv.by.t(), alv.by.t(), false);
			}

			for (int integer6x = 0; integer6x <= 4; integer6x++) {
				for (int integer7 = 0; integer7 <= 1; integer7++) {
					int integer8 = random5.nextInt(3);
					this.a(ajs, axz, integer6x, integer7, 0, integer6x, integer7, integer8, alv.by.t(), alv.by.t(), false);
				}
			}

			return true;
		}
	}

	public static class c extends ayg.m {
		public c() {
		}

		public c(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((ayg.q)ayq, list, random, 1, 3, false);
		}

		public static ayg.c a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, -3, 0, 5, 10, 19, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.c(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 3, 0, 4, 4, 18, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 5, 0, 3, 7, 18, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 5, 0, 0, 5, 18, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 4, 5, 0, 4, 5, 18, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 0, 4, 2, 5, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 13, 4, 2, 18, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 0, 0, 4, 1, 3, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 0, 15, 4, 1, 18, alv.by.t(), alv.by.t(), false);

			for (int integer5 = 0; integer5 <= 4; integer5++) {
				for (int integer6 = 0; integer6 <= 2; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
					this.b(ajs, alv.by.t(), integer5, -1, 18 - integer6, axz);
				}
			}

			this.a(ajs, axz, 0, 1, 1, 0, 4, 1, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 0, 3, 4, 0, 4, 4, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 0, 3, 14, 0, 4, 14, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 0, 1, 17, 0, 4, 17, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 4, 1, 1, 4, 4, 1, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 4, 3, 4, 4, 4, 4, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 4, 3, 14, 4, 4, 14, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 4, 1, 17, 4, 4, 17, alv.bz.t(), alv.bz.t(), false);
			return true;
		}
	}

	public static class d extends ayg.m {
		public d() {
		}

		public d(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((ayg.q)ayq, list, random, 1, 0, true);
		}

		public static ayg.d a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, -7, 0, 5, 14, 10, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.d(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			atl atl5 = alv.bA.t().a(aqy.a, cv.SOUTH);

			for (int integer6 = 0; integer6 <= 9; integer6++) {
				int integer7 = Math.max(1, 7 - integer6);
				int integer8 = Math.min(Math.max(integer7 + 5, 14 - integer6), 13);
				int integer9 = integer6;
				this.a(ajs, axz, 0, 0, integer6, 4, integer7, integer6, alv.by.t(), alv.by.t(), false);
				this.a(ajs, axz, 1, integer7 + 1, integer6, 3, integer8 - 1, integer6, alv.a.t(), alv.a.t(), false);
				if (integer6 <= 6) {
					this.a(ajs, atl5, 1, integer7 + 1, integer6, axz);
					this.a(ajs, atl5, 2, integer7 + 1, integer6, axz);
					this.a(ajs, atl5, 3, integer7 + 1, integer6, axz);
				}

				this.a(ajs, axz, 0, integer8, integer6, 4, integer8, integer6, alv.by.t(), alv.by.t(), false);
				this.a(ajs, axz, 0, integer7 + 1, integer6, 0, integer8 - 1, integer6, alv.by.t(), alv.by.t(), false);
				this.a(ajs, axz, 4, integer7 + 1, integer6, 4, integer8 - 1, integer6, alv.by.t(), alv.by.t(), false);
				if ((integer6 & 1) == 0) {
					this.a(ajs, axz, 0, integer7 + 2, integer6, 0, integer7 + 3, integer6, alv.bz.t(), alv.bz.t(), false);
					this.a(ajs, axz, 4, integer7 + 2, integer6, 4, integer7 + 3, integer6, alv.bz.t(), alv.bz.t(), false);
				}

				for (int integer10 = 0; integer10 <= 4; integer10++) {
					this.b(ajs, alv.by.t(), integer10, -1, integer9, axz);
				}
			}

			return true;
		}
	}

	public static class e extends ayg.m {
		public e() {
		}

		public e(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			int integer5 = 1;
			cv cv6 = this.f();
			if (cv6 == cv.WEST || cv6 == cv.NORTH) {
				integer5 = 5;
			}

			this.b((ayg.q)ayq, list, random, 0, integer5, random.nextInt(8) > 0);
			this.c((ayg.q)ayq, list, random, 0, integer5, random.nextInt(8) > 0);
		}

		public static ayg.e a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -3, 0, 0, 9, 7, 9, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.e(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 0, 0, 8, 1, 8, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 0, 8, 5, 8, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 6, 0, 8, 6, 5, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 0, 2, 5, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 6, 2, 0, 8, 5, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 3, 0, 1, 4, 0, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 7, 3, 0, 7, 4, 0, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 0, 2, 4, 8, 2, 8, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 1, 4, 2, 2, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 6, 1, 4, 7, 2, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 3, 8, 8, 3, 8, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 0, 3, 6, 0, 3, 7, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 8, 3, 6, 8, 3, 7, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 0, 3, 4, 0, 5, 5, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 8, 3, 4, 8, 5, 5, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 3, 5, 2, 5, 5, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 6, 3, 5, 7, 5, 5, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 4, 5, 1, 5, 5, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 7, 4, 5, 7, 5, 5, alv.bz.t(), alv.bz.t(), false);

			for (int integer5 = 0; integer5 <= 5; integer5++) {
				for (int integer6 = 0; integer6 <= 8; integer6++) {
					this.b(ajs, alv.by.t(), integer6, -1, integer5, axz);
				}
			}

			return true;
		}
	}

	public static class f extends ayg.m {
		public f() {
		}

		public f(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((ayg.q)ayq, list, random, 5, 3, true);
		}

		public static ayg.f a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -5, -3, 0, 13, 14, 13, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.f(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 3, 0, 12, 4, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 5, 0, 12, 13, 12, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 5, 0, 1, 12, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 11, 5, 0, 12, 12, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 5, 11, 4, 12, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 8, 5, 11, 10, 12, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 5, 9, 11, 7, 12, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 5, 0, 4, 12, 1, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 8, 5, 0, 10, 12, 1, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 5, 9, 0, 7, 12, 1, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 11, 2, 10, 12, 10, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 5, 8, 0, 7, 8, 0, alv.bz.t(), alv.bz.t(), false);

			for (int integer5 = 1; integer5 <= 11; integer5 += 2) {
				this.a(ajs, axz, integer5, 10, 0, integer5, 11, 0, alv.bz.t(), alv.bz.t(), false);
				this.a(ajs, axz, integer5, 10, 12, integer5, 11, 12, alv.bz.t(), alv.bz.t(), false);
				this.a(ajs, axz, 0, 10, integer5, 0, 11, integer5, alv.bz.t(), alv.bz.t(), false);
				this.a(ajs, axz, 12, 10, integer5, 12, 11, integer5, alv.bz.t(), alv.bz.t(), false);
				this.a(ajs, alv.by.t(), integer5, 13, 0, axz);
				this.a(ajs, alv.by.t(), integer5, 13, 12, axz);
				this.a(ajs, alv.by.t(), 0, 13, integer5, axz);
				this.a(ajs, alv.by.t(), 12, 13, integer5, axz);
				this.a(ajs, alv.bz.t(), integer5 + 1, 13, 0, axz);
				this.a(ajs, alv.bz.t(), integer5 + 1, 13, 12, axz);
				this.a(ajs, alv.bz.t(), 0, 13, integer5 + 1, axz);
				this.a(ajs, alv.bz.t(), 12, 13, integer5 + 1, axz);
			}

			this.a(ajs, alv.bz.t(), 0, 13, 0, axz);
			this.a(ajs, alv.bz.t(), 0, 13, 12, axz);
			this.a(ajs, alv.bz.t(), 0, 13, 0, axz);
			this.a(ajs, alv.bz.t(), 12, 13, 0, axz);

			for (int integer5 = 3; integer5 <= 9; integer5 += 2) {
				this.a(ajs, axz, 1, 7, integer5, 1, 8, integer5, alv.bz.t(), alv.bz.t(), false);
				this.a(ajs, axz, 11, 7, integer5, 11, 8, integer5, alv.bz.t(), alv.bz.t(), false);
			}

			this.a(ajs, axz, 4, 2, 0, 8, 2, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 4, 12, 2, 8, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 4, 0, 0, 8, 1, 3, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 4, 0, 9, 8, 1, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 0, 4, 3, 1, 8, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 9, 0, 4, 12, 1, 8, alv.by.t(), alv.by.t(), false);

			for (int integer5 = 4; integer5 <= 8; integer5++) {
				for (int integer6 = 0; integer6 <= 2; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
					this.b(ajs, alv.by.t(), integer5, -1, 12 - integer6, axz);
				}
			}

			for (int integer5 = 0; integer5 <= 2; integer5++) {
				for (int integer6 = 4; integer6 <= 8; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
					this.b(ajs, alv.by.t(), 12 - integer5, -1, integer6, axz);
				}
			}

			this.a(ajs, axz, 5, 5, 5, 7, 5, 7, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 6, 1, 6, 6, 4, 6, alv.a.t(), alv.a.t(), false);
			this.a(ajs, alv.by.t(), 6, 0, 6, axz);
			atl atl5 = alv.k.t();
			this.a(ajs, atl5, 6, 5, 6, axz);
			co co6 = new co(this.a(6, 6), this.d(5), this.b(6, 6));
			if (axz.b(co6)) {
				ajs.a(co6, atl5, random);
			}

			return true;
		}
	}

	public static class g extends ayg.m {
		public g() {
		}

		public g(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((ayg.q)ayq, list, random, 1, 0, true);
			this.b((ayg.q)ayq, list, random, 0, 1, true);
			this.c((ayg.q)ayq, list, random, 0, 1, true);
		}

		public static ayg.g a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, 0, 0, 5, 7, 5, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.g(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 0, 0, 4, 1, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 0, 4, 5, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 2, 0, 0, 5, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 4, 2, 0, 4, 5, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 4, 0, 5, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 4, 2, 4, 4, 5, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 6, 0, 4, 6, 4, alv.by.t(), alv.by.t(), false);

			for (int integer5 = 0; integer5 <= 4; integer5++) {
				for (int integer6 = 0; integer6 <= 4; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
				}
			}

			return true;
		}
	}

	public static class h extends ayg.m {
		private boolean a;

		public h() {
		}

		public h(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
			this.a = random.nextInt(3) == 0;
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.p("Chest");
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Chest", this.a);
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.b((ayg.q)ayq, list, random, 0, 1, true);
		}

		public static ayg.h a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, 0, 0, 5, 7, 5, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.h(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 0, 0, 4, 1, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 0, 4, 5, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 4, 2, 0, 4, 5, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 4, 3, 1, 4, 4, 1, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 4, 3, 3, 4, 4, 3, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 0, 2, 0, 0, 5, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 4, 3, 5, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 3, 4, 1, 4, 4, alv.bz.t(), alv.by.t(), false);
			this.a(ajs, axz, 3, 3, 4, 3, 4, 4, alv.bz.t(), alv.by.t(), false);
			if (this.a && axz.b(new co(this.a(3, 3), this.d(2), this.b(3, 3)))) {
				this.a = false;
				this.a(ajs, axz, random, 3, 2, 3, bcf.g);
			}

			this.a(ajs, axz, 0, 6, 0, 4, 6, 4, alv.by.t(), alv.by.t(), false);

			for (int integer5 = 0; integer5 <= 4; integer5++) {
				for (int integer6 = 0; integer6 <= 4; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
				}
			}

			return true;
		}
	}

	public static class i extends ayg.m {
		public i() {
		}

		public i(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((ayg.q)ayq, list, random, 1, 0, true);
		}

		public static ayg.i a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, 0, 0, 5, 7, 5, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.i(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 0, 0, 4, 1, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 0, 4, 5, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 2, 0, 0, 5, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 4, 2, 0, 4, 5, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 3, 1, 0, 4, 1, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 0, 3, 3, 0, 4, 3, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 4, 3, 1, 4, 4, 1, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 4, 3, 3, 4, 4, 3, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 0, 6, 0, 4, 6, 4, alv.by.t(), alv.by.t(), false);

			for (int integer5 = 0; integer5 <= 4; integer5++) {
				for (int integer6 = 0; integer6 <= 4; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
				}
			}

			return true;
		}
	}

	public static class j extends ayg.m {
		private boolean a;

		public j() {
		}

		public j(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
			this.a = random.nextInt(3) == 0;
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.p("Chest");
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Chest", this.a);
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.c((ayg.q)ayq, list, random, 0, 1, true);
		}

		public static ayg.j a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, 0, 0, 5, 7, 5, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.j(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 0, 0, 4, 1, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 0, 4, 5, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 2, 0, 0, 5, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 3, 1, 0, 4, 1, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 0, 3, 3, 0, 4, 3, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 4, 2, 0, 4, 5, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 2, 4, 4, 5, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 3, 4, 1, 4, 4, alv.bz.t(), alv.by.t(), false);
			this.a(ajs, axz, 3, 3, 4, 3, 4, 4, alv.bz.t(), alv.by.t(), false);
			if (this.a && axz.b(new co(this.a(1, 3), this.d(2), this.b(1, 3)))) {
				this.a = false;
				this.a(ajs, axz, random, 1, 2, 3, bcf.g);
			}

			this.a(ajs, axz, 0, 6, 0, 4, 6, 4, alv.by.t(), alv.by.t(), false);

			for (int integer5 = 0; integer5 <= 4; integer5++) {
				for (int integer6 = 0; integer6 <= 4; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
				}
			}

			return true;
		}
	}

	public static class k extends ayg.m {
		public k() {
		}

		public k(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((ayg.q)ayq, list, random, 5, 3, true);
			this.a((ayg.q)ayq, list, random, 5, 11, true);
		}

		public static ayg.k a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -5, -3, 0, 13, 14, 13, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.k(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 3, 0, 12, 4, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 5, 0, 12, 13, 12, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 5, 0, 1, 12, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 11, 5, 0, 12, 12, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 5, 11, 4, 12, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 8, 5, 11, 10, 12, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 5, 9, 11, 7, 12, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 5, 0, 4, 12, 1, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 8, 5, 0, 10, 12, 1, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 5, 9, 0, 7, 12, 1, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 11, 2, 10, 12, 10, alv.by.t(), alv.by.t(), false);

			for (int integer5 = 1; integer5 <= 11; integer5 += 2) {
				this.a(ajs, axz, integer5, 10, 0, integer5, 11, 0, alv.bz.t(), alv.bz.t(), false);
				this.a(ajs, axz, integer5, 10, 12, integer5, 11, 12, alv.bz.t(), alv.bz.t(), false);
				this.a(ajs, axz, 0, 10, integer5, 0, 11, integer5, alv.bz.t(), alv.bz.t(), false);
				this.a(ajs, axz, 12, 10, integer5, 12, 11, integer5, alv.bz.t(), alv.bz.t(), false);
				this.a(ajs, alv.by.t(), integer5, 13, 0, axz);
				this.a(ajs, alv.by.t(), integer5, 13, 12, axz);
				this.a(ajs, alv.by.t(), 0, 13, integer5, axz);
				this.a(ajs, alv.by.t(), 12, 13, integer5, axz);
				this.a(ajs, alv.bz.t(), integer5 + 1, 13, 0, axz);
				this.a(ajs, alv.bz.t(), integer5 + 1, 13, 12, axz);
				this.a(ajs, alv.bz.t(), 0, 13, integer5 + 1, axz);
				this.a(ajs, alv.bz.t(), 12, 13, integer5 + 1, axz);
			}

			this.a(ajs, alv.bz.t(), 0, 13, 0, axz);
			this.a(ajs, alv.bz.t(), 0, 13, 12, axz);
			this.a(ajs, alv.bz.t(), 0, 13, 0, axz);
			this.a(ajs, alv.bz.t(), 12, 13, 0, axz);

			for (int integer5 = 3; integer5 <= 9; integer5 += 2) {
				this.a(ajs, axz, 1, 7, integer5, 1, 8, integer5, alv.bz.t(), alv.bz.t(), false);
				this.a(ajs, axz, 11, 7, integer5, 11, 8, integer5, alv.bz.t(), alv.bz.t(), false);
			}

			atl atl5 = alv.bA.t().a(aqy.a, cv.NORTH);

			for (int integer6 = 0; integer6 <= 6; integer6++) {
				int integer7 = integer6 + 4;

				for (int integer8 = 5; integer8 <= 7; integer8++) {
					this.a(ajs, atl5, integer8, 5 + integer6, integer7, axz);
				}

				if (integer7 >= 5 && integer7 <= 8) {
					this.a(ajs, axz, 5, 5, integer7, 7, integer6 + 4, integer7, alv.by.t(), alv.by.t(), false);
				} else if (integer7 >= 9 && integer7 <= 10) {
					this.a(ajs, axz, 5, 8, integer7, 7, integer6 + 4, integer7, alv.by.t(), alv.by.t(), false);
				}

				if (integer6 >= 1) {
					this.a(ajs, axz, 5, 6 + integer6, integer7, 7, 9 + integer6, integer7, alv.a.t(), alv.a.t(), false);
				}
			}

			for (int integer6 = 5; integer6 <= 7; integer6++) {
				this.a(ajs, atl5, integer6, 12, 11, axz);
			}

			this.a(ajs, axz, 5, 6, 7, 5, 7, 7, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 7, 6, 7, 7, 7, 7, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 5, 13, 12, 7, 13, 12, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 2, 5, 2, 3, 5, 3, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 5, 9, 3, 5, 10, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 5, 4, 2, 5, 8, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 9, 5, 2, 10, 5, 3, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 9, 5, 9, 10, 5, 10, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 10, 5, 4, 10, 5, 8, alv.by.t(), alv.by.t(), false);
			atl atl6 = atl5.a(aqy.a, cv.EAST);
			atl atl7 = atl5.a(aqy.a, cv.WEST);
			this.a(ajs, atl7, 4, 5, 2, axz);
			this.a(ajs, atl7, 4, 5, 3, axz);
			this.a(ajs, atl7, 4, 5, 9, axz);
			this.a(ajs, atl7, 4, 5, 10, axz);
			this.a(ajs, atl6, 8, 5, 2, axz);
			this.a(ajs, atl6, 8, 5, 3, axz);
			this.a(ajs, atl6, 8, 5, 9, axz);
			this.a(ajs, atl6, 8, 5, 10, axz);
			this.a(ajs, axz, 3, 4, 4, 4, 4, 8, alv.aW.t(), alv.aW.t(), false);
			this.a(ajs, axz, 8, 4, 4, 9, 4, 8, alv.aW.t(), alv.aW.t(), false);
			this.a(ajs, axz, 3, 5, 4, 4, 5, 8, alv.bB.t(), alv.bB.t(), false);
			this.a(ajs, axz, 8, 5, 4, 9, 5, 8, alv.bB.t(), alv.bB.t(), false);
			this.a(ajs, axz, 4, 2, 0, 8, 2, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 4, 12, 2, 8, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 4, 0, 0, 8, 1, 3, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 4, 0, 9, 8, 1, 12, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 0, 4, 3, 1, 8, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 9, 0, 4, 12, 1, 8, alv.by.t(), alv.by.t(), false);

			for (int integer8 = 4; integer8 <= 8; integer8++) {
				for (int integer9 = 0; integer9 <= 2; integer9++) {
					this.b(ajs, alv.by.t(), integer8, -1, integer9, axz);
					this.b(ajs, alv.by.t(), integer8, -1, 12 - integer9, axz);
				}
			}

			for (int integer8 = 0; integer8 <= 2; integer8++) {
				for (int integer9 = 4; integer9 <= 8; integer9++) {
					this.b(ajs, alv.by.t(), integer8, -1, integer9, axz);
					this.b(ajs, alv.by.t(), 12 - integer8, -1, integer9, axz);
				}
			}

			return true;
		}
	}

	public static class l extends ayg.m {
		private boolean a;

		public l() {
		}

		public l(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.p("Mob");
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Mob", this.a);
		}

		public static ayg.l a(List<ayq> list, Random random, int integer3, int integer4, int integer5, int integer6, cv cv) {
			axz axz8 = axz.a(integer3, integer4, integer5, -2, 0, 0, 7, 8, 9, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.l(integer6, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 2, 0, 6, 7, 7, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 1, 0, 0, 5, 1, 7, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 2, 1, 5, 2, 7, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 3, 2, 5, 3, 7, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 4, 3, 5, 4, 7, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 2, 0, 1, 4, 2, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 5, 2, 0, 5, 4, 2, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 5, 2, 1, 5, 3, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 5, 5, 2, 5, 5, 3, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 5, 3, 0, 5, 8, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 6, 5, 3, 6, 5, 8, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 5, 8, 5, 5, 8, alv.by.t(), alv.by.t(), false);
			this.a(ajs, alv.bz.t(), 1, 6, 3, axz);
			this.a(ajs, alv.bz.t(), 5, 6, 3, axz);
			this.a(ajs, axz, 0, 6, 3, 0, 6, 8, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 6, 6, 3, 6, 6, 8, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 1, 6, 8, 5, 7, 8, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 2, 8, 8, 4, 8, 8, alv.bz.t(), alv.bz.t(), false);
			if (!this.a) {
				co co5 = new co(this.a(3, 5), this.d(5), this.b(3, 5));
				if (axz.b(co5)) {
					this.a = true;
					ajs.a(co5, alv.ac.t(), 2);
					asc asc6 = ajs.r(co5);
					if (asc6 instanceof asr) {
						((asr)asc6).a().a(sp.a(zn.class));
					}
				}
			}

			for (int integer5 = 0; integer5 <= 6; integer5++) {
				for (int integer6 = 0; integer6 <= 6; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
				}
			}

			return true;
		}
	}

	abstract static class m extends ayq {
		public m() {
		}

		protected m(int integer) {
			super(integer);
		}

		@Override
		protected void a(du du, ayz ayz) {
		}

		@Override
		protected void a(du du) {
		}

		private int a(List<ayg.n> list) {
			boolean boolean3 = false;
			int integer4 = 0;

			for (ayg.n n6 : list) {
				if (n6.d > 0 && n6.c < n6.d) {
					boolean3 = true;
				}

				integer4 += n6.b;
			}

			return boolean3 ? integer4 : -1;
		}

		private ayg.m a(ayg.q q, List<ayg.n> list2, List<ayq> list3, Random random, int integer5, int integer6, int integer7, cv cv, int integer9) {
			int integer11 = this.a(list2);
			boolean boolean12 = integer11 > 0 && integer9 <= 30;
			int integer13 = 0;

			while (integer13 < 5 && boolean12) {
				integer13++;
				int integer14 = random.nextInt(integer11);

				for (ayg.n n16 : list2) {
					integer14 -= n16.b;
					if (integer14 < 0) {
						if (!n16.a(integer9) || n16 == q.a && !n16.e) {
							break;
						}

						ayg.m m17 = ayg.b(n16, list3, random, integer5, integer6, integer7, cv, integer9);
						if (m17 != null) {
							n16.c++;
							q.a = n16;
							if (!n16.a()) {
								list2.remove(n16);
							}

							return m17;
						}
					}
				}
			}

			return ayg.b.a(list3, random, integer5, integer6, integer7, cv, integer9);
		}

		private ayq a(ayg.q q, List<ayq> list, Random random, int integer4, int integer5, int integer6, @Nullable cv cv, int integer8, boolean boolean9) {
			if (Math.abs(integer4 - q.d().a) <= 112 && Math.abs(integer6 - q.d().c) <= 112) {
				List<ayg.n> list11 = q.b;
				if (boolean9) {
					list11 = q.c;
				}

				ayq ayq12 = this.a(q, list11, list, random, integer4, integer5, integer6, cv, integer8 + 1);
				if (ayq12 != null) {
					list.add(ayq12);
					q.d.add(ayq12);
				}

				return ayq12;
			} else {
				return ayg.b.a(list, random, integer4, integer5, integer6, cv, integer8);
			}
		}

		@Nullable
		protected ayq a(ayg.q q, List<ayq> list, Random random, int integer4, int integer5, boolean boolean6) {
			cv cv8 = this.f();
			if (cv8 != null) {
				switch (cv8) {
					case NORTH:
						return this.a(q, list, random, this.l.a + integer4, this.l.b + integer5, this.l.c - 1, cv8, this.e(), boolean6);
					case SOUTH:
						return this.a(q, list, random, this.l.a + integer4, this.l.b + integer5, this.l.f + 1, cv8, this.e(), boolean6);
					case WEST:
						return this.a(q, list, random, this.l.a - 1, this.l.b + integer5, this.l.c + integer4, cv8, this.e(), boolean6);
					case EAST:
						return this.a(q, list, random, this.l.d + 1, this.l.b + integer5, this.l.c + integer4, cv8, this.e(), boolean6);
				}
			}

			return null;
		}

		@Nullable
		protected ayq b(ayg.q q, List<ayq> list, Random random, int integer4, int integer5, boolean boolean6) {
			cv cv8 = this.f();
			if (cv8 != null) {
				switch (cv8) {
					case NORTH:
						return this.a(q, list, random, this.l.a - 1, this.l.b + integer4, this.l.c + integer5, cv.WEST, this.e(), boolean6);
					case SOUTH:
						return this.a(q, list, random, this.l.a - 1, this.l.b + integer4, this.l.c + integer5, cv.WEST, this.e(), boolean6);
					case WEST:
						return this.a(q, list, random, this.l.a + integer5, this.l.b + integer4, this.l.c - 1, cv.NORTH, this.e(), boolean6);
					case EAST:
						return this.a(q, list, random, this.l.a + integer5, this.l.b + integer4, this.l.c - 1, cv.NORTH, this.e(), boolean6);
				}
			}

			return null;
		}

		@Nullable
		protected ayq c(ayg.q q, List<ayq> list, Random random, int integer4, int integer5, boolean boolean6) {
			cv cv8 = this.f();
			if (cv8 != null) {
				switch (cv8) {
					case NORTH:
						return this.a(q, list, random, this.l.d + 1, this.l.b + integer4, this.l.c + integer5, cv.EAST, this.e(), boolean6);
					case SOUTH:
						return this.a(q, list, random, this.l.d + 1, this.l.b + integer4, this.l.c + integer5, cv.EAST, this.e(), boolean6);
					case WEST:
						return this.a(q, list, random, this.l.a + integer5, this.l.b + integer4, this.l.f + 1, cv.SOUTH, this.e(), boolean6);
					case EAST:
						return this.a(q, list, random, this.l.a + integer5, this.l.b + integer4, this.l.f + 1, cv.SOUTH, this.e(), boolean6);
				}
			}

			return null;
		}

		protected static boolean a(axz axz) {
			return axz != null && axz.b > 10;
		}
	}

	static class n {
		public Class<? extends ayg.m> a;
		public final int b;
		public int c;
		public int d;
		public boolean e;

		public n(Class<? extends ayg.m> class1, int integer2, int integer3, boolean boolean4) {
			this.a = class1;
			this.b = integer2;
			this.d = integer3;
			this.e = boolean4;
		}

		public n(Class<? extends ayg.m> class1, int integer2, int integer3) {
			this(class1, integer2, integer3, false);
		}

		public boolean a(int integer) {
			return this.d == 0 || this.c < this.d;
		}

		public boolean a() {
			return this.d == 0 || this.c < this.d;
		}
	}

	public static class o extends ayg.m {
		public o() {
		}

		public o(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((ayg.q)ayq, list, random, 2, 0, false);
			this.b((ayg.q)ayq, list, random, 0, 2, false);
			this.c((ayg.q)ayq, list, random, 0, 2, false);
		}

		public static ayg.o a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -2, 0, 0, 7, 9, 7, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.o(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 0, 0, 6, 1, 6, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 0, 6, 7, 6, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 2, 0, 1, 6, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 6, 1, 6, 6, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 5, 2, 0, 6, 6, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 5, 2, 6, 6, 6, 6, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 0, 0, 6, 1, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 5, 0, 6, 6, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 6, 2, 0, 6, 6, 1, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 6, 2, 5, 6, 6, 6, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 6, 0, 4, 6, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 5, 0, 4, 5, 0, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 2, 6, 6, 4, 6, 6, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 5, 6, 4, 5, 6, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 0, 6, 2, 0, 6, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 5, 2, 0, 5, 4, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 6, 6, 2, 6, 6, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 6, 5, 2, 6, 5, 4, alv.bz.t(), alv.bz.t(), false);

			for (int integer5 = 0; integer5 <= 6; integer5++) {
				for (int integer6 = 0; integer6 <= 6; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
				}
			}

			return true;
		}
	}

	public static class p extends ayg.m {
		public p() {
		}

		public p(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.c((ayg.q)ayq, list, random, 6, 2, false);
		}

		public static ayg.p a(List<ayq> list, Random random, int integer3, int integer4, int integer5, int integer6, cv cv) {
			axz axz8 = axz.a(integer3, integer4, integer5, -2, 0, 0, 7, 11, 7, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new ayg.p(integer6, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 0, 0, 6, 1, 6, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 0, 6, 10, 6, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 2, 0, 1, 8, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 5, 2, 0, 6, 8, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 2, 1, 0, 8, 6, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 6, 2, 1, 6, 8, 6, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 2, 6, 5, 8, 6, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 0, 3, 2, 0, 5, 4, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 6, 3, 2, 6, 5, 2, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, axz, 6, 3, 4, 6, 5, 4, alv.bz.t(), alv.bz.t(), false);
			this.a(ajs, alv.by.t(), 5, 2, 5, axz);
			this.a(ajs, axz, 4, 2, 5, 4, 3, 5, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 3, 2, 5, 3, 4, 5, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 2, 5, 2, 5, 5, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 2, 5, 1, 6, 5, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 1, 7, 1, 5, 7, 4, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 6, 8, 2, 6, 8, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 2, 6, 0, 4, 8, 0, alv.by.t(), alv.by.t(), false);
			this.a(ajs, axz, 2, 5, 0, 4, 5, 0, alv.bz.t(), alv.bz.t(), false);

			for (int integer5 = 0; integer5 <= 6; integer5++) {
				for (int integer6 = 0; integer6 <= 6; integer6++) {
					this.b(ajs, alv.by.t(), integer5, -1, integer6, axz);
				}
			}

			return true;
		}
	}

	public static class q extends ayg.a {
		public ayg.n a;
		public List<ayg.n> b;
		public List<ayg.n> c;
		public List<ayq> d = Lists.newArrayList();

		public q() {
		}

		public q(Random random, int integer2, int integer3) {
			super(random, integer2, integer3);
			this.b = Lists.newArrayList();

			for (ayg.n n8 : ayg.a) {
				n8.c = 0;
				this.b.add(n8);
			}

			this.c = Lists.newArrayList();

			for (ayg.n n8 : ayg.b) {
				n8.c = 0;
				this.c.add(n8);
			}
		}
	}
}
