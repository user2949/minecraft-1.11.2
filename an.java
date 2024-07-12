import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class an extends j {
	@Override
	public String c() {
		return "kill";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.kill.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length == 0) {
			aay aay5 = a(n);
			aay5.Q();
			a(n, this, "commands.kill.successful", new Object[]{aay5.i_()});
		} else {
			sn sn5 = b(minecraftServer, n, arr[0]);
			sn5.Q();
			a(n, this, "commands.kill.successful", new Object[]{sn5.i_()});
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 0;
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1 ? a(arr, minecraftServer.J()) : Collections.emptyList();
	}
}
