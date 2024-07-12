import java.util.Random;
import javax.annotation.Nullable;

public class aaf extends aaa {
	private aaf.b a;

	public aaf(ajs ajs) {
		super(ajs);
		this.a(0.4F, 0.3F);
	}

	public static void a(ph ph) {
		sx.a(ph, aaf.class);
	}

	@Override
	protected void r() {
		this.a = new aaf.b(this);
		this.bq.a(1, new uf(this));
		this.bq.a(3, this.a);
		this.bq.a(4, new ur(this, 1.0, false));
		this.bq.a(5, new aaf.a(this));
		this.br.a(1, new vv(this, true));
		this.br.a(2, new vy(this, aay.class, true));
	}

	@Override
	public double ax() {
		return 0.1;
	}

	@Override
	public float bq() {
		return 0.1F;
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(8.0);
		this.a(aad.d).a(0.25);
		this.a(aad.e).a(1.0);
	}

	@Override
	protected boolean af() {
		return false;
	}

	@Override
	protected nm G() {
		return nn.fL;
	}

	@Override
	protected nm bW() {
		return nn.fN;
	}

	@Override
	protected nm bX() {
		return nn.fM;
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(nn.fO, 0.15F, 1.0F);
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else {
			if ((ry instanceof rz || ry == ry.o) && this.a != null) {
				this.a.f();
			}

			return super.a(ry, float2);
		}
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.v;
	}

	@Override
	public void A_() {
		this.aN = this.v;
		super.A_();
	}

	@Override
	public void i(float float1) {
		this.v = float1;
		super.i(float1);
	}

	@Override
	public float a(co co) {
		return this.l.o(co.b()).v() == alv.b ? 10.0F : super.a(co);
	}

	@Override
	protected boolean r_() {
		return true;
	}

	@Override
	public boolean cM() {
		if (super.cM()) {
			aay aay2 = this.l.b(this, 5.0);
			return aay2 == null;
		} else {
			return false;
		}
	}

	@Override
	public tb cf() {
		return tb.ARTHROPOD;
	}

	static class a extends vf {
		private cv h;
		private boolean i;

		public a(aaf aaf) {
			super(aaf, 1.0, 10);
			this.a(1);
		}

		@Override
		public boolean a() {
			if (this.a.z() != null) {
				return false;
			} else if (!this.a.x().n()) {
				return false;
			} else {
				Random random2 = this.a.bJ();
				if (this.a.l.U().b("mobGriefing") && random2.nextInt(10) == 0) {
					this.h = cv.a(random2);
					co co3 = new co(this.a.p, this.a.q + 0.5, this.a.r).a(this.h);
					atl atl4 = this.a.l.o(co3);
					if (aow.i(atl4)) {
						this.i = true;
						return true;
					}
				}

				this.i = false;
				return super.a();
			}
		}

		@Override
		public boolean b() {
			return this.i ? false : super.b();
		}

		@Override
		public void c() {
			if (!this.i) {
				super.c();
			} else {
				ajs ajs2 = this.a.l;
				co co3 = new co(this.a.p, this.a.q + 0.5, this.a.r).a(this.h);
				atl atl4 = ajs2.o(co3);
				if (aow.i(atl4)) {
					ajs2.a(co3, alv.be.t().a(aow.a, aow.a.a(atl4)), 3);
					this.a.E();
					this.a.T();
				}
			}
		}
	}

	static class b extends ui {
		private final aaf a;
		private int b;

		public b(aaf aaf) {
			this.a = aaf;
		}

		public void f() {
			if (this.b == 0) {
				this.b = 20;
			}
		}

		@Override
		public boolean a() {
			return this.b > 0;
		}

		@Override
		public void e() {
			this.b--;
			if (this.b <= 0) {
				ajs ajs2 = this.a.l;
				Random random3 = this.a.bJ();
				co co4 = new co(this.a);

				for (int integer5 = 0; integer5 <= 5 && integer5 >= -5; integer5 = (integer5 <= 0 ? 1 : 0) - integer5) {
					for (int integer6 = 0; integer6 <= 10 && integer6 >= -10; integer6 = (integer6 <= 0 ? 1 : 0) - integer6) {
						for (int integer7 = 0; integer7 <= 10 && integer7 >= -10; integer7 = (integer7 <= 0 ? 1 : 0) - integer7) {
							co co8 = co4.a(integer6, integer5, integer7);
							atl atl9 = ajs2.o(co8);
							if (atl9.v() == alv.be) {
								if (ajs2.U().b("mobGriefing")) {
									ajs2.b(co8, true);
								} else {
									ajs2.a(co8, ((aow.a)atl9.c(aow.a)).d(), 3);
								}

								if (random3.nextBoolean()) {
									return;
								}
							}
						}
					}
				}
			}
		}
	}
}
