import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ea extends ei {
	private static final Logger b = LogManager.getLogger();
	private List<ei> c = Lists.newArrayList();
	private byte d = 0;

	@Override
	void a(DataOutput dataOutput) throws IOException {
		if (this.c.isEmpty()) {
			this.d = 0;
		} else {
			this.d = ((ei)this.c.get(0)).a();
		}

		dataOutput.writeByte(this.d);
		dataOutput.writeInt(this.c.size());

		for (int integer3 = 0; integer3 < this.c.size(); integer3++) {
			((ei)this.c.get(integer3)).a(dataOutput);
		}
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(296L);
		if (integer > 512) {
			throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
		} else {
			this.d = dataInput.readByte();
			int integer5 = dataInput.readInt();
			if (this.d == 0 && integer5 > 0) {
				throw new RuntimeException("Missing type on ListTag");
			} else {
				ec.a(32L * (long)integer5);
				this.c = Lists.newArrayListWithCapacity(integer5);

				for (int integer6 = 0; integer6 < integer5; integer6++) {
					ei ei7 = ei.a(this.d);
					ei7.a(dataInput, integer + 1, ec);
					this.c.add(ei7);
				}
			}
		}
	}

	@Override
	public byte a() {
		return 9;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder2 = new StringBuilder("[");

		for (int integer3 = 0; integer3 < this.c.size(); integer3++) {
			if (integer3 != 0) {
				stringBuilder2.append(',');
			}

			stringBuilder2.append(integer3).append(':').append(this.c.get(integer3));
		}

		return stringBuilder2.append(']').toString();
	}

	public void a(ei ei) {
		if (ei.a() == 0) {
			b.warn("Invalid TagEnd added to ListTag");
		} else {
			if (this.d == 0) {
				this.d = ei.a();
			} else if (this.d != ei.a()) {
				b.warn("Adding mismatching tag types to tag list");
				return;
			}

			this.c.add(ei);
		}
	}

	public void a(int integer, ei ei) {
		if (ei.a() == 0) {
			b.warn("Invalid TagEnd added to ListTag");
		} else if (integer >= 0 && integer < this.c.size()) {
			if (this.d == 0) {
				this.d = ei.a();
			} else if (this.d != ei.a()) {
				b.warn("Adding mismatching tag types to tag list");
				return;
			}

			this.c.set(integer, ei);
		} else {
			b.warn("index out of bounds to set tag in tag list");
		}
	}

	public ei a(int integer) {
		return (ei)this.c.remove(integer);
	}

	@Override
	public boolean b_() {
		return this.c.isEmpty();
	}

	public du b(int integer) {
		if (integer >= 0 && integer < this.c.size()) {
			ei ei3 = (ei)this.c.get(integer);
			if (ei3.a() == 10) {
				return (du)ei3;
			}
		}

		return new du();
	}

	public int c(int integer) {
		if (integer >= 0 && integer < this.c.size()) {
			ei ei3 = (ei)this.c.get(integer);
			if (ei3.a() == 3) {
				return ((dz)ei3).e();
			}
		}

		return 0;
	}

	public int[] d(int integer) {
		if (integer >= 0 && integer < this.c.size()) {
			ei ei3 = (ei)this.c.get(integer);
			if (ei3.a() == 11) {
				return ((dy)ei3).d();
			}
		}

		return new int[0];
	}

	public double e(int integer) {
		if (integer >= 0 && integer < this.c.size()) {
			ei ei3 = (ei)this.c.get(integer);
			if (ei3.a() == 6) {
				return ((dv)ei3).h();
			}
		}

		return 0.0;
	}

	public float f(int integer) {
		if (integer >= 0 && integer < this.c.size()) {
			ei ei3 = (ei)this.c.get(integer);
			if (ei3.a() == 5) {
				return ((dx)ei3).i();
			}
		}

		return 0.0F;
	}

	public String g(int integer) {
		if (integer >= 0 && integer < this.c.size()) {
			ei ei3 = (ei)this.c.get(integer);
			return ei3.a() == 8 ? ei3.c_() : ei3.toString();
		} else {
			return "";
		}
	}

	public ei h(int integer) {
		return (ei)(integer >= 0 && integer < this.c.size() ? (ei)this.c.get(integer) : new dw());
	}

	public int c() {
		return this.c.size();
	}

	public ea b() {
		ea ea2 = new ea();
		ea2.d = this.d;

		for (ei ei4 : this.c) {
			ei ei5 = ei4.b();
			ea2.c.add(ei5);
		}

		return ea2;
	}

	@Override
	public boolean equals(Object object) {
		if (super.equals(object)) {
			ea ea3 = (ea)object;
			if (this.d == ea3.d) {
				return this.c.equals(ea3.c);
			}
		}

		return false;
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ this.c.hashCode();
	}

	public int g() {
		return this.d;
	}
}
