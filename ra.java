import java.util.UUID;

public abstract class ra {
	private final UUID h;
	protected fb a;
	protected float b;
	protected ra.a c;
	protected ra.b d;
	protected boolean e;
	protected boolean f;
	protected boolean g;

	public ra(UUID uUID, fb fb, ra.a a, ra.b b) {
		this.h = uUID;
		this.a = fb;
		this.c = a;
		this.d = b;
		this.b = 1.0F;
	}

	public UUID d() {
		return this.h;
	}

	public fb e() {
		return this.a;
	}

	public void a(fb fb) {
		this.a = fb;
	}

	public float f() {
		return this.b;
	}

	public void a(float float1) {
		this.b = float1;
	}

	public ra.a g() {
		return this.c;
	}

	public void a(ra.a a) {
		this.c = a;
	}

	public ra.b h() {
		return this.d;
	}

	public void a(ra.b b) {
		this.d = b;
	}

	public boolean i() {
		return this.e;
	}

	public ra a(boolean boolean1) {
		this.e = boolean1;
		return this;
	}

	public boolean j() {
		return this.f;
	}

	public ra b(boolean boolean1) {
		this.f = boolean1;
		return this;
	}

	public ra c(boolean boolean1) {
		this.g = boolean1;
		return this;
	}

	public boolean k() {
		return this.g;
	}

	public static enum a {
		PINK,
		BLUE,
		RED,
		GREEN,
		YELLOW,
		PURPLE,
		WHITE;
	}

	public static enum b {
		PROGRESS,
		NOTCHED_6,
		NOTCHED_10,
		NOTCHED_12,
		NOTCHED_20;
	}
}
