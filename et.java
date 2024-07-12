import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;
import javax.annotation.Nullable;

public class et extends ByteBuf {
	private final ByteBuf a;

	public et(ByteBuf byteBuf) {
		this.a = byteBuf;
	}

	public static int a(int integer) {
		for (int integer2 = 1; integer2 < 5; integer2++) {
			if ((integer & -1 << integer2 * 7) == 0) {
				return integer2;
			}
		}

		return 5;
	}

	public et a(byte[] arr) {
		this.d(arr.length);
		this.writeBytes(arr);
		return this;
	}

	public byte[] a() {
		return this.b(this.readableBytes());
	}

	public byte[] b(int integer) {
		int integer3 = this.g();
		if (integer3 > integer) {
			throw new DecoderException("ByteArray with size " + integer3 + " is bigger than allowed " + integer);
		} else {
			byte[] arr4 = new byte[integer3];
			this.readBytes(arr4);
			return arr4;
		}
	}

	public et a(int[] arr) {
		this.d(arr.length);

		for (int integer6 : arr) {
			this.d(integer6);
		}

		return this;
	}

	public int[] b() {
		return this.c(this.readableBytes());
	}

	public int[] c(int integer) {
		int integer3 = this.g();
		if (integer3 > integer) {
			throw new DecoderException("VarIntArray with size " + integer3 + " is bigger than allowed " + integer);
		} else {
			int[] arr4 = new int[integer3];

			for (int integer5 = 0; integer5 < arr4.length; integer5++) {
				arr4[integer5] = this.g();
			}

			return arr4;
		}
	}

	public et a(long[] arr) {
		this.d(arr.length);

		for (long long6 : arr) {
			this.writeLong(long6);
		}

		return this;
	}

	public long[] b(@Nullable long[] arr) {
		return this.a(arr, this.readableBytes() / 8);
	}

	public long[] a(@Nullable long[] arr, int integer) {
		int integer4 = this.g();
		if (arr == null || arr.length != integer4) {
			if (integer4 > integer) {
				throw new DecoderException("LongArray with size " + integer4 + " is bigger than allowed " + integer);
			}

			arr = new long[integer4];
		}

		for (int integer5 = 0; integer5 < arr.length; integer5++) {
			arr[integer5] = this.readLong();
		}

		return arr;
	}

	public co e() {
		return co.a(this.readLong());
	}

	public et a(co co) {
		this.writeLong(co.g());
		return this;
	}

	public fb f() {
		return fb.a.a(this.e(32767));
	}

	public et a(fb fb) {
		return this.a(fb.a.a(fb));
	}

	public <T extends Enum<T>> T a(Class<T> class1) {
		return (T)class1.getEnumConstants()[this.g()];
	}

	public et a(Enum<?> enum1) {
		return this.d(enum1.ordinal());
	}

	public int g() {
		int integer2 = 0;
		int integer3 = 0;

		byte byte4;
		do {
			byte4 = this.readByte();
			integer2 |= (byte4 & 127) << integer3++ * 7;
			if (integer3 > 5) {
				throw new RuntimeException("VarInt too big");
			}
		} while ((byte4 & 128) == 128);

		return integer2;
	}

	public long h() {
		long long2 = 0L;
		int integer4 = 0;

		byte byte5;
		do {
			byte5 = this.readByte();
			long2 |= (long)(byte5 & 127) << integer4++ * 7;
			if (integer4 > 10) {
				throw new RuntimeException("VarLong too big");
			}
		} while ((byte5 & 128) == 128);

		return long2;
	}

	public et a(UUID uUID) {
		this.writeLong(uUID.getMostSignificantBits());
		this.writeLong(uUID.getLeastSignificantBits());
		return this;
	}

	public UUID i() {
		return new UUID(this.readLong(), this.readLong());
	}

	public et d(int integer) {
		while ((integer & -128) != 0) {
			this.writeByte(integer & 127 | 128);
			integer >>>= 7;
		}

		this.writeByte(integer);
		return this;
	}

	public et b(long long1) {
		while ((long1 & -128L) != 0L) {
			this.writeByte((int)(long1 & 127L) | 128);
			long1 >>>= 7;
		}

		this.writeByte((int)long1);
		return this;
	}

