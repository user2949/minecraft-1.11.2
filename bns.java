import java.net.IDN;
import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class bns {
	private final String a;
	private final int b;

	private bns(String string, int integer) {
		this.a = string;
		this.b = integer;
	}

	public String a() {
		try {
			return IDN.toASCII(this.a);
		} catch (IllegalArgumentException var2) {
			return "";
		}
	}

	public int b() {
		return this.b;
	}

	public static bns a(String string) {
		if (string == null) {
			return null;
		} else {
			String[] arr2 = string.split(":");
			if (string.startsWith("[")) {
				int integer3 = string.indexOf("]");
				if (integer3 > 0) {
					String string4 = string.substring(1, integer3);
					String string5 = string.substring(integer3 + 1).trim();
					if (string5.startsWith(":") && !string5.isEmpty()) {
						string5 = string5.substring(1);
						arr2 = new String[]{string4, string5};
					} else {
						arr2 = new String[]{string4};
					}
				}
			}

			if (arr2.length > 2) {
				arr2 = new String[]{string};
			}

			String string3 = arr2[0];
			int integer4 = arr2.length > 1 ? a(arr2[1], 25565) : 25565;
			if (integer4 == 25565) {
				String[] arr5 = b(string3);
				string3 = arr5[0];
				integer4 = a(arr5[1], 25565);
			}

			return new bns(string3, integer4);
		}
	}

	private static String[] b(String string) {
		try {
			String string2 = "com.sun.jndi.dns.DnsContextFactory";
			Class.forName("com.sun.jndi.dns.DnsContextFactory");
			Hashtable<String, String> hashtable3 = new Hashtable();
			hashtable3.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
			hashtable3.put("java.naming.provider.url", "dns:");
			hashtable3.put("com.sun.jndi.dns.timeout.retries", "1");
			DirContext dirContext4 = new InitialDirContext(hashtable3);
			Attributes attributes5 = dirContext4.getAttributes("_minecraft._tcp." + string, new String[]{"SRV"});
			String[] arr6 = attributes5.get("srv").get().toString().split(" ", 4);
			return new String[]{arr6[3], arr6[2]};
		} catch (Throwable var6) {
			return new String[]{string, Integer.toString(25565)};
		}
	}

	private static int a(String string, int integer) {
		try {
			return Integer.parseInt(string.trim());
		} catch (Exception var3) {
			return integer;
		}
	}
}
