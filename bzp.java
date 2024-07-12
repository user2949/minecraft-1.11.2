import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;
import javax.annotation.Nullable;

public class bzp implements caa {
	public static final Set<String> a = ImmutableSet.of("minecraft", "realms");
	private final bzn b;

	public bzp(bzn bzn) {
		this.b = bzn;
	}

	@Override
	public InputStream a(kq kq) throws IOException {
		InputStream inputStream3 = this.d(kq);
		if (inputStream3 != null) {
			return inputStream3;
		} else {
			InputStream inputStream4 = this.c(kq);
			if (inputStream4 != null) {
				return inputStream4;
			} else {
				throw new FileNotFoundException(kq.a());
			}
		}
	}

	@Nullable
	public InputStream c(kq kq) throws FileNotFoundException {
		File file3 = this.b.a(kq);
		return file3 != null && file3.isFile() ? new FileInputStream(file3) : null;
	}

	@Nullable
	private InputStream d(kq kq) {
		String string3 = "/assets/" + kq.b() + "/" + kq.a();

		try {
			URL uRL4 = bzp.class.getResource(string3);
			return uRL4 != null && bzt.a(new File(uRL4.getFile()), string3) ? bzp.class.getResourceAsStream(string3) : null;
		} catch (IOException var4) {
			return bzp.class.getResourceAsStream(string3);
		}
	}

	@Override
	public boolean b(kq kq) {
		return this.d(kq) != null || this.b.b(kq);
	}

	@Override
	public Set<String> c() {
		return a;
	}

	@Nullable
	@Override
	public <T extends can> T a(cap cap, String string) throws IOException {
		try {
			InputStream inputStream4 = new FileInputStream(this.b.a());
			return bzm.a(cap, inputStream4, string);
		} catch (RuntimeException var4) {
			return null;
		} catch (FileNotFoundException var5) {
			return null;
		}
	}

	@Override
	public BufferedImage a() throws IOException {
		return bzc.a(bzp.class.getResourceAsStream("/" + new kq("pack.png").a()));
	}

	@Override
	public String b() {
		return "Default";
	}
}
