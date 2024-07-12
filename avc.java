import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class avc {
	private static final Map<File, avb> a = Maps.newHashMap();

	public static synchronized avb a(File file, int integer2, int integer3) {
		File file4 = new File(file, "region");
		File file5 = new File(file4, "r." + (integer2 >> 5) + "." + (integer3 >> 5) + ".mca");
		avb avb6 = (avb)a.get(file5);
		if (avb6 != null) {
			return avb6;
		} else {
			if (!file4.exists()) {
				file4.mkdirs();
			}

			if (a.size() >= 256) {
				a();
			}

			avb avb7 = new avb(file5);
			a.put(file5, avb7);
			return avb7;
		}
	}

	public static synchronized avb b(File file, int integer2, int integer3) {
		File file4 = new File(file, "region");
		File file5 = new File(file4, "r." + (integer2 >> 5) + "." + (integer3 >> 5) + ".mca");
		avb avb6 = (avb)a.get(file5);
		if (avb6 != null) {
			return avb6;
		} else if (file4.exists() && file5.exists()) {
			if (a.size() >= 256) {
				a();
			}

			avb avb7 = new avb(file5);
			a.put(file5, avb7);
			return avb7;
		} else {
			return null;
		}
	}

	public static synchronized void a() {
		for (avb avb2 : a.values()) {
			try {
				if (avb2 != null) {
					avb2.c();
				}
			} catch (IOException var3) {
				var3.printStackTrace();
			}
		}

		a.clear();
	}

	public static DataInputStream d(File file, int integer2, int integer3) {
		avb avb4 = a(file, integer2, integer3);
		return avb4.a(integer2 & 31, integer3 & 31);
	}

	public static DataOutputStream e(File file, int integer2, int integer3) {
		avb avb4 = a(file, integer2, integer3);
		return avb4.b(integer2 & 31, integer3 & 31);
	}

	public static boolean f(File file, int integer2, int integer3) {
		avb avb4 = b(file, integer2, integer3);
		return avb4 != null ? avb4.c(integer2 & 31, integer3 & 31) : false;
	}
}
