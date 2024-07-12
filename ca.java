import com.mojang.authlib.GameProfile;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ca extends j {
	@Override
	public String c() {
		return "whitelist";
	}

	@Override
	public int a() {
		return 3;
	}

	@Override
	public String b(n n) {
		return "commands.whitelist.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 1) {
			throw new ck("commands.whitelist.usage");
		} else {
			if ("on".equals(arr[0])) {
				minecraftServer.am().a(true);
				a(n, this, "commands.whitelist.enabled", new Object[0]);
			} else if ("off".equals(arr[0])) {
				minecraftServer.am().a(false);
				a(n, this, "commands.whitelist.disabled", new Object[0]);
			} else if ("list".equals(arr[0])) {
				n.a(new fi("commands.whitelist.list", minecraftServer.am().l().length, minecraftServer.am().q().length));
				String[] arr5 = minecraftServer.am().l();
				n.a(new fh(a(arr5)));
			} else if ("add".equals(arr[0])) {
				if (arr.length < 2) {
					throw new ck("commands.whitelist.add.usage");
				}

				GameProfile gameProfile5 = minecraftServer.aB().a(arr[1]);
				if (gameProfile5 == null) {
					throw new cd("commands.whitelist.add.failed", arr[1]);
				}

				minecraftServer.am().d(gameProfile5);
				a(n, this, "commands.whitelist.add.success", new Object[]{arr[1]});
			} else if ("remove".equals(arr[0])) {
				if (arr.length < 2) {
					throw new ck("commands.whitelist.remove.usage");
				}

				GameProfile gameProfile5 = minecraftServer.am().k().a(arr[1]);
				if (gameProfile5 == null) {
					throw new cd("commands.whitelist.remove.failed", arr[1]);
				}

				minecraftServer.am().c(gameProfile5);
				a(n, this, "commands.whitelist.remove.success", new Object[]{arr[1]});
			} else if ("reload".equals(arr[0])) {
				minecraftServer.am().a();
				a(n, this, "commands.whitelist.reloaded", new Object[0]);
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, new String[]{"on", "off", "list", "add", "remove", "reload"});
		} else {
			if (arr.length == 2) {
				if ("remove".equals(arr[0])) {
					return a(arr, minecraftServer.am().l());
				}

				if ("add".equals(arr[0])) {
					return a(arr, minecraftServer.aB().a());
				}
			}

			return Collections.emptyList();
		}
	}
}
