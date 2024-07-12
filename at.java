import com.mojang.authlib.GameProfile;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class at extends j {
	@Override
	public String c() {
		return "pardon";
	}

	@Override
	public int a() {
		return 3;
	}

	@Override
	public String b(n n) {
		return "commands.unban.usage";
	}

	@Override
	public boolean a(MinecraftServer minecraftServer, n n) {
		return minecraftServer.am().h().b() && super.a(minecraftServer, n);
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length == 1 && arr[0].length() > 0) {
			GameProfile gameProfile5 = minecraftServer.am().h().a(arr[0]);
			if (gameProfile5 == null) {
				throw new cd("commands.unban.failed", arr[0]);
			} else {
				minecraftServer.am().h().c(gameProfile5);
				a(n, this, "commands.unban.success", new Object[]{arr[0]});
			}
		} else {
			throw new ck("commands.unban.usage");
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1 ? a(arr, minecraftServer.am().h().a()) : Collections.emptyList();
	}
}
