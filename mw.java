import com.google.gson.JsonObject;

public class mw<T> {
	private final T a;

	public mw(T object) {
		this.a = object;
	}

	protected mw(T object, JsonObject jsonObject) {
		this.a = object;
	}

	T f() {
		return this.a;
	}

	boolean e() {
		return false;
	}

	protected void a(JsonObject jsonObject) {
	}
}
