import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class af extends j {
	@Override
	public String c() {
		return "xp";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.xp.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length <= 0) {
			throw new ck("commands.xp.usage");
		} else {
			String string5 = arr[0];
			boolean boolean6 = string5.endsWith("l") || string5.endsWith("L");
			if (boolean6 && string5.length() > 1) {
				string5 = string5.substring(0, string5.length() - 1);
			}

			int integer7 = a(string5);
			boolean boolean8 = integer7 < 0;
			if (boolean8) {
				integer7 *= -1;
			}

			aay aay9 = arr.length > 1 ? a(minecraftServer, n, arr[1]) : a(n);
			if (boolean6) {
				n.a(o.a.QUERY_RESULT, aay9.bL);
				if (boolean8) {
					aay9.a(-integer7);
					a(n, this, "commands.xp.success.negative.levels", new Object[]{integer7, aay9.h_()});
				} else {
					aay9.a(integer7);
					a(n, this, "commands.xp.success.levels", new Object[]{integer7, aay9.h_()});
				}
			} else {
				n.a(o.a.QUERY_RESULT, aay9.bM);
				if (boolean8) {
					throw new cd("commands.xp.failure.widthdrawXp");
				}

				aay9.n(integer7);
				a(n, this, "commands.xp.success", new Object[]{integer7, aay9.h_()});
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 2 ? a(arr, minecraftServer.J()) : Collections.emptyList();
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 1;
	}
}
