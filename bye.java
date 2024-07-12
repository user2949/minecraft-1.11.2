import com.google.gson.JsonObject;
import java.util.Locale;

public class bye {
	private static bye a;
	private final int b;
	private final int c;
	private final int d;
	private final int e;
	private final int f;
	private final boolean g;
	private final boolean h;

	private bye(boolean boolean1, boolean boolean2, int integer3, int integer4, int integer5, int integer6, int integer7) {
		this.g = boolean1;
		this.b = integer3;
		this.d = integer4;
		this.c = integer5;
		this.e = integer6;
		this.h = boolean2;
		this.f = integer7;
	}

	public bye() {
		this(false, true, 1, 0, 1, 0, 32774);
	}

	public bye(int integer1, int integer2, int integer3) {
		this(false, false, integer1, integer2, integer1, integer2, integer3);
	}

	public bye(int integer1, int integer2, int integer3, int integer4, int integer5) {
		this(true, false, integer1, integer2, integer3, integer4, integer5);
	}

	public void a() {
		if (!this.equals(a)) {
			if (a == null || this.h != a.b()) {
				a = this;
				if (this.h) {
					bqg.l();
					return;
				}

				bqg.m();
			}

			bqg.d(this.f);
			if (this.g) {
				bqg.a(this.b, this.d, this.c, this.e);
			} else {
				bqg.b(this.b, this.d);
			}
		}
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof bye)) {
			return false;
		} else {
			bye bye3 = (bye)object;
			if (this.f != bye3.f) {
				return false;
			} else if (this.e != bye3.e) {
				return false;
			} else if (this.d != bye3.d) {
				return false;
			} else if (this.h != bye3.h) {
				return false;
			} else if (this.g != bye3.g) {
				return false;
			} else {
				return this.c != bye3.c ? false : this.b == bye3.b;
			}
		}
	}

	public int hashCode() {
		int integer2 = this.b;
		integer2 = 31 * integer2 + this.c;
		integer2 = 31 * integer2 + this.d;
		integer2 = 31 * integer2 + this.e;
		integer2 = 31 * integer2 + this.f;
		integer2 = 31 * integer2 + (this.g ? 1 : 0);
		return 31 * integer2 + (this.h ? 1 : 0);
	}

	public boolean b() {
		return this.h;
	}

	public static bye a(JsonObject jsonObject) {
		if (jsonObject == null) {
			return new bye();
		} else {
			int integer2 = 32774;
			int integer3 = 1;
			int integer4 = 0;
			int integer5 = 1;
			int integer6 = 0;
			boolean boolean7 = true;
			boolean boolean8 = false;
			if (ok.a(jsonObject, "func")) {
				integer2 = a(jsonObject.get("func").getAsString());
				if (integer2 != 32774) {
					boolean7 = false;
				}
			}

			if (ok.a(jsonObject, "srcrgb")) {
				integer3 = b(jsonObject.get("srcrgb").getAsString());
				if (integer3 != 1) {
					boolean7 = false;
				}
			}

			if (ok.a(jsonObject, "dstrgb")) {
				integer4 = b(jsonObject.get("dstrgb").getAsString());
				if (integer4 != 0) {
					boolean7 = false;
				}
			}

			if (ok.a(jsonObject, "srcalpha")) {
				integer5 = b(jsonObject.get("srcalpha").getAsString());
				if (integer5 != 1) {
					boolean7 = false;
				}

				boolean8 = true;
			}

			if (ok.a(jsonObject, "dstalpha")) {
				integer6 = b(jsonObject.get("dstalpha").getAsString());
				if (integer6 != 0) {
					boolean7 = false;
				}

				boolean8 = true;
			}

			if (boolean7) {
				return new bye();
			} else {
				return boolean8 ? new bye(integer3, integer4, integer5, integer6, integer2) : new bye(integer3, integer4, integer2);
			}
		}
	}

	private static int a(String string) {
		String string2 = string.trim().toLowerCase(Locale.ROOT);
		if ("add".equals(string2)) {
			return 32774;
		} else if ("subtract".equals(string2)) {
			return 32778;
		} else if ("reversesubtract".equals(string2)) {
			return 32779;
		} else if ("reverse_subtract".equals(string2)) {
			return 32779;
		} else if ("min".equals(string2)) {
			return 32775;
		} else {
			return "max".equals(string2) ? 32776 : 32774;
		}
	}

	private static int b(String string) {
		String string2 = string.trim().toLowerCase(Locale.ROOT);
		string2 = string2.replaceAll("_", "");
		string2 = string2.replaceAll("one", "1");
		string2 = string2.replaceAll("zero", "0");
		string2 = string2.replaceAll("minus", "-");
		if ("0".equals(string2)) {
			return 0;
		} else if ("1".equals(string2)) {
			return 1;
		} else if ("srccolor".equals(string2)) {
			return 768;
		} else if ("1-srccolor".equals(string2)) {
			return 769;
		} else if ("dstcolor".equals(string2)) {
			return 774;
		} else if ("1-dstcolor".equals(string2)) {
			return 775;
		} else if ("srcalpha".equals(string2)) {
			return 770;
		} else if ("1-srcalpha".equals(string2)) {
			return 771;
		} else if ("dstalpha".equals(string2)) {
			return 772;
		} else {
			return "1-dstalpha".equals(string2) ? 773 : -1;
		}
	}
}
