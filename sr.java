import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import javax.annotation.Nullable;

public final class sr {
	public static final Predicate<sn> a = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn.au();
		}
	};
	public static final Predicate<sn> b = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn.au() && !sn.aL() && !sn.aK();
		}
	};
	public static final Predicate<sn> c = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn instanceof rc && sn.au();
		}
	};
	public static final Predicate<sn> d = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return !(sn instanceof aay) || !((aay)sn).y() && !((aay)sn).z();
		}
	};
	public static final Predicate<sn> e = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return !(sn instanceof aay) || !((aay)sn).y();
		}
	};

	public static <T extends sn> Predicate<T> a(double double1, double double2, double double3, double double4) {
		final double double9 = double4 * double4;
		return new Predicate<T>() {
			public boolean apply(@Nullable T sn) {
				return sn != null && sn.d(double1, double2, double3) <= double9;
			}
		};
	}

	public static <T extends sn> Predicate<T> a(sn sn) {
		final bee bee2 = sn.aQ();
		final bee.a a3 = bee2 == null ? bee.a.ALWAYS : bee2.k();
		return a3 == bee.a.NEVER
			? Predicates.alwaysFalse()
			: Predicates.and(
				e,
				new Predicate<sn>() {
					public boolean apply(@Nullable sn sn) {
						if (!sn.ar()) {
							return false;
						} else if (!sn.l.E || sn instanceof aay && ((aay)sn).cR()) {
							bee bee3 = sn.aQ();
							bee.a a4 = bee3 == null ? bee.a.ALWAYS : bee3.k();
							if (a4 == bee.a.NEVER) {
								return false;
							} else {
								boolean boolean5 = bee2 != null && bee2.a(bee3);
								return (a3 == bee.a.HIDE_FOR_OWN_TEAM || a4 == bee.a.HIDE_FOR_OWN_TEAM) && boolean5
									? false
									: a3 != bee.a.HIDE_FOR_OTHER_TEAMS && a4 != bee.a.HIDE_FOR_OTHER_TEAMS || boolean5;
							}
						} else {
							return false;
						}
					}
				}
			);
	}

	public static Predicate<sn> b(sn sn) {
		return new Predicate<sn>() {
			public boolean apply(@Nullable sn sn) {
				while (sn.aK()) {
					sn = sn.bB();
					if (sn == sn) {
						return false;
					}
				}

				return true;
			}
		};
	}

	public static class a implements Predicate<sn> {
		private final afj a;

		public a(afj afj) {
			this.a = afj;
		}

		public boolean apply(@Nullable sn sn) {
			if (!sn.au()) {
				return false;
			} else if (!(sn instanceof sw)) {
				return false;
			} else {
				sw sw3 = (sw)sn;
				if (!sw3.b(sx.d(this.a)).b()) {
					return false;
				} else if (sw3 instanceof sx) {
					return ((sx)sw3).cT();
				} else {
					return sw3 instanceof yx ? true : sw3 instanceof aay;
				}
			}
		}
	}
}
