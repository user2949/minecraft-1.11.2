import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ou {
	private static final Logger b = LogManager.getLogger();
	private final List<String> c = Lists.newArrayList();
	private final List<Long> d = Lists.newArrayList();
	public boolean a;
	private String e = "";
	private final Map<String, Long> f = Maps.newHashMap();

	public void a() {
		this.f.clear();
		this.e = "";
		this.c.clear();
	}

	public void a(String string) {
		if (this.a) {
			if (this.e.length() > 0) {
				this.e = this.e + ".";
			}

			this.e = this.e + string;
			this.c.add(this.e);
			this.d.add(System.nanoTime());
		}
	}

	public void b() {
		if (this.a) {
			long long2 = System.nanoTime();
			long long4 = (Long)this.d.remove(this.d.size() - 1);
			this.c.remove(this.c.size() - 1);
			long long6 = long2 - long4;
			if (this.f.containsKey(this.e)) {
				this.f.put(this.e, (Long)this.f.get(this.e) + long6);
			} else {
				this.f.put(this.e, long6);
			}

			if (long6 > 100000000L) {
				b.warn("Something's taking too long! '{}' took aprox {} ms", new Object[]{this.e, (double)long6 / 1000000.0});
			}

			this.e = this.c.isEmpty() ? "" : (String)this.c.get(this.c.size() - 1);
		}
	}

	public List<ou.a> b(String string) {
		if (!this.a) {
			return Collections.emptyList();
		} else {
			String string3 = string;
			long long4 = this.f.containsKey("root") ? (Long)this.f.get("root") : 0L;
			long long6 = this.f.containsKey(string) ? (Long)this.f.get(string) : -1L;
			List<ou.a> list8 = Lists.newArrayList();
			if (string.length() > 0) {
				string = string + ".";
			}

			long long9 = 0L;

			for (String string12 : this.f.keySet()) {
				if (string12.length() > string.length() && string12.startsWith(string) && string12.indexOf(".", string.length() + 1) < 0) {
					long9 += this.f.get(string12);
				}
			}

			float float11 = (float)long9;
			if (long9 < long6) {
				long9 = long6;
			}

			if (long4 < long9) {
				long4 = long9;
			}

			for (String string13 : this.f.keySet()) {
				if (string13.length() > string.length() && string13.startsWith(string) && string13.indexOf(".", string.length() + 1) < 0) {
					long long14 = (Long)this.f.get(string13);
					double double16 = (double)long14 * 100.0 / (double)long9;
					double double18 = (double)long14 * 100.0 / (double)long4;
					String string20 = string13.substring(string.length());
					list8.add(new ou.a(string20, double16, double18));
				}
			}

			for (String string13x : this.f.keySet()) {
				this.f.put(string13x, (Long)this.f.get(string13x) * 999L / 1000L);
			}

			if ((float)long9 > float11) {
				list8.add(new ou.a("unspecified", (double)((float)long9 - float11) * 100.0 / (double)long9, (double)((float)long9 - float11) * 100.0 / (double)long4));
			}

			Collections.sort(list8);
			list8.add(0, new ou.a(string3, 100.0, (double)long9 * 100.0 / (double)long4));
			return list8;
		}
	}

	public void c(String string) {
		this.b();
		this.a(string);
	}

	public String c() {
		return this.c.size() == 0 ? "[UNKNOWN]" : (String)this.c.get(this.c.size() - 1);
	}

	public static final class a implements Comparable<ou.a> {
		public double a;
		public double b;
		public String c;

		public a(String string, double double2, double double3) {
			this.c = string;
			this.a = double2;
			this.b = double3;
		}

		public int compareTo(ou.a a) {
			if (a.a < this.a) {
				return -1;
			} else {
				return a.a > this.a ? 1 : a.c.compareTo(this.c);
			}
		}

		public int a() {
			return (this.c.hashCode() & 11184810) + 4473924;
		}
	}
}
