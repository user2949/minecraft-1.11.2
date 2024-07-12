public class bgh extends bfi implements bkj {
	private static final kq f = new kq("textures/gui/widgets.png");
	public static final kq a = new kq("textures/gui/spectator_widgets.png");
	private final bes g;
	private long h;
	private bkg i;

	public bgh(bes bes) {
		this.g = bes;
	}

	public void a(int integer) {
		this.h = bes.I();
		if (this.i != null) {
			this.i.b(integer);
		} else {
			this.i = new bkg(this);
		}
	}

	private float c() {
		long long2 = this.h - bes.I() + 5000L;
		return ot.a((float)long2 / 2000.0F, 0.0F, 1.0F);
	}

	public void a(bfk bfk, float float2) {
		if (this.i != null) {
			float float4 = this.c();
			if (float4 <= 0.0F) {
				this.i.d();
			} else {
				int integer5 = bfk.a() / 2;
				float float6 = this.e;
				this.e = -90.0F;
				float float7 = (float)bfk.b() - 22.0F * float4;
				bkk bkk8 = this.i.f();
				this.a(bfk, float4, integer5, float7, bkk8);
				this.e = float6;
			}
		}
	}

	protected void a(bfk bfk, float float2, int integer, float float4, bkk bkk) {
		bqg.D();
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.c(1.0F, 1.0F, 1.0F, float2);
		this.g.N().a(f);
		this.a((float)(integer - 91), float4, 0, 0, 182, 22);
		if (bkk.b() >= 0) {
			this.a((float)(integer - 91 - 1 + bkk.b() * 20), float4 - 1.0F, 0, 22, 24, 22);
		}

		beq.c();

		for (int integer7 = 0; integer7 < 9; integer7++) {
			this.a(integer7, bfk.a() / 2 - 90 + integer7 * 20 + 2, float4 + 3.0F, float2, bkk.a(integer7));
		}

		beq.a();
		bqg.E();
		bqg.l();
	}

	private void a(int integer1, int integer2, float float3, float float4, bki bki) {
		this.g.N().a(a);
		if (bki != bkg.a) {
			int integer7 = (int)(float4 * 255.0F);
			bqg.G();
			bqg.c((float)integer2, float3, 0.0F);
			float float8 = bki.J_() ? 1.0F : 0.25F;
			bqg.c(float8, float8, float8, float4);
			bki.a(float8, integer7);
			bqg.H();
			String string9 = String.valueOf(beu.c(this.g.u.an[integer1].j()));
			if (integer7 > 3 && bki.J_()) {
				this.g.k.a(string9, (float)(integer2 + 19 - 2 - this.g.k.a(string9)), float3 + 6.0F + 3.0F, 16777215 + (integer7 << 24));
			}
		}
	}

	public void a(bfk bfk) {
		int integer3 = (int)(this.c() * 255.0F);
		if (integer3 > 3 && this.i != null) {
			bki bki4 = this.i.b();
			String string5 = bki4 == bkg.a ? this.i.c().b().d() : bki4.I_().d();
			if (string5 != null) {
				int integer6 = (bfk.a() - this.g.k.a(string5)) / 2;
				int integer7 = bfk.b() - 35;
				bqg.G();
				bqg.m();
				bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
				this.g.k.a(string5, (float)integer6, (float)integer7, 16777215 + (integer3 << 24));
				bqg.l();
				bqg.H();
			}
		}
	}

	@Override
	public void a(bkg bkg) {
		this.i = null;
		this.h = 0L;
	}

	public boolean a() {
		return this.i != null;
	}

	public void b(int integer) {
		int integer3 = this.i.e() + integer;

		while (integer3 >= 0 && integer3 <= 8 && (this.i.a(integer3) == bkg.a || !this.i.a(integer3).J_())) {
			integer3 += integer;
		}

		if (integer3 >= 0 && integer3 <= 8) {
			this.i.b(integer3);
			this.h = bes.I();
		}
	}

	public void b() {
		this.h = bes.I();
		if (this.a()) {
			int integer2 = this.i.e();
			if (integer2 != -1) {
				this.i.b(integer2);
			}
		} else {
			this.i = new bkg(this);
		}
	}
}
