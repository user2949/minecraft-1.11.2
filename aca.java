import io.netty.buffer.ByteBuf;
import net.minecraft.server.MinecraftServer;

public class aca extends aby {
	private static final kk<String> a = kn.a(aca.class, km.d);
	private static final kk<fb> b = kn.a(aca.class, km.e);
	private final ajh c = new ajh() {
		@Override
		public void i() {
			aca.this.R().b(aca.a, this.m());
			aca.this.R().b(aca.b, this.l());
		}

		@Override
		public int j() {
			return 1;
		}

		@Override
		public void a(ByteBuf byteBuf) {
			byteBuf.writeInt(aca.this.O());
		}

		@Override
		public co c() {
			return new co(aca.this.p, aca.this.q + 0.5, aca.this.r);
		}

		@Override
		public bdw d() {
			return new bdw(aca.this.p, aca.this.q, aca.this.r);
		}

		@Override
		public ajs e() {
			return aca.this.l;
		}

		@Override
		public sn f() {
			return aca.this;
		}

		@Override
		public MinecraftServer B_() {
			return aca.this.l.u();
		}
	};
	private int d;

	public aca(ajs ajs) {
		super(ajs);
	}

	public aca(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	public static void a(ph ph) {
		aby.a(ph, aca.class);
		ph.a(pf.ENTITY, new pj() {
			@Override
			public du a(pg pg, du du, int integer) {
				if (asc.a(asf.class).equals(new kq(du.l("id")))) {
					du.a("id", "Control");
					pg.a(pf.BLOCK_ENTITY, du, integer);
					du.a("id", "MinecartCommandBlock");
				}

				return du;
			}
		});
	}

	@Override
	protected void i() {
		super.i();
		this.R().a(a, "");
		this.R().a(b, new fh(""));
	}

	@Override
	protected void a(du du) {
		super.a(du);
		this.c.b(du);
		this.R().b(a, this.j().m());
		this.R().b(b, this.j().l());
	}

	@Override
	protected void b(du du) {
		super.b(du);
		this.c.a(du);
	}

	@Override
	public aby.a v() {
		return aby.a.COMMAND_BLOCK;
	}

	@Override
	public atl x() {
		return alv.bX.t();
	}

	public ajh j() {
		return this.c;
	}

	@Override
	public void a(int integer1, int integer2, int integer3, boolean boolean4) {
		if (boolean4 && this.T - this.d >= 4) {
			this.j().a(this.l);
			this.d = this.T;
		}
	}

	@Override
	public boolean b(aay aay, ri ri) {
		this.c.a(aay);
		return false;
	}

	@Override
	public void a(kk<?> kk) {
		super.a(kk);
		if (b.equals(kk)) {
			try {
				this.c.b(this.R().a(b));
			} catch (Throwable var3) {
			}
		} else if (a.equals(kk)) {
			this.c.a(this.R().a(a));
		}
	}

	@Override
	public boolean bu() {
		return true;
	}
}
