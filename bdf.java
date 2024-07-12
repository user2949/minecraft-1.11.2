import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

public class bdf implements bdd {
	private final bdl[] a;
	private final bcl.b b;

	public bdf(bdl[] arr, bcl.b b) {
		this.a = arr;
		this.b = b;
	}

	@Override
	public boolean a(Random random, bcl bcl) {
		sn sn4 = bcl.a(this.b);
		if (sn4 == null) {
			return false;
		} else {
			for (bdl bdl8 : this.a) {
				if (!bdl8.a(random, sn4)) {
					return false;
				}
			}

			return true;
		}
	}

	public static class a extends bdd.a<bdf> {
		protected a() {
			super(new kq("entity_properties"), bdf.class);
		}

		public void a(JsonObject jsonObject, bdf bdf, JsonSerializationContext jsonSerializationContext) {
			JsonObject jsonObject5 = new JsonObject();

			for (bdl bdl9 : bdf.a) {
				bdl.a<bdl> a10 = bdk.a(bdl9);
				jsonObject5.add(a10.a().toString(), a10.a(bdl9, jsonSerializationContext));
			}

			jsonObject.add("properties", jsonObject5);
			jsonObject.add("entity", jsonSerializationContext.serialize(bdf.b));
		}

		public bdf b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
			Set<Entry<String, JsonElement>> set4 = ok.t(jsonObject, "properties").entrySet();
			bdl[] arr5 = new bdl[set4.size()];
			int integer6 = 0;

			for (Entry<String, JsonElement> entry8 : set4) {
				arr5[integer6++] = bdk.a(new kq((String)entry8.getKey())).a((JsonElement)entry8.getValue(), jsonDeserializationContext);
			}

			return new bdf(arr5, ok.a(jsonObject, "entity", jsonDeserializationContext, bcl.b.class));
		}
	}
}
