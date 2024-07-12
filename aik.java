import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class aik {
	private static final Random a = new Random();
	private static final aik.e b = new aik.e();
	private static final aik.d c = new aik.d();
	private static final aik.b d = new aik.b();
	private static final aik.a e = new aik.a();

	public static int a(aii aii, afj afj) {
		if (afj.b()) {
			return 0;
		} else {
			ea ea3 = afj.q();
			if (ea3 == null) {
				return 0;
			} else {
				for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
					aii aii5 = aii.c(ea3.b(integer4).g("id"));
					int integer6 = ea3.b(integer4).g("lvl");
					if (aii5 == aii) {
						return integer6;
					}
				}

				return 0;
			}
		}
	}

	public static Map<aii, Integer> a(afj afj) {
		Map<aii, Integer> map2 = Maps.newLinkedHashMap();
		ea ea3 = afj.c() == afl.co ? afl.co.h(afj) : afj.q();
		if (ea3 != null) {
			for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
				aii aii5 = aii.c(ea3.b(integer4).g("id"));
				int integer6 = ea3.b(integer4).g("lvl");
				map2.put(aii5, integer6);
			}
		}

		return map2;
	}

	public static void a(Map<aii, Integer> map, afj afj) {
		ea ea3 = new ea();

		for (Entry<aii, Integer> entry5 : map.entrySet()) {
			aii aii6 = (aii)entry5.getKey();
			if (aii6 != null) {
				int integer7 = (Integer)entry5.getValue();
				du du8 = new du();
				du8.a("id", (short)aii.b(aii6));
				du8.a("lvl", (short)integer7);
				ea3.a(du8);
				if (afj.c() == afl.co) {
					afl.co.a(afj, new ail(aii6, integer7));
				}
			}
		}

		if (ea3.b_()) {
			if (afj.o()) {
				afj.p().q("ench");
			}
		} else if (afj.c() != afl.co) {
			afj.a("ench", ea3);
		}
	}

	private static void a(aik.c c, afj afj) {
		if (!afj.b()) {
			ea ea3 = afj.q();
			if (ea3 != null) {
				for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
					int integer5 = ea3.b(integer4).g("id");
					int integer6 = ea3.b(integer4).g("lvl");
					if (aii.c(integer5) != null) {
						c.a(aii.c(integer5), integer6);
					}
				}
			}
		}
	}

	private static void a(aik.c c, Iterable<afj> iterable) {
		for (afj afj4 : iterable) {
			a(c, afj4);
		}
	}

	public static int a(Iterable<afj> iterable, ry ry) {
		b.a = 0;
		b.b = ry;
		a(b, iterable);
		return b.a;
	}

	public static float a(afj afj, tb tb) {
		c.a = 0.0F;
		c.b = tb;
		a(c, afj);
		return c.a;
	}

	public static float a(sw sw) {
		int integer2 = a(aim.r, sw);
		return integer2 > 0 ? aiv.e(integer2) : 0.0F;
	}

	public static void a(sw sw, sn sn) {
		d.b = sn;
		d.a = sw;
		if (sw != null) {
			a(d, sw.aI());
		}

		if (sn instanceof aay) {
			a(d, sw.cg());
		}
	}

	public static void b(sw sw, sn sn) {
		e.a = sw;
		e.b = sn;
		if (sw != null) {
			a(e, sw.aI());
		}

		if (sw instanceof aay) {
			a(e, sw.cg());
		}
	}

	public static int a(aii aii, sw sw) {
		Iterable<afj> iterable3 = aii.a(sw);
		if (iterable3 == null) {
			return 0;
		} else {
			int integer4 = 0;

			for (afj afj6 : iterable3) {
				int integer7 = a(aii, afj6);
				if (integer7 > integer4) {
					integer4 = integer7;
				}
			}

			return integer4;
		}
	}

	public static int b(sw sw) {
		return a(aim.o, sw);
	}

	public static int c(sw sw) {
		return a(aim.p, sw);
	}

	public static int d(sw sw) {
		return a(aim.f, sw);
	}

	public static int e(sw sw) {
		return a(aim.i, sw);
	}

	public static int f(sw sw) {
		return a(aim.s, sw);
	}

	public static int b(afj afj) {
		return a(aim.A, afj);
	}

	public static int c(afj afj) {
		return a(aim.B, afj);
	}

	public static int g(sw sw) {
		return a(aim.q, sw);
	}

	public static boolean h(sw sw) {
		return a(aim.g, sw) > 0;
	}

	public static boolean i(sw sw) {
		return a(aim.j, sw) > 0;
	}

	public static boolean d(afj afj) {
		return a(aim.k, afj) > 0;
	}

	public static boolean e(afj afj) {
		return a(aim.D, afj) > 0;
	}

	public static afj b(aii aii, sw sw) {
		List<afj> list3 = aii.a(sw);
		if (list3.isEmpty()) {
			return afj.a;
		} else {
			List<afj> list4 = Lists.newArrayList();

			for (afj afj6 : list3) {
				if (!afj6.b() && a(aii, afj6) > 0) {
					list4.add(afj6);
				}
			}

			return list4.isEmpty() ? afj.a : (afj)list4.get(sw.bJ().nextInt(list4.size()));
		}
	}

	public static int a(Random random, int integer2, int integer3, afj afj) {
		afh afh5 = afj.c();
		int integer6 = afh5.c();
		if (integer6 <= 0) {
			return 0;
		} else {
			if (integer3 > 15) {
				integer3 = 15;
			}

			int integer7 = random.nextInt(8) + 1 + (integer3 >> 1) + random.nextInt(integer3 + 1);
			if (integer2 == 0) {
				return Math.max(integer7 / 3, 1);
			} else {
				return integer2 == 1 ? integer7 * 2 / 3 + 1 : Math.max(integer7, integer3 * 2);
			}
		}
	}

	public static afj a(Random random, afj afj, int integer, boolean boolean4) {
		List<ail> list5 = b(random, afj, integer, boolean4);
		boolean boolean6 = afj.c() == afl.aT;
		if (boolean6) {
			afj = new afj(afl.co);
		}

		for (ail ail8 : list5) {
			if (boolean6) {
				afl.co.a(afj, ail8);
			} else {
				afj.a(ail8.b, ail8.c);
			}
		}

		return afj;
	}

	public static List<ail> b(Random random, afj afj, int integer, boolean boolean4) {
		List<ail> list5 = Lists.newArrayList();
		afh afh6 = afj.c();
		int integer7 = afh6.c();
		if (integer7 <= 0) {
			return list5;
		} else {
			integer += 1 + random.nextInt(integer7 / 4 + 1) + random.nextInt(integer7 / 4 + 1);
			float float8 = (random.nextFloat() + random.nextFloat() - 1.0F) * 0.15F;
			integer = ot.a(Math.round((float)integer + (float)integer * float8), 1, Integer.MAX_VALUE);
			List<ail> list9 = a(integer, afj, boolean4);
			if (!list9.isEmpty()) {
				list5.add(pb.a(random, list9));

				while (random.nextInt(50) <= integer) {
					a(list9, h.a(list5));
					if (list9.isEmpty()) {
						break;
					}

					list5.add(pb.a(random, list9));
					integer /= 2;
				}
			}

			return list5;
		}
	}

	public static void a(List<ail> list, ail ail) {
		Iterator<ail> iterator3 = list.iterator();

		while (iterator3.hasNext()) {
			if (!ail.b.c(((ail)iterator3.next()).b)) {
				iterator3.remove();
			}
		}
	}

	public static List<ail> a(int integer, afj afj, boolean boolean3) {
		List<ail> list4 = Lists.newArrayList();
		afh afh5 = afj.c();
		boolean boolean6 = afj.c() == afl.aT;

		for (aii aii8 : aii.b) {
			if ((!aii8.c() || boolean3) && (aii8.c.a(afh5) || boolean6)) {
				for (int integer9 = aii8.b(); integer9 > aii8.f() - 1; integer9--) {
					if (integer >= aii8.a(integer9) && integer <= aii8.b(integer9)) {
						list4.add(new ail(aii8, integer9));
						break;
					}
				}
			}
		}

		return list4;
	}

	static final class a implements aik.c {
		public sw a;
		public sn b;

		private a() {
		}

		@Override
		public void a(aii aii, int integer) {
			aii.a(this.a, this.b, integer);
		}
	}

	static final class b implements aik.c {
		public sw a;
		public sn b;

		private b() {
		}

		@Override
		public void a(aii aii, int integer) {
			aii.b(this.a, this.b, integer);
		}
	}

	interface c {
		void a(aii aii, int integer);
	}

	static final class d implements aik.c {
		public float a;
		public tb b;

		private d() {
		}

		@Override
		public void a(aii aii, int integer) {
			this.a = this.a + aii.a(integer, this.b);
		}
	}

	static final class e implements aik.c {
		public int a;
		public ry b;

		private e() {
		}

		@Override
		public void a(aii aii, int integer) {
			this.a = this.a + aii.a(integer, this.b);
		}
	}
}
