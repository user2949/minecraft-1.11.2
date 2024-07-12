import javax.annotation.Nullable;

public class aeh extends afh {
	public aeh() {
		this.a(new kq("angle"), new afk() {
			double a;
			double b;
			long c;

			@Override
			public float a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
				if (sw == null && !afj.z()) {
					return 0.0F;
				} else {
					boolean boolean5 = sw != null;
					sn sn6 = (sn)(boolean5 ? sw : afj.A());
					if (ajs == null) {
						ajs = sn6.l;
					}

					double double7;
					if (ajs.s.d()) {
						double double9 = boolean5 ? (double)sn6.v : this.a((yz)sn6);
						double9 = ot.b(double9 / 360.0, 1.0);
						double double11 = this.a(ajs, sn6) / (float) (Math.PI * 2);
						double7 = 0.5 - (double9 - 0.25 - double11);
					} else {
						double7 = Math.random();
					}

					if (boolean5) {
						double7 = this.a(ajs, double7);
					}

					return ot.b((float)double7, 1.0F);
				}
			}

			private double a(ajs ajs, double double2) {
				if (ajs.P() != this.c) {
					this.c = ajs.P();
					double double5 = double2 - this.a;
					double5 = ot.b(double5 + 0.5, 1.0) - 0.5;
					this.b += double5 * 0.1;
					this.b *= 0.8;
					this.a = ot.b(this.a + this.b, 1.0);
				}

				return this.a;
			}

			private double a(yz yz) {
				return (double)ot.b(180 + yz.b.b() * 90);
			}

			private double a(ajs ajs, sn sn) {
				co co4 = ajs.R();
				return Math.atan2((double)co4.r() - sn.r, (double)co4.p() - sn.p);
			}
		});
	}
}
