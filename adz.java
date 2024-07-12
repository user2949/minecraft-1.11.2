import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;

public class adz extends afh {
	public adz() {
		this.a(aej.k);
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		List<sl> list5 = ajs.a(sl.class, aay.bo().g(2.0), new Predicate<sl>() {
			public boolean apply(@Nullable sl sl) {
				return sl != null && sl.au() && sl.y() instanceof yb;
			}
		});
		afj afj6 = aay.b(ri);
		if (!list5.isEmpty()) {
			sl sl7 = (sl)list5.get(0);
			sl7.a(sl7.j() - 0.5F);
			ajs.a(null, aay.p, aay.q, aay.r, nn.L, no.NEUTRAL, 1.0F, 1.0F);
			return new rl<>(rk.SUCCESS, this.a(afj6, aay, new afj(afl.bL)));
		} else {
			bdu bdu7 = this.a(ajs, aay, true);
			if (bdu7 == null) {
				return new rl<>(rk.PASS, afj6);
			} else {
				if (bdu7.a == bdu.a.BLOCK) {
					co co8 = bdu7.a();
					if (!ajs.a(aay, co8) || !aay.a(co8.a(bdu7.b), bdu7.b, afj6)) {
						return new rl<>(rk.PASS, afj6);
					}

					if (ajs.o(co8).a() == azs.h) {
						ajs.a(aay, aay.p, aay.q, aay.r, nn.K, no.NEUTRAL, 1.0F, 1.0F);
						return new rl<>(rk.SUCCESS, this.a(afj6, aay, aha.a(new afj(afl.bH), ahb.b)));
					}
				}

				return new rl<>(rk.PASS, afj6);
			}
		}
	}

	protected afj a(afj afj1, aay aay, afj afj3) {
		afj1.g(1);
		aay.b(oa.b(this));
		if (afj1.b()) {
			return afj3;
		} else {
			if (!aay.bs.c(afj3)) {
				aay.a(afj3, false);
			}

			return afj1;
		}
	}
}
