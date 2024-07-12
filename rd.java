import java.util.List;

public class rd {
	public static afj a(List<afj> list, int integer2, int integer3) {
		return integer2 >= 0 && integer2 < list.size() && !((afj)list.get(integer2)).b() && integer3 > 0 ? ((afj)list.get(integer2)).a(integer3) : afj.a;
	}

	public static afj a(List<afj> list, int integer) {
		return integer >= 0 && integer < list.size() ? (afj)list.set(integer, afj.a) : afj.a;
	}

	public static du a(du du, dd<afj> dd) {
		return a(du, dd, true);
	}

	public static du a(du du, dd<afj> dd, boolean boolean3) {
		ea ea4 = new ea();

		for (int integer5 = 0; integer5 < dd.size(); integer5++) {
			afj afj6 = dd.get(integer5);
			if (!afj6.b()) {
				du du7 = new du();
				du7.a("Slot", (byte)integer5);
				afj6.a(du7);
				ea4.a(du7);
			}
		}

		if (!ea4.b_() || boolean3) {
			du.a("Items", ea4);
		}

		return du;
	}

	public static void b(du du, dd<afj> dd) {
		ea ea3 = du.c("Items", 10);

		for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
			du du5 = ea3.b(integer4);
			int integer6 = du5.f("Slot") & 255;
			if (integer6 >= 0 && integer6 < dd.size()) {
				dd.set(integer6, new afj(du5));
			}
		}
	}
}
