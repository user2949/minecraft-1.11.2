import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bur {
	private final Map<Class<? extends sn>, bus<? extends sn>> k = Maps.newHashMap();
	private final Map<String, byc> l = Maps.newHashMap();
	private final byc m;
	private bfg n;
	private double o;
	private double p;
	private double q;
	public bza a;
	public ajs b;
	public sn c;
	public sn d;
	public float e;
	public float f;
	public beu g;
	public double h;
	public double i;
	public double j;
	private boolean r;
	private boolean s = true;
	private boolean t;

	public bur(bza bza, bvh bvh) {
		this.a = bza;
		this.k.put(zo.class, new bug(this));
		this.k.put(aai.class, new bwg(this));
		this.k.put(xc.class, new bvu(this));
		this.k.put(xf.class, new bvy(this));
		this.k.put(wy.class, new bui(this));
		this.k.put(xa.class, new bvr(this));
		this.k.put(xk.class, new bww(this));
		this.k.put(wx.class, new buh(this));
		this.k.put(xb.class, new bvs(this));
		this.k.put(xe.class, new bvx(this));
		this.k.put(aaf.class, new bwb(this));
		this.k.put(zs.class, new buq(this));
		this.k.put(zp.class, new buj(this));
		this.k.put(zr.class, new bup(this));
		this.k.put(xg.class, new bwe(this));
		this.k.put(aag.class, new bwc(this));
		this.k.put(aan.class, new bwu(this));
		this.k.put(aaj.class, new bwi(this));
		this.k.put(aam.class, new bws(this));
		this.k.put(zn.class, new bue(this));
		this.k.put(aab.class, new bvv(this));
		this.k.put(aao.class, new bwx(this));
		this.k.put(aap.class, new bwy(this));
		this.k.put(zy.class, new bve(this));
		this.k.put(aah.class, new bwd(this));
		this.k.put(zz.class, new bvi(this));
		this.k.put(zw.class, new bva(this, 6.0F));
		this.k.put(zv.class, new buz(this));
		this.k.put(xh.class, new bwh(this));
		this.k.put(aat.class, new bwq(this));
		this.k.put(xi.class, new bwp(this));
		this.k.put(wu.class, new bud(this));
		this.k.put(zx.class, new bvb(this));
		this.k.put(zq.class, new bum(this));
		this.k.put(aae.class, new bwa(this));
		this.k.put(xd.class, new bvw(this));
		this.k.put(zu.class, new buu(this));
		this.k.put(aal.class, new bwr(this));
		this.k.put(aak.class, new bwo(this));
		this.k.put(yb.class, new buo(this));
		this.k.put(ya.class, new bun(this));
		this.k.put(yv.class, new bwt(this));
		this.k.put(sn.class, new buk(this));
		this.k.put(zb.class, new bvt(this));
		this.k.put(yz.class, new bvg(this, bvh));
		this.k.put(za.class, new bvj(this));
		this.k.put(abu.class, new bwl(this));
		this.k.put(abo.class, new bwf(this));
		this.k.put(abn.class, new bwj(this, afl.aG, bvh));
		this.k.put(abr.class, new bwj(this, afl.bC, bvh));
		this.k.put(abe.class, new bwj(this, afl.bS, bvh));
		this.k.put(abq.class, new bwj(this, afl.aX, bvh));
		this.k.put(abt.class, new bwk(this, bvh));
		this.k.put(abs.class, new bwj(this, afl.bV, bvh));
		this.k.put(abg.class, new bwj(this, afl.cm, bvh));
		this.k.put(abh.class, new bux(this, 2.0F));
		this.k.put(abm.class, new bux(this, 0.5F));
		this.k.put(abc.class, new bul(this));
		this.k.put(abv.class, new bwv(this));
		this.k.put(abl.class, new bvz(this));
		this.k.put(zj.class, new bvf(this, bvh));
		this.k.put(st.class, new buv(this));
		this.k.put(zk.class, new bwn(this));
		this.k.put(zi.class, new buw(this));
		this.k.put(yx.class, new bub(this));
		this.k.put(abd.class, new but(this));
		this.k.put(acg.class, new bwm(this));
		this.k.put(acf.class, new bvp(this));
		this.k.put(aby.class, new bvo(this));
		this.k.put(abx.class, new buf(this));
		this.k.put(zd.class, new buy(this));
		this.k.put(sl.class, new bua(this));
		this.k.put(xo.class, new bvc(this));
		this.k.put(xs.class, new btz(this));
		this.k.put(xu.class, new btz(this));
		this.k.put(xr.class, new btz(this, 0.92F));
		this.k.put(xn.class, new btz(this, 0.87F));
		this.k.put(xq.class, new bvm(this));
		this.k.put(abi.class, new bvn(this));
		this.k.put(zg.class, new bvk(this));
		this.m = new byc(this);
		this.l.put("default", this.m);
		this.l.put("slim", new byc(this, true));
	}

	public void a(double double1, double double2, double double3) {
		this.o = double1;
		this.p = double2;
		this.q = double3;
	}

	public <T extends sn> bus<T> a(Class<? extends sn> class1) {
		bus<? extends sn> bus3 = (bus<? extends sn>)this.k.get(class1);
		if (bus3 == null && class1 != sn.class) {
			bus3 = this.a(class1.getSuperclass());
			this.k.put(class1, bus3);
		}

		return (bus<T>)bus3;
	}

	@Nullable
	public <T extends sn> bus<T> a(sn sn) {
		if (sn instanceof bpp) {
			String string3 = ((bpp)sn).t();
			byc byc4 = (byc)this.l.get(string3);
			return byc4 != null ? byc4 : this.m;
		} else {
			return this.a(sn.getClass());
		}
	}

	public void a(ajs ajs, bfg bfg, sn sn3, sn sn4, beu beu, float float6) {
		this.b = ajs;
		this.g = beu;
		this.c = sn3;
		this.d = sn4;
		this.n = bfg;
		if (sn3 instanceof sw && ((sw)sn3).cr()) {
			atl atl8 = ajs.o(new co(sn3));
			alu alu9 = atl8.v();
			if (alu9 == alv.C) {
				int integer10 = ((cv)atl8.c(als.D)).b();
				this.e = (float)(integer10 * 90 + 180);
				this.f = 0.0F;
			}
		} else {
			this.e = sn3.x + (sn3.v - sn3.x) * float6;
			this.f = sn3.y + (sn3.w - sn3.y) * float6;
		}

		if (beu.as == 2) {
			this.e += 180.0F;
		}

		this.h = sn3.M + (sn3.p - sn3.M) * (double)float6;
		this.i = sn3.N + (sn3.q - sn3.N) * (double)float6;
		this.j = sn3.O + (sn3.r - sn3.O) * (double)float6;
	}

	public void a(float float1) {
		this.e = float1;
	}

	public boolean a() {
		return this.s;
	}

	public void a(boolean boolean1) {
		this.s = boolean1;
	}

	public void b(boolean boolean1) {
		this.t = boolean1;
	}

	public boolean b() {
		return this.t;
	}

	public boolean b(sn sn) {
		return this.a(sn).K_();
	}

	public boolean a(sn sn, btl btl, double double3, double double4, double double5) {
		bus<sn> bus10 = this.a(sn);
		return bus10 != null && bus10.a(sn, btl, double3, double4, double5);
	}

	public void a(sn sn, float float2, boolean boolean3) {
		if (sn.T == 0) {
			sn.M = sn.p;
			sn.N = sn.q;
			sn.O = sn.r;
		}

		double double5 = sn.M + (sn.p - sn.M) * (double)float2;
		double double7 = sn.N + (sn.q - sn.N) * (double)float2;
		double double9 = sn.O + (sn.r - sn.O) * (double)float2;
		float float11 = sn.x + (sn.v - sn.x) * float2;
		int integer12 = sn.d(float2);
		if (sn.aJ()) {
			integer12 = 15728880;
		}

		int integer13 = integer12 % 65536;
		int integer14 = integer12 / 65536;
		cdb.a(cdb.r, (float)integer13, (float)integer14);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.a(sn, double5 - this.o, double7 - this.p, double9 - this.q, float11, float2, boolean3);
	}

	public void a(sn sn, double double2, double double3, double double4, float float5, float float6, boolean boolean7) {
		bus<sn> bus12 = null;

		try {
			bus12 = this.a(sn);
			if (bus12 != null && this.a != null) {
				try {
					bus12.a(this.r);
					bus12.a(sn, double2, double3, double4, float5, float6);
				} catch (Throwable var17) {
					throw new f(b.a(var17, "Rendering entity in world"));
				}

				try {
					if (!this.r) {
						bus12.c(sn, double2, double3, double4, float5, float6);
					}
				} catch (Throwable var18) {
					throw new f(b.a(var18, "Post-rendering entity in world"));
				}

				if (this.t && !sn.aP() && !boolean7 && !bes.z().am()) {
					try {
						this.a(sn, double2, double3, double4, float5, float6);
					} catch (Throwable var16) {
						throw new f(b.a(var16, "Rendering entity hitbox in world"));
					}
				}
			}
		} catch (Throwable var19) {
			b b14 = b.a(var19, "Rendering entity in world");
			c c15 = b14.a("Entity being rendered");
			sn.a(c15);
			c c16 = b14.a("Renderer details");
			c16.a("Assigned renderer", bus12);
			c16.a("Location", c.a(double2, double3, double4));
			c16.a("Rotation", float5);
			c16.a("Delta", float6);
			throw new f(b14);
		}
	}

	public void a(sn sn, float float2) {
		if (sn.T == 0) {
			sn.M = sn.p;
			sn.N = sn.q;
			sn.O = sn.r;
		}

		double double4 = sn.M + (sn.p - sn.M) * (double)float2;
		double double6 = sn.N + (sn.q - sn.N) * (double)float2;
		double double8 = sn.O + (sn.r - sn.O) * (double)float2;
		float float10 = sn.x + (sn.v - sn.x) * float2;
		int integer11 = sn.d(float2);
		if (sn.aJ()) {
			integer11 = 15728880;
		}

		int integer12 = integer11 % 65536;
		int integer13 = integer11 / 65536;
		cdb.a(cdb.r, (float)integer12, (float)integer13);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bus<sn> bus14 = this.a(sn);
		if (bus14 != null && this.a != null) {
			bus14.b(sn, double4 - this.o, double6 - this.p, double8 - this.q, float10, float2);
		}
	}

	private void a(sn sn, double double2, double double3, double double4, float float5, float float6) {
		bqg.a(false);
		bqg.z();
		bqg.g();
		bqg.r();
		bqg.l();
		float float11 = sn.G / 2.0F;
		bdt bdt12 = sn.bo();
		bqm.a(
			bdt12.a - sn.p + double2,
			bdt12.b - sn.q + double3,
			bdt12.c - sn.r + double4,
			bdt12.d - sn.p + double2,
			bdt12.e - sn.q + double3,
			bdt12.f - sn.r + double4,
			1.0F,
			1.0F,
			1.0F,
			1.0F
		);
		sn[] arr13 = sn.aT();
		if (arr13 != null) {
			for (sn sn17 : arr13) {
				double double18 = (sn17.p - sn17.m) * (double)float6;
				double double20 = (sn17.q - sn17.n) * (double)float6;
				double double22 = (sn17.r - sn17.o) * (double)float6;
				bdt bdt24 = sn17.bo();
				bqm.a(
					bdt24.a - this.o + double18,
					bdt24.b - this.p + double20,
					bdt24.c - this.q + double22,
					bdt24.d - this.o + double18,
					bdt24.e - this.p + double20,
					bdt24.f - this.q + double22,
					0.25F,
					1.0F,
					0.0F,
					1.0F
				);
			}
		}

		if (sn instanceof sw) {
			float float14 = 0.01F;
			bqm.a(
				double2 - (double)float11,
				double3 + (double)sn.bq() - 0.01F,
				double4 - (double)float11,
				double2 + (double)float11,
				double3 + (double)sn.bq() + 0.01F,
				double4 + (double)float11,
				1.0F,
				0.0F,
				0.0F,
				1.0F
			);
		}

		bqs bqs14 = bqs.a();
		bpy bpy15 = bqs14.c();
		bdw bdw16 = sn.f(float6);
		bpy15.a(3, bzh.f);
		bpy15.b(double2, double3 + (double)sn.bq(), double4).b(0, 0, 255, 255).d();
		bpy15.b(double2 + bdw16.b * 2.0, double3 + (double)sn.bq() + bdw16.c * 2.0, double4 + bdw16.d * 2.0).b(0, 0, 255, 255).d();
		bqs14.b();
		bqg.y();
		bqg.f();
		bqg.q();
		bqg.l();
		bqg.a(true);
	}

	public void a(@Nullable ajs ajs) {
		this.b = ajs;
		if (ajs == null) {
			this.c = null;
		}
	}

	public double b(double double1, double double2, double double3) {
		double double8 = double1 - this.h;
		double double10 = double2 - this.i;
		double double12 = double3 - this.j;
		return double8 * double8 + double10 * double10 + double12 * double12;
	}

	public bfg c() {
		return this.n;
	}

	public void c(boolean boolean1) {
		this.r = boolean1;
	}
}
