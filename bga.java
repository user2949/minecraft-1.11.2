import com.google.common.collect.Lists;
import java.util.List;

public class bga extends bfy {
	private final List<bga.a> u = Lists.newArrayList();

	public bga(bes bes, int integer2, int integer3, int integer4, int integer5, int integer6, beu.a... arr) {
		super(bes, integer2, integer3, integer4, integer5, integer6);
		this.k = false;

		for (int integer9 = 0; integer9 < arr.length; integer9 += 2) {
			beu.a a10 = arr[integer9];
			beu.a a11 = integer9 < arr.length - 1 ? arr[integer9 + 1] : null;
			bfm bfm12 = this.a(bes, integer2 / 2 - 155, 0, a10);
			bfm bfm13 = this.a(bes, integer2 / 2 - 155 + 160, 0, a11);
			this.u.add(new bga.a(bfm12, bfm13));
		}
	}

	private bfm a(bes bes, int integer2, int integer3, beu.a a) {
		if (a == null) {
			return null;
		} else {
			int integer6 = a.c();
			return (bfm)(a.a() ? new bge(integer6, integer2, integer3, a) : new bfz(integer6, integer2, integer3, a, bes.u.c(a)));
		}
	}

	public bga.a b(int integer) {
		return (bga.a)this.u.get(integer);
	}

	@Override
	protected int b() {
		return this.u.size();
	}

	@Override
	public int c() {
		return 400;
	}

	@Override
	protected int d() {
		return super.d() + 32;
	}

	public static class a implements bfy.a {
		private final bes a = bes.z();
		private final bfm b;
		private final bfm c;

		public a(bfm bfm1, bfm bfm2) {
			this.b = bfm1;
			this.c = bfm2;
		}

		@Override
		public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, boolean boolean8) {
			if (this.b != null) {
				this.b.i = integer3;
				this.b.a(this.a, integer6, integer7);
			}

			if (this.c != null) {
				this.c.i = integer3;
				this.c.a(this.a, integer6, integer7);
			}
		}

		@Override
		public boolean a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			if (this.b.c(this.a, integer2, integer3)) {
				if (this.b instanceof bfz) {
					this.a.u.a(((bfz)this.b).c(), 1);
					this.b.j = this.a.u.c(beu.a.a(this.b.k));
				}

				return true;
			} else if (this.c != null && this.c.c(this.a, integer2, integer3)) {
				if (this.c instanceof bfz) {
					this.a.u.a(((bfz)this.c).c(), 1);
					this.c.j = this.a.u.c(beu.a.a(this.c.k));
				}

				return true;
			} else {
				return false;
			}
		}

		@Override
		public void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			if (this.b != null) {
				this.b.a(integer2, integer3);
			}

			if (this.c != null) {
				this.c.a(integer2, integer3);
			}
		}

		@Override
		public void a(int integer1, int integer2, int integer3) {
		}
	}
}
