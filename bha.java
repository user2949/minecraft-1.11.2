import java.net.URI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bha extends bho {
	private static final Logger a = LogManager.getLogger();
	private static final kq f = new kq("textures/gui/demo_background.png");

	@Override
	public void b() {
		this.n.clear();
		int integer2 = -16;
		this.n.add(new bfm(1, this.l / 2 - 116, this.m / 2 + 62 + -16, 114, 20, cah.a("demo.help.buy")));
		this.n.add(new bfm(2, this.l / 2 + 2, this.m / 2 + 62 + -16, 114, 20, cah.a("demo.help.later")));
	}

	@Override
	protected void a(bfm bfm) {
		switch (bfm.k) {
			case 1:
				bfm.l = false;

				try {
					Class<?> class3 = Class.forName("java.awt.Desktop");
					Object object4 = class3.getMethod("getDesktop").invoke(null);
					class3.getMethod("browse", URI.class).invoke(object4, new URI("http://www.minecraft.net/store?source=demo"));
				} catch (Throwable var4) {
					a.error("Couldn't open link", var4);
				}
				break;
			case 2:
				this.j.a(null);
				this.j.o();
		}
	}

	@Override
	public void c() {
		super.c();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(f);
		int integer2 = (this.l - 248) / 2;
		int integer3 = (this.m - 166) / 2;
		this.b(integer2, integer3, 0, 0, 248, 166);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		int integer5 = (this.l - 248) / 2 + 10;
		int integer6 = (this.m - 166) / 2 + 8;
		this.q.a(cah.a("demo.help.title"), integer5, integer6, 2039583);
		integer6 += 12;
		beu beu7 = this.j.u;
		this.q.a(cah.a("demo.help.movementShort", beu.c(beu7.S.j()), beu.c(beu7.T.j()), beu.c(beu7.U.j()), beu.c(beu7.V.j())), integer5, integer6, 5197647);
		this.q.a(cah.a("demo.help.movementMouse"), integer5, integer6 + 12, 5197647);
		this.q.a(cah.a("demo.help.jump", beu.c(beu7.W.j())), integer5, integer6 + 24, 5197647);
		this.q.a(cah.a("demo.help.inventory", beu.c(beu7.Z.j())), integer5, integer6 + 36, 5197647);
		this.q.a(cah.a("demo.help.fullWrapped"), integer5, integer6 + 68, 218, 2039583);
		super.a(integer1, integer2, float3);
	}
}
