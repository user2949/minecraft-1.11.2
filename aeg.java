public class aeg extends afh {
	public aeg() {
		this.a(true);
		this.e(0);
		this.a(aej.l);
	}

	@Override
	public String a(afj afj) {
		return afj.j() == 1 ? "item.charcoal" : "item.coal";
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(afh, 1, 0));
		dd.add(new afj(afh, 1, 1));
	}
}
