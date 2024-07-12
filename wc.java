import javax.annotation.Nullable;

public abstract class wc extends ui {
	protected final te e;
	protected boolean f;
	private final boolean a;
	private int b;
	private int c;
	private int d;
	protected sw g;
	protected int h = 60;

	public wc(te te, boolean boolean2) {
		this(te, boolean2, false);
	}

	public wc(te te, boolean boolean2, boolean boolean3) {
		this.e = te;
		this.f = boolean2;
		this.a = boolean3;
	}

	@Override
	public boolean b() {
		sw sw2 = this.e.z();
		if (sw2 == null) {
			sw2 = this.g;
		}

		if (sw2 == null) {
			return false;
		} else if (!sw2.au()) {
			return false;
		} else {
			bee bee3 = this.e.aQ();
			bee bee4 = sw2.aQ();
			if (bee3 != null && bee4 == bee3) {
				return false;
			} else {
				double double5 = this.i();
				if (this.e.h(sw2) > double5 * double5) {
					return false;
				} else {
					if (this.f) {
						if (this.e.y().a(sw2)) {
							this.d = 0;
						} else if (++this.d > this.h) {
							return false;
						}
					}

					if (sw2 instanceof aay && ((aay)sw2).bK.a) {
						return false;
					} else {
						this.e.d(sw2);
						return true;
					}
				}
			}
		}
	}

	protected double i() {
		tk tk2 = this.e.a(aad.b);
		return tk2 == null ? 16.0 : tk2.e();
	}

	@Override
	public void c() {
		this.b = 0;
		this.c = 0;
		this.d = 0;
	}

	@Override
	public void d() {
		this.e.d(null);
		this.g = null;
	}

	public static boolean a(sx sx, @Nullable sw sw, boolean boolean3, boolean boolean4) {
		if (sw == null) {
			return false;
		} else if (sw == sx) {
			return false;
		} else if (!sw.au()) {
			return false;
		} else if (!sx.d(sw.getClass())) {
			return false;
		} else if (sx.r(sw)) {
			return false;
		} else {
			if (sx instanceof td && ((td)sx).b() != null) {
				if (sw instanceof td && ((td)sx).b().equals(sw.be())) {
					return false;
				}

				if (sw == ((td)sx).p_()) {
					return false;
				}
			} else if (sw instanceof aay && !boolean3 && ((aay)sw).bK.a) {
				return false;
			}

			return !boolean4 || sx.y().a(sw);
		}
	}

	protected boolean a(@Nullable sw sw, boolean boolean2) {
		if (!a(this.e, sw, boolean2, this.f)) {
			return false;
		} else if (!this.e.f(new co(sw))) {
			return false;
		} else {
			if (this.a) {
				if (--this.c <= 0) {
					this.b = 0;
				}

				if (this.b == 0) {
					this.b = this.a(sw) ? 1 : 2;
				}

				if (this.b == 2) {
					return false;
				}
			}

			return true;
		}
	}

	private boolean a(sw sw) {
		this.c = 10 + this.e.bJ().nextInt(5);
		bbd bbd3 = this.e.x().a(sw);
		if (bbd3 == null) {
			return false;
		} else {
			bbb bbb4 = bbd3.c();
			if (bbb4 == null) {
				return false;
			} else {
				int integer5 = bbb4.a - ot.c(sw.p);
				int integer6 = bbb4.c - ot.c(sw.r);
				return (double)(integer5 * integer5 + integer6 * integer6) <= 2.25;
			}
		}
	}

	public wc b(int integer) {
		this.h = integer;
		return this;
	}
}
