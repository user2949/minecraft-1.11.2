public class asl extends asc implements lf {
	public float a;
	public float f;
	public int g;
	private int h;

	@Override
	public void F_() {
		if (++this.h % 20 * 4 == 0) {
			this.b.c(this.c, alv.bQ, 1, this.g);
		}

		this.f = this.a;
		int integer2 = this.c.p();
		int integer3 = this.c.q();
		int integer4 = this.c.r();
		float float5 = 0.1F;
		if (this.g > 0 && this.a == 0.0F) {
			double double6 = (double)integer2 + 0.5;
			double double8 = (double)integer4 + 0.5;
			this.b.a(null, double6, (double)integer3 + 0.5, double8, nn.aQ, no.BLOCKS, 0.5F, this.b.r.nextFloat() * 0.1F + 0.9F);
		}

		if (this.g == 0 && this.a > 0.0F || this.g > 0 && this.a < 1.0F) {
			float float6 = this.a;
			if (this.g > 0) {
				this.a += 0.1F;
			} else {
				this.a -= 0.1F;
			}

			if (this.a > 1.0F) {
				this.a = 1.0F;
			}

			float float7 = 0.5F;
			if (this.a < 0.5F && float6 >= 0.5F) {
				double double8 = (double)integer2 + 0.5;
				double double10 = (double)integer4 + 0.5;
				this.b.a(null, double8, (double)integer3 + 0.5, double10, nn.aP, no.BLOCKS, 0.5F, this.b.r.nextFloat() * 0.1F + 0.9F);
			}

			if (this.a < 0.0F) {
				this.a = 0.0F;
			}
		}
	}

	@Override
	public boolean c(int integer1, int integer2) {
		if (integer1 == 1) {
			this.g = integer2;
			return true;
		} else {
			return super.c(integer1, integer2);
		}
	}

	@Override
	public void z() {
		this.B();
		super.z();
	}

	public void a() {
		this.g++;
		this.b.c(this.c, alv.bQ, 1, this.g);
	}

	public void e() {
		this.g--;
		this.b.c(this.c, alv.bQ, 1, this.g);
	}

	public boolean a(aay aay) {
		return this.b.r(this.c) != this ? false : !(aay.d((double)this.c.p() + 0.5, (double)this.c.q() + 0.5, (double)this.c.r() + 0.5) > 64.0);
	}
}
