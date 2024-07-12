import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class be extends j {
	@Override
	public String c() {
		return "setblock";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.setblock.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 4) {
			throw new ck("commands.setblock.usage");
		} else {
			n.a(o.a.AFFECTED_BLOCKS, 0);
			co co5 = a(n, arr, 0, false);
			alu alu6 = j.b(n, arr[3]);
			atl atl7;
			if (arr.length >= 5) {
				atl7 = a(alu6, arr[4]);
			} else {
				atl7 = alu6.t();
			}

			ajs ajs8 = n.e();
			if (!ajs8.e(co5)) {
				throw new cd("commands.setblock.outOfWorld");
			} else {
				du du9 = new du();
				boolean boolean10 = false;
				if (arr.length >= 7 && alu6.l()) {
					String string11 = a(n, arr, 6).c();

					try {
						du9 = ek.a(string11);
						boolean10 = true;
					} catch (ej var12) {
						throw new cd("commands.setblock.tagError", var12.getMessage());
					}
				}

				if (arr.length >= 6) {
					if ("destroy".equals(arr[5])) {
						ajs8.b(co5, true);
						if (alu6 == alv.a) {
							a(n, this, "commands.setblock.success", new Object[0]);
							return;
						}
					} else if ("keep".equals(arr[5]) && !ajs8.d(co5)) {
						throw new cd("commands.setblock.noChange");
					}
				}

				asc asc11 = ajs8.r(co5);
				if (asc11 != null) {
					if (asc11 instanceof rc) {
						((rc)asc11).m();
					}

					ajs8.a(co5, alv.a.t(), alu6 == alv.a ? 2 : 4);
				}

				if (!ajs8.a(co5, atl7, 2)) {
					throw new cd("commands.setblock.noChange");
				} else {
					if (boolean10) {
						asc asc12 = ajs8.r(co5);
						if (asc12 != null) {
							du9.a("x", co5.p());
							du9.a("y", co5.q());
							du9.a("z", co5.r());
							asc12.a(du9);
						}
					}

					ajs8.a(co5, atl7.v(), false);
					n.a(o.a.AFFECTED_BLOCKS, 1);
					a(n, this, "commands.setblock.success", new Object[0]);
				}
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length > 0 && arr.length <= 3) {
			return a(arr, 0, co);
		} else if (arr.length == 4) {
			return a(arr, alu.h.c());
		} else {
			return arr.length == 6 ? a(arr, new String[]{"replace", "destroy", "keep"}) : Collections.emptyList();
		}
	}
}
