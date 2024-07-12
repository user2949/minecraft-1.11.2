import net.minecraft.server.MinecraftServer;

public class bf extends j {
	@Override
	public String c() {
		return "setidletimeout";
	}

	@Override
	public int a() {
		return 3;
	}

	@Override
	public String b(n n) {
		return "commands.setidletimeout.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length != 1) {
			throw new ck("commands.setidletimeout.usage");
		} else {
			int integer5 = a(arr[0], 0);
			minecraftServer.d(integer5);
			a(n, this, "commands.setidletimeout.success", new Object[]{integer5});
		}
	}
}
