import java.nio.ByteBuffer;

public class bzi {
	private int a;
	private final bzj b;
	private int c;

	public bzi(bzj bzj) {
		this.b = bzj;
		this.a = cdb.e();
	}

	public void a() {
		cdb.g(cdb.R, this.a);
	}

	public void a(ByteBuffer byteBuffer) {
		this.a();
		cdb.a(cdb.R, byteBuffer, 35044);
		this.b();
		this.c = byteBuffer.limit() / this.b.g();
	}

	public void a(int integer) {
		bqg.f(integer, 0, this.c);
	}

	public void b() {
		cdb.g(cdb.R, 0);
	}

	public void c() {
		if (this.a >= 0) {
			cdb.g(this.a);
			this.a = -1;
		}
	}
}
