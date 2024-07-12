import java.util.Random;

public class ccp implements lf {
	private final Random a = new Random();
	private final bes b;
	private ccc c;
	private int d = 100;

	public ccp(bes bes) {
		this.b = bes;
	}

	@Override
	public void F_() {
		ccp.a a2 = this.b.V();
		if (this.c != null) {
			if (!a2.a().a().equals(this.c.a())) {
				this.b.U().b(this.c);
				this.d = ot.a(this.a, 0, a2.b() / 2);
			}

			if (!this.b.U().c(this.c)) {
				this.c = null;
				this.d = Math.min(ot.a(this.a, a2.b(), a2.c()), this.d);
			}
		}

		this.d = Math.min(this.d, a2.c());
		if (this.c == null && this.d-- <= 0) {
			this.a(a2);
		}
	}

	public void a(ccp.a a) {
		this.c = cby.a(a.a());
		this.b.U().a(this.c);
		this.d = Integer.MAX_VALUE;
	}

	public void a() {
		if (this.c != null) {
			this.b.U().b(this.c);
			this.c = null;
			this.d = 0;
		}
	}

	public static enum a {
		MENU(nn.ef, 20, 600),
		GAME(nn.ee, 12000, 24000),
		CREATIVE(nn.ea, 1200, 3600),
		CREDITS(nn.eb, Integer.MAX_VALUE, Integer.MAX_VALUE),
		NETHER(nn.eg, 1200, 3600),
		END_BOSS(nn.ec, 0, 0),
		END(nn.ed, 6000, 24000);

		private final nm h;
		private final int i;
		private final int j;

		private a(nm nm, int integer4, int integer5) {
			this.h = nm;
			this.i = integer4;
			this.j = integer5;
		}

		public nm a() {
			return this.h;
		}

		public int b() {
			return this.i;
		}

		public int c() {
			return this.j;
		}
	}
}
