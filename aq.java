import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class aq extends j {
	@Override
	public List<String> b() {
		return Arrays.asList("w", "msg");
	}

	@Override
	public String c() {
		return "tell";
	}

	@Override
	public int a() {
		return 0;
	}

	@Override
	public String b(n n) {
		return "commands.message.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 2) {
			throw new ck("commands.message.usage");
		} else {
			aay aay5 = a(minecraftServer, n, arr[0]);
			if (aay5 == n) {
				throw new ci("commands.message.sameTarget");
			} else {
				fb fb6 = b(n, arr, 1, !(n instanceof aay));
				fi fi7 = new fi("commands.message.display.incoming", n.i_(), fb6.f());
				fi fi8 = new fi("commands.message.display.outgoing", aay5.i_(), fb6.f());
				fi7.b().a(a.GRAY).b(true);
				fi8.b().a(a.GRAY).b(true);
				aay5.a(fi7);
				n.a(fi8);
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return a(arr, minecraftServer.J());
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}
}
