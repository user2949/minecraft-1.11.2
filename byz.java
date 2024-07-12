import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

public class byz {
	private final String j;
	protected List<int[][]> a = Lists.newArrayList();
	protected int[][] b;
	private car k;
	protected boolean c;
	protected int d;
	protected int e;
	protected int f;
	protected int g;
	private float l;
	private float m;
	private float n;
	private float o;
	protected int h;
	protected int i;

	protected byz(String string) {
		this.j = string;
	}

	protected static byz a(kq kq) {
		return new byz(kq.toString());
	}

	public void a(int integer1, int integer2, int integer3, int integer4, boolean boolean5) {
		this.d = integer3;
		this.e = integer4;
		this.c = boolean5;
		float float7 = (float)(0.01F / (double)integer1);
		float float8 = (float)(0.01F / (double)integer2);
		this.l = (float)integer3 / (float)((double)integer1) + float7;
		this.m = (float)(integer3 + this.f) / (float)((double)integer1) - float7;
		this.n = (float)integer4 / (float)integer2 + float8;
		this.o = (float)(integer4 + this.g) / (float)integer2 - float8;
	}

	public void a(byz byz) {
		this.d = byz.d;
		this.e = byz.e;
		this.f = byz.f;
		this.g = byz.g;
		this.c = byz.c;
		this.l = byz.l;
		this.m = byz.m;
		this.n = byz.n;
		this.o = byz.o;
	}

	public int a() {
		return this.d;
	}

	public int b() {
		return this.e;
	}

	public int c() {
		return this.f;
	}

	public int d() {
		return this.g;
	}

	public float e() {
		return this.l;
	}

	public float f() {
		return this.m;
	}

	public float a(double double1) {
		float float4 = this.m - this.l;
		return this.l + float4 * (float)double1 / 16.0F;
	}

	public float a(float float1) {
		float float3 = this.m - this.l;
		return (float1 - this.l) / float3 * 16.0F;
	}

	public float g() {
		return this.n;
	}

	public float h() {
		return this.o;
	}

	public float b(double double1) {
		float float4 = this.o - this.n;
		return this.n + float4 * (float)double1 / 16.0F;
	}

	public float b(float float1) {
		float float3 = this.o - this.n;
		return (float1 - this.n) / float3 * 16.0F;
	}

	public String i() {
		return this.j;
	}

	public void j() {
		this.i++;
		if (this.i >= this.k.a(this.h)) {
			int integer2 = this.k.c(this.h);
			int integer3 = this.k.c() == 0 ? this.a.size() : this.k.c();
			this.h = (this.h + 1) % integer3;
			this.i = 0;
			int integer4 = this.k.c(this.h);
			if (integer2 != integer4 && integer4 >= 0 && integer4 < this.a.size()) {
				bzc.a((int[][])this.a.get(integer4), this.f, this.g, this.d, this.e, false, false);
			}
		} else if (this.k.e()) {
			this.n();
		}
	}

	private void n() {
		double double2 = 1.0 - (double)this.i / (double)this.k.a(this.h);
		int integer4 = this.k.c(this.h);
		int integer5 = this.k.c() == 0 ? this.a.size() : this.k.c();
		int integer6 = this.k.c((this.h + 1) % integer5);
		if (integer4 != integer6 && integer6 >= 0 && integer6 < this.a.size()) {
			int[][] arr7 = (int[][])this.a.get(integer4);
			int[][] arr8 = (int[][])this.a.get(integer6);
			if (this.b == null || this.b.length != arr7.length) {
				this.b = new int[arr7.length][];
			}

			for (int integer9 = 0; integer9 < arr7.length; integer9++) {
				if (this.b[integer9] == null) {
					this.b[integer9] = new int[arr7[integer9].length];
				}

				if (integer9 < arr8.length && arr8[integer9].length == arr7[integer9].length) {
					for (int integer10 = 0; integer10 < arr7[integer9].length; integer10++) {
						int integer11 = arr7[integer9][integer10];
						int integer12 = arr8[integer9][integer10];
						int integer13 = this.a(double2, integer11 >> 16 & 0xFF, integer12 >> 16 & 0xFF);
						int integer14 = this.a(double2, integer11 >> 8 & 0xFF, integer12 >> 8 & 0xFF);
						int integer15 = this.a(double2, integer11 & 0xFF, integer12 & 0xFF);
						this.b[integer9][integer10] = integer11 & 0xFF000000 | integer13 << 16 | integer14 << 8 | integer15;
					}
				}
			}

			bzc.a(this.b, this.f, this.g, this.d, this.e, false, false);
		}
	}

