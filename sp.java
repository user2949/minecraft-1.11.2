import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class sp {
	public static final kq a = new kq("lightning_bolt");
	private static final kq e = new kq("player");
	private static final Logger f = LogManager.getLogger();
	public static final dc<kq, Class<? extends sn>> b = new dc<>();
	public static final Map<kq, sp.a> c = Maps.newLinkedHashMap();
	public static final Set<kq> d = Sets.newHashSet();
	private static final List<String> g = Lists.newArrayList();

	@Nullable
	public static kq a(sn sn) {
		return a(sn.getClass());
	}

	@Nullable
	public static kq a(Class<? extends sn> class1) {
		return b.b(class1);
	}

	@Nullable
	public static String b(sn sn) {
		int integer2 = b.a(sn.getClass());
		return integer2 == -1 ? null : (String)g.get(integer2);
	}

	@Nullable
	public static String a(@Nullable kq kq) {
		int integer2 = b.a(b.c(kq));
		return integer2 == -1 ? null : (String)g.get(integer2);
	}

	@Nullable
	public static Class<? extends sn> a(int integer) {
		return b.a(integer);
	}

	@Nullable
	public static sn a(@Nullable Class<? extends sn> class1, ajs ajs) {
		if (class1 == null) {
			return null;
		} else {
			try {
				return (sn)class1.getConstructor(ajs.class).newInstance(ajs);
			} catch (Exception var3) {
				var3.printStackTrace();
				return null;
			}
		}
	}

	@Nullable
	public static sn a(int integer, ajs ajs) {
		return a(a(integer), ajs);
	}

	@Nullable
	public static sn a(kq kq, ajs ajs) {
		return a(b.c(kq), ajs);
	}

	@Nullable
	public static sn a(du du, ajs ajs) {
		kq kq3 = new kq(du.l("id"));
		sn sn4 = a(kq3, ajs);
		if (sn4 == null) {
			f.warn("Skipping Entity with id {}", new Object[]{kq3});
		} else {
			sn4.f(du);
		}

		return sn4;
	}

	public static Set<kq> a() {
		return d;
	}

	public static boolean a(sn sn, kq kq) {
		kq kq3 = a(sn.getClass());
		if (kq3 != null) {
			return kq3.equals(kq);
		} else if (sn instanceof aay) {
			return e.equals(kq);
		} else {
			return sn instanceof zg ? a.equals(kq) : false;
		}
	}

	public static boolean b(kq kq) {
		return e.equals(kq) || a().contains(kq);
	}

	public static void b() {
		a(1, "item", zj.class, "Item");
		a(2, "xp_orb", st.class, "XPOrb");
		a(3, "area_effect_cloud", sl.class, "AreaEffectCloud");
		a(4, "elder_guardian", zq.class, "ElderGuardian");
		a(5, "wither_skeleton", aan.class, "WitherSkeleton");
		a(6, "stray", aaj.class, "Stray");
		a(7, "egg", abq.class, "ThrownEgg");
		a(8, "leash_knot", za.class, "LeashKnot");
		a(9, "painting", zb.class, "Painting");
		a(10, "arrow", abu.class, "Arrow");
		a(11, "snowball", abn.class, "Snowball");
		a(12, "fireball", abh.class, "Fireball");
		a(13, "small_fireball", abm.class, "SmallFireball");
		a(14, "ender_pearl", abr.class, "ThrownEnderpearl");
		a(15, "eye_of_ender_signal", abe.class, "EyeOfEnderSignal");
		a(16, "potion", abt.class, "ThrownPotion");
		a(17, "xp_bottle", abs.class, "ThrownExpBottle");
		a(18, "item_frame", yz.class, "ItemFrame");
		a(19, "wither_skull", abv.class, "WitherSkull");
		a(20, "tnt", zk.class, "PrimedTnt");
		a(21, "falling_block", zi.class, "FallingSand");
		a(22, "fireworks_rocket", abg.class, "FireworksRocketEntity");
		a(23, "husk", zy.class, "Husk");
		a(24, "spectral_arrow", abo.class, "SpectralArrow");
		a(25, "shulker_bullet", abl.class, "ShulkerBullet");
		a(26, "dragon_fireball", abc.class, "DragonFireball");
		a(27, "zombie_villager", aap.class, "ZombieVillager");
		a(28, "skeleton_horse", xs.class, "SkeletonHorse");
		a(29, "zombie_horse", xu.class, "ZombieHorse");
		a(30, "armor_stand", yx.class, "ArmorStand");
		a(31, "donkey", xn.class, "Donkey");
		a(32, "mule", xr.class, "Mule");
		a(33, "evocation_fangs", abd.class, "EvocationFangs");
		a(34, "evocation_illager", zu.class, "EvocationIllager");
		a(35, "vex", aak.class, "Vex");
		a(36, "vindication_illager", aal.class, "VindicationIllager");
		a(40, "commandblock_minecart", aca.class, aby.a.COMMAND_BLOCK.b());
		a(41, "boat", abx.class, "Boat");
		a(42, "minecart", ace.class, aby.a.RIDEABLE.b());
		a(43, "chest_minecart", abz.class, aby.a.CHEST.b());
		a(44, "furnace_minecart", acc.class, aby.a.FURNACE.b());
		a(45, "tnt_minecart", acg.class, aby.a.TNT.b());
		a(46, "hopper_minecart", acd.class, aby.a.HOPPER.b());
		a(47, "spawner_minecart", acf.class, aby.a.SPAWNER.b());
		a(50, "creeper", zp.class, "Creeper");
		a(51, "skeleton", aag.class, "Skeleton");
		a(52, "spider", aai.class, "Spider");
		a(53, "giant", zw.class, "Giant");
		a(54, "zombie", aao.class, "Zombie");
		a(55, "slime", aah.class, "Slime");
		a(56, "ghast", zv.class, "Ghast");
		a(57, "zombie_pigman", aab.class, "PigZombie");
		a(58, "enderman", zr.class, "Enderman");
		a(59, "cave_spider", zo.class, "CaveSpider");
		a(60, "silverfish", aaf.class, "Silverfish");
		a(61, "blaze", zn.class, "Blaze");
		a(62, "magma_cube", zz.class, "LavaSlime");
		a(63, "ender_dragon", yb.class, "EnderDragon");
		a(64, "wither", yv.class, "WitherBoss");
		a(65, "bat", wu.class, "Bat");
		a(66, "witch", aam.class, "Witch");
		a(67, "endermite", zs.class, "Endermite");
		a(68, "guardian", zx.class, "Guardian");
		a(69, "shulker", aae.class, "Shulker");
		a(90, "pig", xc.class, "Pig");
		a(91, "sheep", xf.class, "Sheep");
		a(92, "cow", wy.class, "Cow");
		a(93, "chicken", wx.class, "Chicken");
		a(94, "squid", xh.class, "Squid");
		a(95, "wolf", xk.class, "Wolf");
		a(96, "mooshroom", xa.class, "MushroomCow");
		a(97, "snowman", xg.class, "SnowMan");
		a(98, "ocelot", xb.class, "Ozelot");
		a(99, "villager_golem", xi.class, "VillagerGolem");
		a(100, "horse", xo.class, "Horse");
		a(101, "rabbit", xe.class, "Rabbit");
		a(102, "polar_bear", xd.class, "PolarBear");
		a(103, "llama", xq.class, "Llama");
		a(104, "llama_spit", abi.class, "LlamaSpit");
		a(120, "villager", aat.class, "Villager");
		a(200, "ender_crystal", ya.class, "EnderCrystal");
		a("bat", 4996656, 986895);
		a("blaze", 16167425, 16775294);
		a("cave_spider", 803406, 11013646);
		a("chicken", 10592673, 16711680);
		a("cow", 4470310, 10592673);
		a("creeper", 894731, 0);
		a("donkey", 5457209, 8811878);
		a("elder_guardian", 13552826, 7632531);
		a("enderman", 1447446, 0);
		a("endermite", 1447446, 7237230);
		a("evocation_illager", 9804699, 1973274);
		a("ghast", 16382457, 12369084);
		a("guardian", 5931634, 15826224);
		a("horse", 12623485, 15656192);
		a("husk", 7958625, 15125652);
		a("llama", 12623485, 10051392);
		a("magma_cube", 3407872, 16579584);
		a("mooshroom", 10489616, 12040119);
		a("mule", 1769984, 5321501);
		a("ocelot", 15720061, 5653556);
		a("pig", 15771042, 14377823);
		a("polar_bear", 15921906, 9803152);
		a("rabbit", 10051392, 7555121);
		a("sheep", 15198183, 16758197);
		a("shulker", 9725844, 5060690);
		a("silverfish", 7237230, 3158064);
		a("skeleton", 12698049, 4802889);
		a("skeleton_horse", 6842447, 15066584);
		a("slime", 5349438, 8306542);
		a("spider", 3419431, 11013646);
		a("squid", 2243405, 7375001);
		a("stray", 6387319, 14543594);
		a("vex", 8032420, 15265265);
		a("villager", 5651507, 12422002);
		a("vindication_illager", 9804699, 2580065);
		a("witch", 3407872, 5349438);
		a("wither_skeleton", 1315860, 4672845);
		a("wolf", 14144467, 13545366);
		a("zombie", 44975, 7969893);
		a("zombie_horse", 3232308, 9945732);
		a("zombie_pigman", 15373203, 5009705);
		a("zombie_villager", 5651507, 7969893);
		d.add(a);
	}

	private static void a(int integer, String string2, Class<? extends sn> class3, String string4) {
		try {
			class3.getConstructor(ajs.class);
		} catch (NoSuchMethodException var5) {
			throw new RuntimeException("Invalid class " + class3 + " no constructor taking " + ajs.class.getName());
		}

		if ((class3.getModifiers() & 1024) == 1024) {
			throw new RuntimeException("Invalid abstract class " + class3);
		} else {
			kq kq5 = new kq(string2);
			b.a(integer, kq5, class3);
			d.add(kq5);

			while (g.size() <= integer) {
				g.add(null);
			}

			g.set(integer, string4);
		}
	}

	protected static sp.a a(String string, int integer2, int integer3) {
		kq kq4 = new kq(string);
		return (sp.a)c.put(kq4, new sp.a(kq4, integer2, integer3));
	}

	public static class a {
		public final kq a;
		public final int b;
		public final int c;
		public final nw d;
		public final nw e;

		public a(kq kq, int integer2, int integer3) {
			this.a = kq;
			this.b = integer2;
			this.c = integer3;
			this.d = oa.a(this);
			this.e = oa.b(this);
		}
	}
}
