import java.util.Random;

public class bvf extends bus<zj> {
	private final bvh a;
	private final Random f = new Random();

	public bvf(bur bur, bvh bvh) {
		super(bur);
		this.a = bvh;
		this.c = 0.15F;
		this.d = 0.75F;
	}

	private int a(zj zj, double double2, double double3, double double4, float float5, cbh cbh) {
		afj afj11 = zj.k();
		afh afh12 = afj11.c();
		if (afh12 == null) {
			return 0;
		} else {
			boolean boolean13 = cbh.b();
			int integer14 = this.a(afj11);
			float float15 = 0.25F;
			float float16 = ot.a(((float)zj.o() + float5) / 10.0F + zj.a) * 0.1F + 0.1F;
			float float17 = cbh.e().b(brq.b.GROUND).d.y;
			bqg.c((float)double2, (float)double3 + float16 + 0.25F * float17, (float)double4);
			if (boolean13 || this.b.g != null) {
				float float18 = (((float)zj.o() + float5) / 20.0F + zj.a) * (180.0F / (float)Math.PI);
				bqg.b(float18, 0.0F, 1.0F, 0.0F);
			}

			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			return integer14;
		}
	}

	private int a(afj afj) {
		int integer3 = 1;
		if (afj.E() > 48) {
			integer3 = 5;
		} else if (afj.E() > 32) {
			integer3 = 4;
		} else if (afj.E() > 16) {
			integer3 = 3;
		} else if (afj.E() > 1) {
			integer3 = 2;
		}

		return integer3;
	}

	public void a(zj zj, double double2, double double3, double double4, float float5, float float6) {
		afj afj11 = zj.k();
		int integer12 = afj11.b() ? 187 : afh.a(afj11.c()) + afj11.j();
		this.f.setSeed((long)integer12);
		boolean boolean13 = false;
		if (this.d(zj)) {
			this.b.a.b(this.a(zj)).b(false, false);
			boolean13 = true;
		}

		bqg.D();
		bqg.a(516, 0.1F);
		bqg.m();
		beq.b();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
		bqg.G();
		cbh cbh14 = this.a.a(afj11, zj.l, null);
		int integer15 = this.a(zj, double2, double3, double4, float6, cbh14);
		float float16 = cbh14.e().q.d.x;
		float float17 = cbh14.e().q.d.y;
		float float18 = cbh14.e().q.d.z;
		boolean boolean19 = cbh14.b();
		if (!boolean19) {
			float float20 = -0.0F * (float)(integer15 - 1) * 0.5F * float16;
			float float21 = -0.0F * (float)(integer15 - 1) * 0.5F * float17;
			float float22 = -0.09375F * (float)(integer15 - 1) * 0.5F * float18;
			bqg.c(float20, float21, float22);
		}

		if (this.e) {
			bqg.h();
			bqg.e(this.c(zj));
		}

		for (int integer20 = 0; integer20 < integer15; integer20++) {
			if (boolean19) {
				bqg.G();
				if (integer20 > 0) {
					float float21 = (this.f.nextFloat() * 2.0F - 1.0F) * 0.15F;
					float float22 = (this.f.nextFloat() * 2.0F - 1.0F) * 0.15F;
					float float23 = (this.f.nextFloat() * 2.0F - 1.0F) * 0.15F;
					bqg.c(float21, float22, float23);
				}

				cbh14.e().a(brq.b.GROUND);
				this.a.a(afj11, cbh14);
				bqg.H();
			} else {
				bqg.G();
				if (integer20 > 0) {
					float float21 = (this.f.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
					float float22 = (this.f.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
					bqg.c(float21, float22, 0.0F);
				}

				cbh14.e().a(brq.b.GROUND);
				this.a.a(afj11, cbh14);
				bqg.H();
				bqg.c(0.0F * float16, 0.0F * float17, 0.09375F * float18);
			}
		}

		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.H();
		bqg.E();
		bqg.l();
		this.d(zj);
		if (boolean13) {
			this.b.a.b(this.a(zj)).a();
		}

		super.a(zj, double2, double3, double4, float5, float6);
	}

	protected kq a(zj zj) {
		return byy.g;
	}
}