	public et a(@Nullable du du) {
		if (du == null) {
			this.writeByte(0);
		} else {
			try {
				ed.a(du, new ByteBufOutputStream(this));
			} catch (IOException var3) {
				throw new EncoderException(var3);
			}
		}

		return this;
	}

	@Nullable
	public du j() {
		int integer2 = this.readerIndex();
		byte byte3 = this.readByte();
		if (byte3 == 0) {
			return null;
		} else {
			this.readerIndex(integer2);

			try {
				return ed.a(new ByteBufInputStream(this), new ec(2097152L));
			} catch (IOException var4) {
				throw new EncoderException(var4);
			}
		}
	}

	public et a(afj afj) {
		if (afj.b()) {
			this.writeShort(-1);
		} else {
			this.writeShort(afh.a(afj.c()));
			this.writeByte(afj.E());
			this.writeShort(afj.j());
			du du3 = null;
			if (afj.c().n() || afj.c().q()) {
				du3 = afj.p();
			}

			this.a(du3);
		}

		return this;
	}

	public afj k() {
		int integer2 = this.readShort();
		if (integer2 < 0) {
			return afj.a;
		} else {
			int integer3 = this.readByte();
			int integer4 = this.readShort();
			afj afj5 = new afj(afh.c(integer2), integer3, integer4);
			afj5.b(this.j());
			return afj5;
		}
	}

