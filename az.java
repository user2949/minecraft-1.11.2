import net.minecraft.server.MinecraftServer;

public class az extends j {
	@Override
	public String c() {
		return "save-off";
	}

	@Override
	public String b(n n) {
		return "commands.save-off.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		boolean boolean5 = false;

		for (int integer6 = 0; integer6 < minecraftServer.d.length; integer6++) {
			if (minecraftServer.d[integer6] != null) {
				lw lw7 = minecraftServer.d[integer6];
				if (!lw7.b) {
					lw7.b = true;
					boolean5 = true;
				}
			}
		}

		if (boolean5) {
			a(n, this, "commands.save.disabled", new Object[0]);
		} else {
			throw new cd("commands.save-off.alreadyOff");
		}
	}
}
