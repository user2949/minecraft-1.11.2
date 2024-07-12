import bgb.e;
import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;
import java.util.Random;
import javax.annotation.Nullable;

public class bgy extends bho implements bfr.a, bgb.b {
	private final bjy i;
	protected String a = "Customize World Settings";
	protected String f = "Page 1 of 3";
	protected String g = "Basic Settings";
	protected String[] h = new String[4];
	private bgb r;
	private bfm s;
	private bfm t;
	private bfm u;
	private bfm v;
	private bfm w;
	private bfm x;
	private bfm y;
	private bfm z;
	private boolean A;
	private int B;
	private boolean C;
	private final Predicate<String> D = new Predicate<String>() {
		public boolean apply(@Nullable String string) {
			Float float3 = Floats.tryParse(string);
			return string.isEmpty() || float3 != null && Floats.isFinite(float3) && float3 >= 0.0F;
		}
	};
	private final avq.a E = new avq.a();
	private avq.a F;
	private final Random G = new Random();

	public bgy(bho bho, String string) {
		this.i = (bjy)bho;
		this.a(string);
	}

	@Override
	public void b() {
		int integer2 = 0;
		int integer3 = 0;
		if (this.r != null) {
			integer2 = this.r.e();
			integer3 = this.r.n();
		}

		this.a = cah.a("options.customizeTitle");
		this.n.clear();
		this.v = this.b(new bfm(302, 20, 5, 80, 20, cah.a("createWorld.customize.custom.prev")));
		this.w = this.b(new bfm(303, this.l - 100, 5, 80, 20, cah.a("createWorld.customize.custom.next")));
		this.u = this.b(new bfm(304, this.l / 2 - 187, this.m - 27, 90, 20, cah.a("createWorld.customize.custom.defaults")));
		this.t = this.b(new bfm(301, this.l / 2 - 92, this.m - 27, 90, 20, cah.a("createWorld.customize.custom.randomize")));
		this.z = this.b(new bfm(305, this.l / 2 + 3, this.m - 27, 90, 20, cah.a("createWorld.customize.custom.presets")));
		this.s = this.b(new bfm(300, this.l / 2 + 98, this.m - 27, 90, 20, cah.a("gui.done")));
		this.u.l = this.A;
		this.x = new bfm(306, this.l / 2 - 55, 160, 50, 20, cah.a("gui.yes"));
		this.x.m = false;
		this.n.add(this.x);
		this.y = new bfm(307, this.l / 2 + 5, 160, 50, 20, cah.a("gui.no"));
		this.y.m = false;
		this.n.add(this.y);
		if (this.B != 0) {
			this.x.m = true;
			this.y.m = true;
		}

		this.f();
		if (integer2 != 0) {
			this.r.c(integer2);
			this.r.h(integer3);
			this.i();
		}
	}

	@Override
	public void k() {
		super.k();
		this.r.p();
	}

