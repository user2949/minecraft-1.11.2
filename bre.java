import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.lwjgl.util.vector.Vector3f;

public class bre {
	public final Vector3f a;
	public final Vector3f b;
	public final Map<cv, brf> c;
	public final brg d;
	public final boolean e;

	public bre(Vector3f vector3f1, Vector3f vector3f2, Map<cv, brf> map, @Nullable brg brg, boolean boolean5) {
		this.a = vector3f1;
		this.b = vector3f2;
		this.c = map;
		this.d = brg;
		this.e = boolean5;
		this.a();
	}

	private void a() {
		for (Entry<cv, brf> entry3 : this.c.entrySet()) {
			float[] arr4 = this.a((cv)entry3.getKey());
			((brf)entry3.getValue()).e.a(arr4);
		}
	}

	private float[] a(cv cv) {
		switch (cv) {
			case DOWN:
				return new float[]{this.a.x, 16.0F - this.b.z, this.b.x, 16.0F - this.a.z};
			case UP:
				return new float[]{this.a.x, this.a.z, this.b.x, this.b.z};
			case NORTH:
			default:
				return new float[]{16.0F - this.b.x, 16.0F - this.b.y, 16.0F - this.a.x, 16.0F - this.a.y};
			case SOUTH:
				return new float[]{this.a.x, 16.0F - this.b.y, this.b.x, 16.0F - this.a.y};
			case WEST:
				return new float[]{this.a.z, 16.0F - this.b.y, this.b.z, 16.0F - this.a.y};
			case EAST:
				return new float[]{16.0F - this.b.z, 16.0F - this.b.y, 16.0F - this.a.z, 16.0F - this.a.y};
		}
	}

	static class a implements JsonDeserializer<bre> {
		public bre deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = jsonElement.getAsJsonObject();
			Vector3f vector3f6 = this.e(jsonObject5);
			Vector3f vector3f7 = this.d(jsonObject5);
			brg brg8 = this.a(jsonObject5);
			Map<cv, brf> map9 = this.a(jsonDeserializationContext, jsonObject5);
			if (jsonObject5.has("shade") && !ok.c(jsonObject5, "shade")) {
				throw new JsonParseException("Expected shade to be a Boolean");
			} else {
				boolean boolean10 = ok.a(jsonObject5, "shade", true);
				return new bre(vector3f6, vector3f7, map9, brg8, boolean10);
			}
		}

		@Nullable
		private brg a(JsonObject jsonObject) {
			brg brg3 = null;
			if (jsonObject.has("rotation")) {
				JsonObject jsonObject4 = ok.t(jsonObject, "rotation");
				Vector3f vector3f5 = this.a(jsonObject4, "origin");
				vector3f5.scale(0.0625F);
				cv.a a6 = this.c(jsonObject4);
				float float7 = this.b(jsonObject4);
				boolean boolean8 = ok.a(jsonObject4, "rescale", false);
				brg3 = new brg(vector3f5, a6, float7, boolean8);
			}

			return brg3;
		}

		private float b(JsonObject jsonObject) {
			float float3 = ok.l(jsonObject, "angle");
			if (float3 != 0.0F && ot.e(float3) != 22.5F && ot.e(float3) != 45.0F) {
				throw new JsonParseException("Invalid rotation " + float3 + " found, only -45/-22.5/0/22.5/45 allowed");
			} else {
				return float3;
			}
		}

		private cv.a c(JsonObject jsonObject) {
			String string3 = ok.h(jsonObject, "axis");
			cv.a a4 = cv.a.a(string3.toLowerCase(Locale.ROOT));
			if (a4 == null) {
				throw new JsonParseException("Invalid rotation axis: " + string3);
			} else {
				return a4;
			}
		}

		private Map<cv, brf> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
			Map<cv, brf> map4 = this.b(jsonDeserializationContext, jsonObject);
			if (map4.isEmpty()) {
				throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
			} else {
				return map4;
			}
		}

		private Map<cv, brf> b(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
			Map<cv, brf> map4 = Maps.newEnumMap(cv.class);
			JsonObject jsonObject5 = ok.t(jsonObject, "faces");

			for (Entry<String, JsonElement> entry7 : jsonObject5.entrySet()) {
				cv cv8 = this.a((String)entry7.getKey());
				map4.put(cv8, (brf)jsonDeserializationContext.deserialize((JsonElement)entry7.getValue(), brf.class));
			}

			return map4;
		}

		private cv a(String string) {
			cv cv3 = cv.a(string);
			if (cv3 == null) {
				throw new JsonParseException("Unknown facing: " + string);
			} else {
				return cv3;
			}
		}

		private Vector3f d(JsonObject jsonObject) {
			Vector3f vector3f3 = this.a(jsonObject, "to");
			if (!(vector3f3.x < -16.0F)
				&& !(vector3f3.y < -16.0F)
				&& !(vector3f3.z < -16.0F)
				&& !(vector3f3.x > 32.0F)
				&& !(vector3f3.y > 32.0F)
				&& !(vector3f3.z > 32.0F)) {
				return vector3f3;
			} else {
				throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + vector3f3);
			}
		}

		private Vector3f e(JsonObject jsonObject) {
			Vector3f vector3f3 = this.a(jsonObject, "from");
			if (!(vector3f3.x < -16.0F)
				&& !(vector3f3.y < -16.0F)
				&& !(vector3f3.z < -16.0F)
				&& !(vector3f3.x > 32.0F)
				&& !(vector3f3.y > 32.0F)
				&& !(vector3f3.z > 32.0F)) {
				return vector3f3;
			} else {
				throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + vector3f3);
			}
		}

		private Vector3f a(JsonObject jsonObject, String string) {
			JsonArray jsonArray4 = ok.u(jsonObject, string);
			if (jsonArray4.size() != 3) {
				throw new JsonParseException("Expected 3 " + string + " values, found: " + jsonArray4.size());
			} else {
				float[] arr5 = new float[3];

				for (int integer6 = 0; integer6 < arr5.length; integer6++) {
					arr5[integer6] = ok.e(jsonArray4.get(integer6), string + "[" + integer6 + "]");
				}

				return new Vector3f(arr5[0], arr5[1], arr5[2]);
			}
		}
	}
}
