import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class cag {
	private static final ExecutorService a = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
	private final bza b;
	private final File c;
	private final MinecraftSessionService d;
	private final LoadingCache<GameProfile, Map<Type, MinecraftProfileTexture>> e;

	public cag(bza bza, File file, MinecraftSessionService minecraftSessionService) {
		this.b = bza;
		this.c = file;
		this.d = minecraftSessionService;
		this.e = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new CacheLoader<GameProfile, Map<Type, MinecraftProfileTexture>>() {
			public Map<Type, MinecraftProfileTexture> load(GameProfile gameProfile) throws Exception {
				try {
					return bes.z().X().getTextures(gameProfile, false);
				} catch (Throwable var3) {
					return Maps.newHashMap();
				}
			}
		});
	}

	public kq a(MinecraftProfileTexture minecraftProfileTexture, Type type) {
		return this.a(minecraftProfileTexture, type, null);
	}

	public kq a(MinecraftProfileTexture minecraftProfileTexture, Type type, @Nullable cag.a a) {
		final kq kq5 = new kq("skins/" + minecraftProfileTexture.getHash());
		bzb bzb6 = this.b.b(kq5);
		if (bzb6 != null) {
			if (a != null) {
				a.a(type, kq5, minecraftProfileTexture);
			}
		} else {
			File file7 = new File(this.c, minecraftProfileTexture.getHash().length() > 2 ? minecraftProfileTexture.getHash().substring(0, 2) : "xx");
			File file8 = new File(file7, minecraftProfileTexture.getHash());
			final bqh bqh9 = type == Type.SKIN ? new bqn() : null;
			byq byq10 = new byq(file8, minecraftProfileTexture.getUrl(), bzo.a(), new bqh() {
				@Override
				public BufferedImage a(BufferedImage bufferedImage) {
					if (bqh9 != null) {
						bufferedImage = bqh9.a(bufferedImage);
					}

					return bufferedImage;
				}

				@Override
				public void a() {
					if (bqh9 != null) {
						bqh9.a();
					}

					if (a != null) {
						a.a(type, kq5, minecraftProfileTexture);
					}
				}
			});
			this.b.a(kq5, byq10);
		}

		return kq5;
	}

	public void a(GameProfile gameProfile, cag.a a, boolean boolean3) {
		cag.a.submit(new Runnable() {
			public void run() {
				final Map<Type, MinecraftProfileTexture> map2 = Maps.newHashMap();

				try {
					map2.putAll(cag.this.d.getTextures(gameProfile, boolean3));
				} catch (InsecureTextureException var3) {
				}

				if (map2.isEmpty() && gameProfile.getId().equals(bes.z().K().e().getId())) {
					gameProfile.getProperties().clear();
					gameProfile.getProperties().putAll(bes.z().L());
					map2.putAll(cag.this.d.getTextures(gameProfile, false));
				}

				bes.z().a(new Runnable() {
					public void run() {
						if (map2.containsKey(Type.SKIN)) {
							cag.this.a((MinecraftProfileTexture)map2.get(Type.SKIN), Type.SKIN, a);
						}

						if (map2.containsKey(Type.CAPE)) {
							cag.this.a((MinecraftProfileTexture)map2.get(Type.CAPE), Type.CAPE, a);
						}
					}
				});
			}
		});
	}

	public Map<Type, MinecraftProfileTexture> a(GameProfile gameProfile) {
		return (Map<Type, MinecraftProfileTexture>)this.e.getUnchecked(gameProfile);
	}

	public interface a {
		void a(Type type, kq kq, MinecraftProfileTexture minecraftProfileTexture);
	}
}
