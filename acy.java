public class acy extends adl {
	private final aay a;
	private int b;

	public acy(aay aay, rc rc, int integer3, int integer4, int integer5) {
		super(rc, integer3, integer4, integer5);
		this.a = aay;
	}

	@Override
	public boolean a(afj afj) {
		return false;
	}

	@Override
	public afj a(int integer) {
		if (this.e()) {
			this.b = this.b + Math.min(integer, this.d().E());
		}

		return super.a(integer);
	}

	@Override
	public afj a(aay aay, afj afj) {
		this.c(afj);
		super.a(aay, afj);
		return afj;
	}

	@Override
	protected void a(afj afj, int integer) {
		this.b += integer;
		this.c(afj);
	}

	@Override
	protected void c(afj afj) {
		afj.a(this.a.l, this.a, this.b);
		if (!this.a.l.E) {
			int integer3 = this.b;
			float float4 = ahk.a().b(afj);
			if (float4 == 0.0F) {
				integer3 = 0;
			} else if (float4 < 1.0F) {
				int integer5 = ot.d((float)integer3 * float4);
				if (integer5 < ot.f((float)integer3 * float4) && Math.random() < (double)((float)integer3 * float4 - (float)integer5)) {
					integer5++;
				}

				integer3 = integer5;
			}

			while (integer3 > 0) {
				int integer5 = st.a(integer3);
				integer3 -= integer5;
				this.a.l.a(new st(this.a.l, this.a.p, this.a.q + 0.5, this.a.r + 0.5, integer5));
			}
		}

		this.b = 0;
		if (afj.c() == afl.m) {
			this.a.b(nr.k);
		}

		if (afj.c() == afl.bd) {
			this.a.b(nr.p);
		}
	}
}
