import com.google.common.base.Objects;

public class bqi {
	private static final kq a = new kq("textures/map/map_background.png");
	private static final kq b = new kq("textures/misc/underwater.png");
	private final bes c;
	private afj d = afj.a;
	private afj e = afj.a;
	private float f;
	private float g;
	private float h;
	private float i;
	private final bur j;
	private final bvh k;

	public bqi(bes bes) {
		this.c = bes;
		this.j = bes.ac();
		this.k = bes.ad();
	}

	public void a(sw sw, afj afj, brq.b b) {
		this.a(sw, afj, b, false);
	}

	public void a(sw sw, afj afj, brq.b b, boolean boolean4) {
		if (!afj.b()) {
			afh afh6 = afj.c();
			alu alu7 = alu.a(afh6);
			bqg.G();
			boolean boolean8 = this.k.a(afj) && alu7.f() == ajk.TRANSLUCENT;
			if (boolean8) {
				bqg.a(false);
			}

			this.k.a(afj, sw, b, boolean4);
			if (boolean8) {
				bqg.a(true);
			}

			bqg.H();
		}
	}

	private void a(float float1, float float2) {
		bqg.G();
		bqg.b(float1, 1.0F, 0.0F, 0.0F);
		bqg.b(float2, 0.0F, 1.0F, 0.0F);
		beq.b();
		bqg.H();
	}

	private void b() {
		bpp bpp2 = this.c.h;
		int integer3 = this.c.f.b(new co(bpp2.p, bpp2.q + (double)bpp2.bq(), bpp2.r), 0);
		float float4 = (float)(integer3 & 65535);
		float float5 = (float)(integer3 >> 16);
		cdb.a(cdb.r, float4, float5);
	}

	private void c(float float1) {
		bps bps3 = this.c.h;
		float float4 = bps3.bU + (bps3.bS - bps3.bU) * float1;
		float float5 = bps3.bT + (bps3.bR - bps3.bT) * float1;
		bqg.b((bps3.w - float4) * 0.1F, 1.0F, 0.0F, 0.0F);
		bqg.b((bps3.v - float5) * 0.1F, 0.0F, 1.0F, 0.0F);
	}

	private float d(float float1) {
		float float3 = 1.0F - float1 / 45.0F + 0.1F;
		float3 = ot.a(float3, 0.0F, 1.0F);
		return -ot.b(float3 * (float) Math.PI) * 0.5F + 0.5F;
	}

	private void c() {
		if (!this.c.h.aP()) {
			bqg.r();
			bqg.G();
			bqg.b(90.0F, 0.0F, 1.0F, 0.0F);
			this.a(sv.RIGHT);
			this.a(sv.LEFT);
			bqg.H();
			bqg.q();
		}
	}

	private void a(sv sv) {
		this.c.N().a(this.c.h.m());
		bus<bpp> bus3 = this.j.a(this.c.h);
		byc byc4 = (byc)bus3;
		bqg.G();
		float float5 = sv == sv.RIGHT ? 1.0F : -1.0F;
		bqg.b(92.0F, 0.0F, 1.0F, 0.0F);
		bqg.b(45.0F, 1.0F, 0.0F, 0.0F);
		bqg.b(float5 * -41.0F, 0.0F, 0.0F, 1.0F);
		bqg.c(float5 * 0.3F, -1.1F, 0.45F);
		if (sv == sv.RIGHT) {
			byc4.b(this.c.h);
		} else {
			byc4.c(this.c.h);
		}

		bqg.H();
	}

	private void a(float float1, sv sv, float float3, afj afj) {
		float float6 = sv == sv.RIGHT ? 1.0F : -1.0F;
		bqg.c(float6 * 0.125F, -0.125F, 0.0F);
		if (!this.c.h.aP()) {
			bqg.G();
			bqg.b(float6 * 10.0F, 0.0F, 0.0F, 1.0F);
			this.a(float1, float3, sv);
			bqg.H();
		}

		bqg.G();
		bqg.c(float6 * 0.51F, -0.08F + float1 * -1.2F, -0.75F);
		float float7 = ot.c(float3);
		float float8 = ot.a(float7 * (float) Math.PI);
		float float9 = -0.5F * float8;
		float float10 = 0.4F * ot.a(float7 * (float) (Math.PI * 2));
		float float11 = -0.3F * ot.a(float3 * (float) Math.PI);
		bqg.c(float6 * float9, float10 - 0.3F * float8, float11);
		bqg.b(float8 * -45.0F, 1.0F, 0.0F, 0.0F);
		bqg.b(float6 * float8 * -30.0F, 0.0F, 1.0F, 0.0F);
		this.a(afj);
		bqg.H();
	}

