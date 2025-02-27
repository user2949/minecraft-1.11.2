import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;

public class mp {
	public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
	private static boolean c;
	private final Map<String, mp.a> d = Maps.newHashMap();
	private final Map<UUID, mp.a> e = Maps.newHashMap();
	private final Deque<GameProfile> f = Lists.newLinkedList();
	private final GameProfileRepository g;
	protected final Gson b;
	private final File h;
	private static final ParameterizedType i = new ParameterizedType() {
		public Type[] getActualTypeArguments() {
			return new Type[]{mp.a.class};
		}

		public Type getRawType() {
			return List.class;
		}

		public Type getOwnerType() {
			return null;
		}
	};

	public mp(GameProfileRepository gameProfileRepository, File file) {
		this.g = gameProfileRepository;
		this.h = file;
		GsonBuilder gsonBuilder4 = new GsonBuilder();
		gsonBuilder4.registerTypeHierarchyAdapter(mp.a.class, new mp.b());
		this.b = gsonBuilder4.create();
		this.b();
	}

	private static GameProfile a(GameProfileRepository gameProfileRepository, String string) {
		final GameProfile[] arr3 = new GameProfile[1];
		ProfileLookupCallback profileLookupCallback4 = new ProfileLookupCallback() {
			public void onProfileLookupSucceeded(GameProfile gameProfile) {
				arr3[0] = gameProfile;
			}

			public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
				arr3[0] = null;
			}
		};
		gameProfileRepository.findProfilesByNames(new String[]{string}, Agent.MINECRAFT, profileLookupCallback4);
		if (!d() && arr3[0] == null) {
			UUID uUID5 = aay.a(new GameProfile(null, string));
			GameProfile gameProfile6 = new GameProfile(uUID5, string);
			profileLookupCallback4.onProfileLookupSucceeded(gameProfile6);
		}

