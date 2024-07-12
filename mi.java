import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.util.concurrent.Futures;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mi implements im, lf {
	private static final Logger c = LogManager.getLogger();
	public final er a;
	private final MinecraftServer d;
	public ly b;
	private int e;
	private int f;
	private long g;
	private long h;
	private int i;
	private int j;
	private final oo<Short> k = new oo<>();
	private double l;
	private double m;
	private double n;
	private double o;
	private double p;
	private double q;
	private sn r;
	private double s;
	private double t;
	private double u;
	private double v;
	private double w;
	private double x;
	private bdw y;
	private int z;
	private int A;
	private boolean B;
	private int C;
	private boolean D;
	private int E;
	private int F;
	private int G;

	public mi(MinecraftServer minecraftServer, er er, ly ly) {
		this.d = minecraftServer;
		this.a = er;
		er.a(this);
		this.b = ly;
		ly.a = this;
	}

	@Override
	public void F_() {
		this.d();
		this.b.k_();
		this.b.a(this.l, this.m, this.n, this.b.v, this.b.w);
		this.e++;
		this.G = this.F;
		if (this.B) {
			if (++this.C > 80) {
				c.warn("{} was kicked for floating too long!", new Object[]{this.b.h_()});
				this.c("Flying is not enabled on this server");
				return;
			}
		} else {
			this.B = false;
			this.C = 0;
		}

		this.r = this.b.bz();
		if (this.r != this.b && this.r.bw() == this.b) {
			this.s = this.r.p;
			this.t = this.r.q;
			this.u = this.r.r;
			this.v = this.r.p;
			this.w = this.r.q;
			this.x = this.r.r;
			if (this.D && this.b.bz().bw() == this.b) {
				if (++this.E > 80) {
					c.warn("{} was kicked for floating a vehicle too long!", new Object[]{this.b.h_()});
					this.c("Flying is not enabled on this server");
					return;
				}
			} else {
				this.D = false;
				this.E = 0;
			}
		} else {
			this.r = null;
			this.D = false;
			this.E = 0;
		}

		this.d.c.a("keepAlive");
		if ((long)this.e - this.h > 40L) {
			this.h = (long)this.e;
			this.g = this.e();
			this.f = (int)this.g;
			this.a(new gv(this.f));
		}

		this.d.c.b();
		if (this.i > 0) {
			this.i--;
		}

		if (this.j > 0) {
			this.j--;
		}

		if (this.b.I() > 0L && this.d.ax() > 0 && MinecraftServer.aw() - this.b.I() > (long)(this.d.ax() * 1000 * 60)) {
			this.c("You have been idle for too long!");
		}
	}

	private void d() {
		this.l = this.b.p;
		this.m = this.b.q;
		this.n = this.b.r;
		this.o = this.b.p;
		this.p = this.b.q;
		this.q = this.b.r;
	}

	public er a() {
		return this.a;
	}

	public void c(String string) {
		final fh fh3 = new fh(string);
		this.a.a(new gq(fh3), new GenericFutureListener<Future<? super Void>>() {
			public void operationComplete(Future<? super Void> future) throws Exception {
				mi.this.a.a(fh3);
			}
		});
		this.a.k();
		Futures.getUnchecked(this.d.a(new Runnable() {
			public void run() {
				mi.this.a.l();
			}
		}));
	}

	@Override
	public void a(jf jf) {
		fo.a(jf, this, this.b.x());
		this.b.a(jf.a(), jf.b(), jf.c(), jf.d());
	}

	private static boolean b(iz iz) {
		return Doubles.isFinite(iz.a(0.0))
				&& Doubles.isFinite(iz.b(0.0))
				&& Doubles.isFinite(iz.c(0.0))
				&& Floats.isFinite(iz.b(0.0F))
				&& Floats.isFinite(iz.a(0.0F))
			? false
			: !(Math.abs(iz.a(0.0)) > 3.0E7) && !(Math.abs(iz.c(0.0)) > 3.0E7);
	}

	private static boolean b(ja ja) {
		return !Doubles.isFinite(ja.a()) || !Doubles.isFinite(ja.b()) || !Doubles.isFinite(ja.c()) || !Floats.isFinite(ja.e()) || !Floats.isFinite(ja.d());
	}

	@Override
	public void a(ja ja) {
		fo.a(ja, this, this.b.x());
		if (b(ja)) {
			this.c("Invalid move vehicle packet received");
		} else {
			sn sn3 = this.b.bz();
			if (sn3 != this.b && sn3.bw() == this.b && sn3 == this.r) {
				lw lw4 = this.b.x();
				double double5 = sn3.p;
				double double7 = sn3.q;
				double double9 = sn3.r;
				double double11 = ja.a();
				double double13 = ja.b();
				double double15 = ja.c();
				float float17 = ja.d();
				float float18 = ja.e();
				double double19 = double11 - this.s;
				double double21 = double13 - this.t;
				double double23 = double15 - this.u;
				double double25 = sn3.s * sn3.s + sn3.t * sn3.t + sn3.u * sn3.u;
				double double27 = double19 * double19 + double21 * double21 + double23 * double23;
				if (double27 - double25 > 100.0 && (!this.d.R() || !this.d.Q().equals(sn3.h_()))) {
					c.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{sn3.h_(), this.b.h_(), double19, double21, double23});
					this.a.a(new hc(sn3));
					return;
				}

				boolean boolean29 = lw4.a(sn3, sn3.bo().h(0.0625)).isEmpty();
				double19 = double11 - this.v;
				double21 = double13 - this.w - 1.0E-6;
				double23 = double15 - this.x;
				sn3.a(tc.PLAYER, double19, double21, double23);
				double19 = double11 - sn3.p;
				double21 = double13 - sn3.q;
				if (double21 > -0.5 || double21 < 0.5) {
					double21 = 0.0;
				}

				double23 = double15 - sn3.r;
				double27 = double19 * double19 + double21 * double21 + double23 * double23;
				boolean boolean32 = false;
				if (double27 > 0.0625) {
					boolean32 = true;
					c.warn("{} moved wrongly!", new Object[]{sn3.h_()});
				}

				sn3.a(double11, double13, double15, float17, float18);
				boolean boolean33 = lw4.a(sn3, sn3.bo().h(0.0625)).isEmpty();
				if (boolean29 && (boolean32 || !boolean33)) {
					sn3.a(double5, double7, double9, float17, float18);
					this.a.a(new hc(sn3));
					return;
				}

				this.d.am().d(this.b);
				this.b.k(this.b.p - double5, this.b.q - double7, this.b.r - double9);
				this.D = double21 >= -0.03125 && !this.d.ah() && !lw4.c(sn3.bo().g(0.0625).b(0.0, -0.55, 0.0));
				this.v = sn3.p;
				this.w = sn3.q;
				this.x = sn3.r;
			}
		}
	}

	@Override
	public void a(in in) {
		fo.a(in, this, this.b.x());
		if (in.a() == this.z) {
			this.b.a(this.y.b, this.y.c, this.y.d, this.b.v, this.b.w);
			if (this.b.K()) {
				this.o = this.y.b;
				this.p = this.y.c;
				this.q = this.y.d;
				this.b.L();
			}

			this.y = null;
		}
	}

	@Override
	public void a(iz iz) {
		fo.a(iz, this, this.b.x());
		if (b(iz)) {
			this.c("Invalid move player packet received");
		} else {
			lw lw3 = this.d.a(this.b.am);
			if (!this.b.h) {
				if (this.e == 0) {
					this.d();
				}

				if (this.y != null) {
					if (this.e - this.A > 20) {
						this.A = this.e;
						this.a(this.y.b, this.y.c, this.y.d, this.b.v, this.b.w);
					}
				} else {
					this.A = this.e;
					if (this.b.aK()) {
						this.b.a(this.b.p, this.b.q, this.b.r, iz.a(this.b.v), iz.b(this.b.w));
						this.d.am().d(this.b);
					} else {
						double double4 = this.b.p;
						double double6 = this.b.q;
						double double8 = this.b.r;
						double double10 = this.b.q;
						double double12 = iz.a(this.b.p);
						double double14 = iz.b(this.b.q);
						double double16 = iz.c(this.b.r);
						float float18 = iz.a(this.b.v);
						float float19 = iz.b(this.b.w);
						double double20 = double12 - this.l;
						double double22 = double14 - this.m;
						double double24 = double16 - this.n;
						double double26 = this.b.s * this.b.s + this.b.t * this.b.t + this.b.u * this.b.u;
						double double28 = double20 * double20 + double22 * double22 + double24 * double24;
						if (this.b.cr()) {
							if (double28 > 1.0) {
								this.a(this.b.p, this.b.q, this.b.r, iz.a(this.b.v), iz.b(this.b.w));
							}
						} else {
							this.F++;
							int integer30 = this.F - this.G;
							if (integer30 > 5) {
								c.debug("{} is sending move packets too frequently ({} packets since last tick)", new Object[]{this.b.h_(), integer30});
								integer30 = 1;
							}

							if (!this.b.K() && (!this.b.x().U().b("disableElytraMovementCheck") || !this.b.cH())) {
								float float31 = this.b.cH() ? 300.0F : 100.0F;
								if (double28 - double26 > (double)(float31 * (float)integer30) && (!this.d.R() || !this.d.Q().equals(this.b.h_()))) {
									c.warn("{} moved too quickly! {},{},{}", new Object[]{this.b.h_(), double20, double22, double24});
									this.a(this.b.p, this.b.q, this.b.r, this.b.v, this.b.w);
									return;
								}
							}

							boolean boolean31 = lw3.a(this.b, this.b.bo().h(0.0625)).isEmpty();
							double20 = double12 - this.o;
							double22 = double14 - this.p;
							double24 = double16 - this.q;
							if (this.b.z && !iz.a() && double22 > 0.0) {
								this.b.cm();
							}

							this.b.a(tc.PLAYER, double20, double22, double24);
							this.b.z = iz.a();
							double20 = double12 - this.b.p;
							double22 = double14 - this.b.q;
							if (double22 > -0.5 || double22 < 0.5) {
								double22 = 0.0;
							}

							double24 = double16 - this.b.r;
							double28 = double20 * double20 + double22 * double22 + double24 * double24;
							boolean boolean34 = false;
							if (!this.b.K() && double28 > 0.0625 && !this.b.cr() && !this.b.c.d() && this.b.c.b() != ajq.SPECTATOR) {
								boolean34 = true;
								c.warn("{} moved wrongly!", new Object[]{this.b.h_()});
							}

							this.b.a(double12, double14, double16, float18, float19);
							this.b.k(this.b.p - double4, this.b.q - double6, this.b.r - double8);
							if (!this.b.Q && !this.b.cr()) {
								boolean boolean35 = lw3.a(this.b, this.b.bo().h(0.0625)).isEmpty();
								if (boolean31 && (boolean34 || !boolean35)) {
									this.a(double4, double6, double8, float18, float19);
									return;
								}
							}

							this.B = double22 >= -0.03125;
							this.B = this.B & (!this.d.ah() && !this.b.bK.c);
							this.B = this.B & (!this.b.a(si.y) && !this.b.cH() && !lw3.c(this.b.bo().g(0.0625).b(0.0, -0.55, 0.0)));
							this.b.z = iz.a();
							this.d.am().d(this.b);
							this.b.a(this.b.q - double10, iz.a());
							this.o = this.b.p;
							this.p = this.b.q;
							this.q = this.b.r;
						}
					}
				}
			}
		}
	}

	public void a(double double1, double double2, double double3, float float4, float float5) {
		this.a(double1, double2, double3, float4, float5, Collections.emptySet());
	}

	public void a(double double1, double double2, double double3, float float4, float float5, Set<hh.a> set) {
		double double11 = set.contains(hh.a.X) ? this.b.p : 0.0;
		double double13 = set.contains(hh.a.Y) ? this.b.q : 0.0;
		double double15 = set.contains(hh.a.Z) ? this.b.r : 0.0;
		this.y = new bdw(double1 + double11, double2 + double13, double3 + double15);
		float float17 = float4;
		float float18 = float5;
		if (set.contains(hh.a.Y_ROT)) {
			float17 = float4 + this.b.v;
		}

		if (set.contains(hh.a.X_ROT)) {
			float18 = float5 + this.b.w;
		}

		if (++this.z == Integer.MAX_VALUE) {
			this.z = 0;
		}

		this.A = this.e;
		this.b.a(this.y.b, this.y.c, this.y.d, float17, float18);
		this.b.a.a(new hh(double1, double2, double3, float4, float5, set, this.z));
	}

	@Override
	public void a(jd jd) {
		fo.a(jd, this, this.b.x());
		lw lw3 = this.d.a(this.b.am);
		co co4 = jd.a();
		this.b.D();
		switch (jd.c()) {
			case SWAP_HELD_ITEMS:
				if (!this.b.y()) {
					afj afj5 = this.b.b(ri.OFF_HAND);
					this.b.a(ri.OFF_HAND, this.b.b(ri.MAIN_HAND));
					this.b.a(ri.MAIN_HAND, afj5);
				}

				return;
			case DROP_ITEM:
				if (!this.b.y()) {
					this.b.a(false);
				}

				return;
			case DROP_ALL_ITEMS:
				if (!this.b.y()) {
					this.b.a(true);
				}

				return;
			case RELEASE_USE_ITEM:
				this.b.cE();
				return;
			case START_DESTROY_BLOCK:
			case ABORT_DESTROY_BLOCK:
			case STOP_DESTROY_BLOCK:
				double double5 = this.b.p - ((double)co4.p() + 0.5);
				double double7 = this.b.q - ((double)co4.q() + 0.5) + 1.5;
				double double9 = this.b.r - ((double)co4.r() + 0.5);
				double double11 = double5 * double5 + double7 * double7 + double9 * double9;
				if (double11 > 36.0) {
					return;
				} else if (co4.q() >= this.d.ak()) {
					return;
				} else {
					if (jd.c() == jd.a.START_DESTROY_BLOCK) {
						if (!this.d.a(lw3, co4, this.b) && lw3.aj().a(co4)) {
							this.b.c.a(co4, jd.b());
						} else {
							this.b.a.a(new gb(lw3, co4));
						}
					} else {
						if (jd.c() == jd.a.STOP_DESTROY_BLOCK) {
							this.b.c.a(co4);
						} else if (jd.c() == jd.a.ABORT_DESTROY_BLOCK) {
							this.b.c.e();
						}

						if (lw3.o(co4).a() != azs.a) {
							this.b.a.a(new gb(lw3, co4));
						}
					}

					return;
				}
			default:
				throw new IllegalArgumentException("Invalid player action");
		}
	}

	@Override
	public void a(jm jm) {
		fo.a(jm, this, this.b.x());
		lw lw3 = this.d.a(this.b.am);
		ri ri4 = jm.c();
		afj afj5 = this.b.b(ri4);
		co co6 = jm.a();
		cv cv7 = jm.b();
		this.b.D();
		if (co6.q() < this.d.ak() - 1 || cv7 != cv.UP && co6.q() < this.d.ak()) {
			if (this.y == null && this.b.d((double)co6.p() + 0.5, (double)co6.q() + 0.5, (double)co6.r() + 0.5) < 64.0 && !this.d.a(lw3, co6, this.b) && lw3.aj().a(co6)
				)
			 {
				this.b.c.a(this.b, lw3, afj5, ri4, co6, cv7, jm.d(), jm.e(), jm.f());
			}
		} else {
			fi fi8 = new fi("build.tooHigh", this.d.ak());
			fi8.b().a(a.RED);
			this.b.a.a(new gf(fi8, (byte)2));
		}

		this.b.a.a(new gb(lw3, co6));
		this.b.a.a(new gb(lw3, co6.a(cv7)));
	}

	@Override
	public void a(jn jn) {
		fo.a(jn, this, this.b.x());
		lw lw3 = this.d.a(this.b.am);
		ri ri4 = jn.a();
		afj afj5 = this.b.b(ri4);
		this.b.D();
		if (!afj5.b()) {
			this.b.c.a(this.b, lw3, afj5, ri4);
		}
	}

	@Override
	public void a(jl jl) {
		fo.a(jl, this, this.b.x());
		if (this.b.y()) {
			sn sn3 = null;

			for (lw lw7 : this.d.d) {
				if (lw7 != null) {
					sn3 = jl.a(lw7);
					if (sn3 != null) {
						break;
					}
				}
			}

			if (sn3 != null) {
				this.b.e(this.b);
				this.b.p();
				if (sn3.l == this.b.l) {
					this.b.a(sn3.p, sn3.q, sn3.r);
				} else {
					lw lw4 = this.b.x();
					lw lw5 = (lw)sn3.l;
					this.b.am = sn3.am;
					this.a(new hm(this.b.am, lw4.ae(), lw4.T().t(), this.b.c.b()));
					this.d.am().f(this.b);
					lw4.f(this.b);
					this.b.F = false;
					this.b.b(sn3.p, sn3.q, sn3.r, sn3.v, sn3.w);
					if (this.b.au()) {
						lw4.a(this.b, false);
						lw5.a(this.b);
						lw5.a(this.b, false);
					}

					this.b.a(lw5);
					this.d.am().a(this.b, lw4);
					this.b.a(sn3.p, sn3.q, sn3.r);
					this.b.c.a(lw5);
					this.d.am().b(this.b, lw5);
					this.d.am().g(this.b);
				}
			}
		}
	}

	@Override
	public void a(jg jg) {
	}

	@Override
	public void a(jb jb) {
		fo.a(jb, this, this.b.x());
		sn sn3 = this.b.bB();
		if (sn3 instanceof abx) {
			((abx)sn3).a(jb.a(), jb.b());
		}
	}

	@Override
	public void a(fb fb) {
		c.info("{} lost connection: {}", new Object[]{this.b.h_(), fb});
		this.d.aD();
		fi fi3 = new fi("multiplayer.player.left", this.b.i_());
		fi3.b().a(a.YELLOW);
		this.d.am().a(fi3);
		this.b.t();
		this.d.am().e(this.b);
		if (this.d.R() && this.b.h_().equals(this.d.Q())) {
			c.info("Stopping singleplayer server as player logged out");
			this.d.x();
		}
	}

	public void a(fm<?> fm) {
		if (fm instanceof gf) {
			gf gf3 = (gf)fm;
			aay.b b4 = this.b.C();
			if (b4 == aay.b.HIDDEN && gf3.c() != 2) {
				return;
			}

			if (b4 == aay.b.SYSTEM && !gf3.b()) {
				return;
			}
		}

		try {
			this.a.a(fm);
		} catch (Throwable var5) {
			b b4x = b.a(var5, "Sending packet");
			c c5 = b4x.a("Packet being sent");
			c5.a("Packet class", new d<String>() {
				public String call() throws Exception {
					return fm.getClass().getCanonicalName();
				}
			});
			throw new f(b4x);
		}
	}

	@Override
	public void a(jh jh) {
		fo.a(jh, this, this.b.x());
		if (jh.a() >= 0 && jh.a() < aax.j()) {
			this.b.bs.d = jh.a();
			this.b.D();
		} else {
			c.warn("{} tried to set an invalid carried item", new Object[]{this.b.h_()});
		}
	}

	@Override
	public void a(ip ip) {
		fo.a(ip, this, this.b.x());
		if (this.b.C() == aay.b.HIDDEN) {
			fi fi3 = new fi("chat.cannotSend");
			fi3.b().a(a.RED);
			this.a(new gf(fi3));
		} else {
			this.b.D();
			String string3 = ip.a();
			string3 = StringUtils.normalizeSpace(string3);

			for (int integer4 = 0; integer4 < string3.length(); integer4++) {
				if (!g.a(string3.charAt(integer4))) {
					this.c("Illegal characters in chat");
					return;
				}
			}

			if (string3.startsWith("/")) {
				this.d(string3);
			} else {
				fb fb4 = new fi("chat.type.text", this.b.i_(), string3);
				this.d.am().a(fb4, false);
			}

			this.i += 20;
			if (this.i > 200 && !this.d.am().h(this.b.cS())) {
				this.c("disconnect.spam");
			}
		}
	}

	private void d(String string) {
		this.d.N().a(this.b, string);
	}

	@Override
	public void a(jk jk) {
		fo.a(jk, this, this.b.x());
		this.b.D();
		this.b.a(jk.a());
	}

	@Override
	public void a(je je) {
		fo.a(je, this, this.b.x());
		this.b.D();
		switch (je.b()) {
			case START_SNEAKING:
				this.b.e(true);
				break;
			case STOP_SNEAKING:
				this.b.e(false);
				break;
			case START_SPRINTING:
				this.b.f(true);
				break;
			case STOP_SPRINTING:
				this.b.f(false);
				break;
			case STOP_SLEEPING:
				if (this.b.cr()) {
					this.b.a(false, true, true);
					this.y = new bdw(this.b.p, this.b.q, this.b.r);
				}
				break;
			case START_RIDING_JUMP:
				if (this.b.bB() instanceof tg) {
					tg tg3 = (tg)this.b.bB();
					int integer4 = je.c();
					if (tg3.a() && integer4 > 0) {
						tg3.b(integer4);
					}
				}
				break;
			case STOP_RIDING_JUMP:
				if (this.b.bB() instanceof tg) {
					tg tg3 = (tg)this.b.bB();
					tg3.q_();
				}
				break;
			case OPEN_INVENTORY:
				if (this.b.bB() instanceof xm) {
					((xm)this.b.bB()).f(this.b);
				}
				break;
			case START_FALL_FLYING:
				if (!this.b.z && this.b.t < 0.0 && !this.b.cH() && !this.b.aj()) {
					afj afj3 = this.b.b(ss.CHEST);
					if (afj3.c() == afl.cS && aeq.d(afj3)) {
						this.b.M();
					}
				} else {
					this.b.N();
				}
				break;
			default:
				throw new IllegalArgumentException("Invalid client command!");
		}
	}

	@Override
	public void a(ix ix) {
		fo.a(ix, this, this.b.x());
		lw lw3 = this.d.a(this.b.am);
		sn sn4 = ix.a(lw3);
		this.b.D();
		if (sn4 != null) {
			boolean boolean5 = this.b.D(sn4);
			double double6 = 36.0;
			if (!boolean5) {
				double6 = 9.0;
			}

			if (this.b.h(sn4) < double6) {
				if (ix.a() == ix.a.INTERACT) {
					ri ri8 = ix.b();
					this.b.a(sn4, ri8);
				} else if (ix.a() == ix.a.INTERACT_AT) {
					ri ri8 = ix.b();
					sn4.a(this.b, ix.c(), ri8);
				} else if (ix.a() == ix.a.ATTACK) {
					if (sn4 instanceof zj || sn4 instanceof st || sn4 instanceof abb || sn4 == this.b) {
						this.c("Attempting to attack an invalid entity");
						this.d.f("Player " + this.b.h_() + " tried to attack an invalid entity");
						return;
					}

					this.b.f(sn4);
				}
			}
		}
	}

	@Override
	public void a(iq iq) {
		fo.a(iq, this, this.b.x());
		this.b.D();
		iq.a a3 = iq.a();
		switch (a3) {
			case PERFORM_RESPAWN:
				if (this.b.h) {
					this.b.h = false;
					this.b = this.d.am().a(this.b, 0, true);
				} else {
					if (this.b.bU() > 0.0F) {
						return;
					}

					this.b = this.d.am().a(this.b, 0, false);
					if (this.d.p()) {
						this.b.a(ajq.SPECTATOR);
						this.b.x().U().a("spectatorsGenerateChunks", "false");
					}
				}
				break;
			case REQUEST_STATS:
				this.b.E().a(this.b);
				break;
			case OPEN_INVENTORY_ACHIEVEMENT:
				this.b.b(nr.f);
		}
	}

	@Override
	public void a(iv iv) {
		fo.a(iv, this, this.b.x());
		this.b.s();
	}

	@Override
	public void a(iu iu) {
		fo.a(iu, this, this.b.x());
		this.b.D();
		if (this.b.bu.d == iu.a() && this.b.bu.c(this.b)) {
			if (this.b.y()) {
				dd<afj> dd3 = dd.a();

				for (int integer4 = 0; integer4 < this.b.bu.c.size(); integer4++) {
					dd3.add(((adl)this.b.bu.c.get(integer4)).d());
				}

				this.b.a(this.b.bu, dd3);
			} else {
				afj afj3 = this.b.bu.a(iu.b(), iu.c(), iu.f(), this.b);
				if (afj.b(iu.e(), afj3)) {
					this.b.a.a(new gh(iu.a(), iu.d(), true));
					this.b.f = true;
					this.b.bu.b();
					this.b.r();
					this.b.f = false;
				} else {
					this.k.a(this.b.bu.d, iu.d());
					this.b.a.a(new gh(iu.a(), iu.d(), false));
					this.b.bu.a(this.b, false);
					dd<afj> dd4 = dd.a();

					for (int integer5 = 0; integer5 < this.b.bu.c.size(); integer5++) {
						afj afj6 = ((adl)this.b.bu.c.get(integer5)).d();
						afj afj7 = afj6.b() ? afj.a : afj6;
						dd4.add(afj7);
					}

					this.b.a(this.b.bu, dd4);
				}
			}
		}
	}

	@Override
	public void a(it it) {
		fo.a(it, this, this.b.x());
		this.b.D();
		if (this.b.bu.d == it.a() && this.b.bu.c(this.b) && !this.b.y()) {
			this.b.bu.a(this.b, it.b());
			this.b.bu.b();
		}
	}

	@Override
	public void a(ji ji) {
		fo.a(ji, this, this.b.x());
		if (this.b.c.d()) {
			boolean boolean3 = ji.a() < 0;
			afj afj4 = ji.b();
			if (!afj4.b() && afj4.o() && afj4.p().b("BlockEntityTag", 10)) {
				du du5 = afj4.p().o("BlockEntityTag");
				if (du5.e("x") && du5.e("y") && du5.e("z")) {
					co co6 = new co(du5.h("x"), du5.h("y"), du5.h("z"));
					asc asc7 = this.b.l.r(co6);
					if (asc7 != null) {
						du du8 = asc7.b(new du());
						du8.q("x");
						du8.q("y");
						du8.q("z");
						afj4.a("BlockEntityTag", du8);
					}
				}
			}

			boolean boolean5 = ji.a() >= 1 && ji.a() <= 45;
			boolean boolean6 = afj4.b() || afj4.j() >= 0 && afj4.E() <= 64 && !afj4.b();
			if (boolean5 && boolean6) {
				if (afj4.b()) {
					this.b.bt.a(ji.a(), afj.a);
				} else {
					this.b.bt.a(ji.a(), afj4);
				}

				this.b.bt.a(this.b, true);
			} else if (boolean3 && boolean6 && this.j < 200) {
				this.j += 20;
				zj zj7 = this.b.a(afj4, true);
				if (zj7 != null) {
					zj7.j();
				}
			}
		}
	}

	@Override
	public void a(is is) {
		fo.a(is, this, this.b.x());
		Short short3 = this.k.a(this.b.bu.d);
		if (short3 != null && is.b() == short3 && this.b.bu.d == is.a() && !this.b.bu.c(this.b) && !this.b.y()) {
			this.b.bu.a(this.b, true);
		}
	}

	@Override
	public void a(jj jj) {
		fo.a(jj, this, this.b.x());
		this.b.D();
		lw lw3 = this.d.a(this.b.am);
		co co4 = jj.a();
		if (lw3.e(co4)) {
			atl atl5 = lw3.o(co4);
			asc asc6 = lw3.r(co4);
			if (!(asc6 instanceof asv)) {
				return;
			}

			asv asv7 = (asv)asc6;
			if (!asv7.a() || asv7.e() != this.b) {
				this.d.f("Player " + this.b.h_() + " just tried to change non-editable sign");
				return;
			}

			String[] arr8 = jj.b();

			for (int integer9 = 0; integer9 < arr8.length; integer9++) {
				asv7.a[integer9] = new fh(a.a(arr8[integer9]));
			}

			asv7.x_();
			lw3.a(co4, atl5, atl5, 3);
		}
	}

	@Override
	public void a(iy iy) {
		if (iy.a() == this.f) {
			int integer3 = (int)(this.e() - this.g);
			this.b.g = (this.b.g * 3 + integer3) / 4;
		}
	}

	private long e() {
		return System.nanoTime() / 1000000L;
	}

	@Override
	public void a(jc jc) {
		fo.a(jc, this, this.b.x());
		this.b.bK.b = jc.b() && this.b.bK.c;
	}

	@Override
	public void a(io io) {
		fo.a(io, this, this.b.x());
		List<String> list3 = Lists.newArrayList();

		for (String string5 : this.d.a(this.b, io.a(), io.b(), io.c())) {
			list3.add(string5);
		}

		this.b.a.a(new ge((String[])list3.toArray(new String[list3.size()])));
	}

	@Override
	public void a(ir ir) {
		fo.a(ir, this, this.b.x());
		this.b.a(ir);
	}

	@Override
	public void a(iw iw) {
		fo.a(iw, this, this.b.x());
		String string3 = iw.a();
		if ("MC|BEdit".equals(string3)) {
			et et4 = iw.b();

			try {
				afj afj5 = et4.k();
				if (afj5.b()) {
					return;
				}

				if (!agw.b(afj5.p())) {
					throw new IOException("Invalid book tag!");
				}

				afj afj6 = this.b.cg();
				if (afj6.b()) {
					return;
				}

				if (afj5.c() == afl.bX && afj5.c() == afj6.c()) {
					afj6.a("pages", afj5.p().c("pages", 8));
				}
			} catch (Exception var25) {
				c.error("Couldn't handle book info", var25);
			}
		} else if ("MC|BSign".equals(string3)) {
			et et4 = iw.b();

			try {
				afj afj5x = et4.k();
				if (afj5x.b()) {
					return;
				}

				if (!agx.b(afj5x.p())) {
					throw new IOException("Invalid book tag!");
				}

				afj afj6x = this.b.cg();
				if (afj6x.b()) {
					return;
				}

				if (afj5x.c() == afl.bX && afj6x.c() == afl.bX) {
					afj afj7 = new afj(afl.bY);
					afj7.a("author", new eh(this.b.h_()));
					afj7.a("title", new eh(afj5x.p().l("title")));
					ea ea8 = afj5x.p().c("pages", 8);

					for (int integer9 = 0; integer9 < ea8.c(); integer9++) {
						String string10 = ea8.g(integer9);
						fb fb11 = new fh(string10);
						string10 = fb.a.a(fb11);
						ea8.a(integer9, new eh(string10));
					}

					afj7.a("pages", ea8);
					this.b.a(ss.MAINHAND, afj7);
				}
			} catch (Exception var26) {
				c.error("Couldn't sign book", var26);
			}
		} else if ("MC|TrSel".equals(string3)) {
			try {
				int integer4 = iw.b().readInt();
				acl acl5 = this.b.bu;
				if (acl5 instanceof ade) {
					((ade)acl5).d(integer4);
				}
			} catch (Exception var24) {
				c.error("Couldn't select trade", var24);
			}
		} else if ("MC|AdvCmd".equals(string3)) {
			if (!this.d.ai()) {
				this.b.a(new fi("advMode.notEnabled"));
				return;
			}

			if (!this.b.dk()) {
				this.b.a(new fi("advMode.notAllowed"));
				return;
			}

			et et4 = iw.b();

			try {
				int integer5 = et4.readByte();
				ajh ajh6 = null;
				if (integer5 == 0) {
					asc asc7 = this.b.l.r(new co(et4.readInt(), et4.readInt(), et4.readInt()));
					if (asc7 instanceof asf) {
						ajh6 = ((asf)asc7).a();
					}
				} else if (integer5 == 1) {
					sn sn7 = this.b.l.a(et4.readInt());
					if (sn7 instanceof aca) {
						ajh6 = ((aca)sn7).j();
					}
				}

				String string7 = et4.e(et4.readableBytes());
				boolean boolean8 = et4.readBoolean();
				if (ajh6 != null) {
					ajh6.a(string7);
					ajh6.a(boolean8);
					if (!boolean8) {
						ajh6.b(null);
					}

					ajh6.i();
					this.b.a(new fi("advMode.setCommand.success", string7));
				}
			} catch (Exception var23) {
				c.error("Couldn't set command block", var23);
			}
		} else if ("MC|AutoCmd".equals(string3)) {
			if (!this.d.ai()) {
				this.b.a(new fi("advMode.notEnabled"));
				return;
			}

			if (!this.b.dk()) {
				this.b.a(new fi("advMode.notAllowed"));
				return;
			}

			et et4 = iw.b();

			try {
				ajh ajh5 = null;
				asf asf6 = null;
				co co7 = new co(et4.readInt(), et4.readInt(), et4.readInt());
				asc asc8 = this.b.l.r(co7);
				if (asc8 instanceof asf) {
					asf6 = (asf)asc8;
					ajh5 = asf6.a();
				}

				String string9 = et4.e(et4.readableBytes());
				boolean boolean10 = et4.readBoolean();
				asf.a a11 = asf.a.valueOf(et4.e(16));
				boolean boolean12 = et4.readBoolean();
				boolean boolean13 = et4.readBoolean();
				if (ajh5 != null) {
					cv cv14 = this.b.l.o(co7).c(amm.a);
					switch (a11) {
						case SEQUENCE: {
							atl atl15 = alv.dd.t();
							this.b.l.a(co7, atl15.a(amm.a, cv14).a(amm.b, boolean12), 2);
							break;
						}
						case AUTO: {
							atl atl15 = alv.dc.t();
							this.b.l.a(co7, atl15.a(amm.a, cv14).a(amm.b, boolean12), 2);
							break;
						}
						case REDSTONE: {
							atl atl15 = alv.bX.t();
							this.b.l.a(co7, atl15.a(amm.a, cv14).a(amm.b, boolean12), 2);
						}
					}

					asc8.A();
					this.b.l.a(co7, asc8);
					ajh5.a(string9);
					ajh5.a(boolean10);
					if (!boolean10) {
						ajh5.b(null);
					}

					asf6.b(boolean13);
					ajh5.i();
					if (!oy.b(string9)) {
						this.b.a(new fi("advMode.setCommand.success", string9));
					}
				}
			} catch (Exception var22) {
				c.error("Couldn't set command block", var22);
			}
		} else if ("MC|Beacon".equals(string3)) {
			if (this.b.bu instanceof acn) {
				try {
					et et4 = iw.b();
					int integer5x = et4.readInt();
					int integer6 = et4.readInt();
					acn acn7 = (acn)this.b.bu;
					adl adl8 = acn7.a(0);
					if (adl8.e()) {
						adl8.a(1);
						rc rc9 = acn7.e();
						rc9.b(1, integer5x);
						rc9.b(2, integer6);
						rc9.x_();
					}
				} catch (Exception var21) {
					c.error("Couldn't set beacon", var21);
				}
			}
		} else if ("MC|ItemName".equals(string3)) {
			if (this.b.bu instanceof acm) {
				acm acm4 = (acm)this.b.bu;
				if (iw.b() != null && iw.b().readableBytes() >= 1) {
					String string5 = g.a(iw.b().e(32767));
					if (string5.length() <= 30) {
						acm4.a(string5);
					}
				} else {
					acm4.a("");
				}
			}
		} else if ("MC|Struct".equals(string3)) {
			if (!this.b.dk()) {
				return;
			}

			et et4 = iw.b();

			try {
				co co5 = new co(et4.readInt(), et4.readInt(), et4.readInt());
				atl atl6 = this.b.l.o(co5);
				asc asc7 = this.b.l.r(co5);
				if (asc7 instanceof asx) {
					asx asx8 = (asx)asc7;
					int integer9 = et4.readByte();
					String string10 = et4.e(32);
					asx8.a(asx.a.valueOf(string10));
					asx8.a(et4.e(64));
					int integer11 = ot.a(et4.readInt(), -32, 32);
					int integer12 = ot.a(et4.readInt(), -32, 32);
					int integer13 = ot.a(et4.readInt(), -32, 32);
					asx8.b(new co(integer11, integer12, integer13));
					int integer14 = ot.a(et4.readInt(), 0, 32);
					int integer15 = ot.a(et4.readInt(), 0, 32);
					int integer16 = ot.a(et4.readInt(), 0, 32);
					asx8.c(new co(integer14, integer15, integer16));
					String string17 = et4.e(32);
					asx8.b(aou.valueOf(string17));
					String string18 = et4.e(32);
					asx8.b(aqi.valueOf(string18));
					asx8.b(et4.e(128));
					asx8.a(et4.readBoolean());
					asx8.e(et4.readBoolean());
					asx8.f(et4.readBoolean());
					asx8.a(ot.a(et4.readFloat(), 0.0F, 1.0F));
					asx8.a(et4.h());
					String string19 = asx8.a();
					if (integer9 == 2) {
						if (asx8.q()) {
							this.b.a(new fi("structure_block.save_success", string19), false);
						} else {
							this.b.a(new fi("structure_block.save_failure", string19), false);
						}
					} else if (integer9 == 3) {
						if (!asx8.E()) {
							this.b.a(new fi("structure_block.load_not_found", string19), false);
						} else if (asx8.r()) {
							this.b.a(new fi("structure_block.load_success", string19), false);
						} else {
							this.b.a(new fi("structure_block.load_prepare", string19), false);
						}
					} else if (integer9 == 4) {
						if (asx8.p()) {
							this.b.a(new fi("structure_block.size_success", string19), false);
						} else {
							this.b.a(new fi("structure_block.size_failure"), false);
						}
					}

					asx8.x_();
					this.b.l.a(co5, atl6, atl6, 3);
				}
			} catch (Exception var20) {
				c.error("Couldn't set structure block", var20);
			}
		} else if ("MC|PickItem".equals(string3)) {
			et et4 = iw.b();

			try {
				int integer5x = et4.g();
				this.b.bs.d(integer5x);
				this.b.a.a(new gm(-2, this.b.bs.d, this.b.bs.a(this.b.bs.d)));
				this.b.a.a(new gm(-2, integer5x, this.b.bs.a(integer5x)));
				this.b.a.a(new hq(this.b.bs.d));
			} catch (Exception var19) {
				c.error("Couldn't pick item", var19);
			}
		}
	}
}
