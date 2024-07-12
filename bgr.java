import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class bgr extends bho implements bht {
	private static final Logger f = LogManager.getLogger();
	private String g = "";
	private int h = -1;
	private bhu i;
	protected bfq a;
	private String r = "";

	public bgr() {
	}

	public bgr(String string) {
		this.r = string;
	}

	@Override
	public void b() {
		Keyboard.enableRepeatEvents(true);
		this.h = this.j.r.d().b().size();
		this.a = new bfq(0, this.q, 4, this.m - 12, this.l - 4, 12);
		this.a.f(256);
		this.a.a(false);
		this.a.b(true);
		this.a.a(this.r);
		this.a.d(false);
		this.i = new bgr.a(this.a);
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
		this.j.r.d().c();
	}

	@Override
	public void e() {
		this.a.a();
	}

	@Override
	protected void a(char character, int integer) {
		this.i.d();
		if (integer == 15) {
			this.i.a();
		} else {
			this.i.c();
		}

		if (integer == 1) {
			this.j.a(null);
		} else if (integer == 28 || integer == 156) {
			String string4 = this.a.b().trim();
			if (!string4.isEmpty()) {
				this.f(string4);
			}

			this.j.a(null);
		} else if (integer == 200) {
			this.b(-1);
		} else if (integer == 208) {
			this.b(1);
		} else if (integer == 201) {
			this.j.r.d().b(this.j.r.d().h() - 1);
		} else if (integer == 209) {
			this.j.r.d().b(-this.j.r.d().h() + 1);
		} else {
			this.a.a(character, integer);
		}
	}

	@Override
	public void k() {
		super.k();
		int integer2 = Mouse.getEventDWheel();
		if (integer2 != 0) {
			if (integer2 > 1) {
				integer2 = 1;
			}

			if (integer2 < -1) {
				integer2 = -1;
			}

			if (!r()) {
				integer2 *= 7;
			}

			this.j.r.d().b(integer2);
		}
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		if (integer3 == 0) {
			fb fb5 = this.j.r.d().a(Mouse.getX(), Mouse.getY());
			if (fb5 != null && this.a(fb5)) {
				return;
			}
		}

		this.a.a(integer1, integer2, integer3);
		super.a(integer1, integer2, integer3);
	}

	@Override
	protected void a(String string, boolean boolean2) {
		if (boolean2) {
			this.a.a(string);
		} else {
			this.a.b(string);
		}
	}

	public void b(int integer) {
		int integer3 = this.h + integer;
		int integer4 = this.j.r.d().b().size();
		integer3 = ot.a(integer3, 0, integer4);
		if (integer3 != this.h) {
			if (integer3 == integer4) {
				this.h = integer4;
				this.a.a(this.g);
			} else {
				if (this.h == integer4) {
					this.g = this.a.b();
				}

				this.a.a((String)this.j.r.d().b().get(integer3));
				this.h = integer3;
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		a(2, this.m - 14, this.l - 2, this.m - 2, Integer.MIN_VALUE);
		this.a.g();
		fb fb5 = this.j.r.d().a(Mouse.getX(), Mouse.getY());
		if (fb5 != null && fb5.b().i() != null) {
			this.a(fb5, integer1, integer2);
		}

		super.a(integer1, integer2, float3);
	}

	@Override
	public boolean d() {
		return false;
	}

	@Override
	public void a(String... arr) {
		this.i.a(arr);
	}

	public static class a extends bhu {
		private final bes g = bes.z();

		public a(bfq bfq) {
			super(bfq, false);
		}

		@Override
		public void a() {
			super.a();
			if (this.f.size() > 1) {
				StringBuilder stringBuilder2 = new StringBuilder();

				for (String string4 : this.f) {
					if (stringBuilder2.length() > 0) {
						stringBuilder2.append(", ");
					}

					stringBuilder2.append(string4);
				}

				this.g.r.d().a(new fh(stringBuilder2.toString()), 1);
			}
		}

		@Nullable
		@Override
		public co b() {
			co co2 = null;
			if (this.g.t != null && this.g.t.a == bdu.a.BLOCK) {
				co2 = this.g.t.a();
			}

			return co2;
		}
	}
}
