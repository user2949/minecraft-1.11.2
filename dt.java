import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dt extends ef {
	private byte b;

	dt() {
	}

	public dt(byte byte1) {
		this.b = byte1;
	}

	@Override
	void a(DataOutput dataOutput) throws IOException {
		dataOutput.writeByte(this.b);
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(72L);
		this.b = dataInput.readByte();
	}

	@Override
	public byte a() {
		return 1;
	}

	@Override
	public String toString() {
		return "" + this.b + "b";
	}

	public dt b() {
		return new dt(this.b);
	}

	@Override
	public boolean equals(Object object) {
		if (super.equals(object)) {
			dt dt3 = (dt)object;
			return this.b == dt3.b;
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
		return (short)this.b;
	}

	@Override
	public byte g() {
		return this.b;
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
