public class ayp extends bbl {
	private du b = new du();

	public ayp(String string) {
		super(string);
	}

	@Override
	public void a(du du) {
		this.b = du.o("Features");
	}

	@Override
	public du b(du du) {
		du.a("Features", this.b);
		return du;
	}

	public void a(du du, int integer2, int integer3) {
		this.b.a(b(integer2, integer3), du);
	}

	public static String b(int integer1, int integer2) {
		return "[" + integer1 + "," + integer2 + "]";
	}

	public du a() {
		return this.b;
	}
}
