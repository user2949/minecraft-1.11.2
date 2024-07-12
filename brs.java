import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class brs {
	private final kq a;
	private final cbi b;
	private final boolean c;
	private final int d;

	public brs(kq kq, cbi cbi, boolean boolean3, int integer) {
		this.a = kq;
		this.b = cbi;
		this.c = boolean3;
		this.d = integer;
	}

	public kq a() {
		return this.a;
	}

	public cbi b() {
		return this.b;
	}

	public boolean c() {
		return this.c;
	}

	public int d() {
		return this.d;
	}

	public String toString() {
		return "Variant{modelLocation=" + this.a + ", rotation=" + this.b + ", uvLock=" + this.c + ", weight=" + this.d + '}';
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof brs)) {
			return false;
		} else {
			brs brs3 = (brs)object;
			return this.a.equals(brs3.a) && this.b == brs3.b && this.c == brs3.c && this.d == brs3.d;
		}
	}

	public int hashCode() {
		int integer2 = this.a.hashCode();
		integer2 = 31 * integer2 + this.b.hashCode();
		integer2 = 31 * integer2 + Boolean.valueOf(this.c).hashCode();
		return 31 * integer2 + this.d;
	}

	public static class a implements JsonDeserializer<brs> {
		public brs deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = jsonElement.getAsJsonObject();
			String string6 = this.b(jsonObject5);
			cbi cbi7 = this.a(jsonObject5);
			boolean boolean8 = this.d(jsonObject5);
			int integer9 = this.c(jsonObject5);
			return new brs(this.a(string6), cbi7, boolean8, integer9);
		}

		private kq a(String string) {
			kq kq3 = new kq(string);
			return new kq(kq3.b(), "block/" + kq3.a());
		}

		private boolean d(JsonObject jsonObject) {
			return ok.a(jsonObject, "uvlock", false);
		}

		protected cbi a(JsonObject jsonObject) {
			int integer3 = ok.a(jsonObject, "x", 0);
			int integer4 = ok.a(jsonObject, "y", 0);
			cbi cbi5 = cbi.a(integer3, integer4);
			if (cbi5 == null) {
				throw new JsonParseException("Invalid BlockModelRotation x: " + integer3 + ", y: " + integer4);
			} else {
				return cbi5;
			}
		}

		protected String b(JsonObject jsonObject) {
			return ok.h(jsonObject, "model");
		}

		protected int c(JsonObject jsonObject) {
			int integer3 = ok.a(jsonObject, "weight", 1);
			if (integer3 < 1) {
				throw new JsonParseException("Invalid weight " + integer3 + " found, expected integer >= 1");
			} else {
				return integer3;
			}
		}
	}
}
