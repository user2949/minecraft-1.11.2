import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class bcv extends bcr {
	private final bco a;

	public bcv(bdd[] arr, bco bco) {
		super(arr);
		this.a = bco;
	}

	@Override
	public afj a(afj afj, Random random, bcl bcl) {
		afj.e(this.a.a(random));
		return afj;
	}

	public static class a extends bcr.a<bcv> {
		protected a() {
			super(new kq("set_count"), bcv.class);
		}

		public void a(JsonObject jsonObject, bcv bcv, JsonSerializationContext jsonSerializationContext) {
			jsonObject.add("count", jsonSerializationContext.serialize(bcv.a));
		}

		public bcv b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, bdd[] arr) {
			return new bcv(arr, ok.a(jsonObject, "count", jsonDeserializationContext, bco.class));
		}
	}
}
