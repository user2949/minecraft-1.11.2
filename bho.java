import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public abstract class bho extends bfi implements bgt {
	private static final Logger a = LogManager.getLogger();
	private static final Set<String> f = Sets.newHashSet(new String[]{"http", "https"});
	private static final Splitter g = Splitter.on('\n');
	protected bes j;
	protected bvh k;
	public int l;
	public int m;
	protected List<bfm> n = Lists.newArrayList();
	protected List<bfs> o = Lists.newArrayList();
	public boolean p;
	protected bfg q;
	private bfm h;
	private int i;
	private long r;
	private int s;
	private URI t;

	public void a(int integer1, int integer2, float float3) {
		for (int integer5 = 0; integer5 < this.n.size(); integer5++) {
			((bfm)this.n.get(integer5)).a(this.j, integer1, integer2);
		}

		for (int integer5 = 0; integer5 < this.o.size(); integer5++) {
			((bfs)this.o.get(integer5)).a(this.j, integer1, integer2);
		}
	}

	protected void a(char character, int integer) {
		if (integer == 1) {
			this.j.a(null);
			if (this.j.m == null) {
				this.j.o();
			}
		}
	}

	protected <T extends bfm> T b(T bfm) {
		this.n.add(bfm);
		return bfm;
	}

	public static String o() {
		try {
			Transferable transferable1 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
			if (transferable1 != null && transferable1.isDataFlavorSupported(DataFlavor.stringFlavor)) {
				return (String)transferable1.getTransferData(DataFlavor.stringFlavor);
			}
		} catch (Exception var1) {
		}

		return "";
	}

	public static void e(String string) {
		if (!StringUtils.isEmpty(string)) {
			try {
				StringSelection stringSelection2 = new StringSelection(string);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection2, null);
			} catch (Exception var2) {
			}
		}
	}

	protected void a(afj afj, int integer2, int integer3) {
		List<String> list5 = afj.a(this.j.h, this.j.u.y);

		for (int integer6 = 0; integer6 < list5.size(); integer6++) {
			if (integer6 == 0) {
				list5.set(integer6, afj.v().e + (String)list5.get(integer6));
			} else {
				list5.set(integer6, a.GRAY + (String)list5.get(integer6));
			}
		}

		this.a(list5, integer2, integer3);
	}

	protected void a(String string, int integer2, int integer3) {
		this.a(Arrays.asList(string), integer2, integer3);
	}

	protected void a(List<String> list, int integer2, int integer3) {
		if (!list.isEmpty()) {
			bqg.E();
			beq.a();
			bqg.g();
			bqg.j();
			int integer5 = 0;

			for (String string7 : list) {
				int integer8 = this.q.a(string7);
				if (integer8 > integer5) {
					integer5 = integer8;
				}
			}

			int integer6 = integer2 + 12;
			int integer7 = integer3 - 12;
			int integer9 = 8;
			if (list.size() > 1) {
				integer9 += 2 + (list.size() - 1) * 10;
			}

			if (integer6 + integer5 > this.l) {
				integer6 -= 28 + integer5;
			}

			if (integer7 + integer9 + 6 > this.m) {
				integer7 = this.m - integer9 - 6;
			}

			this.e = 300.0F;
			this.k.a = 300.0F;
			int integer10 = -267386864;
			this.a(integer6 - 3, integer7 - 4, integer6 + integer5 + 3, integer7 - 3, -267386864, -267386864);
			this.a(integer6 - 3, integer7 + integer9 + 3, integer6 + integer5 + 3, integer7 + integer9 + 4, -267386864, -267386864);
			this.a(integer6 - 3, integer7 - 3, integer6 + integer5 + 3, integer7 + integer9 + 3, -267386864, -267386864);
			this.a(integer6 - 4, integer7 - 3, integer6 - 3, integer7 + integer9 + 3, -267386864, -267386864);
			this.a(integer6 + integer5 + 3, integer7 - 3, integer6 + integer5 + 4, integer7 + integer9 + 3, -267386864, -267386864);
			int integer11 = 1347420415;
			int integer12 = 1344798847;
			this.a(integer6 - 3, integer7 - 3 + 1, integer6 - 3 + 1, integer7 + integer9 + 3 - 1, 1347420415, 1344798847);
			this.a(integer6 + integer5 + 2, integer7 - 3 + 1, integer6 + integer5 + 3, integer7 + integer9 + 3 - 1, 1347420415, 1344798847);
			this.a(integer6 - 3, integer7 - 3, integer6 + integer5 + 3, integer7 - 3 + 1, 1347420415, 1347420415);
			this.a(integer6 - 3, integer7 + integer9 + 2, integer6 + integer5 + 3, integer7 + integer9 + 3, 1344798847, 1344798847);

			for (int integer13 = 0; integer13 < list.size(); integer13++) {
				String string14 = (String)list.get(integer13);
				this.q.a(string14, (float)integer6, (float)integer7, -1);
				if (integer13 == 0) {
					integer7 += 2;
				}

				integer7 += 10;
			}

			this.e = 0.0F;
			this.k.a = 0.0F;
			bqg.f();
			bqg.k();
			beq.b();
			bqg.D();
		}
	}

	protected void a(fb fb, int integer2, int integer3) {
		if (fb != null && fb.b().i() != null) {
			fd fd5 = fb.b().i();
			if (fd5.a() == fd.a.SHOW_ITEM) {
				afj afj6 = afj.a;

				try {
					ei ei7 = ek.a(fd5.b().c());
					if (ei7 instanceof du) {
						afj6 = new afj((du)ei7);
					}
				} catch (ej var11) {
				}

				if (afj6.b()) {
					this.a(a.RED + "Invalid Item!", integer2, integer3);
				} else {
					this.a(afj6, integer2, integer3);
				}
			} else if (fd5.a() == fd.a.SHOW_ENTITY) {
				if (this.j.u.y) {
					try {
						du du6 = ek.a(fd5.b().c());
						List<String> list7 = Lists.newArrayList();
						list7.add(du6.l("name"));
						if (du6.b("type", 8)) {
							String string8 = du6.l("type");
							list7.add("Type: " + string8);
						}

						list7.add(du6.l("id"));
						this.a(list7, integer2, integer3);
					} catch (ej var10) {
						this.a(a.RED + "Invalid Entity!", integer2, integer3);
					}
				}
			} else if (fd5.a() == fd.a.SHOW_TEXT) {
				this.a(g.splitToList(fd5.b().d()), integer2, integer3);
			} else if (fd5.a() == fd.a.SHOW_ACHIEVEMENT) {
				nw nw6 = oa.a(fd5.b().c());
				if (nw6 != null) {
					fb fb7 = nw6.e();
					fb fb8 = new fi("stats.tooltip.type." + (nw6.d() ? "achievement" : "statistic"));
					fb8.b().b(true);
					String string9 = nw6 instanceof nq ? ((nq)nw6).f() : null;
					List<String> list10 = Lists.newArrayList(new String[]{fb7.d(), fb8.d()});
					if (string9 != null) {
						list10.addAll(this.q.c(string9, 150));
					}

					this.a(list10, integer2, integer3);
				} else {
					this.a(a.RED + "Invalid statistic/achievement!", integer2, integer3);
				}
			}

			bqg.g();
		}
	}

	protected void a(String string, boolean boolean2) {
	}

	protected boolean a(fb fb) {
		if (fb == null) {
			return false;
		} else {
			fa fa3 = fb.b().h();
			if (r()) {
				if (fb.b().j() != null) {
					this.a(fb.b().j(), false);
				}
			} else if (fa3 != null) {
				if (fa3.a() == fa.a.OPEN_URL) {
					if (!this.j.u.p) {
						return false;
					}

					try {
						URI uRI4 = new URI(fa3.b());
						String string5 = uRI4.getScheme();
						if (string5 == null) {
							throw new URISyntaxException(fa3.b(), "Missing protocol");
						}

						if (!f.contains(string5.toLowerCase(Locale.ROOT))) {
							throw new URISyntaxException(fa3.b(), "Unsupported protocol: " + string5.toLowerCase(Locale.ROOT));
						}

						if (this.j.u.q) {
							this.t = uRI4;
							this.j.a(new bgs(this, fa3.b(), 31102009, false));
						} else {
							this.a(uRI4);
						}
					} catch (URISyntaxException var5) {
						a.error("Can't open url for {}", new Object[]{fa3, var5});
					}
				} else if (fa3.a() == fa.a.OPEN_FILE) {
					URI uRI4x = new File(fa3.b()).toURI();
					this.a(uRI4x);
				} else if (fa3.a() == fa.a.SUGGEST_COMMAND) {
					this.a(fa3.b(), true);
				} else if (fa3.a() == fa.a.RUN_COMMAND) {
					this.b(fa3.b(), false);
				} else {
					a.error("Don't know how to handle {}", new Object[]{fa3});
				}

				return true;
			}

			return false;
		}
	}

	public void f(String string) {
		this.b(string, true);
	}

	public void b(String string, boolean boolean2) {
		if (boolean2) {
			this.j.r.d().a(string);
		}

		this.j.h.g(string);
	}

	protected void a(int integer1, int integer2, int integer3) {
		if (integer3 == 0) {
			for (int integer5 = 0; integer5 < this.n.size(); integer5++) {
				bfm bfm6 = (bfm)this.n.get(integer5);
				if (bfm6.c(this.j, integer1, integer2)) {
					this.h = bfm6;
					bfm6.a(this.j.U());
					this.a(bfm6);
				}
			}
		}
	}

	protected void b(int integer1, int integer2, int integer3) {
		if (this.h != null && integer3 == 0) {
			this.h.a(integer1, integer2);
			this.h = null;
		}
	}

	protected void a(int integer1, int integer2, int integer3, long long4) {
	}

	protected void a(bfm bfm) {
	}

	public void a(bes bes, int integer2, int integer3) {
		this.j = bes;
		this.k = bes.ad();
		this.q = bes.k;
		this.l = integer2;
		this.m = integer3;
		this.n.clear();
		this.b();
	}

	public void a(int integer1, int integer2) {
		this.l = integer1;
		this.m = integer2;
	}

	public void b() {
	}

	public void p() {
		if (Mouse.isCreated()) {
			while (Mouse.next()) {
				this.k();
			}
		}

		if (Keyboard.isCreated()) {
			while (Keyboard.next()) {
				this.l();
			}
		}
	}

	public void k() {
		int integer2 = Mouse.getEventX() * this.l / this.j.d;
		int integer3 = this.m - Mouse.getEventY() * this.m / this.j.e - 1;
		int integer4 = Mouse.getEventButton();
		if (Mouse.getEventButtonState()) {
			if (this.j.u.A && this.s++ > 0) {
				return;
			}

			this.i = integer4;
			this.r = bes.I();
			this.a(integer2, integer3, this.i);
		} else if (integer4 != -1) {
			if (this.j.u.A && --this.s > 0) {
				return;
			}

			this.i = -1;
			this.b(integer2, integer3, integer4);
		} else if (this.i != -1 && this.r > 0L) {
			long long5 = bes.I() - this.r;
			this.a(integer2, integer3, this.i, long5);
		}
	}

	public void l() {
		char character2 = Keyboard.getEventCharacter();
		if (Keyboard.getEventKey() == 0 && character2 >= ' ' || Keyboard.getEventKeyState()) {
			this.a(character2, Keyboard.getEventKey());
		}

		this.j.W();
	}

	public void e() {
	}

	public void m() {
	}

	public void c() {
		this.d_(0);
	}

	public void d_(int integer) {
		if (this.j.f != null) {
			this.a(0, 0, this.l, this.m, -1072689136, -804253680);
		} else {
			this.c(integer);
		}
	}

	public void c(int integer) {
		bqg.g();
		bqg.p();
		bqs bqs3 = bqs.a();
		bpy bpy4 = bqs3.c();
		this.j.N().a(b);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		float float5 = 32.0F;
		bpy4.a(7, bzh.i);
		bpy4.b(0.0, (double)this.m, 0.0).a(0.0, (double)((float)this.m / 32.0F + (float)integer)).b(64, 64, 64, 255).d();
		bpy4.b((double)this.l, (double)this.m, 0.0).a((double)((float)this.l / 32.0F), (double)((float)this.m / 32.0F + (float)integer)).b(64, 64, 64, 255).d();
		bpy4.b((double)this.l, 0.0, 0.0).a((double)((float)this.l / 32.0F), (double)integer).b(64, 64, 64, 255).d();
		bpy4.b(0.0, 0.0, 0.0).a(0.0, (double)integer).b(64, 64, 64, 255).d();
		bqs3.b();
	}

	public boolean d() {
		return true;
	}

	@Override
	public void a(boolean boolean1, int integer) {
		if (integer == 31102009) {
			if (boolean1) {
				this.a(this.t);
			}

			this.t = null;
			this.j.a(this);
		}
	}

	private void a(URI uRI) {
		try {
			Class<?> class3 = Class.forName("java.awt.Desktop");
			Object object4 = class3.getMethod("getDesktop").invoke(null);
			class3.getMethod("browse", URI.class).invoke(object4, uRI);
		} catch (Throwable var4) {
			Throwable throwable4 = var4.getCause();
			a.error("Couldn't open link: {}", new Object[]{throwable4 == null ? "<UNKNOWN>" : throwable4.getMessage()});
		}
	}

	public static boolean q() {
		return bes.a ? Keyboard.isKeyDown(219) || Keyboard.isKeyDown(220) : Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157);
	}

	public static boolean r() {
		return Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54);
	}

	public static boolean s() {
		return Keyboard.isKeyDown(56) || Keyboard.isKeyDown(184);
	}

	public static boolean d(int integer) {
		return integer == 45 && q() && !r() && !s();
	}

	public static boolean e(int integer) {
		return integer == 47 && q() && !r() && !s();
	}

	public static boolean f(int integer) {
		return integer == 46 && q() && !r() && !s();
	}

	public static boolean g(int integer) {
		return integer == 30 && q() && !r() && !s();
	}

	public void b(bes bes, int integer2, int integer3) {
		this.a(bes, integer2, integer3);
	}
}
