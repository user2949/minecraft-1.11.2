import com.google.common.collect.Maps;
import java.util.Map;

public class afa extends afd {
	private final boolean b;

	public afa(boolean boolean1) {
		super(0, 0.0F, false);
		this.b = boolean1;
	}

	@Override
	public int h(afj afj) {
		afa.a a3 = afa.a.a(afj);
		return this.b && a3.g() ? a3.e() : a3.c();
	}

	@Override
	public float i(afj afj) {
		afa.a a3 = afa.a.a(afj);
		return this.b && a3.g() ? a3.f() : a3.d();
	}

	@Override
	protected void a(afj afj, ajs ajs, aay aay) {
		afa.a a5 = afa.a.a(afj);
		if (a5 == afa.a.PUFFERFISH) {
			aay.c(new sh(si.s, 1200, 3));
			aay.c(new sh(si.q, 300, 2));
			aay.c(new sh(si.i, 300, 1));
		}

		super.a(afj, ajs, aay);
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (afa.a a8 : afa.a.values()) {
			if (!this.b || a8.g()) {
				dd.add(new afj(this, 1, a8.a()));
			}
		}
	}

	@Override
	public String a(afj afj) {
		afa.a a3 = afa.a.a(afj);
		return this.a() + "." + a3.b() + "." + (this.b && a3.g() ? "cooked" : "raw");
	}

	public static enum a {
		COD(0, "cod", 2, 0.1F, 5, 0.6F),
		SALMON(1, "salmon", 2, 0.1F, 6, 0.8F),
		CLOWNFISH(2, "clownfish", 1, 0.1F),
		PUFFERFISH(3, "pufferfish", 1, 0.1F);

		private static final Map<Integer, afa.a> e = Maps.newHashMap();
		private final int f;
		private final String g;
		private final int h;
		private final float i;
		private final int j;
		private final float k;
		private final boolean l;

		private a(int integer3, String string4, int integer5, float float6, int integer7, float float8) {
			this.f = integer3;
			this.g = string4;
			this.h = integer5;
			this.i = float6;
			this.j = integer7;
			this.k = float8;
			this.l = true;
		}

		private a(int integer3, String string4, int integer5, float float6) {
			this.f = integer3;
			this.g = string4;
			this.h = integer5;
			this.i = float6;
			this.j = 0;
			this.k = 0.0F;
			this.l = false;
		}

		public int a() {
			return this.f;
		}

		public String b() {
			return this.g;
		}

		public int c() {
			return this.h;
		}

		public float d() {
			return this.i;
		}

		public int e() {
			return this.j;
		}

		public float f() {
			return this.k;
		}

		public boolean g() {
			return this.l;
		}

		public static afa.a a(int integer) {
			afa.a a2 = (afa.a)e.get(integer);
			return a2 == null ? COD : a2;
		}

		public static afa.a a(afj afj) {
			return afj.c() instanceof afa ? a(afj.j()) : COD;
		}

		static {
			for (afa.a a4 : values()) {
				e.put(a4.a(), a4);
			}
		}
	}
}
