import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bkb implements bfy.a {
	private static final Logger a = LogManager.getLogger();
	private static final DateFormat b = new SimpleDateFormat();
	private static final kq c = new kq("textures/misc/unknown_server.png");
	private static final kq d = new kq("textures/gui/world_selection.png");
	private final bes e;
	private final bka f;
	private final bbz g;
	private final kq h;
	private final bkc i;
	private File j;
	private byp k;
	private long l;

	public bkb(bkc bkc, bbz bbz, bby bby) {
		this.i = bkc;
		this.f = bkc.g();
		this.g = bbz;
		this.e = bes.z();
		this.h = new kq("worlds/" + bbz.a() + "/icon");
		this.j = bby.b(bbz.a(), "icon.png");
		if (!this.j.isFile()) {
			this.j = null;
		}

		this.f();
	}

	@Override
	public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, boolean boolean8) {
		String string10 = this.g.b();
		String string11 = this.g.a() + " (" + b.format(new Date(this.g.e())) + ")";
		String string12 = "";
		if (StringUtils.isEmpty(string10)) {
			string10 = cah.a("selectWorld.world") + " " + (integer1 + 1);
		}

		if (this.g.d()) {
			string12 = cah.a("selectWorld.conversion") + " " + string12;
		} else {
			string12 = cah.a("gameMode." + this.g.f().b());
			if (this.g.g()) {
				string12 = a.DARK_RED + cah.a("gameMode.hardcore") + a.RESET;
			}

			if (this.g.h()) {
				string12 = string12 + ", " + cah.a("selectWorld.cheats");
			}

			String string13 = this.g.i();
			if (this.g.l()) {
				if (this.g.m()) {
					string12 = string12 + ", " + cah.a("selectWorld.version") + " " + a.RED + string13 + a.RESET;
				} else {
					string12 = string12 + ", " + cah.a("selectWorld.version") + " " + a.ITALIC + string13 + a.RESET;
				}
			} else {
				string12 = string12 + ", " + cah.a("selectWorld.version") + " " + string13;
			}
		}

		this.e.k.a(string10, integer2 + 32 + 3, integer3 + 1, 16777215);
		this.e.k.a(string11, integer2 + 32 + 3, integer3 + this.e.k.a + 3, 8421504);
		this.e.k.a(string12, integer2 + 32 + 3, integer3 + this.e.k.a + this.e.k.a + 3, 8421504);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.e.N().a(this.k != null ? this.h : c);
		bqg.m();
		bfi.a(integer2, integer3, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
		bqg.l();
		if (this.e.u.A || boolean8) {
			this.e.N().a(d);
			bfi.a(integer2, integer3, integer2 + 32, integer3 + 32, -1601138544);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			int integer13 = integer6 - integer2;
			int integer14 = integer13 < 32 ? 32 : 0;
			if (this.g.l()) {
				bfi.a(integer2, integer3, 32.0F, (float)integer14, 32, 32, 256.0F, 256.0F);
				if (this.g.m()) {
					bfi.a(integer2, integer3, 96.0F, (float)integer14, 32, 32, 256.0F, 256.0F);
					if (integer13 < 32) {
						this.f.a(a.RED + cah.a("selectWorld.tooltip.fromNewerVersion1") + "\n" + a.RED + cah.a("selectWorld.tooltip.fromNewerVersion2"));
					}
				} else {
					bfi.a(integer2, integer3, 64.0F, (float)integer14, 32, 32, 256.0F, 256.0F);
					if (integer13 < 32) {
						this.f.a(a.GOLD + cah.a("selectWorld.tooltip.snapshot1") + "\n" + a.GOLD + cah.a("selectWorld.tooltip.snapshot2"));
					}
				}
			} else {
				bfi.a(integer2, integer3, 0.0F, (float)integer14, 32, 32, 256.0F, 256.0F);
			}
		}
	}

	@Override
	public boolean a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.i.d(integer1);
		if (integer5 <= 32 && integer5 < 32) {
			this.a();
			return true;
		} else if (bes.I() - this.l < 250L) {
			this.a();
			return true;
		} else {
			this.l = bes.I();
			return false;
		}
	}

	public void a() {
		if (this.g.m()) {
			this.e.a(new bgu(new bgt() {
				@Override
				public void a(boolean boolean1, int integer) {
					if (boolean1) {
						bkb.this.e();
					} else {
						bkb.this.e.a(bkb.this.f);
					}
				}
			}, cah.a("selectWorld.versionQuestion"), cah.a("selectWorld.versionWarning", this.g.i()), cah.a("selectWorld.versionJoinButton"), cah.a("gui.cancel"), 0));
		} else {
			this.e();
		}
	}

	public void b() {
		this.e
			.a(
				new bgu(
					new bgt() {
						@Override
						public void a(boolean boolean1, int integer) {
							if (boolean1) {
								bkb.this.e.a(new bhm());
								bby bby4 = bkb.this.e.g();
								bby4.d();
								bby4.e(bkb.this.g.a());
								bkb.this.i.e();
							}
			
							bkb.this.e.a(bkb.this.f);
						}
					},
					cah.a("selectWorld.deleteQuestion"),
					"'" + this.g.b() + "' " + cah.a("selectWorld.deleteWarning"),
					cah.a("selectWorld.deleteButton"),
					cah.a("gui.cancel"),
					0
				)
			);
	}

	public void c() {
		this.e.a(new bjz(this.f, this.g.a()));
	}

	public void d() {
		this.e.a(new bhm());
		bjy bjy2 = new bjy(this.f);
		bbw bbw3 = this.e.g().a(this.g.a(), false);
		bbv bbv4 = bbw3.d();
		bbw3.a();
		if (bbv4 != null) {
			bjy2.a(bbv4);
			this.e.a(bjy2);
		}
	}

	private void e() {
		this.e.U().a(cby.a(nn.hb, 1.0F));
		if (this.e.g().f(this.g.a())) {
			this.e.a(this.g.a(), this.g.b(), null);
		}
	}

	private void f() {
		boolean boolean2 = this.j != null && this.j.isFile();
		if (boolean2) {
			BufferedImage bufferedImage3;
			try {
				bufferedImage3 = ImageIO.read(this.j);
				Validate.validState(bufferedImage3.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
				Validate.validState(bufferedImage3.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
			} catch (Throwable var4) {
				a.error("Invalid icon for world {}", new Object[]{this.g.a(), var4});
				this.j = null;
				return;
			}

			if (this.k == null) {
				this.k = new byp(bufferedImage3.getWidth(), bufferedImage3.getHeight());
				this.e.N().a(this.h, this.k);
			}

			bufferedImage3.getRGB(0, 0, bufferedImage3.getWidth(), bufferedImage3.getHeight(), this.k.e(), 0, bufferedImage3.getWidth());
			this.k.d();
		} else if (!boolean2) {
			this.e.N().c(this.h);
			this.k = null;
		}
	}

	@Override
	public void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
	}

	@Override
	public void a(int integer1, int integer2, int integer3) {
	}
}
