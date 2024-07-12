import com.mojang.authlib.GameProfile;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class x extends j {
	@Override
	public String c() {
		return "deop";
	}

	@Override
	public int a() {
		return 3;
	}

	@Override
	public String b(n n) {
		return "commands.deop.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length == 1 && arr[0].length() > 0) {
			GameProfile gameProfile5 = minecraftServer.am().m().a(arr[0]);
			if (gameProfile5 == null) {
				throw new cd("commands.deop.failed", arr[0]);
			} else {
				minecraftServer.am().b(gameProfile5);
				a(n, this, "commands.deop.success", new Object[]{arr[0]});
			}
		} else {
			throw new ck("commands.deop.usage");
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1 ? a(arr, minecraftServer.am().n()) : Collections.emptyList();
	}
}
