public class bef implements bei {
	private final String o;

	public bef(String string, a a) {
		this.o = string + a.e();
		bei.a.put(this.o, this);
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