	private void a(float float1, float float2, float float3) {
		float float5 = ot.c(float3);
		float float6 = -0.2F * ot.a(float3 * (float) Math.PI);
		float float7 = -0.4F * ot.a(float5 * (float) Math.PI);
		bqg.c(0.0F, -float6 / 2.0F, float7);
		float float8 = this.d(float1);
		bqg.c(0.0F, 0.04F + float2 * -1.2F + float8 * -0.5F, -0.72F);
		bqg.b(float8 * -85.0F, 1.0F, 0.0F, 0.0F);
		this.c();
		float float9 = ot.a(float5 * (float) Math.PI);
		bqg.b(float9 * 20.0F, 1.0F, 0.0F, 0.0F);
		bqg.b(2.0F, 2.0F, 2.0F);
		this.a(this.d);
	}

	private void a(afj afj) {
		bqg.b(180.0F, 0.0F, 1.0F, 0.0F);
		bqg.b(180.0F, 0.0F, 0.0F, 1.0F);
		bqg.b(0.38F, 0.38F, 0.38F);
		bqg.g();
		this.c.N().a(a);
		bqs bqs3 = bqs.a();
		bpy bpy4 = bqs3.c();
		bqg.c(-0.5F, -0.5F, 0.0F);
		bqg.b(0.0078125F, 0.0078125F, 0.0078125F);
		bpy4.a(7, bzh.g);
		bpy4.b(-7.0, 135.0, 0.0).a(0.0, 1.0).d();
		bpy4.b(135.0, 135.0, 0.0).a(1.0, 1.0).d();
		bpy4.b(135.0, -7.0, 0.0).a(1.0, 0.0).d();
		bpy4.b(-7.0, -7.0, 0.0).a(0.0, 0.0).d();
		bqs3.b();
		bbn bbn5 = afl.bl.a(afj, this.c.f);
		if (bbn5 != null) {
			this.c.o.l().a(bbn5, false);
		}

		bqg.f();
	}

	private void a(float float1, float float2, sv sv) {
		boolean boolean5 = sv != sv.LEFT;
		float float6 = boolean5 ? 1.0F : -1.0F;
		float float7 = ot.c(float2);
		float float8 = -0.3F * ot.a(float7 * (float) Math.PI);
		float float9 = 0.4F * ot.a(float7 * (float) (Math.PI * 2));
		float float10 = -0.4F * ot.a(float2 * (float) Math.PI);
		bqg.c(float6 * (float8 + 0.64000005F), float9 + -0.6F + float1 * -0.6F, float10 + -0.71999997F);
		bqg.b(float6 * 45.0F, 0.0F, 1.0F, 0.0F);
		float float11 = ot.a(float2 * float2 * (float) Math.PI);
		float float12 = ot.a(float7 * (float) Math.PI);
		bqg.b(float6 * float12 * 70.0F, 0.0F, 1.0F, 0.0F);
		bqg.b(float6 * float11 * -20.0F, 0.0F, 0.0F, 1.0F);
		bpp bpp13 = this.c.h;
		this.c.N().a(bpp13.m());
		bqg.c(float6 * -1.0F, 3.6F, 3.5F);
		bqg.b(float6 * 120.0F, 0.0F, 0.0F, 1.0F);
		bqg.b(200.0F, 1.0F, 0.0F, 0.0F);
		bqg.b(float6 * -135.0F, 0.0F, 1.0F, 0.0F);
		bqg.c(float6 * 5.6F, 0.0F, 0.0F);
		byc byc14 = (byc)this.j.<bpp>a(bpp13);
		bqg.r();
		if (boolean5) {
			byc14.b(bpp13);
		} else {
			byc14.c(bpp13);
		}

		bqg.q();
	}

