public class bin extends big {
	private static final kq u = new kq("textures/gui/container/crafting_table.png");

	public bin(aax aax, ajs ajs) {
		this(aax, ajs, co.a);
	}

	public bin(aax aax, ajs ajs, co co) {
		super(new act(aax, ajs, co));
	}

	@Override
	protected void b(int integer1, int integer2) {
		this.q.a(cah.a("container.crafting"), 28, 6, 4210752);
		this.q.a(cah.a("container.inventory"), 8, this.g - 96 + 2, 4210752);
	}

	@Override
	protected void a(float float1, int integer2, int integer3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(u);
		int integer5 = (this.l - this.f) / 2;
		int integer6 = (this.m - this.g) / 2;
		this.b(integer5, integer6, 0, 0, this.f, this.g);
	}
}
