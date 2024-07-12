import com.google.common.collect.Lists;
import java.nio.FloatBuffer;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class bvl<T extends sw> extends bus<T> {
	private static final Logger a = LogManager.getLogger();
	private static final byp j = new byp(16, 16);
	protected blv f;
	protected FloatBuffer g = ber.h(4);
	protected List<bxp<T>> h = Lists.newArrayList();
	protected boolean i;

	public bvl(bur bur, blv blv, float float3) {
		super(bur);
		this.f = blv;
		this.c = float3;
	}

	protected <V extends sw, U extends bxp<V>> boolean a(U bxp) {
		return this.h.add(bxp);
	}

	public blv b() {
		return this.f;
	}

	protected float a(float float1, float float2, float float3) {
		float float5 = float2 - float1;

		while (float5 < -180.0F) {
			float5 += 360.0F;
		}

		while (float5 >= 180.0F) {
			float5 -= 360.0F;
		}

		return float1 + float3 * float5;
	}

	public void M_() {
	}

	public void a(T sw, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		bqg.r();
		this.f.o = this.e(sw, float6);
		this.f.p = sw.aK();
		this.f.q = sw.l_();

		try {
			float float11 = this.a(sw.aO, sw.aN, float6);
			float float12 = this.a(sw.aQ, sw.aP, float6);
			float float13 = float12 - float11;
			if (sw.aK() && sw.bB() instanceof sw) {
				sw sw14 = (sw)sw.bB();
				float11 = this.a(sw14.aO, sw14.aN, float6);
				float13 = float12 - float11;
				float float15 = ot.g(float13);
				if (float15 < -85.0F) {
					float15 = -85.0F;
				}

				if (float15 >= 85.0F) {
					float15 = 85.0F;
				}

				float11 = float12 - float15;
				if (float15 * float15 > 2500.0F) {
					float11 += float15 * 0.2F;
				}
			}

			float float14 = sw.y + (sw.w - sw.y) * float6;
			this.a(sw, double2, double3, double4);
			float float15x = this.b(sw, float6);
			this.a(sw, float15x, float11, float6);
			float float16 = this.c(sw, float6);
			float float17 = 0.0F;
			float float18 = 0.0F;
			if (!sw.aK()) {
				float17 = sw.aF + (sw.aG - sw.aF) * float6;
				float18 = sw.aH - sw.aG * (1.0F - float6);
				if (sw.l_()) {
					float18 *= 3.0F;
				}

				if (float17 > 1.0F) {
					float17 = 1.0F;
				}
			}

			bqg.e();
			this.f.a(sw, float18, float17, float6);
			this.f.a(float18, float17, float15x, float13, float14, float16, sw);
			if (this.e) {
				boolean boolean19 = this.c(sw);
				bqg.h();
				bqg.e(this.c(sw));
				if (!this.i) {
					this.a(sw, float18, float17, float15x, float13, float14, float16);
				}

				if (!(sw instanceof aay) || !((aay)sw).y()) {
					this.a(sw, float18, float17, float6, float15x, float13, float14, float16);
				}

				bqg.n();
				bqg.i();
				if (boolean19) {
					this.f();
				}
			} else {
				boolean boolean19x = this.d(sw, float6);
				this.a(sw, float18, float17, float15x, float13, float14, float16);
				if (boolean19x) {
					this.g();
				}

				bqg.a(true);
				if (!(sw instanceof aay) || !((aay)sw).y()) {
					this.a(sw, float18, float17, float6, float15x, float13, float14, float16);
				}
			}

			bqg.E();
		} catch (Exception var19) {
			a.error("Couldn't render entity", var19);
		}

		bqg.g(cdb.r);
		bqg.y();
		bqg.g(cdb.q);
		bqg.q();
		bqg.H();
		super.a(sw, double2, double3, double4, float5, float6);
	}

	public float c(T sw, float float2) {
		bqg.D();
		bqg.b(-1.0F, -1.0F, 1.0F);
		this.a(sw, float2);
		float float4 = 0.0625F;
		bqg.c(0.0F, -1.501F, 0.0F);
		return 0.0625F;
	}

	protected boolean c(T sw) {
		bqg.g();
		bqg.g(cdb.r);
		bqg.z();
		bqg.g(cdb.q);
		return true;
	}

	protected void f() {
		bqg.f();
		bqg.g(cdb.r);
		bqg.y();
		bqg.g(cdb.q);
	}

	protected void a(T sw, float float2, float float3, float float4, float float5, float float6, float float7) {
		boolean boolean9 = !sw.aP() || this.e;
		boolean boolean10 = !boolean9 && !sw.e(bes.z().h);
		if (boolean9 || boolean10) {
			if (!this.d(sw)) {
				return;
			}

			if (boolean10) {
				bqg.a(bqg.q.TRANSPARENT_MODEL);
			}

			this.f.a(sw, float2, float3, float4, float5, float6, float7);
			if (boolean10) {
				bqg.b(bqg.q.TRANSPARENT_MODEL);
			}
		}
	}

	protected boolean d(T sw, float float2) {
		return this.a(sw, float2, true);
	}

	protected boolean a(T sw, float float2, boolean boolean3) {
		float float5 = sw.e(float2);
		int integer6 = this.a(sw, float5, float2);
		boolean boolean7 = (integer6 >> 24 & 0xFF) > 0;
		boolean boolean8 = sw.ay > 0 || sw.aB > 0;
		if (!boolean7 && !boolean8) {
			return false;
		} else if (!boolean7 && !boolean3) {
			return false;
		} else {
			bqg.g(cdb.q);
			bqg.y();
			bqg.a(8960, 8704, cdb.t);
			bqg.a(8960, cdb.y, 8448);
			bqg.a(8960, cdb.z, cdb.q);
			bqg.a(8960, cdb.A, cdb.v);
			bqg.a(8960, cdb.C, 768);
			bqg.a(8960, cdb.D, 768);
			bqg.a(8960, cdb.F, 7681);
			bqg.a(8960, cdb.G, cdb.q);
			bqg.a(8960, cdb.J, 770);
			bqg.g(cdb.r);
			bqg.y();
			bqg.a(8960, 8704, cdb.t);
			bqg.a(8960, cdb.y, cdb.u);
			bqg.a(8960, cdb.z, cdb.w);
			bqg.a(8960, cdb.A, cdb.x);
			bqg.a(8960, cdb.B, cdb.w);
			bqg.a(8960, cdb.C, 768);
			bqg.a(8960, cdb.D, 768);
			bqg.a(8960, cdb.E, 770);
			bqg.a(8960, cdb.F, 7681);
			bqg.a(8960, cdb.G, cdb.x);
			bqg.a(8960, cdb.J, 770);
			this.g.position(0);
			if (boolean8) {
				this.g.put(1.0F);
				this.g.put(0.0F);
				this.g.put(0.0F);
				this.g.put(0.3F);
			} else {
				float float9 = (float)(integer6 >> 24 & 0xFF) / 255.0F;
				float float10 = (float)(integer6 >> 16 & 0xFF) / 255.0F;
				float float11 = (float)(integer6 >> 8 & 0xFF) / 255.0F;
				float float12 = (float)(integer6 & 0xFF) / 255.0F;
				this.g.put(float10);
				this.g.put(float11);
				this.g.put(float12);
				this.g.put(1.0F - float9);
			}

			this.g.flip();
			bqg.b(8960, 8705, this.g);
			bqg.g(cdb.s);
			bqg.y();
			bqg.i(j.b());
			bqg.a(8960, 8704, cdb.t);
			bqg.a(8960, cdb.y, 8448);
			bqg.a(8960, cdb.z, cdb.x);
			bqg.a(8960, cdb.A, cdb.r);
			bqg.a(8960, cdb.C, 768);
			bqg.a(8960, cdb.D, 768);
			bqg.a(8960, cdb.F, 7681);
			bqg.a(8960, cdb.G, cdb.x);
			bqg.a(8960, cdb.J, 770);
			bqg.g(cdb.q);
			return true;
		}
	}

	protected void g() {
		bqg.g(cdb.q);
		bqg.y();
		bqg.a(8960, 8704, cdb.t);
		bqg.a(8960, cdb.y, 8448);
		bqg.a(8960, cdb.z, cdb.q);
		bqg.a(8960, cdb.A, cdb.v);
		bqg.a(8960, cdb.C, 768);
		bqg.a(8960, cdb.D, 768);
		bqg.a(8960, cdb.F, 8448);
		bqg.a(8960, cdb.G, cdb.q);
		bqg.a(8960, cdb.H, cdb.v);
		bqg.a(8960, cdb.J, 770);
		bqg.a(8960, cdb.K, 770);
		bqg.g(cdb.r);
		bqg.a(8960, 8704, cdb.t);
		bqg.a(8960, cdb.y, 8448);
		bqg.a(8960, cdb.C, 768);
		bqg.a(8960, cdb.D, 768);
		bqg.a(8960, cdb.z, 5890);
		bqg.a(8960, cdb.A, cdb.x);
		bqg.a(8960, cdb.F, 8448);
		bqg.a(8960, cdb.J, 770);
		bqg.a(8960, cdb.G, 5890);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.g(cdb.s);
		bqg.z();
		bqg.i(0);
		bqg.a(8960, 8704, cdb.t);
		bqg.a(8960, cdb.y, 8448);
		bqg.a(8960, cdb.C, 768);
		bqg.a(8960, cdb.D, 768);
		bqg.a(8960, cdb.z, 5890);
		bqg.a(8960, cdb.A, cdb.x);
		bqg.a(8960, cdb.F, 8448);
		bqg.a(8960, cdb.J, 770);
		bqg.a(8960, cdb.G, 5890);
		bqg.g(cdb.q);
	}

	protected void a(T sw, double double2, double double3, double double4) {
		bqg.c((float)double2, (float)double3, (float)double4);
	}

	protected void a(T sw, float float2, float float3, float float4) {
		bqg.b(180.0F - float3, 0.0F, 1.0F, 0.0F);
		if (sw.aB > 0) {
			float float6 = ((float)sw.aB + float4 - 1.0F) / 20.0F * 1.6F;
			float6 = ot.c(float6);
			if (float6 > 1.0F) {
				float6 = 1.0F;
			}

			bqg.b(float6 * this.b(sw), 0.0F, 0.0F, 1.0F);
		} else {
			String string6 = a.a(sw.h_());
			if (string6 != null && ("Dinnerbone".equals(string6) || "Grumm".equals(string6)) && (!(sw instanceof aay) || ((aay)sw).a(aaz.CAPE))) {
				bqg.c(0.0F, sw.H + 0.1F, 0.0F);
				bqg.b(180.0F, 0.0F, 0.0F, 1.0F);
			}
		}
	}

	protected float e(T sw, float float2) {
		return sw.m(float2);
	}

	protected float b(T sw, float float2) {
		return (float)sw.T + float2;
	}

	protected void a(T sw, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
		for (bxp<T> bxp11 : this.h) {
			boolean boolean12 = this.a(sw, float4, bxp11.a());
			bxp11.a(sw, float2, float3, float4, float5, float6, float7, float8);
			if (boolean12) {
				this.g();
			}
		}
	}

	protected float b(T sw) {
		return 90.0F;
	}

	protected int a(T sw, float float2, float float3) {
		return 0;
	}

	protected void a(T sw, float float2) {
	}

	public void a(T sw, double double2, double double3, double double4) {
		if (this.a(sw)) {
			double double9 = sw.h(this.b.c);
			float float11 = sw.aM() ? 32.0F : 64.0F;
			if (!(double9 >= (double)(float11 * float11))) {
				String string12 = sw.i_().d();
				bqg.a(516, 0.1F);
				this.a(sw, double2, double3, double4, string12, double9);
			}
		}
	}

	protected boolean b(T sw) {
		bps bps3 = bes.z().h;
		boolean boolean4 = !sw.e(bps3);
		if (sw != bps3) {
			bee bee5 = sw.aQ();
			bee bee6 = bps3.aQ();
			if (bee5 != null) {
				bee.b b7 = bee5.i();
				switch (b7) {
					case ALWAYS:
						return boolean4;
					case NEVER:
						return false;
					case HIDE_FOR_OTHER_TEAMS:
						return bee6 == null ? boolean4 : bee5.a(bee6) && (bee5.h() || boolean4);
					case HIDE_FOR_OWN_TEAM:
						return bee6 == null ? boolean4 : !bee5.a(bee6) && boolean4;
					default:
						return true;
				}
			}
		}

		return bes.w() && sw != this.b.c && boolean4 && !sw.aL();
	}

	static {
		int[] arr1 = j.e();

		for (int integer2 = 0; integer2 < 256; integer2++) {
			arr1[integer2] = -1;
		}

		j.d();
	}
}
