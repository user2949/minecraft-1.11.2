import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class ayf extends ayn {
	private final List<akf.c> a = Lists.newArrayList();

	public ayf() {
		this.a.add(new akf.c(zn.class, 10, 2, 3));
		this.a.add(new akf.c(aab.class, 5, 4, 4));
		this.a.add(new akf.c(aan.class, 8, 5, 5));
		this.a.add(new akf.c(aag.class, 2, 5, 5));
		this.a.add(new akf.c(zz.class, 3, 4, 4));
	}

	@Override
	public String a() {
		return "Fortress";
	}

	public List<akf.c> b() {
		return this.a;
	}

	@Override
	protected boolean a(int integer1, int integer2) {
		int integer4 = integer1 >> 4;
		int integer5 = integer2 >> 4;
		this.f.setSeed((long)(integer4 ^ integer5 << 4) ^ this.g.O());
		this.f.nextInt();
		if (this.f.nextInt(3) != 0) {
			return false;
		} else {
			return integer1 != (integer4 << 4) + 4 + this.f.nextInt(8) ? false : integer2 == (integer5 << 4) + 4 + this.f.nextInt(8);
		}
	}

	@Override
	protected ayr b(int integer1, int integer2) {
		return new ayf.a(this.g, this.f, integer1, integer2);
	}

	@Override
	public co a(ajs ajs, co co, boolean boolean3) {
		int integer5 = 1000;
		int integer6 = co.p() >> 4;
		int integer7 = co.r() >> 4;

		for (int integer8 = 0; integer8 <= 1000; integer8++) {
			for (int integer9 = -integer8; integer9 <= integer8; integer9++) {
				boolean boolean10 = integer9 == -integer8 || integer9 == integer8;

				for (int integer11 = -integer8; integer11 <= integer8; integer11++) {
					boolean boolean12 = integer11 == -integer8 || integer11 == integer8;
					if (boolean10 || boolean12) {
						int integer13 = integer6 + integer9;
						int integer14 = integer7 + integer11;
						if (this.a(integer13, integer14) && (!boolean3 || !ajs.b(integer13, integer14))) {
							return new co((integer13 << 4) + 8, 64, (integer14 << 4) + 8);
						}
					}
				}
			}
		}

		return null;
	}

	public static class a extends ayr {
		public a() {
		}

		public a(ajs ajs, Random random, int integer3, int integer4) {
			super(integer3, integer4);
			ayg.q q6 = new ayg.q(random, (integer3 << 4) + 2, (integer4 << 4) + 2);
			this.a.add(q6);
			q6.a(q6, this.a, random);
			List<ayq> list7 = q6.d;

			while (!list7.isEmpty()) {
				int integer8 = random.nextInt(list7.size());
				ayq ayq9 = (ayq)list7.remove(integer8);
				ayq9.a(q6, this.a, random);
			}

			this.d();
			this.a(ajs, random, 48, 70);
		}
	}
}
