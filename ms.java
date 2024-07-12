import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ms {
	private static final Logger e = LogManager.getLogger();
	public static final File a = new File("banned-ips.txt");
	public static final File b = new File("banned-players.txt");
	public static final File c = new File("ops.txt");
	public static final File d = new File("white-list.txt");

	private static void a(MinecraftServer minecraftServer, Collection<String> collection, ProfileLookupCallback profileLookupCallback) {
		String[] arr4 = (String[])Iterators.toArray(Iterators.filter(collection.iterator(), new Predicate<String>() {
			public boolean apply(@Nullable String string) {
				return !oy.b(string);
			}
		}), String.class);
		if (minecraftServer.ab()) {
			minecraftServer.aA().findProfilesByNames(arr4, Agent.MINECRAFT, profileLookupCallback);
		} else {
			for (String string8 : arr4) {
				UUID uUID9 = aay.a(new GameProfile(null, string8));
				GameProfile gameProfile10 = new GameProfile(uUID9, string8);
				profileLookupCallback.onProfileLookupSucceeded(gameProfile10);
			}
		}
	}

	public static String a(MinecraftServer minecraftServer, String string) {
		if (!oy.b(string) && string.length() <= 16) {
			GameProfile gameProfile3 = minecraftServer.aB().a(string);
			if (gameProfile3 != null && gameProfile3.getId() != null) {
				return gameProfile3.getId().toString();
			} else if (!minecraftServer.R() && minecraftServer.ab()) {
				final List<GameProfile> list4 = Lists.newArrayList();
				ProfileLookupCallback profileLookupCallback5 = new ProfileLookupCallback() {
					public void onProfileLookupSucceeded(GameProfile gameProfile) {
						minecraftServer.aB().a(gameProfile);
						list4.add(gameProfile);
					}

					public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
						ms.e.warn("Could not lookup user whitelist entry for {}", new Object[]{gameProfile.getName(), exception});
					}
				};
				a(minecraftServer, Lists.newArrayList(new String[]{string}), profileLookupCallback5);
				return !list4.isEmpty() && ((GameProfile)list4.get(0)).getId() != null ? ((GameProfile)list4.get(0)).getId().toString() : "";
			} else {
				return aay.a(new GameProfile(null, string)).toString();
			}
		} else {
			return string;
		}
	}
}
