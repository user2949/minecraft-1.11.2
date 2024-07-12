import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class aha {
	public static List<sh> a(afj afj) {
		return a(afj.p());
	}

	public static List<sh> a(agy agy, Collection<sh> collection) {
		List<sh> list3 = Lists.newArrayList();
		list3.addAll(agy.a());
		list3.addAll(collection);
		return list3;
	}

	public static List<sh> a(@Nullable du du) {
		List<sh> list2 = Lists.newArrayList();
		list2.addAll(c(du).a());
		a(du, list2);
		return list2;
	}

	public static List<sh> b(afj afj) {
		return b(afj.p());
	}

	public static List<sh> b(@Nullable du du) {
		List<sh> list2 = Lists.newArrayList();
		a(du, list2);
		return list2;
	}

	public static void a(@Nullable du du, List<sh> list) {
		if (du != null && du.b("CustomPotionEffects", 9)) {
			ea ea3 = du.c("CustomPotionEffects", 10);

			for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
				du du5 = ea3.b(integer4);
				sh sh6 = sh.b(du5);
				if (sh6 != null) {
					list.add(sh6);
				}
			}
		}
	}

	public static int c(afj afj) {
		du du2 = afj.p();
		if (du2 != null && du2.b("CustomPotionColor", 99)) {
			return du2.h("CustomPotionColor");
		} else {
			return d(afj) == ahb.a ? 16253176 : a(a(afj));
		}
	}

	public static int a(agy agy) {
		return agy == ahb.a ? 16253176 : a(agy.a());
	}

	public static int a(Collection<sh> collection) {
		int integer2 = 3694022;
		if (collection.isEmpty()) {
			return 3694022;
		} else {
			float float3 = 0.0F;
			float float4 = 0.0F;
			float float5 = 0.0F;
			int integer6 = 0;

			for (sh sh8 : collection) {
				if (sh8.e()) {
					int integer9 = sh8.a().g();
					int integer10 = sh8.c() + 1;
					float3 += (float)(integer10 * (integer9 >> 16 & 0xFF)) / 255.0F;
					float4 += (float)(integer10 * (integer9 >> 8 & 0xFF)) / 255.0F;
					float5 += (float)(integer10 * (integer9 >> 0 & 0xFF)) / 255.0F;
					integer6 += integer10;
				}
			}

			if (integer6 == 0) {
				return 0;
			} else {
				float3 = float3 / (float)integer6 * 255.0F;
				float4 = float4 / (float)integer6 * 255.0F;
				float5 = float5 / (float)integer6 * 255.0F;
				return (int)float3 << 16 | (int)float4 << 8 | (int)float5;
			}
		}
	}

	public static agy d(afj afj) {
		return c(afj.p());
	}

	public static agy c(@Nullable du du) {
		return du == null ? ahb.a : agy.a(du.l("Potion"));
	}

	public static afj a(afj afj, agy agy) {
		kq kq3 = agy.a.b(agy);
		if (agy == ahb.a) {
			if (afj.o()) {
				du du4 = afj.p();
				du4.q("Potion");
				if (du4.b_()) {
					afj.b(null);
				}
			}
		} else {
			du du4 = afj.o() ? afj.p() : new du();
			du4.a("Potion", kq3.toString());
			afj.b(du4);
		}

		return afj;
	}

	public static afj a(afj afj, Collection<sh> collection) {
		if (collection.isEmpty()) {
			return afj;
		} else {
			du du3 = (du)Objects.firstNonNull(afj.p(), new du());
			ea ea4 = du3.c("CustomPotionEffects", 9);

			for (sh sh6 : collection) {
				ea4.a(sh6.a(new du()));
			}

			du3.a("CustomPotionEffects", ea4);
			afj.b(du3);
			return afj;
		}
	}

	public static void a(afj afj, List<String> list, float float3) {
		List<sh> list4 = a(afj);
		List<pa<String, tl>> list5 = Lists.newArrayList();
		if (list4.isEmpty()) {
			String string6 = dp.a("effect.none").trim();
			list.add(a.GRAY + string6);
		} else {
			for (sh sh7 : list4) {
				String string8 = dp.a(sh7.f()).trim();
				sg sg9 = sh7.a();
				Map<tj, tl> map10 = sg9.h();
				if (!map10.isEmpty()) {
					for (Entry<tj, tl> entry12 : map10.entrySet()) {
						tl tl13 = (tl)entry12.getValue();
						tl tl14 = new tl(tl13.b(), sg9.a(sh7.c(), tl13), tl13.c());
						list5.add(new pa<>(((tj)entry12.getKey()).a(), tl14));
					}
				}

				if (sh7.c() > 0) {
					string8 = string8 + " " + dp.a("potion.potency." + sh7.c()).trim();
				}

				if (sh7.b() > 20) {
					string8 = string8 + " (" + sg.a(sh7, float3) + ")";
				}

				if (sg9.e()) {
					list.add(a.RED + string8);
				} else {
					list.add(a.BLUE + string8);
				}
			}
		}

		if (!list5.isEmpty()) {
			list.add("");
			list.add(a.DARK_PURPLE + dp.a("potion.whenDrank"));

			for (pa<String, tl> pa7 : list5) {
				tl tl8 = pa7.b();
				double double9 = tl8.d();
				double double11;
				if (tl8.c() != 1 && tl8.c() != 2) {
					double11 = tl8.d();
				} else {
					double11 = tl8.d() * 100.0;
				}

				if (double9 > 0.0) {
					list.add(a.BLUE + dp.a("attribute.modifier.plus." + tl8.c(), afj.b.format(double11), dp.a("attribute.name." + pa7.a())));
				} else if (double9 < 0.0) {
					double11 *= -1.0;
					list.add(a.RED + dp.a("attribute.modifier.take." + tl8.c(), afj.b.format(double11), dp.a("attribute.name." + pa7.a())));
				}
			}
		}
	}
}
