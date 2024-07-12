import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bjf extends bho {
	private static final Logger a = LogManager.getLogger();
	private final bnv f = new bnv();
	private final bho g;
	private bjj h;
	private bnu i;
	private bfm r;
	private bfm s;
	private bfm t;
	private boolean u;
	private boolean v;
	private boolean w;
	private boolean x;
	private String y;
	private bnt z;
	private cck.b A;
	private cck.a B;
	private boolean C;

	public bjf(bho bho) {
		this.g = bho;
	}

	@Override
	public void b() {
		Keyboard.enableRepeatEvents(true);
		this.n.clear();
		if (this.C) {
			this.h.a(this.l, this.m, 32, this.m - 64);
		} else {
			this.C = true;
			this.i = new bnu(this.j);
			this.i.a();
			this.A = new cck.b();

			try {
				this.B = new cck.a(this.A);
				this.B.start();
			} catch (Exception var2) {
				a.warn("Unable to start LAN server detection: {}", new Object[]{var2.getMessage()});
			}

			this.h = new bjj(this, this.j, this.l, this.m, 32, this.m - 64, 36);
			this.h.a(this.i);
		}

		this.a();
	}

	@Override
	public void k() {
		super.k();
		this.h.p();
	}

	public void a() {
		this.r = this.b(new bfm(7, this.l / 2 - 154, this.m - 28, 70, 20, cah.a("selectServer.edit")));
		this.t = this.b(new bfm(2, this.l / 2 - 74, this.m - 28, 70, 20, cah.a("selectServer.delete")));
		this.s = this.b(new bfm(1, this.l / 2 - 154, this.m - 52, 100, 20, cah.a("selectServer.select")));
		this.n.add(new bfm(4, this.l / 2 - 50, this.m - 52, 100, 20, cah.a("selectServer.direct")));
		this.n.add(new bfm(3, this.l / 2 + 4 + 50, this.m - 52, 100, 20, cah.a("selectServer.add")));
		this.n.add(new bfm(8, this.l / 2 + 4, this.m - 28, 70, 20, cah.a("selectServer.refresh")));
		this.n.add(new bfm(0, this.l / 2 + 4 + 76, this.m - 28, 75, 20, cah.a("gui.cancel")));
		this.b(this.h.e());
	}

	@Override
	public void e() {
		super.e();
		if (this.A.a()) {
			List<ccj> list2 = this.A.c();
			this.A.b();
			this.h.a(list2);
		}

		this.f.a();
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
		if (this.B != null) {
			this.B.interrupt();
			this.B = null;
		}

		this.f.b();
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			bfy.a a3 = this.h.e() < 0 ? null : this.h.b(this.h.e());
			if (bfm.k == 2 && a3 instanceof bji) {
				String string4 = ((bji)a3).a().a;
				if (string4 != null) {
					this.u = true;
					String string5 = cah.a("selectServer.deleteQuestion");
					String string6 = "'" + string4 + "' " + cah.a("selectServer.deleteWarning");
					String string7 = cah.a("selectServer.deleteButton");
					String string8 = cah.a("gui.cancel");
					bgu bgu9 = new bgu(this, string5, string6, string7, string8, this.h.e());
					this.j.a(bgu9);
				}
			} else if (bfm.k == 1) {
				this.f();
			} else if (bfm.k == 4) {
				this.x = true;
				this.z = new bnt(cah.a("selectServer.defaultName"), "", false);
				this.j.a(new bhb(this, this.z));
			} else if (bfm.k == 3) {
				this.v = true;
				this.z = new bnt(cah.a("selectServer.defaultName"), "", false);
				this.j.a(new bhd(this, this.z));
			} else if (bfm.k == 7 && a3 instanceof bji) {
				this.w = true;
				bnt bnt4 = ((bji)a3).a();
				this.z = new bnt(bnt4.a, bnt4.b, false);
				this.z.a(bnt4);
				this.j.a(new bhd(this, this.z));
			} else if (bfm.k == 0) {
				this.j.a(this.g);
			} else if (bfm.k == 8) {
				this.i();
			}
		}
	}

	private void i() {
		this.j.a(new bjf(this.g));
	}

	@Override
	public void a(boolean boolean1, int integer) {
		bfy.a a4 = this.h.e() < 0 ? null : this.h.b(this.h.e());
		if (this.u) {
			this.u = false;
			if (boolean1 && a4 instanceof bji) {
				this.i.b(this.h.e());
				this.i.b();
				this.h.c(-1);
				this.h.a(this.i);
			}

			this.j.a(this);
		} else if (this.x) {
			this.x = false;
			if (boolean1) {
				this.a(this.z);
			} else {
				this.j.a(this);
			}
		} else if (this.v) {
			this.v = false;
			if (boolean1) {
				this.i.a(this.z);
				this.i.b();
				this.h.c(-1);
				this.h.a(this.i);
			}

			this.j.a(this);
		} else if (this.w) {
			this.w = false;
			if (boolean1 && a4 instanceof bji) {
				bnt bnt5 = ((bji)a4).a();
				bnt5.a = this.z.a;
				bnt5.b = this.z.b;
				bnt5.a(this.z);
				this.i.b();
				this.h.a(this.i);
			}

			this.j.a(this);
		}
	}

	@Override
	protected void a(char character, int integer) {
		int integer4 = this.h.e();
		bfy.a a5 = integer4 < 0 ? null : this.h.b(integer4);
		if (integer == 63) {
			this.i();
		} else {
			if (integer4 >= 0) {
				if (integer == 200) {
					if (r()) {
						if (integer4 > 0 && a5 instanceof bji) {
							this.i.a(integer4, integer4 - 1);
							this.b(this.h.e() - 1);
							this.h.h(-this.h.r());
							this.h.a(this.i);
						}
					} else if (integer4 > 0) {
						this.b(this.h.e() - 1);
						this.h.h(-this.h.r());
						if (this.h.b(this.h.e()) instanceof bjg) {
							if (this.h.e() > 0) {
								this.b(this.h.b() - 1);
								this.h.h(-this.h.r());
							} else {
								this.b(-1);
							}
						}
					} else {
						this.b(-1);
					}
				} else if (integer == 208) {
					if (r()) {
						if (integer4 < this.i.c() - 1) {
							this.i.a(integer4, integer4 + 1);
							this.b(integer4 + 1);
							this.h.h(this.h.r());
							this.h.a(this.i);
						}
					} else if (integer4 < this.h.b()) {
						this.b(this.h.e() + 1);
						this.h.h(this.h.r());
						if (this.h.b(this.h.e()) instanceof bjg) {
							if (this.h.e() < this.h.b() - 1) {
								this.b(this.h.b() + 1);
								this.h.h(this.h.r());
							} else {
								this.b(-1);
							}
						}
					} else {
						this.b(-1);
					}
				} else if (integer != 28 && integer != 156) {
					super.a(character, integer);
				} else {
					this.a((bfm)this.n.get(2));
				}
			} else {
				super.a(character, integer);
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.y = null;
		this.c();
		this.h.a(integer1, integer2, float3);
		this.a(this.q, cah.a("multiplayer.title"), this.l / 2, 20, 16777215);
		super.a(integer1, integer2, float3);
		if (this.y != null) {
			this.a(Lists.newArrayList(Splitter.on("\n").split(this.y)), integer1, integer2);
		}
	}

	public void f() {
		bfy.a a2 = this.h.e() < 0 ? null : this.h.b(this.h.e());
		if (a2 instanceof bji) {
			this.a(((bji)a2).a());
		} else if (a2 instanceof bjh) {
			ccj ccj3 = ((bjh)a2).a();
			this.a(new bnt(ccj3.a(), ccj3.b(), true));
		}
	}

	private void a(bnt bnt) {
		this.j.a(new bgv(this, this.j, bnt));
	}

	public void b(int integer) {
		this.h.c(integer);
		bfy.a a3 = integer < 0 ? null : this.h.b(integer);
		this.s.l = false;
		this.r.l = false;
		this.t.l = false;
		if (a3 != null && !(a3 instanceof bjg)) {
			this.s.l = true;
			if (a3 instanceof bji) {
				this.r.l = true;
				this.t.l = true;
			}
		}
	}

	public bnv g() {
		return this.f;
	}

	public void a(String string) {
		this.y = string;
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		this.h.b(integer1, integer2, integer3);
	}

	@Override
	protected void b(int integer1, int integer2, int integer3) {
		super.b(integer1, integer2, integer3);
		this.h.c(integer1, integer2, integer3);
	}

	public bnu h() {
		return this.i;
	}

	public boolean a(bji bji, int integer) {
		return integer > 0;
	}

	public boolean b(bji bji, int integer) {
		return integer < this.i.c() - 1;
	}

	public void a(bji bji, int integer, boolean boolean3) {
		int integer5 = boolean3 ? 0 : integer - 1;
		this.i.a(integer, integer5);
		if (this.h.e() == integer) {
			this.b(integer5);
		}

		this.h.a(this.i);
	}

	public void b(bji bji, int integer, boolean boolean3) {
		int integer5 = boolean3 ? this.i.c() - 1 : integer + 1;
		this.i.a(integer, integer5);
		if (this.h.e() == integer) {
			this.b(integer5);
		}

		this.h.a(this.i);
	}
}
