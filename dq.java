import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.util.IllegalFormatException;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class dq {
	private static final Pattern a = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
	private static final Splitter b = Splitter.on('=').limit(2);
	private static final dq c = new dq();
	private final Map<String, String> d = Maps.newHashMap();
	private long e;

	public dq() {
		try {
			InputStream inputStream2 = dq.class.getResourceAsStream("/assets/minecraft/lang/en_us.lang");

			for (String string4 : IOUtils.readLines(inputStream2, Charsets.UTF_8)) {
				if (!string4.isEmpty() && string4.charAt(0) != '#') {
					String[] arr5 = (String[])Iterables.toArray(b.split(string4), String.class);
					if (arr5 != null && arr5.length == 2) {
						String string6 = arr5[0];
						String string7 = a.matcher(arr5[1]).replaceAll("%$1s");
						this.d.put(string6, string7);
					}
				}
			}

			this.e = System.currentTimeMillis();
		} catch (IOException var7) {
		}
	}

	static dq a() {
		return c;
	}

	public static synchronized void a(Map<String, String> map) {
		c.d.clear();
		c.d.putAll(map);
		c.e = System.currentTimeMillis();
	}

	public synchronized String a(String string) {
		return this.c(string);
	}

	public synchronized String a(String string, Object... arr) {
		String string4 = this.c(string);

		try {
			return String.format(string4, arr);
		} catch (IllegalFormatException var5) {
			return "Format error: " + string4;
		}
	}

	private String c(String string) {
		String string3 = (String)this.d.get(string);
		return string3 == null ? string : string3;
	}

	public synchronized boolean b(String string) {
		return this.d.containsKey(string);
	}

	public long c() {
		return this.e;
	}
}