	private void f() {
		bgb.f[] arr2 = new bgb.f[]{
			new bgb.g(160, cah.a("createWorld.customize.custom.seaLevel"), true, this, 1.0F, 255.0F, (float)this.F.r),
			new bgb.a(148, cah.a("createWorld.customize.custom.useCaves"), true, this.F.s),
			new bgb.a(150, cah.a("createWorld.customize.custom.useStrongholds"), true, this.F.v),
			new bgb.a(151, cah.a("createWorld.customize.custom.useVillages"), true, this.F.w),
			new bgb.a(152, cah.a("createWorld.customize.custom.useMineShafts"), true, this.F.x),
			new bgb.a(153, cah.a("createWorld.customize.custom.useTemples"), true, this.F.y),
			new bgb.a(210, cah.a("createWorld.customize.custom.useMonuments"), true, this.F.z),
			new bgb.a(211, cah.a("createWorld.customize.custom.useMansions"), true, this.F.A),
			new bgb.a(154, cah.a("createWorld.customize.custom.useRavines"), true, this.F.B),
			new bgb.a(149, cah.a("createWorld.customize.custom.useDungeons"), true, this.F.t),
			new bgb.g(157, cah.a("createWorld.customize.custom.dungeonChance"), true, this, 1.0F, 100.0F, (float)this.F.u),
			new bgb.a(155, cah.a("createWorld.customize.custom.useWaterLakes"), true, this.F.C),
			new bgb.g(158, cah.a("createWorld.customize.custom.waterLakeChance"), true, this, 1.0F, 100.0F, (float)this.F.D),
			new bgb.a(156, cah.a("createWorld.customize.custom.useLavaLakes"), true, this.F.E),
			new bgb.g(159, cah.a("createWorld.customize.custom.lavaLakeChance"), true, this, 10.0F, 100.0F, (float)this.F.F),
			new bgb.a(161, cah.a("createWorld.customize.custom.useLavaOceans"), true, this.F.G),
			new bgb.g(162, cah.a("createWorld.customize.custom.fixedBiome"), true, this, -1.0F, 37.0F, (float)this.F.H),
			new bgb.g(163, cah.a("createWorld.customize.custom.biomeSize"), true, this, 1.0F, 8.0F, (float)this.F.I),
			new bgb.g(164, cah.a("createWorld.customize.custom.riverSize"), true, this, 1.0F, 5.0F, (float)this.F.J)
		};
		bgb.f[] arr3 = new bgb.f[]{
			new e(416, cah.a("tile.dirt.name"), false),
			null,
			new bgb.g(165, cah.a("createWorld.customize.custom.size"), false, this, 1.0F, 50.0F, (float)this.F.K),
			new bgb.g(166, cah.a("createWorld.customize.custom.count"), false, this, 0.0F, 40.0F, (float)this.F.L),
			new bgb.g(167, cah.a("createWorld.customize.custom.minHeight"), false, this, 0.0F, 255.0F, (float)this.F.M),
			new bgb.g(168, cah.a("createWorld.customize.custom.maxHeight"), false, this, 0.0F, 255.0F, (float)this.F.N),
			new e(417, cah.a("tile.gravel.name"), false),
			null,
			new bgb.g(169, cah.a("createWorld.customize.custom.size"), false, this, 1.0F, 50.0F, (float)this.F.O),
			new bgb.g(170, cah.a("createWorld.customize.custom.count"), false, this, 0.0F, 40.0F, (float)this.F.P),
			new bgb.g(171, cah.a("createWorld.customize.custom.minHeight"), false, this, 0.0F, 255.0F, (float)this.F.Q),
			new bgb.g(172, cah.a("createWorld.customize.custom.maxHeight"), false, this, 0.0F, 255.0F, (float)this.F.R),
			new e(418, cah.a("tile.stone.granite.name"), false),
			null,
			new bgb.g(173, cah.a("createWorld.customize.custom.size"), false, this, 1.0F, 50.0F, (float)this.F.S),
			new bgb.g(174, cah.a("createWorld.customize.custom.count"), false, this, 0.0F, 40.0F, (float)this.F.T),
			new bgb.g(175, cah.a("createWorld.customize.custom.minHeight"), false, this, 0.0F, 255.0F, (float)this.F.U),
			new bgb.g(176, cah.a("createWorld.customize.custom.maxHeight"), false, this, 0.0F, 255.0F, (float)this.F.V),
			new e(419, cah.a("tile.stone.diorite.name"), false),
			null,
			new bgb.g(177, cah.a("createWorld.customize.custom.size"), false, this, 1.0F, 50.0F, (float)this.F.W),
			new bgb.g(178, cah.a("createWorld.customize.custom.count"), false, this, 0.0F, 40.0F, (float)this.F.X),
			new bgb.g(179, cah.a("createWorld.customize.custom.minHeight"), false, this, 0.0F, 255.0F, (float)this.F.Y),
			new bgb.g(180, cah.a("createWorld.customize.custom.maxHeight"), false, this, 0.0F, 255.0F, (float)this.F.Z),
			new e(420, cah.a("tile.stone.andesite.name"), false),
			null,
			new bgb.g(181, cah.a("createWorld.customize.custom.size"), false, this, 1.0F, 50.0F, (float)this.F.aa),
			new bgb.g(182, cah.a("createWorld.customize.custom.count"), false, this, 0.0F, 40.0F, (float)this.F.ab),
			new bgb.g(183, cah.a("createWorld.customize.custom.minHeight"), false, this, 0.0F, 255.0F, (float)this.F.ac),
			new bgb.g(184, cah.a("createWorld.customize.custom.maxHeight"), false, this, 0.0F, 255.0F, (float)this.F.ad),
			new e(421, cah.a("tile.oreCoal.name"), false),
			null,
			new bgb.g(185, cah.a("createWorld.customize.custom.size"), false, this, 1.0F, 50.0F, (float)this.F.ae),
			new bgb.g(186, cah.a("createWorld.customize.custom.count"), false, this, 0.0F, 40.0F, (float)this.F.af),
			new bgb.g(187, cah.a("createWorld.customize.custom.minHeight"), false, this, 0.0F, 255.0F, (float)this.F.ag),
			new bgb.g(189, cah.a("createWorld.customize.custom.maxHeight"), false, this, 0.0F, 255.0F, (float)this.F.ah),
			new e(422, cah.a("tile.oreIron.name"), false),
			null,
			new bgb.g(190, cah.a("createWorld.customize.custom.size"), false, this, 1.0F, 50.0F, (float)this.F.ai),
			new bgb.g(191, cah.a("createWorld.customize.custom.count"), false, this, 0.0F, 40.0F, (float)this.F.aj),
			new bgb.g(192, cah.a("createWorld.customize.custom.minHeight"), false, this, 0.0F, 255.0F, (float)this.F.ak),
			new bgb.g(193, cah.a("createWorld.customize.custom.maxHeight"), false, this, 0.0F, 255.0F, (float)this.F.al),
			new e(423, cah.a("tile.oreGold.name"), false),
			null,
			new bgb.g(194, cah.a("createWorld.customize.custom.size"), false, this, 1.0F, 50.0F, (float)this.F.am),
			new bgb.g(195, cah.a("createWorld.customize.custom.count"), false, this, 0.0F, 40.0F, (float)this.F.an),
			new bgb.g(196, cah.a("createWorld.customize.custom.minHeight"), false, this, 0.0F, 255.0F, (float)this.F.ao),
			new bgb.g(197, cah.a("createWorld.customize.custom.maxHeight"), false, this, 0.0F, 255.0F, (float)this.F.ap),
			new e(424, cah.a("tile.oreRedstone.name"), false),
			null,
			new bgb.g(198, cah.a("createWorld.customize.custom.size"), false, this, 1.0F, 50.0F, (float)this.F.aq),
			new bgb.g(199, cah.a("createWorld.customize.custom.count"), false, this, 0.0F, 40.0F, (float)this.F.ar),
			new bgb.g(200, cah.a("createWorld.customize.custom.minHeight"), false, this, 0.0F, 255.0F, (float)this.F.as),
			new bgb.g(201, cah.a("createWorld.customize.custom.maxHeight"), false, this, 0.0F, 255.0F, (float)this.F.at),
			new e(425, cah.a("tile.oreDiamond.name"), false),
			null,
			new bgb.g(202, cah.a("createWorld.customize.custom.size"), false, this, 1.0F, 50.0F, (float)this.F.au),
			new bgb.g(203, cah.a("createWorld.customize.custom.count"), false, this, 0.0F, 40.0F, (float)this.F.av),
			new bgb.g(204, cah.a("createWorld.customize.custom.minHeight"), false, this, 0.0F, 255.0F, (float)this.F.aw),
			new bgb.g(205, cah.a("createWorld.customize.custom.maxHeight"), false, this, 0.0F, 255.0F, (float)this.F.ax),
			new e(426, cah.a("tile.oreLapis.name"), false),
			null,
			new bgb.g(206, cah.a("createWorld.customize.custom.size"), false, this, 1.0F, 50.0F, (float)this.F.ay),
			new bgb.g(207, cah.a("createWorld.customize.custom.count"), false, this, 0.0F, 40.0F, (float)this.F.az),
			new bgb.g(208, cah.a("createWorld.customize.custom.center"), false, this, 0.0F, 255.0F, (float)this.F.aA),
			new bgb.g(209, cah.a("createWorld.customize.custom.spread"), false, this, 0.0F, 255.0F, (float)this.F.aB)
		};
		bgb.f[] arr4 = new bgb.f[]{
			new bgb.g(100, cah.a("createWorld.customize.custom.mainNoiseScaleX"), false, this, 1.0F, 5000.0F, this.F.i),
			new bgb.g(101, cah.a("createWorld.customize.custom.mainNoiseScaleY"), false, this, 1.0F, 5000.0F, this.F.j),
			new bgb.g(102, cah.a("createWorld.customize.custom.mainNoiseScaleZ"), false, this, 1.0F, 5000.0F, this.F.k),
			new bgb.g(103, cah.a("createWorld.customize.custom.depthNoiseScaleX"), false, this, 1.0F, 2000.0F, this.F.f),
			new bgb.g(104, cah.a("createWorld.customize.custom.depthNoiseScaleZ"), false, this, 1.0F, 2000.0F, this.F.g),
			new bgb.g(105, cah.a("createWorld.customize.custom.depthNoiseScaleExponent"), false, this, 0.01F, 20.0F, this.F.h),
			new bgb.g(106, cah.a("createWorld.customize.custom.baseSize"), false, this, 1.0F, 25.0F, this.F.l),
			new bgb.g(107, cah.a("createWorld.customize.custom.coordinateScale"), false, this, 1.0F, 6000.0F, this.F.b),
			new bgb.g(108, cah.a("createWorld.customize.custom.heightScale"), false, this, 1.0F, 6000.0F, this.F.c),
			new bgb.g(109, cah.a("createWorld.customize.custom.stretchY"), false, this, 0.01F, 50.0F, this.F.m),
			new bgb.g(110, cah.a("createWorld.customize.custom.upperLimitScale"), false, this, 1.0F, 5000.0F, this.F.d),
			new bgb.g(111, cah.a("createWorld.customize.custom.lowerLimitScale"), false, this, 1.0F, 5000.0F, this.F.e),
			new bgb.g(112, cah.a("createWorld.customize.custom.biomeDepthWeight"), false, this, 1.0F, 20.0F, this.F.n),
			new bgb.g(113, cah.a("createWorld.customize.custom.biomeDepthOffset"), false, this, 0.0F, 20.0F, this.F.o),
			new bgb.g(114, cah.a("createWorld.customize.custom.biomeScaleWeight"), false, this, 1.0F, 20.0F, this.F.p),
			new bgb.g(115, cah.a("createWorld.customize.custom.biomeScaleOffset"), false, this, 0.0F, 20.0F, this.F.q)
		};
		bgb.f[] arr5 = new bgb.f[]{
			new e(400, cah.a("createWorld.customize.custom.mainNoiseScaleX") + ":", false),
			new bgb.c(132, String.format("%5.3f", this.F.i), false, this.D),
			new e(401, cah.a("createWorld.customize.custom.mainNoiseScaleY") + ":", false),
			new bgb.c(133, String.format("%5.3f", this.F.j), false, this.D),
			new e(402, cah.a("createWorld.customize.custom.mainNoiseScaleZ") + ":", false),
			new bgb.c(134, String.format("%5.3f", this.F.k), false, this.D),
			new e(403, cah.a("createWorld.customize.custom.depthNoiseScaleX") + ":", false),
			new bgb.c(135, String.format("%5.3f", this.F.f), false, this.D),
			new e(404, cah.a("createWorld.customize.custom.depthNoiseScaleZ") + ":", false),
			new bgb.c(136, String.format("%5.3f", this.F.g), false, this.D),
			new e(405, cah.a("createWorld.customize.custom.depthNoiseScaleExponent") + ":", false),
			new bgb.c(137, String.format("%2.3f", this.F.h), false, this.D),
			new e(406, cah.a("createWorld.customize.custom.baseSize") + ":", false),
			new bgb.c(138, String.format("%2.3f", this.F.l), false, this.D),
			new e(407, cah.a("createWorld.customize.custom.coordinateScale") + ":", false),
			new bgb.c(139, String.format("%5.3f", this.F.b), false, this.D),
			new e(408, cah.a("createWorld.customize.custom.heightScale") + ":", false),
			new bgb.c(140, String.format("%5.3f", this.F.c), false, this.D),
			new e(409, cah.a("createWorld.customize.custom.stretchY") + ":", false),
			new bgb.c(141, String.format("%2.3f", this.F.m), false, this.D),
			new e(410, cah.a("createWorld.customize.custom.upperLimitScale") + ":", false),
			new bgb.c(142, String.format("%5.3f", this.F.d), false, this.D),
			new e(411, cah.a("createWorld.customize.custom.lowerLimitScale") + ":", false),
			new bgb.c(143, String.format("%5.3f", this.F.e), false, this.D),
			new e(412, cah.a("createWorld.customize.custom.biomeDepthWeight") + ":", false),
			new bgb.c(144, String.format("%2.3f", this.F.n), false, this.D),
			new e(413, cah.a("createWorld.customize.custom.biomeDepthOffset") + ":", false),
			new bgb.c(145, String.format("%2.3f", this.F.o), false, this.D),
			new e(414, cah.a("createWorld.customize.custom.biomeScaleWeight") + ":", false),
			new bgb.c(146, String.format("%2.3f", this.F.p), false, this.D),
			new e(415, cah.a("createWorld.customize.custom.biomeScaleOffset") + ":", false),
			new bgb.c(147, String.format("%2.3f", this.F.q), false, this.D)
		};
		this.r = new bgb(this.j, this.l, this.m, 32, this.m - 32, 25, this, arr2, arr3, arr4, arr5);

		for (int integer6 = 0; integer6 < 4; integer6++) {
			this.h[integer6] = cah.a("createWorld.customize.custom.page" + integer6);
		}

		this.i();
	}

