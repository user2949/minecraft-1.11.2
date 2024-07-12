import net.minecraft.server.MinecraftServer;

public class ao extends j {
	@Override
	public String c() {
		return "list";
	}

	@Override
	public int a() {
		return 0;
	}

	@Override
	public String b(n n) {
		return "commands.players.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		int integer5 = minecraftServer.H();
		n.a(new fi("commands.players.list", integer5, minecraftServer.I()));
		n.a(new fh(minecraftServer.am().b(arr.length > 0 && "uuids".equalsIgnoreCase(arr[0]))));
		n.a(o.a.QUERY_RESULT, integer5);
	}
}
