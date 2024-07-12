import java.util.List;

public class fc {
	public static fb a(n n, fb fb, sn sn) throws cd {
		fb fb4;
		if (fb instanceof fe) {
			fe fe5 = (fe)fb;
			String string6 = fe5.g();
			if (p.b(string6)) {
				List<sn> list7 = p.b(n, string6, sn.class);
				if (list7.size() != 1) {
					throw new ce("commands.generic.selector.notFound", string6);
				}

				sn sn8 = (sn)list7.get(0);
				if (sn8 instanceof aay) {
					string6 = sn8.h_();
				} else {
					string6 = sn8.bf();
				}
			}

			String string7 = sn != null && string6.equals("*") ? sn.h_() : string6;
			fb4 = new fe(string7, fe5.h());
			((fe)fb4).b(fe5.e());
			((fe)fb4).a(n);
		} else if (fb instanceof ff) {
			String string5 = ((ff)fb).g();
			fb4 = p.b(n, string5);
			if (fb4 == null) {
				fb4 = new fh("");
			}
		} else if (fb instanceof fh) {
			fb4 = new fh(((fh)fb).g());
		} else {
			if (!(fb instanceof fi)) {
				return fb;
			}

			Object[] arr5 = ((fi)fb).j();

			for (int integer6 = 0; integer6 < arr5.length; integer6++) {
				Object object7 = arr5[integer6];
				if (object7 instanceof fb) {
					arr5[integer6] = a(n, (fb)object7, sn);
				}
			}

			fb4 = new fi(((fi)fb).i(), arr5);
		}

		fg fg5 = fb.b();
		if (fg5 != null) {
			fb4.a(fg5.m());
		}

		for (fb fb7 : fb.a()) {
			fb4.a(a(n, fb7, sn));
		}

		return fb4;
	}
}
