import io.netty.buffer.Unpooled;
import javax.annotation.Nullable;
import org.lwjgl.input.Keyboard;

public class bil extends bho implements bht {
	private bfq a;
	private bfq f;
	private final asf g;
	private bfm h;
	private bfm i;
	private bfm r;
	private bfm s;
	private bfm t;
	private bfm u;
	private boolean v;
	private asf.a w = asf.a.REDSTONE;
	private bhu x;
	private boolean y;
	private boolean z;

	public bil(asf asf) {
		this.g = asf;
	}

	@Override
	public void e() {
		this.a.a();
	}

	@Override
	public void b() {
		final ajh ajh2 = this.g.a();
		Keyboard.enableRepeatEvents(true);
		this.n.clear();
		this.h = this.b(new bfm(0, this.l / 2 - 4 - 150, this.m / 4 + 120 + 12, 150, 20, cah.a("gui.done")));
		this.i = this.b(new bfm(1, this.l / 2 + 4, this.m / 4 + 120 + 12, 150, 20, cah.a("gui.cancel")));
		this.r = this.b(new bfm(4, this.l / 2 + 150 - 20, 135, 20, 20, "O"));
		this.s = this.b(new bfm(5, this.l / 2 - 50 - 100 - 4, 165, 100, 20, cah.a("advMode.mode.sequence")));
		this.t = this.b(new bfm(6, this.l / 2 - 50, 165, 100, 20, cah.a("advMode.mode.unconditional")));
		this.u = this.b(new bfm(7, this.l / 2 + 50 + 4, 165, 100, 20, cah.a("advMode.mode.redstoneTriggered")));
		this.a = new bfq(2, this.q, this.l / 2 - 150, 50, 300, 20);
		this.a.f(32500);
		this.a.b(true);
		this.f = new bfq(3, this.q, this.l / 2 - 150, 135, 276, 20);
		this.f.f(32500);
		this.f.c(false);
		this.f.a("-");
		this.h.l = false;
		this.r.l = false;
		this.s.l = false;
		this.t.l = false;
		this.u.l = false;
		this.x = new bhu(this.a, true) {
			@Nullable
			@Override
			public co b() {
				return ajh2.c();
			}
		};
	}

	public void a() {
		ajh ajh2 = this.g.a();
		this.a.a(ajh2.m());
		this.v = ajh2.n();
		this.w = this.g.k();
		this.y = this.g.l();
		this.z = this.g.h();
		this.f();
		this.g();
		this.i();
		this.j();
		this.h.l = true;
		this.r.l = true;
		this.s.l = true;
		this.t.l = true;
		this.u.l = true;
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			ajh ajh3 = this.g.a();
			if (bfm.k == 1) {
				ajh3.a(this.v);
				this.j.a(null);
			} else if (bfm.k == 0) {
				et et4 = new et(Unpooled.buffer());
				ajh3.a(et4);
				et4.a(this.a.b());
				et4.writeBoolean(ajh3.n());
				et4.a(this.w.name());
				et4.writeBoolean(this.y);
				et4.writeBoolean(this.z);
				this.j.v().a(new iw("MC|AutoCmd", et4));
				if (!ajh3.n()) {
					ajh3.b(null);
				}

				this.j.a(null);
			} else if (bfm.k == 4) {
				ajh3.a(!ajh3.n());
				this.f();
			} else if (bfm.k == 5) {
				this.h();
				this.g();
			} else if (bfm.k == 6) {
				this.y = !this.y;
				this.i();
			} else if (bfm.k == 7) {
				this.z = !this.z;
				this.j();
			}
		}
	}

	@Override
	protected void a(char character, int integer) {
		this.x.d();
		if (integer == 15) {
			this.x.a();
		} else {
			this.x.c();
		}

		this.a.a(character, integer);
		this.f.a(character, integer);
		if (integer == 28 || integer == 156) {
			this.a(this.h);
		} else if (integer == 1) {
			this.a(this.i);
		}
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		this.a.a(integer1, integer2, integer3);
		this.f.a(integer1, integer2, integer3);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, cah.a("advMode.setCommand"), this.l / 2, 20, 16777215);
		this.c(this.q, cah.a("advMode.command"), this.l / 2 - 150, 37, 10526880);
		this.a.g();
		int integer5 = 75;
		int integer6 = 0;
		this.c(this.q, cah.a("advMode.nearestPlayer"), this.l / 2 - 150, integer5 + integer6++ * this.q.a, 10526880);
		this.c(this.q, cah.a("advMode.randomPlayer"), this.l / 2 - 150, integer5 + integer6++ * this.q.a, 10526880);
		this.c(this.q, cah.a("advMode.allPlayers"), this.l / 2 - 150, integer5 + integer6++ * this.q.a, 10526880);
		this.c(this.q, cah.a("advMode.allEntities"), this.l / 2 - 150, integer5 + integer6++ * this.q.a, 10526880);
		this.c(this.q, "", this.l / 2 - 150, integer5 + integer6++ * this.q.a, 10526880);
		if (!this.f.b().isEmpty()) {
			integer5 += integer6 * this.q.a + 1;
			this.c(this.q, cah.a("advMode.previousOutput"), this.l / 2 - 150, integer5, 10526880);
			this.f.g();
		}

		super.a(integer1, integer2, float3);
	}

	private void f() {
		ajh ajh2 = this.g.a();
		if (ajh2.n()) {
			this.r.j = "O";
			if (ajh2.l() != null) {
				this.f.a(ajh2.l().c());
			}
		} else {
			this.r.j = "X";
			this.f.a("-");
		}
	}

	private void g() {
		switch (this.w) {
			case SEQUENCE:
				this.s.j = cah.a("advMode.mode.sequence");
				break;
			case AUTO:
				this.s.j = cah.a("advMode.mode.auto");
				break;
			case REDSTONE:
				this.s.j = cah.a("advMode.mode.redstone");
		}
	}

	private void h() {
		switch (this.w) {
			case SEQUENCE:
				this.w = asf.a.AUTO;
				break;
			case AUTO:
				this.w = asf.a.REDSTONE;
				break;
			case REDSTONE:
				this.w = asf.a.SEQUENCE;
		}
	}

	private void i() {
		if (this.y) {
			this.t.j = cah.a("advMode.mode.conditional");
		} else {
			this.t.j = cah.a("advMode.mode.unconditional");
		}
	}

	private void j() {
		if (this.z) {
			this.u.j = cah.a("advMode.mode.autoexec.bat");
		} else {
			this.u.j = cah.a("advMode.mode.redstoneTriggered");
		}
	}

	@Override
	public void a(String... arr) {
		this.x.a(arr);
	}
}
