import com.google.gson.JsonObject;
import java.util.Date;

public class mr extends mo<String> {
	public mr(String string) {
		this(string, null, null, null, null);
	}

	public mr(String string1, Date date2, String string3, Date date4, String string5) {
		super(string1, date2, string3, date4, string5);
	}

	public mr(JsonObject jsonObject) {
		super(b(jsonObject), jsonObject);
	}

	private static String b(JsonObject jsonObject) {
		return jsonObject.has("ip") ? jsonObject.get("ip").getAsString() : null;
	}

	@Override
	protected void a(JsonObject jsonObject) {
		if (this.f() != null) {
			jsonObject.addProperty("ip", this.f());
			super.a(jsonObject);
		}
	}
}
