import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class bid extends bfy {
	private final bie u;
	private final bes v;
	private final bfy.a[] w;
	private int x;

	public bid(bie bie, bes bes) {
		super(bes, bie.l + 45, bie.m, 63, bie.m - 32, 20);
		this.u = bie;
		this.v = bes;
		bep[] arr4 = (bep[])ArrayUtils.clone(bes.u.ao);
		this.w = new bfy.a[arr4.length + bep.d().size()];
		Arrays.sort(arr4);
		int integer5 = 0;
		String string6 = null;

		for (bep bep10 : arr4) {
			String string11 = bep10.f();
			if (!string11.equals(string6)) {
				string6 = string11;
				this.w[integer5++] = new bid.a(string11);
			}

			int integer12 = bes.k.a(cah.a(bep10.h()));
			if (integer12 > this.x) {
				this.x = integer12;
			}

			this.w[integer5++] = new bid.b(bep10);
		}
	}

	@Override
	protected int b() {
		return this.w.length;
	}

	@Override
	public bfy.a b(int integer) {
		return this.w[integer];
	}

	@Override
	protected int d() {
		return super.d() + 15;
	}

	@Override
	public int c() {
		return super.c() + 32;
	}

	public class a implements bfy.a {
		private final String b;
		private final int c;

		public a(String string) {
			this.b = cah.a(string);
			this.c = bid.this.v.k.a(this.b);
		}

		@Override
		public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, boolean boolean8) {
			bid.this.v.k.a(this.b, bid.this.v.m.l / 2 - this.c / 2, integer3 + integer5 - bid.this.v.k.a - 1, 16777215);
		}

		@Override
		public boolean a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			return false;
		}

		@Override
		public void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		}

		@Override
		public void a(int integer1, int integer2, int integer3) {
		}
	}

	public class b implements bfy.a {
		private final bep b;
		private final String c;
		private final bfm d;
		private final bfm e;

		private b(bep bep) {
			this.b = bep;
			this.c = cah.a(bep.h());
			this.d = new bfm(0, 0, 0, 75, 20, cah.a(bep.h()));
			this.e = new bfm(0, 0, 0, 50, 20, cah.a("controls.reset"));
		}

		@Override
		public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, boolean boolean8) {
			boolean boolean10 = bid.this.u.f == this.b;
			bid.this.v.k.a(this.c, integer2 + 90 - bid.this.x, integer3 + integer5 / 2 - bid.this.v.k.a / 2, 16777215);
			this.e.h = integer2 + 190;
			this.e.i = integer3;
			this.e.l = this.b.j() != this.b.i();
			this.e.a(bid.this.v, integer6, integer7);
			this.d.h = integer2 + 105;
			this.d.i = integer3;
			this.d.j = beu.c(this.b.j());
			boolean boolean11 = false;
			if (this.b.j() != 0) {
				for (bep bep15 : bid.this.v.u.ao) {
					if (bep15 != this.b && bep15.j() == this.b.j()) {
						boolean11 = true;
						break;
					}
				}
			}

			if (boolean10) {
				this.d.j = a.WHITE + "> " + a.YELLOW + this.d.j + a.WHITE + " <";
			} else if (boolean11) {
				this.d.j = a.RED + this.d.j;
			}

			this.d.a(bid.this.v, integer6, integer7);
		}

		@Override
		public boolean a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			if (this.d.c(bid.this.v, integer2, integer3)) {
				bid.this.u.f = this.b;
				return true;
			} else if (this.e.c(bid.this.v, integer2, integer3)) {
				bid.this.v.u.a(this.b, this.b.i());
				bep.c();
				return true;
			} else {
				return false;
			}
		}

		@Override
		public void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			this.d.a(integer2, integer3);
			this.e.a(integer2, integer3);
		}

		@Override
		public void a(int integer1, int integer2, int integer3) {
		}
	}
}
