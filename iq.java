import java.io.IOException;

public class iq implements fm<im> {
	private iq.a a;

	public iq() {
	}

	public iq(iq.a a) {
		this.a = a;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.a(iq.a.class);
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
	}

	public void a(im im) {
		im.a(this);
	}

	public iq.a a() {
		return this.a;
	}

	public static enum a {
		PERFORM_RESPAWN,
		REQUEST_STATS,
		OPEN_INVENTORY_ACHIEVEMENT;
	}
}
