import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class eh extends ei {
	private String b;

	public eh() {
		this.b = "";
	}

	public eh(String string) {
		this.b = string;
		if (string == null) {
			throw new IllegalArgumentException("Empty string not allowed");
		}
	}

	@Override
	void a(DataOutput dataOutput) throws IOException {
		dataOutput.writeUTF(this.b);
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(288L);
		this.b = dataInput.readUTF();
		ec.a((long)(16 * this.b.length()));
	}

	@Override
	public byte a() {
		return 8;
	}

	@Override
	public String toString() {
		return "\"" + this.b.replace("\"", "\\\"") + "\"";
	}

	public eh b() {
		return new eh(this.b);
	}

	@Override
	public boolean b_() {
		return this.b.isEmpty();
	}

	@Override
	public boolean equals(Object object) {
		if (!super.equals(object)) {
			return false;
		} else {
			eh eh3 = (eh)object;
			return this.b == null && eh3.b == null || this.b != null && this.b.equals(eh3.b);
		}
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ this.b.hashCode();
	}

	@Override
	public String c_() {
		return this.b;
	}
}
