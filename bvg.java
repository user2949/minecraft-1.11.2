import javax.annotation.Nullable;

public class bvg extends bus<yz> {
	private static final kq a = new kq("textures/map/map_background.png");
	private final bes f = bes.z();
	private final cbm g = new cbm("item_frame", "normal");
	private final cbm h = new cbm("item_frame", "map");
	private final bvh i;

	public bvg(bur bur, bvh bvh) {
		super(bur);
		this.i = bvh;
	}

	public void a(yz yz, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		co co11 = yz.q();
		double double12 = (double)co11.p() - yz.p + double2;
		double double14 = (double)co11.q() - yz.q + double3;
		double double16 = (double)co11.r() - yz.r + double4;
		bqg.b(double12 + 0.5, double14 + 0.5, double16 + 0.5);
		bqg.b(180.0F - yz.v, 0.0F, 1.0F, 0.0F);
		this.b.a.a(byy.g);
		bra bra18 = this.f.ab();
		cbl cbl19 = bra18.a().b();
		cbh cbh20;
		if (!yz.r().b() && yz.r().c() == afl.bl) {
			cbh20 = cbl19.a(this.h);
		} else {
			cbh20 = cbl19.a(this.g);
		}

		bqg.G();
		bqg.c(-0.5F, -0.5F, -0.5F);
		if (this.e) {
			bqg.h();
			bqg.e(this.c(yz));
		}

		bra18.b().a(cbh20, 1.0F, 1.0F, 1.0F, 1.0F);
		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.H();
		bqg.c(0.0F, 0.0F, 0.4375F);
		this.b(yz);
		bqg.H();
		this.a(yz, double2 + (double)((float)yz.b.g() * 0.3F), double3 - 0.25, double4 + (double)((float)yz.b.i() * 0.3F));
	}

	@Nullable
	protected kq a(yz yz) {
		return null;
	}

	private void b(yz yz) {
		afj afj3 = yz.r();
		if (!afj3.b()) {
			zj zj4 = new zj(yz.l, 0.0, 0.0, 0.0, afj3);
			afh afh5 = zj4.k().c();
			zj4.k().e(1);
			zj4.a = 0.0F;
			bqg.G();
			bqg.g();
			int integer6 = yz.s();
			if (afh5 == afl.bl) {
				integer6 = integer6 % 4 * 2;
			}

			bqg.b((float)integer6 * 360.0F / 8.0F, 0.0F, 0.0F, 1.0F);
			if (afh5 == afl.bl) {
				this.b.a.a(a);
				bqg.b(180.0F, 0.0F, 0.0F, 1.0F);
				float float7 = 0.0078125F;
				bqg.b(0.0078125F, 0.0078125F, 0.0078125F);
				bqg.c(-64.0F, -64.0F, 0.0F);
				bbn bbn8 = afl.bl.a(zj4.k(), yz.l);
				bqg.c(0.0F, 0.0F, -1.0F);
				if (bbn8 != null) {
					this.f.o.l().a(bbn8, true);
				}
			} else {
				bqg.b(0.5F, 0.5F, 0.5F);
				bqg.a();
				beq.b();
				this.i.a(zj4.k(), brq.b.FIXED);
				beq.a();
				bqg.c();
			}

			bqg.f();
			bqg.H();
		}
	}

	protected void a(yz yz, double double2, double double3, double double4) {
		if (bes.w() && !yz.r().b() && yz.r().t() && this.b.d == yz) {
			double double9 = yz.h(this.b.c);
			float float11 = yz.aM() ? 32.0F : 64.0F;
			if (!(double9 >= (double)(float11 * float11))) {
				String string12 = yz.r().r();
				this.a(yz, string12, double2, double3, double4, 64);
			}
		}
	}
}
