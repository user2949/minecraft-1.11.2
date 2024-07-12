import com.google.common.collect.Lists;
import com.google.common.util.concurrent.Futures;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.FutureTask;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cch extends MinecraftServer {
	private static final Logger k = LogManager.getLogger();
	private final bes l;
	private final ajv m;
	private boolean n;
	private boolean o;
	private ccl p;

	public cch(
		bes bes,
		String string2,
		String string3,
		ajv ajv,
		YggdrasilAuthenticationService yggdrasilAuthenticationService,
		MinecraftSessionService minecraftSessionService,
		GameProfileRepository gameProfileRepository,
		mp mp
	) {
		super(new File(bes.w, "saves"), bes.M(), bes.ai(), yggdrasilAuthenticationService, minecraftSessionService, gameProfileRepository, mp);
		this.i(bes.K().c());
		this.j(string2);
		this.k(string3);
		this.b(bes.u());
		this.c(ajv.c());
		this.c(256);
		this.a(new ccg(this));
		this.l = bes;
		this.m = this.V() ? lq.a : ajv;
	}

	@Override
	protected bd i() {
		return new cci(this);
	}

	@Override
	protected void a(String string1, String string2, long long3, ajx ajx, String string5) {
		this.a(string1);
		this.d = new lw[3];
		this.i = new long[this.d.length][100];
		bbw bbw8 = this.W().a(string1, true);
		this.a(this.S(), bbw8);
		bbv bbv9 = bbw8.d();
		if (bbv9 == null) {
			bbv9 = new bbv(this.m, string2);
		} else {
			bbv9.a(string2);
		}

		for (int integer10 = 0; integer10 < this.d.length; integer10++) {
			int integer11 = 0;
			if (integer10 == 1) {
				integer11 = -1;
			}

			if (integer10 == 2) {
				integer11 = 1;
			}

			if (integer10 == 0) {
				if (this.V()) {
					this.d[integer10] = (lw)new lq(this, bbw8, bbv9, integer11, this.c).b();
				} else {
					this.d[integer10] = (lw)new lw(this, bbw8, bbv9, integer11, this.c).b();
				}

				this.d[integer10].a(this.m);
			} else {
				this.d[integer10] = (lw)new ls(this, bbw8, integer11, this.d[0], this.c).b();
			}

			this.d[integer10].a(new lx(this, this.d[integer10]));
		}

		this.am().a(this.d);
		if (this.d[0].T().x() == null) {
			this.a(this.l.u.aq);
		}

		this.l();
	}

	@Override
	protected boolean j() throws IOException {
		k.info("Starting integrated minecraft server version 1.11.2");
		this.d(true);
		this.f(true);
		this.g(true);
		this.h(true);
		this.i(true);
		k.info("Generating keypair");
		this.a(oi.b());
		this.a(this.S(), this.T(), this.m.d(), this.m.h(), this.m.j());
		this.l(this.Q() + " - " + this.d[0].T().j());
		return true;
	}

	@Override
	protected void C() {
		boolean boolean2 = this.n;
		this.n = bes.z().v() != null && bes.z().T();
		if (!boolean2 && this.n) {
			k.info("Saving and pausing game...");
			this.am().j();
			this.a(false);
		}

		if (this.n) {
			synchronized (this.j) {
				while (!this.j.isEmpty()) {
					h.a((FutureTask)this.j.poll(), k);
				}
			}
		} else {
			super.C();
			if (this.l.u.d != this.am().s()) {
				k.info("Changing view distance to {}, from {}", new Object[]{this.l.u.d, this.am().s()});
				this.am().a(this.l.u.d);
			}

			if (this.l.f != null) {
				bbv bbv3 = this.d[0].T();
				bbv bbv4 = this.l.f.T();
				if (!bbv3.y() && bbv4.x() != bbv3.x()) {
					k.info("Changing difficulty to {}, from {}", new Object[]{bbv4.x(), bbv3.x()});
					this.a(bbv4.x());
				} else if (bbv4.y() && !bbv3.y()) {
					k.info("Locking difficulty to {}", new Object[]{bbv4.x()});

					for (lw lw8 : this.d) {
						if (lw8 != null) {
							lw8.T().e(true);
						}
					}
				}
			}
		}
	}

	@Override
	public boolean m() {
		return false;
	}

	@Override
	public ajq n() {
		return this.m.e();
	}

	@Override
	public rg o() {
		return this.l.f.T().x();
	}

	@Override
	public boolean p() {
		return this.m.f();
	}

	@Override
	public boolean r() {
		return true;
	}

	@Override
	public boolean s() {
		return true;
	}

	@Override
	protected void a(boolean boolean1) {
		super.a(boolean1);
	}

	@Override
	public File A() {
		return this.l.w;
	}

	@Override
	public boolean aa() {
		return false;
	}

	@Override
	public boolean af() {
		return false;
	}

	@Override
	protected void a(b b) {
		this.l.a(b);
	}

	@Override
	public b b(b b) {
		b = super.b(b);
		b.g().a("Type", new d<String>() {
			public String call() throws Exception {
				return "Integrated Server (map_client.txt)";
			}
		});
		b.g()
			.a(
				"Is Modded",
				new d<String>() {
					public String call() throws Exception {
						String string2 = ClientBrandRetriever.getClientModName();
						if (!string2.equals("vanilla")) {
							return "Definitely; Client brand changed to '" + string2 + "'";
						} else {
							string2 = cch.this.getServerModName();
							if (!"vanilla".equals(string2)) {
								return "Definitely; Server brand changed to '" + string2 + "'";
							} else {
								return bes.class.getSigners() == null
									? "Very likely; Jar signature invalidated"
									: "Probably not. Jar signature remains and both client + server brands are untouched.";
							}
						}
					}
				}
			);
		return b;
	}

	@Override
	public void a(rg rg) {
		super.a(rg);
		if (this.l.f != null) {
			this.l.f.T().a(rg);
		}
	}

	@Override
	public void a(rs rs) {
		super.a(rs);
		rs.a("snooper_partner", this.l.H().f());
	}

	@Override
	public boolean Z() {
		return bes.z().Z();
	}

	@Override
	public String a(ajq ajq, boolean boolean2) {
		try {
			int integer4 = -1;

			try {
				integer4 = ol.a();
			} catch (IOException var5) {
			}

			if (integer4 <= 0) {
				integer4 = 25564;
			}

			this.an().a(null, integer4);
			k.info("Started on {}", new Object[]{integer4});
			this.o = true;
			this.p = new ccl(this.aj(), integer4 + "");
			this.p.start();
			this.am().a(ajq);
			this.am().c(boolean2);
			this.l.h.o(boolean2 ? 4 : 0);
			return integer4 + "";
		} catch (IOException var6) {
			return null;
		}
	}

	@Override
	public void u() {
		super.u();
		if (this.p != null) {
			this.p.interrupt();
			this.p = null;
		}
	}

	@Override
	public void x() {
		Futures.getUnchecked(this.a(new Runnable() {
			public void run() {
				for (ly ly4 : Lists.newArrayList(cch.this.am().v())) {
					if (!ly4.be().equals(cch.this.l.h.be())) {
						cch.this.am().e(ly4);
					}
				}
			}
		}));
		super.x();
		if (this.p != null) {
			this.p.interrupt();
			this.p = null;
		}
	}

	public boolean a() {
		return this.o;
	}

	@Override
	public void a(ajq ajq) {
		super.a(ajq);
		this.am().a(ajq);
	}

	@Override
	public boolean ai() {
		return true;
	}

	@Override
	public int q() {
		return 4;
	}

	public void b() {
		if (this.aF()) {
			this.d[0].ak().a();
		} else {
			this.a(new Runnable() {
				public void run() {
					cch.this.b();
				}
			});
		}
	}
}
