import com.google.common.collect.Maps;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;

public class byj {
	private final byj.a a;
	private final String b;
	private final int c;
	private int d;

	private byj(byj.a a, int integer, String string) {
		this.a = a;
		this.c = integer;
		this.b = string;
	}

	public void a(byg byg) {
		this.d++;
		cdb.b(byg.h(), this.c);
	}

	public void b(byg byg) {
		this.d--;
		if (this.d <= 0) {
			cdb.a(this.c);
			this.a.d().remove(this.b);
		}
	}

	public String a() {
		return this.b;
	}

	public static byj a(bzy bzy, byj.a a, String string) throws IOException {
		byj byj4 = (byj)a.d().get(string);
		if (byj4 == null) {
			kq kq5 = new kq("shaders/program/" + string + a.b());
			bzx bzx6 = bzy.a(kq5);

			try {
				byte[] arr7 = IOUtils.toByteArray(new BufferedInputStream(bzx6.b()));
				ByteBuffer byteBuffer8 = BufferUtils.createByteBuffer(arr7.length);
				byteBuffer8.put(arr7);
				byteBuffer8.position(0);
				int integer9 = cdb.b(a.c());
				cdb.a(integer9, byteBuffer8);
				cdb.c(integer9);
				if (cdb.c(integer9, cdb.n) == 0) {
					String string10 = StringUtils.trim(cdb.d(integer9, 32768));
					ku ku11 = new ku("Couldn't compile " + a.a() + " program: " + string10);
					ku11.b(kq5.a());
					throw ku11;
				}

				byj4 = new byj(a, integer9, string);
				a.d().put(string, byj4);
			} finally {
				IOUtils.closeQuietly(bzx6);
			}
		}

		return byj4;
	}

	public static enum a {
		VERTEX("vertex", ".vsh", cdb.o),
		FRAGMENT("fragment", ".fsh", cdb.p);

		private final String c;
		private final String d;
		private final int e;
		private final Map<String, byj> f = Maps.newHashMap();

		private a(String string3, String string4, int integer5) {
			this.c = string3;
			this.d = string4;
			this.e = integer5;
		}

		public String a() {
			return this.c;
		}

		private String b() {
			return this.d;
		}

		private int c() {
			return this.e;
		}

		private Map<String, byj> d() {
			return this.f;
		}
	}
}
