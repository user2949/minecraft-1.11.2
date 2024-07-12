import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;

public class brw {
	private final List<bry> a;
	private atm b;

	public brw(List<bry> list) {
		this.a = list;
	}

	public List<bry> a() {
		return this.a;
	}

	public Set<brr> b() {
		Set<brr> set2 = Sets.newHashSet();

		for (bry bry4 : this.a) {
			set2.add(bry4.a());
		}

		return set2;
	}

	public void a(atm atm) {
		this.b = atm;
	}

	public atm c() {
		return this.b;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else {
			if (object instanceof brw) {
				brw brw3 = (brw)object;
				if (this.a.equals(brw3.a)) {
					if (this.b == null) {
						return brw3.b == null;
					}

					return this.b.equals(brw3.b);
				}
			}

			return false;
		}
	}

	public int hashCode() {
		return 31 * this.a.hashCode() + (this.b == null ? 0 : this.b.hashCode());
	}

	public static class a implements JsonDeserializer<brw> {
		public brw deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			return new brw(this.a(jsonDeserializationContext, jsonElement.getAsJsonArray()));
		}

		private List<bry> a(JsonDeserializationContext jsonDeserializationContext, JsonArray jsonArray) {
			List<bry> list4 = Lists.newArrayList();

			for (JsonElement jsonElement6 : jsonArray) {
				list4.add((bry)jsonDeserializationContext.deserialize(jsonElement6, bry.class));
			}

			return list4;
		}
	}
}