	public String a() {
		return this.F.toString().replace("\n", "");
	}

	public void a(String string) {
		if (string != null && !string.isEmpty()) {
			this.F = avq.a.a(string);
		} else {
			this.F = new avq.a();
		}
	}

	@Override
	public void a(int integer, String string) {
		float float4 = 0.0F;

		try {
			float4 = Float.parseFloat(string);
		} catch (NumberFormatException var5) {
		}

		float float5 = 0.0F;
		switch (integer) {
			case 132:
				this.F.i = ot.a(float4, 1.0F, 5000.0F);
				float5 = this.F.i;
				break;
			case 133:
				this.F.j = ot.a(float4, 1.0F, 5000.0F);
				float5 = this.F.j;
				break;
			case 134:
				this.F.k = ot.a(float4, 1.0F, 5000.0F);
				float5 = this.F.k;
				break;
			case 135:
				this.F.f = ot.a(float4, 1.0F, 2000.0F);
				float5 = this.F.f;
				break;
			case 136:
				this.F.g = ot.a(float4, 1.0F, 2000.0F);
				float5 = this.F.g;
				break;
			case 137:
				this.F.h = ot.a(float4, 0.01F, 20.0F);
				float5 = this.F.h;
				break;
			case 138:
				this.F.l = ot.a(float4, 1.0F, 25.0F);
				float5 = this.F.l;
				break;
			case 139:
				this.F.b = ot.a(float4, 1.0F, 6000.0F);
				float5 = this.F.b;
				break;
			case 140:
				this.F.c = ot.a(float4, 1.0F, 6000.0F);
				float5 = this.F.c;
				break;
			case 141:
				this.F.m = ot.a(float4, 0.01F, 50.0F);
				float5 = this.F.m;
				break;
			case 142:
				this.F.d = ot.a(float4, 1.0F, 5000.0F);
				float5 = this.F.d;
				break;
			case 143:
				this.F.e = ot.a(float4, 1.0F, 5000.0F);
				float5 = this.F.e;
				break;
			case 144:
				this.F.n = ot.a(float4, 1.0F, 20.0F);
				float5 = this.F.n;
				break;
			case 145:
				this.F.o = ot.a(float4, 0.0F, 20.0F);
				float5 = this.F.o;
				break;
			case 146:
				this.F.p = ot.a(float4, 1.0F, 20.0F);
				float5 = this.F.p;
				break;
			case 147:
				this.F.q = ot.a(float4, 0.0F, 20.0F);
				float5 = this.F.q;
		}

		if (float5 != float4 && float4 != 0.0F) {
			((bfq)this.r.d(integer)).a(this.b(integer, float5));
		}

		((bfr)this.r.d(integer - 132 + 100)).a(float5, false);
		if (!this.F.equals(this.E)) {
			this.a(true);
		}
	}

