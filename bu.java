import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bu extends j {
	@Override
	public String c() {
		return "time";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.time.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length > 1) {
			if ("set".equals(arr[0])) {
				int integer5;
				if ("day".equals(arr[1])) {
					integer5 = 1000;
				} else if ("night".equals(arr[1])) {
					integer5 = 13000;
				} else {
					integer5 = a(arr[1], 0);
				}

				this.a(minecraftServer, integer5);
				a(n, this, "commands.time.set", new Object[]{integer5});
				return;
			}

			if ("add".equals(arr[0])) {
				int integer5 = a(arr[1], 0);
				this.b(minecraftServer, integer5);
				a(n, this, "commands.time.added", new Object[]{integer5});
				return;
			}

			if ("query".equals(arr[0])) {
				if ("daytime".equals(arr[1])) {
					int integer5 = (int)(n.e().Q() % 24000L);
					n.a(o.a.QUERY_RESULT, integer5);
					a(n, this, "commands.time.query", new Object[]{integer5});
					return;
				}

				if ("day".equals(arr[1])) {
					int integer5 = (int)(n.e().Q() / 24000L % 2147483647L);
					n.a(o.a.QUERY_RESULT, integer5);
					a(n, this, "commands.time.query", new Object[]{integer5});
					return;
				}

				if ("gametime".equals(arr[1])) {
					int integer5 = (int)(n.e().P() % 2147483647L);
					n.a(o.a.QUERY_RESULT, integer5);
					a(n, this, "commands.time.query", new Object[]{integer5});
					return;
				}
			}
		}

		throw new ck("commands.time.usage");
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, new String[]{"set", "add", "query"});
		} else if (arr.length == 2 && "set".equals(arr[0])) {
			return a(arr, new String[]{"day", "night"});
		} else {
			return arr.length == 2 && "query".equals(arr[0]) ? a(arr, new String[]{"daytime", "gametime", "day"}) : Collections.emptyList();
		}
	}

	protected void a(MinecraftServer minecraftServer, int integer) {
		for (int integer4 = 0; integer4 < minecraftServer.d.length; integer4++) {
			minecraftServer.d[integer4].b((long)integer);
		}
	}

	protected void b(MinecraftServer minecraftServer, int integer) {
		for (int integer4 = 0; integer4 < minecraftServer.d.length; integer4++) {
			lw lw5 = minecraftServer.d[integer4];
			lw5.b(lw5.Q() + (long)integer);
		}
	}
}
