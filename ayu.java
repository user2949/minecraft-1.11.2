import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ayu {
	public static void a() {
		ayo.a(ayu.a.class, "ViBH");
		ayo.a(ayu.b.class, "ViDF");
		ayo.a(ayu.c.class, "ViF");
		ayo.a(ayu.d.class, "ViL");
		ayo.a(ayu.f.class, "ViPH");
		ayo.a(ayu.g.class, "ViSH");
		ayo.a(ayu.h.class, "ViSmH");
		ayo.a(ayu.i.class, "ViST");
		ayo.a(ayu.j.class, "ViS");
		ayo.a(ayu.k.class, "ViStart");
		ayo.a(ayu.l.class, "ViSR");
		ayo.a(ayu.m.class, "ViTRH");
		ayo.a(ayu.p.class, "ViW");
	}

	public static List<ayu.e> a(Random random, int integer) {
		List<ayu.e> list3 = Lists.newArrayList();
		list3.add(new ayu.e(ayu.g.class, 4, ot.a(random, 2 + integer, 4 + integer * 2)));
		list3.add(new ayu.e(ayu.i.class, 20, ot.a(random, 0 + integer, 1 + integer)));
		list3.add(new ayu.e(ayu.a.class, 20, ot.a(random, 0 + integer, 2 + integer)));
		list3.add(new ayu.e(ayu.h.class, 3, ot.a(random, 2 + integer, 5 + integer * 3)));
		list3.add(new ayu.e(ayu.f.class, 15, ot.a(random, 0 + integer, 2 + integer)));
		list3.add(new ayu.e(ayu.b.class, 3, ot.a(random, 1 + integer, 4 + integer)));
		list3.add(new ayu.e(ayu.c.class, 3, ot.a(random, 2 + integer, 4 + integer * 2)));
		list3.add(new ayu.e(ayu.j.class, 15, ot.a(random, 0, 1 + integer)));
		list3.add(new ayu.e(ayu.m.class, 8, ot.a(random, 0 + integer, 3 + integer * 2)));
		Iterator<ayu.e> iterator4 = list3.iterator();

		while (iterator4.hasNext()) {
			if (((ayu.e)iterator4.next()).d == 0) {
				iterator4.remove();
			}
		}

		return list3;
	}

	private static int a(List<ayu.e> list) {
		boolean boolean2 = false;
		int integer3 = 0;

		for (ayu.e e5 : list) {
			if (e5.d > 0 && e5.c < e5.d) {
				boolean2 = true;
			}

			integer3 += e5.b;
		}

		return boolean2 ? integer3 : -1;
	}

	private static ayu.n a(ayu.k k, ayu.e e, List<ayq> list, Random random, int integer5, int integer6, int integer7, cv cv, int integer9) {
		Class<? extends ayu.n> class10 = e.a;
		ayu.n n11 = null;
		if (class10 == ayu.g.class) {
			n11 = ayu.g.a(k, list, random, integer5, integer6, integer7, cv, integer9);
		} else if (class10 == ayu.i.class) {
			n11 = ayu.i.a(k, list, random, integer5, integer6, integer7, cv, integer9);
		} else if (class10 == ayu.a.class) {
			n11 = ayu.a.a(k, list, random, integer5, integer6, integer7, cv, integer9);
		} else if (class10 == ayu.h.class) {
			n11 = ayu.h.a(k, list, random, integer5, integer6, integer7, cv, integer9);
		} else if (class10 == ayu.f.class) {
			n11 = ayu.f.a(k, list, random, integer5, integer6, integer7, cv, integer9);
		} else if (class10 == ayu.b.class) {
			n11 = ayu.b.a(k, list, random, integer5, integer6, integer7, cv, integer9);
		} else if (class10 == ayu.c.class) {
			n11 = ayu.c.a(k, list, random, integer5, integer6, integer7, cv, integer9);
		} else if (class10 == ayu.j.class) {
			n11 = ayu.j.a(k, list, random, integer5, integer6, integer7, cv, integer9);
		} else if (class10 == ayu.m.class) {
			n11 = ayu.m.a(k, list, random, integer5, integer6, integer7, cv, integer9);
		}

		return n11;
	}

	private static ayu.n c(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
		int integer9 = a(k.d);
		if (integer9 <= 0) {
			return null;
		} else {
			int integer10 = 0;

			while (integer10 < 5) {
				integer10++;
				int integer11 = random.nextInt(integer9);

				for (ayu.e e13 : k.d) {
					integer11 -= e13.b;
					if (integer11 < 0) {
						if (!e13.a(integer8) || e13 == k.c && k.d.size() > 1) {
							break;
						}

						ayu.n n14 = a(k, e13, list, random, integer4, integer5, integer6, cv, integer8);
						if (n14 != null) {
							e13.c++;
							k.c = e13;
							if (!e13.a()) {
								k.d.remove(e13);
							}

							return n14;
						}
					}
				}
			}

			axz axz11 = ayu.d.a(k, list, random, integer4, integer5, integer6, cv);
			return axz11 != null ? new ayu.d(k, integer8, random, axz11, cv) : null;
		}
	}

	private static ayq d(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
		if (integer8 > 50) {
			return null;
		} else if (Math.abs(integer4 - k.d().a) <= 112 && Math.abs(integer6 - k.d().c) <= 112) {
			ayq ayq9 = c(k, list, random, integer4, integer5, integer6, cv, integer8 + 1);
			if (ayq9 != null) {
				list.add(ayq9);
				k.e.add(ayq9);
				return ayq9;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	private static ayq e(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
		if (integer8 > 3 + k.b) {
			return null;
		} else if (Math.abs(integer4 - k.d().a) <= 112 && Math.abs(integer6 - k.d().c) <= 112) {
			axz axz9 = ayu.l.a(k, list, random, integer4, integer5, integer6, cv);
			if (axz9 != null && axz9.b > 10) {
				ayq ayq10 = new ayu.l(k, integer8, random, axz9, cv);
				list.add(ayq10);
				k.f.add(ayq10);
				return ayq10;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public static class a extends ayu.n {
		public a() {
		}

		public a(ayu.k k, int integer, Random random, axz axz, cv cv) {
			super(k, integer);
			this.a(cv);
			this.l = axz;
		}

		public static ayu.a a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
			axz axz9 = axz.a(integer4, integer5, integer6, 0, 0, 0, 9, 9, 6, cv);
			return a(axz9) && ayq.a(list, axz9) == null ? new ayu.a(k, integer8, random, axz9, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.g < 0) {
				this.g = this.b(ajs, axz);
				if (this.g < 0) {
					return true;
				}

				this.l.a(0, this.g - this.l.e + 9 - 1, 0);
			}

			atl atl5 = this.a(alv.e.t());
			atl atl6 = this.a(alv.ad.t().a(aqy.a, cv.NORTH));
			atl atl7 = this.a(alv.ad.t().a(aqy.a, cv.SOUTH));
			atl atl8 = this.a(alv.ad.t().a(aqy.a, cv.EAST));
			atl atl9 = this.a(alv.f.t());
			atl atl10 = this.a(alv.aw.t().a(aqy.a, cv.NORTH));
			atl atl11 = this.a(alv.aO.t());
			this.a(ajs, axz, 1, 1, 1, 7, 5, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 0, 0, 8, 0, 5, atl5, atl5, false);
			this.a(ajs, axz, 0, 5, 0, 8, 5, 5, atl5, atl5, false);
			this.a(ajs, axz, 0, 6, 1, 8, 6, 4, atl5, atl5, false);
			this.a(ajs, axz, 0, 7, 2, 8, 7, 3, atl5, atl5, false);

			for (int integer12 = -1; integer12 <= 2; integer12++) {
				for (int integer13 = 0; integer13 <= 8; integer13++) {
					this.a(ajs, atl6, integer13, 6 + integer12, integer12, axz);
					this.a(ajs, atl7, integer13, 6 + integer12, 5 - integer12, axz);
				}
			}

			this.a(ajs, axz, 0, 1, 0, 0, 1, 5, atl5, atl5, false);
			this.a(ajs, axz, 1, 1, 5, 8, 1, 5, atl5, atl5, false);
			this.a(ajs, axz, 8, 1, 0, 8, 1, 4, atl5, atl5, false);
			this.a(ajs, axz, 2, 1, 0, 7, 1, 0, atl5, atl5, false);
			this.a(ajs, axz, 0, 2, 0, 0, 4, 0, atl5, atl5, false);
			this.a(ajs, axz, 0, 2, 5, 0, 4, 5, atl5, atl5, false);
			this.a(ajs, axz, 8, 2, 5, 8, 4, 5, atl5, atl5, false);
			this.a(ajs, axz, 8, 2, 0, 8, 4, 0, atl5, atl5, false);
			this.a(ajs, axz, 0, 2, 1, 0, 4, 4, atl9, atl9, false);
			this.a(ajs, axz, 1, 2, 5, 7, 4, 5, atl9, atl9, false);
			this.a(ajs, axz, 8, 2, 1, 8, 4, 4, atl9, atl9, false);
			this.a(ajs, axz, 1, 2, 0, 7, 4, 0, atl9, atl9, false);
			this.a(ajs, alv.bj.t(), 4, 2, 0, axz);
			this.a(ajs, alv.bj.t(), 5, 2, 0, axz);
			this.a(ajs, alv.bj.t(), 6, 2, 0, axz);
			this.a(ajs, alv.bj.t(), 4, 3, 0, axz);
			this.a(ajs, alv.bj.t(), 5, 3, 0, axz);
			this.a(ajs, alv.bj.t(), 6, 3, 0, axz);
			this.a(ajs, alv.bj.t(), 0, 2, 2, axz);
			this.a(ajs, alv.bj.t(), 0, 2, 3, axz);
			this.a(ajs, alv.bj.t(), 0, 3, 2, axz);
			this.a(ajs, alv.bj.t(), 0, 3, 3, axz);
			this.a(ajs, alv.bj.t(), 8, 2, 2, axz);
			this.a(ajs, alv.bj.t(), 8, 2, 3, axz);
			this.a(ajs, alv.bj.t(), 8, 3, 2, axz);
			this.a(ajs, alv.bj.t(), 8, 3, 3, axz);
			this.a(ajs, alv.bj.t(), 2, 2, 5, axz);
			this.a(ajs, alv.bj.t(), 3, 2, 5, axz);
			this.a(ajs, alv.bj.t(), 5, 2, 5, axz);
			this.a(ajs, alv.bj.t(), 6, 2, 5, axz);
			this.a(ajs, axz, 1, 4, 1, 7, 4, 1, atl9, atl9, false);
			this.a(ajs, axz, 1, 4, 4, 7, 4, 4, atl9, atl9, false);
			this.a(ajs, axz, 1, 3, 4, 7, 3, 4, alv.X.t(), alv.X.t(), false);
			this.a(ajs, atl9, 7, 1, 4, axz);
			this.a(ajs, atl8, 7, 1, 3, axz);
			this.a(ajs, atl6, 6, 1, 4, axz);
			this.a(ajs, atl6, 5, 1, 4, axz);
			this.a(ajs, atl6, 4, 1, 4, axz);
			this.a(ajs, atl6, 3, 1, 4, axz);
			this.a(ajs, atl11, 6, 1, 3, axz);
			this.a(ajs, alv.aB.t(), 6, 2, 3, axz);
			this.a(ajs, atl11, 4, 1, 3, axz);
			this.a(ajs, alv.aB.t(), 4, 2, 3, axz);
			this.a(ajs, alv.ai.t(), 7, 1, 1, axz);
			this.a(ajs, alv.a.t(), 1, 1, 0, axz);
			this.a(ajs, alv.a.t(), 1, 2, 0, axz);
			this.a(ajs, axz, random, 1, 1, 0, cv.NORTH);
			if (this.a(ajs, 1, 0, -1, axz).a() == azs.a && this.a(ajs, 1, -1, -1, axz).a() != azs.a) {
				this.a(ajs, atl10, 1, 0, -1, axz);
				if (this.a(ajs, 1, -1, -1, axz).v() == alv.da) {
					this.a(ajs, alv.c.t(), 1, -1, -1, axz);
				}
			}

			for (int integer13 = 0; integer13 < 6; integer13++) {
				for (int integer14 = 0; integer14 < 9; integer14++) {
					this.c(ajs, integer14, 9, integer13, axz);
					this.b(ajs, atl5, integer14, -1, integer13, axz);
				}
			}

			this.a(ajs, axz, 2, 1, 2, 1);
			return true;
		}

		@Override
		protected int c(int integer1, int integer2) {
			return 1;
		}
	}

	public static class b extends ayu.n {
		private alu a;
		private alu b;
		private alu c;
		private alu d;

		public b() {
		}

		public b(ayu.k k, int integer, Random random, axz axz, cv cv) {
			super(k, integer);
			this.a(cv);
			this.l = axz;
			this.a = this.a(random);
			this.b = this.a(random);
			this.c = this.a(random);
			this.d = this.a(random);
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("CA", alu.h.a(this.a));
			du.a("CB", alu.h.a(this.b));
			du.a("CC", alu.h.a(this.c));
			du.a("CD", alu.h.a(this.d));
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = alu.b(du.h("CA"));
			this.b = alu.b(du.h("CB"));
			this.c = alu.b(du.h("CC"));
			this.d = alu.b(du.h("CD"));
			if (!(this.a instanceof amp)) {
				this.a = alv.aj;
			}

			if (!(this.b instanceof amp)) {
				this.b = alv.cb;
			}

			if (!(this.c instanceof amp)) {
				this.c = alv.cc;
			}

			if (!(this.d instanceof amp)) {
				this.d = alv.cZ;
			}
		}

		private alu a(Random random) {
			switch (random.nextInt(10)) {
				case 0:
				case 1:
					return alv.cb;
				case 2:
				case 3:
					return alv.cc;
				case 4:
					return alv.cZ;
				default:
					return alv.aj;
			}
		}

		public static ayu.b a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
			axz axz9 = axz.a(integer4, integer5, integer6, 0, 0, 0, 13, 4, 9, cv);
			return a(axz9) && ayq.a(list, axz9) == null ? new ayu.b(k, integer8, random, axz9, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.g < 0) {
				this.g = this.b(ajs, axz);
				if (this.g < 0) {
					return true;
				}

				this.l.a(0, this.g - this.l.e + 4 - 1, 0);
			}

			atl atl5 = this.a(alv.r.t());
			this.a(ajs, axz, 0, 1, 0, 12, 4, 8, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 1, 0, 1, 2, 0, 7, alv.ak.t(), alv.ak.t(), false);
			this.a(ajs, axz, 4, 0, 1, 5, 0, 7, alv.ak.t(), alv.ak.t(), false);
			this.a(ajs, axz, 7, 0, 1, 8, 0, 7, alv.ak.t(), alv.ak.t(), false);
			this.a(ajs, axz, 10, 0, 1, 11, 0, 7, alv.ak.t(), alv.ak.t(), false);
			this.a(ajs, axz, 0, 0, 0, 0, 0, 8, atl5, atl5, false);
			this.a(ajs, axz, 6, 0, 0, 6, 0, 8, atl5, atl5, false);
			this.a(ajs, axz, 12, 0, 0, 12, 0, 8, atl5, atl5, false);
			this.a(ajs, axz, 1, 0, 0, 11, 0, 0, atl5, atl5, false);
			this.a(ajs, axz, 1, 0, 8, 11, 0, 8, atl5, atl5, false);
			this.a(ajs, axz, 3, 0, 1, 3, 0, 7, alv.j.t(), alv.j.t(), false);
			this.a(ajs, axz, 9, 0, 1, 9, 0, 7, alv.j.t(), alv.j.t(), false);

			for (int integer6 = 1; integer6 <= 7; integer6++) {
				int integer7 = ((amp)this.a).g();
				int integer8 = integer7 / 3;
				this.a(ajs, this.a.a(ot.a(random, integer8, integer7)), 1, 1, integer6, axz);
				this.a(ajs, this.a.a(ot.a(random, integer8, integer7)), 2, 1, integer6, axz);
				int integer9 = ((amp)this.b).g();
				int integer10 = integer9 / 3;
				this.a(ajs, this.b.a(ot.a(random, integer10, integer9)), 4, 1, integer6, axz);
				this.a(ajs, this.b.a(ot.a(random, integer10, integer9)), 5, 1, integer6, axz);
				int integer11 = ((amp)this.c).g();
				int integer12 = integer11 / 3;
				this.a(ajs, this.c.a(ot.a(random, integer12, integer11)), 7, 1, integer6, axz);
				this.a(ajs, this.c.a(ot.a(random, integer12, integer11)), 8, 1, integer6, axz);
				int integer13 = ((amp)this.d).g();
				int integer14 = integer13 / 3;
				this.a(ajs, this.d.a(ot.a(random, integer14, integer13)), 10, 1, integer6, axz);
				this.a(ajs, this.d.a(ot.a(random, integer14, integer13)), 11, 1, integer6, axz);
			}

			for (int integer6 = 0; integer6 < 9; integer6++) {
				for (int integer7 = 0; integer7 < 13; integer7++) {
					this.c(ajs, integer7, 4, integer6, axz);
					this.b(ajs, alv.d.t(), integer7, -1, integer6, axz);
				}
			}

			return true;
		}
	}

	public static class c extends ayu.n {
		private alu a;
		private alu b;

		public c() {
		}

		public c(ayu.k k, int integer, Random random, axz axz, cv cv) {
			super(k, integer);
			this.a(cv);
			this.l = axz;
			this.a = this.a(random);
			this.b = this.a(random);
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("CA", alu.h.a(this.a));
			du.a("CB", alu.h.a(this.b));
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = alu.b(du.h("CA"));
			this.b = alu.b(du.h("CB"));
		}

		private alu a(Random random) {
			switch (random.nextInt(10)) {
				case 0:
				case 1:
					return alv.cb;
				case 2:
				case 3:
					return alv.cc;
				case 4:
					return alv.cZ;
				default:
					return alv.aj;
			}
		}

		public static ayu.c a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
			axz axz9 = axz.a(integer4, integer5, integer6, 0, 0, 0, 7, 4, 9, cv);
			return a(axz9) && ayq.a(list, axz9) == null ? new ayu.c(k, integer8, random, axz9, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.g < 0) {
				this.g = this.b(ajs, axz);
				if (this.g < 0) {
					return true;
				}

				this.l.a(0, this.g - this.l.e + 4 - 1, 0);
			}

			atl atl5 = this.a(alv.r.t());
			this.a(ajs, axz, 0, 1, 0, 6, 4, 8, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 1, 0, 1, 2, 0, 7, alv.ak.t(), alv.ak.t(), false);
			this.a(ajs, axz, 4, 0, 1, 5, 0, 7, alv.ak.t(), alv.ak.t(), false);
			this.a(ajs, axz, 0, 0, 0, 0, 0, 8, atl5, atl5, false);
			this.a(ajs, axz, 6, 0, 0, 6, 0, 8, atl5, atl5, false);
			this.a(ajs, axz, 1, 0, 0, 5, 0, 0, atl5, atl5, false);
			this.a(ajs, axz, 1, 0, 8, 5, 0, 8, atl5, atl5, false);
			this.a(ajs, axz, 3, 0, 1, 3, 0, 7, alv.j.t(), alv.j.t(), false);

			for (int integer6 = 1; integer6 <= 7; integer6++) {
				int integer7 = ((amp)this.a).g();
				int integer8 = integer7 / 3;
				this.a(ajs, this.a.a(ot.a(random, integer8, integer7)), 1, 1, integer6, axz);
				this.a(ajs, this.a.a(ot.a(random, integer8, integer7)), 2, 1, integer6, axz);
				int integer9 = ((amp)this.b).g();
				int integer10 = integer9 / 3;
				this.a(ajs, this.b.a(ot.a(random, integer10, integer9)), 4, 1, integer6, axz);
				this.a(ajs, this.b.a(ot.a(random, integer10, integer9)), 5, 1, integer6, axz);
			}

			for (int integer6 = 0; integer6 < 9; integer6++) {
				for (int integer7 = 0; integer7 < 7; integer7++) {
					this.c(ajs, integer7, 4, integer6, axz);
					this.b(ajs, alv.d.t(), integer7, -1, integer6, axz);
				}
			}

			return true;
		}
	}

	public static class d extends ayu.n {
		public d() {
		}

		public d(ayu.k k, int integer, Random random, axz axz, cv cv) {
			super(k, integer);
			this.a(cv);
			this.l = axz;
		}

		public static axz a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv) {
			axz axz8 = axz.a(integer4, integer5, integer6, 0, 0, 0, 3, 4, 2, cv);
			return ayq.a(list, axz8) != null ? null : axz8;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.g < 0) {
				this.g = this.b(ajs, axz);
				if (this.g < 0) {
					return true;
				}

				this.l.a(0, this.g - this.l.e + 4 - 1, 0);
			}

			atl atl5 = this.a(alv.aO.t());
			this.a(ajs, axz, 0, 0, 0, 2, 3, 1, alv.a.t(), alv.a.t(), false);
			this.a(ajs, atl5, 1, 0, 0, axz);
			this.a(ajs, atl5, 1, 1, 0, axz);
			this.a(ajs, atl5, 1, 2, 0, axz);
			this.a(ajs, alv.L.a(aem.WHITE.b()), 1, 3, 0, axz);
			this.a(ajs, cv.EAST, 2, 3, 0, axz);
			this.a(ajs, cv.NORTH, 1, 3, 1, axz);
			this.a(ajs, cv.WEST, 0, 3, 0, axz);
			this.a(ajs, cv.SOUTH, 1, 3, -1, axz);
			return true;
		}
	}

	public static class e {
		public Class<? extends ayu.n> a;
		public final int b;
		public int c;
		public int d;

		public e(Class<? extends ayu.n> class1, int integer2, int integer3) {
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

	public static class f extends ayu.n {
		public f() {
		}

		public f(ayu.k k, int integer, Random random, axz axz, cv cv) {
			super(k, integer);
			this.a(cv);
			this.l = axz;
		}

		public static ayu.f a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
			axz axz9 = axz.a(integer4, integer5, integer6, 0, 0, 0, 9, 7, 11, cv);
			return a(axz9) && ayq.a(list, axz9) == null ? new ayu.f(k, integer8, random, axz9, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.g < 0) {
				this.g = this.b(ajs, axz);
				if (this.g < 0) {
					return true;
				}

				this.l.a(0, this.g - this.l.e + 7 - 1, 0);
			}

			atl atl5 = this.a(alv.e.t());
			atl atl6 = this.a(alv.ad.t().a(aqy.a, cv.NORTH));
			atl atl7 = this.a(alv.ad.t().a(aqy.a, cv.SOUTH));
			atl atl8 = this.a(alv.ad.t().a(aqy.a, cv.WEST));
			atl atl9 = this.a(alv.f.t());
			atl atl10 = this.a(alv.r.t());
			atl atl11 = this.a(alv.aO.t());
			this.a(ajs, axz, 1, 1, 1, 7, 4, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 2, 1, 6, 8, 4, 10, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 2, 0, 6, 8, 0, 10, alv.d.t(), alv.d.t(), false);
			this.a(ajs, atl5, 6, 0, 6, axz);
			this.a(ajs, axz, 2, 1, 6, 2, 1, 10, atl11, atl11, false);
			this.a(ajs, axz, 8, 1, 6, 8, 1, 10, atl11, atl11, false);
			this.a(ajs, axz, 3, 1, 10, 7, 1, 10, atl11, atl11, false);
			this.a(ajs, axz, 1, 0, 1, 7, 0, 4, atl9, atl9, false);
			this.a(ajs, axz, 0, 0, 0, 0, 3, 5, atl5, atl5, false);
			this.a(ajs, axz, 8, 0, 0, 8, 3, 5, atl5, atl5, false);
			this.a(ajs, axz, 1, 0, 0, 7, 1, 0, atl5, atl5, false);
			this.a(ajs, axz, 1, 0, 5, 7, 1, 5, atl5, atl5, false);
			this.a(ajs, axz, 1, 2, 0, 7, 3, 0, atl9, atl9, false);
			this.a(ajs, axz, 1, 2, 5, 7, 3, 5, atl9, atl9, false);
			this.a(ajs, axz, 0, 4, 1, 8, 4, 1, atl9, atl9, false);
			this.a(ajs, axz, 0, 4, 4, 8, 4, 4, atl9, atl9, false);
			this.a(ajs, axz, 0, 5, 2, 8, 5, 3, atl9, atl9, false);
			this.a(ajs, atl9, 0, 4, 2, axz);
			this.a(ajs, atl9, 0, 4, 3, axz);
			this.a(ajs, atl9, 8, 4, 2, axz);
			this.a(ajs, atl9, 8, 4, 3, axz);
			atl atl12 = atl6;
			atl atl13 = atl7;

			for (int integer15 = -1; integer15 <= 2; integer15++) {
				for (int integer16 = 0; integer16 <= 8; integer16++) {
					this.a(ajs, atl12, integer16, 4 + integer15, integer15, axz);
					this.a(ajs, atl13, integer16, 4 + integer15, 5 - integer15, axz);
				}
			}

			this.a(ajs, atl10, 0, 2, 1, axz);
			this.a(ajs, atl10, 0, 2, 4, axz);
			this.a(ajs, atl10, 8, 2, 1, axz);
			this.a(ajs, atl10, 8, 2, 4, axz);
			this.a(ajs, alv.bj.t(), 0, 2, 2, axz);
			this.a(ajs, alv.bj.t(), 0, 2, 3, axz);
			this.a(ajs, alv.bj.t(), 8, 2, 2, axz);
			this.a(ajs, alv.bj.t(), 8, 2, 3, axz);
			this.a(ajs, alv.bj.t(), 2, 2, 5, axz);
			this.a(ajs, alv.bj.t(), 3, 2, 5, axz);
			this.a(ajs, alv.bj.t(), 5, 2, 0, axz);
			this.a(ajs, alv.bj.t(), 6, 2, 5, axz);
			this.a(ajs, atl11, 2, 1, 3, axz);
			this.a(ajs, alv.aB.t(), 2, 2, 3, axz);
			this.a(ajs, atl9, 1, 1, 4, axz);
			this.a(ajs, atl12, 2, 1, 4, axz);
			this.a(ajs, atl8, 1, 1, 3, axz);
			this.a(ajs, axz, 5, 0, 1, 7, 0, 3, alv.T.t(), alv.T.t(), false);
			this.a(ajs, alv.T.t(), 6, 1, 1, axz);
			this.a(ajs, alv.T.t(), 6, 1, 2, axz);
			this.a(ajs, alv.a.t(), 2, 1, 0, axz);
			this.a(ajs, alv.a.t(), 2, 2, 0, axz);
			this.a(ajs, cv.NORTH, 2, 3, 1, axz);
			this.a(ajs, axz, random, 2, 1, 0, cv.NORTH);
			if (this.a(ajs, 2, 0, -1, axz).a() == azs.a && this.a(ajs, 2, -1, -1, axz).a() != azs.a) {
				this.a(ajs, atl12, 2, 0, -1, axz);
				if (this.a(ajs, 2, -1, -1, axz).v() == alv.da) {
					this.a(ajs, alv.c.t(), 2, -1, -1, axz);
				}
			}

			this.a(ajs, alv.a.t(), 6, 1, 5, axz);
			this.a(ajs, alv.a.t(), 6, 2, 5, axz);
			this.a(ajs, cv.SOUTH, 6, 3, 4, axz);
			this.a(ajs, axz, random, 6, 1, 5, cv.SOUTH);

			for (int integer15 = 0; integer15 < 5; integer15++) {
				for (int integer16 = 0; integer16 < 9; integer16++) {
					this.c(ajs, integer16, 7, integer15, axz);
					this.b(ajs, atl5, integer16, -1, integer15, axz);
				}
			}

			this.a(ajs, axz, 4, 1, 2, 2);
			return true;
		}

		@Override
		protected int c(int integer1, int integer2) {
			return integer1 == 0 ? 4 : super.c(integer1, integer2);
		}
	}

	public static class g extends ayu.n {
		private boolean a;

		public g() {
		}

		public g(ayu.k k, int integer, Random random, axz axz, cv cv) {
			super(k, integer);
			this.a(cv);
			this.l = axz;
			this.a = random.nextBoolean();
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Terrace", this.a);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.p("Terrace");
		}

		public static ayu.g a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
			axz axz9 = axz.a(integer4, integer5, integer6, 0, 0, 0, 5, 6, 5, cv);
			return ayq.a(list, axz9) != null ? null : new ayu.g(k, integer8, random, axz9, cv);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.g < 0) {
				this.g = this.b(ajs, axz);
				if (this.g < 0) {
					return true;
				}

				this.l.a(0, this.g - this.l.e + 6 - 1, 0);
			}

			atl atl5 = this.a(alv.e.t());
			atl atl6 = this.a(alv.f.t());
			atl atl7 = this.a(alv.aw.t().a(aqy.a, cv.NORTH));
			atl atl8 = this.a(alv.r.t());
			atl atl9 = this.a(alv.aO.t());
			this.a(ajs, axz, 0, 0, 0, 4, 0, 4, atl5, atl5, false);
			this.a(ajs, axz, 0, 4, 0, 4, 4, 4, atl8, atl8, false);
			this.a(ajs, axz, 1, 4, 1, 3, 4, 3, atl6, atl6, false);
			this.a(ajs, atl5, 0, 1, 0, axz);
			this.a(ajs, atl5, 0, 2, 0, axz);
			this.a(ajs, atl5, 0, 3, 0, axz);
			this.a(ajs, atl5, 4, 1, 0, axz);
			this.a(ajs, atl5, 4, 2, 0, axz);
			this.a(ajs, atl5, 4, 3, 0, axz);
			this.a(ajs, atl5, 0, 1, 4, axz);
			this.a(ajs, atl5, 0, 2, 4, axz);
			this.a(ajs, atl5, 0, 3, 4, axz);
			this.a(ajs, atl5, 4, 1, 4, axz);
			this.a(ajs, atl5, 4, 2, 4, axz);
			this.a(ajs, atl5, 4, 3, 4, axz);
			this.a(ajs, axz, 0, 1, 1, 0, 3, 3, atl6, atl6, false);
			this.a(ajs, axz, 4, 1, 1, 4, 3, 3, atl6, atl6, false);
			this.a(ajs, axz, 1, 1, 4, 3, 3, 4, atl6, atl6, false);
			this.a(ajs, alv.bj.t(), 0, 2, 2, axz);
			this.a(ajs, alv.bj.t(), 2, 2, 4, axz);
			this.a(ajs, alv.bj.t(), 4, 2, 2, axz);
			this.a(ajs, atl6, 1, 1, 0, axz);
			this.a(ajs, atl6, 1, 2, 0, axz);
			this.a(ajs, atl6, 1, 3, 0, axz);
			this.a(ajs, atl6, 2, 3, 0, axz);
			this.a(ajs, atl6, 3, 3, 0, axz);
			this.a(ajs, atl6, 3, 2, 0, axz);
			this.a(ajs, atl6, 3, 1, 0, axz);
			if (this.a(ajs, 2, 0, -1, axz).a() == azs.a && this.a(ajs, 2, -1, -1, axz).a() != azs.a) {
				this.a(ajs, atl7, 2, 0, -1, axz);
				if (this.a(ajs, 2, -1, -1, axz).v() == alv.da) {
					this.a(ajs, alv.c.t(), 2, -1, -1, axz);
				}
			}

			this.a(ajs, axz, 1, 1, 1, 3, 3, 3, alv.a.t(), alv.a.t(), false);
			if (this.a) {
				this.a(ajs, atl9, 0, 5, 0, axz);
				this.a(ajs, atl9, 1, 5, 0, axz);
				this.a(ajs, atl9, 2, 5, 0, axz);
				this.a(ajs, atl9, 3, 5, 0, axz);
				this.a(ajs, atl9, 4, 5, 0, axz);
				this.a(ajs, atl9, 0, 5, 4, axz);
				this.a(ajs, atl9, 1, 5, 4, axz);
				this.a(ajs, atl9, 2, 5, 4, axz);
				this.a(ajs, atl9, 3, 5, 4, axz);
				this.a(ajs, atl9, 4, 5, 4, axz);
				this.a(ajs, atl9, 4, 5, 1, axz);
				this.a(ajs, atl9, 4, 5, 2, axz);
				this.a(ajs, atl9, 4, 5, 3, axz);
				this.a(ajs, atl9, 0, 5, 1, axz);
				this.a(ajs, atl9, 0, 5, 2, axz);
				this.a(ajs, atl9, 0, 5, 3, axz);
			}

			if (this.a) {
				atl atl10 = alv.au.t().a(aom.a, cv.SOUTH);
				this.a(ajs, atl10, 3, 1, 3, axz);
				this.a(ajs, atl10, 3, 2, 3, axz);
				this.a(ajs, atl10, 3, 3, 3, axz);
				this.a(ajs, atl10, 3, 4, 3, axz);
			}

			this.a(ajs, cv.NORTH, 2, 3, 1, axz);

			for (int integer10 = 0; integer10 < 5; integer10++) {
				for (int integer11 = 0; integer11 < 5; integer11++) {
					this.c(ajs, integer11, 6, integer10, axz);
					this.b(ajs, atl5, integer11, -1, integer10, axz);
				}
			}

			this.a(ajs, axz, 1, 1, 2, 1);
			return true;
		}
	}

	public static class h extends ayu.n {
		private boolean a;
		private int b;

		public h() {
		}

		public h(ayu.k k, int integer, Random random, axz axz, cv cv) {
			super(k, integer);
			this.a(cv);
			this.l = axz;
			this.a = random.nextBoolean();
			this.b = random.nextInt(3);
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("T", this.b);
			du.a("C", this.a);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.b = du.h("T");
			this.a = du.p("C");
		}

		public static ayu.h a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
			axz axz9 = axz.a(integer4, integer5, integer6, 0, 0, 0, 4, 6, 5, cv);
			return a(axz9) && ayq.a(list, axz9) == null ? new ayu.h(k, integer8, random, axz9, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.g < 0) {
				this.g = this.b(ajs, axz);
				if (this.g < 0) {
					return true;
				}

				this.l.a(0, this.g - this.l.e + 6 - 1, 0);
			}

			atl atl5 = this.a(alv.e.t());
			atl atl6 = this.a(alv.f.t());
			atl atl7 = this.a(alv.aw.t().a(aqy.a, cv.NORTH));
			atl atl8 = this.a(alv.r.t());
			atl atl9 = this.a(alv.aO.t());
			this.a(ajs, axz, 1, 1, 1, 3, 5, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 0, 0, 3, 0, 4, atl5, atl5, false);
			this.a(ajs, axz, 1, 0, 1, 2, 0, 3, alv.d.t(), alv.d.t(), false);
			if (this.a) {
				this.a(ajs, axz, 1, 4, 1, 2, 4, 3, atl8, atl8, false);
			} else {
				this.a(ajs, axz, 1, 5, 1, 2, 5, 3, atl8, atl8, false);
			}

			this.a(ajs, atl8, 1, 4, 0, axz);
			this.a(ajs, atl8, 2, 4, 0, axz);
			this.a(ajs, atl8, 1, 4, 4, axz);
			this.a(ajs, atl8, 2, 4, 4, axz);
			this.a(ajs, atl8, 0, 4, 1, axz);
			this.a(ajs, atl8, 0, 4, 2, axz);
			this.a(ajs, atl8, 0, 4, 3, axz);
			this.a(ajs, atl8, 3, 4, 1, axz);
			this.a(ajs, atl8, 3, 4, 2, axz);
			this.a(ajs, atl8, 3, 4, 3, axz);
			this.a(ajs, axz, 0, 1, 0, 0, 3, 0, atl8, atl8, false);
			this.a(ajs, axz, 3, 1, 0, 3, 3, 0, atl8, atl8, false);
			this.a(ajs, axz, 0, 1, 4, 0, 3, 4, atl8, atl8, false);
			this.a(ajs, axz, 3, 1, 4, 3, 3, 4, atl8, atl8, false);
			this.a(ajs, axz, 0, 1, 1, 0, 3, 3, atl6, atl6, false);
			this.a(ajs, axz, 3, 1, 1, 3, 3, 3, atl6, atl6, false);
			this.a(ajs, axz, 1, 1, 0, 2, 3, 0, atl6, atl6, false);
			this.a(ajs, axz, 1, 1, 4, 2, 3, 4, atl6, atl6, false);
			this.a(ajs, alv.bj.t(), 0, 2, 2, axz);
			this.a(ajs, alv.bj.t(), 3, 2, 2, axz);
			if (this.b > 0) {
				this.a(ajs, atl9, this.b, 1, 3, axz);
				this.a(ajs, alv.aB.t(), this.b, 2, 3, axz);
			}

			this.a(ajs, alv.a.t(), 1, 1, 0, axz);
			this.a(ajs, alv.a.t(), 1, 2, 0, axz);
			this.a(ajs, axz, random, 1, 1, 0, cv.NORTH);
			if (this.a(ajs, 1, 0, -1, axz).a() == azs.a && this.a(ajs, 1, -1, -1, axz).a() != azs.a) {
				this.a(ajs, atl7, 1, 0, -1, axz);
				if (this.a(ajs, 1, -1, -1, axz).v() == alv.da) {
					this.a(ajs, alv.c.t(), 1, -1, -1, axz);
				}
			}

			for (int integer10 = 0; integer10 < 5; integer10++) {
				for (int integer11 = 0; integer11 < 4; integer11++) {
					this.c(ajs, integer11, 6, integer10, axz);
					this.b(ajs, atl5, integer11, -1, integer10, axz);
				}
			}

			this.a(ajs, axz, 1, 1, 2, 1);
			return true;
		}
	}

	public static class i extends ayu.n {
		public i() {
		}

		public i(ayu.k k, int integer, Random random, axz axz, cv cv) {
			super(k, integer);
			this.a(cv);
			this.l = axz;
		}

		public static ayu.i a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
			axz axz9 = axz.a(integer4, integer5, integer6, 0, 0, 0, 5, 12, 9, cv);
			return a(axz9) && ayq.a(list, axz9) == null ? new ayu.i(k, integer8, random, axz9, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.g < 0) {
				this.g = this.b(ajs, axz);
				if (this.g < 0) {
					return true;
				}

				this.l.a(0, this.g - this.l.e + 12 - 1, 0);
			}

			atl atl5 = alv.e.t();
			atl atl6 = this.a(alv.aw.t().a(aqy.a, cv.NORTH));
			atl atl7 = this.a(alv.aw.t().a(aqy.a, cv.WEST));
			atl atl8 = this.a(alv.aw.t().a(aqy.a, cv.EAST));
			this.a(ajs, axz, 1, 1, 1, 3, 3, 7, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 1, 5, 1, 3, 9, 3, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 1, 0, 0, 3, 0, 8, atl5, atl5, false);
			this.a(ajs, axz, 1, 1, 0, 3, 10, 0, atl5, atl5, false);
			this.a(ajs, axz, 0, 1, 1, 0, 10, 3, atl5, atl5, false);
			this.a(ajs, axz, 4, 1, 1, 4, 10, 3, atl5, atl5, false);
			this.a(ajs, axz, 0, 0, 4, 0, 4, 7, atl5, atl5, false);
			this.a(ajs, axz, 4, 0, 4, 4, 4, 7, atl5, atl5, false);
			this.a(ajs, axz, 1, 1, 8, 3, 4, 8, atl5, atl5, false);
			this.a(ajs, axz, 1, 5, 4, 3, 10, 4, atl5, atl5, false);
			this.a(ajs, axz, 1, 5, 5, 3, 5, 7, atl5, atl5, false);
			this.a(ajs, axz, 0, 9, 0, 4, 9, 4, atl5, atl5, false);
			this.a(ajs, axz, 0, 4, 0, 4, 4, 4, atl5, atl5, false);
			this.a(ajs, atl5, 0, 11, 2, axz);
			this.a(ajs, atl5, 4, 11, 2, axz);
			this.a(ajs, atl5, 2, 11, 0, axz);
			this.a(ajs, atl5, 2, 11, 4, axz);
			this.a(ajs, atl5, 1, 1, 6, axz);
			this.a(ajs, atl5, 1, 1, 7, axz);
			this.a(ajs, atl5, 2, 1, 7, axz);
			this.a(ajs, atl5, 3, 1, 6, axz);
			this.a(ajs, atl5, 3, 1, 7, axz);
			this.a(ajs, atl6, 1, 1, 5, axz);
			this.a(ajs, atl6, 2, 1, 6, axz);
			this.a(ajs, atl6, 3, 1, 5, axz);
			this.a(ajs, atl7, 1, 2, 7, axz);
			this.a(ajs, atl8, 3, 2, 7, axz);
			this.a(ajs, alv.bj.t(), 0, 2, 2, axz);
			this.a(ajs, alv.bj.t(), 0, 3, 2, axz);
			this.a(ajs, alv.bj.t(), 4, 2, 2, axz);
			this.a(ajs, alv.bj.t(), 4, 3, 2, axz);
			this.a(ajs, alv.bj.t(), 0, 6, 2, axz);
			this.a(ajs, alv.bj.t(), 0, 7, 2, axz);
			this.a(ajs, alv.bj.t(), 4, 6, 2, axz);
			this.a(ajs, alv.bj.t(), 4, 7, 2, axz);
			this.a(ajs, alv.bj.t(), 2, 6, 0, axz);
			this.a(ajs, alv.bj.t(), 2, 7, 0, axz);
			this.a(ajs, alv.bj.t(), 2, 6, 4, axz);
			this.a(ajs, alv.bj.t(), 2, 7, 4, axz);
			this.a(ajs, alv.bj.t(), 0, 3, 6, axz);
			this.a(ajs, alv.bj.t(), 4, 3, 6, axz);
			this.a(ajs, alv.bj.t(), 2, 3, 8, axz);
			this.a(ajs, cv.SOUTH, 2, 4, 7, axz);
			this.a(ajs, cv.EAST, 1, 4, 6, axz);
			this.a(ajs, cv.WEST, 3, 4, 6, axz);
			this.a(ajs, cv.NORTH, 2, 4, 5, axz);
			atl atl9 = alv.au.t().a(aom.a, cv.WEST);

			for (int integer10 = 1; integer10 <= 9; integer10++) {
				this.a(ajs, atl9, 3, integer10, 3, axz);
			}

			this.a(ajs, alv.a.t(), 2, 1, 0, axz);
			this.a(ajs, alv.a.t(), 2, 2, 0, axz);
			this.a(ajs, axz, random, 2, 1, 0, cv.NORTH);
			if (this.a(ajs, 2, 0, -1, axz).a() == azs.a && this.a(ajs, 2, -1, -1, axz).a() != azs.a) {
				this.a(ajs, atl6, 2, 0, -1, axz);
				if (this.a(ajs, 2, -1, -1, axz).v() == alv.da) {
					this.a(ajs, alv.c.t(), 2, -1, -1, axz);
				}
			}

			for (int integer10 = 0; integer10 < 9; integer10++) {
				for (int integer11 = 0; integer11 < 5; integer11++) {
					this.c(ajs, integer11, 12, integer10, axz);
					this.b(ajs, atl5, integer11, -1, integer10, axz);
				}
			}

			this.a(ajs, axz, 2, 1, 2, 1);
			return true;
		}

		@Override
		protected int c(int integer1, int integer2) {
			return 2;
		}
	}

	public static class j extends ayu.n {
		private boolean a;

		public j() {
		}

		public j(ayu.k k, int integer, Random random, axz axz, cv cv) {
			super(k, integer);
			this.a(cv);
			this.l = axz;
		}

		public static ayu.j a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
			axz axz9 = axz.a(integer4, integer5, integer6, 0, 0, 0, 10, 6, 7, cv);
			return a(axz9) && ayq.a(list, axz9) == null ? new ayu.j(k, integer8, random, axz9, cv) : null;
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
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.g < 0) {
				this.g = this.b(ajs, axz);
				if (this.g < 0) {
					return true;
				}

				this.l.a(0, this.g - this.l.e + 6 - 1, 0);
			}

			atl atl5 = alv.e.t();
			atl atl6 = this.a(alv.ad.t().a(aqy.a, cv.NORTH));
			atl atl7 = this.a(alv.ad.t().a(aqy.a, cv.WEST));
			atl atl8 = this.a(alv.f.t());
			atl atl9 = this.a(alv.aw.t().a(aqy.a, cv.NORTH));
			atl atl10 = this.a(alv.r.t());
			atl atl11 = this.a(alv.aO.t());
			this.a(ajs, axz, 0, 1, 0, 9, 4, 6, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 0, 0, 0, 9, 0, 6, atl5, atl5, false);
			this.a(ajs, axz, 0, 4, 0, 9, 4, 6, atl5, atl5, false);
			this.a(ajs, axz, 0, 5, 0, 9, 5, 6, alv.U.t(), alv.U.t(), false);
			this.a(ajs, axz, 1, 5, 1, 8, 5, 5, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 1, 1, 0, 2, 3, 0, atl8, atl8, false);
			this.a(ajs, axz, 0, 1, 0, 0, 4, 0, atl10, atl10, false);
			this.a(ajs, axz, 3, 1, 0, 3, 4, 0, atl10, atl10, false);
			this.a(ajs, axz, 0, 1, 6, 0, 4, 6, atl10, atl10, false);
			this.a(ajs, atl8, 3, 3, 1, axz);
			this.a(ajs, axz, 3, 1, 2, 3, 3, 2, atl8, atl8, false);
			this.a(ajs, axz, 4, 1, 3, 5, 3, 3, atl8, atl8, false);
			this.a(ajs, axz, 0, 1, 1, 0, 3, 5, atl8, atl8, false);
			this.a(ajs, axz, 1, 1, 6, 5, 3, 6, atl8, atl8, false);
			this.a(ajs, axz, 5, 1, 0, 5, 3, 0, atl11, atl11, false);
			this.a(ajs, axz, 9, 1, 0, 9, 3, 0, atl11, atl11, false);
			this.a(ajs, axz, 6, 1, 4, 9, 4, 6, atl5, atl5, false);
			this.a(ajs, alv.k.t(), 7, 1, 5, axz);
			this.a(ajs, alv.k.t(), 8, 1, 5, axz);
			this.a(ajs, alv.bi.t(), 9, 2, 5, axz);
			this.a(ajs, alv.bi.t(), 9, 2, 4, axz);
			this.a(ajs, axz, 7, 2, 4, 8, 2, 5, alv.a.t(), alv.a.t(), false);
			this.a(ajs, atl5, 6, 1, 3, axz);
			this.a(ajs, alv.al.t(), 6, 2, 3, axz);
			this.a(ajs, alv.al.t(), 6, 3, 3, axz);
			this.a(ajs, alv.T.t(), 8, 1, 1, axz);
			this.a(ajs, alv.bj.t(), 0, 2, 2, axz);
			this.a(ajs, alv.bj.t(), 0, 2, 4, axz);
			this.a(ajs, alv.bj.t(), 2, 2, 6, axz);
			this.a(ajs, alv.bj.t(), 4, 2, 6, axz);
			this.a(ajs, atl11, 2, 1, 4, axz);
			this.a(ajs, alv.aB.t(), 2, 2, 4, axz);
			this.a(ajs, atl8, 1, 1, 5, axz);
			this.a(ajs, atl6, 2, 1, 5, axz);
			this.a(ajs, atl7, 1, 1, 4, axz);
			if (!this.a && axz.b(new co(this.a(5, 5), this.d(1), this.b(5, 5)))) {
				this.a = true;
				this.a(ajs, axz, random, 5, 1, 5, bcf.e);
			}

			for (int integer12 = 6; integer12 <= 8; integer12++) {
				if (this.a(ajs, integer12, 0, -1, axz).a() == azs.a && this.a(ajs, integer12, -1, -1, axz).a() != azs.a) {
					this.a(ajs, atl9, integer12, 0, -1, axz);
					if (this.a(ajs, integer12, -1, -1, axz).v() == alv.da) {
						this.a(ajs, alv.c.t(), integer12, -1, -1, axz);
					}
				}
			}

			for (int integer12x = 0; integer12x < 7; integer12x++) {
				for (int integer13 = 0; integer13 < 10; integer13++) {
					this.c(ajs, integer13, 6, integer12x, axz);
					this.b(ajs, atl5, integer13, -1, integer12x, axz);
				}
			}

			this.a(ajs, axz, 7, 1, 1, 1);
			return true;
		}

		@Override
		protected int c(int integer1, int integer2) {
			return 3;
		}
	}

	public static class k extends ayu.p {
		public akj a;
		public int b;
		public ayu.e c;
		public List<ayu.e> d;
		public List<ayq> e = Lists.newArrayList();
		public List<ayq> f = Lists.newArrayList();

		public k() {
		}

		public k(akj akj, int integer2, Random random, int integer4, int integer5, List<ayu.e> list, int integer7) {
			super(null, 0, random, integer4, integer5);
			this.a = akj;
			this.d = list;
			this.b = integer7;
			akf akf9 = akj.a(new co(integer4, 0, integer5), akk.b);
			if (akf9 instanceof akm) {
				this.h = 1;
			} else if (akf9 instanceof alb) {
				this.h = 2;
			} else if (akf9 instanceof ale) {
				this.h = 3;
			}

			this.a(this.h);
			this.i = random.nextInt(50) == 0;
		}
	}

	public static class l extends ayu.o {
		private int a;

		public l() {
		}

		public l(ayu.k k, int integer, Random random, axz axz, cv cv) {
			super(k, integer);
			this.a(cv);
			this.l = axz;
			this.a = Math.max(axz.c(), axz.e());
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Length", this.a);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.a = du.h("Length");
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			boolean boolean5 = false;

			for (int integer6 = random.nextInt(5); integer6 < this.a - 8; integer6 += 2 + random.nextInt(5)) {
				ayq ayq7 = this.a((ayu.k)ayq, list, random, 0, integer6);
				if (ayq7 != null) {
					integer6 += Math.max(ayq7.l.c(), ayq7.l.e());
					boolean5 = true;
				}
			}

			for (int var7 = random.nextInt(5); var7 < this.a - 8; var7 += 2 + random.nextInt(5)) {
				ayq ayq7 = this.b((ayu.k)ayq, list, random, 0, var7);
				if (ayq7 != null) {
					var7 += Math.max(ayq7.l.c(), ayq7.l.e());
					boolean5 = true;
				}
			}

			cv cv7 = this.f();
			if (boolean5 && random.nextInt(3) > 0 && cv7 != null) {
				switch (cv7) {
					case NORTH:
					default:
						ayu.e((ayu.k)ayq, list, random, this.l.a - 1, this.l.b, this.l.c, cv.WEST, this.e());
						break;
					case SOUTH:
						ayu.e((ayu.k)ayq, list, random, this.l.a - 1, this.l.b, this.l.f - 2, cv.WEST, this.e());
						break;
					case WEST:
						ayu.e((ayu.k)ayq, list, random, this.l.a, this.l.b, this.l.c - 1, cv.NORTH, this.e());
						break;
					case EAST:
						ayu.e((ayu.k)ayq, list, random, this.l.d - 2, this.l.b, this.l.c - 1, cv.NORTH, this.e());
				}
			}

			if (boolean5 && random.nextInt(3) > 0 && cv7 != null) {
				switch (cv7) {
					case NORTH:
					default:
						ayu.e((ayu.k)ayq, list, random, this.l.d + 1, this.l.b, this.l.c, cv.EAST, this.e());
						break;
					case SOUTH:
						ayu.e((ayu.k)ayq, list, random, this.l.d + 1, this.l.b, this.l.f - 2, cv.EAST, this.e());
						break;
					case WEST:
						ayu.e((ayu.k)ayq, list, random, this.l.a, this.l.b, this.l.f + 1, cv.SOUTH, this.e());
						break;
					case EAST:
						ayu.e((ayu.k)ayq, list, random, this.l.d - 2, this.l.b, this.l.f + 1, cv.SOUTH, this.e());
				}
			}
		}

		public static axz a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv) {
			for (int integer8 = 7 * ot.a(random, 3, 5); integer8 >= 7; integer8 -= 7) {
				axz axz9 = axz.a(integer4, integer5, integer6, 0, 0, 0, 3, 3, integer8, cv);
				if (ayq.a(list, axz9) == null) {
					return axz9;
				}
			}

			return null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			atl atl5 = this.a(alv.da.t());
			atl atl6 = this.a(alv.f.t());
			atl atl7 = this.a(alv.n.t());
			atl atl8 = this.a(alv.e.t());

			for (int integer9 = this.l.a; integer9 <= this.l.d; integer9++) {
				for (int integer10 = this.l.c; integer10 <= this.l.f; integer10++) {
					co co11 = new co(integer9, 64, integer10);
					if (axz.b(co11)) {
						co11 = ajs.q(co11).b();
						if (co11.q() < ajs.K()) {
							co11 = new co(co11.p(), ajs.K() - 1, co11.r());
						}

						while (co11.q() >= ajs.K() - 1) {
							atl atl12 = ajs.o(co11);
							if (atl12.v() == alv.c && ajs.d(co11.a())) {
								ajs.a(co11, atl5, 2);
								break;
							}

							if (atl12.a().d()) {
								ajs.a(co11, atl6, 2);
								break;
							}

							if (atl12.v() == alv.m || atl12.v() == alv.A || atl12.v() == alv.cM) {
								ajs.a(co11, atl7, 2);
								ajs.a(co11.b(), atl8, 2);
								break;
							}

							co11 = co11.b();
						}
					}
				}
			}

			return true;
		}
	}

	public static class m extends ayu.n {
		public m() {
		}

		public m(ayu.k k, int integer, Random random, axz axz, cv cv) {
			super(k, integer);
			this.a(cv);
			this.l = axz;
		}

		public static ayu.m a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5, int integer6, cv cv, int integer8) {
			axz axz9 = axz.a(integer4, integer5, integer6, 0, 0, 0, 9, 7, 12, cv);
			return a(axz9) && ayq.a(list, axz9) == null ? new ayu.m(k, integer8, random, axz9, cv) : null;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.g < 0) {
				this.g = this.b(ajs, axz);
				if (this.g < 0) {
					return true;
				}

				this.l.a(0, this.g - this.l.e + 7 - 1, 0);
			}

			atl atl5 = this.a(alv.e.t());
			atl atl6 = this.a(alv.ad.t().a(aqy.a, cv.NORTH));
			atl atl7 = this.a(alv.ad.t().a(aqy.a, cv.SOUTH));
			atl atl8 = this.a(alv.ad.t().a(aqy.a, cv.EAST));
			atl atl9 = this.a(alv.ad.t().a(aqy.a, cv.WEST));
			atl atl10 = this.a(alv.f.t());
			atl atl11 = this.a(alv.r.t());
			this.a(ajs, axz, 1, 1, 1, 7, 4, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 2, 1, 6, 8, 4, 10, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 2, 0, 5, 8, 0, 10, atl10, atl10, false);
			this.a(ajs, axz, 1, 0, 1, 7, 0, 4, atl10, atl10, false);
			this.a(ajs, axz, 0, 0, 0, 0, 3, 5, atl5, atl5, false);
			this.a(ajs, axz, 8, 0, 0, 8, 3, 10, atl5, atl5, false);
			this.a(ajs, axz, 1, 0, 0, 7, 2, 0, atl5, atl5, false);
			this.a(ajs, axz, 1, 0, 5, 2, 1, 5, atl5, atl5, false);
			this.a(ajs, axz, 2, 0, 6, 2, 3, 10, atl5, atl5, false);
			this.a(ajs, axz, 3, 0, 10, 7, 3, 10, atl5, atl5, false);
			this.a(ajs, axz, 1, 2, 0, 7, 3, 0, atl10, atl10, false);
			this.a(ajs, axz, 1, 2, 5, 2, 3, 5, atl10, atl10, false);
			this.a(ajs, axz, 0, 4, 1, 8, 4, 1, atl10, atl10, false);
			this.a(ajs, axz, 0, 4, 4, 3, 4, 4, atl10, atl10, false);
			this.a(ajs, axz, 0, 5, 2, 8, 5, 3, atl10, atl10, false);
			this.a(ajs, atl10, 0, 4, 2, axz);
			this.a(ajs, atl10, 0, 4, 3, axz);
			this.a(ajs, atl10, 8, 4, 2, axz);
			this.a(ajs, atl10, 8, 4, 3, axz);
			this.a(ajs, atl10, 8, 4, 4, axz);
			atl atl12 = atl6;
			atl atl13 = atl7;
			atl atl14 = atl9;
			atl atl15 = atl8;

			for (int integer16 = -1; integer16 <= 2; integer16++) {
				for (int integer17 = 0; integer17 <= 8; integer17++) {
					this.a(ajs, atl12, integer17, 4 + integer16, integer16, axz);
					if ((integer16 > -1 || integer17 <= 1) && (integer16 > 0 || integer17 <= 3) && (integer16 > 1 || integer17 <= 4 || integer17 >= 6)) {
						this.a(ajs, atl13, integer17, 4 + integer16, 5 - integer16, axz);
					}
				}
			}

			this.a(ajs, axz, 3, 4, 5, 3, 4, 10, atl10, atl10, false);
			this.a(ajs, axz, 7, 4, 2, 7, 4, 10, atl10, atl10, false);
			this.a(ajs, axz, 4, 5, 4, 4, 5, 10, atl10, atl10, false);
			this.a(ajs, axz, 6, 5, 4, 6, 5, 10, atl10, atl10, false);
			this.a(ajs, axz, 5, 6, 3, 5, 6, 10, atl10, atl10, false);

			for (int integer16 = 4; integer16 >= 1; integer16--) {
				this.a(ajs, atl10, integer16, 2 + integer16, 7 - integer16, axz);

				for (int integer17x = 8 - integer16; integer17x <= 10; integer17x++) {
					this.a(ajs, atl15, integer16, 2 + integer16, integer17x, axz);
				}
			}

			this.a(ajs, atl10, 6, 6, 3, axz);
			this.a(ajs, atl10, 7, 5, 4, axz);
			this.a(ajs, atl9, 6, 6, 4, axz);

			for (int integer16 = 6; integer16 <= 8; integer16++) {
				for (int integer17x = 5; integer17x <= 10; integer17x++) {
					this.a(ajs, atl14, integer16, 12 - integer16, integer17x, axz);
				}
			}

			this.a(ajs, atl11, 0, 2, 1, axz);
			this.a(ajs, atl11, 0, 2, 4, axz);
			this.a(ajs, alv.bj.t(), 0, 2, 2, axz);
			this.a(ajs, alv.bj.t(), 0, 2, 3, axz);
			this.a(ajs, atl11, 4, 2, 0, axz);
			this.a(ajs, alv.bj.t(), 5, 2, 0, axz);
			this.a(ajs, atl11, 6, 2, 0, axz);
			this.a(ajs, atl11, 8, 2, 1, axz);
			this.a(ajs, alv.bj.t(), 8, 2, 2, axz);
			this.a(ajs, alv.bj.t(), 8, 2, 3, axz);
			this.a(ajs, atl11, 8, 2, 4, axz);
			this.a(ajs, atl10, 8, 2, 5, axz);
			this.a(ajs, atl11, 8, 2, 6, axz);
			this.a(ajs, alv.bj.t(), 8, 2, 7, axz);
			this.a(ajs, alv.bj.t(), 8, 2, 8, axz);
			this.a(ajs, atl11, 8, 2, 9, axz);
			this.a(ajs, atl11, 2, 2, 6, axz);
			this.a(ajs, alv.bj.t(), 2, 2, 7, axz);
			this.a(ajs, alv.bj.t(), 2, 2, 8, axz);
			this.a(ajs, atl11, 2, 2, 9, axz);
			this.a(ajs, atl11, 4, 4, 10, axz);
			this.a(ajs, alv.bj.t(), 5, 4, 10, axz);
			this.a(ajs, atl11, 6, 4, 10, axz);
			this.a(ajs, atl10, 5, 5, 10, axz);
			this.a(ajs, alv.a.t(), 2, 1, 0, axz);
			this.a(ajs, alv.a.t(), 2, 2, 0, axz);
			this.a(ajs, cv.NORTH, 2, 3, 1, axz);
			this.a(ajs, axz, random, 2, 1, 0, cv.NORTH);
			this.a(ajs, axz, 1, 0, -1, 3, 2, -1, alv.a.t(), alv.a.t(), false);
			if (this.a(ajs, 2, 0, -1, axz).a() == azs.a && this.a(ajs, 2, -1, -1, axz).a() != azs.a) {
				this.a(ajs, atl12, 2, 0, -1, axz);
				if (this.a(ajs, 2, -1, -1, axz).v() == alv.da) {
					this.a(ajs, alv.c.t(), 2, -1, -1, axz);
				}
			}

			for (int integer16 = 0; integer16 < 5; integer16++) {
				for (int integer17x = 0; integer17x < 9; integer17x++) {
					this.c(ajs, integer17x, 7, integer16, axz);
					this.b(ajs, atl5, integer17x, -1, integer16, axz);
				}
			}

			for (int integer16 = 5; integer16 < 11; integer16++) {
				for (int integer17x = 2; integer17x < 9; integer17x++) {
					this.c(ajs, integer17x, 7, integer16, axz);
					this.b(ajs, atl5, integer17x, -1, integer16, axz);
				}
			}

			this.a(ajs, axz, 4, 1, 2, 2);
			return true;
		}
	}

	abstract static class n extends ayq {
		protected int g = -1;
		private int a;
		protected int h;
		protected boolean i;

		public n() {
		}

		protected n(ayu.k k, int integer) {
			super(integer);
			if (k != null) {
				this.h = k.h;
				this.i = k.i;
			}
		}

		@Override
		protected void a(du du) {
			du.a("HPos", this.g);
			du.a("VCount", this.a);
			du.a("Type", (byte)this.h);
			du.a("Zombie", this.i);
		}

		@Override
		protected void a(du du, ayz ayz) {
			this.g = du.h("HPos");
			this.a = du.h("VCount");
			this.h = du.f("Type");
			if (du.p("Desert")) {
				this.h = 1;
			}

			this.i = du.p("Zombie");
		}

		@Nullable
		protected ayq a(ayu.k k, List<ayq> list, Random random, int integer4, int integer5) {
			cv cv7 = this.f();
			if (cv7 != null) {
				switch (cv7) {
					case NORTH:
					default:
						return ayu.d(k, list, random, this.l.a - 1, this.l.b + integer4, this.l.c + integer5, cv.WEST, this.e());
					case SOUTH:
						return ayu.d(k, list, random, this.l.a - 1, this.l.b + integer4, this.l.c + integer5, cv.WEST, this.e());
					case WEST:
						return ayu.d(k, list, random, this.l.a + integer5, this.l.b + integer4, this.l.c - 1, cv.NORTH, this.e());
					case EAST:
						return ayu.d(k, list, random, this.l.a + integer5, this.l.b + integer4, this.l.c - 1, cv.NORTH, this.e());
				}
			} else {
				return null;
			}
		}

		@Nullable
		protected ayq b(ayu.k k, List<ayq> list, Random random, int integer4, int integer5) {
			cv cv7 = this.f();
			if (cv7 != null) {
				switch (cv7) {
					case NORTH:
					default:
						return ayu.d(k, list, random, this.l.d + 1, this.l.b + integer4, this.l.c + integer5, cv.EAST, this.e());
					case SOUTH:
						return ayu.d(k, list, random, this.l.d + 1, this.l.b + integer4, this.l.c + integer5, cv.EAST, this.e());
					case WEST:
						return ayu.d(k, list, random, this.l.a + integer5, this.l.b + integer4, this.l.f + 1, cv.SOUTH, this.e());
					case EAST:
						return ayu.d(k, list, random, this.l.a + integer5, this.l.b + integer4, this.l.f + 1, cv.SOUTH, this.e());
				}
			} else {
				return null;
			}
		}

		protected int b(ajs ajs, axz axz) {
			int integer4 = 0;
			int integer5 = 0;
			co.a a6 = new co.a();

			for (int integer7 = this.l.c; integer7 <= this.l.f; integer7++) {
				for (int integer8 = this.l.a; integer8 <= this.l.d; integer8++) {
					a6.c(integer8, 64, integer7);
					if (axz.b(a6)) {
						integer4 += Math.max(ajs.q(a6).q(), ajs.s.i() - 1);
						integer5++;
					}
				}
			}

			return integer5 == 0 ? -1 : integer4 / integer5;
		}

		protected static boolean a(axz axz) {
			return axz != null && axz.b > 10;
		}

		protected void a(ajs ajs, axz axz, int integer3, int integer4, int integer5, int integer6) {
			if (this.a < integer6) {
				for (int integer8 = this.a; integer8 < integer6; integer8++) {
					int integer9 = this.a(integer3 + integer8, integer5);
					int integer10 = this.d(integer4);
					int integer11 = this.b(integer3 + integer8, integer5);
					if (!axz.b(new co(integer9, integer10, integer11))) {
						break;
					}

					this.a++;
					if (this.i) {
						aap aap12 = new aap(ajs);
						aap12.b((double)integer9 + 0.5, (double)integer10, (double)integer11 + 0.5, 0.0F, 0.0F);
						aap12.a(ajs.D(new co(aap12)), null);
						aap12.a(this.c(integer8, 0));
						aap12.cS();
						ajs.a(aap12);
					} else {
						aat aat12 = new aat(ajs);
						aat12.b((double)integer9 + 0.5, (double)integer10, (double)integer11 + 0.5, 0.0F, 0.0F);
						aat12.g(this.c(integer8, ajs.r.nextInt(6)));
						aat12.a(ajs.D(new co(aat12)), null, false);
						ajs.a(aat12);
					}
				}
			}
		}

		protected int c(int integer1, int integer2) {
			return integer2;
		}

		protected atl a(atl atl) {
			if (this.h == 1) {
				if (atl.v() == alv.r || atl.v() == alv.s) {
					return alv.A.t();
				}

				if (atl.v() == alv.e) {
					return alv.A.a(aqk.a.DEFAULT.a());
				}

				if (atl.v() == alv.f) {
					return alv.A.a(aqk.a.SMOOTH.a());
				}

				if (atl.v() == alv.ad) {
					return alv.bO.t().a(aqy.a, atl.c(aqy.a));
				}

				if (atl.v() == alv.aw) {
					return alv.bO.t().a(aqy.a, atl.c(aqy.a));
				}

				if (atl.v() == alv.n) {
					return alv.A.t();
				}
			} else if (this.h == 3) {
				if (atl.v() == alv.r || atl.v() == alv.s) {
					return alv.r.t().a(apk.b, apn.a.SPRUCE).a(aor.a, atl.c(aor.a));
				}

				if (atl.v() == alv.f) {
					return alv.f.t().a(apn.a, apn.a.SPRUCE);
				}

				if (atl.v() == alv.ad) {
					return alv.bU.t().a(aqy.a, atl.c(aqy.a));
				}

				if (atl.v() == alv.aO) {
					return alv.aP.t();
				}
			} else if (this.h == 2) {
				if (atl.v() == alv.r || atl.v() == alv.s) {
					return alv.s.t().a(apd.b, apn.a.ACACIA).a(aor.a, atl.c(aor.a));
				}

				if (atl.v() == alv.f) {
					return alv.f.t().a(apn.a, apn.a.ACACIA);
				}

				if (atl.v() == alv.ad) {
					return alv.cC.t().a(aqy.a, atl.c(aqy.a));
				}

				if (atl.v() == alv.e) {
					return alv.s.t().a(apd.b, apn.a.ACACIA).a(aor.a, aor.a.Y);
				}

				if (atl.v() == alv.aO) {
					return alv.aT.t();
				}
			}

			return atl;
		}

		protected amx i() {
			switch (this.h) {
				case 2:
					return alv.as;
				case 3:
					return alv.ap;
				default:
					return alv.ao;
			}
		}

		protected void a(ajs ajs, axz axz, Random random, int integer4, int integer5, int integer6, cv cv) {
			if (!this.i) {
				this.a(ajs, axz, random, integer4, integer5, integer6, cv.NORTH, this.i());
			}
		}

		protected void a(ajs ajs, cv cv, int integer3, int integer4, int integer5, axz axz) {
			if (!this.i) {
				this.a(ajs, alv.aa.t().a(arl.a, cv), integer3, integer4, integer5, axz);
			}
		}

		@Override
		protected void b(ajs ajs, atl atl, int integer3, int integer4, int integer5, axz axz) {
			atl atl8 = this.a(atl);
			super.b(ajs, atl8, integer3, integer4, integer5, axz);
		}

		protected void a(int integer) {
			this.h = integer;
		}
	}

	public abstract static class o extends ayu.n {
		public o() {
		}

		protected o(ayu.k k, int integer) {
			super(k, integer);
		}
	}

	public static class p extends ayu.n {
		public p() {
		}

		public p(ayu.k k, int integer2, Random random, int integer4, int integer5) {
			super(k, integer2);
			this.a(cv.c.HORIZONTAL.a(random));
			if (this.f().k() == cv.a.Z) {
				this.l = new axz(integer4, 64, integer5, integer4 + 6 - 1, 78, integer5 + 6 - 1);
			} else {
				this.l = new axz(integer4, 64, integer5, integer4 + 6 - 1, 78, integer5 + 6 - 1);
			}
		}

		@Override
		public void a(ayq ayq, List<ayq> list, Random random) {
			ayu.e((ayu.k)ayq, list, random, this.l.a - 1, this.l.e - 4, this.l.c + 1, cv.WEST, this.e());
			ayu.e((ayu.k)ayq, list, random, this.l.d + 1, this.l.e - 4, this.l.c + 1, cv.EAST, this.e());
			ayu.e((ayu.k)ayq, list, random, this.l.a + 1, this.l.e - 4, this.l.c - 1, cv.NORTH, this.e());
			ayu.e((ayu.k)ayq, list, random, this.l.a + 1, this.l.e - 4, this.l.f + 1, cv.SOUTH, this.e());
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.g < 0) {
				this.g = this.b(ajs, axz);
				if (this.g < 0) {
					return true;
				}

				this.l.a(0, this.g - this.l.e + 3, 0);
			}

			atl atl5 = this.a(alv.e.t());
			atl atl6 = this.a(alv.aO.t());
			this.a(ajs, axz, 1, 0, 1, 4, 12, 4, atl5, alv.i.t(), false);
			this.a(ajs, alv.a.t(), 2, 12, 2, axz);
			this.a(ajs, alv.a.t(), 3, 12, 2, axz);
			this.a(ajs, alv.a.t(), 2, 12, 3, axz);
			this.a(ajs, alv.a.t(), 3, 12, 3, axz);
			this.a(ajs, atl6, 1, 13, 1, axz);
			this.a(ajs, atl6, 1, 14, 1, axz);
			this.a(ajs, atl6, 4, 13, 1, axz);
			this.a(ajs, atl6, 4, 14, 1, axz);
			this.a(ajs, atl6, 1, 13, 4, axz);
			this.a(ajs, atl6, 1, 14, 4, axz);
			this.a(ajs, atl6, 4, 13, 4, axz);
			this.a(ajs, atl6, 4, 14, 4, axz);
			this.a(ajs, axz, 1, 15, 1, 4, 15, 4, atl5, atl5, false);

			for (int integer7 = 0; integer7 <= 5; integer7++) {
				for (int integer8 = 0; integer8 <= 5; integer8++) {
					if (integer8 == 0 || integer8 == 5 || integer7 == 0 || integer7 == 5) {
						this.a(ajs, atl5, integer8, 11, integer7, axz);
						this.c(ajs, integer8, 12, integer7, axz);
					}
				}
			}

			return true;
		}
	}
}
