public class fj extends IllegalArgumentException {
	public fj(fi fi, String string) {
		super(String.format("Error parsing: %s: %s", fi, string));
	}

	public fj(fi fi, int integer) {
		super(String.format("Invalid index %d requested for %s", integer, fi));
	}

	public fj(fi fi, Throwable throwable) {
		super(String.format("Error while parsing: %s", fi), throwable);
	}
}
