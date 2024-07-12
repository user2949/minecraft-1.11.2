import net.minecraft.realms.RealmsClickableScrolledSelectionList;
import net.minecraft.realms.Tezzelator;
import org.lwjgl.input.Mouse;

public class bgl extends bgd {
	private final RealmsClickableScrolledSelectionList u;

	public bgl(RealmsClickableScrolledSelectionList realmsClickableScrolledSelectionList, int integer2, int integer3, int integer4, int integer5, int integer6) {
		super(bes.z(), integer2, integer3, integer4, integer5, integer6);
		this.u = realmsClickableScrolledSelectionList;
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
		if (this.m > 0.0F && Mouse.getEventButtonState()) {
			this.u.customMouseEvent(this.d, this.e, this.t, this.n, this.h);
		}
	}

	public void a(int integer1, int integer2, int integer3, Tezzelator tezzelator) {
		this.u.renderSelected(integer1, integer2, integer3, tezzelator);
	}

	@Override
	protected void b(int integer1, int integer2, int integer3, int integer4) {
		int integer6 = this.b();

		for (int integer7 = 0; integer7 < integer6; integer7++) {
			int integer8 = integer2 + integer7 * this.h + this.t;
			int integer9 = this.h - 4;
			if (integer8 > this.e || integer8 + integer9 < this.d) {
				this.a(integer7, integer1, integer8);
			}

			if (this.r && this.a(integer7)) {
				this.a(this.b, integer8, integer9, Tezzelator.instance);
			}

			this.a(integer7, integer1, integer8, integer9, integer3, integer4);
		}
	}
}
