public class caq {
	private final int a;
	private final int b;

	public caq(int integer) {
		this(integer, -1);
	}

	public caq(int integer1, int integer2) {
		this.a = integer1;
		this.b = integer2;
	}

	public boolean a() {
		return this.b == -1;
	}

	public int b() {
		return this.b;
	}

	public int c() {
		return this.a;
	}
}