	public String e(int integer) {
		int integer3 = this.g();
		if (integer3 > integer * 4) {
			throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + integer3 + " > " + integer * 4 + ")");
		} else if (integer3 < 0) {
			throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
		} else {
			String string4 = new String(this.readBytes(integer3).array(), Charsets.UTF_8);
			if (string4.length() > integer) {
				throw new DecoderException("The received string length is longer than maximum allowed (" + integer3 + " > " + integer + ")");
			} else {
				return string4;
			}
		}
	}

	public et a(String string) {
		byte[] arr3 = string.getBytes(Charsets.UTF_8);
		if (arr3.length > 32767) {
			throw new EncoderException("String too big (was " + arr3.length + " bytes encoded, max " + 32767 + ")");
		} else {
			this.d(arr3.length);
			this.writeBytes(arr3);
			return this;
		}
	}

	public int capacity() {
		return this.a.capacity();
	}

	public ByteBuf capacity(int integer) {
		return this.a.capacity(integer);
	}

	public int maxCapacity() {
		return this.a.maxCapacity();
	}

	public ByteBufAllocator alloc() {
		return this.a.alloc();
	}

	public ByteOrder order() {
		return this.a.order();
	}

	public ByteBuf order(ByteOrder byteOrder) {
		return this.a.order(byteOrder);
	}

	public ByteBuf unwrap() {
		return this.a.unwrap();
	}

	public boolean isDirect() {
		return this.a.isDirect();
	}

	public int readerIndex() {
		return this.a.readerIndex();
	}

	public ByteBuf readerIndex(int integer) {
		return this.a.readerIndex(integer);
	}

	public int writerIndex() {
		return this.a.writerIndex();
	}

	public ByteBuf writerIndex(int integer) {
		return this.a.writerIndex(integer);
	}

	public ByteBuf setIndex(int integer1, int integer2) {
		return this.a.setIndex(integer1, integer2);
	}

	public int readableBytes() {
		return this.a.readableBytes();
	}

	public int writableBytes() {
		return this.a.writableBytes();
	}

	public int maxWritableBytes() {
		return this.a.maxWritableBytes();
	}

	public boolean isReadable() {
		return this.a.isReadable();
	}

	public boolean isReadable(int integer) {
		return this.a.isReadable(integer);
	}

	public boolean isWritable() {
		return this.a.isWritable();
	}

	public boolean isWritable(int integer) {
		return this.a.isWritable(integer);
	}

	public ByteBuf clear() {
		return this.a.clear();
	}

	public ByteBuf markReaderIndex() {
		return this.a.markReaderIndex();
	}

	public ByteBuf resetReaderIndex() {
		return this.a.resetReaderIndex();
	}

	public ByteBuf markWriterIndex() {
		return this.a.markWriterIndex();
	}

	public ByteBuf resetWriterIndex() {
		return this.a.resetWriterIndex();
	}

	public ByteBuf discardReadBytes() {
		return this.a.discardReadBytes();
	}

	public ByteBuf discardSomeReadBytes() {
		return this.a.discardSomeReadBytes();
	}

	public ByteBuf ensureWritable(int integer) {
		return this.a.ensureWritable(integer);
	}

	public int ensureWritable(int integer, boolean boolean2) {
		return this.a.ensureWritable(integer, boolean2);
	}

	public boolean getBoolean(int integer) {
		return this.a.getBoolean(integer);
	}

	public byte getByte(int integer) {
		return this.a.getByte(integer);
	}

	public short getUnsignedByte(int integer) {
		return this.a.getUnsignedByte(integer);
	}

	public short getShort(int integer) {
		return this.a.getShort(integer);
	}

	public int getUnsignedShort(int integer) {
		return this.a.getUnsignedShort(integer);
	}

	public int getMedium(int integer) {
		return this.a.getMedium(integer);
	}

	public int getUnsignedMedium(int integer) {
		return this.a.getUnsignedMedium(integer);
	}

	public int getInt(int integer) {
		return this.a.getInt(integer);
	}

	public long getUnsignedInt(int integer) {
		return this.a.getUnsignedInt(integer);
	}

	public long getLong(int integer) {
		return this.a.getLong(integer);
	}

	public char getChar(int integer) {
		return this.a.getChar(integer);
	}

	public float getFloat(int integer) {
		return this.a.getFloat(integer);
	}

	public double getDouble(int integer) {
		return this.a.getDouble(integer);
	}

	public ByteBuf getBytes(int integer, ByteBuf byteBuf) {
		return this.a.getBytes(integer, byteBuf);
	}

	public ByteBuf getBytes(int integer1, ByteBuf byteBuf, int integer3) {
		return this.a.getBytes(integer1, byteBuf, integer3);
	}

	public ByteBuf getBytes(int integer1, ByteBuf byteBuf, int integer3, int integer4) {
		return this.a.getBytes(integer1, byteBuf, integer3, integer4);
	}

	public ByteBuf getBytes(int integer, byte[] arr) {
		return this.a.getBytes(integer, arr);
	}

	public ByteBuf getBytes(int integer1, byte[] arr, int integer3, int integer4) {
		return this.a.getBytes(integer1, arr, integer3, integer4);
	}

	public ByteBuf getBytes(int integer, ByteBuffer byteBuffer) {
		return this.a.getBytes(integer, byteBuffer);
	}

	public ByteBuf getBytes(int integer1, OutputStream outputStream, int integer3) throws IOException {
		return this.a.getBytes(integer1, outputStream, integer3);
	}

	public int getBytes(int integer1, GatheringByteChannel gatheringByteChannel, int integer3) throws IOException {
		return this.a.getBytes(integer1, gatheringByteChannel, integer3);
	}

	public ByteBuf setBoolean(int integer, boolean boolean2) {
		return this.a.setBoolean(integer, boolean2);
	}

	public ByteBuf setByte(int integer1, int integer2) {
		return this.a.setByte(integer1, integer2);
	}

	public ByteBuf setShort(int integer1, int integer2) {
		return this.a.setShort(integer1, integer2);
	}

	public ByteBuf setMedium(int integer1, int integer2) {
		return this.a.setMedium(integer1, integer2);
	}

	public ByteBuf setInt(int integer1, int integer2) {
		return this.a.setInt(integer1, integer2);
	}

	public ByteBuf setLong(int integer, long long2) {
		return this.a.setLong(integer, long2);
	}

	public ByteBuf setChar(int integer1, int integer2) {
		return this.a.setChar(integer1, integer2);
	}

	public ByteBuf setFloat(int integer, float float2) {
		return this.a.setFloat(integer, float2);
	}

	public ByteBuf setDouble(int integer, double double2) {
		return this.a.setDouble(integer, double2);
	}

	public ByteBuf setBytes(int integer, ByteBuf byteBuf) {
		return this.a.setBytes(integer, byteBuf);
	}

	public ByteBuf setBytes(int integer1, ByteBuf byteBuf, int integer3) {
		return this.a.setBytes(integer1, byteBuf, integer3);
	}

	public ByteBuf setBytes(int integer1, ByteBuf byteBuf, int integer3, int integer4) {
		return this.a.setBytes(integer1, byteBuf, integer3, integer4);
	}

	public ByteBuf setBytes(int integer, byte[] arr) {
		return this.a.setBytes(integer, arr);
	}

	public ByteBuf setBytes(int integer1, byte[] arr, int integer3, int integer4) {
		return this.a.setBytes(integer1, arr, integer3, integer4);
	}

	public ByteBuf setBytes(int integer, ByteBuffer byteBuffer) {
		return this.a.setBytes(integer, byteBuffer);
	}

	public int setBytes(int integer1, InputStream inputStream, int integer3) throws IOException {
		return this.a.setBytes(integer1, inputStream, integer3);
	}

	public int setBytes(int integer1, ScatteringByteChannel scatteringByteChannel, int integer3) throws IOException {
		return this.a.setBytes(integer1, scatteringByteChannel, integer3);
	}

	public ByteBuf setZero(int integer1, int integer2) {
		return this.a.setZero(integer1, integer2);
	}

	public boolean readBoolean() {
		return this.a.readBoolean();
	}

	public byte readByte() {
		return this.a.readByte();
	}

	public short readUnsignedByte() {
		return this.a.readUnsignedByte();
	}

	public short readShort() {
		return this.a.readShort();
	}

	public int readUnsignedShort() {
		return this.a.readUnsignedShort();
	}

	public int readMedium() {
		return this.a.readMedium();
	}

	public int readUnsignedMedium() {
		return this.a.readUnsignedMedium();
	}

	public int readInt() {
		return this.a.readInt();
	}

	public long readUnsignedInt() {
		return this.a.readUnsignedInt();
	}

	public long readLong() {
		return this.a.readLong();
	}

	public char readChar() {
		return this.a.readChar();
	}

	public float readFloat() {
		return this.a.readFloat();
	}

	public double readDouble() {
		return this.a.readDouble();
	}

	public ByteBuf readBytes(int integer) {
		return this.a.readBytes(integer);
	}

	public ByteBuf readSlice(int integer) {
		return this.a.readSlice(integer);
	}

	public ByteBuf readBytes(ByteBuf byteBuf) {
		return this.a.readBytes(byteBuf);
	}

	public ByteBuf readBytes(ByteBuf byteBuf, int integer) {
		return this.a.readBytes(byteBuf, integer);
	}

	public ByteBuf readBytes(ByteBuf byteBuf, int integer2, int integer3) {
		return this.a.readBytes(byteBuf, integer2, integer3);
	}

	public ByteBuf readBytes(byte[] arr) {
		return this.a.readBytes(arr);
	}

	public ByteBuf readBytes(byte[] arr, int integer2, int integer3) {
		return this.a.readBytes(arr, integer2, integer3);
	}

	public ByteBuf readBytes(ByteBuffer byteBuffer) {
		return this.a.readBytes(byteBuffer);
	}

	public ByteBuf readBytes(OutputStream outputStream, int integer) throws IOException {
		return this.a.readBytes(outputStream, integer);
	}

	public int readBytes(GatheringByteChannel gatheringByteChannel, int integer) throws IOException {
		return this.a.readBytes(gatheringByteChannel, integer);
	}

	public ByteBuf skipBytes(int integer) {
		return this.a.skipBytes(integer);
	}

	public ByteBuf writeBoolean(boolean boolean1) {
		return this.a.writeBoolean(boolean1);
	}

	public ByteBuf writeByte(int integer) {
		return this.a.writeByte(integer);
	}

	public ByteBuf writeShort(int integer) {
		return this.a.writeShort(integer);
	}

	public ByteBuf writeMedium(int integer) {
		return this.a.writeMedium(integer);
	}

	public ByteBuf writeInt(int integer) {
		return this.a.writeInt(integer);
	}

	public ByteBuf writeLong(long long1) {
		return this.a.writeLong(long1);
	}

	public ByteBuf writeChar(int integer) {
		return this.a.writeChar(integer);
	}

	public ByteBuf writeFloat(float float1) {
		return this.a.writeFloat(float1);
	}

	public ByteBuf writeDouble(double double1) {
		return this.a.writeDouble(double1);
	}

	public ByteBuf writeBytes(ByteBuf byteBuf) {
		return this.a.writeBytes(byteBuf);
	}

	public ByteBuf writeBytes(ByteBuf byteBuf, int integer) {
		return this.a.writeBytes(byteBuf, integer);
	}

	public ByteBuf writeBytes(ByteBuf byteBuf, int integer2, int integer3) {
		return this.a.writeBytes(byteBuf, integer2, integer3);
	}

	public ByteBuf writeBytes(byte[] arr) {
		return this.a.writeBytes(arr);
	}

	public ByteBuf writeBytes(byte[] arr, int integer2, int integer3) {
		return this.a.writeBytes(arr, integer2, integer3);
	}

	public ByteBuf writeBytes(ByteBuffer byteBuffer) {
		return this.a.writeBytes(byteBuffer);
	}

	public int writeBytes(InputStream inputStream, int integer) throws IOException {
		return this.a.writeBytes(inputStream, integer);
	}

	public int writeBytes(ScatteringByteChannel scatteringByteChannel, int integer) throws IOException {
		return this.a.writeBytes(scatteringByteChannel, integer);
	}

	public ByteBuf writeZero(int integer) {
		return this.a.writeZero(integer);
	}

	public int indexOf(int integer1, int integer2, byte byte3) {
		return this.a.indexOf(integer1, integer2, byte3);
	}

	public int bytesBefore(byte byte1) {
		return this.a.bytesBefore(byte1);
	}

	public int bytesBefore(int integer, byte byte2) {
		return this.a.bytesBefore(integer, byte2);
	}

	public int bytesBefore(int integer1, int integer2, byte byte3) {
		return this.a.bytesBefore(integer1, integer2, byte3);
	}

	public int forEachByte(ByteBufProcessor byteBufProcessor) {
		return this.a.forEachByte(byteBufProcessor);
	}

	public int forEachByte(int integer1, int integer2, ByteBufProcessor byteBufProcessor) {
		return this.a.forEachByte(integer1, integer2, byteBufProcessor);
	}

	public int forEachByteDesc(ByteBufProcessor byteBufProcessor) {
		return this.a.forEachByteDesc(byteBufProcessor);
	}

	public int forEachByteDesc(int integer1, int integer2, ByteBufProcessor byteBufProcessor) {
		return this.a.forEachByteDesc(integer1, integer2, byteBufProcessor);
	}

	public ByteBuf copy() {
		return this.a.copy();
	}

	public ByteBuf copy(int integer1, int integer2) {
		return this.a.copy(integer1, integer2);
	}

	public ByteBuf slice() {
		return this.a.slice();
	}

	public ByteBuf slice(int integer1, int integer2) {
		return this.a.slice(integer1, integer2);
	}

	public ByteBuf duplicate() {
		return this.a.duplicate();
	}

	public int nioBufferCount() {
		return this.a.nioBufferCount();
	}

	public ByteBuffer nioBuffer() {
		return this.a.nioBuffer();
	}

	public ByteBuffer nioBuffer(int integer1, int integer2) {
		return this.a.nioBuffer(integer1, integer2);
	}

	public ByteBuffer internalNioBuffer(int integer1, int integer2) {
		return this.a.internalNioBuffer(integer1, integer2);
	}

	public ByteBuffer[] nioBuffers() {
		return this.a.nioBuffers();
	}

	public ByteBuffer[] nioBuffers(int integer1, int integer2) {
		return this.a.nioBuffers(integer1, integer2);
	}

	public boolean hasArray() {
		return this.a.hasArray();
	}

	public byte[] array() {
		return this.a.array();
	}

	public int arrayOffset() {
		return this.a.arrayOffset();
	}

	public boolean hasMemoryAddress() {
		return this.a.hasMemoryAddress();
	}

	public long memoryAddress() {
		return this.a.memoryAddress();
	}

	public String toString(Charset charset) {
		return this.a.toString(charset);
	}

	public String toString(int integer1, int integer2, Charset charset) {
		return this.a.toString(integer1, integer2, charset);
	}

	public int hashCode() {
		return this.a.hashCode();
	}

	public boolean equals(Object object) {
		return this.a.equals(object);
	}

	public int compareTo(ByteBuf byteBuf) {
		return this.a.compareTo(byteBuf);
	}

	public String toString() {
		return this.a.toString();
	}

	public ByteBuf retain(int integer) {
		return this.a.retain(integer);
	}

	public ByteBuf retain() {
		return this.a.retain();
	}

	public int refCnt() {
		return this.a.refCnt();
	}

	public boolean release() {
		return this.a.release();
	}

	public boolean release(int integer) {
		return this.a.release(integer);
	}
}
