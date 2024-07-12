import java.io.IOException;

public class jd implements fm<im> {
	private co a;
	private cv b;
	private jd.a c;

	public jd() {
	}

	public jd(jd.a a, co co, cv cv) {
		this.c = a;
		this.a = co;
		this.b = cv;
	}

	@Override
	public void a(et et) throws IOException {
		this.c = et.a(jd.a.class);
		this.a = et.e();
		this.b = cv.a(et.readUnsignedByte());
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.c);
		et.a(this.a);
		et.writeByte(this.b.a());
	}

	public void a(im im) {
		im.a(this);
	}

	public co a() {
		return this.a;
	}

	public cv b() {
		return this.b;
	}

	public jd.a c() {
		return this.c;
	}

	public static enum a {
		START_DESTROY_BLOCK,
		ABORT_DESTROY_BLOCK,
		STOP_DESTROY_BLOCK,
		DROP_ALL_ITEMS,
		DROP_ITEM,
		RELEASE_USE_ITEM,
		SWAP_HELD_ITEMS;
	}
}
