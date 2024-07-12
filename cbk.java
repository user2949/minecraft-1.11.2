import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cbk {
	private static final Set<kq> b = Sets.newHashSet(
		new kq[]{
			new kq("blocks/water_flow"),
			new kq("blocks/water_still"),
			new kq("blocks/lava_flow"),
			new kq("blocks/lava_still"),
			new kq("blocks/water_overlay"),
			new kq("blocks/destroy_stage_0"),
			new kq("blocks/destroy_stage_1"),
			new kq("blocks/destroy_stage_2"),
			new kq("blocks/destroy_stage_3"),
			new kq("blocks/destroy_stage_4"),
			new kq("blocks/destroy_stage_5"),
			new kq("blocks/destroy_stage_6"),
			new kq("blocks/destroy_stage_7"),
			new kq("blocks/destroy_stage_8"),
			new kq("blocks/destroy_stage_9"),
			new kq("items/empty_armor_slot_helmet"),
			new kq("items/empty_armor_slot_chestplate"),
			new kq("items/empty_armor_slot_leggings"),
			new kq("items/empty_armor_slot_boots"),
			new kq("items/empty_armor_slot_shield"),
			new kq("blocks/shulker_top_white"),
			new kq("blocks/shulker_top_orange"),
			new kq("blocks/shulker_top_magenta"),
			new kq("blocks/shulker_top_light_blue"),
			new kq("blocks/shulker_top_yellow"),
			new kq("blocks/shulker_top_lime"),
			new kq("blocks/shulker_top_pink"),
			new kq("blocks/shulker_top_gray"),
			new kq("blocks/shulker_top_silver"),
			new kq("blocks/shulker_top_cyan"),
			new kq("blocks/shulker_top_purple"),
			new kq("blocks/shulker_top_blue"),
			new kq("blocks/shulker_top_brown"),
			new kq("blocks/shulker_top_green"),
			new kq("blocks/shulker_top_red"),
			new kq("blocks/shulker_top_black")
		}
	);
	private static final Logger c = LogManager.getLogger();
	protected static final cbm a = new cbm("builtin/missing", "missing");
	private static final String d = "{    'textures': {       'particle': 'missingno',       'missingno': 'missingno'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}"
		.replaceAll("'", "\"");
	private static final Map<String, String> e = Maps.newHashMap();
	private static final Joiner f = Joiner.on(" -> ");
	private final bzy g;
	private final Map<kq, byz> h = Maps.newHashMap();
	private final Map<kq, bri> i = Maps.newLinkedHashMap();
	private final Map<cbm, brr> j = Maps.newLinkedHashMap();
	private final Map<brj, Collection<cbm>> k = Maps.newLinkedHashMap();
	private final byy l;
	private final bqz m;
	private final brl n = new brl();
	private final brm o = new brm();
	private final dj<cbm, cbh> p = new dj<>();
	private static final String q = "{    'elements': [        {   'from': [0, 0, 0],            'to': [16, 16, 16],            'faces': {                'down': {'uv': [0, 0, 16, 16], 'texture': '' }            }        }    ]}"
		.replaceAll("'", "\"");
	private static final bri r = bri.a(q);
	private static final bri s = bri.a(q);
	private final Map<String, kq> t = Maps.newLinkedHashMap();
	private final Map<kq, brj> u = Maps.newHashMap();
	private final Map<afh, List<String>> v = Maps.newIdentityHashMap();

	public cbk(bzy bzy, byy byy, bqz bqz) {
		this.g = bzy;
		this.l = byy;
		this.m = bqz;
	}

	public dh<cbm, cbh> a() {
		this.b();
		this.c();
		this.l();
		this.n();
		this.p();
		this.i();
		this.j();
		return this.p;
	}

	private void b() {
		bsd bsd2 = this.m.a();

		for (alu alu4 : alu.h) {
			for (final kq kq6 : bsd2.a(alu4)) {
				try {
					brj brj7 = this.a(kq6);
					Map<atl, cbm> map8 = bsd2.b(alu4);
					if (brj7.b()) {
						Collection<cbm> collection9 = Sets.newHashSet(map8.values());
						brj7.c().a(alu4.s());
						Collection<cbm> collection10 = (Collection<cbm>)this.k.get(brj7);
						if (collection10 == null) {
							collection10 = Lists.newArrayList();
							this.k.put(brj7, collection10);
						}

						collection10.addAll(Lists.newArrayList(Iterables.filter(collection9, new Predicate<cbm>() {
							public boolean apply(@Nullable cbm cbm) {
								return kq6.equals(cbm);
							}
						})));
					}

					for (Entry<atl, cbm> entry10 : map8.entrySet()) {
						cbm cbm11 = (cbm)entry10.getValue();
						if (kq6.equals(cbm11)) {
							try {
								this.j.put(cbm11, brj7.c(cbm11.c()));
							} catch (RuntimeException var12) {
								if (!brj7.b()) {
									c.warn("Unable to load variant: {} from {}", new Object[]{cbm11.c(), cbm11});
								}
							}
						}
					}
				} catch (Exception var13) {
					c.warn("Unable to load definition {}", new Object[]{kq6, var13});
				}
			}
		}
	}

	private void c() {
		this.j.put(a, new brr(Lists.newArrayList(new brs[]{new brs(new kq(a.a()), cbi.X0_Y0, false, 1)})));
		this.d();
		this.e();
		this.f();
		this.g();
	}

	private void d() {
		kq kq2 = new kq("item_frame");
		brj brj3 = this.a(kq2);
		this.a(brj3, new cbm(kq2, "normal"));
		this.a(brj3, new cbm(kq2, "map"));
	}

	private void a(brj brj, cbm cbm) {
		try {
			this.j.put(cbm, brj.c(cbm.c()));
		} catch (RuntimeException var4) {
			if (!brj.b()) {
				c.warn("Unable to load variant: {} from {}", new Object[]{cbm.c(), cbm});
			}
		}
	}

	private brj a(kq kq) {
		kq kq3 = this.b(kq);
		brj brj4 = (brj)this.u.get(kq3);
		if (brj4 == null) {
			brj4 = this.a(kq, kq3);
			this.u.put(kq3, brj4);
		}

		return brj4;
	}

	private brj a(kq kq1, kq kq2) {
		List<brj> list4 = Lists.newArrayList();

		try {
			for (bzx bzx6 : this.g.b(kq2)) {
				list4.add(this.a(kq1, bzx6));
			}
		} catch (IOException var6) {
			throw new RuntimeException("Encountered an exception when loading model definition of model " + kq2, var6);
		}

		return new brj(list4);
	}

	private brj a(kq kq, bzx bzx) {
		InputStream inputStream4 = null;

		brj exception5;
		try {
			inputStream4 = bzx.b();
			exception5 = brj.a(new InputStreamReader(inputStream4, Charsets.UTF_8));
		} catch (Exception var8) {
			throw new RuntimeException(
				"Encountered an exception when loading model definition of '" + kq + "' from: '" + bzx.a() + "' in resourcepack: '" + bzx.d() + "'", var8
			);
		} finally {
			IOUtils.closeQuietly(inputStream4);
		}

		return exception5;
	}

	private kq b(kq kq) {
		return new kq(kq.b(), "blockstates/" + kq.a() + ".json");
	}

	private void e() {
		for (Entry<cbm, brr> entry3 : this.j.entrySet()) {
			this.a((cbm)entry3.getKey(), (brr)entry3.getValue());
		}
	}

	private void f() {
		for (Entry<brj, Collection<cbm>> entry3 : this.k.entrySet()) {
			cbm cbm4 = (cbm)((Collection)entry3.getValue()).iterator().next();

			for (brr brr6 : ((brj)entry3.getKey()).a()) {
				this.a(cbm4, brr6);
			}
		}
	}

	private void a(cbm cbm, brr brr) {
		for (brs brs5 : brr.a()) {
			kq kq6 = brs5.a();
			if (this.i.get(kq6) == null) {
				try {
					this.i.put(kq6, this.c(kq6));
				} catch (Exception var7) {
					c.warn("Unable to load block model: '{}' for variant: '{}': {} ", new Object[]{kq6, cbm, var7});
				}
			}
		}
	}

	private bri c(kq kq) throws IOException {
		Reader reader3 = null;
		bzx bzx4 = null;

		bri bri6;
		try {
			String string5 = kq.a();
			if ("builtin/generated".equals(string5)) {
				return r;
			}

			if (!"builtin/entity".equals(string5)) {
				if (string5.startsWith("builtin/")) {
					String string6 = string5.substring("builtin/".length());
					String string7 = (String)e.get(string6);
					if (string7 == null) {
						throw new FileNotFoundException(kq.toString());
					}

					reader3 = new StringReader(string7);
				} else {
					bzx4 = this.g.a(this.d(kq));
					reader3 = new InputStreamReader(bzx4.b(), Charsets.UTF_8);
				}

				bri6 = bri.a(reader3);
				bri6.b = kq.toString();
				return bri6;
			}

			bri6 = s;
		} finally {
			IOUtils.closeQuietly(reader3);
			IOUtils.closeQuietly(bzx4);
		}

		return bri6;
	}

	private kq d(kq kq) {
		return new kq(kq.b(), "models/" + kq.a() + ".json");
	}

	private void g() {
		this.h();

		for (afh afh3 : afh.g) {
			for (String string6 : this.a(afh3)) {
				kq kq7 = this.a(string6);
				kq kq8 = afh.g.b(afh3);
				this.a(string6, kq7, kq8);
				if (afh3.j()) {
					bri bri9 = (bri)this.i.get(kq7);
					if (bri9 != null) {
						for (kq kq11 : bri9.e()) {
							this.a(kq11.toString(), kq11, kq8);
						}
					}
				}
			}
		}
	}

	private void a(String string, kq kq2, kq kq3) {
		this.t.put(string, kq2);
		if (this.i.get(kq2) == null) {
			try {
				bri bri5 = this.c(kq2);
				this.i.put(kq2, bri5);
			} catch (Exception var5) {
				c.warn("Unable to load item model: '{}' for item: '{}'", new Object[]{kq2, kq3, var5});
			}
		}
	}

	private void h() {
		this.v.put(afh.a(alv.b), Lists.newArrayList(new String[]{"stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth"}));
		this.v.put(afh.a(alv.d), Lists.newArrayList(new String[]{"dirt", "coarse_dirt", "podzol"}));
		this.v
			.put(afh.a(alv.f), Lists.newArrayList(new String[]{"oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks"}));
		this.v
			.put(
				afh.a(alv.g), Lists.newArrayList(new String[]{"oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling"})
			);
		this.v.put(afh.a(alv.m), Lists.newArrayList(new String[]{"sand", "red_sand"}));
		this.v.put(afh.a(alv.r), Lists.newArrayList(new String[]{"oak_log", "spruce_log", "birch_log", "jungle_log"}));
		this.v.put(afh.a(alv.t), Lists.newArrayList(new String[]{"oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves"}));
		this.v.put(afh.a(alv.v), Lists.newArrayList(new String[]{"sponge", "sponge_wet"}));
		this.v.put(afh.a(alv.A), Lists.newArrayList(new String[]{"sandstone", "chiseled_sandstone", "smooth_sandstone"}));
		this.v.put(afh.a(alv.cM), Lists.newArrayList(new String[]{"red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone"}));
		this.v.put(afh.a(alv.H), Lists.newArrayList(new String[]{"dead_bush", "tall_grass", "fern"}));
		this.v.put(afh.a(alv.I), Lists.newArrayList(new String[]{"dead_bush"}));
		this.v
			.put(
				afh.a(alv.L),
				Lists.newArrayList(
					new String[]{
						"black_wool",
						"red_wool",
						"green_wool",
						"brown_wool",
						"blue_wool",
						"purple_wool",
						"cyan_wool",
						"silver_wool",
						"gray_wool",
						"pink_wool",
						"lime_wool",
						"yellow_wool",
						"light_blue_wool",
						"magenta_wool",
						"orange_wool",
						"white_wool"
					}
				)
			);
		this.v.put(afh.a(alv.N), Lists.newArrayList(new String[]{"dandelion"}));
		this.v
			.put(
				afh.a(alv.O),
				Lists.newArrayList(new String[]{"poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy"})
			);
		this.v
			.put(
				afh.a(alv.U),
				Lists.newArrayList(new String[]{"stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab"})
			);
		this.v.put(afh.a(alv.cP), Lists.newArrayList(new String[]{"red_sandstone_slab"}));
		this.v
			.put(
				afh.a(alv.cG),
				Lists.newArrayList(
					new String[]{
						"black_stained_glass",
						"red_stained_glass",
						"green_stained_glass",
						"brown_stained_glass",
						"blue_stained_glass",
						"purple_stained_glass",
						"cyan_stained_glass",
						"silver_stained_glass",
						"gray_stained_glass",
						"pink_stained_glass",
						"lime_stained_glass",
						"yellow_stained_glass",
						"light_blue_stained_glass",
						"magenta_stained_glass",
						"orange_stained_glass",
						"white_stained_glass"
					}
				)
			);
		this.v
			.put(
				afh.a(alv.be),
				Lists.newArrayList(
					new String[]{
						"stone_monster_egg",
						"cobblestone_monster_egg",
						"stone_brick_monster_egg",
						"mossy_brick_monster_egg",
						"cracked_brick_monster_egg",
						"chiseled_brick_monster_egg"
					}
				)
			);
		this.v.put(afh.a(alv.bf), Lists.newArrayList(new String[]{"stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick"}));
		this.v.put(afh.a(alv.bM), Lists.newArrayList(new String[]{"oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab"}));
		this.v.put(afh.a(alv.bZ), Lists.newArrayList(new String[]{"cobblestone_wall", "mossy_cobblestone_wall"}));
		this.v.put(afh.a(alv.cf), Lists.newArrayList(new String[]{"anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged"}));
		this.v.put(afh.a(alv.cq), Lists.newArrayList(new String[]{"quartz_block", "chiseled_quartz_block", "quartz_column"}));
		this.v
			.put(
				afh.a(alv.cu),
				Lists.newArrayList(
					new String[]{
						"black_stained_hardened_clay",
						"red_stained_hardened_clay",
						"green_stained_hardened_clay",
						"brown_stained_hardened_clay",
						"blue_stained_hardened_clay",
						"purple_stained_hardened_clay",
						"cyan_stained_hardened_clay",
						"silver_stained_hardened_clay",
						"gray_stained_hardened_clay",
						"pink_stained_hardened_clay",
						"lime_stained_hardened_clay",
						"yellow_stained_hardened_clay",
						"light_blue_stained_hardened_clay",
						"magenta_stained_hardened_clay",
						"orange_stained_hardened_clay",
						"white_stained_hardened_clay"
					}
				)
			);
		this.v
			.put(
				afh.a(alv.cH),
				Lists.newArrayList(
					new String[]{
						"black_stained_glass_pane",
						"red_stained_glass_pane",
						"green_stained_glass_pane",
						"brown_stained_glass_pane",
						"blue_stained_glass_pane",
						"purple_stained_glass_pane",
						"cyan_stained_glass_pane",
						"silver_stained_glass_pane",
						"gray_stained_glass_pane",
						"pink_stained_glass_pane",
						"lime_stained_glass_pane",
						"yellow_stained_glass_pane",
						"light_blue_stained_glass_pane",
						"magenta_stained_glass_pane",
						"orange_stained_glass_pane",
						"white_stained_glass_pane"
					}
				)
			);
		this.v.put(afh.a(alv.u), Lists.newArrayList(new String[]{"acacia_leaves", "dark_oak_leaves"}));
		this.v.put(afh.a(alv.s), Lists.newArrayList(new String[]{"acacia_log", "dark_oak_log"}));
		this.v.put(afh.a(alv.cI), Lists.newArrayList(new String[]{"prismarine", "prismarine_bricks", "dark_prismarine"}));
		this.v
			.put(
				afh.a(alv.cy),
				Lists.newArrayList(
					new String[]{
						"black_carpet",
						"red_carpet",
						"green_carpet",
						"brown_carpet",
						"blue_carpet",
						"purple_carpet",
						"cyan_carpet",
						"silver_carpet",
						"gray_carpet",
						"pink_carpet",
						"lime_carpet",
						"yellow_carpet",
						"light_blue_carpet",
						"magenta_carpet",
						"orange_carpet",
						"white_carpet"
					}
				)
			);
		this.v.put(afh.a(alv.cF), Lists.newArrayList(new String[]{"sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia"}));
		this.v.put(afl.k, Lists.newArrayList(new String[]{"coal", "charcoal"}));
		this.v.put(afl.bc, Lists.newArrayList(new String[]{"cod", "salmon", "clownfish", "pufferfish"}));
		this.v.put(afl.bd, Lists.newArrayList(new String[]{"cooked_cod", "cooked_salmon"}));
		this.v
			.put(
				afl.be,
				Lists.newArrayList(
					new String[]{
						"dye_black",
						"dye_red",
						"dye_green",
						"dye_brown",
						"dye_blue",
						"dye_purple",
						"dye_cyan",
						"dye_silver",
						"dye_gray",
						"dye_pink",
						"dye_lime",
						"dye_yellow",
						"dye_light_blue",
						"dye_magenta",
						"dye_orange",
						"dye_white"
					}
				)
			);
		this.v.put(afl.bH, Lists.newArrayList(new String[]{"bottle_drinkable"}));
		this.v.put(afl.ci, Lists.newArrayList(new String[]{"skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper", "skull_dragon"}));
		this.v.put(afl.bI, Lists.newArrayList(new String[]{"bottle_splash"}));
		this.v.put(afl.bJ, Lists.newArrayList(new String[]{"bottle_lingering"}));
		this.v.put(afh.a(alv.a), Collections.emptyList());
		this.v.put(afh.a(alv.bo), Lists.newArrayList(new String[]{"oak_fence_gate"}));
		this.v.put(afh.a(alv.aO), Lists.newArrayList(new String[]{"oak_fence"}));
		this.v.put(afl.at, Lists.newArrayList(new String[]{"oak_door"}));
		this.v.put(afl.aH, Lists.newArrayList(new String[]{"oak_boat"}));
		this.v.put(afl.cY, Lists.newArrayList(new String[]{"totem"}));
	}

	private List<String> a(afh afh) {
		List<String> list3 = (List<String>)this.v.get(afh);
		if (list3 == null) {
			list3 = Collections.singletonList(afh.g.b(afh).toString());
		}

		return list3;
	}

	private kq a(String string) {
		kq kq3 = new kq(string);
		return new kq(kq3.b(), "item/" + kq3.a());
	}

	private void i() {
		for (cbm cbm3 : this.j.keySet()) {
			cbh cbh4 = this.a((brr)this.j.get(cbm3), cbm3.toString());
			if (cbh4 != null) {
				this.p.a(cbm3, cbh4);
			}
		}

		for (Entry<brj, Collection<cbm>> entry3 : this.k.entrySet()) {
			brj brj4 = (brj)entry3.getKey();
			brw brw5 = brj4.c();
			String string6 = alu.h.b(brw5.c().c()).toString();
			cbn.a a7 = new cbn.a();

			for (bry bry9 : brw5.a()) {
				cbh cbh10 = this.a(bry9.a(), "selector of " + string6);
				if (cbh10 != null) {
					a7.a(bry9.a(brw5.c()), cbh10);
				}
			}

			cbh cbh8 = a7.a();

			for (cbm cbm10 : (Collection)entry3.getValue()) {
				if (!brj4.b(cbm10.c())) {
					this.p.a(cbm10, cbh8);
				}
			}
		}
	}

	@Nullable
	private cbh a(brr brr, String string) {
		if (brr.a().isEmpty()) {
			return null;
		} else {
			cbp.a a4 = new cbp.a();
			int integer5 = 0;

			for (brs brs7 : brr.a()) {
				bri bri8 = (bri)this.i.get(brs7.a());
				if (bri8 == null || !bri8.d()) {
					c.warn("Missing model for: {}", new Object[]{string});
				} else if (bri8.a().isEmpty()) {
					c.warn("Missing elements for: {}", new Object[]{string});
				} else {
					cbh cbh9 = this.a(bri8, brs7.b(), brs7.c());
					if (cbh9 != null) {
						integer5++;
						a4.a(cbh9, brs7.d());
					}
				}
			}

			cbh cbh6 = null;
			if (integer5 == 0) {
				c.warn("No weighted models for: {}", new Object[]{string});
			} else if (integer5 == 1) {
				cbh6 = a4.b();
			} else {
				cbh6 = a4.a();
			}

			return cbh6;
		}
	}

	private void j() {
		for (Entry<String, kq> entry3 : this.t.entrySet()) {
			kq kq4 = (kq)entry3.getValue();
			cbm cbm5 = new cbm((String)entry3.getKey(), "inventory");
			bri bri6 = (bri)this.i.get(kq4);
			if (bri6 == null || !bri6.d()) {
				c.warn("Missing model for: {}", new Object[]{kq4});
			} else if (bri6.a().isEmpty()) {
				c.warn("Missing elements for: {}", new Object[]{kq4});
			} else if (this.c(bri6)) {
				this.p.a(cbm5, new cbj(bri6.j(), bri6.g()));
			} else {
				cbh cbh7 = this.a(bri6, cbi.X0_Y0, false);
				if (cbh7 != null) {
					this.p.a(cbm5, cbh7);
				}
			}
		}
	}

	private Set<kq> k() {
		Set<kq> set2 = Sets.newHashSet();
		List<cbm> list3 = Lists.newArrayList(this.j.keySet());
		Collections.sort(list3, new Comparator<cbm>() {
			public int compare(cbm cbm1, cbm cbm2) {
				return cbm1.toString().compareTo(cbm2.toString());
			}
		});

		for (cbm cbm5 : list3) {
			brr brr6 = (brr)this.j.get(cbm5);

			for (brs brs8 : brr6.a()) {
				bri bri9 = (bri)this.i.get(brs8.a());
				if (bri9 == null) {
					c.warn("Missing model for: {}", new Object[]{cbm5});
				} else {
					set2.addAll(this.a(bri9));
				}
			}
		}

		for (brj brj5 : this.k.keySet()) {
			for (brr brr7 : brj5.c().b()) {
				for (brs brs9 : brr7.a()) {
					bri bri10 = (bri)this.i.get(brs9.a());
					if (bri10 == null) {
						c.warn("Missing model for: {}", new Object[]{alu.h.b(brj5.c().c().c())});
					} else {
						set2.addAll(this.a(bri10));
					}
				}
			}
		}

		set2.addAll(b);
		return set2;
	}

	@Nullable
	private cbh a(bri bri, cbi cbi, boolean boolean3) {
		byz byz5 = (byz)this.h.get(new kq(bri.c("particle")));
		cbo.a a6 = new cbo.a(bri, bri.g()).a(byz5);
		if (bri.a().isEmpty()) {
			return null;
		} else {
			for (bre bre8 : bri.a()) {
				for (cv cv10 : bre8.c.keySet()) {
					brf brf11 = (brf)bre8.c.get(cv10);
					byz byz12 = (byz)this.h.get(new kq(bri.c(brf11.d)));
					if (brf11.b == null) {
						a6.a(this.a(bre8, brf11, byz12, cv10, cbi, boolean3));
					} else {
						a6.a(cbi.a(brf11.b), this.a(bre8, brf11, byz12, cv10, cbi, boolean3));
					}
				}
			}

			return a6.b();
		}
	}

	private brd a(bre bre, brf brf, byz byz, cv cv, cbi cbi, boolean boolean6) {
		return this.n.a(bre.a, bre.b, brf, byz, cv, cbi, bre.d, boolean6, bre.e);
	}

	private void l() {
		this.m();

		for (bri bri3 : this.i.values()) {
			bri3.a(this.i);
		}

		bri.b(this.i);
	}

	private void m() {
		Deque<kq> deque2 = Queues.newArrayDeque();
		Set<kq> set3 = Sets.newHashSet();

		for (kq kq5 : this.i.keySet()) {
			set3.add(kq5);
			this.a(deque2, set3, (bri)this.i.get(kq5));
		}

		while (!deque2.isEmpty()) {
			kq kq4 = (kq)deque2.pop();

			try {
				if (this.i.get(kq4) != null) {
					continue;
				}

				bri bri5 = this.c(kq4);
				this.i.put(kq4, bri5);
				this.a(deque2, set3, bri5);
			} catch (Exception var5) {
				c.warn("In parent chain: {}; unable to load model: '{}'", new Object[]{f.join(this.e(kq4)), kq4, var5});
			}

			set3.add(kq4);
		}
	}

	private void a(Deque<kq> deque, Set<kq> set, bri bri) {
		kq kq5 = bri.h();
		if (kq5 != null && !set.contains(kq5)) {
			deque.add(kq5);
		}
	}

	private List<kq> e(kq kq) {
		List<kq> list3 = Lists.newArrayList(new kq[]{kq});
		kq kq4 = kq;

		while ((kq4 = this.f(kq4)) != null) {
			list3.add(0, kq4);
		}

		return list3;
	}

	@Nullable
	private kq f(kq kq) {
		for (Entry<kq, bri> entry4 : this.i.entrySet()) {
			bri bri5 = (bri)entry4.getValue();
			if (bri5 != null && kq.equals(bri5.h())) {
				return (kq)entry4.getKey();
			}
		}

		return null;
	}

	private Set<kq> a(bri bri) {
		Set<kq> set3 = Sets.newHashSet();

		for (bre bre5 : bri.a()) {
			for (brf brf7 : bre5.c.values()) {
				kq kq8 = new kq(bri.c(brf7.d));
				set3.add(kq8);
			}
		}

		set3.add(new kq(bri.c("particle")));
		return set3;
	}

	private void n() {
		final Set<kq> set2 = this.k();
		set2.addAll(this.o());
		set2.remove(byy.f);
		byr byr3 = new byr() {
			@Override
			public void a(byy byy) {
				for (kq kq4 : set2) {
					byz byz5 = byy.a(kq4);
					cbk.this.h.put(kq4, byz5);
				}
			}
		};
		this.l.a(this.g, byr3);
		this.h.put(new kq("missingno"), this.l.f());
	}

	private Set<kq> o() {
		Set<kq> set2 = Sets.newHashSet();

		for (kq kq4 : this.t.values()) {
			bri bri5 = (bri)this.i.get(kq4);
			if (bri5 != null) {
				set2.add(new kq(bri5.c("particle")));
				if (this.b(bri5)) {
					for (String string7 : brm.a) {
						set2.add(new kq(bri5.c(string7)));
					}
				} else if (!this.c(bri5)) {
					for (bre bre7 : bri5.a()) {
						for (brf brf9 : bre7.c.values()) {
							kq kq10 = new kq(bri5.c(brf9.d));
							set2.add(kq10);
						}
					}
				}
			}
		}

		return set2;
	}

	private boolean b(@Nullable bri bri) {
		return bri == null ? false : bri.i() == r;
	}

	private boolean c(@Nullable bri bri) {
		if (bri == null) {
			return false;
		} else {
			bri bri3 = bri.i();
			return bri3 == s;
		}
	}

	private void p() {
		for (kq kq3 : this.t.values()) {
			bri bri4 = (bri)this.i.get(kq3);
			if (this.b(bri4)) {
				bri bri5 = this.d(bri4);
				if (bri5 != null) {
					bri5.b = kq3.toString();
				}

				this.i.put(kq3, bri5);
			} else if (this.c(bri4)) {
				this.i.put(kq3, bri4);
			}
		}

		for (byz byz3 : this.h.values()) {
			if (!byz3.m()) {
				byz3.l();
			}
		}
	}

	private bri d(bri bri) {
		return this.o.a(this.l, bri);
	}

	static {
		e.put("missing", d);
		r.b = "generation marker";
		s.b = "block entity marker";
	}
}
