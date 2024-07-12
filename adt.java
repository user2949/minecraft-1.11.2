import java.util.List;
import javax.annotation.Nullable;

public class adt extends adv {
	public adt() {
		super(alv.cK);
		this.k = 16;
		this.a(aej.c);
		this.a(true);
		this.e(0);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		atl atl10 = ajs.o(co);
		boolean boolean11 = atl10.v().a((ajw)ajs, co);
		if (cv != cv.DOWN && (atl10.a().a() || boolean11) && (!boolean11 || cv == cv.UP)) {
			co = co.a(cv);
			afj afj12 = aay.b(ri);
			if (!aay.a(co, cv, afj12) || !alv.cK.a(ajs, co)) {
				return rk.FAIL;
			} else if (ajs.E) {
				return rk.SUCCESS;
			} else {
				co = boolean11 ? co.b() : co;
				if (cv == cv.UP) {
					int integer13 = ot.c((double)((aay.v + 180.0F) * 16.0F / 360.0F) + 0.5) & 15;
					ajs.a(co, alv.cK.t().a(aqz.b, integer13), 3);
				} else {
					ajs.a(co, alv.cL.t().a(arr.b, cv), 3);
				}

				asc asc13 = ajs.r(co);
				if (asc13 instanceof arz) {
					((arz)asc13).a(afj12, false);
				}

				afj12.g(1);
				return rk.SUCCESS;
			}
		} else {
			return rk.FAIL;
		}
	}

	@Override
	public String b(afj afj) {
		String string3 = "item.banner.";
		aem aem4 = c(afj);
		string3 = string3 + aem4.d() + ".name";
		return dp.a(string3);
	}

	public static void a(afj afj, List<String> list) {
		du du3 = afj.d("BlockEntityTag");
		if (du3 != null && du3.e("Patterns")) {
			ea ea4 = du3.c("Patterns", 10);

			for (int integer5 = 0; integer5 < ea4.c() && integer5 < 6; integer5++) {
				du du6 = ea4.b(integer5);
				aem aem7 = aem.a(du6.h("Color"));
				asa asa8 = asa.a(du6.l("Pattern"));
				if (asa8 != null) {
					list.add(dp.a("item.banner." + asa8.a() + "." + aem7.d()));
				}
			}
		}
	}

	@Override
	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
		a(afj, list);
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (aem aem8 : aem.values()) {
			dd.add(a(aem8, null));
		}
	}

	public static afj a(aem aem, @Nullable ea ea) {
		afj afj3 = new afj(afl.cP, 1, aem.b());
		if (ea != null && !ea.b_()) {
			afj3.c("BlockEntityTag").a("Patterns", ea.d());
		}

		return afj3;
	}

	@Override
	public aej b() {
		return aej.c;
	}

	public static aem c(afj afj) {
		return aem.a(afj.j() & 15);
	}
}
