import com.google.common.base.Charsets;
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
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mx<K, V extends mw<K>> {
	protected static final Logger a = LogManager.getLogger();
	protected final Gson b;
	private final File c;
	private final Map<String, V> d = Maps.newHashMap();
	private boolean e = true;
	private static final ParameterizedType f = new ParameterizedType() {
		public Type[] getActualTypeArguments() {
			return new Type[]{mw.class};
		}

		public Type getRawType() {
			return List.class;
		}

		public Type getOwnerType() {
			return null;
		}
	};

	public mx(File file) {
		this.c = file;
		GsonBuilder gsonBuilder3 = new GsonBuilder().setPrettyPrinting();
		gsonBuilder3.registerTypeHierarchyAdapter(mw.class, new mx.a());
		this.b = gsonBuilder3.create();
	}

	public boolean b() {
		return this.e;
	}

	public void a(boolean boolean1) {
		this.e = boolean1;
	}

	public void a(V mw) {
		this.d.put(this.a(mw.f()), mw);

		try {
			this.f();
		} catch (IOException var3) {
			a.warn("Could not save the list after adding a user.", var3);
		}
	}

	public V b(K object) {
		this.h();
		return (V)this.d.get(this.a(object));
	}

	public void c(K object) {
		this.d.remove(this.a(object));

		try {
			this.f();
		} catch (IOException var3) {
			a.warn("Could not save the list after removing a user.", var3);
		}
	}

	public String[] a() {
		return (String[])this.d.keySet().toArray(new String[this.d.size()]);
	}

	protected String a(K object) {
		return object.toString();
	}

	protected boolean d(K object) {
		return this.d.containsKey(this.a(object));
	}

	private void h() {
		List<K> list2 = Lists.newArrayList();

		for (V mw4 : this.d.values()) {
			if (mw4.e()) {
				list2.add(mw4.f());
			}
		}

		for (K object4 : list2) {
			this.d.remove(object4);
		}
	}

	protected mw<K> a(JsonObject jsonObject) {
		return new mw<>(null, jsonObject);
	}

	protected Map<String, V> e() {
		return this.d;
	}

	public void f() throws IOException {
		Collection<V> collection2 = this.d.values();
		String string3 = this.b.toJson(collection2);
		BufferedWriter bufferedWriter4 = null;

		try {
			bufferedWriter4 = Files.newWriter(this.c, Charsets.UTF_8);
			bufferedWriter4.write(string3);
		} finally {
			IOUtils.closeQuietly(bufferedWriter4);
		}
	}

	class a implements JsonDeserializer<mw<K>>, JsonSerializer<mw<K>> {
		private a() {
		}

		public JsonElement serialize(mw<K> mw, Type type, JsonSerializationContext jsonSerializationContext) {
			JsonObject jsonObject5 = new JsonObject();
			mw.a(jsonObject5);
			return jsonObject5;
		}

		public mw<K> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			if (jsonElement.isJsonObject()) {
				JsonObject jsonObject5 = jsonElement.getAsJsonObject();
				return mx.this.a(jsonObject5);
			} else {
				return null;
			}
		}
	}
}
