public class cd extends Exception {
	private final Object[] a;

	public cd(String string, Object... arr) {
		super(string);
		this.a = arr;
	}

	public Object[] a() {
		return this.a;
	}
}
