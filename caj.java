import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class caj implements bzz {
	private static final Logger b = LogManager.getLogger();
	private final cap c;
	private String d;
	protected static final cak a = new cak();
	private final Map<String, cai> e = Maps.newHashMap();

	public caj(cap cap, String string) {
		this.c = cap;
		this.d = string;
		cah.a(a);
	}

	public void a(List<caa> list) {
		this.e.clear();

		for (caa caa4 : list) {
			try {
				cax cax5 = caa4.a(this.c, "language");
				if (cax5 != null) {
					for (cai cai7 : cax5.a()) {
						if (!this.e.containsKey(cai7.a())) {
							this.e.put(cai7.a(), cai7);
						}
					}
				}
			} catch (RuntimeException var7) {
				b.warn("Unable to parse language metadata section of resourcepack: {}", new Object[]{caa4.b(), var7});
			} catch (IOException var8) {
				b.warn("Unable to parse language metadata section of resourcepack: {}", new Object[]{caa4.b(), var8});
			}
		}
	}

	@Override
	public void a(bzy bzy) {
		List<String> list3 = Lists.newArrayList(new String[]{"en_us"});
		if (!"en_us".equals(this.d)) {
			list3.add(this.d);
		}

		a.a(bzy, list3);
		dq.a(a.a);
	}

	public boolean a() {
		return a.a();
	}

	public boolean b() {
		return this.c() != null && this.c().b();
	}

	public void a(cai cai) {
		this.d = cai.a();
	}

	public cai c() {
		String string2 = this.e.containsKey(this.d) ? this.d : "en_us";
		return (cai)this.e.get(string2);
	}

	public SortedSet<cai> d() {
		return Sets.newTreeSet(this.e.values());
	}
}
