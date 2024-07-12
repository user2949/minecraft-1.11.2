import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lt {
	private static final Logger a = LogManager.getLogger();
	private final lw b;
	private final Set<ma> c = Sets.newHashSet();
	private final oo<ma> d = new oo<>();
	private int e;

	public lt(lw lw) {
		this.b = lw;
		this.e = lw.u().am().d();
	}

	public static long a(double double1) {
		return ot.d(double1 * 4096.0);
	}

	public static void a(sn sn, double double2, double double3, double double4) {
		sn.ae = a(double2);
		sn.af = a(double3);
		sn.ag = a(double4);
	}

	public void a(sn sn) {
		if (sn instanceof ly) {
			this.a(sn, 512, 2);
			ly ly3 = (ly)sn;

			for (ma ma5 : this.c) {
				if (ma5.b() != ly3) {
					ma5.b(ly3);
				}
			}
		} else if (sn instanceof zd) {
			this.a(sn, 64, 5, true);
		} else if (sn instanceof abb) {
			this.a(sn, 64, 20, false);
		} else if (sn instanceof abm) {
			this.a(sn, 64, 10, false);
		} else if (sn instanceof abf) {
			this.a(sn, 64, 10, true);
		} else if (sn instanceof abn) {
			this.a(sn, 64, 10, true);
		} else if (sn instanceof abi) {
			this.a(sn, 64, 10, false);
		} else if (sn instanceof abr) {
			this.a(sn, 64, 10, true);
		} else if (sn instanceof abe) {
			this.a(sn, 64, 4, true);
		} else if (sn instanceof abq) {
			this.a(sn, 64, 10, true);
		} else if (sn instanceof abt) {
			this.a(sn, 64, 10, true);
		} else if (sn instanceof abs) {
			this.a(sn, 64, 10, true);
		} else if (sn instanceof abg) {
			this.a(sn, 64, 10, true);
		} else if (sn instanceof zj) {
			this.a(sn, 64, 20, true);
		} else if (sn instanceof aby) {
			this.a(sn, 80, 3, true);
		} else if (sn instanceof abx) {
			this.a(sn, 80, 3, true);
		} else if (sn instanceof xh) {
			this.a(sn, 64, 3, true);
		} else if (sn instanceof yv) {
			this.a(sn, 80, 3, false);
		} else if (sn instanceof abl) {
			this.a(sn, 80, 3, true);
		} else if (sn instanceof wu) {
			this.a(sn, 80, 3, false);
		} else if (sn instanceof yb) {
			this.a(sn, 160, 3, true);
		} else if (sn instanceof sm) {
			this.a(sn, 80, 3, true);
		} else if (sn instanceof zk) {
			this.a(sn, 160, 10, true);
		} else if (sn instanceof zi) {
			this.a(sn, 160, 20, true);
		} else if (sn instanceof yy) {
			this.a(sn, 160, Integer.MAX_VALUE, false);
		} else if (sn instanceof yx) {
			this.a(sn, 160, 3, true);
		} else if (sn instanceof st) {
			this.a(sn, 160, 20, true);
		} else if (sn instanceof sl) {
			this.a(sn, 160, Integer.MAX_VALUE, true);
		} else if (sn instanceof ya) {
			this.a(sn, 256, Integer.MAX_VALUE, false);
		} else if (sn instanceof abd) {
			this.a(sn, 160, 2, false);
		}
	}

	public void a(sn sn, int integer2, int integer3) {
		this.a(sn, integer2, integer3, false);
	}

	public void a(sn sn, int integer2, int integer3, boolean boolean4) {
		try {
			if (this.d.b(sn.O())) {
				throw new IllegalStateException("Entity is already tracked!");
			}

			ma ma6 = new ma(sn, integer2, this.e, integer3, boolean4);
			this.c.add(ma6);
			this.d.a(sn.O(), ma6);
			ma6.b(this.b.i);
		} catch (Throwable var10) {
			b b7 = b.a(var10, "Adding entity to track");
			c c8 = b7.a("Entity To Track");
			c8.a("Tracking range", integer2 + " blocks");
			c8.a("Update interval", new d<String>() {
				public String call() throws Exception {
					String string2 = "Once per " + integer3 + " ticks";
					if (integer3 == Integer.MAX_VALUE) {
						string2 = "Maximum (" + string2 + ")";
					}

					return string2;
				}
			});
			sn.a(c8);
			this.d.a(sn.O()).b().a(b7.a("Entity That Is Already Tracked"));

			try {
				throw new f(b7);
			} catch (f var9) {
				a.error("\"Silently\" catching entity tracking error.", var9);
			}
		}
	}

	public void b(sn sn) {
		if (sn instanceof ly) {
			ly ly3 = (ly)sn;

			for (ma ma5 : this.c) {
				ma5.a(ly3);
			}
		}

		ma ma3 = this.d.d(sn.O());
		if (ma3 != null) {
			this.c.remove(ma3);
			ma3.a();
		}
	}

	public void a() {
		List<ly> list2 = Lists.newArrayList();

		for (ma ma4 : this.c) {
			ma4.a(this.b.i);
			if (ma4.b) {
				sn sn5 = ma4.b();
				if (sn5 instanceof ly) {
					list2.add((ly)sn5);
				}
			}
		}

		for (int integer3 = 0; integer3 < list2.size(); integer3++) {
			ly ly4 = (ly)list2.get(integer3);

			for (ma ma6 : this.c) {
				if (ma6.b() != ly4) {
					ma6.b(ly4);
				}
			}
		}
	}

	public void a(ly ly) {
		for (ma ma4 : this.c) {
			if (ma4.b() == ly) {
				ma4.b(this.b.i);
			} else {
				ma4.b(ly);
			}
		}
	}

	public void a(sn sn, fm<?> fm) {
		ma ma4 = this.d.a(sn.O());
		if (ma4 != null) {
			ma4.a(fm);
		}
	}

	public void b(sn sn, fm<?> fm) {
		ma ma4 = this.d.a(sn.O());
		if (ma4 != null) {
			ma4.b(fm);
		}
	}

	public void b(ly ly) {
		for (ma ma4 : this.c) {
			ma4.d(ly);
		}
	}

	public void a(ly ly, auo auo) {
		List<sn> list4 = Lists.newArrayList();
		List<sn> list5 = Lists.newArrayList();

		for (ma ma7 : this.c) {
			sn sn8 = ma7.b();
			if (sn8 != ly && sn8.ab == auo.b && sn8.ad == auo.c) {
				ma7.b(ly);
				if (sn8 instanceof sx && ((sx)sn8).cX() != null) {
					list4.add(sn8);
				}

				if (!sn8.bx().isEmpty()) {
					list5.add(sn8);
				}
			}
		}

		if (!list4.isEmpty()) {
			for (sn sn7 : list4) {
				ly.a.a(new ht(sn7, ((sx)sn7).cX()));
			}
		}

		if (!list5.isEmpty()) {
			for (sn sn7 : list5) {
				ly.a.a(new hz(sn7));
			}
		}
	}

	public void a(int integer) {
		this.e = (integer - 1) * 16;

		for (ma ma4 : this.c) {
			ma4.a(this.e);
		}
	}
}
