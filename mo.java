import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class mo<T> extends mw<T> {
	public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
	protected final Date b;
	protected final String c;
	protected final Date d;
	protected final String e;

	public mo(T object, Date date2, String string3, Date date4, String string5) {
		super(object);
		this.b = date2 == null ? new Date() : date2;
		this.c = string3 == null ? "(Unknown)" : string3;
		this.d = date4;
		this.e = string5 == null ? "Banned by an operator." : string5;
	}

	protected mo(T object, JsonObject jsonObject) {
		super(object, jsonObject);

		Date date4;
		try {
			date4 = jsonObject.has("created") ? a.parse(jsonObject.get("created").getAsString()) : new Date();
		} catch (ParseException var7) {
			date4 = new Date();
		}

		this.b = date4;
		this.c = jsonObject.has("source") ? jsonObject.get("source").getAsString() : "(Unknown)";

		Date date5;
		try {
			date5 = jsonObject.has("expires") ? a.parse(jsonObject.get("expires").getAsString()) : null;
		} catch (ParseException var6) {
			date5 = null;
		}

		this.d = date5;
		this.e = jsonObject.has("reason") ? jsonObject.get("reason").getAsString() : "Banned by an operator.";
	}

	public Date c() {
		return this.d;
	}

	public String d() {
		return this.e;
	}

	@Override
	boolean e() {
		return this.d == null ? false : this.d.before(new Date());
	}

	@Override
	protected void a(JsonObject jsonObject) {
		jsonObject.addProperty("created", a.format(this.b));
		jsonObject.addProperty("source", this.c);
		jsonObject.addProperty("expires", this.d == null ? "forever" : a.format(this.d));
		jsonObject.addProperty("reason", this.e);
	}
}
