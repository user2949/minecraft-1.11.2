import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class db {
	public static <K, V> Map<K, V> b(Iterable<K> iterable1, Iterable<V> iterable2) {
		return a(iterable1, iterable2, Maps.newLinkedHashMap());
	}

	public static <K, V> Map<K, V> a(Iterable<K> iterable1, Iterable<V> iterable2, Map<K, V> map) {
		Iterator<V> iterator4 = iterable2.iterator();

		for (K object6 : iterable1) {
			map.put(object6, iterator4.next());
		}

		if (iterator4.hasNext()) {
			throw new NoSuchElementException();
		} else {
			return map;
		}
	}
}
