import com.google.common.collect.Lists;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bzr implements bzy {
	private static final Logger b = LogManager.getLogger();
	protected final List<caa> a = Lists.newArrayList();
	private final cap c;

	public bzr(cap cap) {
		this.c = cap;
	}

	public void a(caa caa) {
		this.a.add(caa);
	}

	@Override
	public Set<String> a() {
		return Collections.emptySet();
	}

	@Override
	public bzx a(kq kq) throws IOException {
		this.d(kq);
		caa caa3 = null;
		kq kq4 = c(kq);

		for (int integer5 = this.a.size() - 1; integer5 >= 0; integer5--) {
			caa caa6 = (caa)this.a.get(integer5);
			if (caa3 == null && caa6.b(kq4)) {
				caa3 = caa6;
			}

			if (caa6.b(kq)) {
				InputStream inputStream7 = null;
				if (caa3 != null) {
					inputStream7 = this.a(kq4, caa3);
				}

				return new caf(caa6.b(), kq, this.a(kq, caa6), inputStream7, this.c);
			}
		}

		throw new FileNotFoundException(kq.toString());
	}

	protected InputStream a(kq kq, caa caa) throws IOException {
		InputStream inputStream4 = caa.a(kq);
		return (InputStream)(b.isDebugEnabled() ? new bzr.a(inputStream4, kq, caa.b()) : inputStream4);
	}

	private void d(kq kq) throws IOException {
		if (kq.a().contains("..")) {
			throw new IOException("Invalid relative path to resource: " + kq);
		}
	}

	@Override
	public List<bzx> b(kq kq) throws IOException {
		this.d(kq);
		List<bzx> list3 = Lists.newArrayList();
		kq kq4 = c(kq);

		for (caa caa6 : this.a) {
			if (caa6.b(kq)) {
				InputStream inputStream7 = caa6.b(kq4) ? this.a(kq4, caa6) : null;
				list3.add(new caf(caa6.b(), kq, this.a(kq, caa6), inputStream7, this.c));
			}
		}

		if (list3.isEmpty()) {
			throw new FileNotFoundException(kq.toString());
		} else {
			return list3;
		}
	}

	static kq c(kq kq) {
		return new kq(kq.b(), kq.a() + ".mcmeta");
	}

	static class a extends InputStream {
		private final InputStream a;
		private final String b;
		private boolean c;

		public a(InputStream inputStream, kq kq, String string) {
			this.a = inputStream;
			ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
			new Exception().printStackTrace(new PrintStream(byteArrayOutputStream5));
			this.b = "Leaked resource: '" + kq + "' loaded from pack: '" + string + "'\n" + byteArrayOutputStream5;
		}

		public void close() throws IOException {
			this.a.close();
			this.c = true;
		}

		protected void finalize() throws Throwable {
			if (!this.c) {
				bzr.b.warn(this.b);
			}

			super.finalize();
		}

		public int read() throws IOException {
			return this.a.read();
		}
	}
}
