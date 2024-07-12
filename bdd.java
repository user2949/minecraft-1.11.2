import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public interface bdd {
	boolean a(Random random, bcl bcl);

	public abstract static class a<T extends bdd> {
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

		public abstract void a(JsonObject jsonObject, T bdd, JsonSerializationContext jsonSerializationContext);

		public abstract T b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext);
	}
}
