package net.minecraft.realms;

import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Proxy;

public class Realms {
	public static boolean isTouchScreen() {
		return bes.z().u.A;
	}

	public static Proxy getProxy() {
		return bes.z().M();
	}

	public static String sessionId() {
		bez bez1 = bes.z().K();
		return bez1 == null ? null : bez1.a();
	}

	public static String userName() {
		bez bez1 = bes.z().K();
		return bez1 == null ? null : bez1.c();
	}

	public static long currentTimeMillis() {
		return bes.I();
	}

	public static String getSessionId() {
		return bes.z().K().a();
	}

	public static String getUUID() {
		return bes.z().K().b();
	}

	public static String getName() {
		return bes.z().K().c();
	}

	public static String uuidToName(String string) {
		return bes.z().X().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(string), null), false).getName();
	}

	public static void setScreen(RealmsScreen realmsScreen) {
		bes.z().a(realmsScreen.getProxy());
	}

	public static String getGameDirectoryPath() {
		return bes.z().w.getAbsolutePath();
	}

	public static int survivalId() {
		return ajq.SURVIVAL.a();
	}

	public static int creativeId() {
		return ajq.CREATIVE.a();
	}

	public static int adventureId() {
		return ajq.ADVENTURE.a();
	}

	public static int spectatorId() {
		return ajq.SPECTATOR.a();
	}

	public static void setConnectedToRealms(boolean boolean1) {
		bes.z().a(boolean1);
	}

	public static ListenableFuture<Object> downloadResourcePack(String string1, String string2) {
		return bes.z().P().a(string1, string2);
	}

	public static void clearResourcePack() {
		bes.z().P().h();
	}

	public static boolean getRealmsNotificationsEnabled() {
		return bes.z().u.b(beu.a.REALMS_NOTIFICATIONS);
	}

	public static boolean inTitleScreen() {
		return bes.z().m != null && bes.z().m instanceof bhv;
	}

	public static void deletePlayerTag(File file) {
		if (file.exists()) {
			try {
				du du2 = ed.a(new FileInputStream(file));
				du du3 = du2.o("Data");
				du3.q("Player");
				ed.a(du2, new FileOutputStream(file));
			} catch (Exception var3) {
				var3.printStackTrace();
			}
		}
	}
}
