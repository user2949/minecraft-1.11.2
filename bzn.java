import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bzn {
	private static final Logger a = LogManager.getLogger();
	private final Map<String, File> b = Maps.newHashMap();

	protected bzn() {
	}

	public bzn(File file, String string) {
		File file4 = new File(file, "objects");
		File file5 = new File(file, "indexes/" + string + ".json");
		BufferedReader bufferedReader6 = null;

		try {
			bufferedReader6 = Files.newReader(file5, Charsets.UTF_8);
			JsonObject jsonObject7 = new JsonParser().parse(bufferedReader6).getAsJsonObject();
			JsonObject jsonObject8 = ok.a(jsonObject7, "objects", null);
			if (jsonObject8 != null) {
				for (Entry<String, JsonElement> entry10 : jsonObject8.entrySet()) {
					JsonObject jsonObject11 = (JsonObject)entry10.getValue();
					String string12 = (String)entry10.getKey();
					String[] arr13 = string12.split("/", 2);
					String string14 = arr13.length == 1 ? arr13[0] : arr13[0] + ":" + arr13[1];
					String string15 = ok.h(jsonObject11, "hash");
					File file16 = new File(file4, string15.substring(0, 2) + "/" + string15);
					this.b.put(string14, file16);
				}
			}
		} catch (JsonParseException var20) {
			a.error("Unable to parse resource index file: {}", new Object[]{file5});
		} catch (FileNotFoundException var21) {
			a.error("Can't find the resource index file: {}", new Object[]{file5});
		} finally {
			IOUtils.closeQuietly(bufferedReader6);
		}
	}

	@Nullable
	public File a(kq kq) {
		String string3 = kq.toString();
		return (File)this.b.get(string3);
	}

	public boolean b(kq kq) {
		File file3 = this.a(kq);
		return file3 != null && file3.isFile();
	}

	public File a() {
		return (File)this.b.get("pack.mcmeta");
	}
}
