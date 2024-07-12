import com.google.common.collect.Sets;
import java.util.Set;

public class pr implements pd {
	private static final Set<String> a = Sets.newHashSet(
		new String[]{
			"ArmorStand",
			"Bat",
			"Blaze",
			"CaveSpider",
			"Chicken",
			"Cow",
			"Creeper",
			"EnderDragon",
			"Enderman",
			"Endermite",
			"EntityHorse",
			"Ghast",
			"Giant",
			"Guardian",
			"LavaSlime",
			"MushroomCow",
			"Ozelot",
			"Pig",
			"PigZombie",
			"Rabbit",
			"Sheep",
			"Shulker",
			"Silverfish",
			"Skeleton",
			"Slime",
			"SnowMan",
			"Spider",
			"Squid",
			"Villager",
			"VillagerGolem",
			"Witch",
			"WitherBoss",
			"Wolf",
			"Zombie"
		}
	);

	@Override
	public int a() {
		return 109;
	}

	@Override
	public du a(du du) {
		if (a.contains(du.l("id"))) {
			float float3;
			if (du.b("HealF", 99)) {
				float3 = du.j("HealF");
				du.q("HealF");
			} else {
				if (!du.b("Health", 99)) {
					return du;
				}

				float3 = du.j("Health");
			}

			du.a("Health", float3);
		}

		return du;
	}
}
