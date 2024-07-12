import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

public class ayh extends ayn {
	private int d = 32;
	private int h = 5;
	public static final List<akf> a = Arrays.asList(akk.a, akk.z, akk.i, akk.l, akk.m);
	public static final List<akf> b = Arrays.asList(akk.z);
	private static final List<akf.c> i = Lists.newArrayList();

	public ayh() {
	}

	public ayh(Map<String, String> map) {
		this();

		for (Entry<String, String> entry4 : map.entrySet()) {
			if (((String)entry4.getKey()).equals("spacing")) {
				this.d = ot.a((String)entry4.getValue(), this.d, 1);
			} else if (((String)entry4.getKey()).equals("separation")) {
				this.h = ot.a((String)entry4.getValue(), this.h, 1);
			}
		}
	}

	@Override
	public String a() {
		return "Monument";
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
		Random random8 = this.g.a(integer6, integer7, 10387313);
		integer6 *= this.d;
		integer7 *= this.d;
		integer6 += (random8.nextInt(this.d - this.h) + random8.nextInt(this.d - this.h)) / 2;
		integer7 += (random8.nextInt(this.d - this.h) + random8.nextInt(this.d - this.h)) / 2;
		if (integer4 == integer6 && integer5 == integer7) {
			if (!this.g.A().a(integer4 * 16 + 8, integer5 * 16 + 8, 16, b)) {
				return false;
			}

			boolean boolean9 = this.g.A().a(integer4 * 16 + 8, integer5 * 16 + 8, 29, a);
			if (boolean9) {
				return true;
			}
		}

		return false;
	}

	@Override
	public co a(ajs ajs, co co, boolean boolean3) {
		this.g = ajs;
		return a(ajs, this, co, this.d, this.h, 10387313, true, 100, boolean3);
	}

	@Override
	protected ayr b(int integer1, int integer2) {
		return new ayh.a(this.g, this.f, integer1, integer2);
	}

	public List<akf.c> b() {
		return i;
	}

	static {
		i.add(new akf.c(zx.class, 1, 2, 4));
	}

	public static class a extends ayr {
		private final Set<ajl> c = Sets.newHashSet();
		private boolean d;

		public a() {
		}

		public a(ajs ajs, Random random, int integer3, int integer4) {
			super(integer3, integer4);
			this.b(ajs, random, integer3, integer4);
		}

		private void b(ajs ajs, Random random, int integer3, int integer4) {
			random.setSeed(ajs.O());
			long long6 = random.nextLong();
			long long8 = random.nextLong();
			long long10 = (long)integer3 * long6;
			long long12 = (long)integer4 * long8;
			random.setSeed(long10 ^ long12 ^ ajs.O());
			int integer14 = integer3 * 16 + 8 - 29;
			int integer15 = integer4 * 16 + 8 - 29;
			cv cv16 = cv.c.HORIZONTAL.a(random);
			this.a.add(new ayi.h(random, integer14, integer15, cv16));
			this.d();
			this.d = true;
		}

		@Override
		public void a(ajs ajs, Random random, axz axz) {
			if (!this.d) {
				this.a.clear();
				this.b(ajs, random, this.e(), this.f());
			}

			super.a(ajs, random, axz);
		}

		@Override
		public boolean a(ajl ajl) {
			return this.c.contains(ajl) ? false : super.a(ajl);
		}

		@Override
		public void b(ajl ajl) {
			super.b(ajl);
			this.c.add(ajl);
		}

		@Override
		public void a(du du) {
			super.a(du);
			ea ea3 = new ea();

			for (ajl ajl5 : this.c) {
				du du6 = new du();
				du6.a("X", ajl5.a);
				du6.a("Z", ajl5.b);
				ea3.a(du6);
			}

			du.a("Processed", ea3);
		}

		@Override
		public void b(du du) {
			super.b(du);
			if (du.b("Processed", 9)) {
				ea ea3 = du.c("Processed", 10);

				for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
					du du5 = ea3.b(integer4);
					this.c.add(new ajl(du5.h("X"), du5.h("Z")));
				}
			}
		}
	}
}
