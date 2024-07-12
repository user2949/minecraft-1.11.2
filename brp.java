import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.lwjgl.util.vector.Vector3f;

public class brp {
	public static final brp a = new brp(new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F));
	public final Vector3f b;
	public final Vector3f c;
	public final Vector3f d;

	public brp(Vector3f vector3f1, Vector3f vector3f2, Vector3f vector3f3) {
		this.b = new Vector3f(vector3f1);
		this.c = new Vector3f(vector3f2);
		this.d = new Vector3f(vector3f3);
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (this.getClass() != object.getClass()) {
			return false;
		} else {
			brp brp3 = (brp)object;
			return this.b.equals(brp3.b) && this.d.equals(brp3.d) && this.c.equals(brp3.c);
		}
	}

	public int hashCode() {
		int integer2 = this.b.hashCode();
		integer2 = 31 * integer2 + this.c.hashCode();
		return 31 * integer2 + this.d.hashCode();
	}

	static class a implements JsonDeserializer<brp> {
		private static final Vector3f a = new Vector3f(0.0F, 0.0F, 0.0F);
		private static final Vector3f b = new Vector3f(0.0F, 0.0F, 0.0F);
		private static final Vector3f c = new Vector3f(1.0F, 1.0F, 1.0F);

		public brp deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = jsonElement.getAsJsonObject();
			Vector3f vector3f6 = this.a(jsonObject5, "rotation", a);
			Vector3f vector3f7 = this.a(jsonObject5, "translation", b);
			vector3f7.scale(0.0625F);
			vector3f7.x = ot.a(vector3f7.x, -5.0F, 5.0F);
			vector3f7.y = ot.a(vector3f7.y, -5.0F, 5.0F);
			vector3f7.z = ot.a(vector3f7.z, -5.0F, 5.0F);
			Vector3f vector3f8 = this.a(jsonObject5, "scale", c);
			vector3f8.x = ot.a(vector3f8.x, -4.0F, 4.0F);
			vector3f8.y = ot.a(vector3f8.y, -4.0F, 4.0F);
			vector3f8.z = ot.a(vector3f8.z, -4.0F, 4.0F);
			return new brp(vector3f6, vector3f7, vector3f8);
		}

		private Vector3f a(JsonObject jsonObject, String string, Vector3f vector3f) {
			if (!jsonObject.has(string)) {
				return vector3f;
			} else {
				JsonArray jsonArray5 = ok.u(jsonObject, string);
				if (jsonArray5.size() != 3) {
					throw new JsonParseException("Expected 3 " + string + " values, found: " + jsonArray5.size());
				} else {
					float[] arr6 = new float[3];

					for (int integer7 = 0; integer7 < arr6.length; integer7++) {
						arr6[integer7] = ok.e(jsonArray5.get(integer7), string + "[" + integer7 + "]");
					}

					return new Vector3f(arr6[0], arr6[1], arr6[2]);
				}
			}
		}
	}
}
