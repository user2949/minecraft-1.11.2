import javax.annotation.Nullable;

public abstract class bus<T extends sn> {
	private static final kq a = new kq("textures/misc/shadow.png");
	protected final bur b;
	protected float c;
	protected float d = 1.0F;
	protected boolean e;

	protected bus(bur bur) {
		this.b = bur;
	}

	public void a(boolean boolean1) {
		this.e = boolean1;
	}

	public boolean a(T sn, btl btl, double double3, double double4, double double5) {
		bdt bdt10 = sn.bp().g(0.5);
		if (bdt10.b() || bdt10.a() == 0.0) {
			bdt10 = new bdt(sn.p - 2.0, sn.q - 2.0, sn.r - 2.0, sn.p + 2.0, sn.q + 2.0, sn.r + 2.0);
		}

		return sn.g(double3, double4, double5) && (sn.ah || btl.a(bdt10));
	}

	public void a(T sn, double double2, double double3, double double4, float float5, float float6) {
		if (!this.e) {
			this.a(sn, double2, double3, double4);
		}
	}

	protected int c(T sn) {
		int integer3 = 16777215;
		bdz bdz4 = (bdz)sn.aQ();
		if (bdz4 != null) {
			String string5 = bfg.b(bdz4.e());
			if (string5.length() >= 2) {
				integer3 = this.d().b(string5.charAt(1));
			}
		}

		return integer3;
	}

	protected void a(T sn, double double2, double double3, double double4) {
		if (this.b(sn)) {
			this.a(sn, sn.i_().d(), double2, double3, double4, 64);
		}
	}

	protected boolean b(T sn) {
		return sn.bk() && sn.n_();
	}

	protected void a(T sn, double double2, double double3, double double4, String string, double double6) {
		this.a(sn, string, double2, double3, double4, 64);
	}

	@Nullable
	protected abstract kq a(T sn);

	protected boolean d(T sn) {
		kq kq3 = this.a(sn);
		if (kq3 == null) {
			return false;
		} else {
			this.a(kq3);
			return true;
		}
	}

	public void a(kq kq) {
		this.b.a.a(kq);
	}

	private void a(sn sn, double double2, double double3, double double4, float float5) {
		bqg.g();
		byy byy10 = bes.z().R();
		byz byz11 = byy10.a("minecraft:blocks/fire_layer_0");
		byz byz12 = byy10.a("minecraft:blocks/fire_layer_1");
		bqg.G();
		bqg.c((float)double2, (float)double3, (float)double4);
		float float13 = sn.G * 1.4F;
		bqg.b(float13, float13, float13);
		bqs bqs14 = bqs.a();
		bpy bpy15 = bqs14.c();
		float float16 = 0.5F;
		float float17 = 0.0F;
		float float18 = sn.H / float13;
		float float19 = (float)(sn.q - sn.bo().b);
		bqg.b(-this.b.e, 0.0F, 1.0F, 0.0F);
		bqg.c(0.0F, 0.0F, -0.3F + (float)((int)float18) * 0.02F);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		float float20 = 0.0F;
		int integer21 = 0;
		bpy15.a(7, bzh.g);

		while (float18 > 0.0F) {
			byz byz22 = integer21 % 2 == 0 ? byz11 : byz12;
			this.a(byy.g);
			float float23 = byz22.e();
			float float24 = byz22.g();
			float float25 = byz22.f();
			float float26 = byz22.h();
			if (integer21 / 2 % 2 == 0) {
				float float27 = float25;
				float25 = float23;
				float23 = float27;
			}

			bpy15.b((double)(float16 - 0.0F), (double)(0.0F - float19), (double)float20).a((double)float25, (double)float26).d();
			bpy15.b((double)(-float16 - 0.0F), (double)(0.0F - float19), (double)float20).a((double)float23, (double)float26).d();
			bpy15.b((double)(-float16 - 0.0F), (double)(1.4F - float19), (double)float20).a((double)float23, (double)float24).d();
			bpy15.b((double)(float16 - 0.0F), (double)(1.4F - float19), (double)float20).a((double)float25, (double)float24).d();
			float18 -= 0.45F;
			float19 -= 0.45F;
			float16 *= 0.9F;
			float20 += 0.03F;
			integer21++;
		}

		bqs14.b();
		bqg.H();
		bqg.f();
	}