	private void a(boolean boolean1) {
		this.A = boolean1;
		this.u.l = boolean1;
	}

	@Override
	public String a(int integer, String string, float float3) {
		return string + ": " + this.b(integer, float3);
	}

	private String b(int integer, float float2) {
		switch (integer) {
			case 100:
			case 101:
			case 102:
			case 103:
			case 104:
			case 107:
			case 108:
			case 110:
			case 111:
			case 132:
			case 133:
			case 134:
			case 135:
			case 136:
			case 139:
			case 140:
			case 142:
			case 143:
				return String.format("%5.3f", float2);
			case 105:
			case 106:
			case 109:
			case 112:
			case 113:
			case 114:
			case 115:
			case 137:
			case 138:
			case 141:
			case 144:
			case 145:
			case 146:
			case 147:
				return String.format("%2.3f", float2);
			case 116:
			case 117:
			case 118:
			case 119:
			case 120:
			case 121:
			case 122:
			case 123:
			case 124:
			case 125:
			case 126:
			case 127:
			case 128:
			case 129:
			case 130:
			case 131:
			case 148:
			case 149:
			case 150:
			case 151:
			case 152:
			case 153:
			case 154:
			case 155:
			case 156:
			case 157:
			case 158:
			case 159:
			case 160:
			case 161:
			default:
				return String.format("%d", (int)float2);
			case 162:
				if (float2 < 0.0F) {
					return cah.a("gui.all");
				} else if ((int)float2 >= akf.a(akk.j)) {
					akf akf4 = akf.a((int)float2 + 2);
					return akf4 != null ? akf4.l() : "?";
				} else {
					akf akf4 = akf.a((int)float2);
					return akf4 != null ? akf4.l() : "?";
				}
		}
	}

