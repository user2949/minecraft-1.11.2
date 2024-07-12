import java.util.Random;

public abstract class awn {
	private final boolean a;

	public awn() {
		this(false);
	}

	public awn(boolean boolean1) {
		this.a = boolean1;
	}

	public abstract boolean b(ajs ajs, Random random, co co);

	public void e() {
	}

	protected void a(ajs ajs, co co, atl atl) {
		if (this.a) {
			ajs.a(co, atl, 3);
		} else {
			ajs.a(co, atl, 2);
		}
	}
}
