import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class bdh implements bdd {
	private final float a;

	public bdh(float float1) {
		this.a = float1;
	}

	@Override
	public boolean a(Random random, bcl bcl) {
		return random.nextFloat() < this.a;
	}

	public static class a extends bdd.a<bdh> {
		protected a() {
			super(new kq("random_chance"), bdh.class);
		}

		public void a(JsonObject jsonObject, bdh bdh, JsonSerializationContext jsonSerializationContext) {
			jsonObject.addProperty("chance", bdh.a);
		}

		public bdh b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
			return new bdh(ok.l(jsonObject, "chance"));
		}
	}
}
