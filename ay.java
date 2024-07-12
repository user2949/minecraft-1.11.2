import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ay extends j {
	@Override
	public String c() {
		return "save-all";
	}

	@Override
	public String b(n n) {
		return "commands.save.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		n.a(new fi("commands.save.start"));
		if (minecraftServer.am() != null) {
			minecraftServer.am().j();
		}

		try {
			for (int integer5 = 0; integer5 < minecraftServer.d.length; integer5++) {
				if (minecraftServer.d[integer5] != null) {
					lw lw6 = minecraftServer.d[integer5];
					boolean boolean7 = lw6.b;
					lw6.b = false;
					lw6.a(true, null);
					lw6.b = boolean7;
				}
			}

			if (arr.length > 0 && "flush".equals(arr[0])) {
				n.a(new fi("commands.save.flushStart"));

				for (int integer5x = 0; integer5x < minecraftServer.d.length; integer5x++) {
					if (minecraftServer.d[integer5x] != null) {
						lw lw6 = minecraftServer.d[integer5x];
						boolean boolean7 = lw6.b;
						lw6.b = false;
						lw6.q();
						lw6.b = boolean7;
					}
				}

				n.a(new fi("commands.save.flushEnd"));
			}
		} catch (ajt var7) {
			a(n, this, "commands.save.failed", new Object[]{var7.getMessage()});
			return;
		}

		a(n, this, "commands.save.success", new Object[0]);
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length == 1 ? a(arr, new String[]{"flush"}) : Collections.emptyList();
	}
}
