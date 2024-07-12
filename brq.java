import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.lwjgl.util.vector.Quaternion;

public class brq {
	public static final brq a = new brq();
	public static float b;
	public static float c;
	public static float d;
	public static float e;
	public static float f;
	public static float g;
	public static float h;
	public static float i;
	public static float j;
	public final brp k;
	public final brp l;
	public final brp m;
	public final brp n;
	public final brp o;
	public final brp p;
	public final brp q;
	public final brp r;

	private brq() {
		this(brp.a, brp.a, brp.a, brp.a, brp.a, brp.a, brp.a, brp.a);
	}

	public brq(brq brq) {
		this.k = brq.k;
		this.l = brq.l;
		this.m = brq.m;
		this.n = brq.n;
		this.o = brq.o;
		this.p = brq.p;
		this.q = brq.q;
		this.r = brq.r;
	}

	public brq(brp brp1, brp brp2, brp brp3, brp brp4, brp brp5, brp brp6, brp brp7, brp brp8) {
		this.k = brp1;
		this.l = brp2;
		this.m = brp3;
		this.n = brp4;
		this.o = brp5;
		this.p = brp6;
		this.q = brp7;
		this.r = brp8;
	}

	public void a(brq.b b) {
		a(this.b(b), false);
	}

	public static void a(brp brp, boolean boolean2) {
		if (brp != brp.a) {
			int integer3 = boolean2 ? -1 : 1;
			bqg.c((float)integer3 * (b + brp.c.x), c + brp.c.y, d + brp.c.z);
			float float4 = e + brp.b.x;
			float float5 = f + brp.b.y;
			float float6 = g + brp.b.z;
			if (boolean2) {
				float5 = -float5;
				float6 = -float6;
			}

			bqg.a(a(float4, float5, float6));
			bqg.b(h + brp.d.x, i + brp.d.y, j + brp.d.z);
		}
	}

	private static Quaternion a(float float1, float float2, float float3) {
		float float4 = float1 * (float) (Math.PI / 180.0);
		float float5 = float2 * (float) (Math.PI / 180.0);
		float float6 = float3 * (float) (Math.PI / 180.0);
		float float7 = ot.a(0.5F * float4);
		float float8 = ot.b(0.5F * float4);
		float float9 = ot.a(0.5F * float5);
		float float10 = ot.b(0.5F * float5);
		float float11 = ot.a(0.5F * float6);
		float float12 = ot.b(0.5F * float6);
		return new Quaternion(
			float7 * float10 * float12 + float8 * float9 * float11,
			float8 * float9 * float12 - float7 * float10 * float11,
			float7 * float9 * float12 + float8 * float10 * float11,
			float8 * float10 * float12 - float7 * float9 * float11
		);
	}

	public brp b(brq.b b) {
		switch (b) {
			case THIRD_PERSON_LEFT_HAND:
				return this.k;
			case THIRD_PERSON_RIGHT_HAND:
				return this.l;
			case FIRST_PERSON_LEFT_HAND:
				return this.m;
			case FIRST_PERSON_RIGHT_HAND:
				return this.n;
			case HEAD:
				return this.o;
			case GUI:
				return this.p;
			case GROUND:
				return this.q;
			case FIXED:
				return this.r;
			default:
				return brp.a;
		}
	}

	public boolean c(brq.b b) {
		return this.b(b) != brp.a;
	}

	static class a implements JsonDeserializer<brq> {
		public brq deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = jsonElement.getAsJsonObject();
			brp brp6 = this.a(jsonDeserializationContext, jsonObject5, "thirdperson_righthand");
			brp brp7 = this.a(jsonDeserializationContext, jsonObject5, "thirdperson_lefthand");
			if (brp7 == brp.a) {
				brp7 = brp6;
			}

			brp brp8 = this.a(jsonDeserializationContext, jsonObject5, "firstperson_righthand");
			brp brp9 = this.a(jsonDeserializationContext, jsonObject5, "firstperson_lefthand");
			if (brp9 == brp.a) {
				brp9 = brp8;
			}

			brp brp10 = this.a(jsonDeserializationContext, jsonObject5, "head");
			brp brp11 = this.a(jsonDeserializationContext, jsonObject5, "gui");
			brp brp12 = this.a(jsonDeserializationContext, jsonObject5, "ground");
			brp brp13 = this.a(jsonDeserializationContext, jsonObject5, "fixed");
			return new brq(brp7, brp6, brp9, brp8, brp10, brp11, brp12, brp13);
		}

		private brp a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, String string) {
			return jsonObject.has(string) ? (brp)jsonDeserializationContext.deserialize(jsonObject.get(string), brp.class) : brp.a;
		}
	}

	public static enum b {
		NONE,
		THIRD_PERSON_LEFT_HAND,
		THIRD_PERSON_RIGHT_HAND,
		FIRST_PERSON_LEFT_HAND,
		FIRST_PERSON_RIGHT_HAND,
		HEAD,
		GUI,
		GROUND,
		FIXED;
	}
}
