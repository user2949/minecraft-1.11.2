import net.minecraft.server.MinecraftServer;

public class bl extends j {
	@Override
	public String c() {
		return "stop";
	}

	@Override
	public String b(n n) {
		return "commands.stop.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (minecraftServer.d != null) {
			a(n, this, "commands.stop.start", new Object[0]);
		}

		minecraftServer.x();
	}
}
