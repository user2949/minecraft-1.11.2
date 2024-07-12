import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import io.netty.buffer.Unpooled;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bij extends bho {
	private static final Logger a = LogManager.getLogger();
	private static final kq f = new kq("textures/gui/book.png");
	private final aay g;
	private final afj h;
	private final boolean i;
	private boolean r;
	private boolean s;
	private int t;
	private final int u = 192;
	private final int v = 192;
	private int w = 1;
	private int x;
	private ea y;
	private String z = "";
	private List<fb> A;
	private int B = -1;
	private bij.a C;
	private bij.a D;
	private bfm E;
	private bfm F;
	private bfm G;
	private bfm H;

	public bij(aay aay, afj afj, boolean boolean3) {
		this.g = aay;
		this.h = afj;
		this.i = boolean3;
		if (afj.o()) {
			du du5 = afj.p();
			this.y = du5.c("pages", 8).d();
			this.w = this.y.c();
			if (this.w < 1) {
				this.w = 1;
			}
		}

		if (this.y == null && boolean3) {
			this.y = new ea();
			this.y.a(new eh(""));
			this.w = 1;
		}
	}

	@Override
	public void e() {
		super.e();
		this.t++;
	}

	@Override
	public void b() {
		this.n.clear();
		Keyboard.enableRepeatEvents(true);
		if (this.i) {
			this.F = this.b(new bfm(3, this.l / 2 - 100, 196, 98, 20, cah.a("book.signButton")));
			this.E = this.b(new bfm(0, this.l / 2 + 2, 196, 98, 20, cah.a("gui.done")));
			this.G = this.b(new bfm(5, this.l / 2 - 100, 196, 98, 20, cah.a("book.finalizeButton")));
			this.H = this.b(new bfm(4, this.l / 2 + 2, 196, 98, 20, cah.a("gui.cancel")));
		} else {
			this.E = this.b(new bfm(0, this.l / 2 - 100, 196, 200, 20, cah.a("gui.done")));
		}

		int integer2 = (this.l - 192) / 2;
		int integer3 = 2;
		this.C = this.b(new bij.a(1, integer2 + 120, 156, true));
		this.D = this.b(new bij.a(2, integer2 + 38, 156, false));
		this.f();
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
	}

	private void f() {
		this.C.m = !this.s && (this.x < this.w - 1 || this.i);
		this.D.m = !this.s && this.x > 0;
		this.E.m = !this.i || !this.s;
		if (this.i) {
			this.F.m = !this.s;
			this.H.m = this.s;
			this.G.m = this.s;
			this.G.l = !this.z.trim().isEmpty();
		}
	}

	private void a(boolean boolean1) {
		if (this.i && this.r) {
			if (this.y != null) {
				while (this.y.c() > 1) {
					String string3 = this.y.g(this.y.c() - 1);
					if (!string3.isEmpty()) {
						break;
					}

					this.y.a(this.y.c() - 1);
				}

				if (this.h.o()) {
					du du3 = this.h.p();
					du3.a("pages", this.y);
				} else {
					this.h.a("pages", this.y);
				}

				String string3 = "MC|BEdit";
				if (boolean1) {
					string3 = "MC|BSign";
					this.h.a("author", new eh(this.g.h_()));
					this.h.a("title", new eh(this.z.trim()));
				}

				et et4 = new et(Unpooled.buffer());
				et4.a(this.h);
				this.j.v().a(new iw(string3, et4));
			}
		}
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == 0) {
				this.j.a(null);
				this.a(false);
			} else if (bfm.k == 3 && this.i) {
				this.s = true;
			} else if (bfm.k == 1) {
				if (this.x < this.w - 1) {
					this.x++;
				} else if (this.i) {
					this.g();
					if (this.x < this.w - 1) {
						this.x++;
					}
				}
			} else if (bfm.k == 2) {
				if (this.x > 0) {
					this.x--;
				}
			} else if (bfm.k == 5 && this.s) {
				this.a(true);
				this.j.a(null);
			} else if (bfm.k == 4 && this.s) {
				this.s = false;
			}

			this.f();
		}
	}

	private void g() {
		if (this.y != null && this.y.c() < 50) {
			this.y.a(new eh(""));
			this.w++;
			this.r = true;
		}
	}

	@Override
	protected void a(char character, int integer) {
		super.a(character, integer);
		if (this.i) {
			if (this.s) {
				this.c(character, integer);
			} else {
				this.b(character, integer);
			}
		}
	}

	private void b(char character, int integer) {
		if (bho.e(integer)) {
			this.b(bho.o());
		} else {
			switch (integer) {
				case 14:
					String string4 = this.h();
					if (!string4.isEmpty()) {
						this.a(string4.substring(0, string4.length() - 1));
					}

					return;
				case 28:
				case 156:
					this.b("\n");
					return;
				default:
					if (g.a(character)) {
						this.b(Character.toString(character));
					}
			}
		}
	}

	private void c(char character, int integer) {
		switch (integer) {
			case 14:
				if (!this.z.isEmpty()) {
					this.z = this.z.substring(0, this.z.length() - 1);
					this.f();
				}

				return;
			case 28:
			case 156:
				if (!this.z.isEmpty()) {
					this.a(true);
					this.j.a(null);
				}

				return;
			default:
				if (this.z.length() < 16 && g.a(character)) {
					this.z = this.z + Character.toString(character);
					this.f();
					this.r = true;
				}
		}
	}

	private String h() {
		return this.y != null && this.x >= 0 && this.x < this.y.c() ? this.y.g(this.x) : "";
	}

	private void a(String string) {
		if (this.y != null && this.x >= 0 && this.x < this.y.c()) {
			this.y.a(this.x, new eh(string));
			this.r = true;
		}
	}

	private void b(String string) {
		String string3 = this.h();
		String string4 = string3 + string;
		int integer5 = this.q.b(string4 + "" + a.BLACK + "_", 118);
		if (integer5 <= 128 && string4.length() < 256) {
			this.a(string4);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(f);
		int integer5 = (this.l - 192) / 2;
		int integer6 = 2;
		this.b(integer5, 2, 0, 0, 192, 192);
		if (this.s) {
			String string7 = this.z;
			if (this.i) {
				if (this.t / 6 % 2 == 0) {
					string7 = string7 + "" + a.BLACK + "_";
				} else {
					string7 = string7 + "" + a.GRAY + "_";
				}
			}

			String string8 = cah.a("book.editTitle");
			int integer9 = this.q.a(string8);
			this.q.a(string8, integer5 + 36 + (116 - integer9) / 2, 34, 0);
			int integer10 = this.q.a(string7);
			this.q.a(string7, integer5 + 36 + (116 - integer10) / 2, 50, 0);
			String string11 = cah.a("book.byAuthor", this.g.h_());
			int integer12 = this.q.a(string11);
			this.q.a(a.DARK_GRAY + string11, integer5 + 36 + (116 - integer12) / 2, 60, 0);
			String string13 = cah.a("book.finalizeWarning");
			this.q.a(string13, integer5 + 36, 82, 116, 0);
		} else {
			String string7 = cah.a("book.pageIndicator", this.x + 1, this.w);
			String string8 = "";
			if (this.y != null && this.x >= 0 && this.x < this.y.c()) {
				string8 = this.y.g(this.x);
			}

			if (this.i) {
				if (this.q.b()) {
					string8 = string8 + "_";
				} else if (this.t / 6 % 2 == 0) {
					string8 = string8 + "" + a.BLACK + "_";
				} else {
					string8 = string8 + "" + a.GRAY + "_";
				}
			} else if (this.B != this.x) {
				if (agx.b(this.h.p())) {
					try {
						fb fb9 = fb.a.a(string8);
						this.A = fb9 != null ? bfo.a(fb9, 116, this.q, true, true) : null;
					} catch (JsonParseException var13) {
						this.A = null;
					}
				} else {
					fh fh9 = new fh(a.DARK_RED + "* Invalid book tag *");
					this.A = Lists.newArrayList(fh9);
				}

				this.B = this.x;
			}

			int integer9 = this.q.a(string7);
			this.q.a(string7, integer5 - integer9 + 192 - 44, 18, 0);
			if (this.A == null) {
				this.q.a(string8, integer5 + 36, 34, 116, 0);
			} else {
				int integer10 = Math.min(128 / this.q.a, this.A.size());

				for (int integer11 = 0; integer11 < integer10; integer11++) {
					fb fb12 = (fb)this.A.get(integer11);
					this.q.a(fb12.c(), integer5 + 36, 34 + integer11 * this.q.a, 0);
				}

				fb fb11 = this.b(integer1, integer2);
				if (fb11 != null) {
					this.a(fb11, integer1, integer2);
				}
			}
		}

		super.a(integer1, integer2, float3);
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		if (integer3 == 0) {
			fb fb5 = this.b(integer1, integer2);
			if (fb5 != null && this.a(fb5)) {
				return;
			}
		}

		super.a(integer1, integer2, integer3);
	}

	@Override
	protected boolean a(fb fb) {
		fa fa3 = fb.b().h();
		if (fa3 == null) {
			return false;
		} else if (fa3.a() == fa.a.CHANGE_PAGE) {
			String string4 = fa3.b();

			try {
				int integer5 = Integer.parseInt(string4) - 1;
				if (integer5 >= 0 && integer5 < this.w && integer5 != this.x) {
					this.x = integer5;
					this.f();
					return true;
				}
			} catch (Throwable var5) {
			}

			return false;
		} else {
			boolean boolean4 = super.a(fb);
			if (boolean4 && fa3.a() == fa.a.RUN_COMMAND) {
				this.j.a(null);
			}

			return boolean4;
		}
	}

	@Nullable
	public fb b(int integer1, int integer2) {
		if (this.A == null) {
			return null;
		} else {
			int integer4 = integer1 - (this.l - 192) / 2 - 36;
			int integer5 = integer2 - 2 - 16 - 16;
			if (integer4 >= 0 && integer5 >= 0) {
				int integer6 = Math.min(128 / this.q.a, this.A.size());
				if (integer4 <= 116 && integer5 < this.j.k.a * integer6 + integer6) {
					int integer7 = integer5 / this.j.k.a;
					if (integer7 >= 0 && integer7 < this.A.size()) {
						fb fb8 = (fb)this.A.get(integer7);
						int integer9 = 0;

						for (fb fb11 : fb8) {
							if (fb11 instanceof fh) {
								integer9 += this.j.k.a(((fh)fb11).g());
								if (integer9 > integer4) {
									return fb11;
								}
							}
						}
					}

					return null;
				} else {
					return null;
				}
			} else {
				return null;
			}
		}
	}

	static class a extends bfm {
		private final boolean o;

		public a(int integer1, int integer2, int integer3, boolean boolean4) {
			super(integer1, integer2, integer3, 23, 13, "");
			this.o = boolean4;
		}

		@Override
		public void a(bes bes, int integer2, int integer3) {
			if (this.m) {
				boolean boolean5 = integer2 >= this.h && integer3 >= this.i && integer2 < this.h + this.f && integer3 < this.i + this.g;
				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				bes.N().a(bij.f);
				int integer6 = 0;
				int integer7 = 192;
				if (boolean5) {
					integer6 += 23;
				}

				if (!this.o) {
					integer7 += 13;
				}

				this.b(this.h, this.i, integer6, integer7, 23, 13);
			}
		}
	}
}
