import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class kq {
	protected final String a;
	protected final String b;

	protected kq(int integer, String... arr) {
		this.a = StringUtils.isEmpty(arr[0]) ? "minecraft" : arr[0].toLowerCase(Locale.ROOT);
		this.b = arr[1].toLowerCase(Locale.ROOT);
		Validate.notNull(this.b);
	}

	public kq(String string) {
		this(0, a(string));
	}

	public kq(String string1, String string2) {
		this(0, string1, string2);
	}

	protected static String[] a(String string) {
		String[] arr2 = new String[]{"minecraft", string};
		int integer3 = string.indexOf(58);
		if (integer3 >= 0) {
			arr2[1] = string.substring(integer3 + 1, string.length());
			if (integer3 > 1) {
				arr2[0] = string.substring(0, integer3);
			}
		}

		return arr2;
	}

	public String a() {
		return this.b;
	}

	public String b() {
		return this.a;
	}

	public String toString() {
		return this.a + ':' + this.b;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof kq)) {
			return false;
		} else {
			kq kq3 = (kq)object;
			return this.a.equals(kq3.a) && this.b.equals(kq3.b);
		}
	}

	public int hashCode() {
		return 31 * this.a.hashCode() + this.b.hashCode();
	}
}
