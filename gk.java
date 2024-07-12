import java.io.IOException;
import java.util.List;

public class gk implements fm<fp> {
	private int a;
	private List<afj> b;

	public gk() {
	}

	public gk(int integer, dd<afj> dd) {
		this.a = integer;
		this.b = dd.<afj>a(dd.size(), afj.a);

		for (int integer4 = 0; integer4 < this.b.size(); integer4++) {
			afj afj5 = dd.get(integer4);
			if (!afj5.b()) {
				this.b.set(integer4, afj5.l());
			}
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readUnsignedByte();
		int integer3 = et.readShort();
		this.b = dd.<afj>a(integer3, afj.a);

		for (int integer4 = 0; integer4 < integer3; integer4++) {
			this.b.set(integer4, et.k());
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
		et.writeShort(this.b.size());

		for (afj afj4 : this.b) {
			et.a(afj4);
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.a;
	}

	public List<afj> b() {
		return this.b;
	}
}
