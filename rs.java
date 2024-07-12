import com.google.common.collect.Maps;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.server.MinecraftServer;

public class rs {
	private final Map<String, Object> a = Maps.newHashMap();
	private final Map<String, Object> b = Maps.newHashMap();
	private final String c = UUID.randomUUID().toString();
	private final URL d;
	private final rt e;
	private final Timer f = new Timer("Snooper Timer", true);
	private final Object g = new Object();
	private final long h;
	private boolean i;
	private int j;

	public rs(String string, rt rt, long long3) {
		try {
			this.d = new URL("http://snoop.minecraft.net/" + string + "?version=" + 2);
		} catch (MalformedURLException var6) {
			throw new IllegalArgumentException();
		}

		this.e = rt;
		this.h = long3;
	}

	public void a() {
		if (!this.i) {
			this.i = true;
			this.h();
			this.f.schedule(new TimerTask() {
				public void run() {
					if (rs.this.e.Z()) {
						Map<String, Object> map2;
						synchronized (rs.this.g) {
							map2 = Maps.newHashMap(rs.this.b);
							if (rs.this.j == 0) {
								map2.putAll(rs.this.a);
							}

							map2.put("snooper_count", rs.this.j++);
							map2.put("snooper_token", rs.this.c);
						}

						MinecraftServer minecraftServer3 = rs.this.e instanceof MinecraftServer ? (MinecraftServer)rs.this.e : null;
						ol.a(rs.this.d, map2, true, minecraftServer3 == null ? null : minecraftServer3.av());
					}
				}
			}, 0L, 900000L);
		}
	}

	private void h() {
		this.i();
		this.a("snooper_token", this.c);
		this.b("snooper_token", this.c);
		this.b("os_name", System.getProperty("os.name"));
		this.b("os_version", System.getProperty("os.version"));
		this.b("os_architecture", System.getProperty("os.arch"));
		this.b("java_version", System.getProperty("java.version"));
		this.a("version", "1.11.2");
		this.e.b(this);
	}

	private void i() {
		RuntimeMXBean runtimeMXBean2 = ManagementFactory.getRuntimeMXBean();
		List<String> list3 = runtimeMXBean2.getInputArguments();
		int integer4 = 0;

		for (String string6 : list3) {
			if (string6.startsWith("-X")) {
				this.a("jvm_arg[" + integer4++ + "]", string6);
			}
		}

		this.a("jvm_args", integer4);
	}

	public void b() {
		this.b("memory_total", Runtime.getRuntime().totalMemory());
		this.b("memory_max", Runtime.getRuntime().maxMemory());
		this.b("memory_free", Runtime.getRuntime().freeMemory());
		this.b("cpu_cores", Runtime.getRuntime().availableProcessors());
		this.e.a(this);
	}

	public void a(String string, Object object) {
		synchronized (this.g) {
			this.b.put(string, object);
		}
	}

	public void b(String string, Object object) {
		synchronized (this.g) {
			this.a.put(string, object);
		}
	}

	public Map<String, String> c() {
		Map<String, String> map2 = Maps.newLinkedHashMap();
		synchronized (this.g) {
			this.b();

			for (Entry<String, Object> entry5 : this.a.entrySet()) {
				map2.put(entry5.getKey(), entry5.getValue().toString());
			}

			for (Entry<String, Object> entry5 : this.b.entrySet()) {
				map2.put(entry5.getKey(), entry5.getValue().toString());
			}

			return map2;
		}
	}

	public boolean d() {
		return this.i;
	}

	public void e() {
		this.f.cancel();
	}

	public String f() {
		return this.c;
	}

	public long g() {
		return this.h;
	}
}
