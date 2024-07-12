import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.net.Proxy;
import javax.annotation.Nullable;

public class bkp {
	public final bkp.e a;
	public final bkp.a b;
	public final bkp.b c;
	public final bkp.c d;
	public final bkp.d e;

	public bkp(bkp.e e, bkp.a a, bkp.b b, bkp.c c, bkp.d d) {
		this.a = e;
		this.b = a;
		this.c = b;
		this.d = c;
		this.e = d;
	}

	public static class a {
		public final int a;
		public final int b;
		public final boolean c;
		public final boolean d;

		public a(int integer1, int integer2, boolean boolean3, boolean boolean4) {
			this.a = integer1;
			this.b = integer2;
			this.c = boolean3;
			this.d = boolean4;
		}
	}

	public static class b {
		public final File a;
		public final File b;
		public final File c;
		public final String d;

		public b(File file1, File file2, File file3, @Nullable String string) {
			this.a = file1;
			this.b = file2;
			this.c = file3;
			this.d = string;
		}

		public bzn a() {
			return (bzn)(this.d == null ? new bzq(this.c) : new bzn(this.c, this.d));
		}
	}

	public static class c {
		public final boolean a;
		public final String b;
		public final String c;

		public c(boolean boolean1, String string2, String string3) {
			this.a = boolean1;
			this.b = string2;
			this.c = string3;
		}
	}

	public static class d {
		public final String a;
		public final int b;

		public d(String string, int integer) {
			this.a = string;
			this.b = integer;
		}
	}

	public static class e {
		public final bez a;
		public final PropertyMap b;
		public final PropertyMap c;
		public final Proxy d;

		public e(bez bez, PropertyMap propertyMap2, PropertyMap propertyMap3, Proxy proxy) {
			this.a = bez;
			this.b = propertyMap2;
			this.c = propertyMap3;
			this.d = proxy;
		}
	}
}
