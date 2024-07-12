import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class bct extends bcr {
	private final bco a;
	private final int b;

	public bct(bdd[] arr, bco bco, int integer) {
		super(arr);
		this.a = bco;
		this.b = integer;
	}

	@Override
	public afj a(afj afj, Random random, bcl bcl) {
		sn sn5 = bcl.c();
		if (sn5 instanceof sw) {
			int integer6 = aik.g((sw)sn5);
			if (integer6 == 0) {
				return afj;
			}

			float float7 = (float)integer6 * this.a.b(random);
			afj.f(Math.round(float7));
			if (this.b != 0 && afj.E() > this.b) {
				afj.e(this.b);
			}
		}

		return afj;
	}

	public static class a extends bcr.a<bct> {
		protected a() {
			super(new kq("looting_enchant"), bct.class);
		}

		public void a(JsonObject jsonObject, bct bct, JsonSerializationContext jsonSerializationContext) {
			jsonObject.add("count", jsonSerializationContext.serialize(bct.a));
			if (bct.b > 0) {
				jsonObject.add("limit", jsonSerializationContext.serialize(bct.b));
			}
		}

		public bct b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, bdd[] arr) {
			int integer5 = ok.a(jsonObject, "limit", 0);
			return new bct(arr, ok.a(jsonObject, "count", jsonDeserializationContext, bco.class), integer5);
		}
	}
}
