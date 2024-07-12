import java.io.IOException;
import javax.annotation.Nullable;

public class hk implements fm<fp> {
	private int a;
	private sg b;

	public hk() {
	}

	public hk(int integer, sg sg) {
		this.a = integer;
		this.b = sg;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = sg.a(et.readUnsignedByte());
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.writeByte(sg.a(this.b));
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Nullable
	public sn a(ajs ajs) {
		return ajs.a(this.a);
	}

	@Nullable
	public sg a() {
		return this.b;
	}
}
