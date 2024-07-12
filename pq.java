public class pq implements pd {
	@Override
	public int a() {
		return 100;
	}

	@Override
	public du a(du du) {
		ea ea3 = du.c("Equipment", 10);
		if (!ea3.b_() && !du.b("HandItems", 10)) {
			ea ea4 = new ea();
			ea4.a(ea3.h(0));
			ea4.a(new du());
			du.a("HandItems", ea4);
		}

		if (ea3.c() > 1 && !du.b("ArmorItem", 10)) {
			ea ea4 = new ea();
			ea4.a(ea3.b(1));
			ea4.a(ea3.b(2));
			ea4.a(ea3.b(3));
			ea4.a(ea3.b(4));
			du.a("ArmorItems", ea4);
		}

		du.q("Equipment");
		if (du.b("DropChances", 9)) {
			ea ea4 = du.c("DropChances", 5);
			if (!du.b("HandDropChances", 10)) {
				ea ea5 = new ea();
				ea5.a(new dx(ea4.f(0)));
				ea5.a(new dx(0.0F));
				du.a("HandDropChances", ea5);
			}

			if (!du.b("ArmorDropChances", 10)) {
				ea ea5 = new ea();
				ea5.a(new dx(ea4.f(1)));
				ea5.a(new dx(ea4.f(2)));
				ea5.a(new dx(ea4.f(3)));
				ea5.a(new dx(ea4.f(4)));
				du.a("ArmorDropChances", ea5);
			}

			du.q("DropChances");
		}

		return du;
	}
}
