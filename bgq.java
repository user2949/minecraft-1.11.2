public class bgq extends bho {
	private static final beu.a[] a = new beu.a[]{
		beu.a.CHAT_VISIBILITY,
		beu.a.CHAT_COLOR,
		beu.a.CHAT_LINKS,
		beu.a.CHAT_OPACITY,
		beu.a.CHAT_LINKS_PROMPT,
		beu.a.CHAT_SCALE,
		beu.a.CHAT_HEIGHT_FOCUSED,
		beu.a.CHAT_HEIGHT_UNFOCUSED,
		beu.a.CHAT_WIDTH,
		beu.a.REDUCED_DEBUG_INFO
	};
	private final bho f;
	private final beu g;
	private String h;

	public bgq(bho bho, beu beu) {
		this.f = bho;
		this.g = beu;
	}

	@Override
	public void b() {
		this.h = cah.a("options.chat.title");
		int integer2 = 0;

		for (beu.a a6 : a) {
			if (a6.a()) {
				this.n.add(new bge(a6.c(), this.l / 2 - 155 + integer2 % 2 * 160, this.m / 6 + 24 * (integer2 >> 1), a6));
			} else {
				this.n.add(new bfz(a6.c(), this.l / 2 - 155 + integer2 % 2 * 160, this.m / 6 + 24 * (integer2 >> 1), a6, this.g.c(a6)));
			}

			integer2++;
		}

		this.n.add(new bfm(200, this.l / 2 - 100, this.m / 6 + 120, cah.a("gui.done")));
	}

	@Override
	protected void a(char character, int integer) {
		if (integer == 1) {
			this.j.u.b();
		}

		super.a(character, integer);
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k < 100 && bfm instanceof bfz) {
				this.g.a(((bfz)bfm).c(), 1);
				bfm.j = this.g.c(beu.a.a(bfm.k));
			}

			if (bfm.k == 200) {
				this.j.u.b();
				this.j.a(this.f);
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, this.h, this.l / 2, 20, 16777215);
		super.a(integer1, integer2, float3);
	}
}
