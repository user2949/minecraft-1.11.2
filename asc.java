import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class asc {
	private static final Logger a = LogManager.getLogger();
	private static final dc<kq, Class<? extends asc>> f = new dc<>();
	protected ajs b;
	protected co c = co.a;
	protected boolean d;
	private int g = -1;
	protected alu e;

	private static void a(String string, Class<? extends asc> class2) {
		f.a(new kq(string), class2);
	}

	@Nullable
	public static kq a(Class<? extends asc> class1) {
		return f.b(class1);
	}

	public ajs D() {
		return this.b;
	}

	public void a(ajs ajs) {
		this.b = ajs;
	}

	public boolean u() {
		return this.b != null;
	}

	public void a(du du) {
		this.c = new co(du.h("x"), du.h("y"), du.h("z"));
	}

	public du b(du du) {
		return this.c(du);
	}

	private du c(du du) {
		kq kq3 = f.b(this.getClass());
		if (kq3 == null) {
			throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
		} else {
			du.a("id", kq3.toString());
			du.a("x", this.c.p());
			du.a("y", this.c.q());
			du.a("z", this.c.r());
			return du;
		}
	}

	@Nullable
	public static asc a(ajs ajs, du du) {
		asc asc3 = null;
		String string4 = du.l("id");

		try {
			Class<? extends asc> class5 = f.c(new kq(string4));
			if (class5 != null) {
				asc3 = (asc)class5.newInstance();
			}
		} catch (Throwable var6) {
			a.error("Failed to create block entity {}", new Object[]{string4, var6});
		}

		if (asc3 != null) {
			try {
				asc3.b(ajs);
				asc3.a(du);
			} catch (Throwable var5) {
				a.error("Failed to load data for block entity {}", new Object[]{string4, var5});
				asc3 = null;
			}
		} else {
			a.warn("Skipping BlockEntity with id {}", new Object[]{string4});
		}

		return asc3;
	}

	protected void b(ajs ajs) {
	}

	public int v() {
		if (this.g == -1) {
			atl atl2 = this.b.o(this.c);
			this.g = atl2.v().e(atl2);
		}

		return this.g;
	}

	public void x_() {
		if (this.b != null) {
			atl atl2 = this.b.o(this.c);
			this.g = atl2.v().e(atl2);
			this.b.b(this.c, this);
			if (this.x() != alv.a) {
				this.b.d(this.c, this.x());
			}
		}
	}

	public double a(double double1, double double2, double double3) {
		double double8 = (double)this.c.p() + 0.5 - double1;
		double double10 = (double)this.c.q() + 0.5 - double2;
		double double12 = (double)this.c.r() + 0.5 - double3;
		return double8 * double8 + double10 * double10 + double12 * double12;
	}

	public double t() {
		return 4096.0;
	}

	public co w() {
		return this.c;
	}

	public alu x() {
		if (this.e == null && this.b != null) {
			this.e = this.b.o(this.c).v();
		}

		return this.e;
	}

	@Nullable
	public fz c() {
		return null;
	}

	public du d() {
		return this.c(new du());
	}

	public boolean y() {
		return this.d;
	}

	public void z() {
		this.d = true;
	}

	public void A() {
		this.d = false;
	}

	public boolean c(int integer1, int integer2) {
		return false;
	}

	public void B() {
		this.e = null;
		this.g = -1;
	}

	public void a(c c) {
		c.a("Name", new d<String>() {
			public String call() throws Exception {
				return asc.f.b(asc.this.getClass()) + " // " + asc.this.getClass().getCanonicalName();
			}
		});
		if (this.b != null) {
			c.a(c, this.c, this.x(), this.v());
			c.a("Actual block type", new d<String>() {
				public String call() throws Exception {
					int integer2 = alu.a(asc.this.b.o(asc.this.c).v());

					try {
						return String.format("ID #%d (%s // %s)", integer2, alu.b(integer2).a(), alu.b(integer2).getClass().getCanonicalName());
					} catch (Throwable var3) {
						return "ID #" + integer2;
					}
				}
			});
			c.a("Actual block data value", new d<String>() {
				public String call() throws Exception {
					atl atl2 = asc.this.b.o(asc.this.c);
					int integer3 = atl2.v().e(atl2);
					if (integer3 < 0) {
						return "Unknown? (Got " + integer3 + ")";
					} else {
						String string4 = String.format("%4s", Integer.toBinaryString(integer3)).replace(" ", "0");
						return String.format("%1$d / 0x%1$X / 0b%2$s", integer3, string4);
					}
				}
			});
		}
	}

	public void a(co co) {
		this.c = co.h();
	}

	public boolean C() {
		return false;
	}

	@Nullable
	public fb i_() {
		return null;
	}

	public void a(aqi aqi) {
	}

	public void a(aou aou) {
	}

	static {
		a("furnace", asn.class);
		a("chest", ase.class);
		a("ender_chest", asl.class);
		a("jukebox", aol.a.class);
		a("dispenser", asi.class);
		a("dropper", asj.class);
		a("sign", asv.class);
		a("mob_spawner", asr.class);
		a("noteblock", ass.class);
		a("piston", atf.class);
		a("brewing_stand", asd.class);
		a("enchanting_table", ask.class);
		a("end_portal", asz.class);
		a("beacon", asb.class);
		a("skull", asw.class);
		a("daylight_detector", ash.class);
		a("hopper", asp.class);
		a("comparator", asg.class);
		a("flower_pot", asm.class);
		a("banner", arz.class);
		a("structure_block", asx.class);
		a("end_gateway", asy.class);
		a("command_block", asf.class);
		a("shulker_box", asu.class);
	}
}
