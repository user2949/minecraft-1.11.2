public class uf extends ui {
	private final sx a;

	public uf(sx sx) {
		this.a = sx;
		this.a(4);
		((we)sx.x()).c(true);
	}

	@Override
	public boolean a() {
		return this.a.aj() || this.a.ao();
	}

	@Override
	public void e() {
		if (this.a.bJ().nextFloat() < 0.8F) {
			this.a.w().a();
		}
	}
}
