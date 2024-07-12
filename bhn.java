public class bhn extends bho {
	private final bno a;
	private int f;

	public bhn(bno bno) {
		this.a = bno;
	}

	@Override
	protected void a(char character, int integer) {
	}

	@Override
	public void b() {
		this.n.clear();
	}

	@Override
	public void e() {
		this.f++;
		if (this.f % 20 == 0) {
			this.a.a(new iy());
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c(0);
		this.a(this.q, cah.a("multiplayer.downloadingTerrain"), this.l / 2, this.m / 2 - 50, 16777215);
		super.a(integer1, integer2, float3);
	}

	@Override
	public boolean d() {
		return false;
	}
}
