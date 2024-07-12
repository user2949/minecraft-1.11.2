import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dj<K, V> implements dh<K, V> {
	private static final Logger a = LogManager.getLogger();
	protected final Map<K, V> c = this.b();
	private Object[] b;

	protected Map<K, V> b() {
		return Maps.newHashMap();
	}

	@Nullable
	@Override
	public V c(@Nullable K object) {
		return (V)this.c.get(object);
	}

	@Override
	public void a(K object1, V object2) {
		Validate.notNull(object1);
		Validate.notNull(object2);
		this.b = null;
		if (this.c.containsKey(object1)) {
			a.debug("Adding duplicate key '{}' to registry", new Object[]{object1});
		}

		this.c.put(object1, object2);
	}

	@Override
	public Set<K> c() {
		return Collections.unmodifiableSet(this.c.keySet());
	}

	@Nullable
	public V a(Random random) {
		if (this.b == null) {
			Collection<?> collection3 = this.c.values();
			if (collection3.isEmpty()) {
				return null;
			}

			this.b = collection3.toArray(new Object[collection3.size()]);
		}

		return (V)this.b[random.nextInt(this.b.length)];
	}

	public boolean d(K object) {
		return this.c.containsKey(object);
	}

	public Iterator<V> iterator() {
		return this.c.values().iterator();
	}
}
