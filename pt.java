public class pt implements pd {
	@Override
	public int a() {
		return 703;
	}

	@Override
	public du a(du du) {
		if ("EntityHorse".equals(du.l("id"))) {
			int integer3 = du.h("Type");
			switch (integer3) {
				case 0:
				default:
					du.a("id", "Horse");
					break;
				case 1:
					du.a("id", "Donkey");
					break;
				case 2:
					du.a("id", "Mule");
					break;
				case 3:
					du.a("id", "ZombieHorse");
					break;
				case 4:
					du.a("id", "SkeletonHorse");
			}

			du.q("Type");
		}

		return du;
	}
}
