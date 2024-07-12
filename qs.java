import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class qs implements pj {
	private static final Logger a = LogManager.getLogger();
	private static final Map<String, String> b = Maps.newHashMap();
	private static final Map<String, String> c = Maps.newHashMap();

	@Nullable
	private static String a(int integer, String string) {
		return integer < 515 ? (String)b.get(new kq(string).toString()) : (String)c.get(new kq(string).toString());
	}

	@Override
	public du a(pg pg, du du, int integer) {
		if (!du.b("tag", 10)) {
			return du;
		} else {
			du du5 = du.o("tag");
			if (du5.b("BlockEntityTag", 10)) {
				du du6 = du5.o("BlockEntityTag");
				String string7 = du.l("id");
				String string8 = a(integer, string7);
				boolean boolean9;
				if (string8 == null) {
					a.warn("Unable to resolve BlockEntity for ItemInstance: {}", new Object[]{string7});
					boolean9 = false;
				} else {
					boolean9 = !du6.e("id");
					du6.a("id", string8);
				}

				pg.a(pf.BLOCK_ENTITY, du6, integer);
				if (boolean9) {
					du6.q("id");
				}
			}

			return du;
		}
	}

	static {
		Map<String, String> map1 = b;
		map1.put("minecraft:furnace", "Furnace");
		map1.put("minecraft:lit_furnace", "Furnace");
		map1.put("minecraft:chest", "Chest");
		map1.put("minecraft:trapped_chest", "Chest");
		map1.put("minecraft:ender_chest", "EnderChest");
		map1.put("minecraft:jukebox", "RecordPlayer");
		map1.put("minecraft:dispenser", "Trap");
		map1.put("minecraft:dropper", "Dropper");
		map1.put("minecraft:sign", "Sign");
		map1.put("minecraft:mob_spawner", "MobSpawner");
		map1.put("minecraft:noteblock", "Music");
		map1.put("minecraft:brewing_stand", "Cauldron");
		map1.put("minecraft:enhanting_table", "EnchantTable");
		map1.put("minecraft:command_block", "CommandBlock");
		map1.put("minecraft:beacon", "Beacon");
		map1.put("minecraft:skull", "Skull");
		map1.put("minecraft:daylight_detector", "DLDetector");
		map1.put("minecraft:hopper", "Hopper");
		map1.put("minecraft:banner", "Banner");
		map1.put("minecraft:flower_pot", "FlowerPot");
		map1.put("minecraft:repeating_command_block", "CommandBlock");
		map1.put("minecraft:chain_command_block", "CommandBlock");
		map1.put("minecraft:standing_sign", "Sign");
		map1.put("minecraft:wall_sign", "Sign");
		map1.put("minecraft:piston_head", "Piston");
		map1.put("minecraft:daylight_detector_inverted", "DLDetector");
		map1.put("minecraft:unpowered_comparator", "Comparator");
		map1.put("minecraft:powered_comparator", "Comparator");
		map1.put("minecraft:wall_banner", "Banner");
		map1.put("minecraft:standing_banner", "Banner");
		map1.put("minecraft:structure_block", "Structure");
		map1.put("minecraft:end_portal", "Airportal");
		map1.put("minecraft:end_gateway", "EndGateway");
		map1.put("minecraft:shield", "Shield");
		map1 = c;
		map1.put("minecraft:furnace", "minecraft:furnace");
		map1.put("minecraft:lit_furnace", "minecraft:furnace");
		map1.put("minecraft:chest", "minecraft:chest");
		map1.put("minecraft:trapped_chest", "minecraft:chest");
		map1.put("minecraft:ender_chest", "minecraft:enderchest");
		map1.put("minecraft:jukebox", "minecraft:jukebox");
		map1.put("minecraft:dispenser", "minecraft:dispenser");
		map1.put("minecraft:dropper", "minecraft:dropper");
		map1.put("minecraft:sign", "minecraft:sign");
		map1.put("minecraft:mob_spawner", "minecraft:mob_spawner");
		map1.put("minecraft:noteblock", "minecraft:noteblock");
		map1.put("minecraft:brewing_stand", "minecraft:brewing_stand");
		map1.put("minecraft:enhanting_table", "minecraft:enchanting_table");
		map1.put("minecraft:command_block", "minecraft:command_block");
		map1.put("minecraft:beacon", "minecraft:beacon");
		map1.put("minecraft:skull", "minecraft:skull");
		map1.put("minecraft:daylight_detector", "minecraft:daylight_detector");
		map1.put("minecraft:hopper", "minecraft:hopper");
		map1.put("minecraft:banner", "minecraft:banner");
		map1.put("minecraft:flower_pot", "minecraft:flower_pot");
		map1.put("minecraft:repeating_command_block", "minecraft:command_block");
		map1.put("minecraft:chain_command_block", "minecraft:command_block");
		map1.put("minecraft:shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:white_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:orange_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:magenta_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:light_blue_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:yellow_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:lime_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:pink_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:gray_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:silver_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:cyan_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:purple_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:blue_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:brown_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:green_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:red_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:black_shulker_box", "minecraft:shulker_box");
		map1.put("minecraft:standing_sign", "minecraft:sign");
		map1.put("minecraft:wall_sign", "minecraft:sign");
		map1.put("minecraft:piston_head", "minecraft:piston");
		map1.put("minecraft:daylight_detector_inverted", "minecraft:daylight_detector");
		map1.put("minecraft:unpowered_comparator", "minecraft:comparator");
		map1.put("minecraft:powered_comparator", "minecraft:comparator");
		map1.put("minecraft:wall_banner", "minecraft:banner");
		map1.put("minecraft:standing_banner", "minecraft:banner");
		map1.put("minecraft:structure_block", "minecraft:structure_block");
		map1.put("minecraft:end_portal", "minecraft:end_portal");
		map1.put("minecraft:end_gateway", "minecraft:end_gateway");
		map1.put("minecraft:shield", "minecraft:shield");
	}
}
