import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public abstract class ano extends ama {
	protected atz<ano.a> a;

	protected ano() {
		this.y(this.A.b().a(this.g(), this.e() == ano.b.RED ? ano.a.POPPY : ano.a.DANDELION));
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return super.b(atl, ajw, co).a(atl.e(ajw, co));
	}

	@Override
	public int d(atl atl) {
		return ((ano.a)atl.c(this.g())).b();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (ano.a a8 : ano.a.a(this.e())) {
			dd.add(new afj(afh, 1, a8.b()));
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(this.g(), ano.a.a(this.e(), integer));
	}

	public abstract ano.b e();

	public aub<ano.a> g() {
		if (this.a == null) {
			this.a = atz.a("type", ano.a.class, new Predicate<ano.a>() {
				public boolean apply(@Nullable ano.a a) {
					return a.a() == ano.this.e();
				}
			});
		}

		return this.a;
	}

	@Override
	public int e(atl atl) {
		return ((ano.a)atl.c(this.g())).b();
	}

	@Override
	protected atm b() {
		return new atm(this, this.g());
	}

	@Override
	public alu.a u() {
		return alu.a.XZ;
	}

	public static enum a implements ox {
		DANDELION(ano.b.YELLOW, 0, "dandelion"),
		POPPY(ano.b.RED, 0, "poppy"),
		BLUE_ORCHID(ano.b.RED, 1, "blue_orchid", "blueOrchid"),
		ALLIUM(ano.b.RED, 2, "allium"),
		HOUSTONIA(ano.b.RED, 3, "houstonia"),
		RED_TULIP(ano.b.RED, 4, "red_tulip", "tulipRed"),
		ORANGE_TULIP(ano.b.RED, 5, "orange_tulip", "tulipOrange"),
		WHITE_TULIP(ano.b.RED, 6, "white_tulip", "tulipWhite"),
		PINK_TULIP(ano.b.RED, 7, "pink_tulip", "tulipPink"),
		OXEYE_DAISY(ano.b.RED, 8, "oxeye_daisy", "oxeyeDaisy");

		private static final ano.a[][] k = new ano.a[ano.b.values().length][];
		private final ano.b l;
		private final int m;
		private final String n;
		private final String o;

		private a(ano.b b, int integer4, String string5) {
			this(b, integer4, string5, string5);
		}

		private a(ano.b b, int integer4, String string5, String string6) {
			this.l = b;
			this.m = integer4;
			this.n = string5;
			this.o = string6;
		}

		public ano.b a() {
			return this.l;
		}

		public int b() {
			return this.m;
		}

		public static ano.a a(ano.b b, int integer) {
			ano.a[] arr3 = k[b.ordinal()];
			if (integer < 0 || integer >= arr3.length) {
				integer = 0;
			}

			return arr3[integer];
		}

		public static ano.a[] a(ano.b b) {
			return k[b.ordinal()];
		}

		public String toString() {
			return this.n;
		}

		@Override
		public String m() {
			return this.n;
		}

		public String d() {
			return this.o;
		}

		static {
			for (final ano.b b4 : ano.b.values()) {
				Collection<ano.a> collection5 = Collections2.filter(Lists.newArrayList(values()), new Predicate<ano.a>() {
					public boolean apply(@Nullable ano.a a) {
						return a.a() == b4;
					}
				});
				k[b4.ordinal()] = (ano.a[])collection5.toArray(new ano.a[collection5.size()]);
			}
		}
	}

	public static enum b {
		YELLOW,
		RED;

		public ano a() {
			return this == YELLOW ? alv.N : alv.O;
		}
	}
}
