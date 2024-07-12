import java.io.IOException;
import java.util.List;

public class hz implements fm<fp> {
	private int a;
	private int[] b;

	public hz() {
	}

	public hz(sn sn) {
		this.a = sn.O();
		List<sn> list3 = sn.bx();
		this.b = new int[list3.size()];

		for (int integer4 = 0; integer4 < list3.size(); integer4++) {
			this.b[integer4] = ((sn)list3.get(integer4)).O();
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.b();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.a(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int[] a() {
		return this.b;
	}

	public int b() {
		return this.a;
	}
}
