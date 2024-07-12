import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class bip extends bir {
	private static final kq u = new kq("textures/gui/container/creative_inventory/tabs.png");
	private static final rr v = new rr("tmp", true, 45);
	private static int w = aej.b.a();
	private float x;
	private boolean y;
	private boolean z;
	private bfq A;
	private List<adl> B;
	private adl C;
	private boolean D;
	private bio E;

	public bip(aay aay) {
		super(new bip.a(aay));
		aay.bu = this.h;
		this.p = true;
		this.g = 136;
		this.f = 195;
	}

	@Override
	public void e() {
		if (!this.j.c.h()) {
			this.j.a(new bix(this.j.h));
		}
	}

	@Override
	protected void a(@Nullable adl adl, int integer2, int integer3, acq acq) {
		this.D = true;
		boolean boolean6 = acq == acq.QUICK_MOVE;
		acq = integer2 == -999 && acq == acq.PICKUP ? acq.THROW : acq;
		if (adl == null && w != aej.m.a() && acq != acq.QUICK_CRAFT) {
			aax aax7 = this.j.h.bs;
			if (!aax7.p().b()) {
				if (integer3 == 0) {
					this.j.h.a(aax7.p(), true);
					this.j.c.a(aax7.p());
					aax7.e(afj.a);
				}

				if (integer3 == 1) {
					afj afj8 = aax7.p().a(1);
					this.j.h.a(afj8, true);
					this.j.c.a(afj8);
				}
			}
		} else if (adl == this.C && boolean6) {
			for (int integer7 = 0; integer7 < this.j.h.bt.a().size(); integer7++) {
				this.j.c.a(afj.a, integer7);
			}
		} else if (w == aej.m.a()) {
			if (adl == this.C) {
				this.j.h.bs.e(afj.a);
			} else if (acq == acq.THROW && adl != null && adl.e()) {
				afj afj7 = adl.a(integer3 == 0 ? 1 : adl.d().d());
				afj afj8 = adl.d();
				this.j.h.a(afj7, true);
				this.j.c.a(afj7);
				this.j.c.a(afj8, ((bip.b)adl).b.e);
			} else if (acq == acq.THROW && !this.j.h.bs.p().b()) {
				this.j.h.a(this.j.h.bs.p(), true);
				this.j.c.a(this.j.h.bs.p());
				this.j.h.bs.e(afj.a);
			} else {
				this.j.h.bt.a(adl == null ? integer2 : ((bip.b)adl).b.e, integer3, acq, this.j.h);
				this.j.h.bt.b();
			}
		} else if (acq != acq.QUICK_CRAFT && adl.d == v) {
			aax aax7 = this.j.h.bs;
			afj afj8 = aax7.p();
			afj afj9 = adl.d();
			if (acq == acq.SWAP) {
				if (!afj9.b() && integer3 >= 0 && integer3 < 9) {
					afj afj10 = afj9.l();
					afj10.e(afj10.d());
					this.j.h.bs.a(integer3, afj10);
					this.j.h.bt.b();
				}

				return;
			}

			if (acq == acq.CLONE) {
				if (aax7.p().b() && adl.e()) {
					afj afj10 = adl.d().l();
					afj10.e(afj10.d());
					aax7.e(afj10);
				}

				return;
			}

			if (acq == acq.THROW) {
				if (!afj9.b()) {
					afj afj10 = afj9.l();
					afj10.e(integer3 == 0 ? 1 : afj10.d());
					this.j.h.a(afj10, true);
					this.j.c.a(afj10);
				}

				return;
			}

			if (!afj8.b() && !afj9.b() && afj8.a(afj9) && afj.a(afj8, afj9)) {
				if (integer3 == 0) {
					if (boolean6) {
						afj8.e(afj8.d());
					} else if (afj8.E() < afj8.d()) {
						afj8.f(1);
					}
				} else if (afj8.E() == 1) {
					aax7.e(afj.a);
				} else {
					afj8.g(1);
				}
			} else if (!afj9.b() && afj8.b()) {
				aax7.e(afj9.l());
				afj8 = aax7.p();
				if (boolean6) {
					afj8.e(afj8.d());
				}
			} else {
				aax7.e(afj.a);
			}
		} else if (this.h != null) {
			afj afj7 = adl == null ? afj.a : this.h.a(adl.e).d();
			this.h.a(adl == null ? integer2 : adl.e, integer3, acq, this.j.h);
			if (acl.c(integer3) == 2) {
				for (int integer8 = 0; integer8 < 9; integer8++) {
					this.j.c.a(this.h.a(45 + integer8).d(), 36 + integer8);
				}
			} else if (adl != null) {
				afj afj8x = this.h.a(adl.e).d();
				this.j.c.a(afj8x, adl.e - this.h.c.size() + 9 + 36);
				int integer9 = 45 + integer3;
				if (acq == acq.SWAP) {
					this.j.c.a(afj7, integer9 - this.h.c.size() + 9 + 36);
				} else if (acq == acq.THROW && afj7 != afj.a) {
					afj afj10 = afj7.l();
					afj10.e(integer3 == 0 ? 1 : afj10.d());
					this.j.h.a(afj10, true);
					this.j.c.a(afj10);
				}
			}
		}
	}

	@Override
	protected void a() {
		int integer2 = this.i;
		super.a();
		if (this.A != null && this.i != integer2) {
			this.A.a = this.i + 82;
		}
	}

	@Override
	public void b() {
		if (this.j.c.h()) {
			super.b();
			this.n.clear();
			Keyboard.enableRepeatEvents(true);
			this.A = new bfq(0, this.q, this.i + 82, this.r + 6, 89, this.q.a);
			this.A.f(15);
			this.A.a(false);
			this.A.e(false);
			this.A.g(16777215);
			int integer2 = w;
			w = -1;
			this.b(aej.a[integer2]);
			this.E = new bio(this.j);
			this.j.h.bt.a(this.E);
		} else {
			this.j.a(new bix(this.j.h));
		}
	}

	@Override
	public void m() {
		super.m();
		if (this.j.h != null && this.j.h.bs != null) {
			this.j.h.bt.b(this.E);
		}

		Keyboard.enableRepeatEvents(false);
	}

	@Override
	protected void a(char character, int integer) {
		if (w != aej.g.a()) {
			if (beu.a(this.j.u.af)) {
				this.b(aej.g);
			} else {
				super.a(character, integer);
			}
		} else {
			if (this.D) {
				this.D = false;
				this.A.a("");
			}

			if (!this.b(integer)) {
				if (this.A.a(character, integer)) {
					this.h();
				} else {
					super.a(character, integer);
				}
			}
		}
	}

	private void h() {
		bip.a a2 = (bip.a)this.h;
		a2.a.clear();

		for (afh afh4 : afh.g) {
			if (afh4 != null && afh4.b() != null) {
				afh4.a(afh4, null, a2.a);
			}
		}

		for (aii aii4 : aii.b) {
			if (aii4 != null && aii4.c != null) {
				afl.co.a(aii4, a2.a);
			}
		}

		Iterator<afj> iterator3 = a2.a.iterator();
		String string4 = this.A.b().toLowerCase(Locale.ROOT);

		while (iterator3.hasNext()) {
			afj afj5 = (afj)iterator3.next();
			boolean boolean6 = false;

			for (String string8 : afj5.a(this.j.h, this.j.u.y)) {
				if (a.a(string8).toLowerCase(Locale.ROOT).contains(string4)) {
					boolean6 = true;
					break;
				}
			}

			if (!boolean6) {
				iterator3.remove();
			}
		}

		this.x = 0.0F;
		a2.a(0.0F);
	}

	@Override
	protected void b(int integer1, int integer2) {
		aej aej4 = aej.a[w];
		if (aej4.g()) {
			bqg.l();
			this.q.a(cah.a(aej4.c()), 8, 6, 4210752);
		}
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		if (integer3 == 0) {
			int integer5 = integer1 - this.i;
			int integer6 = integer2 - this.r;

			for (aej aej10 : aej.a) {
				if (this.a(aej10, integer5, integer6)) {
					return;
				}
			}
		}

		super.a(integer1, integer2, integer3);
	}

	@Override
	protected void b(int integer1, int integer2, int integer3) {
		if (integer3 == 0) {
			int integer5 = integer1 - this.i;
			int integer6 = integer2 - this.r;

			for (aej aej10 : aej.a) {
				if (this.a(aej10, integer5, integer6)) {
					this.b(aej10);
					return;
				}
			}
		}

		super.b(integer1, integer2, integer3);
	}

	private boolean i() {
		return w != aej.m.a() && aej.a[w].i() && ((bip.a)this.h).e();
	}

	private void b(aej aej) {
		int integer3 = w;
		w = aej.a();
		bip.a a4 = (bip.a)this.h;
		this.s.clear();
		a4.a.clear();
		aej.a(a4.a);
		if (aej == aej.m) {
			acl acl5 = this.j.h.bt;
			if (this.B == null) {
				this.B = a4.c;
			}

			a4.c = Lists.newArrayList();

			for (int integer6 = 0; integer6 < acl5.c.size(); integer6++) {
				adl adl7 = new bip.b((adl)acl5.c.get(integer6), integer6);
				a4.c.add(adl7);
				if (integer6 >= 5 && integer6 < 9) {
					int integer8 = integer6 - 5;
					int integer9 = integer8 / 2;
					int integer10 = integer8 % 2;
					adl7.f = 54 + integer9 * 54;
					adl7.g = 6 + integer10 * 27;
				} else if (integer6 >= 0 && integer6 < 5) {
					adl7.f = -2000;
					adl7.g = -2000;
				} else if (integer6 == 45) {
					adl7.f = 35;
					adl7.g = 20;
				} else if (integer6 < acl5.c.size()) {
					int integer8 = integer6 - 9;
					int integer9 = integer8 % 9;
					int integer10 = integer8 / 9;
					adl7.f = 9 + integer9 * 18;
					if (integer6 >= 36) {
						adl7.g = 112;
					} else {
						adl7.g = 54 + integer10 * 18;
					}
				}
			}

			this.C = new adl(v, 0, 173, 112);
			a4.c.add(this.C);
		} else if (integer3 == aej.m.a()) {
			a4.c = this.B;
			this.B = null;
		}

		if (this.A != null) {
			if (aej == aej.g) {
				this.A.e(true);
				this.A.d(false);
				this.A.b(true);
				this.A.a("");
				this.h();
			} else {
				this.A.e(false);
				this.A.d(true);
				this.A.b(false);
			}
		}

		this.x = 0.0F;
		a4.a(0.0F);
	}

	@Override
	public void k() {
		super.k();
		int integer2 = Mouse.getEventDWheel();
		if (integer2 != 0 && this.i()) {
			int integer3 = (((bip.a)this.h).a.size() + 9 - 1) / 9 - 5;
			if (integer2 > 0) {
				integer2 = 1;
			}

			if (integer2 < 0) {
				integer2 = -1;
			}

			this.x = (float)((double)this.x - (double)integer2 / (double)integer3);
			this.x = ot.a(this.x, 0.0F, 1.0F);
			((bip.a)this.h).a(this.x);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		boolean boolean5 = Mouse.isButtonDown(0);
		int integer6 = this.i;
		int integer7 = this.r;
		int integer8 = integer6 + 175;
		int integer9 = integer7 + 18;
		int integer10 = integer8 + 14;
		int integer11 = integer9 + 112;
		if (!this.z && boolean5 && integer1 >= integer8 && integer2 >= integer9 && integer1 < integer10 && integer2 < integer11) {
			this.y = this.i();
		}

		if (!boolean5) {
			this.y = false;
		}

		this.z = boolean5;
		if (this.y) {
			this.x = ((float)(integer2 - integer9) - 7.5F) / ((float)(integer11 - integer9) - 15.0F);
			this.x = ot.a(this.x, 0.0F, 1.0F);
			((bip.a)this.h).a(this.x);
		}

		super.a(integer1, integer2, float3);

		for (aej aej15 : aej.a) {
			if (this.b(aej15, integer1, integer2)) {
				break;
			}
		}

		if (this.C != null && w == aej.m.a() && this.c(this.C.f, this.C.g, 16, 16, integer1, integer2)) {
			this.a(cah.a("inventory.binSlot"), integer1, integer2);
		}

		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.g();
	}

	@Override
	protected void a(afj afj, int integer2, int integer3) {
		if (w == aej.g.a()) {
			List<String> list5 = afj.a(this.j.h, this.j.u.y);
			aej aej6 = afj.c().b();
			if (aej6 == null && afj.c() == afl.co) {
				Map<aii, Integer> map7 = aik.a(afj);
				if (map7.size() == 1) {
					aii aii8 = (aii)map7.keySet().iterator().next();

					for (aej aej12 : aej.a) {
						if (aej12.a(aii8.c)) {
							aej6 = aej12;
							break;
						}
					}
				}
			}

			if (aej6 != null) {
				list5.add(1, "" + a.BOLD + a.BLUE + cah.a(aej6.c()));
			}

			for (int integer7 = 0; integer7 < list5.size(); integer7++) {
				if (integer7 == 0) {
					list5.set(integer7, afj.v().e + (String)list5.get(integer7));
				} else {
					list5.set(integer7, a.GRAY + (String)list5.get(integer7));
				}
			}

			this.a(list5, integer2, integer3);
		} else {
			super.a(afj, integer2, integer3);
		}
	}

	@Override
	protected void a(float float1, int integer2, int integer3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		beq.c();
		aej aej5 = aej.a[w];

		for (aej aej9 : aej.a) {
			this.j.N().a(u);
			if (aej9.a() != w) {
				this.a(aej9);
			}
		}

		this.j.N().a(new kq("textures/gui/container/creative_inventory/tab_" + aej5.f()));
		this.b(this.i, this.r, 0, 0, this.f, this.g);
		this.A.g();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		int integer6 = this.i + 175;
		int integer7 = this.r + 18;
		int integer8 = integer7 + 112;
		this.j.N().a(u);
		if (aej5.i()) {
			this.b(integer6, integer7 + (int)((float)(integer8 - integer7 - 17) * this.x), 232 + (this.i() ? 0 : 12), 0, 12, 15);
		}

		this.a(aej5);
		if (aej5 == aej.m) {
			bix.a(this.i + 88, this.r + 45, 20, (float)(this.i + 88 - integer2), (float)(this.r + 45 - 30 - integer3), this.j.h);
		}
	}

	protected boolean a(aej aej, int integer2, int integer3) {
		int integer5 = aej.k();
		int integer6 = 28 * integer5;
		int integer7 = 0;
		if (integer5 == 5) {
			integer6 = this.f - 28 + 2;
		} else if (integer5 > 0) {
			integer6 += integer5;
		}

		if (aej.l()) {
			integer7 -= 32;
		} else {
			integer7 += this.g;
		}

		return integer2 >= integer6 && integer2 <= integer6 + 28 && integer3 >= integer7 && integer3 <= integer7 + 32;
	}

	protected boolean b(aej aej, int integer2, int integer3) {
		int integer5 = aej.k();
		int integer6 = 28 * integer5;
		int integer7 = 0;
		if (integer5 == 5) {
			integer6 = this.f - 28 + 2;
		} else if (integer5 > 0) {
			integer6 += integer5;
		}

		if (aej.l()) {
			integer7 -= 32;
		} else {
			integer7 += this.g;
		}

		if (this.c(integer6 + 3, integer7 + 3, 23, 27, integer2, integer3)) {
			this.a(cah.a(aej.c()), integer2, integer3);
			return true;
		} else {
			return false;
		}
	}

	protected void a(aej aej) {
		boolean boolean3 = aej.a() == w;
		boolean boolean4 = aej.l();
		int integer5 = aej.k();
		int integer6 = integer5 * 28;
		int integer7 = 0;
		int integer8 = this.i + 28 * integer5;
		int integer9 = this.r;
		int integer10 = 32;
		if (boolean3) {
			integer7 += 32;
		}

		if (integer5 == 5) {
			integer8 = this.i + this.f - 28;
		} else if (integer5 > 0) {
			integer8 += integer5;
		}

		if (boolean4) {
			integer9 -= 28;
		} else {
			integer7 += 64;
			integer9 += this.g - 4;
		}

		bqg.g();
		this.b(integer8, integer9, integer6, integer7, 28, 32);
		this.e = 100.0F;
		this.k.a = 100.0F;
		integer8 += 6;
		integer9 += 8 + (boolean4 ? 1 : -1);
		bqg.f();
		bqg.D();
		afj afj11 = aej.d();
		this.k.b(afj11, integer8, integer9);
		this.k.a(this.q, afj11, integer8, integer9);
		bqg.g();
		this.k.a = 0.0F;
		this.e = 0.0F;
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == 0) {
			this.j.a(new bhz(this, this.j.h.E()));
		}

		if (bfm.k == 1) {
			this.j.a(new bia(this, this.j.h.E()));
		}
	}

	public int f() {
		return w;
	}

	static class a extends acl {
		public dd<afj> a = dd.a();

		public a(aay aay) {
			aax aax3 = aay.bs;

			for (int integer4 = 0; integer4 < 5; integer4++) {
				for (int integer5 = 0; integer5 < 9; integer5++) {
					this.a(new adl(bip.v, integer4 * 9 + integer5, 9 + integer5 * 18, 18 + integer4 * 18));
				}
			}

			for (int integer4 = 0; integer4 < 9; integer4++) {
				this.a(new adl(aax3, integer4, 9 + integer4 * 18, 112));
			}

			this.a(0.0F);
		}

		@Override
		public boolean a(aay aay) {
			return true;
		}

		public void a(float float1) {
			int integer3 = (this.a.size() + 9 - 1) / 9 - 5;
			int integer4 = (int)((double)(float1 * (float)integer3) + 0.5);
			if (integer4 < 0) {
				integer4 = 0;
			}

			for (int integer5 = 0; integer5 < 5; integer5++) {
				for (int integer6 = 0; integer6 < 9; integer6++) {
					int integer7 = integer6 + (integer5 + integer4) * 9;
					if (integer7 >= 0 && integer7 < this.a.size()) {
						bip.v.a(integer6 + integer5 * 9, this.a.get(integer7));
					} else {
						bip.v.a(integer6 + integer5 * 9, afj.a);
					}
				}
			}
		}

		public boolean e() {
			return this.a.size() > 45;
		}

		@Override
		protected void a(int integer1, int integer2, boolean boolean3, aay aay) {
		}

		@Override
		public afj b(aay aay, int integer) {
			if (integer >= this.c.size() - 9 && integer < this.c.size()) {
				adl adl4 = (adl)this.c.get(integer);
				if (adl4 != null && adl4.e()) {
					adl4.d(afj.a);
				}
			}

			return afj.a;
		}

		@Override
		public boolean a(afj afj, adl adl) {
			return adl.g > 90;
		}

		@Override
		public boolean b(adl adl) {
			return adl.d instanceof aax || adl.g > 90 && adl.f <= 162;
		}
	}

	class b extends adl {
		private final adl b;

		public b(adl adl, int integer) {
			super(adl.d, integer, 0, 0);
			this.b = adl;
		}

		@Override
		public afj a(aay aay, afj afj) {
			this.b.a(aay, afj);
			return afj;
		}

		@Override
		public boolean a(afj afj) {
			return this.b.a(afj);
		}

		@Override
		public afj d() {
			return this.b.d();
		}

		@Override
		public boolean e() {
			return this.b.e();
		}

		@Override
		public void d(afj afj) {
			this.b.d(afj);
		}

		@Override
		public void f() {
			this.b.f();
		}

		@Override
		public int a() {
			return this.b.a();
		}

		@Override
		public int b(afj afj) {
			return this.b.b(afj);
		}

		@Nullable
		@Override
		public String c() {
			return this.b.c();
		}

		@Override
		public afj a(int integer) {
			return this.b.a(integer);
		}

		@Override
		public boolean a(rc rc, int integer) {
			return this.b.a(rc, integer);
		}

		@Override
		public boolean b() {
			return this.b.b();
		}

		@Override
		public boolean a(aay aay) {
			return this.b.a(aay);
		}
	}
}
