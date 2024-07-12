import net.minecraft.server.MinecraftServer;

public class bd extends k implements i {
	private final MinecraftServer a;

	public bd(MinecraftServer minecraftServer) {
		this.a = minecraftServer;
		this.a(new bu());
		this.a(new ai());
		this.a(new ah());
		this.a(new z());
		this.a(new an());
		this.a(new bw());
		this.a(new bz());
		this.a(new af());
		this.a(new bx());
		this.a(new bo());
		this.a(new ak());
		this.a(new ax());
		this.a(new bk());
		this.a(new aa());
		this.a(new ac());
		this.a(new au());
		this.a(new ab());
		this.a(new bi());
		this.a(new al());
		this.a(new y());
		this.a(new aq());
		this.a(new bb());
		this.a(new bg());
		this.a(new bh());
		this.a(new aj());
		this.a(new v());
		this.a(new bt());
		this.a(new bj());
		this.a(new av());
		this.a(new bc());
		this.a(new ae());
		this.a(new by());
		this.a(new q());
		this.a(new bn());
		this.a(new be());
		this.a(new ag());
		this.a(new w());
		this.a(new bs());
		this.a(new u());
		this.a(new br());
		this.a(new bp());
		this.a(new cb());
		this.a(new bv());
		this.a(new ad());
		this.a(new bm());
		this.a(new ap());
		if (minecraftServer.aa()) {
			this.a(new ar());
			this.a(new x());
			this.a(new bl());
			this.a(new ay());
			this.a(new az());
			this.a(new ba());
			this.a(new r());
			this.a(new as());
			this.a(new t());
			this.a(new s());
			this.a(new at());
			this.a(new am());
			this.a(new ao());
			this.a(new ca());
			this.a(new bf());
		} else {
			this.a(new aw());
		}

		j.a(this);
	}

	@Override
	public void a(n n, l l, int integer, String string, Object... arr) {
		boolean boolean7 = true;
		MinecraftServer minecraftServer8 = this.a;
		if (!n.g()) {
			boolean7 = false;
		}

		fb fb9 = new fi("chat.type.admin", n.h_(), new fi(string, arr));
		fb9.b().a(a.GRAY);
		fb9.b().b(true);
		if (boolean7) {
			for (aay aay11 : minecraftServer8.am().v()) {
				if (aay11 != n && minecraftServer8.am().h(aay11.cS()) && l.a(this.a, n)) {
					boolean boolean12 = n instanceof MinecraftServer && this.a.s();
					boolean boolean13 = n instanceof nf && this.a.r();
					if (boolean12 || boolean13 || !(n instanceof nf) && !(n instanceof MinecraftServer)) {
						aay11.a(fb9);
					}
				}
			}
		}

		if (n != minecraftServer8 && minecraftServer8.d[0].U().b("logAdminCommands")) {
			minecraftServer8.a(fb9);
		}

		boolean boolean10 = minecraftServer8.d[0].U().b("sendCommandFeedback");
		if (n instanceof ajh) {
			boolean10 = ((ajh)n).n();
		}

		if ((integer & 1) != 1 && boolean10 || n instanceof MinecraftServer) {
			n.a(new fi(string, arr));
		}
	}

	@Override
	protected MinecraftServer a() {
		return this.a;
	}
}
