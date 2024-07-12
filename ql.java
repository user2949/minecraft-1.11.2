public class ql implements pd {
	@Override
	public int a() {
		return 806;
	}

	@Override
	public du a(du du) {
		String string3 = du.l("id");
		if ("minecraft:potion".equals(string3)
			|| "minecraft:splash_potion".equals(string3)
			|| "minecraft:lingering_potion".equals(string3)
			|| "minecraft:tipped_arrow".equals(string3)) {
			du du4 = du.o("tag");
			if (!du4.b("Potion", 8)) {
				du4.a("Potion", "minecraft:water");
			}

			if (!du.b("tag", 10)) {
				du.a("tag", du4);
			}
		}

		return du;
	}
}
