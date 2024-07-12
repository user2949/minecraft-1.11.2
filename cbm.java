import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

public class cbm extends kq {
	private final String c;

	protected cbm(int integer, String... arr) {
		super(0, arr[0], arr[1]);
		this.c = StringUtils.isEmpty(arr[2]) ? "normal" : arr[2].toLowerCase(Locale.ROOT);
	}

	public cbm(String string) {
		this(0, b(string));
	}

	public cbm(kq kq, String string) {
		this(kq.toString(), string);
	}

	public cbm(String string1, String string2) {
		this(0, b(string1 + '#' + (string2 == null ? "normal" : string2)));
	}

	protected static String[] b(String string) {
		String[] arr2 = new String[]{null, string, null};
		int integer3 = string.indexOf(35);
		String string4 = string;
		if (integer3 >= 0) {
			arr2[2] = string.substring(integer3 + 1, string.length());
			if (integer3 > 1) {
				string4 = string.substring(0, integer3);
			}
		}

		System.arraycopy(kq.a(string4), 0, arr2, 0, 2);
		return arr2;
	}

	public String c() {
		return this.c;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object instanceof cbm && super.equals(object)) {
			cbm cbm3 = (cbm)object;
			return this.c.equals(cbm3.c);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return 31 * super.hashCode() + this.c.hashCode();
	}

	@Override
	public String toString() {
		return super.toString() + '#' + this.c;
	}
}
