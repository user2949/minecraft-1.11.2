import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bcu extends bcr {
	private static final Logger a = LogManager.getLogger();
	private final bcu.a[] b;

	public bcu(bdd[] arr, bcu.a[] arr) {
		super(arr);
		this.b = arr;
	}

	@Override
	public afj a(afj afj, Random random, bcl bcl) {
		for (bcu.a a8 : this.b) {
			UUID uUID9 = a8.e;
			if (uUID9 == null) {
				uUID9 = UUID.randomUUID();
			}

			ss ss10 = a8.f[random.nextInt(a8.f.length)];
			afj.a(a8.b, new tl(uUID9, a8.a, (double)a8.d.b(random), a8.c), ss10);
		}

		return afj;
	}

	static class a {
		private final String a;
		private final String b;
		private final int c;
		private final bco d;
		@Nullable
		private final UUID e;
		private final ss[] f;

		private a(String string1, String string2, int integer, bco bco, ss[] arr, @Nullable UUID uUID) {
			this.a = string1;
			this.b = string2;
			this.c = integer;
			this.d = bco;
			this.e = uUID;
			this.f = arr;
		}

		public JsonObject a(JsonSerializationContext jsonSerializationContext) {
			JsonObject jsonObject3 = new JsonObject();
			jsonObject3.addProperty("name", this.a);
			jsonObject3.addProperty("attribute", this.b);
			jsonObject3.addProperty("operation", a(this.c));
			jsonObject3.add("amount", jsonSerializationContext.serialize(this.d));
			if (this.e != null) {
				jsonObject3.addProperty("id", this.e.toString());
			}

			if (this.f.length == 1) {
				jsonObject3.addProperty("slot", this.f[0].d());
			} else {
				JsonArray jsonArray4 = new JsonArray();

				for (ss ss8 : this.f) {
					jsonArray4.add(new JsonPrimitive(ss8.d()));
				}

				jsonObject3.add("slot", jsonArray4);
			}

			return jsonObject3;
		}

		public static bcu.a a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
			String string3 = ok.h(jsonObject, "name");
			String string4 = ok.h(jsonObject, "attribute");
			int integer5 = a(ok.h(jsonObject, "operation"));
			bco bco6 = ok.a(jsonObject, "amount", jsonDeserializationContext, bco.class);
			UUID uUID8 = null;
			ss[] arr7;
			if (ok.a(jsonObject, "slot")) {
				arr7 = new ss[]{ss.a(ok.h(jsonObject, "slot"))};
			} else {
				if (!ok.d(jsonObject, "slot")) {
					throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
				}

				JsonArray jsonArray9 = ok.u(jsonObject, "slot");
				arr7 = new ss[jsonArray9.size()];
				int integer10 = 0;

				for (JsonElement jsonElement12 : jsonArray9) {
					arr7[integer10++] = ss.a(ok.a(jsonElement12, "slot"));
				}

				if (arr7.length == 0) {
					throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
				}
			}

			if (jsonObject.has("id")) {
				String string9 = ok.h(jsonObject, "id");

				try {
					uUID8 = UUID.fromString(string9);
				} catch (IllegalArgumentException var12) {
					throw new JsonSyntaxException("Invalid attribute modifier id '" + string9 + "' (must be UUID format, with dashes)");
				}
			}

			return new bcu.a(string3, string4, integer5, bco6, arr7, uUID8);
		}

		private static String a(int integer) {
			switch (integer) {
				case 0:
					return "addition";
				case 1:
					return "multiply_base";
				case 2:
					return "multiply_total";
				default:
					throw new IllegalArgumentException("Unknown operation " + integer);
			}
		}

		private static int a(String string) {
			if ("addition".equals(string)) {
				return 0;
			} else if ("multiply_base".equals(string)) {
				return 1;
			} else if ("multiply_total".equals(string)) {
				return 2;
			} else {
				throw new JsonSyntaxException("Unknown attribute modifier operation " + string);
			}
		}
	}

	public static class b extends bcr.a<bcu> {
		public b() {
			super(new kq("set_attributes"), bcu.class);
		}

		public void a(JsonObject jsonObject, bcu bcu, JsonSerializationContext jsonSerializationContext) {
			JsonArray jsonArray5 = new JsonArray();

			for (bcu.a a9 : bcu.b) {
				jsonArray5.add(a9.a(jsonSerializationContext));
			}

			jsonObject.add("modifiers", jsonArray5);
		}

		public bcu b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, bdd[] arr) {
			JsonArray jsonArray5 = ok.u(jsonObject, "modifiers");
			bcu.a[] arr6 = new bcu.a[jsonArray5.size()];
			int integer7 = 0;

			for (JsonElement jsonElement9 : jsonArray5) {
				arr6[integer7++] = bcu.a.a(ok.m(jsonElement9, "modifier"), jsonDeserializationContext);
			}

			if (arr6.length == 0) {
				throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
			} else {
				return new bcu(arr, arr6);
			}
		}
	}
}
