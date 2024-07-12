import java.util.Calendar;

public class bsm extends bsl<ase> {
	private static final kq a = new kq("textures/entity/chest/trapped_double.png");
	private static final kq d = new kq("textures/entity/chest/christmas_double.png");
	private static final kq e = new kq("textures/entity/chest/normal_double.png");
	private static final kq f = new kq("textures/entity/chest/trapped.png");
	private static final kq g = new kq("textures/entity/chest/christmas.png");
	private static final kq h = new kq("textures/entity/chest/normal.png");
	private final bla i = new bla();
	private final bla j = new blp();
	private boolean k;

	public bsm() {
		Calendar calendar2 = Calendar.getInstance();
		if (calendar2.get(2) + 1 == 12 && calendar2.get(5) >= 24 && calendar2.get(5) <= 26) {
			this.k = true;
		}
	}

	public void a(ase ase, double double2, double double3, double double4, float float5, int integer) {
		bqg.k();
		bqg.c(515);
		bqg.a(true);
		int integer11;
		if (ase.u()) {
			alu alu12 = ase.x();
			integer11 = ase.v();
			if (alu12 instanceof amg && integer11 == 0) {
				((amg)alu12).e(ase.D(), ase.w(), ase.D().o(ase.w()));
				integer11 = ase.v();
			}

			ase.o();
		} else {
			integer11 = 0;
		}

		if (ase.f == null && ase.h == null) {
			bla bla12;
			if (ase.g == null && ase.i == null) {
				bla12 = this.i;
				if (integer >= 0) {
					this.a(b[integer]);
					bqg.n(5890);
					bqg.G();
					bqg.b(4.0F, 4.0F, 1.0F);
					bqg.c(0.0625F, 0.0625F, 0.0625F);
					bqg.n(5888);
				} else if (this.k) {
					this.a(g);
				} else if (ase.p() == amg.a.TRAP) {
					this.a(f);
				} else {
					this.a(h);
				}
			} else {
				bla12 = this.j;
				if (integer >= 0) {
					this.a(b[integer]);
					bqg.n(5890);
					bqg.G();
					bqg.b(8.0F, 4.0F, 1.0F);
					bqg.c(0.0625F, 0.0625F, 0.0625F);
					bqg.n(5888);
				} else if (this.k) {
					this.a(d);
				} else if (ase.p() == amg.a.TRAP) {
					this.a(a);
				} else {
					this.a(e);
				}
			}

			bqg.G();
			bqg.D();
			if (integer < 0) {
				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			}

			bqg.c((float)double2, (float)double3 + 1.0F, (float)double4 + 1.0F);
			bqg.b(1.0F, -1.0F, -1.0F);
			bqg.c(0.5F, 0.5F, 0.5F);
			int integer13 = 0;
			if (integer11 == 2) {
				integer13 = 180;
			}

			if (integer11 == 3) {
				integer13 = 0;
			}

			if (integer11 == 4) {
				integer13 = 90;
			}

			if (integer11 == 5) {
				integer13 = -90;
			}

			if (integer11 == 2 && ase.g != null) {
				bqg.c(1.0F, 0.0F, 0.0F);
			}

			if (integer11 == 5 && ase.i != null) {
				bqg.c(0.0F, 0.0F, -1.0F);
			}

			bqg.b((float)integer13, 0.0F, 1.0F, 0.0F);
			bqg.c(-0.5F, -0.5F, -0.5F);
			float float14 = ase.k + (ase.j - ase.k) * float5;
			if (ase.f != null) {
				float float15 = ase.f.k + (ase.f.j - ase.f.k) * float5;
				if (float15 > float14) {
					float14 = float15;
				}
			}

			if (ase.h != null) {
				float float15 = ase.h.k + (ase.h.j - ase.h.k) * float5;
				if (float15 > float14) {
					float14 = float15;
				}
			}

			float14 = 1.0F - float14;
			float14 = 1.0F - float14 * float14 * float14;
			bla12.a.f = -(float14 * (float) (Math.PI / 2));
			bla12.a();
			bqg.E();
			bqg.H();
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			if (integer >= 0) {
				bqg.n(5890);
				bqg.H();
				bqg.n(5888);
			}
		}
	}
}
