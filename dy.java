import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

public class dy extends ei {
	private int[] b;

	dy() {
	}

	public dy(int[] arr) {
		this.b = arr;
	}

	@Override
	void a(DataOutput dataOutput) throws IOException {
		dataOutput.writeInt(this.b.length);

		for (int integer6 : this.b) {
			dataOutput.writeInt(integer6);
		}
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(192L);
		int integer5 = dataInput.readInt();
		ec.a((long)(32 * integer5));
		this.b = new int[integer5];

		for (int integer6 = 0; integer6 < integer5; integer6++) {
			this.b[integer6] = dataInput.readInt();
		}
	}

	@Override
	public byte a() {
		return 11;
	}

	@Override
	public String toString() {
		String string2 = "[";

		for (int integer6 : this.b) {
			string2 = string2 + integer6 + ",";
		}

		return string2 + "]";
	}

	public dy b() {
		int[] arr2 = new int[this.b.length];
		System.arraycopy(this.b, 0, arr2, 0, this.b.length);
		return new dy(arr2);
	}

	@Override
	public boolean equals(Object object) {
		return super.equals(object) ? Arrays.equals(this.b, ((dy)object).b) : false;
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ Arrays.hashCode(this.b);
	}

	public int[] d() {
		return this.b;
	}
}
