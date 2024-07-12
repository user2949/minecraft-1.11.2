import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import net.minecraft.realms.RealmsBridge;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public class bhv extends bho {
	private static final Logger f = LogManager.getLogger();
	private static final Random g = new Random();
	private final float h;
	private String i;
	private bfm r;
	private int s;
	private byp t;
	private final Object u = new Object();
	public static final String a = "Please click " + a.UNDERLINE + "here" + a.RESET + " for more information.";
	private int v;
	private int w;
	private int x;
	private int y;
	private int z;
	private int A;
	private String B;
	private String C = a;
	private String D;
	private static final kq E = new kq("texts/splashes.txt");
	private static final kq F = new kq("textures/gui/title/minecraft.png");
	private static final kq[] G = new kq[]{
		new kq("textures/gui/title/background/panorama_0.png"),
		new kq("textures/gui/title/background/panorama_1.png"),
		new kq("textures/gui/title/background/panorama_2.png"),
		new kq("textures/gui/title/background/panorama_3.png"),
		new kq("textures/gui/title/background/panorama_4.png"),
		new kq("textures/gui/title/background/panorama_5.png")
	};
	private kq H;
	private bfm I;
	private boolean J;
	private bho K;

	public bhv() {
		this.i = "missingno";
		bzx bzx2 = null;

		try {
			List<String> list3 = Lists.newArrayList();
			bzx2 = bes.z().O().a(E);
			BufferedReader bufferedReader4 = new BufferedReader(new InputStreamReader(bzx2.b(), Charsets.UTF_8));

			String string5;
			while ((string5 = bufferedReader4.readLine()) != null) {
				string5 = string5.trim();
				if (!string5.isEmpty()) {
					list3.add(string5);
				}
			}

			if (!list3.isEmpty()) {
				do {
					this.i = (String)list3.get(g.nextInt(list3.size()));
				} while (this.i.hashCode() == 125780783);
			}
		} catch (IOException var8) {
		} finally {
			IOUtils.closeQuietly(bzx2);
		}

		this.h = g.nextFloat();
		this.B = "";
		if (!GLContext.getCapabilities().OpenGL20 && !cdb.b()) {
			this.B = cah.a("title.oldgl1");
			this.C = cah.a("title.oldgl2");
			this.D = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
		}

		String string3 = System.getProperty("java.version");
		if (string3 != null && (string3.startsWith("1.6") || string3.startsWith("1.7"))) {
			this.B = cah.a("title.oldjava1");
			this.C = cah.a("title.oldjava2");
			this.D = "https://help.mojang.com/customer/portal/articles/2636196?ref=game";
		}
	}

	private boolean a() {
		return bes.z().u.b(beu.a.REALMS_NOTIFICATIONS) && this.K != null;
	}

	@Override
	public void e() {
		this.s++;
		if (this.a()) {
			this.K.e();
		}
	}

	@Override
	public boolean d() {
		return false;
	}

	@Override
	protected void a(char character, int integer) {
	}

	@Override
	public void b() {
		this.t = new byp(256, 256);
		this.H = this.j.N().a("background", this.t);
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(new Date());
		if (calendar2.get(2) + 1 == 12 && calendar2.get(5) == 24) {
			this.i = "Merry X-mas!";
		} else if (calendar2.get(2) + 1 == 1 && calendar2.get(5) == 1) {
			this.i = "Happy new year!";
		} else if (calendar2.get(2) + 1 == 10 && calendar2.get(5) == 31) {
			this.i = "OOoooOOOoooo! Spooky!";
		}

		int integer3 = 24;
		int integer4 = this.m / 4 + 48;
		if (this.j.u()) {
			this.c(integer4, 24);
		} else {
			this.b(integer4, 24);
		}

		this.n.add(new bfm(0, this.l / 2 - 100, integer4 + 72 + 12, 98, 20, cah.a("menu.options")));
		this.n.add(new bfm(4, this.l / 2 + 2, integer4 + 72 + 12, 98, 20, cah.a("menu.quit")));
		this.n.add(new bft(5, this.l / 2 - 124, integer4 + 72 + 12));
		synchronized (this.u) {
			this.w = this.q.a(this.B);
			this.v = this.q.a(this.C);
			int integer6 = Math.max(this.w, this.v);
			this.x = (this.l - integer6) / 2;
			this.y = ((bfm)this.n.get(0)).i - 24;
			this.z = this.x + integer6;
			this.A = this.y + 24;
		}

		this.j.a(false);
		if (bes.z().u.b(beu.a.REALMS_NOTIFICATIONS) && !this.J) {
			RealmsBridge realmsBridge5 = new RealmsBridge();
			this.K = realmsBridge5.getNotificationScreen(this);
			this.J = true;
		}

		if (this.a()) {
			this.K.a(this.l, this.m);
			this.K.b();
		}
	}

	private void b(int integer1, int integer2) {
		this.n.add(new bfm(1, this.l / 2 - 100, integer1, cah.a("menu.singleplayer")));
		this.n.add(new bfm(2, this.l / 2 - 100, integer1 + integer2 * 1, cah.a("menu.multiplayer")));
		this.I = this.b(new bfm(14, this.l / 2 - 100, integer1 + integer2 * 2, cah.a("menu.online")));
	}

	private void c(int integer1, int integer2) {
		this.n.add(new bfm(11, this.l / 2 - 100, integer1, cah.a("menu.playdemo")));
		this.r = this.b(new bfm(12, this.l / 2 - 100, integer1 + integer2 * 1, cah.a("menu.resetdemo")));
		bby bby4 = this.j.g();
		bbv bbv5 = bby4.c("Demo_World");
		if (bbv5 == null) {
			this.r.l = false;
		}
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == 0) {
			this.j.a(new bhi(this, this.j.u));
		}

		if (bfm.k == 5) {
			this.j.a(new bhg(this, this.j.u, this.j.Q()));
		}

		if (bfm.k == 1) {
			this.j.a(new bka(this));
		}

		if (bfm.k == 2) {
			this.j.a(new bjf(this));
		}

		if (bfm.k == 14 && this.I.m) {
			this.f();
		}

		if (bfm.k == 4) {
			this.j.n();
		}

		if (bfm.k == 11) {
			this.j.a("Demo_World", "Demo_World", lq.a);
		}

		if (bfm.k == 12) {
			bby bby3 = this.j.g();
			bbv bbv4 = bby3.c("Demo_World");
			if (bbv4 != null) {
				this.j
					.a(
						new bgu(
							this,
							cah.a("selectWorld.deleteQuestion"),
							"'" + bbv4.j() + "' " + cah.a("selectWorld.deleteWarning"),
							cah.a("selectWorld.deleteButton"),
							cah.a("gui.cancel"),
							12
						)
					);
			}
		}
	}

	private void f() {
		RealmsBridge realmsBridge2 = new RealmsBridge();
		realmsBridge2.switchToRealms(this);
	}

	@Override
	public void a(boolean boolean1, int integer) {
		if (boolean1 && integer == 12) {
			bby bby4 = this.j.g();
			bby4.d();
			bby4.e("Demo_World");
			this.j.a(this);
		} else if (integer == 12) {
			this.j.a(this);
		} else if (integer == 13) {
			if (boolean1) {
				try {
					Class<?> class4 = Class.forName("java.awt.Desktop");
					Object object5 = class4.getMethod("getDesktop").invoke(null);
					class4.getMethod("browse", URI.class).invoke(object5, new URI(this.D));
				} catch (Throwable var5) {
					f.error("Couldn't open link", var5);
				}
			}

			this.j.a(this);
		}
	}

	private void b(int integer1, int integer2, float float3) {
		bqs bqs5 = bqs.a();
		bpy bpy6 = bqs5.c();
		bqg.n(5889);
		bqg.G();
		bqg.F();
		Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
		bqg.n(5888);
		bqg.G();
		bqg.F();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.b(180.0F, 1.0F, 0.0F, 0.0F);
		bqg.b(90.0F, 0.0F, 0.0F, 1.0F);
		bqg.m();
		bqg.d();
		bqg.r();
		bqg.a(false);
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		int integer7 = 8;

		for (int integer8 = 0; integer8 < 64; integer8++) {
			bqg.G();
			float float9 = ((float)(integer8 % 8) / 8.0F - 0.5F) / 64.0F;
			float float10 = ((float)(integer8 / 8) / 8.0F - 0.5F) / 64.0F;
			float float11 = 0.0F;
			bqg.c(float9, float10, 0.0F);
			bqg.b(ot.a(((float)this.s + float3) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
			bqg.b(-((float)this.s + float3) * 0.1F, 0.0F, 1.0F, 0.0F);

			for (int integer12 = 0; integer12 < 6; integer12++) {
				bqg.G();
				if (integer12 == 1) {
					bqg.b(90.0F, 0.0F, 1.0F, 0.0F);
				}

				if (integer12 == 2) {
					bqg.b(180.0F, 0.0F, 1.0F, 0.0F);
				}

				if (integer12 == 3) {
					bqg.b(-90.0F, 0.0F, 1.0F, 0.0F);
				}

				if (integer12 == 4) {
					bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
				}

				if (integer12 == 5) {
					bqg.b(-90.0F, 1.0F, 0.0F, 0.0F);
				}

				this.j.N().a(G[integer12]);
				bpy6.a(7, bzh.i);
				int integer13 = 255 / (integer8 + 1);
				float float14 = 0.0F;
				bpy6.b(-1.0, -1.0, 1.0).a(0.0, 0.0).b(255, 255, 255, integer13).d();
				bpy6.b(1.0, -1.0, 1.0).a(1.0, 0.0).b(255, 255, 255, integer13).d();
				bpy6.b(1.0, 1.0, 1.0).a(1.0, 1.0).b(255, 255, 255, integer13).d();
				bpy6.b(-1.0, 1.0, 1.0).a(0.0, 1.0).b(255, 255, 255, integer13).d();
				bqs5.b();
				bqg.H();
			}

			bqg.H();
			bqg.a(true, true, true, false);
		}

		bpy6.c(0.0, 0.0, 0.0);
		bqg.a(true, true, true, true);
		bqg.n(5889);
		bqg.H();
		bqg.n(5888);
		bqg.H();
		bqg.a(true);
		bqg.q();
		bqg.k();
	}

	private void a(float float1) {
		this.j.N().a(this.H);
		bqg.b(3553, 10241, 9729);
		bqg.b(3553, 10240, 9729);
		bqg.a(3553, 0, 0, 0, 0, 0, 256, 256);
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.a(true, true, true, false);
		bqs bqs3 = bqs.a();
		bpy bpy4 = bqs3.c();
		bpy4.a(7, bzh.i);
		bqg.d();
		int integer5 = 3;

		for (int integer6 = 0; integer6 < 3; integer6++) {
			float float7 = 1.0F / (float)(integer6 + 1);
			int integer8 = this.l;
			int integer9 = this.m;
			float float10 = (float)(integer6 - 1) / 256.0F;
			bpy4.b((double)integer8, (double)integer9, (double)this.e).a((double)(0.0F + float10), 1.0).a(1.0F, 1.0F, 1.0F, float7).d();
			bpy4.b((double)integer8, 0.0, (double)this.e).a((double)(1.0F + float10), 1.0).a(1.0F, 1.0F, 1.0F, float7).d();
			bpy4.b(0.0, 0.0, (double)this.e).a((double)(1.0F + float10), 0.0).a(1.0F, 1.0F, 1.0F, float7).d();
			bpy4.b(0.0, (double)integer9, (double)this.e).a((double)(0.0F + float10), 0.0).a(1.0F, 1.0F, 1.0F, float7).d();
		}

		bqs3.b();
		bqg.e();
		bqg.a(true, true, true, true);
	}

	private void c(int integer1, int integer2, float float3) {
		this.j.b().e();
		bqg.b(0, 0, 256, 256);
		this.b(integer1, integer2, float3);
		this.a(float3);
		this.a(float3);
		this.a(float3);
		this.a(float3);
		this.a(float3);
		this.a(float3);
		this.a(float3);
		this.j.b().a(true);
		bqg.b(0, 0, this.j.d, this.j.e);
		float float5 = 120.0F / (float)(this.l > this.m ? this.l : this.m);
		float float6 = (float)this.m * float5 / 256.0F;
		float float7 = (float)this.l * float5 / 256.0F;
		int integer8 = this.l;
		int integer9 = this.m;
		bqs bqs10 = bqs.a();
		bpy bpy11 = bqs10.c();
		bpy11.a(7, bzh.i);
		bpy11.b(0.0, (double)integer9, (double)this.e).a((double)(0.5F - float6), (double)(0.5F + float7)).a(1.0F, 1.0F, 1.0F, 1.0F).d();
		bpy11.b((double)integer8, (double)integer9, (double)this.e).a((double)(0.5F - float6), (double)(0.5F - float7)).a(1.0F, 1.0F, 1.0F, 1.0F).d();
		bpy11.b((double)integer8, 0.0, (double)this.e).a((double)(0.5F + float6), (double)(0.5F - float7)).a(1.0F, 1.0F, 1.0F, 1.0F).d();
		bpy11.b(0.0, 0.0, (double)this.e).a((double)(0.5F + float6), (double)(0.5F + float7)).a(1.0F, 1.0F, 1.0F, 1.0F).d();
		bqs10.b();
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		bqg.d();
		this.c(integer1, integer2, float3);
		bqg.e();
		int integer5 = 274;
		int integer6 = this.l / 2 - 137;
		int integer7 = 30;
		this.a(0, 0, this.l, this.m, -2130706433, 16777215);
		this.a(0, 0, this.l, this.m, 0, Integer.MIN_VALUE);
		this.j.N().a(F);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		if ((double)this.h < 1.0E-4) {
			this.b(integer6 + 0, 30, 0, 0, 99, 44);
			this.b(integer6 + 99, 30, 129, 0, 27, 44);
			this.b(integer6 + 99 + 26, 30, 126, 0, 3, 44);
			this.b(integer6 + 99 + 26 + 3, 30, 99, 0, 26, 44);
			this.b(integer6 + 155, 30, 0, 45, 155, 44);
		} else {
			this.b(integer6 + 0, 30, 0, 0, 155, 44);
			this.b(integer6 + 155, 30, 0, 45, 155, 44);
		}

		bqg.G();
		bqg.c((float)(this.l / 2 + 90), 70.0F, 0.0F);
		bqg.b(-20.0F, 0.0F, 0.0F, 1.0F);
		float float8 = 1.8F - ot.e(ot.a((float)(bes.I() % 1000L) / 1000.0F * (float) (Math.PI * 2)) * 0.1F);
		float8 = float8 * 100.0F / (float)(this.q.a(this.i) + 32);
		bqg.b(float8, float8, float8);
		this.a(this.q, this.i, 0, -8, -256);
		bqg.H();
		String string9 = "Minecraft 1.11.2";
		if (this.j.u()) {
			string9 = string9 + " Demo";
		} else {
			string9 = string9 + ("release".equalsIgnoreCase(this.j.d()) ? "" : "/" + this.j.d());
		}

		this.c(this.q, string9, 2, this.m - 10, -1);
		String string10 = "Copyright Mojang AB. Do not distribute!";
		this.c(this.q, "Copyright Mojang AB. Do not distribute!", this.l - this.q.a("Copyright Mojang AB. Do not distribute!") - 2, this.m - 10, -1);
		if (this.B != null && !this.B.isEmpty()) {
			a(this.x - 2, this.y - 2, this.z + 2, this.A - 1, 1428160512);
			this.c(this.q, this.B, this.x, this.y, -1);
			this.c(this.q, this.C, (this.l - this.v) / 2, ((bfm)this.n.get(0)).i - 12, -1);
		}

		super.a(integer1, integer2, float3);
		if (this.a()) {
			this.K.a(integer1, integer2, float3);
		}
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		synchronized (this.u) {
			if (!this.B.isEmpty() && !oy.b(this.D) && integer1 >= this.x && integer1 <= this.z && integer2 >= this.y && integer2 <= this.A) {
				bgs bgs6 = new bgs(this, this.D, 13, true);
				bgs6.f();
				this.j.a(bgs6);
			}
		}

		if (this.a()) {
			this.K.a(integer1, integer2, integer3);
		}
	}

	@Override
	public void m() {
		if (this.K != null) {
			this.K.m();
		}
	}
}
