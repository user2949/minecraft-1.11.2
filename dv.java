import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dv extends ef {
	private double b;

	dv() {
	}

	public dv(double double1) {
		this.b = double1;
	}

	@Override
	void a(DataOutput dataOutput) throws IOException {
		dataOutput.writeDouble(this.b);
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(128L);
		this.b = dataInput.readDouble();
	}

	@Override
	public byte a() {
		return 6;
	}

	@Override
	public String toString() {
		return "" + this.b + "d";
	}

	public dv b() {
		return new dv(this.b);
	}

	@Override
	public boolean equals(Object object) {
		if (super.equals(object)) {
			dv dv3 = (dv)object;
			return this.b == dv3.b;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		long long2 = Double.doubleToLongBits(this.b);
		return super.hashCode() ^ (int)(long2 ^ long2 >>> 32);
	}

	@Override
	public long d() {
		return (long)Math.floor(this.b);
	}

	@Override
	public int e() {
		return ot.c(this.b);
	}

	@Override
	public short f() {
		return (short)(ot.c(this.b) & 65535);
	}

	@Override
	public byte g() {
		return (byte)(ot.c(this.b) & 0xFF);
	}

	@Override
	public double h() {
		return this.b;
	}

	@Override
	public float i() {
		return (float)this.b;
	}
}
