import java.util.List;

public class aey extends afh {
	public static ei a(afj afj, String string) {
		if (afj.o()) {
			du du3 = afj.p().o("Explosion");
			if (du3 != null) {
				return du3.c(string);
			}
		}

		return null;
	}

	@Override
	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
		if (afj.o()) {
			du du6 = afj.p().o("Explosion");
			if (du6 != null) {
				a(du6, list);
			}
		}
	}

	public static void a(du du, List<String> list) {
		byte byte3 = du.f("Type");
		if (byte3 >= 0 && byte3 <= 4) {
			list.add(dp.a("item.fireworksCharge.type." + byte3).trim());
		} else {
			list.add(dp.a("item.fireworksCharge.type").trim());
		}

		int[] arr4 = du.n("Colors");
		if (arr4.length > 0) {
			boolean boolean5 = true;
			String string6 = "";

			for (int integer10 : arr4) {
				if (!boolean5) {
					string6 = string6 + ", ";
				}

				boolean5 = false;
				boolean boolean11 = false;

				for (int integer12 = 0; integer12 < aen.a.length; integer12++) {
					if (integer10 == aen.a[integer12]) {
						boolean11 = true;
						string6 = string6 + dp.a("item.fireworksCharge." + aem.a(integer12).d());
						break;
					}
				}

				if (!boolean11) {
					string6 = string6 + dp.a("item.fireworksCharge.customColor");
				}
			}

			list.add(string6);
		}

		int[] arr5 = du.n("FadeColors");
		if (arr5.length > 0) {
			boolean boolean6 = true;
			String string7 = dp.a("item.fireworksCharge.fadeTo") + " ";

			for (int integer11 : arr5) {
				if (!boolean6) {
					string7 = string7 + ", ";
				}

				boolean6 = false;
				boolean boolean12 = false;

				for (int integer13 = 0; integer13 < 16; integer13++) {
					if (integer11 == aen.a[integer13]) {
						boolean12 = true;
						string7 = string7 + dp.a("item.fireworksCharge." + aem.a(integer13).d());
						break;
					}
				}

				if (!boolean12) {
					string7 = string7 + dp.a("item.fireworksCharge.customColor");
				}
			}

			list.add(string7);
		}

		boolean boolean6 = du.p("Trail");
		if (boolean6) {
			list.add(dp.a("item.fireworksCharge.trail"));
		}

		boolean boolean7 = du.p("Flicker");
		if (boolean7) {
			list.add(dp.a("item.fireworksCharge.flicker"));
		}
	}
}
