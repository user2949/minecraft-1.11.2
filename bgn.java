import net.minecraft.realms.RealmsScrolledSelectionList;

public class bgn extends bgd {
	private final RealmsScrolledSelectionList u;

	public bgn(RealmsScrolledSelectionList realmsScrolledSelectionList, int integer2, int integer3, int integer4, int integer5, int integer6) {
		super(bes.z(), integer2, integer3, integer4, integer5, integer6);
		this.u = realmsScrolledSelectionList;
	}

	@Override
	protected int b() {
		return this.u.getItemCount();
	}

	@Override
	protected void a(int integer1, boolean boolean2, int integer3, int integer4) {
		this.u.selectItem(integer1, boolean2, integer3, integer4);
	}

	@Override
	protected boolean a(int integer) {
		return this.u.isSelectedItem(integer);
	}

	@Override
	protected void a() {
		this.u.renderBackground();
	}

	@Override
	protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.u.renderItem(integer1, integer2, integer3, integer4, integer5, integer6);
	}

	public int e() {
		return this.b;
	}

	public int f() {
		return this.j;
	}

	public int g() {
		return this.i;
	}

	@Override
	protected int k() {
		return this.u.getMaxPosition();
	}

	@Override
	protected int d() {
		return this.u.getScrollbarPosition();
	}

	@Override
	public void p() {
		super.p();
	}
}
