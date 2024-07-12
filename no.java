import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public enum no {
	MASTER("master"),
	MUSIC("music"),
	RECORDS("record"),
	WEATHER("weather"),
	BLOCKS("block"),
	HOSTILE("hostile"),
	NEUTRAL("neutral"),
	PLAYERS("player"),
	AMBIENT("ambient"),
	VOICE("voice");

	private static final Map<String, no> k = Maps.newHashMap();
	private final String l;

	private no(String string3) {
		this.l = string3;
	}

	public String a() {
		return this.l;
	}

	public static no a(String string) {
		return (no)k.get(string);
	}

	public static Set<String> b() {
		return k.keySet();
	}

	static {
		for (no no4 : values()) {
			if (k.containsKey(no4.a())) {
				throw new Error("Clash in Sound Category name pools! Cannot insert " + no4);
			}

			k.put(no4.a(), no4);
		}
	}
}
