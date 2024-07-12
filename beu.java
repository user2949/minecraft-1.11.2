import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class beu {
	private static final Logger aG = LogManager.getLogger();
	private static final Gson aH = new Gson();
	private static final Type aI = new ParameterizedType() {
		public Type[] getActualTypeArguments() {
			return new Type[]{String.class};
		}

		public Type getRawType() {
			return List.class;
		}

		public Type getOwnerType() {
			return null;
		}
	};
	public static final Splitter a = Splitter.on(':');
	private static final String[] aJ = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
	private static final String[] aK = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
	private static final String[] aL = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
	private static final String[] aM = new String[]{"options.off", "options.graphics.fast", "options.graphics.fancy"};
	private static final String[] aN = new String[]{"options.off", "options.attack.crosshair", "options.attack.hotbar"};
	public float b = 0.5F;
	public boolean c;
	public int d = -1;
	public boolean e = true;
	public boolean f;
	public boolean g = true;
	public int h = 120;
	public int i = 2;
	public boolean j = true;
	public int k = 2;
	public List<String> l = Lists.newArrayList();
	public List<String> m = Lists.newArrayList();
	public aay.b n = aay.b.FULL;
	public boolean o = true;
	public boolean p = true;
	public boolean q = true;
	public float r = 1.0F;
	public boolean s = true;
	public boolean t;
	public boolean u = true;
	public boolean v = true;
	public boolean w;
	public boolean x;
	public boolean y;
	public boolean z = true;
	private final Set<aaz> aO = Sets.newHashSet(aaz.values());
	public boolean A;
	public sv B = sv.RIGHT;
	public int C;
	public int D;
	public boolean E = true;
	public float F = 1.0F;
	public float G = 1.0F;
	public float H = 0.44366196F;
	public float I = 1.0F;
	public boolean J = true;
	public int K = 4;
	private final Map<no, Float> aP = Maps.newEnumMap(no.class);
	public boolean L = true;
	public boolean M = true;
	public int N = 1;
	public boolean O;
	public boolean P;
	public boolean Q = true;
	public boolean R = true;
	public bep S = new bep("key.forward", 17, "key.categories.movement");
	public bep T = new bep("key.left", 30, "key.categories.movement");
	public bep U = new bep("key.back", 31, "key.categories.movement");
	public bep V = new bep("key.right", 32, "key.categories.movement");
	public bep W = new bep("key.jump", 57, "key.categories.movement");
	public bep X = new bep("key.sneak", 42, "key.categories.movement");
	public bep Y = new bep("key.sprint", 29, "key.categories.movement");
	public bep Z = new bep("key.inventory", 18, "key.categories.inventory");
	public bep aa = new bep("key.swapHands", 33, "key.categories.inventory");
	public bep ab = new bep("key.drop", 16, "key.categories.inventory");
	public bep ac = new bep("key.use", -99, "key.categories.gameplay");
	public bep ad = new bep("key.attack", -100, "key.categories.gameplay");
	public bep ae = new bep("key.pickItem", -98, "key.categories.gameplay");
	public bep af = new bep("key.chat", 20, "key.categories.multiplayer");
	public bep ag = new bep("key.playerlist", 15, "key.categories.multiplayer");
	public bep ah = new bep("key.command", 53, "key.categories.multiplayer");
	public bep ai = new bep("key.screenshot", 60, "key.categories.misc");
	public bep aj = new bep("key.togglePerspective", 63, "key.categories.misc");
	public bep ak = new bep("key.smoothCamera", 0, "key.categories.misc");
	public bep al = new bep("key.fullscreen", 87, "key.categories.misc");
	public bep am = new bep("key.spectatorOutlines", 0, "key.categories.misc");
	public bep[] an = new bep[]{
		new bep("key.hotbar.1", 2, "key.categories.inventory"),
		new bep("key.hotbar.2", 3, "key.categories.inventory"),
		new bep("key.hotbar.3", 4, "key.categories.inventory"),
		new bep("key.hotbar.4", 5, "key.categories.inventory"),
		new bep("key.hotbar.5", 6, "key.categories.inventory"),
		new bep("key.hotbar.6", 7, "key.categories.inventory"),
		new bep("key.hotbar.7", 8, "key.categories.inventory"),
		new bep("key.hotbar.8", 9, "key.categories.inventory"),
		new bep("key.hotbar.9", 10, "key.categories.inventory")
	};
	public bep[] ao = (bep[])ArrayUtils.addAll(
		new bep[]{
			this.ad,
			this.ac,
			this.S,
			this.T,
			this.U,
			this.V,
			this.W,
			this.X,
			this.Y,
			this.ab,
			this.Z,
			this.af,
			this.ag,
			this.ae,
			this.ah,
			this.ai,
			this.aj,
			this.ak,
			this.al,
			this.am,
			this.aa
		},
		this.an
	);
	protected bes ap;
	private File aQ;
	public rg aq = rg.NORMAL;
	public boolean ar;
	public int as;
	public boolean at;
	public boolean au;
	public boolean av;
	public String aw = "";
	public boolean ax;
	public boolean ay;
	public float az = 70.0F;
	public float aA;
	public float aB;
	public int aC;
	public int aD;
	public String aE = "en_us";
	public boolean aF;

	public beu(bes bes, File file) {
		this.ap = bes;
		this.aQ = new File(file, "options.txt");
		if (bes.S() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
			beu.a.RENDER_DISTANCE.a(32.0F);
		} else {
			beu.a.RENDER_DISTANCE.a(16.0F);
		}

		this.d = bes.S() ? 12 : 8;
		this.a();
	}

	public beu() {
	}

	public static String c(int integer) {
		if (integer < 0) {
			return cah.a("key.mouseButton", integer + 101);
		} else {
			return integer < 256 ? Keyboard.getKeyName(integer) : String.format("%c", (char)(integer - 256)).toUpperCase();
		}
	}

	public static boolean a(bep bep) {
		int integer2 = bep.j();
		if (integer2 == 0 || integer2 >= 256) {
			return false;
		} else {
			return integer2 < 0 ? Mouse.isButtonDown(integer2 + 100) : Keyboard.isKeyDown(integer2);
		}
	}

	public void a(bep bep, int integer) {
		bep.b(integer);
		this.b();
	}

	public void a(beu.a a, float float2) {
		if (a == beu.a.SENSITIVITY) {
			this.b = float2;
		}

		if (a == beu.a.FOV) {
			this.az = float2;
		}

		if (a == beu.a.GAMMA) {
			this.aA = float2;
		}

		if (a == beu.a.FRAMERATE_LIMIT) {
			this.h = (int)float2;
		}

		if (a == beu.a.CHAT_OPACITY) {
			this.r = float2;
			this.ap.r.d().a();
		}

		if (a == beu.a.CHAT_HEIGHT_FOCUSED) {
			this.I = float2;
			this.ap.r.d().a();
		}

		if (a == beu.a.CHAT_HEIGHT_UNFOCUSED) {
			this.H = float2;
			this.ap.r.d().a();
		}

		if (a == beu.a.CHAT_WIDTH) {
			this.G = float2;
			this.ap.r.d().a();
		}

		if (a == beu.a.CHAT_SCALE) {
			this.F = float2;
			this.ap.r.d().a();
		}

		if (a == beu.a.MIPMAP_LEVELS) {
			int integer4 = this.K;
			this.K = (int)float2;
			if ((float)integer4 != float2) {
				this.ap.R().a(this.K);
				this.ap.N().a(byy.g);
				this.ap.R().a(false, this.K > 0);
				this.ap.A();
			}
		}

		if (a == beu.a.RENDER_DISTANCE) {
			this.d = (int)float2;
			this.ap.g.o();
		}
	}

	public void a(beu.a a, int integer) {
		if (a == beu.a.RENDER_DISTANCE) {
			this.a(a, ot.a((float)(this.d + integer), a.e(), a.f()));
		}

		if (a == beu.a.MAIN_HAND) {
			this.B = this.B.a();
		}

		if (a == beu.a.INVERT_MOUSE) {
			this.c = !this.c;
		}

		if (a == beu.a.GUI_SCALE) {
			this.aC = this.aC + integer & 3;
		}

		if (a == beu.a.PARTICLES) {
			this.aD = (this.aD + integer) % 3;
		}

		if (a == beu.a.VIEW_BOBBING) {
			this.e = !this.e;
		}

		if (a == beu.a.RENDER_CLOUDS) {
			this.i = (this.i + integer) % 3;
		}

		if (a == beu.a.FORCE_UNICODE_FONT) {
			this.aF = !this.aF;
			this.ap.k.a(this.ap.Q().a() || this.aF);
		}

		if (a == beu.a.FBO_ENABLE) {
			this.g = !this.g;
		}

		if (a == beu.a.ANAGLYPH) {
			this.f = !this.f;
			this.ap.f();
		}

		if (a == beu.a.GRAPHICS) {
			this.j = !this.j;
			this.ap.g.a();
		}

		if (a == beu.a.AMBIENT_OCCLUSION) {
			this.k = (this.k + integer) % 3;
			this.ap.g.a();
		}

		if (a == beu.a.CHAT_VISIBILITY) {
			this.n = aay.b.a((this.n.a() + integer) % 3);
		}

		if (a == beu.a.CHAT_COLOR) {
			this.o = !this.o;
		}

		if (a == beu.a.CHAT_LINKS) {
			this.p = !this.p;
		}

		if (a == beu.a.CHAT_LINKS_PROMPT) {
			this.q = !this.q;
		}

		if (a == beu.a.SNOOPER_ENABLED) {
			this.s = !this.s;
		}

		if (a == beu.a.TOUCHSCREEN) {
			this.A = !this.A;
		}

		if (a == beu.a.USE_FULLSCREEN) {
			this.t = !this.t;
			if (this.ap.J() != this.t) {
				this.ap.r();
			}
		}

		if (a == beu.a.ENABLE_VSYNC) {
			this.u = !this.u;
			Display.setVSyncEnabled(this.u);
		}

		if (a == beu.a.USE_VBO) {
			this.v = !this.v;
			this.ap.g.a();
		}

		if (a == beu.a.REDUCED_DEBUG_INFO) {
			this.w = !this.w;
		}

		if (a == beu.a.ENTITY_SHADOWS) {
			this.M = !this.M;
		}

		if (a == beu.a.ATTACK_INDICATOR) {
			this.N = (this.N + integer) % 3;
		}

		if (a == beu.a.SHOW_SUBTITLES) {
			this.P = !this.P;
		}

		if (a == beu.a.REALMS_NOTIFICATIONS) {
			this.Q = !this.Q;
		}

		if (a == beu.a.AUTO_JUMP) {
			this.R = !this.R;
		}

		this.b();
	}

	public float a(beu.a a) {
		if (a == beu.a.FOV) {
			return this.az;
		} else if (a == beu.a.GAMMA) {
			return this.aA;
		} else if (a == beu.a.SATURATION) {
			return this.aB;
		} else if (a == beu.a.SENSITIVITY) {
			return this.b;
		} else if (a == beu.a.CHAT_OPACITY) {
			return this.r;
		} else if (a == beu.a.CHAT_HEIGHT_FOCUSED) {
			return this.I;
		} else if (a == beu.a.CHAT_HEIGHT_UNFOCUSED) {
			return this.H;
		} else if (a == beu.a.CHAT_SCALE) {
			return this.F;
		} else if (a == beu.a.CHAT_WIDTH) {
			return this.G;
		} else if (a == beu.a.FRAMERATE_LIMIT) {
			return (float)this.h;
		} else if (a == beu.a.MIPMAP_LEVELS) {
			return (float)this.K;
		} else {
			return a == beu.a.RENDER_DISTANCE ? (float)this.d : 0.0F;
		}
	}

	public boolean b(beu.a a) {
		switch (a) {
			case INVERT_MOUSE:
				return this.c;
			case VIEW_BOBBING:
				return this.e;
			case ANAGLYPH:
				return this.f;
			case FBO_ENABLE:
				return this.g;
			case CHAT_COLOR:
				return this.o;
			case CHAT_LINKS:
				return this.p;
			case CHAT_LINKS_PROMPT:
				return this.q;
			case SNOOPER_ENABLED:
				return this.s;
			case USE_FULLSCREEN:
				return this.t;
			case ENABLE_VSYNC:
				return this.u;
			case USE_VBO:
				return this.v;
			case TOUCHSCREEN:
				return this.A;
			case FORCE_UNICODE_FONT:
				return this.aF;
			case REDUCED_DEBUG_INFO:
				return this.w;
			case ENTITY_SHADOWS:
				return this.M;
			case SHOW_SUBTITLES:
				return this.P;
			case REALMS_NOTIFICATIONS:
				return this.Q;
			case ENABLE_WEAK_ATTACKS:
				return this.O;
			case AUTO_JUMP:
				return this.R;
			default:
				return false;
		}
	}

	private static String a(String[] arr, int integer) {
		if (integer < 0 || integer >= arr.length) {
			integer = 0;
		}

		return cah.a(arr[integer]);
	}

	public String c(beu.a a) {
		String string3 = cah.a(a.d()) + ": ";
		if (a.a()) {
			float float4 = this.a(a);
			float float5 = a.c(float4);
			if (a == beu.a.SENSITIVITY) {
				if (float5 == 0.0F) {
					return string3 + cah.a("options.sensitivity.min");
				} else {
					return float5 == 1.0F ? string3 + cah.a("options.sensitivity.max") : string3 + (int)(float5 * 200.0F) + "%";
				}
			} else if (a == beu.a.FOV) {
				if (float4 == 70.0F) {
					return string3 + cah.a("options.fov.min");
				} else {
					return float4 == 110.0F ? string3 + cah.a("options.fov.max") : string3 + (int)float4;
				}
			} else if (a == beu.a.FRAMERATE_LIMIT) {
				return float4 == a.S ? string3 + cah.a("options.framerateLimit.max") : string3 + cah.a("options.framerate", (int)float4);
			} else if (a == beu.a.RENDER_CLOUDS) {
				return float4 == a.R ? string3 + cah.a("options.cloudHeight.min") : string3 + ((int)float4 + 128);
			} else if (a == beu.a.GAMMA) {
				if (float5 == 0.0F) {
					return string3 + cah.a("options.gamma.min");
				} else {
					return float5 == 1.0F ? string3 + cah.a("options.gamma.max") : string3 + "+" + (int)(float5 * 100.0F) + "%";
				}
			} else if (a == beu.a.SATURATION) {
				return string3 + (int)(float5 * 400.0F) + "%";
			} else if (a == beu.a.CHAT_OPACITY) {
				return string3 + (int)(float5 * 90.0F + 10.0F) + "%";
			} else if (a == beu.a.CHAT_HEIGHT_UNFOCUSED) {
				return string3 + bfn.b(float5) + "px";
			} else if (a == beu.a.CHAT_HEIGHT_FOCUSED) {
				return string3 + bfn.b(float5) + "px";
			} else if (a == beu.a.CHAT_WIDTH) {
				return string3 + bfn.a(float5) + "px";
			} else if (a == beu.a.RENDER_DISTANCE) {
				return string3 + cah.a("options.chunks", (int)float4);
			} else if (a == beu.a.MIPMAP_LEVELS) {
				return float4 == 0.0F ? string3 + cah.a("options.off") : string3 + (int)float4;
			} else {
				return float5 == 0.0F ? string3 + cah.a("options.off") : string3 + (int)(float5 * 100.0F) + "%";
			}
		} else if (a.b()) {
			boolean boolean4 = this.b(a);
			return boolean4 ? string3 + cah.a("options.on") : string3 + cah.a("options.off");
		} else if (a == beu.a.MAIN_HAND) {
			return string3 + this.B;
		} else if (a == beu.a.GUI_SCALE) {
			return string3 + a(aJ, this.aC);
		} else if (a == beu.a.CHAT_VISIBILITY) {
			return string3 + cah.a(this.n.b());
		} else if (a == beu.a.PARTICLES) {
			return string3 + a(aK, this.aD);
		} else if (a == beu.a.AMBIENT_OCCLUSION) {
			return string3 + a(aL, this.k);
		} else if (a == beu.a.RENDER_CLOUDS) {
			return string3 + a(aM, this.i);
		} else if (a == beu.a.GRAPHICS) {
			if (this.j) {
				return string3 + cah.a("options.graphics.fancy");
			} else {
				String string4 = "options.graphics.fast";
				return string3 + cah.a("options.graphics.fast");
			}
		} else {
			return a == beu.a.ATTACK_INDICATOR ? string3 + a(aN, this.N) : string3;
		}
	}

	public void a() {
		try {
			if (!this.aQ.exists()) {
				return;
			}

			this.aP.clear();
			List<String> list2 = IOUtils.readLines(new FileInputStream(this.aQ));
			du du3 = new du();

			for (String string5 : list2) {
				try {
					Iterator<String> iterator6 = a.omitEmptyStrings().limit(2).split(string5).iterator();
					du3.a((String)iterator6.next(), (String)iterator6.next());
				} catch (Exception var10) {
					aG.warn("Skipping bad option: {}", new Object[]{string5});
				}
			}

			du3 = this.a(du3);

			for (String string5 : du3.c()) {
				String string6 = du3.l(string5);

				try {
					if ("mouseSensitivity".equals(string5)) {
						this.b = this.a(string6);
					}

					if ("fov".equals(string5)) {
						this.az = this.a(string6) * 40.0F + 70.0F;
					}

					if ("gamma".equals(string5)) {
						this.aA = this.a(string6);
					}

					if ("saturation".equals(string5)) {
						this.aB = this.a(string6);
					}

					if ("invertYMouse".equals(string5)) {
						this.c = "true".equals(string6);
					}

					if ("renderDistance".equals(string5)) {
						this.d = Integer.parseInt(string6);
					}

					if ("guiScale".equals(string5)) {
						this.aC = Integer.parseInt(string6);
					}

					if ("particles".equals(string5)) {
						this.aD = Integer.parseInt(string6);
					}

					if ("bobView".equals(string5)) {
						this.e = "true".equals(string6);
					}

					if ("anaglyph3d".equals(string5)) {
						this.f = "true".equals(string6);
					}

					if ("maxFps".equals(string5)) {
						this.h = Integer.parseInt(string6);
					}

					if ("fboEnable".equals(string5)) {
						this.g = "true".equals(string6);
					}

					if ("difficulty".equals(string5)) {
						this.aq = rg.a(Integer.parseInt(string6));
					}

					if ("fancyGraphics".equals(string5)) {
						this.j = "true".equals(string6);
					}

					if ("ao".equals(string5)) {
						if ("true".equals(string6)) {
							this.k = 2;
						} else if ("false".equals(string6)) {
							this.k = 0;
						} else {
							this.k = Integer.parseInt(string6);
						}
					}

					if ("renderClouds".equals(string5)) {
						if ("true".equals(string6)) {
							this.i = 2;
						} else if ("false".equals(string6)) {
							this.i = 0;
						} else if ("fast".equals(string6)) {
							this.i = 1;
						}
					}

					if ("attackIndicator".equals(string5)) {
						if ("0".equals(string6)) {
							this.N = 0;
						} else if ("1".equals(string6)) {
							this.N = 1;
						} else if ("2".equals(string6)) {
							this.N = 2;
						}
					}

					if ("resourcePacks".equals(string5)) {
						this.l = (List<String>)aH.fromJson(string6, aI);
						if (this.l == null) {
							this.l = Lists.newArrayList();
						}
					}

					if ("incompatibleResourcePacks".equals(string5)) {
						this.m = (List<String>)aH.fromJson(string6, aI);
						if (this.m == null) {
							this.m = Lists.newArrayList();
						}
					}

					if ("lastServer".equals(string5)) {
						this.aw = string6;
					}

					if ("lang".equals(string5)) {
						this.aE = string6;
					}

					if ("chatVisibility".equals(string5)) {
						this.n = aay.b.a(Integer.parseInt(string6));
					}

					if ("chatColors".equals(string5)) {
						this.o = "true".equals(string6);
					}

					if ("chatLinks".equals(string5)) {
						this.p = "true".equals(string6);
					}

					if ("chatLinksPrompt".equals(string5)) {
						this.q = "true".equals(string6);
					}

					if ("chatOpacity".equals(string5)) {
						this.r = this.a(string6);
					}

					if ("snooperEnabled".equals(string5)) {
						this.s = "true".equals(string6);
					}

					if ("fullscreen".equals(string5)) {
						this.t = "true".equals(string6);
					}

					if ("enableVsync".equals(string5)) {
						this.u = "true".equals(string6);
					}

					if ("useVbo".equals(string5)) {
						this.v = "true".equals(string6);
					}

					if ("hideServerAddress".equals(string5)) {
						this.x = "true".equals(string6);
					}

					if ("advancedItemTooltips".equals(string5)) {
						this.y = "true".equals(string6);
					}

					if ("pauseOnLostFocus".equals(string5)) {
						this.z = "true".equals(string6);
					}

					if ("touchscreen".equals(string5)) {
						this.A = "true".equals(string6);
					}

					if ("overrideHeight".equals(string5)) {
						this.D = Integer.parseInt(string6);
					}

					if ("overrideWidth".equals(string5)) {
						this.C = Integer.parseInt(string6);
					}

					if ("heldItemTooltips".equals(string5)) {
						this.E = "true".equals(string6);
					}

					if ("chatHeightFocused".equals(string5)) {
						this.I = this.a(string6);
					}

					if ("chatHeightUnfocused".equals(string5)) {
						this.H = this.a(string6);
					}

					if ("chatScale".equals(string5)) {
						this.F = this.a(string6);
					}

					if ("chatWidth".equals(string5)) {
						this.G = this.a(string6);
					}

					if ("showInventoryAchievementHint".equals(string5)) {
						this.J = "true".equals(string6);
					}

					if ("mipmapLevels".equals(string5)) {
						this.K = Integer.parseInt(string6);
					}

					if ("forceUnicodeFont".equals(string5)) {
						this.aF = "true".equals(string6);
					}

					if ("reducedDebugInfo".equals(string5)) {
						this.w = "true".equals(string6);
					}

					if ("useNativeTransport".equals(string5)) {
						this.L = "true".equals(string6);
					}

					if ("entityShadows".equals(string5)) {
						this.M = "true".equals(string6);
					}

					if ("mainHand".equals(string5)) {
						this.B = "left".equals(string6) ? sv.LEFT : sv.RIGHT;
					}

					if ("showSubtitles".equals(string5)) {
						this.P = "true".equals(string6);
					}

					if ("realmsNotifications".equals(string5)) {
						this.Q = "true".equals(string6);
					}

					if ("enableWeakAttacks".equals(string5)) {
						this.O = "true".equals(string6);
					}

					if ("autoJump".equals(string5)) {
						this.R = "true".equals(string6);
					}

					for (bep bep10 : this.ao) {
						if (string5.equals("key_" + bep10.h())) {
							bep10.b(Integer.parseInt(string6));
						}
					}

					for (no no10 : no.values()) {
						if (string5.equals("soundCategory_" + no10.a())) {
							this.aP.put(no10, this.a(string6));
						}
					}

					for (aaz aaz10 : aaz.values()) {
						if (string5.equals("modelPart_" + aaz10.c())) {
							this.a(aaz10, "true".equals(string6));
						}
					}
				} catch (Exception var11) {
					aG.warn("Skipping bad option: {}:{}", new Object[]{string5, string6});
				}
			}

			bep.c();
		} catch (Exception var12) {
			aG.error("Failed to load options", var12);
		}
	}

	private du a(du du) {
		int integer3 = 0;

		try {
			integer3 = Integer.parseInt(du.l("version"));
		} catch (RuntimeException var4) {
		}

		return this.ap.ai().a(pf.OPTIONS, du, integer3);
	}

	private float a(String string) {
		if ("true".equals(string)) {
			return 1.0F;
		} else {
			return "false".equals(string) ? 0.0F : Float.parseFloat(string);
		}
	}

	public void b() {
		PrintWriter printWriter2 = null;

		try {
			printWriter2 = new PrintWriter(new FileWriter(this.aQ));
			printWriter2.println("version:922");
			printWriter2.println("invertYMouse:" + this.c);
			printWriter2.println("mouseSensitivity:" + this.b);
			printWriter2.println("fov:" + (this.az - 70.0F) / 40.0F);
			printWriter2.println("gamma:" + this.aA);
			printWriter2.println("saturation:" + this.aB);
			printWriter2.println("renderDistance:" + this.d);
			printWriter2.println("guiScale:" + this.aC);
			printWriter2.println("particles:" + this.aD);
			printWriter2.println("bobView:" + this.e);
			printWriter2.println("anaglyph3d:" + this.f);
			printWriter2.println("maxFps:" + this.h);
			printWriter2.println("fboEnable:" + this.g);
			printWriter2.println("difficulty:" + this.aq.a());
			printWriter2.println("fancyGraphics:" + this.j);
			printWriter2.println("ao:" + this.k);
			switch (this.i) {
				case 0:
					printWriter2.println("renderClouds:false");
					break;
				case 1:
					printWriter2.println("renderClouds:fast");
					break;
				case 2:
					printWriter2.println("renderClouds:true");
			}

			printWriter2.println("resourcePacks:" + aH.toJson(this.l));
			printWriter2.println("incompatibleResourcePacks:" + aH.toJson(this.m));
			printWriter2.println("lastServer:" + this.aw);
			printWriter2.println("lang:" + this.aE);
			printWriter2.println("chatVisibility:" + this.n.a());
			printWriter2.println("chatColors:" + this.o);
			printWriter2.println("chatLinks:" + this.p);
			printWriter2.println("chatLinksPrompt:" + this.q);
			printWriter2.println("chatOpacity:" + this.r);
			printWriter2.println("snooperEnabled:" + this.s);
			printWriter2.println("fullscreen:" + this.t);
			printWriter2.println("enableVsync:" + this.u);
			printWriter2.println("useVbo:" + this.v);
			printWriter2.println("hideServerAddress:" + this.x);
			printWriter2.println("advancedItemTooltips:" + this.y);
			printWriter2.println("pauseOnLostFocus:" + this.z);
			printWriter2.println("touchscreen:" + this.A);
			printWriter2.println("overrideWidth:" + this.C);
			printWriter2.println("overrideHeight:" + this.D);
			printWriter2.println("heldItemTooltips:" + this.E);
			printWriter2.println("chatHeightFocused:" + this.I);
			printWriter2.println("chatHeightUnfocused:" + this.H);
			printWriter2.println("chatScale:" + this.F);
			printWriter2.println("chatWidth:" + this.G);
			printWriter2.println("showInventoryAchievementHint:" + this.J);
			printWriter2.println("mipmapLevels:" + this.K);
			printWriter2.println("forceUnicodeFont:" + this.aF);
			printWriter2.println("reducedDebugInfo:" + this.w);
			printWriter2.println("useNativeTransport:" + this.L);
			printWriter2.println("entityShadows:" + this.M);
			printWriter2.println("mainHand:" + (this.B == sv.LEFT ? "left" : "right"));
			printWriter2.println("attackIndicator:" + this.N);
			printWriter2.println("showSubtitles:" + this.P);
			printWriter2.println("realmsNotifications:" + this.Q);
			printWriter2.println("enableWeakAttacks:" + this.O);
			printWriter2.println("autoJump:" + this.R);

			for (bep bep6 : this.ao) {
				printWriter2.println("key_" + bep6.h() + ":" + bep6.j());
			}

			for (no no6 : no.values()) {
				printWriter2.println("soundCategory_" + no6.a() + ":" + this.a(no6));
			}

			for (aaz aaz6 : aaz.values()) {
				printWriter2.println("modelPart_" + aaz6.c() + ":" + this.aO.contains(aaz6));
			}
		} catch (Exception var9) {
			aG.error("Failed to save options", var9);
		} finally {
			IOUtils.closeQuietly(printWriter2);
		}

		this.c();
	}

	public float a(no no) {
		return this.aP.containsKey(no) ? (Float)this.aP.get(no) : 1.0F;
	}

	public void a(no no, float float2) {
		this.ap.U().a(no, float2);
		this.aP.put(no, float2);
	}

	public void c() {
		if (this.ap.h != null) {
			int integer2 = 0;

			for (aaz aaz4 : this.aO) {
				integer2 |= aaz4.a();
			}

			this.ap.h.d.a(new ir(this.aE, this.d, this.n, this.o, integer2, this.B));
		}
	}

	public Set<aaz> d() {
		return ImmutableSet.copyOf(this.aO);
	}

	public void a(aaz aaz, boolean boolean2) {
		if (boolean2) {
			this.aO.add(aaz);
		} else {
			this.aO.remove(aaz);
		}

		this.c();
	}

	public void a(aaz aaz) {
		if (this.d().contains(aaz)) {
			this.aO.remove(aaz);
		} else {
			this.aO.add(aaz);
		}

		this.c();
	}

	public int e() {
		return this.d >= 4 ? this.i : 0;
	}

	public boolean f() {
		return this.L;
	}

	public static enum a {
		INVERT_MOUSE("options.invertMouse", false, true),
		SENSITIVITY("options.sensitivity", true, false),
		FOV("options.fov", true, false, 30.0F, 110.0F, 1.0F),
		GAMMA("options.gamma", true, false),
		SATURATION("options.saturation", true, false),
		RENDER_DISTANCE("options.renderDistance", true, false, 2.0F, 16.0F, 1.0F),
		VIEW_BOBBING("options.viewBobbing", false, true),
		ANAGLYPH("options.anaglyph", false, true),
		FRAMERATE_LIMIT("options.framerateLimit", true, false, 10.0F, 260.0F, 10.0F),
		FBO_ENABLE("options.fboEnable", false, true),
		RENDER_CLOUDS("options.renderClouds", false, false),
		GRAPHICS("options.graphics", false, false),
		AMBIENT_OCCLUSION("options.ao", false, false),
		GUI_SCALE("options.guiScale", false, false),
		PARTICLES("options.particles", false, false),
		CHAT_VISIBILITY("options.chat.visibility", false, false),
		CHAT_COLOR("options.chat.color", false, true),
		CHAT_LINKS("options.chat.links", false, true),
		CHAT_OPACITY("options.chat.opacity", true, false),
		CHAT_LINKS_PROMPT("options.chat.links.prompt", false, true),
		SNOOPER_ENABLED("options.snooper", false, true),
		USE_FULLSCREEN("options.fullscreen", false, true),
		ENABLE_VSYNC("options.vsync", false, true),
		USE_VBO("options.vbo", false, true),
		TOUCHSCREEN("options.touchscreen", false, true),
		CHAT_SCALE("options.chat.scale", true, false),
		CHAT_WIDTH("options.chat.width", true, false),
		CHAT_HEIGHT_FOCUSED("options.chat.height.focused", true, false),
		CHAT_HEIGHT_UNFOCUSED("options.chat.height.unfocused", true, false),
		MIPMAP_LEVELS("options.mipmapLevels", true, false, 0.0F, 4.0F, 1.0F),
		FORCE_UNICODE_FONT("options.forceUnicodeFont", false, true),
		REDUCED_DEBUG_INFO("options.reducedDebugInfo", false, true),
		ENTITY_SHADOWS("options.entityShadows", false, true),
		MAIN_HAND("options.mainHand", false, false),
		ATTACK_INDICATOR("options.attackIndicator", false, false),
		ENABLE_WEAK_ATTACKS("options.enableWeakAttacks", false, true),
		SHOW_SUBTITLES("options.showSubtitles", false, true),
		REALMS_NOTIFICATIONS("options.realmsNotifications", false, true),
		AUTO_JUMP("options.autoJump", false, true);

		private final boolean N;
		private final boolean O;
		private final String P;
		private final float Q;
		private float R;
		private float S;

		public static beu.a a(int integer) {
			for (beu.a a5 : values()) {
				if (a5.c() == integer) {
					return a5;
				}
			}

			return null;
		}

		private a(String string3, boolean boolean4, boolean boolean5) {
			this(string3, boolean4, boolean5, 0.0F, 1.0F, 0.0F);
		}

		private a(String string3, boolean boolean4, boolean boolean5, float float6, float float7, float float8) {
			this.P = string3;
			this.N = boolean4;
			this.O = boolean5;
			this.R = float6;
			this.S = float7;
			this.Q = float8;
		}

		public boolean a() {
			return this.N;
		}

		public boolean b() {
			return this.O;
		}

		public int c() {
			return this.ordinal();
		}

		public String d() {
			return this.P;
		}

		public float e() {
			return this.R;
		}

		public float f() {
			return this.S;
		}

		public void a(float float1) {
			this.S = float1;
		}

		public float c(float float1) {
			return ot.a((this.e(float1) - this.R) / (this.S - this.R), 0.0F, 1.0F);
		}

		public float d(float float1) {
			return this.e(this.R + (this.S - this.R) * ot.a(float1, 0.0F, 1.0F));
		}

		public float e(float float1) {
			float1 = this.f(float1);
			return ot.a(float1, this.R, this.S);
		}

		private float f(float float1) {
			if (this.Q > 0.0F) {
				float1 = this.Q * (float)Math.round(float1 / this.Q);
			}

			return float1;
		}
	}
}
