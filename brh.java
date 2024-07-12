import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class brh {
	public float[] a;
	public final int b;

	public brh(@Nullable float[] arr, int integer) {
		this.a = arr;
		this.b = integer;
	}

	public float a(int integer) {
		if (this.a == null) {
			throw new NullPointerException("uvs");
		} else {
			int integer3 = this.d(integer);
			return integer3 != 0 && integer3 != 1 ? this.a[2] : this.a[0];
		}
	}

	public float b(int integer) {
		if (this.a == null) {
			throw new NullPointerException("uvs");
		} else {
			int integer3 = this.d(integer);
			return integer3 != 0 && integer3 != 3 ? this.a[3] : this.a[1];
		}
	}

	private int d(int integer) {
		return (integer + this.b / 90) % 4;
	}

	public int c(int integer) {
		return (integer + (4 - this.b / 90)) % 4;
	}

	public void a(float[] arr) {
		if (this.a == null) {
			this.a = arr;
		}
	}

	static class a implements JsonDeserializer<brh> {
		public brh deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = jsonElement.getAsJsonObject();
			float[] arr6 = this.b(jsonObject5);
			int integer7 = this.a(jsonObject5);
			return new brh(arr6, integer7);
		}

		protected int a(JsonObject jsonObject) {
			int integer3 = ok.a(jsonObject, "rotation", 0);
			if (integer3 >= 0 && integer3 % 90 == 0 && integer3 / 90 <= 3) {
				return integer3;
			} else {
				throw new JsonParseException("Invalid rotation " + integer3 + " found, only 0/90/180/270 allowed");
			}
		}

		@Nullable
		private float[] b(JsonObject jsonObject) {
			if (!jsonObject.has("uv")) {
				return null;
			} else {
				JsonArray jsonArray3 = ok.u(jsonObject, "uv");
				if (jsonArray3.size() != 4) {
					throw new JsonParseException("Expected 4 uv values, found: " + jsonArray3.size());
				} else {
					float[] arr4 = new float[4];

					for (int integer5 = 0; integer5 < arr4.length; integer5++) {
						arr4[integer5] = ok.e(jsonArray3.get(integer5), "uv[" + integer5 + "]");
					}

					return arr4;
				}
			}
		}
	}
}
