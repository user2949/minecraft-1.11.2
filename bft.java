public class bft extends bfm {
	public bft(int integer1, int integer2, int integer3) {
		super(integer1, integer2, integer3, 20, 20, "");
	}

	@Override
	public void a(bes bes, int integer2, int integer3) {
		if (this.m) {
			bes.N().a(bfm.a);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			boolean boolean5 = integer2 >= this.h && integer3 >= this.i && integer2 < this.h + this.f && integer3 < this.i + this.g;
			int integer6 = 106;
			if (boolean5) {
				integer6 += this.g;
			}

			this.b(this.h, this.i, 0, integer6, this.f, this.g);
		}
	}
}
