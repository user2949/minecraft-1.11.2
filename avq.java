import com.google.common.annotations.VisibleForTesting;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class avq {
	public final float a;
	public final float b;
	public final float c;
	public final float d;
	public final float e;
	public final float f;
	public final float g;
	public final float h;
	public final float i;
	public final float j;
	public final float k;
	public final float l;
	public final float m;
	public final float n;
	public final float o;
	public final float p;
	public final int q;
	public final boolean r;
	public final boolean s;
	public final int t;
	public final boolean u;
	public final boolean v;
	public final boolean w;
	public final boolean x;
	public final boolean y;
	public final boolean z;
	public final boolean A;
	public final boolean B;
	public final int C;
	public final boolean D;
	public final int E;
	public final boolean F;
	public final int G;
	public final int H;
	public final int I;
	public final int J;
	public final int K;
	public final int L;
	public final int M;
	public final int N;
	public final int O;
	public final int P;
	public final int Q;
	public final int R;
	public final int S;
	public final int T;
	public final int U;
	public final int V;
	public final int W;
	public final int X;
	public final int Y;
	public final int Z;
	public final int aa;
	public final int ab;
	public final int ac;
	public final int ad;
	public final int ae;
	public final int af;
	public final int ag;
	public final int ah;
	public final int ai;
	public final int aj;
	public final int ak;
	public final int al;
	public final int am;
	public final int an;
	public final int ao;
	public final int ap;
	public final int aq;
	public final int ar;
	public final int as;
	public final int at;
	public final int au;
	public final int av;
	public final int aw;
	public final int ax;
	public final int ay;
	public final int az;
	public final int aA;

	private avq(avq.a a) {
		this.a = a.b;
		this.b = a.c;
		this.c = a.d;
		this.d = a.e;
		this.e = a.f;
		this.f = a.g;
		this.g = a.h;
		this.h = a.i;
		this.i = a.j;
		this.j = a.k;
		this.k = a.l;
		this.l = a.m;
		this.m = a.n;
		this.n = a.o;
		this.o = a.p;
		this.p = a.q;
		this.q = a.r;
		this.r = a.s;
		this.s = a.t;
		this.t = a.u;
		this.u = a.v;
		this.v = a.w;
		this.w = a.x;
		this.x = a.y;
		this.y = a.z;
		this.z = a.A;
		this.A = a.B;
		this.B = a.C;
		this.C = a.D;
		this.D = a.E;
		this.E = a.F;
		this.F = a.G;
		this.G = a.H;
		this.H = a.I;
		this.I = a.J;
		this.J = a.K;
		this.K = a.L;
		this.L = a.M;
		this.M = a.N;
		this.N = a.O;
		this.O = a.P;
		this.P = a.Q;
		this.Q = a.R;
		this.R = a.S;
		this.S = a.T;
		this.T = a.U;
		this.U = a.V;
		this.V = a.W;
		this.W = a.X;
		this.X = a.Y;
		this.Y = a.Z;
		this.Z = a.aa;
		this.aa = a.ab;
		this.ab = a.ac;
		this.ac = a.ad;
		this.ad = a.ae;
		this.ae = a.af;
		this.af = a.ag;
		this.ag = a.ah;
		this.ah = a.ai;
		this.ai = a.aj;
		this.aj = a.ak;
		this.ak = a.al;
		this.al = a.am;
		this.am = a.an;
		this.an = a.ao;
		this.ao = a.ap;
		this.ap = a.aq;
		this.aq = a.ar;
		this.ar = a.as;
		this.as = a.at;
		this.at = a.au;
		this.au = a.av;
		this.av = a.aw;
		this.aw = a.ax;
		this.ax = a.ay;
		this.ay = a.az;
		this.az = a.aA;
		this.aA = a.aB;
	}

	public static class a {
		@VisibleForTesting
		static final Gson a = new GsonBuilder().registerTypeAdapter(avq.a.class, new avq.b()).create();
		public float b = 684.412F;
		public float c = 684.412F;
		public float d = 512.0F;
		public float e = 512.0F;
		public float f = 200.0F;
		public float g = 200.0F;
		public float h = 0.5F;
		public float i = 80.0F;
		public float j = 160.0F;
		public float k = 80.0F;
		public float l = 8.5F;
		public float m = 12.0F;
		public float n = 1.0F;
		public float o;
		public float p = 1.0F;
		public float q;
		public int r = 63;
		public boolean s = true;
		public boolean t = true;
		public int u = 8;
		public boolean v = true;
		public boolean w = true;
		public boolean x = true;
		public boolean y = true;
		public boolean z = true;
		public boolean A = true;
		public boolean B = true;
		public boolean C = true;
		public int D = 4;
		public boolean E = true;
		public int F = 80;
		public boolean G;
		public int H = -1;
		public int I = 4;
		public int J = 4;
		public int K = 33;
		public int L = 10;
		public int M;
		public int N = 256;
		public int O = 33;
		public int P = 8;
		public int Q;
		public int R = 256;
		public int S = 33;
		public int T = 10;
		public int U;
		public int V = 80;
		public int W = 33;
		public int X = 10;
		public int Y;
		public int Z = 80;
		public int aa = 33;
		public int ab = 10;
		public int ac;
		public int ad = 80;
		public int ae = 17;
		public int af = 20;
		public int ag;
		public int ah = 128;
		public int ai = 9;
		public int aj = 20;
		public int ak;
		public int al = 64;
		public int am = 9;
		public int an = 2;
		public int ao;
		public int ap = 32;
		public int aq = 8;
		public int ar = 8;
		public int as;
		public int at = 16;
		public int au = 8;
		public int av = 1;
		public int aw;
		public int ax = 16;
		public int ay = 7;
		public int az = 1;
		public int aA = 16;
		public int aB = 16;

		public static avq.a a(String string) {
			if (string.isEmpty()) {
				return new avq.a();
			} else {
				try {
					return ok.a(a, string, avq.a.class);
				} catch (Exception var2) {
					return new avq.a();
				}
			}
		}

		public String toString() {
			return a.toJson(this);
		}

		public a() {
			this.a();
		}

		public void a() {
			this.b = 684.412F;
			this.c = 684.412F;
			this.d = 512.0F;
			this.e = 512.0F;
			this.f = 200.0F;
			this.g = 200.0F;
			this.h = 0.5F;
			this.i = 80.0F;
			this.j = 160.0F;
			this.k = 80.0F;
			this.l = 8.5F;
			this.m = 12.0F;
			this.n = 1.0F;
			this.o = 0.0F;
			this.p = 1.0F;
			this.q = 0.0F;
			this.r = 63;
			this.s = true;
			this.t = true;
			this.u = 8;
			this.v = true;
			this.w = true;
			this.x = true;
			this.y = true;
			this.z = true;
			this.A = true;
			this.B = true;
			this.C = true;
			this.D = 4;
			this.E = true;
			this.F = 80;
			this.G = false;
			this.H = -1;
			this.I = 4;
			this.J = 4;
			this.K = 33;
			this.L = 10;
			this.M = 0;
			this.N = 256;
			this.O = 33;
			this.P = 8;
			this.Q = 0;
			this.R = 256;
			this.S = 33;
			this.T = 10;
			this.U = 0;
			this.V = 80;
			this.W = 33;
			this.X = 10;
			this.Y = 0;
			this.Z = 80;
			this.aa = 33;
			this.ab = 10;
			this.ac = 0;
			this.ad = 80;
			this.ae = 17;
			this.af = 20;
			this.ag = 0;
			this.ah = 128;
			this.ai = 9;
			this.aj = 20;
			this.ak = 0;
			this.al = 64;
			this.am = 9;
			this.an = 2;
			this.ao = 0;
			this.ap = 32;
			this.aq = 8;
			this.ar = 8;
			this.as = 0;
			this.at = 16;
			this.au = 8;
			this.av = 1;
			this.aw = 0;
			this.ax = 16;
			this.ay = 7;
			this.az = 1;
			this.aA = 16;
			this.aB = 16;
		}

		public boolean equals(Object object) {
			if (this == object) {
				return true;
			} else if (object != null && this.getClass() == object.getClass()) {
				avq.a a3 = (avq.a)object;
				if (this.ab != a3.ab) {
					return false;
				} else if (this.ad != a3.ad) {
					return false;
				} else if (this.ac != a3.ac) {
					return false;
				} else if (this.aa != a3.aa) {
					return false;
				} else if (Float.compare(a3.l, this.l) != 0) {
					return false;
				} else if (Float.compare(a3.o, this.o) != 0) {
					return false;
				} else if (Float.compare(a3.n, this.n) != 0) {
					return false;
				} else if (Float.compare(a3.q, this.q) != 0) {
					return false;
				} else if (Float.compare(a3.p, this.p) != 0) {
					return false;
				} else if (this.I != a3.I) {
					return false;
				} else if (this.af != a3.af) {
					return false;
				} else if (this.ah != a3.ah) {
					return false;
				} else if (this.ag != a3.ag) {
					return false;
				} else if (this.ae != a3.ae) {
					return false;
				} else if (Float.compare(a3.b, this.b) != 0) {
					return false;
				} else if (Float.compare(a3.h, this.h) != 0) {
					return false;
				} else if (Float.compare(a3.f, this.f) != 0) {
					return false;
				} else if (Float.compare(a3.g, this.g) != 0) {
					return false;
				} else if (this.av != a3.av) {
					return false;
				} else if (this.ax != a3.ax) {
					return false;
				} else if (this.aw != a3.aw) {
					return false;
				} else if (this.au != a3.au) {
					return false;
				} else if (this.X != a3.X) {
					return false;
				} else if (this.Z != a3.Z) {
					return false;
				} else if (this.Y != a3.Y) {
					return false;
				} else if (this.W != a3.W) {
					return false;
				} else if (this.L != a3.L) {
					return false;
				} else if (this.N != a3.N) {
					return false;
				} else if (this.M != a3.M) {
					return false;
				} else if (this.K != a3.K) {
					return false;
				} else if (this.u != a3.u) {
					return false;
				} else if (this.H != a3.H) {
					return false;
				} else if (this.an != a3.an) {
					return false;
				} else if (this.ap != a3.ap) {
					return false;
				} else if (this.ao != a3.ao) {
					return false;
				} else if (this.am != a3.am) {
					return false;
				} else if (this.T != a3.T) {
					return false;
				} else if (this.V != a3.V) {
					return false;
				} else if (this.U != a3.U) {
					return false;
				} else if (this.S != a3.S) {
					return false;
				} else if (this.P != a3.P) {
					return false;
				} else if (this.R != a3.R) {
					return false;
				} else if (this.Q != a3.Q) {
					return false;
				} else if (this.O != a3.O) {
					return false;
				} else if (Float.compare(a3.c, this.c) != 0) {
					return false;
				} else if (this.aj != a3.aj) {
					return false;
				} else if (this.al != a3.al) {
					return false;
				} else if (this.ak != a3.ak) {
					return false;
				} else if (this.ai != a3.ai) {
					return false;
				} else if (this.aA != a3.aA) {
					return false;
				} else if (this.az != a3.az) {
					return false;
				} else if (this.ay != a3.ay) {
					return false;
				} else if (this.aB != a3.aB) {
					return false;
				} else if (this.F != a3.F) {
					return false;
				} else if (Float.compare(a3.e, this.e) != 0) {
					return false;
				} else if (Float.compare(a3.i, this.i) != 0) {
					return false;
				} else if (Float.compare(a3.j, this.j) != 0) {
					return false;
				} else if (Float.compare(a3.k, this.k) != 0) {
					return false;
				} else if (this.ar != a3.ar) {
					return false;
				} else if (this.at != a3.at) {
					return false;
				} else if (this.as != a3.as) {
					return false;
				} else if (this.aq != a3.aq) {
					return false;
				} else if (this.J != a3.J) {
					return false;
				} else if (this.r != a3.r) {
					return false;
				} else if (Float.compare(a3.m, this.m) != 0) {
					return false;
				} else if (Float.compare(a3.d, this.d) != 0) {
					return false;
				} else if (this.s != a3.s) {
					return false;
				} else if (this.t != a3.t) {
					return false;
				} else if (this.E != a3.E) {
					return false;
				} else if (this.G != a3.G) {
					return false;
				} else if (this.x != a3.x) {
					return false;
				} else if (this.B != a3.B) {
					return false;
				} else if (this.v != a3.v) {
					return false;
				} else if (this.y != a3.y) {
					return false;
				} else if (this.z != a3.z) {
					return false;
				} else if (this.A != a3.A) {
					return false;
				} else if (this.w != a3.w) {
					return false;
				} else {
					return this.C != a3.C ? false : this.D == a3.D;
				}
			} else {
				return false;
			}
		}

		public int hashCode() {
			int integer2 = this.b == 0.0F ? 0 : Float.floatToIntBits(this.b);
			integer2 = 31 * integer2 + (this.c == 0.0F ? 0 : Float.floatToIntBits(this.c));
			integer2 = 31 * integer2 + (this.d == 0.0F ? 0 : Float.floatToIntBits(this.d));
			integer2 = 31 * integer2 + (this.e == 0.0F ? 0 : Float.floatToIntBits(this.e));
			integer2 = 31 * integer2 + (this.f == 0.0F ? 0 : Float.floatToIntBits(this.f));
			integer2 = 31 * integer2 + (this.g == 0.0F ? 0 : Float.floatToIntBits(this.g));
			integer2 = 31 * integer2 + (this.h == 0.0F ? 0 : Float.floatToIntBits(this.h));
			integer2 = 31 * integer2 + (this.i == 0.0F ? 0 : Float.floatToIntBits(this.i));
			integer2 = 31 * integer2 + (this.j == 0.0F ? 0 : Float.floatToIntBits(this.j));
			integer2 = 31 * integer2 + (this.k == 0.0F ? 0 : Float.floatToIntBits(this.k));
			integer2 = 31 * integer2 + (this.l == 0.0F ? 0 : Float.floatToIntBits(this.l));
			integer2 = 31 * integer2 + (this.m == 0.0F ? 0 : Float.floatToIntBits(this.m));
			integer2 = 31 * integer2 + (this.n == 0.0F ? 0 : Float.floatToIntBits(this.n));
			integer2 = 31 * integer2 + (this.o == 0.0F ? 0 : Float.floatToIntBits(this.o));
			integer2 = 31 * integer2 + (this.p == 0.0F ? 0 : Float.floatToIntBits(this.p));
			integer2 = 31 * integer2 + (this.q == 0.0F ? 0 : Float.floatToIntBits(this.q));
			integer2 = 31 * integer2 + this.r;
			integer2 = 31 * integer2 + (this.s ? 1 : 0);
			integer2 = 31 * integer2 + (this.t ? 1 : 0);
			integer2 = 31 * integer2 + this.u;
			integer2 = 31 * integer2 + (this.v ? 1 : 0);
			integer2 = 31 * integer2 + (this.w ? 1 : 0);
			integer2 = 31 * integer2 + (this.x ? 1 : 0);
			integer2 = 31 * integer2 + (this.y ? 1 : 0);
			integer2 = 31 * integer2 + (this.z ? 1 : 0);
			integer2 = 31 * integer2 + (this.A ? 1 : 0);
			integer2 = 31 * integer2 + (this.B ? 1 : 0);
			integer2 = 31 * integer2 + (this.C ? 1 : 0);
			integer2 = 31 * integer2 + this.D;
			integer2 = 31 * integer2 + (this.E ? 1 : 0);
			integer2 = 31 * integer2 + this.F;
			integer2 = 31 * integer2 + (this.G ? 1 : 0);
			integer2 = 31 * integer2 + this.H;
			integer2 = 31 * integer2 + this.I;
			integer2 = 31 * integer2 + this.J;
			integer2 = 31 * integer2 + this.K;
			integer2 = 31 * integer2 + this.L;
			integer2 = 31 * integer2 + this.M;
			integer2 = 31 * integer2 + this.N;
			integer2 = 31 * integer2 + this.O;
			integer2 = 31 * integer2 + this.P;
			integer2 = 31 * integer2 + this.Q;
			integer2 = 31 * integer2 + this.R;
			integer2 = 31 * integer2 + this.S;
			integer2 = 31 * integer2 + this.T;
			integer2 = 31 * integer2 + this.U;
			integer2 = 31 * integer2 + this.V;
			integer2 = 31 * integer2 + this.W;
			integer2 = 31 * integer2 + this.X;
			integer2 = 31 * integer2 + this.Y;
			integer2 = 31 * integer2 + this.Z;
			integer2 = 31 * integer2 + this.aa;
			integer2 = 31 * integer2 + this.ab;
			integer2 = 31 * integer2 + this.ac;
			integer2 = 31 * integer2 + this.ad;
			integer2 = 31 * integer2 + this.ae;
			integer2 = 31 * integer2 + this.af;
			integer2 = 31 * integer2 + this.ag;
			integer2 = 31 * integer2 + this.ah;
			integer2 = 31 * integer2 + this.ai;
			integer2 = 31 * integer2 + this.aj;
			integer2 = 31 * integer2 + this.ak;
			integer2 = 31 * integer2 + this.al;
			integer2 = 31 * integer2 + this.am;
			integer2 = 31 * integer2 + this.an;
			integer2 = 31 * integer2 + this.ao;
			integer2 = 31 * integer2 + this.ap;
			integer2 = 31 * integer2 + this.aq;
			integer2 = 31 * integer2 + this.ar;
			integer2 = 31 * integer2 + this.as;
			integer2 = 31 * integer2 + this.at;
			integer2 = 31 * integer2 + this.au;
			integer2 = 31 * integer2 + this.av;
			integer2 = 31 * integer2 + this.aw;
			integer2 = 31 * integer2 + this.ax;
			integer2 = 31 * integer2 + this.ay;
			integer2 = 31 * integer2 + this.az;
			integer2 = 31 * integer2 + this.aA;
			return 31 * integer2 + this.aB;
		}

		public avq b() {
			return new avq(this);
		}
	}

	public static class b implements JsonDeserializer<avq.a>, JsonSerializer<avq.a> {
		public avq.a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = jsonElement.getAsJsonObject();
			avq.a a6 = new avq.a();

			try {
				a6.b = ok.a(jsonObject5, "coordinateScale", a6.b);
				a6.c = ok.a(jsonObject5, "heightScale", a6.c);
				a6.e = ok.a(jsonObject5, "lowerLimitScale", a6.e);
				a6.d = ok.a(jsonObject5, "upperLimitScale", a6.d);
				a6.f = ok.a(jsonObject5, "depthNoiseScaleX", a6.f);
				a6.g = ok.a(jsonObject5, "depthNoiseScaleZ", a6.g);
				a6.h = ok.a(jsonObject5, "depthNoiseScaleExponent", a6.h);
				a6.i = ok.a(jsonObject5, "mainNoiseScaleX", a6.i);
				a6.j = ok.a(jsonObject5, "mainNoiseScaleY", a6.j);
				a6.k = ok.a(jsonObject5, "mainNoiseScaleZ", a6.k);
				a6.l = ok.a(jsonObject5, "baseSize", a6.l);
				a6.m = ok.a(jsonObject5, "stretchY", a6.m);
				a6.n = ok.a(jsonObject5, "biomeDepthWeight", a6.n);
				a6.o = ok.a(jsonObject5, "biomeDepthOffset", a6.o);
				a6.p = ok.a(jsonObject5, "biomeScaleWeight", a6.p);
				a6.q = ok.a(jsonObject5, "biomeScaleOffset", a6.q);
				a6.r = ok.a(jsonObject5, "seaLevel", a6.r);
				a6.s = ok.a(jsonObject5, "useCaves", a6.s);
				a6.t = ok.a(jsonObject5, "useDungeons", a6.t);
				a6.u = ok.a(jsonObject5, "dungeonChance", a6.u);
				a6.v = ok.a(jsonObject5, "useStrongholds", a6.v);
				a6.w = ok.a(jsonObject5, "useVillages", a6.w);
				a6.x = ok.a(jsonObject5, "useMineShafts", a6.x);
				a6.y = ok.a(jsonObject5, "useTemples", a6.y);
				a6.z = ok.a(jsonObject5, "useMonuments", a6.z);
				a6.A = ok.a(jsonObject5, "useMansions", a6.A);
				a6.B = ok.a(jsonObject5, "useRavines", a6.B);
				a6.C = ok.a(jsonObject5, "useWaterLakes", a6.C);
				a6.D = ok.a(jsonObject5, "waterLakeChance", a6.D);
				a6.E = ok.a(jsonObject5, "useLavaLakes", a6.E);
				a6.F = ok.a(jsonObject5, "lavaLakeChance", a6.F);
				a6.G = ok.a(jsonObject5, "useLavaOceans", a6.G);
				a6.H = ok.a(jsonObject5, "fixedBiome", a6.H);
				if (a6.H < 38 && a6.H >= -1) {
					if (a6.H >= akf.a(akk.j)) {
						a6.H += 2;
					}
				} else {
					a6.H = -1;
				}

				a6.I = ok.a(jsonObject5, "biomeSize", a6.I);
				a6.J = ok.a(jsonObject5, "riverSize", a6.J);
				a6.K = ok.a(jsonObject5, "dirtSize", a6.K);
				a6.L = ok.a(jsonObject5, "dirtCount", a6.L);
				a6.M = ok.a(jsonObject5, "dirtMinHeight", a6.M);
				a6.N = ok.a(jsonObject5, "dirtMaxHeight", a6.N);
				a6.O = ok.a(jsonObject5, "gravelSize", a6.O);
				a6.P = ok.a(jsonObject5, "gravelCount", a6.P);
				a6.Q = ok.a(jsonObject5, "gravelMinHeight", a6.Q);
				a6.R = ok.a(jsonObject5, "gravelMaxHeight", a6.R);
				a6.S = ok.a(jsonObject5, "graniteSize", a6.S);
				a6.T = ok.a(jsonObject5, "graniteCount", a6.T);
				a6.U = ok.a(jsonObject5, "graniteMinHeight", a6.U);
				a6.V = ok.a(jsonObject5, "graniteMaxHeight", a6.V);
				a6.W = ok.a(jsonObject5, "dioriteSize", a6.W);
				a6.X = ok.a(jsonObject5, "dioriteCount", a6.X);
				a6.Y = ok.a(jsonObject5, "dioriteMinHeight", a6.Y);
				a6.Z = ok.a(jsonObject5, "dioriteMaxHeight", a6.Z);
				a6.aa = ok.a(jsonObject5, "andesiteSize", a6.aa);
				a6.ab = ok.a(jsonObject5, "andesiteCount", a6.ab);
				a6.ac = ok.a(jsonObject5, "andesiteMinHeight", a6.ac);
				a6.ad = ok.a(jsonObject5, "andesiteMaxHeight", a6.ad);
				a6.ae = ok.a(jsonObject5, "coalSize", a6.ae);
				a6.af = ok.a(jsonObject5, "coalCount", a6.af);
				a6.ag = ok.a(jsonObject5, "coalMinHeight", a6.ag);
				a6.ah = ok.a(jsonObject5, "coalMaxHeight", a6.ah);
				a6.ai = ok.a(jsonObject5, "ironSize", a6.ai);
				a6.aj = ok.a(jsonObject5, "ironCount", a6.aj);
				a6.ak = ok.a(jsonObject5, "ironMinHeight", a6.ak);
				a6.al = ok.a(jsonObject5, "ironMaxHeight", a6.al);
				a6.am = ok.a(jsonObject5, "goldSize", a6.am);
				a6.an = ok.a(jsonObject5, "goldCount", a6.an);
				a6.ao = ok.a(jsonObject5, "goldMinHeight", a6.ao);
				a6.ap = ok.a(jsonObject5, "goldMaxHeight", a6.ap);
				a6.aq = ok.a(jsonObject5, "redstoneSize", a6.aq);
				a6.ar = ok.a(jsonObject5, "redstoneCount", a6.ar);
				a6.as = ok.a(jsonObject5, "redstoneMinHeight", a6.as);
				a6.at = ok.a(jsonObject5, "redstoneMaxHeight", a6.at);
				a6.au = ok.a(jsonObject5, "diamondSize", a6.au);
				a6.av = ok.a(jsonObject5, "diamondCount", a6.av);
				a6.aw = ok.a(jsonObject5, "diamondMinHeight", a6.aw);
				a6.ax = ok.a(jsonObject5, "diamondMaxHeight", a6.ax);
				a6.ay = ok.a(jsonObject5, "lapisSize", a6.ay);
				a6.az = ok.a(jsonObject5, "lapisCount", a6.az);
				a6.aA = ok.a(jsonObject5, "lapisCenterHeight", a6.aA);
				a6.aB = ok.a(jsonObject5, "lapisSpread", a6.aB);
			} catch (Exception var7) {
			}

			return a6;
		}

		public JsonElement serialize(avq.a a, Type type, JsonSerializationContext jsonSerializationContext) {
			JsonObject jsonObject5 = new JsonObject();
			jsonObject5.addProperty("coordinateScale", a.b);
			jsonObject5.addProperty("heightScale", a.c);
			jsonObject5.addProperty("lowerLimitScale", a.e);
			jsonObject5.addProperty("upperLimitScale", a.d);
			jsonObject5.addProperty("depthNoiseScaleX", a.f);
			jsonObject5.addProperty("depthNoiseScaleZ", a.g);
			jsonObject5.addProperty("depthNoiseScaleExponent", a.h);
			jsonObject5.addProperty("mainNoiseScaleX", a.i);
			jsonObject5.addProperty("mainNoiseScaleY", a.j);
			jsonObject5.addProperty("mainNoiseScaleZ", a.k);
			jsonObject5.addProperty("baseSize", a.l);
			jsonObject5.addProperty("stretchY", a.m);
			jsonObject5.addProperty("biomeDepthWeight", a.n);
			jsonObject5.addProperty("biomeDepthOffset", a.o);
			jsonObject5.addProperty("biomeScaleWeight", a.p);
			jsonObject5.addProperty("biomeScaleOffset", a.q);
			jsonObject5.addProperty("seaLevel", a.r);
			jsonObject5.addProperty("useCaves", a.s);
			jsonObject5.addProperty("useDungeons", a.t);
			jsonObject5.addProperty("dungeonChance", a.u);
			jsonObject5.addProperty("useStrongholds", a.v);
			jsonObject5.addProperty("useVillages", a.w);
			jsonObject5.addProperty("useMineShafts", a.x);
			jsonObject5.addProperty("useTemples", a.y);
			jsonObject5.addProperty("useMonuments", a.z);
			jsonObject5.addProperty("useMansions", a.A);
			jsonObject5.addProperty("useRavines", a.B);
			jsonObject5.addProperty("useWaterLakes", a.C);
			jsonObject5.addProperty("waterLakeChance", a.D);
			jsonObject5.addProperty("useLavaLakes", a.E);
			jsonObject5.addProperty("lavaLakeChance", a.F);
			jsonObject5.addProperty("useLavaOceans", a.G);
			jsonObject5.addProperty("fixedBiome", a.H);
			jsonObject5.addProperty("biomeSize", a.I);
			jsonObject5.addProperty("riverSize", a.J);
			jsonObject5.addProperty("dirtSize", a.K);
			jsonObject5.addProperty("dirtCount", a.L);
			jsonObject5.addProperty("dirtMinHeight", a.M);
			jsonObject5.addProperty("dirtMaxHeight", a.N);
			jsonObject5.addProperty("gravelSize", a.O);
			jsonObject5.addProperty("gravelCount", a.P);
			jsonObject5.addProperty("gravelMinHeight", a.Q);
			jsonObject5.addProperty("gravelMaxHeight", a.R);
			jsonObject5.addProperty("graniteSize", a.S);
			jsonObject5.addProperty("graniteCount", a.T);
			jsonObject5.addProperty("graniteMinHeight", a.U);
			jsonObject5.addProperty("graniteMaxHeight", a.V);
			jsonObject5.addProperty("dioriteSize", a.W);
			jsonObject5.addProperty("dioriteCount", a.X);
			jsonObject5.addProperty("dioriteMinHeight", a.Y);
			jsonObject5.addProperty("dioriteMaxHeight", a.Z);
			jsonObject5.addProperty("andesiteSize", a.aa);
			jsonObject5.addProperty("andesiteCount", a.ab);
			jsonObject5.addProperty("andesiteMinHeight", a.ac);
			jsonObject5.addProperty("andesiteMaxHeight", a.ad);
			jsonObject5.addProperty("coalSize", a.ae);
			jsonObject5.addProperty("coalCount", a.af);
			jsonObject5.addProperty("coalMinHeight", a.ag);
			jsonObject5.addProperty("coalMaxHeight", a.ah);
			jsonObject5.addProperty("ironSize", a.ai);
			jsonObject5.addProperty("ironCount", a.aj);
			jsonObject5.addProperty("ironMinHeight", a.ak);
			jsonObject5.addProperty("ironMaxHeight", a.al);
			jsonObject5.addProperty("goldSize", a.am);
			jsonObject5.addProperty("goldCount", a.an);
			jsonObject5.addProperty("goldMinHeight", a.ao);
			jsonObject5.addProperty("goldMaxHeight", a.ap);
			jsonObject5.addProperty("redstoneSize", a.aq);
			jsonObject5.addProperty("redstoneCount", a.ar);
			jsonObject5.addProperty("redstoneMinHeight", a.as);
			jsonObject5.addProperty("redstoneMaxHeight", a.at);
			jsonObject5.addProperty("diamondSize", a.au);
			jsonObject5.addProperty("diamondCount", a.av);
			jsonObject5.addProperty("diamondMinHeight", a.aw);
			jsonObject5.addProperty("diamondMaxHeight", a.ax);
			jsonObject5.addProperty("lapisSize", a.ay);
			jsonObject5.addProperty("lapisCount", a.az);
			jsonObject5.addProperty("lapisCenterHeight", a.aA);
			jsonObject5.addProperty("lapisSpread", a.aB);
			return jsonObject5;
		}
	}
}
