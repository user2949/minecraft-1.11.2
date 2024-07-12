import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ab extends j {
	@Override
	public String c() {
		return "me";
	}

	@Override
	public int a() {
		return 0;
	}

	@Override
	public String b(n n) {
		return "commands.me.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length <= 0) {
			throw new ck("commands.me.usage");
		} else {
			fb fb5 = b(n, arr, 0, !(n instanceof aay));
			minecraftServer.am().a(new fi("chat.type.emote", n.i_(), fb5));
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return a(arr, minecraftServer.J());
	}
}
