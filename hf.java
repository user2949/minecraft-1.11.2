import java.io.IOException;

public class hf implements fm<fp> {
	public hf.a a;
	public int b;
	public int c;
	public int d;
	public fb e;

	public hf() {
	}

	public hf(rx rx, hf.a a) {
		this(rx, a, true);
	}

	public hf(rx rx, hf.a a, boolean boolean3) {
		this.a = a;
		sw sw5 = rx.c();
		switch (a) {
			case END_COMBAT:
				this.d = rx.f();
				this.c = sw5 == null ? -1 : sw5.O();
				break;
			case ENTITY_DIED:
				this.b = rx.h().O();
				this.c = sw5 == null ? -1 : sw5.O();
				if (boolean3) {
					this.e = rx.b();
				} else {
					this.e = new fh("");
				}
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.a(hf.a.class);
		if (this.a == hf.a.END_COMBAT) {
			this.d = et.g();
			this.c = et.readInt();
		} else if (this.a == hf.a.ENTITY_DIED) {
			this.b = et.g();
			this.c = et.readInt();
			this.e = et.f();
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		if (this.a == hf.a.END_COMBAT) {
			et.d(this.d);
			et.writeInt(this.c);
		} else if (this.a == hf.a.ENTITY_DIED) {
			et.d(this.b);
			et.writeInt(this.c);
			et.a(this.e);
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public static enum a {
		ENTER_COMBAT,
		END_COMBAT,
		ENTITY_DIED;
	}
}