	private void d(sn sn, double double2, double double3, double double4, float float5, float float6) {
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
		this.b.a.a(a);
		ajs ajs11 = this.b();
		bqg.a(false);
		float float12 = this.c;
		if (sn instanceof sx) {
			sx sx13 = (sx)sn;
			float12 *= sx13.cO();
			if (sx13.l_()) {
				float12 *= 0.5F;
			}
		}

		double double13 = sn.M + (sn.p - sn.M) * (double)float6;
		double double15 = sn.N + (sn.q - sn.N) * (double)float6;
		double double17 = sn.O + (sn.r - sn.O) * (double)float6;
		int integer19 = ot.c(double13 - (double)float12);
		int integer20 = ot.c(double13 + (double)float12);
		int integer21 = ot.c(double15 - (double)float12);
		int integer22 = ot.c(double15);
		int integer23 = ot.c(double17 - (double)float12);
		int integer24 = ot.c(double17 + (double)float12);
		double double25 = double2 - double13;
		double double27 = double3 - double15;
		double double29 = double4 - double17;
		bqs bqs31 = bqs.a();
		bpy bpy32 = bqs31.c();
		bpy32.a(7, bzh.i);

		for (co co34 : co.b(new co(integer19, integer21, integer23), new co(integer20, integer22, integer24))) {
			atl atl35 = ajs11.o(co34.b());
			if (atl35.j() != aqf.INVISIBLE && ajs11.k(co34) > 3) {
				this.a(atl35, double2, double3, double4, co34, float5, float12, double25, double27, double29);
			}
		}

		bqs31.b();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.l();
		bqg.a(true);
	}

	private ajs b() {
		return this.b.b;
	}

	private void a(atl atl, double double2, double double3, double double4, co co, float float6, float float7, double double8, double double9, double double10) {
		if (atl.h()) {
			bqs bqs18 = bqs.a();
			bpy bpy19 = bqs18.c();
			double double20 = ((double)float6 - (double3 - ((double)co.q() + double9)) / 2.0) * 0.5 * (double)this.b().n(co);
			if (!(double20 < 0.0)) {
				if (double20 > 1.0) {
					double20 = 1.0;
				}

				bdt bdt22 = atl.d(this.b(), co);
				double double23 = (double)co.p() + bdt22.a + double8;
				double double25 = (double)co.p() + bdt22.d + double8;
				double double27 = (double)co.q() + bdt22.b + double9 + 0.015625;
				double double29 = (double)co.r() + bdt22.c + double10;
				double double31 = (double)co.r() + bdt22.f + double10;
				float float33 = (float)((double2 - double23) / 2.0 / (double)float7 + 0.5);
				float float34 = (float)((double2 - double25) / 2.0 / (double)float7 + 0.5);
				float float35 = (float)((double4 - double29) / 2.0 / (double)float7 + 0.5);
				float float36 = (float)((double4 - double31) / 2.0 / (double)float7 + 0.5);
				bpy19.b(double23, double27, double29).a((double)float33, (double)float35).a(1.0F, 1.0F, 1.0F, (float)double20).d();
				bpy19.b(double23, double27, double31).a((double)float33, (double)float36).a(1.0F, 1.0F, 1.0F, (float)double20).d();
				bpy19.b(double25, double27, double31).a((double)float34, (double)float36).a(1.0F, 1.0F, 1.0F, (float)double20).d();
				bpy19.b(double25, double27, double29).a((double)float34, (double)float35).a(1.0F, 1.0F, 1.0F, (float)double20).d();
			}
		}
	}

