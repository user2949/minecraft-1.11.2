import java.io.IOException;

public class id implements fm<fp> {
	private long a;
	private long b;

	public id() {
	}

	public id(long long1, long long2, boolean boolean3) {
		this.a = long1;
		this.b = long2;
		if (!boolean3) {
			this.b = -this.b;
			if (this.b == 0L) {
				this.b = -1L;
			}
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readLong();
		this.b = et.readLong();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeLong(this.a);
		et.writeLong(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public long a() {
		return this.a;
	}

	public long b() {
		return this.b;
	}
}
