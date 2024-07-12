import java.io.IOException;

public class je implements fm<im> {
	private int a;
	private je.a b;
	private int c;

	public je() {
	}

	public je(sn sn, je.a a) {
		this(sn, a, 0);
	}

	public je(sn sn, je.a a, int integer) {
		this.a = sn.O();
		this.b = a;
		this.c = integer;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.a(je.a.class);
		this.c = et.g();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.a(this.b);
		et.d(this.c);
	}

	public void a(im im) {
		im.a(this);
	}

	public je.a b() {
		return this.b;
	}

	public int c() {
		return this.c;
	}

	public static enum a {
		START_SNEAKING,
		STOP_SNEAKING,
		STOP_SLEEPING,
		START_SPRINTING,
		STOP_SPRINTING,
		START_RIDING_JUMP,
		STOP_RIDING_JUMP,
		OPEN_INVENTORY,
		START_FALL_FLYING;
	}
}
