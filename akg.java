import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class akg {
	private final akj a;
	private long b;
	private final Long2ObjectMap<akg.a> c = new Long2ObjectOpenHashMap(4096);
	private final List<akg.a> d = Lists.newArrayList();

	public akg(akj akj) {
		this.a = akj;
	}

	public akg.a a(int integer1, int integer2) {
		integer1 >>= 4;
		integer2 >>= 4;
		long long4 = (long)integer1 & 4294967295L | ((long)integer2 & 4294967295L) << 32;
		akg.a a6 = (akg.a)this.c.get(long4);
		if (a6 == null) {
			a6 = new akg.a(integer1, integer2);
			this.c.put(long4, a6);
			this.d.add(a6);
		}

		a6.d = MinecraftServer.aw();
		return a6;
	}

	public akf a(int integer1, int integer2, akf akf) {
		akf akf5 = this.a(integer1, integer2).a(integer1, integer2);
		return akf5 == null ? akf : akf5;
	}

	public void a() {
		long long2 = MinecraftServer.aw();
		long long4 = long2 - this.b;
		if (long4 > 7500L || long4 < 0L) {
			this.b = long2;

			for (int integer6 = 0; integer6 < this.d.size(); integer6++) {
				akg.a a7 = (akg.a)this.d.get(integer6);
				long long8 = long2 - a7.d;
				if (long8 > 30000L || long8 < 0L) {
					this.d.remove(integer6--);
					long long10 = (long)a7.b & 4294967295L | ((long)a7.c & 4294967295L) << 32;
					this.c.remove(long10);
				}
			}
		}
	}

	public akf[] b(int integer1, int integer2) {
		return this.a(integer1, integer2).a;
	}

	public class a {
		public akf[] a = new akf[256];
		public int b;
		public int c;
		public long d;

		public a(int integer2, int integer3) {
			this.b = integer2;
			this.c = integer3;
			akg.this.a.a(this.a, integer2 << 4, integer3 << 4, 16, 16, false);
		}

		public akf a(int integer1, int integer2) {
			return this.a[integer1 & 15 | (integer2 & 15) << 4];
		}
	}
}
