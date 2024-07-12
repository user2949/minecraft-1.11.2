import io.netty.buffer.Unpooled;
import javax.annotation.Nullable;
import org.lwjgl.input.Keyboard;

public class biz extends bho implements bht {
	private bfq a;
	private bfq f;
	private final ajh g;
	private bfm h;
	private bfm i;
	private bfm r;
	private boolean s;
	private bhu t;

	public biz(ajh ajh) {
		this.g = ajh;
	}

	@Override
	public void e() {
		this.a.a();
	}

	@Override
	public void b() {
		Keyboard.enableRepeatEvents(true);
		this.n.clear();
		this.h = this.b(new bfm(0, this.l / 2 - 4 - 150, this.m / 4 + 120 + 12, 150, 20, cah.a("gui.done")));
		this.i = this.b(new bfm(1, this.l / 2 + 4, this.m / 4 + 120 + 12, 150, 20, cah.a("gui.cancel")));
		this.r = this.b(new bfm(4, this.l / 2 + 150 - 20, 150, 20, 20, "O"));
		this.a = new bfq(2, this.q, this.l / 2 - 150, 50, 300, 20);
		this.a.f(32500);
		this.a.b(true);
		this.a.a(this.g.m());
		this.f = new bfq(3, this.q, this.l / 2 - 150, 150, 276, 20);
		this.f.f(32500);
		this.f.c(false);
		this.f.a("-");
		this.s = this.g.n();
		this.a();
		this.h.l = !this.a.b().trim().isEmpty();
		this.t = new bhu(this.a, true) {
			@Nullable
			@Override
			public co b() {
				return biz.this.g.c();
			}
		};
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == 1) {
				this.g.a(this.s);
				this.j.a(null);
			} else if (bfm.k == 0) {
				et et3 = new et(Unpooled.buffer());
				et3.writeByte(this.g.j());
				this.g.a(et3);
				et3.a(this.a.b());
				et3.writeBoolean(this.g.n());
				this.j.v().a(new iw("MC|AdvCmd", et3));
				if (!this.g.n()) {
					this.g.b(null);
				}

				this.j.a(null);
			} else if (bfm.k == 4) {
				this.g.a(!this.g.n());
				this.a();
			}
		}
	}

	@Override
	protected void a(char character, int integer) {
		this.t.d();
		if (integer == 15) {
			this.t.a();
		} else {
			this.t.c();
		}

		this.a.a(character, integer);
		this.f.a(character, integer);
		this.h.l = !this.a.b().trim().isEmpty();
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
			integer5 += integer6 * this.q.a + 16;
			this.c(this.q, cah.a("advMode.previousOutput"), this.l / 2 - 150, integer5, 10526880);
			this.f.g();
		}

		super.a(integer1, integer2, float3);
	}

	private void a() {
		if (this.g.n()) {
			this.r.j = "O";
			if (this.g.l() != null) {
				this.f.a(this.g.l().c());
			}
		} else {
			this.r.j = "X";
			this.f.a("-");
		}
	}

	@Override
	public void a(String... arr) {
		this.t.a(arr);
	}
}
