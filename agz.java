import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.util.List;

public class agz {
	private static final List<agz.b<agy>> a = Lists.newArrayList();
	private static final List<agz.b<afh>> b = Lists.newArrayList();
	private static final List<agz.a> c = Lists.newArrayList();
	private static final Predicate<afj> d = new Predicate<afj>() {
		public boolean apply(afj afj) {
			for (agz.a a4 : agz.c) {
				if (a4.a(afj)) {
					return true;
				}
			}

			return false;
		}
	};

	public static boolean a(afj afj) {
		return b(afj) || c(afj);
	}

	protected static boolean b(afj afj) {
		int integer2 = 0;

		for (int integer3 = b.size(); integer2 < integer3; integer2++) {
			if (((agz.b)b.get(integer2)).b.apply(afj)) {
				return true;
			}
		}

		return false;
	}

	protected static boolean c(afj afj) {
		int integer2 = 0;

		for (int integer3 = a.size(); integer2 < integer3; integer2++) {
			if (((agz.b)a.get(integer2)).b.apply(afj)) {
				return true;
			}
		}

		return false;
	}

	public static boolean a(afj afj1, afj afj2) {
		return !d.apply(afj1) ? false : b(afj1, afj2) || c(afj1, afj2);
	}

	protected static boolean b(afj afj1, afj afj2) {
		afh afh3 = afj1.c();
		int integer4 = 0;

		for (int integer5 = b.size(); integer4 < integer5; integer4++) {
			agz.b<afh> b6 = (agz.b<afh>)b.get(integer4);
			if (b6.a == afh3 && b6.b.apply(afj2)) {
				return true;
			}
		}

		return false;
	}

	protected static boolean c(afj afj1, afj afj2) {
		agy agy3 = aha.d(afj1);
		int integer4 = 0;

		for (int integer5 = a.size(); integer4 < integer5; integer4++) {
			agz.b<agy> b6 = (agz.b<agy>)a.get(integer4);
			if (b6.a == agy3 && b6.b.apply(afj2)) {
				return true;
			}
		}

		return false;
	}

	public static afj d(afj afj1, afj afj2) {
		if (!afj2.b()) {
			agy agy3 = aha.d(afj2);
			afh afh4 = afj2.c();
			int integer5 = 0;

			for (int integer6 = b.size(); integer5 < integer6; integer5++) {
				agz.b<afh> b7 = (agz.b<afh>)b.get(integer5);
				if (b7.a == afh4 && b7.b.apply(afj1)) {
					return aha.a(new afj(b7.c), agy3);
				}
			}

			integer5 = 0;

			for (int integer6x = a.size(); integer5 < integer6x; integer5++) {
				agz.b<agy> b7 = (agz.b<agy>)a.get(integer5);
				if (b7.a == agy3 && b7.b.apply(afj1)) {
					return aha.a(new afj(afh4), b7.c);
				}
			}
		}

		return afj2;
	}

	public static void a() {
		Predicate<afj> predicate1 = new agz.a(afl.bG);
		Predicate<afj> predicate2 = new agz.a(afl.ch);
		Predicate<afj> predicate3 = new agz.a(afl.aF);
		Predicate<afj> predicate4 = new agz.a(afl.bN);
		Predicate<afj> predicate5 = new agz.a(afl.bz);
		Predicate<afj> predicate6 = new agz.a(afl.bb);
		Predicate<afj> predicate7 = new agz.a(afl.bP);
		Predicate<afj> predicate8 = new agz.a(afl.bg);
		Predicate<afj> predicate9 = new agz.a(afl.bc, afa.a.PUFFERFISH.a());
		Predicate<afj> predicate10 = new agz.a(afl.bT);
		Predicate<afj> predicate11 = new agz.a(afl.bM);
		Predicate<afj> predicate12 = new agz.a(afl.bE);
		Predicate<afj> predicate13 = new agz.a(afl.bO);
		a(new agz.a(afl.bH));
		a(new agz.a(afl.bI));
		a(new agz.a(afl.bJ));
		a(afl.bH, new agz.a(afl.K), afl.bI);
		a(afl.bI, new agz.a(afl.bL), afl.bJ);
		a(ahb.b, predicate10, ahb.c);
		a(ahb.b, predicate12, ahb.c);
		a(ahb.b, predicate5, ahb.c);
		a(ahb.b, predicate13, ahb.c);
		a(ahb.b, predicate11, ahb.c);
		a(ahb.b, predicate8, ahb.c);
		a(ahb.b, predicate7, ahb.c);
		a(ahb.b, predicate6, ahb.d);
		a(ahb.b, predicate3, ahb.c);
		a(ahb.b, predicate1, ahb.e);
		a(ahb.e, predicate2, ahb.f);
		a(ahb.f, predicate3, ahb.g);
		a(ahb.f, predicate4, ahb.h);
		a(ahb.g, predicate4, ahb.i);
		a(ahb.h, predicate3, ahb.i);
		a(ahb.e, predicate7, ahb.m);
		a(ahb.m, predicate3, ahb.n);
		a(ahb.e, predicate5, ahb.j);
		a(ahb.j, predicate3, ahb.k);
		a(ahb.j, predicate6, ahb.l);
		a(ahb.j, predicate4, ahb.r);
		a(ahb.k, predicate4, ahb.s);
		a(ahb.r, predicate3, ahb.s);
		a(ahb.o, predicate4, ahb.r);
		a(ahb.p, predicate4, ahb.s);
		a(ahb.e, predicate8, ahb.o);
		a(ahb.o, predicate3, ahb.p);
		a(ahb.o, predicate6, ahb.q);
		a(ahb.e, predicate9, ahb.t);
		a(ahb.t, predicate3, ahb.u);
		a(ahb.e, predicate10, ahb.v);
		a(ahb.v, predicate6, ahb.w);
		a(ahb.v, predicate4, ahb.x);
		a(ahb.w, predicate4, ahb.y);
		a(ahb.x, predicate6, ahb.y);
		a(ahb.z, predicate4, ahb.x);
		a(ahb.A, predicate4, ahb.x);
		a(ahb.B, predicate4, ahb.y);
		a(ahb.e, predicate11, ahb.z);
		a(ahb.z, predicate3, ahb.A);
		a(ahb.z, predicate6, ahb.B);
		a(ahb.e, predicate12, ahb.C);
		a(ahb.C, predicate3, ahb.D);
		a(ahb.C, predicate6, ahb.E);
		a(ahb.e, predicate13, ahb.F);
		a(ahb.F, predicate3, ahb.G);
		a(ahb.F, predicate6, ahb.H);
		a(ahb.b, predicate4, ahb.I);
		a(ahb.I, predicate3, ahb.J);
	}

	private static void a(afw afw1, agz.a a, afw afw3) {
		b.add(new agz.b<>(afw1, a, afw3));
	}

	private static void a(agz.a a) {
		c.add(a);
	}

	private static void a(agy agy1, Predicate<afj> predicate, agy agy3) {
		a.add(new agz.b<>(agy1, predicate, agy3));
	}

	static class a implements Predicate<afj> {
		private final afh a;
		private final int b;

		public a(afh afh) {
			this(afh, -1);
		}

		public a(afh afh, int integer) {
			this.a = afh;
			this.b = integer;
		}

		public boolean apply(afj afj) {
			return afj.c() == this.a && (this.b == -1 || this.b == afj.j());
		}
	}

	static class b<T> {
		final T a;
		final Predicate<afj> b;
		final T c;

		public b(T object1, Predicate<afj> predicate, T object3) {
			this.a = object1;
			this.b = predicate;
			this.c = object3;
		}
	}
}
