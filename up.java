public class up extends uo {
	private final aat e;

	public up(aat aat) {
		super(aat, aay.class, 8.0F);
		this.e = aat;
	}

	@Override
	public boolean a() {
		if (this.e.dk()) {
			this.b = this.e.s_();
			return true;
		} else {
			return false;
		}
	}
}
