import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bb extends j {
	@Override
	public String c() {
		return "say";
	}

	@Override
	public int a() {
		return 1;
	}

	@Override
	public String b(n n) {
		return "commands.say.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length > 0 && arr[0].length() > 0) {
			fb fb5 = b(n, arr, 0, true);
			minecraftServer.am().a(new fi("chat.type.announcement", n.i_(), fb5));
		} else {
			throw new ck("commands.say.usage");
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length >= 1 ? a(arr, minecraftServer.J()) : Collections.emptyList();
	}
}
