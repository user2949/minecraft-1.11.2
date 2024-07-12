import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class ei {
	public static final String[] a = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]"};

	abstract void a(DataOutput dataOutput) throws IOException;

	abstract void a(DataInput dataInput, int integer, ec ec) throws IOException;

	public abstract String toString();

	public abstract byte a();

	protected ei() {
	}

	protected static ei a(byte byte1) {
		switch (byte1) {
			case 0:
				return new dw();
			case 1:
				return new dt();
			case 2:
				return new eg();
			case 3:
				return new dz();
			case 4:
				return new eb();
			case 5:
				return new dx();
			case 6:
				return new dv();
			case 7:
				return new ds();
			case 8:
				return new eh();
			case 9:
				return new ea();
			case 10:
				return new du();
			case 11:
				return new dy();
			default:
				return null;
		}
	}

	public abstract ei b();

	public boolean b_() {
		return false;
	}

	public boolean equals(Object object) {
		if (!(object instanceof ei)) {
			return false;
		} else {
			ei ei3 = (ei)object;
			return this.a() == ei3.a();
		}
	}

	public int hashCode() {
		return this.a();
	}

	protected String c_() {
		return this.toString();
	}
}
