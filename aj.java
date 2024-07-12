import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class aj extends j {
	@Override
	public String c() {
		return "gamerule";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.gamerule.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		ajp ajp5 = this.a(minecraftServer);
		String string6 = arr.length > 0 ? arr[0] : "";
		String string7 = arr.length > 1 ? a(arr, 1) : "";
		switch (arr.length) {
			case 0:
				n.a(new fh(a(ajp5.b())));
				break;
			case 1:
				if (!ajp5.e(string6)) {
					throw new cd("commands.gamerule.norule", string6);
				}

				String string8 = ajp5.a(string6);
				n.a(new fh(string6).a(" = ").a(string8));
				n.a(o.a.QUERY_RESULT, ajp5.c(string6));
				break;
			default:
				if (ajp5.a(string6, ajp.b.BOOLEAN_VALUE) && !"true".equals(string7) && !"false".equals(string7)) {
					throw new cd("commands.generic.boolean.invalid", string7);
				}

				ajp5.a(string6, string7);
				a(ajp5, string6, minecraftServer);
				a(n, this, "commands.gamerule.success", new Object[]{string6, string7});
		}
	}

	public static void a(ajp ajp, String string, MinecraftServer minecraftServer) {
		if ("reducedDebugInfo".equals(string)) {
			byte byte4 = (byte)(ajp.b(string) ? 22 : 23);

			for (ly ly6 : minecraftServer.am().v()) {
				ly6.a.a(new gr(ly6, byte4));
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, this.a(minecraftServer).b());
		} else {
			if (arr.length == 2) {
				ajp ajp6 = this.a(minecraftServer);
				if (ajp6.a(arr[0], ajp.b.BOOLEAN_VALUE)) {
					return a(arr, new String[]{"true", "false"});
				}
			}

			return Collections.emptyList();
		}
	}

	private ajp a(MinecraftServer minecraftServer) {
		return minecraftServer.a(0).U();
	}
}
