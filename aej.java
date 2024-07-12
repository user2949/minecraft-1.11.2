import java.util.List;

public abstract class aej {
	public static final aej[] a = new aej[12];
	public static final aej b = new aej(0, "buildingBlocks") {
		@Override
		public afj e() {
			return new afj(afh.a(alv.V));
		}
	};
	public static final aej c = new aej(1, "decorations") {
		@Override
		public afj e() {
			return new afj(afh.a(alv.cF), 1, amy.b.PAEONIA.a());
		}
	};
	public static final aej d = new aej(2, "redstone") {
		@Override
		public afj e() {
			return new afj(afl.aF);
		}
	};
	public static final aej e = new aej(3, "transportation") {
		@Override
		public afj e() {
			return new afj(afh.a(alv.D));
		}
	};
	public static final aej f = new aej(4, "misc") {
		@Override
		public afj e() {
			return new afj(afl.aB);
		}
	};
	public static final aej g = (new aej(5, "search") {
		@Override
		public afj e() {
			return new afj(afl.aY);
		}
	}).a("item_search.png");
	public static final aej h = new aej(6, "food") {
		@Override
		public afj e() {
			return new afj(afl.f);
		}
	};
	public static final aej i = (new aej(7, "tools") {
		@Override
		public afj e() {
			return new afj(afl.d);
		}
	}).a(new aij[]{aij.ALL, aij.DIGGER, aij.FISHING_ROD, aij.BREAKABLE});
	public static final aej j = (new aej(8, "combat") {
		@Override
		public afj e() {
			return new afj(afl.E);
		}
	}).a(new aij[]{aij.ALL, aij.ARMOR, aij.ARMOR_FEET, aij.ARMOR_HEAD, aij.ARMOR_LEGS, aij.ARMOR_CHEST, aij.BOW, aij.WEAPON, aij.WEARABLE, aij.BREAKABLE});
	public static final aej k = new aej(9, "brewing") {
		@Override
		public afj e() {
			return aha.a(new afj(afl.bH), ahb.b);
		}
	};
	public static final aej l = new aej(10, "materials") {
		@Override
		public afj e() {
			return new afj(afl.B);
		}
	};
	public static final aej m = (new aej(11, "inventory") {
		@Override
		public afj e() {
			return new afj(afh.a(alv.ae));
		}
	}).a("inventory.png").j().h();
	private final int n;
	private final String o;
	private String p = "items.png";
	private boolean q = true;
	private boolean r = true;
	private aij[] s;
	private afj t;

	public aej(int integer, String string) {
		this.n = integer;
		this.o = string;
		this.t = afj.a;
		a[integer] = this;
	}

	public int a() {
		return this.n;
	}

	public String b() {
		return this.o;
	}

	public String c() {
		return "itemGroup." + this.b();
	}

	public afj d() {
		if (this.t.b()) {
			this.t = this.e();
		}

		return this.t;
	}

	public abstract afj e();

	public String f() {
		return this.p;
	}

	public aej a(String string) {
		this.p = string;
		return this;
	}

	public boolean g() {
		return this.r;
	}

	public aej h() {
		this.r = false;
		return this;
	}

	public boolean i() {
		return this.q;
	}

	public aej j() {
		this.q = false;
		return this;
	}

	public int k() {
		return this.n % 6;
	}

	public boolean l() {
		return this.n < 6;
	}

	public aij[] m() {
		return this.s;
	}

	public aej a(aij... arr) {
		this.s = arr;
		return this;
	}

	public boolean a(aij aij) {
		if (this.s == null) {
			return false;
		} else {
			for (aij aij6 : this.s) {
				if (aij6 == aij) {
					return true;
				}
			}

			return false;
		}
	}

	public void a(dd<afj> dd) {
		for (afh afh4 : afh.g) {
			if (afh4 != null && afh4.b() == this) {
				afh4.a(afh4, this, dd);
			}
		}

		if (this.m() != null) {
			this.a(dd, this.m());
		}
	}

	public void a(List<afj> list, aij... arr) {
		for (aii aii5 : aii.b) {
			if (aii5 != null && aii5.c != null) {
				boolean boolean6 = false;

				for (int integer7 = 0; integer7 < arr.length && !boolean6; integer7++) {
					if (aii5.c == arr[integer7]) {
						boolean6 = true;
					}
				}

				if (boolean6) {
					list.add(afl.co.a(new ail(aii5, aii5.b())));
				}
			}
		}
	}
}
