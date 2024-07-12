import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public interface bdl {
	boolean a(Random random, sn sn);

	public abstract static class a<T extends bdl> {
		private final kq a;
		private final Class<T> b;

		protected a(kq kq, Class<T> class2) {
			this.a = kq;
			this.b = class2;
		}

		public kq a() {
			return this.a;
		}

		public Class<T> b() {
			return this.b;
		}

		public abstract JsonElement a(T bdl, JsonSerializationContext jsonSerializationContext);

		public abstract T a(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext);
	}
}
