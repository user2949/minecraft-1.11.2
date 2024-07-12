import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bcw extends bcr {
	private static final Logger a = LogManager.getLogger();
	private final bco b;

	public bcw(bdd[] arr, bco bco) {
		super(arr);
		this.b = bco;
	}

	@Override
	public afj a(afj afj, Random random, bcl bcl) {
		if (afj.f()) {
			float float5 = 1.0F - this.b.b(random);
			afj.b(ot.d(float5 * (float)afj.k()));
		} else {
			a.warn("Couldn't set damage of loot item {}", new Object[]{afj});
		}

		return afj;
	}

	public static class a extends bcr.a<bcw> {
		protected a() {
			super(new kq("set_damage"), bcw.class);
		}

		public void a(JsonObject jsonObject, bcw bcw, JsonSerializationContext jsonSerializationContext) {
			jsonObject.add("damage", jsonSerializationContext.serialize(bcw.b));
		}

		public bcw b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, bdd[] arr) {
			return new bcw(arr, ok.a(jsonObject, "damage", jsonDeserializationContext, bco.class));
		}
	}
}
