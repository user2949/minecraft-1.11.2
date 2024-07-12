import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class bdi implements bdd {
	private final float a;
	private final float b;

	public bdi(float float1, float float2) {
		this.a = float1;
		this.b = float2;
	}

	@Override
	public boolean a(Random random, bcl bcl) {
		int integer4 = 0;
		if (bcl.c() instanceof sw) {
			integer4 = aik.g((sw)bcl.c());
		}

		return random.nextFloat() < this.a + (float)integer4 * this.b;
	}

	public static class a extends bdd.a<bdi> {
		protected a() {
			super(new kq("random_chance_with_looting"), bdi.class);
		}

		public void a(JsonObject jsonObject, bdi bdi, JsonSerializationContext jsonSerializationContext) {
			jsonObject.addProperty("chance", bdi.a);
			jsonObject.addProperty("looting_multiplier", bdi.b);
		}

		public bdi b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
			return new bdi(ok.l(jsonObject, "chance"), ok.l(jsonObject, "looting_multiplier"));
		}
	}
}
