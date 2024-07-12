public class qe implements pd {
	@Override
	public int a() {
		return 804;
	}

	@Override
	public du a(du du) {
		if ("minecraft:banner".equals(du.l("id")) && du.b("tag", 10)) {
			du du3 = du.o("tag");
			if (du3.b("BlockEntityTag", 10)) {
				du du4 = du3.o("BlockEntityTag");
				if (du4.b("Base", 99)) {
					du.a("Damage", (short)(du4.g("Base") & 15));
					if (du3.b("display", 10)) {
						du du5 = du3.o("display");
						if (du5.b("Lore", 9)) {
							ea ea6 = du5.c("Lore", 8);
							if (ea6.c() == 1 && "(+NBT)".equals(ea6.g(0))) {
								return du;
							}
						}
					}

					du4.q("Base");
					if (du4.b_()) {
						du3.q("BlockEntityTag");
					}

					if (du3.b_()) {
						du.q("tag");
					}
				}
			}
		}

		return du;
	}
}
