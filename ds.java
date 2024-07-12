import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

public class ds extends ei {
	private byte[] b;

	ds() {
	}

	public ds(byte[] arr) {
		this.b = arr;
	}

	@Override
	void a(DataOutput dataOutput) throws IOException {
		dataOutput.writeInt(this.b.length);
		dataOutput.write(this.b);
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(192L);
		int integer5 = dataInput.readInt();
		ec.a((long)(8 * integer5));
		this.b = new byte[integer5];
		dataInput.readFully(this.b);
	}

	@Override
	public byte a() {
		return 7;
	}

	@Override
	public String toString() {
		return "[" + this.b.length + " bytes]";
	}

	@Override
	public ei b() {
		byte[] arr2 = new byte[this.b.length];
		System.arraycopy(this.b, 0, arr2, 0, this.b.length);
		return new ds(arr2);
	}

	@Override
	public boolean equals(Object object) {
		return super.equals(object) ? Arrays.equals(this.b, ((ds)object).b) : false;
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ Arrays.hashCode(this.b);
	}

	public byte[] c() {
		return this.b;
	}
}
