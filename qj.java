public class qj implements pd {
	private static final String[] a = new String[256];

	@Override
	public int a() {
		return 105;
	}

	@Override
	public du a(du du) {
		if ("minecraft:spawn_egg".equals(du.l("id"))) {
			du du3 = du.o("tag");
			du du4 = du3.o("EntityTag");
			short short5 = du.g("Damage");
			if (!du4.b("id", 8)) {
				String string6 = a[short5 & 255];
				if (string6 != null) {
					du4.a("id", string6);
					du3.a("EntityTag", du4);
					du.a("tag", du3);
				}
			}

			if (short5 != 0) {
				du.a("Damage", (short)0);
			}
		}

		return du;
	}

	static {
		String[] arr1 = a;
		arr1[1] = "Item";
		arr1[2] = "XPOrb";
		arr1[7] = "ThrownEgg";
		arr1[8] = "LeashKnot";
		arr1[9] = "Painting";
		arr1[10] = "Arrow";
		arr1[11] = "Snowball";
		arr1[12] = "Fireball";
		arr1[13] = "SmallFireball";
		arr1[14] = "ThrownEnderpearl";
		arr1[15] = "EyeOfEnderSignal";
		arr1[16] = "ThrownPotion";
		arr1[17] = "ThrownExpBottle";
		arr1[18] = "ItemFrame";
		arr1[19] = "WitherSkull";
		arr1[20] = "PrimedTnt";
		arr1[21] = "FallingSand";
		arr1[22] = "FireworksRocketEntity";
		arr1[23] = "TippedArrow";
		arr1[24] = "SpectralArrow";
		arr1[25] = "ShulkerBullet";
		arr1[26] = "DragonFireball";
		arr1[30] = "ArmorStand";
		arr1[41] = "Boat";
		arr1[42] = "MinecartRideable";
		arr1[43] = "MinecartChest";
		arr1[44] = "MinecartFurnace";
		arr1[45] = "MinecartTNT";
		arr1[46] = "MinecartHopper";
		arr1[47] = "MinecartSpawner";
		arr1[40] = "MinecartCommandBlock";
		arr1[48] = "Mob";
		arr1[49] = "Monster";
		arr1[50] = "Creeper";
		arr1[51] = "Skeleton";
		arr1[52] = "Spider";
		arr1[53] = "Giant";
		arr1[54] = "Zombie";
		arr1[55] = "Slime";
		arr1[56] = "Ghast";
		arr1[57] = "PigZombie";
		arr1[58] = "Enderman";
		arr1[59] = "CaveSpider";
		arr1[60] = "Silverfish";
		arr1[61] = "Blaze";
		arr1[62] = "LavaSlime";
		arr1[63] = "EnderDragon";
		arr1[64] = "WitherBoss";
		arr1[65] = "Bat";
		arr1[66] = "Witch";
		arr1[67] = "Endermite";
		arr1[68] = "Guardian";
		arr1[69] = "Shulker";
		arr1[90] = "Pig";
		arr1[91] = "Sheep";
		arr1[92] = "Cow";
		arr1[93] = "Chicken";
		arr1[94] = "Squid";
		arr1[95] = "Wolf";
		arr1[96] = "MushroomCow";
		arr1[97] = "SnowMan";
		arr1[98] = "Ozelot";
		arr1[99] = "VillagerGolem";
		arr1[100] = "EntityHorse";
		arr1[101] = "Rabbit";
		arr1[120] = "Villager";
		arr1[200] = "EnderCrystal";
	}
}
