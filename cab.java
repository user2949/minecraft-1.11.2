import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import javax.annotation.Nullable;

public class cab implements caa {
	private final caa a;

	public cab(caa caa) {
		this.a = caa;
	}

	@Override
	public InputStream a(kq kq) throws IOException {
		return this.a.a(this.c(kq));
	}

	private kq c(kq kq) {
		String string3 = kq.a();
		if (!"lang/swg_de.lang".equals(string3) && string3.startsWith("lang/") && string3.endsWith(".lang")) {
			int integer4 = string3.indexOf(95);
			if (integer4 != -1) {
				final String string5 = string3.substring(0, integer4 + 1) + string3.substring(integer4 + 1, string3.indexOf(46, integer4)).toUpperCase() + ".lang";
				return new kq(kq.b(), "") {
					@Override
					public String a() {
						return string5;
					}
				};
			}
		}

		return kq;
	}

	@Override
	public boolean b(kq kq) {
		return this.a.b(this.c(kq));
	}

	@Override
	public Set<String> c() {
		return this.a.c();
	}

	@Nullable
	@Override
	public <T extends can> T a(cap cap, String string) throws IOException {
		return this.a.a(cap, string);
	}

	@Override
	public BufferedImage a() throws IOException {
		return this.a.a();
	}

	@Override
	public String b() {
		return this.a.b();
	}
}
