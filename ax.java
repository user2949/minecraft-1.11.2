import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ax extends j {
	private static final Map<String, Integer> a = Maps.newHashMap();

	@Override
	public String c() {
		return "replaceitem";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.replaceitem.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 1) {
			throw new ck("commands.replaceitem.usage");
		} else {
			boolean boolean5;
			if ("entity".equals(arr[0])) {
				boolean5 = false;
			} else {
				if (!"block".equals(arr[0])) {
					throw new ck("commands.replaceitem.usage");
				}

				boolean5 = true;
			}

			int integer6;
			if (boolean5) {
				if (arr.length < 6) {
					throw new ck("commands.replaceitem.block.usage");
				}

				integer6 = 4;
			} else {
				if (arr.length < 4) {
					throw new ck("commands.replaceitem.entity.usage");
				}

				integer6 = 2;
			}

			String string7 = arr[integer6];
			int integer8 = this.e(arr[integer6++]);

			afh afh9;
			try {
				afh9 = a(n, arr[integer6]);
			} catch (cg var17) {
				if (alu.b(arr[integer6]) != alv.a) {
					throw var17;
				}

				afh9 = null;
			}

			integer6++;
			int integer10 = arr.length > integer6 ? a(arr[integer6++], 1, 64) : 1;
			int integer11 = arr.length > integer6 ? a(arr[integer6++]) : 0;
			afj afj12 = new afj(afh9, integer10, integer11);
			if (arr.length > integer6) {
				String string13 = a(n, arr, integer6).c();

				try {
					afj12.b(ek.a(string13));
				} catch (ej var16) {
					throw new cd("commands.replaceitem.tagError", var16.getMessage());
				}
			}

			if (boolean5) {
				n.a(o.a.AFFECTED_ITEMS, 0);
				co co13 = a(n, arr, 1, false);
				ajs ajs14 = n.e();
				asc asc15 = ajs14.r(co13);
				if (asc15 == null || !(asc15 instanceof rc)) {
					throw new cd("commands.replaceitem.noContainer", co13.p(), co13.q(), co13.r());
				}

				rc rc16 = (rc)asc15;
				if (integer8 >= 0 && integer8 < rc16.v_()) {
					rc16.a(integer8, afj12);
				}
			} else {
				sn sn13 = b(minecraftServer, n, arr[1]);
				n.a(o.a.AFFECTED_ITEMS, 0);
				if (sn13 instanceof aay) {
					((aay)sn13).bt.b();
				}

				if (!sn13.c(integer8, afj12)) {
					throw new cd("commands.replaceitem.failed", string7, integer10, afj12.b() ? "Air" : afj12.C());
				}

				if (sn13 instanceof aay) {
					((aay)sn13).bt.b();
				}
			}

			n.a(o.a.AFFECTED_ITEMS, integer10);
			a(n, this, "commands.replaceitem.success", new Object[]{string7, integer10, afj12.b() ? "Air" : afj12.C()});
		}
	}

	private int e(String string) throws cd {
		if (!a.containsKey(string)) {
			throw new cd("commands.generic.parameter.invalid", string);
		} else {
			return (Integer)a.get(string);
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, new String[]{"entity", "block"});
		} else if (arr.length == 2 && "entity".equals(arr[0])) {
			return a(arr, minecraftServer.J());
		} else if (arr.length >= 2 && arr.length <= 4 && "block".equals(arr[0])) {
			return a(arr, 1, co);
		} else if ((arr.length != 3 || !"entity".equals(arr[0])) && (arr.length != 5 || !"block".equals(arr[0]))) {
			return (arr.length != 4 || !"entity".equals(arr[0])) && (arr.length != 6 || !"block".equals(arr[0])) ? Collections.emptyList() : a(arr, afh.g.c());
		} else {
			return a(arr, a.keySet());
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return arr.length > 0 && "entity".equals(arr[0]) && integer == 1;
	}

	static {
		for (int integer1 = 0; integer1 < 54; integer1++) {
			a.put("slot.container." + integer1, integer1);
		}

		for (int integer1 = 0; integer1 < 9; integer1++) {
			a.put("slot.hotbar." + integer1, integer1);
		}

		for (int integer1 = 0; integer1 < 27; integer1++) {
			a.put("slot.inventory." + integer1, 9 + integer1);
		}

		for (int integer1 = 0; integer1 < 27; integer1++) {
			a.put("slot.enderchest." + integer1, 200 + integer1);
		}

		for (int integer1 = 0; integer1 < 8; integer1++) {
			a.put("slot.villager." + integer1, 300 + integer1);
		}

		for (int integer1 = 0; integer1 < 15; integer1++) {
			a.put("slot.horse." + integer1, 500 + integer1);
		}

		a.put("slot.weapon", 98);
		a.put("slot.weapon.mainhand", 98);
		a.put("slot.weapon.offhand", 99);
		a.put("slot.armor.head", 100 + ss.HEAD.b());
		a.put("slot.armor.chest", 100 + ss.CHEST.b());
		a.put("slot.armor.legs", 100 + ss.LEGS.b());
		a.put("slot.armor.feet", 100 + ss.FEET.b());
		a.put("slot.horse.saddle", 400);
		a.put("slot.horse.armor", 401);
		a.put("slot.horse.chest", 499);
	}
}
