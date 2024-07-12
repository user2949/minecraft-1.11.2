import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

public class dc<K, V> extends dj<K, V> implements cx<V> {
	protected final oh<V> a = new oh(256);
	protected final Map<V, K> b = ((BiMap)this.c).inverse();

	public void a(int integer, K object2, V object3) {
		this.a.a(object3, integer);
		this.a(object2, object3);
	}

	@Override
	protected Map<K, V> b() {
		return HashBiMap.create();
	}

	@Nullable
	@Override
	public V c(@Nullable K object) {
		return super.c(object);
	}

	@Nullable
	public K b(V object) {
		return (K)this.b.get(object);
	}

	@Override
	public boolean d(K object) {
		return super.d(object);
	}

	public int a(@Nullable V object) {
		return this.a.a(object);
	}

	@Nullable
	public V a(int integer) {
		return this.a.a(integer);
	}

	@Override
	public Iterator<V> iterator() {
		return this.a.iterator();
	}
}
