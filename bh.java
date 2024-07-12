import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bh extends j {
	@Override
	public String c() {
		return "setworldspawn";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.setworldspawn.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		co co5;
		if (arr.length == 0) {
			co5 = a(n).c();
		} else {
			if (arr.length != 3 || n.e() == null) {
				throw new ck("commands.setworldspawn.usage");
			}

			co5 = a(n, arr, 0, true);
		}

		n.e().A(co5);
		minecraftServer.am().a(new ic(co5));
		a(n, this, "commands.setworldspawn.success", new Object[]{co5.p(), co5.q(), co5.r()});
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length > 0 && arr.length <= 3 ? a(arr, 0, co) : Collections.emptyList();
	}
}
