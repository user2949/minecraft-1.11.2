import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class aqd extends arl {
	private static final Map<ajs, List<aqd.a>> g = Maps.newHashMap();
	private final boolean B;

	private boolean a(ajs ajs, co co, boolean boolean3) {
		if (!g.containsKey(ajs)) {
			g.put(ajs, Lists.newArrayList());
		}

		List<aqd.a> list5 = (List<aqd.a>)g.get(ajs);
		if (boolean3) {
			list5.add(new aqd.a(co, ajs.P()));
		}

		int integer6 = 0;

		for (int integer7 = 0; integer7 < list5.size(); integer7++) {
			aqd.a a8 = (aqd.a)list5.get(integer7);
			if (a8.a.equals(co)) {
				if (++integer6 >= 8) {
					return true;
				}
			}
		}

		return false;
	}

	protected aqd(boolean boolean1) {
		this.B = boolean1;
		this.a(true);
		this.a(null);
	}

	@Override
	public int a(ajs ajs) {
		return 2;
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		if (this.B) {
			for (cv cv8 : cv.values()) {
				ajs.b(co.a(cv8), this, false);
			}
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		if (this.B) {
			for (cv cv8 : cv.values()) {
				ajs.b(co.a(cv8), this, false);
			}
		}
	}

	@Override
	public int b(atl atl, ajw ajw, co co, cv cv) {
		return this.B && atl.c(a) != cv ? 15 : 0;
	}

	private boolean g(ajs ajs, co co, atl atl) {
		cv cv5 = ((cv)atl.c(a)).d();
		return ajs.b(co.a(cv5), cv5);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, Random random) {
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		boolean boolean6 = this.g(ajs, co, atl);
		List<aqd.a> list7 = (List<aqd.a>)g.get(ajs);

		while (list7 != null && !list7.isEmpty() && ajs.P() - ((aqd.a)list7.get(0)).b > 60L) {
			list7.remove(0);
		}

		if (this.B) {
			if (boolean6) {
				ajs.a(co, alv.aE.t().a(a, atl.c(a)), 3);
				if (this.a(ajs, co, true)) {
					ajs.a(null, co, nn.fl, no.BLOCKS, 0.5F, 2.6F + (ajs.r.nextFloat() - ajs.r.nextFloat()) * 0.8F);

					for (int integer8 = 0; integer8 < 5; integer8++) {
						double double9 = (double)co.p() + random.nextDouble() * 0.6 + 0.2;
						double double11 = (double)co.q() + random.nextDouble() * 0.6 + 0.2;
						double double13 = (double)co.r() + random.nextDouble() * 0.6 + 0.2;
						ajs.a(de.SMOKE_NORMAL, double9, double11, double13, 0.0, 0.0, 0.0);
					}

					ajs.a(co, ajs.o(co).v(), 160);
				}
			}
		} else if (!boolean6 && !this.a(ajs, co, false)) {
			ajs.a(co, alv.aF.t().a(a, atl.c(a)), 3);
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!this.e(ajs, co3, atl)) {
			if (this.B == this.g(ajs, co3, atl)) {
				ajs.a(co3, this, this.a(ajs));
			}
		}
	}

	@Override
	public int c(atl atl, ajw ajw, co co, cv cv) {
		return cv == cv.DOWN ? atl.a(ajw, co, cv) : 0;
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afh.a(alv.aF);
	}

	@Override
	public boolean g(atl atl) {
		return true;
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		if (this.B) {
			double double6 = (double)co.p() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
			double double8 = (double)co.q() + 0.7 + (random.nextDouble() - 0.5) * 0.2;
			double double10 = (double)co.r() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
			cv cv12 = atl.c(a);
			if (cv12.k().c()) {
				cv cv13 = cv12.d();
				double double14 = 0.27;
				double6 += 0.27 * (double)cv13.g();
				double8 += 0.22;
				double10 += 0.27 * (double)cv13.i();
			}

			ajs.a(de.REDSTONE, double6, double8, double10, 0.0, 0.0, 0.0);
		}
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(alv.aF);
	}

	@Override
	public boolean b(alu alu) {
		return alu == alv.aE || alu == alv.aF;
	}

	static class a {
		co a;
		long b;

		public a(co co, long long2) {
			this.a = co;
			this.b = long2;
		}
	}
}
