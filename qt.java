import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class qt implements pj {
	private static final Logger a = LogManager.getLogger();

	@Override
	public du a(pg pg, du du, int integer) {
		du du5 = du.o("tag");
		if (du5.b("EntityTag", 10)) {
			du du6 = du5.o("EntityTag");
			String string7 = du.l("id");
			String string8;
			if ("minecraft:armor_stand".equals(string7)) {
				string8 = integer < 515 ? "ArmorStand" : "minecraft:armor_stand";
			} else {
				if (!"minecraft:spawn_egg".equals(string7)) {
					return du;
				}

				string8 = du6.l("id");
			}

			boolean boolean9;
			if (string8 == null) {
				a.warn("Unable to resolve Entity for ItemInstance: {}", new Object[]{string7});
				boolean9 = false;
			} else {
				boolean9 = !du6.b("id", 8);
				du6.a("id", string8);
			}

			pg.a(pf.ENTITY, du6, integer);
			if (boolean9) {
				du6.q("id");
			}
		}

		return du;
	}
}
