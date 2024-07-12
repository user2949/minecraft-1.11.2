import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public class axu {
	private final List<axv> a = Lists.newArrayList();
	private final Map<String, Map<String, String>> b = Maps.newHashMap();
	private int c;

	public int a() {
		return this.c;
	}

	public void a(int integer) {
		this.c = integer;
	}

	public Map<String, Map<String, String>> b() {
		return this.b;
	}

	public List<axv> c() {
		return this.a;
	}

	public void d() {
		int integer2 = 0;

		for (axv axv4 : this.a) {
			axv4.b(integer2);
			integer2 += axv4.b();
		}
	}

	public String toString() {
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(3);
		stringBuilder2.append(";");

		for (int integer3 = 0; integer3 < this.a.size(); integer3++) {
			if (integer3 > 0) {
				stringBuilder2.append(",");
			}

			stringBuilder2.append(this.a.get(integer3));
		}

		stringBuilder2.append(";");
		stringBuilder2.append(this.c);
		if (this.b.isEmpty()) {
			stringBuilder2.append(";");
		} else {
			stringBuilder2.append(";");
			int integer3 = 0;

			for (Entry<String, Map<String, String>> entry5 : this.b.entrySet()) {
				if (integer3++ > 0) {
					stringBuilder2.append(",");
				}

				stringBuilder2.append(((String)entry5.getKey()).toLowerCase(Locale.ROOT));
				Map<String, String> map6 = (Map<String, String>)entry5.getValue();
				if (!map6.isEmpty()) {
					stringBuilder2.append("(");
					int integer7 = 0;

					for (Entry<String, String> entry9 : map6.entrySet()) {
						if (integer7++ > 0) {
							stringBuilder2.append(" ");
						}

						stringBuilder2.append((String)entry9.getKey());
						stringBuilder2.append("=");
						stringBuilder2.append((String)entry9.getValue());
					}

					stringBuilder2.append(")");
				}
			}
		}

		return stringBuilder2.toString();
	}

	private static axv a(int integer1, String string, int integer3) {
		String[] arr4 = integer1 >= 3 ? string.split("\\*", 2) : string.split("x", 2);
		int integer5 = 1;
		int integer6 = 0;
		if (arr4.length == 2) {
			try {
				integer5 = Integer.parseInt(arr4[0]);
				if (integer3 + integer5 >= 256) {
					integer5 = 256 - integer3;
				}

				if (integer5 < 0) {
					integer5 = 0;
				}
			} catch (Throwable var8) {
				return null;
			}
		}

		alu alu7;
		try {
			String string8 = arr4[arr4.length - 1];
			if (integer1 < 3) {
				arr4 = string8.split(":", 2);
				if (arr4.length > 1) {
					integer6 = Integer.parseInt(arr4[1]);
				}

				alu7 = alu.b(Integer.parseInt(arr4[0]));
			} else {
				arr4 = string8.split(":", 3);
				alu7 = arr4.length > 1 ? alu.b(arr4[0] + ":" + arr4[1]) : null;
				if (alu7 != null) {
					integer6 = arr4.length > 2 ? Integer.parseInt(arr4[2]) : 0;
				} else {
					alu7 = alu.b(arr4[0]);
					if (alu7 != null) {
						integer6 = arr4.length > 1 ? Integer.parseInt(arr4[1]) : 0;
					}
				}

				if (alu7 == null) {
					return null;
				}
			}

			if (alu7 == alv.a) {
				integer6 = 0;
			}

			if (integer6 < 0 || integer6 > 15) {
				integer6 = 0;
			}
		} catch (Throwable var9) {
			return null;
		}

		axv axv8 = new axv(integer1, integer5, alu7, integer6);
		axv8.b(integer3);
		return axv8;
	}

	private static List<axv> a(int integer, String string) {
		if (string != null && string.length() >= 1) {
			List<axv> list3 = Lists.newArrayList();
			String[] arr4 = string.split(",");
			int integer5 = 0;

			for (String string9 : arr4) {
				axv axv10 = a(integer, string9, integer5);
				if (axv10 == null) {
					return null;
				}

				list3.add(axv10);
				integer5 += axv10.b();
			}

			return list3;
		} else {
			return null;
		}
	}

	public static axu a(String string) {
		if (string == null) {
			return e();
		} else {
			String[] arr2 = string.split(";", -1);
			int integer3 = arr2.length == 1 ? 0 : ot.a(arr2[0], 0);
			if (integer3 >= 0 && integer3 <= 3) {
				axu axu4 = new axu();
				int integer5 = arr2.length == 1 ? 0 : 1;
				List<axv> list6 = a(integer3, arr2[integer5++]);
				if (list6 != null && !list6.isEmpty()) {
					axu4.c().addAll(list6);
					axu4.d();
					int integer7 = akf.a(akk.c);
					if (integer3 > 0 && arr2.length > integer5) {
						integer7 = ot.a(arr2[integer5++], integer7);
					}

					axu4.a(integer7);
					if (integer3 > 0 && arr2.length > integer5) {
						String[] arr8 = arr2[integer5++].toLowerCase(Locale.ROOT).split(",");

						for (String string12 : arr8) {
							String[] arr13 = string12.split("\\(", 2);
							Map<String, String> map14 = Maps.newHashMap();
							if (!arr13[0].isEmpty()) {
								axu4.b().put(arr13[0], map14);
								if (arr13.length > 1 && arr13[1].endsWith(")") && arr13[1].length() > 1) {
									String[] arr15 = arr13[1].substring(0, arr13[1].length() - 1).split(" ");

									for (String string19 : arr15) {
										String[] arr20 = string19.split("=", 2);
										if (arr20.length == 2) {
											map14.put(arr20[0], arr20[1]);
										}
									}
								}
							}
						}
					} else {
						axu4.b().put("village", Maps.newHashMap());
					}

					return axu4;
				} else {
					return e();
				}
			} else {
				return e();
			}
		}
	}

	public static axu e() {
		axu axu1 = new axu();
		axu1.a(akf.a(akk.c));
		axu1.c().add(new axv(1, alv.h));
		axu1.c().add(new axv(2, alv.d));
		axu1.c().add(new axv(1, alv.c));
		axu1.d();
		axu1.b().put("village", Maps.newHashMap());
		return axu1;
	}
}
