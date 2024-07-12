import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class asf extends asc {
	private boolean a;
	private boolean f;
	private boolean g;
	private boolean h;
	private final ajh i = new ajh() {
		@Override
		public co c() {
			return asf.this.c;
		}

		@Override
		public bdw d() {
			return new bdw((double)asf.this.c.p() + 0.5, (double)asf.this.c.q() + 0.5, (double)asf.this.c.r() + 0.5);
		}

		@Override
		public ajs e() {
			return asf.this.D();
		}

		@Override
		public void a(String string) {
			super.a(string);
			asf.this.x_();
		}

		@Override
		public void i() {
			atl atl2 = asf.this.b.o(asf.this.c);
			asf.this.D().a(asf.this.c, atl2, atl2, 3);
		}

		@Override
		public int j() {
			return 0;
		}

		@Override
		public void a(ByteBuf byteBuf) {
			byteBuf.writeInt(asf.this.c.p());
			byteBuf.writeInt(asf.this.c.q());
			byteBuf.writeInt(asf.this.c.r());
		}

		@Override
		public sn f() {
			return null;
		}

		@Override
		public MinecraftServer B_() {
			return asf.this.b.u();
		}
	};

	@Override
	public du b(du du) {
		super.b(du);
		this.i.a(du);
		du.a("powered", this.f());
		du.a("conditionMet", this.i());
		du.a("auto", this.h());
		return du;
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.i.b(du);
		this.a(du.p("powered"));
		this.c(du.p("conditionMet"));
		this.b(du.p("auto"));
	}

	@Nullable
	@Override
	public fz c() {
		if (this.j()) {
			this.d(false);
			du du2 = this.b(new du());
			return new fz(this.c, 2, du2);
		} else {
			return null;
		}
	}

	@Override
	public boolean C() {
		return true;
	}

	public ajh a() {
		return this.i;
	}

	public o e() {
		return this.i.o();
	}

	public void a(boolean boolean1) {
		this.a = boolean1;
	}

	public boolean f() {
		return this.a;
	}

	public boolean h() {
		return this.f;
	}

	public void b(boolean boolean1) {
		boolean boolean3 = this.f;
		this.f = boolean1;
		if (!boolean3 && boolean1 && !this.a && this.b != null && this.k() != asf.a.SEQUENCE) {
			alu alu4 = this.x();
			if (alu4 instanceof amm) {
				co co5 = this.w();
				amm amm6 = (amm)alu4;
				this.g = !this.l() || amm6.e(this.b, co5, this.b.o(co5));
				this.b.a(co5, alu4, alu4.a(this.b));
				if (this.g) {
					amm6.c(this.b, co5);
				}
			}
		}
	}

	public boolean i() {
		return this.g;
	}

	public void c(boolean boolean1) {
		this.g = boolean1;
	}

	public boolean j() {
		return this.h;
	}

	public void d(boolean boolean1) {
		this.h = boolean1;
	}

	public asf.a k() {
		alu alu2 = this.x();
		if (alu2 == alv.bX) {
			return asf.a.REDSTONE;
		} else if (alu2 == alv.dc) {
			return asf.a.AUTO;
		} else {
			return alu2 == alv.dd ? asf.a.SEQUENCE : asf.a.REDSTONE;
		}
	}

	public boolean l() {
		atl atl2 = this.b.o(this.w());
		return atl2.v() instanceof amm ? (Boolean)atl2.c(amm.b) : false;
	}

	@Override
	public void A() {
		this.e = null;
		super.A();
	}

	public static enum a {
		SEQUENCE,
		AUTO,
		REDSTONE;
	}
}
