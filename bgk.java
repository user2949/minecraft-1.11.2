import net.minecraft.realms.RealmsButton;

public class bgk extends bfm {
	private final RealmsButton o;

	public bgk(RealmsButton realmsButton, int integer2, int integer3, int integer4, String string) {
		super(integer2, integer3, integer4, string);
		this.o = realmsButton;
	}

	public bgk(RealmsButton realmsButton, int integer2, int integer3, int integer4, String string, int integer6, int integer7) {
		super(integer2, integer3, integer4, integer6, integer7, string);
		this.o = realmsButton;
	}

	public int c() {
		return this.k;
	}

	public boolean d() {
		return this.l;
	}

	public void b(boolean boolean1) {
		this.l = boolean1;
	}

	public void a(String string) {
		super.j = string;
	}

	@Override
	public int b() {
		return super.b();
	}

	public int e() {
		return this.i;
	}

	@Override
	public boolean c(bes bes, int integer2, int integer3) {
		if (super.c(bes, integer2, integer3)) {
			this.o.clicked(integer2, integer3);
		}

		return super.c(bes, integer2, integer3);
	}

	@Override
	public void a(int integer1, int integer2) {
		this.o.released(integer1, integer2);
	}

	@Override
	public void b(bes bes, int integer2, int integer3) {
		this.o.renderBg(integer2, integer3);
	}

	public RealmsButton f() {
		return this.o;
	}

	@Override
	public int a(boolean boolean1) {
		return this.o.getYImage(boolean1);
	}

	public int c(boolean boolean1) {
		return super.a(boolean1);
	}

	public int g() {
		return this.g;
	}
}
