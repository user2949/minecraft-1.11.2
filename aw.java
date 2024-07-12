import net.minecraft.server.MinecraftServer;

public class aw extends j {
	@Override
	public String c() {
		return "publish";
	}

	@Override
	public String b(n n) {
		return "commands.publish.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		String string5 = minecraftServer.a(ajq.SURVIVAL, false);
		if (string5 != null) {
			a(n, this, "commands.publish.started", new Object[]{string5});
		} else {
			a(n, this, "commands.publish.failed", new Object[0]);
		}
	}
}
