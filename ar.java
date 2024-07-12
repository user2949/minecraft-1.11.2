import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ar extends j {
	@Override
	public String c() {
		return "op";
	}

	@Override
	public int a() {
		return 3;
	}

	@Override
	public String b(n n) {
		return "commands.op.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length == 1 && arr[0].length() > 0) {
			GameProfile gameProfile5 = minecraftServer.aB().a(arr[0]);
			if (gameProfile5 == null) {
				throw new cd("commands.op.failed", arr[0]);
			} else {
				minecraftServer.am().a(gameProfile5);
				a(n, this, "commands.op.success", new Object[]{arr[0]});
			}
		} else {
			throw new ck("commands.op.usage");
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			String string6 = arr[arr.length - 1];
			List<String> list7 = Lists.newArrayList();

			for (GameProfile gameProfile11 : minecraftServer.K()) {
				if (!minecraftServer.am().h(gameProfile11) && a(string6, gameProfile11.getName())) {
					list7.add(gameProfile11.getName());
				}
			}

			return list7;
		} else {
			return Collections.emptyList();
		}
	}
}
