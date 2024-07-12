package net.minecraft.realms;

import com.mojang.util.UUIDTypeAdapter;
import java.util.List;

public class RealmsScreen {
	public static final int SKIN_HEAD_U = 8;
	public static final int SKIN_HEAD_V = 8;
	public static final int SKIN_HEAD_WIDTH = 8;
	public static final int SKIN_HEAD_HEIGHT = 8;
	public static final int SKIN_HAT_U = 40;
	public static final int SKIN_HAT_V = 8;
	public static final int SKIN_HAT_WIDTH = 8;
	public static final int SKIN_HAT_HEIGHT = 8;
	public static final int SKIN_TEX_WIDTH = 64;
	public static final int SKIN_TEX_HEIGHT = 64;
	protected bes minecraft;
	public int width;
	public int height;
	private final bgm proxy = new bgm(this);

	public bgm getProxy() {
		return this.proxy;
	}

	public void init() {
	}

	public void init(bes bes, int integer2, int integer3) {
	}

	public void drawCenteredString(String string, int integer2, int integer3, int integer4) {
		this.proxy.a(string, integer2, integer3, integer4);
	}

	public void drawString(String string, int integer2, int integer3, int integer4) {
		this.drawString(string, integer2, integer3, integer4, true);
	}

	public void drawString(String string, int integer2, int integer3, int integer4, boolean boolean5) {
		this.proxy.a(string, integer2, integer3, integer4, false);
	}

	public void blit(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.proxy.b(integer1, integer2, integer3, integer4, integer5, integer6);
	}

	public static void blit(
		int integer1, int integer2, float float3, float float4, int integer5, int integer6, int integer7, int integer8, float float9, float float10
	) {
		bfi.a(integer1, integer2, float3, float4, integer5, integer6, integer7, integer8, float9, float10);
	}

	public static void blit(int integer1, int integer2, float float3, float float4, int integer5, int integer6, float float7, float float8) {
		bfi.a(integer1, integer2, float3, float4, integer5, integer6, float7, float8);
	}

	public void fillGradient(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.proxy.a(integer1, integer2, integer3, integer4, integer5, integer6);
	}

	public void renderBackground() {
		this.proxy.c();
	}

	public boolean isPauseScreen() {
		return this.proxy.d();
	}

	public void renderBackground(int integer) {
		this.proxy.d_(integer);
	}

	public void render(int integer1, int integer2, float float3) {
		for (int integer5 = 0; integer5 < this.proxy.j().size(); integer5++) {
			((RealmsButton)this.proxy.j().get(integer5)).render(integer1, integer2);
		}
	}

	public void renderTooltip(afj afj, int integer2, int integer3) {
		this.proxy.a(afj, integer2, integer3);
	}

	public void renderTooltip(String string, int integer2, int integer3) {
		this.proxy.a(string, integer2, integer3);
	}

	public void renderTooltip(List<String> list, int integer2, int integer3) {
		this.proxy.a(list, integer2, integer3);
	}

	public static void bindFace(String string1, String string2) {
		kq kq3 = bpp.e(string2);
		if (kq3 == null) {
			kq3 = bzo.a(UUIDTypeAdapter.fromString(string1));
		}

		bpp.a(kq3, string2);
		bes.z().N().a(kq3);
	}

	public static void bind(String string) {
		kq kq2 = new kq(string);
		bes.z().N().a(kq2);
	}

	public void tick() {
	}

	public int width() {
		return this.proxy.l;
	}

	public int height() {
		return this.proxy.m;
	}

	public int fontLineHeight() {
		return this.proxy.h();
	}

	public int fontWidth(String string) {
		return this.proxy.c(string);
	}

	public void fontDrawShadow(String string, int integer2, int integer3, int integer4) {
		this.proxy.b(string, integer2, integer3, integer4);
	}

	public List<String> fontSplit(String string, int integer) {
		return this.proxy.a(string, integer);
	}

	public void buttonClicked(RealmsButton realmsButton) {
	}

	public static RealmsButton newButton(int integer1, int integer2, int integer3, String string) {
		return new RealmsButton(integer1, integer2, integer3, string);
	}

	public static RealmsButton newButton(int integer1, int integer2, int integer3, int integer4, int integer5, String string) {
		return new RealmsButton(integer1, integer2, integer3, integer4, integer5, string);
	}

	public void buttonsClear() {
		this.proxy.i();
	}

	public void buttonsAdd(RealmsButton realmsButton) {
		this.proxy.a(realmsButton);
	}

	public List<RealmsButton> buttons() {
		return this.proxy.j();
	}

	public void buttonsRemove(RealmsButton realmsButton) {
		this.proxy.b(realmsButton);
	}

	public RealmsEditBox newEditBox(int integer1, int integer2, int integer3, int integer4, int integer5) {
		return new RealmsEditBox(integer1, integer2, integer3, integer4, integer5);
	}

	public void mouseClicked(int integer1, int integer2, int integer3) {
	}

	public void mouseEvent() {
	}

	public void keyboardEvent() {
	}

	public void mouseReleased(int integer1, int integer2, int integer3) {
	}

	public void mouseDragged(int integer1, int integer2, int integer3, long long4) {
	}

	public void keyPressed(char character, int integer) {
	}

	public void confirmResult(boolean boolean1, int integer) {
	}

	public static String getLocalizedString(String string) {
		return cah.a(string);
	}

	public static String getLocalizedString(String string, Object... arr) {
		return cah.a(string, arr);
	}

	public RealmsAnvilLevelStorageSource getLevelStorageSource() {
		return new RealmsAnvilLevelStorageSource(bes.z().g());
	}

	public void removed() {
	}
}
