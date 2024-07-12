import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bzc {
	private static final Logger c = LogManager.getLogger();
	private static final IntBuffer d = ber.f(4194304);
	public static final byp a = new byp(16, 16);
	public static final int[] b = a.e();
	private static final float[] e;
	private static final int[] f;

	private static float d(int integer) {
		return e[integer & 0xFF];
	}

	public static int a() {
		return bqg.A();
	}

	public static void a(int integer) {
		bqg.h(integer);
	}

	public static int a(int integer, BufferedImage bufferedImage) {
		return a(integer, bufferedImage, false, false);
	}

	public static void a(int integer1, int[] arr, int integer3, int integer4) {
		b(integer1);
		a(0, arr, integer3, integer4, 0, 0, false, false, false);
	}

	public static int[][] a(int integer1, int integer2, int[][] arr) {
		int[][] arr4 = new int[integer1 + 1][];
		arr4[0] = arr[0];
		if (integer1 > 0) {
			boolean boolean5 = false;

			for (int integer6 = 0; integer6 < arr.length; integer6++) {
				if (arr[0][integer6] >> 24 == 0) {
					boolean5 = true;
					break;
				}
			}

			for (int integer6x = 1; integer6x <= integer1; integer6x++) {
				if (arr[integer6x] != null) {
					arr4[integer6x] = arr[integer6x];
				} else {
					int[] arr7 = arr4[integer6x - 1];
					int[] arr8 = new int[arr7.length >> 2];
					int integer9 = integer2 >> integer6x;
					int integer10 = arr8.length / integer9;
					int integer11 = integer9 << 1;

					for (int integer12 = 0; integer12 < integer9; integer12++) {
						for (int integer13 = 0; integer13 < integer10; integer13++) {
							int integer14 = 2 * (integer12 + integer13 * integer11);
							arr8[integer12 + integer13 * integer9] = a(
								arr7[integer14 + 0], arr7[integer14 + 1], arr7[integer14 + 0 + integer11], arr7[integer14 + 1 + integer11], boolean5
							);
						}
					}

					arr4[integer6x] = arr8;
				}
			}
		}

		return arr4;
	}

	private static int a(int integer1, int integer2, int integer3, int integer4, boolean boolean5) {
		if (boolean5) {
			f[0] = integer1;
			f[1] = integer2;
			f[2] = integer3;
			f[3] = integer4;
			float float6 = 0.0F;
			float float7 = 0.0F;
			float float8 = 0.0F;
			float float9 = 0.0F;

			for (int integer10 = 0; integer10 < 4; integer10++) {
				if (f[integer10] >> 24 != 0) {
					float6 += d(f[integer10] >> 24);
					float7 += d(f[integer10] >> 16);
					float8 += d(f[integer10] >> 8);
					float9 += d(f[integer10] >> 0);
				}
			}

			float6 /= 4.0F;
			float7 /= 4.0F;
			float8 /= 4.0F;
			float9 /= 4.0F;
			int integer10x = (int)(Math.pow((double)float6, 0.45454545454545453) * 255.0);
			int integer11 = (int)(Math.pow((double)float7, 0.45454545454545453) * 255.0);
			int integer12 = (int)(Math.pow((double)float8, 0.45454545454545453) * 255.0);
			int integer13 = (int)(Math.pow((double)float9, 0.45454545454545453) * 255.0);
			if (integer10x < 96) {
				integer10x = 0;
			}

			return integer10x << 24 | integer11 << 16 | integer12 << 8 | integer13;
		} else {
			int integer6 = a(integer1, integer2, integer3, integer4, 24);
			int integer7 = a(integer1, integer2, integer3, integer4, 16);
			int integer8 = a(integer1, integer2, integer3, integer4, 8);
			int integer9 = a(integer1, integer2, integer3, integer4, 0);
			return integer6 << 24 | integer7 << 16 | integer8 << 8 | integer9;
		}
	}

	private static int a(int integer1, int integer2, int integer3, int integer4, int integer5) {
		float float6 = d(integer1 >> integer5);
		float float7 = d(integer2 >> integer5);
		float float8 = d(integer3 >> integer5);
		float float9 = d(integer4 >> integer5);
		float float10 = (float)((double)((float)Math.pow((double)(float6 + float7 + float8 + float9) * 0.25, 0.45454545454545453)));
		return (int)((double)float10 * 255.0);
	}

	public static void a(int[][] arr, int integer2, int integer3, int integer4, int integer5, boolean boolean6, boolean boolean7) {
		for (int integer8 = 0; integer8 < arr.length; integer8++) {
			int[] arr9 = arr[integer8];
			a(integer8, arr9, integer2 >> integer8, integer3 >> integer8, integer4 >> integer8, integer5 >> integer8, boolean6, boolean7, arr.length > 1);
		}
	}

	private static void a(int integer1, int[] arr, int integer3, int integer4, int integer5, int integer6, boolean boolean7, boolean boolean8, boolean boolean9) {
		int integer10 = 4194304 / integer3;
		a(boolean7, boolean9);
		a(boolean8);
		int integer11 = 0;

		while (integer11 < integer3 * integer4) {
			int integer12 = integer11 / integer3;
			int integer13 = Math.min(integer10, integer4 - integer12);
			int integer14 = integer3 * integer13;
			b(arr, integer11, integer14);
			bqg.b(3553, integer1, integer5, integer6 + integer12, integer3, integer13, 32993, 33639, d);
			integer11 += integer3 * integer13;
		}
	}

	public static int a(int integer, BufferedImage bufferedImage, boolean boolean3, boolean boolean4) {
		a(integer, bufferedImage.getWidth(), bufferedImage.getHeight());
		return a(integer, bufferedImage, 0, 0, boolean3, boolean4);
	}

	public static void a(int integer1, int integer2, int integer3) {
		a(integer1, 0, integer2, integer3);
	}

	public static void a(int integer1, int integer2, int integer3, int integer4) {
		a(integer1);
		b(integer1);
		if (integer2 >= 0) {
			bqg.b(3553, 33085, integer2);
			bqg.b(3553, 33082, 0);
			bqg.b(3553, 33083, integer2);
			bqg.b(3553, 34049, 0.0F);
		}

		for (int integer5 = 0; integer5 <= integer2; integer5++) {
			bqg.a(3553, integer5, 6408, integer3 >> integer5, integer4 >> integer5, 0, 32993, 33639, null);
		}
	}

	public static int a(int integer1, BufferedImage bufferedImage, int integer3, int integer4, boolean boolean5, boolean boolean6) {
		b(integer1);
		a(bufferedImage, integer3, integer4, boolean5, boolean6);
		return integer1;
	}

	private static void a(BufferedImage bufferedImage, int integer2, int integer3, boolean boolean4, boolean boolean5) {
		int integer6 = bufferedImage.getWidth();
		int integer7 = bufferedImage.getHeight();
		int integer8 = 4194304 / integer6;
		int[] arr9 = new int[integer8 * integer6];
		b(boolean4);
		a(boolean5);

		for (int integer10 = 0; integer10 < integer6 * integer7; integer10 += integer6 * integer8) {
			int integer11 = integer10 / integer6;
			int integer12 = Math.min(integer8, integer7 - integer11);
			int integer13 = integer6 * integer12;
			bufferedImage.getRGB(0, integer11, integer6, integer12, arr9, 0, integer6);
			a(arr9, integer13);
			bqg.b(3553, 0, integer2, integer3 + integer11, integer6, integer12, 32993, 33639, d);
		}
	}

	private static void a(boolean boolean1) {
		if (boolean1) {
			bqg.b(3553, 10242, 10496);
			bqg.b(3553, 10243, 10496);
		} else {
			bqg.b(3553, 10242, 10497);
			bqg.b(3553, 10243, 10497);
		}
	}

	private static void b(boolean boolean1) {
		a(boolean1, false);
	}

	private static void a(boolean boolean1, boolean boolean2) {
		if (boolean1) {
			bqg.b(3553, 10241, boolean2 ? 9987 : 9729);
			bqg.b(3553, 10240, 9729);
		} else {
			bqg.b(3553, 10241, boolean2 ? 9986 : 9728);
			bqg.b(3553, 10240, 9728);
		}
	}

	private static void a(int[] arr, int integer) {
		b(arr, 0, integer);
	}

	private static void b(int[] arr, int integer2, int integer3) {
		int[] arr4 = arr;
		if (bes.z().u.f) {
			arr4 = a(arr);
		}

		d.clear();
		d.put(arr4, integer2, integer3);
		d.position(0).limit(integer3);
	}

	static void b(int integer) {
		bqg.i(integer);
	}

	public static int[] a(bzy bzy, kq kq) throws IOException {
		bzx bzx3 = null;

		int[] var7;
		try {
			bzx3 = bzy.a(kq);
			BufferedImage bufferedImage4 = a(bzx3.b());
			int integer5 = bufferedImage4.getWidth();
			int integer6 = bufferedImage4.getHeight();
			int[] arr7 = new int[integer5 * integer6];
			bufferedImage4.getRGB(0, 0, integer5, integer6, arr7, 0, integer5);
			var7 = arr7;
		} finally {
			IOUtils.closeQuietly(bzx3);
		}

		return var7;
	}

	public static BufferedImage a(InputStream inputStream) throws IOException {
		BufferedImage var1;
		try {
			var1 = ImageIO.read(inputStream);
		} finally {
			IOUtils.closeQuietly(inputStream);
		}

		return var1;
	}

	public static int[] a(int[] arr) {
		int[] arr2 = new int[arr.length];

		for (int integer3 = 0; integer3 < arr.length; integer3++) {
			arr2[integer3] = c(arr[integer3]);
		}

		return arr2;
	}

	public static int c(int integer) {
		int integer2 = integer >> 24 & 0xFF;
		int integer3 = integer >> 16 & 0xFF;
		int integer4 = integer >> 8 & 0xFF;
		int integer5 = integer & 0xFF;
		int integer6 = (integer3 * 30 + integer4 * 59 + integer5 * 11) / 100;
		int integer7 = (integer3 * 30 + integer4 * 70) / 100;
		int integer8 = (integer3 * 30 + integer5 * 70) / 100;
		return integer2 << 24 | integer6 << 16 | integer7 << 8 | integer8;
	}

	public static void a(int[] arr, int integer2, int integer3) {
		int[] arr4 = new int[integer2];
		int integer5 = integer3 / 2;

		for (int integer6 = 0; integer6 < integer5; integer6++) {
			System.arraycopy(arr, integer6 * integer2, arr4, 0, integer2);
			System.arraycopy(arr, (integer3 - 1 - integer6) * integer2, arr, integer6 * integer2, integer2);
			System.arraycopy(arr4, 0, arr, (integer3 - 1 - integer6) * integer2, integer2);
		}
	}

	static {
		int integer1 = -16777216;
		int integer2 = -524040;
		int[] arr3 = new int[]{-524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040};
		int[] arr4 = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
		int integer5 = arr3.length;

		for (int integer6 = 0; integer6 < 16; integer6++) {
			System.arraycopy(integer6 < integer5 ? arr3 : arr4, 0, b, 16 * integer6, integer5);
			System.arraycopy(integer6 < integer5 ? arr4 : arr3, 0, b, 16 * integer6 + integer5, integer5);
		}

		a.d();
		e = new float[256];

		for (int integer1x = 0; integer1x < e.length; integer1x++) {
			e[integer1x] = (float)Math.pow((double)((float)integer1x / 255.0F), 2.2);
		}

		f = new int[4];
	}
}
