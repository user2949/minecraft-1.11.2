import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.gson.JsonSyntaxException;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public class bqe implements bzz {
	private static final Logger e = LogManager.getLogger();
	private static final kq f = new kq("textures/environment/rain.png");
	private static final kq g = new kq("textures/environment/snow.png");
	public static boolean a;
	public static int b;
	private final bes h;
	private final bzy i;
	private final Random j = new Random();
	private float k;
	public final bqi c;
	private final bfj l;
	private int m;
	private sn n;
	private final ow o = new ow();
	private final ow p = new ow();
	private final float q = 4.0F;
	private float r = 4.0F;
	private float s;
	private float t;
	private float u;
	private float v;
	private float w;
	private float x;
	private float y;
	private float z;
	private float A;
	private boolean B;
	private boolean C = true;
	private boolean D = true;
	private long E;
	private long F = bes.I();
	private long G;
	private final byp H;
	private final int[] I;
	private final kq J;
	private boolean K;
	private float L;
	private float M;
	private int N;
	private final float[] O = new float[1024];
	private final float[] P = new float[1024];
	private final FloatBuffer Q = ber.h(16);
	private float R;
	private float S;
	private float T;
	private float U;
	private float V;
	private int W;
	private boolean X;
	private double Y = 1.0;
	private double Z;
	private double aa;
	private afj ab;
	private int ac;
	private float ad;
	private float ae;
	private byh af;
	private static final kq[] ag = new kq[]{
		new kq("shaders/post/notch.json"),
		new kq("shaders/post/fxaa.json"),
		new kq("shaders/post/art.json"),
		new kq("shaders/post/bumpy.json"),
		new kq("shaders/post/blobs2.json"),
		new kq("shaders/post/pencil.json"),
		new kq("shaders/post/color_convolve.json"),
		new kq("shaders/post/deconverge.json"),
		new kq("shaders/post/flip.json"),
		new kq("shaders/post/invert.json"),
		new kq("shaders/post/ntsc.json"),
		new kq("shaders/post/outline.json"),
		new kq("shaders/post/phosphor.json"),
		new kq("shaders/post/scan_pincushion.json"),
		new kq("shaders/post/sobel.json"),
		new kq("shaders/post/bits.json"),
		new kq("shaders/post/desaturate.json"),
		new kq("shaders/post/green.json"),
		new kq("shaders/post/blur.json"),
		new kq("shaders/post/wobble.json"),
		new kq("shaders/post/blobs.json"),
		new kq("shaders/post/antialias.json"),
		new kq("shaders/post/creeper.json"),
		new kq("shaders/post/spider.json")
	};
	public static final int d = ag.length;
	private int ah = d;
	private boolean ai;
	private int aj;

	public bqe(bes bes, bzy bzy) {
		this.h = bes;
		this.i = bzy;
		this.c = bes.ae();
		this.l = new bfj(bes.N());
		this.H = new byp(16, 16);
		this.J = bes.N().a("lightMap", this.H);
		this.I = this.H.e();
		this.af = null;

		for (int integer4 = 0; integer4 < 32; integer4++) {
			for (int integer5 = 0; integer5 < 32; integer5++) {
				float float6 = (float)(integer5 - 16);
				float float7 = (float)(integer4 - 16);
				float float8 = ot.c(float6 * float6 + float7 * float7);
				this.O[integer4 << 5 | integer5] = -float7 / float8;
				this.P[integer4 << 5 | integer5] = float6 / float8;
			}
		}
	}

	public boolean a() {
		return cdb.O && this.af != null;
	}

	public void b() {
		if (this.af != null) {
			this.af.a();
		}

		this.af = null;
		this.ah = d;
	}

	public void c() {
		this.ai = !this.ai;
	}

	public void a(@Nullable sn sn) {
		if (cdb.O) {
			if (this.af != null) {
				this.af.a();
			}

			this.af = null;
			if (sn instanceof zp) {
				this.a(new kq("shaders/post/creeper.json"));
			} else if (sn instanceof aai) {
				this.a(new kq("shaders/post/spider.json"));
			} else if (sn instanceof zr) {
				this.a(new kq("shaders/post/invert.json"));
			}
		}
	}

	private void a(kq kq) {
		try {
			this.af = new byh(this.h.N(), this.i, this.h.b(), kq);
			this.af.a(this.h.d, this.h.e);
			this.ai = true;
		} catch (IOException var3) {
			e.warn("Failed to load shader: {}", new Object[]{kq, var3});
			this.ah = d;
			this.ai = false;
		} catch (JsonSyntaxException var4) {
			e.warn("Failed to load shader: {}", new Object[]{kq, var4});
			this.ah = d;
			this.ai = false;
		}
	}

	@Override
	public void a(bzy bzy) {
		if (this.af != null) {
			this.af.a();
		}

		this.af = null;
		if (this.ah == d) {
			this.a(this.h.aa());
		} else {
			this.a(ag[this.ah]);
		}
	}

	public void e() {
		if (cdb.O && byk.b() == null) {
			byk.a();
		}

		this.m();
		this.n();
		this.U = this.V;
		this.r = 4.0F;
		if (this.h.u.ax) {
			float float2 = this.h.u.b * 0.6F + 0.2F;
			float float3 = float2 * float2 * float2 * 8.0F;
			this.u = this.o.a(this.s, 0.05F * float3);
			this.v = this.p.a(this.t, 0.05F * float3);
			this.w = 0.0F;
			this.s = 0.0F;
			this.t = 0.0F;
		} else {
			this.u = 0.0F;
			this.v = 0.0F;
			this.o.a();
			this.p.a();
		}

		if (this.h.aa() == null) {
			this.h.a(this.h.h);
		}

		float float2 = this.h.f.n(new co(this.h.aa()));
		float float3 = (float)this.h.u.d / 32.0F;
		float float4 = float2 * (1.0F - float3) + float3;
		this.V = this.V + (float4 - this.V) * 0.1F;
		this.m++;
		this.c.a();
		this.q();
		this.A = this.z;
		if (this.h.r.j().e()) {
			this.z += 0.05F;
			if (this.z > 1.0F) {
				this.z = 1.0F;
			}
		} else if (this.z > 0.0F) {
			this.z -= 0.0125F;
		}

		if (this.ac > 0) {
			this.ac--;
			if (this.ac == 0) {
				this.ab = null;
			}
		}
	}

	public byh f() {
		return this.af;
	}

	public void a(int integer1, int integer2) {
		if (cdb.O) {
			if (this.af != null) {
				this.af.a(integer1, integer2);
			}

			this.h.g.a(integer1, integer2);
		}
	}

	public void a(float float1) {
		sn sn3 = this.h.aa();
		if (sn3 != null) {
			if (this.h.f != null) {
				this.h.B.a("pick");
				this.h.i = null;
				double double4 = (double)this.h.c.d();
				this.h.t = sn3.a(double4, float1);
				bdw bdw6 = sn3.g(float1);
				boolean boolean7 = false;
				int integer8 = 3;
				double double9 = double4;
				if (this.h.c.i()) {
					double9 = 6.0;
					double4 = double9;
				} else {
					if (double4 > 3.0) {
						boolean7 = true;
					}

					double4 = double4;
				}

				if (this.h.t != null) {
					double9 = this.h.t.c.f(bdw6);
				}

				bdw bdw11 = sn3.f(1.0F);
				bdw bdw12 = bdw6.b(bdw11.b * double4, bdw11.c * double4, bdw11.d * double4);
				this.n = null;
				bdw bdw13 = null;
				float float14 = 1.0F;
				List<sn> list15 = this.h
					.f
					.a(sn3, sn3.bo().b(bdw11.b * double4, bdw11.c * double4, bdw11.d * double4).c(1.0, 1.0, 1.0), Predicates.and(sr.e, new Predicate<sn>() {
						public boolean apply(@Nullable sn sn) {
							return sn != null && sn.aq();
						}
					}));
				double double16 = double9;

				for (int integer18 = 0; integer18 < list15.size(); integer18++) {
					sn sn19 = (sn)list15.get(integer18);
					bdt bdt20 = sn19.bo().g((double)sn19.aA());
					bdu bdu21 = bdt20.b(bdw6, bdw12);
					if (bdt20.b(bdw6)) {
						if (double16 >= 0.0) {
							this.n = sn19;
							bdw13 = bdu21 == null ? bdw6 : bdu21.c;
							double16 = 0.0;
						}
					} else if (bdu21 != null) {
						double double22 = bdw6.f(bdu21.c);
						if (double22 < double16 || double16 == 0.0) {
							if (sn19.bz() == sn3.bz()) {
								if (double16 == 0.0) {
									this.n = sn19;
									bdw13 = bdu21.c;
								}
							} else {
								this.n = sn19;
								bdw13 = bdu21.c;
								double16 = double22;
							}
						}
					}
				}

				if (this.n != null && boolean7 && bdw6.f(bdw13) > 3.0) {
					this.n = null;
					this.h.t = new bdu(bdu.a.MISS, bdw13, null, new co(bdw13));
				}

				if (this.n != null && (double16 < double9 || this.h.t == null)) {
					this.h.t = new bdu(this.n, bdw13);
					if (this.n instanceof sw || this.n instanceof yz) {
						this.h.i = this.n;
					}
				}

				this.h.B.b();
			}
		}
	}

	private void m() {
		float float2 = 1.0F;
		if (this.h.aa() instanceof bpp) {
			bpp bpp3 = (bpp)this.h.aa();
			float2 = bpp3.u();
		}

		this.y = this.x;
		this.x = this.x + (float2 - this.x) * 0.5F;
		if (this.x > 1.5F) {
			this.x = 1.5F;
		}

		if (this.x < 0.1F) {
			this.x = 0.1F;
		}
	}

	private float a(float float1, boolean boolean2) {
		if (this.X) {
			return 90.0F;
		} else {
			sn sn4 = this.h.aa();
			float float5 = 70.0F;
			if (boolean2) {
				float5 = this.h.u.az;
				float5 *= this.y + (this.x - this.y) * float1;
			}

			if (sn4 instanceof sw && ((sw)sn4).bU() <= 0.0F) {
				float float6 = (float)((sw)sn4).aB + float1;
				float5 /= (1.0F - 500.0F / (float6 + 500.0F)) * 2.0F + 1.0F;
			}

			atl atl6 = ben.a(this.h.f, sn4, float1);
			if (atl6.a() == azs.h) {
				float5 = float5 * 60.0F / 70.0F;
			}

			return float5;
		}
	}

	private void d(float float1) {
		if (this.h.aa() instanceof sw) {
			sw sw3 = (sw)this.h.aa();
			float float4 = (float)sw3.ay - float1;
			if (sw3.bU() <= 0.0F) {
				float float5 = (float)sw3.aB + float1;
				bqg.b(40.0F - 8000.0F / (float5 + 200.0F), 0.0F, 0.0F, 1.0F);
			}

			if (float4 < 0.0F) {
				return;
			}

			float4 /= (float)sw3.az;
			float4 = ot.a(float4 * float4 * float4 * float4 * (float) Math.PI);
			float float5 = sw3.aA;
			bqg.b(-float5, 0.0F, 1.0F, 0.0F);
			bqg.b(-float4 * 14.0F, 0.0F, 0.0F, 1.0F);
			bqg.b(float5, 0.0F, 1.0F, 0.0F);
		}
	}

	private void e(float float1) {
		if (this.h.aa() instanceof aay) {
			aay aay3 = (aay)this.h.aa();
			float float4 = aay3.J - aay3.I;
			float float5 = -(aay3.J + float4 * float1);
			float float6 = aay3.bx + (aay3.by - aay3.bx) * float1;
			float float7 = aay3.aJ + (aay3.aK - aay3.aJ) * float1;
			bqg.c(ot.a(float5 * (float) Math.PI) * float6 * 0.5F, -Math.abs(ot.b(float5 * (float) Math.PI) * float6), 0.0F);
			bqg.b(ot.a(float5 * (float) Math.PI) * float6 * 3.0F, 0.0F, 0.0F, 1.0F);
			bqg.b(Math.abs(ot.b(float5 * (float) Math.PI - 0.2F) * float6) * 5.0F, 1.0F, 0.0F, 0.0F);
			bqg.b(float7, 1.0F, 0.0F, 0.0F);
		}
	}

	private void f(float float1) {
		sn sn3 = this.h.aa();
		float float4 = sn3.bq();
		double double5 = sn3.m + (sn3.p - sn3.m) * (double)float1;
		double double7 = sn3.n + (sn3.q - sn3.n) * (double)float1 + (double)float4;
		double double9 = sn3.o + (sn3.r - sn3.o) * (double)float1;
		if (sn3 instanceof sw && ((sw)sn3).cr()) {
			float4 = (float)((double)float4 + 1.0);
			bqg.c(0.0F, 0.3F, 0.0F);
			if (!this.h.u.ay) {
				co co11 = new co(sn3);
				atl atl12 = this.h.f.o(co11);
				alu alu13 = atl12.v();
				if (alu13 == alv.C) {
					int integer14 = ((cv)atl12.c(als.D)).b();
					bqg.b((float)(integer14 * 90), 0.0F, 1.0F, 0.0F);
				}

				bqg.b(sn3.x + (sn3.v - sn3.x) * float1 + 180.0F, 0.0F, -1.0F, 0.0F);
				bqg.b(sn3.y + (sn3.w - sn3.y) * float1, -1.0F, 0.0F, 0.0F);
			}
		} else if (this.h.u.as > 0) {
			double double11 = (double)(this.r + (4.0F - this.r) * float1);
			if (this.h.u.ay) {
				bqg.c(0.0F, 0.0F, (float)(-double11));
			} else {
				float float13 = sn3.v;
				float float14 = sn3.w;
				if (this.h.u.as == 2) {
					float14 += 180.0F;
				}

				double double15 = (double)(-ot.a(float13 * (float) (Math.PI / 180.0)) * ot.b(float14 * (float) (Math.PI / 180.0))) * double11;
				double double17 = (double)(ot.b(float13 * (float) (Math.PI / 180.0)) * ot.b(float14 * (float) (Math.PI / 180.0))) * double11;
				double double19 = (double)(-ot.a(float14 * (float) (Math.PI / 180.0))) * double11;

				for (int integer21 = 0; integer21 < 8; integer21++) {
					float float22 = (float)((integer21 & 1) * 2 - 1);
					float float23 = (float)((integer21 >> 1 & 1) * 2 - 1);
					float float24 = (float)((integer21 >> 2 & 1) * 2 - 1);
					float22 *= 0.1F;
					float23 *= 0.1F;
					float24 *= 0.1F;
					bdu bdu25 = this.h
						.f
						.a(
							new bdw(double5 + (double)float22, double7 + (double)float23, double9 + (double)float24),
							new bdw(double5 - double15 + (double)float22 + (double)float24, double7 - double19 + (double)float23, double9 - double17 + (double)float24)
						);
					if (bdu25 != null) {
						double double26 = bdu25.c.f(new bdw(double5, double7, double9));
						if (double26 < double11) {
							double11 = double26;
						}
					}
				}

				if (this.h.u.as == 2) {
					bqg.b(180.0F, 0.0F, 1.0F, 0.0F);
				}

				bqg.b(sn3.w - float14, 1.0F, 0.0F, 0.0F);
				bqg.b(sn3.v - float13, 0.0F, 1.0F, 0.0F);
				bqg.c(0.0F, 0.0F, (float)(-double11));
				bqg.b(float13 - sn3.v, 0.0F, 1.0F, 0.0F);
				bqg.b(float14 - sn3.w, 1.0F, 0.0F, 0.0F);
			}
		} else {
			bqg.c(0.0F, 0.0F, 0.05F);
		}

		if (!this.h.u.ay) {
			bqg.b(sn3.y + (sn3.w - sn3.y) * float1, 1.0F, 0.0F, 0.0F);
			if (sn3 instanceof ww) {
				ww ww11 = (ww)sn3;
				bqg.b(ww11.aQ + (ww11.aP - ww11.aQ) * float1 + 180.0F, 0.0F, 1.0F, 0.0F);
			} else {
				bqg.b(sn3.x + (sn3.v - sn3.x) * float1 + 180.0F, 0.0F, 1.0F, 0.0F);
			}
		}

		bqg.c(0.0F, -float4, 0.0F);
		double5 = sn3.m + (sn3.p - sn3.m) * (double)float1;
		double7 = sn3.n + (sn3.q - sn3.n) * (double)float1 + (double)float4;
		double9 = sn3.o + (sn3.r - sn3.o) * (double)float1;
		this.B = this.h.g.a(double5, double7, double9, float1);
	}

	private void a(float float1, int integer) {
		this.k = (float)(this.h.u.d * 16);
		bqg.n(5889);
		bqg.F();
		float float4 = 0.07F;
		if (this.h.u.f) {
			bqg.c((float)(-(integer * 2 - 1)) * 0.07F, 0.0F, 0.0F);
		}

		if (this.Y != 1.0) {
			bqg.c((float)this.Z, (float)(-this.aa), 0.0F);
			bqg.a(this.Y, this.Y, 1.0);
		}

		Project.gluPerspective(this.a(float1, true), (float)this.h.d / (float)this.h.e, 0.05F, this.k * ot.a);
		bqg.n(5888);
		bqg.F();
		if (this.h.u.f) {
			bqg.c((float)(integer * 2 - 1) * 0.1F, 0.0F, 0.0F);
		}

		this.d(float1);
		if (this.h.u.e) {
			this.e(float1);
		}

		float float5 = this.h.h.bW + (this.h.h.bV - this.h.h.bW) * float1;
		if (float5 > 0.0F) {
			int integer6 = 20;
			if (this.h.h.a(si.i)) {
				integer6 = 7;
			}

			float float7 = 5.0F / (float5 * float5 + 5.0F) - float5 * 0.04F;
			float7 *= float7;
			bqg.b(((float)this.m + float1) * (float)integer6, 0.0F, 1.0F, 1.0F);
			bqg.b(1.0F / float7, 1.0F, 1.0F);
			bqg.b(-((float)this.m + float1) * (float)integer6, 0.0F, 1.0F, 1.0F);
		}

		this.f(float1);
		if (this.X) {
			switch (this.W) {
				case 0:
					bqg.b(90.0F, 0.0F, 1.0F, 0.0F);
					break;
				case 1:
					bqg.b(180.0F, 0.0F, 1.0F, 0.0F);
					break;
				case 2:
					bqg.b(-90.0F, 0.0F, 1.0F, 0.0F);
					break;
				case 3:
					bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
					break;
				case 4:
					bqg.b(-90.0F, 1.0F, 0.0F, 0.0F);
			}
		}
	}

	private void b(float float1, int integer) {
		if (!this.X) {
			bqg.n(5889);
			bqg.F();
			float float4 = 0.07F;
			if (this.h.u.f) {
				bqg.c((float)(-(integer * 2 - 1)) * 0.07F, 0.0F, 0.0F);
			}

			Project.gluPerspective(this.a(float1, false), (float)this.h.d / (float)this.h.e, 0.05F, this.k * 2.0F);
			bqg.n(5888);
			bqg.F();
			if (this.h.u.f) {
				bqg.c((float)(integer * 2 - 1) * 0.1F, 0.0F, 0.0F);
			}

			bqg.G();
			this.d(float1);
			if (this.h.u.e) {
				this.e(float1);
			}

			boolean boolean5 = this.h.aa() instanceof sw && ((sw)this.h.aa()).cr();
			if (this.h.u.as == 0 && !boolean5 && !this.h.u.ar && !this.h.c.a()) {
				this.i();
				this.c.a(float1);
				this.h();
			}

			bqg.H();
			if (this.h.u.as == 0 && !boolean5) {
				this.c.b(float1);
				this.d(float1);
			}

			if (this.h.u.e) {
				this.e(float1);
			}
		}
	}

	public void h() {
		bqg.g(cdb.r);
		bqg.z();
		bqg.g(cdb.q);
	}

	public void i() {
		bqg.g(cdb.r);
		bqg.n(5890);
		bqg.F();
		float float2 = 0.00390625F;
		bqg.b(0.00390625F, 0.00390625F, 0.00390625F);
		bqg.c(8.0F, 8.0F, 8.0F);
		bqg.n(5888);
		this.h.N().a(this.J);
		bqg.b(3553, 10241, 9729);
		bqg.b(3553, 10240, 9729);
		bqg.b(3553, 10242, 10496);
		bqg.b(3553, 10243, 10496);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.y();
		bqg.g(cdb.q);
	}

	private void n() {
		this.M = (float)((double)this.M + (Math.random() - Math.random()) * Math.random() * Math.random());
		this.M = (float)((double)this.M * 0.9);
		this.L = this.L + (this.M - this.L);
		this.K = true;
	}

	private void g(float float1) {
		if (this.K) {
			this.h.B.a("lightTex");
			ajs ajs3 = this.h.f;
			if (ajs3 != null) {
				float float4 = ajs3.b(1.0F);
				float float5 = float4 * 0.95F + 0.05F;

				for (int integer6 = 0; integer6 < 256; integer6++) {
					float float7 = ajs3.s.o()[integer6 / 16] * float5;
					float float8 = ajs3.s.o()[integer6 % 16] * (this.L * 0.1F + 1.5F);
					if (ajs3.ag() > 0) {
						float7 = ajs3.s.o()[integer6 / 16];
					}

					float float9 = float7 * (float4 * 0.65F + 0.35F);
					float float10 = float7 * (float4 * 0.65F + 0.35F);
					float float13 = float8 * ((float8 * 0.6F + 0.4F) * 0.6F + 0.4F);
					float float14 = float8 * (float8 * float8 * 0.6F + 0.4F);
					float float15 = float9 + float8;
					float float16 = float10 + float13;
					float float17 = float7 + float14;
					float15 = float15 * 0.96F + 0.03F;
					float16 = float16 * 0.96F + 0.03F;
					float17 = float17 * 0.96F + 0.03F;
					if (this.z > 0.0F) {
						float float18 = this.A + (this.z - this.A) * float1;
						float15 = float15 * (1.0F - float18) + float15 * 0.7F * float18;
						float16 = float16 * (1.0F - float18) + float16 * 0.6F * float18;
						float17 = float17 * (1.0F - float18) + float17 * 0.6F * float18;
					}

					if (ajs3.s.q().a() == 1) {
						float15 = 0.22F + float8 * 0.75F;
						float16 = 0.28F + float13 * 0.75F;
						float17 = 0.25F + float14 * 0.75F;
					}

					if (this.h.h.a(si.p)) {
						float float18 = this.a(this.h.h, float1);
						float float19 = 1.0F / float15;
						if (float19 > 1.0F / float16) {
							float19 = 1.0F / float16;
						}

						if (float19 > 1.0F / float17) {
							float19 = 1.0F / float17;
						}

						float15 = float15 * (1.0F - float18) + float15 * float19 * float18;
						float16 = float16 * (1.0F - float18) + float16 * float19 * float18;
						float17 = float17 * (1.0F - float18) + float17 * float19 * float18;
					}

					if (float15 > 1.0F) {
						float15 = 1.0F;
					}

					if (float16 > 1.0F) {
						float16 = 1.0F;
					}

					if (float17 > 1.0F) {
						float17 = 1.0F;
					}

					float float18x = this.h.u.aA;
					float float19x = 1.0F - float15;
					float float20 = 1.0F - float16;
					float float21 = 1.0F - float17;
					float19x = 1.0F - float19x * float19x * float19x * float19x;
					float20 = 1.0F - float20 * float20 * float20 * float20;
					float21 = 1.0F - float21 * float21 * float21 * float21;
					float15 = float15 * (1.0F - float18x) + float19x * float18x;
					float16 = float16 * (1.0F - float18x) + float20 * float18x;
					float17 = float17 * (1.0F - float18x) + float21 * float18x;
					float15 = float15 * 0.96F + 0.03F;
					float16 = float16 * 0.96F + 0.03F;
					float17 = float17 * 0.96F + 0.03F;
					if (float15 > 1.0F) {
						float15 = 1.0F;
					}

					if (float16 > 1.0F) {
						float16 = 1.0F;
					}

					if (float17 > 1.0F) {
						float17 = 1.0F;
					}

					if (float15 < 0.0F) {
						float15 = 0.0F;
					}

					if (float16 < 0.0F) {
						float16 = 0.0F;
					}

					if (float17 < 0.0F) {
						float17 = 0.0F;
					}

					int integer22 = 255;
					int integer23 = (int)(float15 * 255.0F);
					int integer24 = (int)(float16 * 255.0F);
					int integer25 = (int)(float17 * 255.0F);
					this.I[integer6] = 0xFF000000 | integer23 << 16 | integer24 << 8 | integer25;
				}

				this.H.d();
				this.K = false;
				this.h.B.b();
			}
		}
	}

	private float a(sw sw, float float2) {
		int integer4 = sw.b(si.p).b();
		return integer4 > 200 ? 1.0F : 0.7F + ot.a(((float)integer4 - float2) * (float) Math.PI * 0.2F) * 0.3F;
	}

	public void a(float float1, long long2) {
		boolean boolean5 = Display.isActive();
		if (!boolean5 && this.h.u.z && (!this.h.u.A || !Mouse.isButtonDown(1))) {
			if (bes.I() - this.F > 500L) {
				this.h.q();
			}
		} else {
			this.F = bes.I();
		}

		this.h.B.a("mouse");
		if (boolean5 && bes.a && this.h.x && !Mouse.isInsideWindow()) {
			Mouse.setGrabbed(false);
			Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2 - 20);
			Mouse.setGrabbed(true);
		}

		if (this.h.x && boolean5) {
			this.h.v.c();
			float float6 = this.h.u.b * 0.6F + 0.2F;
			float float7 = float6 * float6 * float6 * 8.0F;
			float float8 = (float)this.h.v.a * float7;
			float float9 = (float)this.h.v.b * float7;
			int integer10 = 1;
			if (this.h.u.c) {
				integer10 = -1;
			}

			if (this.h.u.ax) {
				this.s += float8;
				this.t += float9;
				float float11 = float1 - this.w;
				this.w = float1;
				float8 = this.u * float11;
				float9 = this.v * float11;
				this.h.h.c(float8, float9 * (float)integer10);
			} else {
				this.s = 0.0F;
				this.t = 0.0F;
				this.h.h.c(float8, float9 * (float)integer10);
			}
		}

		this.h.B.b();
		if (!this.h.s) {
			a = this.h.u.f;
			final bfk bfk6 = new bfk(this.h);
			int integer7 = bfk6.a();
			int integer8 = bfk6.b();
			final int integer9 = Mouse.getX() * integer7 / this.h.d;
			final int integer10x = integer8 - Mouse.getY() * integer8 / this.h.e - 1;
			int integer11 = this.h.u.h;
			if (this.h.f != null) {
				this.h.B.a("level");
				int integer12 = Math.min(bes.af(), integer11);
				integer12 = Math.max(integer12, 60);
				long long13 = System.nanoTime() - long2;
				long long15 = Math.max((long)(1000000000 / integer12 / 4) - long13, 0L);
				this.b(float1, System.nanoTime() + long15);
				if (this.h.E() && this.E < bes.I() - 1000L) {
					this.E = bes.I();
					if (!this.h.F().y()) {
						this.o();
					}
				}

				if (cdb.O) {
					this.h.g.c();
					if (this.af != null && this.ai) {
						bqg.n(5890);
						bqg.G();
						bqg.F();
						this.af.a(float1);
						bqg.H();
					}

					this.h.b().a(true);
				}

				this.G = System.nanoTime();
				this.h.B.c("gui");
				if (!this.h.u.ar || this.h.m != null) {
					bqg.a(516, 0.1F);
					this.j();
					this.a(integer7, integer8, float1);
					this.h.r.a(float1);
				}

				this.h.B.b();
			} else {
				bqg.b(0, 0, this.h.d, this.h.e);
				bqg.n(5889);
				bqg.F();
				bqg.n(5888);
				bqg.F();
				this.j();
				this.G = System.nanoTime();
			}

			if (this.h.m != null) {
				bqg.m(256);

				try {
					this.h.m.a(integer9, integer10x, float1);
				} catch (Throwable var16) {
					b b13 = b.a(var16, "Rendering screen");
					c c14 = b13.a("Screen render details");
					c14.a("Screen name", new d<String>() {
						public String call() throws Exception {
							return bqe.this.h.m.getClass().getCanonicalName();
						}
					});
					c14.a("Mouse location", new d<String>() {
						public String call() throws Exception {
							return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", integer9, integer10, Mouse.getX(), Mouse.getY());
						}
					});
					c14.a("Screen size", new d<String>() {
						public String call() throws Exception {
							return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", bfk6.a(), bfk6.b(), bqe.this.h.d, bqe.this.h.e, bfk6.e());
						}
					});
					throw new f(b13);
				}
			}
		}
	}

	private void o() {
		if (this.h.g.g() > 10 && this.h.g.n() && !this.h.F().y()) {
			BufferedImage bufferedImage2 = bew.a(this.h.d, this.h.e, this.h.b());
			int integer3 = bufferedImage2.getWidth();
			int integer4 = bufferedImage2.getHeight();
			int integer5 = 0;
			int integer6 = 0;
			if (integer3 > integer4) {
				integer5 = (integer3 - integer4) / 2;
				integer3 = integer4;
			} else {
				integer6 = (integer4 - integer3) / 2;
			}

			try {
				BufferedImage bufferedImage7 = new BufferedImage(64, 64, 1);
				Graphics graphics8 = bufferedImage7.createGraphics();
				graphics8.drawImage(bufferedImage2, 0, 0, 64, 64, integer5, integer6, integer5 + integer3, integer6 + integer3, null);
				graphics8.dispose();
				ImageIO.write(bufferedImage7, "png", this.h.F().z());
			} catch (IOException var8) {
				e.warn("Couldn't save auto screenshot", var8);
			}
		}
	}

	public void b(float float1) {
		this.j();
	}

	private boolean p() {
		if (!this.D) {
			return false;
		} else {
			sn sn2 = this.h.aa();
			boolean boolean3 = sn2 instanceof aay && !this.h.u.ar;
			if (boolean3 && !((aay)sn2).bK.e) {
				afj afj4 = ((aay)sn2).cg();
				if (this.h.t != null && this.h.t.a == bdu.a.BLOCK) {
					co co5 = this.h.t.a();
					alu alu6 = this.h.f.o(co5).v();
					if (this.h.c.l() == ajq.SPECTATOR) {
						boolean3 = alu6.l() && this.h.f.r(co5) instanceof rc;
					} else {
						boolean3 = !afj4.b() && (afj4.a(alu6) || afj4.b(alu6));
					}
				}
			}

			return boolean3;
		}
	}

	public void b(float float1, long long2) {
		this.g(float1);
		if (this.h.aa() == null) {
			this.h.a(this.h.h);
		}

		this.a(float1);
		bqg.k();
		bqg.e();
		bqg.a(516, 0.5F);
		this.h.B.a("center");
		if (this.h.u.f) {
			b = 0;
			bqg.a(false, true, true, false);
			this.a(0, float1, long2);
			b = 1;
			bqg.a(true, false, false, false);
			this.a(1, float1, long2);
			bqg.a(true, true, true, false);
		} else {
			this.a(2, float1, long2);
		}

		this.h.B.b();
	}

	private void a(int integer, float float2, long long3) {
		bqm bqm6 = this.h.g;
		bov bov7 = this.h.j;
		boolean boolean8 = this.p();
		bqg.q();
		this.h.B.c("clear");
		bqg.b(0, 0, this.h.d, this.h.e);
		this.h(float2);
		bqg.m(16640);
		this.h.B.c("camera");
		this.a(float2, integer);
		ben.a(this.h.h, this.h.u.as == 2);
		this.h.B.c("frustum");
		btm.a();
		this.h.B.c("culling");
		btl btl9 = new btn();
		sn sn10 = this.h.aa();
		double double11 = sn10.M + (sn10.p - sn10.M) * (double)float2;
		double double13 = sn10.N + (sn10.q - sn10.N) * (double)float2;
		double double15 = sn10.O + (sn10.r - sn10.O) * (double)float2;
		btl9.a(double11, double13, double15);
		if (this.h.u.d >= 4) {
			this.a(-1, float2);
			this.h.B.c("sky");
			bqg.n(5889);
			bqg.F();
			Project.gluPerspective(this.a(float2, true), (float)this.h.d / (float)this.h.e, 0.05F, this.k * 2.0F);
			bqg.n(5888);
			bqm6.a(float2, integer);
			bqg.n(5889);
			bqg.F();
			Project.gluPerspective(this.a(float2, true), (float)this.h.d / (float)this.h.e, 0.05F, this.k * ot.a);
			bqg.n(5888);
		}

		this.a(0, float2);
		bqg.j(7425);
		if (sn10.q + (double)sn10.bq() < 128.0) {
			this.a(bqm6, float2, integer, double11, double13, double15);
		}

		this.h.B.c("prepareterrain");
		this.a(0, float2);
		this.h.N().a(byy.g);
		beq.a();
		this.h.B.c("terrain_setup");
		bqm6.a(sn10, (double)float2, btl9, this.aj++, this.h.h.y());
		if (integer == 0 || integer == 2) {
			this.h.B.c("updatechunks");
			this.h.g.a(long3);
		}

		this.h.B.c("terrain");
		bqg.n(5888);
		bqg.G();
		bqg.d();
		bqm6.a(ajk.SOLID, (double)float2, integer, sn10);
		bqg.e();
		bqm6.a(ajk.CUTOUT_MIPPED, (double)float2, integer, sn10);
		this.h.N().b(byy.g).b(false, false);
		bqm6.a(ajk.CUTOUT, (double)float2, integer, sn10);
		this.h.N().b(byy.g).a();
		bqg.j(7424);
		bqg.a(516, 0.1F);
		if (!this.X) {
			bqg.n(5888);
			bqg.H();
			bqg.G();
			beq.b();
			this.h.B.c("entities");
			bqm6.a(sn10, btl9, float2);
			beq.a();
			this.h();
		}

		bqg.n(5888);
		bqg.H();
		if (boolean8 && this.h.t != null && !sn10.a(azs.h)) {
			aay aay17 = (aay)sn10;
			bqg.d();
			this.h.B.c("outline");
			bqm6.a(aay17, this.h.t, 0, float2);
			bqg.e();
		}

		if (this.h.p.a()) {
			this.h.p.a(float2, long3);
		}

		this.h.B.c("destroyProgress");
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE, bqg.r.ONE, bqg.l.ZERO);
		this.h.N().b(byy.g).b(false, false);
		bqm6.a(bqs.a(), bqs.a().c(), sn10, float2);
		this.h.N().b(byy.g).a();
		bqg.l();
		if (!this.X) {
			this.i();
			this.h.B.c("litParticles");
			bov7.b(sn10, float2);
			beq.a();
			this.a(0, float2);
			this.h.B.c("particles");
			bov7.a(sn10, float2);
			this.h();
		}

		bqg.a(false);
		bqg.q();
		this.h.B.c("weather");
		this.c(float2);
		bqg.a(true);
		bqm6.a(sn10, float2);
		bqg.l();
		bqg.q();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.a(516, 0.1F);
		this.a(0, float2);
		bqg.m();
		bqg.a(false);
		this.h.N().a(byy.g);
		bqg.j(7425);
		this.h.B.c("translucent");
		bqm6.a(ajk.TRANSLUCENT, (double)float2, integer, sn10);
		bqg.j(7424);
		bqg.a(true);
		bqg.q();
		bqg.l();
		bqg.p();
		if (sn10.q + (double)sn10.bq() >= 128.0) {
			this.h.B.c("aboveClouds");
			this.a(bqm6, float2, integer, double11, double13, double15);
		}

		this.h.B.c("hand");
		if (this.C) {
			bqg.m(256);
			this.b(float2, integer);
		}
	}

	private void a(bqm bqm, float float2, int integer, double double4, double double5, double double6) {
		if (this.h.u.e() != 0) {
			this.h.B.c("clouds");
			bqg.n(5889);
			bqg.F();
			Project.gluPerspective(this.a(float2, true), (float)this.h.d / (float)this.h.e, 0.05F, this.k * 4.0F);
			bqg.n(5888);
			bqg.G();
			this.a(0, float2);
			bqm.a(float2, integer, double4, double5, double6);
			bqg.p();
			bqg.H();
			bqg.n(5889);
			bqg.F();
			Project.gluPerspective(this.a(float2, true), (float)this.h.d / (float)this.h.e, 0.05F, this.k * ot.a);
			bqg.n(5888);
		}
	}

	private void q() {
		float float2 = this.h.f.j(1.0F);
		if (!this.h.u.j) {
			float2 /= 2.0F;
		}

		if (float2 != 0.0F) {
			this.j.setSeed((long)this.m * 312987231L);
			sn sn3 = this.h.aa();
			ajs ajs4 = this.h.f;
			co co5 = new co(sn3);
			int integer6 = 10;
			double double7 = 0.0;
			double double9 = 0.0;
			double double11 = 0.0;
			int integer13 = 0;
			int integer14 = (int)(100.0F * float2 * float2);
			if (this.h.u.aD == 1) {
				integer14 >>= 1;
			} else if (this.h.u.aD == 2) {
				integer14 = 0;
			}

			for (int integer15 = 0; integer15 < integer14; integer15++) {
				co co16 = ajs4.p(co5.a(this.j.nextInt(10) - this.j.nextInt(10), 0, this.j.nextInt(10) - this.j.nextInt(10)));
				akf akf17 = ajs4.b(co16);
				co co18 = co16.b();
				atl atl19 = ajs4.o(co18);
				if (co16.q() <= co5.q() + 10 && co16.q() >= co5.q() - 10 && akf17.d() && akf17.a(co16) >= 0.15F) {
					double double20 = this.j.nextDouble();
					double double22 = this.j.nextDouble();
					bdt bdt24 = atl19.d(ajs4, co18);
					if (atl19.a() == azs.i || atl19.v() == alv.df) {
						this.h
							.f
							.a(de.SMOKE_NORMAL, (double)co16.p() + double20, (double)((float)co16.q() + 0.1F) - bdt24.b, (double)co16.r() + double22, 0.0, 0.0, 0.0, new int[0]);
					} else if (atl19.a() != azs.a) {
						if (this.j.nextInt(++integer13) == 0) {
							double7 = (double)co18.p() + double20;
							double9 = (double)((float)co18.q() + 0.1F) + bdt24.e - 1.0;
							double11 = (double)co18.r() + double22;
						}

						this.h
							.f
							.a(de.WATER_DROP, (double)co18.p() + double20, (double)((float)co18.q() + 0.1F) + bdt24.e, (double)co18.r() + double22, 0.0, 0.0, 0.0, new int[0]);
					}
				}
			}

			if (integer13 > 0 && this.j.nextInt(3) < this.N++) {
				this.N = 0;
				if (double9 > (double)(co5.q() + 1) && ajs4.p(co5).q() > ot.d((float)co5.q())) {
					this.h.f.a(double7, double9, double11, nn.hs, no.WEATHER, 0.1F, 0.5F, false);
				} else {
					this.h.f.a(double7, double9, double11, nn.hr, no.WEATHER, 0.2F, 1.0F, false);
				}
			}
		}
	}

	protected void c(float float1) {
		float float3 = this.h.f.j(float1);
		if (!(float3 <= 0.0F)) {
			this.i();
			sn sn4 = this.h.aa();
			ajs ajs5 = this.h.f;
			int integer6 = ot.c(sn4.p);
			int integer7 = ot.c(sn4.q);
			int integer8 = ot.c(sn4.r);
			bqs bqs9 = bqs.a();
			bpy bpy10 = bqs9.c();
			bqg.r();
			bqg.a(0.0F, 1.0F, 0.0F);
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
			bqg.a(516, 0.1F);
			double double11 = sn4.M + (sn4.p - sn4.M) * (double)float1;
			double double13 = sn4.N + (sn4.q - sn4.N) * (double)float1;
			double double15 = sn4.O + (sn4.r - sn4.O) * (double)float1;
			int integer17 = ot.c(double13);
			int integer18 = 5;
			if (this.h.u.j) {
				integer18 = 10;
			}

			int integer19 = -1;
			float float20 = (float)this.m + float1;
			bpy10.c(-double11, -double13, -double15);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			co.a a21 = new co.a();

			for (int integer22 = integer8 - integer18; integer22 <= integer8 + integer18; integer22++) {
				for (int integer23 = integer6 - integer18; integer23 <= integer6 + integer18; integer23++) {
					int integer24 = (integer22 - integer8 + 16) * 32 + integer23 - integer6 + 16;
					double double25 = (double)this.O[integer24] * 0.5;
					double double27 = (double)this.P[integer24] * 0.5;
					a21.c(integer23, 0, integer22);
					akf akf29 = ajs5.b(a21);
					if (akf29.d() || akf29.c()) {
						int integer30 = ajs5.p(a21).q();
						int integer31 = integer7 - integer18;
						int integer32 = integer7 + integer18;
						if (integer31 < integer30) {
							integer31 = integer30;
						}

						if (integer32 < integer30) {
							integer32 = integer30;
						}

						int integer33 = integer30;
						if (integer30 < integer17) {
							integer33 = integer17;
						}

						if (integer31 != integer32) {
							this.j.setSeed((long)(integer23 * integer23 * 3121 + integer23 * 45238971 ^ integer22 * integer22 * 418711 + integer22 * 13761));
							a21.c(integer23, integer31, integer22);
							float float34 = akf29.a(a21);
							if (ajs5.A().a(float34, integer30) >= 0.15F) {
								if (integer19 != 0) {
									if (integer19 >= 0) {
										bqs9.b();
									}

									integer19 = 0;
									this.h.N().a(f);
									bpy10.a(7, bzh.d);
								}

								double double35 = -(
										(double)(this.m + integer23 * integer23 * 3121 + integer23 * 45238971 + integer22 * integer22 * 418711 + integer22 * 13761 & 31) + (double)float1
									)
									/ 32.0
									* (3.0 + this.j.nextDouble());
								double double37 = (double)((float)integer23 + 0.5F) - sn4.p;
								double double39 = (double)((float)integer22 + 0.5F) - sn4.r;
								float float41 = ot.a(double37 * double37 + double39 * double39) / (float)integer18;
								float float42 = ((1.0F - float41 * float41) * 0.5F + 0.5F) * float3;
								a21.c(integer23, integer33, integer22);
								int integer43 = ajs5.b(a21, 0);
								int integer44 = integer43 >> 16 & 65535;
								int integer45 = integer43 & 65535;
								bpy10.b((double)integer23 - double25 + 0.5, (double)integer32, (double)integer22 - double27 + 0.5)
									.a(0.0, (double)integer31 * 0.25 + double35)
									.a(1.0F, 1.0F, 1.0F, float42)
									.a(integer44, integer45)
									.d();
								bpy10.b((double)integer23 + double25 + 0.5, (double)integer32, (double)integer22 + double27 + 0.5)
									.a(1.0, (double)integer31 * 0.25 + double35)
									.a(1.0F, 1.0F, 1.0F, float42)
									.a(integer44, integer45)
									.d();
								bpy10.b((double)integer23 + double25 + 0.5, (double)integer31, (double)integer22 + double27 + 0.5)
									.a(1.0, (double)integer32 * 0.25 + double35)
									.a(1.0F, 1.0F, 1.0F, float42)
									.a(integer44, integer45)
									.d();
								bpy10.b((double)integer23 - double25 + 0.5, (double)integer31, (double)integer22 - double27 + 0.5)
									.a(0.0, (double)integer32 * 0.25 + double35)
									.a(1.0F, 1.0F, 1.0F, float42)
									.a(integer44, integer45)
									.d();
							} else {
								if (integer19 != 1) {
									if (integer19 >= 0) {
										bqs9.b();
									}

									integer19 = 1;
									this.h.N().a(g);
									bpy10.a(7, bzh.d);
								}

								double double35 = (double)(-((float)(this.m & 511) + float1) / 512.0F);
								double double37 = this.j.nextDouble() + (double)float20 * 0.01 * (double)((float)this.j.nextGaussian());
								double double39 = this.j.nextDouble() + (double)(float20 * (float)this.j.nextGaussian()) * 0.001;
								double double41 = (double)((float)integer23 + 0.5F) - sn4.p;
								double double43 = (double)((float)integer22 + 0.5F) - sn4.r;
								float float45 = ot.a(double41 * double41 + double43 * double43) / (float)integer18;
								float float46 = ((1.0F - float45 * float45) * 0.3F + 0.5F) * float3;
								a21.c(integer23, integer33, integer22);
								int integer47 = (ajs5.b(a21, 0) * 3 + 15728880) / 4;
								int integer48 = integer47 >> 16 & 65535;
								int integer49 = integer47 & 65535;
								bpy10.b((double)integer23 - double25 + 0.5, (double)integer32, (double)integer22 - double27 + 0.5)
									.a(0.0 + double37, (double)integer31 * 0.25 + double35 + double39)
									.a(1.0F, 1.0F, 1.0F, float46)
									.a(integer48, integer49)
									.d();
								bpy10.b((double)integer23 + double25 + 0.5, (double)integer32, (double)integer22 + double27 + 0.5)
									.a(1.0 + double37, (double)integer31 * 0.25 + double35 + double39)
									.a(1.0F, 1.0F, 1.0F, float46)
									.a(integer48, integer49)
									.d();
								bpy10.b((double)integer23 + double25 + 0.5, (double)integer31, (double)integer22 + double27 + 0.5)
									.a(1.0 + double37, (double)integer32 * 0.25 + double35 + double39)
									.a(1.0F, 1.0F, 1.0F, float46)
									.a(integer48, integer49)
									.d();
								bpy10.b((double)integer23 - double25 + 0.5, (double)integer31, (double)integer22 - double27 + 0.5)
									.a(0.0 + double37, (double)integer32 * 0.25 + double35 + double39)
									.a(1.0F, 1.0F, 1.0F, float46)
									.a(integer48, integer49)
									.d();
							}
						}
					}
				}
			}

			if (integer19 >= 0) {
				bqs9.b();
			}

			bpy10.c(0.0, 0.0, 0.0);
			bqg.q();
			bqg.l();
			bqg.a(516, 0.1F);
			this.h();
		}
	}

	public void j() {
		bfk bfk2 = new bfk(this.h);
		bqg.m(256);
		bqg.n(5889);
		bqg.F();
		bqg.a(0.0, bfk2.c(), bfk2.d(), 0.0, 1000.0, 3000.0);
		bqg.n(5888);
		bqg.F();
		bqg.c(0.0F, 0.0F, -2000.0F);
	}

	private void h(float float1) {
		ajs ajs3 = this.h.f;
		sn sn4 = this.h.aa();
		float float5 = 0.25F + 0.75F * (float)this.h.u.d / 32.0F;
		float5 = 1.0F - (float)Math.pow((double)float5, 0.25);
		bdw bdw6 = ajs3.a(this.h.aa(), float1);
		float float7 = (float)bdw6.b;
		float float8 = (float)bdw6.c;
		float float9 = (float)bdw6.d;
		bdw bdw10 = ajs3.f(float1);
		this.R = (float)bdw10.b;
		this.S = (float)bdw10.c;
		this.T = (float)bdw10.d;
		if (this.h.u.d >= 4) {
			double double11 = ot.a(ajs3.d(float1)) > 0.0F ? -1.0 : 1.0;
			bdw bdw13 = new bdw(double11, 0.0, 0.0);
			float float14 = (float)sn4.f(float1).b(bdw13);
			if (float14 < 0.0F) {
				float14 = 0.0F;
			}

			if (float14 > 0.0F) {
				float[] arr15 = ajs3.s.a(ajs3.c(float1), float1);
				if (arr15 != null) {
					float14 *= arr15[3];
					this.R = this.R * (1.0F - float14) + arr15[0] * float14;
					this.S = this.S * (1.0F - float14) + arr15[1] * float14;
					this.T = this.T * (1.0F - float14) + arr15[2] * float14;
				}
			}
		}

		this.R = this.R + (float7 - this.R) * float5;
		this.S = this.S + (float8 - this.S) * float5;
		this.T = this.T + (float9 - this.T) * float5;
		float float11 = ajs3.j(float1);
		if (float11 > 0.0F) {
			float float12 = 1.0F - float11 * 0.5F;
			float float13 = 1.0F - float11 * 0.4F;
			this.R *= float12;
			this.S *= float12;
			this.T *= float13;
		}

		float float12 = ajs3.h(float1);
		if (float12 > 0.0F) {
			float float13 = 1.0F - float12 * 0.5F;
			this.R *= float13;
			this.S *= float13;
			this.T *= float13;
		}

		atl atl13 = ben.a(this.h.f, sn4, float1);
		if (this.B) {
			bdw bdw14 = ajs3.e(float1);
			this.R = (float)bdw14.b;
			this.S = (float)bdw14.c;
			this.T = (float)bdw14.d;
		} else if (atl13.a() == azs.h) {
			float float14x = 0.0F;
			if (sn4 instanceof sw) {
				float14x = (float)aik.d((sw)sn4) * 0.2F;
				if (((sw)sn4).a(si.m)) {
					float14x = float14x * 0.3F + 0.6F;
				}
			}

			this.R = 0.02F + float14x;
			this.S = 0.02F + float14x;
			this.T = 0.2F + float14x;
		} else if (atl13.a() == azs.i) {
			this.R = 0.6F;
			this.S = 0.1F;
			this.T = 0.0F;
		}

		float float14x = this.U + (this.V - this.U) * float1;
		this.R *= float14x;
		this.S *= float14x;
		this.T *= float14x;
		double double15 = (sn4.N + (sn4.q - sn4.N) * (double)float1) * ajs3.s.j();
		if (sn4 instanceof sw && ((sw)sn4).a(si.o)) {
			int integer17 = ((sw)sn4).b(si.o).b();
			if (integer17 < 20) {
				double15 *= (double)(1.0F - (float)integer17 / 20.0F);
			} else {
				double15 = 0.0;
			}
		}

		if (double15 < 1.0) {
			if (double15 < 0.0) {
				double15 = 0.0;
			}

			double15 *= double15;
			this.R = (float)((double)this.R * double15);
			this.S = (float)((double)this.S * double15);
			this.T = (float)((double)this.T * double15);
		}

		if (this.z > 0.0F) {
			float float17 = this.A + (this.z - this.A) * float1;
			this.R = this.R * (1.0F - float17) + this.R * 0.7F * float17;
			this.S = this.S * (1.0F - float17) + this.S * 0.6F * float17;
			this.T = this.T * (1.0F - float17) + this.T * 0.6F * float17;
		}

		if (sn4 instanceof sw && ((sw)sn4).a(si.p)) {
			float float17 = this.a((sw)sn4, float1);
			float float18 = 1.0F / this.R;
			if (float18 > 1.0F / this.S) {
				float18 = 1.0F / this.S;
			}

			if (float18 > 1.0F / this.T) {
				float18 = 1.0F / this.T;
			}

			this.R = this.R * (1.0F - float17) + this.R * float18 * float17;
			this.S = this.S * (1.0F - float17) + this.S * float18 * float17;
			this.T = this.T * (1.0F - float17) + this.T * float18 * float17;
		}

		if (this.h.u.f) {
			float float17x = (this.R * 30.0F + this.S * 59.0F + this.T * 11.0F) / 100.0F;
			float float18x = (this.R * 30.0F + this.S * 70.0F) / 100.0F;
			float float19 = (this.R * 30.0F + this.T * 70.0F) / 100.0F;
			this.R = float17x;
			this.S = float18x;
			this.T = float19;
		}

		bqg.a(this.R, this.S, this.T, 0.0F);
	}

	private void a(int integer, float float2) {
		sn sn4 = this.h.aa();
		this.d(false);
		bqg.a(0.0F, -1.0F, 0.0F);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		atl atl5 = ben.a(this.h.f, sn4, float2);
		if (sn4 instanceof sw && ((sw)sn4).a(si.o)) {
			float float6 = 5.0F;
			int integer7 = ((sw)sn4).b(si.o).b();
			if (integer7 < 20) {
				float6 = 5.0F + (this.k - 5.0F) * (1.0F - (float)integer7 / 20.0F);
			}

			bqg.a(bqg.m.LINEAR);
			if (integer == -1) {
				bqg.b(0.0F);
				bqg.c(float6 * 0.8F);
			} else {
				bqg.b(float6 * 0.25F);
				bqg.c(float6);
			}

			if (GLContext.getCapabilities().GL_NV_fog_distance) {
				bqg.c(34138, 34139);
			}
		} else if (this.B) {
			bqg.a(bqg.m.EXP);
			bqg.a(0.1F);
		} else if (atl5.a() == azs.h) {
			bqg.a(bqg.m.EXP);
			if (sn4 instanceof sw) {
				if (((sw)sn4).a(si.m)) {
					bqg.a(0.01F);
				} else {
					bqg.a(0.1F - (float)aik.d((sw)sn4) * 0.03F);
				}
			} else {
				bqg.a(0.1F);
			}
		} else if (atl5.a() == azs.i) {
			bqg.a(bqg.m.EXP);
			bqg.a(2.0F);
		} else {
			float float6x = this.k;
			bqg.a(bqg.m.LINEAR);
			if (integer == -1) {
				bqg.b(0.0F);
				bqg.c(float6x);
			} else {
				bqg.b(float6x * 0.75F);
				bqg.c(float6x);
			}

			if (GLContext.getCapabilities().GL_NV_fog_distance) {
				bqg.c(34138, 34139);
			}

			if (this.h.f.s.b((int)sn4.p, (int)sn4.r) || this.h.r.j().f()) {
				bqg.b(float6x * 0.05F);
				bqg.c(Math.min(float6x, 192.0F) * 0.5F);
			}
		}

		bqg.h();
		bqg.o();
		bqg.a(1028, 4608);
	}

	public void d(boolean boolean1) {
		if (boolean1) {
			bqg.b(2918, this.a(0.0F, 0.0F, 0.0F, 1.0F));
		} else {
			bqg.b(2918, this.a(this.R, this.S, this.T, 1.0F));
		}
	}

	private FloatBuffer a(float float1, float float2, float float3, float float4) {
		this.Q.clear();
		this.Q.put(float1).put(float2).put(float3).put(float4);
		this.Q.flip();
		return this.Q;
	}

	public void k() {
		this.ab = null;
		this.l.a();
	}

	public bfj l() {
		return this.l;
	}

	public static void a(
		bfg bfg, String string, float float3, float float4, float float5, int integer, float float7, float float8, boolean boolean9, boolean boolean10
	) {
		bqg.G();
		bqg.c(float3, float4, float5);
		bqg.a(0.0F, 1.0F, 0.0F);
		bqg.b(-float7, 0.0F, 1.0F, 0.0F);
		bqg.b((float)(boolean9 ? -1 : 1) * float8, 1.0F, 0.0F, 0.0F);
		bqg.b(-0.025F, -0.025F, 0.025F);
		bqg.g();
		bqg.a(false);
		if (!boolean10) {
			bqg.j();
		}

		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		int integer11 = bfg.a(string) / 2;
		bqg.z();
		bqs bqs12 = bqs.a();
		bpy bpy13 = bqs12.c();
		bpy13.a(7, bzh.f);
		bpy13.b((double)(-integer11 - 1), (double)(-1 + integer), 0.0).a(0.0F, 0.0F, 0.0F, 0.25F).d();
		bpy13.b((double)(-integer11 - 1), (double)(8 + integer), 0.0).a(0.0F, 0.0F, 0.0F, 0.25F).d();
		bpy13.b((double)(integer11 + 1), (double)(8 + integer), 0.0).a(0.0F, 0.0F, 0.0F, 0.25F).d();
		bpy13.b((double)(integer11 + 1), (double)(-1 + integer), 0.0).a(0.0F, 0.0F, 0.0F, 0.25F).d();
		bqs12.b();
		bqg.y();
		if (!boolean10) {
			bfg.a(string, -bfg.a(string) / 2, integer, 553648127);
			bqg.k();
		}

		bqg.a(true);
		bfg.a(string, -bfg.a(string) / 2, integer, boolean10 ? 553648127 : -1);
		bqg.f();
		bqg.l();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.H();
	}

	public void a(afj afj) {
		this.ab = afj;
		this.ac = 40;
		this.ad = this.j.nextFloat() * 2.0F - 1.0F;
		this.ae = this.j.nextFloat() * 2.0F - 1.0F;
	}

	private void a(int integer1, int integer2, float float3) {
		if (this.ab != null && this.ac > 0) {
			int integer5 = 40 - this.ac;
			float float6 = ((float)integer5 + float3) / 40.0F;
			float float7 = float6 * float6;
			float float8 = float6 * float7;
			float float9 = 10.25F * float8 * float7 + -24.95F * float7 * float7 + 25.5F * float8 + -13.8F * float7 + 4.0F * float6;
			float float10 = float9 * (float) Math.PI;
			float float11 = this.ad * (float)(integer1 / 4);
			float float12 = this.ae * (float)(integer2 / 4);
			bqg.e();
			bqg.G();
			bqg.a();
			bqg.k();
			bqg.r();
			beq.b();
			bqg.c((float)(integer1 / 2) + float11 * ot.e(ot.a(float10 * 2.0F)), (float)(integer2 / 2) + float12 * ot.e(ot.a(float10 * 2.0F)), -50.0F);
			float float13 = 50.0F + 175.0F * ot.a(float10);
			bqg.b(float13, -float13, float13);
			bqg.b(900.0F * ot.e(ot.a(float10)), 0.0F, 1.0F, 0.0F);
			bqg.b(6.0F * ot.b(float6 * 8.0F), 1.0F, 0.0F, 0.0F);
			bqg.b(6.0F * ot.b(float6 * 8.0F), 0.0F, 0.0F, 1.0F);
			this.h.ad().a(this.ab, brq.b.FIXED);
			bqg.c();
			bqg.H();
			beq.a();
			bqg.q();
			bqg.j();
		}
	}
}
