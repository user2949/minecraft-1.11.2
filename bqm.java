import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class bqm implements aju, bzz {
	private static final Logger b = LogManager.getLogger();
	private static final kq c = new kq("textures/environment/moon_phases.png");
	private static final kq d = new kq("textures/environment/sun.png");
	private static final kq e = new kq("textures/environment/clouds.png");
	private static final kq f = new kq("textures/environment/end_sky.png");
	private static final kq g = new kq("textures/misc/forcefield.png");
	private final bes h;
	private final bza i;
	private final bur j;
	private bnq k;
	private Set<bte> l = Sets.newLinkedHashSet();
	private List<bqm.a> m = Lists.newArrayListWithCapacity(69696);
	private final Set<asc> n = Sets.newHashSet();
	private bqv o;
	private int p = -1;
	private int q = -1;
	private int r = -1;
	private final bzj s;
	private bzi t;
	private bzi u;
	private bzi v;
	private int w;
	private final Map<Integer, lp> x = Maps.newHashMap();
	private final Map<co, ccc> y = Maps.newHashMap();
	private final byz[] z = new byz[10];
	private bqr A;
	private byh B;
	private double C = Double.MIN_VALUE;
	private double D = Double.MIN_VALUE;
	private double E = Double.MIN_VALUE;
	private int F = Integer.MIN_VALUE;
	private int G = Integer.MIN_VALUE;
	private int H = Integer.MIN_VALUE;
	private double I = Double.MIN_VALUE;
	private double J = Double.MIN_VALUE;
	private double K = Double.MIN_VALUE;
	private double L = Double.MIN_VALUE;
	private double M = Double.MIN_VALUE;
	private bsz N;
	private bqb O;
	private int P = -1;
	private int Q = 2;
	private int R;
	private int S;
	private int T;
	private boolean U;
	private bto V;
	private final Vector4f[] W = new Vector4f[8];
	private final ccy X = new ccy();
	private boolean Y;
	btf a;
	private double Z;
	private double aa;
	private double ab;
	private boolean ac = true;
	private boolean ad;
	private final Set<co> ae = Sets.newHashSet();

	public bqm(bes bes) {
		this.h = bes;
		this.j = bes.ac();
		this.i = bes.N();
		this.i.a(g);
		bqg.b(3553, 10242, 10497);
		bqg.b(3553, 10243, 10497);
		bqg.i(0);
		this.p();
		this.Y = cdb.f();
		if (this.Y) {
			this.O = new bqt();
			this.a = new btg();
		} else {
			this.O = new bqo();
			this.a = new btc();
		}

		this.s = new bzj();
		this.s.a(new bzk(0, bzk.a.FLOAT, bzk.b.POSITION, 3));
		this.s();
		this.r();
		this.q();
	}

	@Override
	public void a(bzy bzy) {
		this.p();
	}

	private void p() {
		byy byy2 = this.h.R();

		for (int integer3 = 0; integer3 < this.z.length; integer3++) {
			this.z[integer3] = byy2.a("minecraft:blocks/destroy_stage_" + integer3);
		}
	}

	public void b() {
		if (cdb.O) {
			if (byk.b() == null) {
				byk.a();
			}

			kq kq2 = new kq("shaders/post/entity_outline.json");

			try {
				this.B = new byh(this.h.N(), this.h.O(), this.h.b(), kq2);
				this.B.a(this.h.d, this.h.e);
				this.A = this.B.a("final");
			} catch (IOException var3) {
				b.warn("Failed to load shader: {}", new Object[]{kq2, var3});
				this.B = null;
				this.A = null;
			} catch (JsonSyntaxException var4) {
				b.warn("Failed to load shader: {}", new Object[]{kq2, var4});
				this.B = null;
				this.A = null;
			}
		} else {
			this.B = null;
			this.A = null;
		}
	}

	public void c() {
		if (this.d()) {
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ZERO, bqg.l.ONE);
			this.A.a(this.h.d, this.h.e, false);
			bqg.l();
		}
	}

	protected boolean d() {
		return this.A != null && this.B != null && this.h.h != null;
	}

	private void q() {
		bqs bqs2 = bqs.a();
		bpy bpy3 = bqs2.c();
		if (this.v != null) {
			this.v.c();
		}

		if (this.r >= 0) {
			ber.b(this.r);
			this.r = -1;
		}

		if (this.Y) {
			this.v = new bzi(this.s);
			this.a(bpy3, -16.0F, true);
			bpy3.e();
			bpy3.b();
			this.v.a(bpy3.f());
		} else {
			this.r = ber.a(1);
			bqg.f(this.r, 4864);
			this.a(bpy3, -16.0F, true);
			bqs2.b();
			bqg.K();
		}
	}

	private void r() {
		bqs bqs2 = bqs.a();
		bpy bpy3 = bqs2.c();
		if (this.u != null) {
			this.u.c();
		}

		if (this.q >= 0) {
			ber.b(this.q);
			this.q = -1;
		}

		if (this.Y) {
			this.u = new bzi(this.s);
			this.a(bpy3, 16.0F, false);
			bpy3.e();
			bpy3.b();
			this.u.a(bpy3.f());
		} else {
			this.q = ber.a(1);
			bqg.f(this.q, 4864);
			this.a(bpy3, 16.0F, false);
			bqs2.b();
			bqg.K();
		}
	}

	private void a(bpy bpy, float float2, boolean boolean3) {
		int integer5 = 64;
		int integer6 = 6;
		bpy.a(7, bzh.e);

		for (int integer7 = -384; integer7 <= 384; integer7 += 64) {
			for (int integer8 = -384; integer8 <= 384; integer8 += 64) {
				float float9 = (float)integer7;
				float float10 = (float)(integer7 + 64);
				if (boolean3) {
					float10 = (float)integer7;
					float9 = (float)(integer7 + 64);
				}

				bpy.b((double)float9, (double)float2, (double)integer8).d();
				bpy.b((double)float10, (double)float2, (double)integer8).d();
				bpy.b((double)float10, (double)float2, (double)(integer8 + 64)).d();
				bpy.b((double)float9, (double)float2, (double)(integer8 + 64)).d();
			}
		}
	}

	private void s() {
		bqs bqs2 = bqs.a();
		bpy bpy3 = bqs2.c();
		if (this.t != null) {
			this.t.c();
		}

		if (this.p >= 0) {
			ber.b(this.p);
			this.p = -1;
		}

		if (this.Y) {
			this.t = new bzi(this.s);
			this.a(bpy3);
			bpy3.e();
			bpy3.b();
			this.t.a(bpy3.f());
		} else {
			this.p = ber.a(1);
			bqg.G();
			bqg.f(this.p, 4864);
			this.a(bpy3);
			bqs2.b();
			bqg.K();
			bqg.H();
		}
	}

	private void a(bpy bpy) {
		Random random3 = new Random(10842L);
		bpy.a(7, bzh.e);

		for (int integer4 = 0; integer4 < 1500; integer4++) {
			double double5 = (double)(random3.nextFloat() * 2.0F - 1.0F);
			double double7 = (double)(random3.nextFloat() * 2.0F - 1.0F);
			double double9 = (double)(random3.nextFloat() * 2.0F - 1.0F);
			double double11 = (double)(0.15F + random3.nextFloat() * 0.1F);
			double double13 = double5 * double5 + double7 * double7 + double9 * double9;
			if (double13 < 1.0 && double13 > 0.01) {
				double13 = 1.0 / Math.sqrt(double13);
				double5 *= double13;
				double7 *= double13;
				double9 *= double13;
				double double15 = double5 * 100.0;
				double double17 = double7 * 100.0;
				double double19 = double9 * 100.0;
				double double21 = Math.atan2(double5, double9);
				double double23 = Math.sin(double21);
				double double25 = Math.cos(double21);
				double double27 = Math.atan2(Math.sqrt(double5 * double5 + double9 * double9), double7);
				double double29 = Math.sin(double27);
				double double31 = Math.cos(double27);
				double double33 = random3.nextDouble() * Math.PI * 2.0;
				double double35 = Math.sin(double33);
				double double37 = Math.cos(double33);

				for (int integer39 = 0; integer39 < 4; integer39++) {
					double double40 = 0.0;
					double double42 = (double)((integer39 & 2) - 1) * double11;
					double double44 = (double)((integer39 + 1 & 2) - 1) * double11;
					double double46 = 0.0;
					double double48 = double42 * double37 - double44 * double35;
					double double50 = double44 * double37 + double42 * double35;
					double double54 = double48 * double29 + 0.0 * double31;
					double double56 = 0.0 * double29 - double48 * double31;
					double double58 = double56 * double23 - double50 * double25;
					double double62 = double50 * double23 + double56 * double25;
					bpy.b(double15 + double58, double17 + double54, double19 + double62).d();
				}
			}
		}
	}

	public void a(@Nullable bnq bnq) {
		if (this.k != null) {
			this.k.b(this);
		}

		this.C = Double.MIN_VALUE;
		this.D = Double.MIN_VALUE;
		this.E = Double.MIN_VALUE;
		this.F = Integer.MIN_VALUE;
		this.G = Integer.MIN_VALUE;
		this.H = Integer.MIN_VALUE;
		this.j.a(bnq);
		this.k = bnq;
		if (bnq != null) {
			bnq.a(this);
			this.a();
		} else {
			this.l.clear();
			this.m.clear();
			if (this.o != null) {
				this.o.a();
				this.o = null;
			}

			if (this.N != null) {
				this.N.g();
			}

			this.N = null;
		}
	}

	public void a() {
		if (this.k != null) {
			if (this.N == null) {
				this.N = new bsz();
			}

			this.ac = true;
			alv.t.b(this.h.u.j);
			alv.u.b(this.h.u.j);
			this.P = this.h.u.d;
			boolean boolean2 = this.Y;
			this.Y = cdb.f();
			if (boolean2 && !this.Y) {
				this.O = new bqo();
				this.a = new btc();
			} else if (!boolean2 && this.Y) {
				this.O = new bqt();
				this.a = new btg();
			}

			if (boolean2 != this.Y) {
				this.s();
				this.r();
				this.q();
			}

			if (this.o != null) {
				this.o.a();
			}

			this.e();
			synchronized (this.n) {
				this.n.clear();
			}

			this.o = new bqv(this.k, this.h.u.d, this, this.a);
			if (this.k != null) {
				sn sn3 = this.h.aa();
				if (sn3 != null) {
					this.o.a(sn3.p, sn3.r);
				}
			}

			this.Q = 2;
		}
	}

	protected void e() {
		this.l.clear();
		this.N.b();
	}

	public void a(int integer1, int integer2) {
		if (cdb.O) {
			if (this.B != null) {
				this.B.a(integer1, integer2);
			}
		}
	}

	public void a(sn sn, btl btl, float float3) {
		if (this.Q > 0) {
			this.Q--;
		} else {
			double double5 = sn.m + (sn.p - sn.m) * (double)float3;
			double double7 = sn.n + (sn.q - sn.n) * (double)float3;
			double double9 = sn.o + (sn.r - sn.o) * (double)float3;
			this.k.C.a("prepare");
			bsk.a.a(this.k, this.h.N(), this.h.k, this.h.aa(), this.h.t, float3);
			this.j.a(this.k, this.h.k, this.h.aa(), this.h.i, this.h.u, float3);
			this.R = 0;
			this.S = 0;
			this.T = 0;
			sn sn11 = this.h.aa();
			double double12 = sn11.M + (sn11.p - sn11.M) * (double)float3;
			double double14 = sn11.N + (sn11.q - sn11.N) * (double)float3;
			double double16 = sn11.O + (sn11.r - sn11.O) * (double)float3;
			bsk.b = double12;
			bsk.c = double14;
			bsk.d = double16;
			this.j.a(double12, double14, double16);
			this.h.o.i();
			this.k.C.c("global");
			List<sn> list18 = this.k.J();
			this.R = list18.size();

			for (int integer19 = 0; integer19 < this.k.j.size(); integer19++) {
				sn sn20 = (sn)this.k.j.get(integer19);
				this.S++;
				if (sn20.g(double5, double7, double9)) {
					this.j.a(sn20, float3, false);
				}
			}

			this.k.C.c("entities");
			List<sn> list19 = Lists.newArrayList();
			List<sn> list20 = Lists.newArrayList();
			co.b b21 = co.b.s();

			for (bqm.a a23 : this.m) {
				auo auo24 = this.k.f(a23.a.k());
				of<sn> of25 = auo24.t()[a23.a.k().q() / 16];
				if (!of25.isEmpty()) {
					for (sn sn27 : of25) {
						boolean boolean28 = this.j.a(sn27, btl, double5, double7, double9) || sn27.y(this.h.h);
						if (boolean28) {
							boolean boolean29 = this.h.aa() instanceof sw ? ((sw)this.h.aa()).cr() : false;
							if ((sn27 != this.h.aa() || this.h.u.as != 0 || boolean29) && (!(sn27.q >= 0.0) || !(sn27.q < 256.0) || this.k.e(b21.c(sn27)))) {
								this.S++;
								this.j.a(sn27, float3, false);
								if (this.a(sn27, sn11, btl)) {
									list19.add(sn27);
								}

								if (this.j.b(sn27)) {
									list20.add(sn27);
								}
							}
						}
					}
				}
			}

			b21.t();
			if (!list20.isEmpty()) {
				for (sn sn23 : list20) {
					this.j.a(sn23, float3);
				}
			}

			if (this.d() && (!list19.isEmpty() || this.ad)) {
				this.k.C.c("entityOutlines");
				this.A.f();
				this.ad = !list19.isEmpty();
				if (!list19.isEmpty()) {
					bqg.c(519);
					bqg.p();
					this.A.a(false);
					beq.a();
					this.j.c(true);

					for (int integer22 = 0; integer22 < list19.size(); integer22++) {
						this.j.a((sn)list19.get(integer22), float3, false);
					}

					this.j.c(false);
					beq.b();
					bqg.a(false);
					this.B.a(float3);
					bqg.f();
					bqg.a(true);
					bqg.o();
					bqg.m();
					bqg.h();
					bqg.c(515);
					bqg.k();
					bqg.e();
				}

				this.h.b().a(false);
			}

			this.k.C.c("blockentities");
			beq.b();

			for (bqm.a a23x : this.m) {
				List<asc> list24 = a23x.a.h().b();
				if (!list24.isEmpty()) {
					for (asc asc26 : list24) {
						bsk.a.a(asc26, float3, -1);
					}
				}
			}

			synchronized (this.n) {
				for (asc asc24 : this.n) {
					bsk.a.a(asc24, float3, -1);
				}
			}

			this.u();

			for (lp lp23 : this.x.values()) {
				co co24 = lp23.b();
				if (this.k.o(co24).v().l()) {
					asc asc25 = this.k.r(co24);
					if (asc25 instanceof ase) {
						ase ase26 = (ase)asc25;
						if (ase26.h != null) {
							co24 = co24.a(cv.WEST);
							asc25 = this.k.r(co24);
						} else if (ase26.f != null) {
							co24 = co24.a(cv.NORTH);
							asc25 = this.k.r(co24);
						}
					}

					atl atl26 = this.k.o(co24);
					if (asc25 != null && atl26.i()) {
						bsk.a.a(asc25, float3, lp23.c());
					}
				}
			}

			this.v();
			this.h.o.h();
			this.h.B.b();
		}
	}

	private boolean a(sn sn1, sn sn2, btl btl) {
		boolean boolean5 = sn2 instanceof sw && ((sw)sn2).cr();
		if (sn1 == sn2 && this.h.u.as == 0 && !boolean5) {
			return false;
		} else if (sn1.aO()) {
			return true;
		} else {
			return this.h.h.y() && this.h.u.am.e() && sn1 instanceof aay ? sn1.ah || btl.a(sn1.bo()) || sn1.y(this.h.h) : false;
		}
	}

	public String f() {
		int integer2 = this.o.f.length;
		int integer3 = this.g();
		return String.format("C: %d/%d %sD: %d, L: %d, %s", integer3, integer2, this.h.H ? "(s) " : "", this.P, this.ae.size(), this.N == null ? "null" : this.N.a());
	}

	protected int g() {
		int integer2 = 0;

		for (bqm.a a4 : this.m) {
			btb btb5 = a4.a.b;
			if (btb5 != btb.a && !btb5.a()) {
				integer2++;
			}
		}

		return integer2;
	}

	public String h() {
		return "E: " + this.S + "/" + this.R + ", B: " + this.T;
	}

	public void a(sn sn, double double2, btl btl, int integer, boolean boolean5) {
		if (this.h.u.d != this.P) {
			this.a();
		}

		this.k.C.a("camera");
		double double8 = sn.p - this.C;
		double double10 = sn.q - this.D;
		double double12 = sn.r - this.E;
		if (this.F != sn.ab || this.G != sn.ac || this.H != sn.ad || double8 * double8 + double10 * double10 + double12 * double12 > 16.0) {
			this.C = sn.p;
			this.D = sn.q;
			this.E = sn.r;
			this.F = sn.ab;
			this.G = sn.ac;
			this.H = sn.ad;
			this.o.a(sn.p, sn.r);
		}

		this.k.C.c("renderlistcamera");
		double double14 = sn.M + (sn.p - sn.M) * double2;
		double double16 = sn.N + (sn.q - sn.N) * double2;
		double double18 = sn.O + (sn.r - sn.O) * double2;
		this.O.a(double14, double16, double18);
		this.k.C.c("cull");
		if (this.V != null) {
			btn btn20 = new btn(this.V);
			btn20.a(this.X.a, this.X.b, this.X.c);
			btl = btn20;
		}

		this.h.B.c("culling");
		co co20 = new co(double14, double16 + (double)sn.bq(), double18);
		bte bte21 = this.o.a(co20);
		co co22 = new co(ot.c(double14 / 16.0) * 16, ot.c(double16 / 16.0) * 16, ot.c(double18 / 16.0) * 16);
		this.ac = this.ac || !this.l.isEmpty() || sn.p != this.I || sn.q != this.J || sn.r != this.K || (double)sn.w != this.L || (double)sn.v != this.M;
		this.I = sn.p;
		this.J = sn.q;
		this.K = sn.r;
		this.L = (double)sn.w;
		this.M = (double)sn.v;
		boolean boolean23 = this.V != null;
		this.h.B.c("update");
		if (!boolean23 && this.ac) {
			this.ac = false;
			this.m = Lists.newArrayList();
			Queue<bqm.a> queue24 = Queues.newArrayDeque();
			sn.b(ot.a((double)this.h.u.d / 8.0, 1.0, 2.5));
			boolean boolean25 = this.h.H;
			if (bte21 != null) {
				boolean boolean26 = false;
				bqm.a a27 = new bqm.a(bte21, null, 0);
				Set<cv> set28 = this.b(co20);
				if (set28.size() == 1) {
					Vector3f vector3f29 = this.a(sn, double2);
					cv cv30 = cv.a(vector3f29.x, vector3f29.y, vector3f29.z).d();
					set28.remove(cv30);
				}

				if (set28.isEmpty()) {
					boolean26 = true;
				}

				if (boolean26 && !boolean5) {
					this.m.add(a27);
				} else {
					if (boolean5 && this.k.o(co20).q()) {
						boolean25 = false;
					}

					bte21.a(integer);
					queue24.add(a27);
				}
			} else {
				int integer26 = co20.q() > 0 ? 248 : 8;

				for (int integer27 = -this.P; integer27 <= this.P; integer27++) {
					for (int integer28 = -this.P; integer28 <= this.P; integer28++) {
						bte bte29 = this.o.a(new co((integer27 << 4) + 8, integer26, (integer28 << 4) + 8));
						if (bte29 != null && btl.a(bte29.c)) {
							bte29.a(integer);
							queue24.add(new bqm.a(bte29, null, 0));
						}
					}
				}
			}

			this.h.B.a("iteration");

			while (!queue24.isEmpty()) {
				bqm.a a26 = (bqm.a)queue24.poll();
				bte bte27 = a26.a;
				cv cv28 = a26.b;
				this.m.add(a26);

				for (cv cv32 : cv.values()) {
					bte bte33 = this.a(co22, bte27, cv32);
					if ((!boolean25 || !a26.a(cv32.d())) && (!boolean25 || cv28 == null || bte27.h().a(cv28.d(), cv32)) && bte33 != null && bte33.a(integer) && btl.a(bte33.c)
						)
					 {
						bqm.a a34 = new bqm.a(bte33, cv32, a26.d + 1);
						a34.a(a26.c, cv32);
						queue24.add(a34);
					}
				}
			}

			this.h.B.b();
		}

		this.h.B.c("captureFrustum");
		if (this.U) {
			this.a(double14, double16, double18);
			this.U = false;
		}

		this.h.B.c("rebuildNear");
		Set<bte> set24 = this.l;
		this.l = Sets.newLinkedHashSet();

		for (bqm.a a26 : this.m) {
			bte bte27 = a26.a;
			if (bte27.n() || set24.contains(bte27)) {
				this.ac = true;
				co co28 = bte27.k().a(8, 8, 8);
				boolean boolean29 = co28.n(co20) < 768.0;
				if (!bte27.o() && !boolean29) {
					this.l.add(bte27);
				} else {
					this.h.B.a("build near");
					this.N.b(bte27);
					bte27.m();
					this.h.B.b();
				}
			}
		}

		this.l.addAll(set24);
		this.h.B.b();
	}

	private Set<cv> b(co co) {
		bth bth3 = new bth();
		co co4 = new co(co.p() >> 4 << 4, co.q() >> 4 << 4, co.r() >> 4 << 4);
		auo auo5 = this.k.f(co4);

		for (co.a a7 : co.b(co4, co4.a(15, 15, 15))) {
			if (auo5.a(a7).q()) {
				bth3.a(a7);
			}
		}

		return bth3.b(co);
	}

	@Nullable
	private bte a(co co, bte bte, cv cv) {
		co co5 = bte.a(cv);
		if (ot.a(co.p() - co5.p()) > this.P * 16) {
			return null;
		} else if (co5.q() < 0 || co5.q() >= 256) {
			return null;
		} else {
			return ot.a(co.r() - co5.r()) > this.P * 16 ? null : this.o.a(co5);
		}
	}

	private void a(double double1, double double2, double double3) {
		this.V = new btm();
		((btm)this.V).b();
		ccx ccx8 = new ccx(this.V.c);
		ccx8.transpose();
		ccx ccx9 = new ccx(this.V.b);
		ccx9.transpose();
		ccx ccx10 = new ccx();
		ccx.mul(ccx9, ccx8, ccx10);
		ccx10.invert();
		this.X.a = double1;
		this.X.b = double2;
		this.X.c = double3;
		this.W[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
		this.W[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
		this.W[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
		this.W[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
		this.W[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
		this.W[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
		this.W[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.W[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);

		for (int integer11 = 0; integer11 < 8; integer11++) {
			ccx.transform(ccx10, this.W[integer11], this.W[integer11]);
			this.W[integer11].x = this.W[integer11].x / this.W[integer11].w;
			this.W[integer11].y = this.W[integer11].y / this.W[integer11].w;
			this.W[integer11].z = this.W[integer11].z / this.W[integer11].w;
			this.W[integer11].w = 1.0F;
		}
	}

	protected Vector3f a(sn sn, double double2) {
		float float5 = (float)((double)sn.y + (double)(sn.w - sn.y) * double2);
		float float6 = (float)((double)sn.x + (double)(sn.v - sn.x) * double2);
		if (bes.z().u.as == 2) {
			float5 += 180.0F;
		}

		float float7 = ot.b(-float6 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float8 = ot.a(-float6 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float9 = -ot.b(-float5 * (float) (Math.PI / 180.0));
		float float10 = ot.a(-float5 * (float) (Math.PI / 180.0));
		return new Vector3f(float8 * float9, float10, float7 * float9);
	}

	public int a(ajk ajk, double double2, int integer, sn sn) {
		beq.a();
		if (ajk == ajk.TRANSLUCENT) {
			this.h.B.a("translucent_sort");
			double double7 = sn.p - this.Z;
			double double9 = sn.q - this.aa;
			double double11 = sn.r - this.ab;
			if (double7 * double7 + double9 * double9 + double11 * double11 > 1.0) {
				this.Z = sn.p;
				this.aa = sn.q;
				this.ab = sn.r;
				int integer13 = 0;

				for (bqm.a a15 : this.m) {
					if (a15.a.b.d(ajk) && integer13++ < 15) {
						this.N.c(a15.a);
					}
				}
			}

			this.h.B.b();
		}

		this.h.B.a("filterempty");
		int integer7 = 0;
		boolean boolean8 = ajk == ajk.TRANSLUCENT;
		int integer9 = boolean8 ? this.m.size() - 1 : 0;
		int integer10 = boolean8 ? -1 : this.m.size();
		int integer11 = boolean8 ? -1 : 1;

		for (int integer12 = integer9; integer12 != integer10; integer12 += integer11) {
			bte bte13 = ((bqm.a)this.m.get(integer12)).a;
			if (!bte13.h().b(ajk)) {
				integer7++;
				this.O.a(bte13, ajk);
			}
		}

		this.h.B.c("render_" + ajk);
		this.a(ajk);
		this.h.B.b();
		return integer7;
	}

	private void a(ajk ajk) {
		this.h.o.i();
		if (cdb.f()) {
			bqg.q(32884);
			cdb.l(cdb.q);
			bqg.q(32888);
			cdb.l(cdb.r);
			bqg.q(32888);
			cdb.l(cdb.q);
			bqg.q(32886);
		}

		this.O.a(ajk);
		if (cdb.f()) {
			for (bzk bzk5 : bzh.a.h()) {
				bzk.b b6 = bzk5.b();
				int integer7 = bzk5.d();
				switch (b6) {
					case POSITION:
						bqg.p(32884);
						break;
					case UV:
						cdb.l(cdb.q + integer7);
						bqg.p(32888);
						cdb.l(cdb.q);
						break;
					case COLOR:
						bqg.p(32886);
						bqg.I();
				}
			}
		}

		this.h.o.h();
	}

	private void a(Iterator<lp> iterator) {
		while (iterator.hasNext()) {
			lp lp3 = (lp)iterator.next();
			int integer4 = lp3.d();
			if (this.w - integer4 > 400) {
				iterator.remove();
			}
		}
	}

	public void k() {
		this.w++;
		if (this.w % 20 == 0) {
			this.a(this.x.values().iterator());
		}

		if (!this.ae.isEmpty() && !this.N.h() && this.l.isEmpty()) {
			Iterator<co> iterator2 = this.ae.iterator();

			while (iterator2.hasNext()) {
				co co3 = (co)iterator2.next();
				iterator2.remove();
				int integer4 = co3.p();
				int integer5 = co3.q();
				int integer6 = co3.r();
				this.a(integer4 - 1, integer5 - 1, integer6 - 1, integer4 + 1, integer5 + 1, integer6 + 1, false);
			}
		}
	}

	private void t() {
		bqg.p();
		bqg.d();
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		beq.a();
		bqg.a(false);
		this.i.a(f);
		bqs bqs2 = bqs.a();
		bpy bpy3 = bqs2.c();

		for (int integer4 = 0; integer4 < 6; integer4++) {
			bqg.G();
			if (integer4 == 1) {
				bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
			}

			if (integer4 == 2) {
				bqg.b(-90.0F, 1.0F, 0.0F, 0.0F);
			}

			if (integer4 == 3) {
				bqg.b(180.0F, 1.0F, 0.0F, 0.0F);
			}

			if (integer4 == 4) {
				bqg.b(90.0F, 0.0F, 0.0F, 1.0F);
			}

			if (integer4 == 5) {
				bqg.b(-90.0F, 0.0F, 0.0F, 1.0F);
			}

			bpy3.a(7, bzh.i);
			bpy3.b(-100.0, -100.0, -100.0).a(0.0, 0.0).b(40, 40, 40, 255).d();
			bpy3.b(-100.0, -100.0, 100.0).a(0.0, 16.0).b(40, 40, 40, 255).d();
			bpy3.b(100.0, -100.0, 100.0).a(16.0, 16.0).b(40, 40, 40, 255).d();
			bpy3.b(100.0, -100.0, -100.0).a(16.0, 0.0).b(40, 40, 40, 255).d();
			bqs2.b();
			bqg.H();
		}

		bqg.a(true);
		bqg.y();
		bqg.e();
	}

	public void a(float float1, int integer) {
		if (this.h.f.s.q().a() == 1) {
			this.t();
		} else if (this.h.f.s.d()) {
			bqg.z();
			bdw bdw4 = this.k.a(this.h.aa(), float1);
			float float5 = (float)bdw4.b;
			float float6 = (float)bdw4.c;
			float float7 = (float)bdw4.d;
			if (integer != 2) {
				float float8 = (float5 * 30.0F + float6 * 59.0F + float7 * 11.0F) / 100.0F;
				float float9 = (float5 * 30.0F + float6 * 70.0F) / 100.0F;
				float float10 = (float5 * 30.0F + float7 * 70.0F) / 100.0F;
				float5 = float8;
				float6 = float9;
				float7 = float10;
			}

			bqg.d(float5, float6, float7);
			bqs bqs8 = bqs.a();
			bpy bpy9 = bqs8.c();
			bqg.a(false);
			bqg.o();
			bqg.d(float5, float6, float7);
			if (this.Y) {
				this.u.a();
				bqg.q(32884);
				bqg.d(3, 5126, 12, 0);
				this.u.a(7);
				this.u.b();
				bqg.p(32884);
			} else {
				bqg.s(this.q);
			}

			bqg.p();
			bqg.d();
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
			beq.a();
			float[] arr10 = this.k.s.a(this.k.c(float1), float1);
			if (arr10 != null) {
				bqg.z();
				bqg.j(7425);
				bqg.G();
				bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(ot.a(this.k.d(float1)) < 0.0F ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
				bqg.b(90.0F, 0.0F, 0.0F, 1.0F);
				float float11 = arr10[0];
				float float12 = arr10[1];
				float float13 = arr10[2];
				if (integer != 2) {
					float float14 = (float11 * 30.0F + float12 * 59.0F + float13 * 11.0F) / 100.0F;
					float float15 = (float11 * 30.0F + float12 * 70.0F) / 100.0F;
					float float16 = (float11 * 30.0F + float13 * 70.0F) / 100.0F;
					float11 = float14;
					float12 = float15;
					float13 = float16;
				}

				bpy9.a(6, bzh.f);
				bpy9.b(0.0, 100.0, 0.0).a(float11, float12, float13, arr10[3]).d();
				int integer14 = 16;

				for (int integer15 = 0; integer15 <= 16; integer15++) {
					float float16 = (float)integer15 * (float) (Math.PI * 2) / 16.0F;
					float float17 = ot.a(float16);
					float float18 = ot.b(float16);
					bpy9.b((double)(float17 * 120.0F), (double)(float18 * 120.0F), (double)(-float18 * 40.0F * arr10[3])).a(arr10[0], arr10[1], arr10[2], 0.0F).d();
				}

				bqs8.b();
				bqg.H();
				bqg.j(7424);
			}

			bqg.y();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE, bqg.r.ONE, bqg.l.ZERO);
			bqg.G();
			float float11 = 1.0F - this.k.j(float1);
			bqg.c(1.0F, 1.0F, 1.0F, float11);
			bqg.b(-90.0F, 0.0F, 1.0F, 0.0F);
			bqg.b(this.k.c(float1) * 360.0F, 1.0F, 0.0F, 0.0F);
			float float12 = 30.0F;
			this.i.a(d);
			bpy9.a(7, bzh.g);
			bpy9.b((double)(-float12), 100.0, (double)(-float12)).a(0.0, 0.0).d();
			bpy9.b((double)float12, 100.0, (double)(-float12)).a(1.0, 0.0).d();
			bpy9.b((double)float12, 100.0, (double)float12).a(1.0, 1.0).d();
			bpy9.b((double)(-float12), 100.0, (double)float12).a(0.0, 1.0).d();
			bqs8.b();
			float12 = 20.0F;
			this.i.a(c);
			int integer13 = this.k.D();
			int integer14 = integer13 % 4;
			int integer15 = integer13 / 4 % 2;
			float float16 = (float)(integer14 + 0) / 4.0F;
			float float17 = (float)(integer15 + 0) / 2.0F;
			float float18 = (float)(integer14 + 1) / 4.0F;
			float float19 = (float)(integer15 + 1) / 2.0F;
			bpy9.a(7, bzh.g);
			bpy9.b((double)(-float12), -100.0, (double)float12).a((double)float18, (double)float19).d();
			bpy9.b((double)float12, -100.0, (double)float12).a((double)float16, (double)float19).d();
			bpy9.b((double)float12, -100.0, (double)(-float12)).a((double)float16, (double)float17).d();
			bpy9.b((double)(-float12), -100.0, (double)(-float12)).a((double)float18, (double)float17).d();
			bqs8.b();
			bqg.z();
			float float20 = this.k.g(float1) * float11;
			if (float20 > 0.0F) {
				bqg.c(float20, float20, float20, float20);
				if (this.Y) {
					this.t.a();
					bqg.q(32884);
					bqg.d(3, 5126, 12, 0);
					this.t.a(7);
					this.t.b();
					bqg.p(32884);
				} else {
					bqg.s(this.p);
				}
			}

			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.l();
			bqg.e();
			bqg.o();
			bqg.H();
			bqg.z();
			bqg.d(0.0F, 0.0F, 0.0F);
			double double11 = this.h.h.g(float1).c - this.k.ab();
			if (double11 < 0.0) {
				bqg.G();
				bqg.c(0.0F, 12.0F, 0.0F);
				if (this.Y) {
					this.v.a();
					bqg.q(32884);
					bqg.d(3, 5126, 12, 0);
					this.v.a(7);
					this.v.b();
					bqg.p(32884);
				} else {
					bqg.s(this.r);
				}

				bqg.H();
				float float13 = 1.0F;
				float float14 = -((float)(double11 + 65.0));
				float float15 = -1.0F;
				bpy9.a(7, bzh.f);
				bpy9.b(-1.0, (double)float14, 1.0).b(0, 0, 0, 255).d();
				bpy9.b(1.0, (double)float14, 1.0).b(0, 0, 0, 255).d();
				bpy9.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
				bpy9.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
				bpy9.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
				bpy9.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
				bpy9.b(1.0, (double)float14, -1.0).b(0, 0, 0, 255).d();
				bpy9.b(-1.0, (double)float14, -1.0).b(0, 0, 0, 255).d();
				bpy9.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
				bpy9.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
				bpy9.b(1.0, (double)float14, 1.0).b(0, 0, 0, 255).d();
				bpy9.b(1.0, (double)float14, -1.0).b(0, 0, 0, 255).d();
				bpy9.b(-1.0, (double)float14, -1.0).b(0, 0, 0, 255).d();
				bpy9.b(-1.0, (double)float14, 1.0).b(0, 0, 0, 255).d();
				bpy9.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
				bpy9.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
				bpy9.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
				bpy9.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
				bpy9.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
				bpy9.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
				bqs8.b();
			}

			if (this.k.s.g()) {
				bqg.d(float5 * 0.2F + 0.04F, float6 * 0.2F + 0.04F, float7 * 0.6F + 0.1F);
			} else {
				bqg.d(float5, float6, float7);
			}

			bqg.G();
			bqg.c(0.0F, -((float)(double11 - 16.0)), 0.0F);
			bqg.s(this.r);
			bqg.H();
			bqg.y();
			bqg.a(true);
		}
	}

	public void a(float float1, int integer, double double3, double double4, double double5) {
		if (this.h.f.s.d()) {
			if (this.h.u.e() == 2) {
				this.b(float1, integer, double3, double4, double5);
			} else {
				bqg.r();
				int integer10 = 32;
				int integer11 = 8;
				bqs bqs12 = bqs.a();
				bpy bpy13 = bqs12.c();
				this.i.a(e);
				bqg.m();
				bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
				bdw bdw14 = this.k.e(float1);
				float float15 = (float)bdw14.b;
				float float16 = (float)bdw14.c;
				float float17 = (float)bdw14.d;
				if (integer != 2) {
					float float18 = (float15 * 30.0F + float16 * 59.0F + float17 * 11.0F) / 100.0F;
					float float19 = (float15 * 30.0F + float16 * 70.0F) / 100.0F;
					float float20 = (float15 * 30.0F + float17 * 70.0F) / 100.0F;
					float15 = float18;
					float16 = float19;
					float17 = float20;
				}

				float float18 = 4.8828125E-4F;
				double double19 = (double)((float)this.w + float1);
				double double21 = double3 + double19 * 0.03F;
				int integer25 = ot.c(double21 / 2048.0);
				int integer26 = ot.c(double5 / 2048.0);
				double21 -= (double)(integer25 * 2048);
				double double23 = double5 - (double)(integer26 * 2048);
				float float27 = this.k.s.f() - (float)double4 + 0.33F;
				float float28 = (float)(double21 * 4.8828125E-4);
				float float29 = (float)(double23 * 4.8828125E-4);
				bpy13.a(7, bzh.i);

				for (int integer30 = -256; integer30 < 256; integer30 += 32) {
					for (int integer31 = -256; integer31 < 256; integer31 += 32) {
						bpy13.b((double)(integer30 + 0), (double)float27, (double)(integer31 + 32))
							.a((double)((float)(integer30 + 0) * 4.8828125E-4F + float28), (double)((float)(integer31 + 32) * 4.8828125E-4F + float29))
							.a(float15, float16, float17, 0.8F)
							.d();
						bpy13.b((double)(integer30 + 32), (double)float27, (double)(integer31 + 32))
							.a((double)((float)(integer30 + 32) * 4.8828125E-4F + float28), (double)((float)(integer31 + 32) * 4.8828125E-4F + float29))
							.a(float15, float16, float17, 0.8F)
							.d();
						bpy13.b((double)(integer30 + 32), (double)float27, (double)(integer31 + 0))
							.a((double)((float)(integer30 + 32) * 4.8828125E-4F + float28), (double)((float)(integer31 + 0) * 4.8828125E-4F + float29))
							.a(float15, float16, float17, 0.8F)
							.d();
						bpy13.b((double)(integer30 + 0), (double)float27, (double)(integer31 + 0))
							.a((double)((float)(integer30 + 0) * 4.8828125E-4F + float28), (double)((float)(integer31 + 0) * 4.8828125E-4F + float29))
							.a(float15, float16, float17, 0.8F)
							.d();
					}
				}

				bqs12.b();
				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				bqg.l();
				bqg.q();
			}
		}
	}

	public boolean a(double double1, double double2, double double3, float float4) {
		return false;
	}

	private void b(float float1, int integer, double double3, double double4, double double5) {
		bqg.r();
		bqs bqs10 = bqs.a();
		bpy bpy11 = bqs10.c();
		float float12 = 12.0F;
		float float13 = 4.0F;
		double double14 = (double)((float)this.w + float1);
		double double16 = (double3 + double14 * 0.03F) / 12.0;
		double double18 = double5 / 12.0 + 0.33F;
		float float20 = this.k.s.f() - (float)double4 + 0.33F;
		int integer21 = ot.c(double16 / 2048.0);
		int integer22 = ot.c(double18 / 2048.0);
		double16 -= (double)(integer21 * 2048);
		double18 -= (double)(integer22 * 2048);
		this.i.a(e);
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bdw bdw23 = this.k.e(float1);
		float float24 = (float)bdw23.b;
		float float25 = (float)bdw23.c;
		float float26 = (float)bdw23.d;
		if (integer != 2) {
			float float27 = (float24 * 30.0F + float25 * 59.0F + float26 * 11.0F) / 100.0F;
			float float28 = (float24 * 30.0F + float25 * 70.0F) / 100.0F;
			float float29 = (float24 * 30.0F + float26 * 70.0F) / 100.0F;
			float24 = float27;
			float25 = float28;
			float26 = float29;
		}

		float float27 = float24 * 0.9F;
		float float28 = float25 * 0.9F;
		float float29 = float26 * 0.9F;
		float float30 = float24 * 0.7F;
		float float31 = float25 * 0.7F;
		float float32 = float26 * 0.7F;
		float float33 = float24 * 0.8F;
		float float34 = float25 * 0.8F;
		float float35 = float26 * 0.8F;
		float float36 = 0.00390625F;
		float float37 = (float)ot.c(double16) * 0.00390625F;
		float float38 = (float)ot.c(double18) * 0.00390625F;
		float float39 = (float)(double16 - (double)ot.c(double16));
		float float40 = (float)(double18 - (double)ot.c(double18));
		int integer41 = 8;
		int integer42 = 4;
		float float43 = 9.765625E-4F;
		bqg.b(12.0F, 1.0F, 12.0F);

		for (int integer44 = 0; integer44 < 2; integer44++) {
			if (integer44 == 0) {
				bqg.a(false, false, false, false);
			} else {
				switch (integer) {
					case 0:
						bqg.a(false, true, true, true);
						break;
					case 1:
						bqg.a(true, false, false, true);
						break;
					case 2:
						bqg.a(true, true, true, true);
				}
			}

			for (int integer45 = -3; integer45 <= 4; integer45++) {
				for (int integer46 = -3; integer46 <= 4; integer46++) {
					bpy11.a(7, bzh.l);
					float float47 = (float)(integer45 * 8);
					float float48 = (float)(integer46 * 8);
					float float49 = float47 - float39;
					float float50 = float48 - float40;
					if (float20 > -5.0F) {
						bpy11.b((double)(float49 + 0.0F), (double)(float20 + 0.0F), (double)(float50 + 8.0F))
							.a((double)((float47 + 0.0F) * 0.00390625F + float37), (double)((float48 + 8.0F) * 0.00390625F + float38))
							.a(float30, float31, float32, 0.8F)
							.c(0.0F, -1.0F, 0.0F)
							.d();
						bpy11.b((double)(float49 + 8.0F), (double)(float20 + 0.0F), (double)(float50 + 8.0F))
							.a((double)((float47 + 8.0F) * 0.00390625F + float37), (double)((float48 + 8.0F) * 0.00390625F + float38))
							.a(float30, float31, float32, 0.8F)
							.c(0.0F, -1.0F, 0.0F)
							.d();
						bpy11.b((double)(float49 + 8.0F), (double)(float20 + 0.0F), (double)(float50 + 0.0F))
							.a((double)((float47 + 8.0F) * 0.00390625F + float37), (double)((float48 + 0.0F) * 0.00390625F + float38))
							.a(float30, float31, float32, 0.8F)
							.c(0.0F, -1.0F, 0.0F)
							.d();
						bpy11.b((double)(float49 + 0.0F), (double)(float20 + 0.0F), (double)(float50 + 0.0F))
							.a((double)((float47 + 0.0F) * 0.00390625F + float37), (double)((float48 + 0.0F) * 0.00390625F + float38))
							.a(float30, float31, float32, 0.8F)
							.c(0.0F, -1.0F, 0.0F)
							.d();
					}

					if (float20 <= 5.0F) {
						bpy11.b((double)(float49 + 0.0F), (double)(float20 + 4.0F - 9.765625E-4F), (double)(float50 + 8.0F))
							.a((double)((float47 + 0.0F) * 0.00390625F + float37), (double)((float48 + 8.0F) * 0.00390625F + float38))
							.a(float24, float25, float26, 0.8F)
							.c(0.0F, 1.0F, 0.0F)
							.d();
						bpy11.b((double)(float49 + 8.0F), (double)(float20 + 4.0F - 9.765625E-4F), (double)(float50 + 8.0F))
							.a((double)((float47 + 8.0F) * 0.00390625F + float37), (double)((float48 + 8.0F) * 0.00390625F + float38))
							.a(float24, float25, float26, 0.8F)
							.c(0.0F, 1.0F, 0.0F)
							.d();
						bpy11.b((double)(float49 + 8.0F), (double)(float20 + 4.0F - 9.765625E-4F), (double)(float50 + 0.0F))
							.a((double)((float47 + 8.0F) * 0.00390625F + float37), (double)((float48 + 0.0F) * 0.00390625F + float38))
							.a(float24, float25, float26, 0.8F)
							.c(0.0F, 1.0F, 0.0F)
							.d();
						bpy11.b((double)(float49 + 0.0F), (double)(float20 + 4.0F - 9.765625E-4F), (double)(float50 + 0.0F))
							.a((double)((float47 + 0.0F) * 0.00390625F + float37), (double)((float48 + 0.0F) * 0.00390625F + float38))
							.a(float24, float25, float26, 0.8F)
							.c(0.0F, 1.0F, 0.0F)
							.d();
					}

					if (integer45 > -1) {
						for (int integer51 = 0; integer51 < 8; integer51++) {
							bpy11.b((double)(float49 + (float)integer51 + 0.0F), (double)(float20 + 0.0F), (double)(float50 + 8.0F))
								.a((double)((float47 + (float)integer51 + 0.5F) * 0.00390625F + float37), (double)((float48 + 8.0F) * 0.00390625F + float38))
								.a(float27, float28, float29, 0.8F)
								.c(-1.0F, 0.0F, 0.0F)
								.d();
							bpy11.b((double)(float49 + (float)integer51 + 0.0F), (double)(float20 + 4.0F), (double)(float50 + 8.0F))
								.a((double)((float47 + (float)integer51 + 0.5F) * 0.00390625F + float37), (double)((float48 + 8.0F) * 0.00390625F + float38))
								.a(float27, float28, float29, 0.8F)
								.c(-1.0F, 0.0F, 0.0F)
								.d();
							bpy11.b((double)(float49 + (float)integer51 + 0.0F), (double)(float20 + 4.0F), (double)(float50 + 0.0F))
								.a((double)((float47 + (float)integer51 + 0.5F) * 0.00390625F + float37), (double)((float48 + 0.0F) * 0.00390625F + float38))
								.a(float27, float28, float29, 0.8F)
								.c(-1.0F, 0.0F, 0.0F)
								.d();
							bpy11.b((double)(float49 + (float)integer51 + 0.0F), (double)(float20 + 0.0F), (double)(float50 + 0.0F))
								.a((double)((float47 + (float)integer51 + 0.5F) * 0.00390625F + float37), (double)((float48 + 0.0F) * 0.00390625F + float38))
								.a(float27, float28, float29, 0.8F)
								.c(-1.0F, 0.0F, 0.0F)
								.d();
						}
					}

					if (integer45 <= 1) {
						for (int integer51 = 0; integer51 < 8; integer51++) {
							bpy11.b((double)(float49 + (float)integer51 + 1.0F - 9.765625E-4F), (double)(float20 + 0.0F), (double)(float50 + 8.0F))
								.a((double)((float47 + (float)integer51 + 0.5F) * 0.00390625F + float37), (double)((float48 + 8.0F) * 0.00390625F + float38))
								.a(float27, float28, float29, 0.8F)
								.c(1.0F, 0.0F, 0.0F)
								.d();
							bpy11.b((double)(float49 + (float)integer51 + 1.0F - 9.765625E-4F), (double)(float20 + 4.0F), (double)(float50 + 8.0F))
								.a((double)((float47 + (float)integer51 + 0.5F) * 0.00390625F + float37), (double)((float48 + 8.0F) * 0.00390625F + float38))
								.a(float27, float28, float29, 0.8F)
								.c(1.0F, 0.0F, 0.0F)
								.d();
							bpy11.b((double)(float49 + (float)integer51 + 1.0F - 9.765625E-4F), (double)(float20 + 4.0F), (double)(float50 + 0.0F))
								.a((double)((float47 + (float)integer51 + 0.5F) * 0.00390625F + float37), (double)((float48 + 0.0F) * 0.00390625F + float38))
								.a(float27, float28, float29, 0.8F)
								.c(1.0F, 0.0F, 0.0F)
								.d();
							bpy11.b((double)(float49 + (float)integer51 + 1.0F - 9.765625E-4F), (double)(float20 + 0.0F), (double)(float50 + 0.0F))
								.a((double)((float47 + (float)integer51 + 0.5F) * 0.00390625F + float37), (double)((float48 + 0.0F) * 0.00390625F + float38))
								.a(float27, float28, float29, 0.8F)
								.c(1.0F, 0.0F, 0.0F)
								.d();
						}
					}

					if (integer46 > -1) {
						for (int integer51 = 0; integer51 < 8; integer51++) {
							bpy11.b((double)(float49 + 0.0F), (double)(float20 + 4.0F), (double)(float50 + (float)integer51 + 0.0F))
								.a((double)((float47 + 0.0F) * 0.00390625F + float37), (double)((float48 + (float)integer51 + 0.5F) * 0.00390625F + float38))
								.a(float33, float34, float35, 0.8F)
								.c(0.0F, 0.0F, -1.0F)
								.d();
							bpy11.b((double)(float49 + 8.0F), (double)(float20 + 4.0F), (double)(float50 + (float)integer51 + 0.0F))
								.a((double)((float47 + 8.0F) * 0.00390625F + float37), (double)((float48 + (float)integer51 + 0.5F) * 0.00390625F + float38))
								.a(float33, float34, float35, 0.8F)
								.c(0.0F, 0.0F, -1.0F)
								.d();
							bpy11.b((double)(float49 + 8.0F), (double)(float20 + 0.0F), (double)(float50 + (float)integer51 + 0.0F))
								.a((double)((float47 + 8.0F) * 0.00390625F + float37), (double)((float48 + (float)integer51 + 0.5F) * 0.00390625F + float38))
								.a(float33, float34, float35, 0.8F)
								.c(0.0F, 0.0F, -1.0F)
								.d();
							bpy11.b((double)(float49 + 0.0F), (double)(float20 + 0.0F), (double)(float50 + (float)integer51 + 0.0F))
								.a((double)((float47 + 0.0F) * 0.00390625F + float37), (double)((float48 + (float)integer51 + 0.5F) * 0.00390625F + float38))
								.a(float33, float34, float35, 0.8F)
								.c(0.0F, 0.0F, -1.0F)
								.d();
						}
					}

					if (integer46 <= 1) {
						for (int integer51 = 0; integer51 < 8; integer51++) {
							bpy11.b((double)(float49 + 0.0F), (double)(float20 + 4.0F), (double)(float50 + (float)integer51 + 1.0F - 9.765625E-4F))
								.a((double)((float47 + 0.0F) * 0.00390625F + float37), (double)((float48 + (float)integer51 + 0.5F) * 0.00390625F + float38))
								.a(float33, float34, float35, 0.8F)
								.c(0.0F, 0.0F, 1.0F)
								.d();
							bpy11.b((double)(float49 + 8.0F), (double)(float20 + 4.0F), (double)(float50 + (float)integer51 + 1.0F - 9.765625E-4F))
								.a((double)((float47 + 8.0F) * 0.00390625F + float37), (double)((float48 + (float)integer51 + 0.5F) * 0.00390625F + float38))
								.a(float33, float34, float35, 0.8F)
								.c(0.0F, 0.0F, 1.0F)
								.d();
							bpy11.b((double)(float49 + 8.0F), (double)(float20 + 0.0F), (double)(float50 + (float)integer51 + 1.0F - 9.765625E-4F))
								.a((double)((float47 + 8.0F) * 0.00390625F + float37), (double)((float48 + (float)integer51 + 0.5F) * 0.00390625F + float38))
								.a(float33, float34, float35, 0.8F)
								.c(0.0F, 0.0F, 1.0F)
								.d();
							bpy11.b((double)(float49 + 0.0F), (double)(float20 + 0.0F), (double)(float50 + (float)integer51 + 1.0F - 9.765625E-4F))
								.a((double)((float47 + 0.0F) * 0.00390625F + float37), (double)((float48 + (float)integer51 + 0.5F) * 0.00390625F + float38))
								.a(float33, float34, float35, 0.8F)
								.c(0.0F, 0.0F, 1.0F)
								.d();
						}
					}

					bqs10.b();
				}
			}
		}

		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.l();
		bqg.q();
	}

	public void a(long long1) {
		this.ac = this.ac | this.N.a(long1);
		if (!this.l.isEmpty()) {
			Iterator<bte> iterator4 = this.l.iterator();

			while (iterator4.hasNext()) {
				bte bte5 = (bte)iterator4.next();
				boolean boolean6;
				if (bte5.o()) {
					boolean6 = this.N.b(bte5);
				} else {
					boolean6 = this.N.a(bte5);
				}

				if (!boolean6) {
					break;
				}

				bte5.m();
				iterator4.remove();
				long long7 = long1 - System.nanoTime();
				if (long7 < 0L) {
					break;
				}
			}
		}
	}

	public void a(sn sn, float float2) {
		bqs bqs4 = bqs.a();
		bpy bpy5 = bqs4.c();
		auf auf6 = this.k.aj();
		double double7 = (double)(this.h.u.d * 16);
		if (!(sn.p < auf6.d() - double7) || !(sn.p > auf6.b() + double7) || !(sn.r < auf6.e() - double7) || !(sn.r > auf6.c() + double7)) {
			double double9 = 1.0 - auf6.a(sn) / double7;
			double9 = Math.pow(double9, 4.0);
			double double11 = sn.M + (sn.p - sn.M) * (double)float2;
			double double13 = sn.N + (sn.q - sn.N) * (double)float2;
			double double15 = sn.O + (sn.r - sn.O) * (double)float2;
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE, bqg.r.ONE, bqg.l.ZERO);
			this.i.a(g);
			bqg.a(false);
			bqg.G();
			int integer17 = auf6.a().a();
			float float18 = (float)(integer17 >> 16 & 0xFF) / 255.0F;
			float float19 = (float)(integer17 >> 8 & 0xFF) / 255.0F;
			float float20 = (float)(integer17 & 0xFF) / 255.0F;
			bqg.c(float18, float19, float20, (float)double9);
			bqg.a(-3.0F, -3.0F);
			bqg.s();
			bqg.a(516, 0.1F);
			bqg.e();
			bqg.r();
			float float21 = (float)(bes.I() % 3000L) / 3000.0F;
			float float22 = 0.0F;
			float float23 = 0.0F;
			float float24 = 128.0F;
			bpy5.a(7, bzh.g);
			bpy5.c(-double11, -double13, -double15);
			double double25 = Math.max((double)ot.c(double15 - double7), auf6.c());
			double double27 = Math.min((double)ot.f(double15 + double7), auf6.e());
			if (double11 > auf6.d() - double7) {
				float float29 = 0.0F;

				for (double double30 = double25; double30 < double27; float29 += 0.5F) {
					double double32 = Math.min(1.0, double27 - double30);
					float float34 = (float)double32 * 0.5F;
					bpy5.b(auf6.d(), 256.0, double30).a((double)(float21 + float29), (double)(float21 + 0.0F)).d();
					bpy5.b(auf6.d(), 256.0, double30 + double32).a((double)(float21 + float34 + float29), (double)(float21 + 0.0F)).d();
					bpy5.b(auf6.d(), 0.0, double30 + double32).a((double)(float21 + float34 + float29), (double)(float21 + 128.0F)).d();
					bpy5.b(auf6.d(), 0.0, double30).a((double)(float21 + float29), (double)(float21 + 128.0F)).d();
					double30++;
				}
			}

			if (double11 < auf6.b() + double7) {
				float float29 = 0.0F;

				for (double double30 = double25; double30 < double27; float29 += 0.5F) {
					double double32 = Math.min(1.0, double27 - double30);
					float float34 = (float)double32 * 0.5F;
					bpy5.b(auf6.b(), 256.0, double30).a((double)(float21 + float29), (double)(float21 + 0.0F)).d();
					bpy5.b(auf6.b(), 256.0, double30 + double32).a((double)(float21 + float34 + float29), (double)(float21 + 0.0F)).d();
					bpy5.b(auf6.b(), 0.0, double30 + double32).a((double)(float21 + float34 + float29), (double)(float21 + 128.0F)).d();
					bpy5.b(auf6.b(), 0.0, double30).a((double)(float21 + float29), (double)(float21 + 128.0F)).d();
					double30++;
				}
			}

			double25 = Math.max((double)ot.c(double11 - double7), auf6.b());
			double27 = Math.min((double)ot.f(double11 + double7), auf6.d());
			if (double15 > auf6.e() - double7) {
				float float29 = 0.0F;

				for (double double30 = double25; double30 < double27; float29 += 0.5F) {
					double double32 = Math.min(1.0, double27 - double30);
					float float34 = (float)double32 * 0.5F;
					bpy5.b(double30, 256.0, auf6.e()).a((double)(float21 + float29), (double)(float21 + 0.0F)).d();
					bpy5.b(double30 + double32, 256.0, auf6.e()).a((double)(float21 + float34 + float29), (double)(float21 + 0.0F)).d();
					bpy5.b(double30 + double32, 0.0, auf6.e()).a((double)(float21 + float34 + float29), (double)(float21 + 128.0F)).d();
					bpy5.b(double30, 0.0, auf6.e()).a((double)(float21 + float29), (double)(float21 + 128.0F)).d();
					double30++;
				}
			}

			if (double15 < auf6.c() + double7) {
				float float29 = 0.0F;

				for (double double30 = double25; double30 < double27; float29 += 0.5F) {
					double double32 = Math.min(1.0, double27 - double30);
					float float34 = (float)double32 * 0.5F;
					bpy5.b(double30, 256.0, auf6.c()).a((double)(float21 + float29), (double)(float21 + 0.0F)).d();
					bpy5.b(double30 + double32, 256.0, auf6.c()).a((double)(float21 + float34 + float29), (double)(float21 + 0.0F)).d();
					bpy5.b(double30 + double32, 0.0, auf6.c()).a((double)(float21 + float34 + float29), (double)(float21 + 128.0F)).d();
					bpy5.b(double30, 0.0, auf6.c()).a((double)(float21 + float29), (double)(float21 + 128.0F)).d();
					double30++;
				}
			}

			bqs4.b();
			bpy5.c(0.0, 0.0, 0.0);
			bqg.q();
			bqg.d();
			bqg.a(0.0F, 0.0F);
			bqg.t();
			bqg.e();
			bqg.l();
			bqg.H();
			bqg.a(true);
		}
	}

	private void u() {
		bqg.a(bqg.r.DST_COLOR, bqg.l.SRC_COLOR, bqg.r.ONE, bqg.l.ZERO);
		bqg.m();
		bqg.c(1.0F, 1.0F, 1.0F, 0.5F);
		bqg.a(-3.0F, -3.0F);
		bqg.s();
		bqg.a(516, 0.1F);
		bqg.e();
		bqg.G();
	}

	private void v() {
		bqg.d();
		bqg.a(0.0F, 0.0F);
		bqg.t();
		bqg.e();
		bqg.a(true);
		bqg.H();
	}

	public void a(bqs bqs, bpy bpy, sn sn, float float4) {
		double double6 = sn.M + (sn.p - sn.M) * (double)float4;
		double double8 = sn.N + (sn.q - sn.N) * (double)float4;
		double double10 = sn.O + (sn.r - sn.O) * (double)float4;
		if (!this.x.isEmpty()) {
			this.i.a(byy.g);
			this.u();
			bpy.a(7, bzh.a);
			bpy.c(-double6, -double8, -double10);
			bpy.c();
			Iterator<lp> iterator12 = this.x.values().iterator();

			while (iterator12.hasNext()) {
				lp lp13 = (lp)iterator12.next();
				co co14 = lp13.b();
				double double15 = (double)co14.p() - double6;
				double double17 = (double)co14.q() - double8;
				double double19 = (double)co14.r() - double10;
				alu alu21 = this.k.o(co14).v();
				if (!(alu21 instanceof amg) && !(alu21 instanceof anh) && !(alu21 instanceof aqo) && !(alu21 instanceof aqp)) {
					if (double15 * double15 + double17 * double17 + double19 * double19 > 1024.0) {
						iterator12.remove();
					} else {
						atl atl22 = this.k.o(co14);
						if (atl22.a() != azs.a) {
							int integer23 = lp13.c();
							byz byz24 = this.z[integer23];
							bra bra25 = this.h.ab();
							bra25.a(atl22, co14, byz24, this.k);
						}
					}
				}
			}

			bqs.b();
			bpy.c(0.0, 0.0, 0.0);
			this.v();
		}
	}

	public void a(aay aay, bdu bdu, int integer, float float4) {
		if (integer == 0 && bdu.a == bdu.a.BLOCK) {
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
			bqg.d(2.0F);
			bqg.z();
			bqg.a(false);
			co co6 = bdu.a();
			atl atl7 = this.k.o(co6);
			if (atl7.a() != azs.a && this.k.aj().a(co6)) {
				double double8 = aay.M + (aay.p - aay.M) * (double)float4;
				double double10 = aay.N + (aay.q - aay.N) * (double)float4;
				double double12 = aay.O + (aay.r - aay.O) * (double)float4;
				a(atl7.c(this.k, co6).g(0.002F).d(-double8, -double10, -double12), 0.0F, 0.0F, 0.0F, 0.4F);
			}

			bqg.a(true);
			bqg.y();
			bqg.l();
		}
	}

	public static void a(bdt bdt, float float2, float float3, float float4, float float5) {
		a(bdt.a, bdt.b, bdt.c, bdt.d, bdt.e, bdt.f, float2, float3, float4, float5);
	}

	public static void a(
		double double1, double double2, double double3, double double4, double double5, double double6, float float7, float float8, float float9, float float10
	) {
		bqs bqs17 = bqs.a();
		bpy bpy18 = bqs17.c();
		bpy18.a(3, bzh.f);
		a(bpy18, double1, double2, double3, double4, double5, double6, float7, float8, float9, float10);
		bqs17.b();
	}

	public static void a(
		bpy bpy,
		double double2,
		double double3,
		double double4,
		double double5,
		double double6,
		double double7,
		float float8,
		float float9,
		float float10,
		float float11
	) {
		bpy.b(double2, double3, double4).a(float8, float9, float10, 0.0F).d();
		bpy.b(double2, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double5, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double5, double3, double7).a(float8, float9, float10, float11).d();
		bpy.b(double2, double3, double7).a(float8, float9, float10, float11).d();
		bpy.b(double2, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double6, double4).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double4).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double7).a(float8, float9, float10, float11).d();
		bpy.b(double2, double6, double7).a(float8, float9, float10, float11).d();
		bpy.b(double2, double6, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double6, double7).a(float8, float9, float10, 0.0F).d();
		bpy.b(double2, double3, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double7).a(float8, float9, float10, 0.0F).d();
		bpy.b(double5, double3, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double4).a(float8, float9, float10, 0.0F).d();
		bpy.b(double5, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double5, double3, double4).a(float8, float9, float10, 0.0F).d();
	}

	public static void b(bdt bdt, float float2, float float3, float float4, float float5) {
		b(bdt.a, bdt.b, bdt.c, bdt.d, bdt.e, bdt.f, float2, float3, float4, float5);
	}

	public static void b(
		double double1, double double2, double double3, double double4, double double5, double double6, float float7, float float8, float float9, float float10
	) {
		bqs bqs17 = bqs.a();
		bpy bpy18 = bqs17.c();
		bpy18.a(5, bzh.f);
		b(bpy18, double1, double2, double3, double4, double5, double6, float7, float8, float9, float10);
		bqs17.b();
	}

	public static void b(
		bpy bpy,
		double double2,
		double double3,
		double double4,
		double double5,
		double double6,
		double double7,
		float float8,
		float float9,
		float float10,
		float float11
	) {
		bpy.b(double2, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double3, double7).a(float8, float9, float10, float11).d();
		bpy.b(double2, double6, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double6, double7).a(float8, float9, float10, float11).d();
		bpy.b(double2, double6, double7).a(float8, float9, float10, float11).d();
		bpy.b(double2, double3, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double3, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double3, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double4).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double4).a(float8, float9, float10, float11).d();
		bpy.b(double5, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double6, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double5, double3, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double3, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double3, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double3, double7).a(float8, float9, float10, float11).d();
		bpy.b(double2, double6, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double6, double4).a(float8, float9, float10, float11).d();
		bpy.b(double2, double6, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double4).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double7).a(float8, float9, float10, float11).d();
		bpy.b(double5, double6, double7).a(float8, float9, float10, float11).d();
	}

	private void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, boolean boolean7) {
		this.o.a(integer1, integer2, integer3, integer4, integer5, integer6, boolean7);
	}

	@Override
	public void a(ajs ajs, co co, atl atl3, atl atl4, int integer) {
		int integer7 = co.p();
		int integer8 = co.q();
		int integer9 = co.r();
		this.a(integer7 - 1, integer8 - 1, integer9 - 1, integer7 + 1, integer8 + 1, integer9 + 1, (integer & 8) != 0);
	}

	@Override
	public void a(co co) {
		this.ae.add(co.h());
	}

	@Override
	public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.a(integer1 - 1, integer2 - 1, integer3 - 1, integer4 + 1, integer5 + 1, integer6 + 1, false);
	}

	@Override
	public void a(@Nullable nm nm, co co) {
		ccc ccc4 = (ccc)this.y.get(co);
		if (ccc4 != null) {
			this.h.U().b(ccc4);
			this.y.remove(co);
		}

		if (nm != null) {
			afy afy5 = afy.a(nm);
			if (afy5 != null) {
				this.h.r.a(afy5.g());
			}

			ccc var5 = cby.a(nm, (float)co.p(), (float)co.q(), (float)co.r());
			this.y.put(co, var5);
			this.h.U().a(var5);
		}
	}

	@Override
	public void a(@Nullable aay aay, nm nm, no no, double double4, double double5, double double6, float float7, float float8) {
	}

	@Override
	public void a(int integer, boolean boolean2, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
		this.a(integer, boolean2, false, double3, double4, double5, double6, double7, double8, arr);
	}

	@Override
	public void a(
		int integer, boolean boolean2, boolean boolean3, double double4, double double5, double double6, double double7, double double8, double double9, int... arr
	) {
		try {
			this.b(integer, boolean2, boolean3, double4, double5, double6, double7, double8, double9, arr);
		} catch (Throwable var20) {
			b b19 = b.a(var20, "Exception while adding particle");
			c c20 = b19.a("Particle being added");
			c20.a("ID", integer);
			if (arr != null) {
				c20.a("Parameters", arr);
			}

			c20.a("Position", new d<String>() {
				public String call() throws Exception {
					return c.a(double4, double5, double6);
				}
			});
			throw new f(b19);
		}
	}

	private void a(de de, double double2, double double3, double double4, double double5, double double6, double double7, int... arr) {
		this.a(de.c(), de.e(), double2, double3, double4, double5, double6, double7, arr);
	}

	@Nullable
	private bou b(int integer, boolean boolean2, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
		return this.b(integer, boolean2, false, double3, double4, double5, double6, double7, double8, arr);
	}

	@Nullable
	private bou b(
		int integer, boolean boolean2, boolean boolean3, double double4, double double5, double double6, double double7, double double8, double double9, int... arr
	) {
		sn sn18 = this.h.aa();
		if (this.h != null && sn18 != null && this.h.j != null) {
			int integer19 = this.a(boolean3);
			double double20 = sn18.p - double4;
			double double22 = sn18.q - double5;
			double double24 = sn18.r - double6;
			if (boolean2) {
				return this.h.j.a(integer, double4, double5, double6, double7, double8, double9, arr);
			} else if (double20 * double20 + double22 * double22 + double24 * double24 > 1024.0) {
				return null;
			} else {
				return integer19 > 1 ? null : this.h.j.a(integer, double4, double5, double6, double7, double8, double9, arr);
			}
		} else {
			return null;
		}
	}

	private int a(boolean boolean1) {
		int integer3 = this.h.u.aD;
		if (boolean1 && integer3 == 2 && this.k.r.nextInt(10) == 0) {
			integer3 = 1;
		}

		if (integer3 == 1 && this.k.r.nextInt(3) == 0) {
			integer3 = 2;
		}

		return integer3;
	}

	@Override
	public void a(sn sn) {
	}

	@Override
	public void b(sn sn) {
	}

	public void l() {
	}

	@Override
	public void a(int integer1, co co, int integer3) {
		switch (integer1) {
			case 1023:
			case 1028:
				sn sn5 = this.h.aa();
				if (sn5 != null) {
					double double6 = (double)co.p() - sn5.p;
					double double8 = (double)co.q() - sn5.q;
					double double10 = (double)co.r() - sn5.r;
					double double12 = Math.sqrt(double6 * double6 + double8 * double8 + double10 * double10);
					double double14 = sn5.p;
					double double16 = sn5.q;
					double double18 = sn5.r;
					if (double12 > 0.0) {
						double14 += double6 / double12 * 2.0;
						double16 += double8 / double12 * 2.0;
						double18 += double10 / double12 * 2.0;
					}

					if (integer1 == 1023) {
						this.k.a(double14, double16, double18, nn.hH, no.HOSTILE, 1.0F, 1.0F, false);
					} else {
						this.k.a(double14, double16, double18, nn.aS, no.HOSTILE, 5.0F, 1.0F, false);
					}
				}
		}
	}

	@Override
	public void a(aay aay, int integer2, co co, int integer4) {
		Random random6 = this.k.r;
		switch (integer2) {
			case 1000:
				this.k.a(co, nn.aw, no.BLOCKS, 1.0F, 1.0F, false);
				break;
			case 1001:
				this.k.a(co, nn.ax, no.BLOCKS, 1.0F, 1.2F, false);
				break;
			case 1002:
				this.k.a(co, nn.ay, no.BLOCKS, 1.0F, 1.2F, false);
				break;
			case 1003:
				this.k.a(co, nn.aY, no.NEUTRAL, 1.0F, 1.2F, false);
				break;
			case 1004:
				this.k.a(co, nn.bD, no.NEUTRAL, 1.0F, 1.2F, false);
				break;
			case 1005:
				this.k.a(co, nn.db, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1006:
				this.k.a(co, nn.hS, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1007:
				this.k.a(co, nn.hU, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1008:
				this.k.a(co, nn.bw, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1009:
				this.k.a(co, nn.bH, no.BLOCKS, 0.5F, 2.6F + (random6.nextFloat() - random6.nextFloat()) * 0.8F, false);
				break;
			case 1010:
				if (afh.c(integer4) instanceof afy) {
					this.k.a(co, ((afy)afh.c(integer4)).h());
				} else {
					this.k.a(co, null);
				}
				break;
			case 1011:
				this.k.a(co, nn.da, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1012:
				this.k.a(co, nn.hR, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1013:
				this.k.a(co, nn.hT, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1014:
				this.k.a(co, nn.bv, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1015:
				this.k.a(co, nn.ca, no.HOSTILE, 10.0F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1016:
				this.k.a(co, nn.bZ, no.HOSTILE, 10.0F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1017:
				this.k.a(co, nn.aX, no.HOSTILE, 10.0F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1018:
				this.k.a(co, nn.G, no.HOSTILE, 2.0F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1019:
				this.k.a(co, nn.if, no.HOSTILE, 2.0F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1020:
				this.k.a(co, nn.ig, no.HOSTILE, 2.0F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1021:
				this.k.a(co, nn.ih, no.HOSTILE, 2.0F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1022:
				this.k.a(co, nn.hz, no.HOSTILE, 2.0F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1024:
				this.k.a(co, nn.hC, no.HOSTILE, 2.0F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1025:
				this.k.a(co, nn.B, no.NEUTRAL, 0.05F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1026:
				this.k.a(co, nn.in, no.HOSTILE, 2.0F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1027:
				this.k.a(co, nn.iu, no.NEUTRAL, 2.0F, (random6.nextFloat() - random6.nextFloat()) * 0.2F + 1.0F, false);
				break;
			case 1029:
				this.k.a(co, nn.c, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1030:
				this.k.a(co, nn.i, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1031:
				this.k.a(co, nn.f, no.BLOCKS, 0.3F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1032:
				this.h.U().a(cby.a(nn.eS, random6.nextFloat() * 0.4F + 0.8F));
				break;
			case 1033:
				this.k.a(co, nn.ag, no.BLOCKS, 1.0F, 1.0F, false);
				break;
			case 1034:
				this.k.a(co, nn.af, no.BLOCKS, 1.0F, 1.0F, false);
				break;
			case 1035:
				this.k.a(co, nn.M, no.BLOCKS, 1.0F, 1.0F, false);
				break;
			case 1036:
				this.k.a(co, nn.dc, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 1037:
				this.k.a(co, nn.dd, no.BLOCKS, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 2000:
				int integer8 = integer4 % 3 - 1;
				int integer9 = integer4 / 3 % 3 - 1;
				double double10 = (double)co.p() + (double)integer8 * 0.6 + 0.5;
				double double12 = (double)co.q() + 0.5;
				double double14 = (double)co.r() + (double)integer9 * 0.6 + 0.5;

				for (int integer16 = 0; integer16 < 10; integer16++) {
					double double17 = random6.nextDouble() * 0.2 + 0.01;
					double double19 = double10 + (double)integer8 * 0.01 + (random6.nextDouble() - 0.5) * (double)integer9 * 0.5;
					double double21 = double12 + (random6.nextDouble() - 0.5) * 0.5;
					double double23 = double14 + (double)integer9 * 0.01 + (random6.nextDouble() - 0.5) * (double)integer8 * 0.5;
					double double25 = (double)integer8 * double17 + random6.nextGaussian() * 0.01;
					double double27 = -0.03 + random6.nextGaussian() * 0.01;
					double double29 = (double)integer9 * double17 + random6.nextGaussian() * 0.01;
					this.a(de.SMOKE_NORMAL, double19, double21, double23, double25, double27, double29);
				}
				break;
			case 2001:
				alu alu7 = alu.b(integer4 & 4095);
				if (alu7.t().a() != azs.a) {
					aqu aqu18 = alu7.v();
					this.k.a(co, aqu18.c(), no.BLOCKS, (aqu18.a() + 1.0F) / 2.0F, aqu18.b() * 0.8F, false);
				}

				this.h.j.a(co, alu7.a(integer4 >> 12 & 0xFF));
				break;
			case 2002:
			case 2007:
				double double8 = (double)co.p();
				double double10 = (double)co.q();
				double double12 = (double)co.r();

				for (int integer14 = 0; integer14 < 8; integer14++) {
					this.a(de.ITEM_CRACK, double8, double10, double12, random6.nextGaussian() * 0.15, random6.nextDouble() * 0.2, random6.nextGaussian() * 0.15, afh.a(afl.bI));
				}

				float float14 = (float)(integer4 >> 16 & 0xFF) / 255.0F;
				float float15 = (float)(integer4 >> 8 & 0xFF) / 255.0F;
				float float16 = (float)(integer4 >> 0 & 0xFF) / 255.0F;
				de de17 = integer2 == 2007 ? de.SPELL_INSTANT : de.SPELL;

				for (int integer18x = 0; integer18x < 100; integer18x++) {
					double double19 = random6.nextDouble() * 4.0;
					double double21 = random6.nextDouble() * Math.PI * 2.0;
					double double23 = Math.cos(double21) * double19;
					double double25 = 0.01 + random6.nextDouble() * 0.5;
					double double27 = Math.sin(double21) * double19;
					bou bou29 = this.b(de17.c(), de17.e(), double8 + double23 * 0.1, double10 + 0.3, double12 + double27 * 0.1, double23, double25, double27);
					if (bou29 != null) {
						float float30 = 0.75F + random6.nextFloat() * 0.25F;
						bou29.a(float14 * float30, float15 * float30, float16 * float30);
						bou29.c((float)double19);
					}
				}

				this.k.a(co, nn.gC, no.NEUTRAL, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 2003:
				double double8 = (double)co.p() + 0.5;
				double double10 = (double)co.q();
				double double12 = (double)co.r() + 0.5;

				for (int integer14 = 0; integer14 < 8; integer14++) {
					this.a(de.ITEM_CRACK, double8, double10, double12, random6.nextGaussian() * 0.15, random6.nextDouble() * 0.2, random6.nextGaussian() * 0.15, afh.a(afl.bS));
				}

				for (double double14 = 0.0; double14 < Math.PI * 2; double14 += Math.PI / 20) {
					this.a(
						de.PORTAL,
						double8 + Math.cos(double14) * 5.0,
						double10 - 0.4,
						double12 + Math.sin(double14) * 5.0,
						Math.cos(double14) * -5.0,
						0.0,
						Math.sin(double14) * -5.0
					);
					this.a(
						de.PORTAL,
						double8 + Math.cos(double14) * 5.0,
						double10 - 0.4,
						double12 + Math.sin(double14) * 5.0,
						Math.cos(double14) * -7.0,
						0.0,
						Math.sin(double14) * -7.0
					);
				}
				break;
			case 2004:
				for (int integer18x = 0; integer18x < 20; integer18x++) {
					double double19 = (double)co.p() + 0.5 + ((double)this.k.r.nextFloat() - 0.5) * 2.0;
					double double21 = (double)co.q() + 0.5 + ((double)this.k.r.nextFloat() - 0.5) * 2.0;
					double double23 = (double)co.r() + 0.5 + ((double)this.k.r.nextFloat() - 0.5) * 2.0;
					this.k.a(de.SMOKE_NORMAL, double19, double21, double23, 0.0, 0.0, 0.0, new int[0]);
					this.k.a(de.FLAME, double19, double21, double23, 0.0, 0.0, 0.0, new int[0]);
				}
				break;
			case 2005:
				aen.a(this.k, co, integer4);
				break;
			case 2006:
				for (int integer18 = 0; integer18 < 200; integer18++) {
					float float19 = random6.nextFloat() * 4.0F;
					float float20 = random6.nextFloat() * (float) (Math.PI * 2);
					double double21 = (double)(ot.b(float20) * float19);
					double double23 = 0.01 + random6.nextDouble() * 0.5;
					double double25 = (double)(ot.a(float20) * float19);
					bou bou27 = this.b(
						de.DRAGON_BREATH.c(), false, (double)co.p() + double21 * 0.1, (double)co.q() + 0.3, (double)co.r() + double25 * 0.1, double21, double23, double25
					);
					if (bou27 != null) {
						bou27.c(float19);
					}
				}

				this.k.a(co, nn.aT, no.HOSTILE, 1.0F, this.k.r.nextFloat() * 0.1F + 0.9F, false);
				break;
			case 3000:
				this.k.a(de.EXPLOSION_HUGE, true, (double)co.p() + 0.5, (double)co.q() + 0.5, (double)co.r() + 0.5, 0.0, 0.0, 0.0, new int[0]);
				this.k.a(co, nn.bk, no.BLOCKS, 10.0F, (1.0F + (this.k.r.nextFloat() - this.k.r.nextFloat()) * 0.2F) * 0.7F, false);
				break;
			case 3001:
				this.k.a(co, nn.aV, no.HOSTILE, 64.0F, 0.8F + this.k.r.nextFloat() * 0.3F, false);
		}
	}

	@Override
	public void b(int integer1, co co, int integer3) {
		if (integer3 >= 0 && integer3 < 10) {
			lp lp5 = (lp)this.x.get(integer1);
			if (lp5 == null || lp5.b().p() != co.p() || lp5.b().q() != co.q() || lp5.b().r() != co.r()) {
				lp5 = new lp(integer1, co);
				this.x.put(integer1, lp5);
			}

			lp5.a(integer3);
			lp5.b(this.w);
		} else {
			this.x.remove(integer1);
		}
	}

	public boolean n() {
		return this.l.isEmpty() && this.N.f();
	}

	public void o() {
		this.ac = true;
	}

	public void a(Collection<asc> collection1, Collection<asc> collection2) {
		synchronized (this.n) {
			this.n.removeAll(collection1);
			this.n.addAll(collection2);
		}
	}

	class a {
		final bte a;
		final cv b;
		byte c;
		final int d;

		private a(bte bte, cv cv, @Nullable int integer) {
			this.a = bte;
			this.b = cv;
			this.d = integer;
		}

		public void a(byte byte1, cv cv) {
			this.c = (byte)(this.c | byte1 | 1 << cv.ordinal());
		}

		public boolean a(cv cv) {
			return (this.c & 1 << cv.ordinal()) > 0;
		}
	}
}