	public static void a(bdt bdt, double double2, double double3, double double4) {
		bqg.z();
		bqs bqs8 = bqs.a();
		bpy bpy9 = bqs8.c();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bpy9.c(double2, double3, double4);
		bpy9.a(7, bzh.h);
		bpy9.b(bdt.a, bdt.e, bdt.c).c(0.0F, 0.0F, -1.0F).d();
		bpy9.b(bdt.d, bdt.e, bdt.c).c(0.0F, 0.0F, -1.0F).d();
		bpy9.b(bdt.d, bdt.b, bdt.c).c(0.0F, 0.0F, -1.0F).d();
		bpy9.b(bdt.a, bdt.b, bdt.c).c(0.0F, 0.0F, -1.0F).d();
		bpy9.b(bdt.a, bdt.b, bdt.f).c(0.0F, 0.0F, 1.0F).d();
		bpy9.b(bdt.d, bdt.b, bdt.f).c(0.0F, 0.0F, 1.0F).d();
		bpy9.b(bdt.d, bdt.e, bdt.f).c(0.0F, 0.0F, 1.0F).d();
		bpy9.b(bdt.a, bdt.e, bdt.f).c(0.0F, 0.0F, 1.0F).d();
		bpy9.b(bdt.a, bdt.b, bdt.c).c(0.0F, -1.0F, 0.0F).d();
		bpy9.b(bdt.d, bdt.b, bdt.c).c(0.0F, -1.0F, 0.0F).d();
		bpy9.b(bdt.d, bdt.b, bdt.f).c(0.0F, -1.0F, 0.0F).d();
		bpy9.b(bdt.a, bdt.b, bdt.f).c(0.0F, -1.0F, 0.0F).d();
		bpy9.b(bdt.a, bdt.e, bdt.f).c(0.0F, 1.0F, 0.0F).d();
		bpy9.b(bdt.d, bdt.e, bdt.f).c(0.0F, 1.0F, 0.0F).d();
		bpy9.b(bdt.d, bdt.e, bdt.c).c(0.0F, 1.0F, 0.0F).d();
		bpy9.b(bdt.a, bdt.e, bdt.c).c(0.0F, 1.0F, 0.0F).d();
		bpy9.b(bdt.a, bdt.b, bdt.f).c(-1.0F, 0.0F, 0.0F).d();
		bpy9.b(bdt.a, bdt.e, bdt.f).c(-1.0F, 0.0F, 0.0F).d();
		bpy9.b(bdt.a, bdt.e, bdt.c).c(-1.0F, 0.0F, 0.0F).d();
		bpy9.b(bdt.a, bdt.b, bdt.c).c(-1.0F, 0.0F, 0.0F).d();
		bpy9.b(bdt.d, bdt.b, bdt.c).c(1.0F, 0.0F, 0.0F).d();
		bpy9.b(bdt.d, bdt.e, bdt.c).c(1.0F, 0.0F, 0.0F).d();
		bpy9.b(bdt.d, bdt.e, bdt.f).c(1.0F, 0.0F, 0.0F).d();
		bpy9.b(bdt.d, bdt.b, bdt.f).c(1.0F, 0.0F, 0.0F).d();
		bqs8.b();
		bpy9.c(0.0, 0.0, 0.0);
		bqg.y();
	}

	public void c(sn sn, double double2, double double3, double double4, float float5, float float6) {
		if (this.b.g != null) {
			if (this.b.g.M && this.c > 0.0F && !sn.aP() && this.b.a()) {
				double double11 = this.b.b(sn.p, sn.q, sn.r);
				float float13 = (float)((1.0 - double11 / 256.0) * (double)this.d);
				if (float13 > 0.0F) {
					this.d(sn, double2, double3, double4, float13, float6);
				}
			}

			if (sn.bd() && (!(sn instanceof aay) || !((aay)sn).y())) {
				this.a(sn, double2, double3, double4, float6);
			}
		}
	}

	public bfg d() {
		return this.b.c();
	}

	protected void a(T sn, String string, double double3, double double4, double double5, int integer) {
		double double11 = sn.h(this.b.c);
		if (!(double11 > (double)(integer * integer))) {
			boolean boolean13 = sn.aM();
			float float14 = this.b.e;
			float float15 = this.b.f;
			boolean boolean16 = this.b.g.as == 2;
			float float17 = sn.H + 0.5F - (boolean13 ? 0.25F : 0.0F);
			int integer18 = "deadmau5".equals(string) ? -10 : 0;
			bqe.a(this.d(), string, (float)double3, (float)double4 + float17, (float)double5, integer18, float14, float15, boolean16, boolean13);
		}
	}

	public bur e() {
		return this.b;
	}

	public boolean K_() {
		return false;
	}

	public void b(T sn, double double2, double double3, double double4, float float5, float float6) {
	}
}
