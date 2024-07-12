import com.google.common.primitives.Floats;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bpy {
	private static final Logger a = LogManager.getLogger();
	private ByteBuffer b;
	private IntBuffer c;
	private ShortBuffer d;
	private FloatBuffer e;
	private int f;
	private bzk g;
	private int h;
	private boolean i;
	private int j;
	private double k;
	private double l;
	private double m;
	private bzj n;
	private boolean o;

	public bpy(int integer) {
		this.b = ber.c(integer * 4);
		this.c = this.b.asIntBuffer();
		this.d = this.b.asShortBuffer();
		this.e = this.b.asFloatBuffer();
	}

	private void b(int integer) {
		if (ot.c(integer, 4) / 4 > this.c.remaining() || this.f * this.n.g() + integer > this.b.capacity()) {
			int integer3 = this.b.capacity();
			int integer4 = integer3 + ot.c(integer, 2097152);
			a.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", new Object[]{integer3, integer4});
			int integer5 = this.c.position();
			ByteBuffer byteBuffer6 = ber.c(integer4);
			this.b.position(0);
			byteBuffer6.put(this.b);
			byteBuffer6.rewind();
			this.b = byteBuffer6;
			this.e = this.b.asFloatBuffer().asReadOnlyBuffer();
			this.c = this.b.asIntBuffer();
			this.c.position(integer5);
			this.d = this.b.asShortBuffer();
			this.d.position(integer5 << 1);
		}
	}

	public void a(float float1, float float2, float float3) {
		int integer5 = this.f / 4;
		final float[] arr6 = new float[integer5];

		for (int integer7 = 0; integer7 < integer5; integer7++) {
			arr6[integer7] = a(
				this.e, (float)((double)float1 + this.k), (float)((double)float2 + this.l), (float)((double)float3 + this.m), this.n.f(), integer7 * this.n.g()
			);
		}

		Integer[] arr7 = new Integer[integer5];

		for (int integer8 = 0; integer8 < arr7.length; integer8++) {
			arr7[integer8] = integer8;
		}

		Arrays.sort(arr7, new Comparator<Integer>() {
			public int compare(Integer integer1, Integer integer2) {
				return Floats.compare(arr6[integer2], arr6[integer1]);
			}
		});
		BitSet bitSet8 = new BitSet();
		int integer9 = this.n.g();
		int[] arr10 = new int[integer9];

		for (int integer11 = bitSet8.nextClearBit(0); integer11 < arr7.length; integer11 = bitSet8.nextClearBit(integer11 + 1)) {
			int integer12 = arr7[integer11];
			if (integer12 != integer11) {
				this.c.limit(integer12 * integer9 + integer9);
				this.c.position(integer12 * integer9);
				this.c.get(arr10);
				int integer13 = integer12;

				for (int integer14 = arr7[integer12]; integer13 != integer11; integer14 = arr7[integer14]) {
					this.c.limit(integer14 * integer9 + integer9);
					this.c.position(integer14 * integer9);
					IntBuffer intBuffer15 = this.c.slice();
					this.c.limit(integer13 * integer9 + integer9);
					this.c.position(integer13 * integer9);
					this.c.put(intBuffer15);
					bitSet8.set(integer13);
					integer13 = integer14;
				}

				this.c.limit(integer11 * integer9 + integer9);
				this.c.position(integer11 * integer9);
				this.c.put(arr10);
			}

			bitSet8.set(integer11);
		}
	}

	public bpy.a a() {
		this.c.rewind();
		int integer2 = this.j();
		this.c.limit(integer2);
		int[] arr3 = new int[integer2];
		this.c.get(arr3);
		this.c.limit(this.c.capacity());
		this.c.position(integer2);
		return new bpy.a(arr3, new bzj(this.n));
	}

	private int j() {
		return this.f * this.n.f();
	}

	private static float a(FloatBuffer floatBuffer, float float2, float float3, float float4, int integer5, int integer6) {
		float float7 = floatBuffer.get(integer6 + integer5 * 0 + 0);
		float float8 = floatBuffer.get(integer6 + integer5 * 0 + 1);
		float float9 = floatBuffer.get(integer6 + integer5 * 0 + 2);
		float float10 = floatBuffer.get(integer6 + integer5 * 1 + 0);
		float float11 = floatBuffer.get(integer6 + integer5 * 1 + 1);
		float float12 = floatBuffer.get(integer6 + integer5 * 1 + 2);
		float float13 = floatBuffer.get(integer6 + integer5 * 2 + 0);
		float float14 = floatBuffer.get(integer6 + integer5 * 2 + 1);
		float float15 = floatBuffer.get(integer6 + integer5 * 2 + 2);
		float float16 = floatBuffer.get(integer6 + integer5 * 3 + 0);
		float float17 = floatBuffer.get(integer6 + integer5 * 3 + 1);
		float float18 = floatBuffer.get(integer6 + integer5 * 3 + 2);
		float float19 = (float7 + float10 + float13 + float16) * 0.25F - float2;
		float float20 = (float8 + float11 + float14 + float17) * 0.25F - float3;
		float float21 = (float9 + float12 + float15 + float18) * 0.25F - float4;
		return float19 * float19 + float20 * float20 + float21 * float21;
	}

	public void a(bpy.a a) {
		this.c.clear();
		this.b(a.a().length * 4);
		this.c.put(a.a());
		this.f = a.b();
		this.n = new bzj(a.c());
	}

	public void b() {
		this.f = 0;
		this.g = null;
		this.h = 0;
	}

	public void a(int integer, bzj bzj) {
		if (this.o) {
			throw new IllegalStateException("Already building!");
		} else {
			this.o = true;
			this.b();
			this.j = integer;
			this.n = bzj;
			this.g = bzj.c(this.h);
			this.i = false;
			this.b.limit(this.b.capacity());
		}
	}

	public bpy a(double double1, double double2) {
		int integer6 = this.f * this.n.g() + this.n.d(this.h);
		switch (this.g.a()) {
			case FLOAT:
				this.b.putFloat(integer6, (float)double1);
				this.b.putFloat(integer6 + 4, (float)double2);
				break;
			case UINT:
			case INT:
				this.b.putInt(integer6, (int)double1);
				this.b.putInt(integer6 + 4, (int)double2);
				break;
			case USHORT:
			case SHORT:
				this.b.putShort(integer6, (short)((int)double2));
				this.b.putShort(integer6 + 2, (short)((int)double1));
				break;
			case UBYTE:
			case BYTE:
				this.b.put(integer6, (byte)((int)double2));
				this.b.put(integer6 + 1, (byte)((int)double1));
		}

		this.k();
		return this;
	}

	public bpy a(int integer1, int integer2) {
		int integer4 = this.f * this.n.g() + this.n.d(this.h);
		switch (this.g.a()) {
			case FLOAT:
				this.b.putFloat(integer4, (float)integer1);
				this.b.putFloat(integer4 + 4, (float)integer2);
				break;
			case UINT:
			case INT:
				this.b.putInt(integer4, integer1);
				this.b.putInt(integer4 + 4, integer2);
				break;
			case USHORT:
			case SHORT:
				this.b.putShort(integer4, (short)integer2);
				this.b.putShort(integer4 + 2, (short)integer1);
				break;
			case UBYTE:
			case BYTE:
				this.b.put(integer4, (byte)integer2);
				this.b.put(integer4 + 1, (byte)integer1);
		}

		this.k();
		return this;
	}

	public void a(int integer1, int integer2, int integer3, int integer4) {
		int integer6 = (this.f - 4) * this.n.f() + this.n.b(1) / 4;
		int integer7 = this.n.g() >> 2;
		this.c.put(integer6, integer1);
		this.c.put(integer6 + integer7, integer2);
		this.c.put(integer6 + integer7 * 2, integer3);
		this.c.put(integer6 + integer7 * 3, integer4);
	}

	public void a(double double1, double double2, double double3) {
		int integer8 = this.n.f();
		int integer9 = (this.f - 4) * integer8;

		for (int integer10 = 0; integer10 < 4; integer10++) {
			int integer11 = integer9 + integer10 * integer8;
			int integer12 = integer11 + 1;
			int integer13 = integer12 + 1;
			this.c.put(integer11, Float.floatToRawIntBits((float)(double1 + this.k) + Float.intBitsToFloat(this.c.get(integer11))));
			this.c.put(integer12, Float.floatToRawIntBits((float)(double2 + this.l) + Float.intBitsToFloat(this.c.get(integer12))));
			this.c.put(integer13, Float.floatToRawIntBits((float)(double3 + this.m) + Float.intBitsToFloat(this.c.get(integer13))));
		}
	}

	private int c(int integer) {
		return ((this.f - integer) * this.n.g() + this.n.e()) / 4;
	}

	public void a(float float1, float float2, float float3, int integer) {
		int integer6 = this.c(integer);
		int integer7 = -1;
		if (!this.i) {
			integer7 = this.c.get(integer6);
			if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
				int integer8 = (int)((float)(integer7 & 0xFF) * float1);
				int integer9 = (int)((float)(integer7 >> 8 & 0xFF) * float2);
				int integer10 = (int)((float)(integer7 >> 16 & 0xFF) * float3);
				integer7 &= -16777216;
				integer7 |= integer10 << 16 | integer9 << 8 | integer8;
			} else {
				int integer8 = (int)((float)(integer7 >> 24 & 0xFF) * float1);
				int integer9 = (int)((float)(integer7 >> 16 & 0xFF) * float2);
				int integer10 = (int)((float)(integer7 >> 8 & 0xFF) * float3);
				integer7 &= 255;
				integer7 |= integer8 << 24 | integer9 << 16 | integer10 << 8;
			}
		}

		this.c.put(integer6, integer7);
	}

	private void b(int integer1, int integer2) {
		int integer4 = this.c(integer2);
		int integer5 = integer1 >> 16 & 0xFF;
		int integer6 = integer1 >> 8 & 0xFF;
		int integer7 = integer1 & 0xFF;
		int integer8 = integer1 >> 24 & 0xFF;
		this.a(integer4, integer5, integer6, integer7, integer8);
	}

	public void b(float float1, float float2, float float3, int integer) {
		int integer6 = this.c(integer);
		int integer7 = ot.a((int)(float1 * 255.0F), 0, 255);
		int integer8 = ot.a((int)(float2 * 255.0F), 0, 255);
		int integer9 = ot.a((int)(float3 * 255.0F), 0, 255);
		this.a(integer6, integer7, integer8, integer9, 255);
	}

	private void a(int integer1, int integer2, int integer3, int integer4, int integer5) {
		if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
			this.c.put(integer1, integer5 << 24 | integer4 << 16 | integer3 << 8 | integer2);
		} else {
			this.c.put(integer1, integer2 << 24 | integer3 << 16 | integer4 << 8 | integer5);
		}
	}

	public void c() {
		this.i = true;
	}

	public bpy a(float float1, float float2, float float3, float float4) {
		return this.b((int)(float1 * 255.0F), (int)(float2 * 255.0F), (int)(float3 * 255.0F), (int)(float4 * 255.0F));
	}

	public bpy b(int integer1, int integer2, int integer3, int integer4) {
		if (this.i) {
			return this;
		} else {
			int integer6 = this.f * this.n.g() + this.n.d(this.h);
			switch (this.g.a()) {
				case FLOAT:
					this.b.putFloat(integer6, (float)integer1 / 255.0F);
					this.b.putFloat(integer6 + 4, (float)integer2 / 255.0F);
					this.b.putFloat(integer6 + 8, (float)integer3 / 255.0F);
					this.b.putFloat(integer6 + 12, (float)integer4 / 255.0F);
					break;
				case UINT:
				case INT:
					this.b.putFloat(integer6, (float)integer1);
					this.b.putFloat(integer6 + 4, (float)integer2);
					this.b.putFloat(integer6 + 8, (float)integer3);
					this.b.putFloat(integer6 + 12, (float)integer4);
					break;
				case USHORT:
				case SHORT:
					this.b.putShort(integer6, (short)integer1);
					this.b.putShort(integer6 + 2, (short)integer2);
					this.b.putShort(integer6 + 4, (short)integer3);
					this.b.putShort(integer6 + 6, (short)integer4);
					break;
				case UBYTE:
				case BYTE:
					if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
						this.b.put(integer6, (byte)integer1);
						this.b.put(integer6 + 1, (byte)integer2);
						this.b.put(integer6 + 2, (byte)integer3);
						this.b.put(integer6 + 3, (byte)integer4);
					} else {
						this.b.put(integer6, (byte)integer4);
						this.b.put(integer6 + 1, (byte)integer3);
						this.b.put(integer6 + 2, (byte)integer2);
						this.b.put(integer6 + 3, (byte)integer1);
					}
			}

			this.k();
			return this;
		}
	}

	public void a(int[] arr) {
		this.b(arr.length * 4);
		this.c.position(this.j());
		this.c.put(arr);
		this.f = this.f + arr.length / this.n.f();
	}

	public void d() {
		this.f++;
		this.b(this.n.g());
	}

	public bpy b(double double1, double double2, double double3) {
		int integer8 = this.f * this.n.g() + this.n.d(this.h);
		switch (this.g.a()) {
			case FLOAT:
				this.b.putFloat(integer8, (float)(double1 + this.k));
				this.b.putFloat(integer8 + 4, (float)(double2 + this.l));
				this.b.putFloat(integer8 + 8, (float)(double3 + this.m));
				break;
			case UINT:
			case INT:
				this.b.putInt(integer8, Float.floatToRawIntBits((float)(double1 + this.k)));
				this.b.putInt(integer8 + 4, Float.floatToRawIntBits((float)(double2 + this.l)));
				this.b.putInt(integer8 + 8, Float.floatToRawIntBits((float)(double3 + this.m)));
				break;
			case USHORT:
			case SHORT:
				this.b.putShort(integer8, (short)((int)(double1 + this.k)));
				this.b.putShort(integer8 + 2, (short)((int)(double2 + this.l)));
				this.b.putShort(integer8 + 4, (short)((int)(double3 + this.m)));
				break;
			case UBYTE:
			case BYTE:
				this.b.put(integer8, (byte)((int)(double1 + this.k)));
				this.b.put(integer8 + 1, (byte)((int)(double2 + this.l)));
				this.b.put(integer8 + 2, (byte)((int)(double3 + this.m)));
		}

		this.k();
		return this;
	}

	public void b(float float1, float float2, float float3) {
		int integer5 = (byte)((int)(float1 * 127.0F)) & 255;
		int integer6 = (byte)((int)(float2 * 127.0F)) & 255;
		int integer7 = (byte)((int)(float3 * 127.0F)) & 255;
		int integer8 = integer5 | integer6 << 8 | integer7 << 16;
		int integer9 = this.n.g() >> 2;
		int integer10 = (this.f - 4) * integer9 + this.n.c() / 4;
		this.c.put(integer10, integer8);
		this.c.put(integer10 + integer9, integer8);
		this.c.put(integer10 + integer9 * 2, integer8);
		this.c.put(integer10 + integer9 * 3, integer8);
	}

	private void k() {
		this.h++;
		this.h = this.h % this.n.i();
		this.g = this.n.c(this.h);
		if (this.g.b() == bzk.b.PADDING) {
			this.k();
		}
	}

	public bpy c(float float1, float float2, float float3) {
		int integer5 = this.f * this.n.g() + this.n.d(this.h);
		switch (this.g.a()) {
			case FLOAT:
				this.b.putFloat(integer5, float1);
				this.b.putFloat(integer5 + 4, float2);
				this.b.putFloat(integer5 + 8, float3);
				break;
			case UINT:
			case INT:
				this.b.putInt(integer5, (int)float1);
				this.b.putInt(integer5 + 4, (int)float2);
				this.b.putInt(integer5 + 8, (int)float3);
				break;
			case USHORT:
			case SHORT:
				this.b.putShort(integer5, (short)((int)float1 * 32767 & 65535));
				this.b.putShort(integer5 + 2, (short)((int)float2 * 32767 & 65535));
				this.b.putShort(integer5 + 4, (short)((int)float3 * 32767 & 65535));
				break;
			case UBYTE:
			case BYTE:
				this.b.put(integer5, (byte)((int)float1 * 127 & 0xFF));
				this.b.put(integer5 + 1, (byte)((int)float2 * 127 & 0xFF));
				this.b.put(integer5 + 2, (byte)((int)float3 * 127 & 0xFF));
		}

		this.k();
		return this;
	}

	public void c(double double1, double double2, double double3) {
		this.k = double1;
		this.l = double2;
		this.m = double3;
	}

	public void e() {
		if (!this.o) {
			throw new IllegalStateException("Not building!");
		} else {
			this.o = false;
			this.b.position(0);
			this.b.limit(this.j() * 4);
		}
	}

	public ByteBuffer f() {
		return this.b;
	}

	public bzj g() {
		return this.n;
	}

	public int h() {
		return this.f;
	}

	public int i() {
		return this.j;
	}

	public void a(int integer) {
		for (int integer3 = 0; integer3 < 4; integer3++) {
			this.b(integer, integer3 + 1);
		}
	}

	public void d(float float1, float float2, float float3) {
		for (int integer5 = 0; integer5 < 4; integer5++) {
			this.b(float1, float2, float3, integer5 + 1);
		}
	}

	public class a {
		private final int[] b;
		private final bzj c;

		public a(int[] arr, bzj bzj) {
			this.b = arr;
			this.c = bzj;
		}

		public int[] a() {
			return this.b;
		}

		public int b() {
			return this.b.length / this.c.f();
		}

		public bzj c() {
			return this.c;
		}
	}
}
