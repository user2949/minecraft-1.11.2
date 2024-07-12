public class vq extends ul {
	private int e;
	private final aat f;

	public vq(aat aat) {
		super(aat, aat.class, 3.0F, 0.02F);
		this.f = aat;
	}

	@Override
	public void c() {
		super.c();
		if (this.f.do() && this.b instanceof aat && ((aat)this.b).dp()) {
			this.e = 10;
		} else {
			this.e = 0;
		}
	}

	@Override
	public void e() {
		super.e();
		if (this.e > 0) {
			this.e--;
			if (this.e == 0) {
				rr rr2 = this.f.dm();

				for (int integer3 = 0; integer3 < rr2.v_(); integer3++) {
					afj afj4 = rr2.a(integer3);
					afj afj5 = afj.a;
					if (!afj4.b()) {
						afh afh6 = afj4.c();
						if ((afh6 == afl.S || afh6 == afl.cd || afh6 == afl.cc || afh6 == afl.cW) && afj4.E() > 3) {
							int integer7 = afj4.E() / 2;
							afj4.g(integer7);
							afj5 = new afj(afh6, integer7, afj4.j());
						} else if (afh6 == afl.R && afj4.E() > 5) {
							int integer7 = afj4.E() / 2 / 3 * 3;
							int integer8 = integer7 / 3;
							afj4.g(integer7);
							afj5 = new afj(afl.S, integer8, 0);
						}

						if (afj4.b()) {
							rr2.a(integer3, afj.a);
						}
					}

					if (!afj5.b()) {
						double double6 = this.f.q - 0.3F + (double)this.f.bq();
						zj zj8 = new zj(this.f.l, this.f.p, double6, this.f.r, afj5);
						float float9 = 0.3F;
						float float10 = this.f.aP;
						float float11 = this.f.w;
						zj8.s = (double)(-ot.a(float10 * (float) (Math.PI / 180.0)) * ot.b(float11 * (float) (Math.PI / 180.0)) * 0.3F);
						zj8.u = (double)(ot.b(float10 * (float) (Math.PI / 180.0)) * ot.b(float11 * (float) (Math.PI / 180.0)) * 0.3F);
						zj8.t = (double)(-ot.a(float11 * (float) (Math.PI / 180.0)) * 0.3F + 0.1F);
						zj8.q();
						this.f.l.a(zj8);
						break;
					}
				}
			}
		}
	}
}
