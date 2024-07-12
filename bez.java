import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class bez {
	private final String a;
	private final String b;
	private final String c;
	private final bez.a d;

	public bez(String string1, String string2, String string3, String string4) {
		this.a = string1;
		this.b = string2;
		this.c = string3;
		this.d = bez.a.a(string4);
	}

	public String a() {
		return "token:" + this.c + ":" + this.b;
	}

	public String b() {
		return this.b;
	}

	public String c() {
		return this.a;
	}

	public String d() {
		return this.c;
	}

	public GameProfile e() {
		try {
			UUID uUID2 = UUIDTypeAdapter.fromString(this.b());
			return new GameProfile(uUID2, this.c());
		} catch (IllegalArgumentException var2) {
			return new GameProfile(null, this.c());
		}
	}

	public static enum a {
		LEGACY("legacy"),
		MOJANG("mojang");

		private static final Map<String, bez.a> c = Maps.newHashMap();
		private final String d;

		private a(String string3) {
			this.d = string3;
		}

		@Nullable
		public static bez.a a(String string) {
			return (bez.a)c.get(string.toLowerCase(Locale.ROOT));
		}

		static {
			for (bez.a a4 : values()) {
				c.put(a4.d, a4);
			}
		}
	}
}
