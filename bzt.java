import com.google.common.base.CharMatcher;
import com.google.common.collect.Sets;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

public class bzt extends bzm {
	private static final boolean b = h.a() == h.a.WINDOWS;
	private static final CharMatcher c = CharMatcher.is('\\');

	public bzt(File file) {
		super(file);
	}

	protected static boolean a(File file, String string) throws IOException {
		String string3 = file.getCanonicalPath();
		if (b) {
			string3 = c.replaceFrom(string3, '/');
		}

		return string3.endsWith(string);
	}

	@Override
	protected InputStream a(String string) throws IOException {
		File file3 = this.d(string);
		if (file3 == null) {
			throw new cac(this.a, string);
		} else {
			return new BufferedInputStream(new FileInputStream(file3));
		}
	}

	@Override
	protected boolean b(String string) {
		return this.d(string) != null;
	}

	@Nullable
	private File d(String string) {
		try {
			File file3 = new File(this.a, string);
			if (file3.isFile() && a(file3, string)) {
				return file3;
			}
		} catch (IOException var3) {
		}

		return null;
	}

	@Override
	public Set<String> c() {
		Set<String> set2 = Sets.newHashSet();
		File file3 = new File(this.a, "assets/");
		if (file3.isDirectory()) {
			for (File file7 : file3.listFiles(DirectoryFileFilter.DIRECTORY)) {
				String string8 = a(file3, file7);
				if (string8.equals(string8.toLowerCase(Locale.ROOT))) {
					set2.add(string8.substring(0, string8.length() - 1));
				} else {
					this.c(string8);
				}
			}
		}

		return set2;
	}
}
