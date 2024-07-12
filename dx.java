import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dx extends ef {
	private float b;

	dx() {
	}

	public dx(float float1) {
		this.b = float1;
	}

	@Override
	void a(DataOutput dataOutput) throws IOException {
		dataOutput.writeFloat(this.b);
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(96L);
		this.b = dataInput.readFloat();
	}

	@Override
	public byte a() {
		return 5;
	}

	@Override
	public String toString() {
		return "" + this.b + "f";
	}

	public dx b() {
		return new dx(this.b);
	}

	@Override
	public boolean equals(Object object) {
		if (super.equals(object)) {
			dx dx3 = (dx)object;
			return this.b == dx3.b;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ Float.floatToIntBits(this.b);
	}

	@Override
	public long d() {
		return (long)this.b;
	}

	@Override
	public int e() {
		return ot.d(this.b);
	}

	@Override
	public short f() {
		return (short)(ot.d(this.b) & 65535);
	}

	@Override
	public byte g() {
		return (byte)(ot.d(this.b) & 0xFF);
	}

	@Override
	public double h() {
		return (double)this.b;
	}

	@Override
	public float i() {
		return this.b;
	}
}
