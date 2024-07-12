import net.minecraft.server.MinecraftServer;

public class ml implements kg {
	private static final fb a = new fh("Status request has been handled.");
	private final MinecraftServer b;
	private final er c;
	private boolean d;

	public ml(MinecraftServer minecraftServer, er er) {
		this.b = minecraftServer;
		this.c = er;
	}

	@Override
	public void a(fb fb) {
	}

	@Override
	public void a(ki ki) {
		if (this.d) {
			this.c.a(a);
		} else {
			this.d = true;
			this.c.a(new ke(this.b.aC()));
		}
	}

	@Override
	public void a(kh kh) {
		this.c.a(new kd(kh.a()));
		this.c.a(a);
	}
}
