import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class oa {
	protected static final Map<String, nw> a = Maps.newHashMap();
	public static final List<nw> b = Lists.newArrayList();
	public static final List<nw> c = Lists.newArrayList();
	public static final List<nu> d = Lists.newArrayList();
	public static final List<nu> e = Lists.newArrayList();
	public static final nw f = new nt("stat.leaveGame", new fi("stat.leaveGame")).i().h();
	public static final nw g = new nt("stat.playOneMinute", new fi("stat.playOneMinute"), nw.h).i().h();
	public static final nw h = new nt("stat.timeSinceDeath", new fi("stat.timeSinceDeath"), nw.h).i().h();
	public static final nw i = new nt("stat.sneakTime", new fi("stat.sneakTime"), nw.h).i().h();
	public static final nw j = new nt("stat.walkOneCm", new fi("stat.walkOneCm"), nw.i).i().h();
	public static final nw k = new nt("stat.crouchOneCm", new fi("stat.crouchOneCm"), nw.i).i().h();
	public static final nw l = new nt("stat.sprintOneCm", new fi("stat.sprintOneCm"), nw.i).i().h();
	public static final nw m = new nt("stat.swimOneCm", new fi("stat.swimOneCm"), nw.i).i().h();
	public static final nw n = new nt("stat.fallOneCm", new fi("stat.fallOneCm"), nw.i).i().h();
	public static final nw o = new nt("stat.climbOneCm", new fi("stat.climbOneCm"), nw.i).i().h();
	public static final nw p = new nt("stat.flyOneCm", new fi("stat.flyOneCm"), nw.i).i().h();
	public static final nw q = new nt("stat.diveOneCm", new fi("stat.diveOneCm"), nw.i).i().h();
	public static final nw r = new nt("stat.minecartOneCm", new fi("stat.minecartOneCm"), nw.i).i().h();
	public static final nw s = new nt("stat.boatOneCm", new fi("stat.boatOneCm"), nw.i).i().h();
	public static final nw t = new nt("stat.pigOneCm", new fi("stat.pigOneCm"), nw.i).i().h();
	public static final nw u = new nt("stat.horseOneCm", new fi("stat.horseOneCm"), nw.i).i().h();
	public static final nw v = new nt("stat.aviateOneCm", new fi("stat.aviateOneCm"), nw.i).i().h();
	public static final nw w = new nt("stat.jump", new fi("stat.jump")).i().h();
	public static final nw x = new nt("stat.drop", new fi("stat.drop")).i().h();
	public static final nw y = new nt("stat.damageDealt", new fi("stat.damageDealt"), nw.j).h();
	public static final nw z = new nt("stat.damageTaken", new fi("stat.damageTaken"), nw.j).h();
	public static final nw A = new nt("stat.deaths", new fi("stat.deaths")).h();
	public static final nw B = new nt("stat.mobKills", new fi("stat.mobKills")).h();
	public static final nw C = new nt("stat.animalsBred", new fi("stat.animalsBred")).h();
	public static final nw D = new nt("stat.playerKills", new fi("stat.playerKills")).h();
	public static final nw E = new nt("stat.fishCaught", new fi("stat.fishCaught")).h();
	public static final nw F = new nt("stat.talkedToVillager", new fi("stat.talkedToVillager")).h();
	public static final nw G = new nt("stat.tradedWithVillager", new fi("stat.tradedWithVillager")).h();
	public static final nw H = new nt("stat.cakeSlicesEaten", new fi("stat.cakeSlicesEaten")).h();
	public static final nw I = new nt("stat.cauldronFilled", new fi("stat.cauldronFilled")).h();
	public static final nw J = new nt("stat.cauldronUsed", new fi("stat.cauldronUsed")).h();
	public static final nw K = new nt("stat.armorCleaned", new fi("stat.armorCleaned")).h();
	public static final nw L = new nt("stat.bannerCleaned", new fi("stat.bannerCleaned")).h();
	public static final nw M = new nt("stat.brewingstandInteraction", new fi("stat.brewingstandInteraction")).h();
	public static final nw N = new nt("stat.beaconInteraction", new fi("stat.beaconInteraction")).h();
	public static final nw O = new nt("stat.dropperInspected", new fi("stat.dropperInspected")).h();
	public static final nw P = new nt("stat.hopperInspected", new fi("stat.hopperInspected")).h();
	public static final nw Q = new nt("stat.dispenserInspected", new fi("stat.dispenserInspected")).h();
	public static final nw R = new nt("stat.noteblockPlayed", new fi("stat.noteblockPlayed")).h();
	public static final nw S = new nt("stat.noteblockTuned", new fi("stat.noteblockTuned")).h();
	public static final nw T = new nt("stat.flowerPotted", new fi("stat.flowerPotted")).h();
	public static final nw U = new nt("stat.trappedChestTriggered", new fi("stat.trappedChestTriggered")).h();
	public static final nw V = new nt("stat.enderchestOpened", new fi("stat.enderchestOpened")).h();
	public static final nw W = new nt("stat.itemEnchanted", new fi("stat.itemEnchanted")).h();
	public static final nw X = new nt("stat.recordPlayed", new fi("stat.recordPlayed")).h();
	public static final nw Y = new nt("stat.furnaceInteraction", new fi("stat.furnaceInteraction")).h();
	public static final nw Z = new nt("stat.craftingTableInteraction", new fi("stat.workbenchInteraction")).h();
	public static final nw aa = new nt("stat.chestOpened", new fi("stat.chestOpened")).h();
	public static final nw ab = new nt("stat.sleepInBed", new fi("stat.sleepInBed")).h();
	public static final nw ac = new nt("stat.shulkerBoxOpened", new fi("stat.shulkerBoxOpened")).h();
	private static final nw[] ad = new nw[4096];
	private static final nw[] ae = new nw[32000];
	private static final nw[] af = new nw[32000];
	private static final nw[] ag = new nw[32000];
	private static final nw[] ah = new nw[32000];
	private static final nw[] ai = new nw[32000];

	@Nullable
	public static nw a(alu alu) {
		return ad[alu.a(alu)];
	}

	@Nullable
	public static nw a(afh afh) {
		return ae[afh.a(afh)];
	}

	@Nullable
	public static nw b(afh afh) {
		return af[afh.a(afh)];
	}

	@Nullable
	public static nw c(afh afh) {
		return ag[afh.a(afh)];
	}

	@Nullable
	public static nw d(afh afh) {
		return ah[afh.a(afh)];
	}

	@Nullable
	public static nw e(afh afh) {
		return ai[afh.a(afh)];
	}

	public static void a() {
		c();
		d();
		e();
		b();
		f();
		nr.a();
	}

	private static void b() {
		Set<afh> set1 = Sets.newHashSet();

		for (aho aho3 : ahp.a().b()) {
			afj afj4 = aho3.b();
			if (!afj4.b()) {
				set1.add(aho3.b().c());
			}
		}

		for (afj afj3 : ahk.a().b().values()) {
			set1.add(afj3.c());
		}

		for (afh afh3 : set1) {
			if (afh3 != null) {
				int integer4 = afh.a(afh3);
				String string5 = f(afh3);
				if (string5 != null) {
					ae[integer4] = new nu("stat.craftItem.", string5, new fi("stat.craftItem", new afj(afh3).C()), afh3).h();
				}
			}
		}

		a(ae);
	}

	private static void c() {
		for (alu alu2 : alu.h) {
			afh afh3 = afh.a(alu2);
			if (afh3 != afl.a) {
				int integer4 = alu.a(alu2);
				String string5 = f(afh3);
				if (string5 != null && alu2.o()) {
					ad[integer4] = new nu("stat.mineBlock.", string5, new fi("stat.mineBlock", new afj(alu2).C()), afh3).h();
					e.add((nu)ad[integer4]);
				}
			}
		}

		a(ad);
	}

	private static void d() {
		for (afh afh2 : afh.g) {
			if (afh2 != null) {
				int integer3 = afh.a(afh2);
				String string4 = f(afh2);
				if (string4 != null) {
					af[integer3] = new nu("stat.useItem.", string4, new fi("stat.useItem", new afj(afh2).C()), afh2).h();
					if (!(afh2 instanceof adv)) {
						d.add((nu)af[integer3]);
					}
				}
			}
		}

		a(af);
	}

	private static void e() {
		for (afh afh2 : afh.g) {
			if (afh2 != null) {
				int integer3 = afh.a(afh2);
				String string4 = f(afh2);
				if (string4 != null && afh2.n()) {
					ag[integer3] = new nu("stat.breakItem.", string4, new fi("stat.breakItem", new afj(afh2).C()), afh2).h();
				}
			}
		}

		a(ag);
	}

	private static void f() {
		for (afh afh2 : afh.g) {
			if (afh2 != null) {
				int integer3 = afh.a(afh2);
				String string4 = f(afh2);
				if (string4 != null) {
					ah[integer3] = new nu("stat.pickup.", string4, new fi("stat.pickup", new afj(afh2).C()), afh2).h();
					ai[integer3] = new nu("stat.drop.", string4, new fi("stat.drop", new afj(afh2).C()), afh2).h();
				}
			}
		}

		a(ag);
	}

	private static String f(afh afh) {
		kq kq2 = afh.g.b(afh);
		return kq2 != null ? kq2.toString().replace(':', '.') : null;
	}

	private static void a(nw[] arr) {
		a(arr, alv.j, alv.i);
		a(arr, alv.l, alv.k);
		a(arr, alv.aZ, alv.aU);
		a(arr, alv.am, alv.al);
		a(arr, alv.aD, alv.aC);
		a(arr, alv.bc, alv.bb);
		a(arr, alv.ck, alv.cj);
		a(arr, alv.aF, alv.aE);
		a(arr, alv.bK, alv.bJ);
		a(arr, alv.T, alv.U);
		a(arr, alv.bL, alv.bM);
		a(arr, alv.cO, alv.cP);
		a(arr, alv.c, alv.d);
		a(arr, alv.ak, alv.d);
	}

	private static void a(nw[] arr, alu alu2, alu alu3) {
		int integer4 = alu.a(alu2);
		int integer5 = alu.a(alu3);
		if (arr[integer4] != null && arr[integer5] == null) {
			arr[integer5] = arr[integer4];
		} else {
			b.remove(arr[integer4]);
			e.remove(arr[integer4]);
			c.remove(arr[integer4]);
			arr[integer4] = arr[integer5];
		}
	}

	public static nw a(sp.a a) {
		String string2 = sp.a(a.a);
		return string2 == null ? null : new nw("stat.killEntity." + string2, new fi("stat.entityKill", new fi("entity." + string2 + ".name"))).h();
	}

	public static nw b(sp.a a) {
		String string2 = sp.a(a.a);
		return string2 == null ? null : new nw("stat.entityKilledBy." + string2, new fi("stat.entityKilledBy", new fi("entity." + string2 + ".name"))).h();
	}

	@Nullable
	public static nw a(String string) {
		return (nw)a.get(string);
	}
}
