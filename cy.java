import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cy<T> implements cx<T> {
	private final IdentityHashMap<T, Integer> a;
	private final List<T> b;

	public cy() {
		this(512);
	}

	public cy(int integer) {
		this.b = Lists.newArrayListWithExpectedSize(integer);
		this.a = new IdentityHashMap(integer);
	}

	public void a(T object, int integer) {
		this.a.put(object, integer);

		while (this.b.size() <= integer) {
			this.b.add(null);
		}

		this.b.set(integer, object);
	}

	public int a(T object) {
		Integer integer3 = (Integer)this.a.get(object);
		return integer3 == null ? -1 : integer3;
	}

	@Nullable
	public final T a(int integer) {
		return (T)(integer >= 0 && integer < this.b.size() ? this.b.get(integer) : null);
	}

	public Iterator<T> iterator() {
		return Iterators.filter(this.b.iterator(), Predicates.notNull());
	}

	public int a() {
		return this.a.size();
	}
}
