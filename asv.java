import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class asv extends asc {
	public final fb[] a = new fb[]{new fh(""), new fh(""), new fh(""), new fh("")};
	public int f = -1;
	private boolean g = true;
	private aay h;
	private final o i = new o();

	@Override
	public du b(du du) {
		super.b(du);

		for (int integer3 = 0; integer3 < 4; integer3++) {
			String string4 = fb.a.a(this.a[integer3]);
			du.a("Text" + (integer3 + 1), string4);
		}

		this.i.b(du);
		return du;
	}

	@Override
	protected void b(ajs ajs) {
		this.a(ajs);
	}

	@Override
	public void a(du du) {
		this.g = false;
		super.a(du);
		n n3 = new n() {
			@Override
			public String h_() {
				return "Sign";
			}

			@Override
			public fb i_() {
				return new fh(this.h_());
			}

			@Override
			public void a(fb fb) {
			}

			@Override
			public boolean a(int integer, String string) {
				return true;
			}

			@Override
			public co c() {
				return asv.this.c;
			}

			@Override
			public bdw d() {
				return new bdw((double)asv.this.c.p() + 0.5, (double)asv.this.c.q() + 0.5, (double)asv.this.c.r() + 0.5);
			}

			@Override
			public ajs e() {
				return asv.this.b;
			}

			@Override
			public sn f() {
				return null;
			}

			@Override
			public boolean g() {
				return false;
			}

			@Override
			public void a(o.a a, int integer) {
			}

			@Override
			public MinecraftServer B_() {
				return asv.this.b.u();
			}
		};

		for (int integer4 = 0; integer4 < 4; integer4++) {
			String string5 = du.l("Text" + (integer4 + 1));
			fb fb6 = fb.a.a(string5);

			try {
				this.a[integer4] = fc.a(n3, fb6, null);
			} catch (cd var7) {
				this.a[integer4] = fb6;
			}
		}

		this.i.a(du);
	}

	@Nullable
	@Override
	public fz c() {
		return new fz(this.c, 9, this.d());
	}

	@Override
	public du d() {
		return this.b(new du());
	}

	@Override
	public boolean C() {
		return true;
	}

	public boolean a() {
		return this.g;
	}

	public void a(boolean boolean1) {
		this.g = boolean1;
		if (!boolean1) {
			this.h = null;
		}
	}

	public void a(aay aay) {
		this.h = aay;
	}

	public aay e() {
		return this.h;
	}

	public boolean b(aay aay) {
		n n3 = new n() {
			@Override
			public String h_() {
				return aay.h_();
			}

			@Override
			public fb i_() {
				return aay.i_();
			}

			@Override
			public void a(fb fb) {
			}

			@Override
			public boolean a(int integer, String string) {
				return integer <= 2;
			}

			@Override
			public co c() {
				return asv.this.c;
			}

			@Override
			public bdw d() {
				return new bdw((double)asv.this.c.p() + 0.5, (double)asv.this.c.q() + 0.5, (double)asv.this.c.r() + 0.5);
			}

			@Override
			public ajs e() {
				return aay.e();
			}

			@Override
			public sn f() {
				return aay;
			}

			@Override
			public boolean g() {
				return false;
			}

			@Override
			public void a(o.a a, int integer) {
				if (asv.this.b != null && !asv.this.b.E) {
					asv.this.i.a(asv.this.b.u(), this, a, integer);
				}
			}

			@Override
			public MinecraftServer B_() {
				return aay.B_();
			}
		};

		for (fb fb7 : this.a) {
			fg fg8 = fb7 == null ? null : fb7.b();
			if (fg8 != null && fg8.h() != null) {
				fa fa9 = fg8.h();
				if (fa9.a() == fa.a.RUN_COMMAND) {
					aay.B_().N().a(n3, fa9.b());
				}
			}
		}

		return true;
	}

	public o f() {
		return this.i;
	}
}
