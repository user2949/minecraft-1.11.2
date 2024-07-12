import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ac extends j {
	@Override
	public String c() {
		return "enchant";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.enchant.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 2) {
			throw new ck("commands.enchant.usage");
		} else {
			sw sw5 = a(minecraftServer, n, arr[0], sw.class);
			n.a(o.a.AFFECTED_ITEMS, 0);

			aii aii6;
			try {
				aii6 = aii.c(a(arr[1], 0));
			} catch (cg var12) {
				aii6 = aii.b(arr[1]);
			}

			if (aii6 == null) {
				throw new cg("commands.enchant.notFound", arr[1]);
			} else {
				int integer7 = 1;
				afj afj8 = sw5.cg();
				if (afj8.b()) {
					throw new cd("commands.enchant.noItem");
				} else if (!aii6.a(afj8)) {
					throw new cd("commands.enchant.cantEnchant");
				} else {
					if (arr.length >= 3) {
						integer7 = a(arr[2], aii6.f(), aii6.b());
					}

					if (afj8.o()) {
						ea ea9 = afj8.q();
						if (ea9 != null) {
							for (int integer10 = 0; integer10 < ea9.c(); integer10++) {
								int integer11 = ea9.b(integer10).g("id");
								if (aii.c(integer11) != null) {
									aii aii12 = aii.c(integer11);
									if (!aii6.c(aii12)) {
										throw new cd("commands.enchant.cantCombine", aii6.d(integer7), aii12.d(ea9.b(integer10).g("lvl")));
									}
								}
							}
						}
					}

					afj8.a(aii6, integer7);
					a(n, this, "commands.enchant.success", new Object[0]);
					n.a(o.a.AFFECTED_ITEMS, 1);
				}
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, minecraftServer.J());
		} else {
			return arr.length == 2 ? a(arr, aii.b.c()) : Collections.emptyList();
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
