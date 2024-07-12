public class pl implements pd {
	@Override
	public int a() {
		return 107;
	}

	@Override
	public du a(du du) {
		if (!"MobSpawner".equals(du.l("id"))) {
			return du;
		} else {
			if (du.b("EntityId", 8)) {
				String string3 = du.l("EntityId");
				du du4 = du.o("SpawnData");
				du4.a("id", string3.isEmpty() ? "Pig" : string3);
				du.a("SpawnData", du4);
				du.q("EntityId");
			}

			if (du.b("SpawnPotentials", 9)) {
				ea ea3 = du.c("SpawnPotentials", 10);

				for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
					du du5 = ea3.b(integer4);
					if (du5.b("Type", 8)) {
						du du6 = du5.o("Properties");
						du6.a("id", du5.l("Type"));
						du5.a("Entity", du6);
						du5.q("Type");
						du5.q("Properties");
					}
				}
			}

			return du;
		}
	}
}
