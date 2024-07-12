import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lv implements auj {
	private static final Logger a = LogManager.getLogger();
	private final Set<Long> b = Sets.newHashSet();
	private final aui c;
	private final auw d;
	private final Long2ObjectMap<auo> e = new Long2ObjectOpenHashMap(8192);
	private final lw f;

	public lv(lw lw, auw auw, aui aui) {
		this.f = lw;
		this.d = auw;
		this.c = aui;
	}

	public Collection<auo> a() {
		return this.e.values();
	}

	public void a(auo auo) {
		if (this.f.s.c(auo.b, auo.c)) {
			this.b.add(ajl.a(auo.b, auo.c));
			auo.d = true;
		}
	}

	public void b() {
		ObjectIterator var1 = this.e.values().iterator();

		while (var1.hasNext()) {
			auo auo3 = (auo)var1.next();
			this.a(auo3);
		}
	}

	@Nullable
	@Override
	public auo a(int integer1, int integer2) {
		long long4 = ajl.a(integer1, integer2);
		auo auo6 = (auo)this.e.get(long4);
		if (auo6 != null) {
			auo6.d = false;
		}

		return auo6;
	}

	@Nullable
	public auo b(int integer1, int integer2) {
		auo auo4 = this.a(integer1, integer2);
		if (auo4 == null) {
			auo4 = this.f(integer1, integer2);
			if (auo4 != null) {
				this.e.put(ajl.a(integer1, integer2), auo4);
				auo4.c();
				auo4.a(this, this.c);
			}
		}

		return auo4;
	}

	@Override
	public auo c(int integer1, int integer2) {
		auo auo4 = this.b(integer1, integer2);
		if (auo4 == null) {
			long long5 = ajl.a(integer1, integer2);

			try {
				auo4 = this.c.a(integer1, integer2);
			} catch (Throwable var9) {
				b b8 = b.a(var9, "Exception generating new chunk");
				c c9 = b8.a("Chunk to be generated");
				c9.a("Location", String.format("%d,%d", integer1, integer2));
				c9.a("Position hash", long5);
				c9.a("Generator", this.c);
				throw new f(b8);
			}

			this.e.put(long5, auo4);
			auo4.c();
			auo4.a(this, this.c);
		}

		return auo4;
	}

	@Nullable
	private auo f(int integer1, int integer2) {
		try {
			auo auo4 = this.d.a(this.f, integer1, integer2);
			if (auo4 != null) {
				auo4.b(this.f.P());
				this.c.b(auo4, integer1, integer2);
			}

			return auo4;
		} catch (Exception var4) {
			a.error("Couldn't load chunk", var4);
			return null;
		}
	}

	private void b(auo auo) {
		try {
			this.d.b(this.f, auo);
		} catch (Exception var3) {
			a.error("Couldn't save entities", var3);
		}
	}

	private void c(auo auo) {
		try {
			auo.b(this.f.P());
			this.d.a(this.f, auo);
		} catch (IOException var3) {
			a.error("Couldn't save chunk", var3);
		} catch (ajt var4) {
			a.error("Couldn't save chunk; already in use by another instance of Minecraft?", var4);
		}
	}

	public boolean a(boolean boolean1) {
		int integer3 = 0;
		List<auo> list4 = Lists.newArrayList(this.e.values());

		for (int integer5 = 0; integer5 < list4.size(); integer5++) {
			auo auo6 = (auo)list4.get(integer5);
			if (boolean1) {
				this.b(auo6);
			}

			if (auo6.a(boolean1)) {
				this.c(auo6);
				auo6.f(false);
				if (++integer3 == 24 && !boolean1) {
					return false;
				}
			}
		}

		return true;
	}

	public void c() {
		this.d.b();
	}

	@Override
	public boolean d() {
		if (!this.f.b) {
			if (!this.b.isEmpty()) {
				Iterator<Long> iterator2 = this.b.iterator();

				for (int integer3 = 0; integer3 < 100 && iterator2.hasNext(); iterator2.remove()) {
					Long long4 = (Long)iterator2.next();
					auo auo5 = (auo)this.e.get(long4);
					if (auo5 != null && auo5.d) {
						auo5.d();
						this.c(auo5);
						this.b(auo5);
						this.e.remove(long4);
						integer3++;
					}
				}
			}

			this.d.a();
		}

		return false;
	}

	public boolean e() {
		return !this.f.b;
	}

	@Override
	public String f() {
		return "ServerChunkCache: " + this.e.size() + " Drop: " + this.b.size();
	}

	public List<akf.c> a(sy sy, co co) {
		return this.c.a(sy, co);
	}

	@Nullable
	public co a(ajs ajs, String string, co co, boolean boolean4) {
		return this.c.a(ajs, string, co, boolean4);
	}

	public int g() {
		return this.e.size();
	}

	public boolean d(int integer1, int integer2) {
		return this.e.containsKey(ajl.a(integer1, integer2));
	}

	@Override
	public boolean e(int integer1, int integer2) {
		return this.e.containsKey(ajl.a(integer1, integer2)) || this.d.a(integer1, integer2);
	}
}
