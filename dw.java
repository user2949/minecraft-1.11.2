import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dw extends ei {
	dw() {
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(64L);
	}

	@Override
	void a(DataOutput dataOutput) throws IOException {
	}

	@Override
	public byte a() {
		return 0;
	}

	@Override
	public String toString() {
		return "END";
	}

	public dw b() {
		return new dw();
	}
}
