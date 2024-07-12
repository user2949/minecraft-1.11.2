public abstract class op<T> {
	private T a;
	private boolean b;

	public T c() {
		if (!this.b) {
			this.b = true;
			this.a = this.b();
		}

		return this.a;
	}

	protected abstract T b();
}
