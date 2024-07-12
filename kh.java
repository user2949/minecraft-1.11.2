import java.io.IOException;

public class kh implements fm<kg> {
	private long a;

	public kh() {
	}

	public kh(long long1) {
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

	public void a(kg kg) {
		kg.a(this);
	}

	public long a() {
		return this.a;
	}
}
