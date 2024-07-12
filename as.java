import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class as extends j {
	@Override
	public String c() {
		return "pardon-ip";
	}

	@Override
	public int a() {
		return 3;
	}

	@Override
	public boolean a(MinecraftServer minecraftServer, n n) {
		return minecraftServer.am().i().b() && super.a(minecraftServer, n);
	}

	@Override
	public String b(n n) {
		return "commands.unbanip.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length == 1 && arr[0].length() > 1) {
			Matcher matcher5 = r.a.matcher(arr[0]);
			if (matcher5.matches()) {
				minecraftServer.am().i().c(arr[0]);
				a(n, this, "commands.unbanip.success", new Object[]{arr[0]});
			} else {
				throw new ch("commands.unbanip.invalid");
			}
		} else {
			throw new ck("commands.unbanip.usage");
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1 ? a(arr, minecraftServer.am().i().a()) : Collections.emptyList();
	}
}
