package net.minecraft.realms;

import java.lang.reflect.Constructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsBridge extends RealmsScreen {
	private static final Logger LOGGER = LogManager.getLogger();
	private bho previousScreen;

	public void switchToRealms(bho bho) {
		this.previousScreen = bho;

		try {
			Class<?> class3 = Class.forName("com.mojang.realmsclient.RealmsMainScreen");
			Constructor<?> constructor4 = class3.getDeclaredConstructor(RealmsScreen.class);
			constructor4.setAccessible(true);
			Object object5 = constructor4.newInstance(this);
			bes.z().a(((RealmsScreen)object5).getProxy());
		} catch (ClassNotFoundException var5) {
			LOGGER.error("Realms module missing");
		} catch (Exception var6) {
			LOGGER.error("Failed to load Realms module", var6);
		}
	}

	public bgm getNotificationScreen(bho bho) {
		try {
			this.previousScreen = bho;
			Class<?> class3 = Class.forName("com.mojang.realmsclient.gui.screens.RealmsNotificationsScreen");
			Constructor<?> constructor4 = class3.getDeclaredConstructor(RealmsScreen.class);
			constructor4.setAccessible(true);
			Object object5 = constructor4.newInstance(this);
			return ((RealmsScreen)object5).getProxy();
		} catch (ClassNotFoundException var5) {
			LOGGER.error("Realms module missing");
		} catch (Exception var6) {
			LOGGER.error("Failed to load Realms module", var6);
		}

		return null;
	}

	@Override
	public void init() {
		bes.z().a(this.previousScreen);
	}
}
