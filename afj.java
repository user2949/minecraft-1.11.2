import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public final class afj {
	public static final afj a = new afj((afh)null);
	public static final DecimalFormat b = new DecimalFormat("#.##");
	private int c;
	private int d;
	private final afh e;
	private du f;
	private boolean g;
	private int h;
	private yz i;
	private alu j;
	private boolean k;
	private alu l;
	private boolean m;

	public afj(alu alu) {
		this(alu, 1);
	}

	public afj(alu alu, int integer) {
		this(alu, integer, 0);
	}

	public afj(alu alu, int integer2, int integer3) {
		this(afh.a(alu), integer2, integer3);
	}

	public afj(afh afh) {
		this(afh, 1);
	}

	public afj(afh afh, int integer) {
		this(afh, integer, 0);
	}

	public afj(afh afh, int integer2, int integer3) {
		this.e = afh;
		this.h = integer3;
		this.c = integer2;
		if (this.h < 0) {
			this.h = 0;
		}

		this.F();
	}

	private void F() {
		this.g = this.b();
	}

	public afj(du du) {
		this.e = afh.b(du.l("id"));
		this.c = du.f("Count");
		this.h = Math.max(0, du.g("Damage"));
		if (du.b("tag", 10)) {
			this.f = du.o("tag");
			if (this.e != null) {
				this.e.a(du);
			}
		}

		this.F();
	}

	public boolean b() {
		if (this == a) {
			return true;
		} else if (this.e == null || this.e == afh.a(alv.a)) {
			return true;
		} else {
			return this.c <= 0 ? true : this.h < -32768 || this.h > 65535;
		}
	}

	public static void a(ph ph) {
		ph.a(pf.ITEM_INSTANCE, new qs());
		ph.a(pf.ITEM_INSTANCE, new qt());
	}

	public afj a(int integer) {
		int integer3 = Math.min(integer, this.c);
		afj afj4 = this.l();
		afj4.e(integer3);
		this.g(integer3);
		return afj4;
	}

	public afh c() {
		return this.g ? afh.a(alv.a) : this.e;
	}

	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		rk rk10 = this.c().a(aay, ajs, co, ri, cv, float6, float7, float8);
		if (rk10 == rk.SUCCESS) {
			aay.b(oa.b(this.e));
		}

		return rk10;
	}

	public float a(atl atl) {
		return this.c().a(this, atl);
	}

	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		return this.c().a(ajs, aay, ri);
	}

	public afj a(ajs ajs, sw sw) {
		return this.c().a(this, ajs, sw);
	}

	public du a(du du) {
		kq kq3 = afh.g.b(this.e);
		du.a("id", kq3 == null ? "minecraft:air" : kq3.toString());
		du.a("Count", (byte)this.c);
		du.a("Damage", (short)this.h);
		if (this.f != null) {
			du.a("tag", this.f);
		}

		return du;
	}

	public int d() {
		return this.c().k();
	}

	public boolean e() {
		return this.d() > 1 && (!this.f() || !this.h());
	}

	public boolean f() {
		if (this.g) {
			return false;
		} else {
			return this.e.m() <= 0 ? false : !this.o() || !this.p().p("Unbreakable");
		}
	}

	public boolean g() {
		return this.c().l();
	}

	public boolean h() {
		return this.f() && this.h > 0;
	}

	public int i() {
		return this.h;
	}

	public int j() {
		return this.h;
	}

	public void b(int integer) {
		this.h = integer;
		if (this.h < 0) {
			this.h = 0;
		}
	}

	public int k() {
		return this.c().m();
	}

	public boolean a(int integer, Random random) {
		if (!this.f()) {
			return false;
		} else {
			if (integer > 0) {
				int integer4 = aik.a(aim.u, this);
				int integer5 = 0;

				for (int integer6 = 0; integer4 > 0 && integer6 < integer; integer6++) {
					if (aig.a(this, integer4, random)) {
						integer5++;
					}
				}

				integer -= integer5;
				if (integer <= 0) {
					return false;
				}
			}

			this.h += integer;
			return this.h > this.k();
		}
	}

	public void a(int integer, sw sw) {
		if (!(sw instanceof aay) || !((aay)sw).bK.d) {
			if (this.f()) {
				if (this.a(integer, sw.bJ())) {
					sw.b(this);
					this.g(1);
					if (sw instanceof aay) {
						aay aay4 = (aay)sw;
						aay4.b(oa.c(this.e));
					}

					this.h = 0;
				}
			}
		}
	}

	public void a(sw sw, aay aay) {
		boolean boolean4 = this.e.a(this, sw, aay);
		if (boolean4) {
			aay.b(oa.b(this.e));
		}
	}

	public void a(ajs ajs, atl atl, co co, aay aay) {
		boolean boolean6 = this.c().a(this, ajs, atl, co, aay);
		if (boolean6) {
			aay.b(oa.b(this.e));
		}
	}

	public boolean b(atl atl) {
		return this.c().a(atl);
	}

	public boolean a(aay aay, sw sw, ri ri) {
		return this.c().a(this, aay, sw, ri);
	}

	public afj l() {
		afj afj2 = new afj(this.e, this.c, this.h);
		if (this.f != null) {
			afj2.f = this.f.g();
		}

		return afj2;
	}

	public static boolean a(afj afj1, afj afj2) {
		if (afj1.b() && afj2.b()) {
			return true;
		} else if (afj1.b() || afj2.b()) {
			return false;
		} else {
			return afj1.f == null && afj2.f != null ? false : afj1.f == null || afj1.f.equals(afj2.f);
		}
	}

	public static boolean b(afj afj1, afj afj2) {
		if (afj1.b() && afj2.b()) {
			return true;
		} else {
			return !afj1.b() && !afj2.b() ? afj1.d(afj2) : false;
		}
	}

	private boolean d(afj afj) {
		if (this.c != afj.c) {
			return false;
		} else if (this.c() != afj.c()) {
			return false;
		} else if (this.h != afj.h) {
			return false;
		} else {
			return this.f == null && afj.f != null ? false : this.f == null || this.f.equals(afj.f);
		}
	}

	public static boolean c(afj afj1, afj afj2) {
		if (afj1 == afj2) {
			return true;
		} else {
			return !afj1.b() && !afj2.b() ? afj1.a(afj2) : false;
		}
	}

	public static boolean d(afj afj1, afj afj2) {
		if (afj1 == afj2) {
			return true;
		} else {
			return !afj1.b() && !afj2.b() ? afj1.b(afj2) : false;
		}
	}

	public boolean a(afj afj) {
		return !afj.b() && this.e == afj.e && this.h == afj.h;
	}

	public boolean b(afj afj) {
		return !this.f() ? this.a(afj) : !afj.b() && this.e == afj.e;
	}

	public String a() {
		return this.c().a(this);
	}

	public String toString() {
		return this.c + "x" + this.c().a() + "@" + this.h;
	}

	public void a(ajs ajs, sn sn, int integer, boolean boolean4) {
		if (this.d > 0) {
			this.d--;
		}

		if (this.e != null) {
			this.e.a(this, ajs, sn, integer, boolean4);
		}
	}

	public void a(ajs ajs, aay aay, int integer) {
		aay.a(oa.a(this.e), integer);
		this.c().b(this, ajs, aay);
	}

	public int m() {
		return this.c().e(this);
	}

	public agu n() {
		return this.c().f(this);
	}

	public void a(ajs ajs, sw sw, int integer) {
		this.c().a(this, ajs, sw, integer);
	}

	public boolean o() {
		return !this.g && this.f != null;
	}

	@Nullable
	public du p() {
		return this.f;
	}

	public du c(String string) {
		if (this.f != null && this.f.b(string, 10)) {
			return this.f.o(string);
		} else {
			du du3 = new du();
			this.a(string, du3);
			return du3;
		}
	}

	@Nullable
	public du d(String string) {
		return this.f != null && this.f.b(string, 10) ? this.f.o(string) : null;
	}

	public void e(String string) {
		if (this.f != null && this.f.b(string, 10)) {
			this.f.q(string);
		}
	}

	@Nullable
	public ea q() {
		return this.f == null ? null : this.f.c("ench", 10);
	}

	public void b(@Nullable du du) {
		this.f = du;
	}

	public String r() {
		du du2 = this.d("display");
		if (du2 != null) {
			if (du2.b("Name", 8)) {
				return du2.l("Name");
			}

			if (du2.b("LocName", 8)) {
				return dp.a(du2.l("LocName"));
			}
		}

		return this.c().b(this);
	}

	public afj f(String string) {
		this.c("display").a("LocName", string);
		return this;
	}

	public afj g(String string) {
		this.c("display").a("Name", string);
		return this;
	}

	public void s() {
		du du2 = this.d("display");
		if (du2 != null) {
			du2.q("Name");
			if (du2.b_()) {
				this.e("display");
			}
		}

		if (this.f != null && this.f.b_()) {
			this.f = null;
		}
	}

	public boolean t() {
		du du2 = this.d("display");
		return du2 != null && du2.b("Name", 8);
	}

	public List<String> a(aay aay, boolean boolean2) {
		List<String> list4 = Lists.newArrayList();
		String string5 = this.r();
		if (this.t()) {
			string5 = a.ITALIC + string5;
		}

		string5 = string5 + a.RESET;
		if (boolean2) {
			String string6 = "";
			if (!string5.isEmpty()) {
				string5 = string5 + " (";
				string6 = ")";
			}

			int integer7 = afh.a(this.e);
			if (this.g()) {
				string5 = string5 + String.format("#%04d/%d%s", integer7, this.h, string6);
			} else {
				string5 = string5 + String.format("#%04d%s", integer7, string6);
			}
		} else if (!this.t() && this.e == afl.bl) {
			string5 = string5 + " #" + this.h;
		}

		list4.add(string5);
		int integer6 = 0;
		if (this.o() && this.f.b("HideFlags", 99)) {
			integer6 = this.f.h("HideFlags");
		}

		if ((integer6 & 32) == 0) {
			this.c().a(this, aay, list4, boolean2);
		}

		if (this.o()) {
			if ((integer6 & 1) == 0) {
				ea ea7 = this.q();
				if (ea7 != null && !ea7.b_()) {
					for (int integer8 = 0; integer8 < ea7.c(); integer8++) {
						int integer9 = ea7.b(integer8).g("id");
						int integer10 = ea7.b(integer8).g("lvl");
						if (aii.c(integer9) != null) {
							list4.add(aii.c(integer9).d(integer10));
						}
					}
				}
			}

			if (this.f.b("display", 10)) {
				du du7 = this.f.o("display");
				if (du7.b("color", 3)) {
					if (boolean2) {
						list4.add(dp.a("item.color", String.format("#%06X", du7.h("color"))));
					} else {
						list4.add(a.ITALIC + dp.a("item.dyed"));
					}
				}

				if (du7.d("Lore") == 9) {
					ea ea8 = du7.c("Lore", 8);
					if (!ea8.b_()) {
						for (int integer9 = 0; integer9 < ea8.c(); integer9++) {
							list4.add(a.DARK_PURPLE + "" + a.ITALIC + ea8.g(integer9));
						}
					}
				}
			}
		}

		for (ss ss10 : ss.values()) {
			Multimap<String, tl> multimap11 = this.a(ss10);
			if (!multimap11.isEmpty() && (integer6 & 2) == 0) {
				list4.add("");
				list4.add(dp.a("item.modifiers." + ss10.d()));

				for (Entry<String, tl> entry13 : multimap11.entries()) {
					tl tl14 = (tl)entry13.getValue();
					double double15 = tl14.d();
					boolean boolean19 = false;
					if (tl14.a() == afh.h) {
						double15 += aay.a(aad.e).b();
						double15 += (double)aik.a(this, tb.UNDEFINED);
						boolean19 = true;
					} else if (tl14.a() == afh.i) {
						double15 += aay.a(aad.f).b();
						boolean19 = true;
					}

					double double17;
					if (tl14.c() != 1 && tl14.c() != 2) {
						double17 = double15;
					} else {
						double17 = double15 * 100.0;
					}

					if (boolean19) {
						list4.add(" " + dp.a("attribute.modifier.equals." + tl14.c(), b.format(double17), dp.a("attribute.name." + (String)entry13.getKey())));
					} else if (double15 > 0.0) {
						list4.add(a.BLUE + " " + dp.a("attribute.modifier.plus." + tl14.c(), b.format(double17), dp.a("attribute.name." + (String)entry13.getKey())));
					} else if (double15 < 0.0) {
						double17 *= -1.0;
						list4.add(a.RED + " " + dp.a("attribute.modifier.take." + tl14.c(), b.format(double17), dp.a("attribute.name." + (String)entry13.getKey())));
					}
				}
			}
		}

		if (this.o() && this.p().p("Unbreakable") && (integer6 & 4) == 0) {
			list4.add(a.BLUE + dp.a("item.unbreakable"));
		}

		if (this.o() && this.f.b("CanDestroy", 9) && (integer6 & 8) == 0) {
			ea ea7 = this.f.c("CanDestroy", 8);
			if (!ea7.b_()) {
				list4.add("");
				list4.add(a.GRAY + dp.a("item.canBreak"));

				for (int integer8x = 0; integer8x < ea7.c(); integer8x++) {
					alu alu9 = alu.b(ea7.g(integer8x));
					if (alu9 != null) {
						list4.add(a.DARK_GRAY + alu9.c());
					} else {
						list4.add(a.DARK_GRAY + "missingno");
					}
				}
			}
		}

		if (this.o() && this.f.b("CanPlaceOn", 9) && (integer6 & 16) == 0) {
			ea ea7 = this.f.c("CanPlaceOn", 8);
			if (!ea7.b_()) {
				list4.add("");
				list4.add(a.GRAY + dp.a("item.canPlace"));

				for (int integer8xx = 0; integer8xx < ea7.c(); integer8xx++) {
					alu alu9 = alu.b(ea7.g(integer8xx));
					if (alu9 != null) {
						list4.add(a.DARK_GRAY + alu9.c());
					} else {
						list4.add(a.DARK_GRAY + "missingno");
					}
				}
			}
		}

		if (boolean2) {
			if (this.h()) {
				list4.add(dp.a("item.durability", this.k() - this.i(), this.k()));
			}

			list4.add(a.DARK_GRAY + afh.g.b(this.e).toString());
			if (this.o()) {
				list4.add(a.DARK_GRAY + dp.a("item.nbt_tags", this.p().c().size()));
			}
		}

		return list4;
	}

	public boolean u() {
		return this.c().f_(this);
	}

	public afx v() {
		return this.c().g(this);
	}

	public boolean w() {
		return !this.c().g_(this) ? false : !this.x();
	}

	public void a(aii aii, int integer) {
		if (this.f == null) {
			this.b(new du());
		}

		if (!this.f.b("ench", 9)) {
			this.f.a("ench", new ea());
		}

		ea ea4 = this.f.c("ench", 10);
		du du5 = new du();
		du5.a("id", (short)aii.b(aii));
		du5.a("lvl", (short)((byte)integer));
		ea4.a(du5);
	}

	public boolean x() {
		return this.f != null && this.f.b("ench", 9) ? !this.f.c("ench", 10).b_() : false;
	}

	public void a(String string, ei ei) {
		if (this.f == null) {
			this.b(new du());
		}

		this.f.a(string, ei);
	}

	public boolean y() {
		return this.c().t();
	}

	public boolean z() {
		return this.i != null;
	}

	public void a(yz yz) {
		this.i = yz;
	}

	@Nullable
	public yz A() {
		return this.g ? null : this.i;
	}

	public int B() {
		return this.o() && this.f.b("RepairCost", 3) ? this.f.h("RepairCost") : 0;
	}

	public void c(int integer) {
		if (!this.o()) {
			this.f = new du();
		}

		this.f.a("RepairCost", integer);
	}

	public Multimap<String, tl> a(ss ss) {
		Multimap<String, tl> multimap3;
		if (this.o() && this.f.b("AttributeModifiers", 9)) {
			multimap3 = HashMultimap.create();
			ea ea4 = this.f.c("AttributeModifiers", 10);

			for (int integer5 = 0; integer5 < ea4.c(); integer5++) {
				du du6 = ea4.b(integer5);
				tl tl7 = aad.a(du6);
				if (tl7 != null && (!du6.b("Slot", 8) || du6.l("Slot").equals(ss.d())) && tl7.a().getLeastSignificantBits() != 0L && tl7.a().getMostSignificantBits() != 0L
					)
				 {
					multimap3.put(du6.l("AttributeName"), tl7);
				}
			}
		} else {
			multimap3 = this.c().a(ss);
		}

		return multimap3;
	}

	public void a(String string, tl tl, @Nullable ss ss) {
		if (this.f == null) {
			this.f = new du();
		}

		if (!this.f.b("AttributeModifiers", 9)) {
			this.f.a("AttributeModifiers", new ea());
		}

		ea ea5 = this.f.c("AttributeModifiers", 10);
		du du6 = aad.a(tl);
		du6.a("AttributeName", string);
		if (ss != null) {
			du6.a("Slot", ss.d());
		}

		ea5.a(du6);
	}

	public fb C() {
		fh fh2 = new fh(this.r());
		if (this.t()) {
			fh2.b().b(true);
		}

		fb fb3 = new fh("[").a(fh2).a("]");
		if (!this.g) {
			du du4 = this.a(new du());
			fb3.b().a(new fd(fd.a.SHOW_ITEM, new fh(du4.toString())));
			fb3.b().a(this.v().e);
		}

		return fb3;
	}

	public boolean a(alu alu) {
		if (alu == this.j) {
			return this.k;
		} else {
			this.j = alu;
			if (this.o() && this.f.b("CanDestroy", 9)) {
				ea ea3 = this.f.c("CanDestroy", 8);

				for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
					alu alu5 = alu.b(ea3.g(integer4));
					if (alu5 == alu) {
						this.k = true;
						return true;
					}
				}
			}

			this.k = false;
			return false;
		}
	}

	public boolean b(alu alu) {
		if (alu == this.l) {
			return this.m;
		} else {
			this.l = alu;
			if (this.o() && this.f.b("CanPlaceOn", 9)) {
				ea ea3 = this.f.c("CanPlaceOn", 8);

				for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
					alu alu5 = alu.b(ea3.g(integer4));
					if (alu5 == alu) {
						this.m = true;
						return true;
					}
				}
			}

			this.m = false;
			return false;
		}
	}

	public int D() {
		return this.d;
	}

	public void d(int integer) {
		this.d = integer;
	}

	public int E() {
		return this.g ? 0 : this.c;
	}

	public void e(int integer) {
		this.c = integer;
		this.F();
	}

	public void f(int integer) {
		this.e(this.c + integer);
	}

	public void g(int integer) {
		this.f(-integer);
	}
}
