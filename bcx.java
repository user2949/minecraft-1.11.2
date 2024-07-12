import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bcx extends bcr {
	private static final Logger a = LogManager.getLogger();
	private final bco b;

	public bcx(bdd[] arr, bco bco) {
		super(arr);
		this.b = bco;
	}

	@Override
	public afj a(afj afj, Random random, bcl bcl) {
		if (afj.f()) {
			a.warn("Couldn't set data of loot item {}", new Object[]{afj});
		} else {
			afj.b(this.b.a(random));
		}

		return afj;
	}

	public static class a extends bcr.a<bcx> {
		protected a() {
			super(new kq("set_data"), bcx.class);
		}

		public void a(JsonObject jsonObject, bcx bcx, JsonSerializationContext jsonSerializationContext) {
			jsonObject.add("data", jsonSerializationContext.serialize(bcx.b));
		}

		public bcx b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, bdd[] arr) {
			return new bcx(arr, ok.a(jsonObject, "data", jsonDeserializationContext, bco.class));
		}
	}
}
