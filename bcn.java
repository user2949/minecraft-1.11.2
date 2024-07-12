import com.google.common.base.Charsets;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bcn {
	private static final Logger a = LogManager.getLogger();
	private static final Gson b = new GsonBuilder()
		.registerTypeAdapter(bco.class, new bco.a())
		.registerTypeAdapter(bci.class, new bci.a())
		.registerTypeAdapter(bck.class, new bck.a())
		.registerTypeHierarchyAdapter(bcj.class, new bcj.a())
		.registerTypeHierarchyAdapter(bcr.class, new bcs.a())
		.registerTypeHierarchyAdapter(bdd.class, new bde.a())
		.registerTypeHierarchyAdapter(bcl.b.class, new bcl.b.a())
		.create();
	private final LoadingCache<kq, bck> c = CacheBuilder.newBuilder().build(new bcn.a());
	private final File d;

	public bcn(File file) {
		this.d = file;
		this.a();
	}

	public bck a(kq kq) {
		return (bck)this.c.getUnchecked(kq);
	}

	public void a() {
		this.c.invalidateAll();

		for (kq kq3 : bcf.a()) {
			this.a(kq3);
		}
	}

	class a extends CacheLoader<kq, bck> {
		private a() {
		}

		public bck load(kq kq) throws Exception {
			if (kq.a().contains(".")) {
				bcn.a.debug("Invalid loot table name '{}' (can't contain periods)", new Object[]{kq});
				return bck.a;
			} else {
				bck bck3 = this.b(kq);
				if (bck3 == null) {
					bck3 = this.c(kq);
				}

				if (bck3 == null) {
					bck3 = bck.a;
					bcn.a.warn("Couldn't find resource table {}", new Object[]{kq});
				}

				return bck3;
			}
		}

		@Nullable
		private bck b(kq kq) {
			File file3 = new File(new File(bcn.this.d, kq.b()), kq.a() + ".json");
			if (file3.exists()) {
				if (file3.isFile()) {
					String string4;
					try {
						string4 = Files.toString(file3, Charsets.UTF_8);
					} catch (IOException var6) {
						bcn.a.warn("Couldn't load loot table {} from {}", new Object[]{kq, file3, var6});
						return bck.a;
					}

					try {
						return (bck)bcn.b.fromJson(string4, bck.class);
					} catch (JsonParseException var5) {
						bcn.a.error("Couldn't load loot table {} from {}", new Object[]{kq, file3, var5});
						return bck.a;
					}
				} else {
					bcn.a.warn("Expected to find loot table {} at {} but it was a folder.", new Object[]{kq, file3});
					return bck.a;
				}
			} else {
				return null;
			}
		}

		@Nullable
		private bck c(kq kq) {
			URL uRL3 = bcn.class.getResource("/assets/" + kq.b() + "/loot_tables/" + kq.a() + ".json");
			if (uRL3 != null) {
				String string4;
				try {
					string4 = Resources.toString(uRL3, Charsets.UTF_8);
				} catch (IOException var6) {
					bcn.a.warn("Couldn't load loot table {} from {}", new Object[]{kq, uRL3, var6});
					return bck.a;
				}

				try {
					return (bck)bcn.b.fromJson(string4, bck.class);
				} catch (JsonParseException var5) {
					bcn.a.error("Couldn't load loot table {} from {}", new Object[]{kq, uRL3, var5});
					return bck.a;
				}
			} else {
				return null;
			}
		}
	}
}
