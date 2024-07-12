import net.minecraft.server.MinecraftServer;

public class nf implements n {
	private final StringBuffer a = new StringBuffer();
	private final MinecraftServer b;

	public nf(MinecraftServer minecraftServer) {
		this.b = minecraftServer;
	}

	@Override
	public String h_() {
		return "Rcon";
	}

	@Override
	public fb i_() {
		return new fh(this.h_());
	}

	@Override
	public void a(fb fb) {
		this.a.append(fb.c());
	}

	@Override
	public boolean a(int integer, String string) {
		return true;
	}

	@Override
	public co c() {
		return co.a;
	}

	@Override
	public bdw d() {
		return bdw.a;
	}

	@Override
	public ajs e() {
		return this.b.e();
	}

	@Override
	public sn f() {
		return null;
	}

	@Override
	public boolean g() {
		return true;
	}

	@Override
	public void a(o.a a, int integer) {
	}

	@Override
	public MinecraftServer B_() {
		return this.b;
	}
}
