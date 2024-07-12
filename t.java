import com.mojang.authlib.GameProfile;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class t extends j {
	@Override
	public String c() {
		return "ban";
	}

	@Override
	public int a() {
		return 3;
	}

	@Override
	public String b(n n) {
		return "commands.ban.usage";
	}

	@Override
	public boolean a(MinecraftServer minecraftServer, n n) {
		return minecraftServer.am().h().b() && super.a(minecraftServer, n);
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length >= 1 && arr[0].length() > 0) {
			GameProfile gameProfile5 = minecraftServer.aB().a(arr[0]);
			if (gameProfile5 == null) {
				throw new cd("commands.ban.failed", arr[0]);
			} else {
				String string6 = null;
				if (arr.length >= 2) {
					string6 = a(n, arr, 1).c();
				}

				mz mz7 = new mz(gameProfile5, null, n.h_(), null, string6);
				minecraftServer.am().h().a(mz7);
				ly ly8 = minecraftServer.am().a(arr[0]);
				if (ly8 != null) {
					ly8.a.c("You are banned from this server.");
				}

				a(n, this, "commands.ban.success", new Object[]{arr[0]});
			}
		} else {
			throw new ck("commands.ban.usage");
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length >= 1 ? a(arr, minecraftServer.J()) : Collections.emptyList();
	}
}
