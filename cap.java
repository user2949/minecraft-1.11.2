import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class cap {
	private final dh<String, cap.a<? extends can>> a = new dj<>();
	private final GsonBuilder b = new GsonBuilder();
	private Gson c;

	public cap() {
		this.b.registerTypeHierarchyAdapter(fb.class, new fb.a());
		this.b.registerTypeHierarchyAdapter(fg.class, new fg.a());
		this.b.registerTypeAdapterFactory(new os());
	}

	public <T extends can> void a(cao<T> cao, Class<T> class2) {
		this.a.a(cao.a(), new cap.a<>(cao, class2));
		this.b.registerTypeAdapter(class2, cao);
		this.c = null;
	}

	public <T extends can> T a(String string, JsonObject jsonObject) {
		if (string == null) {
			throw new IllegalArgumentException("Metadata section name cannot be null");
		} else if (!jsonObject.has(string)) {
			return null;
		} else if (!jsonObject.get(string).isJsonObject()) {
			throw new IllegalArgumentException("Invalid metadata for '" + string + "' - expected object, found " + jsonObject.get(string));
		} else {
			cap.a<?> a4 = this.a.c(string);
			if (a4 == null) {
				throw new IllegalArgumentException("Don't know how to handle metadata section '" + string + "'");
			} else {
				return (T)this.a().fromJson(jsonObject.getAsJsonObject(string), a4.b);
			}
		}
	}

	private Gson a() {
		if (this.c == null) {
			this.c = this.b.create();
		}

		return this.c;
	}

	class a<T extends can> {
		final cao<T> a;
		final Class<T> b;

		private a(cao<T> cao, Class<T> class3) {
			this.a = cao;
			this.b = class3;
		}
	}
}
