public class qc implements pd {
	@Override
	public int a() {
		return 702;
	}

	@Override
	public du a(du du) {
		if ("Zombie".equals(du.l("id"))) {
			int integer3 = du.h("ZombieType");
			switch (integer3) {
				case 0:
				default:
					break;
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					du.a("id", "ZombieVillager");
					du.a("Profession", integer3 - 1);
					break;
				case 6:
					du.a("id", "Husk");
			}

			du.q("ZombieType");
		}

		return du;
	}
}
