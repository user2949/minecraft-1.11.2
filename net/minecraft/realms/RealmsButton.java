package net.minecraft.realms;

public class RealmsButton {
	protected static final kq WIDGETS_LOCATION = new kq("textures/gui/widgets.png");
	private final bgk proxy;

	public RealmsButton(int integer1, int integer2, int integer3, String string) {
		this.proxy = new bgk(this, integer1, integer2, integer3, string);
	}

	public RealmsButton(int integer1, int integer2, int integer3, int integer4, int integer5, String string) {
		this.proxy = new bgk(this, integer1, integer2, integer3, string, integer4, integer5);
	}

	public bfm getProxy() {
		return this.proxy;
	}

	public int id() {
		return this.proxy.c();
	}

	public boolean active() {
		return this.proxy.d();
	}

	public void active(boolean boolean1) {
		this.proxy.b(boolean1);
	}

	public void msg(String string) {
		this.proxy.a(string);
	}

	public int getWidth() {
		return this.proxy.b();
	}

	public int getHeight() {
		return this.proxy.g();
	}

	public int y() {
		return this.proxy.e();
	}

	public void render(int integer1, int integer2) {
		this.proxy.a(bes.z(), integer1, integer2);
	}

	public void clicked(int integer1, int integer2) {
	}

	public void released(int integer1, int integer2) {
	}

	public void blit(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.proxy.b(integer1, integer2, integer3, integer4, integer5, integer6);
	}

	public void renderBg(int integer1, int integer2) {
	}

	public int getYImage(boolean boolean1) {
		return this.proxy.c(boolean1);
	}
}
