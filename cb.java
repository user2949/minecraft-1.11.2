import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cb extends j {
	@Override
	public String c() {
		return "worldborder";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.worldborder.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 1) {
			throw new ck("commands.worldborder.usage");
		} else {
			auf auf5 = this.a(minecraftServer);
			if ("set".equals(arr[0])) {
				if (arr.length != 2 && arr.length != 3) {
					throw new ck("commands.worldborder.set.usage");
				}

				double double6 = auf5.j();
				double double8 = a(arr[1], 1.0, 6.0E7);
				long long10 = arr.length > 2 ? a(arr[2], 0L, 9223372036854775L) * 1000L : 0L;
				if (long10 > 0L) {
					auf5.a(double6, double8, long10);
					if (double6 > double8) {
						a(
							n,
							this,
							"commands.worldborder.setSlowly.shrink.success",
							new Object[]{String.format("%.1f", double8), String.format("%.1f", double6), Long.toString(long10 / 1000L)}
						);
					} else {
						a(
							n,
							this,
							"commands.worldborder.setSlowly.grow.success",
							new Object[]{String.format("%.1f", double8), String.format("%.1f", double6), Long.toString(long10 / 1000L)}
						);
					}
				} else {
					auf5.a(double8);
					a(n, this, "commands.worldborder.set.success", new Object[]{String.format("%.1f", double8), String.format("%.1f", double6)});
				}
			} else if ("add".equals(arr[0])) {
				if (arr.length != 2 && arr.length != 3) {
					throw new ck("commands.worldborder.add.usage");
				}

				double double6 = auf5.h();
				double double8 = double6 + a(arr[1], -double6, 6.0E7 - double6);
				long long10 = auf5.i() + (arr.length > 2 ? a(arr[2], 0L, 9223372036854775L) * 1000L : 0L);
				if (long10 > 0L) {
					auf5.a(double6, double8, long10);
					if (double6 > double8) {
						a(
							n,
							this,
							"commands.worldborder.setSlowly.shrink.success",
							new Object[]{String.format("%.1f", double8), String.format("%.1f", double6), Long.toString(long10 / 1000L)}
						);
					} else {
						a(
							n,
							this,
							"commands.worldborder.setSlowly.grow.success",
							new Object[]{String.format("%.1f", double8), String.format("%.1f", double6), Long.toString(long10 / 1000L)}
						);
					}
				} else {
					auf5.a(double8);
					a(n, this, "commands.worldborder.set.success", new Object[]{String.format("%.1f", double8), String.format("%.1f", double6)});
				}
			} else if ("center".equals(arr[0])) {
				if (arr.length != 3) {
					throw new ck("commands.worldborder.center.usage");
				}

				co co6 = n.c();
				double double7 = b((double)co6.p() + 0.5, arr[1], true);
				double double9 = b((double)co6.r() + 0.5, arr[2], true);
				auf5.c(double7, double9);
				a(n, this, "commands.worldborder.center.success", new Object[]{double7, double9});
			} else if ("damage".equals(arr[0])) {
				if (arr.length < 2) {
					throw new ck("commands.worldborder.damage.usage");
				}

				if ("buffer".equals(arr[1])) {
					if (arr.length != 3) {
						throw new ck("commands.worldborder.damage.buffer.usage");
					}

					double double6 = a(arr[2], 0.0);
					double double8 = auf5.m();
					auf5.b(double6);
					a(n, this, "commands.worldborder.damage.buffer.success", new Object[]{String.format("%.1f", double6), String.format("%.1f", double8)});
				} else if ("amount".equals(arr[1])) {
					if (arr.length != 3) {
						throw new ck("commands.worldborder.damage.amount.usage");
					}

					double double6 = a(arr[2], 0.0);
					double double8 = auf5.n();
					auf5.c(double6);
					a(n, this, "commands.worldborder.damage.amount.success", new Object[]{String.format("%.2f", double6), String.format("%.2f", double8)});
				}
			} else if ("warning".equals(arr[0])) {
				if (arr.length < 2) {
					throw new ck("commands.worldborder.warning.usage");
				}

				if ("time".equals(arr[1])) {
					if (arr.length != 3) {
						throw new ck("commands.worldborder.warning.time.usage");
					}

					int integer6 = a(arr[2], 0);
					int integer7 = auf5.p();
					auf5.b(integer6);
					a(n, this, "commands.worldborder.warning.time.success", new Object[]{integer6, integer7});
				} else if ("distance".equals(arr[1])) {
					if (arr.length != 3) {
						throw new ck("commands.worldborder.warning.distance.usage");
					}

					int integer6 = a(arr[2], 0);
					int integer7 = auf5.q();
					auf5.c(integer6);
					a(n, this, "commands.worldborder.warning.distance.success", new Object[]{integer6, integer7});
				}
			} else {
				if (!"get".equals(arr[0])) {
					throw new ck("commands.worldborder.usage");
				}

				double double6 = auf5.h();
				n.a(o.a.QUERY_RESULT, ot.c(double6 + 0.5));
				n.a(new fi("commands.worldborder.get.success", String.format("%.0f", double6)));
			}
		}
	}

	protected auf a(MinecraftServer minecraftServer) {
		return minecraftServer.d[0].aj();
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, new String[]{"set", "center", "damage", "warning", "add", "get"});
		} else if (arr.length == 2 && "damage".equals(arr[0])) {
			return a(arr, new String[]{"buffer", "amount"});
		} else if (arr.length >= 2 && arr.length <= 3 && "center".equals(arr[0])) {
			return b(arr, 1, co);
		} else {
			return arr.length == 2 && "warning".equals(arr[0]) ? a(arr, new String[]{"time", "distance"}) : Collections.emptyList();
		}
	}
}
