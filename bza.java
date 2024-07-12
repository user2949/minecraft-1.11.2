import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bza implements bzd, bzz {
	private static final Logger a = LogManager.getLogger();
	private final Map<kq, bzb> b = Maps.newHashMap();
	private final List<bzd> c = Lists.newArrayList();
	private final Map<String, Integer> d = Maps.newHashMap();
	private final bzy e;

	public bza(bzy bzy) {
		this.e = bzy;
	}

	public void a(kq kq) {
		bzb bzb3 = (bzb)this.b.get(kq);
		if (bzb3 == null) {
			bzb3 = new byv(kq);
			this.a(kq, bzb3);
		}

		bzc.b(bzb3.b());
	}

	public boolean a(kq kq, bze bze) {
		if (this.a(kq, (bzb)bze)) {
			this.c.add(bze);
			return true;
		} else {
			return false;
		}
	}

	public boolean a(kq kq, bzb bzb) {
		boolean boolean4 = true;

		try {
			bzb.a(this.e);
		} catch (IOException var8) {
			a.warn("Failed to load texture: {}", new Object[]{kq, var8});
			bzb = bzc.a;
			this.b.put(kq, bzb);
			boolean4 = false;
		} catch (Throwable var9) {
			b b6 = b.a(var9, "Registering texture");
			c c7 = b6.a("Resource location being registered");
			c7.a("Resource location", kq);
			c7.a("Texture object class", new d<String>() {
				public String call() throws Exception {
					return bzb.getClass().getName();
				}
			});
			throw new f(b6);
		}

		this.b.put(kq, bzb);
		return boolean4;
	}

	public bzb b(kq kq) {
		return (bzb)this.b.get(kq);
	}

	public kq a(String string, byp byp) {
		Integer integer4 = (Integer)this.d.get(string);
		if (integer4 == null) {
			integer4 = 1;
		} else {
			integer4 = integer4 + 1;
		}

		this.d.put(string, integer4);
		kq kq5 = new kq(String.format("dynamic/%s_%d", string, integer4));
		this.a(kq5, byp);
		return kq5;
	}

	@Override
	public void e() {
		for (bzd bzd3 : this.c) {
			bzd3.e();
		}
	}

	public void c(kq kq) {
		bzb bzb3 = this.b(kq);
		if (bzb3 != null) {
			bzc.a(bzb3.b());
		}
	}

	@Override
	public void a(bzy bzy) {
		for (Entry<kq, bzb> entry4 : this.b.entrySet()) {
			this.a((kq)entry4.getKey(), (bzb)entry4.getValue());
		}
	}
}
