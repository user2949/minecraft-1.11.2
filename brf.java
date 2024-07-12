import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class brf {
	public static final cv a = null;
	public final cv b;
	public final int c;
	public final String d;
	public final brh e;

	public brf(@Nullable cv cv, int integer, String string, brh brh) {
		this.b = cv;
		this.c = integer;
		this.d = string;
		this.e = brh;
	}

	static class a implements JsonDeserializer<brf> {
		public brf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = jsonElement.getAsJsonObject();
			cv cv6 = this.c(jsonObject5);
			int integer7 = this.a(jsonObject5);
			String string8 = this.b(jsonObject5);
			brh brh9 = (brh)jsonDeserializationContext.deserialize(jsonObject5, brh.class);
			return new brf(cv6, integer7, string8, brh9);
		}

		protected int a(JsonObject jsonObject) {
			return ok.a(jsonObject, "tintindex", -1);
		}

		private String b(JsonObject jsonObject) {
			return ok.h(jsonObject, "texture");
		}

		@Nullable
		private cv c(JsonObject jsonObject) {
			String string3 = ok.a(jsonObject, "cullface", "");
			return cv.a(string3);
		}
	}
}
