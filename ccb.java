import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class ccb implements JsonDeserializer<cca> {
	public cca deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
		JsonObject jsonObject5 = ok.m(jsonElement, "entry");
		boolean boolean6 = ok.a(jsonObject5, "replace", false);
		String string7 = ok.a(jsonObject5, "subtitle", null);
		List<cbz> list8 = this.a(jsonObject5);
		return new cca(list8, boolean6, string7);
	}

	private List<cbz> a(JsonObject jsonObject) {
		List<cbz> list3 = Lists.newArrayList();
		if (jsonObject.has("sounds")) {
			JsonArray jsonArray4 = ok.u(jsonObject, "sounds");

			for (int integer5 = 0; integer5 < jsonArray4.size(); integer5++) {
				JsonElement jsonElement6 = jsonArray4.get(integer5);
				if (ok.a(jsonElement6)) {
					String string7 = ok.a(jsonElement6, "sound");
					list3.add(new cbz(string7, 1.0F, 1.0F, 1, cbz.a.FILE, false));
				} else {
					list3.add(this.b(ok.m(jsonElement6, "sound")));
				}
			}
		}

		return list3;
	}

	private cbz b(JsonObject jsonObject) {
		String string3 = ok.h(jsonObject, "name");
		cbz.a a4 = this.a(jsonObject, cbz.a.FILE);
		float float5 = ok.a(jsonObject, "volume", 1.0F);
		Validate.isTrue(float5 > 0.0F, "Invalid volume", new Object[0]);
		float float6 = ok.a(jsonObject, "pitch", 1.0F);
		Validate.isTrue(float6 > 0.0F, "Invalid pitch", new Object[0]);
		int integer7 = ok.a(jsonObject, "weight", 1);
		Validate.isTrue(integer7 > 0, "Invalid weight", new Object[0]);
		boolean boolean8 = ok.a(jsonObject, "stream", false);
		return new cbz(string3, float5, float6, integer7, a4, boolean8);
	}

	private cbz.a a(JsonObject jsonObject, cbz.a a) {
		cbz.a a4 = a;
		if (jsonObject.has("type")) {
			a4 = cbz.a.a(ok.h(jsonObject, "type"));
			Validate.notNull(a4, "Invalid type", new Object[0]);
		}

		return a4;
	}
}
