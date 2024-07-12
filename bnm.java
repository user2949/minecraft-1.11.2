import com.google.common.base.Objects;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bnm implements auj {
	private static final Logger a = LogManager.getLogger();
	private final auo b;
	private final Long2ObjectMap<auo> c = new Long2ObjectOpenHashMap<auo>(8192) {
		protected void rehash(int integer) {
			if (integer > this.key.length) {
				super.rehash(integer);
			}
		}
	};
	private final ajs d;

	public bnm(ajs ajs) {
		this.b = new aul(ajs, 0, 0);
		this.d = ajs;
	}

	public void b(int integer1, int integer2) {
		auo auo4 = this.c(integer1, integer2);
		if (!auo4.f()) {
			auo4.d();
		}

		this.c.remove(ajl.a(integer1, integer2));
	}

	@Nullable
	@Override
	public auo a(int integer1, int integer2) {
		return (auo)this.c.get(ajl.a(integer1, integer2));
	}

	public auo d(int integer1, int integer2) {
		auo auo4 = new auo(this.d, integer1, integer2);
		this.c.put(ajl.a(integer1, integer2), auo4);
		auo4.c(true);
		return auo4;
	}

	@Override
	public auo c(int integer1, int integer2) {
		return (auo)Objects.firstNonNull(this.a(integer1, integer2), this.b);
	}

	@Override
	public boolean d() {
		long long2 = System.currentTimeMillis();
		ObjectIterator var3 = this.c.values().iterator();

		while (var3.hasNext()) {
			auo auo5 = (auo)var3.next();
			auo5.b(System.currentTimeMillis() - long2 > 5L);
		}

		if (System.currentTimeMillis() - long2 > 100L) {
			a.info("Warning: Clientside chunk ticking took {} ms", new Object[]{System.currentTimeMillis() - long2});
		}

		return false;
	}

	@Override
	public String f() {
		return "MultiplayerChunkCache: " + this.c.size() + ", " + this.c.size();
	}

	@Override
	public boolean e(int integer1, int integer2) {
		return this.c.containsKey(ajl.a(integer1, integer2));
	}
}
