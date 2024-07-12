import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class eg extends ef {
	private short b;

	public eg() {
	}

	public eg(short short1) {
		this.b = short1;
	}

	@Override
	void a(DataOutput dataOutput) throws IOException {
		dataOutput.writeShort(this.b);
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(80L);
		this.b = dataInput.readShort();
	}

	@Override
	public byte a() {
		return 2;
	}

	@Override
	public String toString() {
		return "" + this.b + "s";
	}

	public eg b() {
		return new eg(this.b);
	}

	@Override
	public boolean equals(Object object) {
		if (super.equals(object)) {
			eg eg3 = (eg)object;
			return this.b == eg3.b;
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
		return this.b;
	}

	@Override
	public byte g() {
		return (byte)(this.b & 255);
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
