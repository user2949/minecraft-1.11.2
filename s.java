import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class s extends j {
	@Override
	public String c() {
		return "banlist";
	}

	@Override
	public int a() {
		return 3;
	}

	@Override
	public boolean a(MinecraftServer minecraftServer, n n) {
		return (minecraftServer.am().i().b() || minecraftServer.am().h().b()) && super.a(minecraftServer, n);
	}

	@Override
	public String b(n n) {
		return "commands.banlist.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length >= 1 && "ips".equalsIgnoreCase(arr[0])) {
			n.a(new fi("commands.banlist.ips", minecraftServer.am().i().a().length));
			n.a(new fh(a(minecraftServer.am().i().a())));
		} else {
			n.a(new fi("commands.banlist.players", minecraftServer.am().h().a().length));
			n.a(new fh(a(minecraftServer.am().h().a())));
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1 ? a(arr, new String[]{"players", "ips"}) : Collections.emptyList();
	}
}
