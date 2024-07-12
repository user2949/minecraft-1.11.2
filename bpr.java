public class bpr extends bpq {
	private final beu i;

	public bpr(beu beu) {
		this.i = beu;
	}

	@Override
	public void a() {
		this.a = 0.0F;
		this.b = 0.0F;
		if (this.i.S.e()) {
			this.b++;
			this.c = true;
		} else {
			this.c = false;
		}

		if (this.i.U.e()) {
			this.b--;
			this.d = true;
		} else {
			this.d = false;
		}

		if (this.i.T.e()) {
			this.a++;
			this.e = true;
		} else {
			this.e = false;
		}

		if (this.i.V.e()) {
			this.a--;
			this.f = true;
		} else {
			this.f = false;
		}

		this.g = this.i.W.e();
		this.h = this.i.X.e();
		if (this.h) {
			this.a = (float)((double)this.a * 0.3);
			this.b = (float)((double)this.b * 0.3);
		}
	}
}
