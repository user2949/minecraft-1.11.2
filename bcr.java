import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public abstract class bcr {
	private final bdd[] a;

	protected bcr(bdd[] arr) {
		this.a = arr;
	}

	public abstract afj a(afj afj, Random random, bcl bcl);

	public bdd[] a() {
		return this.a;
	}

	public abstract static class a<T extends bcr> {
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

		public abstract void a(JsonObject jsonObject, T bcr, JsonSerializationContext jsonSerializationContext);

		public abstract T b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, bdd[] arr);
	}
}