		return arr3[0];
	}

	public static void a(boolean boolean1) {
		c = boolean1;
	}

	private static boolean d() {
		return c;
	}

	public void a(GameProfile gameProfile) {
		this.a(gameProfile, null);
	}

	private void a(GameProfile gameProfile, Date date) {
		UUID uUID4 = gameProfile.getId();
		if (date == null) {
			Calendar calendar5 = Calendar.getInstance();
			calendar5.setTime(new Date());
			calendar5.add(2, 1);
			date = calendar5.getTime();
		}

		String string5 = gameProfile.getName().toLowerCase(Locale.ROOT);
		mp.a a6 = new mp.a(gameProfile, date);
		if (this.e.containsKey(uUID4)) {
			mp.a a7 = (mp.a)this.e.get(uUID4);
			this.d.remove(a7.a().getName().toLowerCase(Locale.ROOT));
			this.f.remove(gameProfile);
		}

		this.d.put(gameProfile.getName().toLowerCase(Locale.ROOT), a6);
		this.e.put(uUID4, a6);
		this.f.addFirst(gameProfile);
		this.c();
	}

	@Nullable
	public GameProfile a(String string) {
		String string3 = string.toLowerCase(Locale.ROOT);
		mp.a a4 = (mp.a)this.d.get(string3);
		if (a4 != null && new Date().getTime() >= a4.c.getTime()) {
			this.e.remove(a4.a().getId());
			this.d.remove(a4.a().getName().toLowerCase(Locale.ROOT));
			this.f.remove(a4.a());
			a4 = null;
		}

		if (a4 != null) {
			GameProfile gameProfile5 = a4.a();
			this.f.remove(gameProfile5);
			this.f.addFirst(gameProfile5);
		} else {
			GameProfile gameProfile5 = a(this.g, string3);
			if (gameProfile5 != null) {
				this.a(gameProfile5);
				a4 = (mp.a)this.d.get(string3);
			}
		}

		this.c();
		return a4 == null ? null : a4.a();
	}

	public String[] a() {
		List<String> list2 = Lists.newArrayList(this.d.keySet());
		return (String[])list2.toArray(new String[list2.size()]);
	}

	@Nullable
	public GameProfile a(UUID uUID) {
		mp.a a3 = (mp.a)this.e.get(uUID);
		return a3 == null ? null : a3.a();
	}

	private mp.a b(UUID uUID) {
		mp.a a3 = (mp.a)this.e.get(uUID);
		if (a3 != null) {
			GameProfile gameProfile4 = a3.a();
			this.f.remove(gameProfile4);
			this.f.addFirst(gameProfile4);
		}

		return a3;
	}

	public void b() {
		BufferedReader bufferedReader2 = null;

		try {
			bufferedReader2 = Files.newReader(this.h, Charsets.UTF_8);
			List<mp.a> list3 = (List<mp.a>)this.b.fromJson(bufferedReader2, i);
			this.d.clear();
			this.e.clear();
			this.f.clear();
			if (list3 != null) {
				for (mp.a a5 : Lists.reverse(list3)) {
					if (a5 != null) {
						this.a(a5.a(), a5.b());
					}
				}
			}
		} catch (FileNotFoundException var9) {
		} catch (JsonParseException var10) {
		} finally {
			IOUtils.closeQuietly(bufferedReader2);
		}
	}

	public void c() {
		String string2 = this.b.toJson(this.a(1000));
		BufferedWriter bufferedWriter3 = null;

		try {
			bufferedWriter3 = Files.newWriter(this.h, Charsets.UTF_8);
			bufferedWriter3.write(string2);
			return;
		} catch (FileNotFoundException var8) {
			return;
		} catch (IOException var9) {
		} finally {
			IOUtils.closeQuietly(bufferedWriter3);
		}
	}

	private List<mp.a> a(int integer) {
		List<mp.a> list3 = Lists.newArrayList();

		for (GameProfile gameProfile6 : Lists.newArrayList(Iterators.limit(this.f.iterator(), integer))) {
			mp.a a7 = this.b(gameProfile6.getId());
			if (a7 != null) {
				list3.add(a7);
			}
		}

		return list3;
	}

	class a {
		private final GameProfile b;
		private final Date c;

		private a(GameProfile gameProfile, Date date) {
			this.b = gameProfile;
			this.c = date;
		}

		public GameProfile a() {
			return this.b;
		}

		public Date b() {
			return this.c;
		}
	}

	class b implements JsonDeserializer<mp.a>, JsonSerializer<mp.a> {
		private b() {
		}

		public JsonElement serialize(mp.a a, Type type, JsonSerializationContext jsonSerializationContext) {
			JsonObject jsonObject5 = new JsonObject();
			jsonObject5.addProperty("name", a.a().getName());
			UUID uUID6 = a.a().getId();
			jsonObject5.addProperty("uuid", uUID6 == null ? "" : uUID6.toString());
			jsonObject5.addProperty("expiresOn", mp.a.format(a.b()));
			return jsonObject5;
		}

		public mp.a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			if (jsonElement.isJsonObject()) {
				JsonObject jsonObject5 = jsonElement.getAsJsonObject();
				JsonElement jsonElement6 = jsonObject5.get("name");
				JsonElement jsonElement7 = jsonObject5.get("uuid");
				JsonElement jsonElement8 = jsonObject5.get("expiresOn");
				if (jsonElement6 != null && jsonElement7 != null) {
					String string9 = jsonElement7.getAsString();
					String string10 = jsonElement6.getAsString();
					Date date11 = null;
					if (jsonElement8 != null) {
						try {
							date11 = mp.a.parse(jsonElement8.getAsString());
						} catch (ParseException var14) {
							date11 = null;
						}
					}

					if (string10 != null && string9 != null) {
						UUID uUID12;
						try {
							uUID12 = UUID.fromString(string9);
						} catch (Throwable var13) {
							return null;
						}

						return mp.this.new a(new GameProfile(uUID12, string10), date11);
					} else {
						return null;
					}
				} else {
					return null;
				}
			} else {
				return null;
			}
		}
	}
}
