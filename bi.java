import net.minecraft.server.MinecraftServer;

public class bi extends j {
	@Override
	public boolean a(MinecraftServer minecraftServer, n n) {
		return minecraftServer.R() || super.a(minecraftServer, n);
	}

	@Override
	public String c() {
		return "seed";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.seed.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		ajs ajs5 = (ajs)(n instanceof aay ? ((aay)n).l : minecraftServer.a(0));
		n.a(new fi("commands.seed.success", ajs5.O()));
	}
}
