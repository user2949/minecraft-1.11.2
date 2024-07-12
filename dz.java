import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dz extends ef {
	private int b;

	dz() {
	}

	public dz(int integer) {
		this.b = integer;
	}

	@Override
	void a(DataOutput dataOutput) throws IOException {
		dataOutput.writeInt(this.b);
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(96L);
		this.b = dataInput.readInt();
	}

	@Override
	public byte a() {
		return 3;
	}

	@Override
	public String toString() {
		return "" + this.b;
	}

	public dz b() {
		return new dz(this.b);
	}

	@Override
	public boolean equals(Object object) {
		if (super.equals(object)) {
			dz dz3 = (dz)object;
			return this.b == dz3.b;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ this.b;
	}

	@Override
	public long d() {
		return (long)this.b;
	}

	@Override
	public int e() {
		return this.b;
	}

	@Override
	public short f() {
		return (short)(this.b & 65535);
	}

	@Override
	public byte g() {
		return (byte)(this.b & 0xFF);
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
