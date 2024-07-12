import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class asx extends asc {
	private String a = "";
	private String f = "";
	private String g = "";
	private co h = new co(0, 1, 0);
	private co i = co.a;
	private aou j = aou.NONE;
	private aqi k = aqi.NONE;
	private asx.a l = asx.a.DATA;
	private boolean m = true;
	private boolean n;
	private boolean o;
	private boolean p = true;
	private float q = 1.0F;
	private long r;

	@Override
	public du b(du du) {
		super.b(du);
		du.a("name", this.a);
		du.a("author", this.f);
		du.a("metadata", this.g);
		du.a("posX", this.h.p());
		du.a("posY", this.h.q());
		du.a("posZ", this.h.r());
		du.a("sizeX", this.i.p());
		du.a("sizeY", this.i.q());
		du.a("sizeZ", this.i.r());
		du.a("rotation", this.k.toString());
		du.a("mirror", this.j.toString());
		du.a("mode", this.l.toString());
		du.a("ignoreEntities", this.m);
		du.a("powered", this.n);
		du.a("showair", this.o);
		du.a("showboundingbox", this.p);
		du.a("integrity", this.q);
		du.a("seed", this.r);
		return du;
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.a(du.l("name"));
		this.f = du.l("author");
		this.g = du.l("metadata");
		int integer3 = ot.a(du.h("posX"), -32, 32);
		int integer4 = ot.a(du.h("posY"), -32, 32);
		int integer5 = ot.a(du.h("posZ"), -32, 32);
		this.h = new co(integer3, integer4, integer5);
		int integer6 = ot.a(du.h("sizeX"), 0, 32);
		int integer7 = ot.a(du.h("sizeY"), 0, 32);
		int integer8 = ot.a(du.h("sizeZ"), 0, 32);
		this.i = new co(integer6, integer7, integer8);

		try {
			this.k = aqi.valueOf(du.l("rotation"));
		} catch (IllegalArgumentException var11) {
			this.k = aqi.NONE;
		}

		try {
			this.j = aou.valueOf(du.l("mirror"));
		} catch (IllegalArgumentException var10) {
			this.j = aou.NONE;
		}

		try {
			this.l = asx.a.valueOf(du.l("mode"));
		} catch (IllegalArgumentException var9) {
			this.l = asx.a.DATA;
		}

		this.m = du.p("ignoreEntities");
		this.n = du.p("powered");
		this.o = du.p("showair");
		this.p = du.p("showboundingbox");
		if (du.e("integrity")) {
			this.q = du.j("integrity");
		} else {
			this.q = 1.0F;
		}

		this.r = du.i("seed");
		this.J();
	}

	private void J() {
		if (this.b != null) {
			co co2 = this.w();
			atl atl3 = this.b.o(co2);
			if (atl3.v() == alv.dB) {
				this.b.a(co2, atl3.a(arg.a, this.l), 2);
			}
		}
	}

	@Nullable
	@Override
	public fz c() {
		return new fz(this.c, 7, this.d());
	}

	@Override
	public du d() {
		return this.b(new du());
	}

	public boolean a(aay aay) {
		if (!aay.dk()) {
			return false;
		} else {
			if (aay.e().E) {
				aay.a(this);
			}

			return true;
		}
	}

	public String a() {
		return this.a;
	}

	public void a(String string) {
		String string3 = string;

		for (char character7 : g.b) {
			string3 = string3.replace(character7, '_');
		}

		this.a = string3;
	}

	public void a(sw sw) {
		if (!oy.b(sw.h_())) {
			this.f = sw.h_();
		}
	}

	public co e() {
		return this.h;
	}

	public void b(co co) {
		this.h = co;
	}

	public co f() {
		return this.i;
	}

	public void c(co co) {
		this.i = co;
	}

	public aou h() {
		return this.j;
	}

	public void b(aou aou) {
		this.j = aou;
	}

	public aqi i() {
		return this.k;
	}

	public void b(aqi aqi) {
		this.k = aqi;
	}

	public String j() {
		return this.g;
	}

	public void b(String string) {
		this.g = string;
	}

	public asx.a k() {
		return this.l;
	}

	public void a(asx.a a) {
		this.l = a;
		atl atl3 = this.b.o(this.w());
		if (atl3.v() == alv.dB) {
			this.b.a(this.w(), atl3.a(arg.a, a), 2);
		}
	}

	public void l() {
		switch (this.k()) {
			case SAVE:
				this.a(asx.a.LOAD);
				break;
			case LOAD:
				this.a(asx.a.CORNER);
				break;
			case CORNER:
				this.a(asx.a.DATA);
				break;
			case DATA:
				this.a(asx.a.SAVE);
		}
	}

	public boolean m() {
		return this.m;
	}

	public void a(boolean boolean1) {
		this.m = boolean1;
	}

	public float n() {
		return this.q;
	}

	public void a(float float1) {
		this.q = float1;
	}

	public long o() {
		return this.r;
	}

	public void a(long long1) {
		this.r = long1;
	}

	public boolean p() {
		if (this.l != asx.a.SAVE) {
			return false;
		} else {
			co co2 = this.w();
			int integer3 = 80;
			co co4 = new co(co2.p() - 80, 0, co2.r() - 80);
			co co5 = new co(co2.p() + 80, 255, co2.r() + 80);
			List<asx> list6 = this.a(co4, co5);
			List<asx> list7 = this.a(list6);
			if (list7.size() < 1) {
				return false;
			} else {
				axz axz8 = this.a(co2, list7);
				if (axz8.d - axz8.a > 1 && axz8.e - axz8.b > 1 && axz8.f - axz8.c > 1) {
					this.h = new co(axz8.a - co2.p() + 1, axz8.b - co2.q() + 1, axz8.c - co2.r() + 1);
					this.i = new co(axz8.d - axz8.a - 1, axz8.e - axz8.b - 1, axz8.f - axz8.c - 1);
					this.x_();
					atl atl9 = this.b.o(co2);
					this.b.a(co2, atl9, atl9, 3);
					return true;
				} else {
					return false;
				}
			}
		}
	}

	private List<asx> a(List<asx> list) {
		Iterable<asx> iterable3 = Iterables.filter(list, new Predicate<asx>() {
			public boolean apply(@Nullable asx asx) {
				return asx.l == asx.a.CORNER && asx.this.a.equals(asx.a);
			}
		});
		return Lists.newArrayList(iterable3);
	}

	private List<asx> a(co co1, co co2) {
		List<asx> list4 = Lists.newArrayList();

		for (co.a a6 : co.b(co1, co2)) {
			atl atl7 = this.b.o(a6);
			if (atl7.v() == alv.dB) {
				asc asc8 = this.b.r(a6);
				if (asc8 != null && asc8 instanceof asx) {
					list4.add((asx)asc8);
				}
			}
		}

		return list4;
	}

	private axz a(co co, List<asx> list) {
		axz axz4;
		if (list.size() > 1) {
			co co5 = ((asx)list.get(0)).w();
			axz4 = new axz(co5, co5);
		} else {
			axz4 = new axz(co, co);
		}

		for (asx asx6 : list) {
			co co7 = asx6.w();
			if (co7.p() < axz4.a) {
				axz4.a = co7.p();
			} else if (co7.p() > axz4.d) {
				axz4.d = co7.p();
			}

			if (co7.q() < axz4.b) {
				axz4.b = co7.q();
			} else if (co7.q() > axz4.e) {
				axz4.e = co7.q();
			}

			if (co7.r() < axz4.c) {
				axz4.c = co7.r();
			} else if (co7.r() > axz4.f) {
				axz4.f = co7.r();
			}
		}

		return axz4;
	}

	public void a(ByteBuf byteBuf) {
		byteBuf.writeInt(this.c.p());
		byteBuf.writeInt(this.c.q());
		byteBuf.writeInt(this.c.r());
	}

	public boolean q() {
		return this.b(true);
	}

	public boolean b(boolean boolean1) {
		if (this.l == asx.a.SAVE && !this.b.E && !oy.b(this.a)) {
			co co3 = this.w().a(this.h);
			lw lw4 = (lw)this.b;
			MinecraftServer minecraftServer5 = this.b.u();
			ayz ayz6 = lw4.y();
			azc azc7 = ayz6.a(minecraftServer5, new kq(this.a));
			azc7.a(this.b, co3, this.i, !this.m, alv.dj);
			azc7.a(this.f);
			return !boolean1 || ayz6.c(minecraftServer5, new kq(this.a));
		} else {
			return false;
		}
	}

	public boolean r() {
		return this.c(true);
	}

	public boolean c(boolean boolean1) {
		if (this.l == asx.a.LOAD && !this.b.E && !oy.b(this.a)) {
			co co3 = this.w();
			co co4 = co3.a(this.h);
			lw lw5 = (lw)this.b;
			MinecraftServer minecraftServer6 = this.b.u();
			ayz ayz7 = lw5.y();
			azc azc8 = ayz7.b(minecraftServer6, new kq(this.a));
			if (azc8 == null) {
				return false;
			} else {
				if (!oy.b(azc8.b())) {
					this.f = azc8.b();
				}

				co co9 = azc8.a();
				boolean boolean10 = this.i.equals(co9);
				if (!boolean10) {
					this.i = co9;
					this.x_();
					atl atl11 = this.b.o(co3);
					this.b.a(co3, atl11, atl11, 3);
				}

				if (boolean1 && !boolean10) {
					return false;
				} else {
					aza aza11 = new aza().a(this.j).a(this.k).a(this.m).a(null).a(null).b(false);
					if (this.q < 1.0F) {
						aza11.a(ot.a(this.q, 0.0F, 1.0F)).a(this.r);
					}

					azc8.a(this.b, co4, aza11);
					return true;
				}
			}
		} else {
			return false;
		}
	}

	public void s() {
		lw lw2 = (lw)this.b;
		ayz ayz3 = lw2.y();
		ayz3.b(new kq(this.a));
	}

	public boolean E() {
		if (this.l == asx.a.LOAD && !this.b.E) {
			lw lw2 = (lw)this.b;
			MinecraftServer minecraftServer3 = this.b.u();
			ayz ayz4 = lw2.y();
			return ayz4.b(minecraftServer3, new kq(this.a)) != null;
		} else {
			return false;
		}
	}

	public boolean F() {
		return this.n;
	}

	public void d(boolean boolean1) {
		this.n = boolean1;
	}

	public boolean G() {
		return this.o;
	}

	public void e(boolean boolean1) {
		this.o = boolean1;
	}

	public boolean I() {
		return this.p;
	}

	public void f(boolean boolean1) {
		this.p = boolean1;
	}

	@Nullable
	@Override
	public fb i_() {
		return new fi("structure_block.hover." + this.l.f, this.l == asx.a.DATA ? this.g : this.a);
	}

	public static enum a implements ox {
		SAVE("save", 0),
		LOAD("load", 1),
		CORNER("corner", 2),
		DATA("data", 3);

		private static final asx.a[] e = new asx.a[values().length];
		private final String f;
		private final int g;

		private a(String string3, int integer4) {
			this.f = string3;
			this.g = integer4;
		}

		@Override
		public String m() {
			return this.f;
		}

		public int a() {
			return this.g;
		}

		public static asx.a a(int integer) {
			return integer >= 0 && integer < e.length ? e[integer] : e[0];
		}

		static {
			for (asx.a a4 : values()) {
				e[a4.a()] = a4;
			}
		}
	}
}
