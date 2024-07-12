public class qr extends qv {
	private final String[] a;

	public qr(Class<?> class1, String... arr) {
		super(class1);
		this.a = arr;
	}

	@Override
	du b(pg pg, du du, int integer) {
		for (String string8 : this.a) {
			du = pi.a(pg, du, integer, string8);
		}

		return du;
	}
}
