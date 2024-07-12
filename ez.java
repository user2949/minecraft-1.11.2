import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public abstract class ez implements fb {
	protected List<fb> a = Lists.newArrayList();
	private fg b;

	@Override
	public fb a(fb fb) {
		fb.b().a(this.b());
		this.a.add(fb);
		return this;
	}

	@Override
	public List<fb> a() {
		return this.a;
	}

	@Override
	public fb a(String string) {
		return this.a(new fh(string));
	}

	@Override
	public fb a(fg fg) {
		this.b = fg;

		for (fb fb4 : this.a) {
			fb4.b().a(this.b());
		}

		return this;
	}

	@Override
	public fg b() {
		if (this.b == null) {
			this.b = new fg();

			for (fb fb3 : this.a) {
				fb3.b().a(this.b);
			}
		}

		return this.b;
	}

	public Iterator<fb> iterator() {
		return Iterators.concat(Iterators.forArray(new ez[]{this}), a(this.a));
	}

	@Override
	public final String c() {
		StringBuilder stringBuilder2 = new StringBuilder();

		for (fb fb4 : this) {
			stringBuilder2.append(fb4.e());
		}

		return stringBuilder2.toString();
	}

	@Override
	public final String d() {
		StringBuilder stringBuilder2 = new StringBuilder();

		for (fb fb4 : this) {
			String string5 = fb4.e();
			if (!string5.isEmpty()) {
				stringBuilder2.append(fb4.b().k());
				stringBuilder2.append(string5);
				stringBuilder2.append(a.RESET);
			}
		}

		return stringBuilder2.toString();
	}

	public static Iterator<fb> a(Iterable<fb> iterable) {
		Iterator<fb> iterator2 = Iterators.concat(Iterators.transform(iterable.iterator(), new Function<fb, Iterator<fb>>() {
			public Iterator<fb> apply(@Nullable fb fb) {
				return fb.iterator();
			}
		}));
		return Iterators.transform(iterator2, new Function<fb, fb>() {
			public fb apply(@Nullable fb fb) {
				fb fb3 = fb.f();
				fb3.a(fb3.b().n());
				return fb3;
			}
		});
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof ez)) {
			return false;
		} else {
			ez ez3 = (ez)object;
			return this.a.equals(ez3.a) && this.b().equals(ez3.b());
		}
	}

	public int hashCode() {
		return 31 * this.b.hashCode() + this.a.hashCode();
	}

	public String toString() {
		return "BaseComponent{style=" + this.b + ", siblings=" + this.a + '}';
	}
}
