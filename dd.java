import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class dd<E> extends AbstractList<E> {
	private final List<E> a;
	private final E b;

	public static <E> dd<E> a() {
		return new dd<>();
	}

	public static <E> dd<E> a(int integer, E object) {
		Validate.notNull(object);
		Object[] arr3 = new Object[integer];
		Arrays.fill(arr3, object);
		return new dd<>(Arrays.asList(arr3), object);
	}

	protected dd() {
		this(new ArrayList(), null);
	}

	protected dd(List<E> list, @Nullable E object) {
		this.a = list;
		this.b = object;
	}

	@Nonnull
	public E get(int integer) {
		return (E)this.a.get(integer);
	}

	public E set(int integer, E object) {
		Validate.notNull(object);
		return (E)this.a.set(integer, object);
	}

	public void add(int integer, E object) {
		Validate.notNull(object);
		this.a.add(integer, object);
	}

	public E remove(int integer) {
		return (E)this.a.remove(integer);
	}

	public int size() {
		return this.a.size();
	}

	public void clear() {
		if (this.b == null) {
			super.clear();
		} else {
			for (int integer2 = 0; integer2 < this.size(); integer2++) {
				this.set(integer2, this.b);
			}
		}
	}
}