	private void a(float float1, sv sv, afj afj) {
		float float5 = (float)this.c.h.cC() - float1 + 1.0F;
		float float6 = float5 / (float)afj.m();
		if (float6 < 0.8F) {
			float float7 = ot.e(ot.b(float5 / 4.0F * (float) Math.PI) * 0.1F);
			bqg.c(0.0F, float7, 0.0F);
		}

		float float7 = 1.0F - (float)Math.pow((double)float6, 27.0);
		int integer8 = sv == sv.RIGHT ? 1 : -1;
		bqg.c(float7 * 0.6F * (float)integer8, float7 * -0.5F, float7 * 0.0F);
		bqg.b((float)integer8 * float7 * 90.0F, 0.0F, 1.0F, 0.0F);
		bqg.b(float7 * 10.0F, 1.0F, 0.0F, 0.0F);
		bqg.b((float)integer8 * float7 * 30.0F, 0.0F, 0.0F, 1.0F);
	}

	private void a(sv sv, float float2) {
		int integer4 = sv == sv.RIGHT ? 1 : -1;
		float float5 = ot.a(float2 * float2 * (float) Math.PI);
		bqg.b((float)integer4 * (45.0F + float5 * -20.0F), 0.0F, 1.0F, 0.0F);
		float float6 = ot.a(ot.c(float2) * (float) Math.PI);
		bqg.b((float)integer4 * float6 * -20.0F, 0.0F, 0.0F, 1.0F);
		bqg.b(float6 * -80.0F, 1.0F, 0.0F, 0.0F);
		bqg.b((float)integer4 * -45.0F, 0.0F, 1.0F, 0.0F);
	}

	private void b(sv sv, float float2) {
		int integer4 = sv == sv.RIGHT ? 1 : -1;
		bqg.c((float)integer4 * 0.56F, -0.52F + float2 * -0.6F, -0.72F);
	}

	public void a(float float1) {
		bpp bpp3 = this.c.h;
		float float4 = bpp3.m(float1);
		ri ri5 = (ri)Objects.firstNonNull(bpp3.av, ri.MAIN_HAND);
		float float6 = bpp3.y + (bpp3.w - bpp3.y) * float1;
		float float7 = bpp3.x + (bpp3.v - bpp3.x) * float1;
		boolean boolean8 = true;
		boolean boolean9 = true;
		if (bpp3.cy()) {
			afj afj10 = bpp3.cB();
			if (afj10.c() == afl.g) {
				ri ri11 = bpp3.cz();
				boolean8 = ri11 == ri.MAIN_HAND;
				boolean9 = !boolean8;
			}
		}

		this.a(float6, float7);
		this.b();
		this.c(float1);
		bqg.D();
		if (boolean8) {
			float float10 = ri5 == ri.MAIN_HAND ? float4 : 0.0F;
			float float11 = 1.0F - (this.g + (this.f - this.g) * float1);
			this.a(bpp3, float1, float6, ri.MAIN_HAND, float10, this.d, float11);
		}

		if (boolean9) {
			float float10 = ri5 == ri.OFF_HAND ? float4 : 0.0F;
			float float11 = 1.0F - (this.i + (this.h - this.i) * float1);
			this.a(bpp3, float1, float6, ri.OFF_HAND, float10, this.e, float11);
		}

		bqg.E();
		beq.a();
	}

