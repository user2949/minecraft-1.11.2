package net.minecraft.realms;

import java.util.List;

public class DisconnectedRealmsScreen extends RealmsScreen {
	private final String title;
	private final fb reason;
	private List<String> lines;
	private final RealmsScreen parent;
	private int textHeight;

	public DisconnectedRealmsScreen(RealmsScreen realmsScreen, String string, fb fb) {
		this.parent = realmsScreen;
		this.title = getLocalizedString(string);
		this.reason = fb;
	}

	@Override
	public void init() {
		Realms.setConnectedToRealms(false);
		Realms.clearResourcePack();
		this.buttonsClear();
		this.lines = this.fontSplit(this.reason.d(), this.width() - 50);
		this.textHeight = this.lines.size() * this.fontLineHeight();
		this.buttonsAdd(newButton(0, this.width() / 2 - 100, this.height() / 2 + this.textHeight / 2 + this.fontLineHeight(), getLocalizedString("gui.back")));
	}

	@Override
	public void keyPressed(char character, int integer) {
		if (integer == 1) {
			Realms.setScreen(this.parent);
		}
	}

	@Override
	public void buttonClicked(RealmsButton realmsButton) {
		if (realmsButton.id() == 0) {
			Realms.setScreen(this.parent);
		}
	}

	@Override
	public void render(int integer1, int integer2, float float3) {
		this.renderBackground();
		this.drawCenteredString(this.title, this.width() / 2, this.height() / 2 - this.textHeight / 2 - this.fontLineHeight() * 2, 11184810);
		int integer5 = this.height() / 2 - this.textHeight / 2;
		if (this.lines != null) {
			for (String string7 : this.lines) {
				this.drawCenteredString(string7, this.width() / 2, integer5, 16777215);
				integer5 += this.fontLineHeight();
			}
		}

		super.render(integer1, integer2, float3);
	}
}
