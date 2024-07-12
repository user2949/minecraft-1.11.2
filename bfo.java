import com.google.common.collect.Lists;
import java.util.List;

public class bfo {
	public static String a(String string, boolean boolean2) {
		return !boolean2 && !bes.z().u.o ? a.a(string) : string;
	}

	public static List<fb> a(fb fb, int integer, bfg bfg, boolean boolean4, boolean boolean5) {
		int integer6 = 0;
		fb fb7 = new fh("");
		List<fb> list8 = Lists.newArrayList();
		List<fb> list9 = Lists.newArrayList(fb);

		for (int integer10 = 0; integer10 < list9.size(); integer10++) {
			fb fb11 = (fb)list9.get(integer10);
			String string12 = fb11.e();
			boolean boolean13 = false;
			if (string12.contains("\n")) {
				int integer14 = string12.indexOf(10);
				String string15 = string12.substring(integer14 + 1);
				string12 = string12.substring(0, integer14 + 1);
				fb fb16 = new fh(string15);
				fb16.a(fb11.b().m());
				list9.add(integer10 + 1, fb16);
				boolean13 = true;
			}

			String string14 = a(fb11.b().k() + string12, boolean5);
			String string15 = string14.endsWith("\n") ? string14.substring(0, string14.length() - 1) : string14;
			int integer16 = bfg.a(string15);
			fh fh17 = new fh(string15);
			fh17.a(fb11.b().m());
			if (integer6 + integer16 > integer) {
				String string18 = bfg.a(string14, integer - integer6, false);
				String string19 = string18.length() < string14.length() ? string14.substring(string18.length()) : null;
				if (string19 != null && !string19.isEmpty()) {
					int integer20 = string18.lastIndexOf(32);
					if (integer20 >= 0 && bfg.a(string14.substring(0, integer20)) > 0) {
						string18 = string14.substring(0, integer20);
						if (boolean4) {
							integer20++;
						}

						string19 = string14.substring(integer20);
					} else if (integer6 > 0 && !string14.contains(" ")) {
						string18 = "";
						string19 = string14;
					}

					fh fh21 = new fh(string19);
					fh21.a(fb11.b().m());
					list9.add(integer10 + 1, fh21);
				}

				integer16 = bfg.a(string18);
				fh17 = new fh(string18);
				fh17.a(fb11.b().m());
				boolean13 = true;
			}

			if (integer6 + integer16 <= integer) {
				integer6 += integer16;
				fb7.a(fh17);
			} else {
				boolean13 = true;
			}

			if (boolean13) {
				list8.add(fb7);
				integer6 = 0;
				fb7 = new fh("");
			}
		}

		list8.add(fb7);
		return list8;
	}
}
