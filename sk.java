import javax.annotation.Nullable;

public abstract class sk extends te {
	private static final kk<Boolean> bw = kn.a(sk.class, km.h);
	protected int a;
	protected int b;
	protected int c;
	private float bx = -1.0F;
	private float by;

	public sk(ajs ajs) {
		super(ajs);
	}

	@Nullable
	public abstract sk a(sk sk);

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (afj4.c() == afl.bU) {
			if (!this.l.E) {
				Class<? extends sn> class5 = sp.b.c(ago.h(afj4));
				if (class5 != null && this.getClass() == class5) {
					sk sk6 = this.a(this);
					if (sk6 != null) {
						sk6.b_(-24000);
						sk6.b(this.p, this.q, this.r, 0.0F, 0.0F);
						this.l.a(sk6);
						if (afj4.t()) {
							sk6.c(afj4.r());
						}

						if (!aay.bK.d) {
							afj4.g(1);
						}
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	protected boolean a(afj afj, Class<? extends sn> class2) {
		if (afj.c() != afl.bU) {
			return false;
		} else {
			Class<? extends sn> class4 = sp.b.c(ago.h(afj));
			return class4 != null && class2 == class4;
		}
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bw, false);
	}

	public int l() {
		if (this.l.E) {
			return this.Y.a(bw) ? -1 : 1;
		} else {
			return this.a;
		}
	}

	public void a(int integer, boolean boolean2) {
		int integer4 = this.l();
		integer4 += integer * 20;
		if (integer4 > 0) {
			integer4 = 0;
			if (integer4 < 0) {
				this.o();
			}
		}

		int integer6 = integer4 - integer4;
		this.b_(integer4);
		if (boolean2) {
			this.b += integer6;
			if (this.c == 0) {
				this.c = 40;
			}
		}

		if (this.l() == 0) {
			this.b_(this.b);
		}
	}

	public void a(int integer) {
		this.a(integer, false);
	}

	public void b_(int integer) {
		this.Y.b(bw, integer < 0);
		this.a = integer;
		this.a(this.l_());
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Age", this.l());
		du.a("ForcedAge", this.b);
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.b_(du.h("Age"));
		this.b = du.h("ForcedAge");
	}

	@Override
	public void a(kk<?> kk) {
		if (bw.equals(kk)) {
			this.a(this.l_());
		}

		super.a(kk);
	}

	@Override
	public void n() {
		super.n();
		if (this.l.E) {
			if (this.c > 0) {
				if (this.c % 4 == 0) {
					this.l
						.a(
							de.VILLAGER_HAPPY,
							this.p + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
							this.q + 0.5 + (double)(this.S.nextFloat() * this.H),
							this.r + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
							0.0,
							0.0,
							0.0
						);
				}

				this.c--;
			}
		} else {
			int integer2 = this.l();
			if (integer2 < 0) {
				this.b_(++integer2);
				if (integer2 == 0) {
					this.o();
				}
			} else if (integer2 > 0) {
				this.b_(--integer2);
			}
		}
	}

	@Override
	protected void o() {
	}

	@Override
	public boolean l_() {
		return this.l() < 0;
	}

	public void a(boolean boolean1) {
		this.a(boolean1 ? 0.5F : 1.0F);
	}

	@Override
	protected final void a(float float1, float float2) {
		boolean boolean4 = this.bx > 0.0F;
		this.bx = float1;
		this.by = float2;
		if (!boolean4) {
			this.a(1.0F);
		}
	}

	protected final void a(float float1) {
		super.a(this.bx * float1, this.by * float1);
	}
}
