package net.minecraft.realms;

public class RealmsScrolledSelectionList {
	private final bgn proxy;

	public RealmsScrolledSelectionList(int integer1, int integer2, int integer3, int integer4, int integer5) {
		this.proxy = new bgn(this, integer1, integer2, integer3, integer4, integer5);
	}

	public void render(int integer1, int integer2, float float3) {
		this.proxy.a(integer1, integer2, float3);
	}

	public int width() {
		return this.proxy.e();
	}

	public int ym() {
		return this.proxy.f();
	}

	public int xm() {
		return this.proxy.g();
	}

	protected void renderItem(int integer1, int integer2, int integer3, int integer4, Tezzelator tezzelator, int integer6, int integer7) {
	}

	public void renderItem(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.renderItem(integer1, integer2, integer3, integer4, Tezzelator.instance, integer5, integer6);
	}

	public int getItemCount() {
		return 0;
	}

	public void selectItem(int integer1, boolean boolean2, int integer3, int integer4) {
	}

	public boolean isSelectedItem(int integer) {
		return false;
	}

	public void renderBackground() {
	}

	public int getMaxPosition() {
		return 0;
	}

	public int getScrollbarPosition() {
		return this.proxy.e() / 2 + 124;
	}

	public void mouseEvent() {
		this.proxy.p();
	}

	public void scroll(int integer) {
		this.proxy.h(integer);
	}

	public int getScroll() {
		return this.proxy.n();
	}

	protected void renderList(int integer1, int integer2, int integer3, int integer4) {
	}
}
