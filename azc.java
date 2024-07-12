import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class azc {
	private final List<azc.b> a = Lists.newArrayList();
	private final List<azc.c> b = Lists.newArrayList();
	private co c = co.a;
	private String d = "?";

	public co a() {
		return this.c;
	}

	public void a(String string) {
		this.d = string;
	}

	public String b() {
		return this.d;
	}

	public void a(ajs ajs, co co2, co co3, boolean boolean4, @Nullable alu alu) {
		if (co3.p() >= 1 && co3.q() >= 1 && co3.r() >= 1) {
			co co7 = co2.a(co3).a(-1, -1, -1);
			List<azc.b> list8 = Lists.newArrayList();
			List<azc.b> list9 = Lists.newArrayList();
			List<azc.b> list10 = Lists.newArrayList();
			co co11 = new co(Math.min(co2.p(), co7.p()), Math.min(co2.q(), co7.q()), Math.min(co2.r(), co7.r()));
			co co12 = new co(Math.max(co2.p(), co7.p()), Math.max(co2.q(), co7.q()), Math.max(co2.r(), co7.r()));
			this.c = co3;

			for (co.a a14 : co.b(co11, co12)) {
				co co15 = a14.b(co11);
				atl atl16 = ajs.o(a14);
				if (alu == null || alu != atl16.v()) {
					asc asc17 = ajs.r(a14);
					if (asc17 != null) {
						du du18 = asc17.b(new du());
						du18.q("x");
						du18.q("y");
						du18.q("z");
						list9.add(new azc.b(co15, atl16, du18));
					} else if (!atl16.b() && !atl16.h()) {
						list10.add(new azc.b(co15, atl16, null));
					} else {
						list8.add(new azc.b(co15, atl16, null));
					}
				}
			}

			this.a.clear();
			this.a.addAll(list8);
			this.a.addAll(list9);
			this.a.addAll(list10);
			if (boolean4) {
				this.a(ajs, co11, co12.a(1, 1, 1));
			} else {
				this.b.clear();
			}
		}
	}

	private void a(ajs ajs, co co2, co co3) {
		List<sn> list5 = ajs.a(sn.class, new bdt(co2, co3), new Predicate<sn>() {
			public boolean apply(@Nullable sn sn) {
				return !(sn instanceof aay);
			}
		});
		this.b.clear();

		for (sn sn7 : list5) {
			bdw bdw8 = new bdw(sn7.p - (double)co2.p(), sn7.q - (double)co2.q(), sn7.r - (double)co2.r());
			du du9 = new du();
			sn7.d(du9);
			co co10;
			if (sn7 instanceof zb) {
				co10 = ((zb)sn7).q().b(co2);
			} else {
				co10 = new co(bdw8);
			}

			this.b.add(new azc.c(bdw8, co10, du9));
		}
	}

	public Map<co, String> a(co co, aza aza) {
		Map<co, String> map4 = Maps.newHashMap();
		axz axz5 = aza.i();

		for (azc.b b7 : this.a) {
			co co8 = a(aza, b7.a).a(co);
			if (axz5 == null || axz5.b(co8)) {
				atl atl9 = b7.b;
				if (atl9.v() == alv.dB && b7.c != null) {
					asx.a a10 = asx.a.valueOf(b7.c.l("mode"));
					if (a10 == asx.a.DATA) {
						map4.put(co8, b7.c.l("metadata"));
					}
				}
			}
		}

		return map4;
	}

	public co a(aza aza1, co co2, aza aza3, co co4) {
		co co6 = a(aza1, co2);
		co co7 = a(aza3, co4);
		return co6.b(co7);
	}

	public static co a(aza aza, co co) {
		return b(co, aza.b(), aza.c());
	}

	public void a(ajs ajs, co co, aza aza) {
		aza.k();
		this.b(ajs, co, aza);
	}

	public void b(ajs ajs, co co, aza aza) {
		this.a(ajs, co, new ayy(co, aza), aza, 2);
	}

	public void a(ajs ajs, co co, aza aza, int integer) {
		this.a(ajs, co, new ayy(co, aza), aza, integer);
	}

	public void a(ajs ajs, co co, @Nullable azb azb, aza aza, int integer) {
		if ((!this.a.isEmpty() || !aza.g() && !this.b.isEmpty()) && this.c.p() >= 1 && this.c.q() >= 1 && this.c.r() >= 1) {
			alu alu7 = aza.h();
			axz axz8 = aza.i();

			for (azc.b b10 : this.a) {
				co co11 = a(aza, b10.a).a(co);
				azc.b b12 = azb != null ? azb.a(ajs, co11, b10) : b10;
				if (b12 != null) {
					alu alu13 = b12.b.v();
					if ((alu7 == null || alu7 != alu13) && (!aza.j() || alu13 != alv.dB) && (axz8 == null || axz8.b(co11))) {
						atl atl14 = b12.b.a(aza.b());
						atl atl15 = atl14.a(aza.c());
						if (b12.c != null) {
							asc asc16 = ajs.r(co11);
							if (asc16 != null) {
								if (asc16 instanceof rc) {
									((rc)asc16).m();
								}

								ajs.a(co11, alv.cv.t(), 4);
							}
						}

						if (ajs.a(co11, atl15, integer) && b12.c != null) {
							asc asc16 = ajs.r(co11);
							if (asc16 != null) {
								b12.c.a("x", co11.p());
								b12.c.a("y", co11.q());
								b12.c.a("z", co11.r());
								asc16.a(b12.c);
								asc16.a(aza.b());
								asc16.a(aza.c());
							}
						}
					}
				}
			}

			for (azc.b b10x : this.a) {
				if (alu7 == null || alu7 != b10x.b.v()) {
					co co11 = a(aza, b10x.a).a(co);
					if (axz8 == null || axz8.b(co11)) {
						ajs.a(co11, b10x.b.v(), false);
						if (b10x.c != null) {
							asc asc12 = ajs.r(co11);
							if (asc12 != null) {
								asc12.x_();
							}
						}
					}
				}
			}

			if (!aza.g()) {
				this.a(ajs, co, aza.b(), aza.c(), axz8);
			}
		}
	}

	private void a(ajs ajs, co co, aou aou, aqi aqi, @Nullable axz axz) {
		for (azc.c c8 : this.b) {
			co co9 = b(c8.b, aou, aqi).a(co);
			if (axz == null || axz.b(co9)) {
				du du10 = c8.c;
				bdw bdw11 = a(c8.a, aou, aqi);
				bdw bdw12 = bdw11.b((double)co.p(), (double)co.q(), (double)co.r());
				ea ea13 = new ea();
				ea13.a(new dv(bdw12.b));
				ea13.a(new dv(bdw12.c));
				ea13.a(new dv(bdw12.d));
				du10.a("Pos", ea13);
				du10.a("UUID", UUID.randomUUID());

				sn sn14;
				try {
					sn14 = sp.a(du10, ajs);
				} catch (Exception var15) {
					sn14 = null;
				}

				if (sn14 != null) {
					float float15 = sn14.a(aou);
					float15 += sn14.v - sn14.a(aqi);
					sn14.b(bdw12.b, bdw12.c, bdw12.d, float15, sn14.w);
					ajs.a(sn14);
				}
			}
		}
	}

	public co a(aqi aqi) {
		switch (aqi) {
			case COUNTERCLOCKWISE_90:
			case CLOCKWISE_90:
				return new co(this.c.r(), this.c.q(), this.c.p());
			default:
				return this.c;
		}
	}

	private static co b(co co, aou aou, aqi aqi) {
		int integer4 = co.p();
		int integer5 = co.q();
		int integer6 = co.r();
		boolean boolean7 = true;
		switch (aou) {
			case LEFT_RIGHT:
				integer6 = -integer6;
				break;
			case FRONT_BACK:
				integer4 = -integer4;
				break;
			default:
				boolean7 = false;
		}

		switch (aqi) {
			case COUNTERCLOCKWISE_90:
				return new co(integer6, integer5, -integer4);
			case CLOCKWISE_90:
				return new co(-integer6, integer5, integer4);
			case CLOCKWISE_180:
				return new co(-integer4, integer5, -integer6);
			default:
				return boolean7 ? new co(integer4, integer5, integer6) : co;
		}
	}

	private static bdw a(bdw bdw, aou aou, aqi aqi) {
		double double4 = bdw.b;
		double double6 = bdw.c;
		double double8 = bdw.d;
		boolean boolean10 = true;
		switch (aou) {
			case LEFT_RIGHT:
				double8 = 1.0 - double8;
				break;
			case FRONT_BACK:
				double4 = 1.0 - double4;
				break;
			default:
				boolean10 = false;
		}

		switch (aqi) {
			case COUNTERCLOCKWISE_90:
				return new bdw(double8, double6, 1.0 - double4);
			case CLOCKWISE_90:
				return new bdw(1.0 - double8, double6, double4);
			case CLOCKWISE_180:
				return new bdw(1.0 - double4, double6, 1.0 - double8);
			default:
				return boolean10 ? new bdw(double4, double6, double8) : bdw;
		}
	}

	public co a(co co, aou aou, aqi aqi) {
		return a(co, aou, aqi, this.a().p(), this.a().r());
	}

	public static co a(co co, aou aou, aqi aqi, int integer4, int integer5) {
		integer4--;
		integer5--;
		int integer6 = aou == aou.FRONT_BACK ? integer4 : 0;
		int integer7 = aou == aou.LEFT_RIGHT ? integer5 : 0;
		co co8 = co;
		switch (aqi) {
			case COUNTERCLOCKWISE_90:
				co8 = co.a(integer7, 0, integer4 - integer6);
				break;
			case CLOCKWISE_90:
				co8 = co.a(integer5 - integer7, 0, integer6);
				break;
			case CLOCKWISE_180:
				co8 = co.a(integer4 - integer6, 0, integer5 - integer7);
				break;
			case NONE:
				co8 = co.a(integer6, 0, integer7);
		}

		return co8;
	}

	public static void a(ph ph) {
		ph.a(pf.STRUCTURE, new pj() {
			@Override
			public du a(pg pg, du du, int integer) {
				if (du.b("entities", 9)) {
					ea ea5 = du.c("entities", 10);

					for (int integer6 = 0; integer6 < ea5.c(); integer6++) {
						du du7 = (du)ea5.h(integer6);
						if (du7.b("nbt", 10)) {
							du7.a("nbt", pg.a(pf.ENTITY, du7.o("nbt"), integer));
						}
					}
				}

				if (du.b("blocks", 9)) {
					ea ea5 = du.c("blocks", 10);

					for (int integer6x = 0; integer6x < ea5.c(); integer6x++) {
						du du7 = (du)ea5.h(integer6x);
						if (du7.b("nbt", 10)) {
							du7.a("nbt", pg.a(pf.BLOCK_ENTITY, du7.o("nbt"), integer));
						}
					}
				}

				return du;
			}
		});
	}

	public du a(du du) {
		azc.a a3 = new azc.a();
		ea ea4 = new ea();

		for (azc.b b6 : this.a) {
			du du7 = new du();
			du7.a("pos", this.a(b6.a.p(), b6.a.q(), b6.a.r()));
			du7.a("state", a3.a(b6.b));
			if (b6.c != null) {
				du7.a("nbt", b6.c);
			}

			ea4.a(du7);
		}

		ea ea5 = new ea();

		for (azc.c c7 : this.b) {
			du du8 = new du();
			du8.a("pos", this.a(c7.a.b, c7.a.c, c7.a.d));
			du8.a("blockPos", this.a(c7.b.p(), c7.b.q(), c7.b.r()));
			if (c7.c != null) {
				du8.a("nbt", c7.c);
			}

			ea5.a(du8);
		}

		ea ea6 = new ea();

		for (atl atl8 : a3) {
			ea6.a(ee.a(new du(), atl8));
		}

		du.a("palette", ea6);
		du.a("blocks", ea4);
		du.a("entities", ea5);
		du.a("size", this.a(this.c.p(), this.c.q(), this.c.r()));
		du.a("author", this.d);
		du.a("DataVersion", 922);
		return du;
	}

	public void b(du du) {
		this.a.clear();
		this.b.clear();
		ea ea3 = du.c("size", 3);
		this.c = new co(ea3.c(0), ea3.c(1), ea3.c(2));
		this.d = du.l("author");
		azc.a a4 = new azc.a();
		ea ea5 = du.c("palette", 10);

		for (int integer6 = 0; integer6 < ea5.c(); integer6++) {
			a4.a(ee.d(ea5.b(integer6)), integer6);
		}

		ea ea6 = du.c("blocks", 10);

		for (int integer7 = 0; integer7 < ea6.c(); integer7++) {
			du du8 = ea6.b(integer7);
			ea ea9 = du8.c("pos", 3);
			co co10 = new co(ea9.c(0), ea9.c(1), ea9.c(2));
			atl atl11 = a4.a(du8.h("state"));
			du du12;
			if (du8.e("nbt")) {
				du12 = du8.o("nbt");
			} else {
				du12 = null;
			}

			this.a.add(new azc.b(co10, atl11, du12));
		}

		ea ea7 = du.c("entities", 10);

		for (int integer8 = 0; integer8 < ea7.c(); integer8++) {
			du du9 = ea7.b(integer8);
			ea ea10 = du9.c("pos", 6);
			bdw bdw11 = new bdw(ea10.e(0), ea10.e(1), ea10.e(2));
			ea ea12 = du9.c("blockPos", 3);
			co co13 = new co(ea12.c(0), ea12.c(1), ea12.c(2));
			if (du9.e("nbt")) {
				du du14 = du9.o("nbt");
				this.b.add(new azc.c(bdw11, co13, du14));
			}
		}
	}

	private ea a(int... arr) {
		ea ea3 = new ea();

		for (int integer7 : arr) {
			ea3.a(new dz(integer7));
		}

		return ea3;
	}

	private ea a(double... arr) {
		ea ea3 = new ea();

		for (double double7 : arr) {
			ea3.a(new dv(double7));
		}

		return ea3;
	}

	static class a implements Iterable<atl> {
		public static final atl a = alv.a.t();
		final cy<atl> b = new cy<>(16);
		private int c;

		private a() {
		}

		public int a(atl atl) {
			int integer3 = this.b.a(atl);
			if (integer3 == -1) {
				integer3 = this.c++;
				this.b.a(atl, integer3);
			}

			return integer3;
		}

		@Nullable
		public atl a(int integer) {
			atl atl3 = this.b.a(integer);
			return atl3 == null ? a : atl3;
		}

		public Iterator<atl> iterator() {
			return this.b.iterator();
		}

		public void a(atl atl, int integer) {
			this.b.a(atl, integer);
		}
	}

	public static class b {
		public final co a;
		public final atl b;
		public final du c;

		public b(co co, atl atl, @Nullable du du) {
			this.a = co;
			this.b = atl;
			this.c = du;
		}
	}

	public static class c {
		public final bdw a;
		public final co b;
		public final du c;

		public c(bdw bdw, co co, du du) {
			this.a = bdw;
			this.b = co;
			this.c = du;
		}
	}
}
