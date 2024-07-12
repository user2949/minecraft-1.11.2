import java.io.IOException;
import javax.annotation.Nullable;

public class ht implements fm<fp> {
	private int a;
	private int b;

	public ht() {
	}

	public ht(sn sn1, @Nullable sn sn2) {
		this.a = sn1.O();
		this.b = sn2 != null ? sn2.O() : -1;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readInt();
		this.b = et.readInt();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeInt(this.a);
		et.writeInt(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}
}
