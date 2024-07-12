import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class eb extends ef {
	private long b;

	eb() {
	}

	public eb(long long1) {
		this.b = long1;
	}

	@Override
	void a(DataOutput dataOutput) throws IOException {
		dataOutput.writeLong(this.b);
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(128L);
		this.b = dataInput.readLong();
	}

	@Override
	public byte a() {
		return 4;
	}

	@Override
	public String toString() {
		return "" + this.b + "L";
	}

	public eb b() {
		return new eb(this.b);
	}

	@Override
	public boolean equals(Object object) {
		if (super.equals(object)) {
			eb eb3 = (eb)object;
			return this.b == eb3.b;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ (int)(this.b ^ this.b >>> 32);
	}

	@Override
	public long d() {
		return this.b;
	}

	@Override
	public int e() {
		return (int)(this.b & -1L);
	}

	@Override
	public short f() {
		return (short)((int)(this.b & 65535L));
	}

	@Override
	public byte g() {
		return (byte)((int)(this.b & 255L));
	}

	@Override
	public double h() {
		return (double)this.b;
	}

	@Override
	public float i() {
		return (float)this.b;
	}
}
