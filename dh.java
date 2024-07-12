import java.util.Set;
import javax.annotation.Nullable;

public interface dh<K, V> extends Iterable<V> {
	@Nullable
	V c(K object);

	void a(K object1, V object2);

	Set<K> c();
}
