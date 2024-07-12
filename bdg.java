import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class bdg implements bdd {
	private final boolean a;

	public bdg(boolean boolean1) {
		this.a = boolean1;
	}

	@Override
	public boolean a(Random random, bcl bcl) {
		boolean boolean4 = bcl.b() != null;
		return boolean4 == !this.a;
	}

	public static class a extends bdd.a<bdg> {
		protected a() {
			super(new kq("killed_by_player"), bdg.class);
		}

		public void a(JsonObject jsonObject, bdg bdg, JsonSerializationContext jsonSerializationContext) {
			jsonObject.addProperty("inverse", bdg.a);
		}

		public bdg b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
			return new bdg(ok.a(jsonObject, "inverse", false));
		}
	}
}
