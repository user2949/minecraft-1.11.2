import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class ayl extends ayn {
	private final List<akf> a;
	private boolean b;
	private ajl[] d = new ajl[128];
	private double h = 32.0;
	private int i = 3;

	public ayl() {
		this.a = Lists.newArrayList();

		for (akf akf3 : akf.q) {
			if (akf3 != null && akf3.j() > 0.0F) {
				this.a.add(akf3);
			}
		}
	}

	public ayl(Map<String, String> map) {
		this();

		for (Entry<String, String> entry4 : map.entrySet()) {
			if (((String)entry4.getKey()).equals("distance")) {
				this.h = ot.a((String)entry4.getValue(), this.h, 1.0);
			} else if (((String)entry4.getKey()).equals("count")) {
				this.d = new ajl[ot.a((String)entry4.getValue(), this.d.length, 1)];
			} else if (((String)entry4.getKey()).equals("spread")) {
				this.i = ot.a((String)entry4.getValue(), this.i, 1);
			}
		}
	}

	@Override
	public String a() {
		return "Stronghold";
	}

	@Override
	public co a(ajs ajs, co co, boolean boolean3) {
		if (!this.b) {
			this.c();
			this.b = true;
		}

		co co5 = null;
		co.a a6 = new co.a(0, 0, 0);
		double double7 = Double.MAX_VALUE;

		for (ajl ajl12 : this.d) {
			a6.c((ajl12.a << 4) + 8, 32, (ajl12.b << 4) + 8);
			double double13 = a6.n(co);
			if (co5 == null) {
				co5 = new co(a6);
				double7 = double13;
			} else if (double13 < double7) {
				co5 = new co(a6);
				double7 = double13;
			}
		}

		return co5;
	}

	@Override
	protected boolean a(int integer1, int integer2) {
		if (!this.b) {
			this.c();
			this.b = true;
		}

		for (ajl ajl7 : this.d) {
			if (integer1 == ajl7.a && integer2 == ajl7.b) {
				return true;
			}
		}

		return false;
	}

	private void c() {
		this.a(this.g);
		int integer2 = 0;
		ObjectIterator random3 = this.c.values().iterator();

		while (random3.hasNext()) {
			ayr ayr4 = (ayr)random3.next();
			if (integer2 < this.d.length) {
				this.d[integer2++] = new ajl(ayr4.e(), ayr4.f());
			}
		}

		Random random3x = new Random();
		random3x.setSeed(this.g.O());
		double double4 = random3x.nextDouble() * Math.PI * 2.0;
		int integer6 = 0;
		int integer7 = 0;
		int integer8 = this.c.size();
		if (integer8 < this.d.length) {
			for (int integer9 = 0; integer9 < this.d.length; integer9++) {
				double double10 = 4.0 * this.h + this.h * (double)integer6 * 6.0 + (random3x.nextDouble() - 0.5) * this.h * 2.5;
				int integer12 = (int)Math.round(Math.cos(double4) * double10);
				int integer13 = (int)Math.round(Math.sin(double4) * double10);
				co co14 = this.g.A().a((integer12 << 4) + 8, (integer13 << 4) + 8, 112, this.a, random3x);
				if (co14 != null) {
					integer12 = co14.p() >> 4;
					integer13 = co14.r() >> 4;
				}

				if (integer9 >= integer8) {
					this.d[integer9] = new ajl(integer12, integer13);
				}

				double4 += (Math.PI * 2) / (double)this.i;
				if (++integer7 == this.i) {
					integer6++;
					integer7 = 0;
					this.i = this.i + 2 * this.i / (integer6 + 1);
					this.i = Math.min(this.i, this.d.length - integer9);
					double4 += random3x.nextDouble() * Math.PI * 2.0;
				}
			}
		}
	}

	@Override
	protected ayr b(int integer1, int integer2) {
		ayl.a a4 = new ayl.a(this.g, this.f, integer1, integer2);

		while (a4.c().isEmpty() || ((aym.m)a4.c().get(0)).b == null) {
			a4 = new ayl.a(this.g, this.f, integer1, integer2);
		}

		return a4;
	}

	public static class a extends ayr {
		public a() {
		}

		public a(ajs ajs, Random random, int integer3, int integer4) {
			super(integer3, integer4);
			aym.b();
			aym.m m6 = new aym.m(0, random, (integer3 << 4) + 2, (integer4 << 4) + 2);
			this.a.add(m6);
			m6.a(m6, this.a, random);
			List<ayq> list7 = m6.c;

			while (!list7.isEmpty()) {
				int integer8 = random.nextInt(list7.size());
				ayq ayq9 = (ayq)list7.remove(integer8);
				ayq9.a(m6, this.a, random);
			}

			this.d();
			this.a(ajs, random, 10);
		}
	}
}
