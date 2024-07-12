import ayu.e;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class ayt extends ayn {
	public static final List<akf> a = Arrays.asList(akk.c, akk.d, akk.K, akk.g);
	private int b;
	private int d = 32;
	private final int h = 8;

	public ayt() {
	}

	public ayt(Map<String, String> map) {
		this();

		for (Entry<String, String> entry4 : map.entrySet()) {
			if (((String)entry4.getKey()).equals("size")) {
				this.b = ot.a((String)entry4.getValue(), this.b, 0);
			} else if (((String)entry4.getKey()).equals("distance")) {
				this.d = ot.a((String)entry4.getValue(), this.d, 9);
			}
		}
	}

	@Override
	public String a() {
		return "Village";
	}

	@Override
	protected boolean a(int integer1, int integer2) {
		int integer4 = integer1;
		int integer5 = integer2;
		if (integer1 < 0) {
			integer1 -= this.d - 1;
		}

		if (integer2 < 0) {
			integer2 -= this.d - 1;
		}

		int integer6 = integer1 / this.d;
		int integer7 = integer2 / this.d;
		Random random8 = this.g.a(integer6, integer7, 10387312);
		integer6 *= this.d;
		integer7 *= this.d;
		integer6 += random8.nextInt(this.d - 8);
		integer7 += random8.nextInt(this.d - 8);
		if (integer4 == integer6 && integer5 == integer7) {
			boolean boolean9 = this.g.A().a(integer4 * 16 + 8, integer5 * 16 + 8, 0, a);
			if (boolean9) {
				return true;
			}
		}

		return false;
	}

	@Override
	public co a(ajs ajs, co co, boolean boolean3) {
		this.g = ajs;
		return a(ajs, this, co, this.d, 8, 10387312, false, 100, boolean3);
	}

	@Override
	protected ayr b(int integer1, int integer2) {
		return new ayt.a(this.g, this.f, integer1, integer2, this.b);
	}

	public static class a extends ayr {
		private boolean c;

		public a() {
		}

		public a(ajs ajs, Random random, int integer3, int integer4, int integer5) {
			super(integer3, integer4);
			List<e> list7 = ayu.a(random, integer5);
			ayu.k k8 = new ayu.k(ajs.A(), 0, random, (integer3 << 4) + 2, (integer4 << 4) + 2, list7, integer5);
			this.a.add(k8);
			k8.a(k8, this.a, random);
			List<ayq> list9 = k8.f;
			List<ayq> list10 = k8.e;

			while (!list9.isEmpty() || !list10.isEmpty()) {
				if (list9.isEmpty()) {
					int integer11 = random.nextInt(list10.size());
					ayq ayq12 = (ayq)list10.remove(integer11);
					ayq12.a(k8, this.a, random);
				} else {
					int integer11 = random.nextInt(list9.size());
					ayq ayq12 = (ayq)list9.remove(integer11);
					ayq12.a(k8, this.a, random);
				}
			}

			this.d();
			int integer11 = 0;

			for (ayq ayq13 : this.a) {
				if (!(ayq13 instanceof ayu.o)) {
					integer11++;
				}
			}

			this.c = integer11 > 2;
		}

		@Override
		public boolean a() {
			return this.c;
		}

		@Override
		public void a(du du) {
			super.a(du);
			du.a("Valid", this.c);
		}

		@Override
		public void b(du du) {
			super.b(du);
			this.c = du.p("Valid");
		}
	}
}
