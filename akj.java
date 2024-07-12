import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class akj {
	private avq a;
	private baj b;
	private baj c;
	private final akg d = new akg(this);
	private final List<akf> e = Lists.newArrayList(new akf[]{akk.f, akk.c, akk.g, akk.u, akk.t, akk.w, akk.x});

	protected akj() {
	}

	private akj(long long1, ajx ajx, String string) {
		this();
		if (ajx == ajx.f && !string.isEmpty()) {
			this.a = avq.a.a(string).b();
		}

		baj[] arr6 = baj.a(long1, ajx, this.a);
		this.b = arr6[0];
		this.c = arr6[1];
	}

	public akj(bbv bbv) {
		this(bbv.a(), bbv.t(), bbv.A());
	}

	public List<akf> a() {
		return this.e;
	}

	public akf a(co co) {
		return this.a(co, null);
	}

	public akf a(co co, akf akf) {
		return this.d.a(co.p(), co.r(), akf);
	}

	public float a(float float1, int integer) {
		return float1;
	}

	public akf[] a(akf[] arr, int integer2, int integer3, int integer4, int integer5) {
		bah.a();
		if (arr == null || arr.length < integer4 * integer5) {
			arr = new akf[integer4 * integer5];
		}

		int[] arr7 = this.b.a(integer2, integer3, integer4, integer5);

		try {
			for (int integer8 = 0; integer8 < integer4 * integer5; integer8++) {
				arr[integer8] = akf.a(arr7[integer8], akk.b);
			}

			return arr;
		} catch (Throwable var10) {
			b b9 = b.a(var10, "Invalid Biome id");
			c c10 = b9.a("RawBiomeBlock");
			c10.a("biomes[] size", arr.length);
			c10.a("x", integer2);
			c10.a("z", integer3);
			c10.a("w", integer4);
			c10.a("h", integer5);
			throw new f(b9);
		}
	}

	public akf[] b(@Nullable akf[] arr, int integer2, int integer3, int integer4, int integer5) {
		return this.a(arr, integer2, integer3, integer4, integer5, true);
	}

	public akf[] a(@Nullable akf[] arr, int integer2, int integer3, int integer4, int integer5, boolean boolean6) {
		bah.a();
		if (arr == null || arr.length < integer4 * integer5) {
			arr = new akf[integer4 * integer5];
		}

		if (boolean6 && integer4 == 16 && integer5 == 16 && (integer2 & 15) == 0 && (integer3 & 15) == 0) {
			akf[] arr8 = this.d.b(integer2, integer3);
			System.arraycopy(arr8, 0, arr, 0, integer4 * integer5);
			return arr;
		} else {
			int[] arr8 = this.c.a(integer2, integer3, integer4, integer5);

			for (int integer9 = 0; integer9 < integer4 * integer5; integer9++) {
				arr[integer9] = akf.a(arr8[integer9], akk.b);
			}

			return arr;
		}
	}

	public boolean a(int integer1, int integer2, int integer3, List<akf> list) {
		bah.a();
		int integer6 = integer1 - integer3 >> 2;
		int integer7 = integer2 - integer3 >> 2;
		int integer8 = integer1 + integer3 >> 2;
		int integer9 = integer2 + integer3 >> 2;
		int integer10 = integer8 - integer6 + 1;
		int integer11 = integer9 - integer7 + 1;
		int[] arr12 = this.b.a(integer6, integer7, integer10, integer11);

		try {
			for (int integer13 = 0; integer13 < integer10 * integer11; integer13++) {
				akf akf14 = akf.b(arr12[integer13]);
				if (!list.contains(akf14)) {
					return false;
				}
			}

			return true;
		} catch (Throwable var15) {
			b b14 = b.a(var15, "Invalid Biome id");
			c c15 = b14.a("Layer");
			c15.a("Layer", this.b.toString());
			c15.a("x", integer1);
			c15.a("z", integer2);
			c15.a("radius", integer3);
			c15.a("allowed", list);
			throw new f(b14);
		}
	}

	@Nullable
	public co a(int integer1, int integer2, int integer3, List<akf> list, Random random) {
		bah.a();
		int integer7 = integer1 - integer3 >> 2;
		int integer8 = integer2 - integer3 >> 2;
		int integer9 = integer1 + integer3 >> 2;
		int integer10 = integer2 + integer3 >> 2;
		int integer11 = integer9 - integer7 + 1;
		int integer12 = integer10 - integer8 + 1;
		int[] arr13 = this.b.a(integer7, integer8, integer11, integer12);
		co co14 = null;
		int integer15 = 0;

		for (int integer16 = 0; integer16 < integer11 * integer12; integer16++) {
			int integer17 = integer7 + integer16 % integer11 << 2;
			int integer18 = integer8 + integer16 / integer11 << 2;
			akf akf19 = akf.b(arr13[integer16]);
			if (list.contains(akf19) && (co14 == null || random.nextInt(integer15 + 1) == 0)) {
				co14 = new co(integer17, 0, integer18);
				integer15++;
			}
		}

		return co14;
	}

	public void b() {
		this.d.a();
	}

	public boolean c() {
		return this.a != null && this.a.G >= 0;
	}

	public akf d() {
		return this.a != null && this.a.G >= 0 ? akf.a(this.a.G) : null;
	}
}
