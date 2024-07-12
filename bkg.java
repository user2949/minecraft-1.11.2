import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.List;

public class bkg {
	private static final bki b = new bkg.a();
	private static final bki c = new bkg.b(-1, true);
	private static final bki d = new bkg.b(1, true);
	private static final bki e = new bkg.b(1, false);
	public static final bki a = new bki() {
		@Override
		public void a(bkg bkg) {
		}

		@Override
		public fb I_() {
			return new fh("");
		}

		@Override
		public void a(float float1, int integer) {
		}

		@Override
		public boolean J_() {
			return false;
		}
	};
	private final bkj f;
	private final List<bkk> g = Lists.newArrayList();
	private bkh h;
	private int i = -1;
	private int j;

	public bkg(bkj bkj) {
		this.h = new bkf();
		this.f = bkj;
	}

	public bki a(int integer) {
		int integer3 = integer + this.j * 6;
		if (this.j > 0 && integer == 0) {
			return c;
		} else if (integer == 7) {
			return integer3 < this.h.a().size() ? d : e;
		} else if (integer == 8) {
			return b;
		} else {
			return integer3 >= 0 && integer3 < this.h.a().size() ? (bki)Objects.firstNonNull(this.h.a().get(integer3), a) : a;
		}
	}

	public List<bki> a() {
		List<bki> list2 = Lists.newArrayList();

		for (int integer3 = 0; integer3 <= 8; integer3++) {
			list2.add(this.a(integer3));
		}

		return list2;
	}

	public bki b() {
		return this.a(this.i);
	}

	public bkh c() {
		return this.h;
	}

	public void b(int integer) {
		bki bki3 = this.a(integer);
		if (bki3 != a) {
			if (this.i == integer && bki3.J_()) {
				bki3.a(this);
			} else {
				this.i = integer;
			}
		}
	}

	public void d() {
		this.f.a(this);
	}

	public int e() {
		return this.i;
	}

	public void a(bkh bkh) {
		this.g.add(this.f());
		this.h = bkh;
		this.i = -1;
		this.j = 0;
	}

	public bkk f() {
		return new bkk(this.h, this.a(), this.i);
	}

	static class a implements bki {
		private a() {
		}

		@Override
		public void a(bkg bkg) {
			bkg.d();
		}

		@Override
		public fb I_() {
			return new fi("spectatorMenu.close");
		}

		@Override
		public void a(float float1, int integer) {
			bes.z().N().a(bgh.a);
			bfi.a(0, 0, 128.0F, 0.0F, 16, 16, 256.0F, 256.0F);
		}

		@Override
		public boolean J_() {
			return true;
		}
	}

	static class b implements bki {
		private final int a;
		private final boolean b;

		public b(int integer, boolean boolean2) {
			this.a = integer;
			this.b = boolean2;
		}

		@Override
		public void a(bkg bkg) {
			bkg.j = bkg.j + this.a;
		}

		@Override
		public fb I_() {
			return this.a < 0 ? new fi("spectatorMenu.previous_page") : new fi("spectatorMenu.next_page");
		}

		@Override
		public void a(float float1, int integer) {
			bes.z().N().a(bgh.a);
			if (this.a < 0) {
				bfi.a(0, 0, 144.0F, 0.0F, 16, 16, 256.0F, 256.0F);
			} else {
				bfi.a(0, 0, 160.0F, 0.0F, 16, 16, 256.0F, 256.0F);
			}
		}

		@Override
		public boolean J_() {
			return this.b;
		}
	}
}
