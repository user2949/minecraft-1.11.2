public class asg extends asc {
	private int a;

	@Override
	public du b(du du) {
		super.b(du);
		du.a("OutputSignal", this.a);
		return du;
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.a = du.h("OutputSignal");
	}

	public int a() {
		return this.a;
	}

	public void a(int integer) {
		this.a = integer;
	}
}
