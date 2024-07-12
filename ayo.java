import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ayo {
	private static final Logger a = LogManager.getLogger();
	private static final Map<String, Class<? extends ayr>> b = Maps.newHashMap();
	private static final Map<Class<? extends ayr>, String> c = Maps.newHashMap();
	private static final Map<String, Class<? extends ayq>> d = Maps.newHashMap();
	private static final Map<Class<? extends ayq>, String> e = Maps.newHashMap();

	private static void b(Class<? extends ayr> class1, String string) {
		b.put(string, class1);
		c.put(class1, string);
	}

	static void a(Class<? extends ayq> class1, String string) {
		d.put(string, class1);
		e.put(class1, string);
	}

	public static String a(ayr ayr) {
		return (String)c.get(ayr.getClass());
	}

	public static String a(ayq ayq) {
		return (String)e.get(ayq.getClass());
	}

	@Nullable
	public static ayr a(du du, ajs ajs) {
		ayr ayr3 = null;

		try {
			Class<? extends ayr> class4 = (Class<? extends ayr>)b.get(du.l("id"));
			if (class4 != null) {
				ayr3 = (ayr)class4.newInstance();
			}
		} catch (Exception var4) {
			a.warn("Failed Start with id {}", new Object[]{du.l("id")});
			var4.printStackTrace();
		}

		if (ayr3 != null) {
			ayr3.a(ajs, du);
		} else {
			a.warn("Skipping Structure with id {}", new Object[]{du.l("id")});
		}

		return ayr3;
	}

	public static ayq b(du du, ajs ajs) {
		ayq ayq3 = null;

		try {
			Class<? extends ayq> class4 = (Class<? extends ayq>)d.get(du.l("id"));
			if (class4 != null) {
				ayq3 = (ayq)class4.newInstance();
			}
		} catch (Exception var4) {
			a.warn("Failed Piece with id {}", new Object[]{du.l("id")});
			var4.printStackTrace();
		}

		if (ayq3 != null) {
			ayq3.a(ajs, du);
		} else {
			a.warn("Skipping Piece with id {}", new Object[]{du.l("id")});
		}

		return ayq3;
	}

	static {
		b(aye.class, "Mineshaft");
		b(ayt.a.class, "Village");
		b(ayf.a.class, "Fortress");
		b(ayl.a.class, "Stronghold");
		b(ayj.a.class, "Temple");
		b(ayh.a.class, "Monument");
		b(aya.a.class, "EndCity");
		b(ayv.a.class, "Mansion");
		ayd.a();
		ayu.a();
		ayg.a();
		aym.a();
		ayk.a();
		ayi.a();
		ayb.a();
		ayw.a();
	}
}
