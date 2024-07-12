import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.realms.DisconnectedRealmsScreen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bno implements fp {
	private static final Logger b = LogManager.getLogger();
	private final er c;
	private final GameProfile d;
	private final bho e;
	private bes f;
	private bnq g;
	private boolean h;
	private final Map<UUID, bnr> i = Maps.newHashMap();
	public int a = 20;
	private boolean j;
	private final Random k = new Random();

	public bno(bes bes, bho bho, er er, GameProfile gameProfile) {
		this.f = bes;
		this.e = bho;
		this.c = er;
		this.d = gameProfile;
	}

	public void b() {
		this.g = null;
	}

	@Override
	public void a(gz gz) {
		fo.a(gz, this, this.f);
		this.f.c = new bnp(this.f, this);
		this.g = new bnq(this, new ajv(0L, gz.c(), false, gz.b(), gz.g()), gz.d(), gz.e(), this.f.B);
		this.f.u.aq = gz.e();
		this.f.a(this.g);
		this.f.h.am = gz.d();
		this.f.a(new bhn(this));
		this.f.h.h(gz.a());
		this.a = gz.f();
		this.f.h.o(gz.h());
		this.f.c.a(gz.c());
		this.f.u.c();
		this.c.a(new iw("MC|Brand", new et(Unpooled.buffer()).a(ClientBrandRetriever.getClientModName())));
	}

	@Override
	public void a(fq fq) {
		fo.a(fq, this, this.f);
		double double3 = fq.c();
		double double5 = fq.d();
		double double7 = fq.e();
		sn sn9 = null;
		if (fq.k() == 10) {
			sn9 = aby.a(this.g, double3, double5, double7, aby.a.a(fq.l()));
		} else if (fq.k() == 90) {
			sn sn10 = this.g.a(fq.l());
			if (sn10 instanceof aay) {
				sn9 = new zd(this.g, (aay)sn10, double3, double5, double7);
			}

			fq.d(0);
		} else if (fq.k() == 60) {
			sn9 = new abu(this.g, double3, double5, double7);
		} else if (fq.k() == 91) {
			sn9 = new abo(this.g, double3, double5, double7);
		} else if (fq.k() == 61) {
			sn9 = new abn(this.g, double3, double5, double7);
		} else if (fq.k() == 68) {
			sn9 = new abi(this.g, double3, double5, double7, (double)fq.f() / 8000.0, (double)fq.g() / 8000.0, (double)fq.h() / 8000.0);
		} else if (fq.k() == 71) {
			sn9 = new yz(this.g, new co(double3, double5, double7), cv.b(fq.l()));
			fq.d(0);
		} else if (fq.k() == 77) {
			sn9 = new za(this.g, new co(ot.c(double3), ot.c(double5), ot.c(double7)));
			fq.d(0);
		} else if (fq.k() == 65) {
			sn9 = new abr(this.g, double3, double5, double7);
		} else if (fq.k() == 72) {
			sn9 = new abe(this.g, double3, double5, double7);
		} else if (fq.k() == 76) {
			sn9 = new abg(this.g, double3, double5, double7, afj.a);
		} else if (fq.k() == 63) {
			sn9 = new abh(this.g, double3, double5, double7, (double)fq.f() / 8000.0, (double)fq.g() / 8000.0, (double)fq.h() / 8000.0);
			fq.d(0);
		} else if (fq.k() == 93) {
			sn9 = new abc(this.g, double3, double5, double7, (double)fq.f() / 8000.0, (double)fq.g() / 8000.0, (double)fq.h() / 8000.0);
			fq.d(0);
		} else if (fq.k() == 64) {
			sn9 = new abm(this.g, double3, double5, double7, (double)fq.f() / 8000.0, (double)fq.g() / 8000.0, (double)fq.h() / 8000.0);
			fq.d(0);
		} else if (fq.k() == 66) {
			sn9 = new abv(this.g, double3, double5, double7, (double)fq.f() / 8000.0, (double)fq.g() / 8000.0, (double)fq.h() / 8000.0);
			fq.d(0);
		} else if (fq.k() == 67) {
			sn9 = new abl(this.g, double3, double5, double7, (double)fq.f() / 8000.0, (double)fq.g() / 8000.0, (double)fq.h() / 8000.0);
			fq.d(0);
		} else if (fq.k() == 62) {
			sn9 = new abq(this.g, double3, double5, double7);
		} else if (fq.k() == 79) {
			sn9 = new abd(this.g, double3, double5, double7, 0.0F, 0, null);
		} else if (fq.k() == 73) {
			sn9 = new abt(this.g, double3, double5, double7, afj.a);
			fq.d(0);
		} else if (fq.k() == 75) {
			sn9 = new abs(this.g, double3, double5, double7);
			fq.d(0);
		} else if (fq.k() == 1) {
			sn9 = new abx(this.g, double3, double5, double7);
		} else if (fq.k() == 50) {
			sn9 = new zk(this.g, double3, double5, double7, null);
		} else if (fq.k() == 78) {
			sn9 = new yx(this.g, double3, double5, double7);
		} else if (fq.k() == 51) {
			sn9 = new ya(this.g, double3, double5, double7);
		} else if (fq.k() == 2) {
			sn9 = new zj(this.g, double3, double5, double7);
		} else if (fq.k() == 70) {
			sn9 = new zi(this.g, double3, double5, double7, alu.c(fq.l() & 65535));
			fq.d(0);
		} else if (fq.k() == 3) {
			sn9 = new sl(this.g, double3, double5, double7);
		}

		if (sn9 != null) {
			lt.a(sn9, double3, double5, double7);
			sn9.w = (float)(fq.i() * 360) / 256.0F;
			sn9.v = (float)(fq.j() * 360) / 256.0F;
			sn[] arr10 = sn9.aT();
			if (arr10 != null) {
				int integer11 = fq.a() - sn9.O();

				for (sn sn15 : arr10) {
					sn15.h(sn15.O() + integer11);
				}
			}

			sn9.h(fq.a());
			sn9.a(fq.b());
			this.g.a(fq.a(), sn9);
			if (fq.l() > 0) {
				if (fq.k() == 60 || fq.k() == 91) {
					sn sn11 = this.g.a(fq.l() - 1);
					if (sn11 instanceof sw && sn9 instanceof abb) {
						((abb)sn9).e = sn11;
					}
				}

				sn9.h((double)fq.f() / 8000.0, (double)fq.g() / 8000.0, (double)fq.h() / 8000.0);
			}
		}
	}

	@Override
	public void a(fr fr) {
		fo.a(fr, this, this.f);
		double double3 = fr.b();
		double double5 = fr.c();
		double double7 = fr.d();
		sn sn9 = new st(this.g, double3, double5, double7, fr.e());
		lt.a(sn9, double3, double5, double7);
		sn9.v = 0.0F;
		sn9.w = 0.0F;
		sn9.h(fr.a());
		this.g.a(fr.a(), sn9);
	}

	@Override
	public void a(fs fs) {
		fo.a(fs, this, this.f);
		double double3 = fs.b();
		double double5 = fs.c();
		double double7 = fs.d();
		sn sn9 = null;
		if (fs.e() == 1) {
			sn9 = new zg(this.g, double3, double5, double7, false);
		}

		if (sn9 != null) {
			lt.a(sn9, double3, double5, double7);
			sn9.v = 0.0F;
			sn9.w = 0.0F;
			sn9.h(fs.a());
			this.g.d(sn9);
		}
	}

	@Override
	public void a(fu fu) {
		fo.a(fu, this, this.f);
		zb zb3 = new zb(this.g, fu.c(), fu.d(), fu.e());
		zb3.a(fu.b());
		this.g.a(fu.a(), zb3);
	}

	@Override
	public void a(hu hu) {
		fo.a(hu, this, this.f);
		sn sn3 = this.g.a(hu.a());
		if (sn3 != null) {
			sn3.h((double)hu.b() / 8000.0, (double)hu.c() / 8000.0, (double)hu.d() / 8000.0);
		}
	}

	@Override
	public void a(hs hs) {
		fo.a(hs, this, this.f);
		sn sn3 = this.g.a(hs.b());
		if (sn3 != null && hs.a() != null) {
			sn3.R().a(hs.a());
		}
	}

	@Override
	public void a(fv fv) {
		fo.a(fv, this, this.f);
		double double3 = fv.d();
		double double5 = fv.e();
		double double7 = fv.f();
		float float9 = (float)(fv.g() * 360) / 256.0F;
		float float10 = (float)(fv.h() * 360) / 256.0F;
		bpt bpt11 = new bpt(this.f.f, this.a(fv.c()).a());
		bpt11.m = double3;
		bpt11.M = double3;
		bpt11.n = double5;
		bpt11.N = double5;
		bpt11.o = double7;
		bpt11.O = double7;
		lt.a(bpt11, double3, double5, double7);
		bpt11.a(double3, double5, double7, float9, float10);
		this.g.a(fv.b(), bpt11);
		List<kn.a<?>> list12 = fv.a();
		if (list12 != null) {
			bpt11.R().a(list12);
		}
	}

	@Override
	public void a(ij ij) {
		fo.a(ij, this, this.f);
		sn sn3 = this.g.a(ij.a());
		if (sn3 != null) {
			double double4 = ij.b();
			double double6 = ij.c();
			double double8 = ij.d();
			lt.a(sn3, double4, double6, double8);
			if (!sn3.bA()) {
				float float10 = (float)(ij.e() * 360) / 256.0F;
				float float11 = (float)(ij.f() * 360) / 256.0F;
				if (!(Math.abs(sn3.p - double4) >= 0.03125) && !(Math.abs(sn3.q - double6) >= 0.015625) && !(Math.abs(sn3.r - double8) >= 0.03125)) {
					sn3.a(sn3.p, sn3.q, sn3.r, float10, float11, 0, true);
				} else {
					sn3.a(double4, double6, double8, float10, float11, 3, true);
				}

				sn3.z = ij.g();
			}
		}
	}

	@Override
	public void a(hq hq) {
		fo.a(hq, this, this.f);
		if (aax.e(hq.a())) {
			this.f.h.bs.d = hq.a();
		}
	}

	@Override
	public void a(hb hb) {
		fo.a(hb, this, this.f);
		sn sn3 = hb.a(this.g);
		if (sn3 != null) {
			sn3.ae = sn3.ae + (long)hb.a();
			sn3.af = sn3.af + (long)hb.b();
			sn3.ag = sn3.ag + (long)hb.c();
			double double4 = (double)sn3.ae / 4096.0;
			double double6 = (double)sn3.af / 4096.0;
			double double8 = (double)sn3.ag / 4096.0;
			if (!sn3.bA()) {
				float float10 = hb.f() ? (float)(hb.d() * 360) / 256.0F : sn3.v;
				float float11 = hb.f() ? (float)(hb.e() * 360) / 256.0F : sn3.w;
				sn3.a(double4, double6, double8, float10, float11, 3, false);
				sn3.z = hb.g();
			}
		}
	}

	@Override
	public void a(hn hn) {
		fo.a(hn, this, this.f);
		sn sn3 = hn.a(this.g);
		if (sn3 != null) {
			float float4 = (float)(hn.a() * 360) / 256.0F;
			sn3.h(float4);
		}
	}

	@Override
	public void a(hj hj) {
		fo.a(hj, this, this.f);

		for (int integer3 = 0; integer3 < hj.a().length; integer3++) {
			this.g.e(hj.a()[integer3]);
		}
	}

	@Override
	public void a(hh hh) {
		fo.a(hh, this, this.f);
		aay aay3 = this.f.h;
		double double4 = hh.a();
		double double6 = hh.b();
		double double8 = hh.c();
		float float10 = hh.d();
		float float11 = hh.e();
		if (hh.g().contains(hh.a.X)) {
			double4 += aay3.p;
		} else {
			aay3.s = 0.0;
		}

		if (hh.g().contains(hh.a.Y)) {
			double6 += aay3.q;
		} else {
			aay3.t = 0.0;
		}

		if (hh.g().contains(hh.a.Z)) {
			double8 += aay3.r;
		} else {
			aay3.u = 0.0;
		}

		if (hh.g().contains(hh.a.X_ROT)) {
			float11 += aay3.w;
		}

		if (hh.g().contains(hh.a.Y_ROT)) {
			float10 += aay3.v;
		}

		aay3.a(double4, double6, double8, float10, float11);
		this.c.a(new in(hh.f()));
		this.c.a(new iz.b(aay3.p, aay3.bo().b, aay3.r, aay3.v, aay3.w, false));
		if (!this.h) {
			this.f.h.m = this.f.h.p;
			this.f.h.n = this.f.h.q;
			this.f.h.o = this.f.h.r;
			this.h = true;
			this.f.a(null);
		}
	}

	@Override
	public void a(gg gg) {
		fo.a(gg, this, this.f);

		for (gg.a a6 : gg.a()) {
			this.g.b(a6.a(), a6.c());
		}
	}

	@Override
	public void a(gw gw) {
		fo.a(gw, this, this.f);
		if (gw.e()) {
			this.g.b(gw.b(), gw.c(), true);
		}

		this.g.a(gw.b() << 4, 0, gw.c() << 4, (gw.b() << 4) + 15, 256, (gw.c() << 4) + 15);
		auo auo3 = this.g.a(gw.b(), gw.c());
		auo3.a(gw.a(), gw.d(), gw.e());
		this.g.b(gw.b() << 4, 0, gw.c() << 4, (gw.b() << 4) + 15, 256, (gw.c() << 4) + 15);
		if (!gw.e() || !(this.g.s instanceof avi)) {
			auo3.m();
		}

		for (du du5 : gw.f()) {
			co co6 = new co(du5.h("x"), du5.h("y"), du5.h("z"));
			asc asc7 = this.g.r(co6);
			if (asc7 != null) {
				asc7.a(du5);
			}
		}
	}

	@Override
	public void a(gt gt) {
		fo.a(gt, this, this.f);
		this.g.b(gt.a(), gt.b(), false);
	}

	@Override
	public void a(gb gb) {
		fo.a(gb, this, this.f);
		this.g.b(gb.b(), gb.a());
	}

	@Override
	public void a(gq gq) {
		this.c.a(gq.a());
	}

	@Override
	public void a(fb fb) {
		this.f.a(null);
		if (this.e != null) {
			if (this.e instanceof bgm) {
				this.f.a(new DisconnectedRealmsScreen(((bgm)this.e).a(), "disconnect.lost", fb).getProxy());
			} else {
				this.f.a(new bhc(this.e, "disconnect.lost", fb));
			}
		} else {
			this.f.a(new bhc(new bjf(new bhv()), "disconnect.lost", fb));
		}
	}

	public void a(fm<?> fm) {
		this.c.a(fm);
	}

	@Override
	public void a(ii ii) {
		fo.a(ii, this, this.f);
		sn sn3 = this.g.a(ii.a());
		sw sw4 = (sw)this.g.a(ii.b());
		if (sw4 == null) {
			sw4 = this.f.h;
		}

		if (sn3 != null) {
			if (sn3 instanceof st) {
				this.g.a(sn3.p, sn3.q, sn3.r, nn.bu, no.PLAYERS, 0.1F, (this.k.nextFloat() - this.k.nextFloat()) * 0.35F + 0.9F, false);
			} else {
				this.g.a(sn3.p, sn3.q, sn3.r, nn.dk, no.PLAYERS, 0.2F, (this.k.nextFloat() - this.k.nextFloat()) * 1.4F + 2.0F, false);
			}

			if (sn3 instanceof zj) {
				((zj)sn3).k().e(ii.c());
			}

			this.f.j.a(new bop(this.g, sn3, sw4, 0.5F));
			this.g.e(ii.a());
		}
	}

	@Override
	public void a(gf gf) {
		fo.a(gf, this, this.f);
		if (gf.c() == 2) {
			this.f.r.a(gf.a(), false);
		} else {
			this.f.r.d().a(gf.a());
		}
	}

	@Override
	public void a(fw fw) {
		fo.a(fw, this, this.f);
		sn sn3 = this.g.a(fw.a());
		if (sn3 != null) {
			if (fw.b() == 0) {
				sw sw4 = (sw)sn3;
				sw4.a(ri.MAIN_HAND);
			} else if (fw.b() == 3) {
				sw sw4 = (sw)sn3;
				sw4.a(ri.OFF_HAND);
			} else if (fw.b() == 1) {
				sn3.aF();
			} else if (fw.b() == 2) {
				aay aay4 = (aay)sn3;
				aay4.a(false, false, false);
			} else if (fw.b() == 4) {
				this.f.j.a(sn3, de.CRIT);
			} else if (fw.b() == 5) {
				this.f.j.a(sn3, de.CRIT_MAGIC);
			}
		}
	}

	@Override
	public void a(hi hi) {
		fo.a(hi, this, this.f);
		hi.a(this.g).a(hi.a());
	}

	@Override
	public void a(ft ft) {
		fo.a(ft, this, this.f);
		double double3 = ft.e();
		double double5 = ft.f();
		double double7 = ft.g();
		float float9 = (float)(ft.k() * 360) / 256.0F;
		float float10 = (float)(ft.l() * 360) / 256.0F;
		sw sw11 = (sw)sp.a(ft.d(), this.f.f);
		if (sw11 != null) {
			lt.a(sw11, double3, double5, double7);
			sw11.aN = (float)(ft.m() * 360) / 256.0F;
			sw11.aP = (float)(ft.m() * 360) / 256.0F;
			sn[] arr12 = sw11.aT();
			if (arr12 != null) {
				int integer13 = ft.b() - sw11.O();

				for (sn sn17 : arr12) {
					sn17.h(sn17.O() + integer13);
				}
			}

			sw11.h(ft.b());
			sw11.a(ft.c());
			sw11.a(double3, double5, double7, float9, float10);
			sw11.s = (double)((float)ft.h() / 8000.0F);
			sw11.t = (double)((float)ft.i() / 8000.0F);
			sw11.u = (double)((float)ft.j() / 8000.0F);
			this.g.a(ft.b(), sw11);
			List<kn.a<?>> list13 = ft.a();
			if (list13 != null) {
				sw11.R().a(list13);
			}
		} else {
			b.warn("Skipping Entity with id {}", new Object[]{ft.d()});
		}
	}

	@Override
	public void a(id id) {
		fo.a(id, this, this.f);
		this.f.f.a(id.a());
		this.f.f.b(id.b());
	}

	@Override
	public void a(ic ic) {
		fo.a(ic, this, this.f);
		this.f.h.a(ic.a(), true);
		this.f.f.T().a(ic.a());
	}

	@Override
	public void a(hz hz) {
		fo.a(hz, this, this.f);
		sn sn3 = this.g.a(hz.b());
		if (sn3 == null) {
			b.warn("Received passengers for unknown entity");
		} else {
			boolean boolean4 = sn3.y(this.f.h);
			sn3.az();

			for (int integer8 : hz.a()) {
				sn sn9 = this.g.a(integer8);
				if (sn9 != null) {
					sn9.a(sn3, true);
					if (sn9 == this.f.h && !boolean4) {
						this.f.r.a(cah.a("mount.onboard", beu.c(this.f.u.X.j())), false);
					}
				}
			}
		}
	}

	@Override
	public void a(ht ht) {
		fo.a(ht, this, this.f);
		sn sn3 = this.g.a(ht.a());
		sn sn4 = this.g.a(ht.b());
		if (sn3 instanceof sx) {
			if (sn4 != null) {
				((sx)sn3).b(sn4, false);
			} else {
				((sx)sn3).a(false, false);
			}
		}
	}

	@Override
	public void a(gr gr) {
		fo.a(gr, this, this.f);
		sn sn3 = gr.a(this.g);
		if (sn3 != null) {
			if (gr.a() == 21) {
				this.f.U().a(new cbv((zx)sn3));
			} else if (gr.a() == 35) {
				int integer4 = 40;
				this.f.j.a(sn3, de.TOTEM, 30);
				this.g.a(sn3.p, sn3.q, sn3.r, nn.gW, sn3.bC(), 1.0F, 1.0F, false);
				if (sn3 == this.f.h) {
					this.f.o.a(new afj(afl.cY));
				}
			} else {
				sn3.a(gr.a());
			}
		}
	}

	@Override
	public void a(hx hx) {
		fo.a(hx, this, this.f);
		this.f.h.p(hx.a());
		this.f.h.da().a(hx.b());
		this.f.h.da().b(hx.c());
	}

	@Override
	public void a(hw hw) {
		fo.a(hw, this, this.f);
		this.f.h.a(hw.a(), hw.b(), hw.c());
	}

	@Override
	public void a(hm hm) {
		fo.a(hm, this, this.f);
		if (hm.a() != this.f.h.am) {
			this.h = false;
			bec bec3 = this.g.ad();
			this.g = new bnq(this, new ajv(0L, hm.c(), false, this.f.f.T().s(), hm.d()), hm.a(), hm.b(), this.f.B);
			this.g.a(bec3);
			this.f.a(this.g);
			this.f.h.am = hm.a();
			this.f.a(new bhn(this));
		}

		this.f.a(hm.a());
		this.f.c.a(hm.c());
	}

	@Override
	public void a(gs gs) {
		fo.a(gs, this, this.f);
		ajn ajn3 = new ajn(this.f.f, null, gs.d(), gs.e(), gs.f(), gs.g(), gs.h());
		ajn3.a(true);
		this.f.h.s = this.f.h.s + (double)gs.a();
		this.f.h.t = this.f.h.t + (double)gs.b();
		this.f.h.u = this.f.h.u + (double)gs.c();
	}

	@Override
	public void a(gj gj) {
		fo.a(gj, this, this.f);
		bps bps3 = this.f.h;
		if ("minecraft:container".equals(gj.b())) {
			bps3.a(new rr(gj.c(), gj.d()));
			bps3.bu.d = gj.a();
		} else if ("minecraft:villager".equals(gj.b())) {
			bps3.a(new aar(bps3, gj.c()));
			bps3.bu.d = gj.a();
		} else if ("EntityHorse".equals(gj.b())) {
			sn sn4 = this.g.a(gj.e());
			if (sn4 instanceof xm) {
				bps3.a((xm)sn4, new ada(gj.c(), gj.d()));
				bps3.bu.d = gj.a();
			}
		} else if (!gj.f()) {
			bps3.a(new bpu(gj.b(), gj.c()));
			bps3.bu.d = gj.a();
		} else {
			rc rc4 = new bpv(gj.b(), gj.c(), gj.d());
			bps3.a(rc4);
			bps3.bu.d = gj.a();
		}
	}

	@Override
	public void a(gm gm) {
		fo.a(gm, this, this.f);
		aay aay3 = this.f.h;
		afj afj4 = gm.c();
		int integer5 = gm.b();
		if (gm.a() == -1) {
			aay3.bs.e(afj4);
		} else if (gm.a() == -2) {
			aay3.bs.a(integer5, afj4);
		} else {
			boolean boolean6 = false;
			if (this.f.m instanceof bip) {
				bip bip7 = (bip)this.f.m;
				boolean6 = bip7.f() != aej.m.a();
			}

			if (gm.a() == 0 && gm.b() >= 36 && integer5 < 45) {
				if (!afj4.b()) {
					afj afj7 = aay3.bt.a(integer5).d();
					if (afj7.b() || afj7.E() < afj4.E()) {
						afj4.d(5);
					}
				}

				aay3.bt.a(integer5, afj4);
			} else if (gm.a() == aay3.bu.d && (gm.a() != 0 || !boolean6)) {
				aay3.bu.a(integer5, afj4);
			}
		}
	}

	@Override
	public void a(gh gh) {
		fo.a(gh, this, this.f);
		acl acl3 = null;
		aay aay4 = this.f.h;
		if (gh.a() == 0) {
			acl3 = aay4.bt;
		} else if (gh.a() == aay4.bu.d) {
			acl3 = aay4.bu;
		}

		if (acl3 != null && !gh.c()) {
			this.a(new is(gh.a(), gh.b(), true));
		}
	}

	@Override
	public void a(gk gk) {
		fo.a(gk, this, this.f);
		aay aay3 = this.f.h;
		if (gk.a() == 0) {
			aay3.bt.a(gk.b());
		} else if (gk.a() == aay3.bu.d) {
			aay3.bu.a(gk.b());
		}
	}

	@Override
	public void a(hd hd) {
		fo.a(hd, this, this.f);
		asc asc3 = this.g.r(hd.a());
		if (!(asc3 instanceof asv)) {
			asc3 = new asv();
			asc3.a(this.g);
			asc3.a(hd.a());
		}

		this.f.h.a((asv)asc3);
	}

	@Override
	public void a(fz fz) {
		fo.a(fz, this, this.f);
		if (this.f.f.e(fz.a())) {
			asc asc3 = this.f.f.r(fz.a());
			int integer4 = fz.b();
			boolean boolean5 = integer4 == 2 && asc3 instanceof asf;
			if (integer4 == 1 && asc3 instanceof asr
				|| boolean5
				|| integer4 == 3 && asc3 instanceof asb
				|| integer4 == 4 && asc3 instanceof asw
				|| integer4 == 5 && asc3 instanceof asm
				|| integer4 == 6 && asc3 instanceof arz
				|| integer4 == 7 && asc3 instanceof asx
				|| integer4 == 8 && asc3 instanceof asy
				|| integer4 == 9 && asc3 instanceof asv
				|| integer4 == 10 && asc3 instanceof asu) {
				asc3.a(fz.c());
			}

			if (boolean5 && this.f.m instanceof bil) {
				((bil)this.f.m).a();
			}
		}
	}

	@Override
	public void a(gl gl) {
		fo.a(gl, this, this.f);
		aay aay3 = this.f.h;
		if (aay3.bu != null && aay3.bu.d == gl.a()) {
			aay3.bu.b(gl.b(), gl.c());
		}
	}

	@Override
	public void a(hv hv) {
		fo.a(hv, this, this.f);
		sn sn3 = this.g.a(hv.b());
		if (sn3 != null) {
			sn3.a(hv.c(), hv.a());
		}
	}

	@Override
	public void a(gi gi) {
		fo.a(gi, this, this.f);
		this.f.h.A();
	}

	@Override
	public void a(ga ga) {
		fo.a(ga, this, this.f);
		this.f.f.c(ga.a(), ga.d(), ga.b(), ga.c());
	}

	@Override
	public void a(fy fy) {
		fo.a(fy, this, this.f);
		this.f.f.c(fy.a(), fy.b(), fy.c());
	}

	@Override
	public void a(gu gu) {
		fo.a(gu, this, this.f);
		aay aay3 = this.f.h;
		int integer4 = gu.a();
		float float5 = gu.b();
		int integer6 = ot.d(float5 + 0.5F);
		if (integer4 >= 0 && integer4 < gu.a.length && gu.a[integer4] != null) {
			aay3.a(new fi(gu.a[integer4]), false);
		}

		if (integer4 == 1) {
			this.g.T().b(true);
			this.g.k(0.0F);
		} else if (integer4 == 2) {
			this.g.T().b(false);
			this.g.k(1.0F);
		} else if (integer4 == 3) {
			this.f.c.a(ajq.a(integer6));
		} else if (integer4 == 4) {
			if (integer6 == 0) {
				this.f.h.d.a(new iq(iq.a.PERFORM_RESPAWN));
				this.f.a(new bhn(this));
			} else if (integer6 == 1) {
				this.f.a(new bhx());
			}
		} else if (integer4 == 5) {
			beu beu7 = this.f.u;
			if (float5 == 0.0F) {
				this.f.a(new bha());
			} else if (float5 == 101.0F) {
				this.f.r.d().a(new fi("demo.help.movement", beu.c(beu7.S.j()), beu.c(beu7.T.j()), beu.c(beu7.U.j()), beu.c(beu7.V.j())));
			} else if (float5 == 102.0F) {
				this.f.r.d().a(new fi("demo.help.jump", beu.c(beu7.W.j())));
			} else if (float5 == 103.0F) {
				this.f.r.d().a(new fi("demo.help.inventory", beu.c(beu7.Z.j())));
			}
		} else if (integer4 == 6) {
			this.g.a(aay3, aay3.p, aay3.q + (double)aay3.bq(), aay3.r, nn.v, no.PLAYERS, 0.18F, 0.45F);
		} else if (integer4 == 7) {
			this.g.k(float5);
		} else if (integer4 == 8) {
			this.g.i(float5);
		} else if (integer4 == 10) {
			this.g.a(de.MOB_APPEARANCE, aay3.p, aay3.q, aay3.r, 0.0, 0.0, 0.0, new int[0]);
			this.g.a(aay3, aay3.p, aay3.q, aay3.r, nn.aH, no.HOSTILE, 1.0F, 1.0F);
		}
	}

	@Override
	public void a(ha ha) {
		fo.a(ha, this, this.f);
		bfj bfj3 = this.f.o.l();
		bbn bbn4 = afp.a(ha.a(), this.f.f);
		if (bbn4 == null) {
			String string5 = "map_" + ha.a();
			bbn4 = new bbn(string5);
			if (bfj3.a(string5) != null) {
				bbn bbn6 = bfj3.a(bfj3.a(string5));
				if (bbn6 != null) {
					bbn4 = bbn6;
				}
			}

			this.f.f.a(string5, bbn4);
		}

		ha.a(bbn4);
		bfj3.a(bbn4);
	}

	@Override
	public void a(gx gx) {
		fo.a(gx, this, this.f);
		if (gx.a()) {
			this.f.f.a(gx.b(), gx.d(), gx.c());
		} else {
			this.f.f.b(gx.b(), gx.d(), gx.c());
		}
	}

	@Override
	public void a(fx fx) {
		fo.a(fx, this, this.f);
		boolean boolean3 = false;

		for (Entry<nw, Integer> entry5 : fx.a().entrySet()) {
			nw nw6 = (nw)entry5.getKey();
			int integer7 = (Integer)entry5.getValue();
			if (nw6.d() && integer7 > 0) {
				if (this.j && this.f.h.E().a(nw6) == 0) {
					nq nq8 = (nq)nw6;
					this.f.q.a(nq8);
					if (nw6 == nr.f) {
						this.f.u.J = false;
						this.f.u.b();
					}
				}

				boolean3 = true;
			}

			this.f.h.E().a(this.f.h, nw6, integer7);
		}

		if (!this.j && !boolean3 && this.f.u.J) {
			this.f.q.b(nr.f);
		}

		this.j = true;
		if (this.f.m instanceof bib) {
			((bib)this.f.m).a();
		}
	}

	@Override
	public void a(il il) {
		fo.a(il, this, this.f);
		sn sn3 = this.g.a(il.b());
		if (sn3 instanceof sw) {
			sg sg4 = sg.a(il.c());
			if (sg4 != null) {
				sh sh5 = new sh(sg4, il.e(), il.d(), il.g(), il.f());
				sh5.b(il.a());
				((sw)sn3).c(sh5);
			}
		}
	}

	@Override
	public void a(hf hf) {
		fo.a(hf, this, this.f);
		if (hf.a == hf.a.ENTITY_DIED) {
			sn sn3 = this.g.a(hf.b);
			if (sn3 == this.f.h) {
				this.f.a(new bgz(hf.e));
			}
		}
	}

	@Override
	public void a(gd gd) {
		fo.a(gd, this, this.f);
		this.f.f.T().a(gd.b());
		this.f.f.T().e(gd.a());
	}

	@Override
	public void a(hp hp) {
		fo.a(hp, this, this.f);
		sn sn3 = hp.a(this.g);
		if (sn3 != null) {
			this.f.a(sn3);
		}
	}

	@Override
	public void a(ho ho) {
		fo.a(ho, this, this.f);
		ho.a(this.g.aj());
	}

	@Override
	public void a(ie ie) {
		fo.a(ie, this, this.f);
		ie.a a3 = ie.a();
		String string4 = null;
		String string5 = null;
		String string6 = ie.b() != null ? ie.b().d() : "";
		switch (a3) {
			case TITLE:
				string4 = string6;
				break;
			case SUBTITLE:
				string5 = string6;
				break;
			case ACTIONBAR:
				this.f.r.a(string6, false);
				return;
			case RESET:
				this.f.r.a("", "", -1, -1, -1);
				this.f.r.a();
				return;
		}

		this.f.r.a(string4, string5, ie.c(), ie.d(), ie.e());
	}

	@Override
	public void a(ih ih) {
		this.f.r.h().b(ih.a().d().isEmpty() ? null : ih.a());
		this.f.r.h().a(ih.b().d().isEmpty() ? null : ih.b());
	}

	@Override
	public void a(hk hk) {
		fo.a(hk, this, this.f);
		sn sn3 = hk.a(this.g);
		if (sn3 instanceof sw) {
			((sw)sn3).c(hk.a());
		}
	}

	@Override
	public void a(hg hg) {
		fo.a(hg, this, this.f);

		for (hg.b b4 : hg.a()) {
			if (hg.b() == hg.a.REMOVE_PLAYER) {
				this.i.remove(b4.a().getId());
			} else {
				bnr bnr5 = (bnr)this.i.get(b4.a().getId());
				if (hg.b() == hg.a.ADD_PLAYER) {
					bnr5 = new bnr(b4);
					this.i.put(bnr5.a().getId(), bnr5);
				}

				if (bnr5 != null) {
					switch (hg.b()) {
						case ADD_PLAYER:
							bnr5.a(b4.c());
							bnr5.a(b4.b());
							break;
						case UPDATE_GAME_MODE:
							bnr5.a(b4.c());
							break;
						case UPDATE_LATENCY:
							bnr5.a(b4.b());
							break;
						case UPDATE_DISPLAY_NAME:
							bnr5.a(b4.d());
					}
				}
			}
		}
	}

	@Override
	public void a(gv gv) {
		this.a(new iy(gv.a()));
	}

	@Override
	public void a(he he) {
		fo.a(he, this, this.f);
		aay aay3 = this.f.h;
		aay3.bK.b = he.b();
		aay3.bK.d = he.d();
		aay3.bK.a = he.a();
		aay3.bK.c = he.c();
		aay3.bK.a(he.e());
		aay3.bK.b(he.f());
	}

	@Override
	public void a(ge ge) {
		fo.a(ge, this, this.f);
		String[] arr3 = ge.a();
		Arrays.sort(arr3);
		if (this.f.m instanceof bht) {
			((bht)this.f.m).a(arr3);
		}
	}

	@Override
	public void a(ig ig) {
		fo.a(ig, this, this.f);
		this.f.f.a(this.f.h, ig.c(), ig.d(), ig.e(), ig.a(), ig.b(), ig.f(), ig.g());
	}

	@Override
	public void a(gp gp) {
		fo.a(gp, this, this.f);
		this.f.U().a(new cby(new kq(gp.a()), gp.b(), gp.f(), gp.g(), false, 0, ccc.a.LINEAR, (float)gp.c(), (float)gp.d(), (float)gp.e()));
	}

	@Override
	public void a(hl hl) {
		final String string3 = hl.a();
		final String string4 = hl.b();
		if (this.b(string3)) {
			if (string3.startsWith("level://")) {
				try {
					String string5 = URLDecoder.decode(string3.substring("level://".length()), Charsets.UTF_8.toString());
					File file6 = new File(this.f.w, "saves");
					File file7 = new File(file6, string5);
					if (file7.isFile()) {
						this.c.a(new jg(jg.a.ACCEPTED));
						Futures.addCallback(this.f.P().a(file7), this.f());
						return;
					}
				} catch (UnsupportedEncodingException var7) {
				}

				this.c.a(new jg(jg.a.FAILED_DOWNLOAD));
			} else {
				bnt bnt5 = this.f.C();
				if (bnt5 != null && bnt5.b() == bnt.a.ENABLED) {
					this.c.a(new jg(jg.a.ACCEPTED));
					Futures.addCallback(this.f.P().a(string3, string4), this.f());
				} else if (bnt5 != null && bnt5.b() != bnt.a.PROMPT) {
					this.c.a(new jg(jg.a.DECLINED));
				} else {
					this.f.a(new Runnable() {
						public void run() {
							bno.this.f.a(new bgu(new bgt() {
								@Override
								public void a(boolean boolean1, int integer) {
									bno.this.f = bes.z();
									bnt bnt4 = bno.this.f.C();
									if (boolean1) {
										if (bnt4 != null) {
											bnt4.a(bnt.a.ENABLED);
										}

										bno.this.c.a(new jg(jg.a.ACCEPTED));
										Futures.addCallback(bno.this.f.P().a(string3, string4), bno.this.f());
									} else {
										if (bnt4 != null) {
											bnt4.a(bnt.a.DISABLED);
										}

										bno.this.c.a(new jg(jg.a.DECLINED));
									}

									bnu.b(bnt4);
									bno.this.f.a(null);
								}
							}, cah.a("multiplayer.texturePrompt.line1"), cah.a("multiplayer.texturePrompt.line2"), 0));
						}
					});
				}
			}
		}
	}

	private boolean b(String string) {
		try {
			URI uRI3 = new URI(string);
			String string4 = uRI3.getScheme();
			boolean boolean5 = "level".equals(string4);
			if (!"http".equals(string4) && !"https".equals(string4) && !boolean5) {
				throw new URISyntaxException(string, "Wrong protocol");
			} else if (!boolean5 || !string.contains("..") && string.endsWith("/resources.zip")) {
				return true;
			} else {
				throw new URISyntaxException(string, "Invalid levelstorage resourcepack path");
			}
		} catch (URISyntaxException var5) {
			this.c.a(new jg(jg.a.FAILED_DOWNLOAD));
			return false;
		}
	}

	private FutureCallback<Object> f() {
		return new FutureCallback<Object>() {
			public void onSuccess(@Nullable Object object) {
				bno.this.c.a(new jg(jg.a.SUCCESSFULLY_LOADED));
			}

			public void onFailure(Throwable throwable) {
				bno.this.c.a(new jg(jg.a.FAILED_DOWNLOAD));
			}
		};
	}

	@Override
	public void a(gc gc) {
		fo.a(gc, this, this.f);
		this.f.r.j().a(gc);
	}

	@Override
	public void a(gn gn) {
		fo.a(gn, this, this.f);
		if (gn.b() == 0) {
			this.f.h.di().b(gn.a());
		} else {
			this.f.h.di().a(gn.a(), gn.b());
		}
	}

	@Override
	public void a(hc hc) {
		fo.a(hc, this, this.f);
		sn sn3 = this.f.h.bz();
		if (sn3 != this.f.h && sn3.bA()) {
			sn3.a(hc.a(), hc.b(), hc.c(), hc.d(), hc.e());
			this.c.a(new ja(sn3));
		}
	}

	@Override
	public void a(go go) {
		fo.a(go, this, this.f);
		if ("MC|TrList".equals(go.a())) {
			et et3 = go.b();

			try {
				int integer4 = et3.readInt();
				bho bho5 = this.f.m;
				if (bho5 != null && bho5 instanceof biy && integer4 == this.f.h.bu.d) {
					ajd ajd6 = ((biy)bho5).a();
					ajf ajf7 = ajf.b(et3);
					ajd6.a(ajf7);
				}
			} catch (IOException var10) {
				b.error("Couldn't load trade info", var10);
			} finally {
				et3.release();
			}
		} else if ("MC|Brand".equals(go.a())) {
			this.f.h.h(go.b().e(32767));
		} else if ("MC|BOpen".equals(go.a())) {
			ri ri3 = go.b().a(ri.class);
			afj afj4 = ri3 == ri.OFF_HAND ? this.f.h.ch() : this.f.h.cg();
			if (afj4.c() == afl.bY) {
				this.f.a(new bij(this.f.h, afj4, false));
			}
		} else if ("MC|DebugPath".equals(go.a())) {
			et et3 = go.b();
			int integer4 = et3.readInt();
			float float5 = et3.readFloat();
			bbd bbd6 = bbd.b(et3);
			((btw)this.f.p.a).a(integer4, bbd6, float5);
		} else if ("MC|DebugNeighborsUpdate".equals(go.a())) {
			et et3 = go.b();
			long long4 = et3.h();
			co co6 = et3.e();
			((btv)this.f.p.f).a(long4, co6);
		} else if ("MC|StopSound".equals(go.a())) {
			et et3 = go.b();
			String string4 = et3.e(32767);
			String string5 = et3.e(256);
			this.f.U().a(string5, no.a(string4));
		}
	}

	@Override
	public void a(hy hy) {
		fo.a(hy, this, this.f);
		bec bec3 = this.g.ad();
		if (hy.c() == 0) {
			bdy bdy4 = bec3.a(hy.a(), bei.b);
			bdy4.a(hy.b());
			bdy4.a(hy.d());
		} else {
			bdy bdy4 = bec3.b(hy.a());
			if (hy.c() == 1) {
				bec3.k(bdy4);
			} else if (hy.c() == 2) {
				bdy4.a(hy.b());
				bdy4.a(hy.d());
			}
		}
	}

	@Override
	public void a(ib ib) {
		fo.a(ib, this, this.f);
		bec bec3 = this.g.ad();
		bdy bdy4 = bec3.b(ib.b());
		if (ib.d() == ib.a.CHANGE) {
			bea bea5 = bec3.c(ib.a(), bdy4);
			bea5.c(ib.c());
		} else if (ib.d() == ib.a.REMOVE) {
			if (oy.b(ib.b())) {
				bec3.d(ib.a(), null);
			} else if (bdy4 != null) {
				bec3.d(ib.a(), bdy4);
			}
		}
	}

	@Override
	public void a(hr hr) {
		fo.a(hr, this, this.f);
		bec bec3 = this.g.ad();
		if (hr.b().isEmpty()) {
			bec3.a(hr.a(), null);
		} else {
			bdy bdy4 = bec3.b(hr.b());
			bec3.a(hr.a(), bdy4);
		}
	}

	@Override
	public void a(ia ia) {
		fo.a(ia, this, this.f);
		bec bec3 = this.g.ad();
		bdz bdz4;
		if (ia.f() == 0) {
			bdz4 = bec3.e(ia.a());
		} else {
			bdz4 = bec3.d(ia.a());
		}

		if (ia.f() == 0 || ia.f() == 2) {
			bdz4.a(ia.b());
			bdz4.b(ia.c());
			bdz4.c(ia.d());
			bdz4.a(a.a(ia.h()));
			bdz4.a(ia.g());
			bee.b b5 = bee.b.a(ia.i());
			if (b5 != null) {
				bdz4.a(b5);
			}

			bee.a a6 = bee.a.a(ia.j());
			if (a6 != null) {
				bdz4.a(a6);
			}
		}

		if (ia.f() == 0 || ia.f() == 3) {
			for (String string6 : ia.e()) {
				bec3.a(string6, ia.a());
			}
		}

		if (ia.f() == 4) {
			for (String string6 : ia.e()) {
				bec3.a(string6, bdz4);
			}
		}

		if (ia.f() == 1) {
			bec3.d(bdz4);
		}
	}

	@Override
	public void a(gy gy) {
		fo.a(gy, this, this.f);
		if (gy.j() == 0) {
			double double3 = (double)(gy.i() * gy.f());
			double double5 = (double)(gy.i() * gy.g());
			double double7 = (double)(gy.i() * gy.h());

			try {
				this.g.a(gy.a(), gy.b(), gy.c(), gy.d(), gy.e(), double3, double5, double7, gy.k());
			} catch (Throwable var17) {
				b.warn("Could not spawn particle effect {}", new Object[]{gy.a()});
			}
		} else {
			for (int integer3 = 0; integer3 < gy.j(); integer3++) {
				double double4 = this.k.nextGaussian() * (double)gy.f();
				double double6 = this.k.nextGaussian() * (double)gy.g();
				double double8 = this.k.nextGaussian() * (double)gy.h();
				double double10 = this.k.nextGaussian() * (double)gy.i();
				double double12 = this.k.nextGaussian() * (double)gy.i();
				double double14 = this.k.nextGaussian() * (double)gy.i();

				try {
					this.g.a(gy.a(), gy.b(), gy.c() + double4, gy.d() + double6, gy.e() + double8, double10, double12, double14, gy.k());
				} catch (Throwable var16) {
					b.warn("Could not spawn particle effect {}", new Object[]{gy.a()});
					return;
				}
			}
		}
	}

	@Override
	public void a(ik ik) {
		fo.a(ik, this, this.f);
		sn sn3 = this.g.a(ik.a());
		if (sn3 != null) {
			if (!(sn3 instanceof sw)) {
				throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + sn3 + ")");
			} else {
				tn tn4 = ((sw)sn3).ce();

				for (ik.a a6 : ik.b()) {
					tk tk7 = tn4.a(a6.a());
					if (tk7 == null) {
						tk7 = tn4.b(new tq(null, a6.a(), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
					}

					tk7.a(a6.b());
					tk7.d();

					for (tl tl9 : a6.c()) {
						tk7.b(tl9);
					}
				}
			}
		}
	}

	public er a() {
		return this.c;
	}

	public Collection<bnr> d() {
		return this.i.values();
	}

	public bnr a(UUID uUID) {
		return (bnr)this.i.get(uUID);
	}

	@Nullable
	public bnr a(String string) {
		for (bnr bnr4 : this.i.values()) {
			if (bnr4.a().getName().equals(string)) {
				return bnr4;
			}
		}

		return null;
	}

	public GameProfile e() {
		return this.d;
	}
}
