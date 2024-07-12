import com.google.common.collect.Maps;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;

public class ayz {
	private final Map<String, azc> a = Maps.newHashMap();
	private final String b;
	private final ph c;

	public ayz(String string, ph ph) {
		this.b = string;
		this.c = ph;
	}

	public azc a(@Nullable MinecraftServer minecraftServer, kq kq) {
		azc azc4 = this.b(minecraftServer, kq);
		if (azc4 == null) {
			azc4 = new azc();
			this.a.put(kq.a(), azc4);
		}

		return azc4;
	}

	@Nullable
	public azc b(@Nullable MinecraftServer minecraftServer, kq kq) {
		String string4 = kq.a();
		if (this.a.containsKey(string4)) {
			return (azc)this.a.get(string4);
		} else {
			if (minecraftServer == null) {
				this.c(kq);
			} else {
				this.a(kq);
			}

			return this.a.containsKey(string4) ? (azc)this.a.get(string4) : null;
		}
	}

	public boolean a(kq kq) {
		String string3 = kq.a();
		File file4 = new File(this.b, string3 + ".nbt");
		if (!file4.exists()) {
			return this.c(kq);
		} else {
			InputStream inputStream5 = null;

			boolean var6;
			try {
				inputStream5 = new FileInputStream(file4);
				this.a(string3, inputStream5);
				return true;
			} catch (Throwable var10) {
				var6 = false;
			} finally {
				IOUtils.closeQuietly(inputStream5);
			}

			return var6;
		}
	}

	private boolean c(kq kq) {
		String string3 = kq.b();
		String string4 = kq.a();
		InputStream inputStream5 = null;

		boolean var6;
		try {
			inputStream5 = MinecraftServer.class.getResourceAsStream("/assets/" + string3 + "/structures/" + string4 + ".nbt");
			this.a(string4, inputStream5);
			return true;
		} catch (Throwable var10) {
			var6 = false;
		} finally {
			IOUtils.closeQuietly(inputStream5);
		}

		return var6;
	}

	private void a(String string, InputStream inputStream) throws IOException {
		du du4 = ed.a(inputStream);
		if (!du4.b("DataVersion", 99)) {
			du4.a("DataVersion", 500);
		}

		azc azc5 = new azc();
		azc5.b(this.c.a(pf.STRUCTURE, du4));
		this.a.put(string, azc5);
	}

	public boolean c(@Nullable MinecraftServer minecraftServer, kq kq) {
		String string4 = kq.a();
		if (minecraftServer != null && this.a.containsKey(string4)) {
			File file5 = new File(this.b);
			if (!file5.exists()) {
				if (!file5.mkdirs()) {
					return false;
				}
			} else if (!file5.isDirectory()) {
				return false;
			}

			File file6 = new File(file5, string4 + ".nbt");
			azc azc7 = (azc)this.a.get(string4);
			OutputStream outputStream8 = null;

			boolean var9;
			try {
				du du9 = azc7.a(new du());
				outputStream8 = new FileOutputStream(file6);
				ed.a(du9, outputStream8);
				return true;
			} catch (Throwable var13) {
				var9 = false;
			} finally {
				IOUtils.closeQuietly(outputStream8);
			}

			return var9;
		} else {
			return false;
		}
	}

	public void b(kq kq) {
		this.a.remove(kq.a());
	}
}
