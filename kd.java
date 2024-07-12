import java.io.IOException;

public class kd implements fm<kc> {
	private long a;

	public kd() {
	}

	public kd(long long1) {
		this.a = long1;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readLong();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeLong(this.a);
	}

	public void a(kc kc) {
		kc.a(this);
	}
}
