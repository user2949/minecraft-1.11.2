import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class bdm implements bdl {
	private final boolean a;

	public bdm(boolean boolean1) {
		this.a = boolean1;
	}

	@Override
	public boolean a(Random random, sn sn) {
		return sn.aJ() == this.a;
	}

	public static class a extends bdl.a<bdm> {
		protected a() {
			super(new kq("on_fire"), bdm.class);
		}

		public JsonElement a(bdm bdm, JsonSerializationContext jsonSerializationContext) {
			return new JsonPrimitive(bdm.a);
		}

		public bdm a(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) {
			return new bdm(ok.c(jsonElement, "on_fire"));
		}
	}
}
