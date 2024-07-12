import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class wp {
	private ajs a;
	private final List<wo> b = Lists.newArrayList();
	private co c = co.a;
	private co d = co.a;
	private int e;
	private int f;
	private int g;
	private int h;
	private int i;
	private final Map<String, Integer> j = Maps.newHashMap();
	private final List<wp.a> k = Lists.newArrayList();
	private int l;

	public wp() {
	}

	public wp(ajs ajs) {
		this.a = ajs;
	}

	public void a(ajs ajs) {
		this.a = ajs;
	}

	public void a(int integer) {
		this.g = integer;
		this.m();
		this.l();
		if (integer % 20 == 0) {
			this.k();
		}

		if (integer % 30 == 0) {
			this.j();
		}

		int integer3 = this.h / 10;
		if (this.l < integer3 && this.b.size() > 20 && this.a.r.nextInt(7000) == 0) {
			bdw bdw4 = this.a(this.d, 2, 4, 2);
			if (bdw4 != null) {
				xi xi5 = new xi(this.a);
				xi5.b(bdw4.b, bdw4.c, bdw4.d);
				this.a.a(xi5);
				this.l++;
			}
		}
	}

	private bdw a(co co, int integer2, int integer3, int integer4) {
		for (int integer6 = 0; integer6 < 10; integer6++) {
			co co7 = co.a(this.a.r.nextInt(16) - 8, this.a.r.nextInt(6) - 3, this.a.r.nextInt(16) - 8);
			if (this.a(co7) && this.a(new co(integer2, integer3, integer4), co7)) {
				return new bdw((double)co7.p(), (double)co7.q(), (double)co7.r());
			}
		}

		return null;
	}

	private boolean a(co co1, co co2) {
		if (!this.a.o(co2.b()).r()) {
			return false;
		} else {
			int integer4 = co2.p() - co1.p() / 2;
			int integer5 = co2.r() - co1.r() / 2;

			for (int integer6 = integer4; integer6 < integer4 + co1.p(); integer6++) {
				for (int integer7 = co2.q(); integer7 < co2.q() + co1.q(); integer7++) {
					for (int integer8 = integer5; integer8 < integer5 + co1.r(); integer8++) {
						if (this.a.o(new co(integer6, integer7, integer8)).m()) {
							return false;
						}
					}
				}
			}

			return true;
		}
	}

	private void j() {
		List<xi> list2 = this.a
			.a(
				xi.class,
				new bdt(
					(double)(this.d.p() - this.e),
					(double)(this.d.q() - 4),
					(double)(this.d.r() - this.e),
					(double)(this.d.p() + this.e),
					(double)(this.d.q() + 4),
					(double)(this.d.r() + this.e)
				)
			);
		this.l = list2.size();
	}

	private void k() {
		List<aat> list2 = this.a
			.a(
				aat.class,
				new bdt(
					(double)(this.d.p() - this.e),
					(double)(this.d.q() - 4),
					(double)(this.d.r() - this.e),
					(double)(this.d.p() + this.e),
					(double)(this.d.q() + 4),
					(double)(this.d.r() + this.e)
				)
			);
		this.h = list2.size();
		if (this.h == 0) {
			this.j.clear();
		}
	}

	public co a() {
		return this.d;
	}

	public int b() {
		return this.e;
	}

	public int c() {
		return this.b.size();
	}

	public int d() {
		return this.g - this.f;
	}

	public int e() {
		return this.h;
	}

	public boolean a(co co) {
		return this.d.n(co) < (double)(this.e * this.e);
	}

	public List<wo> f() {
		return this.b;
	}

	public wo b(co co) {
		wo wo3 = null;
		int integer4 = Integer.MAX_VALUE;

		for (wo wo6 : this.b) {
			int integer7 = wo6.a(co);
			if (integer7 < integer4) {
				wo3 = wo6;
				integer4 = integer7;
			}
		}

		return wo3;
	}

	public wo c(co co) {
		wo wo3 = null;
		int integer4 = Integer.MAX_VALUE;

		for (wo wo6 : this.b) {
			int integer7 = wo6.a(co);
			if (integer7 > 256) {
				integer7 *= 1000;
			} else {
				integer7 = wo6.c();
			}

			if (integer7 < integer4) {
				co co8 = wo6.d();
				cv cv9 = wo6.j();
				if (this.a.o(co8.a(cv9, 1)).v().b(this.a, co8.a(cv9, 1))
					&& this.a.o(co8.a(cv9, -1)).v().b(this.a, co8.a(cv9, -1))
					&& this.a.o(co8.a().a(cv9, 1)).v().b(this.a, co8.a().a(cv9, 1))
					&& this.a.o(co8.a().a(cv9, -1)).v().b(this.a, co8.a().a(cv9, -1))) {
					wo3 = wo6;
					integer4 = integer7;
				}
			}
		}

		return wo3;
	}

	@Nullable
	public wo e(co co) {
		if (this.d.n(co) > (double)(this.e * this.e)) {
			return null;
		} else {
			for (wo wo4 : this.b) {
				if (wo4.d().p() == co.p() && wo4.d().r() == co.r() && Math.abs(wo4.d().q() - co.q()) <= 1) {
					return wo4;
				}
			}

			return null;
		}
	}

	public void a(wo wo) {
		this.b.add(wo);
		this.c = this.c.a(wo.d());
		this.n();
		this.f = wo.h();
	}

	public boolean g() {
		return this.b.isEmpty();
	}

	public void a(sw sw) {
		for (wp.a a4 : this.k) {
			if (a4.a == sw) {
				a4.b = this.g;
				return;
			}
		}

		this.k.add(new wp.a(sw, this.g));
	}

	@Nullable
	public sw b(sw sw) {
		double double3 = Double.MAX_VALUE;
		wp.a a5 = null;

		for (int integer6 = 0; integer6 < this.k.size(); integer6++) {
			wp.a a7 = (wp.a)this.k.get(integer6);
			double double8 = a7.a.h(sw);
			if (!(double8 > double3)) {
				a5 = a7;
				double3 = double8;
			}
		}

		return a5 == null ? null : a5.a;
	}

	public aay c(sw sw) {
		double double3 = Double.MAX_VALUE;
		aay aay5 = null;

		for (String string7 : this.j.keySet()) {
			if (this.d(string7)) {
				aay aay8 = this.a.a(string7);
				if (aay8 != null) {
					double double9 = aay8.h(sw);
					if (!(double9 > double3)) {
						aay5 = aay8;
						double3 = double9;
					}
				}
			}
		}

		return aay5;
	}

	private void l() {
		Iterator<wp.a> iterator2 = this.k.iterator();

		while (iterator2.hasNext()) {
			wp.a a3 = (wp.a)iterator2.next();
			if (!a3.a.au() || Math.abs(this.g - a3.b) > 300) {
				iterator2.remove();
			}
		}
	}

	private void m() {
		boolean boolean2 = false;
		boolean boolean3 = this.a.r.nextInt(50) == 0;
		Iterator<wo> iterator4 = this.b.iterator();

		while (iterator4.hasNext()) {
			wo wo5 = (wo)iterator4.next();
			if (boolean3) {
				wo5.a();
			}

			if (!this.f(wo5.d()) || Math.abs(this.g - wo5.h()) > 1200) {
				this.c = this.c.b(wo5.d());
				boolean2 = true;
				wo5.a(true);
				iterator4.remove();
			}
		}

		if (boolean2) {
			this.n();
		}
	}

	private boolean f(co co) {
		atl atl3 = this.a.o(co);
		alu alu4 = atl3.v();
		return alu4 instanceof amx ? atl3.a() == azs.d : false;
	}

	private void n() {
		int integer2 = this.b.size();
		if (integer2 == 0) {
			this.d = co.a;
			this.e = 0;
		} else {
			this.d = new co(this.c.p() / integer2, this.c.q() / integer2, this.c.r() / integer2);
			int integer3 = 0;

			for (wo wo5 : this.b) {
				integer3 = Math.max(wo5.a(this.d), integer3);
			}

			this.e = Math.max(32, (int)Math.sqrt((double)integer3) + 1);
		}
	}

	public int a(String string) {
		Integer integer3 = (Integer)this.j.get(string);
		return integer3 == null ? 0 : integer3;
	}

	public int a(String string, int integer) {
		int integer4 = this.a(string);
		int integer5 = ot.a(integer4 + integer, -30, 10);
		this.j.put(string, integer5);
		return integer5;
	}

	public boolean d(String string) {
		return this.a(string) <= -15;
	}

	public void a(du du) {
		this.h = du.h("PopSize");
		this.e = du.h("Radius");
		this.l = du.h("Golems");
		this.f = du.h("Stable");
		this.g = du.h("Tick");
		this.i = du.h("MTick");
		this.d = new co(du.h("CX"), du.h("CY"), du.h("CZ"));
		this.c = new co(du.h("ACX"), du.h("ACY"), du.h("ACZ"));
		ea ea3 = du.c("Doors", 10);

		for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
			du du5 = ea3.b(integer4);
			wo wo6 = new wo(new co(du5.h("X"), du5.h("Y"), du5.h("Z")), du5.h("IDX"), du5.h("IDZ"), du5.h("TS"));
			this.b.add(wo6);
		}

		ea ea4 = du.c("Players", 10);

		for (int integer5 = 0; integer5 < ea4.c(); integer5++) {
			du du6 = ea4.b(integer5);
			if (du6.e("UUID") && this.a != null && this.a.u() != null) {
				mp mp7 = this.a.u().aB();
				GameProfile gameProfile8 = mp7.a(UUID.fromString(du6.l("UUID")));
				if (gameProfile8 != null) {
					this.j.put(gameProfile8.getName(), du6.h("S"));
				}
			} else {
				this.j.put(du6.l("Name"), du6.h("S"));
			}
		}
	}

	public void b(du du) {
		du.a("PopSize", this.h);
		du.a("Radius", this.e);
		du.a("Golems", this.l);
		du.a("Stable", this.f);
		du.a("Tick", this.g);
		du.a("MTick", this.i);
		du.a("CX", this.d.p());
		du.a("CY", this.d.q());
		du.a("CZ", this.d.r());
		du.a("ACX", this.c.p());
		du.a("ACY", this.c.q());
		du.a("ACZ", this.c.r());
		ea ea3 = new ea();

		for (wo wo5 : this.b) {
			du du6 = new du();
			du6.a("X", wo5.d().p());
			du6.a("Y", wo5.d().q());
			du6.a("Z", wo5.d().r());
			du6.a("IDX", wo5.f());
			du6.a("IDZ", wo5.g());
			du6.a("TS", wo5.h());
			ea3.a(du6);
		}

		du.a("Doors", ea3);
		ea ea4 = new ea();

		for (String string6 : this.j.keySet()) {
			du du7 = new du();
			mp mp8 = this.a.u().aB();

			try {
				GameProfile gameProfile9 = mp8.a(string6);
				if (gameProfile9 != null) {
					du7.a("UUID", gameProfile9.getId().toString());
					du7.a("S", (Integer)this.j.get(string6));
					ea4.a(du7);
				}
			} catch (RuntimeException var9) {
			}
		}

		du.a("Players", ea4);
	}

	public void h() {
		this.i = this.g;
	}

	public boolean i() {
		return this.i == 0 || this.g - this.i >= 3600;
	}

	public void b(int integer) {
		for (String string4 : this.j.keySet()) {
			this.a(string4, integer);
		}
	}

	class a {
		public sw a;
		public int b;

		a(sw sw, int integer) {
			this.a = sw;
			this.b = integer;
		}
	}
}
