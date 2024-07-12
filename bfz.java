public class bfz extends bfm {
	private final beu.a o;

	public bfz(int integer1, int integer2, int integer3, String string) {
		this(integer1, integer2, integer3, null, string);
	}

	public bfz(int integer1, int integer2, int integer3, int integer4, int integer5, String string) {
		super(integer1, integer2, integer3, integer4, integer5, string);
		this.o = null;
	}

	public bfz(int integer1, int integer2, int integer3, beu.a a, String string) {
		super(integer1, integer2, integer3, 150, 20, string);
		this.o = a;
	}

	public beu.a c() {
		return this.o;
	}
}
