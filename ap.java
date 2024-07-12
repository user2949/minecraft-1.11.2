import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ap extends j {
	@Override
	public String c() {
		return "locate";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.locate.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length != 1) {
			throw new ck("commands.locate.usage");
		} else {
			String string5 = arr[0];
			co co6 = n.e().a(string5, n.c(), false);
			if (co6 != null) {
				n.a(new fi("commands.locate.success", string5, co6.p(), co6.r()));
			} else {
				throw new cd("commands.locate.failure", string5);
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1
			? a(arr, new String[]{"Stronghold", "Monument", "Village", "Mansion", "EndCity", "Fortress", "Temple", "Mineshaft"})
			: Collections.emptyList();
	}
}
