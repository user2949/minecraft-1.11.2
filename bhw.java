public class bhw extends bho {
	private final bho f;
	protected String a = "Video Settings";
	private final beu g;
	private bfy h;
	private static final beu.a[] i = new beu.a[]{
		beu.a.GRAPHICS,
		beu.a.RENDER_DISTANCE,
		beu.a.AMBIENT_OCCLUSION,
		beu.a.FRAMERATE_LIMIT,
		beu.a.ANAGLYPH,
		beu.a.VIEW_BOBBING,
		beu.a.GUI_SCALE,
		beu.a.ATTACK_INDICATOR,
		beu.a.GAMMA,
		beu.a.RENDER_CLOUDS,
		beu.a.PARTICLES,
		beu.a.USE_FULLSCREEN,
		beu.a.ENABLE_VSYNC,
		beu.a.MIPMAP_LEVELS,
		beu.a.USE_VBO,
		beu.a.ENTITY_SHADOWS
	};

	public bhw(bho bho, beu beu) {
		this.f = bho;
		this.g = beu;
	}

	@Override
	public void b() {
		this.a = cah.a("options.videoTitle");
		this.n.clear();
		this.n.add(new bfm(200, this.l / 2 - 100, this.m - 27, cah.a("gui.done")));
		if (cdb.P) {
			this.h = new bga(this.j, this.l, this.m, 32, this.m - 32, 25, i);
		} else {
			beu.a[] arr2 = new beu.a[i.length - 1];
			int integer3 = 0;

			for (beu.a a7 : i) {
				if (a7 == beu.a.USE_VBO) {
					break;
				}

				arr2[integer3] = a7;
				integer3++;
			}

			this.h = new bga(this.j, this.l, this.m, 32, this.m - 32, 25, arr2);
		}
	}

	@Override
	public void k() {
		super.k();
		this.h.p();
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
			if (bfm.k == 200) {
				this.j.u.b();
				this.j.a(this.f);
			}
		}
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		int integer5 = this.g.aC;
		super.a(integer1, integer2, integer3);
		this.h.b(integer1, integer2, integer3);
		if (this.g.aC != integer5) {
			bfk bfk6 = new bfk(this.j);
			int integer7 = bfk6.a();
			int integer8 = bfk6.b();
			this.a(this.j, integer7, integer8);
		}
	}

	@Override
	protected void b(int integer1, int integer2, int integer3) {
		int integer5 = this.g.aC;
		super.b(integer1, integer2, integer3);
		this.h.c(integer1, integer2, integer3);
		if (this.g.aC != integer5) {
			bfk bfk6 = new bfk(this.j);
			int integer7 = bfk6.a();
			int integer8 = bfk6.b();
			this.a(this.j, integer7, integer8);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.h.a(integer1, integer2, float3);
		this.a(this.q, this.a, this.l / 2, 5, 16777215);
		super.a(integer1, integer2, float3);
	}
}
