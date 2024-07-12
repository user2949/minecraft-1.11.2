import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.ArrayUtils;

public class bci {
	private final bcj[] a;
	private final bdd[] b;
	private final bco c;
	private final bco d;

	public bci(bcj[] arr, bdd[] arr, bco bco3, bco bco4) {
		this.a = arr;
		this.b = arr;
		this.c = bco3;
		this.d = bco4;
	}

	protected void a(Collection<afj> collection, Random random, bcl bcl) {
		List<bcj> list5 = Lists.newArrayList();
		int integer6 = 0;

		for (bcj bcj10 : this.a) {
			if (bde.a(bcj10.e, random, bcl)) {
				int integer11 = bcj10.a(bcl.f());
				if (integer11 > 0) {
					list5.add(bcj10);
					integer6 += integer11;
				}
			}
		}

		if (integer6 != 0 && !list5.isEmpty()) {
			int integer7 = random.nextInt(integer6);

			for (bcj bcj9 : list5) {
				integer7 -= bcj9.a(bcl.f());
				if (integer7 < 0) {
					bcj9.a(collection, random, bcl);
					return;
				}
			}
		}
	}

	public void b(Collection<afj> collection, Random random, bcl bcl) {
		if (bde.a(this.b, random, bcl)) {
			int integer5 = this.c.a(random) + ot.d(this.d.b(random) * bcl.f());

			for (int integer6 = 0; integer6 < integer5; integer6++) {
				this.a(collection, random, bcl);
			}
		}
	}

	public static class a implements JsonDeserializer<bci>, JsonSerializer<bci> {
		public bci deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = ok.m(jsonElement, "loot pool");
			bcj[] arr6 = ok.a(jsonObject5, "entries", jsonDeserializationContext, bcj[].class);
			bdd[] arr7 = ok.a(jsonObject5, "conditions", new bdd[0], jsonDeserializationContext, bdd[].class);
			bco bco8 = ok.a(jsonObject5, "rolls", jsonDeserializationContext, bco.class);
			bco bco9 = ok.a(jsonObject5, "bonus_rolls", new bco(0.0F, 0.0F), jsonDeserializationContext, bco.class);
			return new bci(arr6, arr7, bco8, bco9);
		}

		public JsonElement serialize(bci bci, Type type, JsonSerializationContext jsonSerializationContext) {
			JsonObject jsonObject5 = new JsonObject();
			jsonObject5.add("entries", jsonSerializationContext.serialize(bci.a));
			jsonObject5.add("rolls", jsonSerializationContext.serialize(bci.c));
			if (bci.d.a() != 0.0F && bci.d.b() != 0.0F) {
				jsonObject5.add("bonus_rolls", jsonSerializationContext.serialize(bci.d));
			}

			if (!ArrayUtils.isEmpty(bci.b)) {
				jsonObject5.add("conditions", jsonSerializationContext.serialize(bci.b));
			}

			return jsonObject5;
		}
	}
}
