import io.netty.buffer.Unpooled;
import org.lwjgl.input.Keyboard;

public class bih extends big implements acr {
	private static final kq u = new kq("textures/gui/container/anvil.png");
	private final acm v;
	private bfq w;
	private final aax x;

	public bih(aax aax, ajs ajs) {
		super(new acm(aax, ajs, bes.z().h));
		this.x = aax;
		this.v = (acm)this.h;
	}

	@Override
	public void b() {
		super.b();
		Keyboard.enableRepeatEvents(true);
		int integer2 = (this.l - this.f) / 2;
		int integer3 = (this.m - this.g) / 2;
		this.w = new bfq(0, this.q, integer2 + 62, integer3 + 24, 103, 12);
		this.w.g(-1);
		this.w.h(-1);
		this.w.a(false);
		this.w.f(31);
		this.h.b(this);
		this.h.a(this);
	}

	@Override
	public void m() {
		super.m();
		Keyboard.enableRepeatEvents(false);
		this.h.b(this);
	}

	@Override
	protected void b(int integer1, int integer2) {
		bqg.g();
		bqg.l();
		this.q.a(cah.a("container.repair"), 60, 6, 4210752);
		if (this.v.a > 0) {
			int integer4 = 8453920;
			boolean boolean5 = true;
			String string6 = cah.a("container.repair.cost", this.v.a);
			if (this.v.a >= 40 && !this.j.h.bK.d) {
				string6 = cah.a("container.repair.expensive");
				integer4 = 16736352;
			} else if (!this.v.a(2).e()) {
				boolean5 = false;
			} else if (!this.v.a(2).a(this.x.e)) {
				integer4 = 16736352;
			}

			if (boolean5) {
				int integer7 = 0xFF000000 | (integer4 & 16579836) >> 2 | integer4 & 0xFF000000;
				int integer8 = this.f - 8 - this.q.a(string6);
				int integer9 = 67;
				if (this.q.a()) {
					a(integer8 - 3, 65, this.f - 7, 77, -16777216);
					a(integer8 - 2, 66, this.f - 8, 76, -12895429);
				} else {
					this.q.a(string6, integer8, 68, integer7);
					this.q.a(string6, integer8 + 1, 67, integer7);
					this.q.a(string6, integer8 + 1, 68, integer7);
				}

				this.q.a(string6, integer8, 67, integer4);
			}
		}

		bqg.f();
	}

	@Override
	protected void a(char character, int integer) {
		if (this.w.a(character, integer)) {
			this.a();
		} else {
			super.a(character, integer);
		}
	}

	private void a() {
		String string2 = this.w.b();
		adl adl3 = this.v.a(0);
		if (adl3 != null && adl3.e() && !adl3.d().t() && string2.equals(adl3.d().r())) {
			string2 = "";
		}

		this.v.a(string2);
		this.j.h.d.a(new iw("MC|ItemName", new et(Unpooled.buffer()).a(string2)));
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		this.w.a(integer1, integer2, integer3);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		super.a(integer1, integer2, float3);
		bqg.g();
		bqg.l();
		this.w.g();
	}

	@Override
	protected void a(float float1, int integer2, int integer3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(u);
		int integer5 = (this.l - this.f) / 2;
		int integer6 = (this.m - this.g) / 2;
		this.b(integer5, integer6, 0, 0, this.f, this.g);
		this.b(integer5 + 59, integer6 + 20, 0, this.g + (this.v.a(0).e() ? 0 : 16), 110, 16);
		if ((this.v.a(0).e() || this.v.a(1).e()) && !this.v.a(2).e()) {
			this.b(integer5 + 99, integer6 + 45, this.f, 0, 28, 21);
		}
	}

	@Override
	public void a(acl acl, dd<afj> dd) {
		this.a(acl, 0, acl.a(0).d());
	}

	@Override
	public void a(acl acl, int integer, afj afj) {
		if (integer == 0) {
			this.w.a(afj.b() ? "" : afj.r());
			this.w.c(!afj.b());
			if (!afj.b()) {
				this.a();
			}
		}
	}

	@Override
	public void a(acl acl, int integer2, int integer3) {
	}

	@Override
	public void a(acl acl, rc rc) {
	}
}
