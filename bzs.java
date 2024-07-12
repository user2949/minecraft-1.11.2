import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class bzs extends bzm implements Closeable {
	public static final Splitter b = Splitter.on('/').omitEmptyStrings().limit(3);
	private ZipFile c;

	public bzs(File file) {
		super(file);
	}

	private ZipFile d() throws IOException {
		if (this.c == null) {
			this.c = new ZipFile(this.a);
		}

		return this.c;
	}

	@Override
	protected InputStream a(String string) throws IOException {
		ZipFile zipFile3 = this.d();
		ZipEntry zipEntry4 = zipFile3.getEntry(string);
		if (zipEntry4 == null) {
			throw new cac(this.a, string);
		} else {
			return zipFile3.getInputStream(zipEntry4);
		}
	}

	@Override
	public boolean b(String string) {
		try {
			return this.d().getEntry(string) != null;
		} catch (IOException var3) {
			return false;
		}
	}

	@Override
	public Set<String> c() {
		ZipFile zipFile2;
		try {
			zipFile2 = this.d();
		} catch (IOException var8) {
			return Collections.emptySet();
		}

		Enumeration<? extends ZipEntry> enumeration3 = zipFile2.entries();
		Set<String> set4 = Sets.newHashSet();

		while (enumeration3.hasMoreElements()) {
			ZipEntry zipEntry5 = (ZipEntry)enumeration3.nextElement();
			String string6 = zipEntry5.getName();
			if (string6.startsWith("assets/")) {
				List<String> list7 = Lists.newArrayList(b.split(string6));
				if (list7.size() > 1) {
					String string8 = (String)list7.get(1);
					if (string8.equals(string8.toLowerCase(Locale.ROOT))) {
						set4.add(string8);
					} else {
						this.c(string8);
					}
				}
			}
		}

		return set4;
	}

	protected void finalize() throws Throwable {
		this.close();
		super.finalize();
	}

	public void close() throws IOException {
		if (this.c != null) {
			this.c.close();
			this.c = null;
		}
	}
}
