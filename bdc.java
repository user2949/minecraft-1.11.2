import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

public class bdc implements bdd {
	private final Map<String, bco> a;
	private final bcl.b b;

	public bdc(Map<String, bco> map, bcl.b b) {
		this.a = map;
		this.b = b;
	}

	@Override
	public boolean a(Random random, bcl bcl) {
		sn sn4 = bcl.a(this.b);
		if (sn4 == null) {
			return false;
		} else {
			bec bec5 = sn4.l.ad();

			for (Entry<String, bco> entry7 : this.a.entrySet()) {
				if (!this.a(sn4, bec5, (String)entry7.getKey(), (bco)entry7.getValue())) {
					return false;
				}
			}

			return true;
		}
	}

	protected boolean a(sn sn, bec bec, String string, bco bco) {
		bdy bdy6 = bec.b(string);
		if (bdy6 == null) {
			return false;
		} else {
			String string7 = sn instanceof ly ? sn.h_() : sn.bf();
			return !bec.b(string7, bdy6) ? false : bco.a(bec.c(string7, bdy6).c());
		}
	}

	public static class a extends bdd.a<bdc> {
		protected a() {
			super(new kq("entity_scores"), bdc.class);
		}

		public void a(JsonObject jsonObject, bdc bdc, JsonSerializationContext jsonSerializationContext) {
			JsonObject jsonObject5 = new JsonObject();

			for (Entry<String, bco> entry7 : bdc.a.entrySet()) {
				jsonObject5.add((String)entry7.getKey(), jsonSerializationContext.serialize(entry7.getValue()));
			}

			jsonObject.add("scores", jsonObject5);
			jsonObject.add("entity", jsonSerializationContext.serialize(bdc.b));
		}

		public bdc b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
			Set<Entry<String, JsonElement>> set4 = ok.t(jsonObject, "scores").entrySet();
			Map<String, bco> map5 = Maps.newLinkedHashMap();

			for (Entry<String, JsonElement> entry7 : set4) {
				map5.put(entry7.getKey(), ok.a((JsonElement)entry7.getValue(), "score", jsonDeserializationContext, bco.class));
			}

			return new bdc(map5, ok.a(jsonObject, "entity", jsonDeserializationContext, bcl.b.class));
		}
	}
}
