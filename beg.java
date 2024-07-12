public class beg implements bei {
	private final String o;

	public beg(String string) {
		this.o = string;
		bei.a.put(string, this);
	}

	@Override
	public String a() {
		return this.o;
	}

	@Override
	public boolean b() {
		return false;
	}

	@Override
	public bei.a c() {
		return bei.a.INTEGER;
	}
}
