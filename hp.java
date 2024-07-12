import java.io.IOException;
import javax.annotation.Nullable;

public class hp implements fm<fp> {
	public int a;

	public hp() {
	}

	public hp(sn sn) {
		this.a = sn.O();
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Nullable
	public sn a(ajs ajs) {
		return ajs.a(this.a);
	}
}
