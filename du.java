import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class du extends ei {
	private static final Logger b = LogManager.getLogger();
	private final Map<String, ei> c = Maps.newHashMap();

	@Override
	void a(DataOutput dataOutput) throws IOException {
		for (String string4 : this.c.keySet()) {
			ei ei5 = (ei)this.c.get(string4);
			a(string4, ei5, dataOutput);
		}

		dataOutput.writeByte(0);
	}

	@Override
	void a(DataInput dataInput, int integer, ec ec) throws IOException {
		ec.a(384L);
		if (integer > 512) {
			throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
		} else {
			this.c.clear();

			byte byte5;
			while ((byte5 = a(dataInput, ec)) != 0) {
				String string6 = b(dataInput, ec);
				ec.a((long)(224 + 16 * string6.length()));
				ei ei7 = a(byte5, string6, dataInput, integer + 1, ec);
				if (this.c.put(string6, ei7) != null) {
					ec.a(288L);
				}
			}
		}
	}

	public Set<String> c() {
		return this.c.keySet();
	}

	@Override
	public byte a() {
		return 10;
	}

	public int d() {
		return this.c.size();
	}

	public void a(String string, ei ei) {
		this.c.put(string, ei);
	}

	public void a(String string, byte byte2) {
		this.c.put(string, new dt(byte2));
	}

	public void a(String string, short short2) {
		this.c.put(string, new eg(short2));
	}

	public void a(String string, int integer) {
		this.c.put(string, new dz(integer));
	}

	public void a(String string, long long2) {
		this.c.put(string, new eb(long2));
	}

	public void a(String string, UUID uUID) {
		this.a(string + "Most", uUID.getMostSignificantBits());
		this.a(string + "Least", uUID.getLeastSignificantBits());
	}

	@Nullable
	public UUID a(String string) {
		return new UUID(this.i(string + "Most"), this.i(string + "Least"));
	}

	public boolean b(String string) {
		return this.b(string + "Most", 99) && this.b(string + "Least", 99);
	}

	public void a(String string, float float2) {
		this.c.put(string, new dx(float2));
	}

	public void a(String string, double double2) {
		this.c.put(string, new dv(double2));
	}

	public void a(String string1, String string2) {
		this.c.put(string1, new eh(string2));
	}

	public void a(String string, byte[] arr) {
		this.c.put(string, new ds(arr));
	}

	public void a(String string, int[] arr) {
		this.c.put(string, new dy(arr));
	}

	public void a(String string, boolean boolean2) {
		this.a(string, (byte)(boolean2 ? 1 : 0));
	}

	public ei c(String string) {
		return (ei)this.c.get(string);
	}

	public byte d(String string) {
		ei ei3 = (ei)this.c.get(string);
		return ei3 == null ? 0 : ei3.a();
	}

	public boolean e(String string) {
		return this.c.containsKey(string);
	}

	public boolean b(String string, int integer) {
		int integer4 = this.d(string);
		if (integer4 == integer) {
			return true;
		} else {
			return integer != 99 ? false : integer4 == 1 || integer4 == 2 || integer4 == 3 || integer4 == 4 || integer4 == 5 || integer4 == 6;
		}
	}

	public byte f(String string) {
		try {
			if (this.b(string, 99)) {
				return ((ef)this.c.get(string)).g();
			}
		} catch (ClassCastException var3) {
		}

		return 0;
	}

	public short g(String string) {
		try {
			if (this.b(string, 99)) {
				return ((ef)this.c.get(string)).f();
			}
		} catch (ClassCastException var3) {
		}

		return 0;
	}

	public int h(String string) {
		try {
			if (this.b(string, 99)) {
				return ((ef)this.c.get(string)).e();
			}
		} catch (ClassCastException var3) {
		}

		return 0;
	}

	public long i(String string) {
		try {
			if (this.b(string, 99)) {
				return ((ef)this.c.get(string)).d();
			}
		} catch (ClassCastException var3) {
		}

		return 0L;
	}

	public float j(String string) {
		try {
			if (this.b(string, 99)) {
				return ((ef)this.c.get(string)).i();
			}
		} catch (ClassCastException var3) {
		}

		return 0.0F;
	}

	public double k(String string) {
		try {
			if (this.b(string, 99)) {
				return ((ef)this.c.get(string)).h();
			}
		} catch (ClassCastException var3) {
		}

		return 0.0;
	}

	public String l(String string) {
		try {
			if (this.b(string, 8)) {
				return ((ei)this.c.get(string)).c_();
			}
		} catch (ClassCastException var3) {
		}

		return "";
	}

	public byte[] m(String string) {
		try {
			if (this.b(string, 7)) {
				return ((ds)this.c.get(string)).c();
			}
		} catch (ClassCastException var3) {
			throw new f(this.a(string, 7, var3));
		}

		return new byte[0];
	}

	public int[] n(String string) {
		try {
			if (this.b(string, 11)) {
				return ((dy)this.c.get(string)).d();
			}
		} catch (ClassCastException var3) {
			throw new f(this.a(string, 11, var3));
		}

		return new int[0];
	}

	public du o(String string) {
		try {
			if (this.b(string, 10)) {
				return (du)this.c.get(string);
			}
		} catch (ClassCastException var3) {
			throw new f(this.a(string, 10, var3));
		}

		return new du();
	}

	public ea c(String string, int integer) {
		try {
			if (this.d(string) == 9) {
				ea ea4 = (ea)this.c.get(string);
				if (!ea4.b_() && ea4.g() != integer) {
					return new ea();
				}

				return ea4;
			}
		} catch (ClassCastException var4) {
			throw new f(this.a(string, 9, var4));
		}

		return new ea();
	}

	public boolean p(String string) {
		return this.f(string) != 0;
	}

	public void q(String string) {
		this.c.remove(string);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder2 = new StringBuilder("{");
		Collection<String> collection3 = this.c.keySet();
		if (b.isDebugEnabled()) {
			List<String> list4 = Lists.newArrayList(this.c.keySet());
			Collections.sort(list4);
			collection3 = list4;
		}

		for (String string5 : collection3) {
			if (stringBuilder2.length() != 1) {
				stringBuilder2.append(',');
			}

			stringBuilder2.append(string5).append(':').append(this.c.get(string5));
		}

		return stringBuilder2.append('}').toString();
	}

	@Override
	public boolean b_() {
		return this.c.isEmpty();
	}

	private b a(String string, int integer, ClassCastException classCastException) {
		b b5 = b.a(classCastException, "Reading NBT data");
		c c6 = b5.a("Corrupt NBT tag", 1);
		c6.a("Tag type found", new d<String>() {
			public String call() throws Exception {
				return ei.a[((ei)du.this.c.get(string)).a()];
			}
		});
		c6.a("Tag type expected", new d<String>() {
			public String call() throws Exception {
				return ei.a[integer];
			}
		});
		c6.a("Tag name", string);
		return b5;
	}

	public du b() {
		du du2 = new du();

		for (String string4 : this.c.keySet()) {
			du2.a(string4, ((ei)this.c.get(string4)).b());
		}

		return du2;
	}

	@Override
	public boolean equals(Object object) {
		if (super.equals(object)) {
			du du3 = (du)object;
			return this.c.entrySet().equals(du3.c.entrySet());
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ this.c.hashCode();
	}

	private static void a(String string, ei ei, DataOutput dataOutput) throws IOException {
		dataOutput.writeByte(ei.a());
		if (ei.a() != 0) {
			dataOutput.writeUTF(string);
			ei.a(dataOutput);
		}
	}

	private static byte a(DataInput dataInput, ec ec) throws IOException {
		return dataInput.readByte();
	}

	private static String b(DataInput dataInput, ec ec) throws IOException {
		return dataInput.readUTF();
	}

	static ei a(byte byte1, String string, DataInput dataInput, int integer, ec ec) throws IOException {
		ei ei6 = ei.a(byte1);

		try {
			ei6.a(dataInput, integer, ec);
			return ei6;
		} catch (IOException var9) {
			b b8 = b.a(var9, "Loading NBT data");
			c c9 = b8.a("NBT Tag");
			c9.a("Tag name", string);
			c9.a("Tag type", byte1);
			throw new f(b8);
		}
	}

	public void a(du du) {
		for (String string4 : du.c.keySet()) {
			ei ei5 = (ei)du.c.get(string4);
			if (ei5.a() == 10) {
				if (this.b(string4, 10)) {
					du du6 = this.o(string4);
					du6.a((du)ei5);
				} else {
					this.a(string4, ei5.b());
				}
			} else {
				this.a(string4, ei5.b());
			}
		}
	}
}
