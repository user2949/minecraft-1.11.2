import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class bhl extends bho {
	private static final List<bhl.a> a = Lists.newArrayList();
	private final bgw f;
	private String g;
	private String h;
	private String i;
	private bhl.b r;
	private bfm s;
	private bfq t;

	public bhl(bgw bgw) {
		this.f = bgw;
	}

	@Override
	public void b() {
		this.n.clear();
		Keyboard.enableRepeatEvents(true);
		this.g = cah.a("createWorld.customize.presets.title");
		this.h = cah.a("createWorld.customize.presets.share");
		this.i = cah.a("createWorld.customize.presets.list");
		this.t = new bfq(2, this.q, 50, 40, this.l - 100, 20);
		this.r = new bhl.b();
		this.t.f(1230);
		this.t.a(this.f.a());
		this.s = this.b(new bfm(0, this.l / 2 - 155, this.m - 28, 150, 20, cah.a("createWorld.customize.presets.select")));
		this.n.add(new bfm(1, this.l / 2 + 5, this.m - 28, 150, 20, cah.a("gui.cancel")));
		this.a();
	}

	@Override
	public void k() {
		super.k();
		this.r.p();
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		this.t.a(integer1, integer2, integer3);
		super.a(integer1, integer2, integer3);
	}

	@Override
	protected void a(char character, int integer) {
		if (!this.t.a(character, integer)) {
			super.a(character, integer);
		}
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == 0 && this.g()) {
			this.f.a(this.t.b());
			this.j.a(this.f);
		} else if (bfm.k == 1) {
			this.j.a(this.f);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.r.a(integer1, integer2, float3);
		this.a(this.q, this.g, this.l / 2, 8, 16777215);
		this.c(this.q, this.h, 50, 30, 10526880);
		this.c(this.q, this.i, 50, 70, 10526880);
		this.t.g();
		super.a(integer1, integer2, float3);
	}

	@Override
	public void e() {
		this.t.a();
		super.e();
	}

	public void a() {
		this.s.l = this.g();
	}

	private boolean g() {
		return this.r.u > -1 && this.r.u < a.size() || this.t.b().length() > 1;
	}

	private static void a(String string, afh afh, akf akf, List<String> list, axv... arr) {
		a(string, afh, 0, akf, list, arr);
	}

	private static void a(String string, afh afh, int integer, akf akf, List<String> list, axv... arr) {
		axu axu7 = new axu();

		for (int integer8 = arr.length - 1; integer8 >= 0; integer8--) {
			axu7.c().add(arr[integer8]);
		}

		axu7.a(akf.a(akf));
		axu7.d();

		for (String string9 : list) {
			axu7.b().put(string9, Maps.newHashMap());
		}

		a.add(new bhl.a(afh, integer, string, axu7.toString()));
	}

	static {
		a(cah.a("createWorld.customize.preset.classic_flat"), afh.a(alv.c), akk.c, Arrays.asList("village"), new axv(1, alv.c), new axv(2, alv.d), new axv(1, alv.h));
		a(
			cah.a("createWorld.customize.preset.tunnelers_dream"),
			afh.a(alv.b),
			akk.e,
			Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"),
			new axv(1, alv.c),
			new axv(5, alv.d),
			new axv(230, alv.b),
			new axv(1, alv.h)
		);
		a(
			cah.a("createWorld.customize.preset.water_world"),
			afl.aA,
			akk.z,
			Arrays.asList("biome_1", "oceanmonument"),
			new axv(90, alv.j),
			new axv(5, alv.m),
			new axv(5, alv.d),
			new axv(5, alv.b),
			new axv(1, alv.h)
		);
		a(
			cah.a("createWorld.customize.preset.overworld"),
			afh.a(alv.H),
			ari.a.GRASS.a(),
			akk.c,
			Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"),
			new axv(1, alv.c),
			new axv(3, alv.d),
			new axv(59, alv.b),
			new axv(1, alv.h)
		);
		a(
			cah.a("createWorld.customize.preset.snowy_kingdom"),
			afh.a(alv.aH),
			akk.n,
			Arrays.asList("village", "biome_1"),
			new axv(1, alv.aH),
			new axv(1, alv.c),
			new axv(3, alv.d),
			new axv(59, alv.b),
			new axv(1, alv.h)
		);
		a(
			cah.a("createWorld.customize.preset.bottomless_pit"),
			afl.J,
			akk.c,
			Arrays.asList("village", "biome_1"),
			new axv(1, alv.c),
			new axv(3, alv.d),
			new axv(2, alv.e)
		);
		a(
			cah.a("createWorld.customize.preset.desert"),
			afh.a(alv.m),
			akk.d,
			Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"),
			new axv(8, alv.m),
			new axv(52, alv.A),
			new axv(3, alv.b),
			new axv(1, alv.h)
		);
		a(cah.a("createWorld.customize.preset.redstone_ready"), afl.aF, akk.d, Collections.emptyList(), new axv(52, alv.A), new axv(3, alv.b), new axv(1, alv.h));
		a(cah.a("createWorld.customize.preset.the_void"), afh.a(alv.cv), akk.P, Arrays.asList("decoration"), new axv(1, alv.a));
	}

	static class a {
		public afh a;
		public int b;
		public String c;
		public String d;

		public a(afh afh, int integer, String string3, String string4) {
			this.a = afh;
			this.b = integer;
			this.c = string3;
			this.d = string4;
		}
	}

	class b extends bgd {
		public int u = -1;

		public b() {
			super(bhl.this.j, bhl.this.l, bhl.this.m, 80, bhl.this.m - 37, 24);
		}

		private void a(int integer1, int integer2, afh afh, int integer4) {
			this.e(integer1 + 1, integer2 + 1);
			bqg.D();
			beq.c();
			bhl.this.k.a(new afj(afh, 1, afh.l() ? integer4 : 0), integer1 + 2, integer2 + 2);
			beq.a();
			bqg.E();
		}

		private void e(int integer1, int integer2) {
			this.d(integer1, integer2, 0, 0);
		}

		private void d(int integer1, int integer2, int integer3, int integer4) {
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.a.N().a(bfi.c);
			float float6 = 0.0078125F;
			float float7 = 0.0078125F;
			int integer8 = 18;
			int integer9 = 18;
			bqs bqs10 = bqs.a();
			bpy bpy11 = bqs10.c();
			bpy11.a(7, bzh.g);
			bpy11.b((double)(integer1 + 0), (double)(integer2 + 18), (double)bhl.this.e)
				.a((double)((float)(integer3 + 0) * 0.0078125F), (double)((float)(integer4 + 18) * 0.0078125F))
				.d();
			bpy11.b((double)(integer1 + 18), (double)(integer2 + 18), (double)bhl.this.e)
				.a((double)((float)(integer3 + 18) * 0.0078125F), (double)((float)(integer4 + 18) * 0.0078125F))
				.d();
			bpy11.b((double)(integer1 + 18), (double)(integer2 + 0), (double)bhl.this.e)
				.a((double)((float)(integer3 + 18) * 0.0078125F), (double)((float)(integer4 + 0) * 0.0078125F))
				.d();
			bpy11.b((double)(integer1 + 0), (double)(integer2 + 0), (double)bhl.this.e)
				.a((double)((float)(integer3 + 0) * 0.0078125F), (double)((float)(integer4 + 0) * 0.0078125F))
				.d();
			bqs10.b();
		}

		@Override
		protected int b() {
			return bhl.a.size();
		}

		@Override
		protected void a(int integer1, boolean boolean2, int integer3, int integer4) {
			this.u = integer1;
			bhl.this.a();
			bhl.this.t.a(((bhl.a)bhl.a.get(bhl.this.r.u)).d);
		}

		@Override
		protected boolean a(int integer) {
			return integer == this.u;
		}

		@Override
		protected void a() {
		}

		@Override
		protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			bhl.a a8 = (bhl.a)bhl.a.get(integer1);
			this.a(integer2, integer3, a8.a, a8.b);
			bhl.this.q.a(a8.c, integer2 + 18 + 5, integer3 + 6, 16777215);
		}
	}
}
