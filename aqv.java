import com.google.common.collect.Lists;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class aqv extends alu {
	public static final atx a = atx.a("wet");

	protected aqv() {
		super(azs.m);
		this.y(this.A.b().a(a, false));
		this.a(aej.b);
	}

	@Override
	public String c() {
		return dp.a(this.a() + ".dry.name");
	}

	@Override
	public int d(atl atl) {
		return atl.c(a) ? 1 : 0;
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		this.e(ajs, co, atl);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		this.e(ajs, co3, atl);
		super.a(atl, ajs, co3, alu, co5);
	}

	protected void e(ajs ajs, co co, atl atl) {
		if (!(Boolean)atl.c(a) && this.b(ajs, co)) {
			ajs.a(co, atl.a(a, true), 2);
			ajs.b(2001, co, alu.a(alv.j));
		}
	}

	private boolean b(ajs ajs, co co) {
		Queue<pa<co, Integer>> queue4 = Lists.newLinkedList();
		List<co> list5 = Lists.newArrayList();
		queue4.add(new pa<>(co, 0));
		int integer6 = 0;

		while (!queue4.isEmpty()) {
			pa<co, Integer> pa7 = (pa<co, Integer>)queue4.poll();
			co co8 = pa7.a();
			int integer9 = pa7.b();

			for (cv cv13 : cv.values()) {
				co co14 = co8.a(cv13);
				if (ajs.o(co14).a() == azs.h) {
					ajs.a(co14, alv.a.t(), 2);
					list5.add(co14);
					integer6++;
					if (integer9 < 6) {
						queue4.add(new pa<>(co14, integer9 + 1));
					}
				}
			}

			if (integer6 > 64) {
				break;
			}
		}

		for (co co8 : list5) {
			ajs.b(co8, alv.a, false);
		}

		return integer6 > 0;
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(afh, 1, 0));
		dd.add(new afj(afh, 1, 1));
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, (integer & 1) == 1);
	}

	@Override
	public int e(atl atl) {
		return atl.c(a) ? 1 : 0;
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		if ((Boolean)atl.c(a)) {
			cv cv6 = cv.a(random);
			if (cv6 != cv.UP && !ajs.o(co.a(cv6)).r()) {
				double double7 = (double)co.p();
				double double9 = (double)co.q();
				double double11 = (double)co.r();
				if (cv6 == cv.DOWN) {
					double9 -= 0.05;
					double7 += random.nextDouble();
					double11 += random.nextDouble();
				} else {
					double9 += random.nextDouble() * 0.8;
					if (cv6.k() == cv.a.X) {
						double11 += random.nextDouble();
						if (cv6 == cv.EAST) {
							double7++;
						} else {
							double7 += 0.05;
						}
					} else {
						double7 += random.nextDouble();
						if (cv6 == cv.SOUTH) {
							double11++;
						} else {
							double11 += 0.05;
						}
					}
				}

				ajs.a(de.DRIP_WATER, double7, double9, double11, 0.0, 0.0, 0.0);
			}
		}
	}
}
