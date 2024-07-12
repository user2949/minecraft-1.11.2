import net.minecraft.server.MinecraftServer;

public class mg implements jq {
	private final MinecraftServer a;
	private final er b;

	public mg(MinecraftServer minecraftServer, er er) {
		this.a = minecraftServer;
		this.b = er;
	}

	@Override
	public void a(jp jp) {
		this.b.a(jp.a());
		this.b.a(new mk(this.a, this.b));
	}

	@Override
	public void a(fb fb) {
	}
}
