import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ai extends j {
	@Override
	public String c() {
		return "gamemode";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.gamemode.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length <= 0) {
			throw new ck("commands.gamemode.usage");
		} else {
			ajq ajq5 = this.c(n, arr[0]);
			aay aay6 = arr.length >= 2 ? a(minecraftServer, n, arr[1]) : a(n);
			aay6.a(ajq5);
			fb fb7 = new fi("gameMode." + ajq5.b());
			if (n.e().U().b("sendCommandFeedback")) {
				aay6.a(new fi("gameMode.changed", fb7));
			}

			if (aay6 == n) {
				a(n, this, 1, "commands.gamemode.success.self", new Object[]{fb7});
			} else {
				a(n, this, 1, "commands.gamemode.success.other", new Object[]{aay6.h_(), fb7});
			}
		}
	}

	protected ajq c(n n, String string) throws cg {
		ajq ajq4 = ajq.a(string, ajq.NOT_SET);
		return ajq4 == ajq.NOT_SET ? ajv.a(a(string, 0, ajq.values().length - 2)) : ajq4;
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, new String[]{"survival", "creative", "adventure", "spectator"});
		} else {
			return arr.length == 2 ? a(arr, minecraftServer.J()) : Collections.emptyList();
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 1;
	}
}
