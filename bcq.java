import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class bcq extends bcr {
	private final bco a;
	private final boolean b;

	public bcq(bdd[] arr, bco bco, boolean boolean3) {
		super(arr);
		this.a = bco;
		this.b = boolean3;
	}

	@Override
	public afj a(afj afj, Random random, bcl bcl) {
		return aik.a(random, afj, this.a.a(random), this.b);
	}

	public static class a extends bcr.a<bcq> {
		public a() {
			super(new kq("enchant_with_levels"), bcq.class);
		}

		public void a(JsonObject jsonObject, bcq bcq, JsonSerializationContext jsonSerializationContext) {
			jsonObject.add("levels", jsonSerializationContext.serialize(bcq.a));
			jsonObject.addProperty("treasure", bcq.b);
		}

		public bcq b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, bdd[] arr) {
			bco bco5 = ok.a(jsonObject, "levels", jsonDeserializationContext, bco.class);
			boolean boolean6 = ok.a(jsonObject, "treasure", false);
			return new bcq(arr, bco5, boolean6);
		}
	}
}