	@Override
	public void a(int integer, boolean boolean2) {
		switch (integer) {
			case 148:
				this.F.s = boolean2;
				break;
			case 149:
				this.F.t = boolean2;
				break;
			case 150:
				this.F.v = boolean2;
				break;
			case 151:
				this.F.w = boolean2;
				break;
			case 152:
				this.F.x = boolean2;
				break;
			case 153:
				this.F.y = boolean2;
				break;
			case 154:
				this.F.B = boolean2;
				break;
			case 155:
				this.F.C = boolean2;
				break;
			case 156:
				this.F.E = boolean2;
				break;
			case 161:
				this.F.G = boolean2;
				break;
			case 210:
				this.F.z = boolean2;
				break;
			case 211:
				this.F.A = boolean2;
		}

		if (!this.F.equals(this.E)) {
			this.a(true);
		}
	}

	@Override
	public void a(int integer, float float2) {
		switch (integer) {
			case 100:
				this.F.i = float2;
				break;
			case 101:
				this.F.j = float2;
				break;
			case 102:
				this.F.k = float2;
				break;
			case 103:
				this.F.f = float2;
				break;
			case 104:
				this.F.g = float2;
				break;
			case 105:
				this.F.h = float2;
				break;
			case 106:
				this.F.l = float2;
				break;
			case 107:
				this.F.b = float2;
				break;
			case 108:
				this.F.c = float2;
				break;
			case 109:
				this.F.m = float2;
				break;
			case 110:
				this.F.d = float2;
				break;
			case 111:
				this.F.e = float2;
				break;
			case 112:
				this.F.n = float2;
				break;
			case 113:
				this.F.o = float2;
				break;
			case 114:
				this.F.p = float2;
				break;
			case 115:
				this.F.q = float2;
			case 116:
			case 117:
			case 118:
			case 119:
			case 120:
			case 121:
			case 122:
			case 123:
			case 124:
			case 125:
			case 126:
			case 127:
			case 128:
			case 129:
			case 130:
			case 131:
			case 132:
			case 133:
			case 134:
			case 135:
			case 136:
			case 137:
			case 138:
			case 139:
			case 140:
			case 141:
			case 142:
			case 143:
			case 144:
			case 145:
			case 146:
			case 147:
			case 148:
			case 149:
			case 150:
			case 151:
			case 152:
			case 153:
			case 154:
			case 155:
			case 156:
			case 161:
			case 188:
			default:
				break;
			case 157:
				this.F.u = (int)float2;
				break;
			case 158:
				this.F.D = (int)float2;
				break;
			case 159:
				this.F.F = (int)float2;
				break;
			case 160:
				this.F.r = (int)float2;
				break;
			case 162:
				this.F.H = (int)float2;
				break;
			case 163:
				this.F.I = (int)float2;
				break;
			case 164:
				this.F.J = (int)float2;
				break;
			case 165:
				this.F.K = (int)float2;
				break;
			case 166:
				this.F.L = (int)float2;
				break;
			case 167:
				this.F.M = (int)float2;
				break;
			case 168:
				this.F.N = (int)float2;
				break;
			case 169:
				this.F.O = (int)float2;
				break;
			case 170:
				this.F.P = (int)float2;
				break;
			case 171:
				this.F.Q = (int)float2;
				break;
			case 172:
				this.F.R = (int)float2;
				break;
			case 173:
				this.F.S = (int)float2;
				break;
			case 174:
				this.F.T = (int)float2;
				break;
			case 175:
				this.F.U = (int)float2;
				break;
			case 176:
				this.F.V = (int)float2;
				break;
			case 177:
				this.F.W = (int)float2;
				break;
			case 178:
				this.F.X = (int)float2;
				break;
			case 179:
				this.F.Y = (int)float2;
				break;
			case 180:
				this.F.Z = (int)float2;
				break;
			case 181:
				this.F.aa = (int)float2;
				break;
			case 182:
				this.F.ab = (int)float2;
				break;
			case 183:
				this.F.ac = (int)float2;
				break;
			case 184:
				this.F.ad = (int)float2;
				break;
			case 185:
				this.F.ae = (int)float2;
				break;
			case 186:
				this.F.af = (int)float2;
				break;
			case 187:
				this.F.ag = (int)float2;
				break;
			case 189:
				this.F.ah = (int)float2;
				break;
			case 190:
				this.F.ai = (int)float2;
				break;
			case 191:
				this.F.aj = (int)float2;
				break;
			case 192:
				this.F.ak = (int)float2;
				break;
			case 193:
				this.F.al = (int)float2;
				break;
			case 194:
				this.F.am = (int)float2;
				break;
			case 195:
				this.F.an = (int)float2;
				break;
			case 196:
				this.F.ao = (int)float2;
				break;
			case 197:
				this.F.ap = (int)float2;
				break;
			case 198:
				this.F.aq = (int)float2;
				break;
			case 199:
				this.F.ar = (int)float2;
				break;
			case 200:
				this.F.as = (int)float2;
				break;
			case 201:
				this.F.at = (int)float2;
				break;
			case 202:
				this.F.au = (int)float2;
				break;
			case 203:
				this.F.av = (int)float2;
				break;
			case 204:
				this.F.aw = (int)float2;
				break;
			case 205:
				this.F.ax = (int)float2;
				break;
			case 206:
				this.F.ay = (int)float2;
				break;
			case 207:
				this.F.az = (int)float2;
				break;
			case 208:
				this.F.aA = (int)float2;
				break;
			case 209:
				this.F.aB = (int)float2;
		}

		if (integer >= 100 && integer < 116) {
			bfi bfi4 = this.r.d(integer - 100 + 132);
			if (bfi4 != null) {
				((bfq)bfi4).a(this.b(integer, float2));
			}
		}

		if (!this.F.equals(this.E)) {
			this.a(true);
		}
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			switch (bfm.k) {
				case 300:
					this.i.a = this.F.toString();
					this.j.a(this.i);
					break;
				case 301:
					for (int integer3 = 0; integer3 < this.r.b(); integer3++) {
						bgb.d d4 = this.r.e(integer3);
						bfi bfi5 = d4.a();
						if (bfi5 instanceof bfm) {
							bfm bfm6 = (bfm)bfi5;
							if (bfm6 instanceof bfr) {
								float float7 = ((bfr)bfm6).d() * (0.75F + this.G.nextFloat() * 0.5F) + (this.G.nextFloat() * 0.1F - 0.05F);
								((bfr)bfm6).a(ot.a(float7, 0.0F, 1.0F));
							} else if (bfm6 instanceof bfw) {
								((bfw)bfm6).b(this.G.nextBoolean());
							}
						}

						bfi bfi6 = d4.b();
						if (bfi6 instanceof bfm) {
							bfm bfm7 = (bfm)bfi6;
							if (bfm7 instanceof bfr) {
								float float8 = ((bfr)bfm7).d() * (0.75F + this.G.nextFloat() * 0.5F) + (this.G.nextFloat() * 0.1F - 0.05F);
								((bfr)bfm7).a(ot.a(float8, 0.0F, 1.0F));
							} else if (bfm7 instanceof bfw) {
								((bfw)bfm7).b(this.G.nextBoolean());
							}
						}
					}
					break;
				case 302:
					this.r.h();
					this.i();
					break;
				case 303:
					this.r.i();
					this.i();
					break;
				case 304:
					if (this.A) {
						this.b(304);
					}
					break;
				case 305:
					this.j.a(new bgx(this));
					break;
				case 306:
					this.h();
					break;
				case 307:
					this.B = 0;
					this.h();
			}
		}
	}

	private void g() {
		this.F.a();
		this.f();
		this.a(false);
	}

	private void b(int integer) {
		this.B = integer;
		this.b(true);
	}

	private void h() {
		switch (this.B) {
			case 300:
				this.a((bfw)this.r.d(300));
				break;
			case 304:
				this.g();
		}

		this.B = 0;
		this.C = true;
		this.b(false);
	}

	private void b(boolean boolean1) {
		this.x.m = boolean1;
		this.y.m = boolean1;
		this.t.l = !boolean1;
		this.s.l = !boolean1;
		this.v.l = !boolean1;
		this.w.l = !boolean1;
		this.u.l = this.A && !boolean1;
		this.z.l = !boolean1;
		this.r.a(!boolean1);
	}

	private void i() {
		this.v.l = this.r.e() != 0;
		this.w.l = this.r.e() != this.r.f() - 1;
		this.f = cah.a("book.pageIndicator", this.r.e() + 1, this.r.f());
		this.g = this.h[this.r.e()];
		this.t.l = this.r.e() != this.r.f() - 1;
	}

	@Override
	protected void a(char character, int integer) {
		super.a(character, integer);
		if (this.B == 0) {
			switch (integer) {
				case 200:
					this.a(1.0F);
					break;
				case 208:
					this.a(-1.0F);
					break;
				default:
					this.r.a(character, integer);
			}
		}
	}

	private void a(float float1) {
		bfi bfi3 = this.r.g();
		if (bfi3 instanceof bfq) {
			float float4 = float1;
			if (bho.r()) {
				float4 = float1 * 0.1F;
				if (bho.q()) {
					float4 *= 0.1F;
				}
			} else if (bho.q()) {
				float4 = float1 * 10.0F;
				if (bho.s()) {
					float4 *= 10.0F;
				}
			}

			bfq bfq5 = (bfq)bfi3;
			Float float6 = Floats.tryParse(bfq5.b());
			if (float6 != null) {
				float6 = float6 + float4;
				int integer7 = bfq5.d();
				String string8 = this.b(bfq5.d(), float6);
				bfq5.a(string8);
				this.a(integer7, string8);
			}
		}
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		if (this.B == 0 && !this.C) {
			this.r.b(integer1, integer2, integer3);
		}
	}

	@Override
	protected void b(int integer1, int integer2, int integer3) {
		super.b(integer1, integer2, integer3);
		if (this.C) {
			this.C = false;
		} else if (this.B == 0) {
			this.r.c(integer1, integer2, integer3);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.r.a(integer1, integer2, float3);
		this.a(this.q, this.a, this.l / 2, 2, 16777215);
		this.a(this.q, this.f, this.l / 2, 12, 16777215);
		this.a(this.q, this.g, this.l / 2, 22, 16777215);
		super.a(integer1, integer2, float3);
		if (this.B != 0) {
			a(0, 0, this.l, this.m, Integer.MIN_VALUE);
			this.a(this.l / 2 - 91, this.l / 2 + 90, 99, -2039584);
			this.a(this.l / 2 - 91, this.l / 2 + 90, 185, -6250336);
			this.b(this.l / 2 - 91, 99, 185, -2039584);
			this.b(this.l / 2 + 90, 99, 185, -6250336);
			float float5 = 85.0F;
			float float6 = 180.0F;
			bqg.g();
			bqg.p();
			bqs bqs7 = bqs.a();
			bpy bpy8 = bqs7.c();
			this.j.N().a(b);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			float float9 = 32.0F;
			bpy8.a(7, bzh.i);
			bpy8.b((double)(this.l / 2 - 90), 185.0, 0.0).a(0.0, 2.65625).b(64, 64, 64, 64).d();
			bpy8.b((double)(this.l / 2 + 90), 185.0, 0.0).a(5.625, 2.65625).b(64, 64, 64, 64).d();
			bpy8.b((double)(this.l / 2 + 90), 100.0, 0.0).a(5.625, 0.0).b(64, 64, 64, 64).d();
			bpy8.b((double)(this.l / 2 - 90), 100.0, 0.0).a(0.0, 0.0).b(64, 64, 64, 64).d();
			bqs7.b();
			this.a(this.q, cah.a("createWorld.customize.custom.confirmTitle"), this.l / 2, 105, 16777215);
			this.a(this.q, cah.a("createWorld.customize.custom.confirm1"), this.l / 2, 125, 16777215);
			this.a(this.q, cah.a("createWorld.customize.custom.confirm2"), this.l / 2, 135, 16777215);
			this.x.a(this.j, integer1, integer2);
			this.y.a(this.j, integer1, integer2);
		}
	}
}
