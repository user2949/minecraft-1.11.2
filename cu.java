import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class cu<K, V> extends dj<K, V> {
	private final V a;

	public cu(V object) {
		this.a = object;
	}

	@Nonnull
	@Override
	public V c(@Nullable K object) {
		V object3 = super.c(object);
		return object3 == null ? this.a : object3;
	}
}
