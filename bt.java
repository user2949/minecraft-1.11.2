import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bt extends j {
	@Override
	public String c() {
		return "testfor";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.testfor.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 1) {
			throw new ck("commands.testfor.usage");
		} else {
			sn sn5 = b(minecraftServer, n, arr[0]);
			du du6 = null;
			if (arr.length >= 2) {
				try {
					du6 = ek.a(a(arr, 1));
				} catch (ej var7) {
					throw new cd("commands.testfor.tagError", var7.getMessage());
				}
			}

			if (du6 != null) {
				du du7 = a(sn5);
				if (!ee.a(du6, du7, true)) {
					throw new cd("commands.testfor.failure", sn5.h_());
				}
			}

			a(n, this, "commands.testfor.success", new Object[]{sn5.h_()});
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
