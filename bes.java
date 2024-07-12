import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.hash.Hashing;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.AuthenticationService;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public class bes implements qy, rt {
	private static final Logger J = LogManager.getLogger();
	private static final kq K = new kq("textures/gui/title/mojang.png");
	public static final boolean a = h.a() == h.a.OSX;
	public static byte[] b = new byte[10485760];
	private static final List<DisplayMode> L = Lists.newArrayList(new DisplayMode[]{new DisplayMode(2560, 1600), new DisplayMode(2880, 1800)});
	private final File M;
	private final PropertyMap N;
	private final PropertyMap O;
	private bnt P;
	private bza Q;
	private static bes R;
	private final ph S;
	public bnp c;
	private boolean T;
	private final boolean U = true;
	private boolean V;
	private b W;
	public int d;
	public int e;
	private boolean X;
	private final bey Y = new bey(20.0F);
	private final rs Z = new rs("client", this, MinecraftServer.aw());
	public bnq f;
	public bqm g;
	private bur aa;
	private bvh ab;
	private bqi ac;
	public bps h;
	@Nullable
	private sn ad;
	public sn i;
	public bov j;
	private final bez ae;
	private boolean af;
	public bfg k;
	public bfg l;
	@Nullable
	public bho m;
	public bev n;
	public bqe o;
	public btt p;
	private int ag;
	private final int ah;
	private final int ai;
	@Nullable
	private cch aj;
	public bhy q;
	public bfh r;
	public boolean s;
	public bdu t;
	public beu u;
	public bet v;
	public final File w;
	private final File ak;
	private final String al;
	private final String am;
	private final Proxy an;
	private bby ao;
	private static int ap;
	private int aq;
	private String ar;
	private int as;
	public boolean x;
	long y = I();
	private int at;
	public final oj z = new oj();
	long A = System.nanoTime();
	private final boolean au;
	private final boolean av;
	@Nullable
	private er aw;
	private boolean ax;
	public final ou B = new ou();
	private long ay = -1L;
	private bzw az;
	private final cap aA = new cap();
	private final List<caa> aB = Lists.newArrayList();
	private final bzp aC;
	private cad aD;
	private caj aE;
	private bfb aF;
	private bfe aG;
	private bqr aH;
	private byy aI;
	private ccs aJ;
	private ccp aK;
	private kq aL;
	private final MinecraftSessionService aM;
	private cag aN;
	private final Queue<FutureTask<?>> aO = Queues.newArrayDeque();
	private final Thread aP = Thread.currentThread();
	private cbl aQ;
	private bra aR;
	volatile boolean C = true;
	public String D = "";
	public boolean H = true;
	private long aS = I();
	private int aT;
	private boolean aU;
	long I = -1L;
	private String aV = "root";

	public bes(bkp bkp) {
		R = this;
		this.w = bkp.c.a;
		this.ak = bkp.c.c;
		this.M = bkp.c.b;
		this.al = bkp.d.b;
		this.am = bkp.d.c;
		this.N = bkp.a.b;
		this.O = bkp.a.c;
		this.aC = new bzp(bkp.c.a());
		this.an = bkp.a.d == null ? Proxy.NO_PROXY : bkp.a.d;
		this.aM = new YggdrasilAuthenticationService(this.an, UUID.randomUUID().toString()).createMinecraftSessionService();
		this.ae = bkp.a.a;
		J.info("Setting user: {}", new Object[]{this.ae.c()});
		J.debug("(Session ID is {})", new Object[]{this.ae.a()});
		this.av = bkp.d.a;
		this.d = bkp.b.a > 0 ? bkp.b.a : 1;
		this.e = bkp.b.b > 0 ? bkp.b.b : 1;
		this.ah = bkp.b.a;
		this.ai = bkp.b.b;
		this.T = bkp.b.c;
		this.au = as();
		this.aj = null;
		if (bkp.e.a != null) {
			this.ar = bkp.e.a;
			this.as = bkp.e.b;
		}

		ImageIO.setUseCache(false);
		Locale.setDefault(Locale.ROOT);
		kt.c();
		this.S = pi.a();
	}

	public void a() {
		this.C = true;

		try {
			this.an();
		} catch (Throwable var11) {
			b b3 = b.a(var11, "Initializing game");
			b3.a("Initialization");
			this.c(this.b(b3));
			return;
		}

		try {
			try {
				while (this.C) {
					if (this.V && this.W != null) {
						this.c(this.W);
						return;
					} else {
						try {
							this.av();
						} catch (OutOfMemoryError var10) {
							this.m();
							this.a(new bhj());
							System.gc();
						}
					}
				}

				return;
			} catch (bex var12) {
			} catch (f var13) {
				this.b(var13.a());
				this.m();
				J.fatal("Reported exception thrown!", var13);
				this.c(var13.a());
			} catch (Throwable var14) {
				b b3 = this.b(new b("Unexpected error", var14));
				this.m();
				J.fatal("Unreported exception thrown!", var14);
				this.c(b3);
			}
		} finally {
			this.h();
		}
	}

	private void an() throws LWJGLException {
		this.u = new beu(this, this.w);
		this.aB.add(this.aC);
		this.at();
		if (this.u.D > 0 && this.u.C > 0) {
			this.d = this.u.C;
			this.e = this.u.D;
		}

		J.info("LWJGL Version: {}", new Object[]{Sys.getVersion()});
		this.ar();
		this.aq();
		this.ap();
		cdb.a();
		this.aH = new bqr(this.d, this.e, true);
		this.aH.a(0.0F, 0.0F, 0.0F, 0.0F);
		this.ao();
		this.aD = new cad(this.M, new File(this.w, "server-resource-packs"), this.aC, this.aA, this.u);
		this.az = new cae(this.aA);
		this.aE = new caj(this.aA, this.u.aE);
		this.az.a(this.aE);
		this.f();
		this.Q = new bza(this.az);
		this.az.a(this.Q);
		this.a(this.Q);
		this.aN = new cag(this.Q, new File(this.ak, "skins"), this.aM);
		this.ao = new bbr(new File(this.w, "saves"), this.S);
		this.aJ = new ccs(this.az, this.u);
		this.az.a(this.aJ);
		this.aK = new ccp(this);
		this.k = new bfg(this.u, new kq("textures/font/ascii.png"), this.Q, false);
		if (this.u.aE != null) {
			this.k.a(this.e());
			this.k.b(this.aE.b());
		}

		this.l = new bfg(this.u, new kq("textures/font/ascii_sga.png"), this.Q, false);
		this.az.a(this.k);
		this.az.a(this.l);
		this.az.a(new bzv());
		this.az.a(new bzu());
		nr.f.a(new ns() {
			@Override
			public String a(String string) {
				try {
					return String.format(string, beu.c(bes.this.u.Z.j()));
				} catch (Exception var3) {
					return "Error: " + var3.getLocalizedMessage();
				}
			}
		});
		this.v = new bet();
		this.a("Pre startup");
		bqg.y();
		bqg.j(7425);
		bqg.a(1.0);
		bqg.k();
		bqg.c(515);
		bqg.e();
		bqg.a(516, 0.1F);
		bqg.a(bqg.i.BACK);
		bqg.n(5889);
		bqg.F();
		bqg.n(5888);
		this.a("Startup");
		this.aI = new byy("textures");
		this.aI.a(this.u.K);
		this.Q.a(byy.g, (bze)this.aI);
		this.Q.a(byy.g);
		this.aI.a(false, this.u.K > 0);
		this.aQ = new cbl(this.aI);
		this.az.a(this.aQ);
		this.aF = bfb.a();
		this.aG = bfe.a(this.aF);
		this.ab = new bvh(this.Q, this.aQ, this.aG);
		this.aa = new bur(this.Q, this.ab);
		this.ac = new bqi(this);
		this.az.a(this.ab);
		this.o = new bqe(this, this.az);
		this.az.a(this.o);
		this.aR = new bra(this.aQ.c(), this.aF);
		this.az.a(this.aR);
		this.g = new bqm(this);
		this.az.a(this.g);
		this.q = new bhy(this);
		bqg.b(0, 0, this.d, this.e);
		this.j = new bov(this.f, this.Q);
		this.a("Post startup");
		this.r = new bfh(this);
		if (this.ar != null) {
			this.a(new bgv(new bhv(), this, this.ar, this.as));
		} else {
			this.a(new bhv());
		}

		this.Q.c(this.aL);
		this.aL = null;
		this.n = new bev(this);
		this.p = new btt(this);
		if (this.u.t && !this.T) {
			this.r();
		}

		try {
			Display.setVSyncEnabled(this.u.u);
		} catch (OpenGLException var2) {
			this.u.u = false;
			this.u.b();
		}

		this.g.b();
	}

	private void ao() {
		this.aA.a(new cbf(), cbe.class);
		this.aA.a(new cav(), cau.class);
		this.aA.a(new cas(), car.class);
		this.aA.a(new cbb(), cba.class);
		this.aA.a(new cay(), cax.class);
	}

	private void ap() throws LWJGLException {
		Display.setResizable(true);
		Display.setTitle("Minecraft 1.11.2");

		try {
			Display.create(new PixelFormat().withDepthBits(24));
		} catch (LWJGLException var4) {
			J.error("Couldn't set pixel format", var4);

			try {
				Thread.sleep(1000L);
			} catch (InterruptedException var3) {
			}

			if (this.T) {
				this.au();
			}

			Display.create();
		}
	}

	private void aq() throws LWJGLException {
		if (this.T) {
			Display.setFullscreen(true);
			DisplayMode displayMode2 = Display.getDisplayMode();
			this.d = Math.max(1, displayMode2.getWidth());
			this.e = Math.max(1, displayMode2.getHeight());
		} else {
			Display.setDisplayMode(new DisplayMode(this.d, this.e));
		}
	}

	private void ar() {
		h.a a2 = h.a();
		if (a2 != h.a.OSX) {
			InputStream inputStream3 = null;
			InputStream inputStream4 = null;

			try {
				inputStream3 = this.aC.c(new kq("icons/icon_16x16.png"));
				inputStream4 = this.aC.c(new kq("icons/icon_32x32.png"));
				if (inputStream3 != null && inputStream4 != null) {
					Display.setIcon(new ByteBuffer[]{this.a(inputStream3), this.a(inputStream4)});
				}
			} catch (IOException var8) {
				J.error("Couldn't set icon", var8);
			} finally {
				IOUtils.closeQuietly(inputStream3);
				IOUtils.closeQuietly(inputStream4);
			}
		}
	}

	private static boolean as() {
		String[] arr1 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

		for (String string5 : arr1) {
			String string6 = System.getProperty(string5);
			if (string6 != null && string6.contains("64")) {
				return true;
			}
		}

		return false;
	}

	public bqr b() {
		return this.aH;
	}

	public String c() {
		return this.al;
	}

	public String d() {
		return this.am;
	}

	private void at() {
		Thread thread2 = new Thread("Timer hack thread") {
			public void run() {
				while (bes.this.C) {
					try {
						Thread.sleep(2147483647L);
					} catch (InterruptedException var2) {
					}
				}
			}
		};
		thread2.setDaemon(true);
		thread2.start();
	}

	public void a(b b) {
		this.V = true;
		this.W = b;
	}

	public void c(b b) {
		File file3 = new File(z().w, "crash-reports");
		File file4 = new File(file3, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
		kt.a(b.e());
		if (b.f() != null) {
			kt.a("#@!@# Game crashed! Crash report saved to: #@!@# " + b.f());
			System.exit(-1);
		} else if (b.a(file4)) {
			kt.a("#@!@# Game crashed! Crash report saved to: #@!@# " + file4.getAbsolutePath());
			System.exit(-1);
		} else {
			kt.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
			System.exit(-2);
		}
	}

	public boolean e() {
		return this.aE.a() || this.u.aF;
	}

	public void f() {
		List<caa> list2 = Lists.newArrayList(this.aB);
		if (this.aj != null) {
			this.aj.b();
		}

		for (cad.a a4 : this.aD.e()) {
			list2.add(a4.c());
		}

		if (this.aD.g() != null) {
			list2.add(this.aD.g());
		}

		try {
			this.az.a(list2);
		} catch (RuntimeException var4) {
			J.info("Caught error stitching, removing all assigned resourcepacks", var4);
			list2.clear();
			list2.addAll(this.aB);
			this.aD.a(Collections.emptyList());
			this.az.a(list2);
			this.u.l.clear();
			this.u.m.clear();
			this.u.b();
		}

		this.aE.a(list2);
		if (this.g != null) {
			this.g.a();
		}
	}

	private ByteBuffer a(InputStream inputStream) throws IOException {
		BufferedImage bufferedImage3 = ImageIO.read(inputStream);
		int[] arr4 = bufferedImage3.getRGB(0, 0, bufferedImage3.getWidth(), bufferedImage3.getHeight(), null, 0, bufferedImage3.getWidth());
		ByteBuffer byteBuffer5 = ByteBuffer.allocate(4 * arr4.length);

		for (int integer9 : arr4) {
			byteBuffer5.putInt(integer9 << 8 | integer9 >> 24 & 0xFF);
		}

		byteBuffer5.flip();
		return byteBuffer5;
	}

	private void au() throws LWJGLException {
		Set<DisplayMode> set2 = Sets.newHashSet();
		Collections.addAll(set2, Display.getAvailableDisplayModes());
		DisplayMode displayMode3 = Display.getDesktopDisplayMode();
		if (!set2.contains(displayMode3) && h.a() == h.a.OSX) {
			for (DisplayMode displayMode5 : L) {
				boolean boolean6 = true;

				for (DisplayMode displayMode8 : set2) {
					if (displayMode8.getBitsPerPixel() == 32 && displayMode8.getWidth() == displayMode5.getWidth() && displayMode8.getHeight() == displayMode5.getHeight()) {
						boolean6 = false;
						break;
					}
				}

				if (!boolean6) {
					for (DisplayMode displayMode8x : set2) {
						if (displayMode8x.getBitsPerPixel() == 32
							&& displayMode8x.getWidth() == displayMode5.getWidth() / 2
							&& displayMode8x.getHeight() == displayMode5.getHeight() / 2) {
							displayMode3 = displayMode8x;
							break;
						}
					}
				}
			}
		}

		Display.setDisplayMode(displayMode3);
		this.d = displayMode3.getWidth();
		this.e = displayMode3.getHeight();
	}

	private void a(bza bza) {
		bfk bfk3 = new bfk(this);
		int integer4 = bfk3.e();
		bqr bqr5 = new bqr(bfk3.a() * integer4, bfk3.b() * integer4, true);
		bqr5.a(false);
		bqg.n(5889);
		bqg.F();
		bqg.a(0.0, (double)bfk3.a(), (double)bfk3.b(), 0.0, 1000.0, 3000.0);
		bqg.n(5888);
		bqg.F();
		bqg.c(0.0F, 0.0F, -2000.0F);
		bqg.g();
		bqg.p();
		bqg.j();
		bqg.y();
		InputStream inputStream6 = null;

		try {
			inputStream6 = this.aC.a(K);
			this.aL = bza.a("logo", new byp(ImageIO.read(inputStream6)));
			bza.a(this.aL);
		} catch (IOException var12) {
			J.error("Unable to load logo: {}", new Object[]{K, var12});
		} finally {
			IOUtils.closeQuietly(inputStream6);
		}

		bqs bqs7 = bqs.a();
		bpy bpy8 = bqs7.c();
		bpy8.a(7, bzh.i);
		bpy8.b(0.0, (double)this.e, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
		bpy8.b((double)this.d, (double)this.e, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
		bpy8.b((double)this.d, 0.0, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
		bpy8.b(0.0, 0.0, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
		bqs7.b();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		int integer9 = 256;
		int integer10 = 256;
		this.a((bfk3.a() - 256) / 2, (bfk3.b() - 256) / 2, 0, 0, 256, 256, 255, 255, 255, 255);
		bqg.g();
		bqg.p();
		bqr5.e();
		bqr5.c(bfk3.a() * integer4, bfk3.b() * integer4);
		bqg.e();
		bqg.a(516, 0.1F);
		this.i();
	}

	public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, int integer9, int integer10) {
		bpy bpy12 = bqs.a().c();
		bpy12.a(7, bzh.i);
		float float13 = 0.00390625F;
		float float14 = 0.00390625F;
		bpy12.b((double)integer1, (double)(integer2 + integer6), 0.0)
			.a((double)((float)integer3 * 0.00390625F), (double)((float)(integer4 + integer6) * 0.00390625F))
			.b(integer7, integer8, integer9, integer10)
			.d();
		bpy12.b((double)(integer1 + integer5), (double)(integer2 + integer6), 0.0)
			.a((double)((float)(integer3 + integer5) * 0.00390625F), (double)((float)(integer4 + integer6) * 0.00390625F))
			.b(integer7, integer8, integer9, integer10)
			.d();
		bpy12.b((double)(integer1 + integer5), (double)integer2, 0.0)
			.a((double)((float)(integer3 + integer5) * 0.00390625F), (double)((float)integer4 * 0.00390625F))
			.b(integer7, integer8, integer9, integer10)
			.d();
		bpy12.b((double)integer1, (double)integer2, 0.0)
			.a((double)((float)integer3 * 0.00390625F), (double)((float)integer4 * 0.00390625F))
			.b(integer7, integer8, integer9, integer10)
			.d();
		bqs.a().b();
	}

	public bby g() {
		return this.ao;
	}

	public void a(@Nullable bho bho) {
		if (this.m != null) {
			this.m.m();
		}

		if (bho == null && this.f == null) {
			bho = new bhv();
		} else if (bho == null && this.h.bU() <= 0.0F) {
			bho = new bgz(null);
		}

		if (bho instanceof bhv || bho instanceof bjf) {
			this.u.at = false;
			this.r.d().a(true);
		}

		this.m = bho;
		if (bho != null) {
			this.p();
			bep.b();

			while (Mouse.next()) {
			}

			while (Keyboard.next()) {
			}

			bfk bfk3 = new bfk(this);
			int integer4 = bfk3.a();
			int integer5 = bfk3.b();
			bho.a(this, integer4, integer5);
			this.s = false;
		} else {
			this.aJ.d();
			this.o();
		}
	}

	private void a(String string) {
		int integer3 = bqg.L();
		if (integer3 != 0) {
			String string4 = GLU.gluErrorString(integer3);
			J.error("########## GL ERROR ##########");
			J.error("@ {}", new Object[]{string});
			J.error("{}: {}", new Object[]{integer3, string4});
		}
	}

	public void h() {
		try {
			J.info("Stopping!");

			try {
				this.a(null);
			} catch (Throwable var5) {
			}

			this.aJ.c();
		} finally {
			Display.destroy();
			if (!this.V) {
				System.exit(0);
			}
		}

		System.gc();
	}

	private void av() {
		long long2 = System.nanoTime();
		this.B.a("root");
		if (Display.isCreated() && Display.isCloseRequested()) {
			this.n();
		}

		if (this.af && this.f != null) {
			float float4 = this.Y.c;
			this.Y.a();
			this.Y.c = float4;
		} else {
			this.Y.a();
		}

		this.B.a("scheduledExecutables");
		synchronized (this.aO) {
			while (!this.aO.isEmpty()) {
				h.a((FutureTask)this.aO.poll(), J);
			}
		}

		this.B.b();
		long long4 = System.nanoTime();
		this.B.a("tick");

		for (int integer6 = 0; integer6 < this.Y.b; integer6++) {
			this.t();
		}

		this.B.c("preRenderErrors");
		long long6 = System.nanoTime() - long4;
		this.a("Pre render");
		this.B.c("sound");
		this.aJ.a(this.h, this.Y.c);
		this.B.b();
		this.B.a("render");
		bqg.G();
		bqg.m(16640);
		this.aH.a(true);
		this.B.a("display");
		bqg.y();
		this.B.b();
		if (!this.s) {
			this.B.c("gameRenderer");
			this.o.a(this.Y.c, long2);
			this.B.b();
		}

		this.B.b();
		if (this.u.at && this.u.au && !this.u.ar) {
			if (!this.B.a) {
				this.B.a();
			}

			this.B.a = true;
			this.a(long6);
		} else {
			this.B.a = false;
			this.I = System.nanoTime();
		}

		this.q.a();
		this.aH.e();
		bqg.H();
		bqg.G();
		this.aH.c(this.d, this.e);
		bqg.H();
		bqg.G();
		this.o.b(this.Y.c);
		bqg.H();
		this.B.a("root");
		this.i();
		Thread.yield();
		this.a("Post render");
		this.aT++;
		this.af = this.E() && this.m != null && this.m.d() && !this.aj.a();
		long long8 = System.nanoTime();
		this.z.a(long8 - this.A);
		this.A = long8;

		while (I() >= this.aS + 1000L) {
			ap = this.aT;
			this.D = String.format(
				"%d fps (%d chunk update%s) T: %s%s%s%s%s",
				ap,
				bte.a,
				bte.a == 1 ? "" : "s",
				(float)this.u.h == beu.a.FRAMERATE_LIMIT.f() ? "inf" : this.u.h,
				this.u.u ? " vsync" : "",
				this.u.j ? "" : " fast",
				this.u.i == 0 ? "" : (this.u.i == 1 ? " fast-clouds" : " fancy-clouds"),
				cdb.f() ? " vbo" : ""
			);
			bte.a = 0;
			this.aS += 1000L;
			this.aT = 0;
			this.Z.b();
			if (!this.Z.d()) {
				this.Z.a();
			}
		}

		if (this.l()) {
			this.B.a("fpslimit_wait");
			Display.sync(this.k());
			this.B.b();
		}

		this.B.b();
	}

	public void i() {
		this.B.a("display_update");
		Display.update();
		this.B.b();
		this.j();
	}

	protected void j() {
		if (!this.T && Display.wasResized()) {
			int integer2 = this.d;
			int integer3 = this.e;
			this.d = Display.getWidth();
			this.e = Display.getHeight();
			if (this.d != integer2 || this.e != integer3) {
				if (this.d <= 0) {
					this.d = 1;
				}

				if (this.e <= 0) {
					this.e = 1;
				}

				this.a(this.d, this.e);
			}
		}
	}

	public int k() {
		return this.f == null && this.m != null ? 30 : this.u.h;
	}

	public boolean l() {
		return (float)this.k() < beu.a.FRAMERATE_LIMIT.f();
	}

	public void m() {
		try {
			b = new byte[0];
			this.g.l();
		} catch (Throwable var3) {
		}

		try {
			System.gc();
			this.a(null);
		} catch (Throwable var2) {
		}

		System.gc();
	}

	private void b(int integer) {
		List<ou.a> list3 = this.B.b(this.aV);
		if (!list3.isEmpty()) {
			ou.a a4 = (ou.a)list3.remove(0);
			if (integer == 0) {
				if (!a4.c.isEmpty()) {
					int integer5 = this.aV.lastIndexOf(46);
					if (integer5 >= 0) {
						this.aV = this.aV.substring(0, integer5);
					}
				}
			} else {
				integer--;
				if (integer < list3.size() && !"unspecified".equals(((ou.a)list3.get(integer)).c)) {
					if (!this.aV.isEmpty()) {
						this.aV = this.aV + ".";
					}

					this.aV = this.aV + ((ou.a)list3.get(integer)).c;
				}
			}
		}
	}

	private void a(long long1) {
		if (this.B.a) {
			List<ou.a> list4 = this.B.b(this.aV);
			ou.a a5 = (ou.a)list4.remove(0);
			bqg.m(256);
			bqg.n(5889);
			bqg.h();
			bqg.F();
			bqg.a(0.0, (double)this.d, (double)this.e, 0.0, 1000.0, 3000.0);
			bqg.n(5888);
			bqg.F();
			bqg.c(0.0F, 0.0F, -2000.0F);
			bqg.d(1.0F);
			bqg.z();
			bqs bqs6 = bqs.a();
			bpy bpy7 = bqs6.c();
			int integer8 = 160;
			int integer9 = this.d - 160 - 10;
			int integer10 = this.e - 320;
			bqg.m();
			bpy7.a(7, bzh.f);
			bpy7.b((double)((float)integer9 - 176.0F), (double)((float)integer10 - 96.0F - 16.0F), 0.0).b(200, 0, 0, 0).d();
			bpy7.b((double)((float)integer9 - 176.0F), (double)(integer10 + 320), 0.0).b(200, 0, 0, 0).d();
			bpy7.b((double)((float)integer9 + 176.0F), (double)(integer10 + 320), 0.0).b(200, 0, 0, 0).d();
			bpy7.b((double)((float)integer9 + 176.0F), (double)((float)integer10 - 96.0F - 16.0F), 0.0).b(200, 0, 0, 0).d();
			bqs6.b();
			bqg.l();
			double double11 = 0.0;

			for (int integer13 = 0; integer13 < list4.size(); integer13++) {
				ou.a a14 = (ou.a)list4.get(integer13);
				int integer15 = ot.c(a14.a / 4.0) + 1;
				bpy7.a(6, bzh.f);
				int integer16 = a14.a();
				int integer17 = integer16 >> 16 & 0xFF;
				int integer18 = integer16 >> 8 & 0xFF;
				int integer19 = integer16 & 0xFF;
				bpy7.b((double)integer9, (double)integer10, 0.0).b(integer17, integer18, integer19, 255).d();

				for (int integer20 = integer15; integer20 >= 0; integer20--) {
					float float21 = (float)((double11 + a14.a * (double)integer20 / (double)integer15) * (float) (Math.PI * 2) / 100.0);
					float float22 = ot.a(float21) * 160.0F;
					float float23 = ot.b(float21) * 160.0F * 0.5F;
					bpy7.b((double)((float)integer9 + float22), (double)((float)integer10 - float23), 0.0).b(integer17, integer18, integer19, 255).d();
				}

				bqs6.b();
				bpy7.a(5, bzh.f);

				for (int integer20 = integer15; integer20 >= 0; integer20--) {
					float float21 = (float)((double11 + a14.a * (double)integer20 / (double)integer15) * (float) (Math.PI * 2) / 100.0);
					float float22 = ot.a(float21) * 160.0F;
					float float23 = ot.b(float21) * 160.0F * 0.5F;
					bpy7.b((double)((float)integer9 + float22), (double)((float)integer10 - float23), 0.0).b(integer17 >> 1, integer18 >> 1, integer19 >> 1, 255).d();
					bpy7.b((double)((float)integer9 + float22), (double)((float)integer10 - float23 + 10.0F), 0.0).b(integer17 >> 1, integer18 >> 1, integer19 >> 1, 255).d();
				}

				bqs6.b();
				double11 += a14.a;
			}

			DecimalFormat decimalFormat13 = new DecimalFormat("##0.00");
			bqg.y();
			String string14 = "";
			if (!"unspecified".equals(a5.c)) {
				string14 = string14 + "[0] ";
			}

			if (a5.c.isEmpty()) {
				string14 = string14 + "ROOT ";
			} else {
				string14 = string14 + a5.c + ' ';
			}

			int integer15 = 16777215;
			this.k.a(string14, (float)(integer9 - 160), (float)(integer10 - 80 - 16), 16777215);
			string14 = decimalFormat13.format(a5.b) + "%";
			this.k.a(string14, (float)(integer9 + 160 - this.k.a(string14)), (float)(integer10 - 80 - 16), 16777215);

			for (int integer14 = 0; integer14 < list4.size(); integer14++) {
				ou.a a15 = (ou.a)list4.get(integer14);
				StringBuilder stringBuilder16 = new StringBuilder();
				if ("unspecified".equals(a15.c)) {
					stringBuilder16.append("[?] ");
				} else {
					stringBuilder16.append("[").append(integer14 + 1).append("] ");
				}

				String string17 = stringBuilder16.append(a15.c).toString();
				this.k.a(string17, (float)(integer9 - 160), (float)(integer10 + 80 + integer14 * 8 + 20), a15.a());
				string17 = decimalFormat13.format(a15.a) + "%";
				this.k.a(string17, (float)(integer9 + 160 - 50 - this.k.a(string17)), (float)(integer10 + 80 + integer14 * 8 + 20), a15.a());
				string17 = decimalFormat13.format(a15.b) + "%";
				this.k.a(string17, (float)(integer9 + 160 - this.k.a(string17)), (float)(integer10 + 80 + integer14 * 8 + 20), a15.a());
			}
		}
	}

	public void n() {
		this.C = false;
	}

	public void o() {
		if (Display.isActive()) {
			if (!this.x) {
				if (!a) {
					bep.a();
				}

				this.x = true;
				this.v.a();
				this.a(null);
				this.ag = 10000;
			}
		}
	}

	public void p() {
		if (this.x) {
			this.x = false;
			this.v.b();
		}
	}

	public void q() {
		if (this.m == null) {
			this.a(new bhk());
			if (this.E() && !this.aj.a()) {
				this.aJ.a();
			}
		}
	}

	private void b(boolean boolean1) {
		if (!boolean1) {
			this.ag = 0;
		}

		if (this.ag <= 0 && !this.h.cy()) {
			if (boolean1 && this.t != null && this.t.a == bdu.a.BLOCK) {
				co co3 = this.t.a();
				if (this.f.o(co3).a() != azs.a && this.c.b(co3, this.t.b)) {
					this.j.a(co3, this.t.b);
					this.h.a(ri.MAIN_HAND);
				}
			} else {
				this.c.c();
			}
		}
	}

	private void aw() {
		if (this.ag <= 0) {
			if (this.t == null) {
				J.error("Null returned as 'hitResult', this shouldn't happen!");
				if (this.c.g()) {
					this.ag = 10;
				}
			} else if (!this.h.L()) {
				switch (this.t.a) {
					case ENTITY:
						this.c.a(this.h, this.t.d);
						break;
					case BLOCK:
						co co2 = this.t.a();
						if (this.f.o(co2).a() != azs.a) {
							this.c.a(co2, this.t.b);
							break;
						}
					case MISS:
						if (this.c.g()) {
							this.ag = 10;
						}

						this.h.dh();
				}

				this.h.a(ri.MAIN_HAND);
			}
		}
	}

	private void ax() {
		if (!this.c.m()) {
			this.aq = 4;
			if (!this.h.L()) {
				if (this.t == null) {
					J.warn("Null returned as 'hitResult', this shouldn't happen!");
				}

				for (ri ri5 : ri.values()) {
					afj afj6 = this.h.b(ri5);
					if (this.t != null) {
						switch (this.t.a) {
							case ENTITY:
								if (this.c.a(this.h, this.t.d, this.t, ri5) == rk.SUCCESS) {
									return;
								}

								if (this.c.a(this.h, this.t.d, ri5) == rk.SUCCESS) {
									return;
								}
								break;
							case BLOCK:
								co co7 = this.t.a();
								if (this.f.o(co7).a() != azs.a) {
									int integer8 = afj6.E();
									rk rk9 = this.c.a(this.h, this.f, co7, this.t.b, this.t.c, ri5);
									if (rk9 == rk.SUCCESS) {
										this.h.a(ri5);
										if (!afj6.b() && (afj6.E() != integer8 || this.c.h())) {
											this.o.c.a(ri5);
										}

										return;
									}
								}
						}
					}

					if (!afj6.b() && this.c.a(this.h, this.f, ri5) == rk.SUCCESS) {
						this.o.c.a(ri5);
						return;
					}
				}
			}
		}
	}

	public void r() {
		try {
			this.T = !this.T;
			this.u.t = this.T;
			if (this.T) {
				this.au();
				this.d = Display.getDisplayMode().getWidth();
				this.e = Display.getDisplayMode().getHeight();
				if (this.d <= 0) {
					this.d = 1;
				}

				if (this.e <= 0) {
					this.e = 1;
				}
			} else {
				Display.setDisplayMode(new DisplayMode(this.ah, this.ai));
				this.d = this.ah;
				this.e = this.ai;
				if (this.d <= 0) {
					this.d = 1;
				}

				if (this.e <= 0) {
					this.e = 1;
				}
			}

			if (this.m != null) {
				this.a(this.d, this.e);
			} else {
				this.ay();
			}

			Display.setFullscreen(this.T);
			Display.setVSyncEnabled(this.u.u);
			this.i();
		} catch (Exception var2) {
			J.error("Couldn't toggle fullscreen", var2);
		}
	}

	private void a(int integer1, int integer2) {
		this.d = Math.max(1, integer1);
		this.e = Math.max(1, integer2);
		if (this.m != null) {
			bfk bfk4 = new bfk(this);
			this.m.b(this, bfk4.a(), bfk4.b());
		}

		this.n = new bev(this);
		this.ay();
	}

	private void ay() {
		this.aH.a(this.d, this.e);
		if (this.o != null) {
			this.o.a(this.d, this.e);
		}
	}

	public ccp s() {
		return this.aK;
	}

	public void t() {
		if (this.aq > 0) {
			this.aq--;
		}

		this.B.a("gui");
		if (!this.af) {
			this.r.c();
		}

		this.B.b();
		this.o.a(1.0F);
		this.B.a("gameMode");
		if (!this.af && this.f != null) {
			this.c.e();
		}

		this.B.c("textures");
		if (!this.af) {
			this.Q.e();
		}

		if (this.m == null && this.h != null) {
			if (this.h.bU() <= 0.0F && !(this.m instanceof bgz)) {
				this.a(null);
			} else if (this.h.cr() && this.f != null) {
				this.a(new bhf());
			}
		} else if (this.m != null && this.m instanceof bhf && !this.h.cr()) {
			this.a(null);
		}

		if (this.m != null) {
			this.ag = 10000;
		}

		if (this.m != null) {
			try {
				this.m.p();
			} catch (Throwable var5) {
				b b3 = b.a(var5, "Updating screen events");
				c c4 = b3.a("Affected screen");
				c4.a("Screen name", new d<String>() {
					public String call() throws Exception {
						return bes.this.m.getClass().getCanonicalName();
					}
				});
				throw new f(b3);
			}

			if (this.m != null) {
				try {
					this.m.e();
				} catch (Throwable var4) {
					b b3 = b.a(var4, "Ticking screen");
					c c4 = b3.a("Affected screen");
					c4.a("Screen name", new d<String>() {
						public String call() throws Exception {
							return bes.this.m.getClass().getCanonicalName();
						}
					});
					throw new f(b3);
				}
			}
		}

		if (this.m == null || this.m.p) {
			this.B.c("mouse");
			this.aB();
			if (this.ag > 0) {
				this.ag--;
			}

			this.B.c("keyboard");
			this.az();
		}

		if (this.f != null) {
			if (this.h != null) {
				this.at++;
				if (this.at == 30) {
					this.at = 0;
					this.f.i(this.h);
				}
			}

			this.B.c("gameRenderer");
			if (!this.af) {
				this.o.e();
			}

			this.B.c("levelRenderer");
			if (!this.af) {
				this.g.k();
			}

			this.B.c("level");
			if (!this.af) {
				if (this.f.ag() > 0) {
					this.f.d(this.f.ag() - 1);
				}

				this.f.k();
			}
		} else if (this.o.a()) {
			this.o.b();
		}

		if (!this.af) {
			this.aK.F_();
			this.aJ.F_();
		}

		if (this.f != null) {
			if (!this.af) {
				this.f.a(this.f.ae() != rg.PEACEFUL, true);

				try {
					this.f.d();
				} catch (Throwable var6) {
					b b3 = b.a(var6, "Exception in world tick");
					if (this.f == null) {
						c c4 = b3.a("Affected level");
						c4.a("Problem", "Level is null!");
					} else {
						this.f.a(b3);
					}

					throw new f(b3);
				}
			}

			this.B.c("animateTick");
			if (!this.af && this.f != null) {
				this.f.b(ot.c(this.h.p), ot.c(this.h.q), ot.c(this.h.r));
			}

			this.B.c("particles");
			if (!this.af) {
				this.j.a();
			}
		} else if (this.aw != null) {
			this.B.c("pendingConnection");
			this.aw.a();
		}

		this.B.b();
		this.y = I();
	}

	private void az() {
		while (Keyboard.next()) {
			int integer2 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + 256 : Keyboard.getEventKey();
			if (this.ay > 0L) {
				if (I() - this.ay >= 6000L) {
					throw new f(new b("Manually triggered debug crash", new Throwable()));
				}

				if (!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61)) {
					this.ay = -1L;
				}
			} else if (Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
				this.aU = true;
				this.ay = I();
			}

			this.W();
			if (this.m != null) {
				this.m.l();
			}

			boolean boolean3 = Keyboard.getEventKeyState();
			if (boolean3) {
				if (integer2 == 62 && this.o != null) {
					this.o.c();
				}

				boolean boolean4 = false;
				if (this.m == null) {
					if (integer2 == 1) {
						this.q();
					}

					boolean4 = Keyboard.isKeyDown(61) && this.c(integer2);
					this.aU |= boolean4;
					if (integer2 == 59) {
						this.u.ar = !this.u.ar;
					}
				}

				if (boolean4) {
					bep.a(integer2, false);
				} else {
					bep.a(integer2, true);
					bep.a(integer2);
				}

				if (this.u.au) {
					if (integer2 == 11) {
						this.b(0);
					}

					for (int integer5 = 0; integer5 < 9; integer5++) {
						if (integer2 == 2 + integer5) {
							this.b(integer5 + 1);
						}
					}
				}
			} else {
				bep.a(integer2, false);
				if (integer2 == 61) {
					if (this.aU) {
						this.aU = false;
					} else {
						this.u.at = !this.u.at;
						this.u.au = this.u.at && bho.r();
						this.u.av = this.u.at && bho.s();
					}
				}
			}
		}

		this.aA();
	}

	private boolean c(int integer) {
		if (integer == 30) {
			this.g.a();
			this.a("debug.reload_chunks.message");
			return true;
		} else if (integer == 48) {
			boolean boolean3 = !this.aa.b();
			this.aa.b(boolean3);
			this.a(boolean3 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
			return true;
		} else if (integer == 32) {
			if (this.r != null) {
				this.r.d().a(false);
			}

			return true;
		} else if (integer == 33) {
			this.u.a(beu.a.RENDER_DISTANCE, bho.r() ? -1 : 1);
			this.a("debug.cycle_renderdistance.message", this.u.d);
			return true;
		} else if (integer == 34) {
			boolean boolean3 = this.p.b();
			this.a(boolean3 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off");
			return true;
		} else if (integer == 35) {
			this.u.y = !this.u.y;
			this.a(this.u.y ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off");
			this.u.b();
			return true;
		} else if (integer == 49) {
			if (!this.h.a(2, "")) {
				this.a("debug.creative_spectator.error");
			} else if (this.h.z()) {
				this.h.g("/gamemode spectator");
			} else if (this.h.y()) {
				this.h.g("/gamemode creative");
			}

			return true;
		} else if (integer == 25) {
			this.u.z = !this.u.z;
			this.u.b();
			this.a(this.u.z ? "debug.pause_focus.on" : "debug.pause_focus.off");
			return true;
		} else if (integer == 16) {
			this.a("debug.help.message");
			bfn bfn3 = this.r.d();
			bfn3.a(new fi("debug.reload_chunks.help"));
			bfn3.a(new fi("debug.show_hitboxes.help"));
			bfn3.a(new fi("debug.clear_chat.help"));
			bfn3.a(new fi("debug.cycle_renderdistance.help"));
			bfn3.a(new fi("debug.chunk_boundaries.help"));
			bfn3.a(new fi("debug.advanced_tooltips.help"));
			bfn3.a(new fi("debug.creative_spectator.help"));
			bfn3.a(new fi("debug.pause_focus.help"));
			bfn3.a(new fi("debug.help.help"));
			bfn3.a(new fi("debug.reload_resourcepacks.help"));
			return true;
		} else if (integer == 20) {
			this.a("debug.reload_resourcepacks.message");
			this.f();
			return true;
		} else {
			return false;
		}
	}

	private void aA() {
		while (this.u.aj.g()) {
			this.u.as++;
			if (this.u.as > 2) {
				this.u.as = 0;
			}

			if (this.u.as == 0) {
				this.o.a(this.aa());
			} else if (this.u.as == 1) {
				this.o.a(null);
			}

			this.g.o();
		}

		while (this.u.ak.g()) {
			this.u.ax = !this.u.ax;
		}

		for (int integer2 = 0; integer2 < 9; integer2++) {
			if (this.u.an[integer2].g()) {
				if (this.h.y()) {
					this.r.g().a(integer2);
				} else {
					this.h.bs.d = integer2;
				}
			}
		}

		while (this.u.Z.g()) {
			this.v().a(new iq(iq.a.OPEN_INVENTORY_ACHIEVEMENT));
			if (this.c.j()) {
				this.h.C();
			} else {
				this.a(new bix(this.h));
			}
		}

		while (this.u.aa.g()) {
			if (!this.h.y()) {
				this.v().a(new jd(jd.a.SWAP_HELD_ITEMS, co.a, cv.DOWN));
			}
		}

		while (this.u.ab.g()) {
			if (!this.h.y()) {
				this.h.a(bho.q());
			}
		}

		boolean boolean2 = this.u.n != aay.b.HIDDEN;
		if (boolean2) {
			while (this.u.af.g()) {
				this.a(new bgr());
			}

			if (this.m == null && this.u.ah.g()) {
				this.a(new bgr("/"));
			}
		}

		if (this.h.cy()) {
			if (!this.u.ac.e()) {
				this.c.c(this.h);
			}

			while (this.u.ad.g()) {
			}

			while (this.u.ac.g()) {
			}

			while (this.u.ae.g()) {
			}
		} else {
			while (this.u.ad.g()) {
				this.aw();
			}

			while (this.u.ac.g()) {
				this.ax();
			}

			while (this.u.ae.g()) {
				this.aC();
			}
		}

		if (this.u.ac.e() && this.aq == 0 && !this.h.cy()) {
			this.ax();
		}

		this.b(this.m == null && this.u.ad.e() && this.x);
	}

	private void aB() {
		while (Mouse.next()) {
			int integer2 = Mouse.getEventButton();
			bep.a(integer2 - 100, Mouse.getEventButtonState());
			if (Mouse.getEventButtonState()) {
				if (this.h.y() && integer2 == 2) {
					this.r.g().b();
				} else {
					bep.a(integer2 - 100);
				}
			}

			long long3 = I() - this.y;
			if (long3 <= 200L) {
				int integer5 = Mouse.getEventDWheel();
				if (integer5 != 0) {
					if (this.h.y()) {
						integer5 = integer5 < 0 ? -1 : 1;
						if (this.r.g().a()) {
							this.r.g().b(-integer5);
						} else {
							float float6 = ot.a(this.h.bK.a() + (float)integer5 * 0.005F, 0.0F, 0.2F);
							this.h.bK.a(float6);
						}
					} else {
						this.h.bs.f(integer5);
					}
				}

				if (this.m == null) {
					if (!this.x && Mouse.getEventButtonState()) {
						this.o();
					}
				} else if (this.m != null) {
					this.m.k();
				}
			}
		}
	}

	private void a(String string, Object... arr) {
		this.r.d().a(new fh("").a(new fh("[Debug]: ").a(new fg().a(a.YELLOW).a(true))).a(new fi(string, arr)));
	}

	public void a(String string1, String string2, @Nullable ajv ajv) {
		this.a(null);
		System.gc();
		bbw bbw5 = this.ao.a(string1, false);
		bbv bbv6 = bbw5.d();
		if (bbv6 == null && ajv != null) {
			bbv6 = new bbv(ajv, string1);
			bbw5.a(bbv6);
		}

		if (ajv == null) {
			ajv = new ajv(bbv6);
		}

		try {
			YggdrasilAuthenticationService yggdrasilAuthenticationService7 = new YggdrasilAuthenticationService(this.an, UUID.randomUUID().toString());
			MinecraftSessionService minecraftSessionService8 = yggdrasilAuthenticationService7.createMinecraftSessionService();
			GameProfileRepository gameProfileRepository9 = yggdrasilAuthenticationService7.createProfileRepository();
			mp mp10 = new mp(gameProfileRepository9, new File(this.w, MinecraftServer.a.getName()));
			asw.a(mp10);
			asw.a(minecraftSessionService8);
			mp.a(false);
			this.aj = new cch(this, string1, string2, ajv, yggdrasilAuthenticationService7, minecraftSessionService8, gameProfileRepository9, mp10);
			this.aj.F();
			this.ax = true;
		} catch (Throwable var11) {
			b b8 = b.a(var11, "Starting integrated server");
			c c9 = b8.a("Starting integrated server");
			c9.a("Level ID", string1);
			c9.a("Level Name", string2);
			throw new f(b8);
		}

		this.n.a(cah.a("menu.loadingLevel"));

		while (!this.aj.ao()) {
			String string7 = this.aj.k();
			if (string7 != null) {
				this.n.c(cah.a(string7));
			} else {
				this.n.c("");
			}

			try {
				Thread.sleep(200L);
			} catch (InterruptedException var10) {
			}
		}

		this.a(new bhm());
		SocketAddress socketAddress7 = this.aj.an().a();
		er er8 = er.a(socketAddress7);
		er8.a(new bnn(er8, this, null));
		er8.a(new jp(316, socketAddress7.toString(), 0, es.LOGIN));
		er8.a(new jy(this.K().e()));
		this.aw = er8;
	}

	public void a(@Nullable bnq bnq) {
		this.a(bnq, "");
	}

	public void a(@Nullable bnq bnq, String string) {
		if (bnq == null) {
			bno bno4 = this.v();
			if (bno4 != null) {
				bno4.b();
			}

			if (this.aj != null && this.aj.M()) {
				this.aj.x();
			}

			this.aj = null;
			this.q.b();
			this.o.k();
			this.c = null;
		}

		this.ad = null;
		this.aw = null;
		if (this.n != null) {
			this.n.b(string);
			this.n.c("");
		}

		if (bnq == null && this.f != null) {
			this.aD.h();
			this.r.i();
			this.a(null);
			this.ax = false;
		}

		this.aJ.b();
		this.f = bnq;
		if (this.g != null) {
			this.g.a(bnq);
		}

		if (this.j != null) {
			this.j.a(bnq);
		}

		bsk.a.a(bnq);
		if (bnq != null) {
			if (!this.ax) {
				AuthenticationService authenticationService4 = new YggdrasilAuthenticationService(this.an, UUID.randomUUID().toString());
				MinecraftSessionService minecraftSessionService5 = authenticationService4.createMinecraftSessionService();
				GameProfileRepository gameProfileRepository6 = authenticationService4.createProfileRepository();
				mp mp7 = new mp(gameProfileRepository6, new File(this.w, MinecraftServer.a.getName()));
				asw.a(mp7);
				asw.a(minecraftSessionService5);
				mp.a(false);
			}

			if (this.h == null) {
				this.h = this.c.a(bnq, new ob());
				this.c.b(this.h);
			}

			this.h.S();
			bnq.a(this.h);
			this.h.e = new bpr(this.u);
			this.c.a(this.h);
			this.ad = this.h;
		} else {
			this.ao.d();
			this.h = null;
		}

		System.gc();
		this.y = 0L;
	}

	public void a(int integer) {
		this.f.h();
		this.f.c();
		int integer3 = 0;
		String string4 = null;
		if (this.h != null) {
			integer3 = this.h.O();
			this.f.e(this.h);
			string4 = this.h.D();
		}

		this.ad = null;
		bps bps5 = this.h;
		this.h = this.c.a(this.f, this.h == null ? new ob() : this.h.E());
		this.h.R().a(bps5.R().c());
		this.h.am = integer;
		this.ad = this.h;
		this.h.S();
		this.h.h(string4);
		this.f.a(this.h);
		this.c.b(this.h);
		this.h.e = new bpr(this.u);
		this.h.h(integer3);
		this.c.a(this.h);
		this.h.o(bps5.df());
		if (this.m instanceof bgz) {
			this.a(null);
		}
	}

	public final boolean u() {
		return this.av;
	}

	@Nullable
	public bno v() {
		return this.h == null ? null : this.h.d;
	}

	public static boolean w() {
		return R == null || !R.u.ar;
	}

	public static boolean x() {
		return R != null && R.u.j;
	}

	public static boolean y() {
		return R != null && R.u.k != 0;
	}

	private void aC() {
		if (this.t != null && this.t.a != bdu.a.MISS) {
			boolean boolean2 = this.h.bK.d;
			asc asc3 = null;
			afj afj4;
			if (this.t.a == bdu.a.BLOCK) {
				co co5 = this.t.a();
				atl atl6 = this.f.o(co5);
				alu alu7 = atl6.v();
				if (atl6.a() == azs.a) {
					return;
				}

				afj4 = alu7.a(this.f, co5, atl6);
				if (afj4.b()) {
					return;
				}

				if (boolean2 && bho.q() && alu7.l()) {
					asc3 = this.f.r(co5);
				}
			} else {
				if (this.t.a != bdu.a.ENTITY || this.t.d == null || !boolean2) {
					return;
				}

				if (this.t.d instanceof zb) {
					afj4 = new afj(afl.aq);
				} else if (this.t.d instanceof za) {
					afj4 = new afj(afl.cy);
				} else if (this.t.d instanceof yz) {
					yz yz5 = (yz)this.t.d;
					afj afj6 = yz5.r();
					if (afj6.b()) {
						afj4 = new afj(afl.ca);
					} else {
						afj4 = afj6.l();
					}
				} else if (this.t.d instanceof aby) {
					aby aby5 = (aby)this.t.d;
					afh afh6;
					switch (aby5.v()) {
						case FURNACE:
							afh6 = afl.aW;
							break;
						case CHEST:
							afh6 = afl.aV;
							break;
						case TNT:
							afh6 = afl.cs;
							break;
						case HOPPER:
							afh6 = afl.ct;
							break;
						case COMMAND_BLOCK:
							afh6 = afl.cA;
							break;
						default:
							afh6 = afl.aC;
					}

					afj4 = new afj(afh6);
				} else if (this.t.d instanceof abx) {
					afj4 = new afj(((abx)this.t.d).j());
				} else if (this.t.d instanceof yx) {
					afj4 = new afj(afl.cu);
				} else if (this.t.d instanceof ya) {
					afj4 = new afj(afl.cQ);
				} else {
					kq kq5 = sp.a(this.t.d);
					if (kq5 == null || !sp.c.containsKey(kq5)) {
						return;
					}

					afj4 = new afj(afl.bU);
					ago.a(afj4, kq5);
				}
			}

			if (afj4.b()) {
				String string5 = "";
				if (this.t.a == bdu.a.BLOCK) {
					string5 = alu.h.b(this.f.o(this.t.a()).v()).toString();
				} else if (this.t.a == bdu.a.ENTITY) {
					string5 = sp.a(this.t.d).toString();
				}

				J.warn("Picking on: [{}] {} gave null item", new Object[]{this.t.a, string5});
			} else {
				aax aax5 = this.h.bs;
				if (asc3 != null) {
					this.a(afj4, asc3);
				}

				int integer6 = aax5.b(afj4);
				if (boolean2) {
					aax5.a(afj4);
					this.c.a(this.h.b(ri.MAIN_HAND), 36 + aax5.d);
				} else if (integer6 != -1) {
					if (aax.e(integer6)) {
						aax5.d = integer6;
					} else {
						this.c.a(integer6);
					}
				}
			}
		}
	}

	private afj a(afj afj, asc asc) {
		du du4 = asc.b(new du());
		if (afj.c() == afl.ci && du4.e("Owner")) {
			du du5 = du4.o("Owner");
			du du6 = new du();
			du6.a("SkullOwner", du5);
			afj.b(du6);
			return afj;
		} else {
			afj.a("BlockEntityTag", du4);
			du du5 = new du();
			ea ea6 = new ea();
			ea6.a(new eh("(+NBT)"));
			du5.a("Lore", ea6);
			afj.a("display", du5);
			return afj;
		}
	}

	public b b(b b) {
		b.g().a("Launched Version", new d<String>() {
			public String call() {
				return bes.this.al;
			}
		});
		b.g().a("LWJGL", new d<String>() {
			public String call() {
				return Sys.getVersion();
			}
		});
		b.g().a("OpenGL", new d<String>() {
			public String call() {
				return bqg.u(7937) + " GL version " + bqg.u(7938) + ", " + bqg.u(7936);
			}
		});
		b.g().a("GL Caps", new d<String>() {
			public String call() {
				return cdb.c();
			}
		});
		b.g().a("Using VBOs", new d<String>() {
			public String call() {
				return bes.this.u.v ? "Yes" : "No";
			}
		});
		b.g().a("Is Modded", new d<String>() {
			public String call() throws Exception {
				String string2 = ClientBrandRetriever.getClientModName();
				if (!"vanilla".equals(string2)) {
					return "Definitely; Client brand changed to '" + string2 + "'";
				} else {
					return bes.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.";
				}
			}
		});
		b.g().a("Type", new d<String>() {
			public String call() throws Exception {
				return "Client (map_client.txt)";
			}
		});
		b.g().a("Resource Packs", new d<String>() {
			public String call() throws Exception {
				StringBuilder stringBuilder2 = new StringBuilder();

				for (String string4 : bes.this.u.l) {
					if (stringBuilder2.length() > 0) {
						stringBuilder2.append(", ");
					}

					stringBuilder2.append(string4);
					if (bes.this.u.m.contains(string4)) {
						stringBuilder2.append(" (incompatible)");
					}
				}

				return stringBuilder2.toString();
			}
		});
		b.g().a("Current Language", new d<String>() {
			public String call() throws Exception {
				return bes.this.aE.c().toString();
			}
		});
		b.g().a("Profiler Position", new d<String>() {
			public String call() throws Exception {
				return bes.this.B.a ? bes.this.B.c() : "N/A (disabled)";
			}
		});
		b.g().a("CPU", new d<String>() {
			public String call() {
				return cdb.k();
			}
		});
		if (this.f != null) {
			this.f.a(b);
		}

		return b;
	}

	public static bes z() {
		return R;
	}

	public ListenableFuture<Object> A() {
		return this.a(new Runnable() {
			public void run() {
				bes.this.f();
			}
		});
	}

	@Override
	public void a(rs rs) {
		rs.a("fps", ap);
		rs.a("vsync_enabled", this.u.u);
		rs.a("display_frequency", Display.getDisplayMode().getFrequency());
		rs.a("display_type", this.T ? "fullscreen" : "windowed");
		rs.a("run_time", (MinecraftServer.aw() - rs.g()) / 60L * 1000L);
		rs.a("current_action", this.aD());
		rs.a("language", this.u.aE == null ? "en_us" : this.u.aE);
		String string3 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "little" : "big";
		rs.a("endianness", string3);
		rs.a("subtitles", this.u.P);
		rs.a("touch", this.u.A ? "touch" : "mouse");
		rs.a("resource_packs", this.aD.e().size());
		int integer4 = 0;

		for (cad.a a6 : this.aD.e()) {
			rs.a("resource_pack[" + integer4++ + "]", a6.d());
		}

		if (this.aj != null && this.aj.as() != null) {
			rs.a("snooper_partner", this.aj.as().f());
		}
	}

	private String aD() {
		if (this.aj != null) {
			return this.aj.a() ? "hosting_lan" : "singleplayer";
		} else if (this.P != null) {
			return this.P.d() ? "playing_lan" : "multiplayer";
		} else {
			return "out_of_game";
		}
	}

	@Override
	public void b(rs rs) {
		rs.b("opengl_version", bqg.u(7938));
		rs.b("opengl_vendor", bqg.u(7936));
		rs.b("client_brand", ClientBrandRetriever.getClientModName());
		rs.b("launched_version", this.al);
		ContextCapabilities contextCapabilities3 = GLContext.getCapabilities();
		rs.b("gl_caps[ARB_arrays_of_arrays]", contextCapabilities3.GL_ARB_arrays_of_arrays);
		rs.b("gl_caps[ARB_base_instance]", contextCapabilities3.GL_ARB_base_instance);
		rs.b("gl_caps[ARB_blend_func_extended]", contextCapabilities3.GL_ARB_blend_func_extended);
		rs.b("gl_caps[ARB_clear_buffer_object]", contextCapabilities3.GL_ARB_clear_buffer_object);
		rs.b("gl_caps[ARB_color_buffer_float]", contextCapabilities3.GL_ARB_color_buffer_float);
		rs.b("gl_caps[ARB_compatibility]", contextCapabilities3.GL_ARB_compatibility);
		rs.b("gl_caps[ARB_compressed_texture_pixel_storage]", contextCapabilities3.GL_ARB_compressed_texture_pixel_storage);
		rs.b("gl_caps[ARB_compute_shader]", contextCapabilities3.GL_ARB_compute_shader);
		rs.b("gl_caps[ARB_copy_buffer]", contextCapabilities3.GL_ARB_copy_buffer);
		rs.b("gl_caps[ARB_copy_image]", contextCapabilities3.GL_ARB_copy_image);
		rs.b("gl_caps[ARB_depth_buffer_float]", contextCapabilities3.GL_ARB_depth_buffer_float);
		rs.b("gl_caps[ARB_compute_shader]", contextCapabilities3.GL_ARB_compute_shader);
		rs.b("gl_caps[ARB_copy_buffer]", contextCapabilities3.GL_ARB_copy_buffer);
		rs.b("gl_caps[ARB_copy_image]", contextCapabilities3.GL_ARB_copy_image);
		rs.b("gl_caps[ARB_depth_buffer_float]", contextCapabilities3.GL_ARB_depth_buffer_float);
		rs.b("gl_caps[ARB_depth_clamp]", contextCapabilities3.GL_ARB_depth_clamp);
		rs.b("gl_caps[ARB_depth_texture]", contextCapabilities3.GL_ARB_depth_texture);
		rs.b("gl_caps[ARB_draw_buffers]", contextCapabilities3.GL_ARB_draw_buffers);
		rs.b("gl_caps[ARB_draw_buffers_blend]", contextCapabilities3.GL_ARB_draw_buffers_blend);
		rs.b("gl_caps[ARB_draw_elements_base_vertex]", contextCapabilities3.GL_ARB_draw_elements_base_vertex);
		rs.b("gl_caps[ARB_draw_indirect]", contextCapabilities3.GL_ARB_draw_indirect);
		rs.b("gl_caps[ARB_draw_instanced]", contextCapabilities3.GL_ARB_draw_instanced);
		rs.b("gl_caps[ARB_explicit_attrib_location]", contextCapabilities3.GL_ARB_explicit_attrib_location);
		rs.b("gl_caps[ARB_explicit_uniform_location]", contextCapabilities3.GL_ARB_explicit_uniform_location);
		rs.b("gl_caps[ARB_fragment_layer_viewport]", contextCapabilities3.GL_ARB_fragment_layer_viewport);
		rs.b("gl_caps[ARB_fragment_program]", contextCapabilities3.GL_ARB_fragment_program);
		rs.b("gl_caps[ARB_fragment_shader]", contextCapabilities3.GL_ARB_fragment_shader);
		rs.b("gl_caps[ARB_fragment_program_shadow]", contextCapabilities3.GL_ARB_fragment_program_shadow);
		rs.b("gl_caps[ARB_framebuffer_object]", contextCapabilities3.GL_ARB_framebuffer_object);
		rs.b("gl_caps[ARB_framebuffer_sRGB]", contextCapabilities3.GL_ARB_framebuffer_sRGB);
		rs.b("gl_caps[ARB_geometry_shader4]", contextCapabilities3.GL_ARB_geometry_shader4);
		rs.b("gl_caps[ARB_gpu_shader5]", contextCapabilities3.GL_ARB_gpu_shader5);
		rs.b("gl_caps[ARB_half_float_pixel]", contextCapabilities3.GL_ARB_half_float_pixel);
		rs.b("gl_caps[ARB_half_float_vertex]", contextCapabilities3.GL_ARB_half_float_vertex);
		rs.b("gl_caps[ARB_instanced_arrays]", contextCapabilities3.GL_ARB_instanced_arrays);
		rs.b("gl_caps[ARB_map_buffer_alignment]", contextCapabilities3.GL_ARB_map_buffer_alignment);
		rs.b("gl_caps[ARB_map_buffer_range]", contextCapabilities3.GL_ARB_map_buffer_range);
		rs.b("gl_caps[ARB_multisample]", contextCapabilities3.GL_ARB_multisample);
		rs.b("gl_caps[ARB_multitexture]", contextCapabilities3.GL_ARB_multitexture);
		rs.b("gl_caps[ARB_occlusion_query2]", contextCapabilities3.GL_ARB_occlusion_query2);
		rs.b("gl_caps[ARB_pixel_buffer_object]", contextCapabilities3.GL_ARB_pixel_buffer_object);
		rs.b("gl_caps[ARB_seamless_cube_map]", contextCapabilities3.GL_ARB_seamless_cube_map);
		rs.b("gl_caps[ARB_shader_objects]", contextCapabilities3.GL_ARB_shader_objects);
		rs.b("gl_caps[ARB_shader_stencil_export]", contextCapabilities3.GL_ARB_shader_stencil_export);
		rs.b("gl_caps[ARB_shader_texture_lod]", contextCapabilities3.GL_ARB_shader_texture_lod);
		rs.b("gl_caps[ARB_shadow]", contextCapabilities3.GL_ARB_shadow);
		rs.b("gl_caps[ARB_shadow_ambient]", contextCapabilities3.GL_ARB_shadow_ambient);
		rs.b("gl_caps[ARB_stencil_texturing]", contextCapabilities3.GL_ARB_stencil_texturing);
		rs.b("gl_caps[ARB_sync]", contextCapabilities3.GL_ARB_sync);
		rs.b("gl_caps[ARB_tessellation_shader]", contextCapabilities3.GL_ARB_tessellation_shader);
		rs.b("gl_caps[ARB_texture_border_clamp]", contextCapabilities3.GL_ARB_texture_border_clamp);
		rs.b("gl_caps[ARB_texture_buffer_object]", contextCapabilities3.GL_ARB_texture_buffer_object);
		rs.b("gl_caps[ARB_texture_cube_map]", contextCapabilities3.GL_ARB_texture_cube_map);
		rs.b("gl_caps[ARB_texture_cube_map_array]", contextCapabilities3.GL_ARB_texture_cube_map_array);
		rs.b("gl_caps[ARB_texture_non_power_of_two]", contextCapabilities3.GL_ARB_texture_non_power_of_two);
		rs.b("gl_caps[ARB_uniform_buffer_object]", contextCapabilities3.GL_ARB_uniform_buffer_object);
		rs.b("gl_caps[ARB_vertex_blend]", contextCapabilities3.GL_ARB_vertex_blend);
		rs.b("gl_caps[ARB_vertex_buffer_object]", contextCapabilities3.GL_ARB_vertex_buffer_object);
		rs.b("gl_caps[ARB_vertex_program]", contextCapabilities3.GL_ARB_vertex_program);
		rs.b("gl_caps[ARB_vertex_shader]", contextCapabilities3.GL_ARB_vertex_shader);
		rs.b("gl_caps[EXT_bindable_uniform]", contextCapabilities3.GL_EXT_bindable_uniform);
		rs.b("gl_caps[EXT_blend_equation_separate]", contextCapabilities3.GL_EXT_blend_equation_separate);
		rs.b("gl_caps[EXT_blend_func_separate]", contextCapabilities3.GL_EXT_blend_func_separate);
		rs.b("gl_caps[EXT_blend_minmax]", contextCapabilities3.GL_EXT_blend_minmax);
		rs.b("gl_caps[EXT_blend_subtract]", contextCapabilities3.GL_EXT_blend_subtract);
		rs.b("gl_caps[EXT_draw_instanced]", contextCapabilities3.GL_EXT_draw_instanced);
		rs.b("gl_caps[EXT_framebuffer_multisample]", contextCapabilities3.GL_EXT_framebuffer_multisample);
		rs.b("gl_caps[EXT_framebuffer_object]", contextCapabilities3.GL_EXT_framebuffer_object);
		rs.b("gl_caps[EXT_framebuffer_sRGB]", contextCapabilities3.GL_EXT_framebuffer_sRGB);
		rs.b("gl_caps[EXT_geometry_shader4]", contextCapabilities3.GL_EXT_geometry_shader4);
		rs.b("gl_caps[EXT_gpu_program_parameters]", contextCapabilities3.GL_EXT_gpu_program_parameters);
		rs.b("gl_caps[EXT_gpu_shader4]", contextCapabilities3.GL_EXT_gpu_shader4);
		rs.b("gl_caps[EXT_multi_draw_arrays]", contextCapabilities3.GL_EXT_multi_draw_arrays);
		rs.b("gl_caps[EXT_packed_depth_stencil]", contextCapabilities3.GL_EXT_packed_depth_stencil);
		rs.b("gl_caps[EXT_paletted_texture]", contextCapabilities3.GL_EXT_paletted_texture);
		rs.b("gl_caps[EXT_rescale_normal]", contextCapabilities3.GL_EXT_rescale_normal);
		rs.b("gl_caps[EXT_separate_shader_objects]", contextCapabilities3.GL_EXT_separate_shader_objects);
		rs.b("gl_caps[EXT_shader_image_load_store]", contextCapabilities3.GL_EXT_shader_image_load_store);
		rs.b("gl_caps[EXT_shadow_funcs]", contextCapabilities3.GL_EXT_shadow_funcs);
		rs.b("gl_caps[EXT_shared_texture_palette]", contextCapabilities3.GL_EXT_shared_texture_palette);
		rs.b("gl_caps[EXT_stencil_clear_tag]", contextCapabilities3.GL_EXT_stencil_clear_tag);
		rs.b("gl_caps[EXT_stencil_two_side]", contextCapabilities3.GL_EXT_stencil_two_side);
		rs.b("gl_caps[EXT_stencil_wrap]", contextCapabilities3.GL_EXT_stencil_wrap);
		rs.b("gl_caps[EXT_texture_3d]", contextCapabilities3.GL_EXT_texture_3d);
		rs.b("gl_caps[EXT_texture_array]", contextCapabilities3.GL_EXT_texture_array);
		rs.b("gl_caps[EXT_texture_buffer_object]", contextCapabilities3.GL_EXT_texture_buffer_object);
		rs.b("gl_caps[EXT_texture_integer]", contextCapabilities3.GL_EXT_texture_integer);
		rs.b("gl_caps[EXT_texture_lod_bias]", contextCapabilities3.GL_EXT_texture_lod_bias);
		rs.b("gl_caps[EXT_texture_sRGB]", contextCapabilities3.GL_EXT_texture_sRGB);
		rs.b("gl_caps[EXT_vertex_shader]", contextCapabilities3.GL_EXT_vertex_shader);
		rs.b("gl_caps[EXT_vertex_weighting]", contextCapabilities3.GL_EXT_vertex_weighting);
		rs.b("gl_caps[gl_max_vertex_uniforms]", bqg.v(35658));
		bqg.L();
		rs.b("gl_caps[gl_max_fragment_uniforms]", bqg.v(35657));
		bqg.L();
		rs.b("gl_caps[gl_max_vertex_attribs]", bqg.v(34921));
		bqg.L();
		rs.b("gl_caps[gl_max_vertex_texture_image_units]", bqg.v(35660));
		bqg.L();
		rs.b("gl_caps[gl_max_texture_image_units]", bqg.v(34930));
		bqg.L();
		rs.b("gl_caps[gl_max_array_texture_layers]", bqg.v(35071));
		bqg.L();
		rs.b("gl_max_texture_size", B());
		GameProfile gameProfile4 = this.ae.e();
		if (gameProfile4 != null && gameProfile4.getId() != null) {
			rs.b("uuid", Hashing.sha1().hashBytes(gameProfile4.getId().toString().getBytes(Charsets.ISO_8859_1)).toString());
		}
	}

	public static int B() {
		for (int integer1 = 16384; integer1 > 0; integer1 >>= 1) {
			bqg.a(32868, 0, 6408, integer1, integer1, 0, 6408, 5121, null);
			int integer2 = bqg.c(32868, 0, 4096);
			if (integer2 != 0) {
				return integer1;
			}
		}

		return -1;
	}

	@Override
	public boolean Z() {
		return this.u.s;
	}

	public void a(bnt bnt) {
		this.P = bnt;
	}

	@Nullable
	public bnt C() {
		return this.P;
	}

	public boolean D() {
		return this.ax;
	}

	public boolean E() {
		return this.ax && this.aj != null;
	}

	@Nullable
	public cch F() {
		return this.aj;
	}

	public static void G() {
		if (R != null) {
			cch cch1 = R.F();
			if (cch1 != null) {
				cch1.u();
			}
		}
	}

	public rs H() {
		return this.Z;
	}

	public static long I() {
		return Sys.getTime() * 1000L / Sys.getTimerResolution();
	}

	public boolean J() {
		return this.T;
	}

	public bez K() {
		return this.ae;
	}

	public PropertyMap L() {
		if (this.O.isEmpty()) {
			GameProfile gameProfile2 = this.X().fillProfileProperties(this.ae.e(), false);
			this.O.putAll(gameProfile2.getProperties());
		}

		return this.O;
	}

	public Proxy M() {
		return this.an;
	}

	public bza N() {
		return this.Q;
	}

	public bzy O() {
		return this.az;
	}

	public cad P() {
		return this.aD;
	}

	public caj Q() {
		return this.aE;
	}

	public byy R() {
		return this.aI;
	}

	public boolean S() {
		return this.au;
	}

	public boolean T() {
		return this.af;
	}

	public ccs U() {
		return this.aJ;
	}

	public ccp.a V() {
		if (this.h != null) {
			if (this.h.l.s instanceof avh) {
				return ccp.a.NETHER;
			} else if (this.h.l.s instanceof avl) {
				return this.r.j().d() ? ccp.a.END_BOSS : ccp.a.END;
			} else {
				return this.h.bK.d && this.h.bK.c ? ccp.a.CREATIVE : ccp.a.GAME;
			}
		} else {
			return ccp.a.MENU;
		}
	}

	public void W() {
		int integer2 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + 256 : Keyboard.getEventKey();
		if (integer2 != 0 && !Keyboard.isRepeatEvent()) {
			if (!(this.m instanceof bie) || ((bie)this.m).g <= I() - 20L) {
				if (Keyboard.getEventKeyState()) {
					if (integer2 == this.u.al.j()) {
						this.r();
					} else if (integer2 == this.u.ai.j()) {
						this.r.d().a(bew.a(this.w, this.d, this.e, this.aH));
					}
				}
			}
		}
	}

	public MinecraftSessionService X() {
		return this.aM;
	}

	public cag Y() {
		return this.aN;
	}

	@Nullable
	public sn aa() {
		return this.ad;
	}

	public void a(sn sn) {
		this.ad = sn;
		this.o.a(sn);
	}

	public <V> ListenableFuture<V> a(Callable<V> callable) {
		Validate.notNull(callable);
		if (this.aF()) {
			try {
				return Futures.immediateFuture(callable.call());
			} catch (Exception var5) {
				return Futures.immediateFailedCheckedFuture(var5);
			}
		} else {
			ListenableFutureTask<V> listenableFutureTask3 = ListenableFutureTask.create(callable);
			synchronized (this.aO) {
				this.aO.add(listenableFutureTask3);
				return listenableFutureTask3;
			}
		}
	}

	@Override
	public ListenableFuture<Object> a(Runnable runnable) {
		Validate.notNull(runnable);
		return this.a(Executors.callable(runnable));
	}

	@Override
	public boolean aF() {
		return Thread.currentThread() == this.aP;
	}

	public bra ab() {
		return this.aR;
	}

	public bur ac() {
		return this.aa;
	}

	public bvh ad() {
		return this.ab;
	}

	public bqi ae() {
		return this.ac;
	}

	public static int af() {
		return ap;
	}

	public oj ag() {
		return this.z;
	}

	public boolean ah() {
		return this.X;
	}

	public void a(boolean boolean1) {
		this.X = boolean1;
	}

	public ph ai() {
		return this.S;
	}

	public float aj() {
		return this.Y.c;
	}

	public bfb ak() {
		return this.aF;
	}

	public boolean am() {
		return this.h != null && this.h.df() || this.u.w;
	}
}
