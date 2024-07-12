import com.google.gson.JsonParseException;

public class qm implements pd {
	@Override
	public int a() {
		return 165;
	}

	@Override
	public du a(du du) {
		if ("minecraft:written_book".equals(du.l("id"))) {
			du du3 = du.o("tag");
			if (du3.b("pages", 9)) {
				ea ea4 = du3.c("pages", 8);

				for (int integer5 = 0; integer5 < ea4.c(); integer5++) {
					String string6 = ea4.g(integer5);
					fb fb7 = null;
					if (!"null".equals(string6) && !oy.b(string6)) {
						if (string6.charAt(0) == '"' && string6.charAt(string6.length() - 1) == '"' || string6.charAt(0) == '{' && string6.charAt(string6.length() - 1) == '}') {
							try {
								fb7 = (fb)pn.a.fromJson(string6, fb.class);
								if (fb7 == null) {
									fb7 = new fh("");
								}
							} catch (JsonParseException var10) {
							}

							if (fb7 == null) {
								try {
									fb7 = fb.a.a(string6);
								} catch (JsonParseException var9) {
								}
							}

							if (fb7 == null) {
								try {
									fb7 = fb.a.b(string6);
								} catch (JsonParseException var8) {
								}
							}

							if (fb7 == null) {
								fb7 = new fh(string6);
							}
						} else {
							fb7 = new fh(string6);
						}
					} else {
						fb7 = new fh("");
					}

					ea4.a(integer5, new eh(fb.a.a(fb7)));
				}

				du3.a("pages", ea4);
			}
		}

		return du;
	}
}
