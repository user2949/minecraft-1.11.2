import com.google.common.collect.Maps;
import java.util.Map;

public class pk implements pd {
	private static final Map<String, String> a = Maps.newHashMap();

	@Override
	public int a() {
		return 704;
	}

	@Override
	public du a(du du) {
		String string3 = (String)a.get(du.l("id"));
		if (string3 != null) {
			du.a("id", string3);
		}

		return du;
	}

	static {
		a.put("Airportal", "minecraft:end_portal");
		a.put("Banner", "minecraft:banner");
		a.put("Beacon", "minecraft:beacon");
		a.put("Cauldron", "minecraft:brewing_stand");
		a.put("Chest", "minecraft:chest");
		a.put("Comparator", "minecraft:comparator");
		a.put("Control", "minecraft:command_block");
		a.put("DLDetector", "minecraft:daylight_detector");
		a.put("Dropper", "minecraft:dropper");
		a.put("EnchantTable", "minecraft:enchanting_table");
		a.put("EndGateway", "minecraft:end_gateway");
		a.put("EnderChest", "minecraft:ender_chest");
		a.put("FlowerPot", "minecraft:flower_pot");
		a.put("Furnace", "minecraft:furnace");
		a.put("Hopper", "minecraft:hopper");
		a.put("MobSpawner", "minecraft:mob_spawner");
		a.put("Music", "minecraft:noteblock");
		a.put("Piston", "minecraft:piston");
		a.put("RecordPlayer", "minecraft:jukebox");
		a.put("Sign", "minecraft:sign");
		a.put("Skull", "minecraft:skull");
		a.put("Structure", "minecraft:structure_block");
		a.put("Trap", "minecraft:dispenser");
	}
}
