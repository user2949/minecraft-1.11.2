public class cai implements Comparable<cai> {
	private final String a;
	private final String b;
	private final String c;
	private final boolean d;

	public cai(String string1, String string2, String string3, boolean boolean4) {
		this.a = string1;
		this.b = string2;
		this.c = string3;
		this.d = boolean4;
	}

	public String a() {
		return this.a;
	}

	public boolean b() {
		return this.d;
	}

	public String toString() {
		return String.format("%s (%s)", this.c, this.b);
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else {
			return !(object instanceof cai) ? false : this.a.equals(((cai)object).a);
		}
	}

	public int hashCode() {
		return this.a.hashCode();
	}

	public int compareTo(cai cai) {
		return this.a.compareTo(cai.a);
	}
}
