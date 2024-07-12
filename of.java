import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class of<T> extends AbstractSet<T> {
	private static final Set<Class<?>> a = Sets.newHashSet();
	private final Map<Class<?>, List<T>> b = Maps.newHashMap();
	private final Set<Class<?>> c = Sets.newIdentityHashSet();
	private final Class<T> d;
	private final List<T> e = Lists.newArrayList();

	public of(Class<T> class1) {
		this.d = class1;
		this.c.add(class1);
		this.b.put(class1, this.e);

		for (Class<?> class4 : a) {
			this.a(class4);
		}
	}

	protected void a(Class<?> class1) {
		a.add(class1);

		for (T object4 : this.e) {
			if (class1.isAssignableFrom(object4.getClass())) {
				this.a(object4, class1);
			}
		}

		this.c.add(class1);
	}

	protected Class<?> b(Class<?> class1) {
		if (this.d.isAssignableFrom(class1)) {
			if (!this.c.contains(class1)) {
				this.a(class1);
			}

			return class1;
		} else {
			throw new IllegalArgumentException("Don't know how to search for " + class1);
		}
	}

	public boolean add(T object) {
		for (Class<?> class4 : this.c) {
			if (class4.isAssignableFrom(object.getClass())) {
				this.a(object, class4);
			}
		}

		return true;
	}

	private void a(T object, Class<?> class2) {
		List<T> list4 = (List<T>)this.b.get(class2);
		if (list4 == null) {
			this.b.put(class2, Lists.newArrayList(new Object[]{object}));
		} else {
			list4.add(object);
		}
	}

	public boolean remove(Object object) {
		T object3 = (T)object;
		boolean boolean4 = false;

		for (Class<?> class6 : this.c) {
			if (class6.isAssignableFrom(object3.getClass())) {
				List<T> list7 = (List<T>)this.b.get(class6);
				if (list7 != null && list7.remove(object3)) {
					boolean4 = true;
				}
			}
		}

		return boolean4;
	}

	public boolean contains(Object object) {
		return Iterators.contains(this.c(object.getClass()).iterator(), object);
	}

	public <S> Iterable<S> c(Class<S> class1) {
		return new Iterable<S>() {
			public Iterator<S> iterator() {
				List<T> list2 = (List<T>)of.this.b.get(of.this.b(class1));
				if (list2 == null) {
					return Iterators.emptyIterator();
				} else {
					Iterator<T> iterator3 = list2.iterator();
					return Iterators.filter(iterator3, class1);
				}
			}
		};
	}

	public Iterator<T> iterator() {
		return this.e.isEmpty() ? Iterators.emptyIterator() : Iterators.unmodifiableIterator(this.e.iterator());
	}

	public int size() {
		return this.e.size();
	}
}
