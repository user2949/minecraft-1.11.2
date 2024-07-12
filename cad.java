import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cad {
	private static final Logger c = LogManager.getLogger();
	private static final FileFilter d = new FileFilter() {
		public boolean accept(File file) {
			boolean boolean3 = file.isFile() && file.getName().endsWith(".zip");
			boolean boolean4 = file.isDirectory() && new File(file, "pack.mcmeta").isFile();
			return boolean3 || boolean4;
		}
	};
	private static final Pattern e = Pattern.compile("^[a-fA-F0-9]{40}$");
	private static final kq f = new kq("textures/misc/unknown_pack.png");
	private final File g;
	public final caa a;
	private final File h;
	public final cap b;
	private caa i;
	private final ReentrantLock j = new ReentrantLock();
	private ListenableFuture<Object> k;
	private List<cad.a> l = Lists.newArrayList();
	private final List<cad.a> m = Lists.newArrayList();

	public cad(File file1, File file2, caa caa, cap cap, beu beu) {
		this.g = file1;
		this.h = file2;
		this.a = caa;
		this.b = cap;
		this.k();
		this.b();
		Iterator<String> iterator7 = beu.l.iterator();

		while (iterator7.hasNext()) {
			String string8 = (String)iterator7.next();

			for (cad.a a10 : this.l) {
				if (a10.d().equals(string8)) {
					if (a10.f() == 3 || beu.m.contains(a10.d())) {
						this.m.add(a10);
						break;
					}

					iterator7.remove();
					c.warn("Removed selected resource pack {} because it's no longer compatible", new Object[]{a10.d()});
				}
			}
		}
	}

	public static Map<String, String> a() {
		Map<String, String> map1 = Maps.newHashMap();
		map1.put("X-Minecraft-Username", bes.z().K().c());
		map1.put("X-Minecraft-UUID", bes.z().K().b());
		map1.put("X-Minecraft-Version", "1.11.2");
		return map1;
	}

	private void k() {
		if (this.g.exists()) {
			if (!this.g.isDirectory() && (!this.g.delete() || !this.g.mkdirs())) {
				c.warn("Unable to recreate resourcepack folder, it exists but is not a directory: {}", new Object[]{this.g});
			}
		} else if (!this.g.mkdirs()) {
			c.warn("Unable to create resourcepack folder: {}", new Object[]{this.g});
		}
	}

	private List<File> l() {
		return this.g.isDirectory() ? Arrays.asList(this.g.listFiles(d)) : Collections.emptyList();
	}

	private caa b(File file) {
		caa caa3;
		if (file.isDirectory()) {
			caa3 = new bzt(file);
		} else {
			caa3 = new bzs(file);
		}

		try {
			cba cba4 = caa3.a(this.b, "pack");
			if (cba4 != null && cba4.b() == 2) {
				return new cab(caa3);
			}
		} catch (Exception var4) {
		}

		return caa3;
	}

	public void b() {
		List<cad.a> list2 = Lists.newArrayList();

		for (File file4 : this.l()) {
			cad.a a5 = new cad.a(file4);
			if (this.l.contains(a5)) {
				int integer6 = this.l.indexOf(a5);
				if (integer6 > -1 && integer6 < this.l.size()) {
					list2.add(this.l.get(integer6));
				}
			} else {
				try {
					a5.a();
					list2.add(a5);
				} catch (Exception var6) {
					list2.remove(a5);
				}
			}
		}

		this.l.removeAll(list2);

		for (cad.a a4 : this.l) {
			a4.b();
		}

		this.l = list2;
	}

	@Nullable
	public cad.a c() {
		if (this.i != null) {
			cad.a a2 = new cad.a(this.i);

			try {
				a2.a();
				return a2;
			} catch (IOException var3) {
			}
		}

		return null;
	}

	public List<cad.a> d() {
		return ImmutableList.copyOf(this.l);
	}

	public List<cad.a> e() {
		return ImmutableList.copyOf(this.m);
	}

	public void a(List<cad.a> list) {
		this.m.clear();
		this.m.addAll(list);
	}

	public File f() {
		return this.g;
	}

	public ListenableFuture<Object> a(String string1, String string2) {
		String string4 = DigestUtils.sha1Hex(string1);
		final String string5 = e.matcher(string2).matches() ? string2 : "";
		final File file6 = new File(this.h, string4);
		this.j.lock();

		try {
			this.h();
			if (file6.exists()) {
				if (this.a(string5, file6)) {
					return this.a(file6);
				}

				c.warn("Deleting file {}", new Object[]{file6});
				FileUtils.deleteQuietly(file6);
			}

			this.m();
			final bhm bhm7 = new bhm();
			Map<String, String> map8 = a();
			final bes bes9 = bes.z();
			Futures.getUnchecked(bes9.a(new Runnable() {
				public void run() {
					bes9.a(bhm7);
				}
			}));
			final SettableFuture<Object> settableFuture10 = SettableFuture.create();
			this.k = ol.a(file6, string1, map8, 52428800, bhm7, bes9.M());
			Futures.addCallback(this.k, new FutureCallback<Object>() {
				public void onSuccess(@Nullable Object object) {
					if (cad.this.a(string5, file6)) {
						cad.this.a(file6);
						settableFuture10.set(null);
					} else {
						cad.c.warn("Deleting file {}", new Object[]{file6});
						FileUtils.deleteQuietly(file6);
					}
				}

				public void onFailure(Throwable throwable) {
					FileUtils.deleteQuietly(file6);
					settableFuture10.setException(throwable);
				}
			});
			return this.k;
		} finally {
			this.j.unlock();
		}
	}

	private boolean a(String string, File file) {
		try {
			String string4 = DigestUtils.sha1Hex(new FileInputStream(file));
			if (string.isEmpty()) {
				c.info("Found file {} without verification hash", new Object[]{file});
				return true;
			}

			if (string4.toLowerCase(Locale.ROOT).equals(string.toLowerCase(Locale.ROOT))) {
				c.info("Found file {} matching requested hash {}", new Object[]{file, string});
				return true;
			}

			c.warn("File {} had wrong hash (expected {}, found {}).", new Object[]{file, string, string4});
		} catch (IOException var4) {
			c.warn("File {} couldn't be hashed.", new Object[]{file, var4});
		}

		return false;
	}

	private boolean c(File file) {
		cad.a a3 = new cad.a(file);

		try {
			a3.a();
			return true;
		} catch (Exception var4) {
			c.warn("Server resourcepack is invalid, ignoring it", var4);
			return false;
		}
	}

	private void m() {
		try {
			List<File> list2 = Lists.newArrayList(FileUtils.listFiles(this.h, TrueFileFilter.TRUE, null));
			Collections.sort(list2, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
			int integer3 = 0;

			for (File file5 : list2) {
				if (integer3++ >= 10) {
					c.info("Deleting old server resource pack {}", new Object[]{file5.getName()});
					FileUtils.deleteQuietly(file5);
				}
			}
		} catch (IllegalArgumentException var5) {
			c.error("Error while deleting old server resource pack : {}", new Object[]{var5.getMessage()});
		}
	}

	public ListenableFuture<Object> a(File file) {
		if (!this.c(file)) {
			return Futures.immediateFailedFuture(new RuntimeException("Invalid resourcepack"));
		} else {
			this.i = new bzs(file);
			return bes.z().A();
		}
	}

	@Nullable
	public caa g() {
		return this.i;
	}

	public void h() {
		this.j.lock();

		try {
			if (this.k != null) {
				this.k.cancel(true);
			}

			this.k = null;
			if (this.i != null) {
				this.i = null;
				bes.z().A();
			}
		} finally {
			this.j.unlock();
		}
	}

	public class a {
		private final caa b;
		private cba c;
		private kq d;

		private a(File file) {
			this(cad.this.b(file));
		}

		private a(caa caa) {
			this.b = caa;
		}

		public void a() throws IOException {
			this.c = this.b.a(cad.this.b, "pack");
			this.b();
		}

		public void a(bza bza) {
			BufferedImage bufferedImage3 = null;

			try {
				bufferedImage3 = this.b.a();
			} catch (IOException var5) {
			}

			if (bufferedImage3 == null) {
				try {
					bufferedImage3 = bzc.a(bes.z().O().a(cad.f).b());
				} catch (IOException var4) {
					throw new Error("Couldn't bind resource pack icon", var4);
				}
			}

			if (this.d == null) {
				this.d = bza.a("texturepackicon", new byp(bufferedImage3));
			}

			bza.a(this.d);
		}

		public void b() {
			if (this.b instanceof Closeable) {
				IOUtils.closeQuietly((Closeable)this.b);
			}
		}

		public caa c() {
			return this.b;
		}

		public String d() {
			return this.b.b();
		}

		public String e() {
			return this.c == null ? a.RED + "Invalid pack.mcmeta (or missing 'pack' section)" : this.c.a().d();
		}

		public int f() {
			return this.c == null ? 0 : this.c.b();
		}

		public boolean equals(Object object) {
			if (this == object) {
				return true;
			} else {
				return object instanceof cad.a ? this.toString().equals(object.toString()) : false;
			}
		}

		public int hashCode() {
			return this.toString().hashCode();
		}

		public String toString() {
			return String.format("%s:%s", this.b.b(), this.b instanceof bzt ? "folder" : "zip");
		}
	}
}
