import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class cak {
	private static final Splitter b = Splitter.on('=').limit(2);
	private static final Pattern c = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
	Map<String, String> a = Maps.newHashMap();
	private boolean d;

	public synchronized void a(bzy bzy, List<String> list) {
		this.a.clear();

		for (String string5 : list) {
			String string6 = String.format("lang/%s.lang", string5);

			for (String string8 : bzy.a()) {
				try {
					this.a(bzy.b(new kq(string8, string6)));
				} catch (IOException var9) {
				}
			}
		}

		this.b();
	}

	public boolean a() {
		return this.d;
	}

	private void b() {
		this.d = false;
		int integer2 = 0;
		int integer3 = 0;

		for (String string5 : this.a.values()) {
			int integer6 = string5.length();
			integer3 += integer6;

			for (int integer7 = 0; integer7 < integer6; integer7++) {
				if (string5.charAt(integer7) >= 256) {
					integer2++;
				}
			}
		}

		float float4 = (float)integer2 / (float)integer3;
		this.d = (double)float4 > 0.1;
	}

	private void a(List<bzx> list) throws IOException {
		for (bzx bzx4 : list) {
			InputStream inputStream5 = bzx4.b();

			try {
				this.a(inputStream5);
			} finally {
				IOUtils.closeQuietly(inputStream5);
			}
		}
	}

	private void a(InputStream inputStream) throws IOException {
		for (String string4 : IOUtils.readLines(inputStream, Charsets.UTF_8)) {
			if (!string4.isEmpty() && string4.charAt(0) != '#') {
				String[] arr5 = (String[])Iterables.toArray(b.split(string4), String.class);
				if (arr5 != null && arr5.length == 2) {
					String string6 = arr5[0];
					String string7 = c.matcher(arr5[1]).replaceAll("%$1s");
					this.a.put(string6, string7);
				}
			}
		}
	}

	private String b(String string) {
		String string3 = (String)this.a.get(string);
		return string3 == null ? string : string3;
	}

	public String a(String string, Object[] arr) {
		String string4 = this.b(string);

		try {
			return String.format(string4, arr);
		} catch (IllegalFormatException var5) {
			return "Format error: " + string4;
		}
	}

	public boolean a(String string) {
		return this.a.containsKey(string);
	}
}
