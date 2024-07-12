import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class p {
	private static final Pattern a = Pattern.compile("^@([pare])(?:\\[([^ ]*)\\])?$");
	private static final Splitter b = Splitter.on(',').omitEmptyStrings();
	private static final Splitter c = Splitter.on('=').limit(2);
	private static final Set<String> d = Sets.newHashSet();
	private static final String e = c("r");
	private static final String f = c("rm");
	private static final String g = c("l");
	private static final String h = c("lm");
	private static final String i = c("x");
	private static final String j = c("y");
	private static final String k = c("z");
	private static final String l = c("dx");
	private static final String m = c("dy");
	private static final String n = c("dz");
	private static final String o = c("rx");
	private static final String p = c("rxm");
	private static final String q = c("ry");
	private static final String r = c("rym");
	private static final String s = c("c");
	private static final String t = c("m");
	private static final String u = c("team");
	private static final String v = c("name");
	private static final String w = c("type");
	private static final String x = c("tag");
	private static final Predicate<String> y = new Predicate<String>() {
		public boolean apply(@Nullable String string) {
			return string != null && (p.d.contains(string) || string.length() > "score_".length() && string.startsWith("score_"));
		}
	};
	private static final Set<String> z = Sets.newHashSet(new String[]{i, j, k, l, m, n, f, e});

	private static String c(String string) {
		d.add(string);
		return string;
	}

	@Nullable
	public static ly a(n n, String string) throws cd {
		return a(n, string, ly.class);
	}

	@Nullable
	public static <T extends sn> T a(n n, String string, Class<? extends T> class3) throws cd {
		List<T> list4 = b(n, string, class3);
		return (T)(list4.size() == 1 ? list4.get(0) : null);
	}

	@Nullable
	public static fb b(n n, String string) throws cd {
		List<sn> list3 = b(n, string, sn.class);
		if (list3.isEmpty()) {
			return null;
		} else {
			List<fb> list4 = Lists.newArrayList();

			for (sn sn6 : list3) {
				list4.add(sn6.i_());
			}

			return j.a(list4);
		}
	}

	public static <T extends sn> List<T> b(n n, String string, Class<? extends T> class3) throws cd {
		Matcher matcher4 = a.matcher(string);
		if (matcher4.matches() && n.a(1, "@")) {
			Map<String, String> map5 = d(matcher4.group(2));
			if (!b(n, map5)) {
				return Collections.emptyList();
			} else {
				String string6 = matcher4.group(1);
				co co7 = a(map5, n.c());
				bdw bdw8 = b(map5, n.d());
				List<ajs> list9 = a(n, map5);
				List<T> list10 = Lists.newArrayList();

				for (ajs ajs12 : list9) {
					if (ajs12 != null) {
						List<Predicate<sn>> list13 = Lists.newArrayList();
						list13.addAll(a(map5, string6));
						list13.addAll(b(map5));
						list13.addAll(c(map5));
						list13.addAll(d(map5));
						list13.addAll(c(n, map5));
						list13.addAll(e(map5));
						list13.addAll(f(map5));
						list13.addAll(a(map5, bdw8));
						list13.addAll(g(map5));
						list10.addAll(a(map5, class3, list13, string6, ajs12, co7));
					}
				}

				return a(list10, map5, n, class3, string6, bdw8);
			}
		} else {
			return Collections.emptyList();
		}
	}

	private static List<ajs> a(n n, Map<String, String> map) {
		List<ajs> list3 = Lists.newArrayList();
		if (h(map)) {
			list3.add(n.e());
		} else {
			Collections.addAll(list3, n.B_().d);
		}

		return list3;
	}

	private static <T extends sn> boolean b(n n, Map<String, String> map) {
		String string3 = b(map, w);
		if (string3 == null) {
			return true;
		} else {
			kq kq4 = new kq(string3.startsWith("!") ? string3.substring(1) : string3);
			if (sp.b(kq4)) {
				return true;
			} else {
				fi fi5 = new fi("commands.generic.entity.invalidType", kq4);
				fi5.b().a(a.RED);
				n.a(fi5);
				return false;
			}
		}
	}

	private static List<Predicate<sn>> a(Map<String, String> map, String string) {
		String string3 = b(map, w);
		if (string3 == null || !string.equals("e") && !string.equals("r")) {
			return !string.equals("e") ? Collections.singletonList(new Predicate<sn>() {
				public boolean apply(@Nullable sn sn) {
					return sn instanceof aay;
				}
			}) : Collections.emptyList();
		} else {
			final boolean boolean4 = string3.startsWith("!");
			final kq kq5 = new kq(boolean4 ? string3.substring(1) : string3);
			return Collections.singletonList(new Predicate<sn>() {
				public boolean apply(@Nullable sn sn) {
					return sp.a(sn, kq5) != boolean4;
				}
			});
		}
	}

	private static List<Predicate<sn>> b(Map<String, String> map) {
		List<Predicate<sn>> list2 = Lists.newArrayList();
		final int integer3 = a(map, h, -1);
		final int integer4 = a(map, g, -1);
		if (integer3 > -1 || integer4 > -1) {
			list2.add(new Predicate<sn>() {
				public boolean apply(@Nullable sn sn) {
					if (!(sn instanceof ly)) {
						return false;
					} else {
						ly ly3 = (ly)sn;
						return (integer3 <= -1 || ly3.bL >= integer3) && (integer4 <= -1 || ly3.bL <= integer4);
					}
				}
			});
		}

		return list2;
	}

	private static List<Predicate<sn>> c(Map<String, String> map) {
		List<Predicate<sn>> list2 = Lists.newArrayList();
		String string3 = b(map, t);
		if (string3 == null) {
			return list2;
		} else {
			final boolean boolean4 = string3.startsWith("!");
			if (boolean4) {
				string3 = string3.substring(1);
			}

			ajq ajq5;
			try {
				int integer6 = Integer.parseInt(string3);
				ajq5 = ajq.a(integer6, ajq.NOT_SET);
			} catch (Throwable var6) {
				ajq5 = ajq.a(string3, ajq.NOT_SET);
			}

			final ajq ajq6 = ajq5;
			list2.add(new Predicate<sn>() {
				public boolean apply(@Nullable sn sn) {
					if (!(sn instanceof ly)) {
						return false;
					} else {
						ly ly3 = (ly)sn;
						ajq ajq4 = ly3.c.b();
						return boolean4 ? ajq4 != ajq6 : ajq4 == ajq6;
					}
				}
			});
			return list2;
		}
	}

	private static List<Predicate<sn>> d(Map<String, String> map) {
		List<Predicate<sn>> list2 = Lists.newArrayList();
		final String string3 = b(map, u);
		final boolean boolean4 = string3 != null && string3.startsWith("!");
		if (boolean4) {
			string3 = string3.substring(1);
		}

		if (string3 != null) {
			list2.add(new Predicate<sn>() {
				public boolean apply(@Nullable sn sn) {
					if (!(sn instanceof sw)) {
						return false;
					} else {
						sw sw3 = (sw)sn;
						bee bee4 = sw3.aQ();
						String string5 = bee4 == null ? "" : bee4.b();
						return string5.equals(string3) != boolean4;
					}
				}
			});
		}

		return list2;
	}

	private static List<Predicate<sn>> c(n n, Map<String, String> map) {
		final Map<String, Integer> map3 = a(map);
		return (List<Predicate<sn>>)(map3.isEmpty() ? Collections.emptyList() : Lists.newArrayList(new Predicate[]{new Predicate<sn>() {
			public boolean apply(@Nullable sn sn) {
				if (sn == null) {
					return false;
				} else {
					bec bec3 = n.B_().a(0).ad();

					for (Entry<String, Integer> entry5 : map3.entrySet()) {
						String string6 = (String)entry5.getKey();
						boolean boolean7 = false;
						if (string6.endsWith("_min") && string6.length() > 4) {
							boolean7 = true;
							string6 = string6.substring(0, string6.length() - 4);
						}

						bdy bdy8 = bec3.b(string6);
						if (bdy8 == null) {
							return false;
						}

						String string9 = sn instanceof ly ? sn.h_() : sn.bf();
						if (!bec3.b(string9, bdy8)) {
							return false;
						}

						bea bea10 = bec3.c(string9, bdy8);
						int integer11 = bea10.c();
						if (integer11 < (Integer)entry5.getValue() && boolean7) {
							return false;
						}

						if (integer11 > (Integer)entry5.getValue() && !boolean7) {
							return false;
						}
					}

					return true;
				}
			}
		}}));
	}

	private static List<Predicate<sn>> e(Map<String, String> map) {
		List<Predicate<sn>> list2 = Lists.newArrayList();
		final String string3 = b(map, v);
		final boolean boolean4 = string3 != null && string3.startsWith("!");
		if (boolean4) {
			string3 = string3.substring(1);
		}

		if (string3 != null) {
			list2.add(new Predicate<sn>() {
				public boolean apply(@Nullable sn sn) {
					return sn != null && sn.h_().equals(string3) != boolean4;
				}
			});
		}

		return list2;
	}

	private static List<Predicate<sn>> f(Map<String, String> map) {
		List<Predicate<sn>> list2 = Lists.newArrayList();
		String string3 = b(map, x);
		final boolean boolean4 = string3 != null && string3.startsWith("!");
		if (boolean4) {
			string3 = string3.substring(1);
		}

		if (string3 != null) {
			final String string5 = string3;
			list2.add(new Predicate<sn>() {
				public boolean apply(@Nullable sn sn) {
					if (sn == null) {
						return false;
					} else {
						return "".equals(string5) ? sn.P().isEmpty() != boolean4 : sn.P().contains(string5) != boolean4;
					}
				}
			});
		}

		return list2;
	}

	private static List<Predicate<sn>> a(Map<String, String> map, bdw bdw) {
		double double3 = (double)a(map, f, -1);
		double double5 = (double)a(map, e, -1);
		final boolean boolean7 = double3 < -0.5;
		final boolean boolean8 = double5 < -0.5;
		if (boolean7 && boolean8) {
			return Collections.emptyList();
		} else {
			double double9 = Math.max(double3, 1.0E-4);
			final double double11 = double9 * double9;
			double double13 = Math.max(double5, 1.0E-4);
			final double double15 = double13 * double13;
			return Lists.newArrayList(new Predicate[]{new Predicate<sn>() {
				public boolean apply(@Nullable sn sn) {
					if (sn == null) {
						return false;
					} else {
						double double3 = bdw.c(sn.p, sn.q, sn.r);
						return (boolean7 || double3 >= double11) && (boolean8 || double3 <= double15);
					}
				}
			}});
		}
	}

	private static List<Predicate<sn>> g(Map<String, String> map) {
		List<Predicate<sn>> list2 = Lists.newArrayList();
		if (map.containsKey(r) || map.containsKey(q)) {
			final int integer3 = ot.b(a(map, r, 0));
			final int integer4 = ot.b(a(map, q, 359));
			list2.add(new Predicate<sn>() {
				public boolean apply(@Nullable sn sn) {
					if (sn == null) {
						return false;
					} else {
						int integer3 = ot.b(ot.d(sn.v));
						return integer3 > integer4 ? integer3 >= integer3 || integer3 <= integer4 : integer3 >= integer3 && integer3 <= integer4;
					}
				}
			});
		}

		if (map.containsKey(p) || map.containsKey(o)) {
			final int integer3 = ot.b(a(map, p, 0));
			final int integer4 = ot.b(a(map, o, 359));
			list2.add(new Predicate<sn>() {
				public boolean apply(@Nullable sn sn) {
					if (sn == null) {
						return false;
					} else {
						int integer3 = ot.b(ot.d(sn.w));
						return integer3 > integer4 ? integer3 >= integer3 || integer3 <= integer4 : integer3 >= integer3 && integer3 <= integer4;
					}
				}
			});
		}

		return list2;
	}

	private static <T extends sn> List<T> a(Map<String, String> map, Class<? extends T> class2, List<Predicate<sn>> list, String string, ajs ajs, co co) {
		List<T> list7 = Lists.newArrayList();
		String string8 = b(map, w);
		string8 = string8 != null && string8.startsWith("!") ? string8.substring(1) : string8;
		boolean boolean9 = !string.equals("e");
		boolean boolean10 = string.equals("r") && string8 != null;
		int integer11 = a(map, l, 0);
		int integer12 = a(map, m, 0);
		int integer13 = a(map, n, 0);
		int integer14 = a(map, e, -1);
		Predicate<sn> predicate15 = Predicates.and(list);
		Predicate<sn> predicate16 = Predicates.and(sr.a, predicate15);
		if (map.containsKey(l) || map.containsKey(m) || map.containsKey(n)) {
			final bdt bdt17 = a(co, integer11, integer12, integer13);
			if (boolean9 && !boolean10) {
				Predicate<sn> predicate18 = new Predicate<sn>() {
					public boolean apply(@Nullable sn sn) {
						return sn != null && bdt17.c(sn.bo());
					}
				};
				list7.addAll(ajs.b(class2, Predicates.and(predicate16, predicate18)));
			} else {
				list7.addAll(ajs.a(class2, bdt17, predicate16));
			}
		} else if (integer14 >= 0) {
			bdt bdt17 = new bdt(
				(double)(co.p() - integer14),
				(double)(co.q() - integer14),
				(double)(co.r() - integer14),
				(double)(co.p() + integer14 + 1),
				(double)(co.q() + integer14 + 1),
				(double)(co.r() + integer14 + 1)
			);
			if (boolean9 && !boolean10) {
				list7.addAll(ajs.b(class2, predicate16));
			} else {
				list7.addAll(ajs.a(class2, bdt17, predicate16));
			}
		} else if (string.equals("a")) {
			list7.addAll(ajs.b(class2, predicate15));
		} else if (!string.equals("p") && (!string.equals("r") || boolean10)) {
			list7.addAll(ajs.a(class2, predicate16));
		} else {
			list7.addAll(ajs.b(class2, predicate16));
		}

		return list7;
	}

	private static <T extends sn> List<T> a(List<T> list, Map<String, String> map, n n, Class<? extends T> class4, String string, bdw bdw) {
		int integer7 = a(map, s, !string.equals("a") && !string.equals("e") ? 1 : 0);
		if (string.equals("p") || string.equals("a") || string.equals("e")) {
			Collections.sort(list, new Comparator<sn>() {
				public int compare(sn sn1, sn sn2) {
					return ComparisonChain.start().compare(sn1.d(bdw.b, bdw.c, bdw.d), sn2.d(bdw.b, bdw.c, bdw.d)).result();
				}
			});
		} else if (string.equals("r")) {
			Collections.shuffle(list);
		}

		sn sn8 = n.f();
		if (sn8 != null && class4.isAssignableFrom(sn8.getClass()) && integer7 == 1 && list.contains(sn8) && !"r".equals(string)) {
			list = Lists.newArrayList(new sn[]{sn8});
		}

		if (integer7 != 0) {
			if (integer7 < 0) {
				Collections.reverse(list);
			}

			list = list.subList(0, Math.min(Math.abs(integer7), list.size()));
		}

		return list;
	}

	private static bdt a(co co, int integer2, int integer3, int integer4) {
		boolean boolean5 = integer2 < 0;
		boolean boolean6 = integer3 < 0;
		boolean boolean7 = integer4 < 0;
		int integer8 = co.p() + (boolean5 ? integer2 : 0);
		int integer9 = co.q() + (boolean6 ? integer3 : 0);
		int integer10 = co.r() + (boolean7 ? integer4 : 0);
		int integer11 = co.p() + (boolean5 ? 0 : integer2) + 1;
		int integer12 = co.q() + (boolean6 ? 0 : integer3) + 1;
		int integer13 = co.r() + (boolean7 ? 0 : integer4) + 1;
		return new bdt((double)integer8, (double)integer9, (double)integer10, (double)integer11, (double)integer12, (double)integer13);
	}

	private static co a(Map<String, String> map, co co) {
		return new co(a(map, i, co.p()), a(map, j, co.q()), a(map, k, co.r()));
	}

	private static bdw b(Map<String, String> map, bdw bdw) {
		return new bdw(a(map, i, bdw.b, true), a(map, j, bdw.c, false), a(map, k, bdw.d, true));
	}

	private static double a(Map<String, String> map, String string, double double3, boolean boolean4) {
		return map.containsKey(string) ? (double)ot.a((String)map.get(string), ot.c(double3)) + (boolean4 ? 0.5 : 0.0) : double3;
	}

	private static boolean h(Map<String, String> map) {
		for (String string3 : z) {
			if (map.containsKey(string3)) {
				return true;
			}
		}

		return false;
	}

	private static int a(Map<String, String> map, String string, int integer) {
		return map.containsKey(string) ? ot.a((String)map.get(string), integer) : integer;
	}

	@Nullable
	private static String b(Map<String, String> map, String string) {
		return (String)map.get(string);
	}

	public static Map<String, Integer> a(Map<String, String> map) {
		Map<String, Integer> map2 = Maps.newHashMap();

		for (String string4 : map.keySet()) {
			if (string4.startsWith("score_") && string4.length() > "score_".length()) {
				map2.put(string4.substring("score_".length()), ot.a((String)map.get(string4), 1));
			}
		}

		return map2;
	}

	public static boolean a(String string) throws cd {
		Matcher matcher2 = a.matcher(string);
		if (!matcher2.matches()) {
			return false;
		} else {
			Map<String, String> map3 = d(matcher2.group(2));
			String string4 = matcher2.group(1);
			int integer5 = !"a".equals(string4) && !"e".equals(string4) ? 1 : 0;
			return a(map3, s, integer5) != 1;
		}
	}

	public static boolean b(String string) {
		return a.matcher(string).matches();
	}

	private static Map<String, String> d(@Nullable String string) throws cd {
		Map<String, String> map2 = Maps.newHashMap();
		if (string == null) {
			return map2;
		} else {
			for (String string4 : b.split(string)) {
				Iterator<String> iterator5 = c.split(string4).iterator();
				String string6 = (String)iterator5.next();
				if (!y.apply(string6)) {
					throw new cd("commands.generic.selector_argument", string4);
				}

				map2.put(string6, iterator5.hasNext() ? (String)iterator5.next() : "");
			}

			return map2;
		}
	}
}
