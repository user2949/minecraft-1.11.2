public class qi implements pd {
	public static final String[] a = new String[]{
		"minecraft:white_shulker_box",
		"minecraft:orange_shulker_box",
		"minecraft:magenta_shulker_box",
		"minecraft:light_blue_shulker_box",
		"minecraft:yellow_shulker_box",
		"minecraft:lime_shulker_box",
		"minecraft:pink_shulker_box",
		"minecraft:gray_shulker_box",
		"minecraft:silver_shulker_box",
		"minecraft:cyan_shulker_box",
		"minecraft:purple_shulker_box",
		"minecraft:blue_shulker_box",
		"minecraft:brown_shulker_box",
		"minecraft:green_shulker_box",
		"minecraft:red_shulker_box",
		"minecraft:black_shulker_box"
	};

	@Override
	public int a() {
		return 813;
	}

	@Override
	public du a(du du) {
		if ("minecraft:shulker_box".equals(du.l("id")) && du.b("tag", 10)) {
			du du3 = du.o("tag");
			if (du3.b("BlockEntityTag", 10)) {
				du du4 = du3.o("BlockEntityTag");
				if (du4.c("Items", 10).b_()) {
					du4.q("Items");
				}

				int integer5 = du4.h("Color");
				du4.q("Color");
				if (du4.b_()) {
					du3.q("BlockEntityTag");
				}

				if (du3.b_()) {
					du.q("tag");
				}

				du.a("id", a[integer5 % 16]);
			}
		}

		return du;
	}
}
