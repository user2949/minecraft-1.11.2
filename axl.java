import java.util.Random;
import javax.annotation.Nullable;

public class axl extends awn {
	private boolean a;
	private axl.a b;
	private co c;

	public void a(axl.a a) {
		this.b = a;
	}

	public void a(boolean boolean1) {
		this.a = boolean1;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		if (this.b == null) {
			throw new IllegalStateException("Decoration requires priming with a spike");
		} else {
			int integer5 = this.b.c();

			for (co.a a7 : co.b(new co(co.p() - integer5, 0, co.r() - integer5), new co(co.p() + integer5, this.b.d() + 10, co.r() + integer5))) {
				if (a7.f((double)co.p(), (double)a7.q(), (double)co.r()) <= (double)(integer5 * integer5 + 1) && a7.q() < this.b.d()) {
					this.a(ajs, a7, alv.Z.t());
				} else if (a7.q() > 65) {
					this.a(ajs, a7, alv.a.t());
				}
			}

			if (this.b.e()) {
				for (int integer6 = -2; integer6 <= 2; integer6++) {
					for (int integer7 = -2; integer7 <= 2; integer7++) {
						if (ot.a(integer6) == 2 || ot.a(integer7) == 2) {
							this.a(ajs, new co(co.p() + integer6, this.b.d(), co.r() + integer7), alv.bi.t());
							this.a(ajs, new co(co.p() + integer6, this.b.d() + 1, co.r() + integer7), alv.bi.t());
							this.a(ajs, new co(co.p() + integer6, this.b.d() + 2, co.r() + integer7), alv.bi.t());
						}

						this.a(ajs, new co(co.p() + integer6, this.b.d() + 3, co.r() + integer7), alv.bi.t());
					}
				}
			}

			ya ya6 = new ya(ajs);
			ya6.a(this.c);
			ya6.i(this.a);
			ya6.b((double)((float)co.p() + 0.5F), (double)(this.b.d() + 1), (double)((float)co.r() + 0.5F), random.nextFloat() * 360.0F, 0.0F);
			ajs.a(ya6);
			this.a(ajs, new co(co.p(), this.b.d(), co.r()), alv.h.t());
			return true;
		}
	}

	public void a(@Nullable co co) {
		this.c = co;
	}

	public static class a {
		private final int a;
		private final int b;
		private final int c;
		private final int d;
		private final boolean e;
		private final bdt f;

		public a(int integer1, int integer2, int integer3, int integer4, boolean boolean5) {
			this.a = integer1;
			this.b = integer2;
			this.c = integer3;
			this.d = integer4;
			this.e = boolean5;
			this.f = new bdt((double)(integer1 - integer3), 0.0, (double)(integer2 - integer3), (double)(integer1 + integer3), 256.0, (double)(integer2 + integer3));
		}

		public boolean a(co co) {
			int integer3 = this.a - this.c;
			int integer4 = this.b - this.c;
			return co.p() == (integer3 & -16) && co.r() == (integer4 & -16);
		}

		public int a() {
			return this.a;
		}

		public int b() {
			return this.b;
		}

		public int c() {
			return this.c;
		}

		public int d() {
			return this.d;
		}

		public boolean e() {
			return this.e;
		}

		public bdt f() {
			return this.f;
		}
	}
}
