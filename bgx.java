import com.google.common.collect.Lists;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class bgx extends bho {
	private static final List<bgx.a> f = Lists.newArrayList();
	private bgx.b g;
	private bfm h;
	private bfq i;
	private final bgy r;
	protected String a = "Customize World Presets";
	private String s;
	private String t;

	public bgx(bgy bgy) {
		this.r = bgy;
	}

	@Override
	public void b() {
		this.n.clear();
		Keyboard.enableRepeatEvents(true);
		this.a = cah.a("createWorld.customize.custom.presets.title");
		this.s = cah.a("createWorld.customize.presets.share");
		this.t = cah.a("createWorld.customize.presets.list");
		this.i = new bfq(2, this.q, 50, 40, this.l - 100, 20);
		this.g = new bgx.b();
		this.i.f(2000);
		this.i.a(this.r.a());
		this.h = this.b(new bfm(0, this.l / 2 - 102, this.m - 27, 100, 20, cah.a("createWorld.customize.presets.select")));
		this.n.add(new bfm(1, this.l / 2 + 3, this.m - 27, 100, 20, cah.a("gui.cancel")));
		this.a();
	}

	@Override
	public void k() {
		super.k();
		this.g.p();
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		this.i.a(integer1, integer2, integer3);
		super.a(integer1, integer2, integer3);
	}

	@Override
	protected void a(char character, int integer) {
		if (!this.i.a(character, integer)) {
			super.a(character, integer);
		}
	}

	@Override
	protected void a(bfm bfm) {
		switch (bfm.k) {
			case 0:
				this.r.a(this.i.b());
				this.j.a(this.r);
				break;
			case 1:
				this.j.a(this.r);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.g.a(integer1, integer2, float3);
		this.a(this.q, this.a, this.l / 2, 8, 16777215);
		this.c(this.q, this.s, 50, 30, 10526880);
		this.c(this.q, this.t, 50, 70, 10526880);
		this.i.g();
		super.a(integer1, integer2, float3);
	}

	@Override
	public void e() {
		this.i.a();
		super.e();
	}

	public void a() {
		this.h.l = this.g();
	}

	private boolean g() {
		return this.g.u > -1 && this.g.u < f.size() || this.i.b().length() > 1;
	}

	static {
		avq.a a1 = avq.a.a(
			"{ \"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":8.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":0.5, \"biomeScaleWeight\":2.0, \"biomeScaleOffset\":0.375, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":255 }"
		);
		kq kq2 = new kq("textures/gui/presets/water.png");
		f.add(new bgx.a(cah.a("createWorld.customize.custom.preset.waterWorld"), kq2, a1));
		a1 = avq.a.a(
			"{\"coordinateScale\":3000.0, \"heightScale\":6000.0, \"upperLimitScale\":250.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }"
		);
		kq2 = new kq("textures/gui/presets/isles.png");
		f.add(new bgx.a(cah.a("createWorld.customize.custom.preset.isleLand"), kq2, a1));
		a1 = avq.a.a(
			"{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":5.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":1.0, \"biomeScaleWeight\":4.0, \"biomeScaleOffset\":1.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }"
		);
		kq2 = new kq("textures/gui/presets/delight.png");
		f.add(new bgx.a(cah.a("createWorld.customize.custom.preset.caveDelight"), kq2, a1));
		a1 = avq.a.a(
			"{\"coordinateScale\":738.41864, \"heightScale\":157.69133, \"upperLimitScale\":801.4267, \"lowerLimitScale\":1254.1643, \"depthNoiseScaleX\":374.93652, \"depthNoiseScaleZ\":288.65228, \"depthNoiseScaleExponent\":1.2092624, \"mainNoiseScaleX\":1355.9908, \"mainNoiseScaleY\":745.5343, \"mainNoiseScaleZ\":1183.464, \"baseSize\":1.8758626, \"stretchY\":1.7137525, \"biomeDepthWeight\":1.7553768, \"biomeDepthOffset\":3.4701107, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":2.535211, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }"
		);
		kq2 = new kq("textures/gui/presets/madness.png");
		f.add(new bgx.a(cah.a("createWorld.customize.custom.preset.mountains"), kq2, a1));
		a1 = avq.a.a(
			"{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":1000.0, \"mainNoiseScaleY\":3000.0, \"mainNoiseScaleZ\":1000.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":20 }"
		);
		kq2 = new kq("textures/gui/presets/drought.png");
		f.add(new bgx.a(cah.a("createWorld.customize.custom.preset.drought"), kq2, a1));
		a1 = avq.a.a(
			"{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":2.0, \"lowerLimitScale\":64.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":6 }"
		);
		kq2 = new kq("textures/gui/presets/chaos.png");
		f.add(new bgx.a(cah.a("createWorld.customize.custom.preset.caveChaos"), kq2, a1));
		a1 = avq.a.a(
			"{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":true, \"seaLevel\":40 }"
		);
		kq2 = new kq("textures/gui/presets/luck.png");
		f.add(new bgx.a(cah.a("createWorld.customize.custom.preset.goodLuck"), kq2, a1));
	}

	static class a {
		public String a;
		public kq b;
		public avq.a c;

		public a(String string, kq kq, avq.a a) {
			this.a = string;
			this.b = kq;
			this.c = a;
		}
	}

	class b extends bgd {
		public int u = -1;

		public b() {
			super(bgx.this.j, bgx.this.l, bgx.this.m, 80, bgx.this.m - 32, 38);
		}

		@Override
		protected int b() {
			return bgx.f.size();
		}

		@Override
		protected void a(int integer1, boolean boolean2, int integer3, int integer4) {
			this.u = integer1;
			bgx.this.a();
			bgx.this.i.a(((bgx.a)bgx.f.get(bgx.this.g.u)).c.toString());
		}

		@Override
		protected boolean a(int integer) {
			return integer == this.u;
		}

		@Override
		protected void a() {
		}

		private void a(int integer1, int integer2, kq kq) {
			int integer5 = integer1 + 5;
			bgx.this.a(integer5 - 1, integer5 + 32, integer2 - 1, -2039584);
			bgx.this.a(integer5 - 1, integer5 + 32, integer2 + 32, -6250336);
			bgx.this.b(integer5 - 1, integer2 - 1, integer2 + 32, -2039584);
			bgx.this.b(integer5 + 32, integer2 - 1, integer2 + 32, -6250336);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.a.N().a(kq);
			int integer7 = 32;
			int integer8 = 32;
			bqs bqs9 = bqs.a();
			bpy bpy10 = bqs9.c();
			bpy10.a(7, bzh.g);
			bpy10.b((double)(integer5 + 0), (double)(integer2 + 32), 0.0).a(0.0, 1.0).d();
			bpy10.b((double)(integer5 + 32), (double)(integer2 + 32), 0.0).a(1.0, 1.0).d();
			bpy10.b((double)(integer5 + 32), (double)(integer2 + 0), 0.0).a(1.0, 0.0).d();
			bpy10.b((double)(integer5 + 0), (double)(integer2 + 0), 0.0).a(0.0, 0.0).d();
			bqs9.b();
		}

		@Override
		protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			bgx.a a8 = (bgx.a)bgx.f.get(integer1);
			this.a(integer2, integer3, a8.b);
			bgx.this.q.a(a8.a, integer2 + 32 + 10, integer3 + 14, 16777215);
		}
	}
}
