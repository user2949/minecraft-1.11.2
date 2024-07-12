import java.util.List;

public class agx extends afh {
	public agx() {
		this.d(1);
	}

	public static boolean b(du du) {
		if (!agw.b(du)) {
			return false;
		} else if (!du.b("title", 8)) {
			return false;
		} else {
			String string2 = du.l("title");
			return string2 != null && string2.length() <= 32 ? du.b("author", 8) : false;
		}
	}

	public static int h(afj afj) {
		return afj.p().h("generation");
	}

	@Override
	public String b(afj afj) {
		if (afj.o()) {
			du du3 = afj.p();
			String string4 = du3.l("title");
			if (!oy.b(string4)) {
				return string4;
			}
		}

		return super.b(afj);
	}

	@Override
	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
		if (afj.o()) {
			du du6 = afj.p();
			String string7 = du6.l("author");
			if (!oy.b(string7)) {
				list.add(a.GRAY + dp.a("book.byAuthor", string7));
			}

			list.add(a.GRAY + dp.a("book.generation." + du6.h("generation")));
		}
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		if (!ajs.E) {
			this.a(afj5, aay);
		}

		aay.a(afj5, ri);
		aay.b(oa.b(this));
		return new rl<>(rk.SUCCESS, afj5);
	}

	private void a(afj afj, aay aay) {
		if (afj.p() != null) {
			du du4 = afj.p();
			if (!du4.p("resolved")) {
				du4.a("resolved", true);
				if (b(du4)) {
					ea ea5 = du4.c("pages", 8);

					for (int integer6 = 0; integer6 < ea5.c(); integer6++) {
						String string7 = ea5.g(integer6);

						fb fb8;
						try {
							fb8 = fb.a.b(string7);
							fb8 = fc.a(aay, fb8, aay);
						} catch (Exception var9) {
							fb8 = new fh(string7);
						}

						ea5.a(integer6, new eh(fb.a.a(fb8)));
					}

					du4.a("pages", ea5);
					if (aay instanceof ly && aay.cg() == afj) {
						adl adl6 = aay.bu.a(aay.bs, aay.bs.d);
						((ly)aay).a.a(new gm(0, adl6.e, afj));
					}
				}
			}
		}
	}

	@Override
	public boolean f_(afj afj) {
		return true;
	}
}
