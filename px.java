public class px implements pd {
	@Override
	public int a() {
		return 113;
	}

	@Override
	public du a(du du) {
		if (du.b("HandDropChances", 9)) {
			ea ea3 = du.c("HandDropChances", 5);
			if (ea3.c() == 2 && ea3.f(0) == 0.0F && ea3.f(1) == 0.0F) {
				du.q("HandDropChances");
			}
		}

		if (du.b("ArmorDropChances", 9)) {
			ea ea3 = du.c("ArmorDropChances", 5);
			if (ea3.c() == 4 && ea3.f(0) == 0.0F && ea3.f(1) == 0.0F && ea3.f(2) == 0.0F && ea3.f(3) == 0.0F) {
				du.q("ArmorDropChances");
			}
		}

		return du;
	}
}
