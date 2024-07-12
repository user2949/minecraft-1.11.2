import net.minecraft.server.MinecraftServer;

public class ls extends lw {
	private final lw a;

	public ls(MinecraftServer minecraftServer, bbw bbw, int integer, lw lw, ou ou) {
		super(minecraftServer, bbw, new bbs(lw.T()), integer, ou);
		this.a = lw;
		lw.aj().a(new aud() {
			@Override
			public void a(auf auf, double double2) {
				ls.this.aj().a(double2);
			}

			@Override
			public void a(auf auf, double double2, double double3, long long4) {
				ls.this.aj().a(double2, double3, long4);
			}

			@Override
			public void a(auf auf, double double2, double double3) {
				ls.this.aj().c(double2, double3);
			}

			@Override
			public void a(auf auf, int integer) {
				ls.this.aj().b(integer);
			}

			@Override
			public void b(auf auf, int integer) {
				ls.this.aj().c(integer);
			}

			@Override
			public void b(auf auf, double double2) {
				ls.this.aj().c(double2);
			}

			@Override
			public void c(auf auf, double double2) {
				ls.this.aj().b(double2);
			}
		});
	}

	@Override
	protected void a() {
	}

	@Override
	public ajs b() {
		this.z = this.a.X();
		this.D = this.a.ad();
		this.B = this.a.ak();
		String string2 = wr.a(this.s);
		wr wr3 = (wr)this.z.a(wr.class, string2);
		if (wr3 == null) {
			this.A = new wr(this);
			this.z.a(string2, this.A);
		} else {
			this.A = wr3;
			this.A.a(this);
		}

		return this;
	}

	@Override
	public void c() {
		this.s.r();
	}
}
