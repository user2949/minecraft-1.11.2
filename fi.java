import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fi extends ez {
	private final String d;
	private final Object[] e;
	private final Object f = new Object();
	private long g = -1L;
	@VisibleForTesting
	List<fb> b = Lists.newArrayList();
	public static final Pattern c = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

	public fi(String string, Object... arr) {
		this.d = string;
		this.e = arr;

		for (Object object7 : arr) {
			if (object7 instanceof fb) {
				((fb)object7).b().a(this.b());
			}
		}
	}

	@VisibleForTesting
	synchronized void g() {
		synchronized (this.f) {
			long long3 = dp.a();
			if (long3 == this.g) {
				return;
			}

			this.g = long3;
			this.b.clear();
		}

		try {
			this.b(dp.a(this.d));
		} catch (fj var6) {
			this.b.clear();

			try {
				this.b(dp.b(this.d));
			} catch (fj var5) {
				throw var6;
			}
		}
	}

	protected void b(String string) {
		boolean boolean3 = false;
		Matcher matcher4 = c.matcher(string);
		int integer5 = 0;
		int integer6 = 0;

		try {
			while (matcher4.find(integer6)) {
				int integer7 = matcher4.start();
				int integer8 = matcher4.end();
				if (integer7 > integer6) {
					fh fh9 = new fh(String.format(string.substring(integer6, integer7)));
					fh9.b().a(this.b());
					this.b.add(fh9);
				}

				String string9 = matcher4.group(2);
				String string10 = string.substring(integer7, integer8);
				if ("%".equals(string9) && "%%".equals(string10)) {
					fh fh11 = new fh("%");
					fh11.b().a(this.b());
					this.b.add(fh11);
				} else {
					if (!"s".equals(string9)) {
						throw new fj(this, "Unsupported format: '" + string10 + "'");
					}

					String string11 = matcher4.group(1);
					int integer12 = string11 != null ? Integer.parseInt(string11) - 1 : integer5++;
					if (integer12 < this.e.length) {
						this.b.add(this.a(integer12));
					}
				}

				integer6 = integer8;
			}

			if (integer6 < string.length()) {
				fh fh7 = new fh(String.format(string.substring(integer6)));
				fh7.b().a(this.b());
				this.b.add(fh7);
			}
		} catch (IllegalFormatException var12) {
			throw new fj(this, var12);
		}
	}

	private fb a(int integer) {
		if (integer >= this.e.length) {
			throw new fj(this, integer);
		} else {
			Object object3 = this.e[integer];
			fb fb4;
			if (object3 instanceof fb) {
				fb4 = (fb)object3;
			} else {
				fb4 = new fh(object3 == null ? "null" : object3.toString());
				fb4.b().a(this.b());
			}

			return fb4;
		}
	}

	@Override
	public fb a(fg fg) {
		super.a(fg);

		for (Object object6 : this.e) {
			if (object6 instanceof fb) {
				((fb)object6).b().a(this.b());
			}
		}

		if (this.g > -1L) {
			for (fb fb4 : this.b) {
				fb4.b().a(fg);
			}
		}

		return this;
	}

	@Override
	public Iterator<fb> iterator() {
		this.g();
		return Iterators.concat(a(this.b), a(this.a));
	}

	@Override
	public String e() {
		this.g();
		StringBuilder stringBuilder2 = new StringBuilder();

		for (fb fb4 : this.b) {
			stringBuilder2.append(fb4.e());
		}

		return stringBuilder2.toString();
	}

	public fi f() {
		Object[] arr2 = new Object[this.e.length];

		for (int integer3 = 0; integer3 < this.e.length; integer3++) {
			if (this.e[integer3] instanceof fb) {
				arr2[integer3] = ((fb)this.e[integer3]).f();
			} else {
				arr2[integer3] = this.e[integer3];
			}
		}

		fi fi3 = new fi(this.d, arr2);
		fi3.a(this.b().m());

		for (fb fb5 : this.a()) {
			fi3.a(fb5.f());
		}

		return fi3;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof fi)) {
			return false;
		} else {
			fi fi3 = (fi)object;
			return Arrays.equals(this.e, fi3.e) && this.d.equals(fi3.d) && super.equals(object);
		}
	}

	@Override
	public int hashCode() {
		int integer2 = super.hashCode();
		integer2 = 31 * integer2 + this.d.hashCode();
		return 31 * integer2 + Arrays.hashCode(this.e);
	}

	@Override
	public String toString() {
		return "TranslatableComponent{key='" + this.d + '\'' + ", args=" + Arrays.toString(this.e) + ", siblings=" + this.a + ", style=" + this.b() + '}';
	}

	public String i() {
		return this.d;
	}

	public Object[] j() {
		return this.e;
	}
}