	public void a(bpp bpp, float float2, float float3, ri ri, float float5, afj afj, float float7) {
		boolean boolean9 = ri == ri.MAIN_HAND;
		sv sv10 = boolean9 ? bpp.cx() : bpp.cx().a();
		bqg.G();
		if (afj.b()) {
			if (boolean9 && !bpp.aP()) {
				this.a(float7, float5, sv10);
			}
		} else if (afj.c() == afl.bl) {
			if (boolean9 && this.e.b()) {
				this.a(float3, float7, float5);
			} else {
				this.a(float7, sv10, float5, afj);
			}
		} else {
			boolean boolean11 = sv10 == sv.RIGHT;
			if (bpp.cy() && bpp.cC() > 0 && bpp.cz() == ri) {
				int integer12 = boolean11 ? 1 : -1;
				switch (afj.n()) {
					case NONE:
						this.b(sv10, float7);
						break;
					case EAT:
					case DRINK:
						this.a(float2, sv10, afj);
						this.b(sv10, float7);
						break;
					case BLOCK:
						this.b(sv10, float7);
						break;
					case BOW:
						this.b(sv10, float7);
						bqg.c((float)integer12 * -0.2785682F, 0.18344387F, 0.15731531F);
						bqg.b(-13.935F, 1.0F, 0.0F, 0.0F);
						bqg.b((float)integer12 * 35.3F, 0.0F, 1.0F, 0.0F);
						bqg.b((float)integer12 * -9.785F, 0.0F, 0.0F, 1.0F);
						float float13 = (float)afj.m() - ((float)this.c.h.cC() - float2 + 1.0F);
						float float14 = float13 / 20.0F;
						float14 = (float14 * float14 + float14 * 2.0F) / 3.0F;
						if (float14 > 1.0F) {
							float14 = 1.0F;
						}

						if (float14 > 0.1F) {
							float float15 = ot.a((float13 - 0.1F) * 1.3F);
							float float16 = float14 - 0.1F;
							float float17 = float15 * float16;
							bqg.c(float17 * 0.0F, float17 * 0.004F, float17 * 0.0F);
						}

						bqg.c(float14 * 0.0F, float14 * 0.0F, float14 * 0.04F);
						bqg.b(1.0F, 1.0F, 1.0F + float14 * 0.2F);
						bqg.b((float)integer12 * 45.0F, 0.0F, -1.0F, 0.0F);
				}
			} else {
				float float12 = -0.4F * ot.a(ot.c(float5) * (float) Math.PI);
				float float13x = 0.2F * ot.a(ot.c(float5) * (float) (Math.PI * 2));
				float float14x = -0.2F * ot.a(float5 * (float) Math.PI);
				int integer15 = boolean11 ? 1 : -1;
				bqg.c((float)integer15 * float12, float13x, float14x);
				this.b(sv10, float7);
				this.a(sv10, float5);
			}

			this.a(bpp, afj, boolean11 ? brq.b.FIRST_PERSON_RIGHT_HAND : brq.b.FIRST_PERSON_LEFT_HAND, !boolean11);
		}

		bqg.H();
	}

	public void b(float float1) {
		bqg.d();
		if (this.c.h.av()) {
			atl atl3 = this.c.f.o(new co(this.c.h));
			aay aay4 = this.c.h;

			for (int integer5 = 0; integer5 < 8; integer5++) {
				double double6 = aay4.p + (double)(((float)((integer5 >> 0) % 2) - 0.5F) * aay4.G * 0.8F);
				double double8 = aay4.q + (double)(((float)((integer5 >> 1) % 2) - 0.5F) * 0.1F);
				double double10 = aay4.r + (double)(((float)((integer5 >> 2) % 2) - 0.5F) * aay4.G * 0.8F);
				co co12 = new co(double6, double8 + (double)aay4.bq(), double10);
				atl atl13 = this.c.f.o(co12);
				if (atl13.s()) {
					atl3 = atl13;
				}
			}

			if (atl3.j() != aqf.INVISIBLE) {
				this.a(float1, this.c.ab().a().a(atl3));
			}
		}

		if (!this.c.h.y()) {
			if (this.c.h.a(azs.h)) {
				this.e(float1);
			}

			if (this.c.h.aJ()) {
				this.f(float1);
			}
		}

		bqg.e();
	}

	private void a(float float1, byz byz) {
		this.c.N().a(byy.g);
		bqs bqs4 = bqs.a();
		bpy bpy5 = bqs4.c();
		float float6 = 0.1F;
		bqg.c(0.1F, 0.1F, 0.1F, 0.5F);
		bqg.G();
		float float7 = -1.0F;
		float float8 = 1.0F;
		float float9 = -1.0F;
		float float10 = 1.0F;
		float float11 = -0.5F;
		float float12 = byz.e();
		float float13 = byz.f();
		float float14 = byz.g();
		float float15 = byz.h();
		bpy5.a(7, bzh.g);
		bpy5.b(-1.0, -1.0, -0.5).a((double)float13, (double)float15).d();
		bpy5.b(1.0, -1.0, -0.5).a((double)float12, (double)float15).d();
		bpy5.b(1.0, 1.0, -0.5).a((double)float12, (double)float14).d();
		bpy5.b(-1.0, 1.0, -0.5).a((double)float13, (double)float14).d();
		bqs4.b();
		bqg.H();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
	}

