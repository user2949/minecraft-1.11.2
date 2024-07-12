import javax.annotation.Nullable;

public class aef extends afh {
	public aef() {
		this.a(new kq("time"), new afk() {
			double a;
			double b;
			long c;

			@Override
			public float a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
				boolean boolean5 = sw != null;
				sn sn6 = (sn)(boolean5 ? sw : afj.A());
				if (ajs == null && sn6 != null) {
					ajs = sn6.l;
				}

				if (ajs == null) {
					return 0.0F;
				} else {
					double double7;
					if (ajs.s.d()) {
						double7 = (double)ajs.c(1.0F);
					} else {
						double7 = Math.random();
					}

					double7 = this.a(ajs, double7);
					return (float)double7;
				}
			}

			private double a(ajs ajs, double double2) {
				if (ajs.P() != this.c) {
					this.c = ajs.P();
					double double5 = double2 - this.a;
					double5 = ot.b(double5 + 0.5, 1.0) - 0.5;
					this.b += double5 * 0.1;
					this.b *= 0.9;
					this.a = ot.b(this.a + this.b, 1.0);
				}

				return this.a;
			}
		});
	}
}
