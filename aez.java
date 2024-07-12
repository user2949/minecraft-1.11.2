import com.google.common.collect.Lists;
import java.util.List;

public class aez extends afh {
	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		if (!ajs.E) {
			afj afj10 = aay.b(ri);
			abg abg11 = new abg(ajs, (double)((float)co.p() + float6), (double)((float)co.q() + float7), (double)((float)co.r() + float8), afj10);
			ajs.a(abg11);
			if (!aay.bK.d) {
				afj10.g(1);
			}
		}

		return rk.SUCCESS;
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		if (aay.cH()) {
			afj afj5 = aay.b(ri);
			if (!ajs.E) {
				abg abg6 = new abg(ajs, afj5, aay);
				ajs.a(abg6);
				if (!aay.bK.d) {
					afj5.g(1);
				}
			}

			return new rl<>(rk.SUCCESS, aay.b(ri));
		} else {
			return new rl<>(rk.PASS, aay.b(ri));
		}
	}

	@Override
	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
		du du6 = afj.d("Fireworks");
		if (du6 != null) {
			if (du6.b("Flight", 99)) {
				list.add(dp.a("item.fireworks.flight") + " " + du6.f("Flight"));
			}

			ea ea7 = du6.c("Explosions", 10);
			if (!ea7.b_()) {
				for (int integer8 = 0; integer8 < ea7.c(); integer8++) {
					du du9 = ea7.b(integer8);
					List<String> list10 = Lists.newArrayList();
					aey.a(du9, list10);
					if (!list10.isEmpty()) {
						for (int integer11 = 1; integer11 < list10.size(); integer11++) {
							list10.set(integer11, "  " + (String)list10.get(integer11));
						}

						list.addAll(list10);
					}
				}
			}
		}
	}
}
