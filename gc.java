import java.io.IOException;
import java.util.UUID;

public class gc implements fm<fp> {
	private UUID a;
	private gc.a b;
	private fb c;
	private float d;
	private ra.a e;
	private ra.b f;
	private boolean g;
	private boolean h;
	private boolean i;

	public gc() {
	}

	public gc(gc.a a, ra ra) {
		this.b = a;
		this.a = ra.d();
		this.c = ra.e();
		this.d = ra.f();
		this.e = ra.g();
		this.f = ra.h();
		this.g = ra.i();
		this.h = ra.j();
		this.i = ra.k();
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.i();
		this.b = et.a(gc.a.class);
		switch (this.b) {
			case ADD:
				this.c = et.f();
				this.d = et.readFloat();
				this.e = et.a(ra.a.class);
				this.f = et.a(ra.b.class);
				this.a(et.readUnsignedByte());
			case REMOVE:
			default:
				break;
			case UPDATE_PCT:
				this.d = et.readFloat();
				break;
			case UPDATE_NAME:
				this.c = et.f();
				break;
			case UPDATE_STYLE:
				this.e = et.a(ra.a.class);
				this.f = et.a(ra.b.class);
				break;
			case UPDATE_PROPERTIES:
				this.a(et.readUnsignedByte());
		}
	}

	private void a(int integer) {
		this.g = (integer & 1) > 0;
		this.h = (integer & 2) > 0;
		this.i = (integer & 2) > 0;
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.a(this.b);
		switch (this.b) {
			case ADD:
				et.a(this.c);
				et.writeFloat(this.d);
				et.a(this.e);
				et.a(this.f);
				et.writeByte(this.j());
			case REMOVE:
			default:
				break;
			case UPDATE_PCT:
				et.writeFloat(this.d);
				break;
			case UPDATE_NAME:
				et.a(this.c);
				break;
			case UPDATE_STYLE:
				et.a(this.e);
				et.a(this.f);
				break;
			case UPDATE_PROPERTIES:
				et.writeByte(this.j());
		}
	}

	private int j() {
		int integer2 = 0;
		if (this.g) {
			integer2 |= 1;
		}

		if (this.h) {
			integer2 |= 2;
		}

		if (this.i) {
			integer2 |= 2;
		}

		return integer2;
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public UUID a() {
		return this.a;
	}

	public gc.a b() {
		return this.b;
	}

	public fb c() {
		return this.c;
	}

	public float d() {
		return this.d;
	}

	public ra.a e() {
		return this.e;
	}

	public ra.b f() {
		return this.f;
	}

	public boolean g() {
		return this.g;
	}

	public boolean h() {
		return this.h;
	}

	public boolean i() {
		return this.i;
	}

	public static enum a {
		ADD,
		REMOVE,
		UPDATE_PCT,
		UPDATE_NAME,
		UPDATE_STYLE,
		UPDATE_PROPERTIES;
	}
}
