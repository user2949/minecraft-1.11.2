import net.minecraft.server.MinecraftServer;

public class mj implements jq {
	private final MinecraftServer a;
	private final er b;

	public mj(MinecraftServer minecraftServer, er er) {
		this.a = minecraftServer;
		this.b = er;
	}

	@Override
	public void a(jp jp) {
		switch (jp.a()) {
			case LOGIN:
				this.b.a(es.LOGIN);
				if (jp.b() > 316) {
					fh fh3 = new fh("Outdated server! I'm still on 1.11.2");
					this.b.a(new jw(fh3));
					this.b.a(fh3);
				} else if (jp.b() < 316) {
					fh fh3 = new fh("Outdated client! Please use 1.11.2");
					this.b.a(new jw(fh3));
					this.b.a(fh3);
				} else {
					this.b.a(new mk(this.a, this.b));
				}
				break;
			case STATUS:
				this.b.a(es.STATUS);
				this.b.a(new ml(this.a, this.b));
				break;
			default:
				throw new UnsupportedOperationException("Invalid intention " + jp.a());
		}
	}

	@Override
	public void a(fb fb) {
	}
}
