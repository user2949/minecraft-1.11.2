import java.util.Random;

public class qd implements pd {
	private static final Random a = new Random();

	@Override
	public int a() {
		return 502;
	}

	@Override
	public du a(du du) {
		if ("Zombie".equals(du.l("id")) && du.p("IsVillager")) {
			if (!du.b("ZombieType", 99)) {
				int integer3 = -1;
				if (du.b("VillagerProfession", 99)) {
					try {
						integer3 = this.a(du.h("VillagerProfession"));
					} catch (RuntimeException var4) {
					}
				}

				if (integer3 == -1) {
					integer3 = this.a(a.nextInt(6));
				}

				du.a("ZombieType", integer3);
			}

			du.q("IsVillager");
		}

		return du;
	}

	private int a(int integer) {
		return integer >= 0 && integer < 6 ? integer : -1;
	}
}
