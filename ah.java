import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ah extends j {
	@Override
	public String c() {
		return "difficulty";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.difficulty.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length <= 0) {
			throw new ck("commands.difficulty.usage");
		} else {
			rg rg5 = this.e(arr[0]);
			minecraftServer.a(rg5);
			a(n, this, "commands.difficulty.success", new Object[]{new fi(rg5.b())});
		}
	}

	protected rg e(String string) throws cg {
		if ("peaceful".equalsIgnoreCase(string) || "p".equalsIgnoreCase(string)) {
			return rg.PEACEFUL;
		} else if ("easy".equalsIgnoreCase(string) || "e".equalsIgnoreCase(string)) {
			return rg.EASY;
		} else if ("normal".equalsIgnoreCase(string) || "n".equalsIgnoreCase(string)) {
			return rg.NORMAL;
		} else {
			return !"hard".equalsIgnoreCase(string) && !"h".equalsIgnoreCase(string) ? rg.a(a(string, 0, 3)) : rg.HARD;
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1 ? a(arr, new String[]{"peaceful", "easy", "normal", "hard"}) : Collections.emptyList();
	}
}
