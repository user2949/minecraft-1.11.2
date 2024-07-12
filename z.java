import net.minecraft.server.MinecraftServer;

public class z extends ai {
	@Override
	public String c() {
		return "defaultgamemode";
	}

	@Override
	public String b(n n) {
		return "commands.defaultgamemode.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length <= 0) {
			throw new ck("commands.defaultgamemode.usage");
		} else {
			ajq ajq5 = this.c(n, arr[0]);
			this.a(ajq5, minecraftServer);
			a(n, this, "commands.defaultgamemode.success", new Object[]{new fi("gameMode." + ajq5.b())});
		}
	}

	protected void a(ajq ajq, MinecraftServer minecraftServer) {
		minecraftServer.a(ajq);
		if (minecraftServer.au()) {
			for (ly ly5 : minecraftServer.am().v()) {
				ly5.a(ajq);
			}
		}
	}
}
