import java.io.IOException;
import java.security.PublicKey;

public class ju implements fm<js> {
	private String a;
	private PublicKey b;
	private byte[] c;

	public ju() {
	}

	public ju(String string, PublicKey publicKey, byte[] arr) {
		this.a = string;
		this.b = publicKey;
		this.c = arr;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e(20);
		this.b = oi.a(et.a());
		this.c = et.a();
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.a(this.b.getEncoded());
		et.a(this.c);
	}

	public void a(js js) {
		js.a(this);
	}

	public String a() {
		return this.a;
	}

	public PublicKey b() {
		return this.b;
	}

	public byte[] c() {
		return this.c;
	}
}
