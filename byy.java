import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class byy extends byo implements bze {
	private static final Logger h = LogManager.getLogger();
	public static final kq f = new kq("missingno");
	public static final kq g = new kq("textures/atlas/blocks.png");
	private final List<byz> i = Lists.newArrayList();
	private final Map<String, byz> j = Maps.newHashMap();
	private final Map<String, byz> k = Maps.newHashMap();
	private final String l;
	private final byr m;
	private int n;
	private final byz o = new byz("missingno");

	public byy(String string) {
		this(string, null);
	}

	public byy(String string, @Nullable byr byr) {
		this.l = string;
		this.m = byr;
	}

	private void g() {
		int[] arr2 = bzc.b;
		this.o.b(16);
		this.o.c(16);
		int[][] arr3 = new int[this.n + 1][];
		arr3[0] = arr2;
		this.o.a(Lists.newArrayList(new int[][][]{arr3}));
	}

	@Override
	public void a(bzy bzy) throws IOException {
		if (this.m != null) {
			this.a(bzy, this.m);
		}
	}

	public void a(bzy bzy, byr byr) {
		this.j.clear();
		byr.a(this);
		this.g();
		this.c();
		this.b(bzy);
	}

	public void b(bzy bzy) {
		int integer3 = bes.B();
		byw byw4 = new byw(integer3, integer3, 0, this.n);
		this.k.clear();
		this.i.clear();
		int integer5 = Integer.MAX_VALUE;
		int integer6 = 1 << this.n;

		for (Entry<String, byz> entry8 : this.j.entrySet()) {
			byz byz9 = (byz)entry8.getValue();
			kq kq10 = this.a(byz9);
			bzx bzx11 = null;

			try {
				byu byu12 = byu.a(bzy.a(kq10));
				bzx11 = bzy.a(kq10);
				boolean boolean13 = bzx11.a("animation") != null;
				byz9.a(byu12, boolean13);
			} catch (RuntimeException var22) {
				h.error("Unable to parse metadata from {}", new Object[]{kq10, var22});
				continue;
			} catch (IOException var23) {
				h.error("Using missing texture, unable to load {}", new Object[]{kq10, var23});
				continue;
			} finally {
				IOUtils.closeQuietly(bzx11);
			}

			integer5 = Math.min(integer5, Math.min(byz9.c(), byz9.d()));
			int integer12 = Math.min(Integer.lowestOneBit(byz9.c()), Integer.lowestOneBit(byz9.d()));
			if (integer12 < integer6) {
				h.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[]{kq10, byz9.c(), byz9.d(), ot.e(integer6), ot.e(integer12)});
				integer6 = integer12;
			}

			byw4.a(byz9);
		}

		int integer7 = Math.min(integer5, integer6);
		int integer8 = ot.e(integer7);
		if (integer8 < this.n) {
			h.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.l, this.n, integer8, integer7});
			this.n = integer8;
		}

		this.o.d(this.n);
		byw4.a(this.o);

		try {
			byw4.c();
		} catch (byx var21) {
			throw var21;
		}

		h.info("Created: {}x{} {}-atlas", new Object[]{byw4.a(), byw4.b(), this.l});
		bzc.a(this.b(), this.n, byw4.a(), byw4.b());
		Map<String, byz> map9 = Maps.newHashMap(this.j);

		for (byz byz11 : byw4.d()) {
			if (byz11 == this.o || this.a(bzy, byz11)) {
				String string12 = byz11.i();
				map9.remove(string12);
				this.k.put(string12, byz11);

				try {
					bzc.a(byz11.a(0), byz11.c(), byz11.d(), byz11.a(), byz11.b(), false, false);
				} catch (Throwable var20) {
					b b14 = b.a(var20, "Stitching texture atlas");
					c c15 = b14.a("Texture being stitched together");
					c15.a("Atlas path", this.l);
					c15.a("Sprite", byz11);
					throw new f(b14);
				}

				if (byz11.m()) {
					this.i.add(byz11);
				}
			}
		}

		for (byz byz11x : map9.values()) {
			byz11x.a(this.o);
		}
	}

	private boolean a(bzy bzy, byz byz) {
		kq kq4 = this.a(byz);
		bzx bzx5 = null;

		label45: {
			boolean b7;
			try {
				bzx5 = bzy.a(kq4);
				byz.a(bzx5, this.n + 1);
				break label45;
			} catch (RuntimeException var13) {
				h.error("Unable to parse metadata from {}", new Object[]{kq4, var13});
				return false;
			} catch (IOException var14) {
				h.error("Using missing texture, unable to load {}", new Object[]{kq4, var14});
				b7 = false;
			} finally {
				IOUtils.closeQuietly(bzx5);
			}

			return b7;
		}

		try {
			byz.d(this.n);
			return true;
		} catch (Throwable var12) {
			b b7 = b.a(var12, "Applying mipmap");
			c c8 = b7.a("Sprite being mipmapped");
			c8.a("Sprite name", new d<String>() {
				public String call() throws Exception {
					return byz.i();
				}
			});
			c8.a("Sprite size", new d<String>() {
				public String call() throws Exception {
					return byz.c() + " x " + byz.d();
				}
			});
			c8.a("Sprite frames", new d<String>() {
				public String call() throws Exception {
					return byz.k() + " frames";
				}
			});
			c8.a("Mipmap levels", this.n);
			throw new f(b7);
		}
	}

	private kq a(byz byz) {
		kq kq3 = new kq(byz.i());
		return new kq(kq3.b(), String.format("%s/%s%s", this.l, kq3.a(), ".png"));
	}

	public byz a(String string) {
		byz byz3 = (byz)this.k.get(string);
		if (byz3 == null) {
			byz3 = this.o;
		}

		return byz3;
	}

	public void d() {
		bzc.b(this.b());

		for (byz byz3 : this.i) {
			byz3.j();
		}
	}

	public byz a(kq kq) {
		if (kq == null) {
			throw new IllegalArgumentException("Location cannot be null!");
		} else {
			byz byz3 = (byz)this.j.get(kq);
			if (byz3 == null) {
				byz3 = byz.a(kq);
				this.j.put(kq.toString(), byz3);
			}

			return byz3;
		}
	}

	@Override
	public void e() {
		this.d();
	}

	public void a(int integer) {
		this.n = integer;
	}

	public byz f() {
		return this.o;
	}
}
