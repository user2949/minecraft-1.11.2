import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class brc {
	private final bfb a;

	public brc(bfb bfb) {
		this.a = bfb;
	}

	public boolean a(ajw ajw, cbh cbh, atl atl, co co, bpy bpy, boolean boolean6) {
		return this.a(ajw, cbh, atl, co, bpy, boolean6, ot.a(co));
	}

	public boolean a(ajw ajw, cbh cbh, atl atl, co co, bpy bpy, boolean boolean6, long long7) {
		boolean boolean10 = bes.y() && atl.d() == 0 && cbh.a();

		try {
			return boolean10 ? this.b(ajw, cbh, atl, co, bpy, boolean6, long7) : this.c(ajw, cbh, atl, co, bpy, boolean6, long7);
		} catch (Throwable var13) {
			b b12 = b.a(var13, "Tesselating block model");
			c c13 = b12.a("Block model being tesselated");
			c.a(c13, co, atl);
			c13.a("Using AO", boolean10);
			throw new f(b12);
		}
	}

	public boolean b(ajw ajw, cbh cbh, atl atl, co co, bpy bpy, boolean boolean6, long long7) {
		boolean boolean10 = false;
		float[] arr11 = new float[cv.values().length * 2];
		BitSet bitSet12 = new BitSet(3);
		brc.b b13 = new brc.b();

		for (cv cv17 : cv.values()) {
			List<brd> list18 = cbh.a(atl, cv17, long7);
			if (!list18.isEmpty() && (!boolean6 || atl.c(ajw, co, cv17))) {
				this.a(ajw, atl, co, bpy, list18, arr11, bitSet12, b13);
				boolean10 = true;
			}
		}

		List<brd> list14 = cbh.a(atl, null, long7);
		if (!list14.isEmpty()) {
			this.a(ajw, atl, co, bpy, list14, arr11, bitSet12, b13);
			boolean10 = true;
		}

		return boolean10;
	}

	public boolean c(ajw ajw, cbh cbh, atl atl, co co, bpy bpy, boolean boolean6, long long7) {
		boolean boolean10 = false;
		BitSet bitSet11 = new BitSet(3);

		for (cv cv15 : cv.values()) {
			List<brd> list16 = cbh.a(atl, cv15, long7);
			if (!list16.isEmpty() && (!boolean6 || atl.c(ajw, co, cv15))) {
				int integer17 = atl.a(ajw, co.a(cv15));
				this.a(ajw, atl, co, integer17, false, bpy, list16, bitSet11);
				boolean10 = true;
			}
		}

		List<brd> list12 = cbh.a(atl, null, long7);
		if (!list12.isEmpty()) {
			this.a(ajw, atl, co, -1, true, bpy, list12, bitSet11);
			boolean10 = true;
		}

		return boolean10;
	}

	private void a(ajw ajw, atl atl, co co, bpy bpy, List<brd> list, float[] arr, BitSet bitSet, brc.b b) {
		bdw bdw10 = atl.e(ajw, co);
		double double11 = (double)co.p() + bdw10.b;
		double double13 = (double)co.q() + bdw10.c;
		double double15 = (double)co.r() + bdw10.d;
		int integer17 = 0;

		for (int integer18 = list.size(); integer17 < integer18; integer17++) {
			brd brd19 = (brd)list.get(integer17);
			this.a(atl, brd19.b(), brd19.e(), arr, bitSet);
			b.a(ajw, atl, co, brd19.e(), arr, bitSet);
			bpy.a(brd19.b());
			bpy.a(b.c[0], b.c[1], b.c[2], b.c[3]);
			if (brd19.c()) {
				int integer20 = this.a.a(atl, ajw, co, brd19.d());
				if (bqe.a) {
					integer20 = bzc.c(integer20);
				}

				float float21 = (float)(integer20 >> 16 & 0xFF) / 255.0F;
				float float22 = (float)(integer20 >> 8 & 0xFF) / 255.0F;
				float float23 = (float)(integer20 & 0xFF) / 255.0F;
				bpy.a(b.b[0] * float21, b.b[0] * float22, b.b[0] * float23, 4);
				bpy.a(b.b[1] * float21, b.b[1] * float22, b.b[1] * float23, 3);
				bpy.a(b.b[2] * float21, b.b[2] * float22, b.b[2] * float23, 2);
				bpy.a(b.b[3] * float21, b.b[3] * float22, b.b[3] * float23, 1);
			} else {
				bpy.a(b.b[0], b.b[0], b.b[0], 4);
				bpy.a(b.b[1], b.b[1], b.b[1], 3);
				bpy.a(b.b[2], b.b[2], b.b[2], 2);
				bpy.a(b.b[3], b.b[3], b.b[3], 1);
			}

			bpy.a(double11, double13, double15);
		}
	}

	private void a(atl atl, int[] arr, cv cv, @Nullable float[] arr, BitSet bitSet) {
		float float7 = 32.0F;
		float float8 = 32.0F;
		float float9 = 32.0F;
		float float10 = -32.0F;
		float float11 = -32.0F;
		float float12 = -32.0F;

		for (int integer13 = 0; integer13 < 4; integer13++) {
			float float14 = Float.intBitsToFloat(arr[integer13 * 7]);
			float float15 = Float.intBitsToFloat(arr[integer13 * 7 + 1]);
			float float16 = Float.intBitsToFloat(arr[integer13 * 7 + 2]);
			float7 = Math.min(float7, float14);
			float8 = Math.min(float8, float15);
			float9 = Math.min(float9, float16);
			float10 = Math.max(float10, float14);
			float11 = Math.max(float11, float15);
			float12 = Math.max(float12, float16);
		}

		if (arr != null) {
			arr[cv.WEST.a()] = float7;
			arr[cv.EAST.a()] = float10;
			arr[cv.DOWN.a()] = float8;
			arr[cv.UP.a()] = float11;
			arr[cv.NORTH.a()] = float9;
			arr[cv.SOUTH.a()] = float12;
			int integer13 = cv.values().length;
			arr[cv.WEST.a() + integer13] = 1.0F - float7;
			arr[cv.EAST.a() + integer13] = 1.0F - float10;
			arr[cv.DOWN.a() + integer13] = 1.0F - float8;
			arr[cv.UP.a() + integer13] = 1.0F - float11;
			arr[cv.NORTH.a() + integer13] = 1.0F - float9;
			arr[cv.SOUTH.a() + integer13] = 1.0F - float12;
		}

		float float13 = 1.0E-4F;
		float float14 = 0.9999F;
		switch (cv) {
			case DOWN:
				bitSet.set(1, float7 >= 1.0E-4F || float9 >= 1.0E-4F || float10 <= 0.9999F || float12 <= 0.9999F);
				bitSet.set(0, (float8 < 1.0E-4F || atl.h()) && float8 == float11);
				break;
			case UP:
				bitSet.set(1, float7 >= 1.0E-4F || float9 >= 1.0E-4F || float10 <= 0.9999F || float12 <= 0.9999F);
				bitSet.set(0, (float11 > 0.9999F || atl.h()) && float8 == float11);
				break;
			case NORTH:
				bitSet.set(1, float7 >= 1.0E-4F || float8 >= 1.0E-4F || float10 <= 0.9999F || float11 <= 0.9999F);
				bitSet.set(0, (float9 < 1.0E-4F || atl.h()) && float9 == float12);
				break;
			case SOUTH:
				bitSet.set(1, float7 >= 1.0E-4F || float8 >= 1.0E-4F || float10 <= 0.9999F || float11 <= 0.9999F);
				bitSet.set(0, (float12 > 0.9999F || atl.h()) && float9 == float12);
				break;
			case WEST:
				bitSet.set(1, float8 >= 1.0E-4F || float9 >= 1.0E-4F || float11 <= 0.9999F || float12 <= 0.9999F);
				bitSet.set(0, (float7 < 1.0E-4F || atl.h()) && float7 == float10);
				break;
			case EAST:
				bitSet.set(1, float8 >= 1.0E-4F || float9 >= 1.0E-4F || float11 <= 0.9999F || float12 <= 0.9999F);
				bitSet.set(0, (float10 > 0.9999F || atl.h()) && float7 == float10);
		}
	}

	private void a(ajw ajw, atl atl, co co, int integer, boolean boolean5, bpy bpy, List<brd> list, BitSet bitSet) {
		bdw bdw10 = atl.e(ajw, co);
		double double11 = (double)co.p() + bdw10.b;
		double double13 = (double)co.q() + bdw10.c;
		double double15 = (double)co.r() + bdw10.d;
		int integer17 = 0;

		for (int integer18 = list.size(); integer17 < integer18; integer17++) {
			brd brd19 = (brd)list.get(integer17);
			if (boolean5) {
				this.a(atl, brd19.b(), brd19.e(), null, bitSet);
				co co20 = bitSet.get(0) ? co.a(brd19.e()) : co;
				integer = atl.a(ajw, co20);
			}

			bpy.a(brd19.b());
			bpy.a(integer, integer, integer, integer);
			if (brd19.c()) {
				int integer20 = this.a.a(atl, ajw, co, brd19.d());
				if (bqe.a) {
					integer20 = bzc.c(integer20);
				}

				float float21 = (float)(integer20 >> 16 & 0xFF) / 255.0F;
				float float22 = (float)(integer20 >> 8 & 0xFF) / 255.0F;
				float float23 = (float)(integer20 & 0xFF) / 255.0F;
				bpy.a(float21, float22, float23, 4);
				bpy.a(float21, float22, float23, 3);
				bpy.a(float21, float22, float23, 2);
				bpy.a(float21, float22, float23, 1);
			}

			bpy.a(double11, double13, double15);
		}
	}

	public void a(cbh cbh, float float2, float float3, float float4, float float5) {
		this.a(null, cbh, float2, float3, float4, float5);
	}

	public void a(atl atl, cbh cbh, float float3, float float4, float float5, float float6) {
		for (cv cv11 : cv.values()) {
			this.a(float3, float4, float5, float6, cbh.a(atl, cv11, 0L));
		}

		this.a(float3, float4, float5, float6, cbh.a(atl, null, 0L));
	}

	public void a(cbh cbh, atl atl, float float3, boolean boolean4) {
		alu alu6 = atl.v();
		bqg.b(90.0F, 0.0F, 1.0F, 0.0F);
		int integer7 = this.a.a(atl, null, null, 0);
		if (bqe.a) {
			integer7 = bzc.c(integer7);
		}

		float float8 = (float)(integer7 >> 16 & 0xFF) / 255.0F;
		float float9 = (float)(integer7 >> 8 & 0xFF) / 255.0F;
		float float10 = (float)(integer7 & 0xFF) / 255.0F;
		if (!boolean4) {
			bqg.c(float3, float3, float3, 1.0F);
		}

		this.a(atl, cbh, float3, float8, float9, float10);
	}

	private void a(float float1, float float2, float float3, float float4, List<brd> list) {
		bqs bqs7 = bqs.a();
		bpy bpy8 = bqs7.c();
		int integer9 = 0;

		for (int integer10 = list.size(); integer9 < integer10; integer9++) {
			brd brd11 = (brd)list.get(integer9);
			bpy8.a(7, bzh.b);
			bpy8.a(brd11.b());
			if (brd11.c()) {
				bpy8.d(float2 * float1, float3 * float1, float4 * float1);
			} else {
				bpy8.d(float1, float1, float1);
			}

			dl dl12 = brd11.e().n();
			bpy8.b((float)dl12.p(), (float)dl12.q(), (float)dl12.r());
			bqs7.b();
		}
	}

	public static enum a {
		DOWN(
			new cv[]{cv.WEST, cv.EAST, cv.NORTH, cv.SOUTH},
			0.5F,
			true,
			new brc.d[]{brc.d.FLIP_WEST, brc.d.SOUTH, brc.d.FLIP_WEST, brc.d.FLIP_SOUTH, brc.d.WEST, brc.d.FLIP_SOUTH, brc.d.WEST, brc.d.SOUTH},
			new brc.d[]{brc.d.FLIP_WEST, brc.d.NORTH, brc.d.FLIP_WEST, brc.d.FLIP_NORTH, brc.d.WEST, brc.d.FLIP_NORTH, brc.d.WEST, brc.d.NORTH},
			new brc.d[]{brc.d.FLIP_EAST, brc.d.NORTH, brc.d.FLIP_EAST, brc.d.FLIP_NORTH, brc.d.EAST, brc.d.FLIP_NORTH, brc.d.EAST, brc.d.NORTH},
			new brc.d[]{brc.d.FLIP_EAST, brc.d.SOUTH, brc.d.FLIP_EAST, brc.d.FLIP_SOUTH, brc.d.EAST, brc.d.FLIP_SOUTH, brc.d.EAST, brc.d.SOUTH}
		),
		UP(
			new cv[]{cv.EAST, cv.WEST, cv.NORTH, cv.SOUTH},
			1.0F,
			true,
			new brc.d[]{brc.d.EAST, brc.d.SOUTH, brc.d.EAST, brc.d.FLIP_SOUTH, brc.d.FLIP_EAST, brc.d.FLIP_SOUTH, brc.d.FLIP_EAST, brc.d.SOUTH},
			new brc.d[]{brc.d.EAST, brc.d.NORTH, brc.d.EAST, brc.d.FLIP_NORTH, brc.d.FLIP_EAST, brc.d.FLIP_NORTH, brc.d.FLIP_EAST, brc.d.NORTH},
			new brc.d[]{brc.d.WEST, brc.d.NORTH, brc.d.WEST, brc.d.FLIP_NORTH, brc.d.FLIP_WEST, brc.d.FLIP_NORTH, brc.d.FLIP_WEST, brc.d.NORTH},
			new brc.d[]{brc.d.WEST, brc.d.SOUTH, brc.d.WEST, brc.d.FLIP_SOUTH, brc.d.FLIP_WEST, brc.d.FLIP_SOUTH, brc.d.FLIP_WEST, brc.d.SOUTH}
		),
		NORTH(
			new cv[]{cv.UP, cv.DOWN, cv.EAST, cv.WEST},
			0.8F,
			true,
			new brc.d[]{brc.d.UP, brc.d.FLIP_WEST, brc.d.UP, brc.d.WEST, brc.d.FLIP_UP, brc.d.WEST, brc.d.FLIP_UP, brc.d.FLIP_WEST},
			new brc.d[]{brc.d.UP, brc.d.FLIP_EAST, brc.d.UP, brc.d.EAST, brc.d.FLIP_UP, brc.d.EAST, brc.d.FLIP_UP, brc.d.FLIP_EAST},
			new brc.d[]{brc.d.DOWN, brc.d.FLIP_EAST, brc.d.DOWN, brc.d.EAST, brc.d.FLIP_DOWN, brc.d.EAST, brc.d.FLIP_DOWN, brc.d.FLIP_EAST},
			new brc.d[]{brc.d.DOWN, brc.d.FLIP_WEST, brc.d.DOWN, brc.d.WEST, brc.d.FLIP_DOWN, brc.d.WEST, brc.d.FLIP_DOWN, brc.d.FLIP_WEST}
		),
		SOUTH(
			new cv[]{cv.WEST, cv.EAST, cv.DOWN, cv.UP},
			0.8F,
			true,
			new brc.d[]{brc.d.UP, brc.d.FLIP_WEST, brc.d.FLIP_UP, brc.d.FLIP_WEST, brc.d.FLIP_UP, brc.d.WEST, brc.d.UP, brc.d.WEST},
			new brc.d[]{brc.d.DOWN, brc.d.FLIP_WEST, brc.d.FLIP_DOWN, brc.d.FLIP_WEST, brc.d.FLIP_DOWN, brc.d.WEST, brc.d.DOWN, brc.d.WEST},
			new brc.d[]{brc.d.DOWN, brc.d.FLIP_EAST, brc.d.FLIP_DOWN, brc.d.FLIP_EAST, brc.d.FLIP_DOWN, brc.d.EAST, brc.d.DOWN, brc.d.EAST},
			new brc.d[]{brc.d.UP, brc.d.FLIP_EAST, brc.d.FLIP_UP, brc.d.FLIP_EAST, brc.d.FLIP_UP, brc.d.EAST, brc.d.UP, brc.d.EAST}
		),
		WEST(
			new cv[]{cv.UP, cv.DOWN, cv.NORTH, cv.SOUTH},
			0.6F,
			true,
			new brc.d[]{brc.d.UP, brc.d.SOUTH, brc.d.UP, brc.d.FLIP_SOUTH, brc.d.FLIP_UP, brc.d.FLIP_SOUTH, brc.d.FLIP_UP, brc.d.SOUTH},
			new brc.d[]{brc.d.UP, brc.d.NORTH, brc.d.UP, brc.d.FLIP_NORTH, brc.d.FLIP_UP, brc.d.FLIP_NORTH, brc.d.FLIP_UP, brc.d.NORTH},
			new brc.d[]{brc.d.DOWN, brc.d.NORTH, brc.d.DOWN, brc.d.FLIP_NORTH, brc.d.FLIP_DOWN, brc.d.FLIP_NORTH, brc.d.FLIP_DOWN, brc.d.NORTH},
			new brc.d[]{brc.d.DOWN, brc.d.SOUTH, brc.d.DOWN, brc.d.FLIP_SOUTH, brc.d.FLIP_DOWN, brc.d.FLIP_SOUTH, brc.d.FLIP_DOWN, brc.d.SOUTH}
		),
		EAST(
			new cv[]{cv.DOWN, cv.UP, cv.NORTH, cv.SOUTH},
			0.6F,
			true,
			new brc.d[]{brc.d.FLIP_DOWN, brc.d.SOUTH, brc.d.FLIP_DOWN, brc.d.FLIP_SOUTH, brc.d.DOWN, brc.d.FLIP_SOUTH, brc.d.DOWN, brc.d.SOUTH},
			new brc.d[]{brc.d.FLIP_DOWN, brc.d.NORTH, brc.d.FLIP_DOWN, brc.d.FLIP_NORTH, brc.d.DOWN, brc.d.FLIP_NORTH, brc.d.DOWN, brc.d.NORTH},
			new brc.d[]{brc.d.FLIP_UP, brc.d.NORTH, brc.d.FLIP_UP, brc.d.FLIP_NORTH, brc.d.UP, brc.d.FLIP_NORTH, brc.d.UP, brc.d.NORTH},
			new brc.d[]{brc.d.FLIP_UP, brc.d.SOUTH, brc.d.FLIP_UP, brc.d.FLIP_SOUTH, brc.d.UP, brc.d.FLIP_SOUTH, brc.d.UP, brc.d.SOUTH}
		);

		private final cv[] g;
		private final float h;
		private final boolean i;
		private final brc.d[] j;
		private final brc.d[] k;
		private final brc.d[] l;
		private final brc.d[] m;
		private static final brc.a[] n = new brc.a[6];

		private a(cv[] arr, float float4, boolean boolean5, brc.d[] arr6, brc.d[] arr7, brc.d[] arr8, brc.d[] arr9) {
			this.g = arr;
			this.h = float4;
			this.i = boolean5;
			this.j = arr6;
			this.k = arr7;
			this.l = arr8;
			this.m = arr9;
		}

		public static brc.a a(cv cv) {
			return n[cv.a()];
		}

		static {
			n[cv.DOWN.a()] = DOWN;
			n[cv.UP.a()] = UP;
			n[cv.NORTH.a()] = NORTH;
			n[cv.SOUTH.a()] = SOUTH;
			n[cv.WEST.a()] = WEST;
			n[cv.EAST.a()] = EAST;
		}
	}

	class b {
		private final float[] b = new float[4];
		private final int[] c = new int[4];

		public b() {
		}

		public void a(ajw ajw, atl atl, co co, cv cv, float[] arr, BitSet bitSet) {
			co co8 = bitSet.get(0) ? co.a(cv) : co;
			co.b b9 = co.b.s();
			brc.a a10 = brc.a.a(cv);
			co.b b11 = co.b.i(co8).d(a10.g[0]);
			co.b b12 = co.b.i(co8).d(a10.g[1]);
			co.b b13 = co.b.i(co8).d(a10.g[2]);
			co.b b14 = co.b.i(co8).d(a10.g[3]);
			int integer15 = atl.a(ajw, b11);
			int integer16 = atl.a(ajw, b12);
			int integer17 = atl.a(ajw, b13);
			int integer18 = atl.a(ajw, b14);
			float float19 = ajw.o(b11).k();
			float float20 = ajw.o(b12).k();
			float float21 = ajw.o(b13).k();
			float float22 = ajw.o(b14).k();
			boolean boolean23 = ajw.o(b9.j(b11).d(cv)).e();
			boolean boolean24 = ajw.o(b9.j(b12).d(cv)).e();
			boolean boolean25 = ajw.o(b9.j(b13).d(cv)).e();
			boolean boolean26 = ajw.o(b9.j(b14).d(cv)).e();
			float float27;
			int integer31;
			if (!boolean25 && !boolean23) {
				float27 = float19;
				integer31 = integer15;
			} else {
				co co35 = b9.j(b11).d(a10.g[2]);
				float27 = ajw.o(co35).k();
				integer31 = atl.a(ajw, co35);
			}

			float float28;
			int integer32;
			if (!boolean26 && !boolean23) {
				float28 = float19;
				integer32 = integer15;
			} else {
				co co35 = b9.j(b11).d(a10.g[3]);
				float28 = ajw.o(co35).k();
				integer32 = atl.a(ajw, co35);
			}

			float float29;
			int integer33;
			if (!boolean25 && !boolean24) {
				float29 = float20;
				integer33 = integer16;
			} else {
				co co35 = b9.j(b12).d(a10.g[2]);
				float29 = ajw.o(co35).k();
				integer33 = atl.a(ajw, co35);
			}

			float float30;
			int integer34;
			if (!boolean26 && !boolean24) {
				float30 = float20;
				integer34 = integer16;
			} else {
				co co35 = b9.j(b12).d(a10.g[3]);
				float30 = ajw.o(co35).k();
				integer34 = atl.a(ajw, co35);
			}

			int integer35 = atl.a(ajw, co);
			if (bitSet.get(0) || !ajw.o(co.a(cv)).q()) {
				integer35 = atl.a(ajw, co.a(cv));
			}

			float float36 = bitSet.get(0) ? ajw.o(co8).k() : ajw.o(co).k();
			brc.c c37 = brc.c.a(cv);
			b9.t();
			b11.t();
			b12.t();
			b13.t();
			b14.t();
			if (bitSet.get(1) && a10.i) {
				float float38 = (float22 + float19 + float28 + float36) * 0.25F;
				float float39 = (float21 + float19 + float27 + float36) * 0.25F;
				float float40 = (float21 + float20 + float29 + float36) * 0.25F;
				float float41 = (float22 + float20 + float30 + float36) * 0.25F;
				float float42 = arr[a10.j[0].m] * arr[a10.j[1].m];
				float float43 = arr[a10.j[2].m] * arr[a10.j[3].m];
				float float44 = arr[a10.j[4].m] * arr[a10.j[5].m];
				float float45 = arr[a10.j[6].m] * arr[a10.j[7].m];
				float float46 = arr[a10.k[0].m] * arr[a10.k[1].m];
				float float47 = arr[a10.k[2].m] * arr[a10.k[3].m];
				float float48 = arr[a10.k[4].m] * arr[a10.k[5].m];
				float float49 = arr[a10.k[6].m] * arr[a10.k[7].m];
				float float50 = arr[a10.l[0].m] * arr[a10.l[1].m];
				float float51 = arr[a10.l[2].m] * arr[a10.l[3].m];
				float float52 = arr[a10.l[4].m] * arr[a10.l[5].m];
				float float53 = arr[a10.l[6].m] * arr[a10.l[7].m];
				float float54 = arr[a10.m[0].m] * arr[a10.m[1].m];
				float float55 = arr[a10.m[2].m] * arr[a10.m[3].m];
				float float56 = arr[a10.m[4].m] * arr[a10.m[5].m];
				float float57 = arr[a10.m[6].m] * arr[a10.m[7].m];
				this.b[c37.g] = float38 * float42 + float39 * float43 + float40 * float44 + float41 * float45;
				this.b[c37.h] = float38 * float46 + float39 * float47 + float40 * float48 + float41 * float49;
				this.b[c37.i] = float38 * float50 + float39 * float51 + float40 * float52 + float41 * float53;
				this.b[c37.j] = float38 * float54 + float39 * float55 + float40 * float56 + float41 * float57;
				int integer58 = this.a(integer18, integer15, integer32, integer35);
				int integer59 = this.a(integer17, integer15, integer31, integer35);
				int integer60 = this.a(integer17, integer16, integer33, integer35);
				int integer61 = this.a(integer18, integer16, integer34, integer35);
				this.c[c37.g] = this.a(integer58, integer59, integer60, integer61, float42, float43, float44, float45);
				this.c[c37.h] = this.a(integer58, integer59, integer60, integer61, float46, float47, float48, float49);
				this.c[c37.i] = this.a(integer58, integer59, integer60, integer61, float50, float51, float52, float53);
				this.c[c37.j] = this.a(integer58, integer59, integer60, integer61, float54, float55, float56, float57);
			} else {
				float float38 = (float22 + float19 + float28 + float36) * 0.25F;
				float float39 = (float21 + float19 + float27 + float36) * 0.25F;
				float float40 = (float21 + float20 + float29 + float36) * 0.25F;
				float float41 = (float22 + float20 + float30 + float36) * 0.25F;
				this.c[c37.g] = this.a(integer18, integer15, integer32, integer35);
				this.c[c37.h] = this.a(integer17, integer15, integer31, integer35);
				this.c[c37.i] = this.a(integer17, integer16, integer33, integer35);
				this.c[c37.j] = this.a(integer18, integer16, integer34, integer35);
				this.b[c37.g] = float38;
				this.b[c37.h] = float39;
				this.b[c37.i] = float40;
				this.b[c37.j] = float41;
			}
		}

		private int a(int integer1, int integer2, int integer3, int integer4) {
			if (integer1 == 0) {
				integer1 = integer4;
			}

			if (integer2 == 0) {
				integer2 = integer4;
			}

			if (integer3 == 0) {
				integer3 = integer4;
			}

			return integer1 + integer2 + integer3 + integer4 >> 2 & 16711935;
		}

		private int a(int integer1, int integer2, int integer3, int integer4, float float5, float float6, float float7, float float8) {
			int integer10 = (int)(
					(float)(integer1 >> 16 & 0xFF) * float5
						+ (float)(integer2 >> 16 & 0xFF) * float6
						+ (float)(integer3 >> 16 & 0xFF) * float7
						+ (float)(integer4 >> 16 & 0xFF) * float8
				)
				& 0xFF;
			int integer11 = (int)(
					(float)(integer1 & 0xFF) * float5 + (float)(integer2 & 0xFF) * float6 + (float)(integer3 & 0xFF) * float7 + (float)(integer4 & 0xFF) * float8
				)
				& 0xFF;
			return integer10 << 16 | integer11;
		}
	}

	static enum c {
		DOWN(0, 1, 2, 3),
		UP(2, 3, 0, 1),
		NORTH(3, 0, 1, 2),
		SOUTH(0, 1, 2, 3),
		WEST(3, 0, 1, 2),
		EAST(1, 2, 3, 0);

		private final int g;
		private final int h;
		private final int i;
		private final int j;
		private static final brc.c[] k = new brc.c[6];

		private c(int integer3, int integer4, int integer5, int integer6) {
			this.g = integer3;
			this.h = integer4;
			this.i = integer5;
			this.j = integer6;
		}

		public static brc.c a(cv cv) {
			return k[cv.a()];
		}

		static {
			k[cv.DOWN.a()] = DOWN;
			k[cv.UP.a()] = UP;
			k[cv.NORTH.a()] = NORTH;
			k[cv.SOUTH.a()] = SOUTH;
			k[cv.WEST.a()] = WEST;
			k[cv.EAST.a()] = EAST;
		}
	}

	public static enum d {
		DOWN(cv.DOWN, false),
		UP(cv.UP, false),
		NORTH(cv.NORTH, false),
		SOUTH(cv.SOUTH, false),
		WEST(cv.WEST, false),
		EAST(cv.EAST, false),
		FLIP_DOWN(cv.DOWN, true),
		FLIP_UP(cv.UP, true),
		FLIP_NORTH(cv.NORTH, true),
		FLIP_SOUTH(cv.SOUTH, true),
		FLIP_WEST(cv.WEST, true),
		FLIP_EAST(cv.EAST, true);

		private final int m;

		private d(cv cv, boolean boolean4) {
			this.m = cv.a() + (boolean4 ? cv.values().length : 0);
		}
	}
}
