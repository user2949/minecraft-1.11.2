import com.google.common.collect.Lists;
import io.netty.buffer.Unpooled;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bjc extends bho {
	private static final Logger f = LogManager.getLogger();
	public static final int[] a = new int[]{203, 205, 14, 211, 199, 207};
	private final asx g;
	private aou h = aou.NONE;
	private aqi i = aqi.NONE;
	private asx.a r = asx.a.DATA;
	private boolean s;
	private boolean t;
	private boolean u;
	private bfq v;
	private bfq w;
	private bfq x;
	private bfq y;
	private bfq z;
	private bfq A;
	private bfq B;
	private bfq C;
	private bfq D;
	private bfq E;
	private bfm F;
	private bfm G;
	private bfm H;
	private bfm I;
	private bfm J;
	private bfm K;
	private bfm L;
	private bfm M;
	private bfm N;
	private bfm O;
	private bfm P;
	private bfm Q;
	private bfm R;
	private bfm S;
	private final List<bfq> T = Lists.newArrayList();
	private final DecimalFormat U = new DecimalFormat("0.0###");

	public bjc(asx asx) {
		this.g = asx;
		this.U.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
	}

	@Override
	public void e() {
		this.v.a();
		this.w.a();
		this.x.a();
		this.y.a();
		this.z.a();
		this.A.a();
		this.B.a();
		this.C.a();
		this.D.a();
		this.E.a();
	}

	@Override
	public void b() {
		Keyboard.enableRepeatEvents(true);
		this.n.clear();
		this.F = this.b(new bfm(0, this.l / 2 - 4 - 150, 210, 150, 20, cah.a("gui.done")));
		this.G = this.b(new bfm(1, this.l / 2 + 4, 210, 150, 20, cah.a("gui.cancel")));
		this.H = this.b(new bfm(9, this.l / 2 + 4 + 100, 185, 50, 20, cah.a("structure_block.button.save")));
		this.I = this.b(new bfm(10, this.l / 2 + 4 + 100, 185, 50, 20, cah.a("structure_block.button.load")));
		this.N = this.b(new bfm(18, this.l / 2 - 4 - 150, 185, 50, 20, "MODE"));
		this.O = this.b(new bfm(19, this.l / 2 + 4 + 100, 120, 50, 20, cah.a("structure_block.button.detect_size")));
		this.P = this.b(new bfm(20, this.l / 2 + 4 + 100, 160, 50, 20, "ENTITIES"));
		this.Q = this.b(new bfm(21, this.l / 2 - 20, 185, 40, 20, "MIRROR"));
		this.R = this.b(new bfm(22, this.l / 2 + 4 + 100, 80, 50, 20, "SHOWAIR"));
		this.S = this.b(new bfm(23, this.l / 2 + 4 + 100, 80, 50, 20, "SHOWBB"));
		this.J = this.b(new bfm(11, this.l / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, "0"));
		this.K = this.b(new bfm(12, this.l / 2 - 1 - 40 - 20, 185, 40, 20, "90"));
		this.L = this.b(new bfm(13, this.l / 2 + 1 + 20, 185, 40, 20, "180"));
		this.M = this.b(new bfm(14, this.l / 2 + 1 + 40 + 1 + 20, 185, 40, 20, "270"));
		this.v = new bfq(2, this.q, this.l / 2 - 152, 40, 300, 20);
		this.v.f(64);
		this.v.a(this.g.a());
		this.T.add(this.v);
		co co2 = this.g.e();
		this.w = new bfq(3, this.q, this.l / 2 - 152, 80, 80, 20);
		this.w.f(15);
		this.w.a(Integer.toString(co2.p()));
		this.T.add(this.w);
		this.x = new bfq(4, this.q, this.l / 2 - 72, 80, 80, 20);
		this.x.f(15);
		this.x.a(Integer.toString(co2.q()));
		this.T.add(this.x);
		this.y = new bfq(5, this.q, this.l / 2 + 8, 80, 80, 20);
		this.y.f(15);
		this.y.a(Integer.toString(co2.r()));
		this.T.add(this.y);
		co co3 = this.g.f();
		this.z = new bfq(6, this.q, this.l / 2 - 152, 120, 80, 20);
		this.z.f(15);
		this.z.a(Integer.toString(co3.p()));
		this.T.add(this.z);
		this.A = new bfq(7, this.q, this.l / 2 - 72, 120, 80, 20);
		this.A.f(15);
		this.A.a(Integer.toString(co3.q()));
		this.T.add(this.A);
		this.B = new bfq(8, this.q, this.l / 2 + 8, 120, 80, 20);
		this.B.f(15);
		this.B.a(Integer.toString(co3.r()));
		this.T.add(this.B);
		this.C = new bfq(15, this.q, this.l / 2 - 152, 120, 80, 20);
		this.C.f(15);
		this.C.a(this.U.format((double)this.g.n()));
		this.T.add(this.C);
		this.D = new bfq(16, this.q, this.l / 2 - 72, 120, 80, 20);
		this.D.f(31);
		this.D.a(Long.toString(this.g.o()));
		this.T.add(this.D);
		this.E = new bfq(17, this.q, this.l / 2 - 152, 120, 240, 20);
		this.E.f(128);
		this.E.a(this.g.j());
		this.T.add(this.E);
		this.h = this.g.h();
		this.h();
		this.i = this.g.i();
		this.i();
		this.r = this.g.k();
		this.j();
		this.s = this.g.m();
		this.a();
		this.t = this.g.G();
		this.f();
		this.u = this.g.I();
		this.g();
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == 1) {
				this.g.b(this.h);
				this.g.b(this.i);
				this.g.a(this.r);
				this.g.a(this.s);
				this.g.e(this.t);
				this.g.f(this.u);
				this.j.a(null);
			} else if (bfm.k == 0) {
				if (this.b(1)) {
					this.j.a(null);
				}
			} else if (bfm.k == 9) {
				if (this.g.k() == asx.a.SAVE) {
					this.b(2);
					this.j.a(null);
				}
			} else if (bfm.k == 10) {
				if (this.g.k() == asx.a.LOAD) {
					this.b(3);
					this.j.a(null);
				}
			} else if (bfm.k == 11) {
				this.g.b(aqi.NONE);
				this.i();
			} else if (bfm.k == 12) {
				this.g.b(aqi.CLOCKWISE_90);
				this.i();
			} else if (bfm.k == 13) {
				this.g.b(aqi.CLOCKWISE_180);
				this.i();
			} else if (bfm.k == 14) {
				this.g.b(aqi.COUNTERCLOCKWISE_90);
				this.i();
			} else if (bfm.k == 18) {
				this.g.l();
				this.j();
			} else if (bfm.k == 19) {
				if (this.g.k() == asx.a.SAVE) {
					this.b(4);
					this.j.a(null);
				}
			} else if (bfm.k == 20) {
				this.g.a(!this.g.m());
				this.a();
			} else if (bfm.k == 22) {
				this.g.e(!this.g.G());
				this.f();
			} else if (bfm.k == 23) {
				this.g.f(!this.g.I());
				this.g();
			} else if (bfm.k == 21) {
				switch (this.g.h()) {
					case NONE:
						this.g.b(aou.LEFT_RIGHT);
						break;
					case LEFT_RIGHT:
						this.g.b(aou.FRONT_BACK);
						break;
					case FRONT_BACK:
						this.g.b(aou.NONE);
				}

				this.h();
			}
		}
	}

	private void a() {
		boolean boolean2 = !this.g.m();
		if (boolean2) {
			this.P.j = cah.a("options.on");
		} else {
			this.P.j = cah.a("options.off");
		}
	}

	private void f() {
		boolean boolean2 = this.g.G();
		if (boolean2) {
			this.R.j = cah.a("options.on");
		} else {
			this.R.j = cah.a("options.off");
		}
	}

	private void g() {
		boolean boolean2 = this.g.I();
		if (boolean2) {
			this.S.j = cah.a("options.on");
		} else {
			this.S.j = cah.a("options.off");
		}
	}

	private void h() {
		aou aou2 = this.g.h();
		switch (aou2) {
			case NONE:
				this.Q.j = "|";
				break;
			case LEFT_RIGHT:
				this.Q.j = "< >";
				break;
			case FRONT_BACK:
				this.Q.j = "^ v";
		}
	}

	private void i() {
		this.J.l = true;
		this.K.l = true;
		this.L.l = true;
		this.M.l = true;
		switch (this.g.i()) {
			case NONE:
				this.J.l = false;
				break;
			case CLOCKWISE_180:
				this.L.l = false;
				break;
			case COUNTERCLOCKWISE_90:
				this.M.l = false;
				break;
			case CLOCKWISE_90:
				this.K.l = false;
		}
	}

	private void j() {
		this.v.b(false);
		this.w.b(false);
		this.x.b(false);
		this.y.b(false);
		this.z.b(false);
		this.A.b(false);
		this.B.b(false);
		this.C.b(false);
		this.D.b(false);
		this.E.b(false);
		this.v.e(false);
		this.v.b(false);
		this.w.e(false);
		this.x.e(false);
		this.y.e(false);
		this.z.e(false);
		this.A.e(false);
		this.B.e(false);
		this.C.e(false);
		this.D.e(false);
		this.E.e(false);
		this.H.m = false;
		this.I.m = false;
		this.O.m = false;
		this.P.m = false;
		this.Q.m = false;
		this.J.m = false;
		this.K.m = false;
		this.L.m = false;
		this.M.m = false;
		this.R.m = false;
		this.S.m = false;
		switch (this.g.k()) {
			case SAVE:
				this.v.e(true);
				this.v.b(true);
				this.w.e(true);
				this.x.e(true);
				this.y.e(true);
				this.z.e(true);
				this.A.e(true);
				this.B.e(true);
				this.H.m = true;
				this.O.m = true;
				this.P.m = true;
				this.R.m = true;
				break;
			case LOAD:
				this.v.e(true);
				this.v.b(true);
				this.w.e(true);
				this.x.e(true);
				this.y.e(true);
				this.C.e(true);
				this.D.e(true);
				this.I.m = true;
				this.P.m = true;
				this.Q.m = true;
				this.J.m = true;
				this.K.m = true;
				this.L.m = true;
				this.M.m = true;
				this.S.m = true;
				this.i();
				break;
			case CORNER:
				this.v.e(true);
				this.v.b(true);
				break;
			case DATA:
				this.E.e(true);
				this.E.b(true);
		}

		this.N.j = cah.a("structure_block.mode." + this.g.k().m());
	}

	private boolean b(int integer) {
		try {
			et et3 = new et(Unpooled.buffer());
			this.g.a(et3);
			et3.writeByte(integer);
			et3.a(this.g.k().toString());
			et3.a(this.v.b());
			et3.writeInt(this.c(this.w.b()));
			et3.writeInt(this.c(this.x.b()));
			et3.writeInt(this.c(this.y.b()));
			et3.writeInt(this.c(this.z.b()));
			et3.writeInt(this.c(this.A.b()));
			et3.writeInt(this.c(this.B.b()));
			et3.a(this.g.h().toString());
			et3.a(this.g.i().toString());
			et3.a(this.E.b());
			et3.writeBoolean(this.g.m());
			et3.writeBoolean(this.g.G());
			et3.writeBoolean(this.g.I());
			et3.writeFloat(this.b(this.C.b()));
			et3.b(this.a(this.D.b()));
			this.j.v().a(new iw("MC|Struct", et3));
			return true;
		} catch (Exception var3) {
			f.warn("Could not send structure block info", var3);
			return false;
		}
	}

	private long a(String string) {
		try {
			return Long.valueOf(string);
		} catch (NumberFormatException var3) {
			return 0L;
		}
	}

	private float b(String string) {
		try {
			return Float.valueOf(string);
		} catch (NumberFormatException var3) {
			return 1.0F;
		}
	}

	private int c(String string) {
		try {
			return Integer.parseInt(string);
		} catch (NumberFormatException var3) {
			return 0;
		}
	}

	@Override
	protected void a(char character, int integer) {
		if (this.v.r() && b(character, integer)) {
			this.v.a(character, integer);
		}

		if (this.w.r()) {
			this.w.a(character, integer);
		}

		if (this.x.r()) {
			this.x.a(character, integer);
		}

		if (this.y.r()) {
			this.y.a(character, integer);
		}

		if (this.z.r()) {
			this.z.a(character, integer);
		}

		if (this.A.r()) {
			this.A.a(character, integer);
		}

		if (this.B.r()) {
			this.B.a(character, integer);
		}

		if (this.C.r()) {
			this.C.a(character, integer);
		}

		if (this.D.r()) {
			this.D.a(character, integer);
		}

		if (this.E.r()) {
			this.E.a(character, integer);
		}

		if (integer == 15) {
			bfq bfq4 = null;
			bfq bfq5 = null;

			for (bfq bfq7 : this.T) {
				if (bfq4 != null && bfq7.r()) {
					bfq5 = bfq7;
					break;
				}

				if (bfq7.m() && bfq7.r()) {
					bfq4 = bfq7;
				}
			}

			if (bfq4 != null && bfq5 == null) {
				for (bfq bfq7 : this.T) {
					if (bfq7.r() && bfq7 != bfq4) {
						bfq5 = bfq7;
						break;
					}
				}
			}

			if (bfq5 != null && bfq5 != bfq4) {
				bfq4.b(false);
				bfq5.b(true);
			}
		}

		if (integer == 28 || integer == 156) {
			this.a(this.F);
		} else if (integer == 1) {
			this.a(this.G);
		}
	}

	private static boolean b(char character, int integer) {
		boolean boolean3 = true;

		for (int integer7 : a) {
			if (integer7 == integer) {
				return true;
			}
		}

		for (char character7 : g.b) {
			if (character7 == character) {
				boolean3 = false;
				break;
			}
		}

		return boolean3;
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		if (this.v.r()) {
			this.v.a(integer1, integer2, integer3);
		}

		if (this.w.r()) {
			this.w.a(integer1, integer2, integer3);
		}

		if (this.x.r()) {
			this.x.a(integer1, integer2, integer3);
		}

		if (this.y.r()) {
			this.y.a(integer1, integer2, integer3);
		}

		if (this.z.r()) {
			this.z.a(integer1, integer2, integer3);
		}

		if (this.A.r()) {
			this.A.a(integer1, integer2, integer3);
		}

		if (this.B.r()) {
			this.B.a(integer1, integer2, integer3);
		}

		if (this.C.r()) {
			this.C.a(integer1, integer2, integer3);
		}

		if (this.D.r()) {
			this.D.a(integer1, integer2, integer3);
		}

		if (this.E.r()) {
			this.E.a(integer1, integer2, integer3);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		asx.a a5 = this.g.k();
		this.a(this.q, cah.a("tile.structureBlock.name"), this.l / 2, 10, 16777215);
		if (a5 != asx.a.DATA) {
			this.c(this.q, cah.a("structure_block.structure_name"), this.l / 2 - 153, 30, 10526880);
			this.v.g();
		}

		if (a5 == asx.a.LOAD || a5 == asx.a.SAVE) {
			this.c(this.q, cah.a("structure_block.position"), this.l / 2 - 153, 70, 10526880);
			this.w.g();
			this.x.g();
			this.y.g();
			String string6 = cah.a("structure_block.include_entities");
			int integer7 = this.q.a(string6);
			this.c(this.q, string6, this.l / 2 + 154 - integer7, 150, 10526880);
		}

		if (a5 == asx.a.SAVE) {
			this.c(this.q, cah.a("structure_block.size"), this.l / 2 - 153, 110, 10526880);
			this.z.g();
			this.A.g();
			this.B.g();
			String string6 = cah.a("structure_block.detect_size");
			int integer7 = this.q.a(string6);
			this.c(this.q, string6, this.l / 2 + 154 - integer7, 110, 10526880);
			String string8 = cah.a("structure_block.show_air");
			int integer9 = this.q.a(string8);
			this.c(this.q, string8, this.l / 2 + 154 - integer9, 70, 10526880);
		}

		if (a5 == asx.a.LOAD) {
			this.c(this.q, cah.a("structure_block.integrity"), this.l / 2 - 153, 110, 10526880);
			this.C.g();
			this.D.g();
			String string6 = cah.a("structure_block.show_boundingbox");
			int integer7 = this.q.a(string6);
			this.c(this.q, string6, this.l / 2 + 154 - integer7, 70, 10526880);
		}

		if (a5 == asx.a.DATA) {
			this.c(this.q, cah.a("structure_block.custom_data"), this.l / 2 - 153, 110, 10526880);
			this.E.g();
		}

		String string6 = "structure_block.mode_info." + a5.m();
		this.c(this.q, cah.a(string6), this.l / 2 - 153, 174, 10526880);
		super.a(integer1, integer2, float3);
	}

	@Override
	public boolean d() {
		return false;
	}
}
