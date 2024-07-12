import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class kn {
	private static final Logger a = LogManager.getLogger();
	private static final Map<Class<? extends sn>, Integer> b = Maps.newHashMap();
	private final sn c;
	private final Map<Integer, kn.a<?>> d = Maps.newHashMap();
	private final ReadWriteLock e = new ReentrantReadWriteLock();
	private boolean f = true;
	private boolean g;

	public kn(sn sn) {
		this.c = sn;
	}

	public static <T> kk<T> a(Class<? extends sn> class1, kl<T> kl) {
		if (a.isDebugEnabled()) {
			try {
				Class<?> class3 = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
				if (!class3.equals(class1)) {
					a.debug("defineId called for: {} from {}", new Object[]{class1, class3, new RuntimeException()});
				}
			} catch (ClassNotFoundException var5) {
			}
		}

		int integer3;
		if (b.containsKey(class1)) {
			integer3 = (Integer)b.get(class1) + 1;
		} else {
			int integer4 = 0;
			Class<?> class5 = class1;

			while (class5 != sn.class) {
				class5 = class5.getSuperclass();
				if (b.containsKey(class5)) {
					integer4 = (Integer)b.get(class5) + 1;
					break;
				}
			}

			integer3 = integer4;
		}

		if (integer3 > 254) {
			throw new IllegalArgumentException("Data value id is too big with " + integer3 + "! (Max is " + 254 + ")");
		} else {
			b.put(class1, integer3);
			return kl.a(integer3);
		}
	}

	public <T> void a(kk<T> kk, T object) {
		int integer4 = kk.a();
		if (integer4 > 254) {
			throw new IllegalArgumentException("Data value id is too big with " + integer4 + "! (Max is " + 254 + ")");
		} else if (this.d.containsKey(integer4)) {
			throw new IllegalArgumentException("Duplicate id value for " + integer4 + "!");
		} else if (km.b(kk.b()) < 0) {
			throw new IllegalArgumentException("Unregistered serializer " + kk.b() + " for " + integer4 + "!");
		} else {
			this.c(kk, object);
		}
	}

	private <T> void c(kk<T> kk, T object) {
		kn.a<T> a4 = new kn.a<>(kk, object);
		this.e.writeLock().lock();
		this.d.put(kk.a(), a4);
		this.f = false;
		this.e.writeLock().unlock();
	}

	private <T> kn.a<T> c(kk<T> kk) {
		this.e.readLock().lock();

		kn.a<T> a3;
		try {
			a3 = (kn.a<T>)this.d.get(kk.a());
		} catch (Throwable var6) {
			b b5 = b.a(var6, "Getting synched entity data");
			c c6 = b5.a("Synched entity data");
			c6.a("Data ID", kk);
			throw new f(b5);
		}

		this.e.readLock().unlock();
		return a3;
	}

	public <T> T a(kk<T> kk) {
		return this.c(kk).b();
	}

	public <T> void b(kk<T> kk, T object) {
		kn.a<T> a4 = this.c(kk);
		if (ObjectUtils.notEqual(object, a4.b())) {
			a4.a(object);
			this.c.a(kk);
			a4.a(true);
			this.g = true;
		}
	}

	public <T> void b(kk<T> kk) {
		this.c(kk).c = true;
		this.g = true;
	}

	public boolean a() {
		return this.g;
	}

	public static void a(List<kn.a<?>> list, et et) throws IOException {
		if (list != null) {
			int integer3 = 0;

			for (int integer4 = list.size(); integer3 < integer4; integer3++) {
				kn.a<?> a5 = (kn.a<?>)list.get(integer3);
				a(et, a5);
			}
		}

		et.writeByte(255);
	}

	@Nullable
	public List<kn.a<?>> b() {
		List<kn.a<?>> list2 = null;
		if (this.g) {
			this.e.readLock().lock();

			for (kn.a<?> a4 : this.d.values()) {
				if (a4.c()) {
					a4.a(false);
					if (list2 == null) {
						list2 = Lists.newArrayList();
					}

					list2.add(a4);
				}
			}

			this.e.readLock().unlock();
		}

		this.g = false;
		return list2;
	}

	public void a(et et) throws IOException {
		this.e.readLock().lock();

		for (kn.a<?> a4 : this.d.values()) {
			a(et, a4);
		}

		this.e.readLock().unlock();
		et.writeByte(255);
	}

	@Nullable
	public List<kn.a<?>> c() {
		List<kn.a<?>> list2 = null;
		this.e.readLock().lock();

		for (kn.a<?> a4 : this.d.values()) {
			if (list2 == null) {
				list2 = Lists.newArrayList();
			}

			list2.add(a4);
		}

		this.e.readLock().unlock();
		return list2;
	}

	private static <T> void a(et et, kn.a<T> a) throws IOException {
		kk<T> kk3 = a.a();
		int integer4 = km.b(kk3.b());
		if (integer4 < 0) {
			throw new EncoderException("Unknown serializer type " + kk3.b());
		} else {
			et.writeByte(kk3.a());
			et.d(integer4);
			kk3.b().a(et, a.b());
		}
	}

	@Nullable
	public static List<kn.a<?>> b(et et) throws IOException {
		List<kn.a<?>> list2 = null;

		int integer3;
		while ((integer3 = et.readUnsignedByte()) != 255) {
			if (list2 == null) {
				list2 = Lists.newArrayList();
			}

			int integer4 = et.g();
			kl<?> kl5 = km.a(integer4);
			if (kl5 == null) {
				throw new DecoderException("Unknown serializer type " + integer4);
			}

			list2.add(new kn.a<>(kl5.a(integer3), kl5.a(et)));
		}

		return list2;
	}

	public void a(List<kn.a<?>> list) {
		this.e.writeLock().lock();

		for (kn.a<?> a4 : list) {
			kn.a<?> a5 = (kn.a<?>)this.d.get(a4.a().a());
			if (a5 != null) {
				this.a(a5, a4);
				this.c.a(a4.a());
			}
		}

		this.e.writeLock().unlock();
		this.g = true;
	}

	protected <T> void a(kn.a<T> a1, kn.a<?> a2) {
		a1.a((T)a2.b());
	}

	public boolean d() {
		return this.f;
	}

	public void e() {
		this.g = false;
		this.e.readLock().lock();

		for (kn.a<?> a3 : this.d.values()) {
			a3.a(false);
		}

		this.e.readLock().unlock();
	}

	public static class a<T> {
		private final kk<T> a;
		private T b;
		private boolean c;

		public a(kk<T> kk, T object) {
			this.a = kk;
			this.b = object;
			this.c = true;
		}

		public kk<T> a() {
			return this.a;
		}

		public void a(T object) {
			this.b = object;
		}

		public T b() {
			return this.b;
		}

		public boolean c() {
			return this.c;
		}

		public void a(boolean boolean1) {
			this.c = boolean1;
		}
	}
}
