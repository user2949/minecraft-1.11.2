import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bg extends j {
	@Override
	public String c() {
		return "spawnpoint";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.spawnpoint.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length > 1 && arr.length < 4) {
			throw new ck("commands.spawnpoint.usage");
		} else {
			ly ly5 = arr.length > 0 ? a(minecraftServer, n, arr[0]) : a(n);
			co co6 = arr.length > 3 ? a(n, arr, 1, true) : ly5.c();
			if (ly5.l != null) {
				ly5.a(co6, true);
				a(n, this, "commands.spawnpoint.success", new Object[]{ly5.h_(), co6.p(), co6.q(), co6.r()});
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, minecraftServer.J());
		} else {
			return arr.length > 1 && arr.length <= 4 ? a(arr, 1, co) : Collections.emptyList();
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
