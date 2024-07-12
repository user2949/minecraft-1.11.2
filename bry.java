import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bry {
	private final bru a;
	private final brr b;

	public bry(bru bru, brr brr) {
		if (bru == null) {
			throw new IllegalArgumentException("Missing condition for selector");
		} else if (brr == null) {
			throw new IllegalArgumentException("Missing variant for selector");
		} else {
			this.a = bru;
			this.b = brr;
		}
	}

	public brr a() {
		return this.b;
	}

	public Predicate<atl> a(atm atm) {
		return this.a.a(atm);
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else {
			if (object instanceof bry) {
				bry bry3 = (bry)object;
				if (this.a.equals(bry3.a)) {
					return this.b.equals(bry3.b);
				}
			}

			return false;
		}
	}

	public int hashCode() {
		return 31 * this.a.hashCode() + this.b.hashCode();
	}

	public static class a implements JsonDeserializer<bry> {
		private static final Function<JsonElement, bru> a = new Function<JsonElement, bru>() {
			@Nullable
			public bru apply(@Nullable JsonElement jsonElement) {
				return jsonElement == null ? null : bry.a.a(jsonElement.getAsJsonObject());
			}
		};
		private static final Function<Entry<String, JsonElement>, bru> b = new Function<Entry<String, JsonElement>, bru>() {
			@Nullable
			public bru apply(@Nullable Entry<String, JsonElement> entry) {
				return entry == null ? null : bry.a.b(entry);
			}
		};

		public bry deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = jsonElement.getAsJsonObject();
			return new bry(this.b(jsonObject5), (brr)jsonDeserializationContext.deserialize(jsonObject5.get("apply"), brr.class));
		}

		private bru b(JsonObject jsonObject) {
			return jsonObject.has("when") ? a(ok.t(jsonObject, "when")) : bru.a;
		}

		@VisibleForTesting
		static bru a(JsonObject jsonObject) {
			Set<Entry<String, JsonElement>> set2 = jsonObject.entrySet();
			if (set2.isEmpty()) {
				throw new JsonParseException("No elements found in selector");
			} else if (set2.size() == 1) {
				if (jsonObject.has("OR")) {
					return new brx(Iterables.transform(ok.u(jsonObject, "OR"), a));
				} else {
					return (bru)(jsonObject.has("AND") ? new brt(Iterables.transform(ok.u(jsonObject, "AND"), a)) : b((Entry<String, JsonElement>)set2.iterator().next()));
				}
			} else {
				return new brt(Iterables.transform(set2, b));
			}
		}

		private static brv b(Entry<String, JsonElement> entry) {
			return new brv((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
		}
	}
}
