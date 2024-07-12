import net.minecraft.server.MinecraftServer;

public class bw extends j {
	@Override
	public String c() {
		return "toggledownfall";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.downfall.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		this.a(minecraftServer);
		a(n, this, "commands.downfall.success", new Object[0]);
	}

	protected void a(MinecraftServer minecraftServer) {
		bbv bbv3 = minecraftServer.d[0].T();
		bbv3.b(!bbv3.o());
	}
}
