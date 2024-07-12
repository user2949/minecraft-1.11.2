import com.google.common.base.Predicates;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.UUID;

public class adp extends afh {
	private static final int[] n = new int[]{13, 15, 16, 11};
	private static final UUID[] o = new UUID[]{
		UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
		UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
		UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
		UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")
	};
	public static final String[] a = new String[]{
		"minecraft:items/empty_armor_slot_boots",
		"minecraft:items/empty_armor_slot_leggings",
		"minecraft:items/empty_armor_slot_chestplate",
		"minecraft:items/empty_armor_slot_helmet"
	};
	public static final cw b = new cs() {
		@Override
		protected afj b(cp cp, afj afj) {
			afj afj4 = adp.a(cp, afj);
			return afj4.b() ? super.b(cp, afj) : afj4;
		}
	};
	public final ss c;
	public final int d;
	public final float e;
	public final int f;
	private final adp.a p;

	public static afj a(cp cp, afj afj) {
		co co3 = cp.d().a(cp.e().c(amw.a));
		List<sw> list4 = cp.h().a(sw.class, new bdt(co3), Predicates.and(sr.e, new sr.a(afj)));
		if (list4.isEmpty()) {
			return afj.a;
		} else {
			sw sw5 = (sw)list4.get(0);
			ss ss6 = sx.d(afj);
			afj afj7 = afj.a(1);
			sw5.a(ss6, afj7);
			if (sw5 instanceof sx) {
				((sx)sw5).a(ss6, 2.0F);
			}

			return afj;
		}
	}

	public adp(adp.a a, int integer, ss ss) {
		this.p = a;
		this.c = ss;
		this.f = integer;
		this.d = a.b(ss);
		this.e(a.a(ss));
		this.e = a.e();
		this.k = 1;
		this.a(aej.j);
		amw.c.a(this, b);
	}

	public ss D_() {
		return this.c;
	}

	@Override
	public int c() {
		return this.p.a();
	}

	public adp.a d() {
		return this.p;
	}

	public boolean e_(afj afj) {
		if (this.p != adp.a.LEATHER) {
			return false;
		} else {
			du du3 = afj.p();
			return du3 != null && du3.b("display", 10) ? du3.o("display").b("color", 3) : false;
		}
	}

	public int c(afj afj) {
		if (this.p != adp.a.LEATHER) {
			return 16777215;
		} else {
			du du3 = afj.p();
			if (du3 != null) {
				du du4 = du3.o("display");
				if (du4 != null && du4.b("color", 3)) {
					return du4.h("color");
				}
			}

			return 10511680;
		}
	}

	public void d(afj afj) {
		if (this.p == adp.a.LEATHER) {
			du du3 = afj.p();
			if (du3 != null) {
				du du4 = du3.o("display");
				if (du4.e("color")) {
					du4.q("color");
				}
			}
		}
	}

	public void a(afj afj, int integer) {
		if (this.p != adp.a.LEATHER) {
			throw new UnsupportedOperationException("Can't dye non-leather!");
		} else {
			du du4 = afj.p();
			if (du4 == null) {
				du4 = new du();
				afj.b(du4);
			}

			du du5 = du4.o("display");
			if (!du4.b("display", 10)) {
				du4.a("display", du5);
			}

			du5.a("color", integer);
		}
	}

	@Override
	public boolean a(afj afj1, afj afj2) {
		return this.p.c() == afj2.c() ? true : super.a(afj1, afj2);
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		ss ss6 = sx.d(afj5);
		afj afj7 = aay.b(ss6);
		if (afj7.b()) {
			aay.a(ss6, afj5.l());
			afj5.e(0);
			return new rl<>(rk.SUCCESS, afj5);
		} else {
			return new rl<>(rk.FAIL, afj5);
		}
	}

	@Override
	public Multimap<String, tl> a(ss ss) {
		Multimap<String, tl> multimap3 = super.a(ss);
		if (ss == this.c) {
			multimap3.put(aad.g.a(), new tl(o[ss.b()], "Armor modifier", (double)this.d, 0));
			multimap3.put(aad.h.a(), new tl(o[ss.b()], "Armor toughness", (double)this.e, 0));
		}

		return multimap3;
	}

	public static enum a {
		LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, nn.t, 0.0F),
		CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, nn.n, 0.0F),
		IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, nn.s, 0.0F),
		GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, nn.r, 0.0F),
		DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, nn.o, 2.0F);

		private final String f;
		private final int g;
		private final int[] h;
		private final int i;
		private final nm j;
		private final float k;

		private a(String string3, int integer4, int[] arr, int integer6, nm nm, float float8) {
			this.f = string3;
			this.g = integer4;
			this.h = arr;
			this.i = integer6;
			this.j = nm;
			this.k = float8;
		}

		public int a(ss ss) {
			return adp.n[ss.b()] * this.g;
		}

		public int b(ss ss) {
			return this.h[ss.b()];
		}

		public int a() {
			return this.i;
		}

		public nm b() {
			return this.j;
		}

		public afh c() {
			if (this == LEATHER) {
				return afl.aN;
			} else if (this == CHAIN) {
				return afl.m;
			} else if (this == GOLD) {
				return afl.n;
			} else if (this == IRON) {
				return afl.m;
			} else {
				return this == DIAMOND ? afl.l : null;
			}
		}

		public String d() {
			return this.f;
		}

		public float e() {
			return this.k;
		}
	}
}
