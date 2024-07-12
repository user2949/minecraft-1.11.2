import java.util.UUID;
import javax.annotation.Nullable;

public class abd extends sn {
	private int a;
	private boolean b;
	private int c = 22;
	private boolean d;
	private sw e;
	private UUID f;

	public abd(ajs ajs) {
		super(ajs);
		this.a(0.5F, 0.8F);
	}

	public abd(ajs ajs, double double2, double double3, double double4, float float5, int integer, sw sw) {
		this(ajs);
		this.a = integer;
		this.a(sw);
		this.v = float5 * (180.0F / (float)Math.PI);
		this.b(double2, double3, double4);
	}

	@Override
	protected void i() {
	}

	public void a(@Nullable sw sw) {
		this.e = sw;
		this.f = sw == null ? null : sw.be();
	}

	@Nullable
	public sw j() {
		if (this.e == null && this.f != null && this.l instanceof lw) {
			sn sn2 = ((lw)this.l).a(this.f);
			if (sn2 instanceof sw) {
				this.e = (sw)sn2;
			}
		}

		return this.e;
	}

	@Override
	protected void a(du du) {
		this.a = du.h("Warmup");
		this.f = du.a("OwnerUUID");
	}

	@Override
	protected void b(du du) {
		du.a("Warmup", this.a);
		if (this.f != null) {
			du.a("OwnerUUID", this.f);
		}
	}

	@Override
	public void A_() {
		super.A_();
		if (this.l.E) {
			if (this.d) {
				this.c--;
				if (this.c == 14) {
					for (int integer2 = 0; integer2 < 12; integer2++) {
						double double3 = this.p + (this.S.nextDouble() * 2.0 - 1.0) * (double)this.G * 0.5;
						double double5 = this.q + 0.05 + this.S.nextDouble() * 1.0;
						double double7 = this.r + (this.S.nextDouble() * 2.0 - 1.0) * (double)this.G * 0.5;
						double double9 = (this.S.nextDouble() * 2.0 - 1.0) * 0.3;
						double double11 = 0.3 + this.S.nextDouble() * 0.3;
						double double13 = (this.S.nextDouble() * 2.0 - 1.0) * 0.3;
						this.l.a(de.CRIT, double3, double5 + 1.0, double7, double9, double11, double13);
					}
				}
			}
		} else if (--this.a < 0) {
			if (this.a == -8) {
				for (sw sw4 : this.l.a(sw.class, this.bo().c(0.2, 0.0, 0.2))) {
					this.c(sw4);
				}
			}

			if (!this.b) {
				this.l.a(this, (byte)4);
				this.b = true;
			}

			if (--this.c < 0) {
				this.T();
			}
		}
	}

	private void c(sw sw) {
		sw sw3 = this.j();
		if (sw.au() && !sw.aW() && sw != sw3) {
			if (sw3 == null) {
				sw.a(ry.o, 6.0F);
			} else {
				if (sw3.r(sw)) {
					return;
				}

				sw.a(ry.b(this, sw3), 6.0F);
			}
		}
	}

	@Override
	public void a(byte byte1) {
		super.a(byte1);
		if (byte1 == 4) {
			this.d = true;
			if (!this.ad()) {
				this.l.a(this.p, this.q, this.r, nn.bl, this.bC(), 1.0F, this.S.nextFloat() * 0.2F + 0.85F, false);
			}
		}
	}

	public float a(float float1) {
		if (!this.d) {
			return 0.0F;
		} else {
			int integer3 = this.c - 2;
			return integer3 <= 0 ? 1.0F : 1.0F - ((float)integer3 - float1) / 20.0F;
		}
	}
}
