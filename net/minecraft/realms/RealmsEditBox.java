package net.minecraft.realms;

public class RealmsEditBox {
	private final bfq editBox;

	public RealmsEditBox(int integer1, int integer2, int integer3, int integer4, int integer5) {
		this.editBox = new bfq(integer1, bes.z().k, integer2, integer3, integer4, integer5);
	}

	public String getValue() {
		return this.editBox.b();
	}

	public void tick() {
		this.editBox.a();
	}

	public void setFocus(boolean boolean1) {
		this.editBox.b(boolean1);
	}

	public void setValue(String string) {
		this.editBox.a(string);
	}

	public void keyPressed(char character, int integer) {
		this.editBox.a(character, integer);
	}

	public boolean isFocused() {
		return this.editBox.m();
	}

	public void mouseClicked(int integer1, int integer2, int integer3) {
		this.editBox.a(integer1, integer2, integer3);
	}

	public void render() {
		this.editBox.g();
	}

	public void setMaxLength(int integer) {
		this.editBox.f(integer);
	}

	public void setIsEditable(boolean boolean1) {
		this.editBox.c(boolean1);
	}
}
