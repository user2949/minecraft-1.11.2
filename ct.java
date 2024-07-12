import java.util.Random;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class ct<K, V> extends dc<K, V> {
	private final K d;
	private V e;

	public ct(K object) {
		this.d = object;
	}

	@Override
	public void a(int integer, K object2, V object3) {
		if (this.d.equals(object2)) {
			this.e = object3;
		}

		super.a(integer, object2, object3);
	}

	public void a() {
		Validate.notNull(this.e, "Missing default of DefaultedMappedRegistry: " + this.d, new Object[0]);
	}

	@Override
	public int a(V object) {
		int integer3 = super.a(object);
		return integer3 == -1 ? super.a(this.e) : integer3;
	}

	@Nonnull
	@Override
	public K b(V object) {
		K object3 = super.b(object);
		return object3 == null ? this.d : object3;
	}

	@Nonnull
	@Override
	public V c(@Nullable K object) {
		V object3 = super.c(object);
		return object3 == null ? this.e : object3;
	}

	@Nonnull
	@Override
	public V a(int integer) {
		V object3 = super.a(integer);
		return object3 == null ? this.e : object3;
	}

	@Nonnull
	@Override
	public V a(Random random) {
		V object3 = super.a(random);
		return object3 == null ? this.e : object3;
	}
}
