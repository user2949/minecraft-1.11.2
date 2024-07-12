import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class aym {
	private static final aym.f[] b = new aym.f[]{
		new aym.f(aym.n.class, 40, 0),
		new aym.f(aym.h.class, 5, 5),
		new aym.f(aym.d.class, 20, 0),
		new aym.f(aym.i.class, 20, 0),
		new aym.f(aym.j.class, 10, 6),
		new aym.f(aym.o.class, 5, 5),
		new aym.f(aym.l.class, 5, 5),
		new aym.f(aym.c.class, 5, 4),
		new aym.f(aym.a.class, 5, 4),
		new aym.f(aym.e.class, 10, 2) {
			@Override
			public boolean a(int integer) {
				return super.a(integer) && integer > 4;
			}
		},
		new aym.f(aym.g.class, 20, 1) {
			@Override
			public boolean a(int integer) {
				return super.a(integer) && integer > 5;
			}
		}
	};
	private static List<aym.f> c;
	private static Class<? extends aym.p> d;
	static int a;
	private static final aym.k e = new aym.k();

	public static void a() {
		ayo.a(aym.a.class, "SHCC");
		ayo.a(aym.b.class, "SHFC");
		ayo.a(aym.c.class, "SH5C");
		ayo.a(aym.d.class, "SHLT");
		ayo.a(aym.e.class, "SHLi");
		ayo.a(aym.g.class, "SHPR");
		ayo.a(aym.h.class, "SHPH");
		ayo.a(aym.i.class, "SHRT");
		ayo.a(aym.j.class, "SHRC");
		ayo.a(aym.l.class, "SHSD");
		ayo.a(aym.m.class, "SHStart");
		ayo.a(aym.n.class, "SHS");
		ayo.a(aym.o.class, "SHSSD");
	}

	public static void b() {
		c = Lists.newArrayList();

		for (aym.f f4 : b) {
			f4.c = 0;
			c.add(f4);
		}

		d = null;
	}

	private static boolean d() {
		boolean boolean1 = false;
		a = 0;

		for (aym.f f3 : c) {
			if (f3.d > 0 && f3.c < f3.d) {
				boolean1 = true;
			}

			a = a + f3.b;
		}

		return boolean1;
	}

	private static aym.p a(Class<? extends aym.p> class1, List<ayq> list, Random random, int integer4, int integer5, int integer6, @Nullable cv cv, int integer8) {
		aym.p p9 = null;
		if (class1 == aym.n.class) {
			p9 = aym.n.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class1 == aym.h.class) {
			p9 = aym.h.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class1 == aym.d.class) {
			p9 = aym.d.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class1 == aym.i.class) {
			p9 = aym.i.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class1 == aym.j.class) {
			p9 = aym.j.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class1 == aym.o.class) {
			p9 = aym.o.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class1 == aym.l.class) {
			p9 = aym.l.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class1 == aym.c.class) {
			p9 = aym.c.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class1 == aym.a.class) {
			p9 = aym.a.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class1 == aym.e.class) {
			p9 = aym.e.a(list, random, integer4, integer5, integer6, cv, integer8);
		} else if (class1 == aym.g.class) {
			p9 = aym.g.a(list, random, integer4, integer5, integer6, cv, integer8);
		}

		return p9;
	}

	private static aym.p b(aym.m m, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
		if (!d()) {
			return null;
		} else {
			if (d != null) {
				aym.p p9 = a(d, list, random, integer4, integer5, integer6, cv, integer8);
				d = null;
				if (p9 != null) {
					return p9;
				}
			}

			int integer9 = 0;

			while (integer9 < 5) {
				integer9++;
				int integer10 = random.nextInt(a);

				for (aym.f f12 : c) {
					integer10 -= f12.b;
					if (integer10 < 0) {
						if (!f12.a(integer8) || f12 == m.a) {
							break;
						}

						aym.p p13 = a(f12.a, list, random, integer4, integer5, integer6, cv, integer8);
						if (p13 != null) {
							f12.c++;
							m.a = f12;
							if (!f12.a()) {
								c.remove(f12);
							}

							return p13;
						}
					}
				}
			}

			axz axz10 = aym.b.a(list, random, integer4, integer5, integer6, cv);
			return axz10 != null && axz10.b > 1 ? new aym.b(integer8, random, axz10, cv) : null;
		}
	}

	private static ayq c(aym.m m, List<ayq> list, Random random, int integer4, int integer5, int integer6, @Nullable cv cv, int integer8) {
		if (integer8 > 50) {
			return null;
		} else if (Math.abs(integer4 - m.d().a) <= 112 && Math.abs(integer6 - m.d().c) <= 112) {
			ayq ayq9 = b(m, list, random, integer4, integer5, integer6, cv, integer8 + 1);
			if (ayq9 != null) {
				list.add(ayq9);
				m.c.add(ayq9);
			}

			return ayq9;
		} else {
			return null;
		}
	}

	public static class a extends aym.p {
		private boolean a;

		public a() {
		}

		public a(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.d = this.a(random);
			this.l = axz;
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Chest", this.a);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.p("Chest");
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((aym.m)ayq, list, random, 1, 1);
		}

		public static aym.a a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, -1, 0, 5, 5, 7, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new aym.a(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				this.a(ajs, axz, 0, 0, 0, 4, 4, 6, true, random, aym.e);
				this.a(ajs, random, axz, this.d, 1, 1, 0);
				this.a(ajs, random, axz, aym.p.a.OPENING, 1, 1, 6);
				this.a(ajs, axz, 3, 1, 2, 3, 1, 4, alv.bf.t(), alv.bf.t(), false);
				this.a(ajs, alv.U.a(arf.a.SMOOTHBRICK.a()), 3, 1, 1, axz);
				this.a(ajs, alv.U.a(arf.a.SMOOTHBRICK.a()), 3, 1, 5, axz);
				this.a(ajs, alv.U.a(arf.a.SMOOTHBRICK.a()), 3, 2, 2, axz);
				this.a(ajs, alv.U.a(arf.a.SMOOTHBRICK.a()), 3, 2, 4, axz);

				for (int integer5 = 2; integer5 <= 4; integer5++) {
					this.a(ajs, alv.U.a(arf.a.SMOOTHBRICK.a()), 2, 1, integer5, axz);
				}

				if (!this.a && axz.b(new co(this.a(3, 3), this.d(2), this.b(3, 3)))) {
					this.a = true;
					this.a(ajs, axz, random, 3, 2, 3, bcf.j);
				}

				return true;
			}
		}
	}

	public static class b extends aym.p {
		private int a;

		public b() {
		}

		public b(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
			this.a = cv != cv.NORTH && cv != cv.SOUTH ? axz.c() : axz.e();
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Steps", this.a);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.h("Steps");
		}

		public static axz a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv) {
			int integer7 = 3;
			axz axz8 = axz.a(integer3, integer4, integer5, -1, -1, 0, 5, 5, 4, cv);
			ayq ayq9 = ayq.a(list, axz8);
			if (ayq9 == null) {
				return null;
			} else {
				if (ayq9.d().b == axz8.b) {
					for (int integer10 = 3; integer10 >= 1; integer10--) {
						axz8 = axz.a(integer3, integer4, integer5, -1, -1, 0, 5, 5, integer10 - 1, cv);
						if (!ayq9.d().a(axz8)) {
							return axz.a(integer3, integer4, integer5, -1, -1, 0, 5, 5, integer10, cv);
						}
					}
				}

				return null;
			}
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				for (int integer5 = 0; integer5 < this.a; integer5++) {
					this.a(ajs, alv.bf.t(), 0, 0, integer5, axz);
					this.a(ajs, alv.bf.t(), 1, 0, integer5, axz);
					this.a(ajs, alv.bf.t(), 2, 0, integer5, axz);
					this.a(ajs, alv.bf.t(), 3, 0, integer5, axz);
					this.a(ajs, alv.bf.t(), 4, 0, integer5, axz);

					for (int integer6 = 1; integer6 <= 3; integer6++) {
						this.a(ajs, alv.bf.t(), 0, integer6, integer5, axz);
						this.a(ajs, alv.a.t(), 1, integer6, integer5, axz);
						this.a(ajs, alv.a.t(), 2, integer6, integer5, axz);
						this.a(ajs, alv.a.t(), 3, integer6, integer5, axz);
						this.a(ajs, alv.bf.t(), 4, integer6, integer5, axz);
					}

					this.a(ajs, alv.bf.t(), 0, 4, integer5, axz);
					this.a(ajs, alv.bf.t(), 1, 4, integer5, axz);
					this.a(ajs, alv.bf.t(), 2, 4, integer5, axz);
					this.a(ajs, alv.bf.t(), 3, 4, integer5, axz);
					this.a(ajs, alv.bf.t(), 4, 4, integer5, axz);
				}

				return true;
			}
		}
	}

	public static class c extends aym.p {
		private boolean a;
		private boolean b;
		private boolean c;
		private boolean e;

		public c() {
		}

		public c(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.d = this.a(random);
			this.l = axz;
			this.a = random.nextBoolean();
			this.b = random.nextBoolean();
			this.c = random.nextBoolean();
			this.e = random.nextInt(3) > 0;
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("leftLow", this.a);
			du.a("leftHigh", this.b);
			du.a("rightLow", this.c);
			du.a("rightHigh", this.e);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.p("leftLow");
			this.b = du.p("leftHigh");
			this.c = du.p("rightLow");
			this.e = du.p("rightHigh");
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			int integer5 = 3;
			int integer6 = 5;
			cv cv7 = this.f();
			if (cv7 == cv.WEST || cv7 == cv.NORTH) {
				integer5 = 8 - integer5;
				integer6 = 8 - integer6;
			}

			this.a((aym.m)ayq, list, random, 5, 1);
			if (this.a) {
				this.b((aym.m)ayq, list, random, integer5, 1);
			}

			if (this.b) {
				this.b((aym.m)ayq, list, random, integer6, 7);
			}

			if (this.c) {
				this.c((aym.m)ayq, list, random, integer5, 1);
			}

			if (this.e) {
				this.c((aym.m)ayq, list, random, integer6, 7);
			}
		}

		public static aym.c a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -4, -3, 0, 10, 9, 11, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new aym.c(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				this.a(ajs, axz, 0, 0, 0, 9, 8, 10, true, random, aym.e);
				this.a(ajs, random, axz, this.d, 4, 3, 0);
				if (this.a) {
					this.a(ajs, axz, 0, 3, 1, 0, 5, 3, alv.a.t(), alv.a.t(), false);
				}

				if (this.c) {
					this.a(ajs, axz, 9, 3, 1, 9, 5, 3, alv.a.t(), alv.a.t(), false);
				}

				if (this.b) {
					this.a(ajs, axz, 0, 5, 7, 0, 7, 9, alv.a.t(), alv.a.t(), false);
				}

				if (this.e) {
					this.a(ajs, axz, 9, 5, 7, 9, 7, 9, alv.a.t(), alv.a.t(), false);
				}

				this.a(ajs, axz, 5, 1, 10, 7, 3, 10, alv.a.t(), alv.a.t(), false);
				this.a(ajs, axz, 1, 2, 1, 8, 2, 6, false, random, aym.e);
				this.a(ajs, axz, 4, 1, 5, 4, 4, 9, false, random, aym.e);
				this.a(ajs, axz, 8, 1, 5, 8, 4, 9, false, random, aym.e);
				this.a(ajs, axz, 1, 4, 7, 3, 4, 9, false, random, aym.e);
				this.a(ajs, axz, 1, 3, 5, 3, 3, 6, false, random, aym.e);
				this.a(ajs, axz, 1, 3, 4, 3, 3, 4, alv.U.t(), alv.U.t(), false);
				this.a(ajs, axz, 1, 4, 6, 3, 4, 6, alv.U.t(), alv.U.t(), false);
				this.a(ajs, axz, 5, 1, 7, 7, 1, 8, false, random, aym.e);
				this.a(ajs, axz, 5, 1, 9, 7, 1, 9, alv.U.t(), alv.U.t(), false);
				this.a(ajs, axz, 5, 2, 7, 7, 2, 7, alv.U.t(), alv.U.t(), false);
				this.a(ajs, axz, 4, 5, 7, 4, 5, 9, alv.U.t(), alv.U.t(), false);
				this.a(ajs, axz, 8, 5, 7, 8, 5, 9, alv.U.t(), alv.U.t(), false);
				this.a(ajs, axz, 5, 5, 7, 7, 5, 9, alv.T.t(), alv.T.t(), false);
				this.a(ajs, alv.aa.t().a(arl.a, cv.SOUTH), 6, 5, 6, axz);
				return true;
			}
		}
	}

	public static class d extends aym.p {
		public d() {
		}

		public d(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.d = this.a(random);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			cv cv5 = this.f();
			if (cv5 != cv.NORTH && cv5 != cv.EAST) {
				this.c((aym.m)ayq, list, random, 1, 1);
			} else {
				this.b((aym.m)ayq, list, random, 1, 1);
			}
		}

		public static aym.d a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, -1, 0, 5, 5, 5, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new aym.d(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				this.a(ajs, axz, 0, 0, 0, 4, 4, 4, true, random, aym.e);
				this.a(ajs, random, axz, this.d, 1, 1, 0);
				cv cv5 = this.f();
				if (cv5 != cv.NORTH && cv5 != cv.EAST) {
					this.a(ajs, axz, 4, 1, 1, 4, 3, 3, alv.a.t(), alv.a.t(), false);
				} else {
					this.a(ajs, axz, 0, 1, 1, 0, 3, 3, alv.a.t(), alv.a.t(), false);
				}

				return true;
			}
		}
	}

	public static class e extends aym.p {
		private boolean a;

		public e() {
		}

		public e(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.d = this.a(random);
			this.l = axz;
			this.a = axz.d() > 6;
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Tall", this.a);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.p("Tall");
		}

		public static aym.e a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -4, -1, 0, 14, 11, 15, cv);
			if (!a(axz8) || ayq.a(list, axz8) != null) {
				axz8 = axz.a(integer3, integer4, integer5, -4, -1, 0, 14, 6, 15, cv);
				if (!a(axz8) || ayq.a(list, axz8) != null) {
					return null;
				}
			}

			return new aym.e(integer7, random, axz8, cv);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				int integer5 = 11;
				if (!this.a) {
					integer5 = 6;
				}

				this.a(ajs, axz, 0, 0, 0, 13, integer5 - 1, 14, true, random, aym.e);
				this.a(ajs, random, axz, this.d, 4, 1, 0);
				this.a(ajs, axz, random, 0.07F, 2, 1, 1, 11, 4, 13, alv.G.t(), alv.G.t(), false, 0);
				int integer6 = 1;
				int integer7 = 12;

				for (int integer8 = 1; integer8 <= 13; integer8++) {
					if ((integer8 - 1) % 4 == 0) {
						this.a(ajs, axz, 1, 1, integer8, 1, 4, integer8, alv.f.t(), alv.f.t(), false);
						this.a(ajs, axz, 12, 1, integer8, 12, 4, integer8, alv.f.t(), alv.f.t(), false);
						this.a(ajs, alv.aa.t().a(arl.a, cv.EAST), 2, 3, integer8, axz);
						this.a(ajs, alv.aa.t().a(arl.a, cv.WEST), 11, 3, integer8, axz);
						if (this.a) {
							this.a(ajs, axz, 1, 6, integer8, 1, 9, integer8, alv.f.t(), alv.f.t(), false);
							this.a(ajs, axz, 12, 6, integer8, 12, 9, integer8, alv.f.t(), alv.f.t(), false);
						}
					} else {
						this.a(ajs, axz, 1, 1, integer8, 1, 4, integer8, alv.X.t(), alv.X.t(), false);
						this.a(ajs, axz, 12, 1, integer8, 12, 4, integer8, alv.X.t(), alv.X.t(), false);
						if (this.a) {
							this.a(ajs, axz, 1, 6, integer8, 1, 9, integer8, alv.X.t(), alv.X.t(), false);
							this.a(ajs, axz, 12, 6, integer8, 12, 9, integer8, alv.X.t(), alv.X.t(), false);
						}
					}
				}

				for (int integer8x = 3; integer8x < 12; integer8x += 2) {
					this.a(ajs, axz, 3, 1, integer8x, 4, 3, integer8x, alv.X.t(), alv.X.t(), false);
					this.a(ajs, axz, 6, 1, integer8x, 7, 3, integer8x, alv.X.t(), alv.X.t(), false);
					this.a(ajs, axz, 9, 1, integer8x, 10, 3, integer8x, alv.X.t(), alv.X.t(), false);
				}

				if (this.a) {
					this.a(ajs, axz, 1, 5, 1, 3, 5, 13, alv.f.t(), alv.f.t(), false);
					this.a(ajs, axz, 10, 5, 1, 12, 5, 13, alv.f.t(), alv.f.t(), false);
					this.a(ajs, axz, 4, 5, 1, 9, 5, 2, alv.f.t(), alv.f.t(), false);
					this.a(ajs, axz, 4, 5, 12, 9, 5, 13, alv.f.t(), alv.f.t(), false);
					this.a(ajs, alv.f.t(), 9, 5, 11, axz);
					this.a(ajs, alv.f.t(), 8, 5, 11, axz);
					this.a(ajs, alv.f.t(), 9, 5, 10, axz);
					this.a(ajs, axz, 3, 6, 2, 3, 6, 12, alv.aO.t(), alv.aO.t(), false);
					this.a(ajs, axz, 10, 6, 2, 10, 6, 10, alv.aO.t(), alv.aO.t(), false);
					this.a(ajs, axz, 4, 6, 2, 9, 6, 2, alv.aO.t(), alv.aO.t(), false);
					this.a(ajs, axz, 4, 6, 12, 8, 6, 12, alv.aO.t(), alv.aO.t(), false);
					this.a(ajs, alv.aO.t(), 9, 6, 11, axz);
					this.a(ajs, alv.aO.t(), 8, 6, 11, axz);
					this.a(ajs, alv.aO.t(), 9, 6, 10, axz);
					atl atl8 = alv.au.t().a(aom.a, cv.SOUTH);
					this.a(ajs, atl8, 10, 1, 13, axz);
					this.a(ajs, atl8, 10, 2, 13, axz);
					this.a(ajs, atl8, 10, 3, 13, axz);
					this.a(ajs, atl8, 10, 4, 13, axz);
					this.a(ajs, atl8, 10, 5, 13, axz);
					this.a(ajs, atl8, 10, 6, 13, axz);
					this.a(ajs, atl8, 10, 7, 13, axz);
					int integer9 = 7;
					int integer10 = 7;
					this.a(ajs, alv.aO.t(), 6, 9, 7, axz);
					this.a(ajs, alv.aO.t(), 7, 9, 7, axz);
					this.a(ajs, alv.aO.t(), 6, 8, 7, axz);
					this.a(ajs, alv.aO.t(), 7, 8, 7, axz);
					this.a(ajs, alv.aO.t(), 6, 7, 7, axz);
					this.a(ajs, alv.aO.t(), 7, 7, 7, axz);
					this.a(ajs, alv.aO.t(), 5, 7, 7, axz);
					this.a(ajs, alv.aO.t(), 8, 7, 7, axz);
					this.a(ajs, alv.aO.t(), 6, 7, 6, axz);
					this.a(ajs, alv.aO.t(), 6, 7, 8, axz);
					this.a(ajs, alv.aO.t(), 7, 7, 6, axz);
					this.a(ajs, alv.aO.t(), 7, 7, 8, axz);
					atl atl11 = alv.aa.t().a(arl.a, cv.UP);
					this.a(ajs, atl11, 5, 8, 7, axz);
					this.a(ajs, atl11, 8, 8, 7, axz);
					this.a(ajs, atl11, 6, 8, 6, axz);
					this.a(ajs, atl11, 6, 8, 8, axz);
					this.a(ajs, atl11, 7, 8, 6, axz);
					this.a(ajs, atl11, 7, 8, 8, axz);
				}

				this.a(ajs, axz, random, 3, 3, 5, bcf.h);
				if (this.a) {
					this.a(ajs, alv.a.t(), 12, 9, 1, axz);
					this.a(ajs, axz, random, 12, 8, 1, bcf.h);
				}

				return true;
			}
		}
	}

	static class f {
		public Class<? extends aym.p> a;
		public final int b;
		public int c;
		public int d;

		public f(Class<? extends aym.p> class1, int integer2, int integer3) {
			this.a = class1;
			this.b = integer2;
			this.d = integer3;
		}

		public boolean a(int integer) {
			return this.d == 0 || this.c < this.d;
		}

		public boolean a() {
			return this.d == 0 || this.c < this.d;
		}
	}

	public static class g extends aym.p {
		private boolean a;

		public g() {
		}

		public g(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.l = axz;
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Mob", this.a);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.p("Mob");
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			if (ayq != null) {
				((aym.m)ayq).b = this;
			}
		}

		public static aym.g a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -4, -1, 0, 11, 8, 16, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new aym.g(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 0, 0, 10, 7, 15, false, random, aym.e);
			this.a(ajs, random, axz, aym.p.a.GRATES, 4, 1, 0);
			int integer5 = 6;
			this.a(ajs, axz, 1, integer5, 1, 1, integer5, 14, false, random, aym.e);
			this.a(ajs, axz, 9, integer5, 1, 9, integer5, 14, false, random, aym.e);
			this.a(ajs, axz, 2, integer5, 1, 8, integer5, 2, false, random, aym.e);
			this.a(ajs, axz, 2, integer5, 14, 8, integer5, 14, false, random, aym.e);
			this.a(ajs, axz, 1, 1, 1, 2, 1, 4, false, random, aym.e);
			this.a(ajs, axz, 8, 1, 1, 9, 1, 4, false, random, aym.e);
			this.a(ajs, axz, 1, 1, 1, 1, 1, 3, alv.k.t(), alv.k.t(), false);
			this.a(ajs, axz, 9, 1, 1, 9, 1, 3, alv.k.t(), alv.k.t(), false);
			this.a(ajs, axz, 3, 1, 8, 7, 1, 12, false, random, aym.e);
			this.a(ajs, axz, 4, 1, 9, 6, 1, 11, alv.k.t(), alv.k.t(), false);

			for (int integer6 = 3; integer6 < 14; integer6 += 2) {
				this.a(ajs, axz, 0, 3, integer6, 0, 4, integer6, alv.bi.t(), alv.bi.t(), false);
				this.a(ajs, axz, 10, 3, integer6, 10, 4, integer6, alv.bi.t(), alv.bi.t(), false);
			}

			for (int integer6 = 2; integer6 < 9; integer6 += 2) {
				this.a(ajs, axz, integer6, 3, 15, integer6, 4, 15, alv.bi.t(), alv.bi.t(), false);
			}

			atl atl6 = alv.bv.t().a(aqy.a, cv.NORTH);
			this.a(ajs, axz, 4, 1, 5, 6, 1, 7, false, random, aym.e);
			this.a(ajs, axz, 4, 2, 6, 6, 2, 7, false, random, aym.e);
			this.a(ajs, axz, 4, 3, 7, 6, 3, 7, false, random, aym.e);

			for (int integer7 = 4; integer7 <= 6; integer7++) {
				this.a(ajs, atl6, integer7, 1, 4, axz);
				this.a(ajs, atl6, integer7, 2, 5, axz);
				this.a(ajs, atl6, integer7, 3, 6, axz);
			}

			atl atl7 = alv.bG.t().a(anf.a, cv.NORTH);
			atl atl8 = alv.bG.t().a(anf.a, cv.SOUTH);
			atl atl9 = alv.bG.t().a(anf.a, cv.EAST);
			atl atl10 = alv.bG.t().a(anf.a, cv.WEST);
			boolean boolean11 = true;
			boolean[] arr12 = new boolean[12];

			for (int integer13 = 0; integer13 < arr12.length; integer13++) {
				arr12[integer13] = random.nextFloat() > 0.9F;
				boolean11 &= arr12[integer13];
			}

			this.a(ajs, atl7.a(anf.b, arr12[0]), 4, 3, 8, axz);
			this.a(ajs, atl7.a(anf.b, arr12[1]), 5, 3, 8, axz);
			this.a(ajs, atl7.a(anf.b, arr12[2]), 6, 3, 8, axz);
			this.a(ajs, atl8.a(anf.b, arr12[3]), 4, 3, 12, axz);
			this.a(ajs, atl8.a(anf.b, arr12[4]), 5, 3, 12, axz);
			this.a(ajs, atl8.a(anf.b, arr12[5]), 6, 3, 12, axz);
			this.a(ajs, atl9.a(anf.b, arr12[6]), 3, 3, 9, axz);
			this.a(ajs, atl9.a(anf.b, arr12[7]), 3, 3, 10, axz);
			this.a(ajs, atl9.a(anf.b, arr12[8]), 3, 3, 11, axz);
			this.a(ajs, atl10.a(anf.b, arr12[9]), 7, 3, 9, axz);
			this.a(ajs, atl10.a(anf.b, arr12[10]), 7, 3, 10, axz);
			this.a(ajs, atl10.a(anf.b, arr12[11]), 7, 3, 11, axz);
			if (boolean11) {
				atl atl13 = alv.bF.t();
				this.a(ajs, atl13, 4, 3, 9, axz);
				this.a(ajs, atl13, 5, 3, 9, axz);
				this.a(ajs, atl13, 6, 3, 9, axz);
				this.a(ajs, atl13, 4, 3, 10, axz);
				this.a(ajs, atl13, 5, 3, 10, axz);
				this.a(ajs, atl13, 6, 3, 10, axz);
				this.a(ajs, atl13, 4, 3, 11, axz);
				this.a(ajs, atl13, 5, 3, 11, axz);
				this.a(ajs, atl13, 6, 3, 11, axz);
			}

			if (!this.a) {
				integer5 = this.d(3);
				co co13 = new co(this.a(5, 6), integer5, this.b(5, 6));
				if (axz.b(co13)) {
					this.a = true;
					ajs.a(co13, alv.ac.t(), 2);
					asc asc14 = ajs.r(co13);
					if (asc14 instanceof asr) {
						((asr)asc14).a().a(sp.a(aaf.class));
					}
				}
			}

			return true;
		}
	}

	public static class h extends aym.p {
		public h() {
		}

		public h(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.d = this.a(random);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((aym.m)ayq, list, random, 1, 1);
		}

		public static aym.h a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, -1, 0, 9, 5, 11, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new aym.h(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				this.a(ajs, axz, 0, 0, 0, 8, 4, 10, true, random, aym.e);
				this.a(ajs, random, axz, this.d, 1, 1, 0);
				this.a(ajs, axz, 1, 1, 10, 3, 3, 10, alv.a.t(), alv.a.t(), false);
				this.a(ajs, axz, 4, 1, 1, 4, 3, 1, false, random, aym.e);
				this.a(ajs, axz, 4, 1, 3, 4, 3, 3, false, random, aym.e);
				this.a(ajs, axz, 4, 1, 7, 4, 3, 7, false, random, aym.e);
				this.a(ajs, axz, 4, 1, 9, 4, 3, 9, false, random, aym.e);
				this.a(ajs, axz, 4, 1, 4, 4, 3, 6, alv.bi.t(), alv.bi.t(), false);
				this.a(ajs, axz, 5, 1, 5, 7, 3, 5, alv.bi.t(), alv.bi.t(), false);
				this.a(ajs, alv.bi.t(), 4, 3, 2, axz);
				this.a(ajs, alv.bi.t(), 4, 3, 8, axz);
				atl atl5 = alv.aA.t().a(amx.a, cv.WEST);
				atl atl6 = alv.aA.t().a(amx.a, cv.WEST).a(amx.e, amx.a.UPPER);
				this.a(ajs, atl5, 4, 1, 2, axz);
				this.a(ajs, atl6, 4, 2, 2, axz);
				this.a(ajs, atl5, 4, 1, 8, axz);
				this.a(ajs, atl6, 4, 2, 8, axz);
				return true;
			}
		}
	}

	public static class i extends aym.d {
		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			cv cv5 = this.f();
			if (cv5 != cv.NORTH && cv5 != cv.EAST) {
				this.b((aym.m)ayq, list, random, 1, 1);
			} else {
				this.c((aym.m)ayq, list, random, 1, 1);
			}
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				this.a(ajs, axz, 0, 0, 0, 4, 4, 4, true, random, aym.e);
				this.a(ajs, random, axz, this.d, 1, 1, 0);
				cv cv5 = this.f();
				if (cv5 != cv.NORTH && cv5 != cv.EAST) {
					this.a(ajs, axz, 0, 1, 1, 0, 3, 3, alv.a.t(), alv.a.t(), false);
				} else {
					this.a(ajs, axz, 4, 1, 1, 4, 3, 3, alv.a.t(), alv.a.t(), false);
				}

				return true;
			}
		}
	}

	public static class j extends aym.p {
		protected int a;

		public j() {
		}

		public j(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.d = this.a(random);
			this.l = axz;
			this.a = random.nextInt(5);
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Type", this.a);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.h("Type");
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((aym.m)ayq, list, random, 4, 1);
			this.b((aym.m)ayq, list, random, 1, 4);
			this.c((aym.m)ayq, list, random, 1, 4);
		}

		public static aym.j a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -4, -1, 0, 11, 7, 11, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new aym.j(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				this.a(ajs, axz, 0, 0, 0, 10, 6, 10, true, random, aym.e);
				this.a(ajs, random, axz, this.d, 4, 1, 0);
				this.a(ajs, axz, 4, 1, 10, 6, 3, 10, alv.a.t(), alv.a.t(), false);
				this.a(ajs, axz, 0, 1, 4, 0, 3, 6, alv.a.t(), alv.a.t(), false);
				this.a(ajs, axz, 10, 1, 4, 10, 3, 6, alv.a.t(), alv.a.t(), false);
				switch (this.a) {
					case 0:
						this.a(ajs, alv.bf.t(), 5, 1, 5, axz);
						this.a(ajs, alv.bf.t(), 5, 2, 5, axz);
						this.a(ajs, alv.bf.t(), 5, 3, 5, axz);
						this.a(ajs, alv.aa.t().a(arl.a, cv.WEST), 4, 3, 5, axz);
						this.a(ajs, alv.aa.t().a(arl.a, cv.EAST), 6, 3, 5, axz);
						this.a(ajs, alv.aa.t().a(arl.a, cv.SOUTH), 5, 3, 4, axz);
						this.a(ajs, alv.aa.t().a(arl.a, cv.NORTH), 5, 3, 6, axz);
						this.a(ajs, alv.U.t(), 4, 1, 4, axz);
						this.a(ajs, alv.U.t(), 4, 1, 5, axz);
						this.a(ajs, alv.U.t(), 4, 1, 6, axz);
						this.a(ajs, alv.U.t(), 6, 1, 4, axz);
						this.a(ajs, alv.U.t(), 6, 1, 5, axz);
						this.a(ajs, alv.U.t(), 6, 1, 6, axz);
						this.a(ajs, alv.U.t(), 5, 1, 4, axz);
						this.a(ajs, alv.U.t(), 5, 1, 6, axz);
						break;
					case 1:
						for (int integer5 = 0; integer5 < 5; integer5++) {
							this.a(ajs, alv.bf.t(), 3, 1, 3 + integer5, axz);
							this.a(ajs, alv.bf.t(), 7, 1, 3 + integer5, axz);
							this.a(ajs, alv.bf.t(), 3 + integer5, 1, 3, axz);
							this.a(ajs, alv.bf.t(), 3 + integer5, 1, 7, axz);
						}

						this.a(ajs, alv.bf.t(), 5, 1, 5, axz);
						this.a(ajs, alv.bf.t(), 5, 2, 5, axz);
						this.a(ajs, alv.bf.t(), 5, 3, 5, axz);
						this.a(ajs, alv.i.t(), 5, 4, 5, axz);
						break;
					case 2:
						for (int integer5 = 1; integer5 <= 9; integer5++) {
							this.a(ajs, alv.e.t(), 1, 3, integer5, axz);
							this.a(ajs, alv.e.t(), 9, 3, integer5, axz);
						}

						for (int integer5 = 1; integer5 <= 9; integer5++) {
							this.a(ajs, alv.e.t(), integer5, 3, 1, axz);
							this.a(ajs, alv.e.t(), integer5, 3, 9, axz);
						}

						this.a(ajs, alv.e.t(), 5, 1, 4, axz);
						this.a(ajs, alv.e.t(), 5, 1, 6, axz);
						this.a(ajs, alv.e.t(), 5, 3, 4, axz);
						this.a(ajs, alv.e.t(), 5, 3, 6, axz);
						this.a(ajs, alv.e.t(), 4, 1, 5, axz);
						this.a(ajs, alv.e.t(), 6, 1, 5, axz);
						this.a(ajs, alv.e.t(), 4, 3, 5, axz);
						this.a(ajs, alv.e.t(), 6, 3, 5, axz);

						for (int integer5 = 1; integer5 <= 3; integer5++) {
							this.a(ajs, alv.e.t(), 4, integer5, 4, axz);
							this.a(ajs, alv.e.t(), 6, integer5, 4, axz);
							this.a(ajs, alv.e.t(), 4, integer5, 6, axz);
							this.a(ajs, alv.e.t(), 6, integer5, 6, axz);
						}

						this.a(ajs, alv.aa.t(), 5, 3, 5, axz);

						for (int integer5 = 2; integer5 <= 8; integer5++) {
							this.a(ajs, alv.f.t(), 2, 3, integer5, axz);
							this.a(ajs, alv.f.t(), 3, 3, integer5, axz);
							if (integer5 <= 3 || integer5 >= 7) {
								this.a(ajs, alv.f.t(), 4, 3, integer5, axz);
								this.a(ajs, alv.f.t(), 5, 3, integer5, axz);
								this.a(ajs, alv.f.t(), 6, 3, integer5, axz);
							}

							this.a(ajs, alv.f.t(), 7, 3, integer5, axz);
							this.a(ajs, alv.f.t(), 8, 3, integer5, axz);
						}

						atl atl5 = alv.au.t().a(aom.a, cv.WEST);
						this.a(ajs, atl5, 9, 1, 3, axz);
						this.a(ajs, atl5, 9, 2, 3, axz);
						this.a(ajs, atl5, 9, 3, 3, axz);
						this.a(ajs, axz, random, 3, 4, 8, bcf.i);
				}

				return true;
			}
		}
	}

	static class k extends ayq.a {
		private k() {
		}

		@Override
		public void a(Random random, int integer2, int integer3, int integer4, boolean boolean5) {
			if (boolean5) {
				float float7 = random.nextFloat();
				if (float7 < 0.2F) {
					this.a = alv.bf.a(ard.d);
				} else if (float7 < 0.5F) {
					this.a = alv.bf.a(ard.c);
				} else if (float7 < 0.55F) {
					this.a = alv.be.a(aow.a.STONEBRICK.a());
				} else {
					this.a = alv.bf.t();
				}
			} else {
				this.a = alv.a.t();
			}
		}
	}

	public static class l extends aym.p {
		private boolean a;

		public l() {
		}

		public l(int integer1, Random random, int integer3, int integer4) {
			super(integer1);
			this.a = true;
			this.a(cv.c.HORIZONTAL.a(random));
			this.d = aym.p.a.OPENING;
			if (this.f().k() == cv.a.Z) {
				this.l = new axz(integer3, 64, integer4, integer3 + 5 - 1, 74, integer4 + 5 - 1);
			} else {
				this.l = new axz(integer3, 64, integer4, integer3 + 5 - 1, 74, integer4 + 5 - 1);
			}
		}

		public l(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a = false;
			this.a(cv);
			this.d = this.a(random);
			this.l = axz;
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Source", this.a);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.p("Source");
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			if (this.a) {
				aym.d = aym.c.class;
			}

			this.a((aym.m)ayq, list, random, 1, 1);
		}

		public static aym.l a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, -7, 0, 5, 11, 5, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new aym.l(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				this.a(ajs, axz, 0, 0, 0, 4, 10, 4, true, random, aym.e);
				this.a(ajs, random, axz, this.d, 1, 7, 0);
				this.a(ajs, random, axz, aym.p.a.OPENING, 1, 1, 4);
				this.a(ajs, alv.bf.t(), 2, 6, 1, axz);
				this.a(ajs, alv.bf.t(), 1, 5, 1, axz);
				this.a(ajs, alv.U.a(arf.a.STONE.a()), 1, 6, 1, axz);
				this.a(ajs, alv.bf.t(), 1, 5, 2, axz);
				this.a(ajs, alv.bf.t(), 1, 4, 3, axz);
				this.a(ajs, alv.U.a(arf.a.STONE.a()), 1, 5, 3, axz);
				this.a(ajs, alv.bf.t(), 2, 4, 3, axz);
				this.a(ajs, alv.bf.t(), 3, 3, 3, axz);
				this.a(ajs, alv.U.a(arf.a.STONE.a()), 3, 4, 3, axz);
				this.a(ajs, alv.bf.t(), 3, 3, 2, axz);
				this.a(ajs, alv.bf.t(), 3, 2, 1, axz);
				this.a(ajs, alv.U.a(arf.a.STONE.a()), 3, 3, 1, axz);
				this.a(ajs, alv.bf.t(), 2, 2, 1, axz);
				this.a(ajs, alv.bf.t(), 1, 1, 1, axz);
				this.a(ajs, alv.U.a(arf.a.STONE.a()), 1, 2, 1, axz);
				this.a(ajs, alv.bf.t(), 1, 1, 2, axz);
				this.a(ajs, alv.U.a(arf.a.STONE.a()), 1, 1, 3, axz);
				return true;
			}
		}
	}

	public static class m extends aym.l {
		public aym.f a;
		public aym.g b;
		public List<ayq> c = Lists.newArrayList();

		public m() {
		}

		public m(int integer1, Random random, int integer3, int integer4) {
			super(0, random, integer3, integer4);
		}
	}

	public static class n extends aym.p {
		private boolean a;
		private boolean b;

		public n() {
		}

		public n(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.d = this.a(random);
			this.l = axz;
			this.a = random.nextInt(2) == 0;
			this.b = random.nextInt(2) == 0;
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Left", this.a);
			du.a("Right", this.b);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.p("Left");
			this.b = du.p("Right");
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((aym.m)ayq, list, random, 1, 1);
			if (this.a) {
				this.b((aym.m)ayq, list, random, 1, 2);
			}

			if (this.b) {
				this.c((aym.m)ayq, list, random, 1, 2);
			}
		}

		public static aym.n a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, -1, 0, 5, 5, 7, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new aym.n(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				this.a(ajs, axz, 0, 0, 0, 4, 4, 6, true, random, aym.e);
				this.a(ajs, random, axz, this.d, 1, 1, 0);
				this.a(ajs, random, axz, aym.p.a.OPENING, 1, 1, 6);
				atl atl5 = alv.aa.t().a(arl.a, cv.EAST);
				atl atl6 = alv.aa.t().a(arl.a, cv.WEST);
				this.a(ajs, axz, random, 0.1F, 1, 2, 1, atl5);
				this.a(ajs, axz, random, 0.1F, 3, 2, 1, atl6);
				this.a(ajs, axz, random, 0.1F, 1, 2, 5, atl5);
				this.a(ajs, axz, random, 0.1F, 3, 2, 5, atl6);
				if (this.a) {
					this.a(ajs, axz, 0, 1, 2, 0, 3, 4, alv.a.t(), alv.a.t(), false);
				}

				if (this.b) {
					this.a(ajs, axz, 4, 1, 2, 4, 3, 4, alv.a.t(), alv.a.t(), false);
				}

				return true;
			}
		}
	}

	public static class o extends aym.p {
		public o() {
		}

		public o(int integer, Random random, axz axz, cv cv) {
			super(integer);
			this.a(cv);
			this.d = this.a(random);
			this.l = axz;
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			this.a((aym.m)ayq, list, random, 1, 1);
		}

		public static aym.o a(List<ayq> list, Random random, int integer3, int integer4, int integer5, cv cv, int integer7) {
			axz axz8 = axz.a(integer3, integer4, integer5, -1, -7, 0, 5, 11, 8, cv);
			return a(axz8) && ayq.a(list, axz8) == null ? new aym.o(integer7, random, axz8, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.a(ajs, axz)) {
				return false;
			} else {
				this.a(ajs, axz, 0, 0, 0, 4, 10, 7, true, random, aym.e);
				this.a(ajs, random, axz, this.d, 1, 7, 0);
				this.a(ajs, random, axz, aym.p.a.OPENING, 1, 1, 7);
				atl atl5 = alv.aw.t().a(aqy.a, cv.SOUTH);

				for (int integer6 = 0; integer6 < 6; integer6++) {
					this.a(ajs, atl5, 1, 6 - integer6, 1 + integer6, axz);
					this.a(ajs, atl5, 2, 6 - integer6, 1 + integer6, axz);
					this.a(ajs, atl5, 3, 6 - integer6, 1 + integer6, axz);
					if (integer6 < 5) {
						this.a(ajs, alv.bf.t(), 1, 5 - integer6, 1 + integer6, axz);
						this.a(ajs, alv.bf.t(), 2, 5 - integer6, 1 + integer6, axz);
						this.a(ajs, alv.bf.t(), 3, 5 - integer6, 1 + integer6, axz);
					}
				}

				return true;
			}
		}
	}

	abstract static class p extends ayq {
		protected aym.p.a d = aym.p.a.OPENING;

		public p() {
		}

		protected p(int integer) {
			super(integer);
		}

		@Override
		protected void a(du du) {
			du.a("EntryDoor", this.d.name());
		}

		@Override
		protected void a(du du, ayz ayz) {
			this.d = aym.p.a.valueOf(du.l("EntryDoor"));
		}

		protected void a(ajs ajs, Random random, axz axz, aym.p.a a, int integer5, int integer6, int integer7) {
			switch (a) {
				case OPENING:
					this.a(ajs, axz, integer5, integer6, integer7, integer5 + 3 - 1, integer6 + 3 - 1, integer7, alv.a.t(), alv.a.t(), false);
					break;
				case WOOD_DOOR:
					this.a(ajs, alv.bf.t(), integer5, integer6, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5, integer6 + 1, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5, integer6 + 2, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5 + 1, integer6 + 2, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5 + 2, integer6 + 2, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5 + 2, integer6 + 1, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5 + 2, integer6, integer7, axz);
					this.a(ajs, alv.ao.t(), integer5 + 1, integer6, integer7, axz);
					this.a(ajs, alv.ao.t().a(amx.e, amx.a.UPPER), integer5 + 1, integer6 + 1, integer7, axz);
					break;
				case GRATES:
					this.a(ajs, alv.a.t(), integer5 + 1, integer6, integer7, axz);
					this.a(ajs, alv.a.t(), integer5 + 1, integer6 + 1, integer7, axz);
					this.a(ajs, alv.bi.t(), integer5, integer6, integer7, axz);
					this.a(ajs, alv.bi.t(), integer5, integer6 + 1, integer7, axz);
					this.a(ajs, alv.bi.t(), integer5, integer6 + 2, integer7, axz);
					this.a(ajs, alv.bi.t(), integer5 + 1, integer6 + 2, integer7, axz);
					this.a(ajs, alv.bi.t(), integer5 + 2, integer6 + 2, integer7, axz);
					this.a(ajs, alv.bi.t(), integer5 + 2, integer6 + 1, integer7, axz);
					this.a(ajs, alv.bi.t(), integer5 + 2, integer6, integer7, axz);
					break;
				case IRON_DOOR:
					this.a(ajs, alv.bf.t(), integer5, integer6, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5, integer6 + 1, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5, integer6 + 2, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5 + 1, integer6 + 2, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5 + 2, integer6 + 2, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5 + 2, integer6 + 1, integer7, axz);
					this.a(ajs, alv.bf.t(), integer5 + 2, integer6, integer7, axz);
					this.a(ajs, alv.aA.t(), integer5 + 1, integer6, integer7, axz);
					this.a(ajs, alv.aA.t().a(amx.e, amx.a.UPPER), integer5 + 1, integer6 + 1, integer7, axz);
					this.a(ajs, alv.aG.t().a(amb.H, cv.NORTH), integer5 + 2, integer6 + 1, integer7 + 1, axz);
					this.a(ajs, alv.aG.t().a(amb.H, cv.SOUTH), integer5 + 2, integer6 + 1, integer7 - 1, axz);
			}
		}

		protected aym.p.a a(Random random) {
			int integer3 = random.nextInt(5);
			switch (integer3) {
				case 0:
				case 1:
				default:
					return aym.p.a.OPENING;
				case 2:
					return aym.p.a.WOOD_DOOR;
				case 3:
					return aym.p.a.GRATES;
				case 4:
					return aym.p.a.IRON_DOOR;
			}
		}

		@Nullable
		protected ayq a(aym.m m, List<ayq> list, Random random, int integer4, int integer5) {
			cv cv7 = this.f();
			if (cv7 != null) {
				switch (cv7) {
					case NORTH:
						return aym.c(m, list, random, this.l.a + integer4, this.l.b + integer5, this.l.c - 1, cv7, this.e());
					case SOUTH:
						return aym.c(m, list, random, this.l.a + integer4, this.l.b + integer5, this.l.f + 1, cv7, this.e());
					case WEST:
						return aym.c(m, list, random, this.l.a - 1, this.l.b + integer5, this.l.c + integer4, cv7, this.e());
					case EAST:
						return aym.c(m, list, random, this.l.d + 1, this.l.b + integer5, this.l.c + integer4, cv7, this.e());
				}
			}

			return null;
		}

		@Nullable
		protected ayq b(aym.m m, List<ayq> list, Random random, int integer4, int integer5) {
			cv cv7 = this.f();
			if (cv7 != null) {
				switch (cv7) {
					case NORTH:
						return aym.c(m, list, random, this.l.a - 1, this.l.b + integer4, this.l.c + integer5, cv.WEST, this.e());
					case SOUTH:
						return aym.c(m, list, random, this.l.a - 1, this.l.b + integer4, this.l.c + integer5, cv.WEST, this.e());
					case WEST:
						return aym.c(m, list, random, this.l.a + integer5, this.l.b + integer4, this.l.c - 1, cv.NORTH, this.e());
					case EAST:
						return aym.c(m, list, random, this.l.a + integer5, this.l.b + integer4, this.l.c - 1, cv.NORTH, this.e());
				}
			}

			return null;
		}

		@Nullable
		protected ayq c(aym.m m, List<ayq> list, Random random, int integer4, int integer5) {
			cv cv7 = this.f();
			if (cv7 != null) {
				switch (cv7) {
					case NORTH:
						return aym.c(m, list, random, this.l.d + 1, this.l.b + integer4, this.l.c + integer5, cv.EAST, this.e());
					case SOUTH:
						return aym.c(m, list, random, this.l.d + 1, this.l.b + integer4, this.l.c + integer5, cv.EAST, this.e());
					case WEST:
						return aym.c(m, list, random, this.l.a + integer5, this.l.b + integer4, this.l.f + 1, cv.SOUTH, this.e());
					case EAST:
						return aym.c(m, list, random, this.l.a + integer5, this.l.b + integer4, this.l.f + 1, cv.SOUTH, this.e());
				}
			}

			return null;
		}

		protected static boolean a(axz axz) {
			return axz != null && axz.b > 10;
		}

		public static enum a {
			OPENING,
			WOOD_DOOR,
			GRATES,
			IRON_DOOR;
		}
	}
}
