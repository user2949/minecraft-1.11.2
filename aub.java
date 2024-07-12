import com.google.common.base.Optional;
import java.util.Collection;

public interface aub<T extends Comparable<T>> {
	String a();

	Collection<T> c();

	Class<T> b();

	Optional<T> b(String string);

	String a(T comparable);
}
