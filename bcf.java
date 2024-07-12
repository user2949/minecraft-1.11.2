import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class bcf {
	private static final Set<kq> aD = Sets.newHashSet();
	private static final Set<kq> aE = Collections.unmodifiableSet(aD);
	public static final kq a = a("empty");
	public static final kq b = a("chests/spawn_bonus_chest");
	public static final kq c = a("chests/end_city_treasure");
	public static final kq d = a("chests/simple_dungeon");
	public static final kq e = a("chests/village_blacksmith");
	public static final kq f = a("chests/abandoned_mineshaft");
	public static final kq g = a("chests/nether_bridge");
	public static final kq h = a("chests/stronghold_library");
	public static final kq i = a("chests/stronghold_crossing");
	public static final kq j = a("chests/stronghold_corridor");
	public static final kq k = a("chests/desert_pyramid");
	public static final kq l = a("chests/jungle_temple");
	public static final kq m = a("chests/jungle_temple_dispenser");
	public static final kq n = a("chests/igloo_chest");
	public static final kq o = a("chests/woodland_mansion");
	public static final kq p = a("entities/witch");
	public static final kq q = a("entities/blaze");
	public static final kq r = a("entities/creeper");
	public static final kq s = a("entities/spider");
	public static final kq t = a("entities/cave_spider");
	public static final kq u = a("entities/giant");
	public static final kq v = a("entities/silverfish");
	public static final kq w = a("entities/enderman");
	public static final kq x = a("entities/guardian");
	public static final kq y = a("entities/elder_guardian");
	public static final kq z = a("entities/shulker");
	public static final kq A = a("entities/iron_golem");
	public static final kq B = a("entities/snowman");
	public static final kq C = a("entities/rabbit");
	public static final kq D = a("entities/chicken");
	public static final kq E = a("entities/pig");
	public static final kq F = a("entities/polar_bear");
	public static final kq G = a("entities/horse");
	public static final kq H = a("entities/donkey");
	public static final kq I = a("entities/mule");
	public static final kq J = a("entities/zombie_horse");
	public static final kq K = a("entities/skeleton_horse");
	public static final kq L = a("entities/cow");
	public static final kq M = a("entities/mushroom_cow");
	public static final kq N = a("entities/wolf");
	public static final kq O = a("entities/ocelot");
	public static final kq P = a("entities/sheep");
	public static final kq Q = a("entities/sheep/white");
	public static final kq R = a("entities/sheep/orange");
	public static final kq S = a("entities/sheep/magenta");
	public static final kq T = a("entities/sheep/light_blue");
	public static final kq U = a("entities/sheep/yellow");
	public static final kq V = a("entities/sheep/lime");
	public static final kq W = a("entities/sheep/pink");
	public static final kq X = a("entities/sheep/gray");
	public static final kq Y = a("entities/sheep/silver");
	public static final kq Z = a("entities/sheep/cyan");
	public static final kq aa = a("entities/sheep/purple");
	public static final kq ab = a("entities/sheep/blue");
	public static final kq ac = a("entities/sheep/brown");
	public static final kq ad = a("entities/sheep/green");
	public static final kq ae = a("entities/sheep/red");
	public static final kq af = a("entities/sheep/black");
	public static final kq ag = a("entities/bat");
	public static final kq ah = a("entities/slime");
	public static final kq ai = a("entities/magma_cube");
	public static final kq aj = a("entities/ghast");
	public static final kq ak = a("entities/squid");
	public static final kq al = a("entities/endermite");
	public static final kq am = a("entities/zombie");
	public static final kq an = a("entities/zombie_pigman");
	public static final kq ao = a("entities/skeleton");
	public static final kq ap = a("entities/wither_skeleton");
	public static final kq aq = a("entities/stray");
	public static final kq ar = a("entities/husk");
	public static final kq as = a("entities/zombie_villager");
	public static final kq at = a("entities/villager");
	public static final kq au = a("entities/evocation_illager");
	public static final kq av = a("entities/vindication_illager");
	public static final kq aw = a("entities/llama");
	public static final kq ax = a("entities/vex");
	public static final kq ay = a("entities/ender_dragon");
	public static final kq az = a("gameplay/fishing");
	public static final kq aA = a("gameplay/fishing/junk");
	public static final kq aB = a("gameplay/fishing/treasure");
	public static final kq aC = a("gameplay/fishing/fish");

	private static kq a(String string) {
		return a(new kq("minecraft", string));
	}

	public static kq a(kq kq) {
		if (aD.add(kq)) {
			return kq;
		} else {
			throw new IllegalArgumentException(kq + " is already a registered built-in loot table");
		}
	}

	public static Set<kq> a() {
		return aE;
	}
}
