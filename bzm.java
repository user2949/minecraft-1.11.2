import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class bzm implements caa {
	private static final Logger b = LogManager.getLogger();
	protected final File a;

	public bzm(File file) {
		this.a = file;
	}

	private static String c(kq kq) {
		return String.format("%s/%s/%s", "assets", kq.b(), kq.a());
	}

	protected static String a(File file1, File file2) {
		return file1.toURI().relativize(file2.toURI()).getPath();
	}

	@Override
	public InputStream a(kq kq) throws IOException {
		return this.a(c(kq));
	}

	@Override
	public boolean b(kq kq) {
		return this.b(c(kq));
	}

	protected abstract InputStream a(String string) throws IOException;

	protected abstract boolean b(String string);

	protected void c(String string) {
		b.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", new Object[]{string, this.a});
	}

	@Override
	public <T extends can> T a(cap cap, String string) throws IOException {
		return a(cap, this.a("pack.mcmeta"), string);
	}

	static <T extends can> T a(cap cap, InputStream inputStream, String string) {
		JsonObject jsonObject4 = null;
		BufferedReader bufferedReader5 = null;

		try {
			bufferedReader5 = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
			jsonObject4 = new JsonParser().parse(bufferedReader5).getAsJsonObject();
		} catch (RuntimeException var9) {
			throw new JsonParseException(var9);
		} finally {
			IOUtils.closeQuietly(bufferedReader5);
		}

		return cap.a(string, jsonObject4);
	}

	@Override
	public BufferedImage a() throws IOException {
		return bzc.a(this.a("pack.png"));
	}

	@Override
	public String b() {
		return this.a.getName();
	}
}