	private void e(float float1) {
		this.c.N().a(b);
		bqs bqs3 = bqs.a();
		bpy bpy4 = bqs3.c();
		float float5 = this.c.h.e(float1);
		bqg.c(float5, float5, float5, 0.5F);
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.G();
		float float6 = 4.0F;
		float float7 = -1.0F;
		float float8 = 1.0F;
		float float9 = -1.0F;
		float float10 = 1.0F;
		float float11 = -0.5F;
		float float12 = -this.c.h.v / 64.0F;
		float float13 = this.c.h.w / 64.0F;
		bpy4.a(7, bzh.g);
		bpy4.b(-1.0, -1.0, -0.5).a((double)(4.0F + float12), (double)(4.0F + float13)).d();
		bpy4.b(1.0, -1.0, -0.5).a((double)(0.0F + float12), (double)(4.0F + float13)).d();
		bpy4.b(1.0, 1.0, -0.5).a((double)(0.0F + float12), (double)(0.0F + float13)).d();
		bpy4.b(-1.0, 1.0, -0.5).a((double)(4.0F + float12), (double)(0.0F + float13)).d();
		bqs3.b();
		bqg.H();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.l();
	}

	private void f(float float1) {
		bqs bqs3 = bqs.a();
		bpy bpy4 = bqs3.c();
		bqg.c(1.0F, 1.0F, 1.0F, 0.9F);
		bqg.c(519);
		bqg.a(false);
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		float float5 = 1.0F;

		for (int integer6 = 0; integer6 < 2; integer6++) {
			bqg.G();
			byz byz7 = this.c.R().a("minecraft:blocks/fire_layer_1");
			this.c.N().a(byy.g);
			float float8 = byz7.e();
			float float9 = byz7.f();
			float float10 = byz7.g();
			float float11 = byz7.h();
			float float12 = -0.5F;
			float float13 = 0.5F;
			float float14 = -0.5F;
			float float15 = 0.5F;
			float float16 = -0.5F;
			bqg.c((float)(-(integer6 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
			bqg.b((float)(integer6 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
			bpy4.a(7, bzh.g);
			bpy4.b(-0.5, -0.5, -0.5).a((double)float9, (double)float11).d();
			bpy4.b(0.5, -0.5, -0.5).a((double)float8, (double)float11).d();
			bpy4.b(0.5, 0.5, -0.5).a((double)float8, (double)float10).d();
			bpy4.b(-0.5, 0.5, -0.5).a((double)float9, (double)float10).d();
			bqs3.b();
			bqg.H();
		}

		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.l();
		bqg.a(true);
		bqg.c(515);
	}

	public void a() {
		this.g = this.f;
		this.i = this.h;
		bps bps2 = this.c.h;
		afj afj3 = bps2.cg();
		afj afj4 = bps2.ch();
		if (bps2.L()) {
			this.f = ot.a(this.f - 0.4F, 0.0F, 1.0F);
			this.h = ot.a(this.h - 0.4F, 0.0F, 1.0F);
		} else {
			float float5 = bps2.o(1.0F);
			this.f = this.f + ot.a((Objects.equal(this.d, afj3) ? float5 * float5 * float5 : 0.0F) - this.f, -0.4F, 0.4F);
			this.h = this.h + ot.a((float)(Objects.equal(this.e, afj4) ? 1 : 0) - this.h, -0.4F, 0.4F);
		}

		if (this.f < 0.1F) {
			this.d = afj3;
		}

		if (this.h < 0.1F) {
			this.e = afj4;
		}
	}

	public void a(ri ri) {
		if (ri == ri.MAIN_HAND) {
			this.f = 0.0F;
		} else {
			this.h = 0.0F;
		}
	}
}
