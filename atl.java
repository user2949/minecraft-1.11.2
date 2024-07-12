import com.google.common.collect.ImmutableMap;
import java.util.Collection;

public interface atl extends atj, atk {
	Collection<aub<?>> t();

	<T extends Comparable<T>> T c(aub<T> aub);

	<T extends Comparable<T>, V extends T> atl a(aub<T> aub, V comparable);

	<T extends Comparable<T>> atl a(aub<T> aub);

	ImmutableMap<aub<?>, Comparable<?>> u();

	alu v();
}
