import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bbn extends bbl {
	public int b;
	public int c;
	public byte d;
	public boolean e;
	public boolean f;
	public byte g;
	public byte[] h = new byte[16384];
	public List<bbn.a> i = Lists.newArrayList();
	private final Map<aay, bbn.a> k = Maps.newHashMap();
	public Map<String, bbm> j = Maps.newLinkedHashMap();

	public bbn(String string) {
		super(string);
	}

	public void a(double double1, double double2, int integer) {
		int integer7 = 128 * (1 << integer);
		int integer8 = ot.c((double1 + 64.0) / (double)integer7);
		int integer9 = ot.c((double2 + 64.0) / (double)integer7);
		this.b = integer8 * integer7 + integer7 / 2 - 64;
		this.c = integer9 * integer7 + integer7 / 2 - 64;
	}

	@Override
	public void a(du du) {
		this.d = du.f("dimension");
		this.b = du.h("xCenter");
		this.c = du.h("zCenter");
		this.g = du.f("scale");
		this.g = (byte)ot.a(this.g, 0, 4);
		if (du.b("trackingPosition", 1)) {
			this.e = du.p("trackingPosition");
		} else {
			this.e = true;
		}

		this.f = du.p("unlimitedTracking");
		int integer3 = du.g("width");
		int integer4 = du.g("height");
		if (integer3 == 128 && integer4 == 128) {
			this.h = du.m("colors");
		} else {
			byte[] arr5 = du.m("colors");
			this.h = new byte[16384];
			int integer6 = (128 - integer3) / 2;
			int integer7 = (128 - integer4) / 2;

			for (int integer8 = 0; integer8 < integer4; integer8++) {
				int integer9 = integer8 + integer7;
				if (integer9 >= 0 || integer9 < 128) {
					for (int integer10 = 0; integer10 < integer3; integer10++) {
						int integer11 = integer10 + integer6;
						if (integer11 >= 0 || integer11 < 128) {
							this.h[integer11 + integer9 * 128] = arr5[integer10 + integer8 * integer3];
						}
					}
				}
			}
		}
	}

	@Override
	public du b(du du) {
		du.a("dimension", this.d);
		du.a("xCenter", this.b);
		du.a("zCenter", this.c);
		du.a("scale", this.g);
		du.a("width", (short)128);
		du.a("height", (short)128);
		du.a("colors", this.h);
		du.a("trackingPosition", this.e);
		du.a("unlimitedTracking", this.f);
		return du;
	}

	public void a(aay aay, afj afj) {
		if (!this.k.containsKey(aay)) {
			bbn.a a4 = new bbn.a(aay);
			this.k.put(aay, a4);
			this.i.add(a4);
		}

		if (!aay.bs.f(afj)) {
			this.j.remove(aay.h_());
		}

		for (int integer4 = 0; integer4 < this.i.size(); integer4++) {
			bbn.a a5 = (bbn.a)this.i.get(integer4);
			if (!a5.a.F && (a5.a.bs.f(afj) || afj.z())) {
				if (!afj.z() && a5.a.am == this.d && this.e) {
					this.a(bbm.a.PLAYER, a5.a.l, a5.a.h_(), a5.a.p, a5.a.r, (double)a5.a.v);
				}
			} else {
				this.k.remove(a5.a);
				this.i.remove(a5);
			}
		}

		if (afj.z() && this.e) {
			yz yz4 = afj.A();
			co co5 = yz4.q();
			this.a(bbm.a.FRAME, aay.l, "frame-" + yz4.O(), (double)co5.p(), (double)co5.r(), (double)(yz4.b.b() * 90));
		}

		if (afj.o() && afj.p().b("Decorations", 9)) {
			ea ea4 = afj.p().c("Decorations", 10);

			for (int integer5 = 0; integer5 < ea4.c(); integer5++) {
				du du6 = ea4.b(integer5);
				if (!this.j.containsKey(du6.l("id"))) {
					this.a(bbm.a.a(du6.f("type")), aay.l, du6.l("id"), du6.k("x"), du6.k("z"), du6.k("rot"));
				}
			}
		}
	}

	public static void a(afj afj, co co, String string, bbm.a a) {
		ea ea5;
		if (afj.o() && afj.p().b("Decorations", 9)) {
			ea5 = afj.p().c("Decorations", 10);
		} else {
			ea5 = new ea();
			afj.a("Decorations", ea5);
		}

		du du6 = new du();
		du6.a("type", a.a());
		du6.a("id", string);
		du6.a("x", (double)co.p());
		du6.a("z", (double)co.r());
		du6.a("rot", 180.0);
		ea5.a(du6);
		if (a.c()) {
			du du7 = afj.c("display");
			du7.a("MapColor", a.d());
		}
	}

	private void a(bbm.a a, ajs ajs, String string, double double4, double double5, double double6) {
		int integer11 = 1 << this.g;
		float float12 = (float)(double4 - (double)this.b) / (float)integer11;
		float float13 = (float)(double5 - (double)this.c) / (float)integer11;
		byte byte14 = (byte)((int)((double)(float12 * 2.0F) + 0.5));
		byte byte15 = (byte)((int)((double)(float13 * 2.0F) + 0.5));
		int integer17 = 63;
		byte byte16;
		if (float12 >= -63.0F && float13 >= -63.0F && float12 <= 63.0F && float13 <= 63.0F) {
			double6 += double6 < 0.0 ? -8.0 : 8.0;
			byte16 = (byte)((int)(double6 * 16.0 / 360.0));
			if (this.d < 0) {
				int integer18 = (int)(ajs.T().f() / 10L);
				byte16 = (byte)(integer18 * integer18 * 34187121 + integer18 * 121 >> 15 & 15);
			}
		} else {
			if (a != bbm.a.PLAYER) {
				this.j.remove(string);
				return;
			}

			int integer18 = 320;
			if (Math.abs(float12) < 320.0F && Math.abs(float13) < 320.0F) {
				a = bbm.a.PLAYER_OFF_MAP;
			} else {
				if (!this.f) {
					this.j.remove(string);
					return;
				}

				a = bbm.a.PLAYER_OFF_LIMITS;
			}

			byte16 = 0;
			if (float12 <= -63.0F) {
				byte14 = -128;
			}

			if (float13 <= -63.0F) {
				byte15 = -128;
			}

			if (float12 >= 63.0F) {
				byte14 = 127;
			}

			if (float13 >= 63.0F) {
				byte15 = 127;
			}
		}

		this.j.put(string, new bbm(a, byte14, byte15, byte16));
	}

	@Nullable
	public fm<?> a(afj afj, ajs ajs, aay aay) {
		bbn.a a5 = (bbn.a)this.k.get(aay);
		return a5 == null ? null : a5.a(afj);
	}

	public void a(int integer1, int integer2) {
		super.c();

		for (bbn.a a5 : this.i) {
			a5.a(integer1, integer2);
		}
	}

	public bbn.a a(aay aay) {
		bbn.a a3 = (bbn.a)this.k.get(aay);
		if (a3 == null) {
			a3 = new bbn.a(aay);
			this.k.put(aay, a3);
			this.i.add(a3);
		}

		return a3;
	}

	public class a {
		public final aay a;
		private boolean d = true;
		private int e;
		private int f;
		private int g = 127;
		private int h = 127;
		private int i;
		public int b;

		public a(aay aay) {
			this.a = aay;
		}

		@Nullable
		public fm<?> a(afj afj) {
			if (this.d) {
				this.d = false;
				return new ha(afj.j(), bbn.this.g, bbn.this.e, bbn.this.j.values(), bbn.this.h, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
			} else {
				return this.i++ % 5 == 0 ? new ha(afj.j(), bbn.this.g, bbn.this.e, bbn.this.j.values(), bbn.this.h, 0, 0, 0, 0) : null;
			}
		}

		public void a(int integer1, int integer2) {
			if (this.d) {
				this.e = Math.min(this.e, integer1);
				this.f = Math.min(this.f, integer2);
				this.g = Math.max(this.g, integer1);
				this.h = Math.max(this.h, integer2);
			} else {
				this.d = true;
				this.e = integer1;
				this.f = integer2;
				this.g = integer1;
				this.h = integer2;
			}
		}
	}
}
