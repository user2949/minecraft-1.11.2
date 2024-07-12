import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bn extends j {
	@Override
	public String c() {
		return "summon";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.summon.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 1) {
			throw new ck("commands.summon.usage");
		} else {
			String string5 = arr[0];
			co co6 = n.c();
			bdw bdw7 = n.d();
			double double8 = bdw7.b;
			double double10 = bdw7.c;
			double double12 = bdw7.d;
			if (arr.length >= 4) {
				double8 = b(double8, arr[1], true);
				double10 = b(double10, arr[2], false);
				double12 = b(double12, arr[3], true);
				co6 = new co(double8, double10, double12);
			}

			ajs ajs14 = n.e();
			if (!ajs14.e(co6)) {
				throw new cd("commands.summon.outOfWorld");
			} else if (sp.a.equals(new kq(string5))) {
				ajs14.d(new zg(ajs14, double8, double10, double12, false));
				a(n, this, "commands.summon.success", new Object[0]);
			} else {
				du du15 = new du();
				boolean boolean16 = false;
				if (arr.length >= 5) {
					fb fb17 = a(n, arr, 4);

					try {
						du15 = ek.a(fb17.c());
						boolean16 = true;
					} catch (ej var18) {
						throw new cd("commands.summon.tagError", var18.getMessage());
					}
				}

				du15.a("id", string5);
				sn sn17 = avd.a(du15, ajs14, double8, double10, double12, true);
				if (sn17 == null) {
					throw new cd("commands.summon.failed");
				} else {
					sn17.b(double8, double10, double12, sn17.v, sn17.w);
					if (!boolean16 && sn17 instanceof sx) {
						((sx)sn17).a(ajs14.D(new co(sn17)), null);
					}

					a(n, this, "commands.summon.success", new Object[0]);
				}
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, sp.a());
		} else {
			return arr.length > 1 && arr.length <= 4 ? a(arr, 1, co) : Collections.emptyList();
		}
	}
}
