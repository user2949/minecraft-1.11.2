import java.io.IOException;

public class ho implements fm<fp> {
	private ho.a a;
	private int b;
	private double c;
	private double d;
	private double e;
	private double f;
	private long g;
	private int h;
	private int i;

	public ho() {
	}

	public ho(auf auf, ho.a a) {
		this.a = a;
		this.c = auf.f();
		this.d = auf.g();
		this.f = auf.h();
		this.e = auf.j();
		this.g = auf.i();
		this.b = auf.l();
		this.i = auf.q();
		this.h = auf.p();
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.a(ho.a.class);
		switch (this.a) {
			case SET_SIZE:
				this.e = et.readDouble();
				break;
			case LERP_SIZE:
				this.f = et.readDouble();
				this.e = et.readDouble();
				this.g = et.h();
				break;
			case SET_CENTER:
				this.c = et.readDouble();
				this.d = et.readDouble();
				break;
			case SET_WARNING_BLOCKS:
				this.i = et.g();
				break;
			case SET_WARNING_TIME:
				this.h = et.g();
				break;
			case INITIALIZE:
				this.c = et.readDouble();
				this.d = et.readDouble();
				this.f = et.readDouble();
				this.e = et.readDouble();
				this.g = et.h();
				this.b = et.g();
				this.i = et.g();
				this.h = et.g();
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		switch (this.a) {
			case SET_SIZE:
				et.writeDouble(this.e);
				break;
			case LERP_SIZE:
				et.writeDouble(this.f);
				et.writeDouble(this.e);
				et.b(this.g);
				break;
			case SET_CENTER:
				et.writeDouble(this.c);
				et.writeDouble(this.d);
				break;
			case SET_WARNING_BLOCKS:
				et.d(this.i);
				break;
			case SET_WARNING_TIME:
				et.d(this.h);
				break;
			case INITIALIZE:
				et.writeDouble(this.c);
				et.writeDouble(this.d);
				et.writeDouble(this.f);
				et.writeDouble(this.e);
				et.b(this.g);
				et.d(this.b);
				et.d(this.i);
				et.d(this.h);
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public void a(auf auf) {
		switch (this.a) {
			case SET_SIZE:
				auf.a(this.e);
				break;
			case LERP_SIZE:
				auf.a(this.f, this.e, this.g);
				break;
			case SET_CENTER:
				auf.c(this.c, this.d);
				break;
			case SET_WARNING_BLOCKS:
				auf.c(this.i);
				break;
			case SET_WARNING_TIME:
				auf.b(this.h);
				break;
			case INITIALIZE:
				auf.c(this.c, this.d);
				if (this.g > 0L) {
					auf.a(this.f, this.e, this.g);
				} else {
					auf.a(this.e);
				}

				auf.a(this.b);
				auf.c(this.i);
				auf.b(this.h);
		}
	}

	public static enum a {
		SET_SIZE,
		LERP_SIZE,
		SET_CENTER,
		INITIALIZE,
		SET_WARNING_TIME,
		SET_WARNING_BLOCKS;
	}
}
