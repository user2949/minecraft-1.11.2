import ayk.e;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class ayj extends ayn {
	private static final List<akf> a = Arrays.asList(akk.d, akk.s, akk.w, akk.x, akk.h, akk.n, akk.F);
	private final List<akf.c> b = Lists.newArrayList();
	private int d = 32;
	private final int h = 8;

	public ayj() {
		this.b.add(new akf.c(aam.class, 1, 1, 1));
	}

	public ayj(Map<String, String> map) {
		this();

		for (Entry<String, String> entry4 : map.entrySet()) {
			if (((String)entry4.getKey()).equals("distance")) {
				this.d = ot.a((String)entry4.getValue(), this.d, 9);
			}
		}
	}

	@Override
	public String a() {
		return "Temple";
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
		Random random8 = this.g.a(integer6, integer7, 14357617);
		integer6 *= this.d;
		integer7 *= this.d;
		integer6 += random8.nextInt(this.d - 8);
		integer7 += random8.nextInt(this.d - 8);
		if (integer4 == integer6 && integer5 == integer7) {
			akf akf9 = this.g.A().a(new co(integer4 * 16 + 8, 0, integer5 * 16 + 8));
			if (akf9 == null) {
				return false;
			}

			for (akf akf11 : a) {
				if (akf9 == akf11) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public co a(ajs ajs, co co, boolean boolean3) {
		this.g = ajs;
		return a(ajs, this, co, this.d, 8, 14357617, false, 100, boolean3);
	}

	@Override
	protected ayr b(int integer1, int integer2) {
		return new ayj.a(this.g, this.f, integer1, integer2);
	}

	public boolean a(co co) {
		ayr ayr3 = this.c(co);
		if (ayr3 != null && ayr3 instanceof ayj.a && !ayr3.a.isEmpty()) {
			ayq ayq4 = (ayq)ayr3.a.get(0);
			return ayq4 instanceof e;
		} else {
			return false;
		}
	}

	public List<akf.c> b() {
		return this.b;
	}

	public static class a extends ayr {
		public a() {
		}

		public a(ajs ajs, Random random, int integer3, int integer4) {
			this(ajs, random, integer3, integer4, ajs.b(new co(integer3 * 16 + 8, 0, integer4 * 16 + 8)));
		}

		public a(ajs ajs, Random random, int integer3, int integer4, akf akf) {
			super(integer3, integer4);
			if (akf == akk.w || akf == akk.x) {
				ayk.c c7 = new ayk.c(random, integer3 * 16, integer4 * 16);
				this.a.add(c7);
			} else if (akf == akk.h) {
				e e7 = new e(random, integer3 * 16, integer4 * 16);
				this.a.add(e7);
			} else if (akf == akk.d || akf == akk.s) {
				ayk.a a7 = new ayk.a(random, integer3 * 16, integer4 * 16);
				this.a.add(a7);
			} else if (akf == akk.n || akf == akk.F) {
				ayk.b b7 = new ayk.b(random, integer3 * 16, integer4 * 16);
				this.a.add(b7);
			}

			this.d();
		}
	}
}