	private int a(double double1, int integer2, int integer3) {
		return (int)(double1 * (double)integer2 + (1.0 - double1) * (double)integer3);
	}

	public int[][] a(int integer) {
		return (int[][])this.a.get(integer);
	}

	public int k() {
		return this.a.size();
	}

	public void b(int integer) {
		this.f = integer;
	}

	public void c(int integer) {
		this.g = integer;
	}

	public void a(byu byu, boolean boolean2) throws IOException {
		this.o();
		this.f = byu.a;
		this.g = byu.b;
		if (boolean2) {
			this.g = this.f;
		} else if (byu.b != byu.a) {
			throw new RuntimeException("broken aspect ratio and not an animation");
		}
	}

	public void a(bzx bzx, int integer) throws IOException {
		BufferedImage bufferedImage4 = bzc.a(bzx.b());
		car car5 = bzx.a("animation");
		int[][] arr6 = new int[integer][];
		arr6[0] = new int[bufferedImage4.getWidth() * bufferedImage4.getHeight()];
		bufferedImage4.getRGB(0, 0, bufferedImage4.getWidth(), bufferedImage4.getHeight(), arr6[0], 0, bufferedImage4.getWidth());
		if (car5 == null) {
			this.a.add(arr6);
		} else {
			int integer7 = bufferedImage4.getHeight() / this.f;
			if (car5.c() > 0) {
				for (int integer9 : car5.f()) {
					if (integer9 >= integer7) {
						throw new RuntimeException("invalid frameindex " + integer9);
					}

					this.e(integer9);
					this.a.set(integer9, a(arr6, this.f, this.f, integer9));
				}

				this.k = car5;
			} else {
				List<caq> list8 = Lists.newArrayList();

				for (int integer9 = 0; integer9 < integer7; integer9++) {
					this.a.add(a(arr6, this.f, this.f, integer9));
					list8.add(new caq(integer9, -1));
				}

				this.k = new car(list8, this.f, this.g, car5.d(), car5.e());
			}
		}
	}

	public void d(int integer) {
		List<int[][]> list3 = Lists.newArrayList();

		for (int integer4 = 0; integer4 < this.a.size(); integer4++) {
			final int[][] arr5 = (int[][])this.a.get(integer4);
			if (arr5 != null) {
				try {
					list3.add(bzc.a(integer, this.f, arr5));
				} catch (Throwable var8) {
					b b7 = b.a(var8, "Generating mipmaps for frame");
					c c8 = b7.a("Frame being iterated");
					c8.a("Frame index", integer4);
					c8.a("Frame sizes", new d<String>() {
						public String call() throws Exception {
							StringBuilder stringBuilder2 = new StringBuilder();

							for (int[] arr6 : arr5) {
								if (stringBuilder2.length() > 0) {
									stringBuilder2.append(", ");
								}

								stringBuilder2.append(arr6 == null ? "null" : arr6.length);
							}

							return stringBuilder2.toString();
						}
					});
					throw new f(b7);
				}
			}
		}

		this.a(list3);
	}

	private void e(int integer) {
		if (this.a.size() <= integer) {
			for (int integer3 = this.a.size(); integer3 <= integer; integer3++) {
				this.a.add(null);
			}
		}
	}

	private static int[][] a(int[][] arr, int integer2, int integer3, int integer4) {
		int[][] arr5 = new int[arr.length][];

		for (int integer6 = 0; integer6 < arr.length; integer6++) {
			int[] arr7 = arr[integer6];
			if (arr7 != null) {
				arr5[integer6] = new int[(integer2 >> integer6) * (integer3 >> integer6)];
				System.arraycopy(arr7, integer4 * arr5[integer6].length, arr5[integer6], 0, arr5[integer6].length);
			}
		}

		return arr5;
	}

	public void l() {
		this.a.clear();
	}

	public boolean m() {
		return this.k != null;
	}

	public void a(List<int[][]> list) {
		this.a = list;
	}

	private void o() {
		this.k = null;
		this.a(Lists.newArrayList());
		this.h = 0;
		this.i = 0;
	}

	public String toString() {
		return "TextureAtlasSprite{name='"
			+ this.j
			+ '\''
			+ ", frameCount="
			+ this.a.size()
			+ ", rotated="
			+ this.c
			+ ", x="
			+ this.d
			+ ", y="
			+ this.e
			+ ", height="
			+ this.g
			+ ", width="
			+ this.f
			+ ", u0="
			+ this.l
			+ ", u1="
			+ this.m
			+ ", v0="
			+ this.n
			+ ", v1="
			+ this.o
			+ '}';
	}
}
