public class f extends RuntimeException {
	private final b a;

	public f(b b) {
		this.a = b;
	}

	public b a() {
		return this.a;
	}

	public Throwable getCause() {
		return this.a.b();
	}

	public String getMessage() {
		return this.a.a();
	}
}
