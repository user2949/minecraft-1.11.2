import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class jz implements fm<jx> {
	private byte[] a = new byte[0];
	private byte[] b = new byte[0];

	public jz() {
	}

	public jz(SecretKey secretKey, PublicKey publicKey, byte[] arr) {
		this.a = oi.a(publicKey, secretKey.getEncoded());
		this.b = oi.a(publicKey, arr);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.a();
		this.b = et.a();
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.a(this.b);
	}

	public void a(jx jx) {
		jx.a(this);
	}

	public SecretKey a(PrivateKey privateKey) {
		return oi.a(privateKey, this.a);
	}

	public byte[] b(PrivateKey privateKey) {
		return privateKey == null ? this.b : oi.b(privateKey, this.b);
	}
}
