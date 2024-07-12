import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.Immutable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Immutable
public class co extends dl {
	private static final Logger b = LogManager.getLogger();
	public static final co a = new co(0, 0, 0);
	private static final int c = 1 + ot.e(ot.c(30000000));
	private static final int d = c;
	private static final int f = 64 - c - d;
	private static final int g = 0 + d;
	private static final int h = g + f;
	private static final long i = (1L << c) - 1L;
	private static final long j = (1L << f) - 1L;
	private static final long k = (1L << d) - 1L;

	public co(int integer1, int integer2, int integer3) {
		super(integer1, integer2, integer3);
	}

	public co(double double1, double double2, double double3) {
		super(double1, double2, double3);
	}

	public co(sn sn) {
		this(sn.p, sn.q, sn.r);
	}

	public co(bdw bdw) {
		this(bdw.b, bdw.c, bdw.d);
	}

	public co(dl dl) {
		this(dl.p(), dl.q(), dl.r());
	}

	public co a(double double1, double double2, double double3) {
		return double1 == 0.0 && double2 == 0.0 && double3 == 0.0 ? this : new co((double)this.p() + double1, (double)this.q() + double2, (double)this.r() + double3);
	}

	public co a(int integer1, int integer2, int integer3) {
		return integer1 == 0 && integer2 == 0 && integer3 == 0 ? this : new co(this.p() + integer1, this.q() + integer2, this.r() + integer3);
	}

	public co a(dl dl) {
		return this.a(dl.p(), dl.q(), dl.r());
	}

	public co b(dl dl) {
		return this.a(-dl.p(), -dl.q(), -dl.r());
	}

	public co a() {
		return this.b(1);
	}

	public co b(int integer) {
		return this.a(cv.UP, integer);
	}

	public co b() {
		return this.c(1);
	}

	public co c(int integer) {
		return this.a(cv.DOWN, integer);
	}

	public co c() {
		return this.d(1);
	}

	public co d(int integer) {
		return this.a(cv.NORTH, integer);
	}

	public co d() {
		return this.e(1);
	}

	public co e(int integer) {
		return this.a(cv.SOUTH, integer);
	}

	public co e() {
		return this.f(1);
	}

	public co f(int integer) {
		return this.a(cv.WEST, integer);
	}

	public co f() {
		return this.g(1);
	}

	public co g(int integer) {
		return this.a(cv.EAST, integer);
	}

	public co a(cv cv) {
		return this.a(cv, 1);
	}

	public co a(cv cv, int integer) {
		return integer == 0 ? this : new co(this.p() + cv.g() * integer, this.q() + cv.h() * integer, this.r() + cv.i() * integer);
	}

	public co a(aqi aqi) {
		switch (aqi) {
			case NONE:
			default:
				return this;
			case CLOCKWISE_90:
				return new co(-this.r(), this.q(), this.p());
			case CLOCKWISE_180:
				return new co(-this.p(), this.q(), -this.r());
			case COUNTERCLOCKWISE_90:
				return new co(this.r(), this.q(), -this.p());
		}
	}

	public co d(dl dl) {
		return new co(this.q() * dl.r() - this.r() * dl.q(), this.r() * dl.p() - this.p() * dl.r(), this.p() * dl.q() - this.q() * dl.p());
	}

	public long g() {
		return ((long)this.p() & i) << h | ((long)this.q() & j) << g | ((long)this.r() & k) << 0;
	}

	public static co a(long long1) {
		int integer3 = (int)(long1 << 64 - h - c >> 64 - c);
		int integer4 = (int)(long1 << 64 - g - f >> 64 - f);
		int integer5 = (int)(long1 << 64 - d >> 64 - d);
		return new co(integer3, integer4, integer5);
	}

	public static Iterable<co> a(co co1, co co2) {
		return a(
			Math.min(co1.p(), co2.p()),
			Math.min(co1.q(), co2.q()),
			Math.min(co1.r(), co2.r()),
			Math.max(co1.p(), co2.p()),
			Math.max(co1.q(), co2.q()),
			Math.max(co1.r(), co2.r())
		);
	}

