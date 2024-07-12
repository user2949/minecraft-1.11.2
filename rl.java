public class rl<T> {
	private final rk a;
	private final T b;

	public rl(rk rk, T object) {
		this.a = rk;
		this.b = object;
	}

	public rk a() {
		return this.a;
	}

	public T b() {
		return this.b;
	}
}
