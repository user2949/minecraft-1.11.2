package net.minecraft.server;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Proxy;
import java.net.URLEncoder;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class MinecraftServer implements Runnable, n, qy, rt {
	private static final Logger k = LogManager.getLogger();
	public static final File a = new File("usercache.json");
	private final bby l;
	private final rs m = new rs("server", this, aw());
	private final File n;
	private final List<lf> o = Lists.newArrayList();
	public final m b;
	public final ou c = new ou();
	private final mh p;
	private final kf q = new kf();
	private final Random r = new Random();
	private final ph s;
	private int u = -1;
	public lw[] d;
	private mt v;
	private boolean w = true;
	private boolean x;
	private int y;
	protected final Proxy e;
	public String f;
	public int g;
	private boolean z;
	private boolean A;
	private boolean B;
	private boolean C;
	private boolean D;
	private boolean E;
	private String F;
	private int G;
	private int H;
	public final long[] h = new long[100];
	public long[][] i;
	private KeyPair I;
	private String J;
	private String K;
	private String L;
	private boolean M;
	private boolean N;
	private String O = "";
	private String P = "";
	private boolean Q;
	private long R;
	private String S;
	private boolean T;
	private boolean U;
	private final YggdrasilAuthenticationService V;
	private final MinecraftSessionService W;
	private final GameProfileRepository X;
	private final mp Y;
	private long Z;
	public final Queue<FutureTask<?>> j = Queues.newArrayDeque();
	private Thread aa;
	private long ab = aw();
	private boolean ac;

	public MinecraftServer(
		File file,
		Proxy proxy,
		ph ph,
		YggdrasilAuthenticationService yggdrasilAuthenticationService,
		MinecraftSessionService minecraftSessionService,
		GameProfileRepository gameProfileRepository,
		mp mp
	) {
		this.e = proxy;
		this.V = yggdrasilAuthenticationService;
		this.W = minecraftSessionService;
		this.X = gameProfileRepository;
		this.Y = mp;
		this.n = file;
		this.p = new mh(this);
		this.b = this.i();
		this.l = new bbr(file, ph);
		this.s = ph;
	}

	public bd i() {
		return new bd(this);
	}

	public abstract boolean j() throws IOException;

	public void a(String string) {
		if (this.W().b(string)) {
			k.info("Converting map!");
			this.b("menu.convertingLevel");
			this.W().a(string, new ov() {
				private long b = MinecraftServer.aw();

				@Override
				public void a(String string) {
				}

				@Override
				public void b(String string) {
				}

				@Override
				public void a(int integer) {
					if (MinecraftServer.aw() - this.b >= 1000L) {
						this.b = MinecraftServer.aw();
						MinecraftServer.k.info("Converting... {}%", new Object[]{integer});
					}
				}

				@Override
				public void a() {
				}

				@Override
				public void c(String string) {
				}
			});
		}
	}

	protected synchronized void b(String string) {
		this.S = string;
	}

	@Nullable
	public synchronized String k() {
		return this.S;
	}

	public void a(String string1, String string2, long long3, ajx ajx, String string5) {
		this.a(string1);
		this.b("menu.loadingLevel");
		this.d = new lw[3];
		this.i = new long[this.d.length][100];
		bbw bbw8 = this.l.a(string1, true);
		this.a(this.S(), bbw8);
		bbv bbv10 = bbw8.d();
		ajv ajv9;
		if (bbv10 == null) {
			if (this.V()) {
				ajv9 = lq.a;
			} else {
				ajv9 = new ajv(long3, this.n(), this.m(), this.p(), ajx);
				ajv9.a(string5);
				if (this.N) {
					ajv9.a();
				}
			}

			bbv10 = new bbv(ajv9, string2);
		} else {
			bbv10.a(string2);
			ajv9 = new ajv(bbv10);
		}

		for (int integer11 = 0; integer11 < this.d.length; integer11++) {
			int integer12 = 0;
			if (integer11 == 1) {
				integer12 = -1;
			}

			if (integer11 == 2) {
				integer12 = 1;
			}

			if (integer11 == 0) {
				if (this.V()) {
					this.d[integer11] = (lw)new lq(this, bbw8, bbv10, integer12, this.c).b();
				} else {
					this.d[integer11] = (lw)new lw(this, bbw8, bbv10, integer12, this.c).b();
				}

				this.d[integer11].a(ajv9);
			} else {
				this.d[integer11] = (lw)new ls(this, bbw8, integer12, this.d[0], this.c).b();
			}

			this.d[integer11].a(new lx(this, this.d[integer11]));
			if (!this.R()) {
				this.d[integer11].T().a(this.n());
			}
		}

		this.v.a(this.d);
		this.a(this.o());
		this.l();
	}

	public void l() {
		int integer2 = 16;
		int integer3 = 4;
		int integer4 = 192;
		int integer5 = 625;
		int integer6 = 0;
		this.b("menu.generatingTerrain");
		int integer7 = 0;
		k.info("Preparing start region for level 0");
		lw lw8 = this.d[0];
		co co9 = lw8.R();
		long long10 = aw();

		for (int integer12 = -192; integer12 <= 192 && this.w(); integer12 += 16) {
			for (int integer13 = -192; integer13 <= 192 && this.w(); integer13 += 16) {
				long long14 = aw();
				if (long14 - long10 > 1000L) {
					this.a_("Preparing spawn area", integer6 * 100 / 625);
					long10 = long14;
				}

				integer6++;
				lw8.r().c(co9.p() + integer12 >> 4, co9.r() + integer13 >> 4);
			}
		}

		this.t();
	}

	public void a(String string, bbw bbw) {
		File file4 = new File(bbw.b(), "resources.zip");
		if (file4.isFile()) {
			try {
				this.a_("level://" + URLEncoder.encode(string, Charsets.UTF_8.toString()) + "/" + "resources.zip", "");
			} catch (UnsupportedEncodingException var5) {
				k.warn("Something went wrong url encoding {}", new Object[]{string});
			}
		}
	}

	public abstract boolean m();

	public abstract ajq n();

	public abstract rg o();

	public abstract boolean p();

	public abstract int q();

	public abstract boolean r();

	public abstract boolean s();

	protected void a_(String string, int integer) {
		this.f = string;
		this.g = integer;
		k.info("{}: {}%", new Object[]{string, integer});
	}

	protected void t() {
		this.f = null;
		this.g = 0;
	}

	public void a(boolean boolean1) {
		for (lw lw6 : this.d) {
			if (lw6 != null) {
				if (!boolean1) {
					k.info("Saving chunks for level '{}'/{}", new Object[]{lw6.T().j(), lw6.s.q().b()});
				}

				try {
					lw6.a(true, null);
				} catch (ajt var7) {
					k.warn(var7.getMessage());
				}
			}
		}
	}

	public void u() {
		k.info("Stopping server");
		if (this.an() != null) {
			this.an().b();
		}

		if (this.v != null) {
			k.info("Saving players");
			this.v.j();
			this.v.u();
		}

		if (this.d != null) {
			k.info("Saving worlds");

			for (lw lw5 : this.d) {
				if (lw5 != null) {
					lw5.b = false;
				}
			}

			this.a(false);

			for (lw lw5x : this.d) {
				if (lw5x != null) {
					lw5x.s();
				}
			}
		}

		if (this.m.d()) {
			this.m.e();
		}
	}

	public boolean w() {
		return this.w;
	}

	public void x() {
		this.w = false;
	}

	public void run() {
		try {
			if (this.j()) {
				this.ab = aw();
				long long2 = 0L;
				this.q.a(new fh(this.F));
				this.q.a(new kf.c("1.11.2", 316));
				this.a(this.q);

				while (this.w) {
					long long4 = aw();
					long long6 = long4 - this.ab;
					if (long6 > 2000L && this.ab - this.R >= 15000L) {
						k.warn(
							"Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[]{long6, long6 / 50L}
						);
						long6 = 2000L;
						this.R = this.ab;
					}

					if (long6 < 0L) {
						k.warn("Time ran backwards! Did the system time change?");
						long6 = 0L;
					}

					long2 += long6;
					this.ab = long4;
					if (this.d[0].g()) {
						this.C();
						long2 = 0L;
					} else {
						while (long2 > 50L) {
							long2 -= 50L;
							this.C();
						}
					}

					Thread.sleep(Math.max(1L, 50L - long2));
					this.Q = true;
				}
			} else {
				this.a(null);
			}
		} catch (Throwable var46) {
			k.error("Encountered an unexpected exception", var46);
			b b3 = null;
			if (var46 instanceof f) {
				b3 = this.b(((f)var46).a());
			} else {
				b3 = this.b(new b("Exception in server tick loop", var46));
			}

			File file4 = new File(new File(this.A(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
			if (b3.a(file4)) {
				k.error("This crash report has been saved to: {}", new Object[]{file4.getAbsolutePath()});
			} else {
				k.error("We were unable to save this crash report to disk.");
			}

			this.a(b3);
		} finally {
			try {
				this.x = true;
				this.u();
			} catch (Throwable var44) {
				k.error("Exception stopping the server", var44);
			} finally {
				this.B();
			}
		}
	}

	public void a(kf kf) {
		File file3 = this.d("server-icon.png");
		if (!file3.exists()) {
			file3 = this.W().b(this.S(), "icon.png");
		}

		if (file3.isFile()) {
			ByteBuf byteBuf4 = Unpooled.buffer();

			try {
				BufferedImage bufferedImage5 = ImageIO.read(file3);
				Validate.validState(bufferedImage5.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
				Validate.validState(bufferedImage5.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
				ImageIO.write(bufferedImage5, "PNG", new ByteBufOutputStream(byteBuf4));
				ByteBuf byteBuf6 = Base64.encode(byteBuf4);
				kf.a("data:image/png;base64," + byteBuf6.toString(Charsets.UTF_8));
			} catch (Exception var9) {
				k.error("Couldn't load server icon", var9);
			} finally {
				byteBuf4.release();
			}
		}
	}

	public boolean y() {
		this.ac = this.ac || this.z().isFile();
		return this.ac;
	}

	public File z() {
		return this.W().b(this.S(), "icon.png");
	}

	public File A() {
		return new File(".");
	}

	public void a(b b) {
	}

	public void B() {
	}

	public void C() {
		long long2 = System.nanoTime();
		this.y++;
		if (this.T) {
			this.T = false;
			this.c.a = true;
			this.c.a();
		}

		this.c.a("root");
		this.D();
		if (long2 - this.Z >= 5000000000L) {
			this.Z = long2;
			this.q.a(new kf.a(this.I(), this.H()));
			GameProfile[] arr4 = new GameProfile[Math.min(this.H(), 12)];
			int integer5 = ot.a(this.r, 0, this.H() - arr4.length);

			for (int integer6 = 0; integer6 < arr4.length; integer6++) {
				arr4[integer6] = ((ly)this.v.v().get(integer5 + integer6)).cS();
			}

			Collections.shuffle(Arrays.asList(arr4));
			this.q.b().a(arr4);
		}

		if (this.y % 900 == 0) {
			this.c.a("save");
			this.v.j();
			this.a(true);
			this.c.b();
		}

		this.c.a("tallying");
		this.h[this.y % 100] = System.nanoTime() - long2;
		this.c.b();
		this.c.a("snooper");
		if (!this.m.d() && this.y > 100) {
			this.m.a();
		}

		if (this.y % 6000 == 0) {
			this.m.b();
		}

		this.c.b();
		this.c.b();
	}

	public void D() {
		this.c.a("jobs");
		synchronized (this.j) {
			while (!this.j.isEmpty()) {
				h.a((FutureTask)this.j.poll(), k);
			}
		}

		this.c.c("levels");

		for (int integer2 = 0; integer2 < this.d.length; integer2++) {
			long long3 = System.nanoTime();
			if (integer2 == 0 || this.E()) {
				lw lw5 = this.d[integer2];
				this.c.a(lw5.T().j());
				if (this.y % 20 == 0) {
					this.c.a("timeSync");
					this.v.a(new id(lw5.P(), lw5.Q(), lw5.U().b("doDaylightCycle")), lw5.s.q().a());
					this.c.b();
				}

				this.c.a("tick");

				try {
					lw5.d();
				} catch (Throwable var8) {
					b b7 = b.a(var8, "Exception ticking world");
					lw5.a(b7);
					throw new f(b7);
				}

				try {
					lw5.k();
				} catch (Throwable var7) {
					b b7 = b.a(var7, "Exception ticking world entities");
					lw5.a(b7);
					throw new f(b7);
				}

				this.c.b();
				this.c.a("tracker");
				lw5.v().a();
				this.c.b();
				this.c.b();
			}

			this.i[integer2][this.y % 100] = System.nanoTime() - long3;
		}

		this.c.c("connection");
		this.an().c();
		this.c.c("players");
		this.v.e();
		this.c.c("tickables");

		for (int integer2 = 0; integer2 < this.o.size(); integer2++) {
			((lf)this.o.get(integer2)).F_();
		}

		this.c.b();
	}

	public boolean E() {
		return true;
	}

	public void F() {
		this.aa = new Thread(this, "Server thread");
		this.aa.start();
	}

	public File d(String string) {
		return new File(this.A(), string);
	}

	public void f(String string) {
		k.warn(string);
	}

	public lw a(int integer) {
		if (integer == -1) {
			return this.d[1];
		} else {
			return integer == 1 ? this.d[2] : this.d[0];
		}
	}

	public String G() {
		return "1.11.2";
	}

	public int H() {
		return this.v.o();
	}

	public int I() {
		return this.v.p();
	}

	public String[] J() {
		return this.v.f();
	}

	public GameProfile[] K() {
		return this.v.g();
	}

	public String getServerModName() {
		return "vanilla";
	}

	public b b(b b) {
		b.g().a("Profiler Position", new d<String>() {
			public String call() throws Exception {
				return MinecraftServer.this.c.a ? MinecraftServer.this.c.c() : "N/A (disabled)";
			}
		});
		if (this.v != null) {
			b.g().a("Player Count", new d<String>() {
				public String call() {
					return MinecraftServer.this.v.o() + " / " + MinecraftServer.this.v.p() + "; " + MinecraftServer.this.v.v();
				}
			});
		}

		return b;
	}

	public List<String> a(n n, String string, @Nullable co co, boolean boolean4) {
		List<String> list6 = Lists.newArrayList();
		boolean boolean7 = string.startsWith("/");
		if (boolean7) {
			string = string.substring(1);
		}

		if (!boolean7 && !boolean4) {
			String[] arr8 = string.split(" ", -1);
			String string9 = arr8[arr8.length - 1];

			for (String string13 : this.v.f()) {
				if (j.a(string9, string13)) {
					list6.add(string13);
				}
			}

			return list6;
		} else {
			boolean boolean8 = !string.contains(" ");
			List<String> list9 = this.b.a(n, string, co);
			if (!list9.isEmpty()) {
				for (String string11 : list9) {
					if (boolean8) {
						list6.add("/" + string11);
					} else {
						list6.add(string11);
					}
				}
			}

			return list6;
		}
	}

	public boolean M() {
		return this.n != null;
	}

	@Override
	public String h_() {
		return "Server";
	}

	@Override
	public void a(fb fb) {
		k.info(fb.c());
	}

	@Override
	public boolean a(int integer, String string) {
		return true;
	}

	public m N() {
		return this.b;
	}

	public KeyPair O() {
		return this.I;
	}

	public String Q() {
		return this.J;
	}

	public void i(String string) {
		this.J = string;
	}

	public boolean R() {
		return this.J != null;
	}

	public String S() {
		return this.K;
	}

	public void j(String string) {
		this.K = string;
	}

	public void k(String string) {
		this.L = string;
	}

	public String T() {
		return this.L;
	}

	public void a(KeyPair keyPair) {
		this.I = keyPair;
	}

	public void a(rg rg) {
		for (lw lw6 : this.d) {
			if (lw6 != null) {
				if (lw6.T().s()) {
					lw6.T().a(rg.HARD);
					lw6.a(true, true);
				} else if (this.R()) {
					lw6.T().a(rg);
					lw6.a(lw6.ae() != rg.PEACEFUL, true);
				} else {
					lw6.T().a(rg);
					lw6.a(this.U(), this.B);
				}
			}
		}
	}

	public boolean U() {
		return true;
	}

	public boolean V() {
		return this.M;
	}

	public void b(boolean boolean1) {
		this.M = boolean1;
	}

	public void c(boolean boolean1) {
		this.N = boolean1;
	}

	public bby W() {
		return this.l;
	}

	public String X() {
		return this.O;
	}

	public String Y() {
		return this.P;
	}

	public void a_(String string1, String string2) {
		this.O = string1;
		this.P = string2;
	}

	@Override
	public void a(rs rs) {
		rs.a("whitelist_enabled", false);
		rs.a("whitelist_count", 0);
		if (this.v != null) {
			rs.a("players_current", this.H());
			rs.a("players_max", this.I());
			rs.a("players_seen", this.v.q().length);
		}

		rs.a("uses_auth", this.z);
		rs.a("gui_state", this.ap() ? "enabled" : "disabled");
		rs.a("run_time", (aw() - rs.g()) / 60L * 1000L);
		rs.a("avg_tick_ms", (int)(ot.a(this.h) * 1.0E-6));
		int integer3 = 0;
		if (this.d != null) {
			for (lw lw7 : this.d) {
				if (lw7 != null) {
					bbv bbv8 = lw7.T();
					rs.a("world[" + integer3 + "][dimension]", lw7.s.q().a());
					rs.a("world[" + integer3 + "][mode]", bbv8.q());
					rs.a("world[" + integer3 + "][difficulty]", lw7.ae());
					rs.a("world[" + integer3 + "][hardcore]", bbv8.s());
					rs.a("world[" + integer3 + "][generator_name]", bbv8.t().a());
					rs.a("world[" + integer3 + "][generator_version]", bbv8.t().d());
					rs.a("world[" + integer3 + "][height]", this.G);
					rs.a("world[" + integer3 + "][chunks_loaded]", lw7.r().g());
					integer3++;
				}
			}
		}

		rs.a("worlds", integer3);
	}

	@Override
	public void b(rs rs) {
		rs.b("singleplayer", this.R());
		rs.b("server_brand", this.getServerModName());
		rs.b("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
		rs.b("dedicated", this.aa());
	}

	@Override
	public boolean Z() {
		return true;
	}

	public abstract boolean aa();

	public boolean ab() {
		return this.z;
	}

	public void d(boolean boolean1) {
		this.z = boolean1;
	}

	public boolean ac() {
		return this.A;
	}

	public boolean ad() {
		return this.B;
	}

	public void f(boolean boolean1) {
		this.B = boolean1;
	}

	public boolean ae() {
		return this.C;
	}

	public abstract boolean af();

	public void g(boolean boolean1) {
		this.C = boolean1;
	}

	public boolean ag() {
		return this.D;
	}

	public void h(boolean boolean1) {
		this.D = boolean1;
	}

	public boolean ah() {
		return this.E;
	}

	public void i(boolean boolean1) {
		this.E = boolean1;
	}

	public abstract boolean ai();

	public String aj() {
		return this.F;
	}

	public void l(String string) {
		this.F = string;
	}

	public int ak() {
		return this.G;
	}

	public void c(int integer) {
		this.G = integer;
	}

	public boolean al() {
		return this.x;
	}

	public mt am() {
		return this.v;
	}

	public void a(mt mt) {
		this.v = mt;
	}

	public void a(ajq ajq) {
		for (lw lw6 : this.d) {
			lw6.T().a(ajq);
		}
	}

	public mh an() {
		return this.p;
	}

	public boolean ao() {
		return this.Q;
	}

	public boolean ap() {
		return false;
	}

	public abstract String a(ajq ajq, boolean boolean2);

	public int aq() {
		return this.y;
	}

	public void ar() {
		this.T = true;
	}

	public rs as() {
		return this.m;
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
		return this.d[0];
	}

	@Override
	public sn f() {
		return null;
	}

	public boolean a(ajs ajs, co co, aay aay) {
		return false;
	}

	public boolean au() {
		return this.U;
	}

	public Proxy av() {
		return this.e;
	}

	public static long aw() {
		return System.currentTimeMillis();
	}

	public int ax() {
		return this.H;
	}

	public void d(int integer) {
		this.H = integer;
	}

	@Override
	public fb i_() {
		return new fh(this.h_());
	}

	public boolean ay() {
		return true;
	}

	public MinecraftSessionService az() {
		return this.W;
	}

	public GameProfileRepository aA() {
		return this.X;
	}

	public mp aB() {
		return this.Y;
	}

	public kf aC() {
		return this.q;
	}

	public void aD() {
		this.Z = 0L;
	}

	@Nullable
	public sn a(UUID uUID) {
		for (lw lw6 : this.d) {
			if (lw6 != null) {
				sn sn7 = lw6.a(uUID);
				if (sn7 != null) {
					return sn7;
				}
			}
		}

		return null;
	}

	@Override
	public boolean g() {
		return this.d[0].U().b("sendCommandFeedback");
	}

	@Override
	public void a(o.a a, int integer) {
	}

	@Override
	public MinecraftServer B_() {
		return this;
	}

	public int aE() {
		return 29999984;
	}

	public <V> ListenableFuture<V> a(Callable<V> callable) {
		Validate.notNull(callable);
		if (!this.aF() && !this.al()) {
			ListenableFutureTask<V> listenableFutureTask3 = ListenableFutureTask.create(callable);
			synchronized (this.j) {
				this.j.add(listenableFutureTask3);
				return listenableFutureTask3;
			}
		} else {
			try {
				return Futures.immediateFuture(callable.call());
			} catch (Exception var6) {
				return Futures.immediateFailedCheckedFuture(var6);
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
		return Thread.currentThread() == this.aa;
	}

	public int aG() {
		return 256;
	}

	public ph aJ() {
		return this.s;
	}

	public int a(@Nullable lw lw) {
		return lw != null ? lw.U().c("spawnRadius") : 10;
	}
}