	public static Iterable<co> a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		return new Iterable<co>() {
			public Iterator<co> iterator() {
				return new AbstractIterator<co>() {
					private boolean b = true;
					private int c;
					private int d;
					private int e;

					protected co computeNext() {
						if (this.b) {
							this.b = false;
							this.c = integer1;
							this.d = integer2;
							this.e = integer3;
							return new co(integer1, integer2, integer3);
						} else if (this.c == integer4 && this.d == integer5 && this.e == integer6) {
							return (co)this.endOfData();
						} else {
							if (this.c < integer4) {
								this.c++;
							} else if (this.d < integer5) {
								this.c = integer1;
								this.d++;
							} else if (this.e < integer6) {
								this.c = integer1;
								this.d = integer2;
								this.e++;
							}

							return new co(this.c, this.d, this.e);
						}
					}
				};
			}
		};
	}

	public co h() {
		return this;
	}

	public static Iterable<co.a> b(co co1, co co2) {
		return b(
			Math.min(co1.p(), co2.p()),
			Math.min(co1.q(), co2.q()),
			Math.min(co1.r(), co2.r()),
			Math.max(co1.p(), co2.p()),
			Math.max(co1.q(), co2.q()),
			Math.max(co1.r(), co2.r())
		);
	}

	public static Iterable<co.a> b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		return new Iterable<co.a>() {
			public Iterator<co.a> iterator() {
				return new AbstractIterator<co.a>() {
					private co.a b;

					protected co.a computeNext() {
						if (this.b == null) {
							this.b = new co.a(integer1, integer2, integer3);
							return this.b;
						} else if (this.b.b == integer4 && this.b.c == integer5 && this.b.d == integer6) {
							return (co.a)this.endOfData();
						} else {
							if (this.b.b < integer4) {
								this.b.b++;
							} else if (this.b.c < integer5) {
								this.b.b = integer1;
								this.b.c++;
							} else if (this.b.d < integer6) {
								this.b.b = integer1;
								this.b.c = integer2;
								this.b.d++;
							}

							return this.b;
						}
					}
				};
			}
		};
	}

	public static class a extends co {
		protected int b;
		protected int c;
		protected int d;

		public a() {
			this(0, 0, 0);
		}

		public a(co co) {
			this(co.p(), co.q(), co.r());
		}

		public a(int integer1, int integer2, int integer3) {
			super(0, 0, 0);
			this.b = integer1;
			this.c = integer2;
			this.d = integer3;
		}

		@Override
		public co a(double double1, double double2, double double3) {
			return super.a(double1, double2, double3).h();
		}

		@Override
		public co a(int integer1, int integer2, int integer3) {
			return super.a(integer1, integer2, integer3).h();
		}

		@Override
		public co a(cv cv, int integer) {
			return super.a(cv, integer).h();
		}

		@Override
		public co a(aqi aqi) {
			return super.a(aqi).h();
		}

		@Override
		public int p() {
			return this.b;
		}

		@Override
		public int q() {
			return this.c;
		}

		@Override
		public int r() {
			return this.d;
		}

		public co.a c(int integer1, int integer2, int integer3) {
			this.b = integer1;
			this.c = integer2;
			this.d = integer3;
			return this;
		}

		public co.a a(sn sn) {
			return this.c(sn.p, sn.q, sn.r);
		}

		public co.a c(double double1, double double2, double double3) {
			return this.c(ot.c(double1), ot.c(double2), ot.c(double3));
		}

		public co.a g(dl dl) {
			return this.c(dl.p(), dl.q(), dl.r());
		}

		public co.a c(cv cv) {
			return this.c(cv, 1);
		}

		public co.a c(cv cv, int integer) {
			return this.c(this.b + cv.g() * integer, this.c + cv.h() * integer, this.d + cv.i() * integer);
		}

		public void p(int integer) {
			this.c = integer;
		}

		@Override
		public co h() {
			return new co(this);
		}
	}

	public static final class b extends co.a {
		private boolean f;
		private static final List<co.b> g = Lists.newArrayList();

		private b(int integer1, int integer2, int integer3) {
			super(integer1, integer2, integer3);
		}

		public static co.b s() {
			return e(0, 0, 0);
		}

		public static co.b d(double double1, double double2, double double3) {
			return e(ot.c(double1), ot.c(double2), ot.c(double3));
		}

		public static co.b i(dl dl) {
			return e(dl.p(), dl.q(), dl.r());
		}

		public static co.b e(int integer1, int integer2, int integer3) {
			synchronized (g) {
				if (!g.isEmpty()) {
					co.b b5 = (co.b)g.remove(g.size() - 1);
					if (b5 != null && b5.f) {
						b5.f = false;
						b5.f(integer1, integer2, integer3);
						return b5;
					}
				}
			}

			return new co.b(integer1, integer2, integer3);
		}

		public void t() {
			synchronized (g) {
				if (g.size() < 100) {
					g.add(this);
				}

				this.f = true;
			}
		}

		public co.b c(int integer1, int integer2, int integer3) {
			if (this.f) {
				co.b.error("PooledMutableBlockPosition modified after it was released.", new Throwable());
				this.f = false;
			}

			return (co.b)super.c(integer1, integer2, integer3);
		}

		public co.b a(sn sn) {
			return (co.b)super.a(sn);
		}

		public co.b c(double double1, double double2, double double3) {
			return (co.b)super.c(double1, double2, double3);
		}

		public co.b g(dl dl) {
			return (co.b)super.g(dl);
		}

		public co.b c(cv cv) {
			return (co.b)super.c(cv);
		}

		public co.b c(cv cv, int integer) {
			return (co.b)super.c(cv, integer);
		}
	}
}
