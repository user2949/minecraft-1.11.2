import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;

public class cr {
	public static <T> Iterable<T[]> a(Class<T> class1, Iterable<? extends Iterable<? extends T>> iterable) {
		return new cr.b(class1, b(Iterable.class, iterable));
	}

	public static <T> Iterable<List<T>> a(Iterable<? extends Iterable<? extends T>> iterable) {
		return b(a(Object.class, iterable));
	}

	private static <T> Iterable<List<T>> b(Iterable<Object[]> iterable) {
		return Iterables.transform(iterable, new cr.a());
	}

	private static <T> T[] b(Class<? super T> class1, Iterable<? extends T> iterable) {
		List<T> list3 = Lists.newArrayList();

		for (T object5 : iterable) {
			list3.add(object5);
		}

		return (T[])list3.toArray(b(class1, list3.size()));
	}

	private static <T> T[] b(Class<? super T> class1, int integer) {
		return (T[])((Object[])Array.newInstance(class1, integer));
	}

	static class a<T> implements Function<Object[], List<T>> {
		private a() {
		}

		public List<T> a(@Nullable Object[] arr) {
			return Arrays.asList(arr);
		}
	}

	static class b<T> implements Iterable<T[]> {
		private final Class<T> a;
		private final Iterable<? extends T>[] b;

		private b(Class<T> class1, Iterable<? extends T>[] arr) {
			this.a = class1;
			this.b = arr;
		}

		public Iterator<T[]> iterator() {
			return (Iterator<T[]>)(this.b.length <= 0 ? Collections.singletonList(cr.b(this.a, 0)).iterator() : new cr.b.a(this.a, this.b));
		}

		static class a<T> extends UnmodifiableIterator<T[]> {
			private int a = -2;
			private final Iterable<? extends T>[] b;
			private final Iterator<? extends T>[] c;
			private final T[] d;

			private a(Class<T> class1, Iterable<? extends T>[] arr) {
				this.b = arr;
				this.c = cr.b(Iterator.class, this.b.length);

				for (int integer4 = 0; integer4 < this.b.length; integer4++) {
					this.c[integer4] = arr[integer4].iterator();
				}

				this.d = (T[])cr.b(class1, this.c.length);
			}

			private void b() {
				this.a = -1;
				Arrays.fill(this.c, null);
				Arrays.fill(this.d, null);
			}

			public boolean hasNext() {
				if (this.a == -2) {
					this.a = 0;

					for (Iterator<? extends T> iterator5 : this.c) {
						if (!iterator5.hasNext()) {
							this.b();
							break;
						}
					}

					return true;
				} else {
					if (this.a >= this.c.length) {
						for (this.a = this.c.length - 1; this.a >= 0; this.a--) {
							Iterator<? extends T> iterator2 = this.c[this.a];
							if (iterator2.hasNext()) {
								break;
							}

							if (this.a == 0) {
								this.b();
								break;
							}

							iterator2 = this.b[this.a].iterator();
							this.c[this.a] = iterator2;
							if (!iterator2.hasNext()) {
								this.b();
								break;
							}
						}
					}

					return this.a >= 0;
				}
			}

			public T[] a() {
				if (!this.hasNext()) {
					throw new NoSuchElementException();
				} else {
					while (this.a < this.c.length) {
						this.d[this.a] = (T)this.c[this.a].next();
						this.a++;
					}

					return (T[])((Object[])this.d.clone());
				}
			}
		}
	}
}
