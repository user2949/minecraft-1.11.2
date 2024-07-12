import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class am extends j {
	@Override
	public String c() {
		return "kick";
	}

	@Override
	public int a() {
		return 3;
	}

	@Override
	public String b(n n) {
		return "commands.kick.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length > 0 && arr[0].length() > 1) {
			ly ly5 = minecraftServer.am().a(arr[0]);
			String string6 = "Kicked by an operator.";
			boolean boolean7 = false;
			if (ly5 == null) {
				throw new ci("commands.generic.player.notFound", arr[0]);
			} else {
				if (arr.length >= 2) {
					string6 = a(n, arr, 1).c();
					boolean7 = true;
				}

				ly5.a.c(string6);
				if (boolean7) {
					a(n, this, "commands.kick.success.reason", new Object[]{ly5.h_(), string6});
				} else {
					a(n, this, "commands.kick.success", new Object[]{ly5.h_()});
				}
			}
		} else {
			throw new ck("commands.kick.usage");
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length >= 1 ? a(arr, minecraftServer.J()) : Collections.emptyList();
	}
}
