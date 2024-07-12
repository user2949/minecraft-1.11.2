import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;

public class caf implements bzx {
	private final Map<String, can> a = Maps.newHashMap();
	private final String b;
	private final kq c;
	private final InputStream d;
	private final InputStream e;
	private final cap f;
	private boolean g;
	private JsonObject h;

	public caf(String string, kq kq, InputStream inputStream3, InputStream inputStream4, cap cap) {
		this.b = string;
		this.c = kq;
		this.d = inputStream3;
		this.e = inputStream4;
		this.f = cap;
	}

	@Override
	public kq a() {
		return this.c;
	}

	@Override
	public InputStream b() {
		return this.d;
	}

	@Override
	public boolean c() {
		return this.e != null;
	}

	@Nullable
	@Override
	public <T extends can> T a(String string) {
		if (!this.c()) {
			return null;
		} else {
			if (this.h == null && !this.g) {
				this.g = true;
				BufferedReader bufferedReader3 = null;

				try {
					bufferedReader3 = new BufferedReader(new InputStreamReader(this.e));
					this.h = new JsonParser().parse(bufferedReader3).getAsJsonObject();
				} finally {
					IOUtils.closeQuietly(bufferedReader3);
				}
			}

			T can3 = (T)this.a.get(string);
			if (can3 == null) {
				can3 = this.f.a(string, this.h);
			}

			return can3;
		}
	}

	@Override
	public String d() {
		return this.b;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof caf)) {
			return false;
		} else {
			caf caf3 = (caf)object;
			if (this.c != null ? this.c.equals(caf3.c) : caf3.c == null) {
				return this.b != null ? this.b.equals(caf3.b) : caf3.b == null;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		int integer2 = this.b != null ? this.b.hashCode() : 0;
		return 31 * integer2 + (this.c != null ? this.c.hashCode() : 0);
	}

	public void close() throws IOException {
		this.d.close();
		if (this.e != null) {
			this.e.close();
		}
	}
}
